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
public final class d20 {
    public boolean A;
    public TLRPC.Document B;
    public Object C;
    public RLottieNative D;
    public float E;
    public float F;
    public Bitmap G;
    public Matrix H;
    public View I;
    public org.telegram.ui.Components.c6 J;
    public boolean K;
    public Canvas L;
    public TL_stories.MediaArea M;
    public TLRPC.MessageMedia N;
    public hi.pb O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public tg.i0 W;
    public byte f23478a;
    public byte f23479b;
    public float f23480c;
    public float d;
    public float f23481e;
    public float f23482f;
    public float f23483g;
    public float h;
    public float f23484i;
    public String f23485j;
    public ArrayList f23486k;
    public int f23487l;
    public int f23488m;
    public sg.a0 f23489n;
    public String f23490o;
    public int f23491p;
    public int f23492q;
    public int f23493r;
    public float f23494s;
    public String f23495t;
    public xe f23496u;
    public float v;
    public float f23497w;
    public float f23498x;
    public float f23499y;
    public float f23500z;

    public d20() {
        this.f23485j = "";
        this.f23486k = new ArrayList();
        this.f23495t = "";
        this.v = 1.0f;
    }

    public final d20 a() {
        d20 d20Var = new d20();
        d20Var.f23478a = this.f23478a;
        d20Var.f23479b = this.f23479b;
        d20Var.f23480c = this.f23480c;
        d20Var.d = this.d;
        d20Var.f23481e = this.f23481e;
        d20Var.f23482f = this.f23482f;
        d20Var.f23483g = this.f23483g;
        d20Var.f23484i = this.f23484i;
        d20Var.f23485j = this.f23485j;
        if (this.f23486k != null) {
            ArrayList arrayList = new ArrayList();
            d20Var.f23486k = arrayList;
            arrayList.addAll(this.f23486k);
        }
        d20Var.f23487l = this.f23487l;
        d20Var.f23488m = this.f23488m;
        d20Var.f23489n = this.f23489n;
        d20Var.f23490o = this.f23490o;
        d20Var.f23491p = this.f23491p;
        d20Var.f23492q = this.f23492q;
        d20Var.f23493r = this.f23493r;
        d20Var.f23494s = this.f23494s;
        d20Var.v = this.v;
        d20Var.f23497w = this.f23497w;
        d20Var.f23498x = this.f23498x;
        d20Var.f23499y = this.f23499y;
        d20Var.f23500z = this.f23500z;
        d20Var.B = this.B;
        d20Var.C = this.C;
        d20Var.D = this.D;
        d20Var.E = this.E;
        d20Var.F = this.F;
        d20Var.G = this.G;
        d20Var.I = this.I;
        d20Var.J = this.J;
        d20Var.L = this.L;
        d20Var.M = this.M;
        d20Var.N = this.N;
        d20Var.P = this.P;
        d20Var.U = this.U;
        d20Var.V = this.V;
        d20Var.Q = this.Q;
        d20Var.T = this.T;
        d20Var.R = this.R;
        d20Var.S = this.S;
        d20Var.W = this.W;
        d20Var.O = this.O;
        return d20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        abstractSerializedData.writeByte(this.f23478a);
        abstractSerializedData.writeByte(this.f23479b);
        abstractSerializedData.writeFloat(this.f23480c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f23481e);
        abstractSerializedData.writeFloat(this.f23482f);
        abstractSerializedData.writeFloat(this.f23483g);
        abstractSerializedData.writeString(this.f23485j);
        abstractSerializedData.writeInt32(this.f23486k.size());
        for (int i7 = 0; i7 < this.f23486k.size(); i7++) {
            ((c20) this.f23486k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f23487l);
        abstractSerializedData.writeInt32(this.f23488m);
        abstractSerializedData.writeInt32(this.f23492q);
        abstractSerializedData.writeInt32(this.f23493r);
        abstractSerializedData.writeInt32(this.f23491p);
        sg.a0 a0Var = this.f23489n;
        if (a0Var == null) {
            str = this.f23490o;
            if (str == null) {
                str = "";
            }
        } else {
            str = a0Var.f57199a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f23497w);
        abstractSerializedData.writeFloat(this.f23498x);
        abstractSerializedData.writeFloat(this.f23499y);
        abstractSerializedData.writeFloat(this.f23500z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f23478a;
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
            abstractSerializedData.writeString(this.f23495t);
            xe xeVar = this.f23496u;
            if (xeVar != null) {
                xeVar.serializeToStream(abstractSerializedData);
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

    public d20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        sg.a0 a0Var;
        this.f23485j = "";
        this.f23486k = new ArrayList();
        this.f23495t = "";
        this.v = 1.0f;
        this.f23478a = abstractSerializedData.readByte(z11);
        this.f23479b = abstractSerializedData.readByte(z11);
        this.f23480c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.f23481e = abstractSerializedData.readFloat(z11);
        this.f23482f = abstractSerializedData.readFloat(z11);
        this.f23483g = abstractSerializedData.readFloat(z11);
        this.f23485j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i7 = 0; i7 < readInt32; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f23486k.add(tL_messageEntityCustomEmoji);
        }
        this.f23487l = abstractSerializedData.readInt32(z11);
        this.f23488m = abstractSerializedData.readInt32(z11);
        this.f23492q = abstractSerializedData.readInt32(z11);
        this.f23493r = abstractSerializedData.readInt32(z11);
        this.f23491p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f23490o = readString;
        sg.a0 a0Var2 = sg.a0.f57195e;
        tg.i0 i0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.a0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a0Var = (sg.a0) c10.get(i10);
                if (a0Var != null && TextUtils.equals(readString, a0Var.f57199a)) {
                    break;
                }
            }
        }
        a0Var = null;
        this.f23489n = a0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f23497w = abstractSerializedData.readFloat(z11);
        this.f23498x = abstractSerializedData.readFloat(z11);
        this.f23499y = abstractSerializedData.readFloat(z11);
        this.f23500z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f23478a;
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
                int i11 = tg.i0.f57954j;
            } else {
                i0Var = new tg.i0();
            }
            this.W = (tg.i0) TLObject.TLdeserialize(tg.i0.class, i0Var, abstractSerializedData, readInt323, z11);
        } else if (b10 == 4) {
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
        } else if (b10 == 5) {
            this.Q = abstractSerializedData.readInt64(z11);
            this.R = abstractSerializedData.readInt64(z11);
            this.S = abstractSerializedData.readInt64(z11);
            this.T = abstractSerializedData.readInt64(z11);
        } else if (b10 == 2) {
            this.f23495t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                xe xeVar = new xe();
                this.f23496u = xeVar;
                xeVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f15284a = abstractSerializedData.readDouble(false);
            tLObject.f15285b = abstractSerializedData.readDouble(false);
            tLObject.f15286c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
