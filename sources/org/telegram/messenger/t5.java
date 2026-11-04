package org.telegram.messenger;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class t5 {
    public static jz a(int i3) {
        try {
            jz jzVar = new jz();
            cz czVar = new cz(256.0f, 256.0f, 204.8f);
            jzVar.f23760a.add(czVar);
            jzVar.f23761b.put(czVar, new Paint(1));
            jzVar.f23763e = 512;
            jzVar.f23764f = 512;
            jzVar.f(i3, null, 0.65f, false);
            return jzVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static jz b(int i3) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        jz jzVar = new jz();
        jzVar.f23760a.add(path);
        jzVar.f23761b.put(path, new Paint(1));
        jzVar.f23763e = 512;
        jzVar.f23764f = 512;
        jzVar.f(i3, null, 1.0f, false);
        return jzVar;
    }

    public static jz c(float f10, int i3) {
        jz h = kz.h(2131624084, -65536);
        if (h != null) {
            h.f(i3, null, f10, false);
        }
        return h;
    }

    public static jz d(ArrayList arrayList, int i3, float f10, boolean z10) {
        int size = arrayList.size();
        int i10 = 512;
        int i11 = 512;
        TLRPC.TL_photoPathSize tL_photoPathSize = null;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i12);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                tL_photoPathSize = (TLRPC.TL_photoPathSize) photoSize;
            } else if ((photoSize instanceof TLRPC.TL_photoSize) && z10) {
                i10 = photoSize.f27026w;
                i11 = photoSize.h;
            }
        }
        if (tL_photoPathSize == null || i10 == 0 || i11 == 0) {
            return null;
        }
        jz j10 = kz.j(i10, i11, tL_photoPathSize.svgPath);
        if (j10 != null) {
            j10.f(i3, null, f10, false);
        }
        return j10;
    }

    public static jz e(TLRPC.Document document, int i3, float f10) {
        return f(document, i3, f10, null);
    }

    public static jz f(TLRPC.Document document, int i3, float f10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        if (document != null) {
            int size = document.thumbs.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i12);
                if (photoSize instanceof TLRPC.TL_photoPathSize) {
                    int size2 = document.attributes.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                        if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            i10 = documentAttribute.f27008w;
                            i11 = documentAttribute.h;
                            break;
                        }
                    }
                    i10 = 512;
                    i11 = 512;
                    if (i10 != 0 && i11 != 0) {
                        jz j10 = kz.j((int) (i10 * 1.0f), (int) (i11 * 1.0f), ((TLRPC.TL_photoPathSize) photoSize).svgPath);
                        if (j10 != null) {
                            j10.f(i3, e6Var, f10, false);
                        }
                        return j10;
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
