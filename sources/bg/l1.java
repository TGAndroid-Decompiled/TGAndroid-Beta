package bg;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.LaunchActivity;
public final class l1 extends sa {
    public final TLRPC.TL_payments_checkedGiftCode T;
    public final boolean U;
    public k1 V;
    public final String W;

    public l1(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
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
        k1 k1Var = this.V;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        k1Var.getClass();
        k1Var.d = tL_payments_checkedGiftCode.used_date == 0;
        k1Var.f2400e = o2Var;
        k1Var.f2401f = tL_payments_checkedGiftCode;
        k1Var.h = str;
        k1Var.f2402n = d3Var;
    }

    public static boolean R(Intent intent, ve.d dVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (!scheme.equals("http") && !scheme.equals("https")) {
                if (scheme.equals("tg")) {
                    String uri = data.toString();
                    String lastPathSegment = data.getLastPathSegment();
                    if ((uri.startsWith("tg:giftcode") || uri.startsWith("tg://giftcode")) && lastPathSegment != null) {
                        S(LaunchActivity.R(), lastPathSegment, dVar);
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
                    S(LaunchActivity.R(), lastPathSegment2, dVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void S(org.telegram.ui.ActionBar.o2 o2Var, String str, ve.d dVar) {
        if (o2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (dVar != null) {
            dVar.d();
            dVar.f48382b = new n(atomicBoolean, 1);
        }
        j1 j1Var = new j1(atomicBoolean, o2Var, str, dVar, 0);
        p pVar = new p(atomicBoolean, dVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new b0(messagesController, j1Var, pVar));
    }

    @Override
    public final void F(xu0 xu0Var) {
        gc.a(this.container, new z(1));
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        k1 k1Var = new k1(this, this.resourcesProvider);
        this.V = k1Var;
        return k1Var;
    }

    @Override
    public final CharSequence y() {
        if (this.U) {
            return LocaleController.getString(R.string.BoostingGiftLink);
        }
        return LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
