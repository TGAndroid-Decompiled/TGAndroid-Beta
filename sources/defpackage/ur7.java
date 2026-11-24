package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class ur7 {
    public final long a;
    public final float b;
    public final float c;
    public final oy8 d;
    public final Paint e;
    public final ImageReceiver f;
    public final tgb g;
    public boolean h;
    public final lm i;
    public final lm j;

    public ur7(vr7 vr7Var, View view, int i, long j, int i2, boolean z) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j;
        yyc yycVar = Utilities.c;
        this.b = Utilities.l(yycVar.nextFloat());
        this.c = Utilities.l(yycVar.nextFloat());
        if (z) {
            int[] iArr = vr7Var.f;
            oy8 oy8Var = new oy8(iArr[yycVar.nextInt(iArr.length)], gl.L(70.0f), gl.L(70.0f));
            this.d = oy8Var;
            oy8Var.M(view);
            oy8Var.E(true);
            oy8Var.F(0);
            oy8Var.start();
        }
        TLObject Z1 = na7.q1(i).Z1(j);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(Z1);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.i0(gl.L(2.0f), gl.L(2.0f), gl.L(14.0f), gl.L(14.0f));
        imageReceiver.q0(gl.L(7.0f));
        imageReceiver.U(Z1, pb0Var, null);
        view.addOnAttachStateChangeListener(new wc(this, (byte) 11));
        if (view.isAttachedToWindow()) {
            imageReceiver.I();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        cm2 cm2Var = new cm2(2131232753, 0);
        cm2Var.H = 0.875f;
        spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) k96.E(i2, ','));
        this.g = new tgb(spannableStringBuilder, 10.0f, gl.n1("fonts/num.otf"));
        lm lmVar = new lm(2000L, view, new LinearInterpolator());
        this.i = lmVar;
        lmVar.e(true, 0.0f);
        lmVar.e(false, 1.0f);
        this.j = new lm(view, 350L, 240L, s33.h);
    }
}
