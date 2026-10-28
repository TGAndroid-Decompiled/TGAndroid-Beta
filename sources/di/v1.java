package di;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.zq;
public final class v1 {
    public final long f9242a;
    public final float f9243b;
    public final float f9244c;
    public final yj0 d;
    public final Paint e;
    public final ImageReceiver f9245f;
    public final r11 f9246g;
    public boolean h;
    public final org.telegram.ui.Components.h6 f9247i;
    public final org.telegram.ui.Components.h6 f9248j;

    public v1(w1 w1Var, View view, int i10, long j10, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f9242a = j10;
        this.f9243b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f9244c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = w1Var.f9290f;
            yj0 yj0Var = new yj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = yj0Var;
            yj0Var.R(view);
            yj0Var.J(true);
            yj0Var.K(0);
            yj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f9245f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, j9Var);
        view.addOnAttachStateChangeListener(new bi.i6(this, 1));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        zq zqVar = new zq(R.drawable.star, 0);
        zqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(zqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f9246g = new r11(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(view, 2000L, new LinearInterpolator());
        this.f9247i = h6Var;
        h6Var.d(0.0f, true);
        h6Var.d(1.0f, false);
        this.f9248j = new org.telegram.ui.Components.h6(view, 350L, 240L, ds.h);
    }
}
