package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class rkd implements dq7 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final wa4 f = new wa4("key", b10.m(mlb.q(ikd.class, new cid(1))));
    public static final wa4 g = new wa4("value", b10.m(mlb.q(ikd.class, new cid(2))));
    public static final u9d h = u9d.f;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final kv8 d = new kv8(this, (byte) 3);

    public rkd(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int j(wa4 wa4Var) {
        ikd ikdVar = (ikd) wa4Var.b(ikd.class);
        if (ikdVar != null) {
            return ikdVar.zza();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final dq7 a(wa4 wa4Var, Object obj) {
        c(wa4Var, obj, true);
        return this;
    }

    public final void b(wa4 wa4Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((j(wa4Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(wa4 wa4Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    l((j(wa4Var) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(e);
                    l(bytes.length);
                    this.a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    c(wa4Var, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    k(h, wa4Var, entry, false);
                }
            } else if (obj instanceof Double) {
                b(wa4Var, ((Double) obj).doubleValue(), z);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    l((j(wa4Var) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                i(wa4Var, ((Number) obj).longValue(), z);
            } else if (obj instanceof Boolean) {
                h(wa4Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                l((j(wa4Var) << 3) | 2);
                l(bArr.length);
                this.a.write(bArr);
            } else {
                cq7 cq7Var = (cq7) this.b.get(obj.getClass());
                if (cq7Var != null) {
                    k(cq7Var, wa4Var, obj, z);
                    return;
                }
                zac zacVar = (zac) this.c.get(obj.getClass());
                if (zacVar != null) {
                    kv8 kv8Var = this.d;
                    kv8Var.b = false;
                    kv8Var.d = wa4Var;
                    kv8Var.c = z;
                    zacVar.a(obj, kv8Var);
                } else if (obj instanceof ujd) {
                    h(wa4Var, ((ujd) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(wa4Var, ((Enum) obj).ordinal(), true);
                } else {
                    k(u9d.g, wa4Var, obj, z);
                }
            }
        }
    }

    @Override
    public final dq7 d(wa4 wa4Var, boolean z) {
        h(wa4Var, z ? 1 : 0, true);
        return this;
    }

    @Override
    public final dq7 e(wa4 wa4Var, int i) {
        h(wa4Var, i, true);
        return this;
    }

    @Override
    public final dq7 f(wa4 wa4Var, double d) {
        b(wa4Var, d, true);
        return this;
    }

    @Override
    public final dq7 g(wa4 wa4Var, long j) {
        i(wa4Var, j, true);
        return this;
    }

    public final void h(wa4 wa4Var, int i, boolean z) {
        if (!z || i != 0) {
            ikd ikdVar = (ikd) wa4Var.b(ikd.class);
            if (ikdVar != null) {
                int ordinal = ikdVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((ikdVar.zza() << 3) | 5);
                        this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                        return;
                    }
                    l(ikdVar.zza() << 3);
                    l((i << 1) ^ (i >> 31));
                    return;
                }
                l(ikdVar.zza() << 3);
                l(i);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void i(wa4 wa4Var, long j, boolean z) {
        if (!z || j != 0) {
            ikd ikdVar = (ikd) wa4Var.b(ikd.class);
            if (ikdVar != null) {
                int ordinal = ikdVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((ikdVar.zza() << 3) | 1);
                        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                        return;
                    }
                    l(ikdVar.zza() << 3);
                    m((j << 1) ^ (j >> 63));
                    return;
                }
                l(ikdVar.zza() << 3);
                m(j);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void k(cq7 cq7Var, wa4 wa4Var, Object obj, boolean z) {
        n26 n26Var = new n26((byte) 3);
        n26Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = n26Var;
            cq7Var.a(obj, this);
            this.a = outputStream;
            long j = n26Var.b;
            n26Var.close();
            if (z && j == 0) {
                return;
            }
            l((j(wa4Var) << 3) | 2);
            m(j);
            cq7Var.a(obj, this);
        } catch (Throwable th) {
            try {
                n26Var.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final void l(int i) {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            int i3 = i & 127;
            OutputStream outputStream = this.a;
            if (i2 != 0) {
                outputStream.write(i3 | 128);
                i >>>= 7;
            } else {
                outputStream.write(i3);
                return;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            int i2 = ((int) j) & 127;
            OutputStream outputStream = this.a;
            if (i != 0) {
                outputStream.write(i2 | 128);
                j >>>= 7;
            } else {
                outputStream.write(i2);
                return;
            }
        }
    }
}
