package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f26127a;
    public final Object f26128b;
    public final Object f26129c;
    public final Object d;
    public final Object f26130e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f26127a = i7;
        this.f26128b = obj;
        this.f26129c = obj2;
        this.d = obj3;
        this.f26130e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f26127a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f26128b, (VoIPDebugToSend.Data) this.f26129c, (File) this.d, (TL_phone.saveCallDebug) this.f26130e);
                return;
            case 1:
                ((NativeInstance) this.f26128b).lambda$onAudioLevelsUpdated$1((int[]) this.f26129c, (float[]) this.d, (boolean[]) this.f26130e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f26128b, (TLRPC.TL_error) this.f26129c, (Context) this.d, (Runnable) this.f26130e);
                return;
            case 3:
                ((VoIPService) this.f26128b).lambda$startConferenceGroupCall$31((TLObject) this.f26129c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f26130e);
                return;
            case 4:
                ((VoIPService) this.f26128b).lambda$startConferenceGroupCall$44((TLObject) this.f26129c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f26130e);
                return;
            case 5:
                ((VoIPService) this.f26128b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f26129c, (TLObject) this.d, (byte[]) this.f26130e);
                return;
            default:
                ((VoIPService) this.f26128b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f26129c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f26130e);
                return;
        }
    }
}
