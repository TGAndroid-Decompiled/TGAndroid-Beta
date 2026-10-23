package ei;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class tc extends TLObject {
    public double f9882a;
    public double f9883b;
    public String f9884c;
    public float d;

    public final String a() {
        if (uc.b()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f9882a);
        outputSerializedData.writeDouble(this.f9883b);
        outputSerializedData.writeString(this.f9884c);
        outputSerializedData.writeFloat(this.d);
    }
}
