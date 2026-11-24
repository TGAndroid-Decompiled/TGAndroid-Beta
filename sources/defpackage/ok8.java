package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ok8 extends yj8 {
    public final ArrayList L2;

    public ok8(d dVar, int i, ArrayList arrayList, ylb ylbVar) {
        super(dVar, i, null, null, null, ylbVar);
        ArrayList arrayList2 = new ArrayList();
        this.L2 = arrayList2;
        arrayList2.addAll(arrayList);
        f1();
        this.T0 = false;
        this.v0 = false;
        this.t0 = 0;
        n8 n8Var = new n8(getContext(), this.J0);
        n8Var.setOnClickListener(new m67(this, (byte) 29));
        n8Var.setCloseStyle(true);
        this.b.addView(n8Var, qoe.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        r59 r59Var = this.n1;
        int i2 = this.u0;
        r59Var.setPadding(i2, 0, i2, gm.L(64.0f));
        Context context = getContext();
        int i3 = nk8.f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, qoe.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            nk8 nk8Var = new nk8(context, 47.0f);
            nk8Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            pc0 pc0Var = nk8Var.e;
            pc0Var.q(user);
            nk8Var.a.f(user, pc0Var);
            frameLayout2.addView(nk8Var, 0, qoe.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, qoe.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i4 = 0;
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i5);
                nk8 nk8Var2 = new nk8(context, 41.5f);
                pc0 pc0Var2 = nk8Var2.e;
                pc0Var2.q(user2);
                nk8Var2.a.f(user2, pc0Var2);
                frameLayout2.addView(nk8Var2, 0, qoe.e(83, 83, 17));
                nk8Var2.setTranslationX(gm.L(29.0f) * (-i5));
                if (i5 == 0 && arrayList2.size() > 3) {
                    mk8 mk8Var = nk8Var2.b;
                    mk8Var.setAlpha(1.0f);
                    mk8Var.b = arrayList2.size() - 3;
                }
                i4++;
                if (i5 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i4 - 1) * gm.L(14.5f));
        }
        this.w2 = frameLayout;
        J();
    }

    public static void g1(ArrayList arrayList) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        ok8 ok8Var = new ok8(Q, z8c.t0, arrayList, Q.getResourceProvider());
        ok8Var.E2 = true;
        ok8Var.F2 = true;
        ok8Var.show();
    }

    @Override
    public final void Y0(int i, View view) {
        if (i == 0) {
            view.setOutlineProvider(new xj((byte) 12));
            view.setClipToOutline(true);
            anb.h(cmb.Z6, this.J0, view);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -gm.L(6.0f);
        }
    }

    @Override
    public final void Z0(qmb qmbVar) {
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
        qmbVar.addView(view, qoe.k(0.0f, f3, 0.0f, f2, -1, i2));
    }

    @Override
    public final void e1(boolean z) {
        String a0;
        this.J2[0].setTextSize(1, 20.0f);
        this.K2.setPadding(gm.L(30.0f), 0, gm.L(30.0f), 0);
        this.K2.setLineSpacing(gm.L(2.0f), 1.0f);
        l66 l66Var = this.J2[0];
        ArrayList arrayList = this.L2;
        l66Var.setText(jb6.J0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).bottomMargin = gm.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).topMargin = gm.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a0 = jb6.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", jb6.a0("GiftPremiumUsersThree", null, 2131749426, m9c.k((TLRPC.User) arrayList.get(0), true), m9c.k((TLRPC.User) arrayList.get(1), true), m9c.k((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a0 = jb6.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749430, jb6.a0("GiftPremiumUsersThree", null, 2131749426, m9c.k((TLRPC.User) arrayList.get(0), true), m9c.k((TLRPC.User) arrayList.get(1), true), m9c.k((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a0 = jb6.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749430, jb6.a0("GiftPremiumUsersTwo", null, 2131749425, m9c.k((TLRPC.User) arrayList.get(0), true), m9c.k((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a0 = jb6.a0(null, null, 2131749430, jb6.a0(null, null, 2131749432, m9c.k((TLRPC.User) arrayList.get(0), true)));
        }
        this.K2.setText(gm.S2(a0));
        this.K2.append("\n");
        this.K2.append("\n");
        int size2 = arrayList.size();
        l66 l66Var2 = this.K2;
        if (size2 == 1) {
            l66Var2.append(gm.S2(jb6.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749445, m9c.k((TLRPC.User) arrayList.get(0), true))));
        } else {
            l66Var2.append(gm.S2(jb6.M0(2131749446, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override
    public final void f1() {
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
