package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class dn6 implements Runnable {
    public final byte a;
    public final int b;
    public final long c;
    public final int d;
    public final Object e;

    public dn6(Object obj, int i, long j, int i2, byte b) {
        this.a = b;
        this.e = obj;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.e;
                int i = this.b;
                long j = this.c;
                int i2 = this.d;
                String[] strArr = MediaController.W1;
                mediaController.H1 = null;
                if (mediaController.I1) {
                    MediaController.i0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.g1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = Integer.MIN_VALUE;
                    tL_document.id = gda.p();
                    mediaController.g1.user_id = z8c.h(i).e();
                    mediaController.g1.mime_type = "audio/ogg";
                    gda.x();
                    try {
                        u30 u30Var = new u30(a.b, bc4.z(1), new on6(mediaController));
                        mediaController.G1 = u30Var;
                        if (u30Var.g()) {
                            if (e21.a) {
                                fc4.b("AudioRecorderV2 selected: account=" + i + ", dialog=" + j + ", guid=" + i2);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecorderV2");
                    } catch (Exception e) {
                        fc4.e("AudioRecorderV2 failed", e);
                        nm7.f(mediaController.i1).k(157, Integer.valueOf(mediaController.h1));
                        mediaController.s(false);
                        return;
                    }
                }
                return;
            default:
                cf7 cf7Var = (cf7) this.e;
                int i3 = this.b;
                long j2 = this.c;
                int i4 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase = cf7Var.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i3 + " WHERE uid = " + j2 + " AND mid = " + i4).stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase2 = cf7Var.b;
                    sQLiteDatabase2.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i3 + " WHERE uid = " + j2 + " AND mid = " + i4).stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cf7Var.n(e2, true);
                    return;
                }
        }
    }
}
