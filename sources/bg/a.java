package bg;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a extends TLObject {
    public int f3184a;
    public long f3185b;
    public TLRPC.InputStorePaymentPurpose f3186c;

    public static a a(int i7, SerializedData serializedData) {
        TLObject tLObject;
        if (i7 != 495638674) {
            tLObject = null;
        } else {
            tLObject = new TLObject();
        }
        return (a) TLObject.TLdeserialize(a.class, tLObject, serializedData, i7, true);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f3184a = inputSerializedData.readInt32(z10);
        this.f3185b = inputSerializedData.readInt64(z10);
        if ((this.f3184a & 1) != 0) {
            this.f3186c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f3184a);
        outputSerializedData.writeInt64(this.f3185b);
        if ((this.f3184a & 1) != 0) {
            this.f3186c.serializeToStream(outputSerializedData);
        }
    }
}
