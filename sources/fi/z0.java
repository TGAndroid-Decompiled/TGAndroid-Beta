package fi;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.messenger.j10;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Runnable {
    public final int f12797a;
    public final int f12798b;
    public final long f12799c;
    public final int d;
    public final Object f12800e;

    public z0(int i7, int i10, int i11, long j3, Object obj) {
        this.f12797a = i11;
        this.f12800e = obj;
        this.f12798b = i7;
        this.f12799c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f12797a) {
            case 0:
                c1 c1Var = (c1) this.f12800e;
                int i7 = this.f12798b;
                long j3 = this.f12799c;
                int i10 = this.d;
                HashMap hashMap = c1Var.G;
                if (i7 == 0) {
                    str = a8.p0.o(j3, "");
                } else {
                    str = i7 + "_" + j3 + "_" + i10;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(c1Var.f11793e).f23218a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            case 1:
                MediaController mediaController = (MediaController) this.f12800e;
                int i11 = this.f12798b;
                long j10 = this.f12799c;
                int i12 = this.d;
                mediaController.H1 = null;
                if (mediaController.I1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.f22711g1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = Integer.MIN_VALUE;
                    tL_document.f28409id = bz.p();
                    mediaController.f22711g1.user_id = j10.i(i11).e();
                    mediaController.f22711g1.mime_type = "audio/ogg";
                    bz.y();
                    try {
                        e0.g gVar = new e0.g(org.telegram.messenger.t0.f26913b, org.telegram.messenger.w7.z(1), new ke(mediaController));
                        mediaController.G1 = gVar;
                        if (gVar.h()) {
                            if (org.telegram.messenger.s2.f26721a) {
                                org.telegram.messenger.a8.b("AudioRecorderV2 selected: account=" + i11 + ", dialog=" + j10 + ", guid=" + i12);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecorderV2");
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("AudioRecorderV2 failed", e10);
                        ks.f(mediaController.f22715i1).k(156, Integer.valueOf(mediaController.f22713h1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 2:
                tr trVar = (tr) this.f12800e;
                int i13 = this.f12798b;
                long j11 = this.f12799c;
                int i14 = this.d;
                trVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = trVar.f27054b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    trVar.f27054b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    trVar.o(e11, true);
                    return;
                }
            default:
                ((VoIPService) this.f12800e).lambda$createGroupInstance$76(this.f12798b, this.f12799c, this.d);
                return;
        }
    }
}
