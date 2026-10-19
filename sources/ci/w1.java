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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yq;
public final class w1 {
    public final long f6103a;
    public final float f6104b;
    public final float f6105c;
    public final uj0 d;
    public final Paint e;
    public final ImageReceiver f6106f;
    public final e11 f6107g;
    public boolean h;
    public final org.telegram.ui.Components.f6 f6108i;
    public final org.telegram.ui.Components.f6 f6109j;

    public w1(x1 x1Var, View view, int i10, long j10, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f6103a = j10;
        this.f6104b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f6105c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = x1Var.f6151f;
            uj0 uj0Var = new uj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = uj0Var;
            uj0Var.R(view);
            uj0Var.J(true);
            uj0Var.K(0);
            uj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f6106f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, h9Var);
        view.addOnAttachStateChangeListener(new ai.m6(this, 1));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        yq yqVar = new yq(R.drawable.star, 0);
        yqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(yqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f6107g = new e11(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(view, 2000L, new LinearInterpolator());
        this.f6108i = f6Var;
        f6Var.d(0.0f, true);
        f6Var.d(1.0f, false);
        this.f6109j = new org.telegram.ui.Components.f6(view, 350L, 240L, bs.h);
    }
}
