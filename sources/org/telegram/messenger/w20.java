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
public final class w20 {
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
    public byte f18970a;
    public byte f18971b;
    public float f18972c;
    public float d;
    public float e;
    public float f18973f;
    public float f18974g;
    public float h;
    public float f18975i;
    public String f18976j;
    public ArrayList f18977k;
    public int f18978l;
    public int f18979m;
    public ig.h0 f18980n;
    public String f18981o;
    public int f18982p;
    public int f18983q;
    public int f18984r;
    public float f18985s;
    public String f18986t;
    public ze f18987u;
    public float v;
    public float f18988w;
    public float f18989x;
    public float f18990y;
    public float f18991z;

    public w20() {
        this.f18976j = "";
        this.f18977k = new ArrayList();
        this.f18986t = "";
        this.v = 1.0f;
    }

    public final w20 a() {
        w20 w20Var = new w20();
        w20Var.f18970a = this.f18970a;
        w20Var.f18971b = this.f18971b;
        w20Var.f18972c = this.f18972c;
        w20Var.d = this.d;
        w20Var.e = this.e;
        w20Var.f18973f = this.f18973f;
        w20Var.f18974g = this.f18974g;
        w20Var.f18975i = this.f18975i;
        w20Var.f18976j = this.f18976j;
        if (this.f18977k != null) {
            ArrayList arrayList = new ArrayList();
            w20Var.f18977k = arrayList;
            arrayList.addAll(this.f18977k);
        }
        w20Var.f18978l = this.f18978l;
        w20Var.f18979m = this.f18979m;
        w20Var.f18980n = this.f18980n;
        w20Var.f18981o = this.f18981o;
        w20Var.f18982p = this.f18982p;
        w20Var.f18983q = this.f18983q;
        w20Var.f18984r = this.f18984r;
        w20Var.f18985s = this.f18985s;
        w20Var.v = this.v;
        w20Var.f18988w = this.f18988w;
        w20Var.f18989x = this.f18989x;
        w20Var.f18990y = this.f18990y;
        w20Var.f18991z = this.f18991z;
        w20Var.B = this.B;
        w20Var.C = this.C;
        w20Var.D = this.D;
        w20Var.E = this.E;
        w20Var.F = this.F;
        w20Var.G = this.G;
        w20Var.I = this.I;
        w20Var.J = this.J;
        w20Var.L = this.L;
        w20Var.M = this.M;
        w20Var.N = this.N;
        w20Var.P = this.P;
        w20Var.U = this.U;
        w20Var.V = this.V;
        w20Var.Q = this.Q;
        w20Var.T = this.T;
        w20Var.R = this.R;
        w20Var.S = this.S;
        w20Var.W = this.W;
        w20Var.O = this.O;
        return w20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        abstractSerializedData.writeByte(this.f18970a);
        abstractSerializedData.writeByte(this.f18971b);
        abstractSerializedData.writeFloat(this.f18972c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.e);
        abstractSerializedData.writeFloat(this.f18973f);
        abstractSerializedData.writeFloat(this.f18974g);
        abstractSerializedData.writeString(this.f18976j);
        abstractSerializedData.writeInt32(this.f18977k.size());
        for (int i10 = 0; i10 < this.f18977k.size(); i10++) {
            ((v20) this.f18977k.get(i10)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f18978l);
        abstractSerializedData.writeInt32(this.f18979m);
        abstractSerializedData.writeInt32(this.f18983q);
        abstractSerializedData.writeInt32(this.f18984r);
        abstractSerializedData.writeInt32(this.f18982p);
        ig.h0 h0Var = this.f18980n;
        if (h0Var == null) {
            str = this.f18981o;
            if (str == null) {
                str = "";
            }
        } else {
            str = h0Var.f8320a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f18988w);
        abstractSerializedData.writeFloat(this.f18989x);
        abstractSerializedData.writeFloat(this.f18990y);
        abstractSerializedData.writeFloat(this.f18991z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f18970a;
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
            abstractSerializedData.writeString(this.f18986t);
            ze zeVar = this.f18987u;
            if (zeVar != null) {
                zeVar.serializeToStream(abstractSerializedData);
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

    public w20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        ig.h0 h0Var;
        this.f18976j = "";
        this.f18977k = new ArrayList();
        this.f18986t = "";
        this.v = 1.0f;
        this.f18970a = abstractSerializedData.readByte(z11);
        this.f18971b = abstractSerializedData.readByte(z11);
        this.f18972c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.e = abstractSerializedData.readFloat(z11);
        this.f18973f = abstractSerializedData.readFloat(z11);
        this.f18974g = abstractSerializedData.readFloat(z11);
        this.f18976j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i10 = 0; i10 < readInt32; i10++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f18977k.add(tL_messageEntityCustomEmoji);
        }
        this.f18978l = abstractSerializedData.readInt32(z11);
        this.f18979m = abstractSerializedData.readInt32(z11);
        this.f18983q = abstractSerializedData.readInt32(z11);
        this.f18984r = abstractSerializedData.readInt32(z11);
        this.f18982p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f18981o = readString;
        ig.h0 h0Var2 = ig.h0.e;
        jg.s0 s0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = ig.h0.c();
            for (int i11 = 0; i11 < c10.size(); i11++) {
                h0Var = (ig.h0) c10.get(i11);
                if (h0Var != null && TextUtils.equals(readString, h0Var.f8320a)) {
                    break;
                }
            }
        }
        h0Var = null;
        this.f18980n = h0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f18988w = abstractSerializedData.readFloat(z11);
        this.f18989x = abstractSerializedData.readFloat(z11);
        this.f18990y = abstractSerializedData.readFloat(z11);
        this.f18991z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f18970a;
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
                int i12 = jg.s0.f10206j;
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
            this.f18986t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                ze zeVar = new ze();
                this.f18987u = zeVar;
                zeVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f51453a = abstractSerializedData.readDouble(false);
            tLObject.f51454b = abstractSerializedData.readDouble(false);
            tLObject.f51455c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
