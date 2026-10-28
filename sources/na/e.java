package na;

import a8.b0;
import a8.i0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class e implements ka.e {
    public static final Charset f18744f = Charset.forName("UTF-8");
    public static final ka.c f18745g = new ka.c("key", ic.a.m(ic.a.l(d.class, new a(1))));
    public static final ka.c h = new ka.c("value", ic.a.m(ic.a.l(d.class, new a(2))));
    public static final ma.a f18746i = new ma.a(1);
    public OutputStream f18747a;
    public final HashMap f18748b;
    public final HashMap f18749c;
    public final ka.d d;
    public final i0 e = new i0(this, 1);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ka.d dVar) {
        this.f18747a = byteArrayOutputStream;
        this.f18748b = hashMap;
        this.f18749c = hashMap2;
        this.d = dVar;
    }

    public static int j(ka.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f18741a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ka.e a(ka.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void b(ka.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f18747a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ka.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f18741a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ka.e d(ka.c cVar, boolean z10) {
        c(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final ka.e e(ka.c cVar, int i10) {
        c(cVar, i10, true);
        return this;
    }

    @Override
    public final ka.e f(ka.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f18741a << 3);
            l(j10);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ka.e g(ka.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    public final void h(ka.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f18744f);
                    k(bytes.length);
                    this.f18747a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f18746i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f18747a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f18741a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                k(bArr.length);
                this.f18747a.write(bArr);
            } else {
                ka.d dVar2 = (ka.d) this.f18748b.get(obj.getClass());
                if (dVar2 != null) {
                    i(dVar2, cVar, obj, z10);
                    return;
                }
                ka.f fVar = (ka.f) this.f18749c.get(obj.getClass());
                if (fVar != null) {
                    i0 i0Var = this.e;
                    i0Var.f539b = false;
                    i0Var.d = cVar;
                    i0Var.f540c = z10;
                    fVar.a(obj, i0Var);
                } else if (obj instanceof b) {
                    c(cVar, ((b) obj).a(), true);
                } else if (obj instanceof Enum) {
                    c(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    i(this.d, cVar, obj, z10);
                }
            }
        }
    }

    public final void i(ka.d dVar, ka.c cVar, Object obj, boolean z10) {
        b0 b0Var = new b0(1);
        b0Var.f367b = 0L;
        try {
            OutputStream outputStream = this.f18747a;
            this.f18747a = b0Var;
            dVar.a(obj, this);
            this.f18747a = outputStream;
            long j10 = b0Var.f367b;
            b0Var.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                b0Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f18747a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f18747a.write(i10 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f18747a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f18747a.write(((int) j10) & 127);
    }
}
