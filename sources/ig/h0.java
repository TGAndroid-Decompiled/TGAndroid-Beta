package ig;

import ag.f3;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class h0 {
    public static final h0 e;
    public static final List f8316f;
    public static final List f8317g;
    public static ArrayList h;
    public static boolean f8318i;
    public final String f8319a;
    public final String f8320b;
    public final String f8321c;
    public final hf.b d;

    static {
        h0 h0Var = new h0("roboto", "PhotoEditorTypefaceRoboto", new hf.b(new d2.c(22), 24));
        e = h0Var;
        f8316f = Arrays.asList(h0Var, new h0("italic", "PhotoEditorTypefaceItalic", new hf.b(new d2.c(23), 24)), new h0("serif", "PhotoEditorTypefaceSerif", new hf.b(new d2.c(24), 24)), new h0("condensed", "PhotoEditorTypefaceCondensed", new hf.b(new d2.c(25), 24)), new h0("mono", "PhotoEditorTypefaceMono", new hf.b(new d2.c(26), 24)), new h0("mw_bold", "PhotoEditorTypefaceMerriweather", new hf.b(new d2.c(27), 24)));
        f8317g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public h0(String str, String str2, hf.b bVar) {
        this.f8319a = str;
        this.f8320b = str2;
        this.f8321c = null;
        this.d = bVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: ig.h0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f8318i) {
                f8318i = true;
                Utilities.f14523i.c(new f3(3));
            }
            return f8316f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, g0 g0Var) {
        Charset charset;
        if (g0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + g0Var.d);
        byte[] bArr = new byte[g0Var.f8312c];
        randomAccessFile.read(bArr);
        if (g0Var.f8310a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        hf.b bVar = this.d;
        if (((Typeface) bVar.f7658c) == null) {
            bVar.f7658c = ((f0) bVar.f7657b).b();
        }
        return (Typeface) bVar.f7658c;
    }

    public h0(Font font, String str) {
        this.f8319a = str;
        this.f8321c = str;
        this.f8320b = null;
        this.d = new hf.b(new c0(font, 0), 24);
    }
}
