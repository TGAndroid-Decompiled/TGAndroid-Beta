package fi;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class n1 {
    public final long f12061a;
    public final float f12062b;
    public final float f12063c;
    public final ch0 d;
    public final Paint f12064e;
    public final ImageReceiver f12065f;
    public final oy0 f12066g;
    public boolean h;
    public final org.telegram.ui.Components.u5 f12067i;
    public final org.telegram.ui.Components.u5 f12068j;

    public n1(o1 o1Var, View view, int i7, long j3, int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.f12064e = paint;
        this.f12061a = j3;
        g5.a aVar = Utilities.f22415c;
        this.f12062b = Utilities.l(aVar.nextFloat());
        this.f12063c = Utilities.l(aVar.nextFloat());
        if (z10) {
            int[] iArr = o1Var.f12107f;
            ch0 ch0Var = new ch0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = ch0Var;
            ch0Var.R(view);
            ch0Var.J(true);
            ch0Var.K(0);
            ch0Var.start();
        }
        TLObject e22 = np.s1(i7).e2(j3);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.l(e22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f12065f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.i0(e22, t8Var, null);
        view.addOnAttachStateChangeListener(new bi.x1(this, 5));
        if (view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        eq eqVar = new eq(2131232749, 0);
        eqVar.H = 0.875f;
        spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) hd.E(i10, ','));
        this.f12066g = new oy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(view, 2000L, new LinearInterpolator());
        this.f12067i = u5Var;
        u5Var.e(true, 0.0f);
        u5Var.e(false, 1.0f);
        this.f12068j = new org.telegram.ui.Components.u5(view, 350L, 240L, er.h);
    }
}
