package fi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.na;
import java.util.Locale;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.tb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pv;
public final class o5 extends org.telegram.ui.ActionBar.u2 {
    public static final int f12118r1 = 0;
    public final ug.q0 f12119m1;
    public boolean n1;
    public final int f12120o1;
    public pv f12121p1;
    public final c1 f12122q1;

    public o5(Context context, float f10, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.f12122q1 = new c1(this, 7);
        this.f12120o1 = i7;
        n5 n5Var = new n5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(imageView, L2, M, null, null);
        imageView.setImageResource(2131231616);
        n5Var.addView(imageView, ja.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        n5Var.addView(linearLayout, ja.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        i5.c.v(textView, 1, 20.0f);
        i20.q(textView, org.telegram.ui.ActionBar.j6.G6, e6Var, null, 2131744878);
        linearLayout.addView(textView, ja.r(-2, -2, 1));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        j5Var.setTextSize(14);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        j5Var.setMaxLines(100);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        if (m10.i(this.f29679a).q()) {
            j5Var.l(hd.M0(2131744883, null), false);
        } else {
            j5Var.l(hd.M0(2131744879, null), false);
        }
        linearLayout.addView(j5Var, ja.t(-2, -2, 1, 36, 10, 36, 0));
        di.e1 e1Var = new di.e1(this, getContext());
        ((ImageView) e1Var.d).setImageResource(2131232381);
        ((TextView) e1Var.f8445b).setText(hd.M0(2131749311, null));
        ((TextView) e1Var.f8446c).setText(hd.M0(2131749310, null));
        linearLayout.addView(e1Var, ja.t(-1, -2, 0, 0, 20, 0, 0));
        di.e1 e1Var2 = new di.e1(this, getContext());
        ((ImageView) e1Var2.d).setImageResource(2131232380);
        ((TextView) e1Var2.f8445b).setText(hd.M0(2131749318, null));
        ((TextView) e1Var2.f8446c).setText(hd.M0(2131749317, null));
        linearLayout.addView(e1Var2, ja.t(-1, -2, 0, 0, 10, 0, 0));
        ug.q0 q0Var = new ug.q0(org.telegram.messenger.g0.L(8.0f), context, e6Var, true);
        this.f12119m1 = q0Var;
        q0Var.K = false;
        q0Var.h.getDrawable().E = false;
        q0Var.setIcon(2131624315);
        na.a(q0Var);
        TLRPC.User f11 = m10.i(this.f29679a).f();
        if (!f11.premium) {
            q0Var.setIcon(2131624315);
            q0Var.b(hd.M0(2131743851, null), new ah.d(this, 22), false);
        } else {
            J0(false);
        }
        linearLayout.addView(q0Var, ja.t(-1, 48, 80, 14, 24, 14, 16));
        this.O = n5Var;
        q0Var.setOnClickListener(new l5(this, f11, i7, e6Var, 0));
    }

    public static void I0() {
        cc X;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            X = new cc(Q.getLastStoryViewer().f11870s, Q.getLastStoryViewer().E);
        } else {
            X = cc.X();
        }
        if (X != null) {
            String M0 = hd.M0(2131744881, null);
            String M02 = hd.M0(2131744880, null);
            tb tbVar = new tb(X.W(), X.f33534c);
            tbVar.f39628a.setImageResource(2131232394);
            tbVar.f39629b.setText(M0);
            TextView textView = tbVar.f39630c;
            textView.setText(M02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(tbVar, 5000).j();
        }
    }

    public final void J0(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = np.s1(this.f29679a).P1().B;
        ug.q0 q0Var = this.f12119m1;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.f29679a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.n1 = true;
            q0Var.c(hd.M0(2131744882, null), true, z10);
            org.telegram.ui.ActionBar.q6.Y(q0Var.h, org.telegram.ui.ActionBar.j6.Ji, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.f29679a).getCurrentTime();
            int i7 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i7) {
                long currentTime2 = i7 - ConnectionsManager.getInstance(this.f29679a).getCurrentTime();
                int i10 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j3 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i10)));
                q0Var.c(hd.a0("AvailableIn", null, 2131753760, sb2.toString()), true, z10);
                ug.p0 p0Var = q0Var.h;
                org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(org.telegram.ui.ActionBar.j6.Ji, 125);
                org.telegram.ui.ActionBar.q6.m(p0Var, g10.f29392a, -1, 1, g10.d, null);
                c1 c1Var = this.f12122q1;
                org.telegram.messenger.g0.r(c1Var);
                org.telegram.messenger.g0.i3(c1Var, 1000L);
                return;
            }
        }
        int i11 = this.f12120o1;
        if (i11 == 0) {
            q0Var.c(hd.M0(2131751146, null), true, z10);
        } else if (i11 == 1) {
            q0Var.c(hd.M0(2131751145, null), true, z10);
        }
        org.telegram.ui.ActionBar.q6.Y(q0Var.h, org.telegram.ui.ActionBar.j6.Ji, null);
    }
}
