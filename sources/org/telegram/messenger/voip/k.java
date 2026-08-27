package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class k implements Runnable {

    public final int f21926a;

    public final Object f21927b;

    public final Object f21928c;
    public final Object d;

    public final Object f21929e;

    public k(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21926a = i10;
        this.f21927b = obj;
        this.f21928c = obj2;
        this.d = obj3;
        this.f21929e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21926a) {
            case 0:
                ((VoIPDebugToSend) this.f21927b).lambda$done$2((VoIPDebugToSend.Data) this.f21928c, (File) this.d, (TL_phone.saveCallDebug) this.f21929e);
                break;
            case 1:
                ((NativeInstance) this.f21927b).lambda$onAudioLevelsUpdated$1((int[]) this.f21928c, (float[]) this.d, (boolean[]) this.f21929e);
                break;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f21927b, (TLRPC.TL_error) this.f21928c, (Context) this.d, (Runnable) this.f21929e);
                break;
            case 3:
                ((VoIPService) this.f21927b).lambda$startConferenceGroupCall$44((TLObject) this.f21928c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f21929e);
                break;
            case 4:
                ((VoIPService) this.f21927b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f21928c, (TLObject) this.d, (byte[]) this.f21929e);
                break;
            case 5:
                ((VoIPService) this.f21927b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f21928c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f21929e);
                break;
            default:
                ((VoIPService) this.f21927b).lambda$startConferenceGroupCall$31((TLObject) this.f21928c, (AccountInstance) this.d, (TLRPC.TL_error) this.f21929e);
                break;
        }
    }
}
