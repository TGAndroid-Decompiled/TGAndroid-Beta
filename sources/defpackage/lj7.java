package defpackage;

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
public final class lj7 extends View implements snb {
    public float E;
    public final mm F;
    public final mm G;
    public final vnb a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final hn e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final v41 r;
    public int s;
    public String w;
    public float x;
    public float y;

    public lj7(Context context, vnb vnbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        hn hnVar = new hn(false, false, false);
        this.e = hnVar;
        this.r = new v41(this);
        this.s = -1;
        k43 k43Var = k43.h;
        this.F = new mm(this, 0L, 320L, k43Var);
        this.G = new mm(this, 0L, 320L, k43Var);
        hnVar.setCallback(this);
        hnVar.u(-1);
        hnVar.b = 17;
        hnVar.w(hl.L(16.0f));
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.N = hl.q.x;
        hnVar.n(0.65f, 480L, k43Var);
        hnVar.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = vnbVar;
        paint2.setColor(aob.v0(aob.Fi, vnbVar));
        imageReceiver.q0(hl.L(6.0f));
        iye.a(this);
    }

    public final void a(int i, int i2, final c8b c8bVar) {
        String str;
        Uri withAppendedId;
        if (this.s != i) {
            this.w = null;
            this.b.f();
            this.s = i;
        }
        this.e.t(Integer.toString(i2 + 1), false, true);
        File file = c8bVar.O0;
        if (file != null) {
            if (!TextUtils.equals(this.w, file.getPath())) {
                this.w = c8bVar.O0.getPath();
                Utilities.g.c(new Runnable(this) {
                    public final lj7 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        c8b c8bVar2 = c8bVar;
                        final lj7 lj7Var = this.b;
                        switch (b) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(c8bVar2.O0.getPath(), options);
                                c8b.B(options, hl.L(94.0f));
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(c8bVar2.O0.getPath(), options);
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        Bitmap bitmap = decodeFile;
                                        lj7 lj7Var2 = lj7Var;
                                        switch (b2) {
                                            case 0:
                                                lj7Var2.b.f0(bitmap);
                                                return;
                                            default:
                                                lj7Var2.b.f0(bitmap);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(c8bVar2.L.getPath(), options2);
                                c8b.B(options2, hl.L(94.0f));
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(c8bVar2.L.getPath(), options2);
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        Bitmap bitmap = decodeFile2;
                                        lj7 lj7Var2 = lj7Var;
                                        switch (b2) {
                                            case 0:
                                                lj7Var2.b.f0(bitmap);
                                                return;
                                            default:
                                                lj7Var2.b.f0(bitmap);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (c8bVar.K) {
            Bitmap bitmap = c8bVar.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = c8bVar.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.w, c8bVar.N)) {
                    String str2 = c8bVar.N;
                    this.w = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (c8bVar.K) {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong);
                            } else {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong);
                            }
                            bitmap = getContext().getContentResolver().loadThumbnail(withAppendedId, new Size(hl.L(94.0f), hl.L(112.0f)), null);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    return;
                }
            }
            this.b.f0(bitmap);
        } else {
            File file2 = c8bVar.L;
            if (file2 != null && !TextUtils.equals(this.w, file2.getPath())) {
                this.w = c8bVar.L.getPath();
                Utilities.g.c(new Runnable(this) {
                    public final lj7 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        c8b c8bVar2 = c8bVar;
                        final lj7 lj7Var = this.b;
                        switch (b) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(c8bVar2.O0.getPath(), options);
                                c8b.B(options, hl.L(94.0f));
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(c8bVar2.O0.getPath(), options);
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        Bitmap bitmap2 = decodeFile;
                                        lj7 lj7Var2 = lj7Var;
                                        switch (b2) {
                                            case 0:
                                                lj7Var2.b.f0(bitmap2);
                                                return;
                                            default:
                                                lj7Var2.b.f0(bitmap2);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(c8bVar2.L.getPath(), options2);
                                c8b.B(options2, hl.L(94.0f));
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(c8bVar2.L.getPath(), options2);
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        Bitmap bitmap2 = decodeFile2;
                                        lj7 lj7Var2 = lj7Var;
                                        switch (b2) {
                                            case 0:
                                                lj7Var2.b.f0(bitmap2);
                                                return;
                                            default:
                                                lj7Var2.b.f0(bitmap2);
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

    public final void b(boolean z, boolean z2) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        if (!z2) {
            this.F.a(z);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(hl.L(2.0f), hl.L(4.0f), hl.L(94.0f), hl.L(112.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.c;
        paint.setStrokeWidth(hl.L(1.5f));
        float d = this.F.d(this.f);
        if (d > 0.0f) {
            RectF rectF = hl.P;
            rectF.set(hl.L(2.0f), hl.L(4.0f), hl.L(96.0f), hl.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
        }
        this.x = (getWidth() - hl.L(17.163f)) - hl.L(3.0f);
        this.y = hl.L(3.0f) + hl.L(17.833f);
        this.E = hl.L(12.833f);
        float d2 = this.G.d(this.h);
        float a = this.r.a(0.075f);
        canvas.save();
        canvas.scale(a, a, this.x, this.y);
        int i = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
        if (i > 0) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.x, this.y, this.E, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.x, this.y, this.E - hl.L(1.0f), paint);
        if (i > 0) {
            float f = this.x;
            float f2 = this.E;
            float f3 = this.y;
            hn hnVar = this.e;
            hnVar.o(f - f2, f3, f + f2, f3);
            hnVar.C = (int) (d2 * 255.0f);
            hnVar.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.K();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.x - hl.L(14.0f) && motionEvent.getX() <= this.x + hl.L(14.0f) && motionEvent.getY() >= this.y - hl.L(14.0f) && motionEvent.getY() <= this.y + hl.L(14.0f)) {
            z = true;
        } else {
            z = false;
        }
        int action = motionEvent.getAction();
        v41 v41Var = this.r;
        if (action == 0) {
            v41Var.c(z);
        } else if (motionEvent.getAction() == 1) {
            if (v41Var.i && z && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            v41Var.c(false);
        } else if (motionEvent.getAction() == 3) {
            v41Var.c(false);
        }
        if (v41Var.i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setPosition(int i) {
        String num;
        if (i < 0) {
            num = "";
        } else {
            num = Integer.toString(i + 1);
        }
        this.e.t(num, true, true);
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(aob.v0(aob.Fi, this.a));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
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
