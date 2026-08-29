package eg;

import android.view.View;
import android.view.ViewGroup;
import i7.f6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xa;
public final class x1 extends xa {
    public final ArrayList T;
    public final ArrayList U;
    public final TLRPC.Chat V;
    public final g1 W;
    public w1 X;
    public q1 Y;

    public x1(org.telegram.ui.ActionBar.o2 o2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(o2Var, false);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.v = 0.3f;
        this.V = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i10);
            i10++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f22392id)) {
                this.U.add(tL_myBoost2);
            }
        }
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider, this.d);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        aVar.setBackgroundColor(g6.v0(g6.f23133h5, this.resourcesProvider));
        g1 g1Var = new g1(getContext(), this.resourcesProvider);
        this.W = g1Var;
        g1Var.k();
        g1Var.setCounterColor(-6785796);
        g1Var.setOnClickListener(new ag.n(4, this, chat));
        aVar.addView(g1Var, f6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, f6.f(-2.0f, 87, i11, 0, i11, 0));
        jl0 jl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new w0(1, this, chat));
        fixNavigationBar();
        M();
        S(false);
        mc.a(this.container, new Object());
    }

    public static void P(x1 x1Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = x1Var.T;
        if (view instanceof ig.n) {
            ig.n nVar = (ig.n) view;
            if (nVar.getBoost().cooldown_until_date > 0) {
                new tc(x1Var.container, x1Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(nVar.getBoost())) {
                arrayList.remove(nVar.getBoost());
            } else {
                arrayList.add(nVar.getBoost());
            }
            nVar.c(arrayList.contains(nVar.getBoost()), true);
            x1Var.S(true);
            x1Var.X.a(arrayList, chat);
        }
    }

    public static void Q(x1 x1Var, TLRPC.Chat chat, ArrayList arrayList, HashSet hashSet, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(x1Var.currentAccount).getBoostsController().getBoostsStats(-chat.f22392id, new o1(x1Var, tL_premium_myBoosts, arrayList, hashSet, 0));
    }

    public final void S(boolean z10) {
        g1 g1Var = this.W;
        boolean z11 = false;
        g1Var.setShowZero(false);
        ArrayList arrayList = this.T;
        if (arrayList.size() > 1) {
            g1Var.g(LocaleController.getString(R.string.BoostingReassignBoosts), z10, true);
        } else {
            g1Var.g(LocaleController.getString(R.string.BoostingReassignBoost), z10, true);
        }
        g1Var.c(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        g1Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y = new q1(this);
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
    public final il0 v(jl0 jl0Var) {
        return new r1(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
