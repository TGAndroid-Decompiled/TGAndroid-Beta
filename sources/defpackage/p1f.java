package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
public abstract class p1f {
    public static go4 e(go4[] go4VarArr, int i) {
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
        go4 go4Var = null;
        int i4 = Integer.MAX_VALUE;
        for (go4 go4Var2 : go4VarArr) {
            int abs = Math.abs(go4Var2.c - i2) << 1;
            if (go4Var2.d == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (go4Var == null || i4 > i5) {
                go4Var = go4Var2;
                i4 = i5;
            }
        }
        return go4Var;
    }

    public abstract Typeface a(Context context, co4 co4Var, Resources resources, int i);

    public abstract Typeface b(Context context, go4[] go4VarArr, int i);

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File c = r1f.c(context);
        Typeface typeface = null;
        if (c == null) {
            return null;
        }
        try {
            if (r1f.a(c, resources, i)) {
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
