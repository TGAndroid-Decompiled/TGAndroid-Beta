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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;
public final class j2 {
    public final long f3126a;
    public final float f3127b;
    public final float f3128c;
    public final xi0 d;
    public final Paint f3129e;
    public final ImageReceiver f3130f;
    public final f01 f3131g;
    public boolean h;
    public final org.telegram.ui.Components.e6 f3132i;
    public final org.telegram.ui.Components.e6 f3133j;

    public j2(k2 k2Var, View view, int i10, long j3, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.f3129e = paint;
        this.f3126a = j3;
        this.f3127b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f3128c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = k2Var.f3190f;
            xi0 xi0Var = new xi0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = xi0Var;
            xi0Var.f32578v0 = view;
            xi0Var.H(true);
            xi0Var.I(0);
            xi0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f3130f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, i9Var);
        view.addOnAttachStateChangeListener(new i2(this, 0));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        nq nqVar = new nq(R.drawable.star, 0);
        nqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f3131g = new f01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(view, 2000L, new LinearInterpolator());
        this.f3132i = e6Var;
        e6Var.d(0.0f, true);
        e6Var.d(1.0f, false);
        this.f3133j = new org.telegram.ui.Components.e6(view, 350L, 240L, pr.h);
    }
}
