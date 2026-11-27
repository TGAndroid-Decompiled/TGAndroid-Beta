package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_keyboard;
public final class cf9 extends View {
    public final ek9 a;
    public final int b;
    public boolean c;
    public boolean d;
    public final me7 e;
    public final ff9 f;

    public cf9(ff9 ff9Var, Context context, TL_keyboard.PageButton pageButton, int i) {
        super(context);
        this.f = ff9Var;
        this.b = i;
        int i2 = ff9Var.n;
        int d = c00.d(32.0f, hl.q.x, hl.L(240.0f));
        vnb vnbVar = ff9Var.r;
        v59 v59Var = new v59(this, (byte) 5);
        hl9 hl9Var = new hl9(i2, d, vnbVar);
        SpannableStringBuilder l = hl9Var.l(pageButton.text, hl9.Q(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        ek9 ek9Var = new ek9(hl9Var, d, l, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, v59Var);
        this.a = ek9Var;
        this.e = new me7(this, i, (byte) 14);
        ek9Var.e = ek9Var.h();
        setContentDescription(mm9.l(pageButton.text));
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
        hl.r(this.e);
        this.a.a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        ek9 ek9Var = this.a;
        canvas.translate(0.0f, (height - ek9Var.c()) / 2.0f);
        ek9Var.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ek9 ek9Var = this.a;
        setMeasuredDimension(ek9Var.e, hl.L(8.0f) + ek9Var.c());
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
