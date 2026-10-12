package bi;

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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.yj0;
public final class k2 {
    public final long f3226a;
    public final float f3227b;
    public final float f3228c;
    public final yj0 d;
    public final Paint e;
    public final ImageReceiver f3229f;
    public final h11 f3230g;
    public boolean h;
    public final org.telegram.ui.Components.g6 f3231i;
    public final org.telegram.ui.Components.g6 f3232j;

    public k2(l2 l2Var, View view, int i10, long j10, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f3226a = j10;
        this.f3227b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f3228c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = l2Var.f3266f;
            yj0 yj0Var = new yj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = yj0Var;
            yj0Var.R(view);
            yj0Var.J(true);
            yj0Var.K(0);
            yj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f3229f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, k9Var);
        view.addOnAttachStateChangeListener(new j2(this, 0));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        br brVar = new br(R.drawable.star, 0);
        brVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(brVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f3230g = new h11(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(view, 2000L, new LinearInterpolator());
        this.f3231i = g6Var;
        g6Var.d(0.0f, true);
        g6Var.d(1.0f, false);
        this.f3232j = new org.telegram.ui.Components.g6(view, 350L, 240L, es.h);
    }
}
