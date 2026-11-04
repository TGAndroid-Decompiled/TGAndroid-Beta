package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z3 implements n10 {
    public final int f6449a;
    public final l6 f6450b;
    public final TL_stars.TL_starGiftUnique f6451c;

    public z3(l6 l6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i3) {
        this.f6449a = i3;
        this.f6450b = l6Var;
        this.f6451c = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        switch (this.f6449a) {
            case 0:
                final dg.a aVar = (dg.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount o10 = aVar.o();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final l6 l6Var = this.f6450b;
                updatestargiftprice.stargift = l6Var.B1();
                updatestargiftprice.resell_amount = o10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(l6Var.f28583a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f6451c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final l6 l6Var2 = l6Var;
                                final Runnable runnable2 = runnable;
                                if (z10) {
                                    hp.s1(l6Var2.f28583a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final dg.a aVar2 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z11;
                                            int i3 = r5;
                                            dg.b bVar = dg.b.f8925a;
                                            dg.b bVar2 = dg.b.f8926b;
                                            Runnable runnable3 = runnable2;
                                            dg.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            l6 l6Var3 = l6Var2;
                                            boolean z12 = false;
                                            switch (i3) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f8923a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    l6Var3.Y1.setResellPrice(aVar3);
                                                    ai.a4 a4Var = l6Var3.f5452d3;
                                                    if (a4Var != null) {
                                                        a4Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f8923a == bVar2) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z11;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    l6Var3.Y1.setResellPrice(aVar3);
                                                    ai.a4 a4Var2 = l6Var3.f5452d3;
                                                    if (a4Var2 != null) {
                                                        a4Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    l6Var3.k().Q(2131623989, 36, bd.a0(null, null, 2131750036, l6Var3.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.g0.h3(new ai.r1(l6Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 3));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    l6Var2.k().f0(tL_error, false);
                                                    Runnable runnable3 = runnable2;
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    l6Var2.k().f0(tL_error, false);
                                                    Runnable runnable4 = runnable2;
                                                    if (runnable4 != null) {
                                                        runnable4.run();
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
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final l6 l6Var3 = l6Var;
                                final Runnable runnable3 = runnable;
                                if (z11) {
                                    hp.s1(l6Var3.f28583a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final dg.a aVar3 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i3 = r5;
                                            dg.b bVar = dg.b.f8925a;
                                            dg.b bVar2 = dg.b.f8926b;
                                            Runnable runnable32 = runnable3;
                                            dg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            l6 l6Var32 = l6Var3;
                                            boolean z12 = false;
                                            switch (i3) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f8923a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var32.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var = l6Var32.f5452d3;
                                                    if (a4Var != null) {
                                                        a4Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f8923a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var32.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var2 = l6Var32.f5452d3;
                                                    if (a4Var2 != null) {
                                                        a4Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    l6Var32.k().Q(2131623989, 36, bd.a0(null, null, 2131750036, l6Var32.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    l6Var3.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    l6Var3.k().f0(tL_error, false);
                                                    Runnable runnable4 = runnable3;
                                                    if (runnable4 != null) {
                                                        runnable4.run();
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
                u10 u10Var = (u10) obj;
                Boolean bool = (Boolean) obj2;
                l6 l6Var2 = this.f6450b;
                ai.g6 g6Var = l6Var2.P2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f6451c;
                if (g6Var == null) {
                    ai.g6 g6Var2 = new ai.g6(l6Var2.f28583a, tL_starGiftUnique2.gift_id);
                    l6Var2.P2 = g6Var2;
                    g6Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i3 = 0;
                while (true) {
                    f5[] f5VarArr = l6Var2.Y1.N.f5234n;
                    if (i3 < f5VarArr.length) {
                        TL_stars.StarGift starGift2 = f5VarArr[i3].h;
                        if (starGift2 != null) {
                            starGift = starGift2;
                        } else {
                            starGift = null;
                        }
                        if (starGift != null) {
                            if (starGift2 == null) {
                                starGift2 = null;
                            }
                            hashSet.add(Long.valueOf(starGift2.f27230id));
                        }
                        i3++;
                    } else {
                        ai.h6 h6Var = new ai.h6(l6Var2.getContext(), tL_starGiftUnique2.title, l6Var2.P2);
                        h6Var.Z1.addAll(hashSet);
                        h6Var.f684b2.O(true);
                        h6Var.f683a2 = bool.booleanValue();
                        h6Var.X1.set(org.telegram.messenger.g0.X2(bd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        h6Var.Y1 = new e2(u10Var, 0);
                        h6Var.show();
                        return;
                    }
                }
            default:
                final dg.a aVar2 = (dg.a) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount o11 = aVar2.o();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final l6 l6Var3 = this.f6450b;
                updatestargiftprice2.stargift = l6Var3.B1();
                updatestargiftprice2.resell_amount = o11;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(l6Var3.f28583a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.f6451c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final l6 l6Var22 = l6Var3;
                                final Runnable runnable22 = runnable2;
                                if (z10) {
                                    hp.s1(l6Var22.f28583a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final dg.a aVar22 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i32 = r5;
                                            dg.b bVar = dg.b.f8925a;
                                            dg.b bVar2 = dg.b.f8926b;
                                            Runnable runnable32 = runnable22;
                                            dg.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            l6 l6Var32 = l6Var22;
                                            boolean z12 = false;
                                            switch (i32) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f8923a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var32.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var = l6Var32.f5452d3;
                                                    if (a4Var != null) {
                                                        a4Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f8923a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var32.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var2 = l6Var32.f5452d3;
                                                    if (a4Var2 != null) {
                                                        a4Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    l6Var32.k().Q(2131623989, 36, bd.a0(null, null, 2131750036, l6Var32.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.g0.h3(new ai.r1(l6Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 3));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    l6Var22.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable22;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    l6Var22.k().f0(tL_error, false);
                                                    Runnable runnable4 = runnable22;
                                                    if (runnable4 != null) {
                                                        runnable4.run();
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
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final l6 l6Var32 = l6Var3;
                                final Runnable runnable3 = runnable2;
                                if (z11) {
                                    hp.s1(l6Var32.f28583a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final dg.a aVar3 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i32 = r5;
                                            dg.b bVar = dg.b.f8925a;
                                            dg.b bVar2 = dg.b.f8926b;
                                            Runnable runnable32 = runnable3;
                                            dg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            l6 l6Var322 = l6Var32;
                                            boolean z12 = false;
                                            switch (i32) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f8923a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var322.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var = l6Var322.f5452d3;
                                                    if (a4Var != null) {
                                                        a4Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f8923a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var322.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var2 = l6Var322.f5452d3;
                                                    if (a4Var2 != null) {
                                                        a4Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    l6Var322.k().Q(2131623989, 36, bd.a0(null, null, 2131750036, l6Var322.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    l6Var32.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    l6Var32.k().f0(tL_error, false);
                                                    Runnable runnable4 = runnable3;
                                                    if (runnable4 != null) {
                                                        runnable4.run();
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
