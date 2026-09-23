package ci;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class kd extends TLObject {
    public double f4927a;
    public double f4928b;
    public String f4929c;
    public float d;

    public final String a() {
        if (ld.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.a.o((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f4927a);
        outputSerializedData.writeDouble(this.f4928b);
        outputSerializedData.writeString(this.f4929c);
        outputSerializedData.writeFloat(this.d);
    }
}
