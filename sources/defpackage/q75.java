package defpackage;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class q75 extends iu3 {
    public final j95 W;

    public q75(j95 j95Var, LaunchActivity launchActivity, r85 r85Var, e eVar, vnb vnbVar) {
        super(launchActivity, r85Var, eVar, 5, true, vnbVar);
        this.W = j95Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == getEditText()) {
            canvas.save();
            j95 j95Var = this.W;
            j95Var.A1.getEditText().setTranslationY(view.getMeasuredHeight() - j95Var.q5.f);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void f() {
        super.f();
        o24 emojiView = getEmojiView();
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
        t84 t84Var = this.W.q5;
        if (t84Var.f == 0.0f) {
            t84Var.c(getMeasuredHeight());
        } else {
            t84Var.a(getMeasuredHeight());
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
        v2d v2dVar = this.W.w3;
        if (i > 0) {
            v2dVar.g(i);
        } else {
            v2dVar.i(false);
        }
    }

    @Override
    public final void y() {
        this.W.b.requestApplyInsets();
    }
}
