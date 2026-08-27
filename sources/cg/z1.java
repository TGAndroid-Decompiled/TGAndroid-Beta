package cg;

import android.view.View;
import android.view.ViewGroup;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

public final class z1 extends qa {
    public final ArrayList T;
    public final ArrayList U;
    public final TLRPC.Chat V;
    public final h1 W;
    public y1 X;
    public r1 Y;

    public z1(org.telegram.ui.ActionBar.n2 n2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(n2Var, false);
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
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.f22380id)) {
                this.U.add(tL_myBoost2);
            }
        }
        gg.a aVar = new gg.a(getContext(), this.resourcesProvider, this.d);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        aVar.setBackgroundColor(g6.v0(g6.f23124h5, this.resourcesProvider));
        h1 h1Var = new h1(getContext(), this.resourcesProvider);
        this.W = h1Var;
        h1Var.k();
        h1Var.setCounterColor(-6785796);
        h1Var.setOnClickListener(new ag.q0(1, this, chat));
        aVar.addView(h1Var, z5.q(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.addView(aVar, z5.f(-2.0f, 87, i11, 0, i11, 0));
        zk0 zk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new x0(1, this, chat));
        fixNavigationBar();
        N();
        S(false);
        ec.a(this.container, new q1());
    }

    public static void P(z1 z1Var, TLRPC.Chat chat, View view) {
        ArrayList arrayList = z1Var.T;
        if (view instanceof gg.o) {
            gg.o oVar = (gg.o) view;
            if (oVar.getBoost().cooldown_until_date > 0) {
                new mc(z1Var.container, z1Var.resourcesProvider).G(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).k(true);
                return;
            }
            if (arrayList.contains(oVar.getBoost())) {
                arrayList.remove(oVar.getBoost());
            } else {
                arrayList.add(oVar.getBoost());
            }
            oVar.c(arrayList.contains(oVar.getBoost()), true);
            z1Var.S(true);
            z1Var.X.a(arrayList, chat);
        }
    }

    public final void S(boolean z10) {
        h1 h1Var = this.W;
        h1Var.setShowZero(false);
        ArrayList arrayList = this.T;
        if (arrayList.size() > 1) {
            h1Var.g(LocaleController.getString(R.string.BoostingReassignBoosts), z10, true);
        } else {
            h1Var.g(LocaleController.getString(R.string.BoostingReassignBoost), z10, true);
        }
        h1Var.c(arrayList.size(), z10);
        h1Var.setEnabled(arrayList.size() > 0);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y = new r1(this);
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
    public final yk0 w(zk0 zk0Var) {
        return new s1(this);
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }
}
