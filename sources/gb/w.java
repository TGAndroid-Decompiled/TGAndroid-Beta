package gb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import v7.k8;
public final class w extends t {
    public static final HashMap f10499e;
    public final Constructor f10500b;
    public final Object[] f10501c;
    public final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f10499e = hashMap;
    }

    public w(Class cls, v vVar) {
        super(vVar);
        this.d = new HashMap();
        k8 k8Var = ib.c.f12091a;
        Constructor b10 = k8Var.b(cls);
        this.f10500b = b10;
        ib.c.f(b10);
        String[] c10 = k8Var.c(cls);
        for (int i10 = 0; i10 < c10.length; i10++) {
            this.d.put(c10[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f10500b.getParameterTypes();
        this.f10501c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f10501c[i11] = f10499e.get(parameterTypes[i11]);
        }
    }

    @Override
    public final Object a() {
        return (Object[]) this.f10501c.clone();
    }

    @Override
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f10500b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e7) {
            k8 k8Var = ib.c.f12091a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override
    public final void c(Object obj, lb.a aVar, s sVar) {
        Object[] objArr = (Object[]) obj;
        String str = sVar.f10490c;
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object read = sVar.f10492f.read(aVar);
            if (read == null && sVar.f10493g) {
                StringBuilder w10 = a1.g.w("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                w10.append(aVar.h());
                throw new RuntimeException(w10.toString());
            }
            objArr[intValue] = read;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + ib.c.b(this.f10500b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
