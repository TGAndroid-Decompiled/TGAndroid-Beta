package ih;

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
import org.telegram.ui.py;
public final class t8 extends o8 {
    public final hg.r0 E;
    public final s8 F;
    public final hg.i0 G;
    public final ImageReceiver H;
    public final org.telegram.ui.Components.y5 I;
    public final org.telegram.ui.Components.i6 J;
    public boolean K;

    public t8(Context context, q8 q8Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, py pyVar) {
        super(context, q8Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        s8 s8Var = new s8(this);
        this.F = s8Var;
        hg.i0 i0Var = new hg.i0(this);
        this.G = i0Var;
        this.H = new ImageReceiver(this);
        this.I = new org.telegram.ui.Components.y5(this);
        this.J = new org.telegram.ui.Components.i6(false, false, false, false);
        hg.r0 d = hg.r0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.E = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            s8Var.b(true, false);
        }
        s8Var.c(getScaleX());
        i0Var.e(d);
        pyVar.getClass();
        String str = d.f10717f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.k5.f(pyVar.f41617b, d.f10718g)) : str;
        if (str != null && (arrayList = (ArrayList) pyVar.f41619e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i9 = 0; i9 < min; i9++) {
                pyVar.m((TLRPC.Document) arrayList.get(i9));
            }
        }
        if (this.E.f10717f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.E.f10717f)) != null) {
            this.H.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.i6 i6Var = this.J;
        i6Var.f29333b = 17;
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
        float f10;
        int i9;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        s8 s8Var = this.F;
        s8Var.setBounds(0, 0, measuredWidth, measuredHeight);
        s8Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = s8Var.getBounds().centerX() - measuredWidth2;
        float centerY = s8Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = s8Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = s8Var.getBounds().centerY() + measuredWidth2;
        float height = (s8Var.getBounds().height() * 0.427f) + s8Var.getBounds().top;
        float f11 = height - measuredWidth2;
        float f12 = height + measuredWidth2;
        if (this.K) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.I.d(f10, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) centerX, (int) AndroidUtilities.lerp(centerY, f11, d), (int) centerX2, (int) AndroidUtilities.lerp(centerY2, f12, d));
        if (s8Var.f12126a == 1) {
            i9 = -1;
        } else {
            i9 = -16777216;
        }
        hg.i0 i0Var = this.G;
        i0Var.d(i9);
        i0Var.c(rect);
        i0Var.a(canvas);
        float height2 = (s8Var.getBounds().height() * 0.839f) + s8Var.getBounds().top;
        org.telegram.ui.Components.i6 i6Var = this.J;
        i6Var.setBounds(s8Var.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), s8Var.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, s8Var.getBounds().centerX(), height2);
        i6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        boolean z11;
        boolean z12;
        float f10 = 0.0f;
        org.telegram.ui.Components.y5 y5Var = this.I;
        if (storyViews != null) {
            for (int i9 = 0; i9 < storyViews.reactions.size(); i9++) {
                if (hg.t0.c(storyViews.reactions.get(i9).reaction, this.E)) {
                    if (z10 && this.K) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (storyViews.reactions.get(i9).count > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.K = z12;
                    this.J.q(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i9).count, 0), z11, true);
                    if (!z10) {
                        if (this.K) {
                            f10 = 1.0f;
                        }
                        y5Var.d(f10, true);
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
                f10 = 1.0f;
            }
            y5Var.d(f10, true);
        }
    }

    public org.telegram.ui.Components.k5 getAnimatedEmojiDrawable() {
        return this.G.f10617b;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
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
