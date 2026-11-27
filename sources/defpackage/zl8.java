package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class zl8 extends kl8 {
    public final ArrayList L2;

    public zl8(e eVar, int i, ArrayList arrayList, vnb vnbVar) {
        super(eVar, i, null, null, null, vnbVar);
        ArrayList arrayList2 = new ArrayList();
        this.L2 = arrayList2;
        arrayList2.addAll(arrayList);
        g1();
        this.T0 = false;
        this.v0 = false;
        this.t0 = 0;
        o8 o8Var = new o8(getContext(), this.J0);
        o8Var.setOnClickListener(new am7(this, (byte) 28));
        o8Var.setCloseStyle(true);
        this.b.addView(o8Var, tre.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        d79 d79Var = this.n1;
        int i2 = this.u0;
        d79Var.setPadding(i2, 0, i2, hl.L(64.0f));
        Context context = getContext();
        int i3 = yl8.f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, tre.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            yl8 yl8Var = new yl8(context, 47.0f);
            yl8Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            rb0 rb0Var = yl8Var.e;
            rb0Var.q(user);
            yl8Var.a.f(user, rb0Var);
            frameLayout2.addView(yl8Var, 0, tre.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, tre.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i4 = 0;
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i5);
                yl8 yl8Var2 = new yl8(context, 41.5f);
                rb0 rb0Var2 = yl8Var2.e;
                rb0Var2.q(user2);
                yl8Var2.a.f(user2, rb0Var2);
                frameLayout2.addView(yl8Var2, 0, tre.e(83, 83, 17));
                yl8Var2.setTranslationX(hl.L(29.0f) * (-i5));
                if (i5 == 0 && arrayList2.size() > 3) {
                    xl8 xl8Var = yl8Var2.b;
                    xl8Var.setAlpha(1.0f);
                    xl8Var.b = arrayList2.size() - 3;
                }
                i4++;
                if (i5 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i4 - 1) * hl.L(14.5f));
        }
        this.w2 = frameLayout;
        J();
    }

    public static void h1(ArrayList arrayList) {
        e Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        zl8 zl8Var = new zl8(Q, yac.t0, arrayList, Q.getResourceProvider());
        zl8Var.E2 = true;
        zl8Var.F2 = true;
        zl8Var.show();
    }

    @Override
    public final void Z0(int i, View view) {
        if (i == 0) {
            view.setOutlineProvider(new yi((byte) 11));
            view.setClipToOutline(true);
            yob.h(aob.a7, this.J0, view);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -hl.L(6.0f);
        }
    }

    @Override
    public final void a1(oob oobVar) {
        int i;
        float f;
        float f2;
        View view = this.w2;
        ArrayList arrayList = this.L2;
        if (arrayList.size() == 1) {
            i = 94;
        } else {
            i = 83;
        }
        int i2 = i;
        if (arrayList.size() == 1) {
            f = 28.0f;
        } else {
            f = 34.0f;
        }
        float f3 = f;
        if (arrayList.size() == 1) {
            f2 = 9.0f;
        } else {
            f2 = 14.0f;
        }
        oobVar.addView(view, tre.k(0.0f, f3, 0.0f, f2, -1, i2));
    }

    @Override
    public final void f1(boolean z) {
        String a0;
        this.J2[0].setTextSize(1, 20.0f);
        this.K2.setPadding(hl.L(30.0f), 0, hl.L(30.0f), 0);
        this.K2.setLineSpacing(hl.L(2.0f), 1.0f);
        p66 p66Var = this.J2[0];
        ArrayList arrayList = this.L2;
        p66Var.setText(ob6.J0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).bottomMargin = hl.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).topMargin = hl.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a0 = ob6.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", ob6.a0("GiftPremiumUsersThree", null, 2131749438, lbc.k((TLRPC.User) arrayList.get(0), true), lbc.k((TLRPC.User) arrayList.get(1), true), lbc.k((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a0 = ob6.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749442, ob6.a0("GiftPremiumUsersThree", null, 2131749438, lbc.k((TLRPC.User) arrayList.get(0), true), lbc.k((TLRPC.User) arrayList.get(1), true), lbc.k((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a0 = ob6.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749442, ob6.a0("GiftPremiumUsersTwo", null, 2131749437, lbc.k((TLRPC.User) arrayList.get(0), true), lbc.k((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a0 = ob6.a0(null, null, 2131749442, ob6.a0(null, null, 2131749444, lbc.k((TLRPC.User) arrayList.get(0), true)));
        }
        this.K2.setText(hl.S2(a0));
        this.K2.append("\n");
        this.K2.append("\n");
        int size2 = arrayList.size();
        p66 p66Var2 = this.K2;
        if (size2 == 1) {
            p66Var2.append(hl.S2(ob6.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749457, lbc.k((TLRPC.User) arrayList.get(0), true))));
        } else {
            p66Var2.append(hl.S2(ob6.M0(2131749458, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override
    public final void g1() {
        this.a2 = 1;
        this.b2 = 0;
        this.e2 = 1;
        int size = this.S1.size();
        int i = 1 + size;
        this.f2 = i;
        this.a2 = size + 2;
        this.i2 = i;
    }
}
