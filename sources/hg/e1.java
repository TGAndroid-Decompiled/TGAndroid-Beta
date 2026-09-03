package hg;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
public final class e1 extends sa {
    public final TLRPC.TL_payments_checkedGiftCode U;
    public final boolean V;
    public d1 W;
    public final String X;

    public e1(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(p2Var, true);
        boolean z4;
        if (tL_payments_checkedGiftCode.used_date == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.V = z4;
        this.U = tL_payments_checkedGiftCode;
        this.X = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        N();
        d1 d1Var = this.W;
        f3 f3Var = this.container;
        d1Var.getClass();
        d1Var.d = tL_payments_checkedGiftCode.used_date == 0;
        d1Var.f8081e = p2Var;
        d1Var.f8082f = tL_payments_checkedGiftCode;
        d1Var.h = str;
        d1Var.f8083n = f3Var;
    }

    public static g6 P(e1 e1Var) {
        return e1Var.resourcesProvider;
    }

    public static boolean S(Intent intent, af.f fVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        T(LaunchActivity.R(), lastPathSegment, fVar);
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
                    T(LaunchActivity.R(), lastPathSegment2, fVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void T(org.telegram.ui.ActionBar.p2 p2Var, String str, af.f fVar) {
        if (p2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (fVar != null) {
            fVar.d();
            fVar.f180b = new k(atomicBoolean, 1);
        }
        c1 c1Var = new c1(atomicBoolean, p2Var, str, fVar, 0);
        m mVar = new m(atomicBoolean, fVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new y(messagesController, c1Var, mVar));
    }

    @Override
    public final void F(pv0 pv0Var) {
        ic.a(this.container, new w(1));
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        d1 d1Var = new d1(this, this.resourcesProvider);
        this.W = d1Var;
        return d1Var;
    }

    @Override
    public final CharSequence y() {
        if (this.V) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
