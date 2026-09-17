package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
public abstract class i {
    public static final Object[] f15047a = new Object[0];

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
        f(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        f(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        f(nullPointerException, i.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = i.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            StringBuilder w10 = a4.a.w("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            w10.append(str);
            NullPointerException nullPointerException = new NullPointerException(w10.toString());
            f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }

    public static String g(Object obj, String str) {
        return str + obj;
    }

    public static void h(String str) {
        RuntimeException runtimeException = new RuntimeException(a4.a.p("lateinit property ", str, " has not been initialized"));
        f(runtimeException, i.class.getName());
        throw runtimeException;
    }

    public static final Object[] i(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            i12 = 2147483645;
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        d(objArr, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f15047a;
    }

    public static final Object[] j(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i10 = 0;
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
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            i12 = 2147483645;
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i12);
                        d(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return objArr;
    }
}
