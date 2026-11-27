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
public final class xv7 {
    public static final xv7 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final um4 d;

    static {
        xv7 xv7Var = new xv7("roboto", "PhotoEditorTypefaceRoboto", new um4((vv7) new ku7((byte) 2)));
        e = xv7Var;
        f = Arrays.asList(xv7Var, new xv7("italic", "PhotoEditorTypefaceItalic", new um4((vv7) new ku7((byte) 3))), new xv7("serif", "PhotoEditorTypefaceSerif", new um4((vv7) new ku7((byte) 4))), new xv7("condensed", "PhotoEditorTypefaceCondensed", new um4((vv7) new ku7((byte) 5))), new xv7("mono", "PhotoEditorTypefaceMono", new um4((vv7) new ku7((byte) 6))), new xv7("mw_bold", "PhotoEditorTypefaceMerriweather", new um4((vv7) new ku7((byte) 7))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public xv7(final Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new um4(new vv7() {
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
                Utilities.i.c(new pg6((byte) 11));
            }
            return f;
        }
        return arrayList;
    }

    public static void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv7.c():void");
    }

    public static String e(RandomAccessFile randomAccessFile, int i2, wv7 wv7Var) {
        Charset charset;
        if (wv7Var == null) {
            return null;
        }
        randomAccessFile.seek(i2 + wv7Var.d);
        byte[] bArr = new byte[wv7Var.c];
        randomAccessFile.read(bArr);
        if (wv7Var.a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface b() {
        um4 um4Var = this.d;
        Typeface typeface = (Typeface) um4Var.c;
        if (typeface == null) {
            Typeface a = ((vv7) um4Var.b).a();
            um4Var.c = a;
            return a;
        }
        return typeface;
    }

    public xv7(String str, String str2, um4 um4Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = um4Var;
    }
}
