package defpackage;

import org.telegram.messenger.voip.NativeInstance;
public final class im9 implements NativeInstance.BroadcastStateCallback, xz0 {
    public final nm9 a;
    public final NativeInstance b;

    public im9(nm9 nm9Var, NativeInstance nativeInstance) {
        this.a = nm9Var;
        this.b = nativeInstance;
    }

    @Override
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        gl.d3(new s91(this.a, this.b, z2, z, (byte) 4));
    }

    @Override
    public final void onRejoinRequested() {
        gl.d3(new tj9(this.a, this.b, (byte) 6));
    }
}
