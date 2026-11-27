package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
public final class p9a implements s8a {
    public final z9a a;

    public p9a(z9a z9aVar) {
        z9aVar.getClass();
        this.a = z9aVar;
    }

    @Override
    public final Object e() {
        return new o9a(this.a.a(null), null, null);
    }

    @Override
    public final void n(Object obj, o8c o8cVar) {
        byte[] bytes = qw5.d.b(o9a.Companion.serializer(), (o9a) obj).getBytes(kk1.a);
        bytes.getClass();
        o8cVar.a.write(bytes);
    }

    @Override
    public final Object q(FileInputStream fileInputStream) {
        try {
            qw5 qw5Var = qw5.d;
            String str = new String(sud.b(fileInputStream), kk1.a);
            sjf sjfVar = qw5Var.b;
            return (o9a) qw5Var.a(o9a.Companion.serializer(), str);
        } catch (Exception e) {
            throw new IOException("Cannot parse session data", e);
        }
    }
}
