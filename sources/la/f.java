package la;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class f implements ia.e {
    public static final Charset f14143f = Charset.forName("UTF-8");
    public static final ia.c f14144g = new ia.c("key", hg.c.m(hg.c.l(e.class, new a(1))));
    public static final ia.c h = new ia.c("value", hg.c.m(hg.c.l(e.class, new a(2))));
    public static final ka.a f14145i = new ka.a(1);
    public OutputStream f14146a;
    public final HashMap f14147b;
    public final HashMap f14148c;
    public final ia.d d;
    public final i e = new i(this, 0);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ia.d dVar) {
        this.f14146a = byteArrayOutputStream;
        this.f14147b = hashMap;
        this.f14148c = hashMap2;
        this.d = dVar;
    }

    public static int j(ia.c cVar) {
        e eVar = (e) cVar.b(e.class);
        if (eVar != null) {
            return ((a) eVar).f14138a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ia.e a(ia.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void b(ia.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f14146a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override
    public final ia.e c(ia.c cVar, boolean z10) {
        d(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void d(ia.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e eVar = (e) cVar.b(e.class);
        if (eVar != null) {
            k(((a) eVar).f14138a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ia.e e(ia.c cVar, int i10) {
        d(cVar, i10, true);
        return this;
    }

    @Override
    public final ia.e f(ia.c cVar, long j3) {
        if (j3 == 0) {
            return this;
        }
        e eVar = (e) cVar.b(e.class);
        if (eVar != null) {
            k(((a) eVar).f14138a << 3);
            l(j3);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ia.e g(ia.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    public final void h(ia.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f14143f);
                    k(bytes.length);
                    this.f14146a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f14145i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f14146a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    e eVar = (e) cVar.b(e.class);
                    if (eVar != null) {
                        k(((a) eVar).f14138a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                k(bArr.length);
                this.f14146a.write(bArr);
            } else {
                ia.d dVar = (ia.d) this.f14147b.get(obj.getClass());
                if (dVar != null) {
                    i(dVar, cVar, obj, z10);
                    return;
                }
                ia.f fVar = (ia.f) this.f14148c.get(obj.getClass());
                if (fVar != null) {
                    i iVar = this.e;
                    iVar.f14154b = false;
                    iVar.d = cVar;
                    iVar.f14155c = z10;
                    fVar.a(obj, iVar);
                } else if (obj instanceof c) {
                    d(cVar, ((c) obj).a(), true);
                } else if (obj instanceof Enum) {
                    d(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    i(this.d, cVar, obj, z10);
                }
            }
        }
    }

    public final void i(ia.d dVar, ia.c cVar, Object obj, boolean z10) {
        b bVar = new b(0);
        bVar.f14140b = 0L;
        try {
            OutputStream outputStream = this.f14146a;
            this.f14146a = bVar;
            dVar.a(obj, this);
            this.f14146a = outputStream;
            long j3 = bVar.f14140b;
            bVar.close();
            if (z10 && j3 == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j3);
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
            this.f14146a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f14146a.write(i10 & 127);
    }

    public final void l(long j3) {
        while (((-128) & j3) != 0) {
            this.f14146a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f14146a.write(((int) j3) & 127);
    }
}
