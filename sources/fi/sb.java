package fi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class sb extends TLObject {
    public double f12820a;
    public double f12821b;
    public String f12822c;
    public float d;

    public final String a() {
        if (tb.a()) {
            return Math.round(this.d) + "°C";
        }
        return a8.p0.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f12820a);
        outputSerializedData.writeDouble(this.f12821b);
        outputSerializedData.writeString(this.f12822c);
        outputSerializedData.writeFloat(this.d);
    }
}
