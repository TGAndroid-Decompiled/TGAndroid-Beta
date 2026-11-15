package ca;

import java.io.File;
import java.nio.charset.Charset;
public final class o implements d {
    public static final Charset f4855c = Charset.forName("UTF-8");
    public final File f4856a;
    public m f4857b;

    public o(File file) {
        this.f4856a = file;
    }

    @Override
    public final void b() {
        aa.g.b(this.f4857b, "There was a problem closing the Crashlytics log file.");
        this.f4857b = null;
    }

    @Override
    public final java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: ca.o.n():java.lang.String");
    }
}
