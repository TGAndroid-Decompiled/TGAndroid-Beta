package h7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class k implements s9.e {
    public static final Charset f7669f = Charset.forName("UTF-8");
    public static final s9.c f7670g = new s9.c("key", u3.c.h(com.google.android.recaptcha.internal.a.p(i.class, new e(1))));
    public static final s9.c h = new s9.c("value", u3.c.h(com.google.android.recaptcha.internal.a.p(i.class, new e(2))));
    public static final j f7671i = j.f7652b;
    public OutputStream f7672a;
    public final HashMap f7673b;
    public final HashMap f7674c;
    public final s9.d d;
    public final l f7675e = new l(this, 0);

    public k(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, s9.d dVar) {
        this.f7672a = byteArrayOutputStream;
        this.f7673b = hashMap;
        this.f7674c = hashMap2;
        this.d = dVar;
    }

    public static int i(s9.c cVar) {
        i iVar = (i) cVar.b(i.class);
        if (iVar != null) {
            return ((e) iVar).f7599a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final s9.e a(s9.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override
    public final s9.e b(s9.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override
    public final s9.e c(s9.c cVar, long j10) {
        if (j10 != 0) {
            i iVar = (i) cVar.b(i.class);
            if (iVar != null) {
                k(((e) iVar).f7599a << 3);
                l(j10);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    @Override
    public final s9.e d(s9.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final s9.e e(s9.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    public final void f(s9.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f7672a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(s9.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f7669f);
                    k(bytes.length);
                    this.f7672a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    g(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f7671i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f7672a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    i iVar = (i) cVar.b(i.class);
                    if (iVar != null) {
                        k(((e) iVar).f7599a << 3);
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
                this.f7672a.write(bArr);
            } else {
                s9.d dVar = (s9.d) this.f7673b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                s9.f fVar = (s9.f) this.f7674c.get(obj.getClass());
                if (fVar != null) {
                    l lVar = this.f7675e;
                    lVar.f7686b = false;
                    lVar.d = cVar;
                    lVar.f7687c = z10;
                    fVar.a(obj, lVar);
                } else if (obj instanceof g) {
                    h(cVar, ((g) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z10);
                }
            }
        }
    }

    public final void h(s9.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        i iVar = (i) cVar.b(i.class);
        if (iVar != null) {
            k(((e) iVar).f7599a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(s9.d dVar, s9.c cVar, Object obj, boolean z10) {
        f fVar = new f(0);
        fVar.f7616b = 0L;
        try {
            OutputStream outputStream = this.f7672a;
            this.f7672a = fVar;
            dVar.a(obj, this);
            this.f7672a = outputStream;
            long j10 = fVar.f7616b;
            fVar.close();
            if (z10 && j10 == 0) {
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
            OutputStream outputStream = this.f7672a;
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
            OutputStream outputStream = this.f7672a;
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
