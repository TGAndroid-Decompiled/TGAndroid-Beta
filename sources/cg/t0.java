package cg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class t0 {
    public static final t0 e;
    public static final List f2509f;
    public static final List f2510g;
    public static ArrayList h;
    public static boolean f2511i;
    public final String f2512a;
    public final String f2513b;
    public final String f2514c;
    public final af.c d;

    static {
        t0 t0Var = new t0("roboto", "PhotoEditorTypefaceRoboto", new af.c(new af.a(9), 18));
        e = t0Var;
        f2509f = Arrays.asList(t0Var, new t0("italic", "PhotoEditorTypefaceItalic", new af.c(new af.a(10), 18)), new t0("serif", "PhotoEditorTypefaceSerif", new af.c(new af.a(11), 18)), new t0("condensed", "PhotoEditorTypefaceCondensed", new af.c(new af.a(12), 18)), new t0("mono", "PhotoEditorTypefaceMono", new af.c(new af.a(13), 18)), new t0("mw_bold", "PhotoEditorTypefaceMerriweather", new af.c(new af.a(14), 18)));
        f2510g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public t0(String str, String str2, af.c cVar) {
        this.f2512a = str;
        this.f2513b = str2;
        this.f2514c = null;
        this.d = cVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: cg.t0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f2511i) {
                f2511i = true;
                Utilities.themeQueue.postRunnable(new n0(0));
            }
            return f2509f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, s0 s0Var) {
        Charset charset;
        if (s0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + s0Var.d);
        byte[] bArr = new byte[s0Var.f2498c];
        randomAccessFile.read(bArr);
        if (s0Var.f2496a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        af.c cVar = this.d;
        if (((Typeface) cVar.f157c) == null) {
            cVar.f157c = ((r0) cVar.f156b).a();
        }
        return (Typeface) cVar.f157c;
    }

    public t0(Font font, String str) {
        this.f2512a = str;
        this.f2514c = str;
        this.f2513b = null;
        this.d = new af.c(new a1.c(font, 4), 18);
    }
}
