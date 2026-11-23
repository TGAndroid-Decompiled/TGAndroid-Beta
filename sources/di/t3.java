package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t3 implements p10 {
    public final int f9780a;
    public final f6 f9781b;
    public final TL_stars.TL_starGiftUnique f9782c;

    public t3(f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f9780a = i7;
        this.f9781b = f6Var;
        this.f9782c = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        switch (this.f9780a) {
            case 0:
                final cg.a aVar = (cg.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount q10 = aVar.q();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final f6 f6Var = this.f9781b;
                updatestargiftprice.stargift = f6Var.G1();
                updatestargiftprice.resell_amount = q10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f6Var.f30223a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f9782c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final f6 f6Var2 = f6Var;
                                final Runnable runnable2 = runnable;
                                if (z10) {
                                    mp.u1(f6Var2.f30223a).V3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final cg.a aVar2 = aVar;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z11;
                                            int i7 = r5;
                                            cg.b bVar = cg.b.f5268a;
                                            cg.b bVar2 = cg.b.f5269b;
                                            Runnable runnable3 = runnable2;
                                            cg.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            f6 f6Var3 = f6Var2;
                                            boolean z12 = false;
                                            switch (i7) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f5266a == bVar2) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z11;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).q());
                                                    f6Var3.f8758b2.setResellPrice(aVar3);
                                                    bi.b6 b6Var = f6Var3.j3;
                                                    if (b6Var != null) {
                                                        b6Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    f6Var3.k().Q(2131623990, 36, gd.a0(null, null, 2131750011, f6Var3.E1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f5266a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(aVar3.e(bVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).q());
                                                    f6Var3.f8758b2.setResellPrice(aVar3);
                                                    bi.b6 b6Var2 = f6Var3.j3;
                                                    if (b6Var2 != null) {
                                                        b6Var2.run();
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
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.g0.g3(new bi.s2(f6Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 2));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    f6Var2.k().g0(tL_error, false);
                                                    Runnable runnable3 = runnable2;
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    f6Var2.k().g0(tL_error, false);
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
                                final f6 f6Var3 = f6Var;
                                final Runnable runnable3 = runnable;
                                if (z11) {
                                    mp.u1(f6Var3.f30223a).V3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final cg.a aVar3 = aVar;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i7 = r5;
                                            cg.b bVar = cg.b.f5268a;
                                            cg.b bVar2 = cg.b.f5269b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            f6 f6Var32 = f6Var3;
                                            boolean z12 = false;
                                            switch (i7) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f5266a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var32.f8758b2.setResellPrice(aVar32);
                                                    bi.b6 b6Var = f6Var32.j3;
                                                    if (b6Var != null) {
                                                        b6Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    f6Var32.k().Q(2131623990, 36, gd.a0(null, null, 2131750011, f6Var32.E1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f5266a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var32.f8758b2.setResellPrice(aVar32);
                                                    bi.b6 b6Var2 = f6Var32.j3;
                                                    if (b6Var2 != null) {
                                                        b6Var2.run();
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
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    f6Var3.k().g0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    f6Var3.k().g0(tL_error, false);
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
                w10 w10Var = (w10) obj;
                Boolean bool = (Boolean) obj2;
                f6 f6Var2 = this.f9781b;
                bi.k8 k8Var = f6Var2.S2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f9782c;
                if (k8Var == null) {
                    bi.k8 k8Var2 = new bi.k8(f6Var2.f30223a, tL_starGiftUnique2.gift_id);
                    f6Var2.S2 = k8Var2;
                    k8Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i7 = 0;
                while (true) {
                    z4[] z4VarArr = f6Var2.f8758b2.N.f8537n;
                    if (i7 < z4VarArr.length) {
                        TL_stars.StarGift starGift2 = z4VarArr[i7].h;
                        if (starGift2 != null) {
                            starGift = starGift2;
                        } else {
                            starGift = null;
                        }
                        if (starGift != null) {
                            if (starGift2 == null) {
                                starGift2 = null;
                            }
                            hashSet.add(Long.valueOf(starGift2.f28721id));
                        }
                        i7++;
                    } else {
                        bi.l8 l8Var = new bi.l8(f6Var2.getContext(), tL_starGiftUnique2.title, f6Var2.S2);
                        l8Var.f3812c2.addAll(hashSet);
                        l8Var.f3813e2.O(true);
                        l8Var.d2 = bool.booleanValue();
                        l8Var.f3810a2.set(org.telegram.messenger.g0.W2(gd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        l8Var.f3811b2 = new c2(w10Var, 0);
                        l8Var.show();
                        return;
                    }
                }
            default:
                final cg.a aVar2 = (cg.a) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount q11 = aVar2.q();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final f6 f6Var3 = this.f9781b;
                updatestargiftprice2.stargift = f6Var3.G1();
                updatestargiftprice2.resell_amount = q11;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(f6Var3.f30223a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.f9782c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final f6 f6Var22 = f6Var3;
                                final Runnable runnable22 = runnable2;
                                if (z10) {
                                    mp.u1(f6Var22.f30223a).V3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final cg.a aVar22 = aVar2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i72 = r5;
                                            cg.b bVar = cg.b.f5268a;
                                            cg.b bVar2 = cg.b.f5269b;
                                            Runnable runnable32 = runnable22;
                                            cg.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            f6 f6Var32 = f6Var22;
                                            boolean z12 = false;
                                            switch (i72) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f5266a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var32.f8758b2.setResellPrice(aVar32);
                                                    bi.b6 b6Var = f6Var32.j3;
                                                    if (b6Var != null) {
                                                        b6Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    f6Var32.k().Q(2131623990, 36, gd.a0(null, null, 2131750011, f6Var32.E1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f5266a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var32.f8758b2.setResellPrice(aVar32);
                                                    bi.b6 b6Var2 = f6Var32.j3;
                                                    if (b6Var2 != null) {
                                                        b6Var2.run();
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
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.g0.g3(new bi.s2(f6Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 2));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    f6Var22.k().g0(tL_error, false);
                                                    Runnable runnable32 = runnable22;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    f6Var22.k().g0(tL_error, false);
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
                                final f6 f6Var32 = f6Var3;
                                final Runnable runnable3 = runnable2;
                                if (z11) {
                                    mp.u1(f6Var32.f30223a).V3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final cg.a aVar3 = aVar2;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z112;
                                            int i72 = r5;
                                            cg.b bVar = cg.b.f5268a;
                                            cg.b bVar2 = cg.b.f5269b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            f6 f6Var322 = f6Var32;
                                            boolean z12 = false;
                                            switch (i72) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f5266a == bVar2) {
                                                        z112 = true;
                                                    } else {
                                                        z112 = false;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z112;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var322.f8758b2.setResellPrice(aVar32);
                                                    bi.b6 b6Var = f6Var322.j3;
                                                    if (b6Var != null) {
                                                        b6Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    f6Var322.k().Q(2131623990, 36, gd.a0(null, null, 2131750011, f6Var322.E1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f5266a == bVar2) {
                                                        z12 = true;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z12;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var322.f8758b2.setResellPrice(aVar32);
                                                    bi.b6 b6Var2 = f6Var322.j3;
                                                    if (b6Var2 != null) {
                                                        b6Var2.run();
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
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    f6Var32.k().g0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    f6Var32.k().g0(tL_error, false);
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
