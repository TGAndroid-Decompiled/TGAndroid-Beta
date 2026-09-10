package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class o implements Runnable {
    public final int f16759a;
    public final Object f16760b;
    public final Object f16761c;
    public final Object d;
    public final Object e;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16759a = i10;
        this.f16760b = obj;
        this.f16761c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f16759a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f16760b, (VoIPDebugToSend.Data) this.f16761c, (File) this.d, (TL_phone.saveCallDebug) this.e);
                return;
            case 1:
                ((NativeInstance) this.f16760b).lambda$onAudioLevelsUpdated$1((int[]) this.f16761c, (float[]) this.d, (boolean[]) this.e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f16760b, (TLRPC.TL_error) this.f16761c, (Context) this.d, (Runnable) this.e);
                return;
            case 3:
                ((VoIPService) this.f16760b).lambda$startConferenceGroupCall$44((TLObject) this.f16761c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
                return;
            case 4:
                ((VoIPService) this.f16760b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f16761c, (TLObject) this.d, (byte[]) this.e);
                return;
            case 5:
                ((VoIPService) this.f16760b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f16761c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
                return;
            default:
                ((VoIPService) this.f16760b).lambda$startConferenceGroupCall$31((TLObject) this.f16761c, (AccountInstance) this.d, (TLRPC.TL_error) this.e);
                return;
        }
    }
}
