package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uk5 implements Runnable {
    public Thread a;
    public final Object b = new Object();
    public final tk5 c;
    public boolean d;
    public final fl5 e;

    public uk5(fl5 fl5Var, tk5 tk5Var) {
        this.e = fl5Var;
        this.c = tk5Var;
    }

    public static Bitmap a(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
        int o;
        int g;
        if (wallPaper.pattern && wallPaper.settings != null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            boolean z = true;
            if (wallPaperSettings.second_background_color == 0) {
                g = gl.U0(wallPaperSettings.background_color, false);
                canvas.drawColor(bm2.o(wallPaper.settings.background_color, 255));
            } else {
                int i = wallPaperSettings.third_background_color;
                int i2 = wallPaperSettings.background_color;
                if (i == 0) {
                    int o2 = bm2.o(i2, 255);
                    int o3 = bm2.o(wallPaper.settings.second_background_color, 255);
                    int w0 = gl.w0(o2, o3);
                    GradientDrawable gradientDrawable = new GradientDrawable(wd0.c(wallPaper.settings.rotation), new int[]{o2, o3});
                    gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    gradientDrawable.draw(canvas);
                    g = w0;
                } else {
                    int o4 = bm2.o(i2, 255);
                    int o5 = bm2.o(wallPaper.settings.second_background_color, 255);
                    int o6 = bm2.o(wallPaper.settings.third_background_color, 255);
                    int i3 = wallPaper.settings.fourth_background_color;
                    if (i3 == 0) {
                        o = 0;
                    } else {
                        o = bm2.o(i3, 255);
                    }
                    g = ye7.g(o4, o5, o6, o);
                    ye7 ye7Var = new ye7();
                    ye7Var.n(true, o4, o5, o6, o);
                    ye7Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    ye7Var.r(wallPaper.settings.intensity, bitmap);
                    ye7Var.draw(canvas);
                    z = false;
                }
            }
            if (z) {
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(g, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((wallPaper.settings.intensity / 100.0f) * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            return createBitmap;
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
        if (wallPaperSettings2 != null && wallPaperSettings2.blur) {
            return Utilities.e(bitmap);
        }
        return bitmap;
    }

    public final void b(oy8 oy8Var, int i, int i2, boolean z, boolean z2) {
        Bitmap.Config config;
        Bitmap createBitmap;
        Canvas canvas;
        int i3;
        BitmapDrawable bitmapDrawable;
        if (z && z2) {
            float f = i * 1.2f;
            float f2 = i2 * 1.2f;
            config = Bitmap.Config.ARGB_8888;
            createBitmap = Bitmap.createBitmap((int) f, (int) f2, config);
            canvas = new Canvas(createBitmap);
            canvas.scale(2.0f, 2.0f, f / 2.0f, f2 / 2.0f);
        } else {
            config = Bitmap.Config.ARGB_8888;
            createBitmap = Bitmap.createBitmap(i, i2, config);
            canvas = new Canvas(createBitmap);
        }
        oy8Var.b();
        Bitmap createBitmap2 = Bitmap.createBitmap(oy8Var.b, oy8Var.c, config);
        if (z) {
            i3 = oy8Var.e[0] - 1;
        } else {
            i3 = 0;
        }
        oy8Var.D0 = i3;
        oy8Var.a(createBitmap2);
        oy8Var.c();
        canvas.save();
        if (!z || !z2) {
            canvas.scale(createBitmap2.getWidth() / i, createBitmap2.getHeight() / i2, i / 2.0f, i2 / 2.0f);
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (z && z2) {
            canvas.drawBitmap(createBitmap2, (createBitmap.getWidth() - createBitmap2.getWidth()) / 2.0f, (createBitmap.getHeight() - createBitmap2.getHeight()) / 2.0f, paint);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        } else {
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        oy8Var.x(false);
        createBitmap2.recycle();
        c(bitmapDrawable);
    }

    public final void c(BitmapDrawable bitmapDrawable) {
        gl.c3(new hb5(this, bitmapDrawable, (byte) 10));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk5.d():void");
    }

    @Override
    public final void run() {
        try {
            d();
            synchronized (this.b) {
                this.a = null;
            }
            Thread.interrupted();
        } catch (Throwable th) {
            synchronized (this.b) {
                this.a = null;
                Thread.interrupted();
                throw th;
            }
        }
    }
}
