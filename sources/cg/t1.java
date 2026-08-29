package cg;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p5;
public class t1 extends ImageView {
    public static final int H = 0;
    public ImageReceiver A;
    public p5 B;
    public float C;
    public boolean D;
    public boolean E;
    public org.telegram.ui.Components.voip.h F;
    public Integer G;
    public final int f3376a;
    public final float[] f3377b;
    public final r2 f3378c;
    public final c6 d;
    public boolean f3379e;
    public final float f3380f;
    public boolean h;
    public int f3381n;
    public int f3382r;
    public int f3383s;
    public LinearGradient v;
    public final Path f3384w;
    public Paint f3385x;
    public Paint f3386y;

    public t1(Context context, int i10, c6 c6Var) {
        super(context);
        int i11;
        this.f3377b = new float[3];
        this.f3380f = 1.0f;
        this.h = false;
        this.f3381n = -1;
        this.v = null;
        this.f3384w = new Path();
        this.f3385x = new Paint(1);
        this.C = 1.0f;
        this.f3376a = i10;
        this.d = c6Var;
        if (i10 == 0) {
            i11 = R.drawable.msg_premium_lock2;
        } else {
            i11 = R.drawable.msg_mini_premiumlock;
        }
        setImageResource(i11);
        if (i10 == 0) {
            r2 r2Var = new r2(5);
            this.f3378c = r2Var;
            r2Var.g();
            r2Var.M = false;
            r2Var.f3346s = 4;
            r2Var.f3347t = 4;
            r2Var.f3345r = 2;
            r2Var.f3342o = 0.1f;
            r2Var.c();
        } else if (i10 == 2) {
            this.f3380f = 0.8f;
            this.f3385x.setColor(g6.w0(null, g6.f23009a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (this.f3379e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i10 = this.f3381n;
            float[] fArr = this.f3377b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = g6.f23062d6;
            c6 c6Var = this.d;
            int d = i0.a.d(0.5f, HSVToColor, g6.v0(i11, c6Var));
            int d10 = i0.a.d(0.4f, HSVToColor, g6.v0(i11, c6Var));
            if (this.v == null || this.f3382r != d10 || this.f3383s != d) {
                if (this.E) {
                    Paint paint = this.f3385x;
                    this.f3386y = paint;
                    paint.setAlpha(255);
                    this.C = 0.0f;
                }
                this.f3385x = new Paint(1);
                this.f3382r = d10;
                this.f3383s = d;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
                this.v = linearGradient;
                this.f3385x.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.A;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3379e = true;
        if (this.f3376a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3379e = false;
        Paint paint = this.f3385x;
        if (paint != null && this.f3376a != 2) {
            paint.setShader(null);
            this.f3385x = null;
        }
        this.v = null;
        this.E = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: cg.t1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3376a == 0) {
            Path path = this.f3384w;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
            path.close();
            r2 r2Var = this.f3378c;
            r2Var.f3330a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            r2Var.f3330a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        this.B = p5Var;
        if (p5Var != null) {
            this.D = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.G = num;
    }

    public void setColor(int i10) {
        this.h = true;
        Integer num = this.G;
        if (num != null) {
            i10 = g6.v(i10, num.intValue());
        }
        if (this.f3381n != i10) {
            this.f3381n = i10;
            int i11 = this.f3376a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f3385x;
                if (paint != null) {
                    paint.setColor(i10);
                }
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.A = imageReceiver;
        if (imageReceiver != null) {
            this.D = true;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        int i10;
        if (this.f3376a != 0) {
            if (z10) {
                i10 = R.drawable.msg_mini_premiumlock;
            } else {
                i10 = R.drawable.msg_mini_stickerstar;
            }
            setImageResource(i10);
        }
    }
}
