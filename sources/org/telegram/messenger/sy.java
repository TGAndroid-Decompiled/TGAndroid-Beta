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
    public final long f25538a;
    public ArrayList f25539b;
    public TLObject f25540c;
    public TLObject d;
    public int f25541e;
    public String f25542f;
    public TLRPC.PhotoSize f25543g;
    public TLObject h;
    public TLRPC.PhotoSize f25544i;
    public TLRPC.InputFile f25545j;
    public boolean f25546k;
    public String f25547l;
    public ij f25548m;
    public TLRPC.EncryptedChat f25549n;
    public j20 f25550o;
    public boolean f25551p;
    public boolean f25552q;
    public boolean f25553r;
    public boolean[] f25554s;
    public TLRPC.InputMedia f25555t;
    public ArrayList f25556u;
    public ArrayList v;
    public ArrayList f25557w;
    public ArrayList f25558x;
    public ArrayList f25559y;
    public ArrayList f25560z;

    public sy(gz gzVar, long j3) {
        this.L = gzVar;
        this.f25538a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, sy syVar, boolean z9) {
        ?? obj = new Object();
        obj.f25701a = tLObject;
        obj.f25703c = arrayList;
        obj.f25704e = arrayList2;
        obj.f25706g = syVar;
        obj.f25705f = arrayList3;
        obj.f25707i = z9;
        if (this.f25539b == null) {
            this.f25539b = new ArrayList();
        }
        this.f25539b.add(obj);
    }

    public final void b(long j3) {
        this.f25541e = 4;
        this.F = j3;
        this.f25558x = new ArrayList();
        this.f25560z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25559y = new ArrayList();
        this.E = new HashMap();
        this.f25556u = new ArrayList();
        this.v = new ArrayList();
        this.f25557w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25541e;
        int i10 = qs.M;
        gz gzVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25558x.size(); i11++) {
                ij ijVar = (ij) this.f25558x.get(i11);
                gzVar.getMessagesStorage().N0(ijVar.f23281p1 ? 1 : 0, ijVar.f23262k);
                TLRPC.Message message = ijVar.f23262k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                gzVar.getNotificationCenter().k(i10, Integer.valueOf(ijVar.e1()));
                gzVar.d0(ijVar.e1());
                gzVar.j0(ijVar.e1(), this.H);
            }
            gzVar.f22764a.remove("group_" + this.F);
        } else {
            yr messagesStorage = gzVar.getMessagesStorage();
            ij ijVar2 = this.f25548m;
            messagesStorage.N0(ijVar2.f23281p1 ? 1 : 0, ijVar2.f23262k);
            TLRPC.Message message2 = this.f25548m.f23262k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            gzVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25548m.e1()));
            gzVar.d0(this.f25548m.e1());
            gzVar.j0(this.f25548m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25539b;
        if (arrayList != null) {
            int i7 = this.f25541e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ty tyVar = (ty) this.f25539b.get(i10);
                    TLObject tLObject = tyVar.f25701a;
                    boolean z9 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    gz gzVar = this.L;
                    if (z9) {
                        gzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) tyVar.f25701a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        gzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, tyVar.f25703c, tyVar.f25704e, tyVar.f25705f, tyVar.f25706g, tyVar.f25707i);
                    } else {
                        boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                gzVar.P(tL_messages_sendMedia, tyVar.f25703c, tyVar.f25704e, tyVar.f25705f, tyVar.f25706g, tyVar.f25707i);
                            }
                        }
                        if (z10) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                gzVar.P(tL_messages_sendMedia2, tyVar.f25703c, tyVar.f25704e, tyVar.f25705f, tyVar.f25706g, tyVar.f25707i);
                            }
                        }
                        gzVar.N(tLObject, tyVar.f25702b, tyVar.d, tyVar.f25706g, tyVar.h, null, tyVar.f25707i);
                    }
                }
                this.f25539b = null;
            }
        }
    }
}
