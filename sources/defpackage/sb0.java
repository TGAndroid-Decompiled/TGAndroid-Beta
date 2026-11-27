package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.Arrays;
import org.telegram.ui.ActionBar.a;
public abstract class sb0 extends View implements at8 {
    public final GradientDrawable[] E;
    public final boolean[] F;
    public final float[] G;
    public float H;
    public float[] I;
    public long J;
    public float K;
    public int L;
    public float M;
    public int N;
    public float O;
    public int P;
    public et8 Q;
    public final TextPaint R;
    public float S;
    public int T;
    public String U;
    public final RectF a;
    public byte b;
    public final Rect c;
    public final Rect d;
    public final RectF e;
    public final GradientDrawable f;
    public final GradientDrawable h;
    public final float[] n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Path x;
    public final RectF y;

    public sb0(Context context) {
        super(context);
        GradientDrawable.Orientation orientation;
        this.a = new RectF();
        this.b = (byte) 1;
        this.c = new Rect();
        this.d = new Rect();
        this.e = new RectF();
        this.n = new float[]{0.0f, 1.0f};
        this.x = new Path();
        this.y = new RectF();
        this.E = new GradientDrawable[2];
        this.F = new boolean[2];
        this.G = new float[2];
        this.H = 0.0f;
        this.I = null;
        this.L = -1;
        this.P = 1;
        this.T = -1;
        Paint paint = new Paint(1);
        this.s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.w = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            } else {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            }
            this.E[i] = new GradientDrawable(orientation, new int[]{838860800, 0});
            this.E[i].setShape(0);
        }
        Paint paint3 = new Paint(1);
        this.r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(k43.j);
        ofFloat.addUpdateListener(new g0(this, (byte) 11));
        ofFloat.addListener(new h0(this, (byte) 16));
        TextPaint textPaint = new TextPaint(1);
        this.R = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(hl.N(15.0f));
    }

    private String getCurrentTitle() {
        if (this.T != this.Q.getCurrentItem()) {
            this.U = ((String) this.Q.getAdapter().d(this.Q.getCurrentItem())).toString();
            this.T = this.Q.getCurrentItem();
        }
        return this.U;
    }

    @Override
    public final void a() {
        Arrays.fill(this.F, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z) {
        this.F[!z ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void d() {
        invalidate();
    }

    public et8 getProfileGalleryView() {
        return this.Q;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float[] fArr;
        float f;
        float[] fArr2;
        Paint paint;
        boolean z;
        float f2;
        float f3;
        int i;
        boolean z2;
        boolean z3;
        float[] fArr3;
        Paint paint2;
        Paint paint3;
        int i2;
        float f4;
        float f5;
        Paint paint4;
        int i3 = 0;
        while (true) {
            fArr = this.G;
            f = 0.0f;
            if (i3 >= 2) {
                break;
            }
            float f6 = fArr[i3];
            if (f6 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.E;
                gradientDrawableArr[i3].setAlpha((int) (f6 * 255.0f));
                gradientDrawableArr[i3].draw(canvas);
            }
            i3++;
        }
        this.f.draw(canvas);
        Rect rect = this.c;
        Paint paint5 = this.r;
        canvas.drawRect(rect, paint5);
        int realCount = this.Q.getRealCount();
        this.N = this.Q.getRealPosition();
        float[] fArr4 = this.I;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.I = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.J;
        j = (j < 0 || j > 20) ? 17L : 17L;
        this.J = elapsedRealtime;
        float f7 = 1.0f;
        if (realCount > 1 && realCount <= 20) {
            byte b = this.b;
            if (b == 0) {
                this.H = 0.0f;
                this.b = (byte) 3;
                b = 3;
            } else if (b == 1) {
                this.H = 0.0f;
                this.b = (byte) 2;
                b = 2;
            }
            f2 = 180.0f;
            Paint paint6 = this.w;
            f3 = 8.0f;
            Paint paint7 = this.s;
            if (b == 2) {
                paint7.setAlpha((int) (this.H * 85.0f));
                paint6.setAlpha((int) (this.H * 255.0f));
            }
            z = true;
            int D = ik8.D((realCount - 1) << 1, getMeasuredWidth() - hl.L(10.0f), realCount);
            int L = hl.L(8.0f);
            int i4 = 0;
            z2 = false;
            while (i4 < realCount) {
                int L2 = (D * i4) + hl.L((i4 << 1) + 5);
                int i5 = this.L;
                float f8 = f;
                RectF rectF = this.e;
                if (i4 == i5 && Math.abs(this.K - f7) > 1.0E-4f) {
                    float f9 = this.K;
                    canvas.save();
                    float f10 = f7;
                    float f11 = L2;
                    fArr3 = fArr;
                    float f12 = L;
                    paint3 = paint6;
                    float f13 = L2 + D;
                    paint2 = paint5;
                    canvas.clipRect((D * f9) + f11, f12, f13, hl.L(2.0f) + L);
                    rectF.set(f11, f12, f13, hl.L(2.0f) + L);
                    paint7.setAlpha((int) (this.H * 85.0f));
                    canvas.drawRoundRect(rectF, hl.L(f10), hl.L(f10), paint7);
                    canvas.restore();
                    f4 = f9;
                    i2 = 80;
                    z2 = true;
                } else {
                    fArr3 = fArr;
                    paint2 = paint5;
                    paint3 = paint6;
                    float f14 = f7;
                    i2 = 85;
                    if (i4 == this.N) {
                        if (this.Q.I()) {
                            float currentItemProgress = this.Q.getCurrentItemProgress();
                            this.M = currentItemProgress;
                            if ((currentItemProgress <= f8 && this.Q.J()) || this.O > f8) {
                                float f15 = this.O;
                                int i6 = this.P;
                                f5 = currentItemProgress;
                                float f16 = (((float) (i6 * j)) / 500.0f) + f15;
                                this.O = f16;
                                if (f16 > f14) {
                                    this.O = f14;
                                    this.P = i6 * (-1);
                                } else if (f16 <= f8) {
                                    this.O = f8;
                                    this.P = i6 * (-1);
                                }
                            } else {
                                f5 = currentItemProgress;
                            }
                            rectF.set(L2, L, L2 + D, hl.L(2.0f) + L);
                            paint7.setAlpha((int) (((this.O * 48.0f) + 85.0f) * this.H));
                            canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint7);
                            f4 = f5;
                            z2 = true;
                            i2 = 80;
                        } else {
                            this.M = f14;
                        }
                    }
                    f4 = 1.0f;
                }
                float f17 = L2;
                rectF.set(f17, L, (D * f4) + f17, hl.L(2.0f) + L);
                if (i4 != this.N) {
                    if (this.b == 3) {
                        paint7.setAlpha((int) (hl.U1(k43.j.getInterpolation(this.I[i4]), i2, 255) * this.H));
                    }
                } else {
                    this.I[i4] = 0.75f;
                }
                float L3 = hl.L(1.0f);
                float L4 = hl.L(1.0f);
                if (i4 == this.N) {
                    paint4 = paint3;
                } else {
                    paint4 = paint7;
                }
                canvas.drawRoundRect(rectF, L3, L4, paint4);
                i4++;
                fArr = fArr3;
                paint6 = paint3;
                paint5 = paint2;
                f = 0.0f;
                f7 = 1.0f;
            }
            fArr2 = fArr;
            paint = paint5;
            byte b2 = this.b;
            if (b2 == 2) {
                float f18 = this.H;
                if (f18 < 1.0f) {
                    float f19 = (((float) j) / 180.0f) + f18;
                    this.H = f19;
                    if (f19 > 1.0f) {
                        this.H = 1.0f;
                    }
                    z2 = true;
                } else {
                    this.b = (byte) 3;
                }
            } else if (b2 == 3) {
                int i7 = 0;
                while (true) {
                    float[] fArr6 = this.I;
                    if (i7 >= fArr6.length) {
                        break;
                    }
                    if (i7 != this.N) {
                        float f20 = fArr6[i7];
                        if (f20 > 0.0f) {
                            float f21 = f20 - (((float) j) / 500.0f);
                            fArr6[i7] = f21;
                            if (f21 <= 0.0f) {
                                fArr6[i7] = 0.0f;
                                if (i7 == this.L) {
                                    this.L = -1;
                                }
                            }
                            z2 = true;
                            i7++;
                        }
                    }
                    if (i7 == this.L) {
                        this.L = -1;
                    }
                    i7++;
                }
            }
            i = 20;
        } else {
            fArr2 = fArr;
            paint = paint5;
            z = true;
            f2 = 180.0f;
            f3 = 8.0f;
            i = 20;
            z2 = false;
        }
        if (realCount > i || this.S != 0.0f) {
            String currentTitle = getCurrentTitle();
            TextPaint textPaint = this.R;
            float measureText = textPaint.measureText(currentTitle);
            float measuredWidth = getMeasuredWidth() - hl.L(f3);
            RectF rectF2 = this.a;
            rectF2.right = measuredWidth;
            rectF2.left = measuredWidth - (hl.N(16.0f) + measureText);
            float L5 = hl.L(f3);
            rectF2.top = L5;
            rectF2.bottom = L5 + hl.L(26.0f);
            float N = hl.N(12.0f);
            canvas.save();
            if (realCount > 20) {
                z3 = z;
            } else {
                z3 = false;
            }
            float f22 = this.S;
            if (z3) {
                if (f22 != 1.0f) {
                    f22 += ((float) j) / 150.0f;
                    this.S = f22;
                }
            } else if (f22 != 0.0f) {
                f22 -= ((float) j) / 150.0f;
                this.S = f22;
            }
            if (f22 >= 1.0f) {
                this.S = 1.0f;
            } else if (f22 <= 0.0f) {
                this.S = 0.0f;
            } else {
                invalidate();
            }
            float f23 = this.S;
            canvas.scale(f23, f23, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, N, N, paint);
            canvas.drawText(getCurrentTitle(), rectF2.centerX(), hl.N(18.5f) + rectF2.top, textPaint);
            canvas.restore();
        }
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.F[i8]) {
                float f24 = fArr2[i8];
                if (f24 < 1.0f) {
                    float f25 = (((float) j) / f2) + f24;
                    fArr2[i8] = f25;
                    if (f25 > 1.0f) {
                        fArr2[i8] = 1.0f;
                    }
                    z2 = z;
                }
            } else {
                float f26 = fArr2[i8];
                if (f26 > 0.0f) {
                    float f27 = f26 - (((float) j) / f2);
                    fArr2[i8] = f27;
                    if (f27 < 0.0f) {
                        fArr2[i8] = 0.0f;
                    }
                    z2 = z;
                }
            }
        }
        if (z2) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Path path = this.x;
        path.reset();
        RectF rectF = this.y;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{hl.L(13.0f), hl.L(13.0f), hl.L(13.0f), hl.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        Rect rect = this.c;
        rect.set(0, 0, i, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i2 - (hl.L(72.0f) * 0.5f)), i, i2);
        this.f.setBounds(0, rect.bottom, i, hl.L(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i2 - hl.L(72.0f)) - hl.L(24.0f), i, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.E;
        int i5 = i / 5;
        gradientDrawableArr[0].setBounds(0, 0, i5, i2);
        gradientDrawableArr[1].setBounds(i - i5, 0, i, i2);
    }

    public void setProfileGalleryView(et8 et8Var) {
        this.Q = et8Var;
    }

    public void c() {
    }
}
