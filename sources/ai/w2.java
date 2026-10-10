package ai;

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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
public final class w2 {
    public final long f1843a;
    public final float f1844b;
    public final float f1845c;
    public final dk0 d;
    public final Paint f1846e;
    public final ImageReceiver f1847f;
    public final m11 f1848g;
    public boolean h;
    public final org.telegram.ui.Components.g6 f1849i;
    public final org.telegram.ui.Components.g6 f1850j;

    public w2(x2 x2Var, View view, int i10, long j3, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.f1846e = paint;
        this.f1843a = j3;
        this.f1844b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f1845c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = x2Var.f1899f;
            dk0 dk0Var = new dk0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = dk0Var;
            dk0Var.R(view);
            dk0Var.J(true);
            dk0Var.K(0);
            dk0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f1847f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, j9Var);
        view.addOnAttachStateChangeListener(new v2(this, 0));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        er erVar = new er(R.drawable.star, 0);
        erVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(erVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f1848g = new m11(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(view, 2000L, new LinearInterpolator());
        this.f1849i = g6Var;
        g6Var.d(0.0f, true);
        g6Var.d(1.0f, false);
        this.f1850j = new org.telegram.ui.Components.g6(view, 350L, 240L, is.h);
    }
}
