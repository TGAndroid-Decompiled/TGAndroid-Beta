package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
public final class jb1 extends TextView {
    public final byte a = 0;
    public final Paint b;
    public Path c;
    public Object d;
    public final Object e;

    public jb1(xu9 xu9Var, Context context) {
        super(context);
        this.e = xu9Var;
        this.c = new Path();
        this.d = new RectF();
        this.b = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                int p1 = cmb.p1(0.15f, cmb.v0(cmb.n6, ((xu9) this.e).c));
                Paint paint = this.b;
                paint.setColor(p1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.c;
                Paint paint2 = l39.S;
                l39.h(rectF, gm.P, path);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                b66 b66Var = (b66) this.c;
                if (b66Var != null) {
                    canvas.drawPath(b66Var, this.b);
                }
                if (((i66) this.e).g(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                xu9 xu9Var = (xu9) this.e;
                super.onLayout(z, i, i2, i3, i4);
                int width = getWidth();
                int i5 = 0;
                for (int i6 = 0; i6 < xu9Var.getChildCount(); i6++) {
                    width = Math.min(width, xu9Var.getChildAt(i6).getLeft());
                    i5 = Math.max(i5, xu9Var.getChildAt(i6).getRight());
                }
                setPivotX((width + i5) / 2.0f);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        float f;
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    g6c[] g6cVarArr = (g6c[]) spanned.getSpans(0, spanned.length(), g6c.class);
                    if (g6cVarArr != null && g6cVarArr.length > 0) {
                        b66 b66Var = new b66(0);
                        this.c = b66Var;
                        b66Var.n = false;
                        for (int i5 = 0; i5 < g6cVarArr.length; i5++) {
                            int spanStart = spanned.getSpanStart(g6cVarArr[i5]);
                            int spanEnd = spanned.getSpanEnd(g6cVarArr[i5]);
                            ((b66) this.c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i3 = getPaint().baselineShift;
                            } else {
                                i3 = 0;
                            }
                            b66 b66Var2 = (b66) this.c;
                            if (i3 != 0) {
                                if (i3 > 0) {
                                    f = 5.0f;
                                } else {
                                    f = -2.0f;
                                }
                                i4 = gm.L(f) + i3;
                            } else {
                                i4 = 0;
                            }
                            b66Var2.o = i4;
                            getLayout().getSelectionPath(spanStart, spanEnd, (b66) this.c);
                        }
                        ((b66) this.c).n = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                i66 i66Var = (i66) this.e;
                Layout layout = getLayout();
                int x = (int) (motionEvent.getX() - 0.0f);
                int y = (int) (motionEvent.getY() - 0.0f);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y);
                    float f = x;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f && layout.getLineWidth(lineForVertical) + lineLeft >= f && y >= 0 && y <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            i66Var.e(true);
                            if (motionEvent.getAction() == 0) {
                                m66 m66Var = new m66(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = m66Var;
                                m66Var.d(771751935);
                                i66Var.a((m66) this.d, null);
                                int spanStart = spannable.getSpanStart(((m66) this.d).i);
                                int spanEnd = spannable.getSpanEnd(((m66) this.d).i);
                                b66 b = ((m66) this.d).b();
                                b.d(layout, spanStart, 0.0f);
                                layout.getSelectionPath(spanStart, spanEnd, b);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                m66 m66Var2 = (m66) this.d;
                                if (m66Var2 != null) {
                                    CharacterStyle characterStyle = m66Var2.i;
                                    ClickableSpan clickableSpan = clickableSpanArr[0];
                                    if (characterStyle == clickableSpan) {
                                        clickableSpan.onClick(this);
                                    }
                                }
                                this.d = null;
                                return true;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    i66Var.e(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public jb1(Context context, Paint paint) {
        super(context);
        this.b = paint;
        this.e = new i66(this);
    }
}
