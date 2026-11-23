package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class e10 extends TLObject {
    public final boolean f23753a;
    public final long f23754b;
    public final long f23755c;
    public final int d;
    public final String f23756e;
    public final String f23757f;
    public final f10 f23758i;

    public e10(f10 f10Var, NativeByteBuffer nativeByteBuffer) {
        this.f23758i = f10Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f23754b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f23756e = nativeByteBuffer.readString(true);
            this.f23757f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f23755c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f23756e = nativeByteBuffer.readString(true);
            this.f23757f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.f23753a;
        String str = this.f23757f;
        String str2 = this.f23756e;
        int i7 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f23755c);
            outputSerializedData.writeInt32(i7);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f23754b);
        outputSerializedData.writeInt32(i7);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public e10(f10 f10Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f23758i = f10Var;
        this.f23754b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.f23756e = tL_updateNewAuthorization.device;
        this.f23757f = tL_updateNewAuthorization.location;
    }

    public e10(f10 f10Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f23758i = f10Var;
        this.f23753a = true;
        long j3 = tL_updateNewBotConnection.bot_id;
        this.f23755c = j3;
        this.f23754b = j3;
        this.d = tL_updateNewBotConnection.date;
        this.f23756e = tL_updateNewBotConnection.device;
        this.f23757f = tL_updateNewBotConnection.location;
    }
}
