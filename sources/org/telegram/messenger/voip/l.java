package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f27512a;
    public final Object f27513b;
    public final Object f27514c;
    public final Object d;
    public final Object f27515e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f27512a = i7;
        this.f27513b = obj;
        this.f27514c = obj2;
        this.d = obj3;
        this.f27515e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f27512a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f27513b, (VoIPDebugToSend.Data) this.f27514c, (File) this.d, (TL_phone.saveCallDebug) this.f27515e);
                return;
            case 1:
                ((NativeInstance) this.f27513b).lambda$onAudioLevelsUpdated$1((int[]) this.f27514c, (float[]) this.d, (boolean[]) this.f27515e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f27513b, (TLRPC.TL_error) this.f27514c, (Context) this.d, (Runnable) this.f27515e);
                return;
            case 3:
                ((VoIPService) this.f27513b).lambda$startConferenceGroupCall$31((TLObject) this.f27514c, (org.telegram.messenger.c) this.d, (TLRPC.TL_error) this.f27515e);
                return;
            case 4:
                ((VoIPService) this.f27513b).lambda$startConferenceGroupCall$44((TLObject) this.f27514c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f27515e);
                return;
            case 5:
                ((VoIPService) this.f27513b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f27514c, (TLObject) this.d, (byte[]) this.f27515e);
                return;
            default:
                ((VoIPService) this.f27513b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f27514c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f27515e);
                return;
        }
    }
}
