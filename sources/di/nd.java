package di;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class nd extends TLObject {
    public double f7732a;
    public double f7733b;
    public String f7734c;
    public float d;

    public final String a() {
        if (od.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.a.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f7732a);
        outputSerializedData.writeDouble(this.f7733b);
        outputSerializedData.writeString(this.f7734c);
        outputSerializedData.writeFloat(this.d);
    }
}
