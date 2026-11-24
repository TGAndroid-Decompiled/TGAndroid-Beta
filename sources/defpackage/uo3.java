package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class uo3 {
    public static kcb a(int i) {
        try {
            kcb kcbVar = new kcb();
            dcb dcbVar = new dcb(256.0f, 256.0f, 204.8f);
            kcbVar.a.add(dcbVar);
            kcbVar.b.put(dcbVar, new Paint(1));
            kcbVar.e = 512;
            kcbVar.f = 512;
            kcbVar.e(i, null, 0.65f, false);
            return kcbVar;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static kcb b(int i) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        kcb kcbVar = new kcb();
        kcbVar.a.add(path);
        kcbVar.b.put(path, new Paint(1));
        kcbVar.e = 512;
        kcbVar.f = 512;
        kcbVar.e(i, null, 1.0f, false);
        return kcbVar;
    }

    public static kcb c(float f, int i) {
        kcb g = lcb.g(2131624085, -65536);
        if (g != null) {
            g.e(i, null, f, false);
        }
        return g;
    }

    public static kcb d(ArrayList arrayList, int i, float f, boolean z) {
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
        kcb i5 = lcb.i(i2, i3, tL_photoPathSize.svgPath);
        if (i5 != null) {
            i5.e(i, null, f, false);
        }
        return i5;
    }

    public static kcb e(TLRPC.Document document, int i, float f) {
        return f(document, i, f, null);
    }

    public static kcb f(TLRPC.Document document, int i, float f, wjb wjbVar) {
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
                        kcb i6 = lcb.i((int) (i2 * 1.0f), (int) (i3 * 1.0f), ((TLRPC.TL_photoPathSize) photoSize).svgPath);
                        if (i6 != null) {
                            i6.e(i, wjbVar, f, false);
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
