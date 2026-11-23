package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class g10 extends TLObject {
    public final boolean f24025a;
    public final long f24026b;
    public final long f24027c;
    public final int d;
    public final String f24028e;
    public final String f24029f;
    public final h10 f24030i;

    public g10(h10 h10Var, NativeByteBuffer nativeByteBuffer) {
        this.f24030i = h10Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f24026b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f24028e = nativeByteBuffer.readString(true);
            this.f24029f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f24027c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f24028e = nativeByteBuffer.readString(true);
            this.f24029f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.f24025a;
        String str = this.f24029f;
        String str2 = this.f24028e;
        int i7 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f24027c);
            outputSerializedData.writeInt32(i7);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f24026b);
        outputSerializedData.writeInt32(i7);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public g10(h10 h10Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f24030i = h10Var;
        this.f24026b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.f24028e = tL_updateNewAuthorization.device;
        this.f24029f = tL_updateNewAuthorization.location;
    }

    public g10(h10 h10Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f24030i = h10Var;
        this.f24025a = true;
        long j3 = tL_updateNewBotConnection.bot_id;
        this.f24027c = j3;
        this.f24026b = j3;
        this.d = tL_updateNewBotConnection.date;
        this.f24028e = tL_updateNewBotConnection.device;
        this.f24029f = tL_updateNewBotConnection.location;
    }
}
