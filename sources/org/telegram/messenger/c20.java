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
public final class c20 {
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
    public byte f23257a;
    public byte f23258b;
    public float f23259c;
    public float d;
    public float f23260e;
    public float f23261f;
    public float f23262g;
    public float h;
    public float f23263i;
    public String f23264j;
    public ArrayList f23265k;
    public int f23266l;
    public int f23267m;
    public sg.a0 f23268n;
    public String f23269o;
    public int f23270p;
    public int f23271q;
    public int f23272r;
    public float f23273s;
    public String f23274t;
    public we f23275u;
    public float v;
    public float f23276w;
    public float f23277x;
    public float f23278y;
    public float f23279z;

    public c20() {
        this.f23264j = "";
        this.f23265k = new ArrayList();
        this.f23274t = "";
        this.v = 1.0f;
    }

    public final c20 a() {
        c20 c20Var = new c20();
        c20Var.f23257a = this.f23257a;
        c20Var.f23258b = this.f23258b;
        c20Var.f23259c = this.f23259c;
        c20Var.d = this.d;
        c20Var.f23260e = this.f23260e;
        c20Var.f23261f = this.f23261f;
        c20Var.f23262g = this.f23262g;
        c20Var.f23263i = this.f23263i;
        c20Var.f23264j = this.f23264j;
        if (this.f23265k != null) {
            ArrayList arrayList = new ArrayList();
            c20Var.f23265k = arrayList;
            arrayList.addAll(this.f23265k);
        }
        c20Var.f23266l = this.f23266l;
        c20Var.f23267m = this.f23267m;
        c20Var.f23268n = this.f23268n;
        c20Var.f23269o = this.f23269o;
        c20Var.f23270p = this.f23270p;
        c20Var.f23271q = this.f23271q;
        c20Var.f23272r = this.f23272r;
        c20Var.f23273s = this.f23273s;
        c20Var.v = this.v;
        c20Var.f23276w = this.f23276w;
        c20Var.f23277x = this.f23277x;
        c20Var.f23278y = this.f23278y;
        c20Var.f23279z = this.f23279z;
        c20Var.B = this.B;
        c20Var.C = this.C;
        c20Var.D = this.D;
        c20Var.E = this.E;
        c20Var.F = this.F;
        c20Var.G = this.G;
        c20Var.I = this.I;
        c20Var.J = this.J;
        c20Var.L = this.L;
        c20Var.M = this.M;
        c20Var.N = this.N;
        c20Var.P = this.P;
        c20Var.U = this.U;
        c20Var.V = this.V;
        c20Var.Q = this.Q;
        c20Var.T = this.T;
        c20Var.R = this.R;
        c20Var.S = this.S;
        c20Var.W = this.W;
        c20Var.O = this.O;
        return c20Var;
    }

    public final void b(AbstractSerializedData abstractSerializedData, boolean z10) {
        String str;
        abstractSerializedData.writeByte(this.f23257a);
        abstractSerializedData.writeByte(this.f23258b);
        abstractSerializedData.writeFloat(this.f23259c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f23260e);
        abstractSerializedData.writeFloat(this.f23261f);
        abstractSerializedData.writeFloat(this.f23262g);
        abstractSerializedData.writeString(this.f23264j);
        abstractSerializedData.writeInt32(this.f23265k.size());
        for (int i7 = 0; i7 < this.f23265k.size(); i7++) {
            ((b20) this.f23265k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f23266l);
        abstractSerializedData.writeInt32(this.f23267m);
        abstractSerializedData.writeInt32(this.f23271q);
        abstractSerializedData.writeInt32(this.f23272r);
        abstractSerializedData.writeInt32(this.f23270p);
        sg.a0 a0Var = this.f23268n;
        if (a0Var == null) {
            str = this.f23269o;
            if (str == null) {
                str = "";
            }
        } else {
            str = a0Var.f57195a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f23276w);
        abstractSerializedData.writeFloat(this.f23277x);
        abstractSerializedData.writeFloat(this.f23278y);
        abstractSerializedData.writeFloat(this.f23279z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f23257a;
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
            abstractSerializedData.writeString(this.f23274t);
            we weVar = this.f23275u;
            if (weVar != null) {
                weVar.serializeToStream(abstractSerializedData);
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

    public c20(AbstractSerializedData abstractSerializedData, boolean z10, boolean z11) {
        sg.a0 a0Var;
        this.f23264j = "";
        this.f23265k = new ArrayList();
        this.f23274t = "";
        this.v = 1.0f;
        this.f23257a = abstractSerializedData.readByte(z11);
        this.f23258b = abstractSerializedData.readByte(z11);
        this.f23259c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.f23260e = abstractSerializedData.readFloat(z11);
        this.f23261f = abstractSerializedData.readFloat(z11);
        this.f23262g = abstractSerializedData.readFloat(z11);
        this.f23264j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i7 = 0; i7 < readInt32; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f23265k.add(tL_messageEntityCustomEmoji);
        }
        this.f23266l = abstractSerializedData.readInt32(z11);
        this.f23267m = abstractSerializedData.readInt32(z11);
        this.f23271q = abstractSerializedData.readInt32(z11);
        this.f23272r = abstractSerializedData.readInt32(z11);
        this.f23270p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f23269o = readString;
        sg.a0 a0Var2 = sg.a0.f57191e;
        tg.i0 i0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.a0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a0Var = (sg.a0) c10.get(i10);
                if (a0Var != null && TextUtils.equals(readString, a0Var.f57195a)) {
                    break;
                }
            }
        }
        a0Var = null;
        this.f23268n = a0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f23276w = abstractSerializedData.readFloat(z11);
        this.f23277x = abstractSerializedData.readFloat(z11);
        this.f23278y = abstractSerializedData.readFloat(z11);
        this.f23279z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f23257a;
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
                int i11 = tg.i0.f57950j;
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
            this.f23274t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                we weVar = new we();
                this.f23275u = weVar;
                weVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f15281a = abstractSerializedData.readDouble(false);
            tLObject.f15282b = abstractSerializedData.readDouble(false);
            tLObject.f15283c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
