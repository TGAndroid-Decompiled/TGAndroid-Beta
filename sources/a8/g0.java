package a8;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class g0 implements ka.e {
    public static final Charset f475f = Charset.forName("UTF-8");
    public static final ka.c f476g = new ka.c("key", ic.a.m(a1.g.x(e0.class, new z(1))));
    public static final ka.c h = new ka.c("value", ic.a.m(a1.g.x(e0.class, new z(2))));
    public static final f0 f477i = f0.f444b;
    public OutputStream f478a;
    public final HashMap f479b;
    public final HashMap f480c;
    public final ka.d d;
    public final i0 e = new i0(this, 0);

    public g0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ka.d dVar) {
        this.f478a = byteArrayOutputStream;
        this.f479b = hashMap;
        this.f480c = hashMap2;
        this.d = dVar;
    }

    public static int i(ka.c cVar) {
        e0 e0Var = (e0) cVar.b(e0.class);
        if (e0Var != null) {
            return ((z) e0Var).f998a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ka.e a(ka.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(ka.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f478a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ka.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f475f);
                    k(bytes.length);
                    this.f478a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    c(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f477i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f478a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    e0 e0Var = (e0) cVar.b(e0.class);
                    if (e0Var != null) {
                        k(((z) e0Var).f998a << 3);
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
                this.f478a.write(bArr);
            } else {
                ka.d dVar = (ka.d) this.f479b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                ka.f fVar = (ka.f) this.f480c.get(obj.getClass());
                if (fVar != null) {
                    i0 i0Var = this.e;
                    i0Var.f539b = false;
                    i0Var.d = cVar;
                    i0Var.f540c = z10;
                    fVar.a(obj, i0Var);
                } else if (obj instanceof c0) {
                    h(cVar, ((c0) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z10);
                }
            }
        }
    }

    @Override
    public final ka.e d(ka.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final ka.e e(ka.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override
    public final ka.e f(ka.c cVar, long j10) {
        if (j10 != 0) {
            e0 e0Var = (e0) cVar.b(e0.class);
            if (e0Var != null) {
                k(((z) e0Var).f998a << 3);
                l(j10);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    @Override
    public final ka.e g(ka.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    public final void h(ka.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e0 e0Var = (e0) cVar.b(e0.class);
        if (e0Var != null) {
            k(((z) e0Var).f998a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ka.d dVar, ka.c cVar, Object obj, boolean z10) {
        b0 b0Var = new b0(0);
        b0Var.f367b = 0L;
        try {
            OutputStream outputStream = this.f478a;
            this.f478a = b0Var;
            dVar.a(obj, this);
            this.f478a = outputStream;
            long j10 = b0Var.f367b;
            b0Var.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                b0Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void k(int i10) {
        while (true) {
            int i11 = i10 & 127;
            if ((i10 & (-128)) != 0) {
                this.f478a.write(i11 | 128);
                i10 >>>= 7;
            } else {
                this.f478a.write(i11);
                return;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) != 0) {
                this.f478a.write(i10 | 128);
                j10 >>>= 7;
            } else {
                this.f478a.write(i10);
                return;
            }
        }
    }
}
