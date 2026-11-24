package defpackage;

import org.telegram.messenger.voip.NativeInstance;
public final class jo9 implements NativeInstance.BroadcastStateCallback, e11 {
    public final oo9 a;
    public final NativeInstance b;

    public jo9(oo9 oo9Var, NativeInstance nativeInstance) {
        this.a = oo9Var;
        this.b = nativeInstance;
    }

    @Override
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        gm.c3(new bb1(this.a, this.b, z2, z, (byte) 4));
    }

    @Override
    public final void onRejoinRequested() {
        gm.c3(new il9(this.a, this.b, (byte) 8));
    }
}
