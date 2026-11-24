package defpackage;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class au9 extends TLObject {
    public int a;
    public TLRPC.TL_decryptedMessageLayer b;
    public TLRPC.EncryptedFile c;
    public boolean d;
    public byte e;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        inputSerializedData.readInt64(z);
        this.a = inputSerializedData.readInt32(z);
        this.b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        if (inputSerializedData.readBool(z)) {
            this.c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        this.d = inputSerializedData.readBool(z);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z;
        outputSerializedData.writeInt32(1431655929);
        outputSerializedData.writeInt64(0L);
        outputSerializedData.writeInt32(this.a);
        this.b.serializeToStream(outputSerializedData);
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        outputSerializedData.writeBool(z);
        TLRPC.EncryptedFile encryptedFile = this.c;
        if (encryptedFile != null) {
            encryptedFile.serializeToStream(outputSerializedData);
        }
        outputSerializedData.writeBool(this.d);
    }
}
