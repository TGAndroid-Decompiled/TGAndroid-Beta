package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vqa implements jac {
    public final byte a;
    public final wsa b;
    public final TL_stars.TL_starGiftUnique c;

    public vqa(wsa wsaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        switch (this.a) {
            case 0:
                final nk nkVar = (nk) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount q = nkVar.q();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final wsa wsaVar = this.b;
                updatestargiftprice.stargift = wsaVar.u1();
                updatestargiftprice.resell_amount = q;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wsaVar.a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z = tLObject instanceof TLRPC.Updates;
                                final wsa wsaVar2 = wsaVar;
                                final Runnable runnable2 = runnable;
                                if (z) {
                                    oc7.r1(wsaVar2.a).T3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final nk nkVar2 = nkVar;
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z2;
                                            byte b = r5;
                                            ok okVar = ok.a;
                                            ok okVar2 = ok.b;
                                            Runnable runnable3 = runnable2;
                                            nk nkVar3 = nkVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            wsa wsaVar3 = wsaVar2;
                                            boolean z3 = false;
                                            switch (b) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (nkVar3.a == okVar2) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(nkVar3.e(okVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(nkVar3.e(okVar2).q());
                                                    wsaVar3.a2.setResellPrice(nkVar3);
                                                    hs8 hs8Var = wsaVar3.i3;
                                                    if (hs8Var != null) {
                                                        hs8Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    wsaVar3.j().Q(2131623990, 36, jb6.a0(null, null, 2131749961, wsaVar3.s1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (nkVar3.a == okVar2) {
                                                        z3 = true;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z3;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(nkVar3.e(okVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(nkVar3.e(okVar2).q());
                                                    wsaVar3.a2.setResellPrice(nkVar3);
                                                    hs8 hs8Var2 = wsaVar3.i3;
                                                    if (hs8Var2 != null) {
                                                        hs8Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null) {
                                    if (tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        gm.c3(new hq6(wsaVar2, Long.parseLong(tL_error.text.substring(26)), runnable2, (byte) 25));
                                        return;
                                    } else {
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b = r4;
                                                Runnable runnable3 = runnable2;
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                wsa wsaVar3 = wsaVar2;
                                                switch (b) {
                                                    case 0:
                                                        wsaVar3.j().g0(tL_error2, false);
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        wsaVar3.j().g0(tL_error2, false);
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            default:
                                boolean z2 = tLObject instanceof TLRPC.Updates;
                                final wsa wsaVar3 = wsaVar;
                                final Runnable runnable3 = runnable;
                                if (z2) {
                                    oc7.r1(wsaVar3.a).T3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final nk nkVar3 = nkVar;
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z22;
                                            byte b = r5;
                                            ok okVar = ok.a;
                                            ok okVar2 = ok.b;
                                            Runnable runnable32 = runnable3;
                                            nk nkVar32 = nkVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            wsa wsaVar32 = wsaVar3;
                                            boolean z3 = false;
                                            switch (b) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (nkVar32.a == okVar2) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z22;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(nkVar32.e(okVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(nkVar32.e(okVar2).q());
                                                    wsaVar32.a2.setResellPrice(nkVar32);
                                                    hs8 hs8Var = wsaVar32.i3;
                                                    if (hs8Var != null) {
                                                        hs8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    wsaVar32.j().Q(2131623990, 36, jb6.a0(null, null, 2131749961, wsaVar32.s1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (nkVar32.a == okVar2) {
                                                        z3 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z3;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(nkVar32.e(okVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(nkVar32.e(okVar2).q());
                                                    wsaVar32.a2.setResellPrice(nkVar32);
                                                    hs8 hs8Var2 = wsaVar32.i3;
                                                    if (hs8Var2 != null) {
                                                        hs8Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null) {
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Runnable runnable32 = runnable3;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            wsa wsaVar32 = wsaVar3;
                                            switch (b) {
                                                case 0:
                                                    wsaVar32.j().g0(tL_error2, false);
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    wsaVar32.j().g0(tL_error2, false);
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                qac qacVar = (qac) obj;
                Boolean bool = (Boolean) obj2;
                wsa wsaVar2 = this.b;
                xb9 xb9Var = wsaVar2.R2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                if (xb9Var == null) {
                    xb9 xb9Var2 = new xb9(wsaVar2.a, tL_starGiftUnique2.gift_id);
                    wsaVar2.R2 = xb9Var2;
                    xb9Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i = 0;
                while (true) {
                    sra[] sraVarArr = wsaVar2.a2.N.n;
                    if (i < sraVarArr.length) {
                        TL_stars.StarGift starGift2 = sraVarArr[i].h;
                        if (starGift2 != null) {
                            starGift = starGift2;
                        } else {
                            starGift = null;
                        }
                        if (starGift != null) {
                            if (starGift2 == null) {
                                starGift2 = null;
                            }
                            hashSet.add(Long.valueOf(starGift2.id));
                        }
                        i++;
                    } else {
                        yb9 yb9Var = new yb9(wsaVar2.getContext(), tL_starGiftUnique2.title, wsaVar2.R2);
                        yb9Var.b2.addAll(hashSet);
                        yb9Var.d2.O(true);
                        yb9Var.c2 = bool.booleanValue();
                        yb9Var.Z1.set(gm.S2(jb6.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        yb9Var.a2 = new h72(qacVar, (byte) 4);
                        yb9Var.show();
                        return;
                    }
                }
            default:
                final nk nkVar2 = (nk) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount q2 = nkVar2.q();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final wsa wsaVar3 = this.b;
                updatestargiftprice2.stargift = wsaVar3.u1();
                updatestargiftprice2.resell_amount = q2;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(wsaVar3.a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z = tLObject instanceof TLRPC.Updates;
                                final wsa wsaVar22 = wsaVar3;
                                final Runnable runnable22 = runnable2;
                                if (z) {
                                    oc7.r1(wsaVar22.a).T3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final nk nkVar22 = nkVar2;
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z22;
                                            byte b = r5;
                                            ok okVar = ok.a;
                                            ok okVar2 = ok.b;
                                            Runnable runnable32 = runnable22;
                                            nk nkVar32 = nkVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            wsa wsaVar32 = wsaVar22;
                                            boolean z3 = false;
                                            switch (b) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (nkVar32.a == okVar2) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z22;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(nkVar32.e(okVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(nkVar32.e(okVar2).q());
                                                    wsaVar32.a2.setResellPrice(nkVar32);
                                                    hs8 hs8Var = wsaVar32.i3;
                                                    if (hs8Var != null) {
                                                        hs8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    wsaVar32.j().Q(2131623990, 36, jb6.a0(null, null, 2131749961, wsaVar32.s1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (nkVar32.a == okVar2) {
                                                        z3 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z3;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(nkVar32.e(okVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(nkVar32.e(okVar2).q());
                                                    wsaVar32.a2.setResellPrice(nkVar32);
                                                    hs8 hs8Var2 = wsaVar32.i3;
                                                    if (hs8Var2 != null) {
                                                        hs8Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null) {
                                    if (tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        gm.c3(new hq6(wsaVar22, Long.parseLong(tL_error.text.substring(26)), runnable22, (byte) 25));
                                        return;
                                    } else {
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b = r4;
                                                Runnable runnable32 = runnable22;
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                wsa wsaVar32 = wsaVar22;
                                                switch (b) {
                                                    case 0:
                                                        wsaVar32.j().g0(tL_error2, false);
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        wsaVar32.j().g0(tL_error2, false);
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            default:
                                boolean z2 = tLObject instanceof TLRPC.Updates;
                                final wsa wsaVar32 = wsaVar3;
                                final Runnable runnable3 = runnable2;
                                if (z2) {
                                    oc7.r1(wsaVar32.a).T3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final nk nkVar3 = nkVar2;
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z22;
                                            byte b = r5;
                                            ok okVar = ok.a;
                                            ok okVar2 = ok.b;
                                            Runnable runnable32 = runnable3;
                                            nk nkVar32 = nkVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            wsa wsaVar322 = wsaVar32;
                                            boolean z3 = false;
                                            switch (b) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (nkVar32.a == okVar2) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z22;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(nkVar32.e(okVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(nkVar32.e(okVar2).q());
                                                    wsaVar322.a2.setResellPrice(nkVar32);
                                                    hs8 hs8Var = wsaVar322.i3;
                                                    if (hs8Var != null) {
                                                        hs8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    wsaVar322.j().Q(2131623990, 36, jb6.a0(null, null, 2131749961, wsaVar322.s1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (nkVar32.a == okVar2) {
                                                        z3 = true;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z3;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(nkVar32.e(okVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(nkVar32.e(okVar2).q());
                                                    wsaVar322.a2.setResellPrice(nkVar32);
                                                    hs8 hs8Var2 = wsaVar322.i3;
                                                    if (hs8Var2 != null) {
                                                        hs8Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null) {
                                    gm.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Runnable runnable32 = runnable3;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            wsa wsaVar322 = wsaVar32;
                                            switch (b) {
                                                case 0:
                                                    wsaVar322.j().g0(tL_error2, false);
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    wsaVar322.j().g0(tL_error2, false);
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
