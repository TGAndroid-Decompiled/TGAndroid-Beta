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
import bi.o2;
import c8.na;
import com.google.android.gms.internal.vision.e2;
import di.u9;
import fi.k5;
import hi.f9;
import hi.t6;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.f3;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class t1 extends g2 implements gs {
    public static org.telegram.ui.ActionBar.t1 f18484f;
    public h51 f18485a;
    public final ArrayList f18486b;
    public g5 f18487c;
    public int d;
    public boolean f18488e;

    public t1() {
        super(null);
        this.f18486b = new ArrayList();
        this.f18488e = true;
    }

    public static void Z(t1 t1Var, int i7, ArrayList arrayList) {
        if (i7 == t1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((o41) arrayList.get(i10)).H instanceof v1) {
                    ((v1) ((o41) arrayList.get(i10)).H).f18507c = i10;
                }
            }
            w1 f10 = w1.f(t1Var.currentAccount);
            ArrayList arrayList2 = f10.f18519b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = e2.f(((v1) arrayList2.get(i11)).f18505a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.w(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((v1) arrayList2.get(i12)).f18505a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = e2.f(((v1) arrayList2.get(i13)).f18505a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f18518a).sendRequest(tL_messages_reorderQuickReplies, new k5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(t1 t1Var, ArrayList arrayList, c51 c51Var) {
        String N0 = hd.N0(2131752671, null);
        String N02 = hd.N0(2131752658, null);
        o41 o41Var = new o41(2);
        o41Var.f38058m = N0;
        o41Var.f38061p = N02;
        o41Var.f38059n = "RestrictedEmoji";
        o41Var.f38060o = "📝";
        arrayList.add(o41Var);
        c51Var.V();
        w1 f10 = w1.f(t1Var.currentAccount);
        ArrayList arrayList2 = f10.f18519b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (i10 == 0 && !"hello".equalsIgnoreCase(((v1) arrayList2.get(i12)).f18506b)) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i11 == 0 && !"away".equalsIgnoreCase(((v1) arrayList2.get(i12)).f18506b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < np.u1(f10.f18518a).E5) {
            o41 c10 = o41.c(1, 2131232424, hd.N0(2131752670, null));
            c10.f38063r = true;
            arrayList.add(c10);
        }
        t1Var.d = c51Var.M();
        ArrayList arrayList3 = w1.f(t1Var.currentAccount).f18519b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            v1 v1Var = (v1) obj;
            o41 o41Var2 = new o41(16);
            o41Var2.H = v1Var;
            o41Var2.L(t1Var.f18486b.contains(Integer.valueOf(v1Var.f18505a)));
            arrayList.add(o41Var2);
        }
        c51Var.L();
        c51Var.U();
        arrayList.add(o41.C(hd.N0(2131752669, null)));
    }

    public static void b0(t1 t1Var, o41 o41Var, View view) {
        if (o41Var.d == 1) {
            i0(t1Var.getParentActivity(), t1Var.currentAccount, null, null, t1Var.getResourceProvider(), new t6(t1Var, 11));
        } else if (o41Var.f56599a == 16 && (o41Var.H instanceof v1)) {
            if (!t1Var.f18486b.isEmpty()) {
                t1Var.j0(o41Var, view);
                return;
            }
            v1 v1Var = (v1) o41Var.H;
            if (!v1Var.f18510g) {
                Bundle f10 = p5.c.f(5, "chatMode");
                f10.putLong("user_id", t1Var.getUserConfig().e());
                f10.putString("quick_reply", v1Var.f18506b);
                bn bnVar = new bn(f10);
                bnVar.Tb(v1Var.f18505a);
                t1Var.presentFragment(bnVar);
            }
        }
    }

    public static void c0(t1 t1Var) {
        t1Var.f18486b.clear();
        org.telegram.messenger.g0.d0(t1Var.f18485a, new fi.e(4));
        t1Var.simpleActionBar.w();
        t1Var.f18485a.z1(false);
    }

    public static int g0(t1 t1Var) {
        return t1Var.currentAccount;
    }

    public static void i0(Activity activity, int i7, String str, v1 v1Var, h6 h6Var, y10 y10Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        String str2;
        int i11;
        ?? r11;
        g2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof du0) && ((du0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, h6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (v1Var == null && str == null) {
            i10 = 2131752647;
        } else {
            i10 = 2131752661;
        }
        String N0 = hd.N0(i10, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28743a;
        t1Var.S = N0;
        final a1 a1Var = new a1(activity, h6Var);
        si.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        a1Var.setTextSize(1, 18.0f);
        if (v1Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = v1Var.f18506b;
        }
        a1Var.setText(str2);
        int i12 = m6.f29455j5;
        org.telegram.ui.ActionBar.t6.U(a1Var, i12, h6Var);
        org.telegram.ui.ActionBar.t6.l(a1Var, 34, m6.Oi, h6Var);
        a1Var.setHintText(hd.N0(2131752649, null));
        a1Var.setSingleLine(true);
        a1Var.setFocusable(true);
        org.telegram.ui.ActionBar.t6.F(a1Var, m6.f29476k6, m6.f29494l6, m6.f29568p7, h6Var);
        a1Var.setImeOptions(6);
        a1Var.setBackgroundDrawable(null);
        a1Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        a1Var.setFilters(new InputFilter[]{new b1(1)});
        LinearLayout f10 = f3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.t6.U(textView, i12, h6Var);
        textView.setTextSize(1, 16.0f);
        if (v1Var == null && str == null) {
            i11 = 2131752648;
        } else {
            i11 = 2131752662;
        }
        textView.setText(hd.N0(i11, null));
        frameLayout.addView(textView, na.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        org.telegram.ui.ActionBar.t6.U(textView2, m6.f29588q7, h6Var);
        i5.c.r(16.0f, 1, 2131752650, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, na.e(-1, -2, 83));
        o2 o2Var = new o2(r1, new ValueAnimator[1], textView2, textView, 4);
        Runnable[] runnableArr = {new s0(o2Var, 3)};
        a1Var.addTextChangedListener(new bi.v(textView2, runnableArr, false, 8));
        f10.addView(frameLayout, na.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(a1Var, na.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        t1Var.f29976a = org.telegram.messenger.g0.L(292.0f);
        a1Var.setOnEditorActionListener(new p1(a1Var, i7, v1Var, textView2, o2Var, y10Var, t1VarArr, view));
        alertDialog$Builder2.k(hd.N0(2131751342, null), new m1(a1Var, o2Var, i7, v1Var, textView2, y10Var));
        alertDialog$Builder2.h(hd.N0(2131752577, null), new f9(13));
        if (z10) {
            f18484f = t1Var;
            r11 = 0;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(1, view));
            f18484f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            a1 a1Var2 = a1Var;
                            a1Var2.requestFocus();
                            org.telegram.messenger.g0.I3(a1Var2);
                            return;
                        default:
                            a1 a1Var3 = a1Var;
                            a1Var3.requestFocus();
                            org.telegram.messenger.g0.I3(a1Var3);
                            return;
                    }
                }
            });
            f18484f.r(250L);
        } else {
            r11 = 0;
            t1Var.P = new t6(a1Var, 12);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new u9(a1Var, 6));
            t1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            a1 a1Var2 = a1Var;
                            a1Var2.requestFocus();
                            org.telegram.messenger.g0.I3(a1Var2);
                            return;
                        default:
                            a1 a1Var3 = a1Var;
                            a1Var3.requestFocus();
                            org.telegram.messenger.g0.I3(a1Var3);
                            return;
                    }
                }
            });
            t1VarArr[0].show();
        }
        t1VarArr[r11].f30001k0 = r11;
        a1Var.setSelection(a1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(hd.N0(2131752671, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 13));
        f5 q10 = this.simpleActionBar.q();
        g5 b10 = q10.b(1, 2131232118);
        this.f18487c = b10;
        b10.setContentDescription(hd.N0(2131751323, null));
        q10.b(2, 2131232110).setContentDescription(hd.N0(2131751586, null));
        o1 o1Var = new o1(context, null, 0);
        h51 h51Var = new h51(this, new r10(this) {
            public final t1 f18375b;

            {
                this.f18375b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        t1.Z(this.f18375b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        t1.a0(this.f18375b, (ArrayList) obj, (c51) obj2);
                        return;
                }
            }
        }, new k1(this), new k1(this));
        this.f18485a = h51Var;
        h51Var.r1();
        this.f18485a.setSectionsDrawBackground(true);
        h51 h51Var2 = this.f18485a;
        h51Var2.f35742g3.f34026r = false;
        h51Var2.E1(new r10(this) {
            public final t1 f18375b;

            {
                this.f18375b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        t1.Z(this.f18375b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        t1.a0(this.f18375b, (ArrayList) obj, (c51) obj2);
                        return;
                }
            }
        }, false);
        o1Var.addView(this.f18485a, na.c(-1.0f, -1));
        this.fragmentView = o1Var;
        return o1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h51 h51Var;
        c51 c51Var;
        if (i7 == ls.F1 && (h51Var = this.f18485a) != null && (c51Var = h51Var.f35742g3) != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18485a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(o41 o41Var, View view) {
        boolean z10;
        v1 v1Var = (v1) o41Var.H;
        s1 s1Var = (s1) view;
        Integer valueOf = Integer.valueOf(v1Var.f18505a);
        ArrayList arrayList = this.f18486b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(v1Var.f18505a));
        } else {
            arrayList.add(Integer.valueOf(v1Var.f18505a));
        }
        this.f18485a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(v1Var.f18505a));
        o41Var.f38051e = contains;
        s1Var.d.a(contains, true);
        if (this.simpleActionBar.x() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.w();
            } else {
                this.simpleActionBar.J();
            }
        }
        this.simpleActionBar.E(Math.max(1, arrayList.size()), true);
        boolean z11 = false;
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            v1 c10 = w1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !w1.g(c10.f18506b)) {
                z11 = true;
            }
            z10 = z11;
        }
        if (this.f18488e != z10) {
            this.f18488e = z10;
            this.f18487c.Z(z10, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ls.F1);
        w1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.F1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
