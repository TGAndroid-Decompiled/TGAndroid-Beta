package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class k implements Runnable {
    public final int f21655a;
    public final Object f21656b;
    public final Object f21657c;
    public final Object d;
    public final Object e;

    public k(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21655a = i10;
        this.f21656b = obj;
        this.f21657c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21655a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f21656b, (VoIPDebugToSend.Data) this.f21657c, (File) this.d, (TL_phone.saveCallDebug) this.e);
                return;
            case 1:
                ((NativeInstance) this.f21656b).lambda$onAudioLevelsUpdated$1((int[]) this.f21657c, (float[]) this.d, (boolean[]) this.e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f21656b, (TLRPC.TL_error) this.f21657c, (Context) this.d, (Runnable) this.e);
                return;
            case 3:
                ((VoIPService) this.f21656b).lambda$startConferenceGroupCall$31((TLObject) this.f21657c, (AccountInstance) this.d, (TLRPC.TL_error) this.e);
                return;
            case 4:
                ((VoIPService) this.f21656b).lambda$startConferenceGroupCall$44((TLObject) this.f21657c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
                return;
            case 5:
                ((VoIPService) this.f21656b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f21657c, (TLObject) this.d, (byte[]) this.e);
                return;
            default:
                ((VoIPService) this.f21656b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f21657c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
                return;
        }
    }
}
