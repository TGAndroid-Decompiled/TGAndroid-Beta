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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class g2b extends nx0 {
    public final ok8 l1;
    public boolean m1;
    public final boolean n1;
    public hi3 o1;
    public final uoa p1;

    public g2b(Context context, float f, int i, vnb vnbVar) {
        super(1, vnbVar, context, false);
        this.p1 = new uoa(this, (byte) 16);
        this.n1 = i;
        f2b f2bVar = new f2b(this, getContext(), f);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = hl.L(80.0f);
        int i2 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.w0(null, i2, false));
        uob M = yob.M(i2);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, null);
        imageView.setImageResource(2131231620);
        f2bVar.addView(imageView, tre.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        f2bVar.addView(linearLayout, tre.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        bs2.t(textView, 1, 20.0f);
        ik8.x(textView, aob.G6, vnbVar, null, 2131744535);
        linearLayout.addView(textView, tre.r(-2, -2, 1));
        ema emaVar = new ema(getContext());
        emaVar.setTextSize(14);
        emaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        emaVar.setMaxLines(100);
        yob.W(emaVar, aob.y6, vnbVar);
        if (yac.h(this.a).p()) {
            emaVar.l(ob6.M0(2131744540, null), false);
        } else {
            emaVar.l(ob6.M0(2131744536, null), false);
        }
        linearLayout.addView(emaVar, tre.t(-2, -2, 1, 36, 10, 36, 0));
        gb0 gb0Var = new gb0(this, getContext());
        ((ImageView) gb0Var.d).setImageResource(2131232385);
        ((TextView) gb0Var.b).setText(ob6.M0(2131749065, null));
        ((TextView) gb0Var.c).setText(ob6.M0(2131749064, null));
        linearLayout.addView(gb0Var, tre.t(-1, -2, 0, 0, 20, 0, 0));
        gb0 gb0Var2 = new gb0(this, getContext());
        ((ImageView) gb0Var2.d).setImageResource(2131232384);
        ((TextView) gb0Var2.b).setText(ob6.M0(2131749072, null));
        ((TextView) gb0Var2.c).setText(ob6.M0(2131749071, null));
        linearLayout.addView(gb0Var2, tre.t(-1, -2, 0, 0, 10, 0, 0));
        ok8 ok8Var = new ok8(hl.L(8.0f), vnbVar, context, true);
        this.l1 = ok8Var;
        ok8Var.K = false;
        ok8Var.h.getDrawable().E = false;
        ok8Var.setIcon(2131624310);
        iye.a(ok8Var);
        TLRPC.User f2 = yac.h(this.a).f();
        if (!f2.premium) {
            ok8Var.setIcon(2131624310);
            ok8Var.b(ob6.M0(2131743506, null), new kla(this, (byte) 8), false);
        } else {
            F0(false);
        }
        linearLayout.addView(ok8Var, tre.t(-1, 48, 80, 14, 24, 14, 16));
        this.O = f2bVar;
        ok8Var.setOnClickListener(new e73(this, f2, i, vnbVar));
    }

    public static void E0() {
        d31 Y;
        e Q = LaunchActivity.Q();
        if (Q.getLastStoryViewer() != null) {
            Y = new d31(Q.getLastStoryViewer().s, Q.getLastStoryViewer().E);
        } else {
            Y = d31.Y();
        }
        if (Y != null) {
            String M0 = ob6.M0(2131744538, null);
            String M02 = ob6.M0(2131744537, null);
            r21 r21Var = new r21(Y.X(), Y.c);
            r21Var.a.setImageResource(2131232398);
            r21Var.b.setText(M0);
            TextView textView = r21Var.c;
            textView.setText(M02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            Y.b(r21Var, 5000).j();
        }
    }

    public final void F0(boolean z) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = uc7.s1(this.a).O1().B;
        ok8 ok8Var = this.l1;
        if (tL_storiesStealthMode != null) {
            if (ConnectionsManager.getInstance(this.a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                this.m1 = true;
                ok8Var.c(ob6.M0(2131744539, null), true, z);
                yob.U(ok8Var.h, aob.Ji, null);
                return;
            }
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            int i = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i) {
                long currentTime2 = i - ConnectionsManager.getInstance(this.a).getCurrentTime();
                int i2 = (int) (currentTime2 % 60);
                long j = currentTime2 / 60;
                Locale locale = Locale.ENGLISH;
                ok8Var.c(ob6.a0("AvailableIn", null, 2131753753, String.format(locale, "%02d", Integer.valueOf((int) (j / 60))) + String.format(locale, ":%02d", Integer.valueOf((int) (j % 60))) + String.format(locale, ":%02d", Integer.valueOf(i2))), true, z);
                mk8 mk8Var = ok8Var.h;
                uob g = yob.g(aob.Ji, 125);
                yob.m(mk8Var, g.a, -1, 1, g.d, null);
                uoa uoaVar = this.p1;
                hl.r(uoaVar);
                hl.d3(uoaVar, 1000L);
                return;
            }
        }
        boolean z2 = this.n1;
        if (!z2) {
            ok8Var.c(ob6.M0(2131751111, null), true, z);
        } else if (z2) {
            ok8Var.c(ob6.M0(2131751110, null), true, z);
        }
        yob.U(ok8Var.h, aob.Ji, null);
    }
}
