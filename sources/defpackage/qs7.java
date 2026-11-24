package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class qs7 {
    public static final qs7 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final wk4 d;

    static {
        qs7 qs7Var = new qs7("roboto", "PhotoEditorTypefaceRoboto", new wk4((os7) new fi7((byte) 14)));
        e = qs7Var;
        f = Arrays.asList(qs7Var, new qs7("italic", "PhotoEditorTypefaceItalic", new wk4((os7) new fi7((byte) 15))), new qs7("serif", "PhotoEditorTypefaceSerif", new wk4((os7) new fi7((byte) 16))), new qs7("condensed", "PhotoEditorTypefaceCondensed", new wk4((os7) new fi7((byte) 17))), new qs7("mono", "PhotoEditorTypefaceMono", new wk4((os7) new fi7((byte) 18))), new qs7("mw_bold", "PhotoEditorTypefaceMerriweather", new wk4((os7) new fi7((byte) 19))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public qs7(final Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new wk4(new os7() {
            @Override
            public final Typeface a() {
                Typeface createFromFile;
                createFromFile = Typeface.createFromFile(font.getFile());
                return createFromFile;
            }
        });
    }

    public static List a() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !i) {
                i = true;
                Utilities.i.c(new am6((byte) 8));
            }
            return f;
        }
        return arrayList;
    }

    public static void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs7.c():void");
    }

    public static String e(RandomAccessFile randomAccessFile, int i2, ps7 ps7Var) {
        Charset charset;
        if (ps7Var == null) {
            return null;
        }
        randomAccessFile.seek(i2 + ps7Var.d);
        byte[] bArr = new byte[ps7Var.c];
        randomAccessFile.read(bArr);
        if (ps7Var.a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface b() {
        wk4 wk4Var = this.d;
        Typeface typeface = (Typeface) wk4Var.c;
        if (typeface == null) {
            Typeface a = ((os7) wk4Var.b).a();
            wk4Var.c = a;
            return a;
        }
        return typeface;
    }

    public qs7(String str, String str2, wk4 wk4Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = wk4Var;
    }
}
