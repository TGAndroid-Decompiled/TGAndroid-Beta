package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.mh0;
public final class tb implements Runnable {
    public Thread f26975a;
    public final Object f26976b = new Object();
    public final sb f26977c;
    public boolean d;
    public final ec f26978e;

    public tb(ec ecVar, sb sbVar) {
        this.f26978e = ecVar;
        this.f26977c = sbVar;
    }

    public static Bitmap a(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
        int o4;
        int i7;
        if (wallPaper.pattern && wallPaper.settings != null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            boolean z10 = true;
            if (wallPaperSettings.second_background_color == 0) {
                i7 = g0.V0(wallPaperSettings.background_color, false);
                canvas.drawColor(i0.a.o(wallPaper.settings.background_color, 255));
            } else if (wallPaperSettings.third_background_color == 0) {
                int o10 = i0.a.o(wallPaperSettings.background_color, 255);
                int o11 = i0.a.o(wallPaper.settings.second_background_color, 255);
                int w02 = g0.w0(o10, o11);
                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.p9.d(wallPaper.settings.rotation), new int[]{o10, o11});
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
                int g10 = bb0.g(o12, o13, o14, o4);
                bb0 bb0Var = new bb0();
                bb0Var.n(o12, o13, o14, o4);
                bb0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                bb0Var.s(wallPaper.settings.intensity, bitmap);
                bb0Var.draw(canvas);
                z10 = false;
                i7 = g10;
            }
            if (z10) {
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

    public final void b(mh0 mh0Var, int i7, int i10, boolean z10, boolean z11) {
        Bitmap createBitmap;
        Canvas canvas;
        int i11;
        BitmapDrawable bitmapDrawable;
        if (z10 && z11) {
            float f10 = i7 * 1.2f;
            float f11 = i10 * 1.2f;
            createBitmap = Bitmap.createBitmap((int) f10, (int) f11, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
            canvas.scale(2.0f, 2.0f, f10 / 2.0f, f11 / 2.0f);
        } else {
            createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
        }
        mh0Var.b();
        Bitmap createBitmap2 = Bitmap.createBitmap(mh0Var.f37481b, mh0Var.f37483c, Bitmap.Config.ARGB_8888);
        if (z10) {
            i11 = mh0Var.f37486e[0] - 1;
        } else {
            i11 = 0;
        }
        mh0Var.D0 = i11;
        mh0Var.a(createBitmap2);
        mh0Var.c();
        canvas.save();
        if (!z10 || !z11) {
            canvas.scale(createBitmap2.getWidth() / i7, createBitmap2.getHeight() / i10, i7 / 2.0f, i10 / 2.0f);
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (z10 && z11) {
            canvas.drawBitmap(createBitmap2, (createBitmap.getWidth() - createBitmap2.getWidth()) / 2.0f, (createBitmap.getHeight() - createBitmap2.getHeight()) / 2.0f, paint);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        } else {
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        mh0Var.C(false);
        createBitmap2.recycle();
        c(bitmapDrawable);
    }

    public final void c(BitmapDrawable bitmapDrawable) {
        g0.g3(new z4(19, this, bitmapDrawable));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tb.d():void");
    }

    @Override
    public final void run() {
        try {
            d();
            synchronized (this.f26976b) {
                this.f26975a = null;
            }
            Thread.interrupted();
        } catch (Throwable th2) {
            synchronized (this.f26976b) {
                this.f26975a = null;
                Thread.interrupted();
                throw th2;
            }
        }
    }
}
