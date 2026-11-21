package a8;

import c8.xf;
public final class ya implements ua.b {
    public final int f728a;
    public final o5.q f729b;

    public ya(o5.q qVar, int i7) {
        this.f728a = i7;
        this.f729b = qVar;
    }

    @Override
    public final Object get() {
        switch (this.f728a) {
            case 0:
                return this.f729b.a("FIREBASE_ML_SDK", new l5.c("json"), cb.f361e);
            case 1:
                return this.f729b.a("FIREBASE_ML_SDK", new l5.c("proto"), cb.d);
            case 2:
                return this.f729b.a("FIREBASE_ML_SDK", new l5.c("json"), xf.f5092e);
            case 3:
                return this.f729b.a("FIREBASE_ML_SDK", new l5.c("proto"), xf.d);
            case 4:
                return this.f729b.a("FIREBASE_ML_SDK", new l5.c("json"), y7.g9.f60865e);
            case 5:
                return this.f729b.a("FIREBASE_ML_SDK", new l5.c("proto"), y7.g9.d);
            case 6:
                return this.f729b.a("FIREBASE_ML_SDK", new l5.c("json"), z7.qa.f61744e);
            default:
                return this.f729b.a("FIREBASE_ML_SDK", new l5.c("proto"), z7.qa.d);
        }
    }
}
