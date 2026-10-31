package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f18678a;
    public final Object f18679b;
    public final Object f18680c;
    public final Object d;
    public final Object e;

    public n(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18678a = i10;
        this.f18679b = obj;
        this.f18680c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18678a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f18679b, (VoIPDebugToSend.Data) this.f18680c, (File) this.d, (TL_phone.saveCallDebug) this.e);
                return;
            case 1:
                ((NativeInstance) this.f18679b).lambda$onAudioLevelsUpdated$1((int[]) this.f18680c, (float[]) this.d, (boolean[]) this.e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f18679b, (TLRPC.TL_error) this.f18680c, (Context) this.d, (Runnable) this.e);
                return;
            case 3:
                ((VoIPService) this.f18679b).lambda$startConferenceGroupCall$31((TLObject) this.f18680c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.e);
                return;
            case 4:
                ((VoIPService) this.f18679b).lambda$startConferenceGroupCall$44((TLObject) this.f18680c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
                return;
            case 5:
                ((VoIPService) this.f18679b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f18680c, (TLObject) this.d, (byte[]) this.e);
                return;
            default:
                ((VoIPService) this.f18679b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f18680c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
                return;
        }
    }
}
