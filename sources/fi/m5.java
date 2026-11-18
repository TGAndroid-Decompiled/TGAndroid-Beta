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
public final class m5 extends org.telegram.ui.ActionBar.x2 {
    public static final int f12267r1 = 0;
    public final ug.s0 f12268m1;
    public boolean n1;
    public final int f12269o1;
    public sv f12270p1;
    public final f2.a f12271q1;

    public m5(Context context, float f10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        this.f12271q1 = new f2.a(this, 11);
        this.f12269o1 = i7;
        l5 l5Var = new l5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, null);
        imageView.setImageResource(2131231617);
        l5Var.addView(imageView, ma.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        l5Var.addView(linearLayout, ma.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        i5.c.x(textView, 1, 20.0f);
        n10.r(textView, org.telegram.ui.ActionBar.n6.G6, i6Var, null, 2131744643);
        linearLayout.addView(textView, ma.r(-2, -2, 1));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        n5Var.setTextSize(14);
        n5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        n5Var.setMaxLines(100);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29786y6, i6Var);
        if (j10.i(this.f30187a).q()) {
            n5Var.l(gd.M0(2131744648, null), false);
        } else {
            n5Var.l(gd.M0(2131744644, null), false);
        }
        linearLayout.addView(n5Var, ma.t(-2, -2, 1, 36, 10, 36, 0));
        di.d1 d1Var = new di.d1(this, getContext());
        ((ImageView) d1Var.d).setImageResource(2131232382);
        ((TextView) d1Var.f8642b).setText(gd.M0(2131749119, null));
        ((TextView) d1Var.f8643c).setText(gd.M0(2131749118, null));
        linearLayout.addView(d1Var, ma.t(-1, -2, 0, 0, 20, 0, 0));
        di.d1 d1Var2 = new di.d1(this, getContext());
        ((ImageView) d1Var2.d).setImageResource(2131232381);
        ((TextView) d1Var2.f8642b).setText(gd.M0(2131749126, null));
        ((TextView) d1Var2.f8643c).setText(gd.M0(2131749125, null));
        linearLayout.addView(d1Var2, ma.t(-1, -2, 0, 0, 10, 0, 0));
        ug.s0 s0Var = new ug.s0(org.telegram.messenger.g0.L(8.0f), context, i6Var, true);
        this.f12268m1 = s0Var;
        s0Var.K = false;
        s0Var.h.getDrawable().E = false;
        s0Var.setIcon(2131624315);
        ra.a(s0Var);
        TLRPC.User f11 = j10.i(this.f30187a).f();
        if (!f11.premium) {
            s0Var.setIcon(2131624315);
            s0Var.b(gd.M0(2131743614, null), new ah.d(this, 24), false);
        } else {
            K0(false);
        }
        linearLayout.addView(s0Var, ma.t(-1, 48, 80, 14, 24, 14, 16));
        this.O = l5Var;
        s0Var.setOnClickListener(new j5(this, f11, i7, i6Var, 0));
    }

    public static void J0() {
        lc Y;
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            Y = new lc(Q.getLastStoryViewer().f11992s, Q.getLastStoryViewer().E);
        } else {
            Y = lc.Y();
        }
        if (Y != null) {
            String M0 = gd.M0(2131744646, null);
            String M02 = gd.M0(2131744645, null);
            cc ccVar = new cc(Y.X(), Y.f37093c);
            ccVar.f33963a.setImageResource(2131232395);
            ccVar.f33964b.setText(M0);
            TextView textView = ccVar.f33965c;
            textView.setText(M02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            Y.b(ccVar, 5000).j();
        }
    }

    public final void K0(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = mp.u1(this.f30187a).R1().B;
        ug.s0 s0Var = this.f12268m1;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.f30187a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.n1 = true;
            s0Var.c(gd.M0(2131744647, null), true, z10);
            org.telegram.ui.ActionBar.u6.Y(s0Var.h, org.telegram.ui.ActionBar.n6.Ji, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.f30187a).getCurrentTime();
            int i7 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i7) {
                long currentTime2 = i7 - ConnectionsManager.getInstance(this.f30187a).getCurrentTime();
                int i10 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j3 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i10)));
                s0Var.c(gd.a0("AvailableIn", null, 2131753758, sb2.toString()), true, z10);
                ug.r0 r0Var = s0Var.h;
                org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(org.telegram.ui.ActionBar.n6.Ji, 125);
                org.telegram.ui.ActionBar.u6.m(r0Var, g10.f29909a, -1, 1, g10.d, null);
                f2.a aVar = this.f12271q1;
                org.telegram.messenger.g0.r(aVar);
                org.telegram.messenger.g0.h3(aVar, 1000L);
                return;
            }
        }
        int i11 = this.f12269o1;
        if (i11 == 0) {
            s0Var.c(gd.M0(2131751135, null), true, z10);
        } else if (i11 == 1) {
            s0Var.c(gd.M0(2131751134, null), true, z10);
        }
        org.telegram.ui.ActionBar.u6.Y(s0Var.h, org.telegram.ui.ActionBar.n6.Ji, null);
    }
}
