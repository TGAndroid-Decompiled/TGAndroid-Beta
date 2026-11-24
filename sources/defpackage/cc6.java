package defpackage;

import java.util.logging.Logger;
public abstract class cc6 {
    public static cc6 a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            String simpleName = cls.getSimpleName();
            ek ekVar = new ek((byte) 0);
            ekVar.b = simpleName;
            return ekVar;
        }
        String simpleName2 = cls.getSimpleName();
        ek ekVar2 = new ek((byte) 1);
        ekVar2.b = Logger.getLogger(simpleName2);
        return ekVar2;
    }

    public abstract void b(String str);
}
