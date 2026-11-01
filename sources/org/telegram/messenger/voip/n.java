package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class n implements Runnable {
    public final int f18838a;
    public final Object f18839b;
    public final Object f18840c;
    public final Object d;
    public final Object e;

    public n(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18838a = i10;
        this.f18839b = obj;
        this.f18840c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f18838a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f18839b, (VoIPDebugToSend.Data) this.f18840c, (File) this.d, (TL_phone.saveCallDebug) this.e);
                return;
            case 1:
                ((NativeInstance) this.f18839b).lambda$onAudioLevelsUpdated$1((int[]) this.f18840c, (float[]) this.d, (boolean[]) this.e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f18839b, (TLRPC.TL_error) this.f18840c, (Context) this.d, (Runnable) this.e);
                return;
            case 3:
                ((VoIPService) this.f18839b).lambda$startConferenceGroupCall$31((TLObject) this.f18840c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.e);
                return;
            case 4:
                ((VoIPService) this.f18839b).lambda$startConferenceGroupCall$44((TLObject) this.f18840c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
                return;
            case 5:
                ((VoIPService) this.f18839b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f18840c, (TLObject) this.d, (byte[]) this.e);
                return;
            default:
                ((VoIPService) this.f18839b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f18840c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
                return;
        }
    }
}
