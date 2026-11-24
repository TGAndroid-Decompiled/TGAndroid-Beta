package defpackage;

import org.telegram.tgnet.OutputSerializedData;
public final class g9c implements p8c {
    public final byte a;
    public final OutputSerializedData b;

    public g9c(OutputSerializedData outputSerializedData, byte b) {
        this.a = b;
        this.b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        OutputSerializedData outputSerializedData = this.b;
        switch (b) {
            case 0:
                outputSerializedData.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                outputSerializedData.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                outputSerializedData.writeByteArray((byte[]) obj);
                return;
            default:
                outputSerializedData.writeString((String) obj);
                return;
        }
    }
}
