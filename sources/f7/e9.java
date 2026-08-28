package f7;

import g7.oa;
import h7.na;
import j7.zf;
public final class e9 implements x9.b {
    public final int f5652a;
    public final w2.o f5653b;

    public e9(w2.o oVar, int i9) {
        this.f5652a = i9;
        this.f5653b = oVar;
    }

    @Override
    public final Object get() {
        switch (this.f5652a) {
            case 0:
                return this.f5653b.a("FIREBASE_ML_SDK", new t2.c("json"), h9.f5696e);
            case 1:
                return this.f5653b.a("FIREBASE_ML_SDK", new t2.c("proto"), h9.d);
            case 2:
                return this.f5653b.a("FIREBASE_ML_SDK", new t2.c("json"), oa.f7333e);
            case 3:
                return this.f5653b.a("FIREBASE_ML_SDK", new t2.c("proto"), oa.d);
            case 4:
                return this.f5653b.a("FIREBASE_ML_SDK", new t2.c("json"), na.f10055e);
            case 5:
                return this.f5653b.a("FIREBASE_ML_SDK", new t2.c("proto"), na.d);
            case 6:
                return this.f5653b.a("FIREBASE_ML_SDK", new t2.c("json"), zf.f14234e);
            default:
                return this.f5653b.a("FIREBASE_ML_SDK", new t2.c("proto"), zf.d);
        }
    }
}
