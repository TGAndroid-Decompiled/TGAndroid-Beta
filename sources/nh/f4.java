package nh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
public final class f4 extends View {
    public final org.telegram.ui.Components.d6 A;
    public final ImageReceiver f17632a;
    public final Paint f17633b;
    public final Paint f17634c;
    public final org.telegram.ui.Components.n6 d;
    public boolean f17635e;
    public boolean f17636f;
    public View.OnClickListener h;
    public final uc f17637n;
    public int f17638r;
    public String f17639s;
    public float v;
    public float f17640w;
    public float f17641x;
    public final org.telegram.ui.Components.d6 f17642y;

    public f4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f17632a = imageReceiver;
        Paint paint = new Paint(1);
        this.f17633b = paint;
        Paint paint2 = new Paint(1);
        this.f17634c = paint2;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.d = n6Var;
        this.f17637n = new uc(this);
        this.f17638r = -1;
        jr jrVar = jr.h;
        this.f17642y = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.A = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        n6Var.setCallback(this);
        n6Var.r(-1);
        n6Var.f30862b = 17;
        n6Var.t(AndroidUtilities.dp(16.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.k(0.65f, 480L, jrVar);
        n6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        i7.h6.a(this);
    }

    public final void a(int i10, int i11, final o7 o7Var) {
        String str;
        Uri withAppendedId;
        if (this.f17638r != i10) {
            this.f17639s = null;
            this.f17632a.clearImage();
            this.f17638r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = o7Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f17639s, file.getPath())) {
                this.f17639s = o7Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final f4 f17472b;

                    {
                        this.f17472b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                o7 o7Var2 = o7Var;
                                BitmapFactory.decodeFile(o7Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                o7.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(o7Var2.O0.getPath(), options);
                                final f4 f4Var = this.f17472b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f4Var.f17632a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                f4Var.f17632a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                o7 o7Var3 = o7Var;
                                BitmapFactory.decodeFile(o7Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                o7.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(o7Var3.L.getPath(), options2);
                                final f4 f4Var2 = this.f17472b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f4Var2.f17632a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                f4Var2.f17632a.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (o7Var.K) {
            Bitmap bitmap = o7Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = o7Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f17639s, o7Var.N)) {
                    String str2 = o7Var.N;
                    this.f17639s = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (o7Var.K) {
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
            this.f17632a.setImageBitmap(bitmap);
        } else {
            File file2 = o7Var.L;
            if (file2 != null && !TextUtils.equals(this.f17639s, file2.getPath())) {
                this.f17639s = o7Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final f4 f17472b;

                    {
                        this.f17472b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                o7 o7Var2 = o7Var;
                                BitmapFactory.decodeFile(o7Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                o7.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(o7Var2.O0.getPath(), options);
                                final f4 f4Var = this.f17472b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f4Var.f17632a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                f4Var.f17632a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                o7 o7Var3 = o7Var;
                                BitmapFactory.decodeFile(o7Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                o7.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(o7Var3.L.getPath(), options2);
                                final f4 f4Var2 = this.f17472b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f4Var2.f17632a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                f4Var2.f17632a.setImageBitmap(decodeFile2);
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
        if (this.f17635e == z10) {
            return;
        }
        this.f17635e = z10;
        if (!z11) {
            this.f17642y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f17632a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f17633b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e10 = this.f17642y.e(this.f17635e);
        if (e10 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f17640w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f17641x = AndroidUtilities.dp(12.833f);
        float e11 = this.A.e(this.f17636f);
        float a2 = this.f17637n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f17640w);
        int i10 = (e11 > 0.0f ? 1 : (e11 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f17634c;
            paint2.setAlpha((int) (e11 * 255.0f));
            canvas.drawCircle(this.v, this.f17640w, this.f17641x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f17640w, this.f17641x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f9 = this.v;
            float f10 = this.f17641x;
            float f11 = f9 - f10;
            float f12 = this.f17640w;
            float f13 = f9 + f10;
            org.telegram.ui.Components.n6 n6Var = this.d;
            n6Var.l(f11, f12, f13, f12);
            n6Var.f30880w = (int) (e11 * 255.0f);
            n6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17632a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17632a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f17640w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f17640w + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        uc ucVar = this.f17637n;
        if (action == 0) {
            ucVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (ucVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            ucVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
        }
        if (ucVar.h || super.onTouchEvent(motionEvent)) {
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
