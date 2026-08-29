package eg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ua1;
public final class n1 extends cg.f2 {
    public final ArrayList M0;

    public n1(org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, c6 c6Var) {
        super(o2Var, i10, null, null, null, c6Var);
        ArrayList arrayList2 = new ArrayList();
        this.M0 = arrayList2;
        arrayList2.addAll(arrayList);
        b0();
        this.useBackgroundTopPadding = false;
        setApplyTopPadding(false);
        this.backgroundPaddingTop = 0;
        gg.a aVar = new gg.a(getContext(), this.resourcesProvider);
        aVar.setOnClickListener(new ag.o(this, 8));
        aVar.setCloseStyle(true);
        this.containerView.addView(aVar, f6.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        Context context = getContext();
        int i12 = m1.f6087f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, f6.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            m1 m1Var = new m1(context, 47.0f);
            m1Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            e9 e9Var = m1Var.f6091e;
            e9Var.r(user);
            m1Var.f6088a.e(user, e9Var);
            frameLayout2.addView(m1Var, 0, f6.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, f6.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                m1 m1Var2 = new m1(context, 41.5f);
                e9 e9Var2 = m1Var2.f6091e;
                e9Var2.r(user2);
                m1Var2.f6088a.e(user2, e9Var2);
                frameLayout2.addView(m1Var2, 0, f6.e(83, 83, 17));
                m1Var2.setTranslationX(AndroidUtilities.dp(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    l1 l1Var = m1Var2.f6089b;
                    l1Var.setAlpha(1.0f);
                    l1Var.f6078b = arrayList2.size() - 3;
                }
                i13++;
                if (i14 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i13 - 1) * AndroidUtilities.dp(14.5f));
        }
        this.f3144x0 = frameLayout;
        fixNavigationBar();
    }

    public static void c0(ArrayList arrayList) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        n1 n1Var = new n1(R, UserConfig.selectedAccount, arrayList, R.getResourceProvider());
        n1Var.F0 = true;
        n1Var.G0 = true;
        n1Var.show();
    }

    @Override
    public final void V(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new k1(0));
            view.setClipToOutline(true);
            view.setBackgroundColor(g6.v0(g6.f23009a7, this.resourcesProvider));
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -AndroidUtilities.dp(6.0f);
        }
    }

    @Override
    public final void W(ua1 ua1Var) {
        int i10;
        float f9;
        float f10;
        View view = this.f3144x0;
        ArrayList arrayList = this.M0;
        if (arrayList.size() == 1) {
            i10 = 94;
        } else {
            i10 = 83;
        }
        if (arrayList.size() == 1) {
            f9 = 28.0f;
        } else {
            f9 = 34.0f;
        }
        if (arrayList.size() == 1) {
            f10 = 9.0f;
        } else {
            f10 = 14.0f;
        }
        ua1Var.addView(view, f6.k(0.0f, f9, 0.0f, f10, -1, i10));
    }

    @Override
    public final void a0(boolean z10) {
        String formatString;
        this.K0[0].setTextSize(1, 20.0f);
        this.L0.setPadding(AndroidUtilities.dp(30.0f), 0, AndroidUtilities.dp(30.0f), 0);
        this.L0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y80 y80Var = this.K0[0];
        ArrayList arrayList = this.M0;
        y80Var.setText(LocaleController.getPluralString("GiftPremiumGiftsSent", arrayList.size()));
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).topMargin = AndroidUtilities.dp(4.0f);
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
        this.L0.setText(AndroidUtilities.replaceTags(formatString));
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
        this.f3123b0 = 1;
        this.f3124c0 = 0;
        this.f3127f0 = 1;
        int size = this.T.size();
        int i10 = 1 + size;
        this.f3128g0 = i10;
        this.f3123b0 = size + 2;
        this.f3131j0 = i10;
    }
}
