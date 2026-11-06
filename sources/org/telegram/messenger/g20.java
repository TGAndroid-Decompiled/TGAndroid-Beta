package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class g20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String f22566a;
    public h20 f22567b;
    public byte f22568c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        super.readParams(inputSerializedData, z9);
        this.f22568c = inputSerializedData.readByte(z9);
        if (inputSerializedData.readBool(z9)) {
            this.f22566a = inputSerializedData.readString(z9);
        }
        if (TextUtils.isEmpty(this.f22566a)) {
            this.f22566a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.f22568c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.f22566a));
        if (!TextUtils.isEmpty(this.f22566a)) {
            outputSerializedData.writeString(this.f22566a);
        }
    }
}
