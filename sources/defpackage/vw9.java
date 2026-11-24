package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class vw9 extends oq3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = e66.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final ww9 U;

    public vw9(ww9 ww9Var) {
        this.U = ww9Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw9.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                dx9 dx9Var = (dx9) arrayList.get(i);
                if (!dx9Var.b) {
                    if (dx9Var.a) {
                        dx9Var.F.setBounds(dx9Var.G);
                        dx9Var.F.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = dx9Var.r;
                        if (imageReceiver != null) {
                            imageReceiver.h(canvas, dx9Var.f[this.L]);
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f) {
        float f2;
        int i;
        Drawable drawable;
        int i2;
        tx9 tx9Var = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i3 = 0;
            float f3 = f;
            int i4 = 0;
            while (i4 < this.P.size()) {
                dx9 dx9Var = (dx9) this.P.get(i4);
                if (!dx9Var.b) {
                    float scaleX = dx9Var.getScaleX();
                    int i5 = tx9Var.a0;
                    if (i5 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f4 = dx9Var.O;
                    if (f4 != 0.0f || (dx9Var.T > 0.0f && i5 != 3 && i5 != 4)) {
                        if (i5 != 3 && i5 != 4) {
                            f2 = dx9Var.T * 0.7f;
                        } else {
                            f2 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f2, f4)) * 0.2f) + 0.8f;
                    }
                    if (tx9Var.R1 > 0 && SystemClock.elapsedRealtime() - tx9Var.R1 < tx9Var.e()) {
                        i = 1;
                    } else {
                        i = i3;
                    }
                    if (i != 0 && tx9Var.P1 >= 0 && tx9Var.Q1 >= 0 && tx9Var.R1 > 0) {
                        int R = RecyclerView.R(dx9Var);
                        int i6 = tx9Var.P1;
                        int i7 = R - i6;
                        int i8 = tx9Var.Q1 - i6;
                        if (i7 >= 0 && i7 < i8) {
                            float a = moe.a(((float) (SystemClock.elapsedRealtime() - tx9Var.R1)) / ((float) tx9Var.d()), 0.0f, 1.0f);
                            float f5 = i7;
                            float f6 = i8;
                            float f7 = f6 / 4.0f;
                            float s = gl.s(a, f5, f6, f7);
                            scaleX *= (this.T.getInterpolation(gl.s(a, f5, f6, f7)) * 0.5f) + 0.5f;
                            f3 = s;
                        }
                    } else {
                        f3 *= dx9Var.getAlpha();
                    }
                    Rect rect = gl.Q;
                    rect.set(dx9Var.getPaddingLeft() + ((int) dx9Var.getX()), dx9Var.getPaddingTop(), (dx9Var.getWidth() + ((int) dx9Var.getX())) - dx9Var.getPaddingRight(), dx9Var.getHeight() - dx9Var.getPaddingBottom());
                    if (!tx9Var.y1 && i == 0) {
                        rect.offset(i3, (int) dx9Var.getTranslationY());
                    }
                    if (dx9Var.a) {
                        drawable = tx9Var.getPremiumStar();
                        int i9 = tx9Var.a0;
                        if (i9 == 5 || i9 == 10 || i9 == 9 || i9 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!dx9Var.s && !dx9Var.R) {
                        if ((dx9Var.e != null || tx9Var.a0 == 13) && !dx9Var.b && (drawable = dx9Var.F) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = dx9Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.j0(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = tx9Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = dx9Var.F;
                        if (drawable2 instanceof vl) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f8 = this.R;
                    dx9Var.P = f8;
                    dx9Var.Q = i4;
                    if (scaleX == 1.0f && f8 >= 1.0f) {
                        m(canvas, drawable, dx9Var, f3);
                    } else {
                        canvas.save();
                        float f9 = dx9Var.T;
                        if (f9 > 1.0f && (i2 = tx9Var.a0) != 3 && i2 != 4 && i2 != 6) {
                            float R1 = gl.R1(1.0f, 0.85f, f9);
                            canvas.scale(R1, R1, rect.centerX(), rect.centerY());
                        }
                        int i10 = tx9Var.a0;
                        if (i10 != 6 && i10 != 13 && i10 != 14) {
                            dx9Var.getHeight();
                            float f10 = this.R;
                            if (f10 < 1.0f) {
                                canvas.scale(1.0f, f10, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i4 * 2.0f) / this.P.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, dx9Var, f3);
                        canvas.restore();
                    }
                }
                i4++;
                i3 = 0;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i < arrayList.size()) {
                il5 il5Var = ((dx9) arrayList.get(i)).f[this.L];
                if (il5Var != null) {
                    il5Var.a();
                }
                i++;
            } else {
                this.U.m3.i0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw9.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, dx9 dx9Var, float f) {
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((dx9Var.s || dx9Var.R) && dx9Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = dx9Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), dx9Var.h.x());
            dx9Var.h.setAlpha(f);
            dx9Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
