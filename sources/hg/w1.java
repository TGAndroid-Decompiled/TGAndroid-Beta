package hg;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
public final class w1 extends sa {
    public final ArrayList U;
    public final ArrayList V;
    public final TLRPC.Chat W;
    public final f1 X;
    public v1 Y;
    public p1 Z;

    public w1(org.telegram.ui.ActionBar.p2 p2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(p2Var, false);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.v = 0.3f;
        this.W = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i10);
            i10++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f20843id)) {
                this.V.add(tL_myBoost2);
            }
        }
        lg.a aVar = new lg.a(getContext(), this.resourcesProvider, this.d);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        aVar.setBackgroundColor(k6.v0(k6.f21731h5, this.resourcesProvider));
        f1 f1Var = new f1(getContext(), this.resourcesProvider);
        this.X = f1Var;
        f1Var.k();
        f1Var.setCounterColor(-6785796);
        f1Var.setOnClickListener(new dg.n(4, this, chat));
        aVar.addView(f1Var, c6.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, c6.f(-2.0f, 87, i11, 0, i11, 0));
        tl0 tl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new v0(1, this, chat));
        fixNavigationBar();
        N();
        S(false);
        ic.a(this.container, new Object());
    }

    public static void P(w1 w1Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = w1Var.U;
        if (view instanceof lg.n) {
            lg.n nVar = (lg.n) view;
            if (nVar.getBoost().cooldown_until_date > 0) {
                new qc(w1Var.container, w1Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(nVar.getBoost())) {
                arrayList.remove(nVar.getBoost());
            } else {
                arrayList.add(nVar.getBoost());
            }
            nVar.c(arrayList.contains(nVar.getBoost()), true);
            w1Var.S(true);
            w1Var.Y.a(arrayList, chat);
        }
    }

    public final void S(boolean z4) {
        f1 f1Var = this.X;
        boolean z10 = false;
        f1Var.setShowZero(false);
        ArrayList arrayList = this.U;
        if (arrayList.size() > 1) {
            f1Var.g(LocaleController.getString(R.string.BoostingReassignBoosts), z4, true);
        } else {
            f1Var.g(LocaleController.getString(R.string.BoostingReassignBoost), z4, true);
        }
        f1Var.c(arrayList.size(), z4);
        if (arrayList.size() > 0) {
            z10 = true;
        }
        f1Var.setEnabled(z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z = new p1(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Z.cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.Z.start();
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        return new q1(this);
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
