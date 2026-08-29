package nh;

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
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.jr;
public final class j3 extends FrameLayout {
    public static int W;
    public float A;
    public StaticLayout B;
    public float C;
    public float D;
    public final FrameLayout E;
    public final h3 F;
    public final float G;
    public final boolean H;
    public f3 I;
    public f3 J;
    public String K;
    public final lh.m5 L;
    public DispatchQueue M;
    public String N;
    public Object O;
    public l3.m P;
    public boolean Q;
    public boolean R;
    public final Path S;
    public final float[] T;
    public final Paint U;
    public Bitmap f17942a;
    public final Paint f17943b;
    public final Paint f17944c;
    public final Paint d;
    public LinearGradient f17945e;
    public final Matrix f17946f;
    public final Matrix h;
    public final Paint f17947n;
    public final TextPaint f17948r;
    public final TextPaint f17949s;
    public final Drawable v;
    public boolean f17950w;
    public StaticLayout f17951x;
    public float f17952y;
    public static final ArrayList V = new ArrayList();
    public static final HashMap f17940a0 = new HashMap();
    public static final i3 f17941b0 = new LruCache(45);

    public j3(Context context, org.telegram.ui.ActionBar.c6 c6Var, float f9, boolean z10) {
        super(context);
        this.f17943b = new Paint(3);
        Paint paint = new Paint(1);
        this.f17944c = paint;
        this.d = new Paint(1);
        this.f17946f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f17947n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f17948r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f17949s = textPaint2;
        this.L = new lh.m5(this, 27);
        this.S = new Path();
        this.T = new float[8];
        this.U = new Paint(1);
        this.G = f9;
        this.H = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
        textPaint2.setColor(-1);
        this.v = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        h3 h3Var = new h3(this, context, c6Var);
        this.F = h3Var;
        if (!z10) {
            h3Var.setDrawBackgroundAsArc(6);
        } else {
            h3Var.setDrawBackgroundAsArc(7);
        }
        h3Var.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        CheckBoxBase checkBoxBase = h3Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        if (checkBoxBase.f26328u != i10) {
            checkBoxBase.f26328u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.addView(h3Var, i7.f6.e(26, 26, 17));
        addView(frameLayout, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        h3Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f17940a0;
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
            int i10 = W + 1;
            W = i10;
            if (i10 >= arrayList.size()) {
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
            this.f17942a = null;
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
        } else if (obj instanceof o7) {
            str = "d" + ((o7) obj).f18257b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.N)) {
            return;
        }
        String str2 = this.N;
        if (str2 != null) {
            this.f17942a = null;
            d(str2);
            invalidate();
        }
        this.N = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.f17945e = null;
        if (z10) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
            if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f17945e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f17941b0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f17940a0;
                Integer num = (Integer) hashMap.get(str);
                int i10 = 1;
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i10));
            }
        }
        this.f17942a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.P != null) {
            a().cancelRunnable(this.P);
            this.P = null;
        }
        DispatchQueue a2 = a();
        l3.m mVar = new l3.m(this, obj, str, 11);
        this.P = mVar;
        a2.postRunnable(mVar);
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
        float f9;
        float f10;
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
                f9 = AndroidUtilities.dp(6.0f);
            } else {
                f9 = 0.0f;
            }
            float[] fArr = this.T;
            fArr[1] = f9;
            fArr[0] = f9;
            if (this.R) {
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
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f17944c);
        if (this.f17945e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f17942a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f17942a, this.f17946f, this.f17943b);
        }
        StaticLayout staticLayout = this.B;
        Paint paint2 = this.f17947n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.C + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.B.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.D, rectF2.top + AndroidUtilities.dp(1.33f));
            this.B.draw(canvas2);
            canvas2.restore();
        }
        if (this.f17951x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            float dp3 = AndroidUtilities.dp(4.0f);
            float height = ((getHeight() - AndroidUtilities.dp(4.0f)) - this.f17951x.getHeight()) - AndroidUtilities.dp(2.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            if (this.f17950w) {
                dp = AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            rectF3.set(dp3, height, dp4 + dp + this.f17952y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.f17950w) {
                Drawable drawable = this.v;
                drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(6.0f)), (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2)), (int) (rectF3.left + AndroidUtilities.dp(13.0f)), (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f11 = rectF3.left;
            if (this.f17950w) {
                dp2 = AndroidUtilities.dp(16.0f);
            } else {
                dp2 = AndroidUtilities.dp(5.0f);
            }
            canvas2.translate((f11 + dp2) - this.A, rectF3.top + AndroidUtilities.dp(1.0f));
            this.f17951x.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, o7 o7Var) {
        boolean z10;
        int i11;
        float f9;
        float f10;
        this.O = o7Var;
        String str = null;
        if (i10 > 0) {
            this.B = null;
            g(LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]));
            this.f17950w = false;
            this.K = LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]);
        } else {
            if (o7Var != null && o7Var.f18260c) {
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
                StaticLayout staticLayout = new StaticLayout(string, this.f17949s, i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.B = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    f9 = this.B.getLineWidth(0);
                } else {
                    f9 = 0.0f;
                }
                this.C = f9;
                if (this.B.getLineCount() > 0) {
                    f10 = this.B.getLineLeft(0);
                } else {
                    f10 = 0.0f;
                }
                this.D = f10;
            } else {
                this.B = null;
            }
            if (o7Var != null && o7Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((o7Var.f18255a0 - o7Var.Z) * ((float) o7Var.f18272h0)) / 1000.0f));
            }
            g(str);
            if (o7Var != null && o7Var.K) {
                float f11 = o7Var.f18255a0 - o7Var.Z;
                this.K = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, (f11 * ((float) o7Var.f18272h0)) / 1000.0f));
            } else {
                this.K = LocaleController.getString(R.string.StoryDraft);
            }
        }
        b(o7Var);
    }

    public final void f(int i10, boolean z10, boolean z11) {
        float f9;
        float f10;
        int i11;
        if (this.H) {
            z10 = true;
        }
        FrameLayout frameLayout = this.E;
        h3 h3Var = this.F;
        if (!z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = h3Var.animate();
            float f11 = 1.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z10) {
                f11 = 0.7f;
            }
            org.telegram.ui.b.q(scaleX.scaleY(f11).withEndAction(new hh.f(7, this, z10)), jr.h, 320L);
        }
        if (i10 >= 0) {
            h3Var.a(true, z11);
            h3Var.setNum(i10);
            return;
        }
        h3Var.a(false, z11);
    }

    public final void g(String str) {
        int i10;
        float f9;
        if (!TextUtils.isEmpty(str)) {
            if (getMeasuredWidth() > 0) {
                i10 = getMeasuredWidth();
            } else {
                i10 = AndroidUtilities.displaySize.x;
            }
            int i11 = i10;
            StaticLayout staticLayout = new StaticLayout(str, this.f17948r, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f17951x = staticLayout;
            float f10 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f9 = this.f17951x.getLineWidth(0);
            } else {
                f9 = 0.0f;
            }
            this.f17952y = f9;
            if (this.f17951x.getLineCount() > 0) {
                f10 = this.f17951x.getLineLeft(0);
            }
            this.A = f10;
        } else {
            this.f17951x = null;
        }
        this.f17950w = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f17942a) != null) {
            if (bitmap.getHeight() / this.f17942a.getWidth() > this.G - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f17942a.getWidth(), getMeasuredHeight() / this.f17942a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f17942a.getWidth();
            }
            Matrix matrix = this.f17946f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(com.google.android.recaptcha.internal.a.w(measuredWidth, this.f17942a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.recaptcha.internal.a.w(measuredWidth, this.f17942a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f17945e;
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
            h3 h3Var = this.F;
            if (h3Var != null && h3Var.f29211a.f26324q) {
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
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.G), 1073741824));
        h();
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        f3 f3Var;
        f3 f3Var2;
        if (i10 == 16 && (f3Var2 = this.I) != null) {
            f3Var2.run();
            return true;
        } else if (i10 == 32 && (f3Var = this.J) != null) {
            f3Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i10, bundle);
        }
    }
}
