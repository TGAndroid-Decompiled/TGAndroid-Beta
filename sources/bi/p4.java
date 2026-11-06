package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p4 implements v10 {
    public final int f4508a;
    public final k7 f4509b;
    public final TL_stars.TL_starGiftUnique f4510c;

    public p4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.f4508a = i7;
        this.f4509b = k7Var;
        this.f4510c = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        switch (this.f4508a) {
            case 0:
                final cg.a aVar = (cg.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount o4 = aVar.o();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final k7 k7Var = this.f4509b;
                updatestargiftprice.stargift = k7Var.B1();
                updatestargiftprice.resell_amount = o4;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k7Var.f28612a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f4510c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z9 = tLObject instanceof TLRPC.Updates;
                                final k7 k7Var2 = k7Var;
                                final Runnable runnable2 = runnable;
                                if (z9) {
                                    qp.s1(k7Var2.f28612a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final cg.a aVar2 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z10;
                                            int i7 = r5;
                                            cg.b bVar = cg.b.f6162a;
                                            cg.b bVar2 = cg.b.f6163b;
                                            Runnable runnable3 = runnable2;
                                            cg.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            k7 k7Var3 = k7Var2;
                                            boolean z11 = false;
                                            switch (i7) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f6160a == bVar2) {
                                                        z11 = true;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z11;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    k7Var3.X1.setResellPrice(aVar3);
                                                    zh.q1 q1Var = k7Var3.f4169c3;
                                                    if (q1Var != null) {
                                                        q1Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (aVar3.f6160a == bVar2) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z10;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    k7Var3.X1.setResellPrice(aVar3);
                                                    zh.q1 q1Var2 = k7Var3.f4169c3;
                                                    if (q1Var2 != null) {
                                                        q1Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    k7Var3.k().Q(2131623989, 36, org.telegram.messenger.hd.a0(null, null, 2131750027, k7Var3.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.g0.h3(new d3(k7Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 1));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    k7Var2.k().f0(tL_error, false);
                                                    Runnable runnable3 = runnable2;
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    k7Var2.k().f0(tL_error, false);
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
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final k7 k7Var3 = k7Var;
                                final Runnable runnable3 = runnable;
                                if (z10) {
                                    qp.s1(k7Var3.f28612a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final cg.a aVar3 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z102;
                                            int i7 = r5;
                                            cg.b bVar = cg.b.f6162a;
                                            cg.b bVar2 = cg.b.f6163b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            k7 k7Var32 = k7Var3;
                                            boolean z11 = false;
                                            switch (i7) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f6160a == bVar2) {
                                                        z11 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z11;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var32.X1.setResellPrice(aVar32);
                                                    zh.q1 q1Var = k7Var32.f4169c3;
                                                    if (q1Var != null) {
                                                        q1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f6160a == bVar2) {
                                                        z102 = true;
                                                    } else {
                                                        z102 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z102;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var32.X1.setResellPrice(aVar32);
                                                    zh.q1 q1Var2 = k7Var32.f4169c3;
                                                    if (q1Var2 != null) {
                                                        q1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    k7Var32.k().Q(2131623989, 36, org.telegram.messenger.hd.a0(null, null, 2131750027, k7Var32.z1())).j();
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
                                                    k7Var3.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    k7Var3.k().f0(tL_error, false);
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
                c20 c20Var = (c20) obj;
                Boolean bool = (Boolean) obj2;
                k7 k7Var2 = this.f4509b;
                zh.k3 k3Var = k7Var2.O2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f4510c;
                if (k3Var == null) {
                    zh.k3 k3Var2 = new zh.k3(k7Var2.f28612a, tL_starGiftUnique2.gift_id);
                    k7Var2.O2 = k3Var2;
                    k3Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i7 = 0;
                while (true) {
                    b6[] b6VarArr = k7Var2.X1.M.f3671n;
                    if (i7 < b6VarArr.length) {
                        TL_stars.StarGift starGift2 = b6VarArr[i7].h;
                        if (starGift2 != null) {
                            starGift = starGift2;
                        } else {
                            starGift = null;
                        }
                        if (starGift != null) {
                            if (starGift2 == null) {
                                starGift2 = null;
                            }
                            hashSet.add(Long.valueOf(starGift2.f27181id));
                        }
                        i7++;
                    } else {
                        zh.l3 l3Var = new zh.l3(k7Var2.getContext(), tL_starGiftUnique2.title, k7Var2.O2);
                        l3Var.Y1.addAll(hashSet);
                        l3Var.f60340a2.O(true);
                        l3Var.Z1 = bool.booleanValue();
                        l3Var.W1.set(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        l3Var.X1 = new n2(c20Var, 0);
                        l3Var.show();
                        return;
                    }
                }
            default:
                final cg.a aVar2 = (cg.a) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount o10 = aVar2.o();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final k7 k7Var3 = this.f4509b;
                updatestargiftprice2.stargift = k7Var3.B1();
                updatestargiftprice2.resell_amount = o10;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(k7Var3.f28612a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.f4510c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z9 = tLObject instanceof TLRPC.Updates;
                                final k7 k7Var22 = k7Var3;
                                final Runnable runnable22 = runnable2;
                                if (z9) {
                                    qp.s1(k7Var22.f28612a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final cg.a aVar22 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z102;
                                            int i72 = r5;
                                            cg.b bVar = cg.b.f6162a;
                                            cg.b bVar2 = cg.b.f6163b;
                                            Runnable runnable32 = runnable22;
                                            cg.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            k7 k7Var32 = k7Var22;
                                            boolean z11 = false;
                                            switch (i72) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f6160a == bVar2) {
                                                        z11 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z11;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var32.X1.setResellPrice(aVar32);
                                                    zh.q1 q1Var = k7Var32.f4169c3;
                                                    if (q1Var != null) {
                                                        q1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (aVar32.f6160a == bVar2) {
                                                        z102 = true;
                                                    } else {
                                                        z102 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z102;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var32.X1.setResellPrice(aVar32);
                                                    zh.q1 q1Var2 = k7Var32.f4169c3;
                                                    if (q1Var2 != null) {
                                                        q1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    k7Var32.k().Q(2131623989, 36, org.telegram.messenger.hd.a0(null, null, 2131750027, k7Var32.z1())).j();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                    org.telegram.messenger.g0.h3(new d3(k7Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 1));
                                    return;
                                } else if (tL_error != null) {
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    k7Var22.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable22;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    k7Var22.k().f0(tL_error, false);
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
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final k7 k7Var32 = k7Var3;
                                final Runnable runnable3 = runnable2;
                                if (z10) {
                                    qp.s1(k7Var32.f28612a).O3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final cg.a aVar3 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z102;
                                            int i72 = r5;
                                            cg.b bVar = cg.b.f6162a;
                                            cg.b bVar2 = cg.b.f6163b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            k7 k7Var322 = k7Var32;
                                            boolean z11 = false;
                                            switch (i72) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f6160a == bVar2) {
                                                        z11 = true;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z11;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var322.X1.setResellPrice(aVar32);
                                                    zh.q1 q1Var = k7Var322.f4169c3;
                                                    if (q1Var != null) {
                                                        q1Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (aVar32.f6160a == bVar2) {
                                                        z102 = true;
                                                    } else {
                                                        z102 = false;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z102;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var322.X1.setResellPrice(aVar32);
                                                    zh.q1 q1Var2 = k7Var322.f4169c3;
                                                    if (q1Var2 != null) {
                                                        q1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    k7Var322.k().Q(2131623989, 36, org.telegram.messenger.hd.a0(null, null, 2131750027, k7Var322.z1())).j();
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
                                                    k7Var32.k().f0(tL_error, false);
                                                    Runnable runnable32 = runnable3;
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    k7Var32.k().f0(tL_error, false);
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
