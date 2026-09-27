package ci;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class jd extends TLObject {
    public double f4890a;
    public double f4891b;
    public String f4892c;
    public float d;

    public final String a() {
        if (kd.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.a.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f4890a);
        outputSerializedData.writeDouble(this.f4891b);
        outputSerializedData.writeString(this.f4892c);
        outputSerializedData.writeFloat(this.d);
    }
}
