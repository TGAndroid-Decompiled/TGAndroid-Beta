package cg;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a extends TLObject {
    public int f4605a;
    public long f4606b;
    public TLRPC.InputStorePaymentPurpose f4607c;

    public static a a(int i3, SerializedData serializedData) {
        TLObject tLObject;
        if (i3 != 495638674) {
            tLObject = null;
        } else {
            tLObject = new TLObject();
        }
        return (a) TLObject.TLdeserialize(a.class, tLObject, serializedData, i3, true);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f4605a = inputSerializedData.readInt32(z10);
        this.f4606b = inputSerializedData.readInt64(z10);
        if ((this.f4605a & 1) != 0) {
            this.f4607c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f4605a);
        outputSerializedData.writeInt64(this.f4606b);
        if ((this.f4605a & 1) != 0) {
            this.f4607c.serializeToStream(outputSerializedData);
        }
    }
}
