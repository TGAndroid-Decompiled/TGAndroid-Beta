package org.telegram.messenger;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class u5 {
    public static mz a(int i7) {
        try {
            mz mzVar = new mz();
            ez ezVar = new ez(256.0f, 256.0f, 204.8f);
            mzVar.f25653a.add(ezVar);
            mzVar.f25654b.put(ezVar, new Paint(1));
            mzVar.f25656e = 512;
            mzVar.f25657f = 512;
            mzVar.f(i7, null, 0.65f, false);
            return mzVar;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static mz b(int i7) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        mz mzVar = new mz();
        mzVar.f25653a.add(path);
        mzVar.f25654b.put(path, new Paint(1));
        mzVar.f25656e = 512;
        mzVar.f25657f = 512;
        mzVar.f(i7, null, 1.0f, false);
        return mzVar;
    }

    public static mz c(float f10, int i7) {
        mz h = nz.h(2131624085, -65536);
        if (h != null) {
            h.f(i7, null, f10, false);
        }
        return h;
    }

    public static mz d(ArrayList arrayList, int i7, float f10, boolean z10) {
        int size = arrayList.size();
        int i10 = 512;
        int i11 = 512;
        TLRPC.TL_photoPathSize tL_photoPathSize = null;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i12);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                tL_photoPathSize = (TLRPC.TL_photoPathSize) photoSize;
            } else if ((photoSize instanceof TLRPC.TL_photoSize) && z10) {
                i10 = photoSize.f28423w;
                i11 = photoSize.h;
            }
        }
        if (tL_photoPathSize == null || i10 == 0 || i11 == 0) {
            return null;
        }
        mz j3 = nz.j(i10, i11, tL_photoPathSize.svgPath);
        if (j3 != null) {
            j3.f(i7, null, f10, false);
        }
        return j3;
    }

    public static mz e(TLRPC.Document document, int i7, float f10) {
        return f(document, i7, f10, null);
    }

    public static mz f(TLRPC.Document document, int i7, float f10, org.telegram.ui.ActionBar.h6 h6Var) {
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
                            i10 = documentAttribute.f28405w;
                            i11 = documentAttribute.h;
                            break;
                        }
                    }
                    i10 = 512;
                    i11 = 512;
                    if (i10 != 0 && i11 != 0) {
                        mz j3 = nz.j((int) (i10 * 1.0f), (int) (i11 * 1.0f), ((TLRPC.TL_photoPathSize) photoSize).svgPath);
                        if (j3 != null) {
                            j3.f(i7, h6Var, f10, false);
                        }
                        return j3;
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
