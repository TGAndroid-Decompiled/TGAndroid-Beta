package fi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import java.util.Locale;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sv;
public final class n5 extends org.telegram.ui.ActionBar.w2 {
    public static final int f12340r1 = 0;
    public final ug.r0 f12341m1;
    public boolean n1;
    public final int f12342o1;
    public sv f12343p1;
    public final f2.a f12344q1;

    public n5(Context context, float f10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.f12344q1 = new f2.a(this, 11);
        this.f12342o1 = i7;
        m5 m5Var = new m5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, null);
        imageView.setImageResource(2131231617);
        m5Var.addView(imageView, ma.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        m5Var.addView(linearLayout, ma.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        i5.c.x(textView, 1, 20.0f);
        n10.r(textView, org.telegram.ui.ActionBar.m6.G6, h6Var, null, 2131744637);
        linearLayout.addView(textView, ma.r(-2, -2, 1));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(getContext());
        m5Var2.setTextSize(14);
        m5Var2.setAlignment(Layout.Alignment.ALIGN_CENTER);
        m5Var2.setMaxLines(100);
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.f29770y6, h6Var);
        if (j10.i(this.f30170a).q()) {
            m5Var2.l(gd.N0(2131744642, null), false);
        } else {
            m5Var2.l(gd.N0(2131744638, null), false);
        }
        linearLayout.addView(m5Var2, ma.t(-2, -2, 1, 36, 10, 36, 0));
        di.d1 d1Var = new di.d1(this, getContext());
        ((ImageView) d1Var.d).setImageResource(2131232382);
        ((TextView) d1Var.f8669b).setText(gd.N0(2131749118, null));
        ((TextView) d1Var.f8670c).setText(gd.N0(2131749117, null));
        linearLayout.addView(d1Var, ma.t(-1, -2, 0, 0, 20, 0, 0));
        di.d1 d1Var2 = new di.d1(this, getContext());
        ((ImageView) d1Var2.d).setImageResource(2131232381);
        ((TextView) d1Var2.f8669b).setText(gd.N0(2131749125, null));
        ((TextView) d1Var2.f8670c).setText(gd.N0(2131749124, null));
        linearLayout.addView(d1Var2, ma.t(-1, -2, 0, 0, 10, 0, 0));
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(8.0f), context, h6Var, true);
        this.f12341m1 = r0Var;
        r0Var.K = false;
        r0Var.h.getDrawable().E = false;
        r0Var.setIcon(2131624315);
        ra.a(r0Var);
        TLRPC.User f11 = j10.i(this.f30170a).f();
        if (!f11.premium) {
            r0Var.setIcon(2131624315);
            r0Var.b(gd.N0(2131743608, null), new ah.d(this, 23), false);
        } else {
            K0(false);
        }
        linearLayout.addView(r0Var, ma.t(-1, 48, 80, 14, 24, 14, 16));
        this.O = m5Var;
        r0Var.setOnClickListener(new k5(this, f11, i7, h6Var, 0));
    }

    public static void J0() {
        lc Y;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            Y = new lc(Q.getLastStoryViewer().f12033s, Q.getLastStoryViewer().E);
        } else {
            Y = lc.Y();
        }
        if (Y != null) {
            String N0 = gd.N0(2131744640, null);
            String N02 = gd.N0(2131744639, null);
            cc ccVar = new cc(Y.X(), Y.f37157c);
            ccVar.f34176a.setImageResource(2131232395);
            ccVar.f34177b.setText(N0);
            TextView textView = ccVar.f34178c;
            textView.setText(N02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            Y.b(ccVar, 5000).j();
        }
    }

    public final void K0(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = mp.u1(this.f30170a).R1().B;
        ug.r0 r0Var = this.f12341m1;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.f30170a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.n1 = true;
            r0Var.c(gd.N0(2131744641, null), true, z10);
            org.telegram.ui.ActionBar.t6.Y(r0Var.h, org.telegram.ui.ActionBar.m6.Ji, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.f30170a).getCurrentTime();
            int i7 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i7) {
                long currentTime2 = i7 - ConnectionsManager.getInstance(this.f30170a).getCurrentTime();
                int i10 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j3 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i10)));
                r0Var.c(gd.a0("AvailableIn", null, 2131753757, sb2.toString()), true, z10);
                ug.q0 q0Var = r0Var.h;
                org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Ji, 125);
                org.telegram.ui.ActionBar.t6.m(q0Var, g10.f29892a, -1, 1, g10.d, null);
                f2.a aVar = this.f12344q1;
                org.telegram.messenger.g0.r(aVar);
                org.telegram.messenger.g0.h3(aVar, 1000L);
                return;
            }
        }
        int i11 = this.f12342o1;
        if (i11 == 0) {
            r0Var.c(gd.N0(2131751134, null), true, z10);
        } else if (i11 == 1) {
            r0Var.c(gd.N0(2131751133, null), true, z10);
        }
        org.telegram.ui.ActionBar.t6.Y(r0Var.h, org.telegram.ui.ActionBar.m6.Ji, null);
    }
}
