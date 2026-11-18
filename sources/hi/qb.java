package hi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class qb extends TLObject {
    public double f15298a;
    public double f15299b;
    public String f15300c;
    public float d;

    public final String a() {
        if (rb.a()) {
            return Math.round(this.d) + "°C";
        }
        return a8.p0.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f15298a);
        outputSerializedData.writeDouble(this.f15299b);
        outputSerializedData.writeString(this.f15300c);
        outputSerializedData.writeFloat(this.d);
    }
}
