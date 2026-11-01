package eg;

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
import bi.h1;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public final class f extends FrameLayout {
    public final Paint f6533a;
    public final Paint f6534b;
    public final ImageView f6535c;
    public final ImageView d;
    public final ImageView e;
    public String f6536f;
    public final TextPaint h;
    public float f6537n;
    public final RectF f6538r;
    public float f6539s;
    public e f6540w;

    public f(Context context) {
        super(context);
        this.f6538r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f6533a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f6534b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131232280);
        imageView.setBackgroundDrawable(t6.h0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final f f6532b;

            {
                this.f6532b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f6532b;
                        e eVar = fVar.f6540w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f6532b.f6540w;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f6532b;
                        e eVar3 = fVar2.f6540w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setOnLongClickListener(new h1(this, 3));
        imageView.setContentDescription(dd.L0(2131754840, null));
        addView(imageView, b6.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.f6535c = imageView2;
        imageView2.setImageResource(2131232278);
        imageView2.setBackgroundDrawable(t6.h0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final f f6532b;

            {
                this.f6532b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f6532b;
                        e eVar = fVar.f6540w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f6532b.f6540w;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f6532b;
                        e eVar3 = fVar2.f6540w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(dd.L0(2131754922, null));
        addView(imageView2, b6.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232281);
        imageView3.setBackgroundDrawable(t6.h0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final f f6532b;

            {
                this.f6532b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f6532b;
                        e eVar = fVar.f6540w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f6532b.f6540w;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f6532b;
                        e eVar3 = fVar2.f6540w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView3.setContentDescription(dd.L0(2131754783, null));
        addView(imageView3, b6.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(i0.L(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i10, float f7, int i11, int i12, boolean z10, Paint paint) {
        int cos;
        int i13;
        float f10;
        int L = (int) ((i11 / 2.0f) - i0.L(70.0f));
        int cos2 = (i11 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i10 * 5) + f7))) * L));
        float abs = Math.abs(cos) / L;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.f6534b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        if (z10) {
            i13 = 4;
        } else {
            i13 = 2;
        }
        if (z10) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L2 = i0.L(f10);
        int i14 = i13 / 2;
        canvas.drawRect(cos2 - i14, (i12 - L2) / 2, cos2 + i14, (i12 + L2) / 2, paint2);
    }

    public final void b(float f7) {
        this.f6537n = f7;
        if (Math.abs(f7) < 0.099d) {
            f7 = Math.abs(f7);
        }
        this.f6536f = String.format("%.1fº", Float.valueOf(f7));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.f6537n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint;
        boolean z10;
        Paint paint2;
        boolean z11;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f10 = ((-this.f6537n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(f7 / 5.0f);
        int i10 = 0;
        while (true) {
            Paint paint3 = this.f6534b;
            if (i10 < 16) {
                Paint paint4 = this.f6533a;
                if (i10 >= floor && (i10 != 0 || f10 >= 0.0f)) {
                    paint = paint4;
                } else {
                    paint = paint3;
                }
                if (i10 != floor && (i10 != 0 || floor != -1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Canvas canvas2 = canvas;
                a(canvas2, i10, f10, width, height, z10, paint);
                int i11 = i10;
                if (i11 != 0) {
                    int i12 = -i11;
                    if (i12 > floor) {
                        paint2 = paint3;
                    } else {
                        paint2 = paint4;
                    }
                    if (i12 == floor + 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a(canvas2, i12, f10, width, height, z11, paint2);
                }
                i10 = i11 + 1;
                canvas = canvas2;
            } else {
                Canvas canvas3 = canvas;
                paint3.setAlpha(255);
                RectF rectF = this.f6538r;
                rectF.left = (width - i0.L(2.5f)) / 2;
                rectF.top = a30.y(22.0f, height, 2);
                rectF.right = (i0.L(2.5f) + width) / 2;
                rectF.bottom = (i0.L(22.0f) + height) / 2;
                canvas3.drawRoundRect(rectF, i0.L(2.0f), i0.L(2.0f), paint3);
                String str = this.f6536f;
                TextPaint textPaint = this.h;
                canvas3.drawText(this.f6536f, (width - textPaint.measureText(str)) / 2.0f, i0.L(14.0f), textPaint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i0.L(400.0f)), 1073741824), i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        if (actionMasked == 0) {
            this.f6539s = x10;
            e eVar = this.f6540w;
            if (eVar != null) {
                eVar.e();
                return true;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2) {
                float z10 = a30.z(this.f6537n, (float) ((((this.f6539s - x10) / i0.f16171p) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(z10 - 45.0f) < 0.001f && Math.abs(this.f6537n - 45.0f) >= 0.001f) || (Math.abs(z10 - (-45.0f)) < 0.001f && Math.abs(this.f6537n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.f6537n / 2.5f) != Math.floor(z10 / 2.5f)) {
                            i0.b4(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(z10 - this.f6537n) > 0.001d) {
                    if (Math.abs(z10) < 0.05d) {
                        z10 = 0.0f;
                    }
                    b(z10);
                    e eVar2 = this.f6540w;
                    if (eVar2 != null) {
                        eVar2.f(this.f6537n);
                    }
                    this.f6539s = x10;
                }
            }
        } else {
            e eVar3 = this.f6540w;
            if (eVar3 != null) {
                eVar3.c();
            }
            i0.i2(String.format("%.1f°", Float.valueOf(this.f6537n)));
            return true;
        }
        return true;
    }

    public void setAspectLock(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY);
        } else {
            porterDuffColorFilter = null;
        }
        this.f6535c.setColorFilter(porterDuffColorFilter);
    }

    public void setListener(e eVar) {
        this.f6540w = eVar;
    }

    public void setMirrored(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(t6.x0(null, t6.f21126ng, false), PorterDuff.Mode.MULTIPLY);
        }
        this.e.setColorFilter(porterDuffColorFilter);
    }

    public void setRotated(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(t6.x0(null, t6.f21126ng, false), PorterDuff.Mode.MULTIPLY);
        }
        this.d.setColorFilter(porterDuffColorFilter);
    }

    public void setFreeform(boolean z10) {
    }
}
