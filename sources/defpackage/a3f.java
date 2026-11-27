package defpackage;
public final class a3f implements vw8 {
    public final byte a;
    public final f5c b;

    public a3f(f5c f5cVar, byte b) {
        this.a = b;
        this.b = f5cVar;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        f5c f5cVar = this.b;
        switch (b) {
            case 0:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("json"), z3f.y);
            case 1:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("proto"), rg7.x);
            case 2:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("json"), uif.y);
            case 3:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("proto"), z6f.E);
            case 4:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("json"), qf5.E);
            case 5:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("proto"), rj2.E);
            case 6:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("json"), sae.y);
            default:
                return f5cVar.a("FIREBASE_ML_SDK", new n34("proto"), rg7.E);
        }
    }
}
