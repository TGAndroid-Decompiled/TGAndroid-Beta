package g7;

import h7.oa;
import i7.na;
import k7.zf;

public final class d9 implements y9.b {

    public final int f6446a;

    public final w2.o f6447b;

    public d9(w2.o oVar, int i10) {
        this.f6446a = i10;
        this.f6447b = oVar;
    }

    @Override
    public final Object get() {
        switch (this.f6446a) {
            case 0:
                return this.f6447b.a("FIREBASE_ML_SDK", new t2.c("json"), g9.f6489e);
            case 1:
                return this.f6447b.a("FIREBASE_ML_SDK", new t2.c("proto"), g9.d);
            case 2:
                return this.f6447b.a("FIREBASE_ML_SDK", new t2.c("json"), oa.f8506e);
            case 3:
                return this.f6447b.a("FIREBASE_ML_SDK", new t2.c("proto"), oa.d);
            case 4:
                return this.f6447b.a("FIREBASE_ML_SDK", new t2.c("json"), na.f10764e);
            case 5:
                return this.f6447b.a("FIREBASE_ML_SDK", new t2.c("proto"), na.d);
            case 6:
                return this.f6447b.a("FIREBASE_ML_SDK", new t2.c("json"), zf.f15088e);
            default:
                return this.f6447b.a("FIREBASE_ML_SDK", new t2.c("proto"), zf.d);
        }
    }
}
