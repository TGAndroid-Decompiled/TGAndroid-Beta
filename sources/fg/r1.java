package fg;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l5;
public class r1 extends ImageView {
    public static final int I = 0;
    public ImageReceiver B;
    public l5 C;
    public float D;
    public boolean E;
    public boolean F;
    public org.telegram.ui.Components.voip.h G;
    public Integer H;
    public final int f6531a;
    public final float[] f6532b;
    public final o2 f6533c;
    public final g6 d;
    public boolean f6534e;
    public final float f6535f;
    public boolean h;
    public int f6536n;
    public int f6537r;
    public int f6538s;
    public LinearGradient v;
    public final Path f6539w;
    public Paint f6540x;
    public Paint f6541y;

    public r1(Context context, int i10, g6 g6Var) {
        super(context);
        int i11;
        this.f6532b = new float[3];
        this.f6535f = 1.0f;
        this.h = false;
        this.f6536n = -1;
        this.v = null;
        this.f6539w = new Path();
        this.f6540x = new Paint(1);
        this.D = 1.0f;
        this.f6531a = i10;
        this.d = g6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            o2 o2Var = new o2(5);
            this.f6533c = o2Var;
            o2Var.g();
            o2Var.M = false;
            o2Var.f6467s = 4;
            o2Var.f6468t = 4;
            o2Var.f6466r = 2;
            o2Var.f6463o = 0.1f;
            o2Var.c();
        } else if (i10 == 2) {
            this.f6535f = 0.8f;
            this.f6540x.setColor(k6.w0(null, k6.f21605a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (this.f6534e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i10 = this.f6536n;
            float[] fArr = this.f6532b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = k6.f21659d6;
            g6 g6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, k6.v0(i11, g6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, k6.v0(i11, g6Var));
            if (this.v == null || this.f6537r != d10 || this.f6538s != d) {
                if (this.F) {
                    Paint paint = this.f6540x;
                    this.f6541y = paint;
                    paint.setAlpha(255);
                    this.D = 0.0f;
                }
                this.f6540x = new Paint(1);
                this.f6537r = d10;
                this.f6538s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f6540x.setShader(linearGradient);
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
        this.f6534e = true;
        if (this.f6531a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6534e = false;
        Paint paint = this.f6540x;
        if (paint != null && this.f6531a != 2) {
            paint.setShader(null);
            this.f6540x = null;
        }
        this.v = null;
        this.F = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: fg.r1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f6531a == 0) {
            Path path = this.f6539w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            o2 o2Var = this.f6533c;
            o2Var.f6451a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            o2Var.f6451a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
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
            i10 = k6.v(i10, num.intValue());
        }
        if (this.f6536n != i10) {
            this.f6536n = i10;
            int i11 = this.f6531a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f6540x;
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
        if (this.f6531a != 0) {
            if (z4) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
