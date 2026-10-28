package ng;

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
import fi.b5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
public final class f extends FrameLayout {
    public final Paint f18795a;
    public final Paint f18796b;
    public final ImageView f18797c;
    public final ImageView d;
    public final ImageView e;
    public String f18798f;
    public final TextPaint h;
    public float f18799n;
    public final RectF f18800r;
    public float f18801s;
    public e v;

    public f(Context context) {
        super(context);
        this.f18800r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f18795a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f18796b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(y6.g0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final f f18794b;

            {
                this.f18794b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f18794b;
                        e eVar = fVar.v;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f18794b.v;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f18794b;
                        e eVar3 = fVar2.v;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView.setOnLongClickListener(new b5(this, 5));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(imageView, kb1.i(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.f18797c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(y6.g0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final f f18794b;

            {
                this.f18794b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f18794b;
                        e eVar = fVar.v;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f18794b.v;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f18794b;
                        e eVar3 = fVar2.v;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrAspectRatio));
        addView(imageView2, kb1.i(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(y6.g0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final f f18794b;

            {
                this.f18794b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f fVar = this.f18794b;
                        e eVar = fVar.v;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            return;
                        }
                        return;
                    case 1:
                        e eVar2 = this.f18794b.v;
                        if (eVar2 != null) {
                            eVar2.b();
                            return;
                        }
                        return;
                    default:
                        f fVar2 = this.f18794b;
                        e eVar3 = fVar2.v;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            return;
                        }
                        return;
                }
            }
        });
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrRotate));
        addView(imageView3, kb1.i(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i10, float f7, int i11, int i12, boolean z10, Paint paint) {
        int cos;
        int i13;
        float f10;
        int dp = (int) ((i11 / 2.0f) - AndroidUtilities.dp(70.0f));
        int cos2 = (i11 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i10 * 5) + f7))) * dp));
        float abs = Math.abs(cos) / dp;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.f18796b;
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
        int i14 = i13 / 2;
        canvas.drawRect(cos2 - i14, (i12 - dp2) / 2, cos2 + i14, (i12 + dp2) / 2, paint2);
    }

    public final void b(float f7) {
        this.f18799n = f7;
        if (Math.abs(f7) < 0.099d) {
            f7 = Math.abs(f7);
        }
        this.f18798f = String.format("%.1fº", Float.valueOf(f7));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.f18799n;
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
        float f10 = ((-this.f18799n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(f7 / 5.0f);
        int i10 = 0;
        while (true) {
            Paint paint3 = this.f18796b;
            if (i10 < 16) {
                Paint paint4 = this.f18795a;
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
                RectF rectF = this.f18800r;
                rectF.left = (width - AndroidUtilities.dp(2.5f)) / 2;
                rectF.top = wh.B(22.0f, height, 2);
                rectF.right = (AndroidUtilities.dp(2.5f) + width) / 2;
                rectF.bottom = (AndroidUtilities.dp(22.0f) + height) / 2;
                canvas3.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                String str = this.f18798f;
                TextPaint textPaint = this.h;
                canvas3.drawText(this.f18798f, (width - textPaint.measureText(str)) / 2.0f, AndroidUtilities.dp(14.0f), textPaint);
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
        float x9 = motionEvent.getX();
        if (actionMasked == 0) {
            this.f18801s = x9;
            e eVar = this.v;
            if (eVar != null) {
                eVar.e();
                return true;
            }
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 2) {
                float A = wh.A(this.f18799n, (float) ((((this.f18801s - x9) / AndroidUtilities.density) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(A - 45.0f) < 0.001f && Math.abs(this.f18799n - 45.0f) >= 0.001f) || (Math.abs(A - (-45.0f)) < 0.001f && Math.abs(this.f18799n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.f18799n / 2.5f) != Math.floor(A / 2.5f)) {
                            AndroidUtilities.vibrateCursor(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(A - this.f18799n) > 0.001d) {
                    if (Math.abs(A) < 0.05d) {
                        A = 0.0f;
                    }
                    b(A);
                    e eVar2 = this.v;
                    if (eVar2 != null) {
                        eVar2.f(this.f18799n);
                    }
                    this.f18801s = x9;
                }
            }
        } else {
            e eVar3 = this.v;
            if (eVar3 != null) {
                eVar3.c();
            }
            AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.f18799n)));
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
        this.f18797c.setColorFilter(porterDuffColorFilter);
    }

    public void setListener(e eVar) {
        this.v = eVar;
    }

    public void setMirrored(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(y6.x0(null, y6.zf, false), PorterDuff.Mode.MULTIPLY);
        }
        this.e.setColorFilter(porterDuffColorFilter);
    }

    public void setRotated(boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z10) {
            porterDuffColorFilter = new PorterDuffColorFilter(y6.x0(null, y6.zf, false), PorterDuff.Mode.MULTIPLY);
        }
        this.d.setColorFilter(porterDuffColorFilter);
    }

    public void setFreeform(boolean z10) {
    }
}
