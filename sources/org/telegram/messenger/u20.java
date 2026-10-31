package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class u20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f18224a;
    public v20 f18225b;
    public byte f18226c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f18226c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f18224a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f18224a)) {
            this.f18224a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f18226c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f18224a));
        if (!TextUtils.isEmpty(this.f18224a)) {
            outputSerializedData.writeString(this.f18224a);
        }
    }
}
