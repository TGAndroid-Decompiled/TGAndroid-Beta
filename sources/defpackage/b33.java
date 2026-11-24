package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class b33 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public String f;
    public final TextPaint h;
    public float n;
    public final RectF r;
    public float s;
    public a33 w;

    public b33(Context context) {
        super(context);
        this.r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131232286);
        imageView.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final b33 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                b33 b33Var = this.b;
                switch (b) {
                    case 0:
                        a33 a33Var = b33Var.w;
                        if (a33Var != null) {
                            b33Var.setMirrored(a33Var.a());
                            return;
                        }
                        return;
                    case 1:
                        a33 a33Var2 = b33Var.w;
                        if (a33Var2 != null) {
                            a33Var2.b();
                            return;
                        }
                        return;
                    default:
                        a33 a33Var3 = b33Var.w;
                        if (a33Var3 != null) {
                            b33Var.setRotated(a33Var3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setOnLongClickListener(new zs(this, (byte) 3));
        imageView.setContentDescription(k96.M0(2131754839, null));
        addView(imageView, nme.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(2131232284);
        imageView2.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final b33 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                b33 b33Var = this.b;
                switch (b) {
                    case 0:
                        a33 a33Var = b33Var.w;
                        if (a33Var != null) {
                            b33Var.setMirrored(a33Var.a());
                            return;
                        }
                        return;
                    case 1:
                        a33 a33Var2 = b33Var.w;
                        if (a33Var2 != null) {
                            a33Var2.b();
                            return;
                        }
                        return;
                    default:
                        a33 a33Var3 = b33Var.w;
                        if (a33Var3 != null) {
                            b33Var.setRotated(a33Var3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(k96.M0(2131754922, null));
        addView(imageView2, nme.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232287);
        imageView3.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final b33 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                b33 b33Var = this.b;
                switch (b) {
                    case 0:
                        a33 a33Var = b33Var.w;
                        if (a33Var != null) {
                            b33Var.setMirrored(a33Var.a());
                            return;
                        }
                        return;
                    case 1:
                        a33 a33Var2 = b33Var.w;
                        if (a33Var2 != null) {
                            a33Var2.b();
                            return;
                        }
                        return;
                    default:
                        a33 a33Var3 = b33Var.w;
                        if (a33Var3 != null) {
                            b33Var.setRotated(a33Var3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView3.setContentDescription(k96.M0(2131754782, null));
        addView(imageView3, nme.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(gl.L(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i, float f, int i2, int i3, boolean z, Paint paint) {
        int cos;
        int L;
        int i4;
        int L2 = (int) ((i2 / 2.0f) - gl.L(70.0f));
        int cos2 = (i2 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i * 5) + f))) * L2));
        float abs = Math.abs(cos) / L2;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z) {
            paint = this.b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        if (z) {
            L = gl.L(16.0f);
            i4 = 4;
        } else {
            L = gl.L(12.0f);
            i4 = 2;
        }
        int i5 = i4 / 2;
        canvas.drawRect(cos2 - i5, (i3 - L) / 2, cos2 + i5, (i3 + L) / 2, paint2);
    }

    public final void b(float f) {
        this.n = f;
        if (Math.abs(f) < 0.099d) {
            f = Math.abs(f);
        }
        this.f = String.format("%.1fº", Float.valueOf(f));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint;
        boolean z;
        Paint paint2;
        boolean z2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f2 = ((-this.n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(f / 5.0f);
        int i = 0;
        while (true) {
            Paint paint3 = this.b;
            if (i < 16) {
                Paint paint4 = this.a;
                if (i >= floor && (i != 0 || f2 >= 0.0f)) {
                    paint = paint4;
                } else {
                    paint = paint3;
                }
                if (i != floor && (i != 0 || floor != -1)) {
                    z = false;
                } else {
                    z = true;
                }
                b33 b33Var = this;
                Canvas canvas2 = canvas;
                b33Var.a(canvas2, i, f2, width, height, z, paint);
                int i2 = i;
                if (i2 != 0) {
                    int i3 = -i2;
                    if (i3 > floor) {
                        paint2 = paint3;
                    } else {
                        paint2 = paint4;
                    }
                    if (i3 == floor + 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b33Var.a(canvas2, i3, f2, width, height, z2, paint2);
                }
                i = i2 + 1;
                this = b33Var;
                canvas = canvas2;
            } else {
                b33 b33Var2 = this;
                Canvas canvas3 = canvas;
                paint3.setAlpha(255);
                RectF rectF = b33Var2.r;
                rectF.left = (width - gl.L(2.5f)) / 2;
                rectF.top = ug8.D(22.0f, height, 2);
                rectF.right = (gl.L(2.5f) + width) / 2;
                rectF.bottom = (gl.L(22.0f) + height) / 2;
                canvas3.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), paint3);
                String str = b33Var2.f;
                TextPaint textPaint = b33Var2.h;
                canvas3.drawText(b33Var2.f, (width - textPaint.measureText(str)) / 2.0f, gl.L(14.0f), textPaint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), gl.L(400.0f)), 1073741824), i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        if (actionMasked == 0) {
            this.s = x;
            a33 a33Var = this.w;
            if (a33Var != null) {
                a33Var.e();
                return true;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2) {
                float f = yjb.f(this.n, (float) ((((this.s - x) / gl.p) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(f - 45.0f) < 0.001f && Math.abs(this.n - 45.0f) >= 0.001f) || (Math.abs(f - (-45.0f)) < 0.001f && Math.abs(this.n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.n / 2.5f) != Math.floor(f / 2.5f)) {
                            gl.X3(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(f - this.n) > 0.001d) {
                    if (Math.abs(f) < 0.05d) {
                        f = 0.0f;
                    }
                    b(f);
                    a33 a33Var2 = this.w;
                    if (a33Var2 != null) {
                        a33Var2.f(this.n);
                    }
                    this.s = x;
                }
            }
        } else {
            a33 a33Var3 = this.w;
            if (a33Var3 != null) {
                a33Var3.c();
            }
            gl.g2(String.format("%.1f°", Float.valueOf(this.n)));
            return true;
        }
        return true;
    }

    public void setAspectLock(boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (z) {
            porterDuffColorFilter = new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY);
        } else {
            porterDuffColorFilter = null;
        }
        this.c.setColorFilter(porterDuffColorFilter);
    }

    public void setListener(a33 a33Var) {
        this.w = a33Var;
    }

    public void setMirrored(boolean z) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z) {
            porterDuffColorFilter = new PorterDuffColorFilter(bkb.w0(null, bkb.pg, false), PorterDuff.Mode.MULTIPLY);
        }
        this.e.setColorFilter(porterDuffColorFilter);
    }

    public void setRotated(boolean z) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z) {
            porterDuffColorFilter = new PorterDuffColorFilter(bkb.w0(null, bkb.pg, false), PorterDuff.Mode.MULTIPLY);
        }
        this.d.setColorFilter(porterDuffColorFilter);
    }

    public void setFreeform(boolean z) {
    }
}
