package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yj0;
public final class v1 {
    public final long f6006a;
    public final float f6007b;
    public final float f6008c;
    public final yj0 d;
    public final Paint e;
    public final ImageReceiver f6009f;
    public final i11 f6010g;
    public boolean h;
    public final org.telegram.ui.Components.f6 f6011i;
    public final org.telegram.ui.Components.f6 f6012j;

    public v1(w1 w1Var, View view, int i10, long j10, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f6006a = j10;
        this.f6007b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f6008c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = w1Var.f6044f;
            yj0 yj0Var = new yj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = yj0Var;
            yj0Var.R(view);
            yj0Var.J(true);
            yj0Var.K(0);
            yj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f6009f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, h9Var);
        view.addOnAttachStateChangeListener(new ai.n6(this, 1));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        xq xqVar = new xq(R.drawable.star, 0);
        xqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(xqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f6010g = new i11(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(view, 2000L, new LinearInterpolator());
        this.f6011i = f6Var;
        f6Var.d(0.0f, true);
        f6Var.d(1.0f, false);
        this.f6012j = new org.telegram.ui.Components.f6(view, 350L, 240L, bs.h);
    }
}
