package ei;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.az;
import org.telegram.messenger.ge;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final int f10189a;
    public final int f10190b;
    public final long f10191c;
    public final int d;
    public final Object f10192e;

    public d1(int i3, int i10, int i11, long j10, Object obj) {
        this.f10189a = i11;
        this.f10192e = obj;
        this.f10190b = i3;
        this.f10191c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f10189a) {
            case 0:
                g1 g1Var = (g1) this.f10192e;
                int i3 = this.f10190b;
                long j10 = this.f10191c;
                int i10 = this.d;
                HashMap hashMap = g1Var.G;
                if (i3 == 0) {
                    str = a1.g.p(j10, "");
                } else {
                    str = i3 + "_" + j10 + "_" + i10;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(g1Var.f10299e).f21919a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            case 1:
                MediaController mediaController = (MediaController) this.f10192e;
                int i11 = this.f10190b;
                long j11 = this.f10191c;
                int i12 = this.d;
                mediaController.H1 = null;
                if (mediaController.I1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.f21319g1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = Integer.MIN_VALUE;
                    tL_document.f27007id = az.p();
                    mediaController.f21319g1.user_id = h10.i(i11).e();
                    mediaController.f21319g1.mime_type = "audio/ogg";
                    az.y();
                    try {
                        e0.g gVar = new e0.g(org.telegram.messenger.t0.f25457b, org.telegram.messenger.w7.z(1), new ge(mediaController));
                        mediaController.G1 = gVar;
                        if (gVar.h()) {
                            if (org.telegram.messenger.r2.f25040a) {
                                org.telegram.messenger.a8.b("AudioRecorderV2 selected: account=" + i11 + ", dialog=" + j11 + ", guid=" + i12);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecorderV2");
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("AudioRecorderV2 failed", e10);
                        hs.f(mediaController.f21323i1).k(156, Integer.valueOf(mediaController.f21321h1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 2:
                qr qrVar = (qr) this.f10192e;
                int i13 = this.f10190b;
                long j12 = this.f10191c;
                int i14 = this.d;
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i13 + " WHERE uid = " + j12 + " AND mid = " + i14).stepThis().dispose();
                    qrVar.f24936b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i13 + " WHERE uid = " + j12 + " AND mid = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    qrVar.o(e11, true);
                    return;
                }
            default:
                ((VoIPService) this.f10192e).lambda$createGroupInstance$76(this.f10190b, this.f10191c, this.d);
                return;
        }
    }
}
