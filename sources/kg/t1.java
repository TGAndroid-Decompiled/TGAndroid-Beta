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
import fi.l5;
import hi.c7;
import hi.z9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class t1 extends g2 implements fs {
    public static org.telegram.ui.ActionBar.t1 f18579f;
    public g51 f18580a;
    public final ArrayList f18581b;
    public g5 f18582c;
    public int d;
    public boolean f18583e;

    public t1() {
        super(null);
        this.f18581b = new ArrayList();
        this.f18583e = true;
    }

    public static void Z(t1 t1Var, int i7, ArrayList arrayList) {
        if (i7 == t1Var.d) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((n41) arrayList.get(i10)).H instanceof v1) {
                    ((v1) ((n41) arrayList.get(i10)).H).f18603c = i10;
                }
            }
            w1 f10 = w1.f(t1Var.currentAccount);
            ArrayList arrayList2 = f10.f18615b;
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11 = e2.f(((v1) arrayList2.get(i11)).f18601a, i11, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new jg.w(4));
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (((v1) arrayList2.get(i12)).f18601a != ((Integer) arrayList3.get(i12)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i13 = 0; i13 < arrayList2.size(); i13 = e2.f(((v1) arrayList2.get(i13)).f18601a, i13, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.f18614a).sendRequest(tL_messages_reorderQuickReplies, new l5(5));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void a0(t1 t1Var, ArrayList arrayList, b51 b51Var) {
        String N0 = gd.N0(2131752671, null);
        String N02 = gd.N0(2131752658, null);
        n41 n41Var = new n41(2);
        n41Var.f37655m = N0;
        n41Var.f37658p = N02;
        n41Var.f37656n = "RestrictedEmoji";
        n41Var.f37657o = "📝";
        arrayList.add(n41Var);
        b51Var.V();
        w1 f10 = w1.f(t1Var.currentAccount);
        ArrayList arrayList2 = f10.f18615b;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (i10 == 0 && !"hello".equalsIgnoreCase(((v1) arrayList2.get(i12)).f18602b)) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i11 == 0 && !"away".equalsIgnoreCase(((v1) arrayList2.get(i12)).f18602b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i10 != 0 && i11 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i10 ^ 1) + (i11 ^ 1) < mp.u1(f10.f18614a).E5) {
            n41 c10 = n41.c(1, 2131232427, gd.N0(2131752670, null));
            c10.f37660r = true;
            arrayList.add(c10);
        }
        t1Var.d = b51Var.M();
        ArrayList arrayList3 = w1.f(t1Var.currentAccount).f18615b;
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            v1 v1Var = (v1) obj;
            n41 n41Var2 = new n41(16);
            n41Var2.H = v1Var;
            n41Var2.L(t1Var.f18581b.contains(Integer.valueOf(v1Var.f18601a)));
            arrayList.add(n41Var2);
        }
        b51Var.L();
        b51Var.U();
        arrayList.add(n41.C(gd.N0(2131752669, null)));
    }

    public static void b0(t1 t1Var, n41 n41Var, View view) {
        if (n41Var.d == 1) {
            i0(t1Var.getParentActivity(), t1Var.currentAccount, null, null, t1Var.getResourceProvider(), new c7(t1Var, 11));
        } else if (n41Var.f56712a == 16 && (n41Var.H instanceof v1)) {
            if (!t1Var.f18581b.isEmpty()) {
                t1Var.j0(n41Var, view);
                return;
            }
            v1 v1Var = (v1) n41Var.H;
            if (!v1Var.f18606g) {
                Bundle f10 = p5.c.f(5, "chatMode");
                f10.putLong("user_id", t1Var.getUserConfig().e());
                f10.putString("quick_reply", v1Var.f18602b);
                bn bnVar = new bn(f10);
                bnVar.Tb(v1Var.f18601a);
                t1Var.presentFragment(bnVar);
            }
        }
    }

    public static void c0(t1 t1Var) {
        t1Var.f18581b.clear();
        org.telegram.messenger.g0.d0(t1Var.f18580a, new fi.e(4));
        t1Var.simpleActionBar.w();
        t1Var.f18580a.z1(false);
    }

    public static void i0(Activity activity, int i7, String str, v1 v1Var, i6 i6Var, w10 w10Var) {
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
        if (Q != null && (Q.getFragmentView() instanceof cu0) && ((cu0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, activity, i6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (v1Var == null && str == null) {
            i10 = 2131752647;
        } else {
            i10 = 2131752661;
        }
        String N0 = gd.N0(i10, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28835a;
        t1Var.S = N0;
        final z0 z0Var = new z0(activity, i6Var);
        ri.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        z0Var.setTextSize(1, 18.0f);
        if (v1Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = v1Var.f18602b;
        }
        z0Var.setText(str2);
        int i12 = n6.f29559j5;
        u6.U(z0Var, i12, i6Var);
        u6.l(z0Var, 34, n6.Oi, i6Var);
        z0Var.setHintText(gd.N0(2131752649, null));
        z0Var.setSingleLine(true);
        z0Var.setFocusable(true);
        u6.F(z0Var, n6.f29580k6, n6.f29598l6, n6.f29672p7, i6Var);
        z0Var.setImeOptions(6);
        z0Var.setBackgroundDrawable(null);
        z0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        z0Var.setFilters(new InputFilter[]{new a1(1)});
        LinearLayout f10 = f3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        u6.U(textView, i12, i6Var);
        textView.setTextSize(1, 16.0f);
        if (v1Var == null && str == null) {
            i11 = 2131752648;
        } else {
            i11 = 2131752662;
        }
        textView.setText(gd.N0(i11, null));
        frameLayout.addView(textView, na.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        u6.U(textView2, n6.f29692q7, i6Var);
        i5.c.r(16.0f, 1, 2131752650, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, na.e(-1, -2, 83));
        o2 o2Var = new o2(r1, new ValueAnimator[1], textView2, textView, 4);
        Runnable[] runnableArr = {new i0(o2Var, 4)};
        z0Var.addTextChangedListener(new bi.v(textView2, runnableArr, false, 8));
        f10.addView(frameLayout, na.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(z0Var, na.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        t1Var.f30068a = org.telegram.messenger.g0.L(292.0f);
        z0Var.setOnEditorActionListener(new p1(z0Var, i7, v1Var, textView2, o2Var, w10Var, t1VarArr, view));
        alertDialog$Builder2.k(gd.N0(2131751342, null), new m1(z0Var, o2Var, i7, v1Var, textView2, w10Var));
        alertDialog$Builder2.h(gd.N0(2131752577, null), new z9(13));
        if (z10) {
            f18579f = t1Var;
            r11 = 0;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new r(1, view));
            f18579f.setOnShowListener(new DialogInterface.OnShowListener() {
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
            f18579f.r(250L);
        } else {
            r11 = 0;
            t1Var.P = new c7(z0Var, 12);
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
        t1VarArr[r11].f30093k0 = r11;
        z0Var.setSelection(z0Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(gd.N0(2131752671, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 13));
        f5 q10 = this.simpleActionBar.q();
        g5 b10 = q10.b(1, 2131232121);
        this.f18582c = b10;
        b10.setContentDescription(gd.N0(2131751323, null));
        q10.b(2, 2131232113).setContentDescription(gd.N0(2131751586, null));
        o1 o1Var = new o1(context, null, 0);
        g51 g51Var = new g51(this, new p10(this) {
            public final t1 f18470b;

            {
                this.f18470b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        t1.Z(this.f18470b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        t1.a0(this.f18470b, (ArrayList) obj, (b51) obj2);
                        return;
                }
            }
        }, new k1(this), new k1(this));
        this.f18580a = g51Var;
        g51Var.r1();
        this.f18580a.setSectionsDrawBackground(true);
        g51 g51Var2 = this.f18580a;
        g51Var2.f35323g3.f33631r = false;
        g51Var2.E1(new p10(this) {
            public final t1 f18470b;

            {
                this.f18470b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        t1.Z(this.f18470b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        t1.a0(this.f18470b, (ArrayList) obj, (b51) obj2);
                        return;
                }
            }
        }, false);
        o1Var.addView(this.f18580a, na.c(-1.0f, -1));
        this.fragmentView = o1Var;
        return o1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g51 g51Var;
        b51 b51Var;
        if (i7 == ks.F1 && (g51Var = this.f18580a) != null && (b51Var = g51Var.f35323g3) != null) {
            b51Var.O(true);
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18580a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(n41 n41Var, View view) {
        boolean z10;
        v1 v1Var = (v1) n41Var.H;
        s1 s1Var = (s1) view;
        Integer valueOf = Integer.valueOf(v1Var.f18601a);
        ArrayList arrayList = this.f18581b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(v1Var.f18601a));
        } else {
            arrayList.add(Integer.valueOf(v1Var.f18601a));
        }
        this.f18580a.z1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(v1Var.f18601a));
        n41Var.f37648e = contains;
        s1Var.d.a(contains, true);
        if (this.simpleActionBar.x() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.w();
            } else {
                this.simpleActionBar.I();
            }
        }
        this.simpleActionBar.D(Math.max(1, arrayList.size()), true);
        boolean z11 = false;
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            v1 c10 = w1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !w1.g(c10.f18602b)) {
                z11 = true;
            }
            z10 = z11;
        }
        if (this.f18583e != z10) {
            this.f18583e = z10;
            this.f18582c.Z(z10, true);
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
