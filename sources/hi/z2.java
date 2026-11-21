package hi;

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
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.nr;
public final class z2 extends FrameLayout {
    public static int f15831e0;
    public float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final FrameLayout J;
    public final y2 K;
    public final float L;
    public final boolean M;
    public w2 N;
    public w2 O;
    public String P;
    public final l Q;
    public org.telegram.messenger.r5 R;
    public String S;
    public Object T;
    public di.a8 U;
    public boolean V;
    public boolean W;
    public Bitmap f15834a;
    public final Path f15835a0;
    public final Paint f15836b;
    public final float[] f15837b0;
    public final Paint f15838c;
    public final Paint f15839c0;
    public final Paint d;
    public LinearGradient f15840e;
    public final Matrix f15841f;
    public final Matrix h;
    public final Paint f15842n;
    public final TextPaint f15843r;
    public final TextPaint f15844s;
    public final Drawable f15845w;
    public boolean f15846x;
    public StaticLayout f15847y;
    public static final ArrayList f15830d0 = new ArrayList();
    public static final HashMap f15832f0 = new HashMap();
    public static final fh.i f15833g0 = new fh.i(45, 1);

    public z2(Context context, org.telegram.ui.ActionBar.h6 h6Var, float f10, boolean z10) {
        super(context);
        this.f15836b = new Paint(3);
        Paint paint = new Paint(1);
        this.f15838c = paint;
        this.d = new Paint(1);
        this.f15841f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f15842n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f15843r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f15844s = textPaint2;
        this.Q = new l(this, 10);
        this.f15835a0 = new Path();
        this.f15837b0 = new float[8];
        this.f15839c0 = new Paint(1);
        this.L = f10;
        this.M = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.33f));
        textPaint2.setColor(-1);
        this.f15845w = context.getResources().getDrawable(2131232551).mutate();
        y2 y2Var = new y2(this, context, h6Var);
        this.K = y2Var;
        if (!z10) {
            y2Var.setDrawBackgroundAsArc(6);
        } else {
            y2Var.setDrawBackgroundAsArc(7);
        }
        y2Var.b(org.telegram.ui.ActionBar.m6.W9, org.telegram.ui.ActionBar.m6.X9, org.telegram.ui.ActionBar.m6.V9);
        CheckBoxBase checkBoxBase = y2Var.getCheckBoxBase();
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        if (checkBoxBase.f32875u != i7) {
            checkBoxBase.f32875u = i7;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.addView(y2Var, c8.ma.e(26, 26, 17));
        addView(frameLayout, c8.ma.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        y2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f15832f0;
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

    public final org.telegram.messenger.r5 a() {
        org.telegram.messenger.r5 r5Var = this.R;
        if (r5Var != null) {
            return r5Var;
        }
        ArrayList arrayList = f15830d0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.r5 r5Var2 = new org.telegram.messenger.r5("gallery_load_" + arrayList.size(), true);
            this.R = r5Var2;
            arrayList.add(r5Var2);
        } else {
            int i7 = f15831e0 + 1;
            f15831e0 = i7;
            if (i7 >= arrayList.size()) {
                f15831e0 = 0;
            }
            this.R = (org.telegram.messenger.r5) arrayList.get(f15831e0);
        }
        return this.R;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.S);
            this.S = null;
            this.f15834a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof ef;
        if (z10) {
            ef efVar = (ef) obj;
            str = efVar.f27876c;
            if (str == null) {
                if (efVar.f27875b && !efVar.d()) {
                    str = "" + efVar.C;
                } else {
                    str = efVar.I;
                }
            }
        } else if (obj instanceof c7) {
            str = "d" + ((c7) obj).f14338b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.S)) {
            return;
        }
        String str2 = this.S;
        if (str2 != null) {
            this.f15834a = null;
            d(str2);
            invalidate();
        }
        this.S = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.f15840e = null;
        if (z10) {
            ef efVar2 = (ef) obj;
            if (efVar2.T != 0 && efVar2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{efVar2.T, efVar2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f15840e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f15833g0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f15832f0;
                Integer num = (Integer) hashMap.get(str);
                int i7 = 1;
                if (num != null) {
                    i7 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i7));
            }
        }
        this.f15834a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.U != null) {
            a().cancelRunnable(this.U);
            this.U = null;
        }
        org.telegram.messenger.r5 a10 = a();
        di.a8 a8Var = new di.a8(this, obj, str, 13);
        this.U = a8Var;
        a10.postRunnable(a8Var);
    }

    public final Bitmap c(ef efVar, BitmapFactory.Options options) {
        if (efVar == null) {
            return null;
        }
        int i7 = efVar.C;
        String str = efVar.f27876c;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (efVar.f27875b && !efVar.d()) {
            return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i7, 1, options);
        }
        return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i7, 1, options);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        Canvas canvas2;
        int L;
        int L2;
        boolean z11 = true;
        if (!this.V && !this.W) {
            z10 = false;
        } else {
            canvas.save();
            Path path = this.f15835a0;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.V) {
                f10 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f10 = 0.0f;
            }
            float[] fArr = this.f15837b0;
            fArr[1] = f10;
            fArr[0] = f10;
            if (this.W) {
                f11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        }
        float progress = this.K.getProgress() * org.telegram.messenger.g0.L(12.66f);
        if (progress > 0.0f) {
            if (!z10) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.f15839c0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f15838c);
        if (this.f15840e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f15834a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f15834a, this.f15841f, this.f15836b);
        }
        StaticLayout staticLayout = this.G;
        Paint paint2 = this.f15842n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + this.H + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + this.G.getHeight() + org.telegram.messenger.g0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(6.0f)) - this.I, rectF2.top + org.telegram.messenger.g0.L(1.33f));
            this.G.draw(canvas2);
            canvas2.restore();
        }
        if (this.f15847y != null) {
            RectF rectF3 = org.telegram.messenger.g0.P;
            float L3 = org.telegram.messenger.g0.L(4.0f);
            float height = ((getHeight() - org.telegram.messenger.g0.L(4.0f)) - this.f15847y.getHeight()) - org.telegram.messenger.g0.L(2.0f);
            int L4 = org.telegram.messenger.g0.L(4.0f);
            if (this.f15846x) {
                L = org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            rectF3.set(L3, height, L4 + L + this.E + org.telegram.messenger.g0.L(5.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
            canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            if (this.f15846x) {
                Drawable drawable = this.f15845w;
                drawable.setBounds((int) (rectF3.left + org.telegram.messenger.g0.L(6.0f)), (int) (rectF3.centerY() - (org.telegram.messenger.g0.L(8.0f) / 2)), (int) (rectF3.left + org.telegram.messenger.g0.L(13.0f)), (int) (rectF3.centerY() + (org.telegram.messenger.g0.L(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f12 = rectF3.left;
            if (this.f15846x) {
                L2 = org.telegram.messenger.g0.L(16.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(5.0f);
            }
            canvas2.translate((f12 + L2) - this.F, rectF3.top + org.telegram.messenger.g0.L(1.0f));
            this.f15847y.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i7, c7 c7Var) {
        boolean z10;
        String str;
        int i10;
        float f10;
        float f11;
        this.T = c7Var;
        if (i7 > 0) {
            this.G = null;
            g(gd.G(i7, "StoryDrafts", new Object[0]));
            this.f15846x = false;
            this.P = gd.G(i7, "StoryDrafts", new Object[0]);
        } else {
            if (c7Var != null && c7Var.f14341c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String O0 = gd.O0("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = org.telegram.messenger.g0.f24146q.x;
                }
                StaticLayout staticLayout = new StaticLayout(O0, this.f15844s, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.G = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f10 = this.G.getLineWidth(0);
                } else {
                    f10 = 0.0f;
                }
                this.H = f10;
                if (this.G.getLineCount() > 0) {
                    f11 = this.G.getLineLeft(0);
                } else {
                    f11 = 0.0f;
                }
                this.I = f11;
            } else {
                this.G = null;
            }
            if (c7Var != null && c7Var.K) {
                str = org.telegram.messenger.g0.g0((int) Math.max(0.0f, ((c7Var.f14336a0 - c7Var.Z) * ((float) c7Var.f14353h0)) / 1000.0f), false, false);
            } else {
                str = null;
            }
            g(str);
            if (c7Var != null && c7Var.K) {
                float f12 = c7Var.f14336a0 - c7Var.Z;
                this.P = gd.N0(2131744441, null) + ", " + gd.z((int) Math.max(0.0f, (f12 * ((float) c7Var.f14353h0)) / 1000.0f));
            } else {
                this.P = gd.N0(2131744441, null);
            }
        }
        b(c7Var);
    }

    public final void f(int i7, boolean z10, boolean z11) {
        float f10;
        float f11;
        int i10;
        if (this.M) {
            z10 = true;
        }
        FrameLayout frameLayout = this.J;
        y2 y2Var = this.K;
        if (!z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = y2Var.animate();
            float f12 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z10) {
                f12 = 0.7f;
            }
            n10.o(scaleX.scaleY(f12).withEndAction(new ch.k(5, this, z10)), nr.h, 320L);
        }
        if (i7 >= 0) {
            y2Var.a(true, z11);
            y2Var.setNum(i7);
            return;
        }
        y2Var.a(false, z11);
    }

    public final void g(String str) {
        int i7;
        float f10;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i7 = getMeasuredWidth();
            } else {
                i7 = org.telegram.messenger.g0.f24146q.x;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f15843r, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f15847y = staticLayout;
            float f11 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f15847y.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.E = f10;
            if (this.f15847y.getLineCount() > 0) {
                f11 = this.f15847y.getLineLeft(0);
            }
            this.F = f11;
        } else {
            this.f15847y = null;
        }
        this.f15846x = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f15834a) != null) {
            if (bitmap.getHeight() / this.f15834a.getWidth() > this.L - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f15834a.getWidth(), getMeasuredHeight() / this.f15834a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f15834a.getWidth();
            }
            Matrix matrix = this.f15841f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(com.google.android.gms.internal.vision.e2.w(measuredWidth, this.f15834a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.gms.internal.vision.e2.w(measuredWidth, this.f15834a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f15840e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.r(this.Q);
        Object obj = this.T;
        if (obj != null) {
            b(obj);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.h3(this.Q, 250L);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.J;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            y2 y2Var = this.K;
            if (y2Var != null && y2Var.f38327a.f32871q) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityNodeInfo.setChecked(z10);
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.L), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        w2 w2Var;
        w2 w2Var2;
        if (i7 == 16 && (w2Var2 = this.N) != null) {
            w2Var2.run();
            return true;
        } else if (i7 == 32 && (w2Var = this.O) != null) {
            w2Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i7, bundle);
        }
    }
}
