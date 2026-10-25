package a8;
public abstract class w9 {
    public static c0.l a(c0.j jVar) {
        ?? obj = new Object();
        obj.f5911c = new Object();
        c0.l lVar = new c0.l(obj);
        obj.f5910b = lVar;
        obj.f5909a = jVar.getClass();
        try {
            obj.f5909a = jVar.b(obj);
            return lVar;
        } catch (Exception e) {
            lVar.f5914b.l(e);
            return lVar;
        }
    }
}
