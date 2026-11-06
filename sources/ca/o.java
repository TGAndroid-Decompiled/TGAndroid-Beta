package ca;

import java.io.File;
import java.nio.charset.Charset;
public final class o implements d {
    public static final Charset f6030c = Charset.forName("UTF-8");
    public final File f6031a;
    public m f6032b;

    public o(File file) {
        this.f6031a = file;
    }

    @Override
    public final void b() {
        aa.g.b(this.f6032b, "There was a problem closing the Crashlytics log file.");
        this.f6032b = null;
    }

    @Override
    public final java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: ca.o.m():java.lang.String");
    }
}
