package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class a20 extends TLObject {
    public final boolean f14555a;
    public final long f14556b;
    public final long f14557c;
    public final int d;
    public final String e;
    public final String f14558f;
    public final b20 f14559i;

    public a20(b20 b20Var, NativeByteBuffer nativeByteBuffer) {
        this.f14559i = b20Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f14556b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.e = nativeByteBuffer.readString(true);
            this.f14558f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f14557c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.e = nativeByteBuffer.readString(true);
            this.f14558f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.f14555a;
        String str = this.f14558f;
        String str2 = this.e;
        int i10 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f14557c);
            outputSerializedData.writeInt32(i10);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f14556b);
        outputSerializedData.writeInt32(i10);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public a20(b20 b20Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f14559i = b20Var;
        this.f14556b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.e = tL_updateNewAuthorization.device;
        this.f14558f = tL_updateNewAuthorization.location;
    }

    public a20(b20 b20Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f14559i = b20Var;
        this.f14555a = true;
        long j10 = tL_updateNewBotConnection.bot_id;
        this.f14557c = j10;
        this.f14556b = j10;
        this.d = tL_updateNewBotConnection.date;
        this.e = tL_updateNewBotConnection.device;
        this.f14558f = tL_updateNewBotConnection.location;
    }
}
