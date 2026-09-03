package m1;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z0;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
public final class f extends x {
    private static final f DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private o0 preferences_ = o0.f764b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        x.h(f.class, fVar);
    }

    public static o0 i(f fVar) {
        o0 o0Var = fVar.preferences_;
        if (!o0Var.f765a) {
            fVar.preferences_ = o0Var.b();
        }
        return fVar.preferences_;
    }

    public static d k() {
        return (d) ((v) DEFAULT_INSTANCE.d(5));
    }

    public static f l(FileInputStream fileInputStream) {
        androidx.datastore.preferences.protobuf.i iVar;
        f fVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        n a2 = n.a();
        x xVar = (x) fVar.d(4);
        try {
            z0 z0Var = z0.f815c;
            z0Var.getClass();
            c1 a10 = z0Var.a(xVar.getClass());
            androidx.datastore.preferences.protobuf.i iVar2 = hVar.f723b;
            if (iVar2 != null) {
                iVar = iVar2;
            } else {
                ?? obj = new Object();
                obj.f735c = 0;
                Charset charset = a0.f674a;
                obj.d = hVar;
                hVar.f723b = obj;
                iVar = obj;
            }
            a10.i(xVar, iVar, a2);
            a10.c(xVar);
            if (xVar.g()) {
                return (f) xVar;
            }
            throw new IOException(new a7.b().getMessage());
        } catch (IOException e6) {
            if (e6.getCause() instanceof c0) {
                throw ((c0) e6.getCause());
            }
            throw new IOException(e6.getMessage());
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof c0) {
                throw ((c0) e10.getCause());
            }
            throw e10;
        }
    }

    @Override
    public final Object d(int i10) {
        x0 x0Var;
        switch (j.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f13418a});
            case 3:
                return new f();
            case 4:
                return new v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (f.class) {
                        try {
                            x0 x0Var3 = PARSER;
                            x0Var = x0Var3;
                            if (x0Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                x0Var = obj;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return x0Var;
                }
                return x0Var2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
