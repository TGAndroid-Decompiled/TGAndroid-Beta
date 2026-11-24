package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class zbc {
    public final qt a;
    public final qt b;
    public final qt c;

    public zbc(qt qtVar, qt qtVar2, qt qtVar3) {
        this.a = qtVar;
        this.b = qtVar2;
        this.c = qtVar3;
    }

    public abstract acc a();

    public final Class b(Class cls) {
        String name = cls.getName();
        qt qtVar = this.c;
        Class cls2 = (Class) qtVar.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            qtVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        qt qtVar = this.a;
        Method method = (Method) qtVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, zbc.class.getClassLoader()).getDeclaredMethod("read", zbc.class);
            qtVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        qt qtVar = this.b;
        Method method = (Method) qtVar.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, zbc.class);
            qtVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        if (!e(i2)) {
            return i;
        }
        return ((acc) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((acc) this).e.readParcelable(acc.class.getClassLoader());
    }

    public final bcc h() {
        String readString = ((acc) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (bcc) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            rjb.k("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            rjb.k("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            rjb.k("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                rjb.k("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((acc) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((acc) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(bcc bccVar) {
        if (bccVar == null) {
            ((acc) this).e.writeString(null);
            return;
        }
        try {
            ((acc) this).e.writeString(b(bccVar.getClass()).getName());
            acc a = a();
            try {
                d(bccVar.getClass()).invoke(null, bccVar, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                rjb.k("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                rjb.k("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                rjb.k("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    rjb.k("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            rjb.k(bccVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
