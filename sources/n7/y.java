package n7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class y implements u9.e {
    public static final Charset f14815f = Charset.forName("UTF-8");
    public static final u9.c f14816g = new u9.c("key", vh.v2.h(kh.a2.p(w.class, new s(1))));
    public static final u9.c h = new u9.c("value", vh.v2.h(kh.a2.p(w.class, new s(2))));
    public static final x f14817i = x.f14784b;
    public OutputStream f14818a;
    public final HashMap f14819b;
    public final HashMap f14820c;
    public final u9.d d;
    public final j7.l e = new j7.l(this, 3);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, u9.d dVar) {
        this.f14818a = byteArrayOutputStream;
        this.f14819b = hashMap;
        this.f14820c = hashMap2;
        this.d = dVar;
    }

    public static int i(u9.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).f14719a;
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
            w wVar = (w) cVar.b(w.class);
            if (wVar != null) {
                k(((s) wVar).f14719a << 3);
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
        this.f14818a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(u9.c cVar, Object obj, boolean z4) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z4 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f14815f);
                    k(bytes.length);
                    this.f14818a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    g(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f14817i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z4);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z4 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f14818a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z4 || longValue != 0) {
                    w wVar = (w) cVar.b(w.class);
                    if (wVar != null) {
                        k(((s) wVar).f14719a << 3);
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
                this.f14818a.write(bArr);
            } else {
                u9.d dVar = (u9.d) this.f14819b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z4);
                    return;
                }
                u9.f fVar = (u9.f) this.f14820c.get(obj.getClass());
                if (fVar != null) {
                    j7.l lVar = this.e;
                    lVar.f9069b = false;
                    lVar.d = cVar;
                    lVar.f9070c = z4;
                    fVar.a(obj, lVar);
                } else if (obj instanceof u) {
                    h(cVar, ((u) obj).zza(), true);
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
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            k(((s) wVar).f14719a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(u9.d dVar, u9.c cVar, Object obj, boolean z4) {
        j7.f fVar = new j7.f(3);
        fVar.f8990b = 0L;
        try {
            OutputStream outputStream = this.f14818a;
            this.f14818a = fVar;
            dVar.a(obj, this);
            this.f14818a = outputStream;
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
            int i11 = i10 & 127;
            if ((i10 & (-128)) != 0) {
                this.f14818a.write(i11 | 128);
                i10 >>>= 7;
            } else {
                this.f14818a.write(i11);
                return;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) != 0) {
                this.f14818a.write(i10 | 128);
                j10 >>>= 7;
            } else {
                this.f14818a.write(i10);
                return;
            }
        }
    }
}
