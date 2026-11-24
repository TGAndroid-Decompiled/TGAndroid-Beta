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
public final class kx8 extends d implements gk7 {
    public static hd f;
    public q5c a;
    public final ArrayList b;
    public xha c;
    public int d;
    public boolean e;

    public kx8() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static int Y(kx8 kx8Var) {
        return kx8Var.currentAccount;
    }

    public static int Z(kx8 kx8Var) {
        return kx8Var.currentAccount;
    }

    public static wjb a0(kx8 kx8Var) {
        return kx8Var.resourceProvider;
    }

    public static void g0(Activity activity, int i, String str, nx8 nx8Var, wjb wjbVar, p8c p8cVar) {
        View view;
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        int i2;
        String str2;
        int i3;
        ?? r10;
        d Q = LaunchActivity.Q();
        Activity W = gl.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof cja) && ((cja) Q.getFragmentView()).Q() > gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        hd[] hdVarArr = new hd[1];
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, activity);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (nx8Var == null && str == null) {
            i2 = 2131752647;
        } else {
            i2 = 2131752661;
        }
        String M0 = k96.M0(i2, null);
        hd hdVar = alertDialog$Builder2.a;
        hdVar.S = M0;
        final p32 p32Var = new p32(activity, wjbVar);
        hq6.d0(i).O(gl.F0(), true);
        p32Var.setTextSize(1, 18.0f);
        if (nx8Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = nx8Var.b;
        }
        p32Var.setText(str2);
        int i4 = bkb.i5;
        zkb.X(p32Var, i4, wjbVar);
        zkb.l(p32Var, 34, bkb.Ni, wjbVar);
        p32Var.setHintText(k96.M0(2131752649, null));
        p32Var.setSingleLine(true);
        p32Var.setFocusable(true);
        zkb.F(p32Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        p32Var.setImeOptions(6);
        p32Var.setBackgroundDrawable(null);
        p32Var.setPadding(0, 0, gl.L(42.0f), 0);
        p32Var.setFilters(new InputFilter[]{new fa6((byte) 1)});
        LinearLayout m = ir2.m(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        zkb.X(textView, i4, wjbVar);
        textView.setTextSize(1, 16.0f);
        if (nx8Var == null && str == null) {
            i3 = 2131752648;
        } else {
            i3 = 2131752662;
        }
        textView.setText(k96.M0(i3, null));
        frameLayout.addView(textView, nme.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        zkb.X(textView2, bkb.p7, wjbVar);
        ir2.r(16.0f, 1, 2131752650, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, nme.e(-1, -2, 83));
        au0 au0Var = new au0(r1, new ValueAnimator[1], textView2, textView, (byte) 16);
        Runnable[] runnableArr = {new sr8(au0Var, (byte) 5)};
        p32Var.addTextChangedListener(new qy(textView2, runnableArr, false, (byte) 10));
        m.addView(frameLayout, nme.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        m.addView(p32Var, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(m);
        hdVar.a = gl.L(292.0f);
        p32Var.setOnEditorActionListener(new hx8(p32Var, i, nx8Var, textView2, au0Var, p8cVar, hdVarArr, view));
        alertDialog$Builder2.j(k96.M0(2131751342, null), new yx5(p32Var, au0Var, i, nx8Var, textView2, p8cVar));
        alertDialog$Builder2.g(k96.M0(2131752577, null), new sc8((byte) 13));
        if (z) {
            f = hdVar;
            r10 = 0;
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new b41(view, (byte) 2));
            f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    p32 p32Var2 = p32Var;
                    switch (b) {
                        case 0:
                            p32Var2.requestFocus();
                            gl.E3(p32Var2);
                            return;
                        default:
                            p32Var2.requestFocus();
                            gl.E3(p32Var2);
                            return;
                    }
                }
            });
            f.q(250L);
        } else {
            r10 = 0;
            hdVar.P = new zf7(p32Var, (byte) 25);
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new ph8(p32Var, (byte) 3));
            hdVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    p32 p32Var2 = p32Var;
                    switch (b) {
                        case 0:
                            p32Var2.requestFocus();
                            gl.E3(p32Var2);
                            return;
                        default:
                            p32Var2.requestFocus();
                            gl.E3(p32Var2);
                            return;
                    }
                }
            });
            hdVarArr[0].show();
        }
        hdVarArr[r10].k0 = r10;
        p32Var.setSelection(p32Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setTitle(k96.M0(2131752671, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 5));
        wha q = this.simpleActionBar.q();
        xha a = q.a(1, 2131232121);
        this.c = a;
        a.setContentDescription(k96.M0(2131751323, null));
        q.a(2, 2131232113).setContentDescription(k96.M0(2131751586, null));
        g74 g74Var = new g74(context, null, (byte) 2);
        q5c q5cVar = new q5c(this, new i8c(this) {
            public final kx8 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                byte b = r2;
                kx8 kx8Var = this.b;
                switch (b) {
                    case 0:
                        kx8Var.i0(((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        kx8Var.e0((ArrayList) obj, (l5c) obj2);
                        return;
                }
            }
        }, new ex8(this), new ex8(this));
        this.a = q5cVar;
        q5cVar.r1();
        this.a.setSectionsDrawBackground(true);
        q5c q5cVar2 = this.a;
        q5cVar2.g3.r = false;
        q5cVar2.E1(new i8c(this) {
            public final kx8 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                byte b = r2;
                kx8 kx8Var = this.b;
                switch (b) {
                    case 0:
                        kx8Var.i0(((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        kx8Var.e0((ArrayList) obj, (l5c) obj2);
                        return;
                }
            }
        }, false);
        g74Var.addView(this.a, nme.c(-1.0f, -1));
        this.fragmentView = g74Var;
        return g74Var;
    }

    public final void d0() {
        this.b.clear();
        gl.d0(this.a, new bm0((byte) 23));
        this.simpleActionBar.w();
        this.a.z1(false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q5c q5cVar;
        l5c l5cVar;
        if (i == kk7.E1 && (q5cVar = this.a) != null && (l5cVar = q5cVar.g3) != null) {
            l5cVar.O(true);
        }
    }

    public final void e0(ArrayList arrayList, l5c l5cVar) {
        String M0 = k96.M0(2131752671, null);
        String M02 = k96.M0(2131752658, null);
        c4c c4cVar = new c4c(2);
        c4cVar.m = M0;
        c4cVar.p = M02;
        c4cVar.n = "RestrictedEmoji";
        c4cVar.o = "📝";
        arrayList.add(c4cVar);
        l5cVar.V();
        ox8 f2 = ox8.f(this.currentAccount);
        ArrayList arrayList2 = f2.b;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (i2 == 0 && !"hello".equalsIgnoreCase(((nx8) arrayList2.get(i4)).b)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i3 == 0 && !"away".equalsIgnoreCase(((nx8) arrayList2.get(i4)).b)) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i2 != 0 && i3 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i2 ^ 1) + (i3 ^ 1) < na7.q1(f2.a).k4.a2.f()) {
            c4c c = c4c.c(1, 2131232427, k96.M0(2131752670, null));
            c.r = true;
            arrayList.add(c);
        }
        this.d = l5cVar.M();
        ArrayList arrayList3 = ox8.f(this.currentAccount).b;
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            nx8 nx8Var = (nx8) obj;
            c4c c4cVar2 = new c4c(16);
            c4cVar2.H = nx8Var;
            c4cVar2.L(this.b.contains(Integer.valueOf(nx8Var.a)));
            arrayList.add(c4cVar2);
        }
        l5cVar.L();
        l5cVar.U();
        arrayList.add(c4c.C(k96.M0(2131752669, null)));
    }

    public final void f0(c4c c4cVar, View view) {
        if (c4cVar.d == 1) {
            g0(getParentActivity(), this.currentAccount, null, null, getResourceProvider(), new zf7(this, (byte) 24));
        } else if (c4cVar.a == 16 && (c4cVar.H instanceof nx8)) {
            if (!this.b.isEmpty()) {
                h0(c4cVar, view);
                return;
            }
            nx8 nx8Var = (nx8) c4cVar.H;
            if (!nx8Var.g) {
                Bundle j = ls6.j(5, "chatMode");
                j.putLong("user_id", getUserConfig().e());
                j.putString("quick_reply", nx8Var.b);
                mu1 mu1Var = new mu1(j);
                mu1Var.Bb(nx8Var.a);
                presentFragment(mu1Var);
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(c4c c4cVar, View view) {
        boolean z;
        nx8 nx8Var = (nx8) c4cVar.H;
        jx8 jx8Var = (jx8) view;
        Integer valueOf = Integer.valueOf(nx8Var.a);
        ArrayList arrayList = this.b;
        boolean contains = arrayList.contains(valueOf);
        int i = nx8Var.a;
        if (contains) {
            arrayList.remove(Integer.valueOf(i));
        } else {
            arrayList.add(Integer.valueOf(i));
        }
        this.a.z1(!arrayList.isEmpty());
        boolean contains2 = arrayList.contains(Integer.valueOf(nx8Var.a));
        c4cVar.e = contains2;
        jx8Var.d.a(contains2, true);
        if (this.simpleActionBar.x() == arrayList.isEmpty()) {
            boolean isEmpty = arrayList.isEmpty();
            pha phaVar = this.simpleActionBar;
            if (isEmpty) {
                phaVar.w();
            } else {
                phaVar.J();
            }
        }
        this.simpleActionBar.E(Math.max(1, arrayList.size()), true);
        boolean z2 = false;
        if (arrayList.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nx8 c = ox8.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c != null && !ox8.g(c.b)) {
                z2 = true;
            }
            z = z2;
        }
        if (this.e != z) {
            this.e = z;
            this.c.Y(z, true);
        }
    }

    public final void i0(int i, ArrayList arrayList) {
        if (i == this.d) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((c4c) arrayList.get(i2)).H instanceof nx8) {
                    ((nx8) ((c4c) arrayList.get(i2)).H).c = i2;
                }
            }
            ox8 f2 = ox8.f(this.currentAccount);
            ArrayList arrayList2 = f2.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < arrayList2.size(); i3 = tb4.g(((nx8) arrayList2.get(i3)).a, i3, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new fx7((byte) 9));
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (((nx8) arrayList2.get(i4)).a != ((Integer) arrayList3.get(i4)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i5 = 0; i5 < arrayList2.size(); i5 = tb4.g(((nx8) arrayList2.get(i5)).a, i5, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f2.a).sendRequest(tL_messages_reorderQuickReplies, new ce2((byte) 5));
                    f2.l();
                    return;
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.E1);
        ox8.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.E1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
