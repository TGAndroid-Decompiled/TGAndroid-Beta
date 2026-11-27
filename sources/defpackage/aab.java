package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class aab extends t8b {
    public final w49 J;
    public final z9b K;
    public final p39 L;
    public final ImageReceiver M;
    public final mm N;
    public final hn O;
    public boolean P;

    public aab(Context context, v8b v8bVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, tv3 tv3Var) {
        super(context, v8bVar, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        z9b z9bVar = new z9b(this);
        this.K = z9bVar;
        p39 p39Var = new p39(this);
        this.L = p39Var;
        this.M = new ImageReceiver(this);
        this.N = new mm(this);
        this.O = new hn(false, false, false);
        w49 d = w49.d(tL_mediaAreaSuggestedReaction.reaction);
        this.J = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            z9bVar.b(true, false);
        }
        z9bVar.c(getScaleX());
        p39Var.e(d);
        tv3Var.getClass();
        String str = d.f;
        str = str == null ? r47.U(wl.e(tv3Var.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) tv3Var.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i = 0; i < min; i++) {
                tv3Var.m((TLRPC.Document) arrayList.get(i));
            }
        }
        if (this.J.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(yac.t0).r.get(this.J.f)) != null) {
            this.M.d0(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        hn hnVar = this.O;
        hnVar.b = 17;
        hnVar.x(hl.n1("fonts/rcondensedbold.ttf"));
        this.O.w(hl.L(18.0f));
        this.O.N = hl.q.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.K.a();
            this.O.u(-1);
        }
    }

    @Override
    public final void a(Canvas canvas) {
        float f;
        int i;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        z9b z9bVar = this.K;
        z9bVar.setBounds(0, 0, measuredWidth, measuredHeight);
        z9bVar.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = z9bVar.getBounds().centerX() - measuredWidth2;
        float centerY = z9bVar.getBounds().centerY() - measuredWidth2;
        float centerX2 = z9bVar.getBounds().centerX() + measuredWidth2;
        float centerY2 = z9bVar.getBounds().centerY() + measuredWidth2;
        float height = (z9bVar.getBounds().height() * 0.427f) + z9bVar.getBounds().top;
        float f2 = height - measuredWidth2;
        float f3 = height + measuredWidth2;
        if (this.P) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.N.e(false, f);
        Rect rect = hl.Q;
        rect.set((int) centerX, (int) hl.R1(centerY, f2, e), (int) centerX2, (int) hl.R1(centerY2, f3, e));
        if (z9bVar.a == 1) {
            i = -1;
        } else {
            i = -16777216;
        }
        p39 p39Var = this.L;
        p39Var.d(i);
        p39Var.c(rect);
        p39Var.a(canvas);
        float height2 = (z9bVar.getBounds().height() * 0.839f) + z9bVar.getBounds().top;
        hn hnVar = this.O;
        hnVar.setBounds(z9bVar.getBounds().left, (int) (height2 - hl.L(10.0f)), z9bVar.getBounds().right, (int) (hl.L(10.0f) + height2));
        canvas.save();
        canvas.scale(e, e, z9bVar.getBounds().centerX(), height2);
        hnVar.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z) {
        boolean z2;
        boolean z3;
        float f = 0.0f;
        mm mmVar = this.N;
        if (storyViews != null) {
            for (int i = 0; i < storyViews.reactions.size(); i++) {
                if (z49.c(storyViews.reactions.get(i).reaction, this.J)) {
                    if (z && this.P) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (storyViews.reactions.get(i).count > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.P = z3;
                    this.O.t(hl.o0(storyViews.reactions.get(i).count, 0), z2, true);
                    if (!z) {
                        if (this.P) {
                            f = 1.0f;
                        }
                        mmVar.e(true, f);
                        return;
                    }
                    return;
                }
            }
        }
        this.P = false;
        invalidate();
        if (!z) {
            if (this.P) {
                f = 1.0f;
            }
            mmVar.e(true, f);
        }
    }

    public wl getAnimatedEmojiDrawable() {
        return this.L.b;
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
        this.M.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.b(false);
        this.M.K();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.O.w(Math.min(hl.L(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            this.K.c(f);
            super.setScaleX(f);
        }
    }
}
