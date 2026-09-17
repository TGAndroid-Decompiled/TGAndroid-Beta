package ib;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import v7.m8;
public final class b extends m8 {
    public final Method f11934a = Class.class.getMethod("isRecord", null);
    public final Method f11935b = Class.class.getMethod("getRecordComponents", null);
    public final Method f11936c;
    public final Method d;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f11936c = cls.getMethod("getName", null);
        this.d = cls.getMethod("getType", null);
    }

    @Override
    public final Method a(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override
    public final Constructor b(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f11935b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.d.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override
    public final String[] c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f11935b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f11936c.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override
    public final boolean d(Class cls) {
        try {
            return ((Boolean) this.f11934a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }
}
