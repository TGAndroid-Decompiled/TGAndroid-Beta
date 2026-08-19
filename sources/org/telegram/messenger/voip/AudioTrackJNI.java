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

    private native void nativeCallback(byte[] bArr);

    public AudioTrackJNI(long j) {
        this.nativeInst = j;
    }

    private int getBufferSize(int i, int i2) {
        return Math.max(AudioTrack.getMinBufferSize(i2, 4, 2), i);
    }

    public void init(int i, int i2, int i3, int i4) {
        if (this.audioTrack != null) {
            throw new IllegalStateException("already inited");
        }
        AudioTrack audioTrack = new AudioTrack(0, 48000, i3 == 1 ? 4 : 12, 2, getBufferSize(i4, 48000), 1);
        this.audioTrack = audioTrack;
        if (audioTrack.getState() != 1) {
            VLog.w("Error initializing AudioTrack with 48k, trying 44.1k with resampling");
            try {
                this.audioTrack.release();
            } catch (Throwable unused) {
            }
            int bufferSize = getBufferSize(i4 * 6, 44100);
            VLog.d("buffer size: " + bufferSize);
            this.audioTrack = new AudioTrack(0, 44100, i3 == 1 ? 4 : 12, 2, bufferSize, 1);
            this.needResampling = true;
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

    public void release() {
        this.running = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                VLog.e(e);
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

    private void startThread() {
        if (this.thread != null) {
            throw new IllegalStateException("thread already started");
        }
        this.running = true;
        Thread thread = new Thread(new Runnable() {
            @Override
            public final void run() {
                AudioTrackJNI.$r8$lambda$5btg7YbwPgTwQrACptyq6bfRxXI(this.f$0);
            }
        });
        this.thread = thread;
        thread.start();
    }

    public static void $r8$lambda$5btg7YbwPgTwQrACptyq6bfRxXI(AudioTrackJNI audioTrackJNI) {
        audioTrackJNI.getClass();
        try {
            audioTrackJNI.audioTrack.play();
            ByteBuffer byteBufferAllocateDirect = audioTrackJNI.needResampling ? ByteBuffer.allocateDirect(1920) : null;
            ByteBuffer byteBufferAllocateDirect2 = audioTrackJNI.needResampling ? ByteBuffer.allocateDirect(1764) : null;
            while (audioTrackJNI.running) {
                try {
                    if (audioTrackJNI.needResampling) {
                        audioTrackJNI.nativeCallback(audioTrackJNI.buffer);
                        byteBufferAllocateDirect.rewind();
                        byteBufferAllocateDirect.put(audioTrackJNI.buffer);
                        Resampler.convert48to44(byteBufferAllocateDirect, byteBufferAllocateDirect2);
                        byteBufferAllocateDirect2.rewind();
                        byteBufferAllocateDirect2.get(audioTrackJNI.buffer, 0, 1764);
                        audioTrackJNI.audioTrack.write(audioTrackJNI.buffer, 0, 1764);
                    } else {
                        audioTrackJNI.nativeCallback(audioTrackJNI.buffer);
                        audioTrackJNI.audioTrack.write(audioTrackJNI.buffer, 0, 1920);
                    }
                    if (!audioTrackJNI.running) {
                        audioTrackJNI.audioTrack.stop();
                        break;
                    }
                    continue;
                } catch (Exception e) {
                    VLog.e(e);
                }
            }
            VLog.i("audiotrack thread exits");
        } catch (Exception e2) {
            VLog.e("error starting AudioTrack", e2);
        }
    }
}
