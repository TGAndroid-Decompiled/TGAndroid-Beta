package defpackage;

import org.telegram.messenger.voip.NativeInstance;
public final class wp9 implements f01, NativeInstance.BroadcastStateCallback {
    public final dq9 a;
    public final NativeInstance b;

    public wp9(dq9 dq9Var, NativeInstance nativeInstance) {
        this.a = dq9Var;
        this.b = nativeInstance;
    }

    @Override
    public final void onBroadcastStateChanged(boolean z, boolean z2) {
        hl.c3(new ba1(this.a, this.b, z2, z, (byte) 4));
    }

    @Override
    public final void onRejoinRequested() {
        hl.c3(new dn9(this.a, this.b, (byte) 5));
    }
}
