package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class a20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f22923a;
    public b20 f22924b;
    public byte f22925c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f22925c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f22923a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f22923a)) {
            this.f22923a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f22925c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f22923a));
        if (!TextUtils.isEmpty(this.f22923a)) {
            outputSerializedData.writeString(this.f22923a);
        }
    }
}
