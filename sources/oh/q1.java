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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
public final class q1 {
    public final long f17643a;
    public final float f17644b;
    public final float f17645c;
    public final ij0 d;
    public final Paint f17646e;
    public final ImageReceiver f17647f;
    public final l01 f17648g;
    public boolean h;
    public final org.telegram.ui.Components.z5 f17649i;
    public final org.telegram.ui.Components.z5 f17650j;

    public q1(r1 r1Var, View view, int i10, long j10, int i11, boolean z4) {
        Paint paint = new Paint(1);
        this.f17646e = paint;
        this.f17643a = j10;
        this.f17644b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f17645c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z4) {
            int[] iArr = r1Var.f17679f;
            int i12 = iArr[Utilities.fastRandom.nextInt(iArr.length)];
            ij0 ij0Var = new ij0(i12, AndroidUtilities.dp(70.0f), l.d.j(i12, ""), AndroidUtilities.dp(70.0f));
            this.d = ij0Var;
            ij0Var.f27835s0 = view;
            ij0Var.H(true);
            ij0Var.I(0);
            ij0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f17647f = imageReceiver;
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
        this.f17648g = new l01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(view, 2000L, new LinearInterpolator());
        this.f17649i = z5Var;
        z5Var.d(0.0f, true);
        z5Var.d(1.0f, false);
        this.f17650j = new org.telegram.ui.Components.z5(view, 350L, 240L, pr.h);
    }
}
