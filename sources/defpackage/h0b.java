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
public final class h0b extends my0 {
    public final cj8 l1;
    public boolean m1;
    public final boolean n1;
    public zi3 o1;
    public final nsa p1;

    public h0b(Context context, float f, int i, ylb ylbVar) {
        super(1, ylbVar, context, false);
        this.p1 = new nsa(this, (byte) 7);
        this.n1 = i;
        g0b g0bVar = new g0b(this, getContext(), f);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = gm.L(80.0f);
        int i2 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.w0(null, i2, false));
        wmb M = anb.M(i2);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, null);
        imageView.setImageResource(2131231621);
        g0bVar.addView(imageView, qoe.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        g0bVar.addView(linearLayout, qoe.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        ts2.s(textView, 1, 20.0f);
        wi8.x(textView, cmb.F6, ylbVar, null, 2131744567);
        linearLayout.addView(textView, qoe.r(-2, -2, 1));
        lka lkaVar = new lka(getContext());
        lkaVar.setTextSize(14);
        lkaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        lkaVar.setMaxLines(100);
        anb.W(lkaVar, cmb.x6, ylbVar);
        if (z8c.h(this.a).p()) {
            lkaVar.l(jb6.M0(2131744572, null), false);
        } else {
            lkaVar.l(jb6.M0(2131744568, null), false);
        }
        linearLayout.addView(lkaVar, qoe.t(-2, -2, 1, 36, 10, 36, 0));
        ec0 ec0Var = new ec0(this, getContext());
        ((ImageView) ec0Var.d).setImageResource(2131232386);
        ((TextView) ec0Var.b).setText(jb6.M0(2131749068, null));
        ((TextView) ec0Var.c).setText(jb6.M0(2131749067, null));
        linearLayout.addView(ec0Var, qoe.t(-1, -2, 0, 0, 20, 0, 0));
        ec0 ec0Var2 = new ec0(this, getContext());
        ((ImageView) ec0Var2.d).setImageResource(2131232385);
        ((TextView) ec0Var2.b).setText(jb6.M0(2131749075, null));
        ((TextView) ec0Var2.c).setText(jb6.M0(2131749074, null));
        linearLayout.addView(ec0Var2, qoe.t(-1, -2, 0, 0, 10, 0, 0));
        cj8 cj8Var = new cj8(gm.L(8.0f), ylbVar, context, true);
        this.l1 = cj8Var;
        cj8Var.K = false;
        cj8Var.h.getDrawable().E = false;
        cj8Var.setIcon(2131624310);
        rve.a(cj8Var);
        TLRPC.User f2 = z8c.h(this.a).f();
        if (!f2.premium) {
            cj8Var.setIcon(2131624310);
            cj8Var.b(jb6.M0(2131743538, null), new oha(this, (byte) 10), false);
        } else {
            E0(false);
        }
        linearLayout.addView(cj8Var, qoe.t(-1, 48, 80, 14, 24, 14, 16));
        this.O = g0bVar;
        cj8Var.setOnClickListener(new x73(this, f2, i, ylbVar));
    }

    public static void D0() {
        c41 Y;
        d Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            Y = new c41(Q.getLastStoryViewer().s, Q.getLastStoryViewer().E);
        } else {
            Y = c41.Y();
        }
        if (Y != null) {
            String M0 = jb6.M0(2131744570, null);
            String M02 = jb6.M0(2131744569, null);
            q31 q31Var = new q31(Y.X(), Y.c);
            q31Var.a.setImageResource(2131232399);
            q31Var.b.setText(M0);
            TextView textView = q31Var.c;
            textView.setText(M02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            Y.b(q31Var, 5000).j();
        }
    }

    public final void E0(boolean z) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = oc7.r1(this.a).N1().B;
        cj8 cj8Var = this.l1;
        if (tL_storiesStealthMode != null) {
            if (ConnectionsManager.getInstance(this.a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                this.m1 = true;
                cj8Var.c(jb6.M0(2131744571, null), true, z);
                anb.U(cj8Var.h, cmb.Ii, null);
                return;
            }
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            int i = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i) {
                long currentTime2 = i - ConnectionsManager.getInstance(this.a).getCurrentTime();
                int i2 = (int) (currentTime2 % 60);
                long j = currentTime2 / 60;
                Locale locale = Locale.ENGLISH;
                cj8Var.c(jb6.a0("AvailableIn", null, 2131753725, String.format(locale, "%02d", Integer.valueOf((int) (j / 60))) + String.format(locale, ":%02d", Integer.valueOf((int) (j % 60))) + String.format(locale, ":%02d", Integer.valueOf(i2))), true, z);
                aj8 aj8Var = cj8Var.h;
                wmb g = anb.g(cmb.Ii, 125);
                anb.m(aj8Var, g.a, -1, 1, g.d, null);
                nsa nsaVar = this.p1;
                gm.r(nsaVar);
                gm.d3(nsaVar, 1000L);
                return;
            }
        }
        boolean z2 = this.n1;
        if (!z2) {
            cj8Var.c(jb6.M0(2131751083, null), true, z);
        } else if (z2) {
            cj8Var.c(jb6.M0(2131751082, null), true, z);
        }
        anb.U(cj8Var.h, cmb.Ii, null);
    }
}
