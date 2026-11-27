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
public final class gtc extends n9c implements fn7 {
    public final ArrayList e = new ArrayList();
    public boolean f;

    public static LinearLayout h0(Activity activity, vnb vnbVar, int i, String str) {
        LinearLayout m = bs2.m(activity, 0);
        m.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = aob.G6;
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i);
        m.addView(imageView, tre.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 14.0f);
        yob.X(textView, i2, vnbVar);
        textView.setText(hl.S2(str));
        m.addView(textView, tre.p(-1, -2, 1.0f, 16));
        return m;
    }

    public static LinearLayout i0(int i, int i2, vnb vnbVar, Context context, ArrayList arrayList) {
        LinearLayout j = uh9.j(context, 1);
        int i3 = i;
        while (i3 < i2) {
            LinearLayout linearLayout = new LinearLayout(context);
            int i4 = 0;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(8388613);
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(0.0f, 1.0f);
            yob.X(textView, aob.z6, vnbVar);
            StringBuilder sb = new StringBuilder();
            int i5 = i3 + 1;
            sb.append(i5);
            sb.append(".");
            textView.setText(sb.toString());
            TextView m = ik8.m(linearLayout, textView, tre.t(26, -2, 8388613, 0, 0, 6, 0), context);
            m.setTextSize(1, 15.0f);
            m.setTypeface(hl.o());
            m.setIncludeFontPadding(false);
            m.setLineSpacing(0.0f, 1.0f);
            yob.X(m, aob.G6, vnbVar);
            m.setText((CharSequence) arrayList.get(i3));
            linearLayout.addView(m, tre.o(-2, -2));
            if (i3 != i) {
                i4 = 10;
            }
            j.addView(linearLayout, tre.t(-2, -2, 8388611, 0, i4, 0, 0));
            i3 = i5;
        }
        return j;
    }

    public static void j0(Activity activity, ArrayList arrayList, vnb vnbVar, slc slcVar) {
        nx0 nx0Var;
        nx0 i = ik8.i(activity, false, 1, vnbVar);
        LinearLayout m = bs2.m(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, hl.L(24.0f), 0, 0);
        de0 de0Var = new de0(activity);
        de0Var.setAspectFit(true);
        de0Var.getImageReceiver().d = hl.t0();
        ls6.d0(hl.t0()).e2(de0Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(de0Var, tre.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        ik8.x(textView, aob.G6, vnbVar, null, 2131742586);
        linearLayout.addView(textView, tre.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        ik8.x(textView2, aob.z6, vnbVar, null, 2131742668);
        textView2.setMaxWidth(hl.L(330.0f));
        textView2.setPadding(hl.L(12.0f), hl.L(4.0f), hl.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, tre.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout i0 = i0(0, size, vnbVar, activity, arrayList);
        LinearLayout i02 = i0(size, arrayList.size(), vnbVar, activity, arrayList);
        linearLayout3.addView(i0, tre.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), tre.o(10, 0));
        linearLayout3.addView(i02, tre.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, tre.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, tre.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        m.addView(linearLayout, tre.o(-1, -2));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.setRoundRadius(24);
        m.addView(c51Var, tre.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        i.O = m;
        i.J();
        if (slcVar != null) {
            int i2 = aob.q7;
            c51Var.setColor(aob.v0(i2, vnbVar));
            if (c51Var.getBackground() != null) {
                Drawable background = c51Var.getBackground();
                uob M = yob.M(i2);
                c51Var.setBackground(background);
                yob.j(c51Var, background, M, null, vnbVar);
            }
            c51Var.setText(ob6.M0(2131742793, null));
            nx0Var = i;
            c51Var.setOnClickListener(new cg(activity, vnbVar, slcVar, nx0Var, (byte) 18));
        } else {
            nx0Var = i;
            c51Var.setText(ob6.M0(2131742779, null));
            c51Var.setOnClickListener(new rg(nx0Var, (byte) 8));
        }
        nx0Var.show();
    }

    public static void k0(Activity activity, vnb vnbVar, pcc pccVar) {
        nx0 i = ik8.i(activity, false, 1, vnbVar);
        LinearLayout m = bs2.m(activity, 1);
        m.setPadding(0, 0, 0, hl.L(8.0f));
        LinearLayout m2 = bs2.m(activity, 1);
        m2.setPadding(hl.L(36.0f), 0, hl.L(36.0f), 0);
        pxb pxbVar = new pxb(activity, vnbVar);
        pxbVar.setPadding(hl.L(0.0f), hl.L(24.0f), hl.L(0.0f), hl.L(4.0f));
        pxbVar.setEmojiSize(100);
        de0 de0Var = pxbVar.b;
        de0Var.getImageReceiver().d = hl.t0();
        ls6.d0(hl.t0()).e2(de0Var, "RestrictedEmoji", "📝", "100_100");
        m2.addView(pxbVar, tre.r(-1, -2, 7));
        String M0 = ob6.M0(2131742665, null);
        p66 p66Var = pxbVar.c;
        CharSequence m3 = pv3.m(M0, p66Var.getPaint().getFontMetricsInt(), false, null, 0);
        String M02 = ob6.M0(2131742666, null);
        p66 p66Var2 = pxbVar.d;
        pxbVar.a(m3, pv3.m(M02, p66Var2.getPaint().getFontMetricsInt(), false, null, 0));
        yob.X(p66Var, aob.G6, vnbVar);
        yob.X(p66Var2, aob.z6, vnbVar);
        jn7.i(p66Var);
        jn7.i(p66Var2);
        m2.addView(h0(activity, vnbVar, 2131232853, ob6.M0(2131742664, null)));
        m2.addView(h0(activity, vnbVar, 2131232857, ob6.M0(2131742669, null)));
        m2.addView(h0(activity, vnbVar, 2131232855, ob6.M0(2131742663, null)));
        m.addView(m2, tre.o(-1, -2));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.setRoundRadius(24);
        c51Var.i(ob6.M0(2131742667, null), false, true);
        m.addView(c51Var, tre.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        i.O = m;
        i.J();
        c51Var.setOnClickListener(new cg(c51Var, pccVar, i, vnbVar, (byte) 19));
        i.show();
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131742730, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        int i = b8cVar.d;
        if (i == 1) {
            c C = c.C(this.currentAccount);
            if (C.f()) {
                atc atcVar = new atc();
                atcVar.s = C.D();
                presentFragment(atcVar);
                return;
            }
            k0(getParentActivity(), getResourceProvider(), new btc(this, (byte) 0));
        } else if (i == 3) {
            c C2 = c.C(this.currentAccount);
            id idVar = new id(3, null, getParentActivity());
            idVar.q(500L);
            p pVar = new p(this, idVar, C2, (byte) 28);
            c.P("emulate disable backup: when ready");
            se4 se4Var = new se4(C2, pVar, (byte) 16);
            if (C2.M() && C2.f != null) {
                se4Var.run();
            } else {
                C2.x.add(new WeakReference(se4Var));
            }
        } else if (i == 2) {
            c C3 = c.C(this.currentAccount);
            btc btcVar = new btc(this, (byte) 1);
            c.P("enable backup: when ready...");
            C3.A0(new se4(C3, btcVar, (byte) 14));
        } else if (i == 4) {
            Activity parentActivity = getParentActivity();
            String M0 = ob6.M0(2131742789, null);
            String M02 = ob6.M0(2131742790, null);
            boolean z = f11.a;
            id f0 = jj.f0(parentActivity, M0, M02, null, ob6.M0(2131742792, null), new btc(this, (byte) 2), getResourceProvider(), false);
            TextView textView = (TextView) f0.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, f0.j1);
            }
        } else if (b8cVar.H(etc.class)) {
            String charSequence = b8cVar.m.toString();
            k0(getParentActivity(), getResourceProvider(), new ku0(this, c.C(this.currentAccount), charSequence, new k35(this.currentAccount, getParentActivity(), charSequence), (byte) 23));
        }
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    public final void c0() {
        uqc.L0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.s1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    public final void d0(Boolean bool) {
        c C = c.C(this.currentAccount);
        if (bool.booleanValue()) {
            boolean z = f11.a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        alertDialog$Builder.a.S = ob6.M0(2131742661, null);
        alertDialog$Builder.j(ob6.M0(2131742802, null), new o48(this, bool, C, (byte) 22));
        alertDialog$Builder.g(ob6.M0(2131742742, null), new yw9(this, bool, (byte) 24));
        alertDialog$Builder.o();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wa waVar;
        if (i == jn7.d4 && (waVar = this.a) != null) {
            waVar.g3.O(true);
        }
    }

    public final void e0(pcc pccVar, k35 k35Var, c35 c35Var) {
        if (c35Var == null) {
            pccVar.a("STORAGE_FAILED");
            return;
        }
        pccVar.a(null);
        ArrayList f = c35Var.f();
        Activity parentActivity = getParentActivity();
        vnb vnbVar = this.resourceProvider;
        boolean z = f11.a;
        j0(parentActivity, f, vnbVar, new slc(this, k35Var, (byte) 22));
    }

    public final void f0(pcc pccVar, c35 c35Var, String str) {
        if (str != null) {
            pccVar.a(str);
        } else if (c35Var == null) {
            pccVar.a("WORDS_NULL");
        } else {
            pccVar.a(null);
            j0(getParentActivity(), c35Var.f(), this.resourceProvider, null);
        }
    }

    public final void g0(pcc pccVar) {
        c.C(this.currentAccount).E(true, false, false, new ia7(this, pccVar, (byte) 18));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.d4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.d4);
        this.f = true;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((z25) obj).close();
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
