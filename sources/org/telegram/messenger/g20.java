package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class g20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f22559a;
    public h20 f22560b;
    public byte f22561c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        super.readParams(inputSerializedData, z9);
        this.f22561c = inputSerializedData.readByte(z9);
        if (inputSerializedData.readBool(z9)) {
            this.f22559a = inputSerializedData.readString(z9);
        }
        if (TextUtils.isEmpty(this.f22559a)) {
            this.f22559a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f22561c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f22559a));
        if (!TextUtils.isEmpty(this.f22559a)) {
            outputSerializedData.writeString(this.f22559a);
        }
    }
}
