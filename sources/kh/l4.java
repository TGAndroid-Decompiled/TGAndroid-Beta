package kh;

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
import org.telegram.ui.Components.gr;
public final class l4 extends View {
    public final org.telegram.ui.Components.y5 A;
    public final ImageReceiver f15587a;
    public final Paint f15588b;
    public final Paint f15589c;
    public final org.telegram.ui.Components.i6 d;
    public boolean f15590e;
    public boolean f15591f;
    public View.OnClickListener h;
    public final org.telegram.ui.Components.pc f15592n;
    public int f15593r;
    public String f15594s;
    public float v;
    public float f15595w;
    public float f15596x;
    public final org.telegram.ui.Components.y5 f15597y;

    public l4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f15587a = imageReceiver;
        Paint paint = new Paint(1);
        this.f15588b = paint;
        Paint paint2 = new Paint(1);
        this.f15589c = paint2;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.d = i6Var;
        this.f15592n = new org.telegram.ui.Components.pc(this);
        this.f15593r = -1;
        gr grVar = gr.h;
        this.f15597y = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.A = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        i6Var.setCallback(this);
        i6Var.r(-1);
        i6Var.f29333b = 17;
        i6Var.t(AndroidUtilities.dp(16.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.k(0.65f, 480L, grVar);
        i6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        g7.g6.a(this);
    }

    public final void a(int i9, int i10, final a8 a8Var) {
        String str;
        Uri withAppendedId;
        if (this.f15593r != i9) {
            this.f15594s = null;
            this.f15587a.clearImage();
            this.f15593r = i9;
        }
        this.d.q(Integer.toString(i10 + 1), false, true);
        File file = a8Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f15594s, file.getPath())) {
                this.f15594s = a8Var.O0.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final l4 f15423b;

                    {
                        this.f15423b = this;
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
                                final l4 l4Var = this.f15423b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                l4Var.f15587a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                l4Var.f15587a.setImageBitmap(decodeFile);
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
                                final l4 l4Var2 = this.f15423b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                l4Var2.f15587a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                l4Var2.f15587a.setImageBitmap(decodeFile2);
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
                if (!TextUtils.equals(this.f15594s, a8Var.N)) {
                    String str2 = a8Var.N;
                    this.f15594s = str2;
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
            this.f15587a.setImageBitmap(bitmap);
        } else {
            File file2 = a8Var.L;
            if (file2 != null && !TextUtils.equals(this.f15594s, file2.getPath())) {
                this.f15594s = a8Var.L.getPath();
                Utilities.searchQueue.postRunnable(new Runnable(this) {
                    public final l4 f15423b;

                    {
                        this.f15423b = this;
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
                                final l4 l4Var = this.f15423b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                l4Var.f15587a.setImageBitmap(decodeFile);
                                                return;
                                            default:
                                                l4Var.f15587a.setImageBitmap(decodeFile);
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
                                final l4 l4Var2 = this.f15423b;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                l4Var2.f15587a.setImageBitmap(decodeFile2);
                                                return;
                                            default:
                                                l4Var2.f15587a.setImageBitmap(decodeFile2);
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
        if (this.f15590e == z10) {
            return;
        }
        this.f15590e = z10;
        if (!z11) {
            this.f15597y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f15587a;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f15588b;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        float e10 = this.f15597y.e(this.f15590e);
        if (e10 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.f15595w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.f15596x = AndroidUtilities.dp(12.833f);
        float e11 = this.A.e(this.f15591f);
        float a2 = this.f15592n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.f15595w);
        int i9 = (e11 > 0.0f ? 1 : (e11 == 0.0f ? 0 : -1));
        if (i9 > 0) {
            Paint paint2 = this.f15589c;
            paint2.setAlpha((int) (e11 * 255.0f));
            canvas.drawCircle(this.v, this.f15595w, this.f15596x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.f15595w, this.f15596x - AndroidUtilities.dp(1.0f), paint);
        if (i9 > 0) {
            float f10 = this.v;
            float f11 = this.f15596x;
            float f12 = f10 - f11;
            float f13 = this.f15595w;
            float f14 = f10 + f11;
            org.telegram.ui.Components.i6 i6Var = this.d;
            i6Var.l(f12, f13, f14, f13);
            i6Var.f29351w = (int) (e11 * 255.0f);
            i6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15587a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15587a.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.v - AndroidUtilities.dp(14.0f) && motionEvent.getX() <= this.v + AndroidUtilities.dp(14.0f) && motionEvent.getY() >= this.f15595w - AndroidUtilities.dp(14.0f) && motionEvent.getY() <= this.f15595w + AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Components.pc pcVar = this.f15592n;
        if (action == 0) {
            pcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (pcVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            pcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            pcVar.c(false);
        }
        if (pcVar.h || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setPosition(int i9) {
        String num;
        if (i9 < 0) {
            num = "";
        } else {
            num = Integer.toString(i9 + 1);
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
