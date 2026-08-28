package kh;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class tc extends TLObject {
    public double f16111a;
    public double f16112b;
    public String f16113c;
    public float d;

    public final String a() {
        if (uc.b()) {
            return Math.round(this.d) + "°C";
        }
        return aa.d.l((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f16111a);
        outputSerializedData.writeDouble(this.f16112b);
        outputSerializedData.writeString(this.f16113c);
        outputSerializedData.writeFloat(this.d);
    }
}
