package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19587a;
    public final Object f19588b;
    public final Object f19589c;
    public final Object d;
    public final Object f19590e;

    public m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19587a = i10;
        this.f19588b = obj;
        this.f19589c = obj2;
        this.d = obj3;
        this.f19590e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19587a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f19588b, (VoIPDebugToSend.Data) this.f19589c, (File) this.d, (TL_phone.saveCallDebug) this.f19590e);
                return;
            case 1:
                ((NativeInstance) this.f19588b).lambda$onAudioLevelsUpdated$1((int[]) this.f19589c, (float[]) this.d, (boolean[]) this.f19590e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f19588b, (TLRPC.TL_error) this.f19589c, (Context) this.d, (Runnable) this.f19590e);
                return;
            case 3:
                ((VoIPService) this.f19588b).lambda$startConferenceGroupCall$31((TLObject) this.f19589c, (AccountInstance) this.d, (TLRPC.TL_error) this.f19590e);
                return;
            case 4:
                ((VoIPService) this.f19588b).lambda$startConferenceGroupCall$44((TLObject) this.f19589c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f19590e);
                return;
            case 5:
                ((VoIPService) this.f19588b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f19589c, (TLObject) this.d, (byte[]) this.f19590e);
                return;
            default:
                ((VoIPService) this.f19588b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f19589c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f19590e);
                return;
        }
    }
}
