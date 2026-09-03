package nh;

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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
public final class q1 {
    public final long f15772a;
    public final float f15773b;
    public final float f15774c;
    public final gj0 d;
    public final Paint e;
    public final ImageReceiver f15775f;
    public final k01 f15776g;
    public boolean h;
    public final org.telegram.ui.Components.z5 f15777i;
    public final org.telegram.ui.Components.z5 f15778j;

    public q1(r1 r1Var, View view, int i10, long j10, int i11, boolean z4) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f15772a = j10;
        this.f15773b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.f15774c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z4) {
            int[] iArr = r1Var.f15808f;
            gj0 gj0Var = new gj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = gj0Var;
            gj0Var.f25176s0 = view;
            gj0Var.H(true);
            gj0Var.I(0);
            gj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f15775f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, z8Var);
        view.addOnAttachStateChangeListener(new ef.b(this, 7));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        lq lqVar = new lq(R.drawable.star, 0);
        lqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(lqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.f15776g = new k01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(view, 2000L, new LinearInterpolator());
        this.f15777i = z5Var;
        z5Var.d(0.0f, true);
        z5Var.d(1.0f, false);
        this.f15778j = new org.telegram.ui.Components.z5(view, 350L, 240L, mr.h);
    }
}
