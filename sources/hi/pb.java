package hi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class pb extends TLObject {
    public double f15281a;
    public double f15282b;
    public String f15283c;
    public float d;

    public final String a() {
        if (qb.a()) {
            return Math.round(this.d) + "°C";
        }
        return a8.p0.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.f15281a);
        outputSerializedData.writeDouble(this.f15282b);
        outputSerializedData.writeString(this.f15283c);
        outputSerializedData.writeFloat(this.d);
    }
}
