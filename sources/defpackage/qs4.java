package defpackage;
public abstract class qs4 extends sa1 implements ps4, ax5 {
    private final int arity;
    private final int flags;

    public qs4(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs4.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override
    public yw5 computeReflected() {
        h79.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qs4) {
            qs4 qs4Var = (qs4) obj;
            if (getName().equals(qs4Var.getName()) && getSignature().equals(qs4Var.getSignature()) && this.flags == qs4Var.flags && this.arity == qs4Var.arity && rr5.a(getBoundReceiver(), qs4Var.getBoundReceiver()) && rr5.a(getOwner(), qs4Var.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof ax5)) {
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
    public ax5 getReflected() {
        yw5 compute = compute();
        if (compute != this) {
            return (ax5) compute;
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
        yw5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
