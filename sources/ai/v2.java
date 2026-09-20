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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u01;
public final class v2 {
    public final long f1602a;
    public final float f1603b;
    public final float f1604c;
    public final hj0 d;
    public final Paint e;
    public final ImageReceiver f1605f;
    public final u01 f1606g;
    public boolean h;
    public final org.telegram.ui.Components.d6 f1607i;
    public final org.telegram.ui.Components.d6 f1608j;

    public v2(w2 w2Var, View view, int i10, long j3, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f1602a = j3;
        this.f1603b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f1604c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = w2Var.f1644f;
            hj0 hj0Var = new hj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = hj0Var;
            hj0Var.R(view);
            hj0Var.J(true);
            hj0Var.K(0);
            hj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f1605f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, g9Var);
        view.addOnAttachStateChangeListener(new u2(this, 0));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        oq oqVar = new oq(R.drawable.star, 0);
        oqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(oqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f1606g = new u01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(view, 2000L, new LinearInterpolator());
        this.f1607i = d6Var;
        d6Var.d(0.0f, true);
        d6Var.d(1.0f, false);
        this.f1608j = new org.telegram.ui.Components.d6(view, 350L, 240L, qr.h);
    }
}
