package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19581a;
    public final Object f19582b;
    public final Object f19583c;
    public final Object d;
    public final Object f19584e;

    public m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19581a = i10;
        this.f19582b = obj;
        this.f19583c = obj2;
        this.d = obj3;
        this.f19584e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19581a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f19582b, (VoIPDebugToSend.Data) this.f19583c, (File) this.d, (TL_phone.saveCallDebug) this.f19584e);
                return;
            case 1:
                ((NativeInstance) this.f19582b).lambda$onAudioLevelsUpdated$1((int[]) this.f19583c, (float[]) this.d, (boolean[]) this.f19584e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f19582b, (TLRPC.TL_error) this.f19583c, (Context) this.d, (Runnable) this.f19584e);
                return;
            case 3:
                ((VoIPService) this.f19582b).lambda$startConferenceGroupCall$31((TLObject) this.f19583c, (AccountInstance) this.d, (TLRPC.TL_error) this.f19584e);
                return;
            case 4:
                ((VoIPService) this.f19582b).lambda$startConferenceGroupCall$44((TLObject) this.f19583c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f19584e);
                return;
            case 5:
                ((VoIPService) this.f19582b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f19583c, (TLObject) this.d, (byte[]) this.f19584e);
                return;
            default:
                ((VoIPService) this.f19582b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f19583c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f19584e);
                return;
        }
    }
}
