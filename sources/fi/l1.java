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
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.xy0;
public final class l1 {
    public final long f12198a;
    public final float f12199b;
    public final float f12200c;
    public final oh0 d;
    public final Paint f12201e;
    public final ImageReceiver f12202f;
    public final xy0 f12203g;
    public boolean h;
    public final org.telegram.ui.Components.d6 f12204i;
    public final org.telegram.ui.Components.d6 f12205j;

    public l1(m1 m1Var, View view, int i7, long j3, int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.f12201e = paint;
        this.f12198a = j3;
        g5.a aVar = Utilities.f22773c;
        this.f12199b = Utilities.l(aVar.nextFloat());
        this.f12200c = Utilities.l(aVar.nextFloat());
        if (z10) {
            int[] iArr = m1Var.f12251f;
            oh0 oh0Var = new oh0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
            this.d = oh0Var;
            oh0Var.R(view);
            oh0Var.J(true);
            oh0Var.K(0);
            oh0Var.start();
        }
        TLObject g22 = np.u1(i7).g2(j3);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(g22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f12202f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(7.0f));
        imageReceiver.i0(g22, b9Var, null);
        view.addOnAttachStateChangeListener(new bi.x2(this, 5));
        if (view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        nq nqVar = new nq(2131232750, 0);
        nqVar.H = 0.875f;
        spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) hd.E(i10, ','));
        this.f12203g = new xy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(view, 2000L, new LinearInterpolator());
        this.f12204i = d6Var;
        d6Var.e(true, 0.0f);
        d6Var.e(false, 1.0f);
        this.f12205j = new org.telegram.ui.Components.d6(view, 350L, 240L, nr.h);
    }
}
