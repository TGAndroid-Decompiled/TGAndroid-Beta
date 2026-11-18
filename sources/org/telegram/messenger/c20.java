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
    public org.telegram.ui.Components.b6 J;
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
    public tg.h0 W;
    public byte f23232a;
    public byte f23233b;
    public float f23234c;
    public float d;
    public float f23235e;
    public float f23236f;
    public float f23237g;
    public float h;
    public float f23238i;
    public String f23239j;
    public ArrayList f23240k;
    public int f23241l;
    public int f23242m;
    public sg.a0 f23243n;
    public String f23244o;
    public int f23245p;
    public int f23246q;
    public int f23247r;
    public float f23248s;
    public String f23249t;
    public we f23250u;
    public float v;
    public float f23251w;
    public float f23252x;
    public float f23253y;
    public float f23254z;

    public c20() {
        this.f23239j = "";
        this.f23240k = new ArrayList();
        this.f23249t = "";
        this.v = 1.0f;
    }

    public final c20 a() {
        c20 c20Var = new c20();
        c20Var.f23232a = this.f23232a;
        c20Var.f23233b = this.f23233b;
        c20Var.f23234c = this.f23234c;
        c20Var.d = this.d;
        c20Var.f23235e = this.f23235e;
        c20Var.f23236f = this.f23236f;
        c20Var.f23237g = this.f23237g;
        c20Var.f23238i = this.f23238i;
        c20Var.f23239j = this.f23239j;
        if (this.f23240k != null) {
            ArrayList arrayList = new ArrayList();
            c20Var.f23240k = arrayList;
            arrayList.addAll(this.f23240k);
        }
        c20Var.f23241l = this.f23241l;
        c20Var.f23242m = this.f23242m;
        c20Var.f23243n = this.f23243n;
        c20Var.f23244o = this.f23244o;
        c20Var.f23245p = this.f23245p;
        c20Var.f23246q = this.f23246q;
        c20Var.f23247r = this.f23247r;
        c20Var.f23248s = this.f23248s;
        c20Var.v = this.v;
        c20Var.f23251w = this.f23251w;
        c20Var.f23252x = this.f23252x;
        c20Var.f23253y = this.f23253y;
        c20Var.f23254z = this.f23254z;
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
        abstractSerializedData.writeByte(this.f23232a);
        abstractSerializedData.writeByte(this.f23233b);
        abstractSerializedData.writeFloat(this.f23234c);
        abstractSerializedData.writeFloat(this.d);
        abstractSerializedData.writeFloat(this.f23235e);
        abstractSerializedData.writeFloat(this.f23236f);
        abstractSerializedData.writeFloat(this.f23237g);
        abstractSerializedData.writeString(this.f23239j);
        abstractSerializedData.writeInt32(this.f23240k.size());
        for (int i7 = 0; i7 < this.f23240k.size(); i7++) {
            ((b20) this.f23240k.get(i7)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.f23241l);
        abstractSerializedData.writeInt32(this.f23242m);
        abstractSerializedData.writeInt32(this.f23246q);
        abstractSerializedData.writeInt32(this.f23247r);
        abstractSerializedData.writeInt32(this.f23245p);
        sg.a0 a0Var = this.f23243n;
        if (a0Var == null) {
            str = this.f23244o;
            if (str == null) {
                str = "";
            }
        } else {
            str = a0Var.f57154a;
        }
        abstractSerializedData.writeString(str);
        abstractSerializedData.writeFloat(this.v);
        abstractSerializedData.writeFloat(this.f23251w);
        abstractSerializedData.writeFloat(this.f23252x);
        abstractSerializedData.writeFloat(this.f23253y);
        abstractSerializedData.writeFloat(this.f23254z);
        if (z10) {
            TLRPC.Document document = this.B;
            if (document == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                document.serializeToStream(abstractSerializedData);
            }
        }
        byte b10 = this.f23232a;
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
            abstractSerializedData.writeString(this.f23249t);
            we weVar = this.f23250u;
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
        this.f23239j = "";
        this.f23240k = new ArrayList();
        this.f23249t = "";
        this.v = 1.0f;
        this.f23232a = abstractSerializedData.readByte(z11);
        this.f23233b = abstractSerializedData.readByte(z11);
        this.f23234c = abstractSerializedData.readFloat(z11);
        this.d = abstractSerializedData.readFloat(z11);
        this.f23235e = abstractSerializedData.readFloat(z11);
        this.f23236f = abstractSerializedData.readFloat(z11);
        this.f23237g = abstractSerializedData.readFloat(z11);
        this.f23239j = abstractSerializedData.readString(z11);
        int readInt32 = abstractSerializedData.readInt32(z11);
        for (int i7 = 0; i7 < readInt32; i7++) {
            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
            abstractSerializedData.readInt32(z11);
            tL_messageEntityCustomEmoji.readParams(abstractSerializedData, z11);
            this.f23240k.add(tL_messageEntityCustomEmoji);
        }
        this.f23241l = abstractSerializedData.readInt32(z11);
        this.f23242m = abstractSerializedData.readInt32(z11);
        this.f23246q = abstractSerializedData.readInt32(z11);
        this.f23247r = abstractSerializedData.readInt32(z11);
        this.f23245p = abstractSerializedData.readInt32(z11);
        String readString = abstractSerializedData.readString(z11);
        this.f23244o = readString;
        sg.a0 a0Var2 = sg.a0.f57150e;
        tg.h0 h0Var = null;
        if (readString != null && !TextUtils.isEmpty(readString)) {
            List c10 = sg.a0.c();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a0Var = (sg.a0) c10.get(i10);
                if (a0Var != null && TextUtils.equals(readString, a0Var.f57154a)) {
                    break;
                }
            }
        }
        a0Var = null;
        this.f23243n = a0Var;
        this.v = abstractSerializedData.readFloat(z11);
        this.f23251w = abstractSerializedData.readFloat(z11);
        this.f23252x = abstractSerializedData.readFloat(z11);
        this.f23253y = abstractSerializedData.readFloat(z11);
        this.f23254z = abstractSerializedData.readFloat(z11);
        if (z10) {
            int readInt322 = abstractSerializedData.readInt32(z11);
            if (readInt322 == 1450380236) {
                this.B = null;
            } else {
                this.B = TLRPC.Document.TLdeserialize(abstractSerializedData, readInt322, z11);
            }
        }
        byte b10 = this.f23232a;
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
                int i11 = tg.h0.f57891j;
            } else {
                h0Var = new tg.h0();
            }
            this.W = (tg.h0) TLObject.TLdeserialize(tg.h0.class, h0Var, abstractSerializedData, readInt323, z11);
        } else if (b10 == 4) {
            this.M = TL_stories.MediaArea.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z11), z11);
        } else if (b10 == 5) {
            this.Q = abstractSerializedData.readInt64(z11);
            this.R = abstractSerializedData.readInt64(z11);
            this.S = abstractSerializedData.readInt64(z11);
            this.T = abstractSerializedData.readInt64(z11);
        } else if (b10 == 2) {
            this.f23249t = abstractSerializedData.readString(z11);
            if (abstractSerializedData.readInt32(z11) == 1151577037) {
                we weVar = new we();
                this.f23250u = weVar;
                weVar.readParams(abstractSerializedData, z11);
            }
        } else if (b10 == 8 && abstractSerializedData.readInt32(z11) == 132805945) {
            ?? tLObject = new TLObject();
            tLObject.f15298a = abstractSerializedData.readDouble(false);
            tLObject.f15299b = abstractSerializedData.readDouble(false);
            tLObject.f15300c = abstractSerializedData.readString(false);
            tLObject.d = abstractSerializedData.readFloat(false);
            this.O = tLObject;
        }
    }
}
