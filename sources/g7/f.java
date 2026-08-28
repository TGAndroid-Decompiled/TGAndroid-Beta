package g7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class f implements q9.e {
    public static final Charset f7167f = Charset.forName("UTF-8");
    public static final q9.c f7168g = new q9.c("key", ta.b.g(e2.c.r(d.class, new a(1))));
    public static final q9.c h = new q9.c("value", ta.b.g(e2.c.r(d.class, new a(2))));
    public static final e f7169i = e.f7159b;
    public OutputStream f7170a;
    public final HashMap f7171b;
    public final HashMap f7172c;
    public final q9.d d;
    public final f7.l f7173e = new f7.l(this, 1);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, q9.d dVar) {
        this.f7170a = byteArrayOutputStream;
        this.f7171b = hashMap;
        this.f7172c = hashMap2;
        this.d = dVar;
    }

    public static int i(q9.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f7121a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final q9.e a(q9.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final q9.e b(q9.c cVar, double d) {
        e(cVar, d, true);
        return this;
    }

    @Override
    public final q9.e c(q9.c cVar, int i9) {
        h(cVar, i9, true);
        return this;
    }

    @Override
    public final q9.e d(q9.c cVar, long j10) {
        if (j10 != 0) {
            d dVar = (d) cVar.b(d.class);
            if (dVar != null) {
                k(((a) dVar).f7121a << 3);
                l(j10);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    public final void e(q9.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f7170a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void f(q9.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f7167f);
                    k(bytes.length);
                    this.f7170a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    f(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f7169i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                e(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f7170a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f7121a << 3);
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
                this.f7170a.write(bArr);
            } else {
                q9.d dVar2 = (q9.d) this.f7171b.get(obj.getClass());
                if (dVar2 != null) {
                    j(dVar2, cVar, obj, z10);
                    return;
                }
                q9.f fVar = (q9.f) this.f7172c.get(obj.getClass());
                if (fVar != null) {
                    f7.l lVar = this.f7173e;
                    lVar.f5735b = false;
                    lVar.d = cVar;
                    lVar.f5736c = z10;
                    fVar.a(obj, lVar);
                } else if (obj instanceof b) {
                    h(cVar, ((b) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z10);
                }
            }
        }
    }

    @Override
    public final q9.e g(q9.c cVar, Object obj) {
        f(cVar, obj, true);
        return this;
    }

    public final void h(q9.c cVar, int i9, boolean z10) {
        if (z10 && i9 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f7121a << 3);
            k(i9);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(q9.d dVar, q9.c cVar, Object obj, boolean z10) {
        f7.f fVar = new f7.f(1);
        fVar.f5655b = 0L;
        try {
            OutputStream outputStream = this.f7170a;
            this.f7170a = fVar;
            dVar.a(obj, this);
            this.f7170a = outputStream;
            long j10 = fVar.f5655b;
            fVar.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th) {
            try {
                fVar.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final void k(int i9) {
        while (true) {
            int i10 = ((i9 & (-128)) > 0L ? 1 : ((i9 & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f7170a;
            if (i10 != 0) {
                outputStream.write((i9 & 127) | 128);
                i9 >>>= 7;
            } else {
                outputStream.write(i9 & 127);
                return;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            int i9 = (((-128) & j10) > 0L ? 1 : (((-128) & j10) == 0L ? 0 : -1));
            OutputStream outputStream = this.f7170a;
            if (i9 != 0) {
                outputStream.write((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } else {
                outputStream.write(((int) j10) & 127);
                return;
            }
        }
    }
}
