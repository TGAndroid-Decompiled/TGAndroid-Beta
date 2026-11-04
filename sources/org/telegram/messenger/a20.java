package org.telegram.messenger;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class a20 extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int f21433a;
    public boolean f21434b;
    public boolean f21435c;
    public String d;
    public float f21436e = 1.0f;
    public long f21437f = 0;
    public boolean f21438i = true;
    public float f21439j;
    public float f21440k;
    public int f21441l;
    public int f21442m;
    public long f21443o;
    public gi.s f21444r;
    public FloatBuffer f21445s;
    public FloatBuffer f21446t;
    public org.telegram.ui.Components.t5 f21447u;
    public float v;
    public SurfaceTexture f21448z;

    public static ArrayList a(gi.f7 f7Var) {
        if (f7Var != null && f7Var.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < f7Var.T.size(); i3++) {
                gi.f7 f7Var2 = (gi.f7) f7Var.T.get(i3);
                ?? tLObject = new TLObject();
                tLObject.f21436e = 1.0f;
                tLObject.f21437f = 0L;
                tLObject.f21438i = true;
                tLObject.f21434b = f7Var2.K;
                tLObject.f21435c = f7Var2.Y;
                tLObject.d = f7Var2.L.getAbsolutePath();
                tLObject.f21436e = f7Var2.P;
                tLObject.f21438i = f7Var2.U;
                tLObject.f21437f = f7Var2.X;
                tLObject.f21439j = f7Var2.V;
                tLObject.f21440k = f7Var2.W;
                tLObject.f21441l = f7Var2.f12726k0;
                tLObject.f21442m = f7Var2.f12728l0;
                tLObject.f21443o = f7Var2.f12720h0;
                tLObject.f21444r = (gi.s) f7Var.S.f13589e.get(i3);
                arrayList.add(tLObject);
            }
            return arrayList;
        }
        return null;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        boolean z12;
        int readInt32 = inputSerializedData.readInt32(z10);
        this.f21433a = readInt32;
        boolean z13 = false;
        if ((readInt32 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f21434b = z11;
        if ((readInt32 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f21438i = z12;
        if ((readInt32 & 4) != 0) {
            z13 = true;
        }
        this.f21435c = z13;
        this.d = inputSerializedData.readString(z10);
        this.f21436e = inputSerializedData.readFloat(z10);
        this.f21437f = inputSerializedData.readInt64(z10);
        this.f21439j = inputSerializedData.readFloat(z10);
        this.f21440k = inputSerializedData.readFloat(z10);
        this.f21441l = inputSerializedData.readInt32(z10);
        this.f21442m = inputSerializedData.readInt32(z10);
        this.f21443o = inputSerializedData.readInt64(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i3;
        int i10;
        int i11;
        if (this.f21434b) {
            i3 = this.f21433a | 1;
        } else {
            i3 = this.f21433a & (-2);
        }
        this.f21433a = i3;
        if (this.f21438i) {
            i10 = i3 | 2;
        } else {
            i10 = i3 & (-3);
        }
        this.f21433a = i10;
        if (this.f21435c) {
            i11 = i10 | 4;
        } else {
            i11 = i10 & (-5);
        }
        this.f21433a = i11;
        outputSerializedData.writeInt32(i11);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.f21436e);
        outputSerializedData.writeInt64(this.f21437f);
        outputSerializedData.writeFloat(this.f21439j);
        outputSerializedData.writeFloat(this.f21440k);
        outputSerializedData.writeInt32(this.f21441l);
        outputSerializedData.writeInt32(this.f21442m);
        outputSerializedData.writeInt64(this.f21443o);
    }
}
