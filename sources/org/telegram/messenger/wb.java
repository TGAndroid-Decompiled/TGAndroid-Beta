package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.jb0;
public final class wb implements Runnable {
    public Thread f19077a;
    public final Object f19078b = new Object();
    public final vb f19079c;
    public boolean d;
    public final hc e;

    public wb(hc hcVar, vb vbVar) {
        this.e = hcVar;
        this.f19079c = vbVar;
    }

    public static Bitmap a(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
        int o10;
        int i10;
        if (wallPaper.pattern && wallPaper.settings != null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            boolean z10 = true;
            if (wallPaperSettings.second_background_color == 0) {
                i10 = i0.V0(wallPaperSettings.background_color, false);
                canvas.drawColor(i0.b.o(wallPaper.settings.background_color, 255));
            } else if (wallPaperSettings.third_background_color == 0) {
                int o11 = i0.b.o(wallPaperSettings.background_color, 255);
                int o12 = i0.b.o(wallPaper.settings.second_background_color, 255);
                int w02 = i0.w0(o11, o12);
                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.f9.d(wallPaper.settings.rotation), new int[]{o11, o12});
                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                gradientDrawable.draw(canvas);
                i10 = w02;
            } else {
                int o13 = i0.b.o(wallPaperSettings.background_color, 255);
                int o14 = i0.b.o(wallPaper.settings.second_background_color, 255);
                int o15 = i0.b.o(wallPaper.settings.third_background_color, 255);
                int i11 = wallPaper.settings.fourth_background_color;
                if (i11 == 0) {
                    o10 = 0;
                } else {
                    o10 = i0.b.o(i11, 255);
                }
                int g10 = jb0.g(o13, o14, o15, o10);
                jb0 jb0Var = new jb0();
                jb0Var.n(o13, o14, o15, o10);
                jb0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                jb0Var.s(bitmap, wallPaper.settings.intensity);
                jb0Var.draw(canvas);
                z10 = false;
                i10 = g10;
            }
            if (z10) {
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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

    public final void b(bi0 bi0Var, int i10, int i11, boolean z10, boolean z11) {
        Bitmap createBitmap;
        Canvas canvas;
        int i12;
        BitmapDrawable bitmapDrawable;
        if (z10 && z11) {
            float f7 = i10 * 1.2f;
            float f10 = i11 * 1.2f;
            createBitmap = Bitmap.createBitmap((int) f7, (int) f10, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
            canvas.scale(2.0f, 2.0f, f7 / 2.0f, f10 / 2.0f);
        } else {
            createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(createBitmap);
        }
        bi0Var.b();
        Bitmap createBitmap2 = Bitmap.createBitmap(bi0Var.f24753b, bi0Var.f24755c, Bitmap.Config.ARGB_8888);
        if (z10) {
            i12 = bi0Var.e[0] - 1;
        } else {
            i12 = 0;
        }
        bi0Var.C0 = i12;
        bi0Var.a(createBitmap2);
        bi0Var.c();
        canvas.save();
        if (!z10 || !z11) {
            canvas.scale(createBitmap2.getWidth() / i10, createBitmap2.getHeight() / i11, i10 / 2.0f, i11 / 2.0f);
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
        bi0Var.C(false);
        createBitmap2.recycle();
        c(bitmapDrawable);
    }

    public final void c(BitmapDrawable bitmapDrawable) {
        i0.g3(new t6(17, this, bitmapDrawable));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wb.d():void");
    }

    @Override
    public final void run() {
        try {
            d();
            synchronized (this.f19078b) {
                this.f19077a = null;
            }
            Thread.interrupted();
        } catch (Throwable th2) {
            synchronized (this.f19078b) {
                this.f19077a = null;
                Thread.interrupted();
                throw th2;
            }
        }
    }
}
