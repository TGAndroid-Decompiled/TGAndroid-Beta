package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
public abstract class vwe {
    public static bm4 e(bm4[] bm4VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        bm4 bm4Var = null;
        int i4 = Integer.MAX_VALUE;
        for (bm4 bm4Var2 : bm4VarArr) {
            int abs = Math.abs(bm4Var2.c - i2) << 1;
            if (bm4Var2.d == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (bm4Var == null || i4 > i5) {
                bm4Var = bm4Var2;
                i4 = i5;
            }
        }
        return bm4Var;
    }

    public abstract Typeface a(Context context, xl4 xl4Var, Resources resources, int i);

    public abstract Typeface b(Context context, bm4[] bm4VarArr, int i);

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File c = ywe.c(context);
        Typeface typeface = null;
        if (c == null) {
            return null;
        }
        try {
            if (ywe.a(c, resources, i)) {
                typeface = Typeface.createFromFile(c.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            c.delete();
            throw th;
        }
        c.delete();
        return typeface;
    }
}
