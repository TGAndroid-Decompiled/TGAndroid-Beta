package og;

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
import c8.ha;
import fi.s4;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.k6;
public final class f extends FrameLayout {
    public final Paint f20952a;
    public final Paint f20953b;
    public final ImageView f20954c;
    public final ImageView d;
    public final ImageView f20955e;
    public String f20956f;
    public final TextPaint h;
    public float f20957n;
    public final RectF f20958r;
    public float f20959s;
    public e f20960w;

    public f(Context context) {
        super(context);
        this.f20958r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f20952a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f20953b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.f20955e = imageView;
        imageView.setImageResource(2131232281);
        imageView.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final f f20951b;

            {
                this.f20951b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f20951b;
                        e eVar = fVar.f20960w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f20951b.f20960w;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f20951b;
                        e eVar3 = fVar2.f20960w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setOnLongClickListener(new s4(this, 5));
        imageView.setContentDescription(hd.M0(2131754840, null));
        addView(imageView, ha.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.f20954c = imageView2;
        imageView2.setImageResource(2131232279);
        imageView2.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final f f20951b;

            {
                this.f20951b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f20951b;
                        e eVar = fVar.f20960w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f20951b.f20960w;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f20951b;
                        e eVar3 = fVar2.f20960w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(hd.M0(2131754922, null));
        addView(imageView2, ha.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232282);
        imageView3.setBackgroundDrawable(k6.h0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final f f20951b;

            {
                this.f20951b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f20951b;
                        e eVar = fVar.f20960w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f20951b.f20960w;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f20951b;
                        e eVar3 = fVar2.f20960w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView3.setContentDescription(hd.M0(2131754783, null));
        addView(imageView3, ha.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(g0.L(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i7, float f10, int i10, int i11, boolean z9, Paint paint) {
        int cos;
        int i12;
        float f11;
        int L = (int) ((i10 / 2.0f) - g0.L(70.0f));
        int cos2 = (i10 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i7 * 5) + f10))) * L));
        float abs = Math.abs(cos) / L;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z9) {
            paint = this.f20953b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        if (z9) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        if (z9) {
            f11 = 16.0f;
        } else {
            f11 = 12.0f;
        }
        int L2 = g0.L(f11);
        int i13 = i12 / 2;
        canvas.drawRect(cos2 - i13, (i11 - L2) / 2, cos2 + i13, (i11 + L2) / 2, paint2);
    }

    public final void b(float f10) {
        this.f20957n = f10;
        if (Math.abs(f10) < 0.099d) {
            f10 = Math.abs(f10);
        }
        this.f20956f = String.format("%.1fº", Float.valueOf(f10));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.f20957n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint;
        boolean z9;
        Paint paint2;
        boolean z10;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f11 = ((-this.f20957n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(f10 / 5.0f);
        int i7 = 0;
        while (true) {
            Paint paint3 = this.f20953b;
            if (i7 < 16) {
                Paint paint4 = this.f20952a;
                if (i7 >= floor && (i7 != 0 || f11 >= 0.0f)) {
                    paint = paint4;
                } else {
                    paint = paint3;
                }
                if (i7 != floor && (i7 != 0 || floor != -1)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                Canvas canvas2 = canvas;
                a(canvas2, i7, f11, width, height, z9, paint);
                int i10 = i7;
                if (i10 != 0) {
                    int i11 = -i10;
                    if (i11 > floor) {
                        paint2 = paint3;
                    } else {
                        paint2 = paint4;
                    }
                    if (i11 == floor + 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a(canvas2, i11, f11, width, height, z10, paint2);
                }
                i7 = i10 + 1;
                canvas = canvas2;
            } else {
                Canvas canvas3 = canvas;
                paint3.setAlpha(255);
                RectF rectF = this.f20958r;
                rectF.left = (width - g0.L(2.5f)) / 2;
                rectF.top = q.y(22.0f, height, 2);
                rectF.right = (g0.L(2.5f) + width) / 2;
                rectF.bottom = (g0.L(22.0f) + height) / 2;
                canvas3.drawRoundRect(rectF, g0.L(2.0f), g0.L(2.0f), paint3);
                String str = this.f20956f;
                TextPaint textPaint = this.h;
                canvas3.drawText(this.f20956f, (width - textPaint.measureText(str)) / 2.0f, g0.L(14.0f), textPaint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), g0.L(400.0f)), 1073741824), i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        if (actionMasked == 0) {
            this.f20959s = x10;
            e eVar = this.f20960w;
            if (eVar != null) {
                eVar.e();
                return true;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2) {
                float z9 = q.z(this.f20957n, (float) ((((this.f20959s - x10) / g0.f22536p) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(z9 - 45.0f) < 0.001f && Math.abs(this.f20957n - 45.0f) >= 0.001f) || (Math.abs(z9 - (-45.0f)) < 0.001f && Math.abs(this.f20957n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.f20957n / 2.5f) != Math.floor(z9 / 2.5f)) {
                            g0.c4(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(z9 - this.f20957n) > 0.001d) {
                    if (Math.abs(z9) < 0.05d) {
                        z9 = 0.0f;
                    }
                    b(z9);
                    e eVar2 = this.f20960w;
                    if (eVar2 != null) {
                        eVar2.f(this.f20957n);
                    }
                    this.f20959s = x10;
                }
            }
        } else {
            e eVar3 = this.f20960w;
            if (eVar3 != null) {
                eVar3.c();
            }
            g0.i2(String.format("%.1f°", Float.valueOf(this.f20957n)));
            return true;
        }
        return true;
    }

    public void setAspectLock(boolean z9) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (z9) {
            porterDuffColorFilter = new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY);
        } else {
            porterDuffColorFilter = null;
        }
        this.f20954c.setColorFilter(porterDuffColorFilter);
    }

    public void setListener(e eVar) {
        this.f20960w = eVar;
    }

    public void setMirrored(boolean z9) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z9) {
            porterDuffColorFilter = new PorterDuffColorFilter(k6.x0(null, k6.f28039ng, false), PorterDuff.Mode.MULTIPLY);
        }
        this.f20955e.setColorFilter(porterDuffColorFilter);
    }

    public void setRotated(boolean z9) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z9) {
            porterDuffColorFilter = new PorterDuffColorFilter(k6.x0(null, k6.f28039ng, false), PorterDuff.Mode.MULTIPLY);
        }
        this.d.setColorFilter(porterDuffColorFilter);
    }

    public void setFreeform(boolean z9) {
    }
}
