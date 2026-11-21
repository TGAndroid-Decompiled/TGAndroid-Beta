package kg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c8.ma;
import hi.o4;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.q9;
import org.telegram.ui.bn;
public final class e extends FrameLayout {
    public float E;
    public final int f18316a;
    public final b9 f18317b;
    public final q9 f18318c;
    public final LinearLayout d;
    public final o6 f18319e;
    public final o6 f18320f;
    public final dq h;
    public final ImageView f18321n;
    public boolean f18322r;
    public long f18323s;
    public long f18324w;
    public int f18325x;
    public String f18326y;

    public e(Activity activity, h6 h6Var, bn bnVar) {
        super(activity);
        int i7;
        this.f18316a = bnVar.getCurrentAccount();
        this.f18322r = false;
        q9 q9Var = new q9(activity);
        this.f18318c = q9Var;
        TLRPC.User c22 = bnVar.getMessagesController().c2(Long.valueOf(this.f18324w));
        b9 b9Var = new b9((h6) null);
        this.f18317b = b9Var;
        b9Var.r(c22);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        q9Var.f(c22, b9Var);
        addView(q9Var, ma.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        o6 o6Var = new o6(activity, false, false, false);
        this.f18319e = o6Var;
        o6Var.f38125n = false;
        o6Var.getDrawable().r(true, false);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setText(o10.q(c22));
        t6.Y(o6Var, m6.G6, h6Var);
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, ma.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        o6 o6Var2 = new o6(activity, false, false, false);
        this.f18320f = o6Var2;
        o6Var2.f38125n = false;
        o6Var2.getDrawable().r(true, false);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        o6Var2.setText(gd.N0(2131753697, null));
        t6.Y(o6Var2, m6.Xe, h6Var);
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, ma.o(-1, 17));
        addView(linearLayout, ma.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        dq dqVar = new dq(activity);
        this.h = dqVar;
        dqVar.getDrawable().r(true, true);
        dqVar.b(0.75f, 350L, nr.h);
        dqVar.setScaleProperty(0.6f);
        dqVar.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(14.0f);
        int i10 = m6.Fi;
        int w02 = m6.w0(i10, h6Var);
        int w10 = m6.w(m6.w0(i10, h6Var), m6.r1(0.12f, -1));
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, w02, w10, w10);
        p6 M = t6.M(i10);
        dqVar.setBackground(k02);
        t6.j(dqVar, k02, M, null, h6Var);
        dqVar.setTextSize(org.telegram.messenger.g0.L(14.0f));
        dqVar.setGravity(5);
        t6.Y(dqVar, m6.Ji, h6Var);
        dqVar.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        dqVar.setOnClickListener(new o4(this, 7));
        dqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f18322r) {
            i7 = 2131753698;
        } else {
            i7 = 2131753695;
        }
        dqVar.setText(gd.N0(i7, null));
        addView(dqVar, ma.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f18321n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232239);
        int i11 = m6.f29470i6;
        org.telegram.ui.Cells.y O = m6.O(m6.w0(i11, h6Var), 0, 0);
        p6 M2 = t6.M(i11);
        imageView.setBackground(O);
        t6.j(imageView, O, null, M2, h6Var);
        t6.s(imageView, m6.Ue, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new ah.h(this, bnVar, h6Var, 16));
        addView(imageView, ma.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f10 = this.E;
        dq dqVar = this.h;
        float c10 = dqVar.getDrawable().c() + f10 + dqVar.getPaddingLeft() + dqVar.getPaddingRight() + org.telegram.messenger.g0.L(12.0f);
        this.f18319e.setRightPadding(c10);
        this.f18320f.setRightPadding(c10);
    }

    public void setLeftMargin(float f10) {
        this.E = f10;
        this.f18318c.setTranslationX(f10);
        this.d.setTranslationX(f10);
        a();
    }
}
