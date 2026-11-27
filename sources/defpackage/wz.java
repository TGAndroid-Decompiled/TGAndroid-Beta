package defpackage;

import android.media.AudioRecord;
import android.os.SystemClock;
import org.telegram.utils.recorder.audio.d;
public final class wz implements Runnable {
    public final byte a;
    public final d b;

    public wz(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                try {
                    if (dVar.n) {
                        dVar.f(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize << 1, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.p.startRecording();
                        if (dVar.p.getRecordingState() == 3) {
                            dVar.f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.p.getAudioSessionId());
                            dVar.r = SystemClock.elapsedRealtime();
                            n20 n20Var = dVar.g;
                            ((i30) n20Var.c).i.post(new kt(n20Var, n20Var.a, (byte) 1));
                            dVar.i.post(new wz(dVar, (byte) 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize AudioRecord");
                } catch (Throwable th) {
                    dVar.f(d.a(th));
                    return;
                }
            case 1:
                this.b.f(null);
                return;
            case 2:
            default:
                this.b.c();
                return;
        }
    }
}
