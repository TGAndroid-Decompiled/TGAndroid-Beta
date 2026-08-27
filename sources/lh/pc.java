package lh;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

public final class pc extends TLObject {

    public double f16548a;

    public double f16549b;

    public String f16550c;
    public float d;

    public final String a() {
        if (!qc.b()) {
            return a9.p.k((int) Math.round(((((double) this.d) * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
        }
        return Math.round(this.d) + "°C";
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f16548a);
        outputSerializedData.writeDouble(this.f16549b);
        outputSerializedData.writeString(this.f16550c);
        outputSerializedData.writeFloat(this.d);
    }
}
