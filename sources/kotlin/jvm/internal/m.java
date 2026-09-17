package kotlin.jvm.internal;
public abstract class m extends b implements vd.g {
    public final boolean f15076a;

    public m(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.m.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override
    public final vd.g getReflected() {
        if (!this.f15076a) {
            vd.b compute = compute();
            if (compute != this) {
                return (vd.g) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    @Override
    public final vd.b compute() {
        if (this.f15076a) {
            return this;
        }
        return super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (getOwner().equals(mVar.getOwner()) && getName().equals(mVar.getName()) && getSignature().equals(mVar.getSignature()) && i.a(getBoundReceiver(), mVar.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof vd.g)) {
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
        vd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
