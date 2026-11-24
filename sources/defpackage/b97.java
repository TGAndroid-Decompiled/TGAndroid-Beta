package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.d;
public final class b97 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public b97(int i, HashSet hashSet, d dVar) {
        this.a = (byte) 3;
        this.b = i;
        this.c = hashSet;
        this.d = dVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = 0;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                na7 na7Var = (na7) obj2;
                String str = (String) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    if (w01.a) {
                        fa4.b("account " + na7Var.currentAccount + " registered for push, push type: " + i2);
                    }
                    na7Var.getUserConfig().d = true;
                    gba.f = str;
                    gba.e = i2;
                    na7Var.getUserConfig().u(false);
                }
                gl.d3(new f67(na7Var, (byte) 10));
                return;
            case 1:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                p8c p8cVar = (p8c) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    while (i < vector.objects.size()) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str2 = tL_premiumGiftCodeOption.store_product;
                        if (str2 != null) {
                            ?? obj3 = new Object();
                            obj3.b = "inapp";
                            obj3.a = str2;
                            arrayList2.add(obj3.a());
                        }
                        i++;
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i3 = this.b;
                    if (!isEmpty && on0.j()) {
                        ci0.h().o(arrayList2, new zm(arrayList, chat, i3, p8cVar));
                        return;
                    } else {
                        gl.d3(new gn0(chat, i3, arrayList, p8cVar, (byte) 1));
                        return;
                    }
                }
                return;
            case 2:
                gl.d3(new tn6((d) ((t81) obj2), tLObject, this.b, (Object) ((TLRPC.User) obj), (byte) 9));
                return;
            case 3:
                gl.d3(new i57(tLObject, this.b, (HashSet) obj2, tL_error, (d) obj, (byte) 6));
                return;
            case 4:
                mt9 mt9Var = (mt9) obj2;
                mt9Var.getClass();
                gl.d3(new tn6((n39) mt9Var, this.b, tLObject, (String) obj, (byte) 21));
                return;
            case 5:
                l94 l94Var = (l94) obj2;
                k94 k94Var = (k94) obj;
                l94Var.z0 = false;
                if (tLObject instanceof Vector) {
                    Vector vector2 = (Vector) tLObject;
                    if (!vector2.objects.isEmpty()) {
                        if (l94Var.q0 == null) {
                            l94Var.q0 = new HashMap();
                        }
                        while (i < vector2.objects.size()) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector2.objects.get(i);
                            l94Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                            i++;
                        }
                    }
                    l94Var.q(i2);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        l94Var.h(0, false);
                        return;
                    }
                    l94Var.u0 = false;
                    l94Var.c(k94Var, false, false);
                    l94Var.q(i2);
                    return;
                } else {
                    return;
                }
            case 6:
                gl.d3(new tn6((d) obj2, tLObject, this.b, (Object) ((p8c) obj), (byte) 23));
                return;
            case 7:
                gl.d3(new tn6((n39) ((dd5) obj2), this.b, tLObject, (String) obj, (byte) 27));
                return;
            case 8:
                hq6 hq6Var = (hq6) obj2;
                p8c p8cVar2 = (p8c) obj;
                boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i4 = this.b;
                if (z) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add((TLRPC.TL_messages_stickerSet) tLObject);
                    hq6Var.A1(i4, arrayList3, false, (int) (System.currentTimeMillis() / 1000), hq6.s(arrayList3), new mn0(p8cVar2, (byte) 7));
                    return;
                }
                hq6Var.A1(i4, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new mn0(p8cVar2, (byte) 8));
                return;
            case 9:
                gl.d3(new q76((na7) obj2, tLObject, this.b, (q97) obj, (byte) 5));
                return;
            case 10:
                gl.d3(new q76((bba) obj2, this.b, tLObject, (String) obj, (byte) 27));
                return;
            case 11:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$37(i2, (String) obj, tLObject, tL_error);
                return;
            default:
                ((VoIPService) obj2).lambda$editCallMember$86(i2, (Runnable) obj, tLObject, tL_error);
                return;
        }
    }

    public b97(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
