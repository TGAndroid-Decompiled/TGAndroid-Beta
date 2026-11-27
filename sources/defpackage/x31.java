package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class x31 extends FrameLayout {
    public float E;
    public final int a;
    public final rb0 b;
    public final de0 c;
    public final LinearLayout d;
    public final in e;
    public final in f;
    public final ej2 h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long w;
    public int x;
    public String y;

    public x31(zu1 zu1Var, vnb vnbVar, Activity activity) {
        super(activity);
        int i;
        this.a = zu1Var.getCurrentAccount();
        this.r = false;
        de0 de0Var = new de0(activity);
        this.c = de0Var;
        TLRPC.User X1 = zu1Var.getMessagesController().X1(Long.valueOf(this.w));
        rb0 rb0Var = new rb0((vnb) null);
        this.b = rb0Var;
        rb0Var.q(X1);
        de0Var.setRoundRadius(hl.L(16.0f));
        de0Var.f(X1, rb0Var);
        addView(de0Var, tre.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        in inVar = new in(activity, false, false, false);
        this.e = inVar;
        inVar.n = false;
        inVar.getDrawable().r(true, false);
        inVar.setTypeface(hl.o());
        inVar.setTextSize(hl.L(14.0f));
        inVar.setText(lbc.r(X1));
        yob.U(inVar, aob.G6, vnbVar);
        inVar.setEllipsizeByGradient(true);
        linearLayout.addView(inVar, tre.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        in inVar2 = new in(activity, false, false, false);
        this.f = inVar2;
        inVar2.n = false;
        inVar2.getDrawable().r(true, false);
        inVar2.setTextSize(hl.L(13.0f));
        inVar2.setText(ob6.M0(2131753693, null));
        yob.U(inVar2, aob.Xe, vnbVar);
        inVar2.setEllipsizeByGradient(true);
        linearLayout.addView(inVar2, tre.o(-1, 17));
        addView(linearLayout, tre.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        ej2 ej2Var = new ej2(activity);
        this.h = ej2Var;
        ej2Var.getDrawable().r(true, true);
        ej2Var.b(0.75f, 350L, k43.h);
        ej2Var.setScaleProperty(0.6f);
        ej2Var.setTypeface(hl.o());
        int L = hl.L(14.0f);
        int i2 = aob.Fi;
        int v0 = aob.v0(i2, vnbVar);
        int v = aob.v(aob.v0(i2, vnbVar), aob.p1(0.12f, -1));
        hf0 i0 = aob.i0(L, L, L, L, v0, v, v);
        uob M = yob.M(i2);
        ej2Var.setBackground(i0);
        yob.j(ej2Var, i0, M, null, vnbVar);
        ej2Var.setTextSize(hl.L(14.0f));
        ej2Var.setGravity(5);
        yob.U(ej2Var, aob.Ji, vnbVar);
        ej2Var.setPadding(hl.L(13.0f), 0, hl.L(13.0f), 0);
        ej2Var.setOnClickListener(new k1(this, (byte) 25));
        ej2Var.setOnWidthUpdatedListener(new w31(this, (byte) 0));
        if (this.r) {
            i = 2131753694;
        } else {
            i = 2131753691;
        }
        ej2Var.setText(ob6.M0(i, null));
        addView(ej2Var, tre.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232242);
        int i3 = aob.i6;
        hf0 N = aob.N(aob.v0(i3, vnbVar), 0, 0);
        uob M2 = yob.M(i3);
        imageView.setBackground(N);
        yob.j(imageView, N, null, M2, vnbVar);
        yob.s(imageView, aob.Ue, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setOnClickListener(new c0(this, zu1Var, vnbVar, (byte) 11));
        addView(imageView, tre.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a(int i, long j, long j2, String str) {
        int i2;
        int i3;
        this.s = j;
        this.w = j2;
        this.y = str;
        this.x = i;
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.r = z;
        TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(j2));
        rb0 rb0Var = this.b;
        rb0Var.q(X1);
        this.c.f(X1, rb0Var);
        this.e.setText(lbc.r(X1));
        if (this.r) {
            i2 = 2131753692;
        } else {
            i2 = 2131753693;
        }
        this.f.setText(ob6.M0(i2, null));
        if (this.r) {
            i3 = 2131753694;
        } else {
            i3 = 2131753691;
        }
        this.h.setText(ob6.M0(i3, null));
    }

    public final void b() {
        float f = this.E;
        ej2 ej2Var = this.h;
        float c = ej2Var.getDrawable().c() + f + ej2Var.getPaddingLeft() + ej2Var.getPaddingRight() + hl.L(12.0f);
        this.e.setRightPadding(c);
        this.f.setRightPadding(c);
    }

    public void setLeftMargin(float f) {
        this.E = f;
        this.c.setTranslationX(f);
        this.d.setTranslationX(f);
        b();
    }
}
