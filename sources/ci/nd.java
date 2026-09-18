package ci;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class nd extends TLObject {
    public double f5102a;
    public double f5103b;
    public String f5104c;
    public float d;

    public final String a() {
        if (od.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.a.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f5102a);
        outputSerializedData.writeDouble(this.f5103b);
        outputSerializedData.writeString(this.f5104c);
        outputSerializedData.writeFloat(this.d);
    }
}
