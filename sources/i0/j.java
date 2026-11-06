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
import c8.j0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public final class j extends j0 {
    public static Font g(FontFamily fontFamily, int i7) {
        int i10;
        int i11;
        if ((i7 & 1) != 0) {
            i10 = 700;
        } else {
            i10 = 400;
        }
        if ((i7 & 2) != 0) {
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

    public static FontFamily h(o0.h[] hVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (o0.h hVar : hVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(hVar.f20688a, "r", null);
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                Font build = new Font.Builder(openFileDescriptor).setWeight(hVar.f20690c).setSlant(hVar.d ? 1 : 0).setTtcIndex(hVar.f20689b).build();
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
        int i7;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        return abs + i7;
    }

    @Override
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i7) {
        h0.f[] fVarArr;
        try {
            FontFamily.Builder builder = null;
            for (h0.f fVar : eVar.f14012a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f14017f).setWeight(fVar.f14014b).setSlant(fVar.f14015c ? 1 : 0).setTtcIndex(fVar.f14016e).setFontVariationSettings(fVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i7).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override
    public final Typeface b(Context context, o0.h[] hVarArr, int i7) {
        try {
            FontFamily h = h(hVarArr, context.getContentResolver());
            if (h == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(h).setStyle(g(h, i7).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override
    public final Typeface c(Context context, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily h = h((o0.h[]) list.get(0), contentResolver);
            if (h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(h);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily h7 = h((o0.h[]) list.get(i10), contentResolver);
                if (h7 != null) {
                    customFallbackBuilder.addCustomFallback(h7);
                }
            }
            return customFallbackBuilder.setStyle(g(h, i7).getStyle()).build();
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
    public final Typeface e(Context context, Resources resources, int i7, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override
    public final o0.h f(o0.h[] hVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
