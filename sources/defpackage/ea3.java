package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
public abstract class ea3 {
    public static final Object[] a = new Object[0];

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Object[] b(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArr, i2);
                    }
                    i = i2;
                }
            }
        }
        return a;
    }

    public static final Object[] c(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i = 0;
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
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArr2, i2);
                    }
                    i = i2;
                }
            }
        }
        return objArr;
    }

    public static final String d(px2 px2Var) {
        Object sc9Var;
        if (px2Var instanceof rp3) {
            return ((rp3) px2Var).toString();
        }
        try {
            sc9Var = px2Var + '@' + a(px2Var);
        } catch (Throwable th) {
            sc9Var = new sc9(th);
        }
        if (tc9.a(sc9Var) != null) {
            sc9Var = px2Var.getClass().getName() + '@' + a(px2Var);
        }
        return (String) sc9Var;
    }
}
