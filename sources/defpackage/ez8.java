package defpackage;

import java.io.File;
import java.nio.charset.Charset;
public final class ez8 implements gc4 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public dz8 b;

    public ez8(File file) {
        this.a = file;
    }

    @Override
    public final void a() {
        bo2.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    @Override
    public final java.lang.String b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez8.b():java.lang.String");
    }
}
