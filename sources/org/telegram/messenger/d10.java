package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;
public final class d10 extends TLObject {
    public final boolean f22121a;
    public final long f22122b;
    public final long f22123c;
    public final int d;
    public final String f22124e;
    public final String f22125f;
    public final e10 f22126i;

    public d10(e10 e10Var, NativeByteBuffer nativeByteBuffer) {
        this.f22126i = e10Var;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.f22122b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f22124e = nativeByteBuffer.readString(true);
            this.f22125f = nativeByteBuffer.readString(true);
        } else if (readInt32 == 2058772877) {
            this.f22123c = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.f22124e = nativeByteBuffer.readString(true);
            this.f22125f = nativeByteBuffer.readString(true);
        } else {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10 = this.f22121a;
        String str = this.f22125f;
        String str2 = this.f22124e;
        int i3 = this.d;
        if (z10) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.f22123c);
            outputSerializedData.writeInt32(i3);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.f22122b);
        outputSerializedData.writeInt32(i3);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public d10(e10 e10Var, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.f22126i = e10Var;
        this.f22122b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.f22124e = tL_updateNewAuthorization.device;
        this.f22125f = tL_updateNewAuthorization.location;
    }

    public d10(e10 e10Var, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.f22126i = e10Var;
        this.f22121a = true;
        long j10 = tL_updateNewBotConnection.bot_id;
        this.f22123c = j10;
        this.f22122b = j10;
        this.d = tL_updateNewBotConnection.date;
        this.f22124e = tL_updateNewBotConnection.device;
        this.f22125f = tL_updateNewBotConnection.location;
    }
}
