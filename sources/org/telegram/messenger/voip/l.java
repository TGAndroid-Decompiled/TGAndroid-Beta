package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f27503a;
    public final Object f27504b;
    public final Object f27505c;
    public final Object d;
    public final Object f27506e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27503a = i7;
        this.f27504b = obj;
        this.f27505c = obj2;
        this.d = obj3;
        this.f27506e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f27503a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f27504b, (VoIPDebugToSend.Data) this.f27505c, (File) this.d, (TL_phone.saveCallDebug) this.f27506e);
                return;
            case 1:
                ((NativeInstance) this.f27504b).lambda$onAudioLevelsUpdated$1((int[]) this.f27505c, (float[]) this.d, (boolean[]) this.f27506e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f27504b, (TLRPC.TL_error) this.f27505c, (Context) this.d, (Runnable) this.f27506e);
                return;
            case 3:
                ((VoIPService) this.f27504b).lambda$startConferenceGroupCall$31((TLObject) this.f27505c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f27506e);
                return;
            case 4:
                ((VoIPService) this.f27504b).lambda$startConferenceGroupCall$44((TLObject) this.f27505c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f27506e);
                return;
            case 5:
                ((VoIPService) this.f27504b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f27505c, (TLObject) this.d, (byte[]) this.f27506e);
                return;
            default:
                ((VoIPService) this.f27504b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f27505c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f27506e);
                return;
        }
    }
}
