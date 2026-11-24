package defpackage;

import java.lang.ref.WeakReference;
public final class zi0 implements Runnable {
    public final byte a;
    public final WeakReference b;

    public zi0(lj0 lj0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new WeakReference(lj0Var);
                return;
            default:
                this.b = new WeakReference(lj0Var);
                return;
        }
    }

    @Override
    public final void run() {
        byte b = this.a;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                if (weakReference.get() != null) {
                    ((aj0) weakReference.get()).Y();
                    return;
                }
                return;
            case 1:
                if (weakReference.get() != null) {
                    ((lj0) weakReference.get()).n = false;
                    return;
                }
                return;
            default:
                if (weakReference.get() != null) {
                    ((lj0) weakReference.get()).o = false;
                    return;
                }
                return;
        }
    }

    public zi0(aj0 aj0Var) {
        this.a = (byte) 0;
        this.b = new WeakReference(aj0Var);
    }
}
