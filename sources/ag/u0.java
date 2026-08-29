package ag;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class u0 {
    public static final u0 f670e;
    public static final List f671f;
    public static final List f672g;
    public static ArrayList h;
    public static boolean f673i;
    public final String f674a;
    public final String f675b;
    public final String f676c;
    public final ze.b d;

    static {
        u0 u0Var = new u0("roboto", "PhotoEditorTypefaceRoboto", new ze.b(new a9.f(3)));
        f670e = u0Var;
        f671f = Arrays.asList(u0Var, new u0("italic", "PhotoEditorTypefaceItalic", new ze.b(new a9.f(4))), new u0("serif", "PhotoEditorTypefaceSerif", new ze.b(new a9.f(5))), new u0("condensed", "PhotoEditorTypefaceCondensed", new ze.b(new a9.f(6))), new u0("mono", "PhotoEditorTypefaceMono", new ze.b(new a9.f(7))), new u0("mw_bold", "PhotoEditorTypefaceMerriweather", new ze.b(new a9.f(8))));
        f672g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public u0(String str, String str2, ze.b bVar) {
        this.f674a = str;
        this.f675b = str2;
        this.f676c = null;
        this.d = bVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: ag.u0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f673i) {
                f673i = true;
                Utilities.themeQueue.postRunnable(new o0(0));
            }
            return f671f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, t0 t0Var) {
        Charset charset;
        if (t0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + t0Var.d);
        byte[] bArr = new byte[t0Var.f657c];
        randomAccessFile.read(bArr);
        if (t0Var.f655a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        ze.b bVar = this.d;
        if (((Typeface) bVar.f50825b) == null) {
            bVar.f50825b = ((s0) bVar.f50824a).a();
        }
        return (Typeface) bVar.f50825b;
    }

    public u0(Font font, String str) {
        this.f674a = str;
        this.f676c = str;
        this.f675b = null;
        this.d = new ze.b(new a1.c(font, 3));
    }
}
