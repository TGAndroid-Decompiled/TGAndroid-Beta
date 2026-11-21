package gb;

import c8.qb;
import java.io.FileInputStream;
import java.io.IOException;
public final class k0 implements m1.y0 {
    public final u0 f13408a;

    public k0(u0 sessionGenerator) {
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        this.f13408a = sessionGenerator;
    }

    @Override
    public final Object a() {
        return new j0(this.f13408a.a(null), null, null);
    }

    @Override
    public final Object b(FileInputStream fileInputStream) {
        try {
            pe.b bVar = pe.b.d;
            String str = new String(qb.b(fileInputStream), xd.a.f60486a);
            bVar.getClass();
            return (j0) bVar.a(j0.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new IOException("Cannot parse session data", e10);
        }
    }

    @Override
    public final void c(Object obj, m1.g1 g1Var) {
        byte[] bytes = pe.b.d.b(j0.Companion.serializer(), (j0) obj).getBytes(xd.a.f60486a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        g1Var.write(bytes);
    }
}
