package oa;

import g7.t6;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
public final class w extends t {
    public static final HashMap f19172e;
    public final Constructor f19173b;
    public final Object[] f19174c;
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
        f19172e = hashMap;
    }

    public w(Class cls, v vVar) {
        super(vVar);
        this.d = new HashMap();
        t6 t6Var = qa.c.f46123a;
        Constructor b10 = t6Var.b(cls);
        this.f19173b = b10;
        qa.c.f(b10);
        String[] c10 = t6Var.c(cls);
        for (int i9 = 0; i9 < c10.length; i9++) {
            this.d.put(c10[i9], Integer.valueOf(i9));
        }
        Class<?>[] parameterTypes = this.f19173b.getParameterTypes();
        this.f19174c = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.f19174c[i10] = f19172e.get(parameterTypes[i10]);
        }
    }

    @Override
    public final Object a() {
        return (Object[]) this.f19174c.clone();
    }

    @Override
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f19173b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            t6 t6Var = qa.c.f46123a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + qa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + qa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + qa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    @Override
    public final void c(Object obj, ta.a aVar, s sVar) {
        Object[] objArr = (Object[]) obj;
        String str = sVar.f19163c;
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object read = sVar.f19165f.read(aVar);
            if (read == null && sVar.f19166g) {
                StringBuilder t10 = aa.d.t("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                t10.append(aVar.h());
                throw new RuntimeException(t10.toString());
            }
            objArr[intValue] = read;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + qa.c.b(this.f19173b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
