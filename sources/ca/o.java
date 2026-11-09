package ca;

import java.io.File;
import java.nio.charset.Charset;
public final class o implements d {
    public static final Charset f6028c = Charset.forName("UTF-8");
    public final File f6029a;
    public m f6030b;

    public o(File file) {
        this.f6029a = file;
    }

    @Override
    public final void b() {
        aa.g.b(this.f6030b, "There was a problem closing the Crashlytics log file.");
        this.f6030b = null;
    }

    @Override
    public final java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: ca.o.m():java.lang.String");
    }
}
