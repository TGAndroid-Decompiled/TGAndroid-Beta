package di;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.iz;
import org.telegram.messenger.me;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final int f8909a;
    public final int f8910b;
    public final long f8911c;
    public final int d;
    public final Object f8912e;

    public d1(int i7, int i10, int i11, long j3, Object obj) {
        this.f8909a = i11;
        this.f8912e = obj;
        this.f8910b = i7;
        this.f8911c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f8909a) {
            case 0:
                g1 g1Var = (g1) this.f8912e;
                int i7 = this.f8910b;
                long j3 = this.f8911c;
                int i10 = this.d;
                HashMap hashMap = g1Var.F;
                if (i7 == 0) {
                    str = a8.p0.o(j3, "");
                } else {
                    str = i7 + "_" + j3 + "_" + i10;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(g1Var.f9025e).f21723a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            case 1:
                MediaController mediaController = (MediaController) this.f8912e;
                int i11 = this.f8910b;
                long j10 = this.f8911c;
                int i12 = this.d;
                mediaController.G1 = null;
                if (mediaController.H1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.f21263f1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = Integer.MIN_VALUE;
                    tL_document.f26958id = iz.p();
                    mediaController.f21263f1.user_id = p10.i(i11).e();
                    mediaController.f21263f1.mime_type = "audio/ogg";
                    iz.y();
                    try {
                        e0.g gVar = new e0.g(org.telegram.messenger.t0.f25555b, org.telegram.messenger.w7.z(1), new me(mediaController));
                        mediaController.F1 = gVar;
                        if (gVar.h()) {
                            if (org.telegram.messenger.r2.f25191a) {
                                org.telegram.messenger.a8.b("AudioRecorderV2 selected: account=" + i11 + ", dialog=" + j10 + ", guid=" + i12);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecorderV2");
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("AudioRecorderV2 failed", e10);
                        qs.f(mediaController.f21267h1).k(156, Integer.valueOf(mediaController.f21265g1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 2:
                yr yrVar = (yr) this.f8912e;
                int i13 = this.f8910b;
                long j11 = this.f8911c;
                int i14 = this.d;
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar.f26690b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    yrVar.f26690b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    yrVar.o(e11, true);
                    return;
                }
            default:
                ((VoIPService) this.f8912e).lambda$createGroupInstance$76(this.f8910b, this.f8911c, this.d);
                return;
        }
    }
}
