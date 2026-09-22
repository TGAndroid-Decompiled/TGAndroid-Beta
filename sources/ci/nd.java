package ci;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class nd extends TLObject {
    public double f5099a;
    public double f5100b;
    public String f5101c;
    public float d;

    public final String a() {
        if (od.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.a.o((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f5099a);
        outputSerializedData.writeDouble(this.f5100b);
        outputSerializedData.writeString(this.f5101c);
        outputSerializedData.writeFloat(this.d);
    }
}
