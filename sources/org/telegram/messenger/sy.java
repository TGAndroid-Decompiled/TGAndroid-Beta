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
    public final long f25527a;
    public ArrayList f25528b;
    public TLObject f25529c;
    public TLObject d;
    public int f25530e;
    public String f25531f;
    public TLRPC.PhotoSize f25532g;
    public TLObject h;
    public TLRPC.PhotoSize f25533i;
    public TLRPC.InputFile f25534j;
    public boolean f25535k;
    public String f25536l;
    public ij f25537m;
    public TLRPC.EncryptedChat f25538n;
    public j20 f25539o;
    public boolean f25540p;
    public boolean f25541q;
    public boolean f25542r;
    public boolean[] f25543s;
    public TLRPC.InputMedia f25544t;
    public ArrayList f25545u;
    public ArrayList v;
    public ArrayList f25546w;
    public ArrayList f25547x;
    public ArrayList f25548y;
    public ArrayList f25549z;

    public sy(gz gzVar, long j3) {
        this.L = gzVar;
        this.f25527a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, sy syVar, boolean z9) {
        ?? obj = new Object();
        obj.f25689a = tLObject;
        obj.f25691c = arrayList;
        obj.f25692e = arrayList2;
        obj.f25694g = syVar;
        obj.f25693f = arrayList3;
        obj.f25695i = z9;
        if (this.f25528b == null) {
            this.f25528b = new ArrayList();
        }
        this.f25528b.add(obj);
    }

    public final void b(long j3) {
        this.f25530e = 4;
        this.F = j3;
        this.f25547x = new ArrayList();
        this.f25549z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25548y = new ArrayList();
        this.E = new HashMap();
        this.f25545u = new ArrayList();
        this.v = new ArrayList();
        this.f25546w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25530e;
        int i10 = qs.M;
        gz gzVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25547x.size(); i11++) {
                ij ijVar = (ij) this.f25547x.get(i11);
                gzVar.getMessagesStorage().N0(ijVar.f23256p1 ? 1 : 0, ijVar.f23237k);
                TLRPC.Message message = ijVar.f23237k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                gzVar.getNotificationCenter().k(i10, Integer.valueOf(ijVar.f1()));
                gzVar.d0(ijVar.f1());
                gzVar.j0(ijVar.f1(), this.H);
            }
            gzVar.f22751a.remove("group_" + this.F);
        } else {
            yr messagesStorage = gzVar.getMessagesStorage();
            ij ijVar2 = this.f25537m;
            messagesStorage.N0(ijVar2.f23256p1 ? 1 : 0, ijVar2.f23237k);
            TLRPC.Message message2 = this.f25537m.f23237k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            gzVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25537m.f1()));
            gzVar.d0(this.f25537m.f1());
            gzVar.j0(this.f25537m.f1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25528b;
        if (arrayList != null) {
            int i7 = this.f25530e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ty tyVar = (ty) this.f25528b.get(i10);
                    TLObject tLObject = tyVar.f25689a;
                    boolean z9 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    gz gzVar = this.L;
                    if (z9) {
                        gzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) tyVar.f25689a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        gzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, tyVar.f25691c, tyVar.f25692e, tyVar.f25693f, tyVar.f25694g, tyVar.f25695i);
                    } else {
                        boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                gzVar.P(tL_messages_sendMedia, tyVar.f25691c, tyVar.f25692e, tyVar.f25693f, tyVar.f25694g, tyVar.f25695i);
                            }
                        }
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                gzVar.P(tL_messages_sendMedia2, tyVar.f25691c, tyVar.f25692e, tyVar.f25693f, tyVar.f25694g, tyVar.f25695i);
                            }
                        }
                        gzVar.N(tLObject, tyVar.f25690b, tyVar.d, tyVar.f25694g, tyVar.h, null, tyVar.f25695i);
                    }
                }
                this.f25528b = null;
            }
        }
    }
}
