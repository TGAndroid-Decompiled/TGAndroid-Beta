package k7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class y implements r9.e {

    public static final Charset f15045f = Charset.forName("UTF-8");

    public static final r9.c f15046g = new r9.c("key", s3.c.h(i0.a.s(w.class, new s(1))));
    public static final r9.c h = new r9.c("value", s3.c.h(i0.a.s(w.class, new s(2))));

    public static final x f15047i = x.f15028b;

    public OutputStream f15048a;

    public final HashMap f15049b;

    public final HashMap f15050c;
    public final r9.d d;

    public final g7.l f15051e = new g7.l(this, 3);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, r9.d dVar) {
        this.f15048a = byteArrayOutputStream;
        this.f15049b = map;
        this.f15050c = map2;
        this.d = dVar;
    }

    public static int i(r9.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).f14943a;
        }
        throw new r9.b("Field has no @Protobuf config");
    }

    @Override
    public final r9.e a(r9.c cVar, Object obj) {
        f(cVar, obj, true);
        return this;
    }

    public final void b(r9.c cVar, double d, boolean z10) throws IOException {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f15048a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override
    public final r9.e c(r9.c cVar, long j10) throws IOException {
        if (j10 == 0) {
            return this;
        }
        w wVar = (w) cVar.b(w.class);
        if (wVar == null) {
            throw new r9.b("Field has no @Protobuf config");
        }
        k(((s) wVar).f14943a << 3);
        l(j10);
        return this;
    }

    @Override
    public final r9.e d(r9.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override
    public final r9.e e(r9.c cVar, double d) throws IOException {
        b(cVar, d, true);
        return this;
    }

    public final void f(r9.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f15045f);
            k(bytes.length);
            this.f15048a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(f15047i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(cVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == 0.0f) {
                return;
            }
            k((i(cVar) << 3) | 5);
            this.f15048a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z10 && jLongValue == 0) {
                return;
            }
            w wVar = (w) cVar.b(w.class);
            if (wVar == null) {
                throw new r9.b("Field has no @Protobuf config");
            }
            k(((s) wVar).f14943a << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            k(bArr.length);
            this.f15048a.write(bArr);
            return;
        }
        r9.d dVar = (r9.d) this.f15049b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z10);
            return;
        }
        r9.f fVar = (r9.f) this.f15050c.get(obj.getClass());
        if (fVar != null) {
            g7.l lVar = this.f15051e;
            lVar.f6539b = false;
            lVar.d = cVar;
            lVar.f6540c = z10;
            fVar.a(obj, lVar);
            return;
        }
        if (obj instanceof u) {
            h(cVar, ((u) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, cVar, obj, z10);
        }
    }

    @Override
    public final r9.e g(r9.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void h(r9.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        w wVar = (w) cVar.b(w.class);
        if (wVar == null) {
            throw new r9.b("Field has no @Protobuf config");
        }
        k(((s) wVar).f14943a << 3);
        k(i10);
    }

    public final void j(r9.d dVar, r9.c cVar, Object obj, boolean z10) throws IOException {
        g7.f fVar = new g7.f(3);
        fVar.f6467b = 0L;
        try {
            OutputStream outputStream = this.f15048a;
            this.f15048a = fVar;
            try {
                dVar.a(obj, this);
                this.f15048a = outputStream;
                long j10 = fVar.f6467b;
                fVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                l(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f15048a = outputStream;
                throw th;
            }
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

    public final void k(int i10) throws IOException {
        while (true) {
            int i11 = i10 & 127;
            if ((i10 & (-128)) == 0) {
                this.f15048a.write(i11);
                return;
            } else {
                this.f15048a.write(i11 | 128);
                i10 >>>= 7;
            }
        }
    }

    public final void l(long j10) throws IOException {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) == 0) {
                this.f15048a.write(i10);
                return;
            } else {
                this.f15048a.write(i10 | 128);
                j10 >>>= 7;
            }
        }
    }
}
