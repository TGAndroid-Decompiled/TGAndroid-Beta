package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
public final class fs3 {
    public static final ArrayList c = new ArrayList();
    public final CharsetEncoder[] a;
    public final int b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            String str = strArr[i];
            if (((ak1) ak1.d.get(str)) != null) {
                try {
                    c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public fs3(java.lang.String r12, java.nio.charset.Charset r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs3.<init>(java.lang.String, java.nio.charset.Charset):void");
    }
}
