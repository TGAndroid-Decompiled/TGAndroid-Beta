package eg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d1 extends TLObject {
    public static final int f5150j = 0;
    public int f5151a;
    public String f5152b;
    public String f5153c;
    public TLRPC.WebPage d;
    public boolean f5154e;
    public boolean f5155f = true;
    public int f5156i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        boolean z10;
        int readInt32 = inputSerializedData.readInt32(z4);
        this.f5151a = readInt32;
        boolean z11 = false;
        if ((readInt32 & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5154e = z10;
        if ((readInt32 & 16) != 0) {
            z11 = true;
        }
        this.f5155f = z11;
        this.f5153c = inputSerializedData.readString(z4);
        if ((this.f5151a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }
        if ((this.f5151a & 2) != 0) {
            this.f5152b = inputSerializedData.readString(z4);
        }
        if ((this.f5151a & 4) != 0) {
            this.f5156i = inputSerializedData.readInt32(z4);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i10;
        int i11;
        int i12;
        int i13;
        outputSerializedData.writeInt32(-625858389);
        if (this.d != null) {
            i10 = this.f5151a | 1;
        } else {
            i10 = this.f5151a & (-2);
        }
        this.f5151a = i10;
        if (!TextUtils.isEmpty(this.f5152b)) {
            i11 = this.f5151a | 2;
        } else {
            i11 = this.f5151a & (-3);
        }
        this.f5151a = i11;
        if (this.f5154e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f5151a = i12;
        if (this.f5155f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f5151a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f5153c);
        if ((this.f5151a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f5151a & 2) != 0) {
            outputSerializedData.writeString(this.f5152b);
        }
        if ((this.f5151a & 4) != 0) {
            outputSerializedData.writeInt32(this.f5156i);
        }
    }
}
