package ei;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lv;
public final class w5 extends org.telegram.ui.ActionBar.t2 {
    public static final int f11183o1 = 0;
    public final vg.o0 f11184j1;
    public boolean k1;
    public final int f11185l1;
    public lv m1;
    public final ci.d1 f11186n1;

    public w5(Context context, float f10, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.f11186n1 = new ci.d1(this, 29);
        this.f11185l1 = i3;
        v5 v5Var = new v5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, null);
        imageView.setImageResource(2131231616);
        v5Var.addView(imageView, mf.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        v5Var.addView(linearLayout, mf.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        k2.p1.t(textView, 1, 20.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.G6, e6Var, null, 2131744888);
        linearLayout.addView(textView, mf.r(-2, -2, 1));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        k5Var.setTextSize(14);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        k5Var.setMaxLines(100);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        if (h10.i(this.f28583a).q()) {
            k5Var.l(bd.M0(2131744893, null), false);
        } else {
            k5Var.l(bd.M0(2131744889, null), false);
        }
        linearLayout.addView(k5Var, mf.t(-2, -2, 1, 36, 10, 36, 0));
        ci.l1 l1Var = new ci.l1(this, getContext());
        ((ImageView) l1Var.d).setImageResource(2131232380);
        ((TextView) l1Var.f5431b).setText(bd.M0(2131749319, null));
        ((TextView) l1Var.f5432c).setText(bd.M0(2131749318, null));
        linearLayout.addView(l1Var, mf.t(-1, -2, 0, 0, 20, 0, 0));
        ci.l1 l1Var2 = new ci.l1(this, getContext());
        ((ImageView) l1Var2.d).setImageResource(2131232379);
        ((TextView) l1Var2.f5431b).setText(bd.M0(2131749326, null));
        ((TextView) l1Var2.f5432c).setText(bd.M0(2131749325, null));
        linearLayout.addView(l1Var2, mf.t(-1, -2, 0, 0, 10, 0, 0));
        vg.o0 o0Var = new vg.o0(org.telegram.messenger.g0.L(8.0f), context, e6Var, true);
        this.f11184j1 = o0Var;
        o0Var.K = false;
        o0Var.h.getDrawable().D = false;
        o0Var.setIcon(2131624314);
        pf.a(o0Var);
        TLRPC.User f11 = h10.i(this.f28583a).f();
        if (!f11.premium) {
            o0Var.setIcon(2131624314);
            o0Var.b(bd.M0(2131743861, null), new ai.b(this, 19), false);
        } else {
            J0(false);
        }
        linearLayout.addView(o0Var, mf.t(-1, 48, 80, 14, 24, 14, 16));
        this.O = v5Var;
        o0Var.setOnClickListener(new t5(this, f11, i3, e6Var, 0));
    }

    public static void I0() {
        fc X;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            X = new fc(Q.getLastStoryViewer().f10948s, Q.getLastStoryViewer().E);
        } else {
            X = fc.X();
        }
        if (X != null) {
            String M0 = bd.M0(2131744891, null);
            String M02 = bd.M0(2131744890, null);
            wb wbVar = new wb(X.W(), X.f33774c);
            wbVar.f39978a.setImageResource(2131232393);
            wbVar.f39979b.setText(M0);
            TextView textView = wbVar.f39980c;
            textView.setText(M02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(wbVar, 5000).j();
        }
    }

    public final void J0(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = hp.s1(this.f28583a).P1().B;
        vg.o0 o0Var = this.f11184j1;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.f28583a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.k1 = true;
            o0Var.c(bd.M0(2131744892, null), true, z10);
            org.telegram.ui.ActionBar.r6.Z(o0Var.h, org.telegram.ui.ActionBar.k6.Gi, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.f28583a).getCurrentTime();
            int i3 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i3) {
                long currentTime2 = i3 - ConnectionsManager.getInstance(this.f28583a).getCurrentTime();
                int i10 = (int) (currentTime2 % 60);
                long j10 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j10 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i10)));
                o0Var.c(bd.a0("AvailableIn", null, 2131753760, sb2.toString()), true, z10);
                vg.n0 n0Var = o0Var.h;
                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Gi, 125);
                org.telegram.ui.ActionBar.r6.n(n0Var, h.f28359a, -1, 1, h.d, null);
                ci.d1 d1Var = this.f11186n1;
                org.telegram.messenger.g0.r(d1Var);
                org.telegram.messenger.g0.i3(d1Var, 1000L);
                return;
            }
        }
        int i11 = this.f11185l1;
        if (i11 == 0) {
            o0Var.c(bd.M0(2131751147, null), true, z10);
        } else if (i11 == 1) {
            o0Var.c(bd.M0(2131751146, null), true, z10);
        }
        org.telegram.ui.ActionBar.r6.Z(o0Var.h, org.telegram.ui.ActionBar.k6.Gi, null);
    }
}
