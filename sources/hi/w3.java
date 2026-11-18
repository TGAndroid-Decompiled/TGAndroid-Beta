package hi;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
public final class w3 extends View implements org.telegram.ui.ActionBar.c6 {
    public float E;
    public final org.telegram.ui.Components.c6 F;
    public final org.telegram.ui.Components.c6 G;
    public final org.telegram.ui.ActionBar.i6 f15633a;
    public final ImageReceiver f15634b;
    public final Paint f15635c;
    public final Paint d;
    public final org.telegram.ui.Components.m6 f15636e;
    public boolean f15637f;
    public boolean h;
    public View.OnClickListener f15638n;
    public final mc f15639r;
    public int f15640s;
    public String f15641w;
    public float f15642x;
    public float f15643y;

    public w3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f15634b = imageReceiver;
        Paint paint = new Paint(1);
        this.f15635c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false);
        this.f15636e = m6Var;
        this.f15639r = new mc(this);
        this.f15640s = -1;
        lr lrVar = lr.h;
        this.F = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        this.G = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        m6Var.setCallback(this);
        m6Var.u(-1);
        m6Var.f37377b = 17;
        m6Var.w(org.telegram.messenger.g0.L(16.0f));
        m6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        m6Var.N = org.telegram.messenger.g0.f24121q.x;
        m6Var.n(0.65f, 480L, lrVar);
        m6Var.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.f15633a = i6Var;
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        c8.ra.a(this);
    }

    public final void a(int i7, int i10, final d7 d7Var) {
        String str;
        Uri withAppendedId;
        if (this.f15640s != i7) {
            this.f15641w = null;
            this.f15634b.f();
            this.f15640s = i7;
        }
        this.f15636e.t(Integer.toString(i10 + 1), false, true);
        File file = d7Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f15641w, file.getPath())) {
                this.f15641w = d7Var.O0.getPath();
                Utilities.f22784g.c(new Runnable(this) {
                    public final w3 f15411b;

                    {
                        this.f15411b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                d7 d7Var2 = d7Var;
                                BitmapFactory.decodeFile(d7Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                d7.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(d7Var2.O0.getPath(), options);
                                final w3 w3Var = this.f15411b;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w3Var.f15634b.v0(decodeFile);
                                                return;
                                            default:
                                                w3Var.f15634b.v0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                d7 d7Var3 = d7Var;
                                BitmapFactory.decodeFile(d7Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                d7.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(d7Var3.L.getPath(), options2);
                                final w3 w3Var2 = this.f15411b;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w3Var2.f15634b.v0(decodeFile2);
                                                return;
                                            default:
                                                w3Var2.f15634b.v0(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (d7Var.K) {
            Bitmap bitmap = d7Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = d7Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f15641w, d7Var.N)) {
                    String str2 = d7Var.N;
                    this.f15641w = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (d7Var.K) {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong);
                            } else {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong);
                            }
                            bitmap = getContext().getContentResolver().loadThumbnail(withAppendedId, new Size(org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f)), null);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    return;
                }
            }
            this.f15634b.v0(bitmap);
        } else {
            File file2 = d7Var.L;
            if (file2 != null && !TextUtils.equals(this.f15641w, file2.getPath())) {
                this.f15641w = d7Var.L.getPath();
                Utilities.f22784g.c(new Runnable(this) {
                    public final w3 f15411b;

                    {
                        this.f15411b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                d7 d7Var2 = d7Var;
                                BitmapFactory.decodeFile(d7Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                d7.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(d7Var2.O0.getPath(), options);
                                final w3 w3Var = this.f15411b;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w3Var.f15634b.v0(decodeFile);
                                                return;
                                            default:
                                                w3Var.f15634b.v0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                d7 d7Var3 = d7Var;
                                BitmapFactory.decodeFile(d7Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                d7.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(d7Var3.L.getPath(), options2);
                                final w3 w3Var2 = this.f15411b;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w3Var2.f15634b.v0(decodeFile2);
                                                return;
                                            default:
                                                w3Var2.f15634b.v0(decodeFile2);
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
        if (this.f15637f == z10) {
            return;
        }
        this.f15637f = z10;
        if (!z11) {
            this.F.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f15634b;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f15635c;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        float d = this.F.d(this.f15637f);
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.f15642x = (getWidth() - org.telegram.messenger.g0.L(17.163f)) - org.telegram.messenger.g0.L(3.0f);
        this.f15643y = org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(17.833f);
        this.E = org.telegram.messenger.g0.L(12.833f);
        float d2 = this.G.d(this.h);
        float a10 = this.f15639r.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, this.f15642x, this.f15643y);
        int i7 = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.f15642x, this.f15643y, this.E, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.f15642x, this.f15643y, this.E - org.telegram.messenger.g0.L(1.0f), paint);
        if (i7 > 0) {
            float f10 = this.f15642x;
            float f11 = this.E;
            float f12 = f10 - f11;
            float f13 = this.f15643y;
            float f14 = f10 + f11;
            org.telegram.ui.Components.m6 m6Var = this.f15636e;
            m6Var.o(f12, f13, f14, f13);
            m6Var.C = (int) (d2 * 255.0f);
            m6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15634b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15634b.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.f15642x - org.telegram.messenger.g0.L(14.0f) && motionEvent.getX() <= this.f15642x + org.telegram.messenger.g0.L(14.0f) && motionEvent.getY() >= this.f15643y - org.telegram.messenger.g0.L(14.0f) && motionEvent.getY() <= this.f15643y + org.telegram.messenger.g0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        mc mcVar = this.f15639r;
        if (action == 0) {
            mcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (mcVar.f37434i && z10 && (onClickListener = this.f15638n) != null) {
                onClickListener.onClick(this);
            }
            mcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            mcVar.c(false);
        }
        if (mcVar.f37434i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.f15638n = onClickListener;
    }

    public void setPosition(int i7) {
        String num;
        if (i7 < 0) {
            num = "";
        } else {
            num = Integer.toString(i7 + 1);
        }
        this.f15636e.t(num, true, true);
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f15633a));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f15636e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
