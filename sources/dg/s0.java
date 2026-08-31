package dg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class s0 {
    public static final s0 f4661e;
    public static final List f4662f;
    public static final List f4663g;
    public static ArrayList h;
    public static boolean f4664i;
    public final String f4665a;
    public final String f4666b;
    public final String f4667c;
    public final bf.b d;

    static {
        s0 s0Var = new s0("roboto", "PhotoEditorTypefaceRoboto", new bf.b(new androidx.emoji2.text.w(19), 24));
        f4661e = s0Var;
        f4662f = Arrays.asList(s0Var, new s0("italic", "PhotoEditorTypefaceItalic", new bf.b(new androidx.emoji2.text.w(20), 24)), new s0("serif", "PhotoEditorTypefaceSerif", new bf.b(new androidx.emoji2.text.w(21), 24)), new s0("condensed", "PhotoEditorTypefaceCondensed", new bf.b(new androidx.emoji2.text.w(22), 24)), new s0("mono", "PhotoEditorTypefaceMono", new bf.b(new androidx.emoji2.text.w(23), 24)), new s0("mw_bold", "PhotoEditorTypefaceMerriweather", new bf.b(new androidx.emoji2.text.w(24), 24)));
        f4663g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public s0(String str, String str2, bf.b bVar) {
        this.f4665a = str;
        this.f4666b = str2;
        this.f4667c = null;
        this.d = bVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: dg.s0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f4664i) {
                f4664i = true;
                Utilities.themeQueue.postRunnable(new ag.f(2));
            }
            return f4662f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, r0 r0Var) {
        Charset charset;
        if (r0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + r0Var.d);
        byte[] bArr = new byte[r0Var.f4650c];
        randomAccessFile.read(bArr);
        if (r0Var.f4648a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        bf.b bVar = this.d;
        if (((Typeface) bVar.f1936c) == null) {
            bVar.f1936c = ((q0) bVar.f1935b).a();
        }
        return (Typeface) bVar.f1936c;
    }

    public s0(Font font, String str) {
        this.f4665a = str;
        this.f4667c = str;
        this.f4666b = null;
        this.d = new bf.b(new a1.c(font, 11), 24);
    }
}
