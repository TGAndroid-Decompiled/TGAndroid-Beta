package ki;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.me;
import org.telegram.messenger.zs;
public final class a implements Runnable {
    public final int f11387a;
    public final org.telegram.utils.recorder.audio.d f11388b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i10) {
        this.f11387a = i10;
        this.f11388b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f11387a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f11388b;
                try {
                    if (dVar.f44286n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f44288p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f44288p.startRecording();
                        if (dVar.f44288p.getRecordingState() == 3) {
                            dVar.f44279f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f44288p.getAudioSessionId());
                            dVar.f44290r = SystemClock.elapsedRealtime();
                            g gVar = dVar.f44280g;
                            ((k) gVar.f11405c).f11417i.post(new bi.e(gVar, gVar.f11403a, 3));
                            dVar.f44281i.post(new a(dVar, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize AudioRecord");
                } catch (Throwable th2) {
                    dVar.e(org.telegram.utils.recorder.audio.d.a(th2));
                    return;
                }
            case 1:
                this.f11388b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f11388b;
                if (!dVar2.f44287o) {
                    Exception exc = null;
                    if (dVar2.f44286n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f44284l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f44288p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i10 = read / 2;
                            long j10 = 0;
                            for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                                long j11 = byteBuffer.getShort(i11);
                                j10 += j11 * j11;
                            }
                            dVar2.f44289q += i10;
                            dVar2.f44285m.incrementAndGet();
                            dVar2.f44283k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f44290r >= 32) {
                                if (i10 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j10 / i10);
                                }
                                final double d = sqrt;
                                final g gVar2 = dVar2.f44280g;
                                final long j12 = dVar2.f44289q;
                                Handler handler = ((k) gVar2.f11405c).f11417i;
                                final long j13 = gVar2.f11403a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        k kVar = (k) g.this.f11405c;
                                        if (j13 == kVar.f11423o && kVar.G == 3) {
                                            kVar.f11425q = j12;
                                            long j14 = kVar.j();
                                            double d10 = d;
                                            if (d10 >= 0.0d) {
                                                MediaController mediaController = ((me) kVar.f11415f.f13013b).f16945a;
                                                mediaController.f14460j1 = j14;
                                                zs.f(mediaController.f14454g1).k(zs.f19640k2, Integer.valueOf(mediaController.f14452f1), Double.valueOf(d10 / 2.0d));
                                            }
                                        }
                                    }
                                });
                                dVar2.f44290r = elapsedRealtime;
                            }
                            dVar2.f44281i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f44286n) {
                            exc = org.telegram.utils.recorder.audio.d.a(th3);
                        }
                        dVar2.e(exc);
                        return;
                    }
                }
                return;
        }
    }
}
