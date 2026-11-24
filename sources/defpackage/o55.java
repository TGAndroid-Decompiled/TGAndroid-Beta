package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class o55 extends rt3 {
    public final h75 W;

    public o55(h75 h75Var, LaunchActivity launchActivity, p65 p65Var, d dVar, wjb wjbVar) {
        super(launchActivity, p65Var, dVar, 5, true, wjbVar);
        this.W = h75Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == getEditText()) {
            canvas.save();
            h75 h75Var = this.W;
            h75Var.A1.getEditText().setTranslationY(view.getMeasuredHeight() - h75Var.q5.f);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void f() {
        super.f();
        t14 emojiView = getEmojiView();
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
        y74 y74Var = this.W.q5;
        if (y74Var.f == 0.0f) {
            y74Var.c(getMeasuredHeight());
        } else {
            y74Var.a(getMeasuredHeight());
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
        fyc fycVar = this.W.w3;
        if (i > 0) {
            fycVar.g(i);
        } else {
            fycVar.i(false);
        }
    }

    @Override
    public final void y() {
        this.W.b.requestApplyInsets();
    }
}
