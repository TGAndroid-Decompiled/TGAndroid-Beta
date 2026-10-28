package fi;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.xc;
public final class j4 extends View implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.h6 E;
    public final org.telegram.ui.Components.h6 F;
    public final org.telegram.ui.ActionBar.u6 f11044a;
    public final ImageReceiver f11045b;
    public final Paint f11046c;
    public final Paint d;
    public final org.telegram.ui.Components.r6 e;
    public boolean f11047f;
    public boolean h;
    public View.OnClickListener f11048n;
    public final xc f11049r;
    public int f11050s;
    public String v;
    public float f11051w;
    public float f11052x;
    public float f11053y;

    public j4(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f11045b = imageReceiver;
        Paint paint = new Paint(1);
        this.f11046c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, false, false);
        this.e = r6Var;
        this.f11049r = new xc(this);
        this.f11050s = -1;
        ds dsVar = ds.h;
        this.E = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.F = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        r6Var.setCallback(this);
        r6Var.u(-1);
        r6Var.f32142b = 17;
        r6Var.w(AndroidUtilities.dp(16.0f));
        r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.n(0.65f, 480L, dsVar);
        r6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.f11044a = u6Var;
        paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        kb1.b(this);
    }

    public final void a(int i10, int i11, final w7 w7Var) {
        String str;
        Uri withAppendedId;
        if (this.f11050s != i10) {
            this.v = null;
            this.f11045b.clearImage();
            this.f11050s = i10;
        }
        this.e.t(Integer.toString(i11 + 1), false, true);
        File file = w7Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.v, file.getPath())) {
                this.v = w7Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final j4 f10900b;

                    {
                        this.f10900b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                w7 w7Var2 = w7Var;
                                BitmapFactory.decodeFile(w7Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                w7.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(w7Var2.O0.getPath(), options);
                                final j4 j4Var = this.f10900b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                j4Var.f11045b.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                j4Var.f11045b.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                w7 w7Var3 = w7Var;
                                BitmapFactory.decodeFile(w7Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                w7.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(w7Var3.L.getPath(), options2);
                                final j4 j4Var2 = this.f10900b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                j4Var2.f11045b.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                j4Var2.f11045b.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (w7Var.K) {
            Bitmap bitmap = w7Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = w7Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.v, w7Var.N)) {
                    String str2 = w7Var.N;
                    this.v = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (w7Var.K) {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong);
                            } else {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong);
                            }
                            bitmap = getContext().getContentResolver().loadThumbnail(withAppendedId, new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    return;
                }
            }
            this.f11045b.setImageBitmap(bitmap);
        } else {
            File file2 = w7Var.L;
            if (file2 != null && !TextUtils.equals(this.v, file2.getPath())) {
                this.v = w7Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final j4 f10900b;

                    {
                        this.f10900b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                w7 w7Var2 = w7Var;
                                BitmapFactory.decodeFile(w7Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                w7.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(w7Var2.O0.getPath(), options);
                                final j4 j4Var = this.f10900b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                j4Var.f11045b.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                j4Var.f11045b.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                w7 w7Var3 = w7Var;
                                BitmapFactory.decodeFile(w7Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                w7.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(w7Var3.L.getPath(), options2);
                                final j4 j4Var2 = this.f10900b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                j4Var2.f11045b.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                j4Var2.f11045b.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f11047f == z10) {
            return;
        }
        this.f11047f = z10;
        if (!z11) {
            this.E.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f11045b;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f11046c;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e = this.E.e(this.f11047f);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.f11051w = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f11052x = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f11053y = AndroidUtilities.dp(12.833f);
        float e10 = this.F.e(this.h);
        float a2 = this.f11049r.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.f11051w, this.f11052x);
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawCircle(this.f11051w, this.f11052x, this.f11053y, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.f11051w, this.f11052x, this.f11053y - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.f11051w;
            float f10 = this.f11053y;
            float f11 = f7 - f10;
            float f12 = this.f11052x;
            float f13 = f7 + f10;
            org.telegram.ui.Components.r6 r6Var = this.e;
            r6Var.o(f11, f12, f13, f12);
            r6Var.B = (int) (e10 * 255.0f);
            r6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11045b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11045b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.f11051w - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.f11051w + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f11052x - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f11052x + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        xc xcVar = this.f11049r;
        if (action == 0) {
            xcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (xcVar.f34725i && z10 && (onClickListener = this.f11048n) != null) {
                onClickListener.onClick(this);
            }
            xcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            xcVar.c(false);
        }
        if (xcVar.f34725i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.f11048n = onClickListener;
    }

    public void setPosition(int i10) {
        String num;
        if (i10 < 0) {
            num = "";
        } else {
            num = Integer.toString(i10 + 1);
        }
        this.e.t(num, true, true);
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f11044a));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
