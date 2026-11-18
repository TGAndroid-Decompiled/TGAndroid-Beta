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
import bi.i2;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.t9;
import fi.k5;
import hi.f9;
import hi.t6;
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
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class t1 extends h2 implements fs {
    public static org.telegram.ui.ActionBar.u1 f18485f;
    public e51 f18486a;
    public final ArrayList f18487b;
    public h5 f18488c;
    public int d;
    public boolean f18489e;

    public t1() {
        super(null);
        this.f18487b = new ArrayList();
        this.f18489e = true;
    }

    public static void Z(t1 t1Var, int i7, ArrayList arrayList) {
        if (i7 == t1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((l41) arrayList.get(i10)).H instanceof v1) {
                    ((v1) ((l41) arrayList.get(i10)).H).f18508c = i10;
                }
            }
            w1 f10 = w1.f(t1Var.currentAccount);
            ArrayList arrayList2 = f10.f18520b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = e2.f(((v1) arrayList2.get(i11)).f18506a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.w(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((v1) arrayList2.get(i12)).f18506a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = e2.f(((v1) arrayList2.get(i13)).f18506a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f18519a).sendRequest(tL_messages_reorderQuickReplies, new k5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(t1 t1Var, ArrayList arrayList, z41 z41Var) {
        String M0 = gd.M0(2131752672, null);
        String M02 = gd.M0(2131752659, null);
        l41 l41Var = new l41(2);
        l41Var.f37018m = M0;
        l41Var.f37021p = M02;
        l41Var.f37019n = "RestrictedEmoji";
        l41Var.f37020o = "📝";
        arrayList.add(l41Var);
        z41Var.V();
        w1 f10 = w1.f(t1Var.currentAccount);
        ArrayList arrayList2 = f10.f18520b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (i10 == 0 && !"hello".equalsIgnoreCase(((v1) arrayList2.get(i12)).f18507b)) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i11 == 0 && !"away".equalsIgnoreCase(((v1) arrayList2.get(i12)).f18507b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < mp.u1(f10.f18519a).E5) {
            l41 c10 = l41.c(1, 2131232424, gd.M0(2131752671, null));
            c10.f37023r = true;
            arrayList.add(c10);
        }
        t1Var.d = z41Var.M();
        ArrayList arrayList3 = w1.f(t1Var.currentAccount).f18520b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            v1 v1Var = (v1) obj;
            l41 l41Var2 = new l41(16);
            l41Var2.H = v1Var;
            l41Var2.L(t1Var.f18487b.contains(Integer.valueOf(v1Var.f18506a)));
            arrayList.add(l41Var2);
        }
        z41Var.L();
        z41Var.U();
        arrayList.add(l41.C(gd.M0(2131752670, null)));
    }

    public static void b0(t1 t1Var, l41 l41Var, View view) {
        if (l41Var.d == 1) {
            i0(t1Var.getParentActivity(), t1Var.currentAccount, null, null, t1Var.getResourceProvider(), new t6(t1Var, 11));
        } else if (l41Var.f56589a == 16 && (l41Var.H instanceof v1)) {
            if (!t1Var.f18487b.isEmpty()) {
                t1Var.j0(l41Var, view);
                return;
            }
            v1 v1Var = (v1) l41Var.H;
            if (!v1Var.f18511g) {
                Bundle f10 = p5.c.f(5, "chatMode");
                f10.putLong("user_id", t1Var.getUserConfig().e());
                f10.putString("quick_reply", v1Var.f18507b);
                bn bnVar = new bn(f10);
                bnVar.Tb(v1Var.f18506a);
                t1Var.presentFragment(bnVar);
            }
        }
    }

    public static void c0(t1 t1Var) {
        t1Var.f18487b.clear();
        org.telegram.messenger.g0.d0(t1Var.f18486a, new fi.e(4));
        t1Var.simpleActionBar.w();
        t1Var.f18486a.z1(false);
    }

    public static int g0(t1 t1Var) {
        return t1Var.currentAccount;
    }

    public static void i0(Activity activity, int i7, String str, v1 v1Var, i6 i6Var, x10 x10Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        String str2;
        int i11;
        ?? r11;
        h2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof au0) && ((au0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (v1Var == null && str == null) {
            i10 = 2131752648;
        } else {
            i10 = 2131752662;
        }
        String M0 = gd.M0(i10, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f28744a;
        u1Var.S = M0;
        final a1 a1Var = new a1(activity, i6Var);
        ri.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        a1Var.setTextSize(1, 18.0f);
        if (v1Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = v1Var.f18507b;
        }
        a1Var.setText(str2);
        int i12 = n6.f29502j5;
        u6.U(a1Var, i12, i6Var);
        u6.l(a1Var, 34, n6.Oi, i6Var);
        a1Var.setHintText(gd.M0(2131752650, null));
        a1Var.setSingleLine(true);
        a1Var.setFocusable(true);
        u6.F(a1Var, n6.f29523k6, n6.f29541l6, n6.f29615p7, i6Var);
        a1Var.setImeOptions(6);
        a1Var.setBackgroundDrawable(null);
        a1Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        a1Var.setFilters(new InputFilter[]{new b1(1)});
        LinearLayout f10 = f3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        u6.U(textView, i12, i6Var);
        textView.setTextSize(1, 16.0f);
        if (v1Var == null && str == null) {
            i11 = 2131752649;
        } else {
            i11 = 2131752663;
        }
        textView.setText(gd.M0(i11, null));
        frameLayout.addView(textView, ma.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        u6.U(textView2, n6.f29635q7, i6Var);
        i5.c.r(16.0f, 1, 2131752651, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, ma.e(-1, -2, 83));
        i2 i2Var = new i2(r1, new ValueAnimator[1], textView2, textView, 4);
        Runnable[] runnableArr = {new j0(i2Var, 4)};
        a1Var.addTextChangedListener(new bi.v(textView2, runnableArr, false, 8));
        f10.addView(frameLayout, ma.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(a1Var, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        u1Var.f30024a = org.telegram.messenger.g0.L(292.0f);
        a1Var.setOnEditorActionListener(new p1(a1Var, i7, v1Var, textView2, i2Var, x10Var, u1VarArr, view));
        alertDialog$Builder2.k(gd.M0(2131751343, null), new m1(a1Var, i2Var, i7, v1Var, textView2, x10Var));
        alertDialog$Builder2.h(gd.M0(2131752578, null), new f9(13));
        if (z10) {
            f18485f = u1Var;
            r11 = 0;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new r(1, view));
            f18485f.setOnShowListener(new DialogInterface.OnShowListener() {
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
            f18485f.r(250L);
        } else {
            r11 = 0;
            u1Var.P = new t6(a1Var, 12);
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new t9(a1Var, 6));
            u1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
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
            u1VarArr[0].show();
        }
        u1VarArr[r11].f30049k0 = r11;
        a1Var.setSelection(a1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setTitle(gd.M0(2131752672, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 13));
        g5 q10 = this.simpleActionBar.q();
        h5 b10 = q10.b(1, 2131232118);
        this.f18488c = b10;
        b10.setContentDescription(gd.M0(2131751324, null));
        q10.b(2, 2131232110).setContentDescription(gd.M0(2131751587, null));
        o1 o1Var = new o1(context, null, 0);
        e51 e51Var = new e51(this, new q10(this) {
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
                        t1.a0(this.f18375b, (ArrayList) obj, (z41) obj2);
                        return;
                }
            }
        }, new k1(this), new k1(this));
        this.f18486a = e51Var;
        e51Var.r1();
        this.f18486a.setSectionsDrawBackground(true);
        e51 e51Var2 = this.f18486a;
        e51Var2.f34607g3.f42809r = false;
        e51Var2.E1(new q10(this) {
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
                        t1.a0(this.f18375b, (ArrayList) obj, (z41) obj2);
                        return;
                }
            }
        }, false);
        o1Var.addView(this.f18486a, ma.c(-1.0f, -1));
        this.fragmentView = o1Var;
        return o1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        e51 e51Var;
        z41 z41Var;
        if (i7 == ks.F1 && (e51Var = this.f18486a) != null && (z41Var = e51Var.f34607g3) != null) {
            z41Var.O(true);
        }
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f18486a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(l41 l41Var, View view) {
        boolean z10;
        v1 v1Var = (v1) l41Var.H;
        s1 s1Var = (s1) view;
        Integer valueOf = Integer.valueOf(v1Var.f18506a);
        ArrayList arrayList = this.f18487b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(v1Var.f18506a));
        } else {
            arrayList.add(Integer.valueOf(v1Var.f18506a));
        }
        this.f18486a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(v1Var.f18506a));
        l41Var.f37011e = contains;
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
            if (c10 != null && !w1.g(c10.f18507b)) {
                z11 = true;
            }
            z10 = z11;
        }
        if (this.f18489e != z10) {
            this.f18489e = z10;
            this.f18488c.Z(z10, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.F1);
        w1.f(this.currentAccount).h();
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
