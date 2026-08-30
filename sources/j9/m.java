package j9;

import java.io.File;
import java.nio.charset.Charset;
public final class m implements c {
    public static final Charset f9342c = Charset.forName("UTF-8");
    public final File f9343a;
    public k f9344b;

    public m(File file) {
        this.f9343a = file;
    }

    @Override
    public final void a() {
        i9.h.c(this.f9344b, "There was a problem closing the Crashlytics log file.");
        this.f9344b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: j9.m.c():java.lang.String");
    }
}
