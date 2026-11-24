package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
public final class x3c extends vwe {
    public static Font f(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int h = h(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int h2 = h(fontStyle, font2.getStyle());
            if (h2 < h) {
                font = font2;
                h = h2;
            }
        }
        return font;
    }

    public static FontFamily g(bm4[] bm4VarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (bm4 bm4Var : bm4VarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(bm4Var.a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                Font build = new Font.Builder(openFileDescriptor).setWeight(bm4Var.c).setSlant(bm4Var.d ? 1 : 0).setTtcIndex(bm4Var.b).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override
    public final Typeface a(Context context, xl4 xl4Var, Resources resources, int i) {
        yl4[] yl4VarArr;
        try {
            FontFamily.Builder builder = null;
            for (yl4 yl4Var : xl4Var.a) {
                try {
                    Font build = new Font.Builder(resources, yl4Var.f).setWeight(yl4Var.b).setSlant(yl4Var.c ? 1 : 0).setTtcIndex(yl4Var.e).setFontVariationSettings(yl4Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(f(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override
    public final Typeface b(Context context, bm4[] bm4VarArr, int i) {
        try {
            FontFamily g = g(bm4VarArr, context.getContentResolver());
            if (g == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(g).setStyle(f(g, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override
    public final Typeface c(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily g = g((bm4[]) list.get(0), contentResolver);
            if (g == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(g);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily g2 = g((bm4[]) list.get(i2), contentResolver);
                if (g2 != null) {
                    customFallbackBuilder.addCustomFallback(g2);
                }
            }
            return customFallbackBuilder.setStyle(f(g, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
