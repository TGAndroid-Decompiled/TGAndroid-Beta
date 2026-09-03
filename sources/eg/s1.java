package eg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l5;
public class s1 extends ImageView {
    public static final int I = 0;
    public ImageReceiver B;
    public l5 C;
    public float D;
    public boolean E;
    public boolean F;
    public org.telegram.ui.Components.voip.h G;
    public Integer H;
    public final int f5484a;
    public final float[] f5485b;
    public final p2 f5486c;
    public final f6 d;
    public boolean e;
    public final float f5487f;
    public boolean h;
    public int f5488n;
    public int f5489r;
    public int f5490s;
    public LinearGradient v;
    public final Path f5491w;
    public Paint f5492x;
    public Paint f5493y;

    public s1(Context context, int i10, f6 f6Var) {
        super(context);
        int i11;
        this.f5485b = new float[3];
        this.f5487f = 1.0f;
        this.h = false;
        this.f5488n = -1;
        this.v = null;
        this.f5491w = new Path();
        this.f5492x = new Paint(1);
        this.D = 1.0f;
        this.f5484a = i10;
        this.d = f6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            p2 p2Var = new p2(5);
            this.f5486c = p2Var;
            p2Var.g();
            p2Var.M = false;
            p2Var.f5431s = 4;
            p2Var.f5432t = 4;
            p2Var.f5430r = 2;
            p2Var.f5427o = 0.1f;
            p2Var.c();
        } else if (i10 == 2) {
            this.f5487f = 0.8f;
            this.f5492x.setColor(j6.w0(null, j6.f19827a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (this.e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i10 = this.f5488n;
            float[] fArr = this.f5485b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = j6.f19881d6;
            f6 f6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, j6.v0(i11, f6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, j6.v0(i11, f6Var));
            if (this.v == null || this.f5489r != d10 || this.f5490s != d) {
                if (this.F) {
                    Paint paint = this.f5492x;
                    this.f5493y = paint;
                    paint.setAlpha(255);
                    this.D = 0.0f;
                }
                this.f5492x = new Paint(1);
                this.f5489r = d10;
                this.f5490s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f5492x.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.B;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        if (this.f5484a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f5492x;
        if (paint != null && this.f5484a != 2) {
            paint.setShader(null);
            this.f5492x = null;
        }
        this.v = null;
        this.F = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: eg.s1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f5484a == 0) {
            Path path = this.f5491w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            p2 p2Var = this.f5486c;
            p2Var.f5416a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            p2Var.f5416a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(l5 l5Var) {
        this.C = l5Var;
        if (l5Var != null) {
            this.E = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.H = num;
    }

    public void setColor(int i10) {
        this.h = true;
        Integer num = this.H;
        if (num != null) {
            i10 = j6.v(i10, num.intValue());
        }
        if (this.f5488n != i10) {
            this.f5488n = i10;
            int i11 = this.f5484a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f5492x;
                if (paint != null) {
                    paint.setColor(i10);
                }
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.B = imageReceiver;
        if (imageReceiver != null) {
            this.E = true;
            invalidate();
        }
    }

    public void setLocked(boolean z4) {
        int i10;
        if (this.f5484a != 0) {
            if (z4) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
