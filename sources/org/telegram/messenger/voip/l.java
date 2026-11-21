package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f27540a;
    public final Object f27541b;
    public final Object f27542c;
    public final Object d;
    public final Object f27543e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27540a = i7;
        this.f27541b = obj;
        this.f27542c = obj2;
        this.d = obj3;
        this.f27543e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f27540a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f27541b, (VoIPDebugToSend.Data) this.f27542c, (File) this.d, (TL_phone.saveCallDebug) this.f27543e);
                return;
            case 1:
                ((NativeInstance) this.f27541b).lambda$onAudioLevelsUpdated$1((int[]) this.f27542c, (float[]) this.d, (boolean[]) this.f27543e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f27541b, (TLRPC.TL_error) this.f27542c, (Context) this.d, (Runnable) this.f27543e);
                return;
            case 3:
                ((VoIPService) this.f27541b).lambda$startConferenceGroupCall$31((TLObject) this.f27542c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f27543e);
                return;
            case 4:
                ((VoIPService) this.f27541b).lambda$startConferenceGroupCall$44((TLObject) this.f27542c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f27543e);
                return;
            case 5:
                ((VoIPService) this.f27541b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f27542c, (TLObject) this.d, (byte[]) this.f27543e);
                return;
            default:
                ((VoIPService) this.f27541b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f27542c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f27543e);
                return;
        }
    }
}
