package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class m75 extends cv3 {
    public final g95 W;

    public m75(g95 g95Var, LaunchActivity launchActivity, n85 n85Var, d dVar, ylb ylbVar) {
        super(launchActivity, n85Var, dVar, 5, true, ylbVar);
        this.W = g95Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == getEditText()) {
            canvas.save();
            g95 g95Var = this.W;
            g95Var.A1.getEditText().setTranslationY(view.getMeasuredHeight() - g95Var.q5.f);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void f() {
        super.f();
        e34 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.b.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        h94 h94Var = this.W.q5;
        if (h94Var.f == 0.0f) {
            h94Var.c(getMeasuredHeight());
        } else {
            h94Var.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i;
        if (this.e) {
            i = Math.max(0, getEmojiPadding());
        } else if (this.O) {
            i = Math.max(0, getKeyboardHeight());
        } else {
            i = 0;
        }
        g0d g0dVar = this.W.w3;
        if (i > 0) {
            g0dVar.g(i);
        } else {
            g0dVar.i(false);
        }
    }

    @Override
    public final void y() {
        this.W.b.requestApplyInsets();
    }
}
