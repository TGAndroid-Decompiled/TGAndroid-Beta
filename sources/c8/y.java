package c8;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class y implements na.e {
    public static final Charset f4783f = Charset.forName("UTF-8");
    public static final na.c f4784g = new na.c("key", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c h = new na.c("value", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final x f4785i = x.f4752b;
    public OutputStream f4786a;
    public final HashMap f4787b;
    public final HashMap f4788c;
    public final na.d d;
    public final a8.r0 f4789e = new a8.r0(this, 1);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, na.d dVar) {
        this.f4786a = byteArrayOutputStream;
        this.f4787b = hashMap;
        this.f4788c = hashMap2;
        this.d = dVar;
    }

    public static int i(na.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).f4659a;
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
            w wVar = (w) cVar.b(w.class);
            if (wVar != null) {
                k(((s) wVar).f4659a << 3);
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
        this.f4786a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(na.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f4783f);
                    k(bytes.length);
                    this.f4786a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    g(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f4785i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f4786a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    w wVar = (w) cVar.b(w.class);
                    if (wVar != null) {
                        k(((s) wVar).f4659a << 3);
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
                this.f4786a.write(bArr);
            } else {
                na.d dVar = (na.d) this.f4787b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                na.f fVar = (na.f) this.f4788c.get(obj.getClass());
                if (fVar != null) {
                    a8.r0 r0Var = this.f4789e;
                    r0Var.f604b = false;
                    r0Var.d = cVar;
                    r0Var.f605c = z10;
                    fVar.a(obj, r0Var);
                } else if (obj instanceof u) {
                    h(cVar, ((u) obj).zza(), true);
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
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            k(((s) wVar).f4659a << 3);
            k(i7);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(na.d dVar, na.c cVar, Object obj, boolean z10) {
        a8.k0 k0Var = new a8.k0(1);
        k0Var.f506b = 0L;
        try {
            OutputStream outputStream = this.f4786a;
            this.f4786a = k0Var;
            dVar.a(obj, this);
            this.f4786a = outputStream;
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
        while (true) {
            int i10 = i7 & 127;
            if ((i7 & (-128)) != 0) {
                this.f4786a.write(i10 | 128);
                i7 >>>= 7;
            } else {
                this.f4786a.write(i10);
                return;
            }
        }
    }

    public final void l(long j3) {
        while (true) {
            int i7 = ((int) j3) & 127;
            if (((-128) & j3) != 0) {
                this.f4786a.write(i7 | 128);
                j3 >>>= 7;
            } else {
                this.f4786a.write(i7);
                return;
            }
        }
    }
}
