package a8;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class q0 implements na.e {
    public static final Charset f585f = Charset.forName("UTF-8");
    public static final na.c f586g = new na.c("key", i5.c.p(p0.w(n0.class, new j0(1))));
    public static final na.c h = new na.c("value", i5.c.p(p0.w(n0.class, new j0(2))));
    public static final o0 f587i = o0.f560b;
    public OutputStream f588a;
    public final HashMap f589b;
    public final HashMap f590c;
    public final na.d d;
    public final r0 f591e = new r0(this, 0);

    public q0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, na.d dVar) {
        this.f588a = byteArrayOutputStream;
        this.f589b = hashMap;
        this.f590c = hashMap2;
        this.d = dVar;
    }

    public static int i(na.c cVar) {
        n0 n0Var = (n0) cVar.b(n0.class);
        if (n0Var != null) {
            return ((j0) n0Var).f496a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final na.e a(na.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    @Override
    public final na.e b(na.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override
    public final na.e c(na.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final na.e d(na.c cVar, int i7) {
        h(cVar, i7, true);
        return this;
    }

    @Override
    public final na.e e(na.c cVar, long j3) {
        if (j3 != 0) {
            n0 n0Var = (n0) cVar.b(n0.class);
            if (n0Var != null) {
                k(((j0) n0Var).f496a << 3);
                l(j3);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    public final void f(na.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f588a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(na.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f585f);
                    k(bytes.length);
                    this.f588a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    g(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f587i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f588a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    n0 n0Var = (n0) cVar.b(n0.class);
                    if (n0Var != null) {
                        k(((j0) n0Var).f496a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                k(bArr.length);
                this.f588a.write(bArr);
            } else {
                na.d dVar = (na.d) this.f589b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                na.f fVar = (na.f) this.f590c.get(obj.getClass());
                if (fVar != null) {
                    r0 r0Var = this.f591e;
                    r0Var.f604b = false;
                    r0Var.d = cVar;
                    r0Var.f605c = z10;
                    fVar.a(obj, r0Var);
                } else if (obj instanceof l0) {
                    h(cVar, ((l0) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z10);
                }
            }
        }
    }

    public final void h(na.c cVar, int i7, boolean z10) {
        if (z10 && i7 == 0) {
            return;
        }
        n0 n0Var = (n0) cVar.b(n0.class);
        if (n0Var != null) {
            k(((j0) n0Var).f496a << 3);
            k(i7);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(na.d dVar, na.c cVar, Object obj, boolean z10) {
        k0 k0Var = new k0(0);
        k0Var.f506b = 0L;
        try {
            OutputStream outputStream = this.f588a;
            this.f588a = k0Var;
            dVar.a(obj, this);
            this.f588a = outputStream;
            long j3 = k0Var.f506b;
            k0Var.close();
            if (z10 && j3 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j3);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                k0Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void k(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f588a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f588a.write(i7 & 127);
    }

    public final void l(long j3) {
        while (((-128) & j3) != 0) {
            this.f588a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f588a.write(((int) j3) & 127);
    }
}
