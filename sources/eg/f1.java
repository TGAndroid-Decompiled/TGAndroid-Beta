package eg;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
public final class f1 extends xa {
    public final TLRPC.TL_payments_checkedGiftCode T;
    public final boolean U;
    public e1 V;
    public final String W;

    public f1(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(o2Var, true);
        boolean z10;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U = z10;
        this.T = tL_payments_checkedGiftCode;
        this.W = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        M();
        e1 e1Var = this.V;
        d3 d3Var = this.container;
        e1Var.getClass();
        e1Var.d = tL_payments_checkedGiftCode.used_date == 0;
        e1Var.f6739e = o2Var;
        e1Var.f6740f = tL_payments_checkedGiftCode;
        e1Var.h = str;
        e1Var.f6741n = d3Var;
    }

    public static c6 P(f1 f1Var) {
        return f1Var.resourcesProvider;
    }

    public static boolean S(Intent intent, ye.c cVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        T(LaunchActivity.R(), lastPathSegment, cVar);
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
                    T(LaunchActivity.R(), lastPathSegment2, cVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void T(org.telegram.ui.ActionBar.o2 o2Var, String str, ye.c cVar) {
        if (o2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (cVar != null) {
            cVar.d();
            cVar.f50515b = new k(atomicBoolean, 1);
        }
        d1 d1Var = new d1(atomicBoolean, o2Var, str, cVar, 0);
        m mVar = new m(atomicBoolean, cVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new z(messagesController, d1Var, mVar));
    }

    @Override
    public final void F(hv0 hv0Var) {
        mc.a(this.container, new x(1));
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        e1 e1Var = new e1(this, this.resourcesProvider);
        this.V = e1Var;
        return e1Var;
    }

    @Override
    public final CharSequence y() {
        if (this.U) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
