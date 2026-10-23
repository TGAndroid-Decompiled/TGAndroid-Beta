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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;
public final class k4 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.f6 E;
    public final org.telegram.ui.Components.f6 F;
    public final org.telegram.ui.ActionBar.g6 f9313a;
    public final ImageReceiver f9314b;
    public final Paint f9315c;
    public final Paint d;
    public final org.telegram.ui.Components.p6 e;
    public boolean f9316f;
    public boolean h;
    public View.OnClickListener f9317n;
    public final yc f9318r;
    public int f9319s;
    public String v;
    public float f9320w;
    public float f9321x;
    public float f9322y;

    public k4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f9314b = imageReceiver;
        Paint paint = new Paint(1);
        this.f9315c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false);
        this.e = p6Var;
        this.f9318r = new yc(this);
        this.f9319s = -1;
        bs bsVar = bs.h;
        this.E = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        this.F = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        p6Var.setCallback(this);
        p6Var.u(-1);
        p6Var.f29437b = 17;
        p6Var.w(AndroidUtilities.dp(16.0f));
        p6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.n(0.65f, 480L, bsVar);
        p6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.f9313a = g6Var;
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        w7.b6.a(this);
    }

    public final void a(int i10, int i11, final a8 a8Var) {
        String str;
        Uri withAppendedId;
        if (this.f9319s != i10) {
            this.v = null;
            this.f9314b.clearImage();
            this.f9319s = i10;
        }
        this.e.t(Integer.toString(i11 + 1), false, true);
        File file = a8Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.v, file.getPath())) {
                this.v = a8Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final k4 f9164b;

                    {
                        this.f9164b = this;
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
                                final k4 k4Var = this.f9164b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k4Var.f9314b.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                k4Var.f9314b.setImageBitmap(decodeFile);
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
                                final k4 k4Var2 = this.f9164b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k4Var2.f9314b.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                k4Var2.f9314b.setImageBitmap(decodeFile2);
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
                if (!TextUtils.equals(this.v, a8Var.N)) {
                    String str2 = a8Var.N;
                    this.v = str2;
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
            this.f9314b.setImageBitmap(bitmap);
        } else {
            File file2 = a8Var.L;
            if (file2 != null && !TextUtils.equals(this.v, file2.getPath())) {
                this.v = a8Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final k4 f9164b;

                    {
                        this.f9164b = this;
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
                                final k4 k4Var = this.f9164b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k4Var.f9314b.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                k4Var.f9314b.setImageBitmap(decodeFile);
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
                                final k4 k4Var2 = this.f9164b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k4Var2.f9314b.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                k4Var2.f9314b.setImageBitmap(decodeFile2);
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
        if (this.f9316f == z10) {
            return;
        }
        this.f9316f = z10;
        if (!z11) {
            this.E.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f9314b;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f9315c;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e = this.E.e(this.f9316f);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.f9320w = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f9321x = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f9322y = AndroidUtilities.dp(12.833f);
        float e7 = this.F.e(this.h);
        float a2 = this.f9318r.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.f9320w, this.f9321x);
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (e7 * 255.0f));
            canvas.drawCircle(this.f9320w, this.f9321x, this.f9322y, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.f9320w, this.f9321x, this.f9322y - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.f9320w;
            float f10 = this.f9322y;
            float f11 = f7 - f10;
            float f12 = this.f9321x;
            float f13 = f7 + f10;
            org.telegram.ui.Components.p6 p6Var = this.e;
            p6Var.o(f11, f12, f13, f12);
            p6Var.B = (int) (e7 * 255.0f);
            p6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9314b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9314b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.f9320w - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.f9320w + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f9321x - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f9321x + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        yc ycVar = this.f9318r;
        if (action == 0) {
            ycVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.f32872i && z10 && (onClickListener = this.f9317n) != null) {
                onClickListener.onClick(this);
            }
            ycVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
        }
        if (ycVar.f32872i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.f9317n = onClickListener;
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
            this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.f9313a));
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
