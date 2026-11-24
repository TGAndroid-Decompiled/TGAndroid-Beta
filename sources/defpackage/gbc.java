package defpackage;

import org.telegram.tgnet.InputSerializedData;
public final class gbc implements rac {
    public final byte a;
    public final InputSerializedData b;

    public gbc(InputSerializedData inputSerializedData, byte b) {
        this.a = b;
        this.b = inputSerializedData;
    }

    @Override
    public final Object a(Object obj) {
        byte b = this.a;
        InputSerializedData inputSerializedData = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (b) {
            case 0:
                return Long.valueOf(inputSerializedData.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(inputSerializedData.readInt32(booleanValue));
            case 2:
                return inputSerializedData.readString(booleanValue);
            default:
                return inputSerializedData.readByteArray(booleanValue);
        }
    }
}
