package fi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class pc extends TLObject {
    public double f11453a;
    public double f11454b;
    public String f11455c;
    public float d;

    public final String a() {
        if (qc.b()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f11453a);
        outputSerializedData.writeDouble(this.f11454b);
        outputSerializedData.writeString(this.f11455c);
        outputSerializedData.writeFloat(this.d);
    }
}
