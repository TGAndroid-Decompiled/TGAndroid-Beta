package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.zg0;
public final class vb implements Runnable {
    public Thread f25960a;
    public final Object f25961b = new Object();
    public final ub f25962c;
    public boolean d;
    public final gc f25963e;

    public vb(gc gcVar, ub ubVar) {
        this.f25963e = gcVar;
        this.f25962c = ubVar;
    }

    public static Bitmap a(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
        int o4;
        int i7;
        if (wallPaper.pattern && wallPaper.settings != null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            boolean z9 = true;
            if (wallPaperSettings.second_background_color == 0) {
                i7 = g0.V0(wallPaperSettings.background_color, false);
                canvas.drawColor(i0.a.o(wallPaper.settings.background_color, 255));
            } else if (wallPaperSettings.third_background_color == 0) {
                int o10 = i0.a.o(wallPaperSettings.background_color, 255);
                int o11 = i0.a.o(wallPaper.settings.second_background_color, 255);
                int w02 = g0.w0(o10, o11);
                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.k9.d(wallPaper.settings.rotation), new int[]{o10, o11});
                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                gradientDrawable.draw(canvas);
                i7 = w02;
            } else {
                int o12 = i0.a.o(wallPaperSettings.background_color, 255);
                int o13 = i0.a.o(wallPaper.settings.second_background_color, 255);
                int o14 = i0.a.o(wallPaper.settings.third_background_color, 255);
                int i10 = wallPaper.settings.fourth_background_color;
                if (i10 == 0) {
                    o4 = 0;
                } else {
                    o4 = i0.a.o(i10, 255);
                }
                int g10 = qa0.g(o12, o13, o14, o4);
                qa0 qa0Var = new qa0();
                qa0Var.n(o12, o13, o14, o4);
                qa0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                qa0Var.s(wallPaper.settings.intensity, bitmap);
                qa0Var.draw(canvas);
                z9 = false;
                i7 = g10;
            }
            if (z9) {
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
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

    public final void b(zg0 zg0Var, int i7, int i10, boolean z9, boolean z10) {
        Bitmap createBitmap;
        Canvas canvas;
        int i11;
        BitmapDrawable bitmapDrawable;
        if (z9 && z10) {
            float f10 = i7 * 1.2f;
            float f11 = i10 * 1.2f;
            createBitmap = Bitmap.createBitmap((int) f10, (int) f11, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
            canvas.scale(2.0f, 2.0f, f10 / 2.0f, f11 / 2.0f);
        } else {
            createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
        }
        zg0Var.b();
        Bitmap createBitmap2 = Bitmap.createBitmap(zg0Var.f40990b, zg0Var.f40992c, Bitmap.Config.ARGB_8888);
        if (z9) {
            i11 = zg0Var.f40995e[0] - 1;
        } else {
            i11 = 0;
        }
        zg0Var.C0 = i11;
        zg0Var.a(createBitmap2);
        zg0Var.c();
        canvas.save();
        if (!z9 || !z10) {
            canvas.scale(createBitmap2.getWidth() / i7, createBitmap2.getHeight() / i10, i7 / 2.0f, i10 / 2.0f);
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (z9 && z10) {
            canvas.drawBitmap(createBitmap2, (createBitmap.getWidth() - createBitmap2.getWidth()) / 2.0f, (createBitmap.getHeight() - createBitmap2.getHeight()) / 2.0f, paint);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        } else {
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        zg0Var.C(false);
        createBitmap2.recycle();
        c(bitmapDrawable);
    }

    public final void c(BitmapDrawable bitmapDrawable) {
        g0.h3(new x4(19, this, bitmapDrawable));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vb.d():void");
    }

    @Override
    public final void run() {
        try {
            d();
            synchronized (this.f25961b) {
                this.f25960a = null;
            }
            Thread.interrupted();
        } catch (Throwable th2) {
            synchronized (this.f25961b) {
                this.f25960a = null;
                Thread.interrupted();
                throw th2;
            }
        }
    }
}
