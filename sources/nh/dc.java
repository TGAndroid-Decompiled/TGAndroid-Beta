package nh;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class dc extends TLObject {
    public double f17550a;
    public double f17551b;
    public String f17552c;
    public float d;

    public final String a() {
        if (ec.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.w.l((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f17550a);
        outputSerializedData.writeDouble(this.f17551b);
        outputSerializedData.writeString(this.f17552c);
        outputSerializedData.writeFloat(this.d);
    }
}
