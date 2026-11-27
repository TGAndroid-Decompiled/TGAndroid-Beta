package defpackage;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl3 implements Runnable {
    public final byte a;
    public final Object b;
    public final int c;
    public final int d;
    public final Object e;
    public final Object f;
    public final TLObject h;
    public final ArrayList n;
    public final TLObject r;

    public jl3(ls6 ls6Var, TLObject tLObject, ArrayList arrayList, int i, zh6 zh6Var, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i2) {
        this.a = (byte) 2;
        this.b = ls6Var;
        this.h = tLObject;
        this.n = arrayList;
        this.c = i;
        this.e = zh6Var;
        this.f = stickerSet;
        this.r = tL_messages_allStickers;
        this.d = i2;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        ConcurrentHashMap concurrentHashMap;
        boolean z5;
        byte b = this.a;
        ArrayList arrayList = this.n;
        int i2 = this.d;
        TLObject tLObject = this.r;
        Object obj = this.f;
        Object obj2 = this.e;
        int i3 = this.c;
        TLObject tLObject2 = this.h;
        Object obj3 = this.b;
        int i4 = 0;
        switch (b) {
            case 0:
                tl3 tl3Var = (tl3) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                ml3 ml3Var = tl3Var.k0;
                ArrayList arrayList2 = tl3Var.I;
                int i5 = tl3Var.t0;
                if (i3 == tl3Var.U && (i2 <= 0 || i2 == tl3Var.e0)) {
                    tl3Var.E0--;
                    if (tL_error == null) {
                        tl3Var.c0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        jf7.Y(i5).j1(messages_messages.users, messages_messages.chats, true, true);
                        uc7.s1(i5).j4(messages_messages.users, false);
                        uc7.s1(i5).c4(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        tl3Var.d0 = messages_messages.next_rate;
                        for (int i6 = 0; i6 < messages_messages.messages.size(); i6++) {
                            TLRPC.Message message = messages_messages.messages.get(i6);
                            int i7 = uc7.s1(i5).U.get(r47.B0(message));
                            if (i7 == 0 || message.id > i7) {
                                arrayList2.add((r47) arrayList.get(i6));
                            }
                        }
                        tl3Var.O = true;
                        if (messages_messages.messages.size() != 20) {
                            z = true;
                        } else {
                            z = false;
                        }
                        tl3Var.Y = z;
                        if (i2 > 0) {
                            tl3Var.h0 = i2;
                            if (tl3Var.g0 != i2) {
                                tl3Var.s.clear();
                            }
                            if (tl3Var.f0 != i2) {
                                ml3Var.b();
                            }
                        }
                        ml3Var.f(tl3Var.s, tl3Var.w0);
                        dj3 dj3Var = tl3Var.V;
                        if (dj3Var != null) {
                            if (tl3Var.E0 > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            dj3Var.d(z2, true);
                            tl3Var.V.c();
                        }
                        tl3Var.f();
                    }
                }
                tl3Var.R = 0;
                return;
            case 1:
                tl3 tl3Var2 = (tl3) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                ml3 ml3Var2 = tl3Var2.k0;
                ArrayList arrayList3 = tl3Var2.J;
                ArrayList arrayList4 = tl3Var2.I;
                int i8 = tl3Var2.t0;
                if (i3 == tl3Var2.Q && (i2 <= 0 || i2 == tl3Var2.e0)) {
                    tl3Var2.E0--;
                    if (tL_error2 == null) {
                        tl3Var2.c0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        jf7.Y(i8).j1(messages_messages2.users, messages_messages2.chats, true, true);
                        uc7.s1(i8).j4(messages_messages2.users, false);
                        uc7.s1(i8).c4(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        tl3Var2.d0 = messages_messages2.next_rate;
                        int i9 = 0;
                        while (i9 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i9);
                            int i10 = uc7.s1(i8).U.get(r47.B0(message2));
                            if (i10 == 0 || message2.id > i10) {
                                r47 r47Var = (r47) arrayList.get(i9);
                                if (!arrayList4.isEmpty()) {
                                    for (int i11 = i4; i11 < arrayList4.size(); i11++) {
                                        r47 r47Var2 = (r47) arrayList4.get(i11);
                                        if (r47Var2 == null || r47Var == null || r47Var.e1() != r47Var2.e1() || r47.B0(r47Var.k) != r47.B0(r47Var2.k)) {
                                        }
                                    }
                                }
                                arrayList3.add(r47Var);
                                long B0 = r47.B0(message2);
                                if (message2.out) {
                                    concurrentHashMap = uc7.s1(i8).Q;
                                } else {
                                    concurrentHashMap = uc7.s1(i8).P;
                                }
                                Integer num = (Integer) concurrentHashMap.get(Long.valueOf(B0));
                                if (num != null) {
                                    if (num.intValue() < message2.id) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    message2.unread = z5;
                                }
                            }
                            i9++;
                            i4 = 0;
                        }
                        tl3Var2.O = true;
                        if (messages_messages2.messages.size() != 20) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        tl3Var2.X = z3;
                        if (i2 > 0) {
                            tl3Var2.h0 = i2;
                            if (tl3Var2.g0 != i2) {
                                tl3Var2.s.clear();
                            }
                            if (tl3Var2.f0 != i2) {
                                ml3Var2.b();
                            }
                        }
                        ml3Var2.f(tl3Var2.s, tl3Var2.w0);
                        dj3 dj3Var2 = tl3Var2.V;
                        if (dj3Var2 != null) {
                            if (tl3Var2.E0 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            dj3Var2.d(z4, true);
                            tl3Var2.V.c();
                        }
                        tl3Var2.H0 = true;
                        tl3Var2.I0 = true;
                        i = 0;
                        tl3Var2.d = false;
                        oob oobVar = tl3Var2.F0;
                        if (oobVar != null) {
                            ((TextView) oobVar.b).setText(ob6.a0(null, null, 2131745478, tl3Var2.a0));
                        }
                        tl3Var2.f();
                        tl3Var2.P = i;
                        return;
                    }
                }
                i = 0;
                tl3Var2.P = i;
                return;
            default:
                ls6 ls6Var = (ls6) obj3;
                zh6 zh6Var = (zh6) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList5 = this.n;
                arrayList5.set(i3, tL_messages_stickerSet);
                zh6Var.k(((TLRPC.StickerSet) obj).id, tL_messages_stickerSet);
                if (zh6Var.m() == tL_messages_allStickers.sets.size()) {
                    while (i4 < arrayList5.size()) {
                        if (arrayList5.get(i4) == null) {
                            arrayList5.remove(i4);
                            i4--;
                        }
                        i4++;
                    }
                    ls6Var.A1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    return;
                }
                return;
        }
    }

    public jl3(tl3 tl3Var, int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = tl3Var;
        this.c = i;
        this.d = i2;
        this.e = tL_error;
        this.f = str;
        this.h = tLObject;
        this.r = tLMethod;
        this.n = arrayList;
    }
}
