package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class l10 extends TLObject {
    public final boolean f23831a;
    public final long f23832b;
    public final long f23833c;
    public final int d;
    public final String f23834e;
    public final String f23835f;
    public final m10 f23836i;

    public l10(m10 m10Var, NativeByteBuffer nativeByteBuffer) {
        this.f23836i = m10Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f23832b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f23834e = nativeByteBuffer.readString(true);
            this.f23835f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f23833c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f23834e = nativeByteBuffer.readString(true);
            this.f23835f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z9 = this.f23831a;
        String str = this.f23835f;
        String str2 = this.f23834e;
        int i7 = this.d;
        if (z9) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f23833c);
            outputSerializedData.writeInt32(i7);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f23832b);
        outputSerializedData.writeInt32(i7);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public l10(m10 m10Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f23836i = m10Var;
        this.f23832b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.f23834e = tL_updateNewAuthorization.device;
        this.f23835f = tL_updateNewAuthorization.location;
    }

    public l10(m10 m10Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f23836i = m10Var;
        this.f23831a = true;
        long j3 = tL_updateNewBotConnection.bot_id;
        this.f23833c = j3;
        this.f23832b = j3;
        this.d = tL_updateNewBotConnection.date;
        this.f23834e = tL_updateNewBotConnection.device;
        this.f23835f = tL_updateNewBotConnection.location;
    }
}
