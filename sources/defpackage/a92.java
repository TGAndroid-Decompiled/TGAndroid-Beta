package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a92 extends Drawable {
    public final boolean a;
    public View b;
    public int c = 255;
    public final float d;
    public final mm e;
    public final ah7 f;
    public final TLRPC.WallPaper g;
    public boolean h;
    public boolean i;
    public final ArrayList j;

    public a92(TLRPC.WallPaper wallPaper, boolean z, boolean z2) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String k;
        TLRPC.WallPaperSettings wallPaperSettings2;
        mm mmVar = new mm(this, (byte) 2);
        this.e = mmVar;
        this.j = new ArrayList();
        mmVar.K0 = true;
        boolean z3 = wallPaper.pattern;
        this.g = wallPaper;
        this.a = z;
        if (z && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z3 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z3 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.background_color != 0) {
            ah7 ah7Var = new ah7();
            this.f = ah7Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            ah7Var.n(true, wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            if (wallPaper.document != null) {
                tz3.o(z8c.t0, wallPaper.id, new qy1(this, wallPaper, (byte) 7), wallPaper);
                return;
            }
            return;
        }
        Point point = gm.q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z2) {
            k = "150_150_wallpaper";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / gm.p));
            sb.append("_");
            k = hg9.k(sb, (int) (max / gm.p), "_wallpaper");
        }
        StringBuilder sb2 = new StringBuilder(k + wallPaper.id);
        sb2.append(e(wallPaper.settings));
        String sb3 = sb2.toString();
        Drawable b = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            mmVar.d0(gn5.g(str), sb3, b, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            mmVar.d0(gn5.b(document), sb3, b, null, wallPaper, 1);
        } else {
            mmVar.g0(b);
        }
    }

    public static BitmapDrawable a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, 20, 20);
        drawable.draw(canvas);
        return new BitmapDrawable(createBitmap);
    }

    public static Drawable b(TLRPC.WallPaper wallPaper) {
        BitmapDrawable a;
        Drawable drawable = wallPaper.thumbDrawable;
        if (drawable != null) {
            return drawable;
        }
        if (wallPaper.stripedThumb != null) {
            return new BitmapDrawable(wallPaper.stripedThumb);
        }
        if (wallPaper.pattern && wallPaper.settings == null) {
            return new ColorDrawable(-16777216);
        }
        int i = 0;
        if (wallPaper.document != null) {
            a = null;
            while (i < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                    a = new BitmapDrawable(fn5.B("b", wallPaper.document.thumbs.get(i).bytes));
                }
                i++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a = a(new ColorDrawable(on2.p(wallPaper.settings.background_color, 255)));
                } else {
                    int i2 = wallPaperSettings.third_background_color;
                    int i3 = wallPaperSettings.background_color;
                    if (i2 == 0) {
                        a = a(new GradientDrawable(we0.c(wallPaper.settings.rotation), new int[]{on2.p(i3, 255), on2.p(wallPaper.settings.second_background_color, 255)}));
                    } else {
                        int p = on2.p(i3, 255);
                        int p2 = on2.p(wallPaper.settings.second_background_color, 255);
                        int p3 = on2.p(wallPaper.settings.third_background_color, 255);
                        int i4 = wallPaper.settings.fourth_background_color;
                        if (i4 != 0) {
                            i = on2.p(i4, 255);
                        }
                        int i5 = i;
                        ah7 ah7Var = new ah7();
                        ah7Var.n(true, p, p2, p3, i5);
                        a = new BitmapDrawable(ah7Var.k);
                    }
                }
            } else {
                a = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a;
        return a;
    }

    public static a92 d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof a92) {
            a92 a92Var = (a92) drawable;
            boolean z2 = a92Var.a;
            TLRPC.WallPaper wallPaper2 = a92Var.g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.id != wallPaper2.id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z2 != z)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z2 != z))) {
                return a92Var;
            }
        }
        return new a92(wallPaper, z, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z) {
        Drawable drawable;
        ah7 ah7Var = this.f;
        if (ah7Var != null) {
            return ah7Var;
        }
        mm mmVar = this.e;
        if (z && (drawable = mmVar.n0) != null) {
            return drawable;
        }
        Drawable drawable2 = mmVar.b0;
        if (drawable2 != null) {
            return drawable2;
        }
        if (mmVar.t() != null) {
            return mmVar.t();
        }
        return mmVar.n0;
    }

    @Override
    public final void draw(Canvas canvas) {
        ah7 ah7Var = this.f;
        if (ah7Var != null) {
            ah7Var.setBounds(getBounds());
            ah7Var.setAlpha(this.c);
            ah7Var.draw(canvas);
            return;
        }
        mm mmVar = this.e;
        boolean C = mmVar.C();
        float f = this.d;
        boolean z = true;
        if (C && mmVar.i1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                mmVar.p1 = new PorterDuffColorFilter(on2.p(-16777216, (int) (f * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z = false;
        }
        mmVar.j0(getBounds());
        mmVar.setAlpha(this.c / 255.0f);
        mmVar.h(canvas, null);
        if (z && f != 0.0f) {
            canvas.drawColor(on2.p(-16777216, (int) (f * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        mm mmVar = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            mmVar.I();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            mmVar.K();
        }
        ah7 ah7Var = this.f;
        if (ah7Var != null) {
            ah7Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.j;
        arrayList.remove(view);
        int size = arrayList.size();
        mm mmVar = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            mmVar.I();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            mmVar.K();
        }
        ah7 ah7Var = this.f;
        if (ah7Var != null) {
            ah7Var.l();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
        if (this.c != i) {
            this.c = i;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
