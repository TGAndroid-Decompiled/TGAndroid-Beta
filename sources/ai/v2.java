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
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.xi0;
public final class v2 {
    public final long f1597a;
    public final float f1598b;
    public final float f1599c;
    public final xi0 d;
    public final Paint e;
    public final ImageReceiver f1600f;
    public final g01 f1601g;
    public boolean h;
    public final org.telegram.ui.Components.c6 f1602i;
    public final org.telegram.ui.Components.c6 f1603j;

    public v2(w2 w2Var, View view, int i10, long j3, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f1597a = j3;
        this.f1598b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f1599c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = w2Var.f1639f;
            xi0 xi0Var = new xi0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = xi0Var;
            xi0Var.f29972v0 = view;
            xi0Var.J(true);
            xi0Var.K(0);
            xi0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        f9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f1600f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, f9Var);
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
        this.f1601g = new g01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(view, 2000L, new LinearInterpolator());
        this.f1602i = c6Var;
        c6Var.d(0.0f, true);
        c6Var.d(1.0f, false);
        this.f1603j = new org.telegram.ui.Components.c6(view, 350L, 240L, qr.h);
    }
}
