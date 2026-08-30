package kotlin.jvm.internal;
public abstract class h extends c implements g, hd.e {
    private final int arity;
    private final int flags;

    public h(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.h.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override
    public hd.b computeReflected() {
        r.f10991a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (getName().equals(hVar.getName()) && getSignature().equals(hVar.getSignature()) && this.flags == hVar.flags && this.arity == hVar.arity && j.a(getBoundReceiver(), hVar.getBoundReceiver()) && j.a(getOwner(), hVar.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof hd.e)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override
    public int getArity() {
        return this.arity;
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
        hd.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override
    public hd.e getReflected() {
        hd.b compute = compute();
        if (compute != this) {
            return (hd.e) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
