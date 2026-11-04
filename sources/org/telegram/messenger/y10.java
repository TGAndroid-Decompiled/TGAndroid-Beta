package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class y10 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f26509a;
    public z10 f26510b;
    public byte f26511c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f26511c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f26509a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f26509a)) {
            this.f26509a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f26511c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f26509a));
        if (!TextUtils.isEmpty(this.f26509a)) {
            outputSerializedData.writeString(this.f26509a);
        }
    }
}
