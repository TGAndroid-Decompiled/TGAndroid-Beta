package ca;

import java.io.File;
import java.nio.charset.Charset;
public final class o implements d {
    public static final Charset f6033c = Charset.forName("UTF-8");
    public final File f6034a;
    public m f6035b;

    public o(File file) {
        this.f6034a = file;
    }

    @Override
    public final void b() {
        aa.g.b(this.f6035b, "There was a problem closing the Crashlytics log file.");
        this.f6035b = null;
    }

    @Override
    public final java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: ca.o.m():java.lang.String");
    }
}
