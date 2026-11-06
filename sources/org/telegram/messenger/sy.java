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
    public final long f25535a;
    public ArrayList f25536b;
    public TLObject f25537c;
    public TLObject d;
    public int f25538e;
    public String f25539f;
    public TLRPC.PhotoSize f25540g;
    public TLObject h;
    public TLRPC.PhotoSize f25541i;
    public TLRPC.InputFile f25542j;
    public boolean f25543k;
    public String f25544l;
    public ij f25545m;
    public TLRPC.EncryptedChat f25546n;
    public j20 f25547o;
    public boolean f25548p;
    public boolean f25549q;
    public boolean f25550r;
    public boolean[] f25551s;
    public TLRPC.InputMedia f25552t;
    public ArrayList f25553u;
    public ArrayList v;
    public ArrayList f25554w;
    public ArrayList f25555x;
    public ArrayList f25556y;
    public ArrayList f25557z;

    public sy(gz gzVar, long j3) {
        this.L = gzVar;
        this.f25535a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, sy syVar, boolean z9) {
        ?? obj = new Object();
        obj.f25697a = tLObject;
        obj.f25699c = arrayList;
        obj.f25700e = arrayList2;
        obj.f25702g = syVar;
        obj.f25701f = arrayList3;
        obj.f25703i = z9;
        if (this.f25536b == null) {
            this.f25536b = new ArrayList();
        }
        this.f25536b.add(obj);
    }

    public final void b(long j3) {
        this.f25538e = 4;
        this.F = j3;
        this.f25555x = new ArrayList();
        this.f25557z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25556y = new ArrayList();
        this.E = new HashMap();
        this.f25553u = new ArrayList();
        this.v = new ArrayList();
        this.f25554w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25538e;
        int i10 = qs.M;
        gz gzVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25555x.size(); i11++) {
                ij ijVar = (ij) this.f25555x.get(i11);
                gzVar.getMessagesStorage().N0(ijVar.f23263p1 ? 1 : 0, ijVar.f23244k);
                TLRPC.Message message = ijVar.f23244k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                gzVar.getNotificationCenter().k(i10, Integer.valueOf(ijVar.f1()));
                gzVar.d0(ijVar.f1());
                gzVar.j0(ijVar.f1(), this.H);
            }
            gzVar.f22758a.remove("group_" + this.F);
        } else {
            yr messagesStorage = gzVar.getMessagesStorage();
            ij ijVar2 = this.f25545m;
            messagesStorage.N0(ijVar2.f23263p1 ? 1 : 0, ijVar2.f23244k);
            TLRPC.Message message2 = this.f25545m.f23244k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            gzVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25545m.f1()));
            gzVar.d0(this.f25545m.f1());
            gzVar.j0(this.f25545m.f1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25536b;
        if (arrayList != null) {
            int i7 = this.f25538e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ty tyVar = (ty) this.f25536b.get(i10);
                    TLObject tLObject = tyVar.f25697a;
                    boolean z9 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    gz gzVar = this.L;
                    if (z9) {
                        gzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) tyVar.f25697a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        gzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, tyVar.f25699c, tyVar.f25700e, tyVar.f25701f, tyVar.f25702g, tyVar.f25703i);
                    } else {
                        boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                gzVar.P(tL_messages_sendMedia, tyVar.f25699c, tyVar.f25700e, tyVar.f25701f, tyVar.f25702g, tyVar.f25703i);
                            }
                        }
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                gzVar.P(tL_messages_sendMedia2, tyVar.f25699c, tyVar.f25700e, tyVar.f25701f, tyVar.f25702g, tyVar.f25703i);
                            }
                        }
                        gzVar.N(tLObject, tyVar.f25698b, tyVar.d, tyVar.f25702g, tyVar.h, null, tyVar.f25703i);
                    }
                }
                this.f25536b = null;
            }
        }
    }
}
