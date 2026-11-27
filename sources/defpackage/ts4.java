package defpackage;
public abstract class ts4 extends s91 implements ss4, fx5 {
    private final int arity;
    private final int flags;

    public ts4(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts4.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override
    public dx5 computeReflected() {
        s89.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ts4) {
            ts4 ts4Var = (ts4) obj;
            if (getName().equals(ts4Var.getName()) && getSignature().equals(ts4Var.getSignature()) && this.flags == ts4Var.flags && this.arity == ts4Var.arity && ur5.a(getBoundReceiver(), ts4Var.getBoundReceiver()) && ur5.a(getOwner(), ts4Var.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof fx5)) {
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
    public fx5 getReflected() {
        dx5 compute = compute();
        if (compute != this) {
            return (fx5) compute;
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
        dx5 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
