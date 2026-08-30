package k7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class f implements u9.e {
    public static final Charset f9800f = Charset.forName("UTF-8");
    public static final u9.c f9801g = new u9.c("key", vh.v2.h(e2.c.o(d.class, new a(1))));
    public static final u9.c h = new u9.c("value", vh.v2.h(e2.c.o(d.class, new a(2))));
    public static final e f9802i = e.f9787b;
    public OutputStream f9803a;
    public final HashMap f9804b;
    public final HashMap f9805c;
    public final u9.d d;
    public final j7.l e = new j7.l(this, 1);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, u9.d dVar) {
        this.f9803a = byteArrayOutputStream;
        this.f9804b = hashMap;
        this.f9805c = hashMap2;
        this.d = dVar;
    }

    public static int i(u9.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f9757a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final u9.e a(u9.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override
    public final u9.e b(u9.c cVar, long j10) {
        if (j10 != 0) {
            d dVar = (d) cVar.b(d.class);
            if (dVar != null) {
                k(((a) dVar).f9757a << 3);
                l(j10);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    @Override
    public final u9.e c(u9.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override
    public final u9.e d(u9.c cVar, boolean z4) {
        h(cVar, z4 ? 1 : 0, true);
        return this;
    }

    @Override
    public final u9.e e(u9.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    public final void f(u9.c cVar, double d, boolean z4) {
        if (z4 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f9803a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(u9.c cVar, Object obj, boolean z4) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z4 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f9800f);
                    k(bytes.length);
                    this.f9803a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    g(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f9802i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z4);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z4 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f9803a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z4 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f9757a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z4 && bArr.length == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                k(bArr.length);
                this.f9803a.write(bArr);
            } else {
                u9.d dVar2 = (u9.d) this.f9804b.get(obj.getClass());
                if (dVar2 != null) {
                    j(dVar2, cVar, obj, z4);
                    return;
                }
                u9.f fVar = (u9.f) this.f9805c.get(obj.getClass());
                if (fVar != null) {
                    j7.l lVar = this.e;
                    lVar.f9069b = false;
                    lVar.d = cVar;
                    lVar.f9070c = z4;
                    fVar.a(obj, lVar);
                } else if (obj instanceof b) {
                    h(cVar, ((b) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z4);
                }
            }
        }
    }

    public final void h(u9.c cVar, int i10, boolean z4) {
        if (z4 && i10 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f9757a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(u9.d dVar, u9.c cVar, Object obj, boolean z4) {
        j7.f fVar = new j7.f(1);
        fVar.f8990b = 0L;
        try {
            OutputStream outputStream = this.f9803a;
            this.f9803a = fVar;
            dVar.a(obj, this);
            this.f9803a = outputStream;
            long j10 = fVar.f8990b;
            fVar.close();
            if (z4 && j10 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                fVar.close();
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
            int i11 = ((i10 & (-128)) > 0L ? 1 : ((i10 & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f9803a;
            if (i11 != 0) {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            } else {
                outputStream.write(i10 & 127);
                return;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            int i10 = (((-128) & j10) > 0L ? 1 : (((-128) & j10) == 0L ? 0 : -1));
            OutputStream outputStream = this.f9803a;
            if (i10 != 0) {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } else {
                outputStream.write(((int) j10) & 127);
                return;
            }
        }
    }
}
