package m1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
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
    private n0 preferences_ = n0.f1281b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        w.h(f.class, fVar);
    }

    public static n0 i(f fVar) {
        n0 n0Var = fVar.preferences_;
        if (!n0Var.f1282a) {
            fVar.preferences_ = n0Var.b();
        }
        return fVar.preferences_;
    }

    public static d k() {
        return (d) ((u) DEFAULT_INSTANCE.d(5));
    }

    public static f l(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        n nVarA = n.a();
        w wVar = (w) fVar.d(4);
        try {
            y0 y0Var = y0.f1330c;
            y0Var.getClass();
            b1 b1VarA = y0Var.a(wVar.getClass());
            androidx.datastore.preferences.protobuf.i iVar = hVar.f1243b;
            if (iVar == null) {
                iVar = new androidx.datastore.preferences.protobuf.i();
                iVar.f1257c = 0;
                Charset charset = z.f1333a;
                iVar.d = hVar;
                hVar.f1243b = iVar;
            }
            b1VarA.i(wVar, iVar, nVarA);
            b1VarA.c(wVar);
            if (wVar.g()) {
                return (f) wVar;
            }
            throw new b0(new a7.c().getMessage());
        } catch (IOException e9) {
            if (e9.getCause() instanceof b0) {
                throw ((b0) e9.getCause());
            }
            throw new b0(e9.getMessage());
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof b0) {
                throw ((b0) e10.getCause());
            }
            throw e10;
        }
    }

    @Override
    public final Object d(int i10) {
        w0 vVar;
        switch (j.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f17542a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0 w0Var = PARSER;
                if (w0Var != null) {
                    return w0Var;
                }
                synchronized (f.class) {
                    try {
                        vVar = PARSER;
                        if (vVar == null) {
                            vVar = new v();
                            PARSER = vVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return vVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
