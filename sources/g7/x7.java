package g7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;

public abstract class x7 {
    public x7() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i10);

    public abstract Typeface b(Context context, o0.j[] jVarArr, int i10);

    public Typeface c(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File fileD = y7.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (y7.c(inputStream, fileD)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File fileD = y7.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (y7.b(fileD, resources, i10)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public o0.j f(o0.j[] jVarArr, int i10) {
        new e7.v(9);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        o0.j jVar = null;
        int i12 = Integer.MAX_VALUE;
        for (o0.j jVar2 : jVarArr) {
            int iAbs = (Math.abs(jVar2.f19111c - i11) * 2) + (jVar2.d == z10 ? 0 : 1);
            if (jVar == null || i12 > iAbs) {
                jVar = jVar2;
                i12 = iAbs;
            }
        }
        return jVar;
    }
}
