package ba;

import java.io.File;
import java.nio.charset.Charset;
public final class o implements d {
    public static final Charset f3201c = Charset.forName("UTF-8");
    public final File f3202a;
    public m f3203b;

    public o(File file) {
        this.f3202a = file;
    }

    @Override
    public final java.lang.String D() {
        throw new UnsupportedOperationException("Method not decompiled: ba.o.D():java.lang.String");
    }

    @Override
    public final void b() {
        z9.g.b(this.f3203b, "There was a problem closing the Crashlytics log file.");
        this.f3203b = null;
    }
}
