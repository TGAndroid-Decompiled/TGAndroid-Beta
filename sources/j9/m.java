package j9;

import java.io.File;
import java.nio.charset.Charset;
public final class m implements c {
    public static final Charset f9324c = Charset.forName("UTF-8");
    public final File f9325a;
    public k f9326b;

    public m(File file) {
        this.f9325a = file;
    }

    @Override
    public final void a() {
        i9.h.c(this.f9326b, "There was a problem closing the Crashlytics log file.");
        this.f9326b = null;
    }

    @Override
    public final java.lang.String d() {
        throw new UnsupportedOperationException("Method not decompiled: j9.m.d():java.lang.String");
    }
}
