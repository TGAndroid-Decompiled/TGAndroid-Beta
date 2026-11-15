package fi;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gz;
import org.telegram.messenger.le;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f11398a;
    public final int f11399b;
    public final long f11400c;
    public final int d;
    public final Object f11401e;

    public a1(int i7, int i10, int i11, long j3, Object obj) {
        this.f11398a = i11;
        this.f11401e = obj;
        this.f11399b = i7;
        this.f11400c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f11398a) {
            case 0:
                e1 e1Var = (e1) this.f11401e;
                int i7 = this.f11399b;
                long j3 = this.f11400c;
                int i10 = this.d;
                HashMap hashMap = e1Var.G;
                if (i7 == 0) {
                    str = a8.p0.o(j3, "");
                } else {
                    str = i7 + "_" + j3 + "_" + i10;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(e1Var.f11656e).f22778a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            case 1:
                MediaController mediaController = (MediaController) this.f11401e;
                int i11 = this.f11399b;
                long j10 = this.f11400c;
                int i12 = this.d;
                mediaController.H1 = null;
                if (mediaController.I1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.f22348g1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = Integer.MIN_VALUE;
                    tL_document.f28057id = gz.p();
                    mediaController.f22348g1.user_id = m10.i(i11).e();
                    mediaController.f22348g1.mime_type = "audio/ogg";
                    gz.y();
                    try {
                        e0.g gVar = new e0.g(org.telegram.messenger.t0.f26600b, org.telegram.messenger.w7.z(1), new le(mediaController));
                        mediaController.G1 = gVar;
                        if (gVar.h()) {
                            if (org.telegram.messenger.r2.f26198a) {
                                org.telegram.messenger.a8.b("AudioRecorderV2 selected: account=" + i11 + ", dialog=" + j10 + ", guid=" + i12);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecorderV2");
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("AudioRecorderV2 failed", e10);
                        ns.f(mediaController.f22352i1).k(156, Integer.valueOf(mediaController.f22350h1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 2:
                vr vrVar = (vr) this.f11401e;
                int i13 = this.f11399b;
                long j11 = this.f11400c;
                int i14 = this.d;
                vrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = vrVar.f27222b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    vrVar.f27222b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    vrVar.o(e11, true);
                    return;
                }
            default:
                ((VoIPService) this.f11401e).lambda$createGroupInstance$76(this.f11399b, this.f11400c, this.d);
                return;
        }
    }
}
