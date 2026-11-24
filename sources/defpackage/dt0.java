package defpackage;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;
public final class dt0 implements Predicate {
    public final byte a;
    public final HashSet b;

    public dt0(HashSet hashSet, byte b) {
        this.a = b;
        this.b = hashSet;
    }

    public final Predicate and(Predicate predicate) {
        byte b = this.a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final Predicate negate() {
        byte b = this.a;
        return Predicate$CC.$default$negate(this);
    }

    public final Predicate or(Predicate predicate) {
        byte b = this.a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        boolean contains;
        byte b = this.a;
        HashSet hashSet = this.b;
        ft0 ft0Var = (ft0) obj;
        switch (b) {
            case 0:
                contains = hashSet.contains(Long.valueOf(ft0Var.b));
                break;
            default:
                contains = hashSet.contains(Long.valueOf(ft0Var.b));
                break;
        }
        return !contains;
    }
}
