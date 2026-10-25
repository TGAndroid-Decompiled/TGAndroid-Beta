package a8;
public final class og implements ra.b {
    public final int f658a;
    public final m5.r f659b;

    public og(m5.r rVar, int i10) {
        this.f658a = i10;
        this.f659b = rVar;
    }

    @Override
    public final Object get() {
        switch (this.f658a) {
            case 0:
                return this.f659b.a("FIREBASE_ML_SDK", new j5.c("json"), sg.e);
            case 1:
                return this.f659b.a("FIREBASE_ML_SDK", new j5.c("proto"), sg.d);
            case 2:
                return this.f659b.a("FIREBASE_ML_SDK", new j5.c("json"), w7.g9.e);
            case 3:
                return this.f659b.a("FIREBASE_ML_SDK", new j5.c("proto"), w7.g9.d);
            case 4:
                return this.f659b.a("FIREBASE_ML_SDK", new j5.c("json"), x7.qa.e);
            case 5:
                return this.f659b.a("FIREBASE_ML_SDK", new j5.c("proto"), x7.qa.d);
            case 6:
                return this.f659b.a("FIREBASE_ML_SDK", new j5.c("json"), y7.fa.e);
            default:
                return this.f659b.a("FIREBASE_ML_SDK", new j5.c("proto"), y7.fa.d);
        }
    }
}
