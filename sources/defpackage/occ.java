package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;
public final class occ extends TLRPC.TL_messageEntityCustomEmoji {
    public String a;
    public pcc b;
    public byte c;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        super.readParams(inputSerializedData, z);
        this.c = inputSerializedData.readByte(z);
        if (inputSerializedData.readBool(z)) {
            this.a = inputSerializedData.readString(z);
        }
        if (TextUtils.isEmpty(this.a)) {
            this.a = null;
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.a));
        if (!TextUtils.isEmpty(this.a)) {
            outputSerializedData.writeString(this.a);
        }
    }
}
