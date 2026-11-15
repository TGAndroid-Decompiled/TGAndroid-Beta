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
import bi.x4;
import c8.ja;
import di.q9;
import fi.m5;
import hi.g7;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class r1 extends e2 implements is {
    public static org.telegram.ui.ActionBar.t1 f18081f;
    public u41 f18082a;
    public final ArrayList f18083b;
    public d5 f18084c;
    public int d;
    public boolean f18085e;

    public r1() {
        super(null);
        this.f18083b = new ArrayList();
        this.f18085e = true;
    }

    public static void Z(r1 r1Var, int i7, ArrayList arrayList) {
        if (i7 == r1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((b41) arrayList.get(i10)).G instanceof u1) {
                    ((u1) ((b41) arrayList.get(i10)).G).f18115c = i10;
                }
            }
            v1 f10 = v1.f(r1Var.currentAccount);
            ArrayList arrayList2 = f10.f18124b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = com.google.android.gms.internal.vision.e2.f(((u1) arrayList2.get(i11)).f18113a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.w(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((u1) arrayList2.get(i12)).f18113a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = com.google.android.gms.internal.vision.e2.f(((u1) arrayList2.get(i13)).f18113a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f18123a).sendRequest(tL_messages_reorderQuickReplies, new m5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(r1 r1Var, ArrayList arrayList, p41 p41Var) {
        String M0 = hd.M0(2131752683, null);
        String M02 = hd.M0(2131752670, null);
        b41 b41Var = new b41(2);
        b41Var.f33184l = M0;
        b41Var.f33187o = M02;
        b41Var.f33185m = "RestrictedEmoji";
        b41Var.f33186n = "📝";
        arrayList.add(b41Var);
        p41Var.V();
        v1 f10 = v1.f(r1Var.currentAccount);
        ArrayList arrayList2 = f10.f18124b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (i10 == 0 && !"hello".equalsIgnoreCase(((u1) arrayList2.get(i12)).f18114b)) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i11 == 0 && !"away".equalsIgnoreCase(((u1) arrayList2.get(i12)).f18114b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < np.s1(f10.f18123a).C5) {
            b41 c10 = b41.c(1, 2131232423, hd.M0(2131752682, null));
            c10.f33189q = true;
            arrayList.add(c10);
        }
        r1Var.d = p41Var.M();
        ArrayList arrayList3 = v1.f(r1Var.currentAccount).f18124b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            u1 u1Var = (u1) obj;
            b41 b41Var2 = new b41(16);
            b41Var2.G = u1Var;
            b41Var2.L(r1Var.f18083b.contains(Integer.valueOf(u1Var.f18113a)));
            arrayList.add(b41Var2);
        }
        p41Var.L();
        p41Var.U();
        arrayList.add(b41.C(hd.M0(2131752681, null)));
    }

    public static void b0(r1 r1Var, b41 b41Var, View view) {
        if (b41Var.d == 1) {
            i0(r1Var.getParentActivity(), r1Var.currentAccount, null, null, r1Var.getResourceProvider(), new g7(r1Var, 10));
        } else if (b41Var.f56015a == 16 && (b41Var.G instanceof u1)) {
            if (!r1Var.f18083b.isEmpty()) {
                r1Var.j0(b41Var, view);
                return;
            }
            u1 u1Var = (u1) b41Var.G;
            if (!u1Var.f18118g) {
                Bundle f10 = r.b.f(5, "chatMode");
                f10.putLong("user_id", r1Var.getUserConfig().e());
                f10.putString("quick_reply", u1Var.f18114b);
                an anVar = new an(f10);
                anVar.Tb(u1Var.f18113a);
                r1Var.presentFragment(anVar);
            }
        }
    }

    public static void c0(r1 r1Var) {
        r1Var.f18083b.clear();
        org.telegram.messenger.g0.d0(r1Var.f18082a, new fi.e(4));
        r1Var.simpleActionBar.u();
        r1Var.f18082a.z1(false);
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

    public static int g0(r1 r1Var) {
        return r1Var.currentAccount;
    }

    public static void i0(Activity activity, int i7, String str, u1 u1Var, e6 e6Var, z10 z10Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        String str2;
        int i11;
        ?? r10;
        e2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof st0) && ((st0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (u1Var == null && str == null) {
            i10 = 2131752659;
        } else {
            i10 = 2131752673;
        }
        String M0 = hd.M0(i10, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28392a;
        t1Var.S = M0;
        final x0 x0Var = new x0(activity, e6Var);
        si.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        x0Var.setTextSize(1, 18.0f);
        if (u1Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = u1Var.f18114b;
        }
        x0Var.setText(str2);
        int i12 = j6.f28957j5;
        q6.U(x0Var, i12, e6Var);
        q6.l(x0Var, 34, j6.Oi, e6Var);
        x0Var.setHintText(hd.M0(2131752661, null));
        x0Var.setSingleLine(true);
        x0Var.setFocusable(true);
        q6.F(x0Var, j6.f28978k6, j6.f28996l6, j6.f29070p7, e6Var);
        x0Var.setImeOptions(6);
        x0Var.setBackgroundDrawable(null);
        x0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        x0Var.setFilters(new InputFilter[]{new y0(1)});
        LinearLayout e10 = k5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        q6.U(textView, i12, e6Var);
        textView.setTextSize(1, 16.0f);
        if (u1Var == null && str == null) {
            i11 = 2131752660;
        } else {
            i11 = 2131752674;
        }
        textView.setText(hd.M0(i11, null));
        frameLayout.addView(textView, ja.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        q6.U(textView2, j6.f29090q7, e6Var);
        i5.c.w(textView2, 1, 16.0f, null, 2131752662);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, ja.e(-1, -2, 83));
        bi.o1 o1Var = new bi.o1(r1, new ValueAnimator[1], textView2, textView, 4);
        Runnable[] runnableArr = {new j1(o1Var, 0)};
        x0Var.addTextChangedListener(new bi.v(textView2, runnableArr, false, 8));
        e10.addView(frameLayout, ja.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e10.addView(x0Var, ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e10);
        t1Var.f29614a = org.telegram.messenger.g0.L(292.0f);
        x0Var.setOnEditorActionListener(new n1(x0Var, i7, u1Var, textView2, o1Var, z10Var, t1VarArr, view));
        alertDialog$Builder2.k(hd.M0(2131751354, null), new k1(x0Var, o1Var, i7, u1Var, textView2, z10Var));
        alertDialog$Builder2.h(hd.M0(2131752589, null), new i0.b(12));
        if (z10) {
            f18081f = t1Var;
            r10 = 0;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(1, view));
            f18081f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            x0 x0Var2 = x0Var;
                            x0Var2.requestFocus();
                            org.telegram.messenger.g0.J3(x0Var2);
                            return;
                        default:
                            x0 x0Var3 = x0Var;
                            x0Var3.requestFocus();
                            org.telegram.messenger.g0.J3(x0Var3);
                            return;
                    }
                }
            });
            f18081f.r(250L);
        } else {
            r10 = 0;
            t1Var.P = new g7(x0Var, 11);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new q9(x0Var, 6));
            t1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            x0 x0Var2 = x0Var;
                            x0Var2.requestFocus();
                            org.telegram.messenger.g0.J3(x0Var2);
                            return;
                        default:
                            x0 x0Var3 = x0Var;
                            x0Var3.requestFocus();
                            org.telegram.messenger.g0.J3(x0Var3);
                            return;
                    }
                }
            });
            t1VarArr[0].show();
        }
        t1VarArr[r10].f29639k0 = r10;
        x0Var.setSelection(x0Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(hd.M0(2131752683, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 11));
        c5 o4 = this.simpleActionBar.o();
        d5 b10 = o4.b(1, 2131232117);
        this.f18084c = b10;
        b10.setContentDescription(hd.M0(2131751335, null));
        o4.b(2, 2131232109).setContentDescription(hd.M0(2131751598, null));
        m1 m1Var = new m1(context, null, 0);
        u41 u41Var = new u41(this, new s10(this) {
            public final r1 f17967b;

            {
                this.f17967b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        r1.Z(this.f17967b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        r1.a0(this.f17967b, (ArrayList) obj, (p41) obj2);
                        return;
                }
            }
        }, new h1(this), new h1(this));
        this.f18082a = u41Var;
        u41Var.r1();
        this.f18082a.setSectionsDrawBackground(true);
        u41 u41Var2 = this.f18082a;
        u41Var2.f39892g3.f38199r = false;
        u41Var2.E1(new s10(this) {
            public final r1 f17967b;

            {
                this.f17967b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        r1.Z(this.f17967b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        r1.a0(this.f17967b, (ArrayList) obj, (p41) obj2);
                        return;
                }
            }
        }, false);
        m1Var.addView(this.f18082a, ja.c(-1.0f, -1));
        this.fragmentView = m1Var;
        return m1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        u41 u41Var;
        p41 p41Var;
        if (i7 == ns.F1 && (u41Var = this.f18082a) != null && (p41Var = u41Var.f39892g3) != null) {
            p41Var.O(true);
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f18082a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(b41 b41Var, View view) {
        boolean z10;
        u1 u1Var = (u1) b41Var.G;
        q1 q1Var = (q1) view;
        Integer valueOf = Integer.valueOf(u1Var.f18113a);
        ArrayList arrayList = this.f18083b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(u1Var.f18113a));
        } else {
            arrayList.add(Integer.valueOf(u1Var.f18113a));
        }
        this.f18082a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(u1Var.f18113a));
        b41Var.f33178e = contains;
        q1Var.d.a(contains, true);
        if (this.simpleActionBar.v() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.u();
            } else {
                this.simpleActionBar.F();
            }
        }
        this.simpleActionBar.A(Math.max(1, arrayList.size()), true);
        boolean z11 = false;
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            u1 c10 = v1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !v1.g(c10.f18114b)) {
                z11 = true;
            }
            z10 = z11;
        }
        if (this.f18085e != z10) {
            this.f18085e = z10;
            this.f18084c.Z(z10, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.F1);
        v1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.F1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
