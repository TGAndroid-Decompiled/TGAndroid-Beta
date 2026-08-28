package m1;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public final class h extends x {
    private static final h DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private z strings_ = a1.d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        x.h(h.class, hVar);
    }

    public static void i(h hVar, Set set) {
        int i9;
        z zVar = hVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) zVar).f708a) {
            int size = zVar.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            hVar.strings_ = zVar.e(i9);
        }
        z zVar2 = hVar.strings_;
        Charset charset = a0.f699a;
        if (set instanceof f0) {
            List h = ((f0) set).h();
            f0 f0Var = (f0) zVar2;
            int size2 = zVar2.size();
            for (Object obj : h) {
                if (obj == null) {
                    String str = "Element at index " + (f0Var.size() - size2) + " is null.";
                    for (int size3 = f0Var.size() - 1; size3 >= size2; size3--) {
                        f0Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof androidx.datastore.preferences.protobuf.g) {
                    f0Var.g((androidx.datastore.preferences.protobuf.g) obj);
                } else {
                    f0Var.add((String) obj);
                }
            }
            return;
        }
        if (zVar2 instanceof ArrayList) {
            ((ArrayList) zVar2).ensureCapacity(set.size() + zVar2.size());
        }
        int size4 = zVar2.size();
        for (Object obj2 : set) {
            if (obj2 == null) {
                String str2 = "Element at index " + (zVar2.size() - size4) + " is null.";
                for (int size5 = zVar2.size() - 1; size5 >= size4; size5--) {
                    zVar2.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            zVar2.add(obj2);
        }
    }

    public static h j() {
        return DEFAULT_INSTANCE;
    }

    public static g l() {
        return (g) ((v) DEFAULT_INSTANCE.d(5));
    }

    @Override
    public final Object d(int i9) {
        x0 x0Var;
        switch (j.b(i9)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (h.class) {
                        try {
                            x0 x0Var3 = PARSER;
                            x0Var = x0Var3;
                            if (x0Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                x0Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return x0Var;
                }
                return x0Var2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final z k() {
        return this.strings_;
    }
}
