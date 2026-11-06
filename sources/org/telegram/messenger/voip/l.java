package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f26135a;
    public final Object f26136b;
    public final Object f26137c;
    public final Object d;
    public final Object f26138e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f26135a = i7;
        this.f26136b = obj;
        this.f26137c = obj2;
        this.d = obj3;
        this.f26138e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f26135a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f26136b, (VoIPDebugToSend.Data) this.f26137c, (File) this.d, (TL_phone.saveCallDebug) this.f26138e);
                return;
            case 1:
                ((NativeInstance) this.f26136b).lambda$onAudioLevelsUpdated$1((int[]) this.f26137c, (float[]) this.d, (boolean[]) this.f26138e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f26136b, (TLRPC.TL_error) this.f26137c, (Context) this.d, (Runnable) this.f26138e);
                return;
            case 3:
                ((VoIPService) this.f26136b).lambda$startConferenceGroupCall$31((TLObject) this.f26137c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f26138e);
                return;
            case 4:
                ((VoIPService) this.f26136b).lambda$startConferenceGroupCall$44((TLObject) this.f26137c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f26138e);
                return;
            case 5:
                ((VoIPService) this.f26136b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f26137c, (TLObject) this.d, (byte[]) this.f26138e);
                return;
            default:
                ((VoIPService) this.f26136b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f26137c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f26138e);
                return;
        }
    }
}
