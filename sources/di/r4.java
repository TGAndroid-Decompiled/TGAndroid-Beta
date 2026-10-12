package di;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.es;
public final class r4 extends View {
    public final org.telegram.ui.Components.g6 E;
    public final ImageReceiver f7699a;
    public final Paint f7700b;
    public final Paint f7701c;
    public final org.telegram.ui.Components.r6 d;
    public boolean e;
    public boolean f7702f;
    public View.OnClickListener h;
    public final org.telegram.ui.Components.ad f7703n;
    public int f7704r;
    public String f7705s;
    public float v;
    public float f7706w;
    public float f7707x;
    public final org.telegram.ui.Components.g6 f7708y;

    public r4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f7699a = imageReceiver;
        Paint paint = new Paint(1);
        this.f7700b = paint;
        Paint paint2 = new Paint(1);
        this.f7701c = paint2;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, false, false);
        this.d = r6Var;
        this.f7703n = new org.telegram.ui.Components.ad(this);
        this.f7704r = -1;
        es esVar = es.h;
        this.f7708y = new org.telegram.ui.Components.g6(this, 0L, 320L, esVar);
        this.E = new org.telegram.ui.Components.g6(this, 0L, 320L, esVar);
        r6Var.setCallback(this);
        r6Var.u(-1);
        r6Var.f28748b = 17;
        r6Var.w(AndroidUtilities.dp(16.0f));
        r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.n(0.65f, 480L, esVar);
        r6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        w7.c6.a(this);
    }

    public final void a(int i10, int i11, final k8 k8Var) {
        String str;
        Uri withAppendedId;
        if (this.f7704r != i10) {
            this.f7705s = null;
            this.f7699a.clearImage();
            this.f7704r = i10;
        }
        this.d.t(Integer.toString(i11 + 1), false, true);
        File file = k8Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f7705s, file.getPath())) {
                this.f7705s = k8Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final r4 f7509b;

                    {
                        this.f7509b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                k8 k8Var2 = k8Var;
                                BitmapFactory.decodeFile(k8Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                k8.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(k8Var2.O0.getPath(), options);
                                final r4 r4Var = this.f7509b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                r4Var.f7699a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                r4Var.f7699a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                k8 k8Var3 = k8Var;
                                BitmapFactory.decodeFile(k8Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                k8.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(k8Var3.L.getPath(), options2);
                                final r4 r4Var2 = this.f7509b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                r4Var2.f7699a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                r4Var2.f7699a.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (k8Var.K) {
            Bitmap bitmap = k8Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = k8Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f7705s, k8Var.N)) {
                    String str2 = k8Var.N;
                    this.f7705s = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (k8Var.K) {
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
            this.f7699a.setImageBitmap(bitmap);
        } else {
            File file2 = k8Var.L;
            if (file2 != null && !TextUtils.equals(this.f7705s, file2.getPath())) {
                this.f7705s = k8Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final r4 f7509b;

                    {
                        this.f7509b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                k8 k8Var2 = k8Var;
                                BitmapFactory.decodeFile(k8Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                k8.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(k8Var2.O0.getPath(), options);
                                final r4 r4Var = this.f7509b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                r4Var.f7699a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                r4Var.f7699a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                k8 k8Var3 = k8Var;
                                BitmapFactory.decodeFile(k8Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                k8.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(k8Var3.L.getPath(), options2);
                                final r4 r4Var2 = this.f7509b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                r4Var2.f7699a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                r4Var2.f7699a.setImageBitmap(decodeFile2);
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
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        if (!z11) {
            this.f7708y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f7699a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f7700b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e = this.f7708y.e(this.e);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f7706w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f7707x = AndroidUtilities.dp(12.833f);
        float e7 = this.E.e(this.f7702f);
        float a2 = this.f7703n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f7706w);
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f7701c;
            paint2.setAlpha((int) (e7 * 255.0f));
            canvas.drawCircle(this.v, this.f7706w, this.f7707x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f7706w, this.f7707x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.v;
            float f10 = this.f7707x;
            float f11 = f7 - f10;
            float f12 = this.f7706w;
            float f13 = f7 + f10;
            org.telegram.ui.Components.r6 r6Var = this.d;
            r6Var.o(f11, f12, f13, f12);
            r6Var.B = (int) (e7 * 255.0f);
            r6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7699a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7699a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f7706w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f7706w + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Components.ad adVar = this.f7703n;
        if (action == 0) {
            adVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (adVar.f23522i && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            adVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            adVar.c(false);
        }
        if (adVar.f23522i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setPosition(int i10) {
        String num;
        if (i10 < 0) {
            num = "";
        } else {
            num = Integer.toString(i10 + 1);
        }
        this.d.t(num, true, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
