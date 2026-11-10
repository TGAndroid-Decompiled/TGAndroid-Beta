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
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
public final class p1 {
    public final long f9491a;
    public final float f9492b;
    public final float f9493c;
    public final zg0 d;
    public final Paint f9494e;
    public final ImageReceiver f9495f;
    public final my0 f9496g;
    public boolean h;
    public final org.telegram.ui.Components.v5 f9497i;
    public final org.telegram.ui.Components.v5 f9498j;

    public p1(q1 q1Var, View view, int i7, long j3, int i10, boolean z9) {
        Paint paint = new Paint(1);
        this.f9494e = paint;
        this.f9491a = j3;
        g5.a aVar = Utilities.f21340c;
        this.f9492b = Utilities.l(aVar.nextFloat());
        this.f9493c = Utilities.l(aVar.nextFloat());
        if (z9) {
            int[] iArr = q1Var.f9572f;
            zg0 zg0Var = new zg0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = zg0Var;
            zg0Var.R(view);
            zg0Var.J(true);
            zg0Var.K(0);
            zg0Var.start();
        }
        TLObject e22 = qp.s1(i7).e2(j3);
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.l(e22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f9495f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.i0(e22, v8Var, null);
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
        this.f9496g = new my0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.v5 v5Var = new org.telegram.ui.Components.v5(view, 2000L, new LinearInterpolator());
        this.f9497i = v5Var;
        v5Var.e(true, 0.0f);
        v5Var.e(false, 1.0f);
        this.f9498j = new org.telegram.ui.Components.v5(view, 350L, 240L, wq.h);
    }
}
