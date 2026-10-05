package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19578a;
    public final Object f19579b;
    public final Object f19580c;
    public final Object d;
    public final Object f19581e;

    public m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19578a = i10;
        this.f19579b = obj;
        this.f19580c = obj2;
        this.d = obj3;
        this.f19581e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19578a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f19579b, (VoIPDebugToSend.Data) this.f19580c, (File) this.d, (TL_phone.saveCallDebug) this.f19581e);
                return;
            case 1:
                ((NativeInstance) this.f19579b).lambda$onAudioLevelsUpdated$1((int[]) this.f19580c, (float[]) this.d, (boolean[]) this.f19581e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f19579b, (TLRPC.TL_error) this.f19580c, (Context) this.d, (Runnable) this.f19581e);
                return;
            case 3:
                ((VoIPService) this.f19579b).lambda$startConferenceGroupCall$31((TLObject) this.f19580c, (AccountInstance) this.d, (TLRPC.TL_error) this.f19581e);
                return;
            case 4:
                ((VoIPService) this.f19579b).lambda$startConferenceGroupCall$44((TLObject) this.f19580c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f19581e);
                return;
            case 5:
                ((VoIPService) this.f19579b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f19580c, (TLObject) this.d, (byte[]) this.f19581e);
                return;
            default:
                ((VoIPService) this.f19579b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f19580c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f19581e);
                return;
        }
    }
}
