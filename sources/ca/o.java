package ca;

import java.io.File;
import java.nio.charset.Charset;
public final class o implements d {
    public static final Charset f5137c = Charset.forName("UTF-8");
    public final File f5138a;
    public m f5139b;

    public o(File file) {
        this.f5138a = file;
    }

    @Override
    public final void f() {
        aa.g.b(this.f5139b, "There was a problem closing the Crashlytics log file.");
        this.f5139b = null;
    }

    @Override
    public final java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: ca.o.n():java.lang.String");
    }
}
