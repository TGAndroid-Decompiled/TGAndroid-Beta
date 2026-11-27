package defpackage;

import java.util.logging.Logger;
public abstract class ge6 {
    public static ge6 a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            String simpleName = cls.getSimpleName();
            fk fkVar = new fk((byte) 0);
            fkVar.b = simpleName;
            return fkVar;
        }
        String simpleName2 = cls.getSimpleName();
        fk fkVar2 = new fk((byte) 1);
        fkVar2.b = Logger.getLogger(simpleName2);
        return fkVar2;
    }

    public abstract void b(String str);
}
