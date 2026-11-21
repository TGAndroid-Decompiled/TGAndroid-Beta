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
import bi.m2;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.u9;
import fi.l5;
import hi.e9;
import hi.s6;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class s1 extends g2 implements fs {
    public static org.telegram.ui.ActionBar.t1 f18505f;
    public h51 f18506a;
    public final ArrayList f18507b;
    public g5 f18508c;
    public int d;
    public boolean f18509e;

    public s1() {
        super(null);
        this.f18507b = new ArrayList();
        this.f18509e = true;
    }

    public static void Z(s1 s1Var, int i7, ArrayList arrayList) {
        if (i7 == s1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((o41) arrayList.get(i10)).H instanceof u1) {
                    ((u1) ((o41) arrayList.get(i10)).H).f18532c = i10;
                }
            }
            v1 f10 = v1.f(s1Var.currentAccount);
            ArrayList arrayList2 = f10.f18542b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = e2.f(((u1) arrayList2.get(i11)).f18530a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.w(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((u1) arrayList2.get(i12)).f18530a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = e2.f(((u1) arrayList2.get(i13)).f18530a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f18541a).sendRequest(tL_messages_reorderQuickReplies, new l5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(s1 s1Var, ArrayList arrayList, c51 c51Var) {
        String N0 = gd.N0(2131752671, null);
        String N02 = gd.N0(2131752658, null);
        o41 o41Var = new o41(2);
        o41Var.f38098m = N0;
        o41Var.f38101p = N02;
        o41Var.f38099n = "RestrictedEmoji";
        o41Var.f38100o = "📝";
        arrayList.add(o41Var);
        c51Var.V();
        v1 f10 = v1.f(s1Var.currentAccount);
        ArrayList arrayList2 = f10.f18542b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (i10 == 0 && !"hello".equalsIgnoreCase(((u1) arrayList2.get(i12)).f18531b)) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i11 == 0 && !"away".equalsIgnoreCase(((u1) arrayList2.get(i12)).f18531b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < mp.u1(f10.f18541a).E5) {
            o41 c10 = o41.c(1, 2131232424, gd.N0(2131752670, null));
            c10.f38103r = true;
            arrayList.add(c10);
        }
        s1Var.d = c51Var.M();
        ArrayList arrayList3 = v1.f(s1Var.currentAccount).f18542b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            u1 u1Var = (u1) obj;
            o41 o41Var2 = new o41(16);
            o41Var2.H = u1Var;
            o41Var2.L(s1Var.f18507b.contains(Integer.valueOf(u1Var.f18530a)));
            arrayList.add(o41Var2);
        }
        c51Var.L();
        c51Var.U();
        arrayList.add(o41.C(gd.N0(2131752669, null)));
    }

    public static void b0(s1 s1Var, o41 o41Var, View view) {
        if (o41Var.d == 1) {
            i0(s1Var.getParentActivity(), s1Var.currentAccount, null, null, s1Var.getResourceProvider(), new s6(s1Var, 11));
        } else if (o41Var.f56630a == 16 && (o41Var.H instanceof u1)) {
            if (!s1Var.f18507b.isEmpty()) {
                s1Var.j0(o41Var, view);
                return;
            }
            u1 u1Var = (u1) o41Var.H;
            if (!u1Var.f18535g) {
                Bundle f10 = p5.c.f(5, "chatMode");
                f10.putLong("user_id", s1Var.getUserConfig().e());
                f10.putString("quick_reply", u1Var.f18531b);
                bn bnVar = new bn(f10);
                bnVar.Tb(u1Var.f18530a);
                s1Var.presentFragment(bnVar);
            }
        }
    }

    public static void c0(s1 s1Var) {
        s1Var.f18507b.clear();
        org.telegram.messenger.g0.d0(s1Var.f18506a, new fi.e(4));
        s1Var.simpleActionBar.w();
        s1Var.f18506a.z1(false);
    }

    public static int g0(s1 s1Var) {
        return s1Var.currentAccount;
    }

    public static void i0(Activity activity, int i7, String str, u1 u1Var, h6 h6Var, x10 x10Var) {
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
        if (u1Var == null && str == null) {
            i10 = 2131752647;
        } else {
            i10 = 2131752661;
        }
        String N0 = gd.N0(i10, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28774a;
        t1Var.S = N0;
        final z0 z0Var = new z0(activity, h6Var);
        ri.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        z0Var.setTextSize(1, 18.0f);
        if (u1Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = u1Var.f18531b;
        }
        z0Var.setText(str2);
        int i12 = m6.f29486j5;
        t6.U(z0Var, i12, h6Var);
        t6.l(z0Var, 34, m6.Oi, h6Var);
        z0Var.setHintText(gd.N0(2131752649, null));
        z0Var.setSingleLine(true);
        z0Var.setFocusable(true);
        t6.F(z0Var, m6.f29507k6, m6.f29525l6, m6.f29599p7, h6Var);
        z0Var.setImeOptions(6);
        z0Var.setBackgroundDrawable(null);
        z0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        z0Var.setFilters(new InputFilter[]{new a1(1)});
        LinearLayout f10 = f3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        t6.U(textView, i12, h6Var);
        textView.setTextSize(1, 16.0f);
        if (u1Var == null && str == null) {
            i11 = 2131752648;
        } else {
            i11 = 2131752662;
        }
        textView.setText(gd.N0(i11, null));
        frameLayout.addView(textView, ma.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        t6.U(textView2, m6.f29619q7, h6Var);
        i5.c.r(16.0f, 1, 2131752650, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, ma.e(-1, -2, 83));
        m2 m2Var = new m2(r1, new ValueAnimator[1], textView2, textView, 4);
        Runnable[] runnableArr = {new i0(m2Var, 4)};
        z0Var.addTextChangedListener(new bi.v(textView2, runnableArr, false, 8));
        f10.addView(frameLayout, ma.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(z0Var, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        t1Var.f30007a = org.telegram.messenger.g0.L(292.0f);
        z0Var.setOnEditorActionListener(new o1(z0Var, i7, u1Var, textView2, m2Var, x10Var, t1VarArr, view));
        alertDialog$Builder2.k(gd.N0(2131751342, null), new l1(z0Var, m2Var, i7, u1Var, textView2, x10Var));
        alertDialog$Builder2.h(gd.N0(2131752577, null), new e9(13));
        if (z10) {
            f18505f = t1Var;
            r11 = 0;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(1, view));
            f18505f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            z0 z0Var2 = z0Var;
                            z0Var2.requestFocus();
                            org.telegram.messenger.g0.I3(z0Var2);
                            return;
                        default:
                            z0 z0Var3 = z0Var;
                            z0Var3.requestFocus();
                            org.telegram.messenger.g0.I3(z0Var3);
                            return;
                    }
                }
            });
            f18505f.r(250L);
        } else {
            r11 = 0;
            t1Var.P = new s6(z0Var, 12);
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new u9(z0Var, 6));
            t1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            z0 z0Var2 = z0Var;
                            z0Var2.requestFocus();
                            org.telegram.messenger.g0.I3(z0Var2);
                            return;
                        default:
                            z0 z0Var3 = z0Var;
                            z0Var3.requestFocus();
                            org.telegram.messenger.g0.I3(z0Var3);
                            return;
                    }
                }
            });
            t1VarArr[0].show();
        }
        t1VarArr[r11].f30032k0 = r11;
        z0Var.setSelection(z0Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(gd.N0(2131752671, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 13));
        f5 q10 = this.simpleActionBar.q();
        g5 b10 = q10.b(1, 2131232118);
        this.f18508c = b10;
        b10.setContentDescription(gd.N0(2131751323, null));
        q10.b(2, 2131232110).setContentDescription(gd.N0(2131751586, null));
        n1 n1Var = new n1(context, null, 0);
        h51 h51Var = new h51(this, new q10(this) {
            public final s1 f18400b;

            {
                this.f18400b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        s1.Z(this.f18400b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        s1.a0(this.f18400b, (ArrayList) obj, (c51) obj2);
                        return;
                }
            }
        }, new j1(this), new j1(this));
        this.f18506a = h51Var;
        h51Var.r1();
        this.f18506a.setSectionsDrawBackground(true);
        h51 h51Var2 = this.f18506a;
        h51Var2.f35796g3.f34068r = false;
        h51Var2.E1(new q10(this) {
            public final s1 f18400b;

            {
                this.f18400b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        s1.Z(this.f18400b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        s1.a0(this.f18400b, (ArrayList) obj, (c51) obj2);
                        return;
                }
            }
        }, false);
        n1Var.addView(this.f18506a, ma.c(-1.0f, -1));
        this.fragmentView = n1Var;
        return n1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h51 h51Var;
        c51 c51Var;
        if (i7 == ks.F1 && (h51Var = this.f18506a) != null && (c51Var = h51Var.f35796g3) != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18506a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(o41 o41Var, View view) {
        boolean z10;
        u1 u1Var = (u1) o41Var.H;
        r1 r1Var = (r1) view;
        Integer valueOf = Integer.valueOf(u1Var.f18530a);
        ArrayList arrayList = this.f18507b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(u1Var.f18530a));
        } else {
            arrayList.add(Integer.valueOf(u1Var.f18530a));
        }
        this.f18506a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(u1Var.f18530a));
        o41Var.f38091e = contains;
        r1Var.d.a(contains, true);
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
            u1 c10 = v1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !v1.g(c10.f18531b)) {
                z11 = true;
            }
            z10 = z11;
        }
        if (this.f18509e != z10) {
            this.f18509e = z10;
            this.f18508c.Z(z10, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.F1);
        v1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.F1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
