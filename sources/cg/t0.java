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
    public static final List f2526f;
    public static final List f2527g;
    public static ArrayList h;
    public static boolean f2528i;
    public final String f2529a;
    public final String f2530b;
    public final String f2531c;
    public final bf.b d;

    static {
        t0 t0Var = new t0("roboto", "PhotoEditorTypefaceRoboto", new bf.b(new androidx.emoji2.text.w(9), 18));
        e = t0Var;
        f2526f = Arrays.asList(t0Var, new t0("italic", "PhotoEditorTypefaceItalic", new bf.b(new androidx.emoji2.text.w(10), 18)), new t0("serif", "PhotoEditorTypefaceSerif", new bf.b(new androidx.emoji2.text.w(11), 18)), new t0("condensed", "PhotoEditorTypefaceCondensed", new bf.b(new androidx.emoji2.text.w(12), 18)), new t0("mono", "PhotoEditorTypefaceMono", new bf.b(new androidx.emoji2.text.w(13), 18)), new t0("mw_bold", "PhotoEditorTypefaceMerriweather", new bf.b(new androidx.emoji2.text.w(14), 18)));
        f2527g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public t0(String str, String str2, bf.b bVar) {
        this.f2529a = str;
        this.f2530b = str2;
        this.f2531c = null;
        this.d = bVar;
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
            if (arrayList == null && !f2528i) {
                f2528i = true;
                Utilities.themeQueue.postRunnable(new n0(0));
            }
            return f2526f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, s0 s0Var) {
        Charset charset;
        if (s0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + s0Var.d);
        byte[] bArr = new byte[s0Var.f2515c];
        randomAccessFile.read(bArr);
        if (s0Var.f2513a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        bf.b bVar = this.d;
        if (((Typeface) bVar.f1783c) == null) {
            bVar.f1783c = ((r0) bVar.f1782b).a();
        }
        return (Typeface) bVar.f1783c;
    }

    public t0(Font font, String str) {
        this.f2529a = str;
        this.f2531c = str;
        this.f2530b = null;
        this.d = new bf.b(new a1.c(font, 4), 18);
    }
}
