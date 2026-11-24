package defpackage;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gi0 extends TLObject {
    public int a;
    public long b;
    public TLRPC.InputStorePaymentPurpose c;

    public static gi0 a(int i, SerializedData serializedData) {
        TLObject tLObject;
        if (i != 495638674) {
            tLObject = null;
        } else {
            tLObject = new TLObject();
        }
        return (gi0) TLObject.TLdeserialize(gi0.class, tLObject, serializedData, i, true);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        this.a = inputSerializedData.readInt32(z);
        this.b = inputSerializedData.readInt64(z);
        if ((this.a & 1) != 0) {
            this.c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.a);
        outputSerializedData.writeInt64(this.b);
        if ((this.a & 1) != 0) {
            this.c.serializeToStream(outputSerializedData);
        }
    }
}
