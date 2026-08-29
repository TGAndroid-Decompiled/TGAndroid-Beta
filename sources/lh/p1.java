package lh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zz0;
public final class p1 {
    public final long f16080a;
    public final float f16081b;
    public final float f16082c;
    public final xi0 d;
    public final Paint f16083e;
    public final ImageReceiver f16084f;
    public final zz0 f16085g;
    public boolean h;
    public final org.telegram.ui.Components.d6 f16086i;
    public final org.telegram.ui.Components.d6 f16087j;

    public p1(q1 q1Var, View view, int i10, long j10, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.f16083e = paint;
        this.f16080a = j10;
        this.f16081b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f16082c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = q1Var.f16113f;
            int i12 = iArr[Utilities.fastRandom.nextInt(iArr.length)];
            xi0 xi0Var = new xi0(i12, AndroidUtilities.dp(70.0f), j7.l1.k(i12, ""), AndroidUtilities.dp(70.0f));
            this.d = xi0Var;
            xi0Var.f34753r0 = view;
            xi0Var.H(true);
            xi0Var.I(0);
            xi0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f16084f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, e9Var);
        view.addOnAttachStateChangeListener(new df.b(this, 7));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        iq iqVar = new iq(R.drawable.star, 0);
        iqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(iqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f16085g = new zz0(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(view, 2000L, new LinearInterpolator());
        this.f16086i = d6Var;
        d6Var.d(0.0f, true);
        d6Var.d(1.0f, false);
        this.f16087j = new org.telegram.ui.Components.d6(view, 350L, 240L, jr.h);
    }
}
