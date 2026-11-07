package a8;

import c8.xf;
public final class xa implements ua.b {
    public final int f708a;
    public final o5.q f709b;

    public xa(o5.q qVar, int i7) {
        this.f708a = i7;
        this.f709b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f708a) {
            case 0:
                return this.f709b.a("FIREBASE_ML_SDK", new l5.c("json"), bb.f343e);
            case 1:
                return this.f709b.a("FIREBASE_ML_SDK", new l5.c("proto"), bb.d);
            case 2:
                return this.f709b.a("FIREBASE_ML_SDK", new l5.c("json"), xf.f5959e);
            case 3:
                return this.f709b.a("FIREBASE_ML_SDK", new l5.c("proto"), xf.d);
            case 4:
                return this.f709b.a("FIREBASE_ML_SDK", new l5.c("json"), y7.h9.f58952e);
            case 5:
                return this.f709b.a("FIREBASE_ML_SDK", new l5.c("proto"), y7.h9.d);
            case 6:
                return this.f709b.a("FIREBASE_ML_SDK", new l5.c("json"), z7.qa.f59837e);
            default:
                return this.f709b.a("FIREBASE_ML_SDK", new l5.c("proto"), z7.qa.d);
        }
    }
}
