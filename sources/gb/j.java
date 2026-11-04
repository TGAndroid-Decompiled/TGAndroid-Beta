package gb;

import b8.ge;
import java.io.FileInputStream;
import java.io.IOException;
import l1.h1;
import l1.z0;
public final class j implements z0 {
    public static final j f12222a = new Object();
    public static final i f12223b = new i(null, null, null, null, null);

    @Override
    public final Object a() {
        return f12223b;
    }

    @Override
    public final void b(Object obj, h1 h1Var) {
        byte[] bytes = me.b.d.b(i.Companion.serializer(), (i) obj).getBytes(ud.a.f55807a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        h1Var.write(bytes);
    }

    @Override
    public final Object c(FileInputStream fileInputStream) {
        try {
            me.b bVar = me.b.d;
            String str = new String(ge.b(fileInputStream), ud.a.f55807a);
            bVar.getClass();
            return (i) bVar.a(i.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new IOException("Cannot parse session configs", e10);
        }
    }
}
