package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
public final class g78 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public o49 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public f78 w;
    public kp x;

    public final void a(int i, MotionEvent motionEvent) {
        l78 l78Var;
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
            kp kpVar = this.x;
            int i2 = kpVar.a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            l78Var = null;
                        } else {
                            l78Var = (l78) kpVar.e;
                        }
                    } else {
                        l78Var = (l78) kpVar.d;
                    }
                } else {
                    l78Var = (l78) kpVar.c;
                }
            } else {
                l78Var = (l78) kpVar.b;
            }
            int i3 = this.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                l78Var.e = mlb.f(l78Var.e, min, 100.0f, 0.0f);
                            }
                        } else {
                            l78Var.d = mlb.f(l78Var.d, min, 100.0f, 0.0f);
                        }
                    } else {
                        l78Var.c = mlb.f(l78Var.c, min, 100.0f, 0.0f);
                    }
                } else {
                    l78Var.b = mlb.f(l78Var.b, min, 100.0f, 0.0f);
                }
            } else {
                l78Var.a = mlb.f(l78Var.a, min, 100.0f, 0.0f);
            }
            invalidate();
            f78 f78Var = this.w;
            if (f78Var != null) {
                n78 n78Var = ((h78) f78Var).a;
                n78Var.g();
                uf4 uf4Var = n78Var.m0;
                if (uf4Var != null) {
                    uf4Var.b(false, false, false);
                }
            }
            this.d = y;
        } else if (this.a != 0) {
        } else {
            o49 o49Var = this.e;
            this.a = (int) Math.floor(aq1.z(x, o49Var.a, o49Var.c / 5.0f, 1.0f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        l78 l78Var;
        int i;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        kp kpVar = this.x;
        o49 o49Var = this.e;
        float f2 = o49Var.c / 5.0f;
        int i2 = 0;
        while (true) {
            f = o49Var.a;
            if (i2 >= 4) {
                break;
            }
            float f3 = f + f2 + (i2 * f2);
            float f4 = o49Var.b;
            canvas.drawLine(f3, f4, f3, f4 + o49Var.d, this.f);
            i2++;
        }
        float f5 = o49Var.b;
        canvas.drawLine(f, f5 + o49Var.d, f + o49Var.c, f5, this.h);
        int i3 = kpVar.a;
        int i4 = 3;
        int i5 = 2;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        l78Var = null;
                    } else {
                        paint.setColor(-13404165);
                        l78Var = (l78) kpVar.e;
                    }
                } else {
                    paint.setColor(-15667555);
                    l78Var = (l78) kpVar.d;
                }
            } else {
                paint.setColor(-1229492);
                l78Var = (l78) kpVar.c;
            }
        } else {
            paint.setColor(-1);
            l78Var = (l78) kpVar.b;
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
                                format = String.format(Locale.US, "%.2f", Float.valueOf(l78Var.e / 100.0f));
                            }
                        } else {
                            i = i5;
                            format = String.format(Locale.US, "%.2f", Float.valueOf(l78Var.d / 100.0f));
                        }
                    } else {
                        i = i5;
                        format = String.format(Locale.US, "%.2f", Float.valueOf(l78Var.c / 100.0f));
                    }
                } else {
                    i = i5;
                    format = String.format(Locale.US, "%.2f", Float.valueOf(l78Var.b / 100.0f));
                }
            } else {
                i = i5;
                format = String.format(Locale.US, "%.2f", Float.valueOf(l78Var.a / 100.0f));
            }
            canvas.drawText(format, (i6 * f2) + aq1.z(f2, textPaint.measureText(format), 2.0f, o49Var.a), (o49Var.b + o49Var.d) - gm.L(4.0f), textPaint);
            i6++;
            i5 = i;
            i4 = 3;
        }
        float[] a = l78Var.a();
        invalidate();
        path.reset();
        for (int i7 = 0; i7 < a.length / 2; i7++) {
            float f6 = o49Var.a;
            int i8 = i7 << 1;
            if (i7 == 0) {
                path.moveTo((a[i8] * o49Var.c) + f6, ((1.0f - a[i8 + 1]) * o49Var.d) + o49Var.b);
            } else {
                path.lineTo((a[i8] * o49Var.c) + f6, ((1.0f - a[i8 + 1]) * o49Var.d) + o49Var.b);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g78.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(f78 f78Var) {
        this.w = f78Var;
    }
}
