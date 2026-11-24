package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class e58 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public l29 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public d58 w;
    public ko x;

    public final void a(int i, MotionEvent motionEvent) {
        j58 j58Var;
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
            ko koVar = this.x;
            int i2 = koVar.a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            j58Var = null;
                        } else {
                            j58Var = (j58) koVar.e;
                        }
                    } else {
                        j58Var = (j58) koVar.d;
                    }
                } else {
                    j58Var = (j58) koVar.c;
                }
            } else {
                j58Var = (j58) koVar.b;
            }
            int i3 = this.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                j58Var.e = yjb.f(j58Var.e, min, 100.0f, 0.0f);
                            }
                        } else {
                            j58Var.d = yjb.f(j58Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        j58Var.c = yjb.f(j58Var.c, min, 100.0f, 0.0f);
                    }
                } else {
                    j58Var.b = yjb.f(j58Var.b, min, 100.0f, 0.0f);
                }
            } else {
                j58Var.a = yjb.f(j58Var.a, min, 100.0f, 0.0f);
            }
            invalidate();
            d58 d58Var = this.w;
            if (d58Var != null) {
                l58 l58Var = ((f58) d58Var).a;
                l58Var.e();
                td4 td4Var = l58Var.m0;
                if (td4Var != null) {
                    td4Var.b(false, false, false);
                }
            }
            this.d = y;
        } else if (this.a != 0) {
        } else {
            l29 l29Var = this.e;
            this.a = (int) Math.floor(oo1.z(x, l29Var.a, l29Var.c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        j58 j58Var;
        int i;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        ko koVar = this.x;
        l29 l29Var = this.e;
        float f2 = l29Var.c / 5.0f;
        int i2 = 0;
        while (true) {
            f = l29Var.a;
            if (i2 >= 4) {
                break;
            }
            float f3 = f + f2 + (i2 * f2);
            float f4 = l29Var.b;
            canvas.drawLine(f3, f4, f3, f4 + l29Var.d, this.f);
            i2++;
        }
        float f5 = l29Var.b;
        canvas.drawLine(f, f5 + l29Var.d, f + l29Var.c, f5, this.h);
        int i3 = koVar.a;
        int i4 = 3;
        int i5 = 2;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        j58Var = null;
                    } else {
                        paint.setColor(-13404165);
                        j58Var = (j58) koVar.e;
                    }
                } else {
                    paint.setColor(-15667555);
                    j58Var = (j58) koVar.d;
                }
            } else {
                paint.setColor(-1229492);
                j58Var = (j58) koVar.c;
            }
        } else {
            paint.setColor(-1);
            j58Var = (j58) koVar.b;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(j58Var.e / 100.0f));
                            }
                        } else {
                            i = i5;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(j58Var.d / 100.0f));
                        }
                    } else {
                        i = i5;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(j58Var.c / 100.0f));
                    }
                } else {
                    i = i5;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(j58Var.b / 100.0f));
                }
            } else {
                i = i5;
                format = String.format(Locale.US, "%.2f", Float.valueOf(j58Var.a / 100.0f));
            }
            canvas.drawText(format, (i6 * f2) + oo1.z(f2, textPaint.measureText(format), 2.0f, l29Var.a), (l29Var.b + l29Var.d) - gl.L(4.0f), textPaint);
            i6++;
            i5 = i;
            i4 = 3;
        }
        float[] a = j58Var.a();
        invalidate();
        path.reset();
        for (int i7 = 0; i7 < a.length / 2; i7++) {
            float f6 = l29Var.a;
            int i8 = i7 << 1;
            if (i7 == 0) {
                path.moveTo((a[i8] * l29Var.c) + f6, ((1.0f - a[i8 + 1]) * l29Var.d) + l29Var.b);
            } else {
                path.lineTo((a[i8] * l29Var.c) + f6, ((1.0f - a[i8 + 1]) * l29Var.d) + l29Var.b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e58.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(d58 d58Var) {
        this.w = d58Var;
    }
}
