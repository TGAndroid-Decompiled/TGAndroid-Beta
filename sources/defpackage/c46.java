package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c46 extends TLObject {
    public static final int j = 0;
    public int a;
    public String b;
    public String c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f = true;
    public int i;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        boolean z2;
        int readInt32 = inputSerializedData.readInt32(z);
        this.a = readInt32;
        boolean z3 = false;
        if ((readInt32 & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.e = z2;
        if ((readInt32 & 16) != 0) {
            z3 = true;
        }
        this.f = z3;
        this.c = inputSerializedData.readString(z);
        if ((this.a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if ((this.a & 2) != 0) {
            this.b = inputSerializedData.readString(z);
        }
        if ((this.a & 4) != 0) {
            this.i = inputSerializedData.readInt32(z);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i;
        int i2;
        int i3;
        int i4;
        outputSerializedData.writeInt32(-625858389);
        TLRPC.WebPage webPage = this.d;
        int i5 = this.a;
        if (webPage != null) {
            i = i5 | 1;
        } else {
            i = i5 & (-2);
        }
        this.a = i;
        boolean isEmpty = TextUtils.isEmpty(this.b);
        int i6 = this.a;
        if (!isEmpty) {
            i2 = i6 | 2;
        } else {
            i2 = i6 & (-3);
        }
        this.a = i2;
        if (this.e) {
            i3 = i2 | 8;
        } else {
            i3 = i2 & (-9);
        }
        this.a = i3;
        if (this.f) {
            i4 = i3 | 16;
        } else {
            i4 = i3 & (-17);
        }
        this.a = i4;
        outputSerializedData.writeInt32(i4);
        outputSerializedData.writeString(this.c);
        if ((this.a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.a & 2) != 0) {
            outputSerializedData.writeString(this.b);
        }
        if ((this.a & 4) != 0) {
            outputSerializedData.writeInt32(this.i);
        }
    }
}
