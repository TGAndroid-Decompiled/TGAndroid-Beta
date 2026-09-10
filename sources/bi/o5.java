package bi;

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
import org.telegram.ui.Components.wr;
public final class o5 extends View {
    public final org.telegram.ui.Components.d6 E;
    public final ImageReceiver f3310a;
    public final Paint f3311b;
    public final Paint f3312c;
    public final org.telegram.ui.Components.n6 d;
    public boolean e;
    public boolean f3313f;
    public View.OnClickListener h;
    public final org.telegram.ui.Components.xc f3314n;
    public int f3315r;
    public String f3316s;
    public float v;
    public float f3317w;
    public float f3318x;
    public final org.telegram.ui.Components.d6 f3319y;

    public o5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f3310a = imageReceiver;
        Paint paint = new Paint(1);
        this.f3311b = paint;
        Paint paint2 = new Paint(1);
        this.f3312c = paint2;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.d = n6Var;
        this.f3314n = new org.telegram.ui.Components.xc(this);
        this.f3315r = -1;
        wr wrVar = wr.h;
        this.f3319y = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.E = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        n6Var.setCallback(this);
        n6Var.r(-1);
        n6Var.f25425b = 17;
        n6Var.t(AndroidUtilities.dp(16.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.k(0.65f, 480L, wrVar);
        n6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        w7.c6.a(this);
    }

    public final void a(int i10, int i11, final r9 r9Var) {
        String str;
        Uri withAppendedId;
        if (this.f3315r != i10) {
            this.f3316s = null;
            this.f3310a.clearImage();
            this.f3315r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = r9Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f3316s, file.getPath())) {
                this.f3316s = r9Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final o5 f3038b;

                    {
                        this.f3038b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                r9 r9Var2 = r9Var;
                                BitmapFactory.decodeFile(r9Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                r9.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(r9Var2.O0.getPath(), options);
                                final o5 o5Var = this.f3038b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                o5Var.f3310a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                o5Var.f3310a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                r9 r9Var3 = r9Var;
                                BitmapFactory.decodeFile(r9Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                r9.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(r9Var3.L.getPath(), options2);
                                final o5 o5Var2 = this.f3038b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                o5Var2.f3310a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                o5Var2.f3310a.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (r9Var.K) {
            Bitmap bitmap = r9Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = r9Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f3316s, r9Var.N)) {
                    String str2 = r9Var.N;
                    this.f3316s = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (r9Var.K) {
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
            this.f3310a.setImageBitmap(bitmap);
        } else {
            File file2 = r9Var.L;
            if (file2 != null && !TextUtils.equals(this.f3316s, file2.getPath())) {
                this.f3316s = r9Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final o5 f3038b;

                    {
                        this.f3038b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                r9 r9Var2 = r9Var;
                                BitmapFactory.decodeFile(r9Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                r9.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(r9Var2.O0.getPath(), options);
                                final o5 o5Var = this.f3038b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                o5Var.f3310a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                o5Var.f3310a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                r9 r9Var3 = r9Var;
                                BitmapFactory.decodeFile(r9Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                r9.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(r9Var3.L.getPath(), options2);
                                final o5 o5Var2 = this.f3038b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                o5Var2.f3310a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                o5Var2.f3310a.setImageBitmap(decodeFile2);
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
            this.f3319y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f3310a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f3311b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e = this.f3319y.e(this.e);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f3317w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f3318x = AndroidUtilities.dp(12.833f);
        float e7 = this.E.e(this.f3313f);
        float a2 = this.f3314n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f3317w);
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f3312c;
            paint2.setAlpha((int) (e7 * 255.0f));
            canvas.drawCircle(this.v, this.f3317w, this.f3318x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f3317w, this.f3318x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.v;
            float f10 = this.f3318x;
            float f11 = f7 - f10;
            float f12 = this.f3317w;
            float f13 = f7 + f10;
            org.telegram.ui.Components.n6 n6Var = this.d;
            n6Var.l(f11, f12, f13, f12);
            n6Var.f25442w = (int) (e7 * 255.0f);
            n6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3310a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3310a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f3317w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f3317w + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Components.xc xcVar = this.f3314n;
        if (action == 0) {
            xcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (xcVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            xcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            xcVar.c(false);
        }
        if (xcVar.h || super.onTouchEvent(motionEvent)) {
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
