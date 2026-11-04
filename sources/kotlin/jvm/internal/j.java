package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
public abstract class j {
    public static final Object[] f17354a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        g(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        g(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        g(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = j.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            StringBuilder n4 = com.google.android.recaptcha.internal.a.n("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            n4.append(str);
            NullPointerException nullPointerException = new NullPointerException(n4.toString());
            g(nullPointerException, j.class.getName());
            throw nullPointerException;
        }
    }

    public static int f(int i3, int i10) {
        if (i3 < i10) {
            return -1;
        }
        if (i3 == i10) {
            return 0;
        }
        return 1;
    }

    public static void g(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i3 = i10;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
    }

    public static void h(String str) {
        RuntimeException runtimeException = new RuntimeException(a1.g.q("lateinit property ", str, " has not been initialized"));
        g(runtimeException, j.class.getName());
        throw runtimeException;
    }

    public static final Object[] i(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i3 = 0;
                while (true) {
                    int i10 = i3 + 1;
                    objArr[i3] = it.next();
                    if (i10 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i11);
                        d(objArr, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i10);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i3 = i10;
                }
            }
        }
        return f17354a;
    }

    public static final Object[] j(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i3 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i10 = i3 + 1;
                    objArr2[i3] = it.next();
                    if (i10 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i11);
                        d(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i10] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i10);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i3 = i10;
                }
            }
        }
        return objArr;
    }
}
