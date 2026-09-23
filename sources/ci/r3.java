package ci;

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
import android.util.LruCache;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.ul;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.rr;
public final class r3 extends FrameLayout {
    public static int f5437d0;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final FrameLayout I;
    public final p3 J;
    public final float K;
    public final boolean L;
    public n3 M;
    public n3 N;
    public String O;
    public final androidx.fragment.app.a0 P;
    public DispatchQueue Q;
    public String R;
    public Object S;
    public a3.k0 T;
    public boolean U;
    public boolean V;
    public final Path W;
    public Bitmap f5440a;
    public final float[] f5441a0;
    public final Paint f5442b;
    public final Paint f5443b0;
    public final Paint f5444c;
    public final Paint d;
    public LinearGradient e;
    public final Matrix f5445f;
    public final Matrix h;
    public final Paint f5446n;
    public final TextPaint f5447r;
    public final TextPaint f5448s;
    public final Drawable v;
    public boolean f5449w;
    public StaticLayout f5450x;
    public float f5451y;
    public static final ArrayList f5436c0 = new ArrayList();
    public static final HashMap f5438e0 = new HashMap();
    public static final q3 f5439f0 = new LruCache(45);

    public r3(Context context, org.telegram.ui.ActionBar.d6 d6Var, float f7, boolean z10) {
        super(context);
        this.f5442b = new Paint(3);
        Paint paint = new Paint(1);
        this.f5444c = paint;
        this.d = new Paint(1);
        this.f5445f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f5446n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f5447r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f5448s = textPaint2;
        this.P = new androidx.fragment.app.a0(this, 16);
        this.W = new Path();
        this.f5441a0 = new float[8];
        this.f5443b0 = new Paint(1);
        this.K = f7;
        this.L = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
        textPaint2.setColor(-1);
        this.v = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        p3 p3Var = new p3(this, context, d6Var);
        this.J = p3Var;
        if (!z10) {
            p3Var.setDrawBackgroundAsArc(6);
        } else {
            p3Var.setDrawBackgroundAsArc(7);
        }
        p3Var.b(org.telegram.ui.ActionBar.h6.W9, org.telegram.ui.ActionBar.h6.X9, org.telegram.ui.ActionBar.h6.V9);
        CheckBoxBase checkBoxBase = p3Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        if (checkBoxBase.f21947u != i10) {
            checkBoxBase.f21947u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.addView(p3Var, w7.x5.e(26, 26, 17));
        addView(frameLayout, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        p3Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f5438e0;
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

    public final DispatchQueue a() {
        DispatchQueue dispatchQueue = this.Q;
        if (dispatchQueue != null) {
            return dispatchQueue;
        }
        ArrayList arrayList = f5436c0;
        if (arrayList.size() < 4) {
            DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + arrayList.size());
            this.Q = dispatchQueue2;
            arrayList.add(dispatchQueue2);
        } else {
            int i10 = f5437d0 + 1;
            f5437d0 = i10;
            if (i10 >= arrayList.size()) {
                f5437d0 = 0;
            }
            this.Q = (DispatchQueue) arrayList.get(f5437d0);
        }
        return this.Q;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.R);
            this.R = null;
            this.f5440a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        if (z10) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            str = photoEntry.thumbPath;
            if (str == null) {
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = "" + photoEntry.imageId;
                } else {
                    str = photoEntry.path;
                }
            }
        } else if (obj instanceof l8) {
            str = "d" + ((l8) obj).f4967b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.R)) {
            return;
        }
        String str2 = this.R;
        if (str2 != null) {
            this.f5440a = null;
            d(str2);
            invalidate();
        }
        this.R = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z10) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
            if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f5439f0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f5438e0;
                Integer num = (Integer) hashMap.get(str);
                int i10 = 1;
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i10));
            }
        }
        this.f5440a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.T != null) {
            a().cancelRunnable(this.T);
            this.T = null;
        }
        DispatchQueue a2 = a();
        a3.k0 k0Var = new a3.k0(this, obj, str, 13);
        this.T = k0Var;
        a2.postRunnable(k0Var);
    }

    public final Bitmap c(MediaController.PhotoEntry photoEntry, BitmapFactory.Options options) {
        if (photoEntry == null) {
            return null;
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
            return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
        }
        return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        Canvas canvas2;
        int dp;
        int dp2;
        boolean z11 = true;
        if (!this.U && !this.V) {
            z10 = false;
        } else {
            canvas.save();
            Path path = this.W;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.U) {
                f7 = AndroidUtilities.dp(6.0f);
            } else {
                f7 = 0.0f;
            }
            float[] fArr = this.f5441a0;
            fArr[1] = f7;
            fArr[0] = f7;
            if (this.V) {
                f10 = AndroidUtilities.dp(6.0f);
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        }
        float progress = this.J.getProgress() * AndroidUtilities.dp(12.66f);
        if (progress > 0.0f) {
            if (!z10) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.f5443b0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f5444c);
        if (this.e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f5440a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f5440a, this.f5445f, this.f5442b);
        }
        StaticLayout staticLayout = this.F;
        Paint paint2 = this.f5446n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.G + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.F.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.H, rectF2.top + AndroidUtilities.dp(1.33f));
            this.F.draw(canvas2);
            canvas2.restore();
        }
        if (this.f5450x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            float dp3 = AndroidUtilities.dp(4.0f);
            float height = ((getHeight() - AndroidUtilities.dp(4.0f)) - this.f5450x.getHeight()) - AndroidUtilities.dp(2.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            if (this.f5449w) {
                dp = AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            rectF3.set(dp3, height, dp4 + dp + this.f5451y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.f5449w) {
                Drawable drawable = this.v;
                drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(6.0f)), (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2)), (int) (rectF3.left + AndroidUtilities.dp(13.0f)), (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f11 = rectF3.left;
            if (this.f5449w) {
                dp2 = AndroidUtilities.dp(16.0f);
            } else {
                dp2 = AndroidUtilities.dp(5.0f);
            }
            canvas2.translate((f11 + dp2) - this.E, rectF3.top + AndroidUtilities.dp(1.0f));
            this.f5450x.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, l8 l8Var) {
        boolean z10;
        int i11;
        float f7;
        float f10;
        this.S = l8Var;
        String str = null;
        if (i10 > 0) {
            this.F = null;
            g(LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]));
            this.f5449w = false;
            this.O = LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]);
        } else {
            if (l8Var != null && l8Var.f4970c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String string = LocaleController.getString("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i11 = getMeasuredWidth();
                } else {
                    i11 = AndroidUtilities.displaySize.x;
                }
                int i12 = i11;
                StaticLayout staticLayout = new StaticLayout(string, this.f5448s, i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.F = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f7 = this.F.getLineWidth(0);
                } else {
                    f7 = 0.0f;
                }
                this.G = f7;
                if (this.F.getLineCount() > 0) {
                    f10 = this.F.getLineLeft(0);
                } else {
                    f10 = 0.0f;
                }
                this.H = f10;
            } else {
                this.F = null;
            }
            if (l8Var != null && l8Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((l8Var.f4965a0 - l8Var.Z) * ((float) l8Var.f4981h0)) / 1000.0f));
            }
            g(str);
            if (l8Var != null && l8Var.K) {
                float f11 = l8Var.f4965a0 - l8Var.Z;
                this.O = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, (f11 * ((float) l8Var.f4981h0)) / 1000.0f));
            } else {
                this.O = LocaleController.getString(R.string.StoryDraft);
            }
        }
        b(l8Var);
    }

    public final void f(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        int i11;
        if (this.L) {
            z10 = true;
        }
        FrameLayout frameLayout = this.I;
        p3 p3Var = this.J;
        if (!z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = p3Var.animate();
            float f11 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z10) {
                f11 = 0.7f;
            }
            ul.r(scaleX.scaleY(f11).withEndAction(new bi.f(1, this, z10)), rr.h, 320L);
        }
        if (i10 >= 0) {
            p3Var.a(true, z11);
            p3Var.setNum(i10);
            return;
        }
        p3Var.a(false, z11);
    }

    public final void g(String str) {
        int i10;
        float f7;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i10 = getMeasuredWidth();
            } else {
                i10 = AndroidUtilities.displaySize.x;
            }
            int i11 = i10;
            StaticLayout staticLayout = new StaticLayout(str, this.f5447r, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f5450x = staticLayout;
            float f10 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f5450x.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f5451y = f7;
            if (this.f5450x.getLineCount() > 0) {
                f10 = this.f5450x.getLineLeft(0);
            }
            this.E = f10;
        } else {
            this.f5450x = null;
        }
        this.f5449w = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f5440a) != null) {
            if (bitmap.getHeight() / this.f5440a.getWidth() > this.K - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f5440a.getWidth(), getMeasuredHeight() / this.f5440a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f5440a.getWidth();
            }
            Matrix matrix = this.f5445f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(com.google.android.gms.internal.vision.e2.v(measuredWidth, this.f5440a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.gms.internal.vision.e2.v(measuredWidth, this.f5440a.getHeight(), getMeasuredHeight(), 2.0f));
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
        AndroidUtilities.cancelRunOnUIThread(this.P);
        Object obj = this.S;
        if (obj != null) {
            b(obj);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.runOnUIThread(this.P, 250L);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.I;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            p3 p3Var = this.J;
            if (p3Var != null && p3Var.f26827a.f21943q) {
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
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.K), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        n3 n3Var;
        n3 n3Var2;
        if (i10 == 16 && (n3Var2 = this.M) != null) {
            n3Var2.run();
            return true;
        } else if (i10 == 32 && (n3Var = this.N) != null) {
            n3Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i10, bundle);
        }
    }
}
