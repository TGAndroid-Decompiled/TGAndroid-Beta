package org.telegram.messenger.voip;

public final class VoIPService$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public VoIPService$1$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService.AnonymousClass1) this.f$0).lambda$run$0();
                break;
            case 1:
                ((VoIPService.AnonymousClass9) this.f$0).lambda$run$0();
                break;
            case 2:
                ((AudioTrackJNI) this.f$0).lambda$startThread$0();
                break;
            case 3:
                ((VoIPPendingCall) this.f$0).lambda$new$1();
                break;
            default:
                ((NativeInstance) this.f$0).stopGroup();
                break;
        }
    }
}
