package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class pt4 extends fy0 {
    public final TLRPC.TL_payments_checkedGiftCode S1;
    public final boolean T1;
    public ot4 U1;
    public final String V1;

    public pt4(d dVar, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(dVar, true);
        boolean z;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z = true;
        } else {
            z = false;
        }
        this.T1 = z;
        this.S1 = tL_payments_checkedGiftCode;
        this.V1 = str;
        this.v0 = false;
        this.w0 = false;
        K();
        W0();
        ot4 ot4Var = this.U1;
        ww0 ww0Var = this.c;
        ot4Var.getClass();
        ot4Var.d = tL_payments_checkedGiftCode.used_date == 0;
        ot4Var.e = dVar;
        ot4Var.f = tL_payments_checkedGiftCode;
        ot4Var.h = str;
        ot4Var.n = ww0Var;
    }

    public static boolean Y0(Intent intent, c01 c01Var) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        Z0(LaunchActivity.Q(), lastPathSegment, c01Var);
                        return true;
                    }
                    return false;
                }
                return false;
            }
            String lowerCase = data.getHost().toLowerCase();
            if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null) {
                String lastPathSegment2 = data.getLastPathSegment();
                if (path.startsWith("/giftcode") && lastPathSegment2 != null) {
                    Z0(LaunchActivity.Q(), lastPathSegment2, c01Var);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void Z0(d dVar, String str, c01 c01Var) {
        if (dVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (c01Var != null) {
            c01Var.d();
            c01Var.b = new tm0(atomicBoolean, (byte) 1);
        }
        au0 au0Var = new au0(atomicBoolean, dVar, str, c01Var, (byte) 10);
        vm0 vm0Var = new vm0(atomicBoolean, c01Var, (byte) 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
        na7 q1 = na7.q1(y6c.t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new en0(q1, au0Var, vm0Var));
    }

    @Override
    public final n39 G0(o39 o39Var) {
        ot4 ot4Var = new ot4(this, this.J0);
        this.U1 = ot4Var;
        return ot4Var;
    }

    @Override
    public final CharSequence J0() {
        if (this.T1) {
            return k96.M0(2131753497, null);
        }
        return k96.M0(2131753170, null);
    }

    @Override
    public final void P0(cja cjaVar) {
        m21.a(this.c, new oy((byte) 7));
    }
}
