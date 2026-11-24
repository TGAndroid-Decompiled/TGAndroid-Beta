package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e8b extends v6b {
    public final k39 J;
    public final d8b K;
    public final d29 L;
    public final ImageReceiver M;
    public final ln N;
    public final ho O;
    public boolean P;

    public e8b(Context context, x6b x6bVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, kw3 kw3Var) {
        super(context, x6bVar, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        d8b d8bVar = new d8b(this);
        this.K = d8bVar;
        d29 d29Var = new d29(this);
        this.L = d29Var;
        this.M = new ImageReceiver(this);
        this.N = new ln(this);
        this.O = new ho(false, false, false);
        k39 d = k39.d(tL_mediaAreaSuggestedReaction.reaction);
        this.J = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            d8bVar.b(true, false);
        }
        d8bVar.c(getScaleX());
        d29Var.e(d);
        kw3Var.getClass();
        String str = d.f;
        str = str == null ? k47.U(vm.e(kw3Var.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) kw3Var.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i = 0; i < min; i++) {
                kw3Var.m((TLRPC.Document) arrayList.get(i));
            }
        }
        if (this.J.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(z8c.t0).r.get(this.J.f)) != null) {
            this.M.d0(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        ho hoVar = this.O;
        hoVar.b = 17;
        hoVar.x(gm.n1("fonts/rcondensedbold.ttf"));
        this.O.w(gm.L(18.0f));
        this.O.N = gm.q.x;
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
        d8b d8bVar = this.K;
        d8bVar.setBounds(0, 0, measuredWidth, measuredHeight);
        d8bVar.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = d8bVar.getBounds().centerX() - measuredWidth2;
        float centerY = d8bVar.getBounds().centerY() - measuredWidth2;
        float centerX2 = d8bVar.getBounds().centerX() + measuredWidth2;
        float centerY2 = d8bVar.getBounds().centerY() + measuredWidth2;
        float height = (d8bVar.getBounds().height() * 0.427f) + d8bVar.getBounds().top;
        float f2 = height - measuredWidth2;
        float f3 = height + measuredWidth2;
        if (this.P) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.N.e(false, f);
        Rect rect = gm.Q;
        rect.set((int) centerX, (int) gm.R1(centerY, f2, e), (int) centerX2, (int) gm.R1(centerY2, f3, e));
        if (d8bVar.a == 1) {
            i = -1;
        } else {
            i = -16777216;
        }
        d29 d29Var = this.L;
        d29Var.d(i);
        d29Var.c(rect);
        d29Var.a(canvas);
        float height2 = (d8bVar.getBounds().height() * 0.839f) + d8bVar.getBounds().top;
        ho hoVar = this.O;
        hoVar.setBounds(d8bVar.getBounds().left, (int) (height2 - gm.L(10.0f)), d8bVar.getBounds().right, (int) (gm.L(10.0f) + height2));
        canvas.save();
        canvas.scale(e, e, d8bVar.getBounds().centerX(), height2);
        hoVar.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z) {
        boolean z2;
        boolean z3;
        float f = 0.0f;
        ln lnVar = this.N;
        if (storyViews != null) {
            for (int i = 0; i < storyViews.reactions.size(); i++) {
                if (n39.c(storyViews.reactions.get(i).reaction, this.J)) {
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
                    this.O.t(gm.o0(storyViews.reactions.get(i).count, 0), z2, true);
                    if (!z) {
                        if (this.P) {
                            f = 1.0f;
                        }
                        lnVar.e(true, f);
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
            lnVar.e(true, f);
        }
    }

    public vm getAnimatedEmojiDrawable() {
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
        this.O.w(Math.min(gm.L(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            this.K.c(f);
            super.setScaleX(f);
        }
    }
}
