package og;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class m0 {
    public static final m0 e;
    public static final List f14421f;
    public static final List f14422g;
    public static ArrayList h;
    public static boolean f14423i;
    public final String f14424a;
    public final String f14425b;
    public final String f14426c;
    public final n7.a1 d;

    static {
        m0 m0Var = new m0("roboto", "PhotoEditorTypefaceRoboto", new n7.a1(new n2.l(5)));
        e = m0Var;
        f14421f = Arrays.asList(m0Var, new m0("italic", "PhotoEditorTypefaceItalic", new n7.a1(new n2.l(6))), new m0("serif", "PhotoEditorTypefaceSerif", new n7.a1(new n2.l(7))), new m0("condensed", "PhotoEditorTypefaceCondensed", new n7.a1(new n2.l(8))), new m0("mono", "PhotoEditorTypefaceMono", new n7.a1(new n2.l(9))), new m0("mw_bold", "PhotoEditorTypefaceMerriweather", new n7.a1(new n2.l(10))));
        f14422g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public m0(String str, String str2, n7.a1 a1Var) {
        this.f14424a = str;
        this.f14425b = str2;
        this.f14426c = null;
        this.d = a1Var;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: og.m0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f14423i) {
                f14423i = true;
                Utilities.themeQueue.postRunnable(new bi.f0(10));
            }
            return f14421f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, l0 l0Var) {
        Charset charset;
        if (l0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + l0Var.d);
        byte[] bArr = new byte[l0Var.f14417c];
        randomAccessFile.read(bArr);
        if (l0Var.f14415a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n7.a1 a1Var = this.d;
        if (((Typeface) a1Var.f13939c) == null) {
            a1Var.f13939c = ((k0) a1Var.f13938b).a();
        }
        return (Typeface) a1Var.f13939c;
    }

    public m0(Font font, String str) {
        this.f14424a = str;
        this.f14426c = str;
        this.f14425b = null;
        this.d = new n7.a1(new hi.y1(font, 29));
    }
}
