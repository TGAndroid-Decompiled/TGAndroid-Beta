package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f17915a;
    public final Object f17916b;
    public final Object f17917c;
    public final Object d;
    public final Object e;

    public m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17915a = i10;
        this.f17916b = obj;
        this.f17917c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f17915a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f17916b, (VoIPDebugToSend.Data) this.f17917c, (File) this.d, (TL_phone.saveCallDebug) this.e);
                return;
            case 1:
                ((NativeInstance) this.f17916b).lambda$onAudioLevelsUpdated$1((int[]) this.f17917c, (float[]) this.d, (boolean[]) this.e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f17916b, (TLRPC.TL_error) this.f17917c, (Context) this.d, (Runnable) this.e);
                return;
            case 3:
                ((VoIPService) this.f17916b).lambda$startConferenceGroupCall$44((TLObject) this.f17917c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
                return;
            case 4:
                ((VoIPService) this.f17916b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f17917c, (TLObject) this.d, (byte[]) this.e);
                return;
            case 5:
                ((VoIPService) this.f17916b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f17917c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
                return;
            default:
                ((VoIPService) this.f17916b).lambda$startConferenceGroupCall$31((TLObject) this.f17917c, (AccountInstance) this.d, (TLRPC.TL_error) this.e);
                return;
        }
    }
}
