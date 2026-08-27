package cg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ra1;

public final class o1 extends ag.y2 {
    public final ArrayList M0;

    public o1(org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, c6 c6Var) {
        super(n2Var, i10, null, null, null, c6Var);
        ArrayList arrayList2 = new ArrayList();
        this.M0 = arrayList2;
        arrayList2.addAll(arrayList);
        b0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        eg.a aVar = new eg.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new ag.w0(this, 4));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, z5.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        zk0 zk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i12 = n1.f2781f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, z5.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            n1 n1Var = new n1(context, 47.0f);
            n1Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            y8 y8Var = n1Var.f2785e;
            y8Var.r(user);
            n1Var.f2782a.e(user, y8Var);
            frameLayout2.addView(n1Var, 0, z5.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, z5.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                n1 n1Var2 = new n1(context, 41.5f);
                y8 y8Var2 = n1Var2.f2785e;
                y8Var2.r(user2);
                n1Var2.f2782a.e(user2, y8Var2);
                frameLayout2.addView(n1Var2, 0, z5.e(83, 83, 17));
                n1Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    m1 m1Var = n1Var2.f2783b;
                    m1Var.setAlpha(1.0f);
                    m1Var.f2774b = arrayList2.size() - 3;
                }
                i13++;
                if (i14 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i13 - 1) * AndroidUtilities.dp(14.5f));
        }
        this.f730x0 = frameLayout;
        fixNavigationBar();
    }

    public static void c0(ArrayList arrayList) {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        o1 o1Var = new o1(n2VarR, UserConfig.selectedAccount, arrayList, n2VarR.getResourceProvider());
        o1Var.F0 = true;
        o1Var.G0 = true;
        o1Var.show();
    }

    @Override
    public final void V(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new l1(0));
            view.setClipToOutline(true);
            view.setBackgroundColor(g6.v0(g6.f22999a7, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override
    public final void W(ra1 ra1Var) {
        View view = this.f730x0;
        ArrayList arrayList = this.M0;
        ra1Var.addView(view, z5.k(0.0f, arrayList.size() == 1 ? 28.0f : 34.0f, 0.0f, arrayList.size() == 1 ? 9.0f : 14.0f, -1, arrayList.size() == 1 ? 94 : 83));
    }

    @Override
    public final void a0(boolean z10) {
        String string;
        this.K0[0].setTextSize(1, 20.0f);
        this.L0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.L0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        p80 p80Var = this.K0[0];
        ArrayList arrayList = this.M0;
        p80Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
        int size = arrayList.size();
        if (size == 1) {
            string = LocaleController.formatString(R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString(R.string.GiftPremiumUsersOne, UserObject.getFirstName((TLRPC.User) arrayList.get(0))));
        } else if (size == 2) {
            string = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersTwo", R.string.GiftPremiumUsersTwo, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1))));
        } else if (size != 3) {
            string = LocaleController.formatPluralString("GiftPremiumUsersPurchasedMany", arrayList.size() - 3, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
        } else {
            string = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
        }
        this.L0.setText(AndroidUtilities.replaceTags(string));
        this.L0.append("\n");
        this.L0.append("\n");
        if (arrayList.size() == 1) {
            this.L0.append(AndroidUtilities.replaceTags(LocaleController.formatString("GiftPremiumGiftsSentStatusForUser", R.string.GiftPremiumGiftsSentStatusForUser, UserObject.getFirstName((TLRPC.User) arrayList.get(0)))));
        } else {
            this.L0.append(AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumGiftsSentStatus", R.string.GiftPremiumGiftsSentStatus)));
        }
    }

    @Override
    public final void b0() {
        this.f709b0 = 1;
        this.f710c0 = 0;
        this.f713f0 = 1;
        int size = this.T.size();
        int i10 = 1 + size;
        this.f714g0 = i10;
        this.f709b0 = size + 2;
        this.f717j0 = i10;
    }
}
