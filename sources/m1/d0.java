package m1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public class d0 implements a {
    public final File f19354a;
    public final y0 f19355b;
    public final AtomicBoolean f19356c;

    public d0(File file, y0 serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.f19354a = file;
        this.f19355b = serializer;
        this.f19356c = new AtomicBoolean(false);
    }

    public static java.lang.Object a(m1.d0 r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: m1.d0.a(m1.d0, kd.c):java.lang.Object");
    }

    @Override
    public final void close() {
        this.f19356c.set(true);
    }
}
