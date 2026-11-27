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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class w09 extends e implements fn7 {
    public static id f;
    public q9c a;
    public final ArrayList b;
    public sla c;
    public int d;
    public boolean e;

    public w09() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    public static int Y(w09 w09Var) {
        return w09Var.currentAccount;
    }

    public static int Z(w09 w09Var) {
        return w09Var.currentAccount;
    }

    public static vnb a0(w09 w09Var) {
        return w09Var.resourceProvider;
    }

    public static void g0(Activity activity, int i, String str, a19 a19Var, vnb vnbVar, pcc pccVar) {
        View view;
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        int i2;
        String str2;
        int i3;
        ?? r10;
        e Q = LaunchActivity.Q();
        Activity W = hl.W(activity);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof wma) && ((wma) Q.getFragmentView()).Q() > hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        id[] idVarArr = new id[1];
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, activity);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (a19Var == null && str == null) {
            i2 = 2131752640;
        } else {
            i2 = 2131752654;
        }
        String M0 = ob6.M0(i2, null);
        id idVar = alertDialog$Builder2.a;
        idVar.S = M0;
        final f42 f42Var = new f42(activity, vnbVar);
        ls6.d0(i).O(hl.F0(), true);
        f42Var.setTextSize(1, 18.0f);
        if (a19Var == null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = a19Var.b;
        }
        f42Var.setText(str2);
        int i4 = aob.j5;
        yob.X(f42Var, i4, vnbVar);
        yob.l(f42Var, 34, aob.Oi, vnbVar);
        f42Var.setHintText(ob6.M0(2131752642, null));
        f42Var.setSingleLine(true);
        f42Var.setFocusable(true);
        yob.F(f42Var, aob.k6, aob.l6, aob.p7, vnbVar);
        f42Var.setImeOptions(6);
        f42Var.setBackgroundDrawable(null);
        f42Var.setPadding(0, 0, hl.L(42.0f), 0);
        f42Var.setFilters(new InputFilter[]{new jc6((byte) 1)});
        LinearLayout m = bs2.m(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        yob.X(textView, i4, vnbVar);
        textView.setTextSize(1, 16.0f);
        if (a19Var == null && str == null) {
            i3 = 2131752641;
        } else {
            i3 = 2131752655;
        }
        textView.setText(ob6.M0(i3, null));
        frameLayout.addView(textView, tre.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        yob.X(textView2, aob.q7, vnbVar);
        bs2.r(16.0f, 1, 2131752643, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, tre.e(-1, -2, 83));
        ku0 ku0Var = new ku0(r1, new ValueAnimator[1], textView2, textView, (byte) 16);
        Runnable[] runnableArr = {new uk8(ku0Var, (byte) 21)};
        f42Var.addTextChangedListener(new ry(textView2, runnableArr, false, (byte) 10));
        m.addView(frameLayout, tre.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        m.addView(f42Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(m);
        idVar.a = hl.L(292.0f);
        f42Var.setOnEditorActionListener(new t09(f42Var, i, a19Var, textView2, ku0Var, pccVar, idVarArr, view));
        alertDialog$Builder2.j(ob6.M0(2131751319, null), new zz5(f42Var, ku0Var, i, a19Var, textView2, pccVar));
        alertDialog$Builder2.g(ob6.M0(2131752570, null), new iy8((byte) 5));
        if (z) {
            f = idVar;
            r10 = 0;
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new i41(view, (byte) 2));
            f.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    f42 f42Var2 = f42Var;
                    switch (b) {
                        case 0:
                            f42Var2.requestFocus();
                            hl.E3(f42Var2);
                            return;
                        default:
                            f42Var2.requestFocus();
                            hl.E3(f42Var2);
                            return;
                    }
                }
            });
            f.q(250L);
        } else {
            r10 = 0;
            idVar.P = new ii7(f42Var, (byte) 25);
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new dl8(f42Var, (byte) 3));
            idVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    f42 f42Var2 = f42Var;
                    switch (b) {
                        case 0:
                            f42Var2.requestFocus();
                            hl.E3(f42Var2);
                            return;
                        default:
                            f42Var2.requestFocus();
                            hl.E3(f42Var2);
                            return;
                    }
                }
            });
            idVarArr[0].show();
        }
        idVarArr[r10].k0 = r10;
        f42Var.setSelection(f42Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setTitle(ob6.M0(2131752664, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 7));
        rla r = this.simpleActionBar.r();
        sla a = r.a(1, 2131232121);
        this.c = a;
        a.setContentDescription(ob6.M0(2131751300, null));
        r.a(2, 2131232113).setContentDescription(ob6.M0(2131751563, null));
        b84 b84Var = new b84(context, null, (byte) 2);
        q9c q9cVar = new q9c(this, new icc(this) {
            public final w09 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                byte b = r2;
                w09 w09Var = this.b;
                switch (b) {
                    case 0:
                        w09Var.e0((ArrayList) obj, (l9c) obj2);
                        return;
                    default:
                        w09Var.i0(((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new r09(this), new r09(this));
        this.a = q9cVar;
        q9cVar.s1();
        this.a.setSectionsDrawBackground(true);
        q9c q9cVar2 = this.a;
        q9cVar2.g3.r = false;
        q9cVar2.F1(new icc(this) {
            public final w09 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                byte b = r2;
                w09 w09Var = this.b;
                switch (b) {
                    case 0:
                        w09Var.e0((ArrayList) obj, (l9c) obj2);
                        return;
                    default:
                        w09Var.i0(((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        b84Var.addView(this.a, tre.c(-1.0f, -1));
        this.fragmentView = b84Var;
        return b84Var;
    }

    public final void d0() {
        this.b.clear();
        hl.d0(this.a, new bm0((byte) 23));
        this.simpleActionBar.y();
        this.a.A1(false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q9c q9cVar;
        l9c l9cVar;
        if (i == jn7.F1 && (q9cVar = this.a) != null && (l9cVar = q9cVar.g3) != null) {
            l9cVar.O(true);
        }
    }

    public final void e0(ArrayList arrayList, l9c l9cVar) {
        String M0 = ob6.M0(2131752664, null);
        String M02 = ob6.M0(2131752651, null);
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.p = M02;
        b8cVar.n = "RestrictedEmoji";
        b8cVar.o = "📝";
        arrayList.add(b8cVar);
        l9cVar.V();
        b19 f2 = b19.f(this.currentAccount);
        ArrayList arrayList2 = f2.b;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (i2 == 0 && !"hello".equalsIgnoreCase(((a19) arrayList2.get(i4)).b)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i3 == 0 && !"away".equalsIgnoreCase(((a19) arrayList2.get(i4)).b)) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i2 != 0 && i3 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i2 ^ 1) + (i3 ^ 1) < uc7.s1(f2.a).k4.i2.f()) {
            b8c c = b8c.c(1, 2131232427, ob6.M0(2131752663, null));
            c.r = true;
            arrayList.add(c);
        }
        this.d = l9cVar.M();
        ArrayList arrayList3 = b19.f(this.currentAccount).b;
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            a19 a19Var = (a19) obj;
            b8c b8cVar2 = new b8c(16);
            b8cVar2.H = a19Var;
            b8cVar2.L(this.b.contains(Integer.valueOf(a19Var.a)));
            arrayList.add(b8cVar2);
        }
        l9cVar.L();
        l9cVar.U();
        arrayList.add(b8c.C(ob6.M0(2131752662, null)));
    }

    public final void f0(b8c b8cVar, View view) {
        if (b8cVar.d == 1) {
            g0(getParentActivity(), this.currentAccount, null, null, getResourceProvider(), new ii7(this, (byte) 24));
        } else if (b8cVar.a == 16 && (b8cVar.H instanceof a19)) {
            if (!this.b.isEmpty()) {
                h0(b8cVar, view);
                return;
            }
            a19 a19Var = (a19) b8cVar.H;
            if (!a19Var.g) {
                Bundle j = qu6.j(5, "chatMode");
                j.putLong("user_id", getUserConfig().e());
                j.putString("quick_reply", a19Var.b);
                zu1 zu1Var = new zu1(j);
                zu1Var.Mb(a19Var.a);
                presentFragment(zu1Var);
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(b8c b8cVar, View view) {
        boolean z;
        a19 a19Var = (a19) b8cVar.H;
        v09 v09Var = (v09) view;
        Integer valueOf = Integer.valueOf(a19Var.a);
        ArrayList arrayList = this.b;
        boolean contains = arrayList.contains(valueOf);
        int i = a19Var.a;
        if (contains) {
            arrayList.remove(Integer.valueOf(i));
        } else {
            arrayList.add(Integer.valueOf(i));
        }
        this.a.A1(!arrayList.isEmpty());
        boolean contains2 = arrayList.contains(Integer.valueOf(a19Var.a));
        b8cVar.e = contains2;
        v09Var.d.a(contains2, true);
        if (this.simpleActionBar.z() == arrayList.isEmpty()) {
            boolean isEmpty = arrayList.isEmpty();
            jla jlaVar = this.simpleActionBar;
            if (isEmpty) {
                jlaVar.y();
            } else {
                jlaVar.L();
            }
        }
        this.simpleActionBar.H(Math.max(1, arrayList.size()), true);
        boolean z2 = false;
        if (arrayList.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a19 c = b19.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c != null && !b19.g(c.b)) {
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
                if (((b8c) arrayList.get(i2)).H instanceof a19) {
                    ((a19) ((b8c) arrayList.get(i2)).H).c = i2;
                }
            }
            b19 f2 = b19.f(this.currentAccount);
            ArrayList arrayList2 = f2.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < arrayList2.size(); i3 = qd4.g(((a19) arrayList2.get(i3)).a, i3, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new qq7((byte) 12));
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (((a19) arrayList2.get(i4)).a != ((Integer) arrayList3.get(i4)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i5 = 0; i5 < arrayList2.size(); i5 = qd4.g(((a19) arrayList2.get(i5)).a, i5, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f2.a).sendRequest(tL_messages_reorderQuickReplies, new xe2((byte) 5));
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
        getNotificationCenter().b(this, jn7.F1);
        b19.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.F1);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
