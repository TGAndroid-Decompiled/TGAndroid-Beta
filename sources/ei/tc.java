package ei;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class tc extends TLObject {
    public double f9867a;
    public double f9868b;
    public String f9869c;
    public float d;

    public final String a() {
        if (uc.b()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f9867a);
        outputSerializedData.writeDouble(this.f9868b);
        outputSerializedData.writeString(this.f9869c);
        outputSerializedData.writeFloat(this.d);
    }
}
