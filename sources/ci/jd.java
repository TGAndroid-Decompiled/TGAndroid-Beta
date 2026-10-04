package ci;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class jd extends TLObject {
    public double f5279a;
    public double f5280b;
    public String f5281c;
    public float d;

    public final String a() {
        if (kd.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.a.o((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f5279a);
        outputSerializedData.writeDouble(this.f5280b);
        outputSerializedData.writeString(this.f5281c);
        outputSerializedData.writeFloat(this.d);
    }
}
