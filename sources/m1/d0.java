package m1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public class d0 implements a {
    public final File f20318a;
    public final y0 f20319b;
    public final AtomicBoolean f20320c;

    public d0(File file, y0 serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.f20318a = file;
        this.f20319b = serializer;
        this.f20320c = new AtomicBoolean(false);
    }

    public static java.lang.Object a(m1.d0 r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: m1.d0.a(m1.d0, kd.c):java.lang.Object");
    }

    @Override
    public final void close() {
        this.f20320c.set(true);
    }
}
