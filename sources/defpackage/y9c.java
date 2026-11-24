package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class y9c {
    public final ps a;
    public final ps b;
    public final ps c;

    public y9c(ps psVar, ps psVar2, ps psVar3) {
        this.a = psVar;
        this.b = psVar2;
        this.c = psVar3;
    }

    public abstract z9c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        ps psVar = this.c;
        Class cls2 = (Class) psVar.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            psVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        ps psVar = this.a;
        Method method = (Method) psVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, y9c.class.getClassLoader()).getDeclaredMethod("read", y9c.class);
            psVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        ps psVar = this.b;
        Method method = (Method) psVar.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, y9c.class);
            psVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        if (!e(i2)) {
            return i;
        }
        return ((z9c) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((z9c) this).e.readParcelable(z9c.class.getClassLoader());
    }

    public final aac h() {
        String readString = ((z9c) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (aac) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            fyb.j("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            fyb.j("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            fyb.j("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                fyb.j("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((z9c) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((z9c) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(aac aacVar) {
        if (aacVar == null) {
            ((z9c) this).e.writeString(null);
            return;
        }
        try {
            ((z9c) this).e.writeString(b(aacVar.getClass()).getName());
            z9c a = a();
            try {
                d(aacVar.getClass()).invoke(null, aacVar, a);
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
                fyb.j("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                fyb.j("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                fyb.j("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    fyb.j("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            fyb.j(aacVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
