package org.telegram.messenger;

import android.app.NotificationChannel;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
public final class xg implements Vector.TLDeserializer, org.telegram.ui.ActionBar.z1 {
    public final int f20151a;

    public xg(int i10) {
        this.f20151a = i10;
    }

    public static NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f20151a) {
            case 2:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        SharedConfig.lambda$checkSdCard$1(c2Var, i10);
    }
}
