package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class f10 extends TLObject {
    public final boolean f23815a;
    public final long f23816b;
    public final long f23817c;
    public final int d;
    public final String f23818e;
    public final String f23819f;
    public final g10 f23820i;

    public f10(g10 g10Var, NativeByteBuffer nativeByteBuffer) {
        this.f23820i = g10Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f23816b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f23818e = nativeByteBuffer.readString(true);
            this.f23819f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f23817c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f23818e = nativeByteBuffer.readString(true);
            this.f23819f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.f23815a;
        String str = this.f23819f;
        String str2 = this.f23818e;
        int i7 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f23817c);
            outputSerializedData.writeInt32(i7);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f23816b);
        outputSerializedData.writeInt32(i7);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public f10(g10 g10Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f23820i = g10Var;
        this.f23816b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.f23818e = tL_updateNewAuthorization.device;
        this.f23819f = tL_updateNewAuthorization.location;
    }

    public f10(g10 g10Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f23820i = g10Var;
        this.f23815a = true;
        long j3 = tL_updateNewBotConnection.bot_id;
        this.f23817c = j3;
        this.f23816b = j3;
        this.d = tL_updateNewBotConnection.date;
        this.f23818e = tL_updateNewBotConnection.device;
        this.f23819f = tL_updateNewBotConnection.location;
    }
}
