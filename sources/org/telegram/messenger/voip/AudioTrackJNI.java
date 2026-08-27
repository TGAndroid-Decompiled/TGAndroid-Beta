package org.telegram.messenger.voip;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

public class AudioTrackJNI {
    private AudioTrack audioTrack;
    private byte[] buffer = new byte[1920];
    private long nativeInst;
    private boolean needResampling;
    private boolean running;
    private Thread thread;

    public AudioTrackJNI(long j10) {
        this.nativeInst = j10;
    }

    private int getBufferSize(int i10, int i11) {
        return Math.max(AudioTrack.getMinBufferSize(i11, 4, 2), i10);
    }

    public void lambda$startThread$0() {
        try {
            this.audioTrack.play();
            ByteBuffer byteBufferAllocateDirect = this.needResampling ? ByteBuffer.allocateDirect(1920) : null;
            ByteBuffer byteBufferAllocateDirect2 = this.needResampling ? ByteBuffer.allocateDirect(1764) : null;
            while (this.running) {
                try {
                    if (this.needResampling) {
                        nativeCallback(this.buffer);
                        byteBufferAllocateDirect.rewind();
                        byteBufferAllocateDirect.put(this.buffer);
                        Resampler.convert48to44(byteBufferAllocateDirect, byteBufferAllocateDirect2);
                        byteBufferAllocateDirect2.rewind();
                        byteBufferAllocateDirect2.get(this.buffer, 0, 1764);
                        this.audioTrack.write(this.buffer, 0, 1764);
                    } else {
                        nativeCallback(this.buffer);
                        this.audioTrack.write(this.buffer, 0, 1920);
                    }
                    if (!this.running) {
                        this.audioTrack.stop();
                        break;
                    }
                    continue;
                } catch (Exception e9) {
                    VLog.e(e9);
                }
            }
            VLog.i("audiotrack thread exits");
        } catch (Exception e10) {
            VLog.e("error starting AudioTrack", e10);
        }
    }

    private native void nativeCallback(byte[] bArr);

    private void startThread() {
        if (this.thread != null) {
            throw new IllegalStateException("thread already started");
        }
        this.running = true;
        Thread thread = new Thread(new r0(this, 2));
        this.thread = thread;
        thread.start();
    }

    public void init(int i10, int i11, int i12, int i13) {
        if (this.audioTrack != null) {
            throw new IllegalStateException("already inited");
        }
        AudioTrack audioTrack = new AudioTrack(0, 48000, i12 == 1 ? 4 : 12, 2, getBufferSize(i13, 48000), 1);
        this.audioTrack = audioTrack;
        if (audioTrack.getState() != 1) {
            VLog.w("Error initializing AudioTrack with 48k, trying 44.1k with resampling");
            try {
                this.audioTrack.release();
            } catch (Throwable unused) {
            }
            int bufferSize = getBufferSize(i13 * 6, 44100);
            VLog.d(i0.a.k(bufferSize, "buffer size: "));
            this.audioTrack = new AudioTrack(0, 44100, i12 == 1 ? 4 : 12, 2, bufferSize, 1);
            this.needResampling = true;
        }
    }

    public void release() {
        this.running = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e9) {
                VLog.e(e9);
            }
            this.thread = null;
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    public void start() {
        if (this.thread == null) {
            startThread();
        } else {
            this.audioTrack.play();
        }
    }

    public void stop() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
            } catch (Exception unused) {
            }
        }
    }
}
