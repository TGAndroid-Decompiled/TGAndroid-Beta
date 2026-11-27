package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class av7 {
    public final long a;
    public final float b;
    public final float c;
    public final b29 d;
    public final Paint e;
    public final ImageReceiver f;
    public final pkb g;
    public boolean h;
    public final mm i;
    public final mm j;

    public av7(bv7 bv7Var, View view, int i, long j, int i2, boolean z) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j;
        o3d o3dVar = Utilities.c;
        this.b = Utilities.l(o3dVar.nextFloat());
        this.c = Utilities.l(o3dVar.nextFloat());
        if (z) {
            int[] iArr = bv7Var.f;
            b29 b29Var = new b29(iArr[o3dVar.nextInt(iArr.length)], hl.L(70.0f), hl.L(70.0f));
            this.d = b29Var;
            b29Var.M(view);
            b29Var.E(true);
            b29Var.F(0);
            b29Var.start();
        }
        TLObject b2 = uc7.s1(i).b2(j);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(b2);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.i0(hl.L(2.0f), hl.L(2.0f), hl.L(14.0f), hl.L(14.0f));
        imageReceiver.q0(hl.L(7.0f));
        imageReceiver.U(b2, rb0Var, null);
        view.addOnAttachStateChangeListener(new xc(this, (byte) 11));
        if (view.isAttachedToWindow()) {
            imageReceiver.I();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        wm2 wm2Var = new wm2(2131232771, 0);
        wm2Var.H = 0.875f;
        spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) ob6.E(i2, ','));
        this.g = new pkb(spannableStringBuilder, 10.0f, hl.n1("fonts/num.otf"));
        mm mmVar = new mm(2000L, view, new LinearInterpolator());
        this.i = mmVar;
        mmVar.e(true, 0.0f);
        mmVar.e(false, 1.0f);
        this.j = new mm(view, 350L, 240L, k43.h);
    }
}
