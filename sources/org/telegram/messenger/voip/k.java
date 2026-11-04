package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class k implements Runnable {
    public final int f26020a;
    public final Object f26021b;
    public final Object f26022c;
    public final Object d;
    public final Object f26023e;

    public k(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f26020a = i3;
        this.f26021b = obj;
        this.f26022c = obj2;
        this.d = obj3;
        this.f26023e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f26020a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f26021b, (VoIPDebugToSend.Data) this.f26022c, (File) this.d, (TL_phone.saveCallDebug) this.f26023e);
                return;
            case 1:
                ((NativeInstance) this.f26021b).lambda$onAudioLevelsUpdated$1((int[]) this.f26022c, (float[]) this.d, (boolean[]) this.f26023e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f26021b, (TLRPC.TL_error) this.f26022c, (Context) this.d, (Runnable) this.f26023e);
                return;
            case 3:
                ((VoIPService) this.f26021b).lambda$startConferenceGroupCall$31((TLObject) this.f26022c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f26023e);
                return;
            case 4:
                ((VoIPService) this.f26021b).lambda$startConferenceGroupCall$44((TLObject) this.f26022c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f26023e);
                return;
            case 5:
                ((VoIPService) this.f26021b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f26022c, (TLObject) this.d, (byte[]) this.f26023e);
                return;
            default:
                ((VoIPService) this.f26021b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f26022c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f26023e);
                return;
        }
    }
}
