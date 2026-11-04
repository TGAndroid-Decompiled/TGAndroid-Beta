package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.la0;
public final class ob implements Runnable {
    public Thread f24516a;
    public final Object f24517b = new Object();
    public final nb f24518c;
    public boolean d;
    public final zb f24519e;

    public ob(zb zbVar, nb nbVar) {
        this.f24519e = zbVar;
        this.f24518c = nbVar;
    }

    public static Bitmap a(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
        int o10;
        int i3;
        if (wallPaper.pattern && wallPaper.settings != null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            boolean z10 = true;
            if (wallPaperSettings.second_background_color == 0) {
                i3 = g0.V0(wallPaperSettings.background_color, false);
                canvas.drawColor(i0.a.o(wallPaper.settings.background_color, 255));
            } else if (wallPaperSettings.third_background_color == 0) {
                int o11 = i0.a.o(wallPaperSettings.background_color, 255);
                int o12 = i0.a.o(wallPaper.settings.second_background_color, 255);
                int w02 = g0.w0(o11, o12);
                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.j9.d(wallPaper.settings.rotation), new int[]{o11, o12});
                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                gradientDrawable.draw(canvas);
                i3 = w02;
            } else {
                int o13 = i0.a.o(wallPaperSettings.background_color, 255);
                int o14 = i0.a.o(wallPaper.settings.second_background_color, 255);
                int o15 = i0.a.o(wallPaper.settings.third_background_color, 255);
                int i10 = wallPaper.settings.fourth_background_color;
                if (i10 == 0) {
                    o10 = 0;
                } else {
                    o10 = i0.a.o(i10, 255);
                }
                int g7 = la0.g(o13, o14, o15, o10);
                la0 la0Var = new la0();
                la0Var.n(o13, o14, o15, o10);
                la0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                la0Var.s(bitmap, wallPaper.settings.intensity);
                la0Var.draw(canvas);
                z10 = false;
                i3 = g7;
            }
            if (z10) {
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
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

    public final void b(ch0 ch0Var, int i3, int i10, boolean z10, boolean z11) {
        Bitmap createBitmap;
        Canvas canvas;
        int i11;
        BitmapDrawable bitmapDrawable;
        if (z10 && z11) {
            float f10 = i3 * 1.2f;
            float f11 = i10 * 1.2f;
            createBitmap = Bitmap.createBitmap((int) f10, (int) f11, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
            canvas.scale(2.0f, 2.0f, f10 / 2.0f, f11 / 2.0f);
        } else {
            createBitmap = Bitmap.createBitmap(i3, i10, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
        }
        ch0Var.b();
        Bitmap createBitmap2 = Bitmap.createBitmap(ch0Var.f32720b, ch0Var.f32722c, Bitmap.Config.ARGB_8888);
        if (z10) {
            i11 = ch0Var.f32725e[0] - 1;
        } else {
            i11 = 0;
        }
        ch0Var.D0 = i11;
        ch0Var.a(createBitmap2);
        ch0Var.c();
        canvas.save();
        if (!z10 || !z11) {
            canvas.scale(createBitmap2.getWidth() / i3, createBitmap2.getHeight() / i10, i3 / 2.0f, i10 / 2.0f);
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
        ch0Var.C(false);
        createBitmap2.recycle();
        c(bitmapDrawable);
    }

    public final void c(BitmapDrawable bitmapDrawable) {
        g0.h3(new y4(19, this, bitmapDrawable));
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ob.e():void");
    }

    @Override
    public final void run() {
        try {
            e();
            synchronized (this.f24517b) {
                this.f24516a = null;
            }
            Thread.interrupted();
        } catch (Throwable th2) {
            synchronized (this.f24517b) {
                this.f24516a = null;
                Thread.interrupted();
                throw th2;
            }
        }
    }
}
