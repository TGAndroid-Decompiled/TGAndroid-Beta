package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f26141a;
    public final Object f26142b;
    public final Object f26143c;
    public final Object d;
    public final Object f26144e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f26141a = i7;
        this.f26142b = obj;
        this.f26143c = obj2;
        this.d = obj3;
        this.f26144e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f26141a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f26142b, (VoIPDebugToSend.Data) this.f26143c, (File) this.d, (TL_phone.saveCallDebug) this.f26144e);
                return;
            case 1:
                ((NativeInstance) this.f26142b).lambda$onAudioLevelsUpdated$1((int[]) this.f26143c, (float[]) this.d, (boolean[]) this.f26144e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f26142b, (TLRPC.TL_error) this.f26143c, (Context) this.d, (Runnable) this.f26144e);
                return;
            case 3:
                ((VoIPService) this.f26142b).lambda$startConferenceGroupCall$31((TLObject) this.f26143c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f26144e);
                return;
            case 4:
                ((VoIPService) this.f26142b).lambda$startConferenceGroupCall$44((TLObject) this.f26143c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f26144e);
                return;
            case 5:
                ((VoIPService) this.f26142b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f26143c, (TLObject) this.d, (byte[]) this.f26144e);
                return;
            default:
                ((VoIPService) this.f26142b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f26143c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f26144e);
                return;
        }
    }
}
