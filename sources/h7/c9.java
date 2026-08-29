package h7;

import i7.oa;
import l7.zf;
public final class c9 implements z9.b {
    public final int f7576a;
    public final y2.o f7577b;

    public c9(y2.o oVar, int i10) {
        this.f7576a = i10;
        this.f7577b = oVar;
    }

    @Override
    public final Object get() {
        switch (this.f7576a) {
            case 0:
                return this.f7577b.a("FIREBASE_ML_SDK", new v2.c("json"), f9.f7624e);
            case 1:
                return this.f7577b.a("FIREBASE_ML_SDK", new v2.c("proto"), f9.d);
            case 2:
                return this.f7577b.a("FIREBASE_ML_SDK", new v2.c("json"), oa.f8473e);
            case 3:
                return this.f7577b.a("FIREBASE_ML_SDK", new v2.c("proto"), oa.d);
            case 4:
                return this.f7577b.a("FIREBASE_ML_SDK", new v2.c("json"), j7.oa.f11143e);
            case 5:
                return this.f7577b.a("FIREBASE_ML_SDK", new v2.c("proto"), j7.oa.d);
            case 6:
                return this.f7577b.a("FIREBASE_ML_SDK", new v2.c("json"), zf.f15093e);
            default:
                return this.f7577b.a("FIREBASE_ML_SDK", new v2.c("proto"), zf.d);
        }
    }
}
