package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ly {
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
    public final zy L;
    public final long f25457a;
    public ArrayList f25458b;
    public TLObject f25459c;
    public TLObject d;
    public int f25460e;
    public String f25461f;
    public TLRPC.PhotoSize f25462g;
    public TLObject h;
    public TLRPC.PhotoSize f25463i;
    public TLRPC.InputFile f25464j;
    public boolean f25465k;
    public String f25466l;
    public fj f25467m;
    public TLRPC.EncryptedChat f25468n;
    public e20 f25469o;
    public boolean f25470p;
    public boolean f25471q;
    public boolean f25472r;
    public boolean[] f25473s;
    public TLRPC.InputMedia f25474t;
    public ArrayList f25475u;
    public ArrayList v;
    public ArrayList f25476w;
    public ArrayList f25477x;
    public ArrayList f25478y;
    public ArrayList f25479z;

    public ly(zy zyVar, long j3) {
        this.L = zyVar;
        this.f25457a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ly lyVar, boolean z10) {
        ?? obj = new Object();
        obj.f25860a = tLObject;
        obj.f25862c = arrayList;
        obj.f25863e = arrayList2;
        obj.f25865g = lyVar;
        obj.f25864f = arrayList3;
        obj.f25866i = z10;
        if (this.f25458b == null) {
            this.f25458b = new ArrayList();
        }
        this.f25458b.add(obj);
    }

    public final void b(long j3) {
        this.f25460e = 4;
        this.F = j3;
        this.f25477x = new ArrayList();
        this.f25479z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25478y = new ArrayList();
        this.E = new HashMap();
        this.f25475u = new ArrayList();
        this.v = new ArrayList();
        this.f25476w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25460e;
        int i10 = ks.M;
        zy zyVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25477x.size(); i11++) {
                fj fjVar = (fj) this.f25477x.get(i11);
                zyVar.getMessagesStorage().N0(fjVar.f23997r1 ? 1 : 0, fjVar.f23968k);
                TLRPC.Message message = fjVar.f23968k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                zyVar.getNotificationCenter().k(i10, Integer.valueOf(fjVar.e1()));
                zyVar.d0(fjVar.e1());
                zyVar.j0(fjVar.e1(), this.H);
            }
            zyVar.f28387a.remove("group_" + this.F);
        } else {
            tr messagesStorage = zyVar.getMessagesStorage();
            fj fjVar2 = this.f25467m;
            messagesStorage.N0(fjVar2.f23997r1 ? 1 : 0, fjVar2.f23968k);
            TLRPC.Message message2 = this.f25467m.f23968k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            zyVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25467m.e1()));
            zyVar.d0(this.f25467m.e1());
            zyVar.j0(this.f25467m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25458b;
        if (arrayList != null) {
            int i7 = this.f25460e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    my myVar = (my) this.f25458b.get(i10);
                    TLObject tLObject = myVar.f25860a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    zy zyVar = this.L;
                    if (z10) {
                        zyVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) myVar.f25860a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        zyVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, myVar.f25862c, myVar.f25863e, myVar.f25864f, myVar.f25865g, myVar.f25866i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                zyVar.P(tL_messages_sendMedia, myVar.f25862c, myVar.f25863e, myVar.f25864f, myVar.f25865g, myVar.f25866i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                zyVar.P(tL_messages_sendMedia2, myVar.f25862c, myVar.f25863e, myVar.f25864f, myVar.f25865g, myVar.f25866i);
                            }
                        }
                        zyVar.N(tLObject, myVar.f25861b, myVar.d, myVar.f25865g, myVar.h, null, myVar.f25866i);
                    }
                }
                this.f25458b = null;
            }
        }
    }
}
