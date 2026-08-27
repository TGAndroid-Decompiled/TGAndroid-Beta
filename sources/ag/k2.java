package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseArray;
import android.widget.ImageView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k5;

public class k2 extends ImageView {
    public static final int H = 0;
    public ImageReceiver A;
    public k5 B;
    public float C;
    public boolean D;
    public boolean E;
    public org.telegram.ui.Components.voip.h F;
    public Integer G;

    public final int f529a;

    public final float[] f530b;

    public final j3 f531c;
    public final c6 d;

    public boolean f532e;

    public final float f533f;
    public boolean h;

    public int f534n;

    public int f535r;

    public int f536s;
    public LinearGradient v;

    public final Path f537w;

    public Paint f538x;

    public Paint f539y;

    public k2(Context context, int i10, c6 c6Var) {
        super(context);
        this.f530b = new float[3];
        this.f533f = 1.0f;
        this.h = false;
        this.f534n = -1;
        this.v = null;
        this.f537w = new Path();
        this.f538x = new Paint(1);
        this.C = 1.0f;
        this.f529a = i10;
        this.d = c6Var;
        setImageResource(i10 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i10 == 0) {
            j3 j3Var = new j3(5);
            this.f531c = j3Var;
            j3Var.g();
            j3Var.M = false;
            j3Var.f515s = 4;
            j3Var.f516t = 4;
            j3Var.f514r = 2;
            j3Var.f511o = 0.1f;
            j3Var.c();
            return;
        }
        if (i10 == 2) {
            this.f533f = 0.8f;
            this.f538x.setColor(g6.w0(null, g6.f22999a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (!this.f532e || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int i10 = this.f534n;
        float[] fArr = this.f530b;
        Color.colorToHSV(i10, fArr);
        fArr[1] = fArr[1] * 1.0f;
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int iHSVToColor = Color.HSVToColor(fArr);
        int i11 = g6.f23053d6;
        c6 c6Var = this.d;
        int iD = i0.b.d(0.5f, iHSVToColor, g6.v0(i11, c6Var));
        int iD2 = i0.b.d(0.4f, iHSVToColor, g6.v0(i11, c6Var));
        if (this.v != null && this.f535r == iD2 && this.f536s == iD) {
            return;
        }
        if (this.E) {
            Paint paint = this.f538x;
            this.f539y = paint;
            paint.setAlpha(255);
            this.C = 0.0f;
        }
        this.f538x = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.f535r = iD2;
        this.f536s = iD;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{iD2, iD}, (float[]) null, Shader.TileMode.CLAMP);
        this.v = linearGradient;
        this.f538x.setShader(linearGradient);
        invalidate();
    }

    public ImageReceiver getImageReceiver() {
        return this.A;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f532e = true;
        if (this.f529a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f532e = false;
        Paint paint = this.f538x;
        if (paint != null && this.f529a != 2) {
            paint.setShader(null);
            this.f538x = null;
        }
        this.v = null;
        this.E = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iIntValue;
        jh.y2 y2Var;
        if (this.D) {
            ImageReceiver imageReceiver = this.A;
            if (imageReceiver == null || imageReceiver.getBitmap() == null) {
                k5 k5Var = this.B;
                if (k5Var != null) {
                    SparseArray sparseArray = k5.f29947q;
                    long jI = k5Var.i();
                    if (jI != 0) {
                        if (k5.f29952w == null) {
                            k5.f29952w = new HashMap();
                        }
                        Integer num = (Integer) k5.f29952w.get(Long.valueOf(jI));
                        if (num == null && (y2Var = k5Var.f29961k) != null && y2Var.getBitmap() != null) {
                            HashMap map = k5.f29952w;
                            Long lValueOf = Long.valueOf(jI);
                            Integer numValueOf = Integer.valueOf(AndroidUtilities.getDominantColor(k5Var.f29961k.getBitmap()));
                            map.put(lValueOf, numValueOf);
                            num = numValueOf;
                        }
                        if (num == null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = num.intValue();
                        }
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue != 0) {
                        this.D = false;
                        setColor(iIntValue);
                    } else {
                        invalidate();
                    }
                } else {
                    invalidate();
                }
            } else {
                this.D = false;
                setColor(AndroidUtilities.getDominantColor(this.A.getBitmap()));
            }
        }
        Paint paint = this.f538x;
        if (paint != null) {
            int i10 = this.f529a;
            if (i10 == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.f538x);
            } else if (i10 == 0) {
                int i11 = this.f534n;
                Path path = this.f537w;
                if (i11 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    j2.d().f(-AndroidUtilities.dp(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, j2.d().e());
                }
                if (this.F == null) {
                    this.F = new org.telegram.ui.Components.voip.h();
                }
                this.F.f33591f = getMeasuredWidth() / 2;
                org.telegram.ui.Components.voip.h hVar = this.F;
                hVar.f33595k = false;
                hVar.c(this);
                canvas.drawPath(path, hVar.f33587a);
                if (hVar.f33595k) {
                    canvas.drawPath(path, hVar.f33589c);
                }
                canvas.save();
                canvas.clipPath(path);
                this.f531c.d(canvas);
                canvas.restore();
                invalidate();
            } else {
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                if (this.f539y == null) {
                    this.C = 1.0f;
                }
                float f10 = this.C;
                if (f10 != 1.0f) {
                    this.f538x.setAlpha((int) (f10 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.f539y);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.f538x);
                    float f11 = this.C + 0.10666667f;
                    this.C = f11;
                    if (f11 > 1.0f) {
                        this.C = 1.0f;
                        this.f539y = null;
                    }
                    invalidate();
                    this.f538x.setAlpha(255);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.f538x);
                }
            }
        }
        float f12 = this.f533f;
        boolean z10 = f12 != 1.0f;
        if (z10) {
            canvas.save();
            canvas.scale(f12, f12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        this.E = true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f529a != 0) {
            a();
            return;
        }
        Path path = this.f537w;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float fWidth = rectF.width() / 2.0f;
        float fCenterY = rectF.centerY();
        float fWidth2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(fWidth, fCenterY, fWidth2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
        path.close();
        j3 j3Var = this.f531c;
        j3Var.f499a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        j3Var.f499a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
    }

    public void setAnimatedEmojiDrawable(k5 k5Var) {
        this.B = k5Var;
        if (k5Var != null) {
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
        if (this.f534n != i10) {
            this.f534n = i10;
            int i11 = this.f529a;
            if (i11 == 0 || i11 == 2) {
                Paint paint = this.f538x;
                if (paint != null) {
                    paint.setColor(i10);
                }
            } else {
                a();
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
        if (this.f529a != 0) {
            setImageResource(z10 ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
