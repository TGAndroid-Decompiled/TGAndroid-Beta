package lg;

import ai.g5;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.ba;
import ei.u5;
import gi.j8;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.li;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class r1 extends d2 implements cs {
    public static org.telegram.ui.ActionBar.s1 f18449f;
    public l41 f18450a;
    public final ArrayList f18451b;
    public f5 f18452c;
    public int d;
    public boolean f18453e;

    public r1() {
        super(null);
        this.f18451b = new ArrayList();
        this.f18453e = true;
    }

    public static void Z(r1 r1Var, int i3, ArrayList arrayList) {
        if (i3 == r1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((r31) arrayList.get(i10)).G instanceof t1) {
                    ((t1) ((r31) arrayList.get(i10)).G).f18475c = i10;
                }
            }
            u1 f10 = u1.f(r1Var.currentAccount);
            ArrayList arrayList2 = f10.f18485b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = com.google.android.recaptcha.internal.a.f(((t1) arrayList2.get(i11)).f18473a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a3.u(26));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((t1) arrayList2.get(i12)).f18473a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = com.google.android.recaptcha.internal.a.f(((t1) arrayList2.get(i13)).f18473a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f18484a).sendRequest(tL_messages_reorderQuickReplies, new u5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(r1 r1Var, ArrayList arrayList, f41 f41Var) {
        String M0 = bd.M0(2131752683, null);
        String M02 = bd.M0(2131752670, null);
        r31 r31Var = new r31(2);
        r31Var.f37627l = M0;
        r31Var.f37630o = M02;
        r31Var.f37628m = "RestrictedEmoji";
        r31Var.f37629n = "📝";
        arrayList.add(r31Var);
        f41Var.V();
        u1 f10 = u1.f(r1Var.currentAccount);
        ArrayList arrayList2 = f10.f18485b;
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (i10 == 0 && !"hello".equalsIgnoreCase(((t1) arrayList2.get(i12)).f18474b)) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i11 == 0 && !"away".equalsIgnoreCase(((t1) arrayList2.get(i12)).f18474b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < hp.s1(f10.f18484a).B5) {
            r31 c2 = r31.c(1, 2131232422, bd.M0(2131752682, null));
            c2.f37632q = true;
            arrayList.add(c2);
        }
        r1Var.d = f41Var.M();
        ArrayList arrayList3 = u1.f(r1Var.currentAccount).f18485b;
        int size = arrayList3.size();
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
            t1 t1Var = (t1) obj;
            r31 r31Var2 = new r31(16);
            r31Var2.G = t1Var;
            r31Var2.L(r1Var.f18451b.contains(Integer.valueOf(t1Var.f18473a)));
            arrayList.add(r31Var2);
        }
        f41Var.L();
        f41Var.U();
        arrayList.add(r31.C(bd.M0(2131752681, null)));
    }

    public static void b0(r1 r1Var, r31 r31Var, View view) {
        if (r31Var.d == 1) {
            i0(r1Var.getParentActivity(), r1Var.currentAccount, null, null, r1Var.getResourceProvider(), new j8(r1Var, 10));
        } else if (r31Var.f54715a == 16 && (r31Var.G instanceof t1)) {
            if (!r1Var.f18451b.isEmpty()) {
                r1Var.j0(r31Var, view);
                return;
            }
            t1 t1Var = (t1) r31Var.G;
            if (!t1Var.f18478g) {
                Bundle k10 = org.telegram.ui.Cells.f1.k(5, "chatMode");
                k10.putLong("user_id", r1Var.getUserConfig().e());
                k10.putString("quick_reply", t1Var.f18474b);
                wm wmVar = new wm(k10);
                wmVar.Pb(t1Var.f18473a);
                r1Var.presentFragment(wmVar);
            }
        }
    }

    public static void c0(r1 r1Var) {
        r1Var.f18451b.clear();
        org.telegram.messenger.g0.d0(r1Var.f18450a, new ei.e(4));
        r1Var.simpleActionBar.r();
        r1Var.f18450a.z1(false);
    }

    public static int d0(r1 r1Var) {
        return r1Var.currentAccount;
    }

    public static int e0(r1 r1Var) {
        return r1Var.currentAccount;
    }

    public static e6 f0(r1 r1Var) {
        return r1Var.resourceProvider;
    }

    public static void i0(Activity activity, int i3, String str, t1 t1Var, e6 e6Var, u10 u10Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        String str2;
        int i11;
        ?? r11;
        d2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof qt0) && ((qt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (t1Var == null && str == null) {
            i10 = 2131752659;
        } else {
            i10 = 2131752673;
        }
        String M0 = bd.M0(i10, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.f27343a;
        s1Var.S = M0;
        final y0 y0Var = new y0(activity, e6Var);
        li.b0(i3).M(org.telegram.messenger.g0.G0(), true);
        y0Var.setTextSize(1, 18.0f);
        if (t1Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = t1Var.f18474b;
        }
        y0Var.setText(str2);
        int i12 = k6.f27988j5;
        r6.V(y0Var, i12, e6Var);
        r6.m(y0Var, 34, k6.Li, e6Var);
        y0Var.setHintText(bd.M0(2131752661, null));
        y0Var.setSingleLine(true);
        y0Var.setFocusable(true);
        r6.G(y0Var, k6.f28007k6, k6.f28026l6, k6.f28102p7, e6Var);
        y0Var.setImeOptions(6);
        y0Var.setBackgroundDrawable(null);
        y0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        y0Var.setFilters(new InputFilter[]{new z0(1)});
        LinearLayout e10 = k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        r6.V(textView, i12, e6Var);
        textView.setTextSize(1, 16.0f);
        if (t1Var == null && str == null) {
            i11 = 2131752660;
        } else {
            i11 = 2131752674;
        }
        textView.setText(bd.M0(i11, null));
        frameLayout.addView(textView, mf.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        r6.V(textView2, k6.f28122q7, e6Var);
        k2.p1.u(textView2, 1, 16.0f, null, 2131752662);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, mf.e(-1, -2, 83));
        ai.v1 v1Var = new ai.v1(r1, new ValueAnimator[1], textView2, textView, 4);
        Runnable[] runnableArr = {new n(v1Var, 5)};
        y0Var.addTextChangedListener(new ai.a0(textView2, runnableArr, false, 8));
        e10.addView(frameLayout, mf.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(y0Var, mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e10);
        s1Var.f28523a = org.telegram.messenger.g0.L(292.0f);
        y0Var.setOnEditorActionListener(new n1(y0Var, i3, t1Var, textView2, v1Var, u10Var, s1VarArr, view));
        alertDialog$Builder2.k(bd.M0(2131751355, null), new k1(y0Var, v1Var, i3, t1Var, textView2, u10Var));
        alertDialog$Builder2.h(bd.M0(2131752589, null), new l2.d(15));
        if (z10) {
            f18449f = s1Var;
            r11 = 0;
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new r(1, view));
            f18449f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            y0 y0Var2 = y0Var;
                            y0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(y0Var2);
                            return;
                        default:
                            y0 y0Var3 = y0Var;
                            y0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(y0Var3);
                            return;
                    }
                }
            });
            f18449f.r(250L);
        } else {
            r11 = 0;
            s1Var.P = new j8(y0Var, 11);
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new ba(y0Var, 6));
            s1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            y0 y0Var2 = y0Var;
                            y0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(y0Var2);
                            return;
                        default:
                            y0 y0Var3 = y0Var;
                            y0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(y0Var3);
                            return;
                    }
                }
            });
            s1VarArr[0].show();
        }
        s1VarArr[r11].f28548k0 = r11;
        y0Var.setSelection(y0Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setTitle(bd.M0(2131752683, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 19));
        e5 l10 = this.simpleActionBar.l();
        f5 b10 = l10.b(1, 2131232116);
        this.f18452c = b10;
        b10.setContentDescription(bd.M0(2131751336, null));
        l10.b(2, 2131232108).setContentDescription(bd.M0(2131751599, null));
        m1 m1Var = new m1(context, null, 0);
        l41 l41Var = new l41(this, new n10(this) {
            public final r1 f18343b;

            {
                this.f18343b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        r1.Z(this.f18343b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        r1.a0(this.f18343b, (ArrayList) obj, (f41) obj2);
                        return;
                }
            }
        }, new i1(this), new i1(this));
        this.f18450a = l41Var;
        l41Var.r1();
        this.f18450a.setSectionsDrawBackground(true);
        l41 l41Var2 = this.f18450a;
        l41Var2.f35594g3.f33698r = false;
        l41Var2.E1(new n10(this) {
            public final r1 f18343b;

            {
                this.f18343b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        r1.Z(this.f18343b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        r1.a0(this.f18343b, (ArrayList) obj, (f41) obj2);
                        return;
                }
            }
        }, false);
        m1Var.addView(this.f18450a, mf.c(-1.0f, -1));
        this.fragmentView = m1Var;
        return m1Var;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        l41 l41Var;
        f41 f41Var;
        if (i3 == hs.F1 && (l41Var = this.f18450a) != null && (f41Var = l41Var.f35594g3) != null) {
            f41Var.O(true);
        }
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f18450a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(r31 r31Var, View view) {
        boolean z10;
        t1 t1Var = (t1) r31Var.G;
        q1 q1Var = (q1) view;
        Integer valueOf = Integer.valueOf(t1Var.f18473a);
        ArrayList arrayList = this.f18451b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(t1Var.f18473a));
        } else {
            arrayList.add(Integer.valueOf(t1Var.f18473a));
        }
        this.f18450a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(t1Var.f18473a));
        r31Var.f37621e = contains;
        q1Var.d.a(contains, true);
        if (this.simpleActionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.r();
            } else {
                this.simpleActionBar.B();
            }
        }
        this.simpleActionBar.x(Math.max(1, arrayList.size()), true);
        boolean z11 = false;
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            t1 c2 = u1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c2 != null && !u1.g(c2.f18474b)) {
                z11 = true;
            }
            z10 = z11;
        }
        if (this.f18453e != z10) {
            this.f18453e = z10;
            this.f18452c.Y(z10, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.F1);
        u1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.F1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
