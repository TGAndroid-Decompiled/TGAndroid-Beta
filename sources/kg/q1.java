package kg;

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
import bi.eb;
import c8.ha;
import di.s2;
import di.u5;
import fi.h7;
import fi.h9;
import hi.x3;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class q1 extends f2 implements ls {
    public static org.telegram.ui.ActionBar.u1 f17508f;
    public p41 f17509a;
    public final ArrayList f17510b;
    public f5 f17511c;
    public int d;
    public boolean f17512e;

    public q1() {
        super(null);
        this.f17510b = new ArrayList();
        this.f17512e = true;
    }

    public static void Z(q1 q1Var, int i7, ArrayList arrayList) {
        if (i7 == q1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((w31) arrayList.get(i10)).G instanceof s1) {
                    ((s1) ((w31) arrayList.get(i10)).G).f17531c = i10;
                }
            }
            t1 f10 = t1.f(q1Var.currentAccount);
            ArrayList arrayList2 = f10.f17545b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = com.google.android.recaptcha.internal.a.f(((s1) arrayList2.get(i11)).f17529a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.x(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((s1) arrayList2.get(i12)).f17529a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = com.google.android.recaptcha.internal.a.f(((s1) arrayList2.get(i13)).f17529a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f17544a).sendRequest(tL_messages_reorderQuickReplies, new u5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(q1 q1Var, ArrayList arrayList, k41 k41Var) {
        String M0 = hd.M0(2131752683, null);
        String M02 = hd.M0(2131752670, null);
        w31 w31Var = new w31(2);
        w31Var.f39830l = M0;
        w31Var.f39833o = M02;
        w31Var.f39831m = "RestrictedEmoji";
        w31Var.f39832n = "📝";
        arrayList.add(w31Var);
        k41Var.V();
        t1 f10 = t1.f(q1Var.currentAccount);
        ArrayList arrayList2 = f10.f17545b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (i10 == 0 && !"hello".equalsIgnoreCase(((s1) arrayList2.get(i12)).f17530b)) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i11 == 0 && !"away".equalsIgnoreCase(((s1) arrayList2.get(i12)).f17530b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < qp.s1(f10.f17544a).B5) {
            w31 c10 = w31.c(1, 2131232422, hd.M0(2131752682, null));
            c10.f39835q = true;
            arrayList.add(c10);
        }
        q1Var.d = k41Var.M();
        ArrayList arrayList3 = t1.f(q1Var.currentAccount).f17545b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            s1 s1Var = (s1) obj;
            w31 w31Var2 = new w31(16);
            w31Var2.G = s1Var;
            w31Var2.L(q1Var.f17510b.contains(Integer.valueOf(s1Var.f17529a)));
            arrayList.add(w31Var2);
        }
        k41Var.L();
        k41Var.U();
        arrayList.add(w31.C(hd.M0(2131752681, null)));
    }

    public static void b0(q1 q1Var, w31 w31Var, View view) {
        if (w31Var.d == 1) {
            i0(q1Var.getParentActivity(), q1Var.currentAccount, null, null, q1Var.getResourceProvider(), new ii.c(q1Var, 7));
        } else if (w31Var.f54440a == 16 && (w31Var.G instanceof s1)) {
            if (!q1Var.f17510b.isEmpty()) {
                q1Var.j0(w31Var, view);
                return;
            }
            s1 s1Var = (s1) w31Var.G;
            if (!s1Var.f17534g) {
                Bundle f10 = rf.b.f(5, "chatMode");
                f10.putLong("user_id", q1Var.getUserConfig().e());
                f10.putString("quick_reply", s1Var.f17530b);
                an anVar = new an(f10);
                anVar.Pb(s1Var.f17529a);
                q1Var.presentFragment(anVar);
            }
        }
    }

    public static void c0(q1 q1Var) {
        q1Var.f17510b.clear();
        org.telegram.messenger.g0.d0(q1Var.f17509a, new di.e(4));
        q1Var.simpleActionBar.r();
        q1Var.f17509a.z1(false);
    }

    public static int d0(q1 q1Var) {
        return q1Var.currentAccount;
    }

    public static int e0(q1 q1Var) {
        return q1Var.currentAccount;
    }

    public static f6 f0(q1 q1Var) {
        return q1Var.resourceProvider;
    }

    public static int g0(q1 q1Var) {
        return q1Var.currentAccount;
    }

    public static int h0(q1 q1Var) {
        return q1Var.currentAccount;
    }

    public static void i0(Activity activity, int i7, String str, s1 s1Var, f6 f6Var, c20 c20Var) {
        View view;
        boolean z9;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        String str2;
        int i11;
        ?? r11;
        f2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof rt0) && ((rt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        if (z9) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (s1Var == null && str == null) {
            i10 = 2131752659;
        } else {
            i10 = 2131752673;
        }
        String M0 = hd.M0(i10, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27292a;
        u1Var.R = M0;
        final x0 x0Var = new x0(activity, f6Var);
        ui.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        x0Var.setTextSize(1, 18.0f);
        if (s1Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = s1Var.f17530b;
        }
        x0Var.setText(str2);
        int i12 = k6.f27956j5;
        r6.V(x0Var, i12, f6Var);
        r6.m(x0Var, 34, k6.Li, f6Var);
        x0Var.setHintText(hd.M0(2131752661, null));
        x0Var.setSingleLine(true);
        x0Var.setFocusable(true);
        r6.G(x0Var, k6.f27977k6, k6.f27995l6, k6.f28069p7, f6Var);
        x0Var.setImeOptions(6);
        x0Var.setBackgroundDrawable(null);
        x0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        x0Var.setFilters(new InputFilter[]{new y0(1)});
        LinearLayout e10 = k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        r6.V(textView, i12, f6Var);
        textView.setTextSize(1, 16.0f);
        if (s1Var == null && str == null) {
            i11 = 2131752660;
        } else {
            i11 = 2131752674;
        }
        textView.setText(hd.M0(i11, null));
        frameLayout.addView(textView, ha.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        r6.V(textView2, k6.f28089q7, f6Var);
        jg.g.v(textView2, 1, 16.0f, null, 2131752662);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, ha.e(-1, -2, 83));
        s2 s2Var = new s2(r1, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new h9(s2Var, 28)};
        x0Var.addTextChangedListener(new h7(textView2, runnableArr, false, 1));
        e10.addView(frameLayout, ha.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(x0Var, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e10);
        u1Var.f28547a = org.telegram.messenger.g0.L(292.0f);
        x0Var.setOnEditorActionListener(new m1(x0Var, i7, s1Var, textView2, s2Var, c20Var, u1VarArr, view));
        alertDialog$Builder2.k(hd.M0(2131751355, null), new j1(x0Var, s2Var, i7, s1Var, textView2, c20Var));
        alertDialog$Builder2.h(hd.M0(2131752589, null), new x3(16));
        if (z9) {
            f17508f = u1Var;
            r11 = 0;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new q(1, view));
            f17508f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            x0 x0Var2 = x0Var;
                            x0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(x0Var2);
                            return;
                        default:
                            x0 x0Var3 = x0Var;
                            x0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(x0Var3);
                            return;
                    }
                }
            });
            f17508f.r(250L);
        } else {
            r11 = 0;
            u1Var.O = new ii.c(x0Var, 8);
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new eb(x0Var, 6));
            u1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            x0 x0Var2 = x0Var;
                            x0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(x0Var2);
                            return;
                        default:
                            x0 x0Var3 = x0Var;
                            x0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(x0Var3);
                            return;
                    }
                }
            });
            u1VarArr[0].show();
        }
        u1VarArr[r11].f28570j0 = r11;
        x0Var.setSelection(x0Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new y1(false));
        this.simpleActionBar.setTitle(hd.M0(2131752683, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 18));
        e5 l10 = this.simpleActionBar.l();
        f5 b10 = l10.b(1, 2131232116);
        this.f17511c = b10;
        b10.setContentDescription(hd.M0(2131751336, null));
        l10.b(2, 2131232108).setContentDescription(hd.M0(2131751599, null));
        l1 l1Var = new l1(context, null, 0);
        p41 p41Var = new p41(this, new v10(this) {
            public final q1 f17401b;

            {
                this.f17401b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        q1.Z(this.f17401b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        q1.a0(this.f17401b, (ArrayList) obj, (k41) obj2);
                        return;
                }
            }
        }, new h1(this), new h1(this));
        this.f17509a = p41Var;
        p41Var.r1();
        this.f17509a.setSectionsDrawBackground(true);
        p41 p41Var2 = this.f17509a;
        p41Var2.f36781f3.f35132r = false;
        p41Var2.E1(new v10(this) {
            public final q1 f17401b;

            {
                this.f17401b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        q1.Z(this.f17401b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        q1.a0(this.f17401b, (ArrayList) obj, (k41) obj2);
                        return;
                }
            }
        }, false);
        l1Var.addView(this.f17509a, ha.c(-1.0f, -1));
        this.fragmentView = l1Var;
        return l1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        k41 k41Var;
        if (i7 == qs.F1 && (p41Var = this.f17509a) != null && (k41Var = p41Var.f36781f3) != null) {
            k41Var.O(true);
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17509a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(w31 w31Var, View view) {
        boolean z9;
        s1 s1Var = (s1) w31Var.G;
        p1 p1Var = (p1) view;
        Integer valueOf = Integer.valueOf(s1Var.f17529a);
        ArrayList arrayList = this.f17510b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(s1Var.f17529a));
        } else {
            arrayList.add(Integer.valueOf(s1Var.f17529a));
        }
        this.f17509a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(s1Var.f17529a));
        w31Var.f39824e = contains;
        p1Var.d.a(contains, true);
        if (this.simpleActionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.r();
            } else {
                this.simpleActionBar.B();
            }
        }
        this.simpleActionBar.x(Math.max(1, arrayList.size()), true);
        boolean z10 = false;
        if (arrayList.size() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            s1 c10 = t1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !t1.g(c10.f17530b)) {
                z10 = true;
            }
            z9 = z10;
        }
        if (this.f17512e != z9) {
            this.f17512e = z9;
            this.f17511c.Y(z9, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.F1);
        t1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.F1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
