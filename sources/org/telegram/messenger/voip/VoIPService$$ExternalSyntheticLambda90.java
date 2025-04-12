package org.telegram.messenger.voip;

public final class VoIPService$$ExternalSyntheticLambda90 implements Runnable {
    public final NativeInstance f$0;

    public VoIPService$$ExternalSyntheticLambda90(NativeInstance nativeInstance) {
        this.f$0 = nativeInstance;
    }

    @Override
    public final void run() {
        this.f$0.stopGroup();
    }
}
