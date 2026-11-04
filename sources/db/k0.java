package db;

import b8.ge;
import java.io.FileInputStream;
import java.io.IOException;
public final class k0 implements l1.z0 {
    public final u0 f8698a;

    public k0(u0 sessionGenerator) {
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        this.f8698a = sessionGenerator;
    }

    @Override
    public final Object a() {
        return new j0(this.f8698a.a(null), null, null);
    }

    @Override
    public final void b(Object obj, l1.h1 h1Var) {
        byte[] bytes = me.b.d.b(j0.Companion.serializer(), (j0) obj).getBytes(ud.a.f55807a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        h1Var.write(bytes);
    }

    @Override
    public final Object c(FileInputStream fileInputStream) {
        try {
            me.b bVar = me.b.d;
            String str = new String(ge.b(fileInputStream), ud.a.f55807a);
            bVar.getClass();
            return (j0) bVar.a(j0.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new IOException("Cannot parse session data", e10);
        }
    }
}
