package lh;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.Components.er;

public final class j4 extends View {
    public final org.telegram.ui.Components.y5 A;

    public final ImageReceiver f16174a;

    public final Paint f16175b;

    public final Paint f16176c;
    public final org.telegram.ui.Components.i6 d;

    public boolean f16177e;

    public boolean f16178f;
    public View.OnClickListener h;

    public final org.telegram.ui.Components.nc f16179n;

    public int f16180r;

    public String f16181s;
    public float v;

    public float f16182w;

    public float f16183x;

    public final org.telegram.ui.Components.y5 f16184y;

    public j4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f16174a = imageReceiver;
        Paint paint = new Paint(1);
        this.f16175b = paint;
        Paint paint2 = new Paint(1);
        this.f16176c = paint2;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.d = i6Var;
        this.f16179n = new org.telegram.ui.Components.nc(this);
        this.f16180r = -1;
        er erVar = er.h;
        this.f16184y = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.A = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        i6Var.setCallback(this);
        i6Var.r(-1);
        i6Var.f29239b = 17;
        i6Var.t(AndroidUtilities.dp(16.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.k(0.65f, 480L, erVar);
        i6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        h7.b6.a(this);
    }

    public final void a(int i10, int i11, final z7 z7Var) {
        String str;
        if (this.f16180r != i10) {
            this.f16181s = null;
            this.f16174a.clearImage();
            this.f16180r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = z7Var.O0;
        if (file != null) {
            if (TextUtils.equals(this.f16181s, file.getPath())) {
                return;
            }
            this.f16181s = z7Var.O0.getPath();
            final int i12 = 0;
            Utilities.searchQueue.postRunnable(new Runnable(this) {

                public final j4 f16033b;

                {
                    this.f16033b = this;
                }

                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            z7 z7Var2 = z7Var;
                            BitmapFactory.decodeFile(z7Var2.O0.getPath(), options);
                            int iDp = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            z7.C(options, iDp);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(z7Var2.O0.getPath(), options);
                            final int i13 = 1;
                            final j4 j4Var = this.f16033b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            j4Var.f16174a.setImageBitmap(bitmapDecodeFile);
                                            break;
                                        default:
                                            j4Var.f16174a.setImageBitmap(bitmapDecodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            z7 z7Var3 = z7Var;
                            BitmapFactory.decodeFile(z7Var3.L.getPath(), options2);
                            int iDp2 = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            z7.C(options2, iDp2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(z7Var3.L.getPath(), options2);
                            final int i14 = 0;
                            final j4 j4Var2 = this.f16033b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            j4Var2.f16174a.setImageBitmap(bitmapDecodeFile2);
                                            break;
                                        default:
                                            j4Var2.f16174a.setImageBitmap(bitmapDecodeFile2);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (!z7Var.K) {
            File file2 = z7Var.L;
            if (file2 == null || TextUtils.equals(this.f16181s, file2.getPath())) {
                return;
            }
            this.f16181s = z7Var.L.getPath();
            final int i13 = 1;
            Utilities.searchQueue.postRunnable(new Runnable(this) {

                public final j4 f16033b;

                {
                    this.f16033b = this;
                }

                @Override
                public final void run() {
                    switch (i13) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            z7 z7Var2 = z7Var;
                            BitmapFactory.decodeFile(z7Var2.O0.getPath(), options);
                            int iDp = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            z7.C(options, iDp);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(z7Var2.O0.getPath(), options);
                            final int i14 = 1;
                            final j4 j4Var = this.f16033b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            j4Var.f16174a.setImageBitmap(bitmapDecodeFile);
                                            break;
                                        default:
                                            j4Var.f16174a.setImageBitmap(bitmapDecodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            z7 z7Var3 = z7Var;
                            BitmapFactory.decodeFile(z7Var3.L.getPath(), options2);
                            int iDp2 = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            z7.C(options2, iDp2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(z7Var3.L.getPath(), options2);
                            final int i15 = 0;
                            final j4 j4Var2 = this.f16033b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            j4Var2.f16174a.setImageBitmap(bitmapDecodeFile2);
                                            break;
                                        default:
                                            j4Var2.f16174a.setImageBitmap(bitmapDecodeFile2);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        Bitmap bitmapLoadThumbnail = z7Var.M0;
        if (bitmapLoadThumbnail == null) {
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail == null && (str = z7Var.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.f16181s, z7Var.N)) {
                return;
            }
            String str2 = z7Var.N;
            this.f16181s = str2;
            long j10 = Long.parseLong(str2.substring(9));
            if (bitmapLoadThumbnail == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmapLoadThumbnail = getContext().getContentResolver().loadThumbnail(z7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
                } catch (Exception unused) {
                }
            }
        }
        this.f16174a.setImageBitmap(bitmapLoadThumbnail);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f16177e == z10) {
            return;
        }
        this.f16177e = z10;
        if (!z11) {
            this.f16184y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(4.0f);
        float fDp3 = AndroidUtilities.dp(94.0f);
        float fDp4 = AndroidUtilities.dp(112.0f);
        ImageReceiver imageReceiver = this.f16174a;
        imageReceiver.setImageCoords(fDp, fDp2, fDp3, fDp4);
        imageReceiver.draw(canvas);
        float fDp5 = AndroidUtilities.dp(1.5f);
        Paint paint = this.f16175b;
        paint.setStrokeWidth(fDp5);
        float fE = this.f16184y.e(this.f16177e);
        if (fE > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (fE * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f16182w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f16183x = AndroidUtilities.dp(12.833f);
        float fE2 = this.A.e(this.f16178f);
        float fA = this.f16179n.a(0.075f);
        canvas.save();
        canvas.scale(fA, fA, this.v, this.f16182w);
        if (fE2 > 0.0f) {
            Paint paint2 = this.f16176c;
            paint2.setAlpha((int) (fE2 * 255.0f));
            canvas.drawCircle(this.v, this.f16182w, this.f16183x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f16182w, this.f16183x - AndroidUtilities.dp(1.0f), paint);
        if (fE2 > 0.0f) {
            float f10 = this.v;
            float f11 = this.f16183x;
            float f12 = f10 - f11;
            float f13 = this.f16182w;
            float f14 = f10 + f11;
            org.telegram.ui.Components.i6 i6Var = this.d;
            i6Var.l(f12, f13, f14, f13);
            i6Var.f29257w = (int) (fE2 * 255.0f);
            i6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16174a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16174a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z10 = motionEvent.getX() >= this.v - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getX() <= this.v + ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() >= this.f16182w - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() <= this.f16182w + ((float) AndroidUtilities.dp(14.0f));
        int action = motionEvent.getAction();
        org.telegram.ui.Components.nc ncVar = this.f16179n;
        if (action == 0) {
            ncVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (ncVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            ncVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ncVar.c(false);
        }
        return ncVar.h || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setPosition(int i10) {
        this.d.q(i10 < 0 ? "" : Integer.toString(i10 + 1), true, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
