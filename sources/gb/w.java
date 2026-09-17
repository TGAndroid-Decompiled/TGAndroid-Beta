package gb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import v7.m8;
public final class w extends t {
    public static final HashMap f10563e;
    public final Constructor f10564b;
    public final Object[] f10565c;
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
        f10563e = hashMap;
    }

    public w(Class cls, v vVar) {
        super(vVar);
        this.d = new HashMap();
        m8 m8Var = ib.c.f11937a;
        Constructor b10 = m8Var.b(cls);
        this.f10564b = b10;
        ib.c.f(b10);
        String[] c10 = m8Var.c(cls);
        for (int i10 = 0; i10 < c10.length; i10++) {
            this.d.put(c10[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f10564b.getParameterTypes();
        this.f10565c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f10565c[i11] = f10563e.get(parameterTypes[i11]);
        }
    }

    @Override
    public final Object a() {
        return (Object[]) this.f10565c.clone();
    }

    @Override
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f10564b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e7) {
            m8 m8Var = ib.c.f11937a;
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
        String str = sVar.f10554c;
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object read = sVar.f10556f.read(aVar);
            if (read == null && sVar.f10557g) {
                StringBuilder v = a4.a.v("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                v.append(aVar.h());
                throw new RuntimeException(v.toString());
            }
            objArr[intValue] = read;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + ib.c.b(this.f10564b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
