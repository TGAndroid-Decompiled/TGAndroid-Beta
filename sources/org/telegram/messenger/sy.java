package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sy {
    public ArrayList A;
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public HashMap E;
    public long F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public Object K;
    public final gz L;
    public final long f25542a;
    public ArrayList f25543b;
    public TLObject f25544c;
    public TLObject d;
    public int f25545e;
    public String f25546f;
    public TLRPC.PhotoSize f25547g;
    public TLObject h;
    public TLRPC.PhotoSize f25548i;
    public TLRPC.InputFile f25549j;
    public boolean f25550k;
    public String f25551l;
    public ij f25552m;
    public TLRPC.EncryptedChat f25553n;
    public j20 f25554o;
    public boolean f25555p;
    public boolean f25556q;
    public boolean f25557r;
    public boolean[] f25558s;
    public TLRPC.InputMedia f25559t;
    public ArrayList f25560u;
    public ArrayList v;
    public ArrayList f25561w;
    public ArrayList f25562x;
    public ArrayList f25563y;
    public ArrayList f25564z;

    public sy(gz gzVar, long j3) {
        this.L = gzVar;
        this.f25542a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, sy syVar, boolean z9) {
        ?? obj = new Object();
        obj.f25705a = tLObject;
        obj.f25707c = arrayList;
        obj.f25708e = arrayList2;
        obj.f25710g = syVar;
        obj.f25709f = arrayList3;
        obj.f25711i = z9;
        if (this.f25543b == null) {
            this.f25543b = new ArrayList();
        }
        this.f25543b.add(obj);
    }

    public final void b(long j3) {
        this.f25545e = 4;
        this.F = j3;
        this.f25562x = new ArrayList();
        this.f25564z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25563y = new ArrayList();
        this.E = new HashMap();
        this.f25560u = new ArrayList();
        this.v = new ArrayList();
        this.f25561w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25545e;
        int i10 = qs.M;
        gz gzVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25562x.size(); i11++) {
                ij ijVar = (ij) this.f25562x.get(i11);
                gzVar.getMessagesStorage().N0(ijVar.f23285p1 ? 1 : 0, ijVar.f23266k);
                TLRPC.Message message = ijVar.f23266k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                gzVar.getNotificationCenter().k(i10, Integer.valueOf(ijVar.e1()));
                gzVar.d0(ijVar.e1());
                gzVar.j0(ijVar.e1(), this.H);
            }
            gzVar.f22768a.remove("group_" + this.F);
        } else {
            yr messagesStorage = gzVar.getMessagesStorage();
            ij ijVar2 = this.f25552m;
            messagesStorage.N0(ijVar2.f23285p1 ? 1 : 0, ijVar2.f23266k);
            TLRPC.Message message2 = this.f25552m.f23266k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            gzVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25552m.e1()));
            gzVar.d0(this.f25552m.e1());
            gzVar.j0(this.f25552m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25543b;
        if (arrayList != null) {
            int i7 = this.f25545e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ty tyVar = (ty) this.f25543b.get(i10);
                    TLObject tLObject = tyVar.f25705a;
                    boolean z9 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    gz gzVar = this.L;
                    if (z9) {
                        gzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) tyVar.f25705a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        gzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, tyVar.f25707c, tyVar.f25708e, tyVar.f25709f, tyVar.f25710g, tyVar.f25711i);
                    } else {
                        boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                gzVar.P(tL_messages_sendMedia, tyVar.f25707c, tyVar.f25708e, tyVar.f25709f, tyVar.f25710g, tyVar.f25711i);
                            }
                        }
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                gzVar.P(tL_messages_sendMedia2, tyVar.f25707c, tyVar.f25708e, tyVar.f25709f, tyVar.f25710g, tyVar.f25711i);
                            }
                        }
                        gzVar.N(tLObject, tyVar.f25706b, tyVar.d, tyVar.f25710g, tyVar.h, null, tyVar.f25711i);
                    }
                }
                this.f25543b = null;
            }
        }
    }
}
