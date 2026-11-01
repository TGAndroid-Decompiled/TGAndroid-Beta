package mg;

import ag.m2;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
public final class y0 extends ha {
    public final TLRPC.TL_payments_checkedGiftCode P1;
    public final boolean Q1;
    public x0 R1;
    public final String S1;

    public y0(k2 k2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(k2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q1 = z10;
        this.P1 = tL_payments_checkedGiftCode;
        this.S1 = str;
        this.f21617u0 = false;
        this.f21618v0 = false;
        O();
        b1();
        x0 x0Var = this.R1;
        p2 p2Var = this.f21590c;
        x0Var.getClass();
        x0Var.d = tL_payments_checkedGiftCode.used_date == 0;
        x0Var.e = k2Var;
        x0Var.f13778f = tL_payments_checkedGiftCode;
        x0Var.h = str;
        x0Var.f13779n = p2Var;
    }

    public static boolean d1(Intent intent, gf.e eVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        e1(LaunchActivity.Q(), lastPathSegment, eVar);
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
                    e1(LaunchActivity.Q(), lastPathSegment2, eVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void e1(k2 k2Var, String str, gf.e eVar) {
        if (k2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (eVar != null) {
            eVar.d();
            eVar.f7486b = new i(atomicBoolean, 1);
        }
        m2 m2Var = new m2(atomicBoolean, k2Var, str, eVar, 1);
        k kVar = new k(atomicBoolean, eVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e20.f15506s0);
        wp r12 = wp.r1(e20.f15506s0);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new ag.p0(r12, m2Var, kVar, 4));
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        x0 x0Var = new x0(this, this.I0);
        this.R1 = x0Var;
        return x0Var;
    }

    @Override
    public final CharSequence O0() {
        if (this.Q1) {
            return dd.L0(2131753500, null);
        }
        return dd.L0(2131753173, null);
    }

    @Override
    public final void U0(vu0 vu0Var) {
        wb.a(this.f21590c, new u(1));
    }
}
