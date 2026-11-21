package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.nx;
public final class m8 extends h8 {
    public final ch.p0 J;
    public final l8 K;
    public final ch.g0 L;
    public final ImageReceiver M;
    public final org.telegram.ui.Components.d6 N;
    public final org.telegram.ui.Components.n6 O;
    public boolean P;

    public m8(Context context, j8 j8Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, nx nxVar) {
        super(context, j8Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        l8 l8Var = new l8(this);
        this.K = l8Var;
        ch.g0 g0Var = new ch.g0(this);
        this.L = g0Var;
        this.M = new ImageReceiver(this);
        this.N = new org.telegram.ui.Components.d6(this);
        this.O = new org.telegram.ui.Components.n6(false, false, false);
        ch.p0 d = ch.p0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.J = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            l8Var.b(true, false);
        }
        l8Var.c(getScaleX());
        g0Var.e(d);
        nxVar.getClass();
        String str = d.f5504f;
        str = str == null ? fj.U(org.telegram.ui.Components.p5.e(nxVar.f50333b, d.f5505g)) : str;
        if (str != null && (arrayList = (ArrayList) nxVar.f50335e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i7 = 0; i7 < min; i7++) {
                nxVar.l((TLRPC.Document) arrayList.get(i7));
            }
        }
        if (this.J.f5504f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(j10.f24798t0).f26661r.get(this.J.f5504f)) != null) {
            this.M.q0(fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.n6 n6Var = this.O;
        n6Var.f37791b = 17;
        n6Var.x(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        this.O.w(org.telegram.messenger.g0.L(18.0f));
        this.O.N = org.telegram.messenger.g0.f24146q.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.K.a();
            this.O.u(-1);
        }
    }

    @Override
    public final void a(Canvas canvas) {
        float f10;
        int i7;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        l8 l8Var = this.K;
        l8Var.setBounds(0, 0, measuredWidth, measuredHeight);
        l8Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = l8Var.getBounds().centerX() - measuredWidth2;
        float centerY = l8Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = l8Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = l8Var.getBounds().centerY() + measuredWidth2;
        float height = (l8Var.getBounds().height() * 0.427f) + l8Var.getBounds().top;
        float f11 = height - measuredWidth2;
        float f12 = height + measuredWidth2;
        if (this.P) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.N.e(false, f10);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) centerX, (int) org.telegram.messenger.g0.T1(centerY, f11, e10), (int) centerX2, (int) org.telegram.messenger.g0.T1(centerY2, f12, e10));
        if (l8Var.f12268a == 1) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        ch.g0 g0Var = this.L;
        g0Var.d(i7);
        g0Var.c(rect);
        g0Var.a(canvas);
        float height2 = (l8Var.getBounds().height() * 0.839f) + l8Var.getBounds().top;
        org.telegram.ui.Components.n6 n6Var = this.O;
        n6Var.setBounds(l8Var.getBounds().left, (int) (height2 - org.telegram.messenger.g0.L(10.0f)), l8Var.getBounds().right, (int) (org.telegram.messenger.g0.L(10.0f) + height2));
        canvas.save();
        canvas.scale(e10, e10, l8Var.getBounds().centerX(), height2);
        n6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        boolean z11;
        boolean z12;
        float f10 = 0.0f;
        org.telegram.ui.Components.d6 d6Var = this.N;
        if (storyViews != null) {
            for (int i7 = 0; i7 < storyViews.reactions.size(); i7++) {
                if (ch.s0.c(storyViews.reactions.get(i7).reaction, this.J)) {
                    if (z10 && this.P) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (storyViews.reactions.get(i7).count > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.P = z12;
                    this.O.t(org.telegram.messenger.g0.o0(storyViews.reactions.get(i7).count, 0), z11, true);
                    if (!z10) {
                        if (this.P) {
                            f10 = 1.0f;
                        }
                        d6Var.e(true, f10);
                        return;
                    }
                    return;
                }
            }
        }
        this.P = false;
        invalidate();
        if (!z10) {
            if (this.P) {
                f10 = 1.0f;
            }
            d6Var.e(true, f10);
        }
    }

    public org.telegram.ui.Components.p5 getAnimatedEmojiDrawable() {
        return this.L.f5388b;
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
        this.L.b(true);
        this.M.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.b(false);
        this.M.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.O.w(Math.min(org.telegram.messenger.g0.L(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            this.K.c(f10);
            super.setScaleX(f10);
        }
    }
}
