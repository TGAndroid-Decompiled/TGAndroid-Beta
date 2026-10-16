package di;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class id extends TLObject {
    public double f7092a;
    public double f7093b;
    public String f7094c;
    public float d;

    public final String a() {
        if (jd.b()) {
            return Math.round(this.d) + "°C";
        }
        return a1.g.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f7092a);
        outputSerializedData.writeDouble(this.f7093b);
        outputSerializedData.writeString(this.f7094c);
        outputSerializedData.writeFloat(this.d);
    }
}
