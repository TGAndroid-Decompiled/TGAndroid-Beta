package defpackage;
public abstract class zs8 extends j91 implements bv5 {
    public final boolean a;

    public zs8(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs8.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override
    public final bv5 getReflected() {
        if (!this.a) {
            yu5 compute = compute();
            if (compute != this) {
                return (bv5) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        fyb.i("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    @Override
    public final yu5 compute() {
        if (this.a) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zs8) {
            zs8 zs8Var = (zs8) obj;
            if (getOwner().equals(zs8Var.getOwner()) && getName().equals(zs8Var.getName()) && getSignature().equals(zs8Var.getSignature()) && rp5.a(getBoundReceiver(), zs8Var.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof bv5)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        yu5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
