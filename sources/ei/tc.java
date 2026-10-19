package ei;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class tc extends TLObject {
    public double f9868a;
    public double f9869b;
    public String f9870c;
    public float d;

    public final String a() {
        if (uc.b()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f9868a);
        outputSerializedData.writeDouble(this.f9869b);
        outputSerializedData.writeString(this.f9870c);
        outputSerializedData.writeFloat(this.d);
    }
}
