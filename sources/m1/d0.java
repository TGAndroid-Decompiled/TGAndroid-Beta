package m1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public class d0 implements a {
    public final File f19357a;
    public final y0 f19358b;
    public final AtomicBoolean f19359c;

    public d0(File file, y0 serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.f19357a = file;
        this.f19358b = serializer;
        this.f19359c = new AtomicBoolean(false);
    }

    public static java.lang.Object a(m1.d0 r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: m1.d0.a(m1.d0, kd.c):java.lang.Object");
    }

    @Override
    public final void close() {
        this.f19359c.set(true);
    }
}
