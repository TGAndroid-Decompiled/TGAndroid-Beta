package l1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
public class d0 implements a {
    public final File f17517a;
    public final z0 f17518b;
    public final AtomicBoolean f17519c;

    public d0(File file, z0 serializer) {
        kotlin.jvm.internal.j.e(serializer, "serializer");
        this.f17517a = file;
        this.f17518b = serializer;
        this.f17519c = new AtomicBoolean(false);
    }

    public static java.lang.Object a(l1.d0 r7, hd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: l1.d0.a(l1.d0, hd.c):java.lang.Object");
    }

    @Override
    public final void close() {
        this.f17519c.set(true);
    }
}
