package hi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class kc extends TLObject {
    public double f14802a;
    public double f14803b;
    public String f14804c;
    public float d;

    public final String a() {
        if (lc.a()) {
            return Math.round(this.d) + "°C";
        }
        return a8.p0.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f14802a);
        outputSerializedData.writeDouble(this.f14803b);
        outputSerializedData.writeString(this.f14804c);
        outputSerializedData.writeFloat(this.d);
    }
}
