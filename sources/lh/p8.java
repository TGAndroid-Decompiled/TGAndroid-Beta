package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ry;
public final class p8 extends k8 {
    public final kg.q0 E;
    public final o8 F;
    public final kg.h0 G;
    public final ImageReceiver H;
    public final org.telegram.ui.Components.d6 I;
    public final org.telegram.ui.Components.n6 J;
    public boolean K;

    public p8(Context context, m8 m8Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, ry ryVar) {
        super(context, m8Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        o8 o8Var = new o8(this);
        this.F = o8Var;
        kg.h0 h0Var = new kg.h0(this);
        this.G = h0Var;
        this.H = new ImageReceiver(this);
        this.I = new org.telegram.ui.Components.d6(this);
        this.J = new org.telegram.ui.Components.n6(false, false, false, false);
        kg.q0 d = kg.q0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.E = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        o8Var.c(getScaleX());
        h0Var.e(d);
        ryVar.getClass();
        String str = d.f13825f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.p5.f(ryVar.f42226b, d.f13826g)) : str;
        if (str != null && (arrayList = (ArrayList) ryVar.f42228e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                ryVar.m((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.E.f13825f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.E.f13825f)) != null) {
            this.H.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.n6 n6Var = this.J;
        n6Var.f30862b = 17;
        n6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.J.t(AndroidUtilities.dp(18.0f));
        this.J.G = AndroidUtilities.displaySize.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.F.a();
            this.J.r(-1);
        }
    }

    @Override
    public final void a(Canvas canvas) {
        float f9;
        int i10;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o8 o8Var = this.F;
        o8Var.setBounds(0, 0, measuredWidth, measuredHeight);
        o8Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = o8Var.getBounds().centerX() - measuredWidth2;
        float centerY = o8Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = o8Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = o8Var.getBounds().centerY() + measuredWidth2;
        float height = (o8Var.getBounds().height() * 0.427f) + o8Var.getBounds().top;
        float f10 = height - measuredWidth2;
        float f11 = height + measuredWidth2;
        if (this.K) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = this.I.d(f9, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) centerX, (int) AndroidUtilities.lerp(centerY, f10, d), (int) centerX2, (int) AndroidUtilities.lerp(centerY2, f11, d));
        if (o8Var.f16027a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        kg.h0 h0Var = this.G;
        h0Var.d(i10);
        h0Var.c(rect);
        h0Var.a(canvas);
        float height2 = (o8Var.getBounds().height() * 0.839f) + o8Var.getBounds().top;
        org.telegram.ui.Components.n6 n6Var = this.J;
        n6Var.setBounds(o8Var.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), o8Var.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, o8Var.getBounds().centerX(), height2);
        n6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        boolean z11;
        boolean z12;
        float f9 = 0.0f;
        org.telegram.ui.Components.d6 d6Var = this.I;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (kg.s0.c(storyViews.reactions.get(i10).reaction, this.E)) {
                    if (z10 && this.K) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (storyViews.reactions.get(i10).count > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.K = z12;
                    this.J.q(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i10).count, 0), z11, true);
                    if (!z10) {
                        if (this.K) {
                            f9 = 1.0f;
                        }
                        d6Var.d(f9, true);
                        return;
                    }
                    return;
                }
            }
        }
        this.K = false;
        invalidate();
        if (!z10) {
            if (this.K) {
                f9 = 1.0f;
            }
            d6Var.d(f9, true);
        }
    }

    public org.telegram.ui.Components.p5 getAnimatedEmojiDrawable() {
        return this.G.f13724b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G.b(true);
        this.H.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G.b(false);
        this.H.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.J.t(Math.min(AndroidUtilities.dp(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f9) {
        if (getScaleX() != f9) {
            this.F.c(f9);
            super.setScaleX(f9);
        }
    }
}
