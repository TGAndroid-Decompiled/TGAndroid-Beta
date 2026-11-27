package defpackage;
public abstract class iw8 extends s91 implements gx5 {
    public final boolean a;

    public iw8(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw8.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override
    public final gx5 getReflected() {
        if (!this.a) {
            dx5 compute = compute();
            if (compute != this) {
                return (gx5) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        qyc.c("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    @Override
    public final dx5 compute() {
        if (this.a) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iw8) {
            iw8 iw8Var = (iw8) obj;
            if (getOwner().equals(iw8Var.getOwner()) && getName().equals(iw8Var.getName()) && getSignature().equals(iw8Var.getSignature()) && ur5.a(getBoundReceiver(), iw8Var.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof gx5)) {
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
        dx5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
