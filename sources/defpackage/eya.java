package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class eya extends fx0 {
    public final ah8 l1;
    public boolean m1;
    public final boolean n1;
    public nh3 o1;
    public final z6a p1;

    public eya(Context context, float f, int i, wjb wjbVar) {
        super(1, wjbVar, context, false);
        this.p1 = new z6a(this, (byte) 29);
        this.n1 = i;
        dya dyaVar = new dya(this, getContext(), f);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = gl.L(80.0f);
        int i2 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.w0(null, i2, false));
        vkb M = zkb.M(i2);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, null);
        imageView.setImageResource(2131231620);
        dyaVar.addView(imageView, nme.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        dyaVar.addView(linearLayout, nme.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        ir2.t(textView, 1, 20.0f);
        ug8.x(textView, bkb.F6, wjbVar, null, 2131744641);
        linearLayout.addView(textView, nme.r(-2, -2, 1));
        jia jiaVar = new jia(getContext());
        jiaVar.setTextSize(14);
        jiaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        jiaVar.setMaxLines(100);
        zkb.W(jiaVar, bkb.x6, wjbVar);
        if (y6c.h(this.a).p()) {
            jiaVar.l(k96.M0(2131744646, null), false);
        } else {
            jiaVar.l(k96.M0(2131744642, null), false);
        }
        linearLayout.addView(jiaVar, nme.t(-2, -2, 1, 36, 10, 36, 0));
        eb0 eb0Var = new eb0(this, getContext());
        ((ImageView) eb0Var.d).setImageResource(2131232385);
        ((TextView) eb0Var.b).setText(k96.M0(2131749119, null));
        ((TextView) eb0Var.c).setText(k96.M0(2131749118, null));
        linearLayout.addView(eb0Var, nme.t(-1, -2, 0, 0, 20, 0, 0));
        eb0 eb0Var2 = new eb0(this, getContext());
        ((ImageView) eb0Var2.d).setImageResource(2131232384);
        ((TextView) eb0Var2.b).setText(k96.M0(2131749126, null));
        ((TextView) eb0Var2.c).setText(k96.M0(2131749125, null));
        linearLayout.addView(eb0Var2, nme.t(-1, -2, 0, 0, 10, 0, 0));
        ah8 ah8Var = new ah8(gl.L(8.0f), wjbVar, context, true);
        this.l1 = ah8Var;
        ah8Var.K = false;
        ah8Var.h.getDrawable().E = false;
        ah8Var.setIcon(2131624310);
        ote.a(ah8Var);
        TLRPC.User f2 = y6c.h(this.a).f();
        if (!f2.premium) {
            ah8Var.setIcon(2131624310);
            ah8Var.b(k96.M0(2131743612, null), new bna(this, (byte) 7), false);
        } else {
            E0(false);
        }
        linearLayout.addView(ah8Var, nme.t(-1, 48, 80, 14, 24, 14, 16));
        this.O = dyaVar;
        ah8Var.setOnClickListener(new l63(this, f2, i, wjbVar));
    }

    public static void D0() {
        u21 Y;
        d Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            Y = new u21(Q.getLastStoryViewer().s, Q.getLastStoryViewer().E);
        } else {
            Y = u21.Y();
        }
        if (Y != null) {
            String M0 = k96.M0(2131744644, null);
            String M02 = k96.M0(2131744643, null);
            i21 i21Var = new i21(Y.X(), Y.c);
            i21Var.a.setImageResource(2131232398);
            i21Var.b.setText(M0);
            TextView textView = i21Var.c;
            textView.setText(M02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            Y.b(i21Var, 5000).j();
        }
    }

    public final void E0(boolean z) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = na7.q1(this.a).M1().B;
        ah8 ah8Var = this.l1;
        if (tL_storiesStealthMode != null) {
            if (ConnectionsManager.getInstance(this.a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                this.m1 = true;
                ah8Var.c(k96.M0(2131744645, null), true, z);
                zkb.U(ah8Var.h, bkb.Ii, null);
                return;
            }
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            int i = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i) {
                long currentTime2 = i - ConnectionsManager.getInstance(this.a).getCurrentTime();
                int i2 = (int) (currentTime2 % 60);
                long j = currentTime2 / 60;
                Locale locale = Locale.ENGLISH;
                ah8Var.c(k96.a0("AvailableIn", null, 2131753757, String.format(locale, "%02d", Integer.valueOf((int) (j / 60))) + String.format(locale, ":%02d", Integer.valueOf((int) (j % 60))) + String.format(locale, ":%02d", Integer.valueOf(i2))), true, z);
                yg8 yg8Var = ah8Var.h;
                vkb g = zkb.g(bkb.Ii, 125);
                zkb.m(yg8Var, g.a, -1, 1, g.d, null);
                z6a z6aVar = this.p1;
                gl.r(z6aVar);
                gl.e3(z6aVar, 1000L);
                return;
            }
        }
        boolean z2 = this.n1;
        if (!z2) {
            ah8Var.c(k96.M0(2131751134, null), true, z);
        } else if (z2) {
            ah8Var.c(k96.M0(2131751133, null), true, z);
        }
        zkb.U(ah8Var.h, bkb.Ii, null);
    }
}
