package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class g10 extends TLObject {
    public final boolean f24061a;
    public final long f24062b;
    public final long f24063c;
    public final int d;
    public final String f24064e;
    public final String f24065f;
    public final h10 f24066i;

    public g10(h10 h10Var, NativeByteBuffer nativeByteBuffer) {
        this.f24066i = h10Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f24062b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f24064e = nativeByteBuffer.readString(true);
            this.f24065f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f24063c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f24064e = nativeByteBuffer.readString(true);
            this.f24065f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.f24061a;
        String str = this.f24065f;
        String str2 = this.f24064e;
        int i7 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f24063c);
            outputSerializedData.writeInt32(i7);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f24062b);
        outputSerializedData.writeInt32(i7);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public g10(h10 h10Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f24066i = h10Var;
        this.f24062b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.f24064e = tL_updateNewAuthorization.device;
        this.f24065f = tL_updateNewAuthorization.location;
    }

    public g10(h10 h10Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f24066i = h10Var;
        this.f24061a = true;
        long j3 = tL_updateNewBotConnection.bot_id;
        this.f24063c = j3;
        this.f24062b = j3;
        this.d = tL_updateNewBotConnection.date;
        this.f24064e = tL_updateNewBotConnection.device;
        this.f24065f = tL_updateNewBotConnection.location;
    }
}
