package gi;

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
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.xq;
public final class z2 extends FrameLayout {
    public static int f14005e0;
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
    public final ei.z5 Q;
    public org.telegram.messenger.q5 R;
    public String S;
    public Object T;
    public ei.h9 U;
    public boolean V;
    public boolean W;
    public Bitmap f14008a;
    public final Path f14009a0;
    public final Paint f14010b;
    public final float[] f14011b0;
    public final Paint f14012c;
    public final Paint f14013c0;
    public final Paint d;
    public LinearGradient f14014e;
    public final Matrix f14015f;
    public final Matrix h;
    public final Paint f14016n;
    public final TextPaint f14017r;
    public final TextPaint f14018s;
    public final Drawable f14019w;
    public boolean f14020x;
    public StaticLayout f14021y;
    public static final ArrayList f14004d0 = new ArrayList();
    public static final HashMap f14006f0 = new HashMap();
    public static final gh.i f14007g0 = new gh.i(45, 1);

    public z2(Context context, org.telegram.ui.ActionBar.e6 e6Var, float f10, boolean z10) {
        super(context);
        this.f14010b = new Paint(3);
        Paint paint = new Paint(1);
        this.f14012c = paint;
        this.d = new Paint(1);
        this.f14015f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f14016n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f14017r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f14018s = textPaint2;
        this.Q = new ei.z5(this, 27);
        this.f14009a0 = new Path();
        this.f14011b0 = new float[8];
        this.f14013c0 = new Paint(1);
        this.L = f10;
        this.M = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.33f));
        textPaint2.setColor(-1);
        this.f14019w = context.getResources().getDrawable(2131232547).mutate();
        y2 y2Var = new y2(this, context, e6Var);
        this.K = y2Var;
        if (!z10) {
            y2Var.setDrawBackgroundAsArc(6);
        } else {
            y2Var.setDrawBackgroundAsArc(7);
        }
        y2Var.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        CheckBoxBase checkBoxBase = y2Var.getCheckBoxBase();
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        if (checkBoxBase.f31338u != i3) {
            checkBoxBase.f31338u = i3;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.addView(y2Var, mf.e(26, 26, 17));
        addView(frameLayout, mf.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        y2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f14006f0;
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
        ArrayList arrayList = f14004d0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.q5 q5Var2 = new org.telegram.messenger.q5("gallery_load_" + arrayList.size(), true);
            this.R = q5Var2;
            arrayList.add(q5Var2);
        } else {
            int i3 = f14005e0 + 1;
            f14005e0 = i3;
            if (i3 >= arrayList.size()) {
                f14005e0 = 0;
            }
            this.R = (org.telegram.messenger.q5) arrayList.get(f14005e0);
        }
        return this.R;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.S);
            this.S = null;
            this.f14008a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof ye;
        if (z10) {
            ye yeVar = (ye) obj;
            str = yeVar.f25311c;
            if (str == null) {
                if (yeVar.f25310b && !yeVar.d()) {
                    str = "" + yeVar.C;
                } else {
                    str = yeVar.I;
                }
            }
        } else if (obj instanceof f7) {
            str = "d" + ((f7) obj).f12705b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.S)) {
            return;
        }
        String str2 = this.S;
        if (str2 != null) {
            this.f14008a = null;
            d(str2);
            invalidate();
        }
        this.S = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.f14014e = null;
        if (z10) {
            ye yeVar2 = (ye) obj;
            if (yeVar2.T != 0 && yeVar2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{yeVar2.T, yeVar2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f14014e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f14007g0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f14006f0;
                Integer num = (Integer) hashMap.get(str);
                int i3 = 1;
                if (num != null) {
                    i3 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i3));
            }
        }
        this.f14008a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.U != null) {
            a().cancelRunnable(this.U);
            this.U = null;
        }
        org.telegram.messenger.q5 a10 = a();
        ei.h9 h9Var = new ei.h9(this, obj, str, 5);
        this.U = h9Var;
        a10.postRunnable(h9Var);
    }

    public final Bitmap c(ye yeVar, BitmapFactory.Options options) {
        if (yeVar == null) {
            return null;
        }
        int i3 = yeVar.C;
        String str = yeVar.f25311c;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (yeVar.f25310b && !yeVar.d()) {
            return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i3, 1, options);
        }
        return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i3, 1, options);
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
            Path path = this.f14009a0;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.V) {
                f10 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f10 = 0.0f;
            }
            float[] fArr = this.f14011b0;
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
            Paint paint = this.f14013c0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f14012c);
        if (this.f14014e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f14008a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f14008a, this.f14015f, this.f14010b);
        }
        StaticLayout staticLayout = this.G;
        Paint paint2 = this.f14016n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + this.H + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + this.G.getHeight() + org.telegram.messenger.g0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(6.0f)) - this.I, rectF2.top + org.telegram.messenger.g0.L(1.33f));
            this.G.draw(canvas2);
            canvas2.restore();
        }
        if (this.f14021y != null) {
            RectF rectF3 = org.telegram.messenger.g0.P;
            float L3 = org.telegram.messenger.g0.L(4.0f);
            float height = ((getHeight() - org.telegram.messenger.g0.L(4.0f)) - this.f14021y.getHeight()) - org.telegram.messenger.g0.L(2.0f);
            int L4 = org.telegram.messenger.g0.L(4.0f);
            if (this.f14020x) {
                L = org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            rectF3.set(L3, height, L4 + L + this.E + org.telegram.messenger.g0.L(5.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
            canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            if (this.f14020x) {
                Drawable drawable = this.f14019w;
                drawable.setBounds((int) (rectF3.left + org.telegram.messenger.g0.L(6.0f)), (int) (rectF3.centerY() - (org.telegram.messenger.g0.L(8.0f) / 2)), (int) (rectF3.left + org.telegram.messenger.g0.L(13.0f)), (int) (rectF3.centerY() + (org.telegram.messenger.g0.L(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f12 = rectF3.left;
            if (this.f14020x) {
                L2 = org.telegram.messenger.g0.L(16.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(5.0f);
            }
            canvas2.translate((f12 + L2) - this.F, rectF3.top + org.telegram.messenger.g0.L(1.0f));
            this.f14021y.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i3, f7 f7Var) {
        boolean z10;
        String str;
        int i10;
        float f10;
        float f11;
        this.T = f7Var;
        if (i3 > 0) {
            this.G = null;
            g(bd.G(i3, "StoryDrafts", new Object[0]));
            this.f14020x = false;
            this.P = bd.G(i3, "StoryDrafts", new Object[0]);
        } else {
            if (f7Var != null && f7Var.f12708c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String N0 = bd.N0("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = org.telegram.messenger.g0.f22608q.x;
                }
                StaticLayout staticLayout = new StaticLayout(N0, this.f14018s, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            if (f7Var != null && f7Var.K) {
                str = org.telegram.messenger.g0.g0((int) Math.max(0.0f, ((f7Var.f12703a0 - f7Var.Z) * ((float) f7Var.f12720h0)) / 1000.0f), false, false);
            } else {
                str = null;
            }
            g(str);
            if (f7Var != null && f7Var.K) {
                float f12 = f7Var.f12703a0 - f7Var.Z;
                this.P = bd.M0(2131744692, null) + ", " + bd.z((int) Math.max(0.0f, (f12 * ((float) f7Var.f12720h0)) / 1000.0f));
            } else {
                this.P = bd.M0(2131744692, null);
            }
        }
        b(f7Var);
    }

    public final void f(int i3, boolean z10, boolean z11) {
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
            org.telegram.messenger.camera.q.l(scaleX.scaleY(f12).withEndAction(new ci.e1(5, this, z10)), xq.h, 320L);
        }
        if (i3 >= 0) {
            y2Var.a(true, z11);
            y2Var.setNum(i3);
            return;
        }
        y2Var.a(false, z11);
    }

    public final void g(String str) {
        int i3;
        float f10;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = org.telegram.messenger.g0.f22608q.x;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f14017r, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f14021y = staticLayout;
            float f11 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f14021y.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.E = f10;
            if (this.f14021y.getLineCount() > 0) {
                f11 = this.f14021y.getLineLeft(0);
            }
            this.F = f11;
        } else {
            this.f14021y = null;
        }
        this.f14020x = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f14008a) != null) {
            if (bitmap.getHeight() / this.f14008a.getWidth() > this.L - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f14008a.getWidth(), getMeasuredHeight() / this.f14008a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f14008a.getWidth();
            }
            Matrix matrix = this.f14015f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(com.google.android.recaptcha.internal.a.c(measuredWidth, this.f14008a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.recaptcha.internal.a.c(measuredWidth, this.f14008a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f14014e;
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
            if (y2Var != null && y2Var.f40035a.f31334q) {
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
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.L), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        w2 w2Var;
        w2 w2Var2;
        if (i3 == 16 && (w2Var2 = this.N) != null) {
            w2Var2.run();
            return true;
        } else if (i3 == 32 && (w2Var = this.O) != null) {
            w2Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i3, bundle);
        }
    }
}
