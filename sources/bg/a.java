package bg;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a extends TLObject {
    public int f3232a;
    public long f3233b;
    public TLRPC.InputStorePaymentPurpose f3234c;

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
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f3232a = inputSerializedData.readInt32(z9);
        this.f3233b = inputSerializedData.readInt64(z9);
        if ((this.f3232a & 1) != 0) {
            this.f3234c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f3232a);
        outputSerializedData.writeInt64(this.f3233b);
        if ((this.f3232a & 1) != 0) {
            this.f3234c.serializeToStream(outputSerializedData);
        }
    }
}
