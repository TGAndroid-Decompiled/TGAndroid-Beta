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
public final class ru7 {
    public static final ru7 e;
    public static final List f;
    public static final List g;
    public static ArrayList h;
    public static boolean i;
    public final String a;
    public final String b;
    public final String c;
    public final wm4 d;

    static {
        ru7 ru7Var = new ru7("roboto", "PhotoEditorTypefaceRoboto", new wm4((pu7) new bh7((byte) 16)));
        e = ru7Var;
        f = Arrays.asList(ru7Var, new ru7("italic", "PhotoEditorTypefaceItalic", new wm4((pu7) new bh7((byte) 17))), new ru7("serif", "PhotoEditorTypefaceSerif", new wm4((pu7) new bh7((byte) 18))), new ru7("condensed", "PhotoEditorTypefaceCondensed", new wm4((pu7) new bh7((byte) 19))), new ru7("mono", "PhotoEditorTypefaceMono", new wm4((pu7) new bh7((byte) 20))), new ru7("mw_bold", "PhotoEditorTypefaceMerriweather", new wm4((pu7) new bh7((byte) 21))));
        g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public ru7(final Font font, String str) {
        this.a = str;
        this.c = str;
        this.b = null;
        this.d = new wm4(new pu7() {
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
                Utilities.i.c(new bo6((byte) 8));
            }
            return f;
        }
        return arrayList;
    }

    public static void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru7.c():void");
    }

    public static String e(RandomAccessFile randomAccessFile, int i2, qu7 qu7Var) {
        Charset charset;
        if (qu7Var == null) {
            return null;
        }
        randomAccessFile.seek(i2 + qu7Var.d);
        byte[] bArr = new byte[qu7Var.c];
        randomAccessFile.read(bArr);
        if (qu7Var.a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface b() {
        wm4 wm4Var = this.d;
        Typeface typeface = (Typeface) wm4Var.c;
        if (typeface == null) {
            Typeface a = ((pu7) wm4Var.b).a();
            wm4Var.c = a;
            return a;
        }
        return typeface;
    }

    public ru7(String str, String str2, wm4 wm4Var) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = wm4Var;
    }
}
