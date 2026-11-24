package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class rv4 extends mz0 {
    public final TLRPC.TL_payments_checkedGiftCode S1;
    public final boolean T1;
    public qv4 U1;
    public final String V1;

    public rv4(d dVar, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
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
        J();
        W0();
        qv4 qv4Var = this.U1;
        dy0 dy0Var = this.c;
        qv4Var.getClass();
        qv4Var.d = tL_payments_checkedGiftCode.used_date == 0;
        qv4Var.e = dVar;
        qv4Var.f = tL_payments_checkedGiftCode;
        qv4Var.h = str;
        qv4Var.n = dy0Var;
    }

    public static boolean Y0(Intent intent, k11 k11Var) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        Z0(LaunchActivity.Q(), lastPathSegment, k11Var);
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
                    Z0(LaunchActivity.Q(), lastPathSegment2, k11Var);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void Z0(d dVar, String str, k11 k11Var) {
        if (dVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (k11Var != null) {
            k11Var.d();
            k11Var.b = new tn0(atomicBoolean, (byte) 1);
        }
        jv0 jv0Var = new jv0(atomicBoolean, dVar, str, k11Var, (byte) 10);
        vn0 vn0Var = new vn0(atomicBoolean, k11Var, (byte) 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
        oc7 r1 = oc7.r1(z8c.t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new eo0(r1, jv0Var, vn0Var));
    }

    @Override
    public final q59 G0(r59 r59Var) {
        qv4 qv4Var = new qv4(this, this.J0);
        this.U1 = qv4Var;
        return qv4Var;
    }

    @Override
    public final CharSequence J0() {
        if (this.T1) {
            return jb6.M0(2131753465, null);
        }
        return jb6.M0(2131753138, null);
    }

    @Override
    public final void P0(ela elaVar) {
        u31.a(this.c, new oz((byte) 7));
    }
}
