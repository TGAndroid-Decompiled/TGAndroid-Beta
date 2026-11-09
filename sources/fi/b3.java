package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
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
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.xq;
public final class b3 extends FrameLayout {
    public static int f11650d0;
    public float D;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final FrameLayout I;
    public final a3 J;
    public final float K;
    public final boolean L;
    public y2 M;
    public y2 N;
    public String O;
    public final di.f8 P;
    public org.telegram.messenger.q5 Q;
    public String R;
    public Object S;
    public x1 T;
    public boolean U;
    public boolean V;
    public final Path W;
    public Bitmap f11653a;
    public final float[] f11654a0;
    public final Paint f11655b;
    public final Paint f11656b0;
    public final Paint f11657c;
    public final Paint d;
    public LinearGradient f11658e;
    public final Matrix f11659f;
    public final Matrix h;
    public final Paint f11660n;
    public final TextPaint f11661r;
    public final TextPaint f11662s;
    public final Drawable f11663w;
    public boolean f11664x;
    public StaticLayout f11665y;
    public static final ArrayList f11649c0 = new ArrayList();
    public static final HashMap f11651e0 = new HashMap();
    public static final fh.i f11652f0 = new fh.i(45, 1);

    public b3(Context context, org.telegram.ui.ActionBar.g6 g6Var, float f10, boolean z9) {
        super(context);
        this.f11655b = new Paint(3);
        Paint paint = new Paint(1);
        this.f11657c = paint;
        this.d = new Paint(1);
        this.f11659f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f11660n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f11661r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f11662s = textPaint2;
        this.P = new di.f8(this, 22);
        this.W = new Path();
        this.f11654a0 = new float[8];
        this.f11656b0 = new Paint(1);
        this.K = f10;
        this.L = z9;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.33f));
        textPaint2.setColor(-1);
        this.f11663w = context.getResources().getDrawable(2131232549).mutate();
        a3 a3Var = new a3(this, context, g6Var);
        this.J = a3Var;
        if (!z9) {
            a3Var.setDrawBackgroundAsArc(6);
        } else {
            a3Var.setDrawBackgroundAsArc(7);
        }
        a3Var.b(org.telegram.ui.ActionBar.l6.W9, org.telegram.ui.ActionBar.l6.X9, org.telegram.ui.ActionBar.l6.V9);
        CheckBoxBase checkBoxBase = a3Var.getCheckBoxBase();
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        if (checkBoxBase.f31272u != i7) {
            checkBoxBase.f31272u = i7;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.addView(a3Var, c8.ha.e(26, 26, 17));
        addView(frameLayout, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        a3Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f11651e0;
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
        org.telegram.messenger.q5 q5Var = this.Q;
        if (q5Var != null) {
            return q5Var;
        }
        ArrayList arrayList = f11649c0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.q5 q5Var2 = new org.telegram.messenger.q5("gallery_load_" + arrayList.size(), true);
            this.Q = q5Var2;
            arrayList.add(q5Var2);
        } else {
            int i7 = f11650d0 + 1;
            f11650d0 = i7;
            if (i7 >= arrayList.size()) {
                f11650d0 = 0;
            }
            this.Q = (org.telegram.messenger.q5) arrayList.get(f11650d0);
        }
        return this.Q;
    }

    public final void b(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: fi.b3.b(java.lang.Object):void");
    }

    public final Bitmap c(gf gfVar, BitmapFactory.Options options) {
        if (gfVar == null) {
            return null;
        }
        int i7 = gfVar.C;
        String str = gfVar.f26846c;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (gfVar.f26845b && !gfVar.d()) {
            return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i7, 1, options);
        }
        return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i7, 1, options);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        boolean z9;
        Canvas canvas2;
        int L;
        int L2;
        boolean z10 = true;
        if (!this.U && !this.V) {
            z9 = false;
        } else {
            canvas.save();
            Path path = this.W;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.U) {
                f10 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f10 = 0.0f;
            }
            float[] fArr = this.f11654a0;
            fArr[1] = f10;
            fArr[0] = f10;
            if (this.V) {
                f11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z9 = true;
        }
        float progress = this.J.getProgress() * org.telegram.messenger.g0.L(12.66f);
        if (progress > 0.0f) {
            if (!z9) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.f11656b0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z10 = z9;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f11657c);
        if (this.f11658e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f11653a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f11653a, this.f11659f, this.f11655b);
        }
        StaticLayout staticLayout = this.F;
        Paint paint2 = this.f11660n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + this.G + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + this.F.getHeight() + org.telegram.messenger.g0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(6.0f)) - this.H, rectF2.top + org.telegram.messenger.g0.L(1.33f));
            this.F.draw(canvas2);
            canvas2.restore();
        }
        if (this.f11665y != null) {
            RectF rectF3 = org.telegram.messenger.g0.P;
            float L3 = org.telegram.messenger.g0.L(4.0f);
            float height = ((getHeight() - org.telegram.messenger.g0.L(4.0f)) - this.f11665y.getHeight()) - org.telegram.messenger.g0.L(2.0f);
            int L4 = org.telegram.messenger.g0.L(4.0f);
            if (this.f11664x) {
                L = org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            rectF3.set(L3, height, L4 + L + this.D + org.telegram.messenger.g0.L(5.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
            canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
            if (this.f11664x) {
                Drawable drawable = this.f11663w;
                drawable.setBounds((int) (rectF3.left + org.telegram.messenger.g0.L(6.0f)), (int) (rectF3.centerY() - (org.telegram.messenger.g0.L(8.0f) / 2)), (int) (rectF3.left + org.telegram.messenger.g0.L(13.0f)), (int) (rectF3.centerY() + (org.telegram.messenger.g0.L(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f12 = rectF3.left;
            if (this.f11664x) {
                L2 = org.telegram.messenger.g0.L(16.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(5.0f);
            }
            canvas2.translate((f12 + L2) - this.E, rectF3.top + org.telegram.messenger.g0.L(1.0f));
            this.f11665y.draw(canvas2);
            canvas2.restore();
        }
        if (z10) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i7, e7 e7Var) {
        boolean z9;
        String str;
        int i10;
        float f10;
        float f11;
        this.S = e7Var;
        if (i7 > 0) {
            this.F = null;
            g(id.G(i7, "StoryDrafts", new Object[0]));
            this.f11664x = false;
            this.O = id.G(i7, "StoryDrafts", new Object[0]);
        } else {
            if (e7Var != null && e7Var.f11882c) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                String N0 = id.N0("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = org.telegram.messenger.g0.f22563q.x;
                }
                StaticLayout staticLayout = new StaticLayout(N0, this.f11662s, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.F = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f10 = this.F.getLineWidth(0);
                } else {
                    f10 = 0.0f;
                }
                this.G = f10;
                if (this.F.getLineCount() > 0) {
                    f11 = this.F.getLineLeft(0);
                } else {
                    f11 = 0.0f;
                }
                this.H = f11;
            } else {
                this.F = null;
            }
            if (e7Var != null && e7Var.K) {
                str = org.telegram.messenger.g0.g0((int) Math.max(0.0f, ((e7Var.f11877a0 - e7Var.Z) * ((float) e7Var.f11894h0)) / 1000.0f), false, false);
            } else {
                str = null;
            }
            g(str);
            if (e7Var != null && e7Var.K) {
                float f12 = e7Var.f11877a0 - e7Var.Z;
                this.O = id.M0(2131744682, null) + ", " + id.z((int) Math.max(0.0f, (f12 * ((float) e7Var.f11894h0)) / 1000.0f));
            } else {
                this.O = id.M0(2131744682, null);
            }
        }
        b(e7Var);
    }

    public final void f(int i7, boolean z9, boolean z10) {
        float f10;
        float f11;
        int i10;
        if (this.L) {
            z9 = true;
        }
        FrameLayout frameLayout = this.I;
        a3 a3Var = this.J;
        if (!z10) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = a3Var.animate();
            float f12 = 1.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z9) {
                f12 = 0.7f;
            }
            org.telegram.messenger.camera.q.l(scaleX.scaleY(f12).withEndAction(new bi.k1(5, this, z9)), xq.h, 320L);
        }
        if (i7 >= 0) {
            a3Var.a(true, z10);
            a3Var.setNum(i7);
            return;
        }
        a3Var.a(false, z10);
    }

    public final void g(String str) {
        int i7;
        float f10;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i7 = getMeasuredWidth();
            } else {
                i7 = org.telegram.messenger.g0.f22563q.x;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f11661r, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f11665y = staticLayout;
            float f11 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f11665y.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.D = f10;
            if (this.f11665y.getLineCount() > 0) {
                f11 = this.f11665y.getLineLeft(0);
            }
            this.E = f11;
        } else {
            this.f11665y = null;
        }
        this.f11664x = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f11653a) != null) {
            if (bitmap.getHeight() / this.f11653a.getWidth() > this.K - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f11653a.getWidth(), getMeasuredHeight() / this.f11653a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f11653a.getWidth();
            }
            Matrix matrix = this.f11659f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(com.google.android.recaptcha.internal.a.w(measuredWidth, this.f11653a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.recaptcha.internal.a.w(measuredWidth, this.f11653a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f11658e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.r(this.P);
        Object obj = this.S;
        if (obj != null) {
            b(obj);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.i3(this.P, 250L);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.I;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            a3 a3Var = this.J;
            if (a3Var != null && a3Var.f40108a.f31268q) {
                z9 = true;
            } else {
                z9 = false;
            }
            accessibilityNodeInfo.setChecked(z9);
        } else {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.N != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.O;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.K), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        y2 y2Var;
        y2 y2Var2;
        if (i7 == 16 && (y2Var2 = this.M) != null) {
            y2Var2.run();
            return true;
        } else if (i7 == 32 && (y2Var = this.N) != null) {
            y2Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i7, bundle);
        }
    }
}
