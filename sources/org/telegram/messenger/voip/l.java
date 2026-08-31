package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class l implements Runnable {
    public final int f20428a;
    public final Object f20429b;
    public final Object f20430c;
    public final Object d;
    public final Object f20431e;

    public l(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20428a = i10;
        this.f20429b = obj;
        this.f20430c = obj2;
        this.d = obj3;
        this.f20431e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f20428a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f20429b, (VoIPDebugToSend.Data) this.f20430c, (File) this.d, (TL_phone.saveCallDebug) this.f20431e);
                return;
            case 1:
                ((NativeInstance) this.f20429b).lambda$onAudioLevelsUpdated$1((int[]) this.f20430c, (float[]) this.d, (boolean[]) this.f20431e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f20429b, (TLRPC.TL_error) this.f20430c, (Context) this.d, (Runnable) this.f20431e);
                return;
            case 3:
                ((VoIPService) this.f20429b).lambda$startConferenceGroupCall$44((TLObject) this.f20430c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f20431e);
                return;
            case 4:
                ((VoIPService) this.f20429b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f20430c, (TLObject) this.d, (byte[]) this.f20431e);
                return;
            case 5:
                ((VoIPService) this.f20429b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f20430c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f20431e);
                return;
            default:
                ((VoIPService) this.f20429b).lambda$startConferenceGroupCall$31((TLObject) this.f20430c, (AccountInstance) this.d, (TLRPC.TL_error) this.f20431e);
                return;
        }
    }
}
