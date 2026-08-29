package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class k implements Runnable {
    public final int f21965a;
    public final Object f21966b;
    public final Object f21967c;
    public final Object d;
    public final Object f21968e;

    public k(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21965a = i10;
        this.f21966b = obj;
        this.f21967c = obj2;
        this.d = obj3;
        this.f21968e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21965a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f21966b, (VoIPDebugToSend.Data) this.f21967c, (File) this.d, (TL_phone.saveCallDebug) this.f21968e);
                return;
            case 1:
                ((NativeInstance) this.f21966b).lambda$onAudioLevelsUpdated$1((int[]) this.f21967c, (float[]) this.d, (boolean[]) this.f21968e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f21966b, (TLRPC.TL_error) this.f21967c, (Context) this.d, (Runnable) this.f21968e);
                return;
            case 3:
                ((VoIPService) this.f21966b).lambda$startConferenceGroupCall$44((TLObject) this.f21967c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f21968e);
                return;
            case 4:
                ((VoIPService) this.f21966b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f21967c, (TLObject) this.d, (byte[]) this.f21968e);
                return;
            case 5:
                ((VoIPService) this.f21966b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f21967c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f21968e);
                return;
            default:
                ((VoIPService) this.f21966b).lambda$startConferenceGroupCall$31((TLObject) this.f21967c, (AccountInstance) this.d, (TLRPC.TL_error) this.f21968e);
                return;
        }
    }
}
