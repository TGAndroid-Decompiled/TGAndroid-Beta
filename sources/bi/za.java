package bi;

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
import org.telegram.ui.kz;
public final class za extends ua {
    public final ah.i1 I;
    public final ya J;
    public final ah.y0 K;
    public final ImageReceiver L;
    public final org.telegram.ui.Components.g6 M;
    public final org.telegram.ui.Components.r6 N;
    public boolean O;

    public za(Context context, wa waVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, kz kzVar) {
        super(context, waVar, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        ya yaVar = new ya(this);
        this.J = yaVar;
        ah.y0 y0Var = new ah.y0(this);
        this.K = y0Var;
        this.L = new ImageReceiver(this);
        this.M = new org.telegram.ui.Components.g6(this);
        this.N = new org.telegram.ui.Components.r6(false, false, false);
        ah.i1 d = ah.i1.d(tL_mediaAreaSuggestedReaction.reaction);
        this.I = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            yaVar.b(true, false);
        }
        yaVar.c(getScaleX());
        y0Var.e(d);
        kzVar.getClass();
        String str = d.f779f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.s5.f(kzVar.f37781b, d.f780g)) : str;
        if (str != null && (arrayList = (ArrayList) kzVar.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                kzVar.l((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.I.f779f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.I.f779f)) != null) {
            this.L.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.r6 r6Var = this.N;
        r6Var.f28748b = 17;
        r6Var.x(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.N.w(AndroidUtilities.dp(18.0f));
        this.N.M = AndroidUtilities.displaySize.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.J.a();
            this.N.u(-1);
        }
    }

    @Override
    public final void a(Canvas canvas) {
        float f7;
        int i10;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ya yaVar = this.J;
        yaVar.setBounds(0, 0, measuredWidth, measuredHeight);
        yaVar.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = yaVar.getBounds().centerX() - measuredWidth2;
        float centerY = yaVar.getBounds().centerY() - measuredWidth2;
        float centerX2 = yaVar.getBounds().centerX() + measuredWidth2;
        float centerY2 = yaVar.getBounds().centerY() + measuredWidth2;
        float height = (yaVar.getBounds().height() * 0.427f) + yaVar.getBounds().top;
        float f10 = height - measuredWidth2;
        float f11 = height + measuredWidth2;
        if (this.O) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.M.d(f7, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) centerX, (int) AndroidUtilities.lerp(centerY, f10, d), (int) centerX2, (int) AndroidUtilities.lerp(centerY2, f11, d));
        if (yaVar.f4033a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        ah.y0 y0Var = this.K;
        y0Var.d(i10);
        y0Var.c(rect);
        y0Var.a(canvas);
        float height2 = (yaVar.getBounds().height() * 0.839f) + yaVar.getBounds().top;
        org.telegram.ui.Components.r6 r6Var = this.N;
        r6Var.setBounds(yaVar.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), yaVar.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, yaVar.getBounds().centerX(), height2);
        r6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        boolean z11;
        boolean z12;
        float f7 = 0.0f;
        org.telegram.ui.Components.g6 g6Var = this.M;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (ah.l1.c(storyViews.reactions.get(i10).reaction, this.I)) {
                    if (z10 && this.O) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (storyViews.reactions.get(i10).count > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.O = z12;
                    this.N.t(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i10).count, 0), z11, true);
                    if (!z10) {
                        if (this.O) {
                            f7 = 1.0f;
                        }
                        g6Var.d(f7, true);
                        return;
                    }
                    return;
                }
            }
        }
        this.O = false;
        invalidate();
        if (!z10) {
            if (this.O) {
                f7 = 1.0f;
            }
            g6Var.d(f7, true);
        }
    }

    public org.telegram.ui.Components.s5 getAnimatedEmojiDrawable() {
        return this.K.f904b;
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
        this.K.b(true);
        this.L.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.b(false);
        this.L.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.N.w(Math.min(AndroidUtilities.dp(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            this.J.c(f7);
            super.setScaleX(f7);
        }
    }
}
