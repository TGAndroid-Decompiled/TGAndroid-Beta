package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class o31 extends FrameLayout {
    public float E;
    public final int a;
    public final pb0 b;
    public final be0 c;
    public final LinearLayout d;
    public final hn e;
    public final hn f;
    public final ii2 h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long w;
    public int x;
    public String y;

    public o31(mu1 mu1Var, wjb wjbVar, Activity activity) {
        super(activity);
        int i;
        this.a = mu1Var.getCurrentAccount();
        this.r = false;
        be0 be0Var = new be0(activity);
        this.c = be0Var;
        TLRPC.User V1 = mu1Var.getMessagesController().V1(Long.valueOf(this.w));
        pb0 pb0Var = new pb0((wjb) null);
        this.b = pb0Var;
        pb0Var.q(V1);
        be0Var.setRoundRadius(gl.L(16.0f));
        be0Var.f(V1, pb0Var);
        addView(be0Var, nme.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        hn hnVar = new hn(activity, false, false, false);
        this.e = hnVar;
        hnVar.n = false;
        hnVar.getDrawable().r(true, false);
        hnVar.setTypeface(gl.o());
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setText(l7c.q(V1));
        zkb.U(hnVar, bkb.F6, wjbVar);
        hnVar.setEllipsizeByGradient(true);
        linearLayout.addView(hnVar, nme.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        hn hnVar2 = new hn(activity, false, false, false);
        this.f = hnVar2;
        hnVar2.n = false;
        hnVar2.getDrawable().r(true, false);
        hnVar2.setTextSize(gl.L(13.0f));
        hnVar2.setText(k96.M0(2131753697, null));
        zkb.U(hnVar2, bkb.We, wjbVar);
        hnVar2.setEllipsizeByGradient(true);
        linearLayout.addView(hnVar2, nme.o(-1, 17));
        addView(linearLayout, nme.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        ii2 ii2Var = new ii2(activity);
        this.h = ii2Var;
        ii2Var.getDrawable().r(true, true);
        ii2Var.b(0.75f, 350L, s33.h);
        ii2Var.setScaleProperty(0.6f);
        ii2Var.setTypeface(gl.o());
        int L = gl.L(14.0f);
        int i2 = bkb.Ei;
        int v0 = bkb.v0(i2, wjbVar);
        int v = bkb.v(bkb.v0(i2, wjbVar), bkb.p1(0.12f, -1));
        ff0 i0 = bkb.i0(L, L, L, L, v0, v, v);
        vkb M = zkb.M(i2);
        ii2Var.setBackground(i0);
        zkb.j(ii2Var, i0, M, null, wjbVar);
        ii2Var.setTextSize(gl.L(14.0f));
        ii2Var.setGravity(5);
        zkb.U(ii2Var, bkb.Ii, wjbVar);
        ii2Var.setPadding(gl.L(13.0f), 0, gl.L(13.0f), 0);
        ii2Var.setOnClickListener(new j1(this, (byte) 23));
        ii2Var.setOnWidthUpdatedListener(new n31(this, (byte) 0));
        if (this.r) {
            i = 2131753698;
        } else {
            i = 2131753695;
        }
        ii2Var.setText(k96.M0(i, null));
        addView(ii2Var, nme.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232242);
        int i3 = bkb.h6;
        ff0 N = bkb.N(bkb.v0(i3, wjbVar), 0, 0);
        vkb M2 = zkb.M(i3);
        imageView.setBackground(N);
        zkb.j(imageView, N, null, M2, wjbVar);
        zkb.s(imageView, bkb.Te, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new b0(this, mu1Var, wjbVar, (byte) 11));
        addView(imageView, nme.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f = this.E;
        ii2 ii2Var = this.h;
        float c = ii2Var.getDrawable().c() + f + ii2Var.getPaddingLeft() + ii2Var.getPaddingRight() + gl.L(12.0f);
        this.e.setRightPadding(c);
        this.f.setRightPadding(c);
    }

    public void setLeftMargin(float f) {
        this.E = f;
        this.c.setTranslationX(f);
        this.d.setTranslationX(f);
        a();
    }
}
