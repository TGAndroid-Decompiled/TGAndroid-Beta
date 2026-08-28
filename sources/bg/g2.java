package bg;

import android.view.View;
import android.view.ViewGroup;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
public final class g2 extends sa {
    public final ArrayList T;
    public final ArrayList U;
    public final TLRPC.Chat V;
    public final m1 W;
    public f2 X;
    public x1 Y;

    public g2(org.telegram.ui.ActionBar.o2 o2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(o2Var, false);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.v = 0.3f;
        this.V = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i9);
            i9++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f22380id)) {
                this.U.add(tL_myBoost2);
            }
        }
        fg.a aVar = new fg.a(getContext(), this.resourcesProvider, this.d);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        aVar.setBackgroundColor(f6.v0(f6.f23072h5, this.resourcesProvider));
        m1 m1Var = new m1(getContext(), this.resourcesProvider);
        this.W = m1Var;
        m1Var.k();
        m1Var.setCounterColor(-6785796);
        m1Var.setOnClickListener(new u1(0, this, chat));
        aVar.addView(m1Var, e6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, e6.f(-2.0f, 87, i10, 0, i10, 0));
        wk0 wk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new b1(1, this, chat));
        fixNavigationBar();
        M();
        R(false);
        gc.a(this.container, new Object());
    }

    public static void O(g2 g2Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = g2Var.T;
        if (view instanceof fg.p) {
            fg.p pVar = (fg.p) view;
            if (pVar.getBoost().cooldown_until_date > 0) {
                new oc(g2Var.container, g2Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(pVar.getBoost())) {
                arrayList.remove(pVar.getBoost());
            } else {
                arrayList.add(pVar.getBoost());
            }
            pVar.c(arrayList.contains(pVar.getBoost()), true);
            g2Var.R(true);
            g2Var.X.a(arrayList, chat);
        }
    }

    public final void R(boolean z10) {
        m1 m1Var = this.W;
        boolean z11 = false;
        m1Var.setShowZero(false);
        ArrayList arrayList = this.T;
        if (arrayList.size() > 1) {
            m1Var.g(LocaleController.getString(R.string.BoostingReassignBoosts), z10, true);
        } else {
            m1Var.g(LocaleController.getString(R.string.BoostingReassignBoost), z10, true);
        }
        m1Var.c(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        m1Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y = new x1(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Y.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.Y.start();
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        return new y1(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
