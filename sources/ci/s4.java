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
import org.telegram.ui.Components.sr;
public final class s4 extends View {
    public final org.telegram.ui.Components.e6 E;
    public final ImageReceiver f5483a;
    public final Paint f5484b;
    public final Paint f5485c;
    public final org.telegram.ui.Components.o6 d;
    public boolean e;
    public boolean f5486f;
    public View.OnClickListener h;
    public final org.telegram.ui.Components.yc f5487n;
    public int f5488r;
    public String f5489s;
    public float v;
    public float f5490w;
    public float f5491x;
    public final org.telegram.ui.Components.e6 f5492y;

    public s4(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5483a = imageReceiver;
        Paint paint = new Paint(1);
        this.f5484b = paint;
        Paint paint2 = new Paint(1);
        this.f5485c = paint2;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, false, false, false);
        this.d = o6Var;
        this.f5487n = new org.telegram.ui.Components.yc(this);
        this.f5488r = -1;
        sr srVar = sr.h;
        this.f5492y = new org.telegram.ui.Components.e6(this, 0L, 320L, srVar);
        this.E = new org.telegram.ui.Components.e6(this, 0L, 320L, srVar);
        o6Var.setCallback(this);
        o6Var.r(-1);
        o6Var.f26962b = 17;
        o6Var.t(AndroidUtilities.dp(16.0f));
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.k(0.65f, 480L, srVar);
        o6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        w7.a6.a(this);
    }

    public final void a(int i10, int i11, final l8 l8Var) {
        String str;
        Uri withAppendedId;
        if (this.f5488r != i10) {
            this.f5489s = null;
            this.f5483a.clearImage();
            this.f5488r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = l8Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f5489s, file.getPath())) {
                this.f5489s = l8Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final s4 f5293b;

                    {
                        this.f5293b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                l8 l8Var2 = l8Var;
                                BitmapFactory.decodeFile(l8Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                l8.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(l8Var2.O0.getPath(), options);
                                final s4 s4Var = this.f5293b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                s4Var.f5483a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                s4Var.f5483a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                l8 l8Var3 = l8Var;
                                BitmapFactory.decodeFile(l8Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                l8.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(l8Var3.L.getPath(), options2);
                                final s4 s4Var2 = this.f5293b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                s4Var2.f5483a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                s4Var2.f5483a.setImageBitmap(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (l8Var.K) {
            Bitmap bitmap = l8Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = l8Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f5489s, l8Var.N)) {
                    String str2 = l8Var.N;
                    this.f5489s = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (l8Var.K) {
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
            this.f5483a.setImageBitmap(bitmap);
        } else {
            File file2 = l8Var.L;
            if (file2 != null && !TextUtils.equals(this.f5489s, file2.getPath())) {
                this.f5489s = l8Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final s4 f5293b;

                    {
                        this.f5293b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                l8 l8Var2 = l8Var;
                                BitmapFactory.decodeFile(l8Var2.O0.getPath(), options);
                                int dp = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                l8.C(options, dp);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(l8Var2.O0.getPath(), options);
                                final s4 s4Var = this.f5293b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                s4Var.f5483a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                s4Var.f5483a.setImageBitmap(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                l8 l8Var3 = l8Var;
                                BitmapFactory.decodeFile(l8Var3.L.getPath(), options2);
                                int dp2 = AndroidUtilities.dp(94.0f);
                                AndroidUtilities.dp(112.0f);
                                l8.C(options2, dp2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(l8Var3.L.getPath(), options2);
                                final s4 s4Var2 = this.f5293b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                s4Var2.f5483a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                s4Var2.f5483a.setImageBitmap(decodeFile2);
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
            this.f5492y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f5483a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f5484b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e = this.f5492y.e(this.e);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f5490w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f5491x = AndroidUtilities.dp(12.833f);
        float e7 = this.E.e(this.f5486f);
        float a2 = this.f5487n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f5490w);
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint2 = this.f5485c;
            paint2.setAlpha((int) (e7 * 255.0f));
            canvas.drawCircle(this.v, this.f5490w, this.f5491x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f5490w, this.f5491x - AndroidUtilities.dp(1.0f), paint);
        if (i10 > 0) {
            float f7 = this.v;
            float f10 = this.f5491x;
            float f11 = f7 - f10;
            float f12 = this.f5490w;
            float f13 = f7 + f10;
            org.telegram.ui.Components.o6 o6Var = this.d;
            o6Var.l(f11, f12, f13, f12);
            o6Var.f26979w = (int) (e7 * 255.0f);
            o6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5483a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5483a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f5490w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f5490w + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Components.yc ycVar = this.f5487n;
        if (action == 0) {
            ycVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            ycVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
        }
        if (ycVar.h || super.onTouchEvent(motionEvent)) {
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
