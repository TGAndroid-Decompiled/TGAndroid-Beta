package org.telegram.messenger;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class xd implements Runnable {
    public final int f19242a;
    public final int f19243b;
    public final long f19244c;
    public final int d;
    public final Object e;

    public xd(int i10, int i11, int i12, long j10, Object obj) {
        this.f19242a = i12;
        this.e = obj;
        this.f19243b = i10;
        this.f19244c = j10;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f19242a) {
            case 0:
                MediaController mediaController = (MediaController) this.e;
                int i10 = this.f19243b;
                long j10 = this.f19244c;
                int i11 = this.d;
                mediaController.F1 = null;
                if (mediaController.G1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.f14449e1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = Integer.MIN_VALUE;
                    tL_document.f19799id = tz.p();
                    mediaController.f14449e1.user_id = d20.i(i10).e();
                    mediaController.f14449e1.mime_type = "audio/ogg";
                    tz.y();
                    try {
                        e0.h hVar = new e0.h(w0.f19025b, b8.z(1), new me(mediaController));
                        mediaController.E1 = hVar;
                        if (hVar.h()) {
                            if (v2.f18448a) {
                                f8.b("AudioRecorderV2 selected: account=" + i10 + ", dialog=" + j10 + ", guid=" + i11);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecorderV2");
                    } catch (Exception e) {
                        f8.e("AudioRecorderV2 failed", e);
                        zs.f(mediaController.f14454g1).k(156, Integer.valueOf(mediaController.f14452f1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 1:
                hs hsVar = (hs) this.e;
                int i12 = this.f19243b;
                long j11 = this.f19244c;
                int i13 = this.d;
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i12 + " WHERE uid = " + j11 + " AND mid = " + i13).stepThis().dispose();
                    hsVar.f15940b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i12 + " WHERE uid = " + j11 + " AND mid = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    hsVar.o(e7, true);
                    return;
                }
            case 2:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.f19243b, this.f19244c, this.d);
                return;
            default:
                th.s0 s0Var = (th.s0) this.e;
                int i14 = this.f19243b;
                long j12 = this.f19244c;
                int i15 = this.d;
                HashMap hashMap = s0Var.F;
                if (i14 == 0) {
                    str = a1.g.l(j12, "");
                } else {
                    str = i14 + "_" + j12 + "_" + i15;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(c.a(s0Var.e).f14863a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
        }
    }
}
