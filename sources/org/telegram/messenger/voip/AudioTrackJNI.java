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
                } catch (Exception e6) {
                    VLog.e(e6);
                }
                if (!this.running) {
                    this.audioTrack.stop();
                    break;
                }
                continue;
            }
            VLog.i("audiotrack thread exits");
        } catch (Exception e10) {
            VLog.e("error starting AudioTrack", e10);
        }
    }

    private native void nativeCallback(byte[] bArr);

    private void startThread() {
        if (this.thread == null) {
            this.running = true;
            Thread thread = new Thread(new s0(this, 2));
            this.thread = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("thread already started");
    }

    public void init(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (this.audioTrack == null) {
            int bufferSize = getBufferSize(i13, 48000);
            if (i12 == 1) {
                i14 = 4;
            } else {
                i14 = 12;
            }
            AudioTrack audioTrack = new AudioTrack(0, 48000, i14, 2, bufferSize, 1);
            this.audioTrack = audioTrack;
            if (audioTrack.getState() != 1) {
                VLog.w("Error initializing AudioTrack with 48k, trying 44.1k with resampling");
                try {
                    this.audioTrack.release();
                } catch (Throwable unused) {
                }
                int bufferSize2 = getBufferSize(i13 * 6, 44100);
                VLog.d(l.d.j(bufferSize2, "buffer size: "));
                if (i12 == 1) {
                    i15 = 4;
                } else {
                    i15 = 12;
                }
                this.audioTrack = new AudioTrack(0, 44100, i15, 2, bufferSize2, 1);
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
            } catch (InterruptedException e6) {
                VLog.e(e6);
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
