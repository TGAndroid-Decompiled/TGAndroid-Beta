package gi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class sb extends TLObject {
    public double f13582a;
    public double f13583b;
    public String f13584c;
    public float d;

    public final String a() {
        if (tb.a()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.o((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f13582a);
        outputSerializedData.writeDouble(this.f13583b);
        outputSerializedData.writeString(this.f13584c);
        outputSerializedData.writeFloat(this.d);
    }
}
