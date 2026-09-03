package gg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pb1;
public final class m1 extends eg.e2 {
    public final ArrayList N0;

    public m1(org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, f6 f6Var) {
        super(p2Var, i10, null, null, null, f6Var);
        ArrayList arrayList2 = new ArrayList();
        this.N0 = arrayList2;
        arrayList2.addAll(arrayList);
        b0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 8));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, b6.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        rl0 rl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i12 = l1.f6692f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, b6.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            l1 l1Var = new l1(context, 47.0f);
            l1Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            z8 z8Var = l1Var.e;
            z8Var.r(user);
            l1Var.f6693a.e(user, z8Var);
            frameLayout2.addView(l1Var, 0, b6.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, b6.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                l1 l1Var2 = new l1(context, 41.5f);
                z8 z8Var2 = l1Var2.e;
                z8Var2.r(user2);
                l1Var2.f6693a.e(user2, z8Var2);
                frameLayout2.addView(l1Var2, 0, b6.e(83, 83, 17));
                l1Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    k1 k1Var = l1Var2.f6694b;
                    k1Var.setAlpha(1.0f);
                    k1Var.f6681b = arrayList2.size() - 3;
                }
                i13++;
                if (i14 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i13 - 1) * AndroidUtilities.dp(14.5f));
        }
        this.f5270y0 = frameLayout;
        fixNavigationBar();
    }

    public static void c0(ArrayList arrayList) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        m1 m1Var = new m1(R, UserConfig.selectedAccount, arrayList, R.getResourceProvider());
        m1Var.G0 = true;
        m1Var.H0 = true;
        m1Var.show();
    }

    @Override
    public final void V(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new j1(0));
            view.setClipToOutline(true);
            view.setBackgroundColor(j6.v0(j6.f19827a7, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override
    public final void W(pb1 pb1Var) {
        int i10;
        float f10;
        float f11;
        View view = this.f5270y0;
        ArrayList arrayList = this.N0;
        if (arrayList.size() == 1) {
            i10 = 94;
        } else {
            i10 = 83;
        }
        if (arrayList.size() == 1) {
            f10 = 28.0f;
        } else {
            f10 = 34.0f;
        }
        if (arrayList.size() == 1) {
            f11 = 9.0f;
        } else {
            f11 = 14.0f;
        }
        pb1Var.addView(view, b6.k(0.0f, f10, 0.0f, f11, -1, i10));
    }

    @Override
    public final void a0(boolean z4) {
        String formatString;
        this.L0[0].setTextSize(1, 20.0f);
        this.M0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.M0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        f90 f90Var = this.L0[0];
        ArrayList arrayList = this.N0;
        f90Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
        ((ViewGroup.MarginLayoutParams) this.M0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.M0.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    formatString = LocaleController.formatPluralString("GiftPremiumUsersPurchasedMany", arrayList.size() - 3, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
                } else {
                    formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersThree", R.string.GiftPremiumUsersThree, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1)), UserObject.getFirstName((TLRPC.User) arrayList.get(2))));
                }
            } else {
                formatString = LocaleController.formatString("GiftPremiumUsersPurchasedManyZero", R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString("GiftPremiumUsersTwo", R.string.GiftPremiumUsersTwo, UserObject.getFirstName((TLRPC.User) arrayList.get(0)), UserObject.getFirstName((TLRPC.User) arrayList.get(1))));
            }
        } else {
            formatString = LocaleController.formatString(R.string.GiftPremiumUsersPurchasedManyZero, LocaleController.formatString(R.string.GiftPremiumUsersOne, UserObject.getFirstName((TLRPC.User) arrayList.get(0))));
        }
        this.M0.setText(AndroidUtilities.replaceTags(formatString));
        this.M0.append("\n");
        this.M0.append("\n");
        if (arrayList.size() == 1) {
            this.M0.append(AndroidUtilities.replaceTags(LocaleController.formatString("GiftPremiumGiftsSentStatusForUser", R.string.GiftPremiumGiftsSentStatusForUser, UserObject.getFirstName((TLRPC.User) arrayList.get(0)))));
        } else {
            this.M0.append(AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumGiftsSentStatus", R.string.GiftPremiumGiftsSentStatus)));
        }
    }

    @Override
    public final void b0() {
        this.f5249c0 = 1;
        this.f5250d0 = 0;
        this.f5253g0 = 1;
        int size = this.U.size();
        int i10 = 1 + size;
        this.f5254h0 = i10;
        this.f5249c0 = size + 2;
        this.f5257k0 = i10;
    }
}
