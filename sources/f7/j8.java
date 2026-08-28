package f7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
public abstract class j8 {
    public j8() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i9);

    public abstract Typeface b(Context context, o0.i[] iVarArr, int i9);

    public Typeface c(Context context, List list, int i9) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = k8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!k8.c(inputStream, d)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i9, String str, int i10) {
        File d = k8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!k8.b(d, resources, i9)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.i f(o0.i[] iVarArr, int i9) {
        int i10;
        boolean z10;
        int i11;
        new wa.a(9);
        if ((i9 & 1) == 0) {
            i10 = 400;
        } else {
            i10 = 700;
        }
        if ((i9 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0.i iVar = null;
        int i12 = Integer.MAX_VALUE;
        for (o0.i iVar2 : iVarArr) {
            int abs = Math.abs(iVar2.f18767c - i10) * 2;
            if (iVar2.d == z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (iVar == null || i12 > i13) {
                iVar = iVar2;
                i12 = i13;
            }
        }
        return iVar;
    }
}
