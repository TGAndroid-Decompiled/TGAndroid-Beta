package fi;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.vy0;
public final class l1 {
    public final long f12206a;
    public final float f12207b;
    public final float f12208c;
    public final mh0 d;
    public final Paint f12209e;
    public final ImageReceiver f12210f;
    public final vy0 f12211g;
    public boolean h;
    public final org.telegram.ui.Components.c6 f12212i;
    public final org.telegram.ui.Components.c6 f12213j;

    public l1(m1 m1Var, View view, int i7, long j3, int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.f12209e = paint;
        this.f12206a = j3;
        g5.a aVar = Utilities.f22781c;
        this.f12207b = Utilities.l(aVar.nextFloat());
        this.f12208c = Utilities.l(aVar.nextFloat());
        if (z10) {
            int[] iArr = m1Var.f12259f;
            mh0 mh0Var = new mh0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = mh0Var;
            mh0Var.R(view);
            mh0Var.J(true);
            mh0Var.K(0);
            mh0Var.start();
        }
        TLObject g22 = mp.u1(i7).g2(j3);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.l(g22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f12210f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.i0(g22, b9Var, null);
        view.addOnAttachStateChangeListener(new bi.r2(this, 5));
        if (view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        lq lqVar = new lq(2131232750, 0);
        lqVar.H = 0.875f;
        spannableStringBuilder.setSpan(lqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) gd.E(i10, ','));
        this.f12211g = new vy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(view, 2000L, new LinearInterpolator());
        this.f12212i = c6Var;
        c6Var.e(true, 0.0f);
        c6Var.e(false, 1.0f);
        this.f12213j = new org.telegram.ui.Components.c6(view, 350L, 240L, lr.h);
    }
}
