package bg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h1 extends TLObject {
    public static final int f2281j = 0;
    public int f2282a;
    public String f2283b;
    public String f2284c;
    public TLRPC.WebPage d;
    public boolean f2285e;
    public boolean f2286f = true;
    public int f2287i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f2282a = readInt32;
        boolean z12 = false;
        if ((readInt32 & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f2285e = z11;
        if ((readInt32 & 16) != 0) {
            z12 = true;
        }
        this.f2286f = z12;
        this.f2284c = inputSerializedData.readString(z10);
        if ((this.f2282a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f2282a & 2) != 0) {
            this.f2283b = inputSerializedData.readString(z10);
        }
        if ((this.f2282a & 4) != 0) {
            this.f2287i = inputSerializedData.readInt32(z10);
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
            i10 = this.f2282a | 1;
        } else {
            i10 = this.f2282a & (-2);
        }
        this.f2282a = i10;
        if (!TextUtils.isEmpty(this.f2283b)) {
            i11 = this.f2282a | 2;
        } else {
            i11 = this.f2282a & (-3);
        }
        this.f2282a = i11;
        if (this.f2285e) {
            i12 = i11 | 8;
        } else {
            i12 = i11 & (-9);
        }
        this.f2282a = i12;
        if (this.f2286f) {
            i13 = i12 | 16;
        } else {
            i13 = i12 & (-17);
        }
        this.f2282a = i13;
        outputSerializedData.writeInt32(i13);
        outputSerializedData.writeString(this.f2284c);
        if ((this.f2282a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.f2282a & 2) != 0) {
            outputSerializedData.writeString(this.f2283b);
        }
        if ((this.f2282a & 4) != 0) {
            outputSerializedData.writeInt32(this.f2287i);
        }
    }
}
