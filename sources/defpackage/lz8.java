package defpackage;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class lz8 extends d implements jm7 {
    public static he f;
    public q7c a;
    public final ArrayList b;
    public zja c;
    public int d;
    public boolean e;

    public lz8() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static int Z(lz8 lz8Var) {
        return lz8Var.currentAccount;
    }

    public static int a0(lz8 lz8Var) {
        return lz8Var.currentAccount;
    }

    public static ylb b0(lz8 lz8Var) {
        return lz8Var.resourceProvider;
    }

    public static void h0(Activity activity, int i, String str, oz8 oz8Var, ylb ylbVar, qac qacVar) {
        View view;
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        int i2;
        String str2;
        int i3;
        ?? r10;
        d Q = LaunchActivity.Q();
        Activity W = gm.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof ela) && ((ela) Q.getFragmentView()).Q() > gm.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        he[] heVarArr = new he[1];
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, activity);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (oz8Var == null && str == null) {
            i2 = 2131752612;
        } else {
            i2 = 2131752626;
        }
        String M0 = jb6.M0(i2, null);
        he heVar = alertDialog$Builder2.a;
        heVar.S = M0;
        final a52 a52Var = new a52(activity, ylbVar);
        hs6.d0(i).O(gm.F0(), true);
        a52Var.setTextSize(1, 18.0f);
        if (oz8Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = oz8Var.b;
        }
        a52Var.setText(str2);
        int i4 = cmb.i5;
        anb.X(a52Var, i4, ylbVar);
        anb.l(a52Var, 34, cmb.Ni, ylbVar);
        a52Var.setHintText(jb6.M0(2131752614, null));
        a52Var.setSingleLine(true);
        a52Var.setFocusable(true);
        anb.F(a52Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        a52Var.setImeOptions(6);
        a52Var.setBackgroundDrawable(null);
        a52Var.setPadding(0, 0, gm.L(42.0f), 0);
        a52Var.setFilters(new InputFilter[]{new ec6((byte) 1)});
        LinearLayout l = td4.l(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        anb.X(textView, i4, ylbVar);
        textView.setTextSize(1, 16.0f);
        if (oz8Var == null && str == null) {
            i3 = 2131752613;
        } else {
            i3 = 2131752627;
        }
        textView.setText(jb6.M0(i3, null));
        frameLayout.addView(textView, qoe.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        anb.X(textView2, cmb.p7, ylbVar);
        ts2.q(16.0f, 1, 2131752615, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, qoe.e(-1, -2, 83));
        jv0 jv0Var = new jv0(r1, new ValueAnimator[1], textView2, textView, (byte) 16);
        Runnable[] runnableArr = {new pp8(jv0Var, (byte) 13)};
        a52Var.addTextChangedListener(new qz(textView2, runnableArr, false, (byte) 10));
        l.addView(frameLayout, qoe.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        l.addView(a52Var, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(l);
        heVar.a = gm.L(292.0f);
        a52Var.setOnEditorActionListener(new iz8(a52Var, i, oz8Var, textView2, jv0Var, qacVar, heVarArr, view));
        alertDialog$Builder2.j(jb6.M0(2131751291, null), new xz5(a52Var, jv0Var, i, oz8Var, textView2, qacVar));
        alertDialog$Builder2.g(jb6.M0(2131752542, null), new i98((byte) 15));
        if (z) {
            f = heVar;
            r10 = 0;
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new i51(view, (byte) 2));
            f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    a52 a52Var2 = a52Var;
                    switch (b) {
                        case 0:
                            a52Var2.requestFocus();
                            gm.E3(a52Var2);
                            return;
                        default:
                            a52Var2.requestFocus();
                            gm.E3(a52Var2);
                            return;
                    }
                }
            });
            f.q(250L);
        } else {
            r10 = 0;
            heVar.P = new ci7(a52Var, (byte) 25);
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new qj8(a52Var, (byte) 3));
            heVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    a52 a52Var2 = a52Var;
                    switch (b) {
                        case 0:
                            a52Var2.requestFocus();
                            gm.E3(a52Var2);
                            return;
                        default:
                            a52Var2.requestFocus();
                            gm.E3(a52Var2);
                            return;
                    }
                }
            });
            heVarArr[0].show();
        }
        heVarArr[r10].k0 = r10;
        a52Var.setSelection(a52Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setTitle(jb6.M0(2131752636, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 6));
        yja q = this.simpleActionBar.q();
        zja a = q.a(1, 2131232122);
        this.c = a;
        a.setContentDescription(jb6.M0(2131751272, null));
        q.a(2, 2131232114).setContentDescription(jb6.M0(2131751535, null));
        p84 p84Var = new p84(context, null, (byte) 2);
        q7c q7cVar = new q7c(this, new jac(this) {
            public final lz8 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                byte b = r2;
                lz8 lz8Var = this.b;
                switch (b) {
                    case 0:
                        lz8Var.j0(((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        lz8Var.f0((ArrayList) obj, (l7c) obj2);
                        return;
                }
            }
        }, new fz8(this), new fz8(this));
        this.a = q7cVar;
        q7cVar.r1();
        this.a.setSectionsDrawBackground(true);
        q7c q7cVar2 = this.a;
        q7cVar2.g3.r = false;
        q7cVar2.E1(new jac(this) {
            public final lz8 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                byte b = r2;
                lz8 lz8Var = this.b;
                switch (b) {
                    case 0:
                        lz8Var.j0(((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        lz8Var.f0((ArrayList) obj, (l7c) obj2);
                        return;
                }
            }
        }, false);
        p84Var.addView(this.a, qoe.c(-1.0f, -1));
        this.fragmentView = p84Var;
        return p84Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q7c q7cVar;
        l7c l7cVar;
        if (i == nm7.F1 && (q7cVar = this.a) != null && (l7cVar = q7cVar.g3) != null) {
            l7cVar.O(true);
        }
    }

    public final void e0() {
        this.b.clear();
        gm.d0(this.a, new bn0((byte) 23));
        this.simpleActionBar.w();
        this.a.z1(false);
    }

    public final void f0(ArrayList arrayList, l7c l7cVar) {
        String M0 = jb6.M0(2131752636, null);
        String M02 = jb6.M0(2131752623, null);
        c6c c6cVar = new c6c(2);
        c6cVar.m = M0;
        c6cVar.p = M02;
        c6cVar.n = "RestrictedEmoji";
        c6cVar.o = "📝";
        arrayList.add(c6cVar);
        l7cVar.V();
        pz8 f2 = pz8.f(this.currentAccount);
        ArrayList arrayList2 = f2.b;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (i2 == 0 && !"hello".equalsIgnoreCase(((oz8) arrayList2.get(i4)).b)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i3 == 0 && !"away".equalsIgnoreCase(((oz8) arrayList2.get(i4)).b)) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i2 != 0 && i3 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i2 ^ 1) + (i3 ^ 1) < oc7.r1(f2.a).l4.a2.f()) {
            c6c c = c6c.c(1, 2131232428, jb6.M0(2131752635, null));
            c.r = true;
            arrayList.add(c);
        }
        this.d = l7cVar.M();
        ArrayList arrayList3 = pz8.f(this.currentAccount).b;
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            oz8 oz8Var = (oz8) obj;
            c6c c6cVar2 = new c6c(16);
            c6cVar2.H = oz8Var;
            c6cVar2.L(this.b.contains(Integer.valueOf(oz8Var.a)));
            arrayList.add(c6cVar2);
        }
        l7cVar.L();
        l7cVar.U();
        arrayList.add(c6c.C(jb6.M0(2131752634, null)));
    }

    public final void g0(c6c c6cVar, View view) {
        if (c6cVar.d == 1) {
            h0(getParentActivity(), this.currentAccount, null, null, getResourceProvider(), new ci7(this, (byte) 24));
        } else if (c6cVar.a == 16 && (c6cVar.H instanceof oz8)) {
            if (!this.b.isEmpty()) {
                i0(c6cVar, view);
                return;
            }
            oz8 oz8Var = (oz8) c6cVar.H;
            if (!oz8Var.g) {
                Bundle j = kt6.j(5, "chatMode");
                j.putLong("user_id", getUserConfig().e());
                j.putString("quick_reply", oz8Var.b);
                yv1 yv1Var = new yv1(j);
                yv1Var.Lb(oz8Var.a);
                presentFragment(yv1Var);
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void i0(c6c c6cVar, View view) {
        boolean z;
        oz8 oz8Var = (oz8) c6cVar.H;
        kz8 kz8Var = (kz8) view;
        Integer valueOf = Integer.valueOf(oz8Var.a);
        ArrayList arrayList = this.b;
        boolean contains = arrayList.contains(valueOf);
        int i = oz8Var.a;
        if (contains) {
            arrayList.remove(Integer.valueOf(i));
        } else {
            arrayList.add(Integer.valueOf(i));
        }
        this.a.z1(!arrayList.isEmpty());
        boolean contains2 = arrayList.contains(Integer.valueOf(oz8Var.a));
        c6cVar.e = contains2;
        kz8Var.d.a(contains2, true);
        if (this.simpleActionBar.x() == arrayList.isEmpty()) {
            boolean isEmpty = arrayList.isEmpty();
            rja rjaVar = this.simpleActionBar;
            if (isEmpty) {
                rjaVar.w();
            } else {
                rjaVar.J();
            }
        }
        this.simpleActionBar.F(Math.max(1, arrayList.size()), true);
        boolean z2 = false;
        if (arrayList.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            oz8 c = pz8.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c != null && !pz8.g(c.b)) {
                z2 = true;
            }
            z = z2;
        }
        if (this.e != z) {
            this.e = z;
            this.c.Y(z, true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i, ArrayList arrayList) {
        if (i == this.d) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((c6c) arrayList.get(i2)).H instanceof oz8) {
                    ((oz8) ((c6c) arrayList.get(i2)).H).c = i2;
                }
            }
            pz8 f2 = pz8.f(this.currentAccount);
            ArrayList arrayList2 = f2.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < arrayList2.size(); i3 = td4.g(((oz8) arrayList2.get(i3)).a, i3, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new qx7((byte) 10));
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (((oz8) arrayList2.get(i4)).a != ((Integer) arrayList3.get(i4)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i5 = 0; i5 < arrayList2.size(); i5 = td4.g(((oz8) arrayList2.get(i5)).a, i5, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f2.a).sendRequest(tL_messages_reorderQuickReplies, new nf2((byte) 5));
                    f2.l();
                    return;
                }
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.F1);
        pz8.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.F1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
