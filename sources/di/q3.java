package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q3 implements s10 {
    public final int f9258a;
    public final c6 f9259b;
    public final TL_stars.TL_starGiftUnique f9260c;

    public q3(c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f9258a = i7;
        this.f9259b = c6Var;
        this.f9260c = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        switch (this.f9258a) {
            case 0:
                final cg.a aVar = (cg.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount o4 = aVar.o();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final c6 c6Var = this.f9259b;
                updatestargiftprice.stargift = c6Var.B1();
                updatestargiftprice.resell_amount = o4;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(c6Var.f29679a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f9260c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final c6 c6Var2 = c6Var;
                                final Runnable runnable2 = runnable;
                                if (z10) {
                                    np.s1(c6Var2.f29679a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final cg.a aVar2 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z11;
                                            int i7 = r5;
                                            cg.b bVar = cg.b.f4987a;
                                            cg.b bVar2 = cg.b.f4988b;
                                            Runnable runnable3 = runnable2;
                                            cg.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            c6 c6Var3 = c6Var2;
                                            boolean z12 = false;
                                            switch (i7) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f4985a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    c6Var3.f8309b2.setResellPrice(aVar3);
                                                    bi.o3 o3Var = c6Var3.f8319g3;
                                                    if (o3Var != null) {
                                                        o3Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f4985a == bVar2) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z11;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    c6Var3.f8309b2.setResellPrice(aVar3);
                                                    bi.o3 o3Var2 = c6Var3.f8319g3;
                                                    if (o3Var2 != null) {
                                                        o3Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    c6Var3.k().Q(2131623990, 36, hd.a0(null, null, 2131750028, c6Var3.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.g0.h3(new bi.m1(c6Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 3));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    c6Var2.k().f0(tL_error, false);
                                                    Runnable runnable3 = runnable2;
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    c6Var2.k().f0(tL_error, false);
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
                                final c6 c6Var3 = c6Var;
                                final Runnable runnable3 = runnable;
                                if (z11) {
                                    np.s1(c6Var3.f29679a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final cg.a aVar3 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i7 = r5;
                                            cg.b bVar = cg.b.f4987a;
                                            cg.b bVar2 = cg.b.f4988b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            c6 c6Var32 = c6Var3;
                                            boolean z12 = false;
                                            switch (i7) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f4985a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var32.f8309b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var = c6Var32.f8319g3;
                                                    if (o3Var != null) {
                                                        o3Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f4985a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var32.f8309b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var2 = c6Var32.f8319g3;
                                                    if (o3Var2 != null) {
                                                        o3Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    c6Var32.k().Q(2131623990, 36, hd.a0(null, null, 2131750028, c6Var32.z1())).j();
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
                                                    c6Var3.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    c6Var3.k().f0(tL_error, false);
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
                z10 z10Var = (z10) obj;
                Boolean bool = (Boolean) obj2;
                c6 c6Var2 = this.f9259b;
                bi.y5 y5Var = c6Var2.S2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f9260c;
                if (y5Var == null) {
                    bi.y5 y5Var2 = new bi.y5(c6Var2.f29679a, tL_starGiftUnique2.gift_id);
                    c6Var2.S2 = y5Var2;
                    y5Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i7 = 0;
                while (true) {
                    w4[] w4VarArr = c6Var2.f8309b2.N.f9786n;
                    if (i7 < w4VarArr.length) {
                        TL_stars.StarGift starGift2 = w4VarArr[i7].h;
                        if (starGift2 != null) {
                            starGift = starGift2;
                        } else {
                            starGift = null;
                        }
                        if (starGift != null) {
                            if (starGift2 == null) {
                                starGift2 = null;
                            }
                            hashSet.add(Long.valueOf(starGift2.f28280id));
                        }
                        i7++;
                    } else {
                        bi.z5 z5Var = new bi.z5(c6Var2.getContext(), tL_starGiftUnique2.title, c6Var2.S2);
                        z5Var.f4032c2.addAll(hashSet);
                        z5Var.f4033e2.O(true);
                        z5Var.d2 = bool.booleanValue();
                        z5Var.f4030a2.set(org.telegram.messenger.g0.X2(hd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        z5Var.f4031b2 = new y1(z10Var, 0);
                        z5Var.show();
                        return;
                    }
                }
            default:
                final cg.a aVar2 = (cg.a) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount o10 = aVar2.o();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final c6 c6Var3 = this.f9259b;
                updatestargiftprice2.stargift = c6Var3.B1();
                updatestargiftprice2.resell_amount = o10;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(c6Var3.f29679a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.f9260c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final c6 c6Var22 = c6Var3;
                                final Runnable runnable22 = runnable2;
                                if (z10) {
                                    np.s1(c6Var22.f29679a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final cg.a aVar22 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i72 = r5;
                                            cg.b bVar = cg.b.f4987a;
                                            cg.b bVar2 = cg.b.f4988b;
                                            Runnable runnable32 = runnable22;
                                            cg.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            c6 c6Var32 = c6Var22;
                                            boolean z12 = false;
                                            switch (i72) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f4985a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var32.f8309b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var = c6Var32.f8319g3;
                                                    if (o3Var != null) {
                                                        o3Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f4985a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var32.f8309b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var2 = c6Var32.f8319g3;
                                                    if (o3Var2 != null) {
                                                        o3Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    c6Var32.k().Q(2131623990, 36, hd.a0(null, null, 2131750028, c6Var32.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.g0.h3(new bi.m1(c6Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 3));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    c6Var22.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable22;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    c6Var22.k().f0(tL_error, false);
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
                                final c6 c6Var32 = c6Var3;
                                final Runnable runnable3 = runnable2;
                                if (z11) {
                                    np.s1(c6Var32.f29679a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final cg.a aVar3 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i72 = r5;
                                            cg.b bVar = cg.b.f4987a;
                                            cg.b bVar2 = cg.b.f4988b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            c6 c6Var322 = c6Var32;
                                            boolean z12 = false;
                                            switch (i72) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f4985a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var322.f8309b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var = c6Var322.f8319g3;
                                                    if (o3Var != null) {
                                                        o3Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f4985a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var322.f8309b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var2 = c6Var322.f8319g3;
                                                    if (o3Var2 != null) {
                                                        o3Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    c6Var322.k().Q(2131623990, 36, hd.a0(null, null, 2131750028, c6Var322.z1())).j();
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
                                                    c6Var32.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    c6Var32.k().f0(tL_error, false);
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
