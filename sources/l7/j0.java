package l7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class j0 implements u9.e {
    public static final Charset f11883f = Charset.forName("UTF-8");
    public static final u9.c f11884g = new u9.c("key", w.c.h(l.d.o(h0.class, new e0(1))));
    public static final u9.c h = new u9.c("value", w.c.h(l.d.o(h0.class, new e0(2))));
    public static final i0 f11885i = i0.f11872b;
    public OutputStream f11886a;
    public final HashMap f11887b;
    public final HashMap f11888c;
    public final u9.d d;
    public final j7.l f11889e = new j7.l(this, 2);

    public j0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, u9.d dVar) {
        this.f11886a = byteArrayOutputStream;
        this.f11887b = hashMap;
        this.f11888c = hashMap2;
        this.d = dVar;
    }

    public static int i(u9.c cVar) {
        h0 h0Var = (h0) cVar.b(h0.class);
        if (h0Var != null) {
            return ((e0) h0Var).f11834a;
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
            h0 h0Var = (h0) cVar.b(h0.class);
            if (h0Var != null) {
                k(((e0) h0Var).f11834a << 3);
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
        this.f11886a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(u9.c cVar, Object obj, boolean z4) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z4 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f11883f);
                    k(bytes.length);
                    this.f11886a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    g(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f11885i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z4);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z4 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f11886a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z4 || longValue != 0) {
                    h0 h0Var = (h0) cVar.b(h0.class);
                    if (h0Var != null) {
                        k(((e0) h0Var).f11834a << 3);
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
                this.f11886a.write(bArr);
            } else {
                u9.d dVar = (u9.d) this.f11887b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z4);
                    return;
                }
                u9.f fVar = (u9.f) this.f11888c.get(obj.getClass());
                if (fVar != null) {
                    j7.l lVar = this.f11889e;
                    lVar.f9686b = false;
                    lVar.d = cVar;
                    lVar.f9687c = z4;
                    fVar.a(obj, lVar);
                } else if (obj instanceof f0) {
                    h(cVar, ((f0) obj).zza(), true);
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
        h0 h0Var = (h0) cVar.b(h0.class);
        if (h0Var != null) {
            k(((e0) h0Var).f11834a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(u9.d dVar, u9.c cVar, Object obj, boolean z4) {
        j7.f fVar = new j7.f(2);
        fVar.f9602b = 0L;
        try {
            OutputStream outputStream = this.f11886a;
            this.f11886a = fVar;
            dVar.a(obj, this);
            this.f11886a = outputStream;
            long j10 = fVar.f9602b;
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
            OutputStream outputStream = this.f11886a;
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
            OutputStream outputStream = this.f11886a;
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
