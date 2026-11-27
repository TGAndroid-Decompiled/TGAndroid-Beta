package defpackage;

import java.io.File;
import java.nio.charset.Charset;
public final class q09 implements dc4 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public p09 b;

    public q09(File file) {
        this.a = file;
    }

    @Override
    public final void a() {
        jn2.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    @Override
    public final java.lang.String b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q09.b():java.lang.String");
    }
}
