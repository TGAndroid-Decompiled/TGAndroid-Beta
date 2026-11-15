package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class i10 extends TLObject {
    public final boolean f24264a;
    public final long f24265b;
    public final long f24266c;
    public final int d;
    public final String f24267e;
    public final String f24268f;
    public final j10 f24269i;

    public i10(j10 j10Var, NativeByteBuffer nativeByteBuffer) {
        this.f24269i = j10Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f24265b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f24267e = nativeByteBuffer.readString(true);
            this.f24268f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f24266c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f24267e = nativeByteBuffer.readString(true);
            this.f24268f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.f24264a;
        String str = this.f24268f;
        String str2 = this.f24267e;
        int i7 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f24266c);
            outputSerializedData.writeInt32(i7);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f24265b);
        outputSerializedData.writeInt32(i7);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public i10(j10 j10Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f24269i = j10Var;
        this.f24265b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.f24267e = tL_updateNewAuthorization.device;
        this.f24268f = tL_updateNewAuthorization.location;
    }

    public i10(j10 j10Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f24269i = j10Var;
        this.f24264a = true;
        long j3 = tL_updateNewBotConnection.bot_id;
        this.f24266c = j3;
        this.f24265b = j3;
        this.d = tL_updateNewBotConnection.date;
        this.f24267e = tL_updateNewBotConnection.device;
        this.f24268f = tL_updateNewBotConnection.location;
    }
}
