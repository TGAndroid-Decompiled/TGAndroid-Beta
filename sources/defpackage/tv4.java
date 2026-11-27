package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class tv4 extends ny0 {
    public final TLRPC.TL_payments_checkedGiftCode S1;
    public final boolean T1;
    public sv4 U1;
    public final String V1;

    public tv4(e eVar, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(eVar, true);
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
        X0();
        sv4 sv4Var = this.U1;
        ex0 ex0Var = this.c;
        sv4Var.getClass();
        sv4Var.d = tL_payments_checkedGiftCode.used_date == 0;
        sv4Var.e = eVar;
        sv4Var.f = tL_payments_checkedGiftCode;
        sv4Var.h = str;
        sv4Var.n = ex0Var;
    }

    public static boolean Z0(Intent intent, l01 l01Var) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        a1(LaunchActivity.Q(), lastPathSegment, l01Var);
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
                    a1(LaunchActivity.Q(), lastPathSegment2, l01Var);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void a1(e eVar, String str, l01 l01Var) {
        if (eVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (l01Var != null) {
            l01Var.d();
            l01Var.b = new um0(atomicBoolean, (byte) 1);
        }
        ku0 ku0Var = new ku0(atomicBoolean, eVar, str, l01Var, (byte) 10);
        nm0 nm0Var = new nm0(atomicBoolean, l01Var, (byte) 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
        uc7 s1 = uc7.s1(yac.t0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new fn0(s1, ku0Var, nm0Var));
    }

    @Override
    public final c79 H0(d79 d79Var) {
        sv4 sv4Var = new sv4(this, this.J0);
        this.U1 = sv4Var;
        return sv4Var;
    }

    @Override
    public final CharSequence K0() {
        if (this.T1) {
            return ob6.M0(2131753493, null);
        }
        return ob6.M0(2131753166, null);
    }

    @Override
    public final void Q0(wma wmaVar) {
        v21.a(this.c, new py((byte) 7));
    }
}
