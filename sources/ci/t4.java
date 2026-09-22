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
import org.telegram.ui.Components.qr;
public final class t4 extends View {
    public final org.telegram.ui.Components.c6 E;
    public final ImageReceiver f5555a;
    public final Paint f5556b;
    public final Paint f5557c;
    public final org.telegram.ui.Components.m6 d;
    public boolean e;
    public boolean f5558f;
    public View.OnClickListener h;
    public final org.telegram.ui.Components.wc f5559n;
    public int f5560r;
    public String f5561s;
    public float v;
    public float f5562w;
    public float f5563x;
    public final org.telegram.ui.Components.c6 f5564y;

    public t4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5555a = imageReceiver;
        Paint paint = new Paint(1);
        this.f5556b = paint;
        Paint paint2 = new Paint(1);
        this.f5557c = paint2;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false, false);
        this.d = m6Var;
        this.f5559n = new org.telegram.ui.Components.wc(this);
        this.f5560r = -1;
        qr qrVar = qr.h;
        this.f5564y = new org.telegram.ui.Components.c6(this, 0L, 320L, qrVar);
        this.E = new org.telegram.ui.Components.c6(this, 0L, 320L, qrVar);
        m6Var.setCallback(this);
        m6Var.r(-1);
        m6Var.f26085b = 17;
        m6Var.t(AndroidUtilities.dp(16.0f));
        m6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        m6Var.G = AndroidUtilities.displaySize.x;
        m6Var.k(0.65f, 480L, qrVar);
        m6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        w7.z5.a(this);
    }

    public final void a(int i10, int i11, final o8 o8Var) {
        String str;
        Uri withAppendedId;
        if (this.f5560r != i10) {
            this.f5561s = null;
            this.f5555a.clearImage();
            this.f5560r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = o8Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f5561s, file.getPath())) {
                this.f5561s = o8Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final t4 f5340b;

                    {
                        this.f5340b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                o8 o8Var2 = o8Var;
                                BitmapFactory.decodeFile(o8Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                o8.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(o8Var2.O0.getPath(), options);
                                final t4 t4Var = this.f5340b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                t4Var.f5555a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                t4Var.f5555a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                o8 o8Var3 = o8Var;
                                BitmapFactory.decodeFile(o8Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                o8.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(o8Var3.L.getPath(), options2);
                                final t4 t4Var2 = this.f5340b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                t4Var2.f5555a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                t4Var2.f5555a.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (o8Var.K) {
            Bitmap bitmap = o8Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = o8Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f5561s, o8Var.N)) {
                    String str2 = o8Var.N;
                    this.f5561s = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (o8Var.K) {
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
            this.f5555a.setImageBitmap(bitmap);
        } else {
            File file2 = o8Var.L;
            if (file2 != null && !TextUtils.equals(this.f5561s, file2.getPath())) {
                this.f5561s = o8Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final t4 f5340b;

                    {
                        this.f5340b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                o8 o8Var2 = o8Var;
                                BitmapFactory.decodeFile(o8Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                o8.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(o8Var2.O0.getPath(), options);
                                final t4 t4Var = this.f5340b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                t4Var.f5555a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                t4Var.f5555a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                o8 o8Var3 = o8Var;
                                BitmapFactory.decodeFile(o8Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                o8.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(o8Var3.L.getPath(), options2);
                                final t4 t4Var2 = this.f5340b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                t4Var2.f5555a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                t4Var2.f5555a.setImageBitmap(decodeFile2);
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
            this.f5564y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f5555a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f5556b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e = this.f5564y.e(this.e);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f5562w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f5563x = AndroidUtilities.dp(12.833f);
        float e7 = this.E.e(this.f5558f);
        float a2 = this.f5559n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f5562w);
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f5557c;
            paint2.setAlpha((int) (e7 * 255.0f));
            canvas.drawCircle(this.v, this.f5562w, this.f5563x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f5562w, this.f5563x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.v;
            float f10 = this.f5563x;
            float f11 = f7 - f10;
            float f12 = this.f5562w;
            float f13 = f7 + f10;
            org.telegram.ui.Components.m6 m6Var = this.d;
            m6Var.l(f11, f12, f13, f12);
            m6Var.f26102w = (int) (e7 * 255.0f);
            m6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5555a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5555a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f5562w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f5562w + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Components.wc wcVar = this.f5559n;
        if (action == 0) {
            wcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (wcVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            wcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            wcVar.c(false);
        }
        if (wcVar.h || super.onTouchEvent(motionEvent)) {
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
