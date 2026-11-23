package a8;
public abstract class u7 {
    public static c0.l a(c0.j jVar) {
        ?? obj = new Object();
        obj.f4337c = new Object();
        c0.l lVar = new c0.l(obj);
        obj.f4336b = lVar;
        obj.f4335a = jVar.getClass();
        try {
            obj.f4335a = jVar.e(obj);
            return lVar;
        } catch (Exception e10) {
            lVar.f4340b.l(e10);
            return lVar;
        }
    }
}
