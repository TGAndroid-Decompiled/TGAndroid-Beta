package org.telegram.messenger;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class v5 {
    public static d00 a(int i10) {
        try {
            d00 d00Var = new d00();
            wz wzVar = new wz(256.0f, 256.0f, 204.8f);
            d00Var.f15261a.add(wzVar);
            d00Var.f15262b.put(wzVar, new Paint(1));
            d00Var.e = 512;
            d00Var.f15264f = 512;
            d00Var.f(i10, null, 0.65f, false);
            return d00Var;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static d00 b(int i10) {
        Path path = new Path();
        path.addRect(0.0f, 0.0f, 512.0f, 512.0f, Path.Direction.CW);
        path.close();
        d00 d00Var = new d00();
        d00Var.f15261a.add(path);
        d00Var.f15262b.put(path, new Paint(1));
        d00Var.e = 512;
        d00Var.f15264f = 512;
        d00Var.f(i10, null, 1.0f, false);
        return d00Var;
    }

    public static d00 c(float f7, int i10) {
        d00 h = e00.h(2131624082, -65536);
        if (h != null) {
            h.f(i10, null, f7, false);
        }
        return h;
    }

    public static d00 d(ArrayList arrayList, int i10, float f7, boolean z10) {
        int size = arrayList.size();
        int i11 = 512;
        int i12 = 512;
        TLRPC.TL_photoPathSize tL_photoPathSize = null;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i13);
            if (photoSize instanceof TLRPC.TL_photoPathSize) {
                tL_photoPathSize = (TLRPC.TL_photoPathSize) photoSize;
            } else if ((photoSize instanceof TLRPC.TL_photoSize) && z10) {
                i11 = photoSize.f19819w;
                i12 = photoSize.h;
            }
        }
        if (tL_photoPathSize == null || i11 == 0 || i12 == 0) {
            return null;
        }
        d00 j10 = e00.j(i11, i12, tL_photoPathSize.svgPath);
        if (j10 != null) {
            j10.f(i10, null, f7, false);
        }
        return j10;
    }

    public static d00 e(TLRPC.Document document, int i10, float f7) {
        return f(document, i10, f7, null);
    }

    public static d00 f(TLRPC.Document document, int i10, float f7, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        int i12;
        if (document != null) {
            int size = document.thumbs.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i13);
                if (photoSize instanceof TLRPC.TL_photoPathSize) {
                    int size2 = document.attributes.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                        if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            i11 = documentAttribute.f19801w;
                            i12 = documentAttribute.h;
                            break;
                        }
                    }
                    i11 = 512;
                    i12 = 512;
                    if (i11 != 0 && i12 != 0) {
                        d00 j10 = e00.j((int) (i11 * 1.0f), (int) (i12 * 1.0f), ((TLRPC.TL_photoPathSize) photoSize).svgPath);
                        if (j10 != null) {
                            j10.f(i10, p6Var, f7, false);
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
