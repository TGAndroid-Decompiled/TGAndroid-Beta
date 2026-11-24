package defpackage;

import java.lang.ref.WeakReference;
public final class zj0 implements Runnable {
    public final byte a;
    public final WeakReference b;

    public zj0(lk0 lk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new WeakReference(lk0Var);
                return;
            default:
                this.b = new WeakReference(lk0Var);
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
                    ((ak0) weakReference.get()).Y();
                    return;
                }
                return;
            case 1:
                if (weakReference.get() != null) {
                    ((lk0) weakReference.get()).n = false;
                    return;
                }
                return;
            default:
                if (weakReference.get() != null) {
                    ((lk0) weakReference.get()).o = false;
                    return;
                }
                return;
        }
    }

    public zj0(ak0 ak0Var) {
        this.a = (byte) 0;
        this.b = new WeakReference(ak0Var);
    }
}
