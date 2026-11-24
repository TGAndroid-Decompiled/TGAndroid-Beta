package defpackage;
public abstract class zdf {
    public static xye a;

    public static synchronized hdf a(kcf kcfVar) {
        hdf hdfVar;
        synchronized (zdf.class) {
            xye xyeVar = a;
            if (xyeVar == null) {
                xyeVar = new xye((byte) 3);
                a = xyeVar;
            }
            hdfVar = (hdf) xyeVar.c(kcfVar);
        }
        return hdfVar;
    }
}
