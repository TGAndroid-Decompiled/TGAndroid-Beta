package ei;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class u1 {
    public final long f11075a;
    public final float f11076b;
    public final float f11077c;
    public final ch0 d;
    public final Paint f11078e;
    public final ImageReceiver f11079f;
    public final ly0 f11080g;
    public boolean h;
    public final org.telegram.ui.Components.u5 f11081i;
    public final org.telegram.ui.Components.u5 f11082j;

    public u1(v1 v1Var, View view, int i3, long j10, int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.f11078e = paint;
        this.f11075a = j10;
        f5.a aVar = Utilities.f21386c;
        this.f11076b = Utilities.l(aVar.nextFloat());
        this.f11077c = Utilities.l(aVar.nextFloat());
        if (z10) {
            int[] iArr = v1Var.f11114f;
            ch0 ch0Var = new ch0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = ch0Var;
            ch0Var.R(view);
            ch0Var.J(true);
            ch0Var.K(0);
            ch0Var.start();
        }
        TLObject e22 = hp.s1(i3).e2(j10);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(e22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f11079f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.i0(e22, u8Var, null);
        view.addOnAttachStateChangeListener(new ai.f2(this, 5));
        if (view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        wp wpVar = new wp(2131232746, 0);
        wpVar.H = 0.875f;
        spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) bd.E(i10, ','));
        this.f11080g = new ly0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(view, 2000L, new LinearInterpolator());
        this.f11081i = u5Var;
        u5Var.e(true, 0.0f);
        u5Var.e(false, 1.0f);
        this.f11082j = new org.telegram.ui.Components.u5(view, 350L, 240L, xq.h);
    }
}
