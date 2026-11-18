package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f27514a;
    public final Object f27515b;
    public final Object f27516c;
    public final Object d;
    public final Object f27517e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27514a = i7;
        this.f27515b = obj;
        this.f27516c = obj2;
        this.d = obj3;
        this.f27517e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f27514a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f27515b, (VoIPDebugToSend.Data) this.f27516c, (File) this.d, (TL_phone.saveCallDebug) this.f27517e);
                return;
            case 1:
                ((NativeInstance) this.f27515b).lambda$onAudioLevelsUpdated$1((int[]) this.f27516c, (float[]) this.d, (boolean[]) this.f27517e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f27515b, (TLRPC.TL_error) this.f27516c, (Context) this.d, (Runnable) this.f27517e);
                return;
            case 3:
                ((VoIPService) this.f27515b).lambda$startConferenceGroupCall$31((TLObject) this.f27516c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f27517e);
                return;
            case 4:
                ((VoIPService) this.f27515b).lambda$startConferenceGroupCall$44((TLObject) this.f27516c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f27517e);
                return;
            case 5:
                ((VoIPService) this.f27515b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f27516c, (TLObject) this.d, (byte[]) this.f27517e);
                return;
            default:
                ((VoIPService) this.f27515b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f27516c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f27517e);
                return;
        }
    }
}
