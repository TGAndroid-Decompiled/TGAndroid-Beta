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

    private int getBufferSize(int i9, int i10) {
        return Math.max(AudioTrack.getMinBufferSize(i10, 4, 2), i9);
    }

    public void lambda$startThread$0() {
        ByteBuffer byteBuffer;
        try {
            this.audioTrack.play();
            ByteBuffer byteBuffer2 = null;
            if (this.needResampling) {
                byteBuffer = ByteBuffer.allocateDirect(1920);
            } else {
                byteBuffer = null;
            }
            if (this.needResampling) {
                byteBuffer2 = ByteBuffer.allocateDirect(1764);
            }
            while (this.running) {
                try {
                    if (this.needResampling) {
                        nativeCallback(this.buffer);
                        byteBuffer.rewind();
                        byteBuffer.put(this.buffer);
                        Resampler.convert48to44(byteBuffer, byteBuffer2);
                        byteBuffer2.rewind();
                        byteBuffer2.get(this.buffer, 0, 1764);
                        this.audioTrack.write(this.buffer, 0, 1764);
                    } else {
                        nativeCallback(this.buffer);
                        this.audioTrack.write(this.buffer, 0, 1920);
                    }
                } catch (Exception e10) {
                    VLog.e(e10);
                }
                if (!this.running) {
                    this.audioTrack.stop();
                    break;
                }
                continue;
            }
            VLog.i("audiotrack thread exits");
        } catch (Exception e11) {
            VLog.e("error starting AudioTrack", e11);
        }
    }

    private native void nativeCallback(byte[] bArr);

    private void startThread() {
        if (this.thread == null) {
            this.running = true;
            Thread thread = new Thread(new r0(this, 2));
            this.thread = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("thread already started");
    }

    public void init(int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.audioTrack == null) {
            int bufferSize = getBufferSize(i12, 48000);
            if (i11 == 1) {
                i13 = 4;
            } else {
                i13 = 12;
            }
            AudioTrack audioTrack = new AudioTrack(0, 48000, i13, 2, bufferSize, 1);
            this.audioTrack = audioTrack;
            if (audioTrack.getState() != 1) {
                VLog.w("Error initializing AudioTrack with 48k, trying 44.1k with resampling");
                try {
                    this.audioTrack.release();
                } catch (Throwable unused) {
                }
                int bufferSize2 = getBufferSize(i12 * 6, 44100);
                VLog.d(j3.r0.l(bufferSize2, "buffer size: "));
                if (i11 == 1) {
                    i14 = 4;
                } else {
                    i14 = 12;
                }
                this.audioTrack = new AudioTrack(0, 44100, i14, 2, bufferSize2, 1);
                this.needResampling = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("already inited");
    }

    public void release() {
        this.running = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e10) {
                VLog.e(e10);
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
