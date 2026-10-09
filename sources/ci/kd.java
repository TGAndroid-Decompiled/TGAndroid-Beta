package ci;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class kd extends TLObject {
    public double f5350a;
    public double f5351b;
    public String f5352c;
    public float d;

    public final String a() {
        if (ld.b()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.o((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f5350a);
        outputSerializedData.writeDouble(this.f5351b);
        outputSerializedData.writeString(this.f5352c);
        outputSerializedData.writeFloat(this.d);
    }
}
