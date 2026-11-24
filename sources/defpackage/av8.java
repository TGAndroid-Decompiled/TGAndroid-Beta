package defpackage;
public abstract class av8 extends sa1 implements bx5 {
    public final boolean a;

    public av8(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av8.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override
    public final bx5 getReflected() {
        if (!this.a) {
            yw5 compute = compute();
            if (compute != this) {
                return (bx5) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        rjb.j("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    @Override
    public final yw5 compute() {
        if (this.a) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av8) {
            av8 av8Var = (av8) obj;
            if (getOwner().equals(av8Var.getOwner()) && getName().equals(av8Var.getName()) && getSignature().equals(av8Var.getSignature()) && rr5.a(getBoundReceiver(), av8Var.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof bx5)) {
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
        yw5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
