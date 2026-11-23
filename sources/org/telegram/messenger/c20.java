package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class c20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f23183a;
    public d20 f23184b;
    public byte f23185c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f23185c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f23183a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f23183a)) {
            this.f23183a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f23185c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f23183a));
        if (!TextUtils.isEmpty(this.f23183a)) {
            outputSerializedData.writeString(this.f23183a);
        }
    }
}
