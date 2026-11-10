package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f26145a;
    public final Object f26146b;
    public final Object f26147c;
    public final Object d;
    public final Object f26148e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f26145a = i7;
        this.f26146b = obj;
        this.f26147c = obj2;
        this.d = obj3;
        this.f26148e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f26145a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f26146b, (VoIPDebugToSend.Data) this.f26147c, (File) this.d, (TL_phone.saveCallDebug) this.f26148e);
                return;
            case 1:
                ((NativeInstance) this.f26146b).lambda$onAudioLevelsUpdated$1((int[]) this.f26147c, (float[]) this.d, (boolean[]) this.f26148e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f26146b, (TLRPC.TL_error) this.f26147c, (Context) this.d, (Runnable) this.f26148e);
                return;
            case 3:
                ((VoIPService) this.f26146b).lambda$startConferenceGroupCall$31((TLObject) this.f26147c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f26148e);
                return;
            case 4:
                ((VoIPService) this.f26146b).lambda$startConferenceGroupCall$44((TLObject) this.f26147c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f26148e);
                return;
            case 5:
                ((VoIPService) this.f26146b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f26147c, (TLObject) this.d, (byte[]) this.f26148e);
                return;
            default:
                ((VoIPService) this.f26146b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f26147c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f26148e);
                return;
        }
    }
}
