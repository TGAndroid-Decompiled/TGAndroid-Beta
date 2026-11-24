package defpackage;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class e01 extends TLObject {
    public long a;
    public long b;
    public String c;
    public htc d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        this.a = inputSerializedData.readInt64(z);
        this.b = inputSerializedData.readInt64(z);
        this.c = inputSerializedData.readString(z);
        htc htcVar = new htc();
        this.d = htcVar;
        htcVar.readParams(inputSerializedData, z);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.a);
        outputSerializedData.writeInt64(this.b);
        String str = this.c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
