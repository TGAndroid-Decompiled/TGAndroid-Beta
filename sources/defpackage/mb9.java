package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_keyboard;
public final class mb9 extends View {
    public final og9 a;
    public final int b;
    public boolean c;
    public boolean d;
    public final on7 e;
    public final pb9 f;

    public mb9(pb9 pb9Var, Context context, TL_keyboard.PageButton pageButton, int i) {
        super(context);
        this.f = pb9Var;
        this.b = i;
        int i2 = pb9Var.n;
        int c = b00.c(32.0f, gl.q.x, gl.L(240.0f));
        wjb wjbVar = pb9Var.r;
        sr8 sr8Var = new sr8(this, (byte) 19);
        rh9 rh9Var = new rh9(i2, c, wjbVar);
        SpannableStringBuilder l = rh9Var.l(pageButton.text, rh9.Q(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        og9 og9Var = new og9(rh9Var, c, l, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, sr8Var);
        this.a = og9Var;
        this.e = new on7(this, i, (byte) 11);
        og9Var.e = og9Var.h();
        setContentDescription(yi9.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a.i(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        gl.r(this.e);
        this.a.a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        og9 og9Var = this.a;
        canvas.translate(0.0f, (height - og9Var.c()) / 2.0f);
        og9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        og9 og9Var = this.a;
        setMeasuredDimension(og9Var.e, gl.L(8.0f) + og9Var.c());
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
