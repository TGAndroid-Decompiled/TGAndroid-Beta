package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class w41 extends FrameLayout {
    public float E;
    public final int a;
    public final pc0 b;
    public final bf0 c;
    public final LinearLayout d;
    public final io e;
    public final io f;
    public final wj2 h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long w;
    public int x;
    public String y;

    public w41(yv1 yv1Var, ylb ylbVar, Activity activity) {
        super(activity);
        int i;
        this.a = yv1Var.getCurrentAccount();
        this.r = false;
        bf0 bf0Var = new bf0(activity);
        this.c = bf0Var;
        TLRPC.User W1 = yv1Var.getMessagesController().W1(Long.valueOf(this.w));
        pc0 pc0Var = new pc0((ylb) null);
        this.b = pc0Var;
        pc0Var.q(W1);
        bf0Var.setRoundRadius(gm.L(16.0f));
        bf0Var.f(W1, pc0Var);
        addView(bf0Var, qoe.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        io ioVar = new io(activity, false, false, false);
        this.e = ioVar;
        ioVar.n = false;
        ioVar.getDrawable().r(true, false);
        ioVar.setTypeface(gm.o());
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setText(m9c.r(W1));
        anb.U(ioVar, cmb.F6, ylbVar);
        ioVar.setEllipsizeByGradient(true);
        linearLayout.addView(ioVar, qoe.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        io ioVar2 = new io(activity, false, false, false);
        this.f = ioVar2;
        ioVar2.n = false;
        ioVar2.getDrawable().r(true, false);
        ioVar2.setTextSize(gm.L(13.0f));
        ioVar2.setText(jb6.M0(2131753665, null));
        anb.U(ioVar2, cmb.We, ylbVar);
        ioVar2.setEllipsizeByGradient(true);
        linearLayout.addView(ioVar2, qoe.o(-1, 17));
        addView(linearLayout, qoe.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        wj2 wj2Var = new wj2(activity);
        this.h = wj2Var;
        wj2Var.getDrawable().r(true, true);
        wj2Var.b(0.75f, 350L, d53.h);
        wj2Var.setScaleProperty(0.6f);
        wj2Var.setTypeface(gm.o());
        int L = gm.L(14.0f);
        int i2 = cmb.Ei;
        int v0 = cmb.v0(i2, ylbVar);
        int v = cmb.v(cmb.v0(i2, ylbVar), cmb.p1(0.12f, -1));
        fg0 i0 = cmb.i0(L, L, L, L, v0, v, v);
        wmb M = anb.M(i2);
        wj2Var.setBackground(i0);
        anb.j(wj2Var, i0, M, null, ylbVar);
        wj2Var.setTextSize(gm.L(14.0f));
        wj2Var.setGravity(5);
        anb.U(wj2Var, cmb.Ii, ylbVar);
        wj2Var.setPadding(gm.L(13.0f), 0, gm.L(13.0f), 0);
        wj2Var.setOnClickListener(new j1(this, (byte) 26));
        wj2Var.setOnWidthUpdatedListener(new v41(this, (byte) 0));
        if (this.r) {
            i = 2131753666;
        } else {
            i = 2131753663;
        }
        wj2Var.setText(jb6.M0(i, null));
        addView(wj2Var, qoe.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232243);
        int i3 = cmb.h6;
        fg0 N = cmb.N(cmb.v0(i3, ylbVar), 0, 0);
        wmb M2 = anb.M(i3);
        imageView.setBackground(N);
        anb.j(imageView, N, null, M2, ylbVar);
        anb.s(imageView, cmb.Te, ylbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new b0(this, yv1Var, ylbVar, (byte) 11));
        addView(imageView, qoe.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f = this.E;
        wj2 wj2Var = this.h;
        float c = wj2Var.getDrawable().c() + f + wj2Var.getPaddingLeft() + wj2Var.getPaddingRight() + gm.L(12.0f);
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
