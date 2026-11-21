package ca;

import java.io.File;
import java.nio.charset.Charset;
public final class o implements d {
    public static final Charset f5166c = Charset.forName("UTF-8");
    public final File f5167a;
    public m f5168b;

    public o(File file) {
        this.f5167a = file;
    }

    @Override
    public final void f() {
        aa.g.b(this.f5168b, "There was a problem closing the Crashlytics log file.");
        this.f5168b = null;
    }

    @Override
    public final java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: ca.o.n():java.lang.String");
    }
}
