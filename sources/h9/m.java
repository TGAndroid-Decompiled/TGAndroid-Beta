package h9;

import java.io.File;
import java.nio.charset.Charset;
public final class m implements c {
    public static final Charset f7969c = Charset.forName("UTF-8");
    public final File f7970a;
    public k f7971b;

    public m(File file) {
        this.f7970a = file;
    }

    @Override
    public final void b() {
        g9.h.c(this.f7971b, "There was a problem closing the Crashlytics log file.");
        this.f7971b = null;
    }

    @Override
    public final java.lang.String i() {
        throw new UnsupportedOperationException("Method not decompiled: h9.m.i():java.lang.String");
    }
}
