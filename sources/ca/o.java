package ca;

import java.io.File;
import java.nio.charset.Charset;
public final class o implements d {
    public static final Charset f5140c = Charset.forName("UTF-8");
    public final File f5141a;
    public m f5142b;

    public o(File file) {
        this.f5141a = file;
    }

    @Override
    public final void f() {
        aa.g.b(this.f5142b, "There was a problem closing the Crashlytics log file.");
        this.f5142b = null;
    }

    @Override
    public final java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: ca.o.n():java.lang.String");
    }
}
