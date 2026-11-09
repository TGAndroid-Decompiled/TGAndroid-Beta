package di;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class p1 {
    public final long f9486a;
    public final float f9487b;
    public final float f9488c;
    public final ah0 d;
    public final Paint f9489e;
    public final ImageReceiver f9490f;
    public final ny0 f9491g;
    public boolean h;
    public final org.telegram.ui.Components.w5 f9492i;
    public final org.telegram.ui.Components.w5 f9493j;

    public p1(q1 q1Var, View view, int i7, long j3, int i10, boolean z9) {
        Paint paint = new Paint(1);
        this.f9489e = paint;
        this.f9486a = j3;
        g5.a aVar = Utilities.f21335c;
        this.f9487b = Utilities.l(aVar.nextFloat());
        this.f9488c = Utilities.l(aVar.nextFloat());
        if (z9) {
            int[] iArr = q1Var.f9567f;
            ah0 ah0Var = new ah0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = ah0Var;
            ah0Var.R(view);
            ah0Var.J(true);
            ah0Var.K(0);
            ah0Var.start();
        }
        TLObject e22 = qp.s1(i7).e2(j3);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        w8Var.l(e22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f9490f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.i0(e22, w8Var, null);
        view.addOnAttachStateChangeListener(new bi.m6(this, 1));
        if (view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        wp wpVar = new wp(2131232748, 0);
        wpVar.G = 0.875f;
        spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) id.E(i10, ','));
        this.f9491g = new ny0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(view, 2000L, new LinearInterpolator());
        this.f9492i = w5Var;
        w5Var.e(true, 0.0f);
        w5Var.e(false, 1.0f);
        this.f9493j = new org.telegram.ui.Components.w5(view, 350L, 240L, xq.h);
    }
}
