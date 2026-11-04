package b8;
public final class lg implements ta.b {
    public final int f2740a;
    public final n5.q f2741b;

    public lg(n5.q qVar, int i3) {
        this.f2740a = i3;
        this.f2741b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f2740a) {
            case 0:
                return this.f2741b.a("FIREBASE_ML_SDK", new k5.c("json"), pg.f3016e);
            case 1:
                return this.f2741b.a("FIREBASE_ML_SDK", new k5.c("proto"), pg.d);
            case 2:
                return this.f2741b.a("FIREBASE_ML_SDK", new k5.c("json"), x7.e9.f58278e);
            case 3:
                return this.f2741b.a("FIREBASE_ML_SDK", new k5.c("proto"), x7.e9.d);
            case 4:
                return this.f2741b.a("FIREBASE_ML_SDK", new k5.c("json"), y7.qa.f59255e);
            case 5:
                return this.f2741b.a("FIREBASE_ML_SDK", new k5.c("proto"), y7.qa.d);
            case 6:
                return this.f2741b.a("FIREBASE_ML_SDK", new k5.c("json"), z7.ga.f59886e);
            default:
                return this.f2741b.a("FIREBASE_ML_SDK", new k5.c("proto"), z7.ga.d);
        }
    }
}
