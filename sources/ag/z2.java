package ag;

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
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import w7.b6;
public final class z2 extends org.telegram.ui.ActionBar.k2 implements vs {
    public static org.telegram.ui.ActionBar.x1 f819f;
    public v51 f820a;
    public final ArrayList f821b;
    public p5 f822c;
    public int d;
    public boolean e;

    public z2() {
        super(null);
        this.f821b = new ArrayList();
        this.e = true;
    }

    public static void Z(z2 z2Var, int i10, ArrayList arrayList) {
        if (i10 == z2Var.d) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((b51) arrayList.get(i11)).G instanceof h3) {
                    ((h3) ((b51) arrayList.get(i11)).G).f553c = i11;
                }
            }
            i3 f7 = i3.f(z2Var.currentAccount);
            ArrayList arrayList2 = f7.f567b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = c3.i0.j(((h3) arrayList2.get(i12)).f551a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(2));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((h3) arrayList2.get(i13)).f551a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = c3.i0.j(((h3) arrayList2.get(i14)).f551a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f566a).sendRequest(tL_messages_reorderQuickReplies, new c3(0));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void a0(z2 z2Var, ArrayList arrayList, q51 q51Var) {
        String L0 = dd.L0(2131752683, null);
        String L02 = dd.L0(2131752670, null);
        b51 b51Var = new b51(2);
        b51Var.f24643l = L0;
        b51Var.f24646o = L02;
        b51Var.f24644m = "RestrictedEmoji";
        b51Var.f24645n = "📝";
        arrayList.add(b51Var);
        q51Var.V();
        i3 f7 = i3.f(z2Var.currentAccount);
        ArrayList arrayList2 = f7.f567b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((h3) arrayList2.get(i13)).f552b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((h3) arrayList2.get(i13)).f552b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < wp.r1(f7.f566a).C5) {
            b51 c10 = b51.c(1, 2131232421, dd.L0(2131752682, null));
            c10.f24648q = true;
            arrayList.add(c10);
        }
        z2Var.d = q51Var.M();
        ArrayList arrayList3 = i3.f(z2Var.currentAccount).f567b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            h3 h3Var = (h3) obj;
            b51 b51Var2 = new b51(16);
            b51Var2.G = h3Var;
            b51Var2.L(z2Var.f821b.contains(Integer.valueOf(h3Var.f551a)));
            arrayList.add(b51Var2);
        }
        q51Var.L();
        q51Var.U();
        arrayList.add(b51.C(dd.L0(2131752681, null)));
    }

    public static void b0(z2 z2Var, b51 b51Var, View view) {
        if (b51Var.d == 1) {
            i0(z2Var.getParentActivity(), z2Var.currentAccount, null, null, z2Var.getResourceProvider(), new l(z2Var, 4));
        } else if (b51Var.f7681a == 16 && (b51Var.G instanceof h3)) {
            if (!z2Var.f821b.isEmpty()) {
                z2Var.j0(b51Var, view);
                return;
            }
            h3 h3Var = (h3) b51Var.G;
            if (!h3Var.f555g) {
                Bundle i10 = org.telegram.ui.Cells.f1.i(5, "chatMode");
                i10.putLong("user_id", z2Var.getUserConfig().e());
                i10.putString("quick_reply", h3Var.f552b);
                un unVar = new un(i10);
                unVar.Kb(h3Var.f551a);
                z2Var.presentFragment(unVar);
            }
        }
    }

    public static void c0(z2 z2Var) {
        z2Var.f821b.clear();
        org.telegram.messenger.i0.d0(z2Var.f820a, new z0(1));
        z2Var.simpleActionBar.r();
        z2Var.f820a.z1(false);
    }

    public static int d0(z2 z2Var) {
        return z2Var.currentAccount;
    }

    public static int e0(z2 z2Var) {
        return z2Var.currentAccount;
    }

    public static p6 f0(z2 z2Var) {
        return z2Var.resourceProvider;
    }

    public static void i0(Activity activity, int i10, String str, h3 h3Var, p6 p6Var, r20 r20Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        String str2;
        int i12;
        ?? r92;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.i0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof vu0) && ((vu0) Q.getFragmentView()).Q() > org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, p6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (h3Var == null && str == null) {
            i11 = 2131752659;
        } else {
            i11 = 2131752673;
        }
        String L0 = dd.L0(i11, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.f20135a;
        x1Var.R = L0;
        final a2 a2Var = new a2(activity, p6Var);
        vi.b0(i10).M(org.telegram.messenger.i0.G0(), true);
        a2Var.setTextSize(1, 18.0f);
        if (h3Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = h3Var.f552b;
        }
        a2Var.setText(str2);
        int i13 = t6.f21038j5;
        a7.V(a2Var, i13, p6Var);
        a7.m(a2Var, 34, t6.Li, p6Var);
        a2Var.setHintText(dd.L0(2131752661, null));
        a2Var.setSingleLine(true);
        a2Var.setFocusable(true);
        a7.G(a2Var, t6.f21059k6, t6.f21077l6, t6.f21154p7, p6Var);
        a2Var.setImeOptions(6);
        a2Var.setBackgroundDrawable(null);
        a2Var.setPadding(0, 0, org.telegram.messenger.i0.L(42.0f), 0);
        a2Var.setFilters(new InputFilter[]{new b2(1)});
        LinearLayout e = m5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        a7.V(textView, i13, p6Var);
        textView.setTextSize(1, 16.0f);
        if (h3Var == null && str == null) {
            i12 = 2131752660;
        } else {
            i12 = 2131752674;
        }
        textView.setText(dd.L0(i12, null));
        frameLayout.addView(textView, b6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        a7.V(textView2, t6.f21171q7, p6Var);
        sc.e.u(textView2, 1, 16.0f, null, 2131752662);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, b6.e(-1, -2, 83));
        m2 m2Var = new m2(r1, new ValueAnimator[1], textView2, textView, 0);
        Runnable[] runnableArr = {new a3.d(m2Var, 9)};
        a2Var.addTextChangedListener(new u2(0, textView2, runnableArr));
        e.addView(frameLayout, b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(a2Var, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e);
        x1Var.f21469a = org.telegram.messenger.i0.L(292.0f);
        a2Var.setOnEditorActionListener(new v2(a2Var, i10, h3Var, textView2, m2Var, r20Var, x1VarArr, view));
        alertDialog$Builder2.k(dd.L0(2131751355, null), new q2(a2Var, m2Var, i10, h3Var, textView2, r20Var));
        alertDialog$Builder2.h(dd.L0(2131752589, null), new aa.a(7));
        if (z10) {
            f819f = x1Var;
            r92 = 0;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new c0(1, view));
            f819f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            a2 a2Var2 = a2Var;
                            a2Var2.requestFocus();
                            org.telegram.messenger.i0.J3(a2Var2);
                            return;
                        default:
                            a2 a2Var3 = a2Var;
                            a2Var3.requestFocus();
                            org.telegram.messenger.i0.J3(a2Var3);
                            return;
                    }
                }
            });
            f819f.r(250L);
        } else {
            r92 = 0;
            x1Var.O = new l(a2Var, 5);
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new x(a2Var, 1));
            x1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            a2 a2Var2 = a2Var;
                            a2Var2.requestFocus();
                            org.telegram.messenger.i0.J3(a2Var2);
                            return;
                        default:
                            a2 a2Var3 = a2Var;
                            a2Var3.requestFocus();
                            org.telegram.messenger.i0.J3(a2Var3);
                            return;
                    }
                }
            });
            x1VarArr[0].show();
        }
        x1VarArr[r92].f21491j0 = r92;
        a2Var.setSelection(a2Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setTitle(dd.L0(2131752683, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 7));
        o5 l4 = this.simpleActionBar.l();
        p5 b10 = l4.b(1, 2131232115);
        this.f822c = b10;
        b10.setContentDescription(dd.L0(2131751336, null));
        l4.b(2, 2131232107).setContentDescription(dd.L0(2131751599, null));
        t2 t2Var = new t2(context, null, 0);
        v51 v51Var = new v51(this, new k20(this) {
            public final z2 f667b;

            {
                this.f667b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z2.Z(this.f667b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        z2.a0(this.f667b, (ArrayList) obj, (q51) obj2);
                        return;
                }
            }
        }, new n2(this), new n2(this));
        this.f820a = v51Var;
        v51Var.r1();
        this.f820a.setSectionsDrawBackground(true);
        v51 v51Var2 = this.f820a;
        v51Var2.f31183f3.f29638r = false;
        v51Var2.E1(new k20(this) {
            public final z2 f667b;

            {
                this.f667b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z2.Z(this.f667b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        z2.a0(this.f667b, (ArrayList) obj, (q51) obj2);
                        return;
                }
            }
        }, false);
        t2Var.addView(this.f820a, b6.c(-1.0f, -1));
        this.fragmentView = t2Var;
        return t2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        q51 q51Var;
        if (i10 == at.F1 && (v51Var = this.f820a) != null && (q51Var = v51Var.f31183f3) != null) {
            q51Var.O(true);
        }
    }

    @Override
    public final uk0 getListViewForSimpleGlass() {
        return this.f820a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(b51 b51Var, View view) {
        boolean z10;
        h3 h3Var = (h3) b51Var.G;
        y2 y2Var = (y2) view;
        Integer valueOf = Integer.valueOf(h3Var.f551a);
        ArrayList arrayList = this.f821b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(h3Var.f551a));
        } else {
            arrayList.add(Integer.valueOf(h3Var.f551a));
        }
        this.f820a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(h3Var.f551a));
        b51Var.e = contains;
        y2Var.d.a(contains, true);
        if (this.simpleActionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.r();
            } else {
                this.simpleActionBar.C();
            }
        }
        this.simpleActionBar.y(Math.max(1, arrayList.size()), true);
        boolean z11 = false;
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h3 c10 = i3.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !i3.g(c10.f552b)) {
                z11 = true;
            }
            z10 = z11;
        }
        if (this.e != z10) {
            this.e = z10;
            this.f822c.Y(z10, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.F1);
        i3.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.F1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
