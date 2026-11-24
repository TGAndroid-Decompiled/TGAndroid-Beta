package defpackage;

import org.telegram.messenger.voip.NativeInstance;
public final class jm9 implements Runnable {
    public final byte a;
    public final NativeInstance b;

    public jm9(NativeInstance nativeInstance, byte b) {
        this.a = b;
        this.b = nativeInstance;
    }

    @Override
    public final void run() {
        byte b = this.a;
        this.b.stopGroup();
    }
}
