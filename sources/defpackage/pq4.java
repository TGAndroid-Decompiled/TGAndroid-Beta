package defpackage;
public abstract class pq4 extends j91 implements oq4, av5 {
    private final int arity;
    private final int flags;

    public pq4(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq4.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override
    public yu5 computeReflected() {
        f59.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pq4) {
            pq4 pq4Var = (pq4) obj;
            if (getName().equals(pq4Var.getName()) && getSignature().equals(pq4Var.getSignature()) && this.flags == pq4Var.flags && this.arity == pq4Var.arity && rp5.a(getBoundReceiver(), pq4Var.getBoundReceiver()) && rp5.a(getOwner(), pq4Var.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof av5)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public av5 getReflected() {
        yu5 compute = compute();
        if (compute != this) {
            return (av5) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        yu5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
