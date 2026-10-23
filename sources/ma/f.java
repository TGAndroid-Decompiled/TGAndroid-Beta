package ma;

import i2.o1;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class f implements ja.e {
    public static final Charset f16879f = Charset.forName("UTF-8");
    public static final ja.c f16880g = new ja.c("key", o1.p(o1.o(e.class, new a(1))));
    public static final ja.c h = new ja.c("value", o1.p(o1.o(e.class, new a(2))));
    public static final la.a f16881i = new la.a(1);
    public OutputStream f16882a;
    public final HashMap f16883b;
    public final HashMap f16884c;
    public final ja.d d;
    public final h e = new h(this, 0);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ja.d dVar) {
        this.f16882a = byteArrayOutputStream;
        this.f16883b = hashMap;
        this.f16884c = hashMap2;
        this.d = dVar;
    }

    public static int j(ja.c cVar) {
        e eVar = (e) cVar.b(e.class);
        if (eVar != null) {
            return ((a) eVar).f16874a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ja.e a(ja.c cVar, boolean z10) {
        c(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void b(ja.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f16882a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ja.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e eVar = (e) cVar.b(e.class);
        if (eVar != null) {
            k(((a) eVar).f16874a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ja.e d(ja.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    @Override
    public final ja.e e(ja.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    @Override
    public final ja.e f(ja.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        e eVar = (e) cVar.b(e.class);
        if (eVar != null) {
            k(((a) eVar).f16874a << 3);
            l(j10);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ja.e g(ja.c cVar, int i10) {
        c(cVar, i10, true);
        return this;
    }

    public final void h(ja.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f16879f);
                    k(bytes.length);
                    this.f16882a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f16881i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f16882a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    e eVar = (e) cVar.b(e.class);
                    if (eVar != null) {
                        k(((a) eVar).f16874a << 3);
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
                this.f16882a.write(bArr);
            } else {
                ja.d dVar = (ja.d) this.f16883b.get(obj.getClass());
                if (dVar != null) {
                    i(dVar, cVar, obj, z10);
                    return;
                }
                ja.f fVar = (ja.f) this.f16884c.get(obj.getClass());
                if (fVar != null) {
                    h hVar = this.e;
                    hVar.f16887b = false;
                    hVar.d = cVar;
                    hVar.f16888c = z10;
                    fVar.a(obj, hVar);
                } else if (obj instanceof c) {
                    c(cVar, ((c) obj).a(), true);
                } else if (obj instanceof Enum) {
                    c(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    i(this.d, cVar, obj, z10);
                }
            }
        }
    }

    public final void i(ja.d dVar, ja.c cVar, Object obj, boolean z10) {
        b bVar = new b(0);
        bVar.f16876b = 0L;
        try {
            OutputStream outputStream = this.f16882a;
            this.f16882a = bVar;
            dVar.a(obj, this);
            this.f16882a = outputStream;
            long j10 = bVar.f16876b;
            bVar.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f16882a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f16882a.write(i10 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f16882a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f16882a.write(((int) j10) & 127);
    }
}
