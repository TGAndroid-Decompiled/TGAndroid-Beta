package org.telegram.messenger.voip;

public final class VoIPService$$ExternalSyntheticLambda106 implements Runnable {
    public final NativeInstance f$0;

    public VoIPService$$ExternalSyntheticLambda106(NativeInstance nativeInstance) {
        this.f$0 = nativeInstance;
    }

    @Override
    public final void run() {
        this.f$0.stopGroup();
    }
}
