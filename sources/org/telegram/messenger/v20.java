package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class v20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f18585a;
    public w20 f18586b;
    public byte f18587c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.f18587c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.f18585a = inputSerializedData.readString(z10);
        }
        if (TextUtils.isEmpty(this.f18585a)) {
            this.f18585a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f18587c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f18585a));
        if (!TextUtils.isEmpty(this.f18585a)) {
            outputSerializedData.writeString(this.f18585a);
        }
    }
}
