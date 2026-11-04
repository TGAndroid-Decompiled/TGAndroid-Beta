package a5;

import a0.f;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class b {
    public final f f127a;
    public final f f128b;
    public final f f129c;

    public b(f fVar, f fVar2, f fVar3) {
        this.f127a = fVar;
        this.f128b = fVar2;
        this.f129c = fVar3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        f fVar = this.f129c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            fVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        f fVar = this.f127a;
        Method method = (Method) fVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
            fVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        f fVar = this.f128b;
        Method method = (Method) fVar.get(name);
        if (method == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, b.class);
            fVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i3);

    public final int f(int i3, int i10) {
        if (!e(i10)) {
            return i3;
        }
        return ((c) this).f130e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((c) this).f130e.readParcelable(c.class.getClassLoader());
    }

    public final d h() {
        String readString = ((c) this).f130e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract void i(int i3);

    public final void j(int i3, int i10) {
        i(i10);
        ((c) this).f130e.writeInt(i3);
    }

    public final void k(Parcelable parcelable, int i3) {
        i(i3);
        ((c) this).f130e.writeParcelable(parcelable, 0);
    }

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).f130e.writeString(null);
            return;
        }
        try {
            ((c) this).f130e.writeString(b(dVar.getClass()).getName());
            c a10 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a10);
                Parcel parcel = a10.f130e;
                int i3 = a10.f133i;
                if (i3 >= 0) {
                    int i10 = a10.d.get(i3);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
