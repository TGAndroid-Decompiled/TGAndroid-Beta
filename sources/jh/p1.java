package jh;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.pz0;

public final class p1 {

    public final long f13809a;

    public final float f13810b;

    public final float f13811c;
    public final oi0 d;

    public final Paint f13812e;

    public final ImageReceiver f13813f;

    public final pz0 f13814g;
    public boolean h;

    public final org.telegram.ui.Components.y5 f13815i;

    public final org.telegram.ui.Components.y5 f13816j;

    public p1(q1 q1Var, View view, int i10, long j10, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.f13812e = paint;
        this.f13809a = j10;
        this.f13810b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f13811c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = q1Var.f13847f;
            int i12 = iArr[Utilities.fastRandom.nextInt(iArr.length)];
            oi0 oi0Var = new oi0(i12, AndroidUtilities.dp(70.0f), i0.a.k(i12, ""), AndroidUtilities.dp(70.0f));
            this.d = oi0Var;
            oi0Var.f31328r0 = view;
            oi0Var.H(true);
            oi0Var.I(0);
            oi0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f13813f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, y8Var);
        view.addOnAttachStateChangeListener(new bf.b(this, 5));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        cq cqVar = new cq(R.drawable.star, 0);
        cqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(cqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f13814g = new pz0(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(view, 2000L, new LinearInterpolator());
        this.f13815i = y5Var;
        y5Var.d(0.0f, true);
        y5Var.d(1.0f, false);
        this.f13816j = new org.telegram.ui.Components.y5(view, 350L, 240L, er.h);
    }
}
