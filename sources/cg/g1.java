package cg;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;

public final class g1 extends qa {
    public final TLRPC.TL_payments_checkedGiftCode T;
    public final boolean U;
    public f1 V;
    public final String W;

    public g1(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode, String str) {
        super(n2Var, true);
        this.U = tL_payments_checkedGiftCode.used_date == 0;
        this.T = tL_payments_checkedGiftCode;
        this.W = str;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        fixNavigationBar();
        N();
        f1 f1Var = this.V;
        c3 c3Var = this.container;
        f1Var.getClass();
        f1Var.d = tL_payments_checkedGiftCode.used_date == 0;
        f1Var.f4944e = n2Var;
        f1Var.f4945f = tL_payments_checkedGiftCode;
        f1Var.h = str;
        f1Var.f4946n = c3Var;
    }

    public static boolean S(Intent intent, we.d dVar) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (!scheme.equals("http") && !scheme.equals("https")) {
            if (!scheme.equals("tg")) {
                return false;
            }
            String string = data.toString();
            String lastPathSegment = data.getLastPathSegment();
            if ((!string.startsWith("tg:giftcode") && !string.startsWith("tg://giftcode")) || lastPathSegment == null) {
                return false;
            }
            T(LaunchActivity.R(), lastPathSegment, dVar);
            return true;
        }
        String lowerCase = data.getHost().toLowerCase();
        if ((!lowerCase.equals("telegram.me") && !lowerCase.equals("t.me") && !lowerCase.equals("telegram.dog")) || (path = data.getPath()) == null) {
            return false;
        }
        String lastPathSegment2 = data.getLastPathSegment();
        if (!path.startsWith("/giftcode") || lastPathSegment2 == null) {
            return false;
        }
        T(LaunchActivity.R(), lastPathSegment2, dVar);
        return true;
    }

    public static void T(org.telegram.ui.ActionBar.n2 n2Var, String str, we.d dVar) {
        if (n2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (dVar != null) {
            dVar.d();
            dVar.f49293b = new k(atomicBoolean, 1);
        }
        e1 e1Var = new e1(atomicBoolean, n2Var, str, dVar, 0);
        m mVar = new m(atomicBoolean, dVar, 1);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_checkGiftCode tL_payments_checkGiftCode = new TLRPC.TL_payments_checkGiftCode();
        tL_payments_checkGiftCode.slug = str;
        connectionsManager.sendRequest(tL_payments_checkGiftCode, new y(messagesController, e1Var, mVar));
    }

    @Override
    public final void G(zu0 zu0Var) {
        ec.a(this.container, new w(1));
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        f1 f1Var = new f1(this, this.resourcesProvider);
        this.V = f1Var;
        return f1Var;
    }

    @Override
    public final CharSequence z() {
        return this.U ? LocaleController.getString(R.string.BoostingGiftLink) : LocaleController.getString(R.string.BoostingUsedGiftLink);
    }
}
