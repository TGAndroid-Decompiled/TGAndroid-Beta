package defpackage;

import org.telegram.messenger.voip.NativeInstance;
public final class vp9 implements Runnable {
    public final byte a;
    public final NativeInstance b;

    public vp9(NativeInstance nativeInstance, byte b) {
        this.a = b;
        this.b = nativeInstance;
    }

    @Override
    public final void run() {
        byte b = this.a;
        this.b.stopGroup();
    }
}
