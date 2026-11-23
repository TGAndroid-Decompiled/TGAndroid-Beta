package fi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.sa;
import java.util.Locale;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rv;
public final class n5 extends org.telegram.ui.ActionBar.w2 {
    public static final int f12305r1 = 0;
    public final ug.r0 f12306m1;
    public boolean n1;
    public final int f12307o1;
    public rv f12308p1;
    public final f2.a f12309q1;

    public n5(Context context, float f10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        this.f12309q1 = new f2.a(this, 10);
        this.f12307o1 = i7;
        m5 m5Var = new m5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, null);
        imageView.setImageResource(2131231620);
        m5Var.addView(imageView, na.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        m5Var.addView(linearLayout, na.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        i5.c.x(textView, 1, 20.0f);
        m10.r(textView, org.telegram.ui.ActionBar.n6.G6, i6Var, null, 2131744637);
        linearLayout.addView(textView, na.r(-2, -2, 1));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        n5Var.setTextSize(14);
        n5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        n5Var.setMaxLines(100);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29843y6, i6Var);
        if (i10.i(this.f30223a).q()) {
            n5Var.l(gd.N0(2131744642, null), false);
        } else {
            n5Var.l(gd.N0(2131744638, null), false);
        }
        linearLayout.addView(n5Var, na.t(-2, -2, 1, 36, 10, 36, 0));
        di.d1 d1Var = new di.d1(this, getContext());
        ((ImageView) d1Var.d).setImageResource(2131232385);
        ((TextView) d1Var.f8633b).setText(gd.N0(2131749118, null));
        ((TextView) d1Var.f8634c).setText(gd.N0(2131749117, null));
        linearLayout.addView(d1Var, na.t(-1, -2, 0, 0, 20, 0, 0));
        di.d1 d1Var2 = new di.d1(this, getContext());
        ((ImageView) d1Var2.d).setImageResource(2131232384);
        ((TextView) d1Var2.f8633b).setText(gd.N0(2131749125, null));
        ((TextView) d1Var2.f8634c).setText(gd.N0(2131749124, null));
        linearLayout.addView(d1Var2, na.t(-1, -2, 0, 0, 10, 0, 0));
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(8.0f), context, i6Var, true);
        this.f12306m1 = r0Var;
        r0Var.K = false;
        r0Var.h.getDrawable().E = false;
        r0Var.setIcon(2131624315);
        sa.a(r0Var);
        TLRPC.User f11 = i10.i(this.f30223a).f();
        if (!f11.premium) {
            r0Var.setIcon(2131624315);
            r0Var.b(gd.N0(2131743604, null), new ah.d(this, 23), false);
        } else {
            K0(false);
        }
        linearLayout.addView(r0Var, na.t(-1, 48, 80, 14, 24, 14, 16));
        this.O = m5Var;
        r0Var.setOnClickListener(new k5(this, f11, i7, i6Var, 0));
    }

    public static void J0() {
        kc Y;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            Y = new kc(Q.getLastStoryViewer().f11998s, Q.getLastStoryViewer().E);
        } else {
            Y = kc.Y();
        }
        if (Y != null) {
            String N0 = gd.N0(2131744640, null);
            String N02 = gd.N0(2131744639, null);
            bc bcVar = new bc(Y.X(), Y.f36700c);
            bcVar.f33733a.setImageResource(2131232398);
            bcVar.f33734b.setText(N0);
            TextView textView = bcVar.f33735c;
            textView.setText(N02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            Y.b(bcVar, 5000).j();
        }
    }

    public final void K0(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = mp.u1(this.f30223a).R1().B;
        ug.r0 r0Var = this.f12306m1;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.f30223a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.n1 = true;
            r0Var.c(gd.N0(2131744641, null), true, z10);
            org.telegram.ui.ActionBar.u6.Y(r0Var.h, org.telegram.ui.ActionBar.n6.Ji, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.f30223a).getCurrentTime();
            int i7 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i7) {
                long currentTime2 = i7 - ConnectionsManager.getInstance(this.f30223a).getCurrentTime();
                int i10 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j3 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i10)));
                r0Var.c(gd.a0("AvailableIn", null, 2131753757, sb2.toString()), true, z10);
                ug.q0 q0Var = r0Var.h;
                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(org.telegram.ui.ActionBar.n6.Ji, 125);
                org.telegram.ui.ActionBar.u6.m(q0Var, g10.f30010a, -1, 1, g10.d, null);
                f2.a aVar = this.f12309q1;
                org.telegram.messenger.g0.r(aVar);
                org.telegram.messenger.g0.h3(aVar, 1000L);
                return;
            }
        }
        int i11 = this.f12307o1;
        if (i11 == 0) {
            r0Var.c(gd.N0(2131751134, null), true, z10);
        } else if (i11 == 1) {
            r0Var.c(gd.N0(2131751133, null), true, z10);
        }
        org.telegram.ui.ActionBar.u6.Y(r0Var.h, org.telegram.ui.ActionBar.n6.Ji, null);
    }
}
