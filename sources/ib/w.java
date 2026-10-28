package ib;

import a8.rd;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
public final class w extends t {
    public static final HashMap e;
    public final Constructor f13967b;
    public final Object[] f13968c;
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
        e = hashMap;
    }

    public w(Class cls, v vVar) {
        super(vVar);
        this.d = new HashMap();
        rd rdVar = kb.c.f16504a;
        Constructor b10 = rdVar.b(cls);
        this.f13967b = b10;
        kb.c.f(b10);
        String[] c10 = rdVar.c(cls);
        for (int i10 = 0; i10 < c10.length; i10++) {
            this.d.put(c10[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f13967b.getParameterTypes();
        this.f13968c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f13968c[i11] = e.get(parameterTypes[i11]);
        }
    }

    @Override
    public final Object a() {
        return (Object[]) this.f13968c.clone();
    }

    @Override
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f13967b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            rd rdVar = kb.c.f16504a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + kb.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + kb.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + kb.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    @Override
    public final void c(Object obj, nb.a aVar, s sVar) {
        Object[] objArr = (Object[]) obj;
        String str = sVar.f13959c;
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object read = sVar.f13960f.read(aVar);
            if (read == null && sVar.f13961g) {
                StringBuilder v = a1.g.v("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                v.append(aVar.h());
                throw new RuntimeException(v.toString());
            }
            objArr[intValue] = read;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + kb.c.b(this.f13967b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
