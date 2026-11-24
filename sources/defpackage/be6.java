package defpackage;

import java.util.logging.Logger;
public abstract class be6 {
    public static be6 a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            String simpleName = cls.getSimpleName();
            el elVar = new el((byte) 0);
            elVar.b = simpleName;
            return elVar;
        }
        String simpleName2 = cls.getSimpleName();
        el elVar2 = new el((byte) 1);
        elVar2.b = Logger.getLogger(simpleName2);
        return elVar2;
    }

    public abstract void b(String str);
}
