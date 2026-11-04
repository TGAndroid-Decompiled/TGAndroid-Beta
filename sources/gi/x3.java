package gi;

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
import b8.pf;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;
public final class x3 extends View implements org.telegram.ui.ActionBar.z5 {
    public float E;
    public final org.telegram.ui.Components.u5 F;
    public final org.telegram.ui.Components.u5 G;
    public final org.telegram.ui.ActionBar.e6 f13825a;
    public final ImageReceiver f13826b;
    public final Paint f13827c;
    public final Paint d;
    public final org.telegram.ui.Components.g6 f13828e;
    public boolean f13829f;
    public boolean h;
    public View.OnClickListener f13830n;
    public final gc f13831r;
    public int f13832s;
    public String f13833w;
    public float f13834x;
    public float f13835y;

    public x3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f13826b = imageReceiver;
        Paint paint = new Paint(1);
        this.f13827c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.f13828e = g6Var;
        this.f13831r = new gc(this);
        this.f13832s = -1;
        xq xqVar = xq.h;
        this.F = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.G = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        g6Var.setCallback(this);
        g6Var.u(-1);
        g6Var.f33983b = 17;
        g6Var.w(org.telegram.messenger.g0.L(16.0f));
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
        g6Var.n(0.65f, 480L, xqVar);
        g6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.f13825a = e6Var;
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        pf.a(this);
    }

    public final void a(int i3, int i10, final f7 f7Var) {
        String str;
        Uri withAppendedId;
        if (this.f13832s != i3) {
            this.f13833w = null;
            this.f13826b.f();
            this.f13832s = i3;
        }
        this.f13828e.t(Integer.toString(i10 + 1), false, true);
        File file = f7Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f13833w, file.getPath())) {
                this.f13833w = f7Var.O0.getPath();
                Utilities.f21389g.c(new Runnable(this) {
                    public final x3 f13655b;

                    {
                        this.f13655b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                f7 f7Var2 = f7Var;
                                BitmapFactory.decodeFile(f7Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                f7.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(f7Var2.O0.getPath(), options);
                                final x3 x3Var = this.f13655b;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x3Var.f13826b.v0(decodeFile);
                                                return;
                                            default:
                                                x3Var.f13826b.v0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                f7 f7Var3 = f7Var;
                                BitmapFactory.decodeFile(f7Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                f7.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(f7Var3.L.getPath(), options2);
                                final x3 x3Var2 = this.f13655b;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x3Var2.f13826b.v0(decodeFile2);
                                                return;
                                            default:
                                                x3Var2.f13826b.v0(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (f7Var.K) {
            Bitmap bitmap = f7Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = f7Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f13833w, f7Var.N)) {
                    String str2 = f7Var.N;
                    this.f13833w = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (f7Var.K) {
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
            this.f13826b.v0(bitmap);
        } else {
            File file2 = f7Var.L;
            if (file2 != null && !TextUtils.equals(this.f13833w, file2.getPath())) {
                this.f13833w = f7Var.L.getPath();
                Utilities.f21389g.c(new Runnable(this) {
                    public final x3 f13655b;

                    {
                        this.f13655b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                f7 f7Var2 = f7Var;
                                BitmapFactory.decodeFile(f7Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                f7.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(f7Var2.O0.getPath(), options);
                                final x3 x3Var = this.f13655b;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x3Var.f13826b.v0(decodeFile);
                                                return;
                                            default:
                                                x3Var.f13826b.v0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                f7 f7Var3 = f7Var;
                                BitmapFactory.decodeFile(f7Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                f7.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(f7Var3.L.getPath(), options2);
                                final x3 x3Var2 = this.f13655b;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x3Var2.f13826b.v0(decodeFile2);
                                                return;
                                            default:
                                                x3Var2.f13826b.v0(decodeFile2);
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
        if (this.f13829f == z10) {
            return;
        }
        this.f13829f = z10;
        if (!z11) {
            this.F.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f13826b;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f13827c;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        float d = this.F.d(this.f13829f);
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.f13834x = (getWidth() - org.telegram.messenger.g0.L(17.163f)) - org.telegram.messenger.g0.L(3.0f);
        this.f13835y = org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(17.833f);
        this.E = org.telegram.messenger.g0.L(12.833f);
        float d10 = this.G.d(this.h);
        float a10 = this.f13831r.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, this.f13834x, this.f13835y);
        int i3 = (d10 > 0.0f ? 1 : (d10 == 0.0f ? 0 : -1));
        if (i3 > 0) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d10 * 255.0f));
            canvas.drawCircle(this.f13834x, this.f13835y, this.E, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.f13834x, this.f13835y, this.E - org.telegram.messenger.g0.L(1.0f), paint);
        if (i3 > 0) {
            float f10 = this.f13834x;
            float f11 = this.E;
            float f12 = f10 - f11;
            float f13 = this.f13835y;
            float f14 = f10 + f11;
            org.telegram.ui.Components.g6 g6Var = this.f13828e;
            g6Var.o(f12, f13, f14, f13);
            g6Var.B = (int) (d10 * 255.0f);
            g6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13826b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13826b.R();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.f13834x - org.telegram.messenger.g0.L(14.0f) && motionEvent.getX() <= this.f13834x + org.telegram.messenger.g0.L(14.0f) && motionEvent.getY() >= this.f13835y - org.telegram.messenger.g0.L(14.0f) && motionEvent.getY() <= this.f13835y + org.telegram.messenger.g0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        gc gcVar = this.f13831r;
        if (action == 0) {
            gcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (gcVar.f34049i && z10 && (onClickListener = this.f13830n) != null) {
                onClickListener.onClick(this);
            }
            gcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            gcVar.c(false);
        }
        if (gcVar.f34049i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.f13830n = onClickListener;
    }

    public void setPosition(int i3) {
        String num;
        if (i3 < 0) {
            num = "";
        } else {
            num = Integer.toString(i3 + 1);
        }
        this.f13828e.t(num, true, true);
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f13825a));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f13828e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
