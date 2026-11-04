package b8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
public abstract class sc {
    public sc() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i3);

    public abstract Typeface b(Context context, o0.i[] iVarArr, int i3);

    public Typeface c(Context context, List list, int i3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = tc.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!tc.c(d, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i3, String str, int i10) {
        File d = tc.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!tc.b(d, resources, i3)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.i f(o0.i[] iVarArr, int i3) {
        int i10;
        boolean z10;
        int i11;
        new nb.a(10);
        if ((i3 & 1) == 0) {
            i10 = 400;
        } else {
            i10 = 700;
        }
        if ((i3 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0.i iVar = null;
        int i12 = Integer.MAX_VALUE;
        for (o0.i iVar2 : iVarArr) {
            int abs = Math.abs(iVar2.f20496c - i10) * 2;
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
