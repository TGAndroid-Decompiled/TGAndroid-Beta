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
import j7.z7;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public final class j extends z7 {
    public static Font g(FontFamily fontFamily, int i10) {
        int i11;
        int i12;
        if ((i10 & 1) != 0) {
            i11 = 700;
        } else {
            i11 = 400;
        }
        if ((i10 & 2) != 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        FontStyle fontStyle = new FontStyle(i11, i12);
        Font font = fontFamily.getFont(0);
        int i13 = i(fontStyle, font.getStyle());
        for (int i14 = 1; i14 < fontFamily.getSize(); i14++) {
            Font font2 = fontFamily.getFont(i14);
            int i15 = i(fontStyle, font2.getStyle());
            if (i15 < i13) {
                font = font2;
                i13 = i15;
            }
        }
        return font;
    }

    public static FontFamily h(o0.i[] iVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (o0.i iVar : iVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(iVar.f16166a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f16168c).setSlant(iVar.d ? 1 : 0).setTtcIndex(iVar.f16167b).build();
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
        int i10;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        return abs + i10;
    }

    @Override
    public final Typeface a(Context context, h0.e eVar, Resources resources, int i10) {
        h0.f[] fVarArr;
        try {
            FontFamily.Builder builder = null;
            for (h0.f fVar : eVar.f6860a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f6864f).setWeight(fVar.f6862b).setSlant(fVar.f6863c ? 1 : 0).setTtcIndex(fVar.e).setFontVariationSettings(fVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override
    public final Typeface b(Context context, o0.i[] iVarArr, int i10) {
        try {
            FontFamily h = h(iVarArr, context.getContentResolver());
            if (h == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(h).setStyle(g(h, i10).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override
    public final Typeface c(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily h = h((o0.i[]) list.get(0), contentResolver);
            if (h == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(h);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily h9 = h((o0.i[]) list.get(i11), contentResolver);
                if (h9 != null) {
                    customFallbackBuilder.addCustomFallback(h9);
                }
            }
            return customFallbackBuilder.setStyle(g(h, i10).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override
    public final Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override
    public final Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override
    public final o0.i f(o0.i[] iVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
