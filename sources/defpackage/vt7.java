package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class vt7 {
    public final long a;
    public final float b;
    public final float c;
    public final p09 d;
    public final Paint e;
    public final ImageReceiver f;
    public final uib g;
    public boolean h;
    public final ln i;
    public final ln j;

    public vt7(wt7 wt7Var, View view, int i, long j, int i2, boolean z) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j;
        z0d z0dVar = Utilities.c;
        this.b = Utilities.l(z0dVar.nextFloat());
        this.c = Utilities.l(z0dVar.nextFloat());
        if (z) {
            int[] iArr = wt7Var.f;
            p09 p09Var = new p09(iArr[z0dVar.nextInt(iArr.length)], gm.L(70.0f), gm.L(70.0f));
            this.d = p09Var;
            p09Var.M(view);
            p09Var.E(true);
            p09Var.F(0);
            p09Var.start();
        }
        TLObject a2 = oc7.r1(i).a2(j);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(a2);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.i0(gm.L(2.0f), gm.L(2.0f), gm.L(14.0f), gm.L(14.0f));
        imageReceiver.q0(gm.L(7.0f));
        imageReceiver.U(a2, pc0Var, null);
        view.addOnAttachStateChangeListener(new wd(this, (byte) 11));
        if (view.isAttachedToWindow()) {
            imageReceiver.I();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        pn2 pn2Var = new pn2(2131232765, 0);
        pn2Var.H = 0.875f;
        spannableStringBuilder.setSpan(pn2Var, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) jb6.E(i2, ','));
        this.g = new uib(spannableStringBuilder, 10.0f, gm.n1("fonts/num.otf"));
        ln lnVar = new ln(2000L, view, new LinearInterpolator());
        this.i = lnVar;
        lnVar.e(true, 0.0f);
        lnVar.e(false, 1.0f);
        this.j = new ln(view, 350L, 240L, d53.h);
    }
}
