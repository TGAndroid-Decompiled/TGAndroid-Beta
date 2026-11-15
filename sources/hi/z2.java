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
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.er;
public final class z2 extends FrameLayout {
    public static int f15480e0;
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
    public final e1 Q;
    public org.telegram.messenger.q5 R;
    public String S;
    public Object T;
    public fi.s5 U;
    public boolean V;
    public boolean W;
    public Bitmap f15483a;
    public final Path f15484a0;
    public final Paint f15485b;
    public final float[] f15486b0;
    public final Paint f15487c;
    public final Paint f15488c0;
    public final Paint d;
    public LinearGradient f15489e;
    public final Matrix f15490f;
    public final Matrix h;
    public final Paint f15491n;
    public final TextPaint f15492r;
    public final TextPaint f15493s;
    public final Drawable f15494w;
    public boolean f15495x;
    public StaticLayout f15496y;
    public static final ArrayList f15479d0 = new ArrayList();
    public static final HashMap f15481f0 = new HashMap();
    public static final fh.i f15482g0 = new fh.i(45, 1);

    public z2(Context context, org.telegram.ui.ActionBar.e6 e6Var, float f10, boolean z10) {
        super(context);
        this.f15485b = new Paint(3);
        Paint paint = new Paint(1);
        this.f15487c = paint;
        this.d = new Paint(1);
        this.f15490f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f15491n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f15492r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f15493s = textPaint2;
        this.Q = new e1(this, 6);
        this.f15484a0 = new Path();
        this.f15486b0 = new float[8];
        this.f15488c0 = new Paint(1);
        this.L = f10;
        this.M = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.33f));
        textPaint2.setColor(-1);
        this.f15494w = context.getResources().getDrawable(2131232550).mutate();
        y2 y2Var = new y2(this, context, e6Var);
        this.K = y2Var;
        if (!z10) {
            y2Var.setDrawBackgroundAsArc(6);
        } else {
            y2Var.setDrawBackgroundAsArc(7);
        }
        y2Var.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        CheckBoxBase checkBoxBase = y2Var.getCheckBoxBase();
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        if (checkBoxBase.f32445u != i7) {
            checkBoxBase.f32445u = i7;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.addView(y2Var, c8.ja.e(26, 26, 17));
        addView(frameLayout, c8.ja.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        y2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f15481f0;
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

    public final org.telegram.messenger.q5 a() {
        org.telegram.messenger.q5 q5Var = this.R;
        if (q5Var != null) {
            return q5Var;
        }
        ArrayList arrayList = f15479d0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.q5 q5Var2 = new org.telegram.messenger.q5("gallery_load_" + arrayList.size(), true);
            this.R = q5Var2;
            arrayList.add(q5Var2);
        } else {
            int i7 = f15480e0 + 1;
            f15480e0 = i7;
            if (i7 >= arrayList.size()) {
                f15480e0 = 0;
            }
            this.R = (org.telegram.messenger.q5) arrayList.get(f15480e0);
        }
        return this.R;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.S);
            this.S = null;
            this.f15483a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof ff;
        if (z10) {
            ff ffVar = (ff) obj;
            str = ffVar.f27711c;
            if (str == null) {
                if (ffVar.f27710b && !ffVar.d()) {
                    str = "" + ffVar.C;
                } else {
                    str = ffVar.I;
                }
            }
        } else if (obj instanceof d7) {
            str = "d" + ((d7) obj).f14126b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.S)) {
            return;
        }
        String str2 = this.S;
        if (str2 != null) {
            this.f15483a = null;
            d(str2);
            invalidate();
        }
        this.S = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.f15489e = null;
        if (z10) {
            ff ffVar2 = (ff) obj;
            if (ffVar2.T != 0 && ffVar2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{ffVar2.T, ffVar2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f15489e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f15482g0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f15481f0;
                Integer num = (Integer) hashMap.get(str);
                int i7 = 1;
                if (num != null) {
                    i7 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i7));
            }
        }
        this.f15483a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.U != null) {
            a().cancelRunnable(this.U);
            this.U = null;
        }
        org.telegram.messenger.q5 a10 = a();
        fi.s5 s5Var = new fi.s5(this, obj, str, 8);
        this.U = s5Var;
        a10.postRunnable(s5Var);
    }

    public final Bitmap c(ff ffVar, BitmapFactory.Options options) {
        if (ffVar == null) {
            return null;
        }
        int i7 = ffVar.C;
        String str = ffVar.f27711c;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (ffVar.f27710b && !ffVar.d()) {
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
            Path path = this.f15484a0;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.V) {
                f10 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f10 = 0.0f;
            }
            float[] fArr = this.f15486b0;
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
            Paint paint = this.f15488c0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f15487c);
        if (this.f15489e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f15483a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f15483a, this.f15490f, this.f15485b);
        }
        StaticLayout staticLayout = this.G;
        Paint paint2 = this.f15491n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + this.H + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + this.G.getHeight() + org.telegram.messenger.g0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(6.0f)) - this.I, rectF2.top + org.telegram.messenger.g0.L(1.33f));
            this.G.draw(canvas2);
            canvas2.restore();
        }
        if (this.f15496y != null) {
            RectF rectF3 = org.telegram.messenger.g0.P;
            float L3 = org.telegram.messenger.g0.L(4.0f);
            float height = ((getHeight() - org.telegram.messenger.g0.L(4.0f)) - this.f15496y.getHeight()) - org.telegram.messenger.g0.L(2.0f);
            int L4 = org.telegram.messenger.g0.L(4.0f);
            if (this.f15495x) {
                L = org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            rectF3.set(L3, height, L4 + L + this.E + org.telegram.messenger.g0.L(5.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
            canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            if (this.f15495x) {
                Drawable drawable = this.f15494w;
                drawable.setBounds((int) (rectF3.left + org.telegram.messenger.g0.L(6.0f)), (int) (rectF3.centerY() - (org.telegram.messenger.g0.L(8.0f) / 2)), (int) (rectF3.left + org.telegram.messenger.g0.L(13.0f)), (int) (rectF3.centerY() + (org.telegram.messenger.g0.L(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f12 = rectF3.left;
            if (this.f15495x) {
                L2 = org.telegram.messenger.g0.L(16.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(5.0f);
            }
            canvas2.translate((f12 + L2) - this.F, rectF3.top + org.telegram.messenger.g0.L(1.0f));
            this.f15496y.draw(canvas2);
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
            g(hd.G(i7, "StoryDrafts", new Object[0]));
            this.f15495x = false;
            this.P = hd.G(i7, "StoryDrafts", new Object[0]);
        } else {
            if (d7Var != null && d7Var.f14129c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String N0 = hd.N0("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = org.telegram.messenger.g0.f23611q.x;
                }
                StaticLayout staticLayout = new StaticLayout(N0, this.f15493s, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                str = org.telegram.messenger.g0.g0((int) Math.max(0.0f, ((d7Var.f14124a0 - d7Var.Z) * ((float) d7Var.f14141h0)) / 1000.0f), false, false);
            } else {
                str = null;
            }
            g(str);
            if (d7Var != null && d7Var.K) {
                float f12 = d7Var.f14124a0 - d7Var.Z;
                this.P = hd.M0(2131744682, null) + ", " + hd.z((int) Math.max(0.0f, (f12 * ((float) d7Var.f14141h0)) / 1000.0f));
            } else {
                this.P = hd.M0(2131744682, null);
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
            i20.n(scaleX.scaleY(f12).withEndAction(new ai.q(6, this, z10)), er.h, 320L);
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
                i7 = org.telegram.messenger.g0.f23611q.x;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f15492r, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f15496y = staticLayout;
            float f11 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f15496y.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.E = f10;
            if (this.f15496y.getLineCount() > 0) {
                f11 = this.f15496y.getLineLeft(0);
            }
            this.F = f11;
        } else {
            this.f15496y = null;
        }
        this.f15495x = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f15483a) != null) {
            if (bitmap.getHeight() / this.f15483a.getWidth() > this.L - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f15483a.getWidth(), getMeasuredHeight() / this.f15483a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f15483a.getWidth();
            }
            Matrix matrix = this.f15490f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(com.google.android.gms.internal.vision.e2.w(measuredWidth, this.f15483a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.gms.internal.vision.e2.w(measuredWidth, this.f15483a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f15489e;
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
        org.telegram.messenger.g0.i3(this.Q, 250L);
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
            if (y2Var != null && y2Var.f34667a.f32441q) {
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
