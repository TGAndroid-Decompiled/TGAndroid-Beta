package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
public abstract class fs4 extends o3 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, fs4> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected s5c unknownFields;

    public fs4() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = s5c.f;
    }

    public static fs4 d(Class cls) {
        fs4 fs4Var = defaultInstanceMap.get(cls);
        if (fs4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                fs4Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                k93.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (fs4Var == null) {
            try {
                fs4 fs4Var2 = (fs4) ((fs4) d6c.a.allocateInstance(cls)).c(6);
                if (fs4Var2 != null) {
                    defaultInstanceMap.put(cls, fs4Var2);
                    return fs4Var2;
                }
                sdb.a();
                return null;
            } catch (InstantiationException e2) {
                ho9.n(e2);
                return null;
            }
        }
        return fs4Var;
    }

    public static Object e(Method method, fs4 fs4Var, Object... objArr) {
        try {
            return method.invoke(fs4Var, objArr);
        } catch (IllegalAccessException e) {
            fyb.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    fyb.j("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean f(fs4 fs4Var, boolean z) {
        byte byteValue = ((Byte) fs4Var.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        ft8 ft8Var = ft8.c;
        ft8Var.getClass();
        boolean d = ft8Var.a(fs4Var.getClass()).d(fs4Var);
        if (z) {
            fs4Var.c(2);
        }
        return d;
    }

    public static void j(Class cls, fs4 fs4Var) {
        fs4Var.h();
        defaultInstanceMap.put(cls, fs4Var);
    }

    @Override
    public final int a(nq9 nq9Var) {
        int g;
        int g2;
        if (g()) {
            if (nq9Var == null) {
                ft8 ft8Var = ft8.c;
                ft8Var.getClass();
                g2 = ft8Var.a(getClass()).g(this);
            } else {
                g2 = nq9Var.g(this);
            }
            if (g2 >= 0) {
                return g2;
            }
            sc8.j(de9.k(g2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (nq9Var == null) {
            ft8 ft8Var2 = ft8.c;
            ft8Var2.getClass();
            g = ft8Var2.a(getClass()).g(this);
        } else {
            g = nq9Var.g(this);
        }
        k(g);
        return g;
    }

    @Override
    public final void b(ck2 ck2Var) {
        ft8 ft8Var = ft8.c;
        ft8Var.getClass();
        nq9 a = ft8Var.a(getClass());
        l69 l69Var = ck2Var.a;
        if (l69Var == null) {
            l69Var = new l69(ck2Var);
        }
        a.i(this, l69Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ft8 ft8Var = ft8.c;
        ft8Var.getClass();
        return ft8Var.a(getClass()).e(this, (fs4) obj);
    }

    public final boolean g() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            ft8 ft8Var = ft8.c;
            ft8Var.getClass();
            return ft8Var.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i == 0) {
            ft8 ft8Var2 = ft8.c;
            ft8Var2.getClass();
            int f = ft8Var2.a(getClass()).f(this);
            this.memoizedHashCode = f;
            return f;
        }
        return i;
    }

    public final fs4 i() {
        return (fs4) c(4);
    }

    public final void k(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | (i & Integer.MAX_VALUE);
        } else {
            sc8.j(de9.k(i, "serialized size must be non-negative, was "));
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = x17.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        x17.c(this, sb, 0);
        return sb.toString();
    }
}
