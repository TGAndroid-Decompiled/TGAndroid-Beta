package mg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u71;
import w7.b6;
public final class f1 extends kg.v1 {
    public final ArrayList I2;

    public f1(k2 k2Var, int i10, ArrayList arrayList, p6 p6Var) {
        super(k2Var, i10, null, null, null, p6Var);
        ArrayList arrayList2 = new ArrayList();
        this.I2 = arrayList2;
        arrayList2.addAll(arrayList);
        k1();
        this.T0 = false;
        this.f21616u0 = false;
        this.f21614s0 = 0;
        og.a aVar = new og.a(getContext(), this.I0);
        aVar.setOnClickListener(new ag.g(this, 14));
        aVar.setCloseStyle(true);
        this.f21586b.addView(aVar, b6.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        tk0 tk0Var = this.f26666k1;
        int i11 = this.f21615t0;
        tk0Var.setPadding(i11, 0, i11, org.telegram.messenger.i0.L(64.0f));
        Context context = getContext();
        int i12 = e1.f13105f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, b6.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            e1 e1Var = new e1(context, 47.0f);
            e1Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            r8 r8Var = e1Var.e;
            r8Var.r(user);
            e1Var.f13106a.e(user, r8Var);
            frameLayout2.addView(e1Var, 0, b6.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, b6.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i13 = 0;
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i14);
                e1 e1Var2 = new e1(context, 41.5f);
                r8 r8Var2 = e1Var2.e;
                r8Var2.r(user2);
                e1Var2.f13106a.e(user2, r8Var2);
                frameLayout2.addView(e1Var2, 0, b6.e(83, 83, 17));
                e1Var2.setTranslationX(org.telegram.messenger.i0.L(29.0f) * (-i14));
                if (i14 == 0 && arrayList2.size() > 3) {
                    d1 d1Var = e1Var2.f13107b;
                    d1Var.setAlpha(1.0f);
                    d1Var.f13093b = arrayList2.size() - 3;
                }
                i13++;
                if (i14 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i13 - 1) * org.telegram.messenger.i0.L(14.5f));
        }
        this.f11311t2 = frameLayout;
        O();
    }

    public static void l1(ArrayList arrayList) {
        k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        f1 f1Var = new f1(Q, d20.f15147s0, arrayList, Q.getResourceProvider());
        f1Var.B2 = true;
        f1Var.C2 = true;
        f1Var.show();
    }

    @Override
    public final void d1(int i10, View view) {
        if (i10 == 0) {
            view.setOutlineProvider(new bi.d2(4));
            view.setClipToOutline(true);
            a7.i(t6.f20872a7, view, this.I0);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -org.telegram.messenger.i0.L(6.0f);
        }
    }

    @Override
    public final void e1(u71 u71Var) {
        int i10;
        float f7;
        float f10;
        View view = this.f11311t2;
        ArrayList arrayList = this.I2;
        if (arrayList.size() == 1) {
            i10 = 94;
        } else {
            i10 = 83;
        }
        int i11 = i10;
        if (arrayList.size() == 1) {
            f7 = 28.0f;
        } else {
            f7 = 34.0f;
        }
        float f11 = f7;
        if (arrayList.size() == 1) {
            f10 = 9.0f;
        } else {
            f10 = 14.0f;
        }
        u71Var.addView(view, b6.k(0.0f, f11, 0.0f, f10, -1, i11));
    }

    @Override
    public final void j1(boolean z10) {
        String a02;
        this.G2[0].setTextSize(1, 20.0f);
        this.H2.setPadding(org.telegram.messenger.i0.L(30.0f), 0, org.telegram.messenger.i0.L(30.0f), 0);
        this.H2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        p80 p80Var = this.G2[0];
        ArrayList arrayList = this.I2;
        p80Var.setText(cd.J0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a02 = cd.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", cd.a0("GiftPremiumUsersThree", null, 2131749658, h20.j((TLRPC.User) arrayList.get(0), true), h20.j((TLRPC.User) arrayList.get(1), true), h20.j((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a02 = cd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749662, cd.a0("GiftPremiumUsersThree", null, 2131749658, h20.j((TLRPC.User) arrayList.get(0), true), h20.j((TLRPC.User) arrayList.get(1), true), h20.j((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a02 = cd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749662, cd.a0("GiftPremiumUsersTwo", null, 2131749657, h20.j((TLRPC.User) arrayList.get(0), true), h20.j((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a02 = cd.a0(null, null, 2131749662, cd.a0(null, null, 2131749664, h20.j((TLRPC.User) arrayList.get(0), true)));
        }
        this.H2.setText(org.telegram.messenger.i0.W2(a02));
        this.H2.append("\n");
        this.H2.append("\n");
        if (arrayList.size() == 1) {
            this.H2.append(org.telegram.messenger.i0.W2(cd.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749677, h20.j((TLRPC.User) arrayList.get(0), true))));
        } else {
            this.H2.append(org.telegram.messenger.i0.W2(cd.L0(2131749678, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override
    public final void k1() {
        this.X1 = 1;
        this.Y1 = 0;
        this.f11293b2 = 1;
        int size = this.P1.size();
        int i10 = 1 + size;
        this.f11294c2 = i10;
        this.X1 = size + 2;
        this.f11297f2 = i10;
    }
}
