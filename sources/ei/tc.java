package ei;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class tc extends TLObject {
    public double f9866a;
    public double f9867b;
    public String f9868c;
    public float d;

    public final String a() {
        if (uc.b()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f9866a);
        outputSerializedData.writeDouble(this.f9867b);
        outputSerializedData.writeString(this.f9868c);
        outputSerializedData.writeFloat(this.d);
    }
}
