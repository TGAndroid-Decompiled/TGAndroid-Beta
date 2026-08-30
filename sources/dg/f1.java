package dg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f1 extends TLObject {
    public static final int f4504j = 0;
    public int f4505a;
    public String f4506b;
    public String f4507c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f4508f = true;
    public int f4509i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        boolean z10;
        int readInt32 = inputSerializedData.readInt32(z4);
        this.f4505a = readInt32;
        boolean z11 = false;
        if ((readInt32 & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if ((readInt32 & 16) != 0) {
            z11 = true;
        }
        this.f4508f = z11;
        this.f4507c = inputSerializedData.readString(z4);
        if ((this.f4505a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }
        if ((this.f4505a & 2) != 0) {
            this.f4506b = inputSerializedData.readString(z4);
        }
        if ((this.f4505a & 4) != 0) {
            this.f4509i = inputSerializedData.readInt32(z4);
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
            i10 = this.f4505a | 1;
        } else {
            i10 = this.f4505a & (-2);
        }
        this.f4505a = i10;
        if (!TextUtils.isEmpty(this.f4506b)) {
            i11 = this.f4505a | 2;
        } else {
            i11 = this.f4505a & (-3);
        }
        this.f4505a = i11;
        if (this.e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f4505a = i12;
        if (this.f4508f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f4505a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f4507c);
        if ((this.f4505a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f4505a & 2) != 0) {
            outputSerializedData.writeString(this.f4506b);
        }
        if ((this.f4505a & 4) != 0) {
            outputSerializedData.writeInt32(this.f4509i);
        }
    }
}
