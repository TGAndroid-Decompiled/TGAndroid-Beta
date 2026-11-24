package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_keyboard;
public final class md9 extends View {
    public final ri9 a;
    public final int b;
    public boolean c;
    public boolean d;
    public final ge7 e;
    public final pd9 f;

    public md9(pd9 pd9Var, Context context, TL_keyboard.PageButton pageButton, int i) {
        super(context);
        this.f = pd9Var;
        this.b = i;
        int i2 = pd9Var.n;
        int c = b10.c(32.0f, gm.q.x, gm.L(240.0f));
        ylb ylbVar = pd9Var.r;
        pp8 pp8Var = new pp8(this, (byte) 27);
        uj9 uj9Var = new uj9(i2, c, ylbVar);
        SpannableStringBuilder l = uj9Var.l(pageButton.text, uj9.Q(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        ri9 ri9Var = new ri9(uj9Var, c, l, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, pp8Var);
        this.a = ri9Var;
        this.e = new ge7(this, i, (byte) 13);
        ri9Var.e = ri9Var.i();
        setContentDescription(zk9.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        gm.r(this.e);
        this.a.a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        ri9 ri9Var = this.a;
        canvas.translate(0.0f, (height - ri9Var.d()) / 2.0f);
        ri9Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ri9 ri9Var = this.a;
        setMeasuredDimension(ri9Var.e, gm.L(8.0f) + ri9Var.d());
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
