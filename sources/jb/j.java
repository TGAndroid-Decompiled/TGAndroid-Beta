package jb;

import c8.lb;
import java.io.FileInputStream;
import java.io.IOException;
import m1.g1;
import m1.y0;
public final class j implements y0 {
    public static final j f16627a = new Object();
    public static final i f16628b = new i(null, null, null, null, null);

    @Override
    public final Object a() {
        return f16628b;
    }

    @Override
    public final Object b(FileInputStream fileInputStream) {
        try {
            pe.b bVar = pe.b.d;
            String str = new String(lb.b(fileInputStream), xd.a.f58693a);
            bVar.getClass();
            return (i) bVar.a(i.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new IOException("Cannot parse session configs", e10);
        }
    }

    @Override
    public final void c(Object obj, g1 g1Var) {
        byte[] bytes = pe.b.d.b(i.Companion.serializer(), (i) obj).getBytes(xd.a.f58693a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        g1Var.write(bytes);
    }
}
