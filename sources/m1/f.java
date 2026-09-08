package m1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
public final class f extends w {
    private static final f DEFAULT_INSTANCE;
    private static volatile w0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private n0 preferences_ = n0.f1282b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        w.h(f.class, fVar);
    }

    public static n0 i(f fVar) {
        n0 n0Var = fVar.preferences_;
        if (!n0Var.f1283a) {
            fVar.preferences_ = n0Var.b();
        }
        return fVar.preferences_;
    }

    public static d k() {
        return (d) ((u) DEFAULT_INSTANCE.d(5));
    }

    public static f l(FileInputStream fileInputStream) {
        a0.h hVar;
        f fVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar2 = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        m a2 = m.a();
        w wVar = (w) fVar.d(4);
        try {
            y0 y0Var = y0.f1333c;
            y0Var.getClass();
            b1 a10 = y0Var.a(wVar.getClass());
            a0.h hVar3 = hVar2.f1247b;
            if (hVar3 != null) {
                hVar = hVar3;
            } else {
                ?? obj = new Object();
                obj.d = 0;
                Charset charset = z.f1336a;
                obj.f18c = hVar2;
                hVar2.f1247b = obj;
                hVar = obj;
            }
            a10.c(wVar, hVar, a2);
            a10.d(wVar);
            if (wVar.g()) {
                return (f) wVar;
            }
            throw new IOException(new androidx.car.app.j().getMessage());
        } catch (IOException e7) {
            if (e7.getCause() instanceof b0) {
                throw ((b0) e7.getCause());
            }
            throw new IOException(e7.getMessage());
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof b0) {
                throw ((b0) e10.getCause());
            }
            throw e10;
        }
    }

    @Override
    public final Object d(int i10) {
        w0 w0Var;
        switch (j.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f15773a});
            case 3:
                return new f();
            case 4:
                return new u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0 w0Var2 = PARSER;
                if (w0Var2 == null) {
                    synchronized (f.class) {
                        try {
                            w0 w0Var3 = PARSER;
                            w0Var = w0Var3;
                            if (w0Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                w0Var = obj;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return w0Var;
                }
                return w0Var2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
