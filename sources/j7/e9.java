package j7;

import k7.oa;
import n7.ag;
public final class e9 implements ba.b {
    public final int f9599a;
    public final y2.o f9600b;

    public e9(y2.o oVar, int i10) {
        this.f9599a = i10;
        this.f9600b = oVar;
    }

    @Override
    public final Object get() {
        switch (this.f9599a) {
            case 0:
                return this.f9600b.a("FIREBASE_ML_SDK", new v2.c("json"), h9.f9644e);
            case 1:
                return this.f9600b.a("FIREBASE_ML_SDK", new v2.c("proto"), h9.d);
            case 2:
                return this.f9600b.a("FIREBASE_ML_SDK", new v2.c("json"), oa.f10688e);
            case 3:
                return this.f9600b.a("FIREBASE_ML_SDK", new v2.c("proto"), oa.d);
            case 4:
                return this.f9600b.a("FIREBASE_ML_SDK", new v2.c("json"), l7.oa.f11984e);
            case 5:
                return this.f9600b.a("FIREBASE_ML_SDK", new v2.c("proto"), l7.oa.d);
            case 6:
                return this.f9600b.a("FIREBASE_ML_SDK", new v2.c("json"), ag.f15267e);
            default:
                return this.f9600b.a("FIREBASE_ML_SDK", new v2.c("proto"), ag.d);
        }
    }
}
