package ci;

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
import org.telegram.ui.Components.tr;
public final class s4 extends View {
    public final org.telegram.ui.Components.e6 E;
    public final ImageReceiver f5903a;
    public final Paint f5904b;
    public final Paint f5905c;
    public final org.telegram.ui.Components.o6 d;
    public boolean f5906e;
    public boolean f5907f;
    public View.OnClickListener h;
    public final org.telegram.ui.Components.zc f5908n;
    public int f5909r;
    public String f5910s;
    public float v;
    public float f5911w;
    public float f5912x;
    public final org.telegram.ui.Components.e6 f5913y;

    public s4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5903a = imageReceiver;
        Paint paint = new Paint(1);
        this.f5904b = paint;
        Paint paint2 = new Paint(1);
        this.f5905c = paint2;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, false, false, false);
        this.d = o6Var;
        this.f5908n = new org.telegram.ui.Components.zc(this);
        this.f5909r = -1;
        tr trVar = tr.h;
        this.f5913y = new org.telegram.ui.Components.e6(this, 0L, 320L, trVar);
        this.E = new org.telegram.ui.Components.e6(this, 0L, 320L, trVar);
        o6Var.setCallback(this);
        o6Var.r(-1);
        o6Var.f29354b = 17;
        o6Var.t(AndroidUtilities.dp(16.0f));
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.k(0.65f, 480L, trVar);
        o6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        w7.b6.a(this);
    }

    public final void a(int i10, int i11, final k8 k8Var) {
        String str;
        Uri withAppendedId;
        if (this.f5909r != i10) {
            this.f5910s = null;
            this.f5903a.clearImage();
            this.f5909r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = k8Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f5910s, file.getPath())) {
                this.f5910s = k8Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final s4 f5700b;

                    {
                        this.f5700b = this;
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
                                final s4 s4Var = this.f5700b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                s4Var.f5903a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                s4Var.f5903a.setImageBitmap(decodeFile);
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
                                final s4 s4Var2 = this.f5700b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                s4Var2.f5903a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                s4Var2.f5903a.setImageBitmap(decodeFile2);
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
                if (!TextUtils.equals(this.f5910s, k8Var.N)) {
                    String str2 = k8Var.N;
                    this.f5910s = str2;
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
            this.f5903a.setImageBitmap(bitmap);
        } else {
            File file2 = k8Var.L;
            if (file2 != null && !TextUtils.equals(this.f5910s, file2.getPath())) {
                this.f5910s = k8Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final s4 f5700b;

                    {
                        this.f5700b = this;
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
                                final s4 s4Var = this.f5700b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                s4Var.f5903a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                s4Var.f5903a.setImageBitmap(decodeFile);
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
                                final s4 s4Var2 = this.f5700b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                s4Var2.f5903a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                s4Var2.f5903a.setImageBitmap(decodeFile2);
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
        if (this.f5906e == z10) {
            return;
        }
        this.f5906e = z10;
        if (!z11) {
            this.f5913y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f5903a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f5904b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e7 = this.f5913y.e(this.f5906e);
        if (e7 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e7 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f5911w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f5912x = AndroidUtilities.dp(12.833f);
        float e10 = this.E.e(this.f5907f);
        float a2 = this.f5908n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f5911w);
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f5905c;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawCircle(this.v, this.f5911w, this.f5912x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f5911w, this.f5912x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.v;
            float f10 = this.f5912x;
            float f11 = f7 - f10;
            float f12 = this.f5911w;
            float f13 = f7 + f10;
            org.telegram.ui.Components.o6 o6Var = this.d;
            o6Var.l(f11, f12, f13, f12);
            o6Var.f29372w = (int) (e10 * 255.0f);
            o6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5903a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5903a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f5911w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f5911w + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Components.zc zcVar = this.f5908n;
        if (action == 0) {
            zcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (zcVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            zcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            zcVar.c(false);
        }
        if (zcVar.h || super.onTouchEvent(motionEvent)) {
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
        this.d.q(num, true, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
