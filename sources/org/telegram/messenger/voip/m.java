package org.telegram.messenger.voip;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m implements Runnable {
    public final int f19411a;
    public final Object f19412b;
    public final Object f19413c;
    public final Object d;
    public final Object f19414e;

    public m(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19411a = i10;
        this.f19412b = obj;
        this.f19413c = obj2;
        this.d = obj3;
        this.f19414e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f19411a) {
            case 0:
                VoIPDebugToSend.d((VoIPDebugToSend) this.f19412b, (VoIPDebugToSend.Data) this.f19413c, (File) this.d, (TL_phone.saveCallDebug) this.f19414e);
                return;
            case 1:
                ((NativeInstance) this.f19412b).lambda$onAudioLevelsUpdated$1((int[]) this.f19413c, (float[]) this.d, (boolean[]) this.f19414e);
                return;
            case 2:
                VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.f19412b, (TLRPC.TL_error) this.f19413c, (Context) this.d, (Runnable) this.f19414e);
                return;
            case 3:
                ((VoIPService) this.f19412b).lambda$startConferenceGroupCall$44((TLObject) this.f19413c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.f19414e);
                return;
            case 4:
                ((VoIPService) this.f19412b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.f19413c, (TLObject) this.d, (byte[]) this.f19414e);
                return;
            case 5:
                ((VoIPService) this.f19412b).lambda$startGroupCheckShortpoll$63((TLRPC.TL_error) this.f19413c, (TLObject) this.d, (TL_phone.checkGroupCall) this.f19414e);
                return;
            default:
                ((VoIPService) this.f19412b).lambda$startConferenceGroupCall$31((TLObject) this.f19413c, (AccountInstance) this.d, (TLRPC.TL_error) this.f19414e);
                return;
        }
    }
}
