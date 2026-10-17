package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;
public final class k4 extends View {
    public final org.telegram.ui.Components.f6 E;
    public final ImageReceiver f9304a;
    public final Paint f9305b;
    public final Paint f9306c;
    public final org.telegram.ui.Components.p6 d;
    public boolean e;
    public boolean f9307f;
    public View.OnClickListener h;
    public final yc f9308n;
    public int f9309r;
    public String f9310s;
    public float v;
    public float f9311w;
    public float f9312x;
    public final org.telegram.ui.Components.f6 f9313y;

    public k4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f9304a = imageReceiver;
        Paint paint = new Paint(1);
        this.f9305b = paint;
        Paint paint2 = new Paint(1);
        this.f9306c = paint2;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false);
        this.d = p6Var;
        this.f9308n = new yc(this);
        this.f9309r = -1;
        bs bsVar = bs.h;
        this.f9313y = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        this.E = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        p6Var.setCallback(this);
        p6Var.u(-1);
        p6Var.f29192b = 17;
        p6Var.w(AndroidUtilities.dp(16.0f));
        p6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.n(0.65f, 480L, bsVar);
        p6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        w7.b6.a(this);
    }

    public final void a(int i10, int i11, final a8 a8Var) {
        String str;
        Uri withAppendedId;
        if (this.f9309r != i10) {
            this.f9310s = null;
            this.f9304a.clearImage();
            this.f9309r = i10;
        }
        this.d.t(Integer.toString(i11 + 1), false, true);
        File file = a8Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f9310s, file.getPath())) {
                this.f9310s = a8Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final k4 f9155b;

                    {
                        this.f9155b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                a8 a8Var2 = a8Var;
                                BitmapFactory.decodeFile(a8Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                a8.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(a8Var2.O0.getPath(), options);
                                final k4 k4Var = this.f9155b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k4Var.f9304a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                k4Var.f9304a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                a8 a8Var3 = a8Var;
                                BitmapFactory.decodeFile(a8Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                a8.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(a8Var3.L.getPath(), options2);
                                final k4 k4Var2 = this.f9155b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k4Var2.f9304a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                k4Var2.f9304a.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (a8Var.K) {
            Bitmap bitmap = a8Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = a8Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f9310s, a8Var.N)) {
                    String str2 = a8Var.N;
                    this.f9310s = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (a8Var.K) {
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
            this.f9304a.setImageBitmap(bitmap);
        } else {
            File file2 = a8Var.L;
            if (file2 != null && !TextUtils.equals(this.f9310s, file2.getPath())) {
                this.f9310s = a8Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final k4 f9155b;

                    {
                        this.f9155b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                a8 a8Var2 = a8Var;
                                BitmapFactory.decodeFile(a8Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                a8.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(a8Var2.O0.getPath(), options);
                                final k4 k4Var = this.f9155b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k4Var.f9304a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                k4Var.f9304a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                a8 a8Var3 = a8Var;
                                BitmapFactory.decodeFile(a8Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                a8.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(a8Var3.L.getPath(), options2);
                                final k4 k4Var2 = this.f9155b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k4Var2.f9304a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                k4Var2.f9304a.setImageBitmap(decodeFile2);
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
            this.f9313y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f9304a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f9305b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e = this.f9313y.e(this.e);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f9311w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f9312x = AndroidUtilities.dp(12.833f);
        float e7 = this.E.e(this.f9307f);
        float a2 = this.f9308n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f9311w);
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f9306c;
            paint2.setAlpha((int) (e7 * 255.0f));
            canvas.drawCircle(this.v, this.f9311w, this.f9312x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f9311w, this.f9312x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.v;
            float f10 = this.f9312x;
            float f11 = f7 - f10;
            float f12 = this.f9311w;
            float f13 = f7 + f10;
            org.telegram.ui.Components.p6 p6Var = this.d;
            p6Var.o(f11, f12, f13, f12);
            p6Var.B = (int) (e7 * 255.0f);
            p6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9304a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9304a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f9311w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f9311w + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        yc ycVar = this.f9308n;
        if (action == 0) {
            ycVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.f32606i && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            ycVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
        }
        if (ycVar.f32606i || super.onTouchEvent(motionEvent)) {
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
