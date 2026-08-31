package j9;

import java.io.File;
import java.nio.charset.Charset;
public final class m implements c {
    public static final Charset f9977c = Charset.forName("UTF-8");
    public final File f9978a;
    public k f9979b;

    public m(File file) {
        this.f9978a = file;
    }

    @Override
    public final void a() {
        i9.h.c(this.f9979b, "There was a problem closing the Crashlytics log file.");
        this.f9979b = null;
    }

    @Override
    public final java.lang.String c() {
        throw new UnsupportedOperationException("Method not decompiled: j9.m.c():java.lang.String");
    }
}
