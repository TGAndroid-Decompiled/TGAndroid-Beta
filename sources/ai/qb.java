package ai;

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
import org.telegram.ui.ez;
public final class qb extends lb {
    public final zg.n0 I;
    public final pb J;
    public final zg.e0 K;
    public final ImageReceiver L;
    public final org.telegram.ui.Components.g6 M;
    public final org.telegram.ui.Components.q6 N;
    public boolean O;

    public qb(Context context, nb nbVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, ez ezVar) {
        super(context, nbVar, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        pb pbVar = new pb(this);
        this.J = pbVar;
        zg.e0 e0Var = new zg.e0(this);
        this.K = e0Var;
        this.L = new ImageReceiver(this);
        this.M = new org.telegram.ui.Components.g6(this);
        this.N = new org.telegram.ui.Components.q6(false, false, false);
        zg.n0 d = zg.n0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.I = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            pbVar.b(true, false);
        }
        pbVar.c(getScaleX());
        e0Var.e(d);
        ezVar.getClass();
        String str = d.f54704f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.s5.f(ezVar.f37481b, d.f54705g)) : str;
        if (str != null && (arrayList = (ArrayList) ezVar.f37483e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                ezVar.l((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.I.f54704f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.I.f54704f)) != null) {
            this.L.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.q6 q6Var = this.N;
        q6Var.f30019b = 17;
        q6Var.x(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
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
        pb pbVar = this.J;
        pbVar.setBounds(0, 0, measuredWidth, measuredHeight);
        pbVar.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = pbVar.getBounds().centerX() - measuredWidth2;
        float centerY = pbVar.getBounds().centerY() - measuredWidth2;
        float centerX2 = pbVar.getBounds().centerX() + measuredWidth2;
        float centerY2 = pbVar.getBounds().centerY() + measuredWidth2;
        float height = (pbVar.getBounds().height() * 0.427f) + pbVar.getBounds().top;
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
        if (pbVar.f1591a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        zg.e0 e0Var = this.K;
        e0Var.d(i10);
        e0Var.c(rect);
        e0Var.a(canvas);
        float height2 = (pbVar.getBounds().height() * 0.839f) + pbVar.getBounds().top;
        org.telegram.ui.Components.q6 q6Var = this.N;
        q6Var.setBounds(pbVar.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), pbVar.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, pbVar.getBounds().centerX(), height2);
        q6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        boolean z11;
        boolean z12;
        float f7 = 0.0f;
        org.telegram.ui.Components.g6 g6Var = this.M;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (zg.p0.d(storyViews.reactions.get(i10).reaction, this.I)) {
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
        return this.K.f54597b;
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
