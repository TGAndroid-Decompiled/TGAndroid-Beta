package m1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public final class h extends w {
    private static final h DEFAULT_INSTANCE;
    private static volatile w0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y strings_ = z0.d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        w.h(h.class, hVar);
    }

    public static void i(h hVar, Set set) {
        int i10;
        y yVar = hVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) yVar).f1203a) {
            int size = yVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            hVar.strings_ = yVar.d(i10);
        }
        y yVar2 = hVar.strings_;
        Charset charset = z.f1324a;
        if (set instanceof e0) {
            List h = ((e0) set).h();
            e0 e0Var = (e0) yVar2;
            int size2 = yVar2.size();
            for (Object obj : h) {
                if (obj == null) {
                    String str = "Element at index " + (e0Var.size() - size2) + " is null.";
                    for (int size3 = e0Var.size() - 1; size3 >= size2; size3--) {
                        e0Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof androidx.datastore.preferences.protobuf.g) {
                    e0Var.g((androidx.datastore.preferences.protobuf.g) obj);
                } else {
                    e0Var.add((String) obj);
                }
            }
            return;
        }
        if (yVar2 instanceof ArrayList) {
            ((ArrayList) yVar2).ensureCapacity(set.size() + yVar2.size());
        }
        int size4 = yVar2.size();
        for (Object obj2 : set) {
            if (obj2 == null) {
                String str2 = "Element at index " + (yVar2.size() - size4) + " is null.";
                for (int size5 = yVar2.size() - 1; size5 >= size4; size5--) {
                    yVar2.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            yVar2.add(obj2);
        }
    }

    public static h j() {
        return DEFAULT_INSTANCE;
    }

    public static g l() {
        return (g) ((u) DEFAULT_INSTANCE.d(5));
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
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0 w0Var2 = PARSER;
                if (w0Var2 == null) {
                    synchronized (h.class) {
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

    public final y k() {
        return this.strings_;
    }
}
