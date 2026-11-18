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
    public final long f25455a;
    public ArrayList f25456b;
    public TLObject f25457c;
    public TLObject d;
    public int f25458e;
    public String f25459f;
    public TLRPC.PhotoSize f25460g;
    public TLObject h;
    public TLRPC.PhotoSize f25461i;
    public TLRPC.InputFile f25462j;
    public boolean f25463k;
    public String f25464l;
    public fj f25465m;
    public TLRPC.EncryptedChat f25466n;
    public e20 f25467o;
    public boolean f25468p;
    public boolean f25469q;
    public boolean f25470r;
    public boolean[] f25471s;
    public TLRPC.InputMedia f25472t;
    public ArrayList f25473u;
    public ArrayList v;
    public ArrayList f25474w;
    public ArrayList f25475x;
    public ArrayList f25476y;
    public ArrayList f25477z;

    public ly(zy zyVar, long j3) {
        this.L = zyVar;
        this.f25455a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ly lyVar, boolean z10) {
        ?? obj = new Object();
        obj.f25858a = tLObject;
        obj.f25860c = arrayList;
        obj.f25861e = arrayList2;
        obj.f25863g = lyVar;
        obj.f25862f = arrayList3;
        obj.f25864i = z10;
        if (this.f25456b == null) {
            this.f25456b = new ArrayList();
        }
        this.f25456b.add(obj);
    }

    public final void b(long j3) {
        this.f25458e = 4;
        this.F = j3;
        this.f25475x = new ArrayList();
        this.f25477z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25476y = new ArrayList();
        this.E = new HashMap();
        this.f25473u = new ArrayList();
        this.v = new ArrayList();
        this.f25474w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25458e;
        int i10 = ks.M;
        zy zyVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25475x.size(); i11++) {
                fj fjVar = (fj) this.f25475x.get(i11);
                zyVar.getMessagesStorage().N0(fjVar.f23994r1 ? 1 : 0, fjVar.f23965k);
                TLRPC.Message message = fjVar.f23965k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                zyVar.getNotificationCenter().k(i10, Integer.valueOf(fjVar.e1()));
                zyVar.d0(fjVar.e1());
                zyVar.j0(fjVar.e1(), this.H);
            }
            zyVar.f28385a.remove("group_" + this.F);
        } else {
            tr messagesStorage = zyVar.getMessagesStorage();
            fj fjVar2 = this.f25465m;
            messagesStorage.N0(fjVar2.f23994r1 ? 1 : 0, fjVar2.f23965k);
            TLRPC.Message message2 = this.f25465m.f23965k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            zyVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25465m.e1()));
            zyVar.d0(this.f25465m.e1());
            zyVar.j0(this.f25465m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25456b;
        if (arrayList != null) {
            int i7 = this.f25458e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    my myVar = (my) this.f25456b.get(i10);
                    TLObject tLObject = myVar.f25858a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    zy zyVar = this.L;
                    if (z10) {
                        zyVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) myVar.f25858a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        zyVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, myVar.f25860c, myVar.f25861e, myVar.f25862f, myVar.f25863g, myVar.f25864i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                zyVar.P(tL_messages_sendMedia, myVar.f25860c, myVar.f25861e, myVar.f25862f, myVar.f25863g, myVar.f25864i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                zyVar.P(tL_messages_sendMedia2, myVar.f25860c, myVar.f25861e, myVar.f25862f, myVar.f25863g, myVar.f25864i);
                            }
                        }
                        zyVar.N(tLObject, myVar.f25859b, myVar.d, myVar.f25863g, myVar.h, null, myVar.f25864i);
                    }
                }
                this.f25456b = null;
            }
        }
    }
}
