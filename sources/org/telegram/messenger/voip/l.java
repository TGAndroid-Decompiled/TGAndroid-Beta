package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f19898a;
    public final Object f19899b;
    public final Object f19900c;
    public final Object d;
    public final Object e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19898a = i10;
        this.f19899b = obj;
        this.f19900c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19898a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f19899b, (VoIPDebugToSend.Data) this.f19900c, (File) this.d, (TL_phone.saveCallDebug) this.e);
                return;
            case 1:
                ((NativeInstance) this.f19899b).lambda$onAudioLevelsUpdated$1((int[]) this.f19900c, (float[]) this.d, (boolean[]) this.e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f19899b, (TLRPC.TL_error) this.f19900c, (Context) this.d, (Runnable) this.e);
                return;
            case 3:
                ((VoIPService) this.f19899b).lambda$startConferenceGroupCall$31((TLObject) this.f19900c, (AccountInstance) this.d, (TLRPC.TL_error) this.e);
                return;
            case 4:
                ((VoIPService) this.f19899b).lambda$startConferenceGroupCall$44((TLObject) this.f19900c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
                return;
            case 5:
                ((VoIPService) this.f19899b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f19900c, (TLObject) this.d, (byte[]) this.e);
                return;
            default:
                ((VoIPService) this.f19899b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f19900c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
                return;
        }
    }
}
