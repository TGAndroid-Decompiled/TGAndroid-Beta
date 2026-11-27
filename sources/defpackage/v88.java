package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class v88 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public a69 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public u88 w;
    public lo x;

    public final void a(int i, MotionEvent motionEvent) {
        a98 a98Var;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (i != 1) {
            if (i != 2) {
                if ((i == 3 || i == 4 || i == 5) && this.a != 0) {
                    this.a = 0;
                    return;
                }
                return;
            }
            float min = Math.min(2.0f, (this.d - y) / 8.0f);
            lo loVar = this.x;
            int i2 = loVar.a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            a98Var = null;
                        } else {
                            a98Var = (a98) loVar.e;
                        }
                    } else {
                        a98Var = (a98) loVar.d;
                    }
                } else {
                    a98Var = (a98) loVar.c;
                }
            } else {
                a98Var = (a98) loVar.b;
            }
            int i3 = this.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                a98Var.e = xnb.f(a98Var.e, min, 100.0f, 0.0f);
                            }
                        } else {
                            a98Var.d = xnb.f(a98Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        a98Var.c = xnb.f(a98Var.c, min, 100.0f, 0.0f);
                    }
                } else {
                    a98Var.b = xnb.f(a98Var.b, min, 100.0f, 0.0f);
                }
            } else {
                a98Var.a = xnb.f(a98Var.a, min, 100.0f, 0.0f);
            }
            invalidate();
            u88 u88Var = this.w;
            if (u88Var != null) {
                c98 c98Var = ((w88) u88Var).a;
                c98Var.e();
                rf4 rf4Var = c98Var.m0;
                if (rf4Var != null) {
                    rf4Var.b(false, false, false);
                }
            }
            this.d = y;
        } else if (this.a != 0) {
        } else {
            a69 a69Var = this.e;
            this.a = (int) Math.floor(bp1.z(x, a69Var.a, a69Var.c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        a98 a98Var;
        int i;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        lo loVar = this.x;
        a69 a69Var = this.e;
        float f2 = a69Var.c / 5.0f;
        int i2 = 0;
        while (true) {
            f = a69Var.a;
            if (i2 >= 4) {
                break;
            }
            float f3 = f + f2 + (i2 * f2);
            float f4 = a69Var.b;
            canvas.drawLine(f3, f4, f3, f4 + a69Var.d, this.f);
            i2++;
        }
        float f5 = a69Var.b;
        canvas.drawLine(f, f5 + a69Var.d, f + a69Var.c, f5, this.h);
        int i3 = loVar.a;
        int i4 = 3;
        int i5 = 2;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        a98Var = null;
                    } else {
                        paint.setColor(-13404165);
                        a98Var = (a98) loVar.e;
                    }
                } else {
                    paint.setColor(-15667555);
                    a98Var = (a98) loVar.d;
                }
            } else {
                paint.setColor(-1229492);
                a98Var = (a98) loVar.c;
            }
        } else {
            paint.setColor(-1);
            a98Var = (a98) loVar.b;
        }
        int i6 = 0;
        while (i6 < 5) {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != i5) {
                        if (i6 != i4) {
                            if (i6 != 4) {
                                format = "";
                                i = i5;
                            } else {
                                i = i5;
                                format = String.format(Locale.US, "%.2f", Float.valueOf(a98Var.e / 100.0f));
                            }
                        } else {
                            i = i5;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(a98Var.d / 100.0f));
                        }
                    } else {
                        i = i5;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(a98Var.c / 100.0f));
                    }
                } else {
                    i = i5;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(a98Var.b / 100.0f));
                }
            } else {
                i = i5;
                format = String.format(Locale.US, "%.2f", Float.valueOf(a98Var.a / 100.0f));
            }
            canvas.drawText(format, (i6 * f2) + bp1.z(f2, textPaint.measureText(format), 2.0f, a69Var.a), (a69Var.b + a69Var.d) - hl.L(4.0f), textPaint);
            i6++;
            i5 = i;
            i4 = 3;
        }
        float[] a = a98Var.a();
        invalidate();
        path.reset();
        for (int i7 = 0; i7 < a.length / 2; i7++) {
            float f6 = a69Var.a;
            int i8 = i7 << 1;
            if (i7 == 0) {
                path.moveTo((a[i8] * a69Var.c) + f6, ((1.0f - a[i8 + 1]) * a69Var.d) + a69Var.b);
            } else {
                path.lineTo((a[i8] * a69Var.c) + f6, ((1.0f - a[i8 + 1]) * a69Var.d) + a69Var.b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v88.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(u88 u88Var) {
        this.w = u88Var;
    }
}
