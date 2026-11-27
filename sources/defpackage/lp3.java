package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class lp3 {
    public static ggb a(int i) {
        try {
            ggb ggbVar = new ggb();
            zfb zfbVar = new zfb(256.0f, 256.0f, 204.8f);
            ggbVar.a.add(zfbVar);
            ggbVar.b.put(zfbVar, new Paint(1));
            ggbVar.e = 512;
            ggbVar.f = 512;
            ggbVar.e(i, null, 0.65f, false);
            return ggbVar;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public static ggb b(int i) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        ggb ggbVar = new ggb();
        ggbVar.a.add(path);
        ggbVar.b.put(path, new Paint(1));
        ggbVar.e = 512;
        ggbVar.f = 512;
        ggbVar.e(i, null, 1.0f, false);
        return ggbVar;
    }

    public static ggb c(float f, int i) {
        ggb g = hgb.g(2131624085, -65536);
        if (g != null) {
            g.e(i, null, f, false);
        }
        return g;
    }

    public static ggb d(ArrayList arrayList, int i, float f, boolean z) {
        int size = arrayList.size();
        int i2 = 512;
        int i3 = 512;
        TLRPC.TL_photoPathSize tL_photoPathSize = null;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i4);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                tL_photoPathSize = (TLRPC.TL_photoPathSize) photoSize;
            } else if ((photoSize instanceof TLRPC.TL_photoSize) && z) {
                i2 = photoSize.w;
                i3 = photoSize.h;
            }
        }
        if (tL_photoPathSize == null || i2 == 0 || i3 == 0) {
            return null;
        }
        ggb i5 = hgb.i(i2, i3, tL_photoPathSize.svgPath);
        if (i5 != null) {
            i5.e(i, null, f, false);
        }
        return i5;
    }

    public static ggb e(TLRPC.Document document, int i, float f) {
        return f(document, i, f, null);
    }

    public static ggb f(TLRPC.Document document, int i, float f, vnb vnbVar) {
        int i2;
        int i3;
        if (document != null) {
            int size = document.thumbs.size();
            for (int i4 = 0; i4 < size; i4++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i4);
                if (photoSize instanceof TLRPC.TL_photoPathSize) {
                    int size2 = document.attributes.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i5);
                        if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            i2 = documentAttribute.w;
                            i3 = documentAttribute.h;
                            break;
                        }
                    }
                    i2 = 512;
                    i3 = 512;
                    if (i2 != 0 && i3 != 0) {
                        ggb i6 = hgb.i((int) (i2 * 1.0f), (int) (i3 * 1.0f), ((TLRPC.TL_photoPathSize) photoSize).svgPath);
                        if (i6 != null) {
                            i6.e(i, vnbVar, f, false);
                        }
                        return i6;
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
