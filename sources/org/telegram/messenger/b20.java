package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class b20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f23047a;
    public c20 f23048b;
    public byte f23049c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f23049c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f23047a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f23047a)) {
            this.f23047a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f23049c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f23047a));
        if (!TextUtils.isEmpty(this.f23047a)) {
            outputSerializedData.writeString(this.f23047a);
        }
    }
}
