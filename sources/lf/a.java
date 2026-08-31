package lf;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a extends TLObject {
    public int f12383a;
    public long f12384b;
    public TLRPC.InputStorePaymentPurpose f12385c;

    public static a a(SerializedData serializedData, int i10) {
        TLObject tLObject;
        if (i10 != 495638674) {
            tLObject = null;
        } else {
            tLObject = new TLObject();
        }
        return (a) TLObject.TLdeserialize(a.class, tLObject, serializedData, i10, true);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.f12383a = inputSerializedData.readInt32(z4);
        this.f12384b = inputSerializedData.readInt64(z4);
        if ((this.f12383a & 1) != 0) {
            this.f12385c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.f12383a);
        outputSerializedData.writeInt64(this.f12384b);
        if ((this.f12383a & 1) != 0) {
            this.f12385c.serializeToStream(outputSerializedData);
        }
    }
}
