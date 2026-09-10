package kg;

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
import bi.l6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public final class f extends FrameLayout {
    public final Paint f12448a;
    public final Paint f12449b;
    public final ImageView f12450c;
    public final ImageView d;
    public final ImageView e;
    public String f12451f;
    public final TextPaint h;
    public float f12452n;
    public final RectF f12453r;
    public float f12454s;
    public e v;

    public f(Context context) {
        super(context);
        this.f12453r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f12448a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f12449b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(j6.f0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final f f12447b;

            {
                this.f12447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f12447b;
                        e eVar = fVar.v;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.e());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f12447b.v;
                        if (eVar2 != null) {
                            eVar2.i();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f12447b;
                        e eVar3 = fVar2.v;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.q());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setOnLongClickListener(new l6(this, 5));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(imageView, a6.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.f12450c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(j6.f0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final f f12447b;

            {
                this.f12447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f12447b;
                        e eVar = fVar.v;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.e());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f12447b.v;
                        if (eVar2 != null) {
                            eVar2.i();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f12447b;
                        e eVar3 = fVar2.v;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.q());
                            return;
                        }
                        return;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrAspectRatio));
        addView(imageView2, a6.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(j6.f0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final f f12447b;

            {
                this.f12447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f12447b;
                        e eVar = fVar.v;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.e());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f12447b.v;
                        if (eVar2 != null) {
                            eVar2.i();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f12447b;
                        e eVar3 = fVar2.v;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.q());
                            return;
                        }
                        return;
                }
            }
        });
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrRotate));
        addView(imageView3, a6.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i10, float f7, int i11, int i12, boolean z10, Paint paint) {
        int i13;
        float f10;
        int dp = (int) ((i11 / 2.0f) - AndroidUtilities.dp(70.0f));
        int cos = (int) (Math.cos(Math.toRadians(90.0f - ((i10 * 5) + f7))) * dp);
        int i14 = (i11 / 2) + cos;
        float abs = Math.abs(cos) / dp;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.f12449b;
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
        int dp2 = AndroidUtilities.dp(f10);
        int i15 = i13 / 2;
        canvas.drawRect(i14 - i15, (i12 - dp2) / 2, i14 + i15, (i12 + dp2) / 2, paint2);
    }

    public final void b(float f7) {
        this.f12452n = f7;
        if (Math.abs(f7) < 0.099d) {
            f7 = Math.abs(f7);
        }
        this.f12451f = String.format("%.1fº", Float.valueOf(f7));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.f12452n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        boolean z10;
        Paint paint2;
        boolean z11;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f7 = (-this.f12452n) * 2.0f;
        float f10 = f7 % 5.0f;
        int floor = (int) Math.floor(f7 / 5.0f);
        int i10 = 0;
        while (true) {
            Paint paint3 = this.f12449b;
            if (i10 < 16) {
                Paint paint4 = this.f12448a;
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
                RectF rectF = this.f12453r;
                rectF.left = (width - AndroidUtilities.dp(2.5f)) / 2;
                rectF.top = em.y(22.0f, height, 2);
                rectF.right = (AndroidUtilities.dp(2.5f) + width) / 2;
                rectF.bottom = (AndroidUtilities.dp(22.0f) + height) / 2;
                canvas3.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                String str = this.f12451f;
                TextPaint textPaint = this.h;
                canvas3.drawText(this.f12451f, (width - textPaint.measureText(str)) / 2.0f, AndroidUtilities.dp(14.0f), textPaint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(400.0f)), 1073741824), i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        if (actionMasked == 0) {
            this.f12454s = x10;
            e eVar = this.v;
            if (eVar != null) {
                eVar.w();
                return true;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2) {
                float max = Math.max(-45.0f, Math.min(45.0f, this.f12452n + ((float) ((((this.f12454s - x10) / AndroidUtilities.density) / 3.141592653589793d) / 1.649999976158142d))));
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(max - 45.0f) < 0.001f && Math.abs(this.f12452n - 45.0f) >= 0.001f) || (Math.abs(max - (-45.0f)) < 0.001f && Math.abs(this.f12452n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.f12452n / 2.5f) != Math.floor(max / 2.5f)) {
                            AndroidUtilities.vibrateCursor(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(max - this.f12452n) > 0.001d) {
                    if (Math.abs(max) < 0.05d) {
                        max = 0.0f;
                    }
                    b(max);
                    e eVar2 = this.v;
                    if (eVar2 != null) {
                        eVar2.B(this.f12452n);
                    }
                    this.f12454s = x10;
                }
            }
        } else {
            e eVar3 = this.v;
            if (eVar3 != null) {
                eVar3.p();
            }
            AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.f12452n)));
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
        this.f12450c.setColorFilter(porterDuffColorFilter);
    }

    public void setListener(e eVar) {
        this.v = eVar;
    }

    public void setMirrored(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(j6.w0(null, j6.f18334zf, false), PorterDuff.Mode.MULTIPLY);
        }
        this.e.setColorFilter(porterDuffColorFilter);
    }

    public void setRotated(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(j6.w0(null, j6.f18334zf, false), PorterDuff.Mode.MULTIPLY);
        }
        this.d.setColorFilter(porterDuffColorFilter);
    }

    public void setFreeform(boolean z10) {
    }
}
