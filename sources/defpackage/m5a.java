package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m5a {
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
    public final a6a L;
    public final long a;
    public ArrayList b;
    public TLObject c;
    public TLObject d;
    public byte e;
    public String f;
    public TLRPC.PhotoSize g;
    public TLObject h;
    public TLRPC.PhotoSize i;
    public TLRPC.InputFile j;
    public boolean k;
    public String l;
    public k47 m;
    public TLRPC.EncryptedChat n;
    public rcc o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean[] s;
    public TLRPC.InputMedia t;
    public ArrayList u;
    public ArrayList v;
    public ArrayList w;
    public ArrayList x;
    public ArrayList y;
    public ArrayList z;

    public m5a(a6a a6aVar, long j) {
        this.L = a6aVar;
        this.a = j;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, m5a m5aVar, boolean z) {
        ?? obj = new Object();
        obj.a = tLObject;
        obj.c = arrayList;
        obj.e = arrayList2;
        obj.g = m5aVar;
        obj.f = arrayList3;
        obj.i = z;
        ArrayList arrayList4 = this.b;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            this.b = arrayList4;
        }
        arrayList4.add(obj);
    }

    public final void b(long j) {
        this.e = (byte) 4;
        this.F = j;
        this.x = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.y = new ArrayList();
        this.E = new HashMap();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        byte b = this.e;
        int i = nm7.L;
        a6a a6aVar = this.L;
        if (b == 4) {
            for (int i2 = 0; i2 < this.x.size(); i2++) {
                k47 k47Var = (k47) this.x.get(i2);
                a6aVar.getMessagesStorage().K0(k47Var.r1 ? 1 : 0, k47Var.k);
                TLRPC.Message message = k47Var.k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                a6aVar.getNotificationCenter().k(i, Integer.valueOf(k47Var.e1()));
                a6aVar.c0(k47Var.e1());
                a6aVar.i0(k47Var.e1(), this.H);
            }
            a6aVar.a.remove("group_" + this.F);
        } else {
            cf7 messagesStorage = a6aVar.getMessagesStorage();
            k47 k47Var2 = this.m;
            messagesStorage.K0(k47Var2.r1 ? 1 : 0, k47Var2.k);
            TLRPC.Message message2 = this.m.k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            a6aVar.getNotificationCenter().k(i, Integer.valueOf(this.m.e1()));
            a6aVar.c0(this.m.e1());
            a6aVar.i0(this.m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            byte b = this.e;
            if (b == 4 || b == 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    n5a n5aVar = (n5a) this.b.get(i);
                    TLObject tLObject = n5aVar.a;
                    boolean z = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    a6a a6aVar = this.L;
                    if (z) {
                        a6aVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) n5aVar.a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        a6aVar.O((TLRPC.TL_messages_sendMultiMedia) tLObject, n5aVar.c, n5aVar.e, n5aVar.f, n5aVar.g, n5aVar.i);
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                a6aVar.O(tL_messages_sendMedia, n5aVar.c, n5aVar.e, n5aVar.f, n5aVar.g, n5aVar.i);
                            } else {
                                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                                if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                    a6aVar.O(tL_messages_sendMedia2, n5aVar.c, n5aVar.e, n5aVar.f, n5aVar.g, n5aVar.i);
                                }
                            }
                        }
                        a6aVar.M(tLObject, n5aVar.b, n5aVar.d, n5aVar.g, n5aVar.h, null, n5aVar.i);
                    }
                }
                this.b = null;
            }
        }
    }
}
