package jh;

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
import org.telegram.ui.sy;

public final class p8 extends k8 {
    public final ig.q0 E;
    public final o8 F;
    public final ig.h0 G;
    public final ImageReceiver H;
    public final org.telegram.ui.Components.y5 I;
    public final org.telegram.ui.Components.i6 J;
    public boolean K;

    public p8(Context context, m8 m8Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, sy syVar) {
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        super(context, m8Var, tL_mediaAreaSuggestedReaction);
        o8 o8Var = new o8(this);
        this.F = o8Var;
        ig.h0 h0Var = new ig.h0(this);
        this.G = h0Var;
        this.H = new ImageReceiver(this);
        this.I = new org.telegram.ui.Components.y5(this);
        this.J = new org.telegram.ui.Components.i6(false, false, false, false);
        ig.q0 q0VarD = ig.q0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.E = q0VarD;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        o8Var.c(getScaleX());
        h0Var.e(q0VarD);
        syVar.getClass();
        String strFindAnimatedEmojiEmoticon = q0VarD.f11412f;
        strFindAnimatedEmojiEmoticon = strFindAnimatedEmojiEmoticon == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.k5.f(syVar.f42713b, q0VarD.f11413g)) : strFindAnimatedEmojiEmoticon;
        if (strFindAnimatedEmojiEmoticon != null && (arrayList = (ArrayList) syVar.f42715e.get(strFindAnimatedEmojiEmoticon)) != null && !arrayList.isEmpty()) {
            int iMin = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                syVar.m((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.E.f11412f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.E.f11412f)) != null) {
            this.H.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.i6 i6Var = this.J;
        i6Var.f29239b = 17;
        i6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.J.t(AndroidUtilities.dp(18.0f));
        this.J.G = AndroidUtilities.displaySize.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.F.a();
            this.J.r(-1);
        }
    }

    @Override
    public final void a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o8 o8Var = this.F;
        o8Var.setBounds(0, 0, measuredWidth, measuredHeight);
        o8Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float fCenterX = o8Var.getBounds().centerX() - measuredWidth2;
        float fCenterY = o8Var.getBounds().centerY() - measuredWidth2;
        float fCenterX2 = o8Var.getBounds().centerX() + measuredWidth2;
        float fCenterY2 = o8Var.getBounds().centerY() + measuredWidth2;
        float fHeight = (o8Var.getBounds().height() * 0.427f) + o8Var.getBounds().top;
        float f10 = fHeight - measuredWidth2;
        float f11 = fHeight + measuredWidth2;
        float fD = this.I.d(this.K ? 1.0f : 0.0f, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) fCenterX, (int) AndroidUtilities.lerp(fCenterY, f10, fD), (int) fCenterX2, (int) AndroidUtilities.lerp(fCenterY2, f11, fD));
        int i10 = o8Var.f13756a == 1 ? -1 : -16777216;
        ig.h0 h0Var = this.G;
        h0Var.d(i10);
        h0Var.c(rect);
        h0Var.a(canvas);
        float fHeight2 = (o8Var.getBounds().height() * 0.839f) + o8Var.getBounds().top;
        int i11 = o8Var.getBounds().left;
        int iDp = (int) (fHeight2 - AndroidUtilities.dp(10.0f));
        int i12 = o8Var.getBounds().right;
        int iDp2 = (int) (AndroidUtilities.dp(10.0f) + fHeight2);
        org.telegram.ui.Components.i6 i6Var = this.J;
        i6Var.setBounds(i11, iDp, i12, iDp2);
        canvas.save();
        canvas.scale(fD, fD, o8Var.getBounds().centerX(), fHeight2);
        i6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        org.telegram.ui.Components.y5 y5Var = this.I;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (ig.s0.c(storyViews.reactions.get(i10).reaction, this.E)) {
                    boolean z11 = z10 && this.K;
                    this.K = storyViews.reactions.get(i10).count > 0;
                    this.J.q(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i10).count, 0), z11, true);
                    if (z10) {
                        return;
                    }
                    y5Var.d(this.K ? 1.0f : 0.0f, true);
                    return;
                }
            }
        }
        this.K = false;
        invalidate();
        if (z10) {
            return;
        }
        y5Var.d(this.K ? 1.0f : 0.0f, true);
    }

    public org.telegram.ui.Components.k5 getAnimatedEmojiDrawable() {
        return this.G.f11311b;
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
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            this.F.c(f10);
            super.setScaleX(f10);
        }
    }
}
