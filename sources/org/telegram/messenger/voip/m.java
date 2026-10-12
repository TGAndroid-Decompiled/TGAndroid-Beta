package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19360a;
    public final Object f19361b;
    public final Object f19362c;
    public final Object d;
    public final Object f19363e;

    public m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19360a = i10;
        this.f19361b = obj;
        this.f19362c = obj2;
        this.d = obj3;
        this.f19363e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19360a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f19361b, (VoIPDebugToSend.Data) this.f19362c, (File) this.d, (TL_phone.saveCallDebug) this.f19363e);
                return;
            case 1:
                ((NativeInstance) this.f19361b).lambda$onAudioLevelsUpdated$1((int[]) this.f19362c, (float[]) this.d, (boolean[]) this.f19363e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f19361b, (TLRPC.TL_error) this.f19362c, (Context) this.d, (Runnable) this.f19363e);
                return;
            case 3:
                ((VoIPService) this.f19361b).lambda$startConferenceGroupCall$31((TLObject) this.f19362c, (AccountInstance) this.d, (TLRPC.TL_error) this.f19363e);
                return;
            case 4:
                ((VoIPService) this.f19361b).lambda$startConferenceGroupCall$44((TLObject) this.f19362c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f19363e);
                return;
            case 5:
                ((VoIPService) this.f19361b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f19362c, (TLObject) this.d, (byte[]) this.f19363e);
                return;
            default:
                ((VoIPService) this.f19361b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f19362c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f19363e);
                return;
        }
    }
}
