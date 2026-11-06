package gb;

import c8.kb;
import java.io.FileInputStream;
import java.io.IOException;
public final class l0 implements m1.y0 {
    public final v0 f13727a;

    public l0(v0 sessionGenerator) {
        kotlin.jvm.internal.j.e(sessionGenerator, "sessionGenerator");
        this.f13727a = sessionGenerator;
    }

    @Override
    public final Object a() {
        return new k0(this.f13727a.a(null), null, null);
    }

    @Override
    public final Object b(FileInputStream fileInputStream) {
        try {
            pe.b bVar = pe.b.d;
            String str = new String(kb.b(fileInputStream), xd.a.f58564a);
            bVar.getClass();
            return (k0) bVar.a(k0.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new IOException("Cannot parse session data", e10);
        }
    }

    @Override
    public final void c(Object obj, m1.g1 g1Var) {
        byte[] bytes = pe.b.d.b(k0.Companion.serializer(), (k0) obj).getBytes(xd.a.f58564a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        g1Var.write(bytes);
    }
}
