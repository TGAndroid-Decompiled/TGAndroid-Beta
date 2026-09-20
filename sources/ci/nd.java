package ci;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class nd extends TLObject {
    public double f5103a;
    public double f5104b;
    public String f5105c;
    public float d;

    public final String a() {
        if (od.b()) {
            return Math.round(this.d) + "°C";
        }
        return a4.a.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f5103a);
        outputSerializedData.writeDouble(this.f5104b);
        outputSerializedData.writeString(this.f5105c);
        outputSerializedData.writeFloat(this.d);
    }
}
