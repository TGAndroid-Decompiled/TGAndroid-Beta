package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class b20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f23019a;
    public c20 f23020b;
    public byte f23021c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f23021c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f23019a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f23019a)) {
            this.f23019a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f23021c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f23019a));
        if (!TextUtils.isEmpty(this.f23019a)) {
            outputSerializedData.writeString(this.f23019a);
        }
    }
}
