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
public final class g82 extends Drawable {
    public final boolean a;
    public View b;
    public int c = 255;
    public final float d;
    public final nl e;
    public final ih7 f;
    public final TLRPC.WallPaper g;
    public boolean h;
    public boolean i;
    public final ArrayList j;

    public g82(TLRPC.WallPaper wallPaper, boolean z, boolean z2) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String l;
        TLRPC.WallPaperSettings wallPaperSettings2;
        nl nlVar = new nl(this, (byte) 2);
        this.e = nlVar;
        this.j = new ArrayList();
        nlVar.K0 = true;
        boolean z3 = wallPaper.pattern;
        this.g = wallPaper;
        this.a = z;
        if (z && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z3 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z3 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.background_color != 0) {
            ih7 ih7Var = new ih7();
            this.f = ih7Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            ih7Var.n(true, wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            if (wallPaper.document != null) {
                ez3.o(yac.t0, wallPaper.id, new rx1(this, wallPaper, (byte) 7), wallPaper);
                return;
            }
            return;
        }
        Point point = hl.q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z2) {
            l = "150_150_wallpaper";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / hl.p));
            sb.append("_");
            l = uh9.l(sb, (int) (max / hl.p), "_wallpaper");
        }
        StringBuilder sb2 = new StringBuilder(l + wallPaper.id);
        sb2.append(e(wallPaper.settings));
        String sb3 = sb2.toString();
        Drawable b = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            nlVar.d0(jn5.g(str), sb3, b, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            nlVar.d0(jn5.b(document), sb3, b, null, wallPaper, 1);
        } else {
            nlVar.g0(b);
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
                    a = new BitmapDrawable(in5.B("b", wallPaper.document.thumbs.get(i).bytes));
                }
                i++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && wallPaperSettings.intensity >= 0) {
                if (wallPaperSettings.second_background_color == 0) {
                    a = a(new ColorDrawable(vm2.o(wallPaper.settings.background_color, 255)));
                } else {
                    int i2 = wallPaperSettings.third_background_color;
                    int i3 = wallPaperSettings.background_color;
                    if (i2 == 0) {
                        a = a(new GradientDrawable(yd0.c(wallPaper.settings.rotation), new int[]{vm2.o(i3, 255), vm2.o(wallPaper.settings.second_background_color, 255)}));
                    } else {
                        int o = vm2.o(i3, 255);
                        int o2 = vm2.o(wallPaper.settings.second_background_color, 255);
                        int o3 = vm2.o(wallPaper.settings.third_background_color, 255);
                        int i4 = wallPaper.settings.fourth_background_color;
                        if (i4 != 0) {
                            i = vm2.o(i4, 255);
                        }
                        int i5 = i;
                        ih7 ih7Var = new ih7();
                        ih7Var.n(true, o, o2, o3, i5);
                        a = new BitmapDrawable(ih7Var.k);
                    }
                }
            } else {
                a = a(new ColorDrawable(-16777216));
            }
        }
        wallPaper.thumbDrawable = a;
        return a;
    }

    public static g82 d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof g82) {
            g82 g82Var = (g82) drawable;
            boolean z2 = g82Var.a;
            TLRPC.WallPaper wallPaper2 = g82Var.g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.id != wallPaper2.id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z2 != z)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z2 != z))) {
                return g82Var;
            }
        }
        return new g82(wallPaper, z, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        if (wallPaperSettings == null) {
            return "";
        }
        return String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z) {
        Drawable drawable;
        ih7 ih7Var = this.f;
        if (ih7Var != null) {
            return ih7Var;
        }
        nl nlVar = this.e;
        if (z && (drawable = nlVar.n0) != null) {
            return drawable;
        }
        Drawable drawable2 = nlVar.b0;
        if (drawable2 != null) {
            return drawable2;
        }
        if (nlVar.t() != null) {
            return nlVar.t();
        }
        return nlVar.n0;
    }

    @Override
    public final void draw(Canvas canvas) {
        ih7 ih7Var = this.f;
        if (ih7Var != null) {
            ih7Var.setBounds(getBounds());
            ih7Var.setAlpha(this.c);
            ih7Var.draw(canvas);
            return;
        }
        nl nlVar = this.e;
        boolean C = nlVar.C();
        float f = this.d;
        boolean z = true;
        if (C && nlVar.i1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                nlVar.p1 = new PorterDuffColorFilter(vm2.o(-16777216, (int) (f * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z = false;
        }
        nlVar.j0(getBounds());
        nlVar.setAlpha(this.c / 255.0f);
        nlVar.h(canvas, null);
        if (z && f != 0.0f) {
            canvas.drawColor(vm2.o(-16777216, (int) (f * 255.0f)));
        }
    }

    public final void f(View view) {
        ArrayList arrayList = this.j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        nl nlVar = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            nlVar.I();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            nlVar.K();
        }
        ih7 ih7Var = this.f;
        if (ih7Var != null) {
            ih7Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.j;
        arrayList.remove(view);
        int size = arrayList.size();
        nl nlVar = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            nlVar.I();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            nlVar.K();
        }
        ih7 ih7Var = this.f;
        if (ih7Var != null) {
            ih7Var.l();
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
