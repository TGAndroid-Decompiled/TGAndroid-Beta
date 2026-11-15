package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class d20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f23024a;
    public e20 f23025b;
    public byte f23026c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f23026c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f23024a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f23024a)) {
            this.f23024a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f23026c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f23024a));
        if (!TextUtils.isEmpty(this.f23024a)) {
            outputSerializedData.writeString(this.f23024a);
        }
    }
}
