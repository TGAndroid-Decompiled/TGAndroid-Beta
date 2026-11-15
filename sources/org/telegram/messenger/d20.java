package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class d20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f23016a;
    public e20 f23017b;
    public byte f23018c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f23018c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f23016a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f23016a)) {
            this.f23016a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f23018c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f23016a));
        if (!TextUtils.isEmpty(this.f23016a)) {
            outputSerializedData.writeString(this.f23016a);
        }
    }
}
