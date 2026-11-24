package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class c6b extends u4b {
    public final h19 J;
    public final b6b K;
    public final b09 L;
    public final ImageReceiver M;
    public final lm N;
    public final gn O;
    public boolean P;

    public c6b(Context context, w4b w4bVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, zu3 zu3Var) {
        super(context, w4bVar, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        b6b b6bVar = new b6b(this);
        this.K = b6bVar;
        b09 b09Var = new b09(this);
        this.L = b09Var;
        this.M = new ImageReceiver(this);
        this.N = new lm(this);
        this.O = new gn(false, false, false);
        h19 d = h19.d(tL_mediaAreaSuggestedReaction.reaction);
        this.J = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            b6bVar.b(true, false);
        }
        b6bVar.c(getScaleX());
        b09Var.e(d);
        zu3Var.getClass();
        String str = d.f;
        str = str == null ? k27.U(vl.e(zu3Var.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) zu3Var.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i = 0; i < min; i++) {
                zu3Var.m((TLRPC.Document) arrayList.get(i));
            }
        }
        if (this.J.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(y6c.t0).r.get(this.J.f)) != null) {
            this.M.d0(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        gn gnVar = this.O;
        gnVar.b = 17;
        gnVar.x(gl.n1("fonts/rcondensedbold.ttf"));
        this.O.w(gl.L(18.0f));
        this.O.N = gl.q.x;
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
        b6b b6bVar = this.K;
        b6bVar.setBounds(0, 0, measuredWidth, measuredHeight);
        b6bVar.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = b6bVar.getBounds().centerX() - measuredWidth2;
        float centerY = b6bVar.getBounds().centerY() - measuredWidth2;
        float centerX2 = b6bVar.getBounds().centerX() + measuredWidth2;
        float centerY2 = b6bVar.getBounds().centerY() + measuredWidth2;
        float height = (b6bVar.getBounds().height() * 0.427f) + b6bVar.getBounds().top;
        float f2 = height - measuredWidth2;
        float f3 = height + measuredWidth2;
        if (this.P) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.N.e(false, f);
        Rect rect = gl.Q;
        rect.set((int) centerX, (int) gl.R1(centerY, f2, e), (int) centerX2, (int) gl.R1(centerY2, f3, e));
        if (b6bVar.a == 1) {
            i = -1;
        } else {
            i = -16777216;
        }
        b09 b09Var = this.L;
        b09Var.d(i);
        b09Var.c(rect);
        b09Var.a(canvas);
        float height2 = (b6bVar.getBounds().height() * 0.839f) + b6bVar.getBounds().top;
        gn gnVar = this.O;
        gnVar.setBounds(b6bVar.getBounds().left, (int) (height2 - gl.L(10.0f)), b6bVar.getBounds().right, (int) (gl.L(10.0f) + height2));
        canvas.save();
        canvas.scale(e, e, b6bVar.getBounds().centerX(), height2);
        gnVar.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z) {
        boolean z2;
        boolean z3;
        float f = 0.0f;
        lm lmVar = this.N;
        if (storyViews != null) {
            for (int i = 0; i < storyViews.reactions.size(); i++) {
                if (k19.c(storyViews.reactions.get(i).reaction, this.J)) {
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
                    this.O.t(gl.o0(storyViews.reactions.get(i).count, 0), z2, true);
                    if (!z) {
                        if (this.P) {
                            f = 1.0f;
                        }
                        lmVar.e(true, f);
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
            lmVar.e(true, f);
        }
    }

    public vl getAnimatedEmojiDrawable() {
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
        this.O.w(Math.min(gl.L(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            this.K.c(f);
            super.setScaleX(f);
        }
    }
}
