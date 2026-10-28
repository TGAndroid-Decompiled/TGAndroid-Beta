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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class k3 extends FrameLayout {
    public static int f11090d0;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final FrameLayout I;
    public final i3 J;
    public final float K;
    public final boolean L;
    public g3 M;
    public g3 N;
    public String O;
    public final di.s8 P;
    public DispatchQueue Q;
    public String R;
    public Object S;
    public e2.m0 T;
    public boolean U;
    public boolean V;
    public final Path W;
    public Bitmap f11093a;
    public final float[] f11094a0;
    public final Paint f11095b;
    public final Paint f11096b0;
    public final Paint f11097c;
    public final Paint d;
    public LinearGradient e;
    public final Matrix f11098f;
    public final Matrix h;
    public final Paint f11099n;
    public final TextPaint f11100r;
    public final TextPaint f11101s;
    public final Drawable v;
    public boolean f11102w;
    public StaticLayout f11103x;
    public float f11104y;
    public static final ArrayList f11089c0 = new ArrayList();
    public static final HashMap f11091e0 = new HashMap();
    public static final j3 f11092f0 = new LruCache(45);

    public k3(Context context, org.telegram.ui.ActionBar.u6 u6Var, float f7, boolean z10) {
        super(context);
        this.f11095b = new Paint(3);
        Paint paint = new Paint(1);
        this.f11097c = paint;
        this.d = new Paint(1);
        this.f11098f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f11099n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f11100r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f11101s = textPaint2;
        this.P = new di.s8(this, 20);
        this.W = new Path();
        this.f11094a0 = new float[8];
        this.f11096b0 = new Paint(1);
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
        i3 i3Var = new i3(this, context, u6Var);
        this.J = i3Var;
        if (!z10) {
            i3Var.setDrawBackgroundAsArc(6);
        } else {
            i3Var.setDrawBackgroundAsArc(7);
        }
        i3Var.b(org.telegram.ui.ActionBar.y6.W9, org.telegram.ui.ActionBar.y6.X9, org.telegram.ui.ActionBar.y6.V9);
        CheckBoxBase checkBoxBase = i3Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        if (checkBoxBase.f26095u != i10) {
            checkBoxBase.f26095u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.addView(i3Var, kb1.i(26, 26, 17));
        addView(frameLayout, kb1.h(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        i3Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f11091e0;
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
        ArrayList arrayList = f11089c0;
        if (arrayList.size() < 4) {
            DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + arrayList.size());
            this.Q = dispatchQueue2;
            arrayList.add(dispatchQueue2);
        } else {
            int i10 = f11090d0 + 1;
            f11090d0 = i10;
            if (i10 >= arrayList.size()) {
                f11090d0 = 0;
            }
            this.Q = (DispatchQueue) arrayList.get(f11090d0);
        }
        return this.Q;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.R);
            this.R = null;
            this.f11093a = null;
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
        } else if (obj instanceof w7) {
            str = "d" + ((w7) obj).f11890b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.R)) {
            return;
        }
        String str2 = this.R;
        if (str2 != null) {
            this.f11093a = null;
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
            bitmap = (Bitmap) f11092f0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f11091e0;
                Integer num = (Integer) hashMap.get(str);
                int i10 = 1;
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                hashMap.put(str, Integer.valueOf(i10));
            }
        }
        this.f11093a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.T != null) {
            a().cancelRunnable(this.T);
            this.T = null;
        }
        DispatchQueue a2 = a();
        e2.m0 m0Var = new e2.m0(this, obj, str, 2);
        this.T = m0Var;
        a2.postRunnable(m0Var);
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
            float[] fArr = this.f11094a0;
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
            Paint paint = this.f11096b0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f11097c);
        if (this.e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f11093a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f11093a, this.f11098f, this.f11095b);
        }
        StaticLayout staticLayout = this.F;
        Paint paint2 = this.f11099n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.G + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.F.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.H, rectF2.top + AndroidUtilities.dp(1.33f));
            this.F.draw(canvas2);
            canvas2.restore();
        }
        if (this.f11103x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            float dp3 = AndroidUtilities.dp(4.0f);
            float height = ((getHeight() - AndroidUtilities.dp(4.0f)) - this.f11103x.getHeight()) - AndroidUtilities.dp(2.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            if (this.f11102w) {
                dp = AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            rectF3.set(dp3, height, dp4 + dp + this.f11104y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.f11102w) {
                Drawable drawable = this.v;
                drawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(6.0f)), (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2)), (int) (rectF3.left + AndroidUtilities.dp(13.0f)), (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2)));
                drawable.draw(canvas2);
            }
            canvas2.save();
            float f11 = rectF3.left;
            if (this.f11102w) {
                dp2 = AndroidUtilities.dp(16.0f);
            } else {
                dp2 = AndroidUtilities.dp(5.0f);
            }
            canvas2.translate((f11 + dp2) - this.E, rectF3.top + AndroidUtilities.dp(1.0f));
            this.f11103x.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, w7 w7Var) {
        boolean z10;
        int i11;
        float f7;
        float f10;
        this.S = w7Var;
        String str = null;
        if (i10 > 0) {
            this.F = null;
            g(LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]));
            this.f11102w = false;
            this.O = LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]);
        } else {
            if (w7Var != null && w7Var.f11893c) {
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
                StaticLayout staticLayout = new StaticLayout(string, this.f11101s, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            if (w7Var != null && w7Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((w7Var.f11888a0 - w7Var.Z) * ((float) w7Var.f11904h0)) / 1000.0f));
            }
            g(str);
            if (w7Var != null && w7Var.K) {
                float f11 = w7Var.f11888a0 - w7Var.Z;
                this.O = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, (f11 * ((float) w7Var.f11904h0)) / 1000.0f));
            } else {
                this.O = LocaleController.getString(R.string.StoryDraft);
            }
        }
        b(w7Var);
    }

    public final void f(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        int i11;
        if (this.L) {
            z10 = true;
        }
        FrameLayout frameLayout = this.I;
        i3 i3Var = this.J;
        if (!z11) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        } else {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = i3Var.animate();
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
            wh.q(scaleX.scaleY(f11).withEndAction(new bh.n(5, this, z10)), ds.h, 320L);
        }
        if (i10 >= 0) {
            i3Var.a(true, z11);
            i3Var.setNum(i10);
            return;
        }
        i3Var.a(false, z11);
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
            StaticLayout staticLayout = new StaticLayout(str, this.f11100r, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f11103x = staticLayout;
            float f10 = 0.0f;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f11103x.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f11104y = f7;
            if (this.f11103x.getLineCount() > 0) {
                f10 = this.f11103x.getLineLeft(0);
            }
            this.E = f10;
        } else {
            this.f11103x = null;
        }
        this.f11102w = true;
    }

    public final void h() {
        Bitmap bitmap;
        float measuredWidth;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f11093a) != null) {
            if (bitmap.getHeight() / this.f11093a.getWidth() > this.K - 0.1f) {
                measuredWidth = Math.max(getMeasuredWidth() / this.f11093a.getWidth(), getMeasuredHeight() / this.f11093a.getHeight());
            } else {
                measuredWidth = getMeasuredWidth() / this.f11093a.getWidth();
            }
            Matrix matrix = this.f11098f;
            matrix.reset();
            matrix.postScale(measuredWidth, measuredWidth);
            matrix.postTranslate(c3.h0.f(measuredWidth, this.f11093a.getWidth(), getMeasuredWidth(), 2.0f), c3.h0.f(measuredWidth, this.f11093a.getHeight(), getMeasuredHeight(), 2.0f));
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
            i3 i3Var = this.J;
            if (i3Var != null && i3Var.f26634a.f26091q) {
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
        g3 g3Var;
        g3 g3Var2;
        if (i10 == 16 && (g3Var2 = this.M) != null) {
            g3Var2.run();
            return true;
        } else if (i10 == 32 && (g3Var = this.N) != null) {
            g3Var.run();
            return true;
        } else {
            return super.performAccessibilityAction(i10, bundle);
        }
    }
}
