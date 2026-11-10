package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class g20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f22589a;
    public h20 f22590b;
    public byte f22591c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        super.readParams(inputSerializedData, z9);
        this.f22591c = inputSerializedData.readByte(z9);
        if (inputSerializedData.readBool(z9)) {
            this.f22589a = inputSerializedData.readString(z9);
        }
        if (TextUtils.isEmpty(this.f22589a)) {
            this.f22589a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f22591c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f22589a));
        if (!TextUtils.isEmpty(this.f22589a)) {
            outputSerializedData.writeString(this.f22589a);
        }
    }
}
