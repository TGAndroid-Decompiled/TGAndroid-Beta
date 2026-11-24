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
public final class ch7 extends View implements tjb {
    public float E;
    public final lm F;
    public final lm G;
    public final wjb a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final gn e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final n41 r;
    public int s;
    public String w;
    public float x;
    public float y;

    public ch7(Context context, wjb wjbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        gn gnVar = new gn(false, false, false);
        this.e = gnVar;
        this.r = new n41(this);
        this.s = -1;
        s33 s33Var = s33.h;
        this.F = new lm(this, 0L, 320L, s33Var);
        this.G = new lm(this, 0L, 320L, s33Var);
        gnVar.setCallback(this);
        gnVar.u(-1);
        gnVar.b = 17;
        gnVar.w(gl.L(16.0f));
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.N = gl.q.x;
        gnVar.n(0.65f, 480L, s33Var);
        gnVar.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = wjbVar;
        paint2.setColor(bkb.v0(bkb.Ei, wjbVar));
        imageReceiver.q0(gl.L(6.0f));
        ote.a(this);
    }

    public final void a(int i, int i2, final f4b f4bVar) {
        String str;
        Uri withAppendedId;
        if (this.s != i) {
            this.w = null;
            this.b.f();
            this.s = i;
        }
        this.e.t(Integer.toString(i2 + 1), false, true);
        File file = f4bVar.O0;
        if (file != null) {
            if (!TextUtils.equals(this.w, file.getPath())) {
                this.w = f4bVar.O0.getPath();
                Utilities.g.c(new Runnable(this) {
                    public final ch7 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        f4b f4bVar2 = f4bVar;
                        final ch7 ch7Var = this.b;
                        switch (b) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(f4bVar2.O0.getPath(), options);
                                f4b.B(options, gl.L(94.0f));
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(f4bVar2.O0.getPath(), options);
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        Bitmap bitmap = decodeFile;
                                        ch7 ch7Var2 = ch7Var;
                                        switch (b2) {
                                            case 0:
                                                ch7Var2.b.f0(bitmap);
                                                return;
                                            default:
                                                ch7Var2.b.f0(bitmap);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(f4bVar2.L.getPath(), options2);
                                f4b.B(options2, gl.L(94.0f));
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(f4bVar2.L.getPath(), options2);
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        Bitmap bitmap = decodeFile2;
                                        ch7 ch7Var2 = ch7Var;
                                        switch (b2) {
                                            case 0:
                                                ch7Var2.b.f0(bitmap);
                                                return;
                                            default:
                                                ch7Var2.b.f0(bitmap);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (f4bVar.K) {
            Bitmap bitmap = f4bVar.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = f4bVar.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.w, f4bVar.N)) {
                    String str2 = f4bVar.N;
                    this.w = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (f4bVar.K) {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong);
                            } else {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong);
                            }
                            bitmap = getContext().getContentResolver().loadThumbnail(withAppendedId, new Size(gl.L(94.0f), gl.L(112.0f)), null);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    return;
                }
            }
            this.b.f0(bitmap);
        } else {
            File file2 = f4bVar.L;
            if (file2 != null && !TextUtils.equals(this.w, file2.getPath())) {
                this.w = f4bVar.L.getPath();
                Utilities.g.c(new Runnable(this) {
                    public final ch7 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        f4b f4bVar2 = f4bVar;
                        final ch7 ch7Var = this.b;
                        switch (b) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(f4bVar2.O0.getPath(), options);
                                f4b.B(options, gl.L(94.0f));
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(f4bVar2.O0.getPath(), options);
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        Bitmap bitmap2 = decodeFile;
                                        ch7 ch7Var2 = ch7Var;
                                        switch (b2) {
                                            case 0:
                                                ch7Var2.b.f0(bitmap2);
                                                return;
                                            default:
                                                ch7Var2.b.f0(bitmap2);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(f4bVar2.L.getPath(), options2);
                                f4b.B(options2, gl.L(94.0f));
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(f4bVar2.L.getPath(), options2);
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        Bitmap bitmap2 = decodeFile2;
                                        ch7 ch7Var2 = ch7Var;
                                        switch (b2) {
                                            case 0:
                                                ch7Var2.b.f0(bitmap2);
                                                return;
                                            default:
                                                ch7Var2.b.f0(bitmap2);
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
        imageReceiver.i0(gl.L(2.0f), gl.L(4.0f), gl.L(94.0f), gl.L(112.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.c;
        paint.setStrokeWidth(gl.L(1.5f));
        float d = this.F.d(this.f);
        if (d > 0.0f) {
            RectF rectF = gl.P;
            rectF.set(gl.L(2.0f), gl.L(4.0f), gl.L(96.0f), gl.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
        }
        this.x = (getWidth() - gl.L(17.163f)) - gl.L(3.0f);
        this.y = gl.L(3.0f) + gl.L(17.833f);
        this.E = gl.L(12.833f);
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
        canvas.drawCircle(this.x, this.y, this.E - gl.L(1.0f), paint);
        if (i > 0) {
            float f = this.x;
            float f2 = this.E;
            float f3 = this.y;
            gn gnVar = this.e;
            gnVar.o(f - f2, f3, f + f2, f3);
            gnVar.C = (int) (d2 * 255.0f);
            gnVar.draw(canvas);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.x - gl.L(14.0f) && motionEvent.getX() <= this.x + gl.L(14.0f) && motionEvent.getY() >= this.y - gl.L(14.0f) && motionEvent.getY() <= this.y + gl.L(14.0f)) {
            z = true;
        } else {
            z = false;
        }
        int action = motionEvent.getAction();
        n41 n41Var = this.r;
        if (action == 0) {
            n41Var.c(z);
        } else if (motionEvent.getAction() == 1) {
            if (n41Var.i && z && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            n41Var.c(false);
        } else if (motionEvent.getAction() == 3) {
            n41Var.c(false);
        }
        if (n41Var.i || super.onTouchEvent(motionEvent)) {
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
            this.d.setColor(bkb.v0(bkb.Ei, this.a));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
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
