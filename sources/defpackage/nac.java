package defpackage;

import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MediaCodecPlayer;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class nac extends TLObject {
    public static final int C = 0;
    public MediaCodecPlayer B;
    public int a;
    public boolean b;
    public boolean c;
    public String d;
    public float e = 1.0f;
    public long f = 0;
    public boolean i = true;
    public float j;
    public float k;
    public int l;
    public int m;
    public long o;
    public ek2 r;
    public FloatBuffer s;
    public FloatBuffer t;
    public km u;
    public float v;
    public SurfaceTexture z;

    public static ArrayList a(f4b f4bVar) {
        if (f4bVar != null && f4bVar.T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < f4bVar.T.size(); i++) {
                f4b f4bVar2 = (f4b) f4bVar.T.get(i);
                ?? tLObject = new TLObject();
                tLObject.e = 1.0f;
                tLObject.f = 0L;
                tLObject.i = true;
                tLObject.b = f4bVar2.K;
                tLObject.c = f4bVar2.Y;
                tLObject.d = f4bVar2.L.getAbsolutePath();
                tLObject.e = f4bVar2.P;
                tLObject.i = f4bVar2.U;
                tLObject.f = f4bVar2.X;
                tLObject.j = f4bVar2.V;
                tLObject.k = f4bVar2.W;
                tLObject.l = f4bVar2.k0;
                tLObject.m = f4bVar2.l0;
                tLObject.o = f4bVar2.h0;
                tLObject.r = (ek2) f4bVar.S.e.get(i);
                arrayList.add(tLObject);
            }
            return arrayList;
        }
        return null;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        boolean z2;
        boolean z3;
        int readInt32 = inputSerializedData.readInt32(z);
        this.a = readInt32;
        boolean z4 = false;
        if ((readInt32 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b = z2;
        if ((readInt32 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.i = z3;
        if ((readInt32 & 4) != 0) {
            z4 = true;
        }
        this.c = z4;
        this.d = inputSerializedData.readString(z);
        this.e = inputSerializedData.readFloat(z);
        this.f = inputSerializedData.readInt64(z);
        this.j = inputSerializedData.readFloat(z);
        this.k = inputSerializedData.readFloat(z);
        this.l = inputSerializedData.readInt32(z);
        this.m = inputSerializedData.readInt32(z);
        this.o = inputSerializedData.readInt64(z);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i;
        int i2;
        int i3;
        boolean z = this.b;
        int i4 = this.a;
        if (z) {
            i = i4 | 1;
        } else {
            i = i4 & (-2);
        }
        this.a = i;
        if (this.i) {
            i2 = i | 2;
        } else {
            i2 = i & (-3);
        }
        this.a = i2;
        if (this.c) {
            i3 = i2 | 4;
        } else {
            i3 = i2 & (-5);
        }
        this.a = i3;
        outputSerializedData.writeInt32(i3);
        outputSerializedData.writeString(this.d);
        outputSerializedData.writeFloat(this.e);
        outputSerializedData.writeInt64(this.f);
        outputSerializedData.writeFloat(this.j);
        outputSerializedData.writeFloat(this.k);
        outputSerializedData.writeInt32(this.l);
        outputSerializedData.writeInt32(this.m);
        outputSerializedData.writeInt64(this.o);
    }
}
