package kh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.gr;
public final class m3 extends FrameLayout {
    public static int W;
    public float A;
    public StaticLayout B;
    public float C;
    public float D;
    public final FrameLayout E;
    public final k3 F;
    public final float G;
    public final boolean H;
    public i3 I;
    public i3 J;
    public String K;
    public final f1 L;
    public DispatchQueue M;
    public String N;
    public Object O;
    public ih.h3 P;
    public boolean Q;
    public boolean R;
    public final Path S;
    public final float[] T;
    public final Paint U;
    public Bitmap f15677a;
    public final Paint f15678b;
    public final Paint f15679c;
    public final Paint d;
    public LinearGradient f15680e;
    public final Matrix f15681f;
    public final Matrix h;
    public final Paint f15682n;
    public final TextPaint f15683r;
    public final TextPaint f15684s;
    public final Drawable v;
    public boolean f15685w;
    public StaticLayout f15686x;
    public float f15687y;
    public static final ArrayList V = new ArrayList();
    public static final HashMap f15675a0 = new HashMap();
    public static final l3 f15676b0 = new LruCache(45);

    public m3(Context context, org.telegram.ui.ActionBar.b6 b6Var, float f10, boolean z10) {
        super(context);
        this.f15678b = new Paint(3);
        Paint paint = new Paint(1);
        this.f15679c = paint;
        this.d = new Paint(1);
        this.f15681f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f15682n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f15683r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f15684s = textPaint2;
        this.L = new f1(this, 6);
        this.S = new Path();
        this.T = new float[8];
        this.U = new Paint(1);
        this.G = f10;
        this.H = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
        textPaint2.setColor(-1);
        this.v = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        k3 k3Var = new k3(this, context, b6Var);
        this.F = k3Var;
        if (!z10) {
            k3Var.setDrawBackgroundAsArc(6);
        } else {
            k3Var.setDrawBackgroundAsArc(7);
        }
        k3Var.b(org.telegram.ui.ActionBar.f6.W9, org.telegram.ui.ActionBar.f6.X9, org.telegram.ui.ActionBar.f6.V9);
        CheckBoxBase checkBoxBase = k3Var.getCheckBoxBase();
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        if (checkBoxBase.f26317u != i9) {
            checkBoxBase.f26317u = i9;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.addView(k3Var, g7.e6.e(26, 26, 17));
        addView(frameLayout, g7.e6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        k3Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f15675a0;
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
        DispatchQueue dispatchQueue = this.M;
        if (dispatchQueue != null) {
            return dispatchQueue;
        }
        ArrayList arrayList = V;
        if (arrayList.size() < 4) {
            DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + arrayList.size());
            this.M = dispatchQueue2;
            arrayList.add(dispatchQueue2);
        } else {
            int i9 = W + 1;
            W = i9;
            if (i9 >= arrayList.size()) {
                W = 0;
            }
            this.M = (DispatchQueue) arrayList.get(W);
        }
        return this.M;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.N);
            this.N = null;
            this.f15677a = null;
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
        } else if (obj instanceof a8) {
            str = "d" + ((a8) obj).f14904b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.N)) {
            return;
        }
        String str2 = this.N;
        if (str2 != null) {
            this.f15677a = null;
            d(str2);
            invalidate();
        }
        this.N = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.f15680e = null;
        if (z10) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
            if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f15680e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f15676b0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f15675a0;
                Integer num = (Integer) hashMap.get(str);
                int i9 = 1;
                if (num != null) {
                    i9 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i9));
            }
        }
        this.f15677a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.P != null) {
            a().cancelRunnable(this.P);
            this.P = null;
        }
        DispatchQueue a2 = a();
        ih.h3 h3Var = new ih.h3(this, obj, str, 11);
        this.P = h3Var;
        a2.postRunnable(h3Var);
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
        float f10;
        float f11;
        boolean z10;
        Canvas canvas2;
        int dp;
        int dp2;
        boolean z11 = true;
        if (!this.Q && !this.R) {
            z10 = false;
        } else {
            canvas.save();
            Path path = this.S;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            if (this.Q) {
                f10 = AndroidUtilities.dp(6.0f);
            } else {
                f10 = 0.0f;
            }
            float[] fArr = this.T;
            fArr[1] = f10;
            fArr[0] = f10;
            if (this.R) {
                f11 = AndroidUtilities.dp(6.0f);
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        }
        float progress = this.F.getProgress() * AndroidUtilities.dp(12.66f);
        if (progress > 0.0f) {
            if (!z10) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.U;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f15679c);
        if (this.f15680e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f15677a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f15677a, this.f15681f, this.f15678b);
        }
        StaticLayout staticLayout = this.B;
        Paint paint2 = this.f15682n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.C + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.B.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.D, rectF2.top + AndroidUtilities.dp(1.33f));
            this.B.draw(canvas2);
            canvas2.restore();
        }
        if (this.f15686x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            float dp3 = AndroidUtilities.dp(4.0f);
            float height = ((getHeight() - AndroidUtilities.dp(4.0f)) - this.f15686x.getHeight()) - AndroidUtilities.dp(2.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            if (this.f15685w) {
                dp = AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            rectF3.set(dp3, height, dp4 + dp + this.f15687y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.f15685w) {
                Drawable drawable = this.v;
                drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(6.0f)), (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2)), (int) (rectF3.left + AndroidUtilities.dp(13.0f)), (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f12 = rectF3.left;
            if (this.f15685w) {
                dp2 = AndroidUtilities.dp(16.0f);
            } else {
                dp2 = AndroidUtilities.dp(5.0f);
            }
            canvas2.translate((f12 + dp2) - this.A, rectF3.top + AndroidUtilities.dp(1.0f));
            this.f15686x.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i9, a8 a8Var) {
        boolean z10;
        int i10;
        float f10;
        float f11;
        this.O = a8Var;
        String str = null;
        if (i9 > 0) {
            this.B = null;
            g(LocaleController.formatPluralString("StoryDrafts", i9, new Object[0]));
            this.f15685w = false;
            this.K = LocaleController.formatPluralString("StoryDrafts", i9, new Object[0]);
        } else {
            if (a8Var != null && a8Var.f14907c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String string = LocaleController.getString("StoryDraft");
                if (getMeasuredWidth() > 0) {
                    i10 = getMeasuredWidth();
                } else {
                    i10 = AndroidUtilities.displaySize.x;
                }
                int i11 = i10;
                StaticLayout staticLayout = new StaticLayout(string, this.f15684s, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.B = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f10 = this.B.getLineWidth(0);
                } else {
                    f10 = 0.0f;
                }
                this.C = f10;
                if (this.B.getLineCount() > 0) {
                    f11 = this.B.getLineLeft(0);
                } else {
                    f11 = 0.0f;
                }
                this.D = f11;
            } else {
                this.B = null;
            }
            if (a8Var != null && a8Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((a8Var.f14902a0 - a8Var.Z) * ((float) a8Var.f14919h0)) / 1000.0f));
            }
            g(str);
            if (a8Var != null && a8Var.K) {
                float f12 = a8Var.f14902a0 - a8Var.Z;
                this.K = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, (f12 * ((float) a8Var.f14919h0)) / 1000.0f));
            } else {
                this.K = LocaleController.getString(R.string.StoryDraft);
            }
        }
        b(a8Var);
    }

    public final void f(int i9, boolean z10, boolean z11) {
        float f10;
        float f11;
        int i10;
        if (this.H) {
            z10 = true;
        }
        FrameLayout frameLayout = this.E;
        k3 k3Var = this.F;
        if (!z11) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = k3Var.animate();
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
            ll.r(scaleX.scaleY(f12).withEndAction(new eh.f(7, this, z10)), gr.h, 320L);
        }
        if (i9 >= 0) {
            k3Var.a(true, z11);
            k3Var.setNum(i9);
            return;
        }
        k3Var.a(false, z11);
    }

    public final void g(String str) {
        int i9;
        float f10;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i9 = getMeasuredWidth();
            } else {
                i9 = AndroidUtilities.displaySize.x;
            }
            int i10 = i9;
            StaticLayout staticLayout = new StaticLayout(str, this.f15683r, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f15686x = staticLayout;
            float f11 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f15686x.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f15687y = f10;
            if (this.f15686x.getLineCount() > 0) {
                f11 = this.f15686x.getLineLeft(0);
            }
            this.A = f11;
        } else {
            this.f15686x = null;
        }
        this.f15685w = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f15677a) != null) {
            if (bitmap.getHeight() / this.f15677a.getWidth() > this.G - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f15677a.getWidth(), getMeasuredHeight() / this.f15677a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f15677a.getWidth();
            }
            Matrix matrix = this.f15681f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(e2.c.d(measuredWidth, this.f15677a.getWidth(), getMeasuredWidth(), 2.0f), e2.c.d(measuredWidth, this.f15677a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f15680e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix2);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.cancelRunOnUIThread(this.L);
        Object obj = this.O;
        if (obj != null) {
            b(obj);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.runOnUIThread(this.L, 250L);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            k3 k3Var = this.F;
            if (k3Var != null && k3Var.f27781a.f26313q) {
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
        if (this.J != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.K;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.G), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        i3 i3Var;
        i3 i3Var2;
        if (i9 == 16 && (i3Var2 = this.I) != null) {
            i3Var2.run();
            return true;
        } else if (i9 == 32 && (i3Var = this.J) != null) {
            i3Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i9, bundle);
        }
    }
}
