package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class mi8 extends xh8 {
    public final ArrayList L2;

    public mi8(d dVar, int i, ArrayList arrayList, wjb wjbVar) {
        super(dVar, i, null, null, null, wjbVar);
        ArrayList arrayList2 = new ArrayList();
        this.L2 = arrayList2;
        arrayList2.addAll(arrayList);
        f1();
        this.T0 = false;
        this.v0 = false;
        this.t0 = 0;
        n8 n8Var = new n8(getContext(), this.J0);
        n8Var.setOnClickListener(new fr7(this, (byte) 26));
        n8Var.setCloseStyle(true);
        this.b.addView(n8Var, nme.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        o39 o39Var = this.n1;
        int i2 = this.u0;
        o39Var.setPadding(i2, 0, i2, gl.L(64.0f));
        Context context = getContext();
        int i3 = li8.f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, nme.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            li8 li8Var = new li8(context, 47.0f);
            li8Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            pb0 pb0Var = li8Var.e;
            pb0Var.q(user);
            li8Var.a.f(user, pb0Var);
            frameLayout2.addView(li8Var, 0, nme.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, nme.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i4 = 0;
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i5);
                li8 li8Var2 = new li8(context, 41.5f);
                pb0 pb0Var2 = li8Var2.e;
                pb0Var2.q(user2);
                li8Var2.a.f(user2, pb0Var2);
                frameLayout2.addView(li8Var2, 0, nme.e(83, 83, 17));
                li8Var2.setTranslationX(gl.L(29.0f) * (-i5));
                if (i5 == 0 && arrayList2.size() > 3) {
                    ki8 ki8Var = li8Var2.b;
                    ki8Var.setAlpha(1.0f);
                    ki8Var.b = arrayList2.size() - 3;
                }
                i4++;
                if (i5 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i4 - 1) * gl.L(14.5f));
        }
        this.w2 = frameLayout;
        K();
    }

    public static void g1(ArrayList arrayList) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        mi8 mi8Var = new mi8(Q, y6c.t0, arrayList, Q.getResourceProvider());
        mi8Var.E2 = true;
        mi8Var.F2 = true;
        mi8Var.show();
    }

    @Override
    public final void Y0(int i, View view) {
        if (i == 0) {
            view.setOutlineProvider(new xi((byte) 12));
            view.setClipToOutline(true);
            zkb.h(bkb.Z6, this.J0, view);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -gl.L(6.0f);
        }
    }

    @Override
    public final void Z0(pkb pkbVar) {
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
        pkbVar.addView(view, nme.k(0.0f, f3, 0.0f, f2, -1, i2));
    }

    @Override
    public final void e1(boolean z) {
        String a0;
        this.J2[0].setTextSize(1, 20.0f);
        this.K2.setPadding(gl.L(30.0f), 0, gl.L(30.0f), 0);
        this.K2.setLineSpacing(gl.L(2.0f), 1.0f);
        l46 l46Var = this.J2[0];
        ArrayList arrayList = this.L2;
        l46Var.setText(k96.J0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).bottomMargin = gl.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).topMargin = gl.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a0 = k96.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", k96.a0("GiftPremiumUsersThree", null, 2131749477, l7c.k((TLRPC.User) arrayList.get(0), true), l7c.k((TLRPC.User) arrayList.get(1), true), l7c.k((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a0 = k96.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749481, k96.a0("GiftPremiumUsersThree", null, 2131749477, l7c.k((TLRPC.User) arrayList.get(0), true), l7c.k((TLRPC.User) arrayList.get(1), true), l7c.k((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a0 = k96.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749481, k96.a0("GiftPremiumUsersTwo", null, 2131749476, l7c.k((TLRPC.User) arrayList.get(0), true), l7c.k((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a0 = k96.a0(null, null, 2131749481, k96.a0(null, null, 2131749483, l7c.k((TLRPC.User) arrayList.get(0), true)));
        }
        this.K2.setText(gl.S2(a0));
        this.K2.append("\n");
        this.K2.append("\n");
        int size2 = arrayList.size();
        l46 l46Var2 = this.K2;
        if (size2 == 1) {
            l46Var2.append(gl.S2(k96.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749496, l7c.k((TLRPC.User) arrayList.get(0), true))));
        } else {
            l46Var2.append(gl.S2(k96.M0(2131749497, "GiftPremiumGiftsSentStatus")));
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
