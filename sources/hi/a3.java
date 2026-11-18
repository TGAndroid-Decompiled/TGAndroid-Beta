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
import org.telegram.ui.Components.lr;
public final class a3 extends FrameLayout {
    public static int f14210e0;
    public float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final FrameLayout J;
    public final z2 K;
    public final float L;
    public final boolean M;
    public x2 N;
    public x2 O;
    public String P;
    public final k Q;
    public org.telegram.messenger.r5 R;
    public String S;
    public Object T;
    public di.ga U;
    public boolean V;
    public boolean W;
    public Bitmap f14213a;
    public final Path f14214a0;
    public final Paint f14215b;
    public final float[] f14216b0;
    public final Paint f14217c;
    public final Paint f14218c0;
    public final Paint d;
    public LinearGradient f14219e;
    public final Matrix f14220f;
    public final Matrix h;
    public final Paint f14221n;
    public final TextPaint f14222r;
    public final TextPaint f14223s;
    public final Drawable f14224w;
    public boolean f14225x;
    public StaticLayout f14226y;
    public static final ArrayList f14209d0 = new ArrayList();
    public static final HashMap f14211f0 = new HashMap();
    public static final fh.i f14212g0 = new fh.i(45, 1);

    public a3(Context context, org.telegram.ui.ActionBar.i6 i6Var, float f10, boolean z10) {
        super(context);
        this.f14215b = new Paint(3);
        Paint paint = new Paint(1);
        this.f14217c = paint;
        this.d = new Paint(1);
        this.f14220f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f14221n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f14222r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f14223s = textPaint2;
        this.Q = new k(this, 10);
        this.f14214a0 = new Path();
        this.f14216b0 = new float[8];
        this.f14218c0 = new Paint(1);
        this.L = f10;
        this.M = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.33f));
        textPaint2.setColor(-1);
        this.f14224w = context.getResources().getDrawable(2131232551).mutate();
        z2 z2Var = new z2(this, context, i6Var);
        this.K = z2Var;
        if (!z10) {
            z2Var.setDrawBackgroundAsArc(6);
        } else {
            z2Var.setDrawBackgroundAsArc(7);
        }
        z2Var.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
        CheckBoxBase checkBoxBase = z2Var.getCheckBoxBase();
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        if (checkBoxBase.f32842u != i7) {
            checkBoxBase.f32842u = i7;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.addView(z2Var, c8.ma.e(26, 26, 17));
        addView(frameLayout, c8.ma.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        z2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f14211f0;
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
        ArrayList arrayList = f14209d0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.r5 r5Var2 = new org.telegram.messenger.r5("gallery_load_" + arrayList.size(), true);
            this.R = r5Var2;
            arrayList.add(r5Var2);
        } else {
            int i7 = f14210e0 + 1;
            f14210e0 = i7;
            if (i7 >= arrayList.size()) {
                f14210e0 = 0;
            }
            this.R = (org.telegram.messenger.r5) arrayList.get(f14210e0);
        }
        return this.R;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.S);
            this.S = null;
            this.f14213a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof ef;
        if (z10) {
            ef efVar = (ef) obj;
            str = efVar.f27848c;
            if (str == null) {
                if (efVar.f27847b && !efVar.d()) {
                    str = "" + efVar.C;
                } else {
                    str = efVar.I;
                }
            }
        } else if (obj instanceof d7) {
            str = "d" + ((d7) obj).f14388b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.S)) {
            return;
        }
        String str2 = this.S;
        if (str2 != null) {
            this.f14213a = null;
            d(str2);
            invalidate();
        }
        this.S = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.f14219e = null;
        if (z10) {
            ef efVar2 = (ef) obj;
            if (efVar2.T != 0 && efVar2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{efVar2.T, efVar2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f14219e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f14212g0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f14211f0;
                Integer num = (Integer) hashMap.get(str);
                int i7 = 1;
                if (num != null) {
                    i7 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i7));
            }
        }
        this.f14213a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.U != null) {
            a().cancelRunnable(this.U);
            this.U = null;
        }
        org.telegram.messenger.r5 a10 = a();
        di.ga gaVar = new di.ga(this, obj, str, 12);
        this.U = gaVar;
        a10.postRunnable(gaVar);
    }

    public final Bitmap c(ef efVar, BitmapFactory.Options options) {
        if (efVar == null) {
            return null;
        }
        int i7 = efVar.C;
        String str = efVar.f27848c;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (efVar.f27847b && !efVar.d()) {
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
            Path path = this.f14214a0;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.V) {
                f10 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f10 = 0.0f;
            }
            float[] fArr = this.f14216b0;
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
            Paint paint = this.f14218c0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f14217c);
        if (this.f14219e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f14213a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f14213a, this.f14220f, this.f14215b);
        }
        StaticLayout staticLayout = this.G;
        Paint paint2 = this.f14221n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + this.H + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + this.G.getHeight() + org.telegram.messenger.g0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(6.0f)) - this.I, rectF2.top + org.telegram.messenger.g0.L(1.33f));
            this.G.draw(canvas2);
            canvas2.restore();
        }
        if (this.f14226y != null) {
            RectF rectF3 = org.telegram.messenger.g0.P;
            float L3 = org.telegram.messenger.g0.L(4.0f);
            float height = ((getHeight() - org.telegram.messenger.g0.L(4.0f)) - this.f14226y.getHeight()) - org.telegram.messenger.g0.L(2.0f);
            int L4 = org.telegram.messenger.g0.L(4.0f);
            if (this.f14225x) {
                L = org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            rectF3.set(L3, height, L4 + L + this.E + org.telegram.messenger.g0.L(5.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
            canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            if (this.f14225x) {
                Drawable drawable = this.f14224w;
                drawable.setBounds((int) (rectF3.left + org.telegram.messenger.g0.L(6.0f)), (int) (rectF3.centerY() - (org.telegram.messenger.g0.L(8.0f) / 2)), (int) (rectF3.left + org.telegram.messenger.g0.L(13.0f)), (int) (rectF3.centerY() + (org.telegram.messenger.g0.L(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f12 = rectF3.left;
            if (this.f14225x) {
                L2 = org.telegram.messenger.g0.L(16.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(5.0f);
            }
            canvas2.translate((f12 + L2) - this.F, rectF3.top + org.telegram.messenger.g0.L(1.0f));
            this.f14226y.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i7, d7 d7Var) {
        boolean z10;
        String str;
        int i10;
        float f10;
        float f11;
        this.T = d7Var;
        if (i7 > 0) {
            this.G = null;
            g(gd.G(i7, "StoryDrafts", new Object[0]));
            this.f14225x = false;
            this.P = gd.G(i7, "StoryDrafts", new Object[0]);
        } else {
            if (d7Var != null && d7Var.f14391c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String N0 = gd.N0("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = org.telegram.messenger.g0.f24118q.x;
                }
                StaticLayout staticLayout = new StaticLayout(N0, this.f14223s, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            if (d7Var != null && d7Var.K) {
                str = org.telegram.messenger.g0.g0((int) Math.max(0.0f, ((d7Var.f14386a0 - d7Var.Z) * ((float) d7Var.f14403h0)) / 1000.0f), false, false);
            } else {
                str = null;
            }
            g(str);
            if (d7Var != null && d7Var.K) {
                float f12 = d7Var.f14386a0 - d7Var.Z;
                this.P = gd.M0(2131744447, null) + ", " + gd.z((int) Math.max(0.0f, (f12 * ((float) d7Var.f14403h0)) / 1000.0f));
            } else {
                this.P = gd.M0(2131744447, null);
            }
        }
        b(d7Var);
    }

    public final void f(int i7, boolean z10, boolean z11) {
        float f10;
        float f11;
        int i10;
        if (this.M) {
            z10 = true;
        }
        FrameLayout frameLayout = this.J;
        z2 z2Var = this.K;
        if (!z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = z2Var.animate();
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
            n10.o(scaleX.scaleY(f12).withEndAction(new ch.k(5, this, z10)), lr.h, 320L);
        }
        if (i7 >= 0) {
            z2Var.a(true, z11);
            z2Var.setNum(i7);
            return;
        }
        z2Var.a(false, z11);
    }

    public final void g(String str) {
        int i7;
        float f10;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i7 = getMeasuredWidth();
            } else {
                i7 = org.telegram.messenger.g0.f24118q.x;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f14222r, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f14226y = staticLayout;
            float f11 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f14226y.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.E = f10;
            if (this.f14226y.getLineCount() > 0) {
                f11 = this.f14226y.getLineLeft(0);
            }
            this.F = f11;
        } else {
            this.f14226y = null;
        }
        this.f14225x = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f14213a) != null) {
            if (bitmap.getHeight() / this.f14213a.getWidth() > this.L - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f14213a.getWidth(), getMeasuredHeight() / this.f14213a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f14213a.getWidth();
            }
            Matrix matrix = this.f14220f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(com.google.android.gms.internal.vision.e2.w(measuredWidth, this.f14213a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.gms.internal.vision.e2.w(measuredWidth, this.f14213a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f14219e;
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
            z2 z2Var = this.K;
            if (z2Var != null && z2Var.f37598a.f32838q) {
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
        x2 x2Var;
        x2 x2Var2;
        if (i7 == 16 && (x2Var2 = this.N) != null) {
            x2Var2.run();
            return true;
        } else if (i7 == 32 && (x2Var = this.O) != null) {
            x2Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i7, bundle);
        }
    }
}
