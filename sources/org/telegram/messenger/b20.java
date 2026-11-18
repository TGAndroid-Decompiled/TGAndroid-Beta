package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class b20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f23022a;
    public c20 f23023b;
    public byte f23024c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f23024c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f23022a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f23022a)) {
            this.f23022a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f23024c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f23022a));
        if (!TextUtils.isEmpty(this.f23022a)) {
            outputSerializedData.writeString(this.f23022a);
        }
    }
}
