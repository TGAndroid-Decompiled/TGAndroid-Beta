package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
public abstract class c8c {
    public final Unsafe a;

    public double A(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public byte B(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    public boolean a(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public double b(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public float c(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    public void d(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public void e(long j, Object obj, byte b) {
        this.a.putByte(obj, j, b);
    }

    public void f(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public void g(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public boolean h() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            d8c.i(th);
            return false;
        }
    }

    public abstract boolean i();

    public byte j(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    public abstract double k(Object obj, long j);

    public void l(long j, Object obj, byte b) {
        this.a.putByte(obj, j, b);
    }

    public void m(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public void n(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public void o(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public abstract float p(Object obj, long j);

    public boolean q(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public float r(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    public abstract void s(Object obj, long j, boolean z);

    public double t(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public abstract void u(Object obj, long j, byte b);

    public abstract void v(Object obj, long j, double d);

    public abstract void w(Object obj, long j, float f);

    public abstract boolean x(Object obj, long j);

    public boolean y(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public float z(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }
}
