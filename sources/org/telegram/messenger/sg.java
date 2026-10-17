package org.telegram.messenger;

import android.app.NotificationChannel;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
public final class sg implements Vector.TLDeserializer, org.telegram.ui.ActionBar.a2 {
    public final int f19503a;

    public sg(int i10) {
        this.f19503a = i10;
    }

    public static NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f19503a) {
            case 2:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        SharedConfig.lambda$checkSdCard$1(b2Var, i10);
    }
}
