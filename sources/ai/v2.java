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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w01;
public final class v2 {
    public final long f1602a;
    public final float f1603b;
    public final float f1604c;
    public final lj0 d;
    public final Paint e;
    public final ImageReceiver f1605f;
    public final w01 f1606g;
    public boolean h;
    public final org.telegram.ui.Components.e6 f1607i;
    public final org.telegram.ui.Components.e6 f1608j;

    public v2(w2 w2Var, View view, int i10, long j3, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f1602a = j3;
        this.f1603b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f1604c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = w2Var.f1652f;
            lj0 lj0Var = new lj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = lj0Var;
            lj0Var.R(view);
            lj0Var.J(true);
            lj0Var.K(0);
            lj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f1605f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, h9Var);
        view.addOnAttachStateChangeListener(new u2(this, 0));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        rq rqVar = new rq(R.drawable.star, 0);
        rqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(rqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f1606g = new w01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(view, 2000L, new LinearInterpolator());
        this.f1607i = e6Var;
        e6Var.d(0.0f, true);
        e6Var.d(1.0f, false);
        this.f1608j = new org.telegram.ui.Components.e6(view, 350L, 240L, tr.h);
    }
}
