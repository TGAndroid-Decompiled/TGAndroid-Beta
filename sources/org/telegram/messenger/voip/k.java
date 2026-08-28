package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class k implements Runnable {
    public final int f21902a;
    public final Object f21903b;
    public final Object f21904c;
    public final Object d;
    public final Object f21905e;

    public k(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f21902a = i9;
        this.f21903b = obj;
        this.f21904c = obj2;
        this.d = obj3;
        this.f21905e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f21902a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f21903b, (VoIPDebugToSend.Data) this.f21904c, (File) this.d, (TL_phone.saveCallDebug) this.f21905e);
                return;
            case 1:
                ((NativeInstance) this.f21903b).lambda$onAudioLevelsUpdated$1((int[]) this.f21904c, (float[]) this.d, (boolean[]) this.f21905e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f21903b, (TLRPC.TL_error) this.f21904c, (Context) this.d, (Runnable) this.f21905e);
                return;
            case 3:
                ((VoIPService) this.f21903b).lambda$startConferenceGroupCall$44((TLObject) this.f21904c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f21905e);
                return;
            case 4:
                ((VoIPService) this.f21903b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f21904c, (TLObject) this.d, (byte[]) this.f21905e);
                return;
            case 5:
                ((VoIPService) this.f21903b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f21904c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f21905e);
                return;
            default:
                ((VoIPService) this.f21903b).lambda$startConferenceGroupCall$31((TLObject) this.f21904c, (AccountInstance) this.d, (TLRPC.TL_error) this.f21905e);
                return;
        }
    }
}
