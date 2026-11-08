package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class g20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f22585a;
    public h20 f22586b;
    public byte f22587c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        super.readParams(inputSerializedData, z9);
        this.f22587c = inputSerializedData.readByte(z9);
        if (inputSerializedData.readBool(z9)) {
            this.f22585a = inputSerializedData.readString(z9);
        }
        if (TextUtils.isEmpty(this.f22585a)) {
            this.f22585a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f22587c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f22585a));
        if (!TextUtils.isEmpty(this.f22585a)) {
            outputSerializedData.writeString(this.f22585a);
        }
    }
}
