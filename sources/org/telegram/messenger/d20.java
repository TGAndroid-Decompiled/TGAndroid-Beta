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
    public hi.qb O;
    public float P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public tg.i0 W;
    public byte f23442a;
    public byte f23443b;
    public float f23444c;
    public float d;
    public float f23445e;
    public float f23446f;
    public float f23447g;
    public float h;
    public float f23448i;
    public String f23449j;
    public ArrayList f23450k;
    public int f23451l;
    public int f23452m;
    public sg.a0 f23453n;
    public String f23454o;
    public int f23455p;
    public int f23456q;
    public int f23457r;
    public float f23458s;
    public String f23459t;
    public xe f23460u;
    public float v;
    public float f23461w;
    public float f23462x;
    public float f23463y;
    public float f23464z;

    public d20() {
        this.f23449j = "";
        this.f23450k = new ArrayList();
        this.f23459t = "";
        this.v = 1.0f;
    }

    public final d20 a() {
        d20 d20Var = new d20();
        d20Var.f23442a = this.f23442a;
        d20Var.f23443b = this.f23443b;
        d20Var.f23444c = this.f23444c;
        d20Var.d = this.d;
        d20Var.f23445e = this.f23445e;
        d20Var.f23446f = this.f23446f;
        d20Var.f23447g = this.f23447g;
        d20Var.f23448i = this.f23448i;
        d20Var.f23449j = this.f23449j;
        if (this.f23450k != null) {
            ArrayList arrayList = new ArrayList();
            d20Var.f23450k = arrayList;
            arrayList.addAll(this.f23450k);
        }
        d20Var.f23451l = this.f23451l;
        d20Var.f23452m = this.f23452m;
        d20Var.f23453n = this.f23453n;
        d20Var.f23454o = this.f23454o;
        d20Var.f23455p = this.f23455p;
        d20Var.f23456q = this.f23456q;
        d20Var.f23457r = this.f23457r;
        d20Var.f23458s = this.f23458s;
        d20Var.v = this.v;
        d20Var.f23461w = this.f23461w;
        d20Var.f23462x = this.f23462x;
        d20Var.f23463y = this.f23463y;
        d20Var.f23464z = this.f23464z;
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
        abstractSerializedData.writeByte(this.f23442a);
        abstractSerializedData.writeByte(this.f23443b);
        abstractSerializedData.writeFloat(this.f23444c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f23445e);
        abstractSerializedData.writeFloat(this.f23446f);
        abstractSerializedData.writeFloat(this.f23447g);
        abstractSerializedData.writeString(this.f23449j);
        abstractSerializedData.writeInt32(this.f23450k.size());
        for (int i7 = 0; i7 < this.f23450k.size(); i7++) {
            ((c20) this.f23450k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f23451l);
        abstractSerializedData.writeInt32(this.f23452m);
        abstractSerializedData.writeInt32(this.f23456q);
        abstractSerializedData.writeInt32(this.f23457r);
        abstractSerializedData.writeInt32(this.f23455p);
        sg.a0 a0Var = this.f23453n;
        if (a0Var == null) {
            str = this.f23454o;
            if (str == null) {
                str = "";
            }
        } else {
            str = a0Var.f57164a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f23461w);
        abstractSerializedData.writeFloat(this.f23462x);
        abstractSerializedData.writeFloat(this.f23463y);
        abstractSerializedData.writeFloat(this.f23464z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f23442a;
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
            abstractSerializedData.writeString(this.f23459t);
            xe xeVar = this.f23460u;
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
        this.f23449j = "";
        this.f23450k = new ArrayList();
        this.f23459t = "";
        this.v = 1.0f;
        this.f23442a = abstractSerializedData.readByte(z11);
        this.f23443b = abstractSerializedData.readByte(z11);
        this.f23444c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.f23445e = abstractSerializedData.readFloat(z11);
        this.f23446f = abstractSerializedData.readFloat(z11);
        this.f23447g = abstractSerializedData.readFloat(z11);
        this.f23449j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i7 = 0; i7 < readInt32; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f23450k.add(tL_messageEntityCustomEmoji);
        }
        this.f23451l = abstractSerializedData.readInt32(z11);
        this.f23452m = abstractSerializedData.readInt32(z11);
        this.f23456q = abstractSerializedData.readInt32(z11);
        this.f23457r = abstractSerializedData.readInt32(z11);
        this.f23455p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f23454o = readString;
        sg.a0 a0Var2 = sg.a0.f57160e;
        tg.i0 i0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.a0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a0Var = (sg.a0) c10.get(i10);
                if (a0Var != null && TextUtils.equals(readString, a0Var.f57164a)) {
                    break;
                }
            }
        }
        a0Var = null;
        this.f23453n = a0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f23461w = abstractSerializedData.readFloat(z11);
        this.f23462x = abstractSerializedData.readFloat(z11);
        this.f23463y = abstractSerializedData.readFloat(z11);
        this.f23464z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f23442a;
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
                int i11 = tg.i0.f57919j;
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
            this.f23459t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                xe xeVar = new xe();
                this.f23460u = xeVar;
                xeVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f15257a = abstractSerializedData.readDouble(false);
            tLObject.f15258b = abstractSerializedData.readDouble(false);
            tLObject.f15259c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
