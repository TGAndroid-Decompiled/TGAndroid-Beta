package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
public final class v20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.s5 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public vh.k9 O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public jg.s0 W;
    public byte f18455a;
    public byte f18456b;
    public float f18457c;
    public float d;
    public float e;
    public float f18458f;
    public float f18459g;
    public float h;
    public float f18460i;
    public String f18461j;
    public ArrayList f18462k;
    public int f18463l;
    public int f18464m;
    public ig.h0 f18465n;
    public String f18466o;
    public int f18467p;
    public int f18468q;
    public int f18469r;
    public float f18470s;
    public String f18471t;
    public ye f18472u;
    public float v;
    public float f18473w;
    public float f18474x;
    public float f18475y;
    public float f18476z;

    public v20() {
        this.f18461j = "";
        this.f18462k = new ArrayList();
        this.f18471t = "";
        this.v = 1.0f;
    }

    public final v20 a() {
        v20 v20Var = new v20();
        v20Var.f18455a = this.f18455a;
        v20Var.f18456b = this.f18456b;
        v20Var.f18457c = this.f18457c;
        v20Var.d = this.d;
        v20Var.e = this.e;
        v20Var.f18458f = this.f18458f;
        v20Var.f18459g = this.f18459g;
        v20Var.f18460i = this.f18460i;
        v20Var.f18461j = this.f18461j;
        if (this.f18462k != null) {
            ArrayList arrayList = new ArrayList();
            v20Var.f18462k = arrayList;
            arrayList.addAll(this.f18462k);
        }
        v20Var.f18463l = this.f18463l;
        v20Var.f18464m = this.f18464m;
        v20Var.f18465n = this.f18465n;
        v20Var.f18466o = this.f18466o;
        v20Var.f18467p = this.f18467p;
        v20Var.f18468q = this.f18468q;
        v20Var.f18469r = this.f18469r;
        v20Var.f18470s = this.f18470s;
        v20Var.v = this.v;
        v20Var.f18473w = this.f18473w;
        v20Var.f18474x = this.f18474x;
        v20Var.f18475y = this.f18475y;
        v20Var.f18476z = this.f18476z;
        v20Var.B = this.B;
        v20Var.C = this.C;
        v20Var.D = this.D;
        v20Var.E = this.E;
        v20Var.F = this.F;
        v20Var.G = this.G;
        v20Var.I = this.I;
        v20Var.J = this.J;
        v20Var.L = this.L;
        v20Var.M = this.M;
        v20Var.N = this.N;
        v20Var.P = this.P;
        v20Var.U = this.U;
        v20Var.V = this.V;
        v20Var.Q = this.Q;
        v20Var.T = this.T;
        v20Var.R = this.R;
        v20Var.S = this.S;
        v20Var.W = this.W;
        v20Var.O = this.O;
        return v20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        abstractSerializedData.writeByte(this.f18455a);
        abstractSerializedData.writeByte(this.f18456b);
        abstractSerializedData.writeFloat(this.f18457c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.e);
        abstractSerializedData.writeFloat(this.f18458f);
        abstractSerializedData.writeFloat(this.f18459g);
        abstractSerializedData.writeString(this.f18461j);
        abstractSerializedData.writeInt32(this.f18462k.size());
        for (int i10 = 0; i10 < this.f18462k.size(); i10++) {
            ((u20) this.f18462k.get(i10)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f18463l);
        abstractSerializedData.writeInt32(this.f18464m);
        abstractSerializedData.writeInt32(this.f18468q);
        abstractSerializedData.writeInt32(this.f18469r);
        abstractSerializedData.writeInt32(this.f18467p);
        ig.h0 h0Var = this.f18465n;
        if (h0Var == null) {
            str = this.f18466o;
            if (str == null) {
                str = "";
            }
        } else {
            str = h0Var.f8319a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f18473w);
        abstractSerializedData.writeFloat(this.f18474x);
        abstractSerializedData.writeFloat(this.f18475y);
        abstractSerializedData.writeFloat(this.f18476z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f18455a;
        if (b10 == 3) {
            abstractSerializedData.writeFloat(this.P);
            this.M.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia = this.N;
            if (messageMedia.provider == null) {
                messageMedia.provider = "";
            }
            if (messageMedia.venue_id == null) {
                messageMedia.venue_id = "";
            }
            if (messageMedia.venue_type == null) {
                messageMedia.venue_type = "";
            }
            messageMedia.serializeToStream(abstractSerializedData);
            TLRPC.MessageMedia messageMedia2 = this.N;
            if ((messageMedia2 instanceof TLRPC.TL_messageMediaVenue) && ((TLRPC.TL_messageMediaVenue) messageMedia2).emoji != null) {
                abstractSerializedData.writeInt32(-559038737);
                abstractSerializedData.writeString(((TLRPC.TL_messageMediaVenue) this.N).emoji);
                return;
            }
            abstractSerializedData.writeInt32(1450380236);
        } else if (b10 == 7) {
            abstractSerializedData.writeFloat(this.P);
            this.M.serializeToStream(abstractSerializedData);
            this.W.serializeToStream(abstractSerializedData);
        } else if (b10 == 4) {
            this.M.serializeToStream(abstractSerializedData);
        } else if (b10 == 5) {
            abstractSerializedData.writeInt64(this.Q);
            abstractSerializedData.writeInt64(this.R);
            abstractSerializedData.writeInt64(this.S);
            abstractSerializedData.writeInt64(this.T);
        } else if (b10 == 2) {
            abstractSerializedData.writeString(this.f18471t);
            ye yeVar = this.f18472u;
            if (yeVar != null) {
                yeVar.serializeToStream(abstractSerializedData);
            } else {
                abstractSerializedData.writeInt32(1450380236);
            }
        } else if (b10 == 8) {
            if (this.O == null) {
                abstractSerializedData.writeInt32(-559038737);
                return;
            }
            abstractSerializedData.writeInt32(132805945);
            this.O.serializeToStream(abstractSerializedData);
        }
    }

    public v20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        ig.h0 h0Var;
        this.f18461j = "";
        this.f18462k = new ArrayList();
        this.f18471t = "";
        this.v = 1.0f;
        this.f18455a = abstractSerializedData.readByte(z11);
        this.f18456b = abstractSerializedData.readByte(z11);
        this.f18457c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.e = abstractSerializedData.readFloat(z11);
        this.f18458f = abstractSerializedData.readFloat(z11);
        this.f18459g = abstractSerializedData.readFloat(z11);
        this.f18461j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i10 = 0; i10 < readInt32; i10++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f18462k.add(tL_messageEntityCustomEmoji);
        }
        this.f18463l = abstractSerializedData.readInt32(z11);
        this.f18464m = abstractSerializedData.readInt32(z11);
        this.f18468q = abstractSerializedData.readInt32(z11);
        this.f18469r = abstractSerializedData.readInt32(z11);
        this.f18467p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f18466o = readString;
        ig.h0 h0Var2 = ig.h0.e;
        jg.s0 s0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = ig.h0.c();
            for (int i11 = 0; i11 < c10.size(); i11++) {
                h0Var = (ig.h0) c10.get(i11);
                if (h0Var != null && TextUtils.equals(readString, h0Var.f8319a)) {
                    break;
                }
            }
        }
        h0Var = null;
        this.f18465n = h0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f18473w = abstractSerializedData.readFloat(z11);
        this.f18474x = abstractSerializedData.readFloat(z11);
        this.f18475y = abstractSerializedData.readFloat(z11);
        this.f18476z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f18455a;
        if (b10 == 3) {
            this.P = abstractSerializedData.readFloat(z11);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            this.N = TLRPC.MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            if (abstractSerializedData.remaining() <= 0 || abstractSerializedData.readInt32(z11) != -559038737) {
                return;
            }
            String readString2 = abstractSerializedData.readString(z11);
            TLRPC.MessageMedia messageMedia = this.N;
            if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
                ((TLRPC.TL_messageMediaVenue) messageMedia).emoji = readString2;
            }
        } else if (b10 == 7) {
            this.P = abstractSerializedData.readFloat(z11);
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
            int readInt323 = abstractSerializedData.readInt32(z11);
            if (-625858389 != readInt323) {
                int i12 = jg.s0.f10205j;
            } else {
                s0Var = new jg.s0();
            }
            this.W = (jg.s0) TLObject.TLdeserialize(jg.s0.class, s0Var, abstractSerializedData, readInt323, z11);
        } else if (b10 == 4) {
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
        } else if (b10 == 5) {
            this.Q = abstractSerializedData.readInt64(z11);
            this.R = abstractSerializedData.readInt64(z11);
            this.S = abstractSerializedData.readInt64(z11);
            this.T = abstractSerializedData.readInt64(z11);
        } else if (b10 == 2) {
            this.f18471t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                ye yeVar = new ye();
                this.f18472u = yeVar;
                yeVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f51438a = abstractSerializedData.readDouble(false);
            tLObject.f51439b = abstractSerializedData.readDouble(false);
            tLObject.f51440c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
