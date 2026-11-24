package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class vqc extends n7c implements jm7 {
    public final ArrayList e = new ArrayList();
    public boolean f;

    public static LinearLayout i0(Activity activity, ylb ylbVar, int i, String str) {
        LinearLayout l = td4.l(activity, 0);
        l.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = cmb.F6;
        anb.s(imageView, i2, ylbVar, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i);
        l.addView(imageView, qoe.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 14.0f);
        anb.X(textView, i2, ylbVar);
        textView.setText(gm.S2(str));
        l.addView(textView, qoe.p(-1, -2, 1.0f, 16));
        return l;
    }

    public static LinearLayout j0(int i, int i2, ylb ylbVar, Context context, ArrayList arrayList) {
        LinearLayout i3 = hg9.i(context, 1);
        int i4 = i;
        while (i4 < i2) {
            LinearLayout linearLayout = new LinearLayout(context);
            int i5 = 0;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(8388613);
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(0.0f, 1.0f);
            anb.X(textView, cmb.y6, ylbVar);
            StringBuilder sb = new StringBuilder();
            int i6 = i4 + 1;
            sb.append(i6);
            sb.append(".");
            textView.setText(sb.toString());
            TextView m = wi8.m(linearLayout, textView, qoe.t(26, -2, 8388613, 0, 0, 6, 0), context);
            m.setTextSize(1, 15.0f);
            m.setTypeface(gm.o());
            m.setIncludeFontPadding(false);
            m.setLineSpacing(0.0f, 1.0f);
            anb.X(m, cmb.F6, ylbVar);
            m.setText((CharSequence) arrayList.get(i4));
            linearLayout.addView(m, qoe.o(-2, -2));
            if (i4 != i) {
                i5 = 10;
            }
            i3.addView(linearLayout, qoe.t(-2, -2, 8388611, 0, i5, 0, 0));
            i4 = i6;
        }
        return i3;
    }

    public static void k0(Activity activity, ArrayList arrayList, ylb ylbVar, qhc qhcVar) {
        my0 my0Var;
        my0 i = wi8.i(activity, false, 1, ylbVar);
        LinearLayout l = td4.l(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, gm.L(24.0f), 0, 0);
        bf0 bf0Var = new bf0(activity);
        bf0Var.setAspectFit(true);
        bf0Var.getImageReceiver().d = gm.t0();
        hs6.d0(gm.t0()).e2(bf0Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(bf0Var, qoe.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(1);
        wi8.x(textView, cmb.F6, ylbVar, null, 2131742618);
        linearLayout.addView(textView, qoe.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        wi8.x(textView2, cmb.y6, ylbVar, null, 2131742700);
        textView2.setMaxWidth(gm.L(330.0f));
        textView2.setPadding(gm.L(12.0f), gm.L(4.0f), gm.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, qoe.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout j0 = j0(0, size, ylbVar, activity, arrayList);
        LinearLayout j02 = j0(size, arrayList.size(), ylbVar, activity, arrayList);
        linearLayout3.addView(j0, qoe.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), qoe.o(10, 0));
        linearLayout3.addView(j02, qoe.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, qoe.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, qoe.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        l.addView(linearLayout, qoe.o(-1, -2));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        l.addView(b61Var, qoe.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        i.O = l;
        i.J();
        if (qhcVar != null) {
            int i2 = cmb.p7;
            b61Var.setColor(cmb.v0(i2, ylbVar));
            if (b61Var.getBackground() != null) {
                Drawable background = b61Var.getBackground();
                wmb M = anb.M(i2);
                b61Var.setBackground(background);
                anb.j(b61Var, background, M, null, ylbVar);
            }
            b61Var.setText(jb6.M0(2131742825, null));
            my0Var = i;
            b61Var.setOnClickListener(new ef(activity, ylbVar, qhcVar, my0Var, (byte) 18));
        } else {
            my0Var = i;
            b61Var.setText(jb6.M0(2131742811, null));
            b61Var.setOnClickListener(new di(my0Var, (byte) 8));
        }
        my0Var.show();
    }

    public static void l0(Activity activity, ylb ylbVar, qac qacVar) {
        my0 i = wi8.i(activity, false, 1, ylbVar);
        LinearLayout l = td4.l(activity, 1);
        l.setPadding(0, 0, 0, gm.L(8.0f));
        LinearLayout l2 = td4.l(activity, 1);
        l2.setPadding(gm.L(36.0f), 0, gm.L(36.0f), 0);
        pvb pvbVar = new pvb(activity, ylbVar);
        pvbVar.setPadding(gm.L(0.0f), gm.L(24.0f), gm.L(0.0f), gm.L(4.0f));
        pvbVar.setEmojiSize(100);
        bf0 bf0Var = pvbVar.b;
        bf0Var.getImageReceiver().d = gm.t0();
        hs6.d0(gm.t0()).e2(bf0Var, "RestrictedEmoji", "📝", "100_100");
        l2.addView(pvbVar, qoe.r(-1, -2, 7));
        String M0 = jb6.M0(2131742697, null);
        l66 l66Var = pvbVar.c;
        CharSequence m = gw3.m(M0, l66Var.getPaint().getFontMetricsInt(), false, null, 0);
        String M02 = jb6.M0(2131742698, null);
        l66 l66Var2 = pvbVar.d;
        pvbVar.a(m, gw3.m(M02, l66Var2.getPaint().getFontMetricsInt(), false, null, 0));
        anb.X(l66Var, cmb.F6, ylbVar);
        anb.X(l66Var2, cmb.y6, ylbVar);
        nm7.i(l66Var);
        nm7.i(l66Var2);
        l2.addView(i0(activity, ylbVar, 2131232847, jb6.M0(2131742696, null)));
        l2.addView(i0(activity, ylbVar, 2131232851, jb6.M0(2131742701, null)));
        l2.addView(i0(activity, ylbVar, 2131232849, jb6.M0(2131742695, null)));
        l.addView(l2, qoe.o(-1, -2));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        b61Var.i(jb6.M0(2131742699, null), false, true);
        l.addView(b61Var, qoe.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        i.O = l;
        i.J();
        b61Var.setOnClickListener(new ef(b61Var, qacVar, i, ylbVar, (byte) 19));
        i.show();
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131742762, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        int i = c6cVar.d;
        if (i == 1) {
            c C = c.C(this.currentAccount);
            if (C.f()) {
                pqc pqcVar = new pqc();
                pqcVar.s = C.D();
                presentFragment(pqcVar);
                return;
            }
            l0(getParentActivity(), getResourceProvider(), new qqc(this, (byte) 0));
        } else if (i == 3) {
            c C2 = c.C(this.currentAccount);
            he heVar = new he(3, null, getParentActivity());
            heVar.q(500L);
            p pVar = new p(this, heVar, C2, (byte) 27);
            c.O("emulate disable backup: when ready");
            ve4 ve4Var = new ve4(C2, pVar, (byte) 20);
            if (C2.M() && C2.f != null) {
                ve4Var.run();
            } else {
                C2.x.add(new WeakReference(ve4Var));
            }
        } else if (i == 2) {
            c C3 = c.C(this.currentAccount);
            qqc qqcVar = new qqc(this, (byte) 1);
            c.O("enable backup: when ready...");
            C3.x0(new ve4(C3, qqcVar, (byte) 18));
        } else if (i == 4) {
            Activity parentActivity = getParentActivity();
            String M0 = jb6.M0(2131742821, null);
            String M02 = jb6.M0(2131742822, null);
            boolean z = e21.a;
            he f0 = ik.f0(parentActivity, M0, M02, null, jb6.M0(2131742824, null), new qqc(this, (byte) 2), getResourceProvider(), false);
            TextView textView = (TextView) f0.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, f0.j1);
            }
        } else if (c6cVar.H(tqc.class)) {
            String charSequence = c6cVar.m.toString();
            l0(getParentActivity(), getResourceProvider(), new jv0(this, c.C(this.currentAccount), charSequence, new g35(this.currentAccount, getParentActivity(), charSequence), (byte) 23));
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    public final void d0() {
        goc.M0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        if (i == nm7.e4 && (vaVar = this.a) != null) {
            vaVar.g3.O(true);
        }
    }

    public final void e0(Boolean bool) {
        c C = c.C(this.currentAccount);
        if (bool.booleanValue()) {
            boolean z = e21.a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        alertDialog$Builder.a.S = jb6.M0(2131742693, null);
        alertDialog$Builder.j(jb6.M0(2131742834, null), new jq9(this, bool, C, (byte) 13));
        alertDialog$Builder.g(jb6.M0(2131742774, null), new uxb(this, bool, (byte) 9));
        alertDialog$Builder.o();
    }

    public final void f0(qac qacVar, g35 g35Var, y25 y25Var) {
        if (y25Var == null) {
            qacVar.a("STORAGE_FAILED");
            return;
        }
        qacVar.a(null);
        ArrayList f = y25Var.f();
        Activity parentActivity = getParentActivity();
        ylb ylbVar = this.resourceProvider;
        boolean z = e21.a;
        k0(parentActivity, f, ylbVar, new qhc(this, g35Var, (byte) 24));
    }

    public final void g0(qac qacVar, y25 y25Var, String str) {
        if (str != null) {
            qacVar.a(str);
        } else if (y25Var == null) {
            qacVar.a("WORDS_NULL");
        } else {
            qacVar.a(null);
            k0(getParentActivity(), y25Var.f(), this.resourceProvider, null);
        }
    }

    public final void h0(qac qacVar) {
        c.C(this.currentAccount).E(true, false, false, new s87(this, qacVar, (byte) 20));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.e4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.e4);
        this.f = true;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((v25) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.a.setPadding(0, 0, 0, i4);
        this.a.setClipToPadding(false);
    }
}
