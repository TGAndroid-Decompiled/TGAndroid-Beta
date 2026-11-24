package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.CheckBoxBase;
public final class or4 extends FrameLayout {
    public static int e0;
    public float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final FrameLayout J;
    public final ya K;
    public final float L;
    public final boolean M;
    public lr4 N;
    public lr4 O;
    public String P;
    public final s54 Q;
    public do3 R;
    public String S;
    public Object T;
    public jf4 U;
    public boolean V;
    public boolean W;
    public Bitmap a;
    public final Path a0;
    public final Paint b;
    public final float[] b0;
    public final Paint c;
    public final Paint c0;
    public final Paint d;
    public LinearGradient e;
    public final Matrix f;
    public final Matrix h;
    public final Paint n;
    public final TextPaint r;
    public final TextPaint s;
    public final Drawable w;
    public boolean x;
    public StaticLayout y;
    public static final ArrayList d0 = new ArrayList();
    public static final HashMap f0 = new HashMap();
    public static final nr4 g0 = new nr4(45, (byte) 0);

    public or4(Context context, f53 f53Var, float f, boolean z) {
        super(context);
        this.b = new Paint(3);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.s = textPaint2;
        this.Q = new s54(this, (byte) 25);
        this.a0 = new Path();
        this.b0 = new float[8];
        this.c0 = new Paint(1);
        this.L = f;
        this.M = z;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(gl.L(11.33f));
        textPaint2.setColor(-1);
        this.w = context.getResources().getDrawable(2131232554).mutate();
        ya yaVar = new ya(this, context, f53Var);
        this.K = yaVar;
        if (!z) {
            yaVar.setDrawBackgroundAsArc(6);
        } else {
            yaVar.setDrawBackgroundAsArc(7);
        }
        yaVar.b(bkb.V9, bkb.W9, bkb.U9);
        CheckBoxBase checkBoxBase = yaVar.getCheckBoxBase();
        int i = bkb.F6;
        if (checkBoxBase.u != i) {
            checkBoxBase.u = i;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.addView(yaVar, nme.e(26, 26, 17));
        addView(frameLayout, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        yaVar.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f0;
            Integer num = (Integer) hashMap.get(str);
            if (num != null) {
                int intValue = num.intValue() - 1;
                Integer valueOf = Integer.valueOf(intValue);
                if (intValue <= 0) {
                    hashMap.remove(str);
                } else {
                    hashMap.put(str, valueOf);
                }
            }
        }
    }

    public final do3 a() {
        do3 do3Var = this.R;
        if (do3Var != null) {
            return do3Var;
        }
        ArrayList arrayList = d0;
        if (arrayList.size() < 4) {
            do3 do3Var2 = new do3("gallery_load_" + arrayList.size(), true);
            this.R = do3Var2;
            arrayList.add(do3Var2);
        } else {
            int i = e0 + 1;
            e0 = i;
            if (i >= arrayList.size()) {
                e0 = 0;
            }
            this.R = (do3) arrayList.get(e0);
        }
        return this.R;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.S);
            this.S = null;
            this.a = null;
            invalidate();
            return;
        }
        boolean z = obj instanceof jm6;
        if (z) {
            jm6 jm6Var = (jm6) obj;
            str = jm6Var.c;
            if (str == null) {
                if (jm6Var.b && !jm6Var.d()) {
                    str = String.valueOf(jm6Var.C);
                } else {
                    str = jm6Var.I;
                }
            }
        } else if (obj instanceof f4b) {
            str = "d" + ((f4b) obj).b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.S)) {
            return;
        }
        String str2 = this.S;
        if (str2 != null) {
            this.a = null;
            d(str2);
            invalidate();
        }
        this.S = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z) {
            jm6 jm6Var2 = (jm6) obj;
            if (jm6Var2.T != 0 && jm6Var2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{jm6Var2.T, jm6Var2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) g0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f0;
                Integer num = (Integer) hashMap.get(str);
                int i = 1;
                if (num != null) {
                    i = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        this.a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.U != null) {
            a().cancelRunnable(this.U);
            this.U = null;
        }
        do3 a = a();
        jf4 jf4Var = new jf4(this, obj, str, (byte) 3);
        this.U = jf4Var;
        a.postRunnable(jf4Var);
    }

    public final Bitmap c(jm6 jm6Var, BitmapFactory.Options options) {
        if (jm6Var == null) {
            return null;
        }
        int i = jm6Var.C;
        String str = jm6Var.c;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (jm6Var.b && !jm6Var.d()) {
            return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i, 1, options);
        }
        return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i, 1, options);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        Canvas canvas2;
        int L;
        int L2;
        boolean z2 = true;
        if (!this.V && !this.W) {
            z = false;
        } else {
            canvas.save();
            Path path = this.a0;
            path.rewind();
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.V) {
                f = gl.L(6.0f);
            } else {
                f = 0.0f;
            }
            float[] fArr = this.b0;
            fArr[1] = f;
            fArr[0] = f;
            if (this.W) {
                f2 = gl.L(6.0f);
            } else {
                f2 = 0.0f;
            }
            fArr[3] = f2;
            fArr[2] = f2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z = true;
        }
        float progress = this.K.getProgress() * gl.L(12.66f);
        if (progress > 0.0f) {
            if (!z) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.c0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z2 = z;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.c);
        if (this.e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.a, this.f, this.b);
        }
        StaticLayout staticLayout = this.G;
        Paint paint2 = this.n;
        if (staticLayout != null) {
            RectF rectF2 = gl.P;
            rectF2.set(gl.L(4.0f), gl.L(4.0f), gl.L(10.0f) + this.H + gl.L(6.0f), gl.L(2.0f) + this.G.getHeight() + gl.L(5.0f));
            canvas2.drawRoundRect(rectF2, gl.L(10.0f), gl.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + gl.L(6.0f)) - this.I, rectF2.top + gl.L(1.33f));
            this.G.draw(canvas2);
            canvas2.restore();
        }
        if (this.y != null) {
            RectF rectF3 = gl.P;
            float L3 = gl.L(4.0f);
            float height = ((getHeight() - gl.L(4.0f)) - this.y.getHeight()) - gl.L(2.0f);
            int L4 = gl.L(4.0f);
            if (this.x) {
                L = gl.L(16.0f);
            } else {
                L = gl.L(4.0f);
            }
            rectF3.set(L3, height, L4 + L + this.E + gl.L(5.0f), getHeight() - gl.L(4.0f));
            canvas2.drawRoundRect(rectF3, gl.L(10.0f), gl.L(10.0f), paint2);
            if (this.x) {
                Drawable drawable = this.w;
                drawable.setBounds((int) (rectF3.left + gl.L(6.0f)), (int) (rectF3.centerY() - (gl.L(8.0f) / 2)), (int) (rectF3.left + gl.L(13.0f)), (int) (rectF3.centerY() + (gl.L(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f3 = rectF3.left;
            if (this.x) {
                L2 = gl.L(16.0f);
            } else {
                L2 = gl.L(5.0f);
            }
            canvas2.translate((f3 + L2) - this.F, rectF3.top + gl.L(1.0f));
            this.y.draw(canvas2);
            canvas2.restore();
        }
        if (z2) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i, f4b f4bVar) {
        boolean z;
        String str;
        int i2;
        float f;
        float f2;
        this.T = f4bVar;
        if (i > 0) {
            this.G = null;
            g(k96.G(i, "StoryDrafts", new Object[0]));
            this.x = false;
            this.P = k96.G(i, "StoryDrafts", new Object[0]);
        } else {
            if (f4bVar != null && f4bVar.c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String N0 = k96.N0("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i2 = getMeasuredWidth();
                } else {
                    i2 = gl.q.x;
                }
                StaticLayout staticLayout = new StaticLayout(N0, this.s, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.G = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f = this.G.getLineWidth(0);
                } else {
                    f = 0.0f;
                }
                this.H = f;
                if (this.G.getLineCount() > 0) {
                    f2 = this.G.getLineLeft(0);
                } else {
                    f2 = 0.0f;
                }
                this.I = f2;
            } else {
                this.G = null;
            }
            if (f4bVar != null && f4bVar.K) {
                str = gl.g0((int) Math.max(0.0f, ((f4bVar.a0 - f4bVar.Z) * ((float) f4bVar.h0)) / 1000.0f), false, false);
            } else {
                str = null;
            }
            g(str);
            if (f4bVar != null && f4bVar.K) {
                float f3 = f4bVar.a0 - f4bVar.Z;
                this.P = k96.M0(2131744442, null) + ", " + k96.z((int) Math.max(0.0f, (f3 * ((float) f4bVar.h0)) / 1000.0f));
            } else {
                this.P = k96.M0(2131744442, null);
            }
        }
        b(f4bVar);
    }

    public final void f(int i, boolean z, boolean z2) {
        float f;
        float f2;
        int i2;
        if (this.M) {
            z = true;
        }
        ya yaVar = this.K;
        FrameLayout frameLayout = this.J;
        if (!z2) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            frameLayout.setVisibility(i2);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = yaVar.animate();
            float f3 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (!z) {
                f3 = 0.7f;
            }
            ug8.t(scaleX.scaleY(f3).withEndAction(new x6c((byte) 21, this, z)), s33.h, 320L);
        }
        if (i >= 0) {
            yaVar.a(true, z2);
            yaVar.setNum(i);
            return;
        }
        yaVar.a(false, z2);
    }

    public final void g(String str) {
        int i;
        float f;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i = getMeasuredWidth();
            } else {
                i = gl.q.x;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.r, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.y = staticLayout;
            float f2 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f = this.y.getLineWidth(0);
            } else {
                f = 0.0f;
            }
            this.E = f;
            if (this.y.getLineCount() > 0) {
                f2 = this.y.getLineLeft(0);
            }
            this.F = f2;
        } else {
            this.y = null;
        }
        this.x = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.a) != null) {
            if (bitmap.getHeight() / this.a.getWidth() > this.L - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.a.getWidth(), getMeasuredHeight() / this.a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.a.getWidth();
            }
            Matrix matrix = this.f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(b00.b(measuredWidth, this.a.getWidth(), getMeasuredWidth(), 2.0f), b00.b(measuredWidth, this.a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gl.r(this.Q);
        Object obj = this.T;
        if (obj != null) {
            b(obj);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl.d3(this.Q, 250L);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.J;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            ya yaVar = this.K;
            if (yaVar != null && yaVar.a.q) {
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfo.setChecked(z);
        } else {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.O != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.P;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.L), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        lr4 lr4Var;
        lr4 lr4Var2;
        if (i == 16 && (lr4Var2 = this.N) != null) {
            lr4Var2.run();
            return true;
        } else if (i == 32 && (lr4Var = this.O) != null) {
            lr4Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i, bundle);
        }
    }
}
