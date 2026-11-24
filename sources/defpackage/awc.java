package defpackage;

import org.telegram.utils.twidget.z;
public final class awc implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public awc(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                try {
                    ((z) obj).h(i);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((bl3) obj).g(i);
                return;
        }
    }
}
