package f9;

import java.io.File;
import java.nio.charset.Charset;
public final class m implements c {
    public static final Charset f6022c = Charset.forName("UTF-8");
    public final File f6023a;
    public k f6024b;

    public m(File file) {
        this.f6023a = file;
    }

    @Override
    public final void b() {
        e9.h.c(this.f6024b, "There was a problem closing the Crashlytics log file.");
        this.f6024b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: f9.m.c():java.lang.String");
    }
}
