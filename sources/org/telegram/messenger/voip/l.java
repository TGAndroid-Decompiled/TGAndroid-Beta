package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f27145a;
    public final Object f27146b;
    public final Object f27147c;
    public final Object d;
    public final Object f27148e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27145a = i7;
        this.f27146b = obj;
        this.f27147c = obj2;
        this.d = obj3;
        this.f27148e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f27145a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f27146b, (VoIPDebugToSend.Data) this.f27147c, (File) this.d, (TL_phone.saveCallDebug) this.f27148e);
                return;
            case 1:
                ((NativeInstance) this.f27146b).lambda$onAudioLevelsUpdated$1((int[]) this.f27147c, (float[]) this.d, (boolean[]) this.f27148e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f27146b, (TLRPC.TL_error) this.f27147c, (Context) this.d, (Runnable) this.f27148e);
                return;
            case 3:
                ((VoIPService) this.f27146b).lambda$startConferenceGroupCall$31((TLObject) this.f27147c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f27148e);
                return;
            case 4:
                ((VoIPService) this.f27146b).lambda$startConferenceGroupCall$44((TLObject) this.f27147c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f27148e);
                return;
            case 5:
                ((VoIPService) this.f27146b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f27147c, (TLObject) this.d, (byte[]) this.f27148e);
                return;
            default:
                ((VoIPService) this.f27146b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f27147c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f27148e);
                return;
        }
    }
}
