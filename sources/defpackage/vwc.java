package defpackage;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class vwc extends TLObject {
    public double a;
    public double b;
    public String c;
    public float d;

    public final String a() {
        boolean a = wwc.a();
        float f = this.d;
        if (a) {
            return Math.round(f) + "°C";
        }
        return uh9.l(new StringBuilder(), (int) Math.round(((f * 9.0d) / 5.0d) + 32.0d), "°F");
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.a);
        outputSerializedData.writeDouble(this.b);
        outputSerializedData.writeString(this.c);
        outputSerializedData.writeFloat(this.d);
    }
}
