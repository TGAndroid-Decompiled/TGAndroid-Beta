package defpackage;

import java.lang.ref.WeakReference;
public final class aj0 implements Runnable {
    public final byte a;
    public final WeakReference b;

    public aj0(mj0 mj0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new WeakReference(mj0Var);
                return;
            default:
                this.b = new WeakReference(mj0Var);
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
                    ((bj0) weakReference.get()).Y();
                    return;
                }
                return;
            case 1:
                if (weakReference.get() != null) {
                    ((mj0) weakReference.get()).n = false;
                    return;
                }
                return;
            default:
                if (weakReference.get() != null) {
                    ((mj0) weakReference.get()).o = false;
                    return;
                }
                return;
        }
    }

    public aj0(bj0 bj0Var) {
        this.a = (byte) 0;
        this.b = new WeakReference(bj0Var);
    }
}
