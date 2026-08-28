package ff;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a extends TLObject {
    public int f6126a;
    public long f6127b;
    public TLRPC.InputStorePaymentPurpose f6128c;

    public static a a(SerializedData serializedData, int i9) {
        TLObject tLObject;
        if (i9 != 495638674) {
            tLObject = null;
        } else {
            tLObject = new TLObject();
        }
        return (a) TLObject.TLdeserialize(a.class, tLObject, serializedData, i9, true);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f6126a = inputSerializedData.readInt32(z10);
        this.f6127b = inputSerializedData.readInt64(z10);
        if ((this.f6126a & 1) != 0) {
            this.f6128c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f6126a);
        outputSerializedData.writeInt64(this.f6127b);
        if ((this.f6126a & 1) != 0) {
            this.f6128c.serializeToStream(outputSerializedData);
        }
    }
}
