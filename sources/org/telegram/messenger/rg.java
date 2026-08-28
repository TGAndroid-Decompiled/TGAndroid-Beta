package org.telegram.messenger;

import android.app.NotificationChannel;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class rg implements org.telegram.ui.ActionBar.b2, Vector.TLDeserializer {
    public static NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i9, z10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        SharedConfig.lambda$checkSdCard$1(c2Var, i9);
    }
}
