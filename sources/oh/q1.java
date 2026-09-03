package oh;

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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
public final class q1 {
    public final long f17645a;
    public final float f17646b;
    public final float f17647c;
    public final hj0 d;
    public final Paint f17648e;
    public final ImageReceiver f17649f;
    public final k01 f17650g;
    public boolean h;
    public final org.telegram.ui.Components.z5 f17651i;
    public final org.telegram.ui.Components.z5 f17652j;

    public q1(r1 r1Var, View view, int i10, long j10, int i11, boolean z4) {
        Paint paint = new Paint(1);
        this.f17648e = paint;
        this.f17645a = j10;
        this.f17646b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f17647c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z4) {
            int[] iArr = r1Var.f17681f;
            hj0 hj0Var = new hj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = hj0Var;
            hj0Var.f27542s0 = view;
            hj0Var.H(true);
            hj0Var.I(0);
            hj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f17649f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, z8Var);
        view.addOnAttachStateChangeListener(new ff.b(this, 7));
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
        this.f17650g = new k01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(view, 2000L, new LinearInterpolator());
        this.f17651i = z5Var;
        z5Var.d(0.0f, true);
        z5Var.d(1.0f, false);
        this.f17652j = new org.telegram.ui.Components.z5(view, 350L, 240L, pr.h);
    }
}
