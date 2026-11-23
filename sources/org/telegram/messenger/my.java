package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class my {
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
    public final az L;
    public final long f25661a;
    public ArrayList f25662b;
    public TLObject f25663c;
    public TLObject d;
    public int f25664e;
    public String f25665f;
    public TLRPC.PhotoSize f25666g;
    public TLObject h;
    public TLRPC.PhotoSize f25667i;
    public TLRPC.InputFile f25668j;
    public boolean f25669k;
    public String f25670l;
    public gj f25671m;
    public TLRPC.EncryptedChat f25672n;
    public f20 f25673o;
    public boolean f25674p;
    public boolean f25675q;
    public boolean f25676r;
    public boolean[] f25677s;
    public TLRPC.InputMedia f25678t;
    public ArrayList f25679u;
    public ArrayList v;
    public ArrayList f25680w;
    public ArrayList f25681x;
    public ArrayList f25682y;
    public ArrayList f25683z;

    public my(az azVar, long j3) {
        this.L = azVar;
        this.f25661a = j3;
    }

    public final void a(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, my myVar, boolean z10) {
        ?? obj = new Object();
        obj.f26057a = tLObject;
        obj.f26059c = arrayList;
        obj.f26060e = arrayList2;
        obj.f26062g = myVar;
        obj.f26061f = arrayList3;
        obj.f26063i = z10;
        if (this.f25662b == null) {
            this.f25662b = new ArrayList();
        }
        this.f25662b.add(obj);
    }

    public final void b(long j3) {
        this.f25664e = 4;
        this.F = j3;
        this.f25681x = new ArrayList();
        this.f25683z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f25682y = new ArrayList();
        this.E = new HashMap();
        this.f25679u = new ArrayList();
        this.v = new ArrayList();
        this.f25680w = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public final void c() {
        int i7 = this.f25664e;
        int i10 = ls.M;
        az azVar = this.L;
        if (i7 == 4) {
            for (int i11 = 0; i11 < this.f25681x.size(); i11++) {
                gj gjVar = (gj) this.f25681x.get(i11);
                azVar.getMessagesStorage().N0(gjVar.f24242r1 ? 1 : 0, gjVar.f24213k);
                TLRPC.Message message = gjVar.f24213k;
                message.send_state = 2;
                message.errorAllowedPriceStars = 0L;
                message.errorNewPriceStars = 0L;
                azVar.getNotificationCenter().k(i10, Integer.valueOf(gjVar.e1()));
                azVar.d0(gjVar.e1());
                azVar.j0(gjVar.e1(), this.H);
            }
            azVar.f23004a.remove("group_" + this.F);
        } else {
            ur messagesStorage = azVar.getMessagesStorage();
            gj gjVar2 = this.f25671m;
            messagesStorage.N0(gjVar2.f24242r1 ? 1 : 0, gjVar2.f24213k);
            TLRPC.Message message2 = this.f25671m.f24213k;
            message2.send_state = 2;
            message2.errorAllowedPriceStars = 0L;
            message2.errorNewPriceStars = 0L;
            azVar.getNotificationCenter().k(i10, Integer.valueOf(this.f25671m.e1()));
            azVar.d0(this.f25671m.e1());
            azVar.j0(this.f25671m.e1(), this.H);
        }
        d();
    }

    public final void d() {
        ArrayList arrayList = this.f25662b;
        if (arrayList != null) {
            int i7 = this.f25664e;
            if (i7 == 4 || i7 == 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ny nyVar = (ny) this.f25662b.get(i10);
                    TLObject tLObject = nyVar.f26057a;
                    boolean z10 = tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia;
                    az azVar = this.L;
                    if (z10) {
                        azVar.getSecretChatHelper().k((TLRPC.TL_messages_sendEncryptedMultiMedia) nyVar.f26057a, this);
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        azVar.P((TLRPC.TL_messages_sendMultiMedia) tLObject, nyVar.f26059c, nyVar.f26060e, nyVar.f26061f, nyVar.f26062g, nyVar.f26063i);
                    } else {
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                azVar.P(tL_messages_sendMedia, nyVar.f26059c, nyVar.f26060e, nyVar.f26061f, nyVar.f26062g, nyVar.f26063i);
                            }
                        }
                        if (z11) {
                            TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                            if (tL_messages_sendMedia2.media instanceof TLRPC.TL_inputMediaPoll) {
                                azVar.P(tL_messages_sendMedia2, nyVar.f26059c, nyVar.f26060e, nyVar.f26061f, nyVar.f26062g, nyVar.f26063i);
                            }
                        }
                        azVar.N(tLObject, nyVar.f26058b, nyVar.d, nyVar.f26062g, nyVar.h, null, nyVar.f26063i);
                    }
                }
                this.f25662b = null;
            }
        }
    }
}
