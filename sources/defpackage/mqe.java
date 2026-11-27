package defpackage;
public abstract class mqe {
    public static nhc a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (nhc) newInstance;
        } catch (IllegalAccessException e) {
            vr9.k("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            vr9.k("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            vr9.k("Cannot create an instance of ", cls, e3);
            return null;
        }
    }
}
