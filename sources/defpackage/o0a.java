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
public final class o0a extends fr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = i86.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final p0a U;

    public o0a(p0a p0aVar) {
        this.U = p0aVar;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0a.a(android.graphics.Canvas, long, int, int, float):void");
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
                w0a w0aVar = (w0a) arrayList.get(i);
                if (!w0aVar.b) {
                    if (w0aVar.a) {
                        w0aVar.F.setBounds(w0aVar.G);
                        w0aVar.F.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = w0aVar.r;
                        if (imageReceiver != null) {
                            imageReceiver.h(canvas, w0aVar.f[this.L]);
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
        n1a n1aVar = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i3 = 0;
            float f3 = f;
            int i4 = 0;
            while (i4 < this.P.size()) {
                w0a w0aVar = (w0a) this.P.get(i4);
                if (!w0aVar.b) {
                    float scaleX = w0aVar.getScaleX();
                    int i5 = n1aVar.a0;
                    if (i5 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f4 = w0aVar.O;
                    if (f4 != 0.0f || (w0aVar.T > 0.0f && i5 != 3 && i5 != 4)) {
                        if (i5 != 3 && i5 != 4) {
                            f2 = w0aVar.T * 0.7f;
                        } else {
                            f2 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f2, f4)) * 0.2f) + 0.8f;
                    }
                    if (n1aVar.R1 > 0 && SystemClock.elapsedRealtime() - n1aVar.R1 < n1aVar.e()) {
                        i = 1;
                    } else {
                        i = i3;
                    }
                    if (i != 0 && n1aVar.P1 >= 0 && n1aVar.Q1 >= 0 && n1aVar.R1 > 0) {
                        int S = RecyclerView.S(w0aVar);
                        int i6 = n1aVar.P1;
                        int i7 = S - i6;
                        int i8 = n1aVar.Q1 - i6;
                        if (i7 >= 0 && i7 < i8) {
                            float a = ete.a(((float) (SystemClock.elapsedRealtime() - n1aVar.R1)) / ((float) n1aVar.d()), 0.0f, 1.0f);
                            float f5 = i7;
                            float f6 = i8;
                            float f7 = f6 / 4.0f;
                            float s = hl.s(a, f5, f6, f7);
                            scaleX *= (this.T.getInterpolation(hl.s(a, f5, f6, f7)) * 0.5f) + 0.5f;
                            f3 = s;
                        }
                    } else {
                        f3 *= w0aVar.getAlpha();
                    }
                    Rect rect = hl.Q;
                    rect.set(w0aVar.getPaddingLeft() + ((int) w0aVar.getX()), w0aVar.getPaddingTop(), (w0aVar.getWidth() + ((int) w0aVar.getX())) - w0aVar.getPaddingRight(), w0aVar.getHeight() - w0aVar.getPaddingBottom());
                    if (!n1aVar.y1 && i == 0) {
                        rect.offset(i3, (int) w0aVar.getTranslationY());
                    }
                    if (w0aVar.a) {
                        drawable = n1aVar.getPremiumStar();
                        int i9 = n1aVar.a0;
                        if (i9 == 5 || i9 == 10 || i9 == 9 || i9 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!w0aVar.s && !w0aVar.R) {
                        if ((w0aVar.e != null || n1aVar.a0 == 13) && !w0aVar.b && (drawable = w0aVar.F) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = w0aVar.h;
                        if (imageReceiver != null) {
                            imageReceiver.j0(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = n1aVar.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = w0aVar.F;
                        if (drawable2 instanceof wl) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f8 = this.R;
                    w0aVar.P = f8;
                    w0aVar.Q = i4;
                    if (scaleX == 1.0f && f8 >= 1.0f) {
                        m(canvas, drawable, w0aVar, f3);
                    } else {
                        canvas.save();
                        float f9 = w0aVar.T;
                        if (f9 > 1.0f && (i2 = n1aVar.a0) != 3 && i2 != 4 && i2 != 6) {
                            float R1 = hl.R1(1.0f, 0.85f, f9);
                            canvas.scale(R1, R1, rect.centerX(), rect.centerY());
                        }
                        int i10 = n1aVar.a0;
                        if (i10 != 6 && i10 != 13 && i10 != 14) {
                            w0aVar.getHeight();
                            float f10 = this.R;
                            if (f10 < 1.0f) {
                                canvas.scale(1.0f, f10, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i4 * 2.0f) / this.P.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, w0aVar, f3);
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
                ln5 ln5Var = ((w0a) arrayList.get(i)).f[this.L];
                if (ln5Var != null) {
                    ln5Var.a();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0a.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, w0a w0aVar, float f) {
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((w0aVar.s || w0aVar.R) && w0aVar.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = w0aVar.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), w0aVar.h.x());
            w0aVar.h.setAlpha(f);
            w0aVar.h.h(canvas, null);
            canvas.restore();
        }
    }
}
