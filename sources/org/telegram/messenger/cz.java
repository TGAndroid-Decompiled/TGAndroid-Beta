package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cz {
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
    public final qz L;
    public final long f15107a;
    public ArrayList f15108b;
    public TLObject f15109c;
    public TLObject d;
    public int e;
    public String f15110f;
    public TLRPC.PhotoSize f15111g;
    public TLObject h;
    public TLRPC.PhotoSize f15112i;
    public TLRPC.InputFile f15113j;
    public boolean f15114k;
    public String f15115l;
    public jj f15116m;
    public TLRPC.EncryptedChat f15117n;
    public x20 f15118o;
    public boolean f15119p;
    public boolean f15120q;
    public boolean f15121r;
    public boolean[] f15122s;
    public TLRPC.InputMedia f15123t;
    public ArrayList f15124u;
    public ArrayList v;
    public ArrayList f15125w;
    public ArrayList f15126x;
    public ArrayList f15127y;
    public ArrayList f15128z;

    public cz(qz qzVar, long j10) {
        this.L = qzVar;
        this.f15107a = j10;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, cz czVar, boolean z10) {
        ?? obj = new Object();
        obj.f15329a = tLObject;
        obj.f15331c = arrayList;
        obj.e = arrayList2;
        obj.f15333g = czVar;
        obj.f15332f = arrayList3;
        obj.f15334i = z10;
        if (this.f15108b == null) {
            this.f15108b = new ArrayList();
        }
        this.f15108b.add(obj);
    }

    public final void b(long j10) {
        this.e = 4;
        this.F = j10;
        this.f15126x = new ArrayList();
        this.f15128z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f15127y = new ArrayList();
        this.E = new HashMap();
        this.f15124u = new ArrayList();
        this.v = new ArrayList();
        this.f15125w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i10 = this.e;
        int i11 = zs.M;
        qz qzVar = this.L;
        if (i10 == 4) {
            for (int i12 = 0; i12 < this.f15126x.size(); i12++) {
                jj jjVar = (jj) this.f15126x.get(i12);
                qzVar.getMessagesStorage().N0(jjVar.f16357p1 ? 1 : 0, jjVar.f16337k);
                TLRPC.Message message = jjVar.f16337k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                qzVar.getNotificationCenter().k(i11, Integer.valueOf(jjVar.f1()));
                qzVar.d0(jjVar.f1());
                qzVar.j0(jjVar.f1(), this.H);
            }
            qzVar.f17658a.remove("group_" + this.F);
        } else {
            hs messagesStorage = qzVar.getMessagesStorage();
            jj jjVar2 = this.f15116m;
            messagesStorage.N0(jjVar2.f16357p1 ? 1 : 0, jjVar2.f16337k);
            TLRPC.Message message2 = this.f15116m.f16337k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            qzVar.getNotificationCenter().k(i11, Integer.valueOf(this.f15116m.f1()));
            qzVar.d0(this.f15116m.f1());
            qzVar.j0(this.f15116m.f1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f15108b;
        if (arrayList != null) {
            int i10 = this.e;
            if (i10 == 4 || i10 == 0) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    dz dzVar = (dz) this.f15108b.get(i11);
                    TLObject tLObject = dzVar.f15329a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    qz qzVar = this.L;
                    if (z10) {
                        qzVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) dzVar.f15329a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        qzVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, dzVar.f15331c, dzVar.e, dzVar.f15332f, dzVar.f15333g, dzVar.f15334i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                qzVar.P(tL_messages_sendMedia, dzVar.f15331c, dzVar.e, dzVar.f15332f, dzVar.f15333g, dzVar.f15334i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                qzVar.P(tL_messages_sendMedia2, dzVar.f15331c, dzVar.e, dzVar.f15332f, dzVar.f15333g, dzVar.f15334i);
                            }
                        }
                        qzVar.N(tLObject, dzVar.f15330b, dzVar.d, dzVar.f15333g, dzVar.h, null, dzVar.f15334i);
                    }
                }
                this.f15108b = null;
            }
        }
    }
}
