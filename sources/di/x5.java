package di;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ab;
import c8.ha;
import c8.ka;
import java.util.Locale;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qv;
public final class x5 extends org.telegram.ui.ActionBar.v2 {
    public static final int n1 = 0;
    public final ug.p0 f9929i1;
    public boolean f9930j1;
    public final int f9931k1;
    public qv l1;
    public final ab f9932m1;

    public x5(Context context, float f10, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.f9932m1 = new ab(this, 23);
        this.f9931k1 = i7;
        w5 w5Var = new w5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.l6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.l6.L(L, org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.s6.j(imageView, L2, M, null, null);
        imageView.setImageResource(2131231616);
        w5Var.addView(imageView, ha.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        w5Var.addView(linearLayout, ha.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.l6.G6, g6Var, null, 2131744878);
        linearLayout.addView(textView, ha.r(-2, -2, 1));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        l5Var.setTextSize(14);
        l5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        l5Var.setMaxLines(100);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        if (p10.i(this.f28621a).q()) {
            l5Var.l(id.M0(2131744883, null), false);
        } else {
            l5Var.l(id.M0(2131744879, null), false);
        }
        linearLayout.addView(l5Var, ha.t(-2, -2, 1, 36, 10, 36, 0));
        bi.s1 s1Var = new bi.s1(this, getContext());
        ((ImageView) s1Var.d).setImageResource(2131232380);
        ((TextView) s1Var.f4662b).setText(id.M0(2131749311, null));
        ((TextView) s1Var.f4663c).setText(id.M0(2131749310, null));
        linearLayout.addView(s1Var, ha.t(-1, -2, 0, 0, 20, 0, 0));
        bi.s1 s1Var2 = new bi.s1(this, getContext());
        ((ImageView) s1Var2.d).setImageResource(2131232379);
        ((TextView) s1Var2.f4662b).setText(id.M0(2131749318, null));
        ((TextView) s1Var2.f4663c).setText(id.M0(2131749317, null));
        linearLayout.addView(s1Var2, ha.t(-1, -2, 0, 0, 10, 0, 0));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(8.0f), context, g6Var, true);
        this.f9929i1 = p0Var;
        p0Var.J = false;
        p0Var.h.getDrawable().D = false;
        p0Var.setIcon(2131624314);
        ka.a(p0Var);
        TLRPC.User f11 = p10.i(this.f28621a).f();
        if (!f11.premium) {
            p0Var.setIcon(2131624314);
            p0Var.b(id.M0(2131743851, null), new ah.d(this, 16), false);
        } else {
            J0(false);
        }
        linearLayout.addView(p0Var, ha.t(-1, 48, 80, 14, 24, 14, 16));
        this.N = w5Var;
        p0Var.setOnClickListener(new u5(this, f11, i7, g6Var, 0));
    }

    public static void I0() {
        hc X;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            X = new hc(Q.getLastStoryViewer().f9634s, Q.getLastStoryViewer().D);
        } else {
            X = hc.X();
        }
        if (X != null) {
            String M0 = id.M0(2131744881, null);
            String M02 = id.M0(2131744880, null);
            yb ybVar = new yb(X.W(), X.f34273c);
            ybVar.f40692a.setImageResource(2131232393);
            ybVar.f40693b.setText(M0);
            TextView textView = ybVar.f40694c;
            textView.setText(M02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(ybVar, 5000).j();
        }
    }

    public final void J0(boolean z9) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = qp.s1(this.f28621a).P1().B;
        ug.p0 p0Var = this.f9929i1;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.f28621a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f9930j1 = true;
            p0Var.c(id.M0(2131744882, null), true, z9);
            org.telegram.ui.ActionBar.s6.Y(p0Var.h, org.telegram.ui.ActionBar.l6.Gi, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.f28621a).getCurrentTime();
            int i7 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i7) {
                long currentTime2 = i7 - ConnectionsManager.getInstance(this.f28621a).getCurrentTime();
                int i10 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j3 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i10)));
                p0Var.c(id.a0("AvailableIn", null, 2131753760, sb2.toString()), true, z9);
                ug.o0 o0Var = p0Var.h;
                org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(org.telegram.ui.ActionBar.l6.Gi, 125);
                org.telegram.ui.ActionBar.s6.m(o0Var, g10.f28350a, -1, 1, g10.d, null);
                ab abVar = this.f9932m1;
                org.telegram.messenger.g0.r(abVar);
                org.telegram.messenger.g0.i3(abVar, 1000L);
                return;
            }
        }
        int i11 = this.f9931k1;
        if (i11 == 0) {
            p0Var.c(id.M0(2131751146, null), true, z9);
        } else if (i11 == 1) {
            p0Var.c(id.M0(2131751145, null), true, z9);
        }
        org.telegram.ui.ActionBar.s6.Y(p0Var.h, org.telegram.ui.ActionBar.l6.Gi, null);
    }
}
