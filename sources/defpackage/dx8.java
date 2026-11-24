package defpackage;

import java.io.File;
import java.nio.charset.Charset;
public final class dx8 implements ga4 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public cx8 b;

    public dx8(File file) {
        this.a = file;
    }

    @Override
    public final void a() {
        pm2.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    @Override
    public final java.lang.String b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx8.b():java.lang.String");
    }
}
