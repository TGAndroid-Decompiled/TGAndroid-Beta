package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class o8d implements ao7 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final w84 f = new w84("key", b00.m(yjb.o(i8d.class, new b7d(1))));
    public static final w84 g = new w84("value", b00.m(yjb.o(i8d.class, new b7d(2))));
    public static final s7d h = s7d.d;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final jt8 d = new jt8(this, (byte) 2);

    public o8d(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int j(w84 w84Var) {
        i8d i8dVar = (i8d) w84Var.b(i8d.class);
        if (i8dVar != null) {
            return i8dVar.zza();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ao7 a(w84 w84Var, Object obj) {
        c(w84Var, obj, true);
        return this;
    }

    public final void b(w84 w84Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((j(w84Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(w84 w84Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    l((j(w84Var) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(e);
                    l(bytes.length);
                    this.a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    c(w84Var, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    k(h, w84Var, entry, false);
                }
            } else if (obj instanceof Double) {
                b(w84Var, ((Double) obj).doubleValue(), z);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    l((j(w84Var) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                i(w84Var, ((Number) obj).longValue(), z);
            } else if (obj instanceof Boolean) {
                h(w84Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                l((j(w84Var) << 3) | 2);
                l(bArr.length);
                this.a.write(bArr);
            } else {
                zn7 zn7Var = (zn7) this.b.get(obj.getClass());
                if (zn7Var != null) {
                    k(zn7Var, w84Var, obj, z);
                    return;
                }
                y8c y8cVar = (y8c) this.c.get(obj.getClass());
                if (y8cVar != null) {
                    jt8 jt8Var = this.d;
                    jt8Var.b = false;
                    jt8Var.d = w84Var;
                    jt8Var.c = z;
                    y8cVar.a(obj, jt8Var);
                } else if (obj instanceof x7d) {
                    h(w84Var, ((x7d) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(w84Var, ((Enum) obj).ordinal(), true);
                } else {
                    k(s7d.e, w84Var, obj, z);
                }
            }
        }
    }

    @Override
    public final ao7 d(w84 w84Var, boolean z) {
        h(w84Var, z ? 1 : 0, true);
        return this;
    }

    @Override
    public final ao7 e(w84 w84Var, int i) {
        h(w84Var, i, true);
        return this;
    }

    @Override
    public final ao7 f(w84 w84Var, double d) {
        b(w84Var, d, true);
        return this;
    }

    @Override
    public final ao7 g(w84 w84Var, long j) {
        i(w84Var, j, true);
        return this;
    }

    public final void h(w84 w84Var, int i, boolean z) {
        if (!z || i != 0) {
            i8d i8dVar = (i8d) w84Var.b(i8d.class);
            if (i8dVar != null) {
                int ordinal = i8dVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((i8dVar.zza() << 3) | 5);
                        this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                        return;
                    }
                    l(i8dVar.zza() << 3);
                    l((i << 1) ^ (i >> 31));
                    return;
                }
                l(i8dVar.zza() << 3);
                l(i);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void i(w84 w84Var, long j, boolean z) {
        if (!z || j != 0) {
            i8d i8dVar = (i8d) w84Var.b(i8d.class);
            if (i8dVar != null) {
                int ordinal = i8dVar.zzb().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        l((i8dVar.zza() << 3) | 1);
                        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                        return;
                    }
                    l(i8dVar.zza() << 3);
                    m((j << 1) ^ (j >> 63));
                    return;
                }
                l(i8dVar.zza() << 3);
                m(j);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void k(zn7 zn7Var, w84 w84Var, Object obj, boolean z) {
        n06 n06Var = new n06((byte) 2);
        n06Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = n06Var;
            zn7Var.a(obj, this);
            this.a = outputStream;
            long j = n06Var.b;
            n06Var.close();
            if (z && j == 0) {
                return;
            }
            l((j(w84Var) << 3) | 2);
            m(j);
            zn7Var.a(obj, this);
        } catch (Throwable th) {
            try {
                n06Var.close();
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
            OutputStream outputStream = this.a;
            if (i2 != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }
}
