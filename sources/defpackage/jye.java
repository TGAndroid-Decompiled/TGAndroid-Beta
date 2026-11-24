package defpackage;
public final class jye implements mt8 {
    public final byte a;
    public final g1c b;

    public jye(g1c g1cVar, byte b) {
        this.a = b;
        this.b = g1cVar;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        g1c g1cVar = this.b;
        switch (b) {
            case 0:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("json"), ize.y);
            case 1:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("proto"), ie7.x);
            case 2:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("json"), eef.y);
            case 3:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("proto"), i2f.E);
            case 4:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("json"), pd5.E);
            case 5:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("proto"), vi2.E);
            case 6:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("json"), c6e.y);
            default:
                return g1cVar.a("FIREBASE_ML_SDK", new s24("proto"), ie7.E);
        }
    }
}
