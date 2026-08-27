package lh;

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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.er;

public final class l3 extends FrameLayout {
    public static int W;
    public float A;
    public StaticLayout B;
    public float C;
    public float D;
    public final FrameLayout E;
    public final j3 F;
    public final float G;
    public final boolean H;
    public h3 I;
    public h3 J;
    public String K;
    public final kh.c L;
    public DispatchQueue M;
    public String N;
    public Object O;
    public j3.m P;
    public boolean Q;
    public boolean R;
    public final Path S;
    public final float[] T;
    public final Paint U;

    public Bitmap f16297a;

    public final Paint f16298b;

    public final Paint f16299c;
    public final Paint d;

    public LinearGradient f16300e;

    public final Matrix f16301f;
    public final Matrix h;

    public final Paint f16302n;

    public final TextPaint f16303r;

    public final TextPaint f16304s;
    public final Drawable v;

    public boolean f16305w;

    public StaticLayout f16306x;

    public float f16307y;
    public static final ArrayList V = new ArrayList();

    public static final HashMap f16295a0 = new HashMap();

    public static final k3 f16296b0 = new k3(45);

    public l3(Context context, org.telegram.ui.ActionBar.c6 c6Var, float f10, boolean z10) {
        super(context);
        this.f16298b = new Paint(3);
        Paint paint = new Paint(1);
        this.f16299c = paint;
        this.d = new Paint(1);
        this.f16301f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.f16302n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f16303r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f16304s = textPaint2;
        this.L = new kh.c(this, 13);
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
        j3 j3Var = new j3(this, context, c6Var);
        this.F = j3Var;
        if (z10) {
            j3Var.setDrawBackgroundAsArc(7);
        } else {
            j3Var.setDrawBackgroundAsArc(6);
        }
        j3Var.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        CheckBoxBase checkBoxBase = j3Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        if (checkBoxBase.f26313u != i10) {
            checkBoxBase.f26313u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.addView(j3Var, h7.z5.e(26, 26, 17));
        addView(frameLayout, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        j3Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str == null) {
            return;
        }
        HashMap map = f16295a0;
        Integer num = (Integer) map.get(str);
        if (num != null) {
            int iIntValue = num.intValue() - 1;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue <= 0) {
                map.remove(str);
            } else {
                map.put(str, numValueOf);
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
            this.f16297a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        if (z10) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            str = photoEntry.thumbPath;
            if (str == null) {
                if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                    str = photoEntry.path;
                } else {
                    str = "" + photoEntry.imageId;
                }
            }
        } else if (obj instanceof z7) {
            str = "d" + ((z7) obj).f17196b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.N)) {
            return;
        }
        String str2 = this.N;
        if (str2 != null) {
            this.f16297a = null;
            d(str2);
            invalidate();
        }
        this.N = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.f16300e = null;
        if (z10) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
            if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f16300e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f16296b0.get(str);
            if (bitmap != null) {
                HashMap map = f16295a0;
                Integer num = (Integer) map.get(str);
                map.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
        this.f16297a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.P != null) {
            a().cancelRunnable(this.P);
            this.P = null;
        }
        DispatchQueue dispatchQueueA = a();
        j3.m mVar = new j3.m(this, obj, str, 11);
        this.P = mVar;
        dispatchQueueA.postRunnable(mVar);
    }

    public final Bitmap c(MediaController.PhotoEntry photoEntry, BitmapFactory.Options options) {
        if (photoEntry == null) {
            return null;
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            return BitmapFactory.decodeFile(str, options);
        }
        return (!photoEntry.isVideo || photoEntry.isLivePhoto()) ? MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        boolean z11 = true;
        if (this.Q || this.R) {
            canvas.save();
            Path path = this.S;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float fDp = this.Q ? AndroidUtilities.dp(6.0f) : 0.0f;
            float[] fArr = this.T;
            fArr[1] = fDp;
            fArr[0] = fDp;
            float fDp2 = this.R ? AndroidUtilities.dp(6.0f) : 0.0f;
            fArr[3] = fDp2;
            fArr[2] = fDp2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        } else {
            z10 = false;
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
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f16299c);
        if (this.f16300e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.f16297a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.f16297a, this.f16301f, this.f16298b);
        }
        StaticLayout staticLayout = this.B;
        Paint paint2 = this.f16302n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.C + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.B.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.D, rectF2.top + AndroidUtilities.dp(1.33f));
            this.B.draw(canvas2);
            canvas2.restore();
        }
        if (this.f16306x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(AndroidUtilities.dp(4.0f), ((getHeight() - AndroidUtilities.dp(4.0f)) - this.f16306x.getHeight()) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + (this.f16305w ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(4.0f)) + this.f16307y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.f16305w) {
                int iDp = (int) (rectF3.left + AndroidUtilities.dp(6.0f));
                int iCenterY = (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2));
                int iDp2 = (int) (rectF3.left + AndroidUtilities.dp(13.0f));
                int iCenterY2 = (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2));
                Drawable drawable = this.v;
                drawable.setBounds(iDp, iCenterY, iDp2, iCenterY2);
                drawable.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate((rectF3.left + (this.f16305w ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(5.0f))) - this.A, rectF3.top + AndroidUtilities.dp(1.0f));
            this.f16306x.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, z7 z7Var) {
        this.O = z7Var;
        String shortDuration = null;
        if (i10 > 0) {
            this.B = null;
            g(LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]));
            this.f16305w = false;
            this.K = LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]);
        } else {
            if (z7Var != null && z7Var.f17199c) {
                StaticLayout staticLayout = new StaticLayout(LocaleController.getString("StoryDraft"), this.f16304s, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.B = staticLayout;
                this.C = staticLayout.getLineCount() > 0 ? this.B.getLineWidth(0) : 0.0f;
                this.D = this.B.getLineCount() > 0 ? this.B.getLineLeft(0) : 0.0f;
            } else {
                this.B = null;
            }
            if (z7Var != null && z7Var.K) {
                shortDuration = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((z7Var.f17194a0 - z7Var.Z) * z7Var.f17211h0) / 1000.0f));
            }
            g(shortDuration);
            if (z7Var == null || !z7Var.K) {
                this.K = LocaleController.getString(R.string.StoryDraft);
            } else {
                this.K = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, ((z7Var.f17194a0 - z7Var.Z) * z7Var.f17211h0) / 1000.0f));
            }
        }
        b(z7Var);
    }

    public final void f(int i10, boolean z10, boolean z11) {
        if (this.H) {
            z10 = true;
        }
        FrameLayout frameLayout = this.E;
        j3 j3Var = this.F;
        if (z11) {
            frameLayout.setVisibility(0);
            rl.o(j3Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).withEndAction(new fh.f(7, this, z10)), er.h, 320L);
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
        }
        if (i10 < 0) {
            j3Var.a(false, z11);
        } else {
            j3Var.a(true, z11);
            j3Var.setNum(i10);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f16306x = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.f16303r, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f16306x = staticLayout;
            this.f16307y = staticLayout.getLineCount() > 0 ? this.f16306x.getLineWidth(0) : 0.0f;
            this.A = this.f16306x.getLineCount() > 0 ? this.f16306x.getLineLeft(0) : 0.0f;
        }
        this.f16305w = true;
    }

    public final void h() {
        Bitmap bitmap;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.f16297a) != null) {
            float fMax = ((float) bitmap.getHeight()) / ((float) this.f16297a.getWidth()) > this.G - 0.1f ? Math.max(getMeasuredWidth() / this.f16297a.getWidth(), getMeasuredHeight() / this.f16297a.getHeight()) : getMeasuredWidth() / this.f16297a.getWidth();
            Matrix matrix = this.f16301f;
            matrix.reset();
            matrix.postScale(fMax, fMax);
            matrix.postTranslate(com.google.android.recaptcha.internal.a.w(fMax, this.f16297a.getWidth(), getMeasuredWidth(), 2.0f), com.google.android.recaptcha.internal.a.w(fMax, this.f16297a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.f16300e;
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
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.E;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        } else {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            j3 j3Var = this.F;
            accessibilityNodeInfo.setChecked(j3Var != null && j3Var.f27188a.f26309q);
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
        h3 h3Var;
        h3 h3Var2;
        if (i10 == 16 && (h3Var2 = this.I) != null) {
            h3Var2.run();
            return true;
        }
        if (i10 != 32 || (h3Var = this.J) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        h3Var.run();
        return true;
    }
}
