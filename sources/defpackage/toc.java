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
public final class toc extends n5c implements gk7 {
    public final ArrayList e = new ArrayList();
    public boolean f;

    public static LinearLayout h0(Activity activity, wjb wjbVar, int i, String str) {
        LinearLayout m = ir2.m(activity, 0);
        m.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = bkb.F6;
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i);
        m.addView(imageView, nme.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, i2, wjbVar);
        textView.setText(gl.S2(str));
        m.addView(textView, nme.p(-1, -2, 1.0f, 16));
        return m;
    }

    public static LinearLayout i0(int i, int i2, wjb wjbVar, Context context, ArrayList arrayList) {
        LinearLayout j = de9.j(context, 1);
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
            zkb.X(textView, bkb.y6, wjbVar);
            StringBuilder sb = new StringBuilder();
            int i5 = i3 + 1;
            sb.append(i5);
            sb.append(".");
            textView.setText(sb.toString());
            TextView m = ug8.m(linearLayout, textView, nme.t(26, -2, 8388613, 0, 0, 6, 0), context);
            m.setTextSize(1, 15.0f);
            m.setTypeface(gl.o());
            m.setIncludeFontPadding(false);
            m.setLineSpacing(0.0f, 1.0f);
            zkb.X(m, bkb.F6, wjbVar);
            m.setText((CharSequence) arrayList.get(i3));
            linearLayout.addView(m, nme.o(-2, -2));
            if (i3 != i) {
                i4 = 10;
            }
            j.addView(linearLayout, nme.t(-2, -2, 8388611, 0, i4, 0, 0));
            i3 = i5;
        }
        return j;
    }

    public static void j0(Activity activity, ArrayList arrayList, wjb wjbVar, mhc mhcVar) {
        fx0 fx0Var;
        fx0 i = ug8.i(activity, false, 1, wjbVar);
        LinearLayout m = ir2.m(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, gl.L(24.0f), 0, 0);
        be0 be0Var = new be0(activity);
        be0Var.setAspectFit(true);
        be0Var.getImageReceiver().d = gl.t0();
        hq6.d0(gl.t0()).e2(be0Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(be0Var, nme.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        ug8.x(textView, bkb.F6, wjbVar, null, 2131742692);
        linearLayout.addView(textView, nme.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        ug8.x(textView2, bkb.y6, wjbVar, null, 2131742774);
        textView2.setMaxWidth(gl.L(330.0f));
        textView2.setPadding(gl.L(12.0f), gl.L(4.0f), gl.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, nme.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout i0 = i0(0, size, wjbVar, activity, arrayList);
        LinearLayout i02 = i0(size, arrayList.size(), wjbVar, activity, arrayList);
        linearLayout3.addView(i0, nme.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), nme.o(10, 0));
        linearLayout3.addView(i02, nme.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, nme.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, nme.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        m.addView(linearLayout, nme.o(-1, -2));
        u41 u41Var = new u41(wjbVar, activity, true);
        u41Var.setRoundRadius(24);
        m.addView(u41Var, nme.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        i.O = m;
        i.K();
        if (mhcVar != null) {
            int i2 = bkb.p7;
            u41Var.setColor(bkb.v0(i2, wjbVar));
            if (u41Var.getBackground() != null) {
                Drawable background = u41Var.getBackground();
                vkb M = zkb.M(i2);
                u41Var.setBackground(background);
                zkb.j(u41Var, background, M, null, wjbVar);
            }
            u41Var.setText(k96.M0(2131742899, null));
            fx0Var = i;
            u41Var.setOnClickListener(new ee(activity, wjbVar, mhcVar, fx0Var, (byte) 18));
        } else {
            fx0Var = i;
            u41Var.setText(k96.M0(2131742885, null));
            u41Var.setOnClickListener(new dh(fx0Var, (byte) 8));
        }
        fx0Var.show();
    }

    public static void k0(Activity activity, wjb wjbVar, p8c p8cVar) {
        fx0 i = ug8.i(activity, false, 1, wjbVar);
        LinearLayout m = ir2.m(activity, 1);
        m.setPadding(0, 0, 0, gl.L(8.0f));
        LinearLayout m2 = ir2.m(activity, 1);
        m2.setPadding(gl.L(36.0f), 0, gl.L(36.0f), 0);
        otb otbVar = new otb(activity, wjbVar);
        otbVar.setPadding(gl.L(0.0f), gl.L(24.0f), gl.L(0.0f), gl.L(4.0f));
        otbVar.setEmojiSize(100);
        be0 be0Var = otbVar.b;
        be0Var.getImageReceiver().d = gl.t0();
        hq6.d0(gl.t0()).e2(be0Var, "RestrictedEmoji", "📝", "100_100");
        m2.addView(otbVar, nme.r(-1, -2, 7));
        String M0 = k96.M0(2131742771, null);
        l46 l46Var = otbVar.c;
        CharSequence m3 = vu3.m(M0, l46Var.getPaint().getFontMetricsInt(), false, null, 0);
        String M02 = k96.M0(2131742772, null);
        l46 l46Var2 = otbVar.d;
        otbVar.a(m3, vu3.m(M02, l46Var2.getPaint().getFontMetricsInt(), false, null, 0));
        zkb.X(l46Var, bkb.F6, wjbVar);
        zkb.X(l46Var2, bkb.y6, wjbVar);
        kk7.i(l46Var);
        kk7.i(l46Var2);
        m2.addView(h0(activity, wjbVar, 2131232834, k96.M0(2131742770, null)));
        m2.addView(h0(activity, wjbVar, 2131232838, k96.M0(2131742775, null)));
        m2.addView(h0(activity, wjbVar, 2131232836, k96.M0(2131742769, null)));
        m.addView(m2, nme.o(-1, -2));
        u41 u41Var = new u41(wjbVar, activity, true);
        u41Var.setRoundRadius(24);
        u41Var.i(k96.M0(2131742773, null), false, true);
        m.addView(u41Var, nme.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        i.O = m;
        i.K();
        u41Var.setOnClickListener(new ee(u41Var, p8cVar, i, wjbVar, (byte) 19));
        i.show();
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131742836, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        int i = c4cVar.d;
        if (i == 1) {
            c C = c.C(this.currentAccount);
            if (C.f()) {
                noc nocVar = new noc();
                nocVar.s = C.D();
                presentFragment(nocVar);
                return;
            }
            k0(getParentActivity(), getResourceProvider(), new ooc(this, (byte) 0));
        } else if (i == 3) {
            c C2 = c.C(this.currentAccount);
            hd hdVar = new hd(3, null, getParentActivity());
            hdVar.q(500L);
            p pVar = new p(this, hdVar, C2, (byte) 27);
            c.O("emulate disable backup: when ready");
            vc4 vc4Var = new vc4(C2, pVar, (byte) 19);
            if (C2.M() && C2.f != null) {
                vc4Var.run();
            } else {
                C2.x.add(new WeakReference(vc4Var));
            }
        } else if (i == 2) {
            c C3 = c.C(this.currentAccount);
            ooc oocVar = new ooc(this, (byte) 1);
            c.O("enable backup: when ready...");
            C3.x0(new vc4(C3, oocVar, (byte) 17));
        } else if (i == 4) {
            Activity parentActivity = getParentActivity();
            String M0 = k96.M0(2131742895, null);
            String M02 = k96.M0(2131742896, null);
            boolean z = w01.a;
            hd f0 = ij.f0(parentActivity, M0, M02, null, k96.M0(2131742898, null), new ooc(this, (byte) 2), getResourceProvider(), false);
            TextView textView = (TextView) f0.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, f0.j1);
            }
        } else if (c4cVar.H(roc.class)) {
            String charSequence = c4cVar.m.toString();
            k0(getParentActivity(), getResourceProvider(), new au0(this, c.C(this.currentAccount), charSequence, new g15(this.currentAccount, getParentActivity(), charSequence), (byte) 23));
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    public final void c0() {
        hmc.L0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    public final void d0(Boolean bool) {
        c C = c.C(this.currentAccount);
        if (bool.booleanValue()) {
            boolean z = w01.a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        alertDialog$Builder.a.S = k96.M0(2131742767, null);
        alertDialog$Builder.j(k96.M0(2131742908, null), new io9(this, bool, C, (byte) 13));
        alertDialog$Builder.g(k96.M0(2131742848, null), new cwb(this, bool, (byte) 8));
        alertDialog$Builder.o();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        if (i == kk7.c4 && (vaVar = this.a) != null) {
            vaVar.g3.O(true);
        }
    }

    public final void e0(p8c p8cVar, g15 g15Var, y05 y05Var) {
        if (y05Var == null) {
            p8cVar.a("STORAGE_FAILED");
            return;
        }
        p8cVar.a(null);
        ArrayList f = y05Var.f();
        Activity parentActivity = getParentActivity();
        wjb wjbVar = this.resourceProvider;
        boolean z = w01.a;
        j0(parentActivity, f, wjbVar, new mhc(this, g15Var, (byte) 22));
    }

    public final void f0(p8c p8cVar, y05 y05Var, String str) {
        if (str != null) {
            p8cVar.a(str);
        } else if (y05Var == null) {
            p8cVar.a("WORDS_NULL");
        } else {
            p8cVar.a(null);
            j0(getParentActivity(), y05Var.f(), this.resourceProvider, null);
        }
    }

    public final void g0(p8c p8cVar) {
        c.C(this.currentAccount).E(true, false, false, new w77(this, p8cVar, (byte) 18));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.c4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.c4);
        this.f = true;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((v05) obj).close();
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
