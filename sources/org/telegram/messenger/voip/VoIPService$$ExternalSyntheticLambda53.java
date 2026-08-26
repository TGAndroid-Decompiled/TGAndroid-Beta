package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class VoIPService$$ExternalSyntheticLambda53 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public VoIPService$$ExternalSyntheticLambda53(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$31((TLObject) this.f$1, (AccountInstance) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 1:
                ((VoIPDebugToSend) this.f$0).lambda$done$2((VoIPDebugToSend.Data) this.f$1, (File) this.f$2, (TL_phone.saveCallDebug) this.f$3);
                break;
            case 2:
                ((NativeInstance) this.f$0).lambda$onAudioLevelsUpdated$1((int[]) this.f$1, (float[]) this.f$2, (boolean[]) this.f$3);
                break;
            case 3:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f$1, (TLRPC.TL_error) this.f$3, (Context) this.f$0, (Runnable) this.f$2);
                break;
            case 4:
                ((VoIPService) this.f$0).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f$3, (TLObject) this.f$1, (byte[]) this.f$2);
                break;
            case 5:
                ((VoIPService) this.f$0).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f$3, (TLObject) this.f$1, (TL_phone.checkGroupCall) this.f$2);
                break;
            default:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$44((TLObject) this.f$1, (TL_phone.PhoneCall) this.f$2, (TL_phone.exportGroupCallInvite) this.f$3);
                break;
        }
    }

    public VoIPService$$ExternalSyntheticLambda53(Context context, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = 3;
        this.f$1 = tLObject;
        this.f$3 = tL_error;
        this.f$0 = context;
        this.f$2 = runnable;
    }

    public VoIPService$$ExternalSyntheticLambda53(VoIPService voIPService, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPService;
        this.f$3 = tL_error;
        this.f$1 = tLObject;
        this.f$2 = obj;
    }
}
