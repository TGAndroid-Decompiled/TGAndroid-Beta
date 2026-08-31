package oh;

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
import org.telegram.ui.cz;
public final class p8 extends k8 {
    public final ng.q0 F;
    public final o8 G;
    public final ng.h0 H;
    public final ImageReceiver I;
    public final org.telegram.ui.Components.z5 J;
    public final org.telegram.ui.Components.j6 K;
    public boolean L;

    public p8(Context context, m8 m8Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, cz czVar) {
        super(context, m8Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        o8 o8Var = new o8(this);
        this.G = o8Var;
        ng.h0 h0Var = new ng.h0(this);
        this.H = h0Var;
        this.I = new ImageReceiver(this);
        this.J = new org.telegram.ui.Components.z5(this);
        this.K = new org.telegram.ui.Components.j6(false, false, false, false);
        ng.q0 d = ng.q0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.F = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        o8Var.c(getScaleX());
        h0Var.e(d);
        czVar.getClass();
        String str = d.f16178f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.l5.f(czVar.f35937b, d.f16179g)) : str;
        if (str != null && (arrayList = (ArrayList) czVar.f35939e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                czVar.m((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.F.f16178f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.F.f16178f)) != null) {
            this.I.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.j6 j6Var = this.K;
        j6Var.f28029b = 17;
        j6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.K.t(AndroidUtilities.dp(18.0f));
        this.K.G = AndroidUtilities.displaySize.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.G.a();
            this.K.r(-1);
        }
    }

    @Override
    public final void a(Canvas canvas) {
        float f10;
        int i10;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o8 o8Var = this.G;
        o8Var.setBounds(0, 0, measuredWidth, measuredHeight);
        o8Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = o8Var.getBounds().centerX() - measuredWidth2;
        float centerY = o8Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = o8Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = o8Var.getBounds().centerY() + measuredWidth2;
        float height = (o8Var.getBounds().height() * 0.427f) + o8Var.getBounds().top;
        float f11 = height - measuredWidth2;
        float f12 = height + measuredWidth2;
        if (this.L) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.J.d(f10, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) centerX, (int) AndroidUtilities.lerp(centerY, f11, d), (int) centerX2, (int) AndroidUtilities.lerp(centerY2, f12, d));
        if (o8Var.f17559a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        ng.h0 h0Var = this.H;
        h0Var.d(i10);
        h0Var.c(rect);
        h0Var.a(canvas);
        float height2 = (o8Var.getBounds().height() * 0.839f) + o8Var.getBounds().top;
        org.telegram.ui.Components.j6 j6Var = this.K;
        j6Var.setBounds(o8Var.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), o8Var.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, o8Var.getBounds().centerX(), height2);
        j6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z4) {
        boolean z10;
        boolean z11;
        float f10 = 0.0f;
        org.telegram.ui.Components.z5 z5Var = this.J;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (ng.s0.c(storyViews.reactions.get(i10).reaction, this.F)) {
                    if (z4 && this.L) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (storyViews.reactions.get(i10).count > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.L = z11;
                    this.K.q(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i10).count, 0), z10, true);
                    if (!z4) {
                        if (this.L) {
                            f10 = 1.0f;
                        }
                        z5Var.d(f10, true);
                        return;
                    }
                    return;
                }
            }
        }
        this.L = false;
        invalidate();
        if (!z4) {
            if (this.L) {
                f10 = 1.0f;
            }
            z5Var.d(f10, true);
        }
    }

    public org.telegram.ui.Components.l5 getAnimatedEmojiDrawable() {
        return this.H.f16076b;
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
        this.H.b(true);
        this.I.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.b(false);
        this.I.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.K.t(Math.min(AndroidUtilities.dp(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            this.G.c(f10);
            super.setScaleX(f10);
        }
    }
}
