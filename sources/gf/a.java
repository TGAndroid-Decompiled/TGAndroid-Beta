package gf;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class a extends TLObject {

    public int f6926a;

    public long f6927b;

    public TLRPC.InputStorePaymentPurpose f6928c;

    public static a a(SerializedData serializedData, int i10) {
        return (a) TLObject.TLdeserialize(a.class, i10 != 495638674 ? null : new a(), serializedData, i10, true);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f6926a = inputSerializedData.readInt32(z10);
        this.f6927b = inputSerializedData.readInt64(z10);
        if ((this.f6926a & 1) != 0) {
            this.f6928c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f6926a);
        outputSerializedData.writeInt64(this.f6927b);
        if ((this.f6926a & 1) != 0) {
            this.f6928c.serializeToStream(outputSerializedData);
        }
    }
}
