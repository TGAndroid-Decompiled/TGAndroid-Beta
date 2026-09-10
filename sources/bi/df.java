package bi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class df extends TLObject {
    public double f2571a;
    public double f2572b;
    public String f2573c;
    public float d;

    public final String a() {
        if (ef.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.a.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f2571a);
        outputSerializedData.writeDouble(this.f2572b);
        outputSerializedData.writeString(this.f2573c);
        outputSerializedData.writeFloat(this.d);
    }
}
