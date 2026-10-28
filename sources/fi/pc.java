package fi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class pc extends TLObject {
    public double f11452a;
    public double f11453b;
    public String f11454c;
    public float d;

    public final String a() {
        if (qc.b()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f11452a);
        outputSerializedData.writeDouble(this.f11453b);
        outputSerializedData.writeString(this.f11454c);
        outputSerializedData.writeFloat(this.d);
    }
}
