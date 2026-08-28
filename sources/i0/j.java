package i0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import f7.j8;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public final class j extends j8 {
    public static Font g(FontFamily fontFamily, int i9) {
        int i10;
        int i11;
        if ((i9 & 1) != 0) {
            i10 = 700;
        } else {
            i10 = 400;
        }
        if ((i9 & 2) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        FontStyle fontStyle = new FontStyle(i10, i11);
        Font font = fontFamily.getFont(0);
        int i12 = i(fontStyle, font.getStyle());
        for (int i13 = 1; i13 < fontFamily.getSize(); i13++) {
            Font font2 = fontFamily.getFont(i13);
            int i14 = i(fontStyle, font2.getStyle());
            if (i14 < i12) {
                font = font2;
                i12 = i14;
            }
        }
        return font;
    }

    public static FontFamily h(o0.i[] iVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (o0.i iVar : iVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(iVar.f18765a, "r", null);
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f18767c).setSlant(iVar.d ? 1 : 0).setTtcIndex(iVar.f18766b).build();
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

    public static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        int i9;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i9 = 0;
        } else {
            i9 = 2;
        }
        return abs + i9;
    }

    @Override
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i9) {
        h0.f[] fVarArr;
        try {
            FontFamily.Builder builder = null;
            for (h0.f fVar : eVar.f9281a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f9286f).setWeight(fVar.f9283b).setSlant(fVar.f9284c ? 1 : 0).setTtcIndex(fVar.f9285e).setFontVariationSettings(fVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i9).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override
    public final Typeface b(Context context, o0.i[] iVarArr, int i9) {
        try {
            FontFamily h = h(iVarArr, context.getContentResolver());
            if (h == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(h).setStyle(g(h, i9).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override
    public final Typeface c(Context context, List list, int i9) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily h = h((o0.i[]) list.get(0), contentResolver);
            if (h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(h);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily h10 = h((o0.i[]) list.get(i10), contentResolver);
                if (h10 != null) {
                    customFallbackBuilder.addCustomFallback(h10);
                }
            }
            return customFallbackBuilder.setStyle(g(h, i9).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override
    public final Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override
    public final Typeface e(Context context, Resources resources, int i9, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i9).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override
    public final o0.i f(o0.i[] iVarArr, int i9) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
