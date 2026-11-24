package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class voa implements i8c {
    public final byte a;
    public final vqa b;
    public final TL_stars.TL_starGiftUnique c;

    public voa(vqa vqaVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = tL_starGiftUnique;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_stars.StarGift starGift;
        switch (this.a) {
            case 0:
                final nj njVar = (nj) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount q = njVar.q();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final vqa vqaVar = this.b;
                updatestargiftprice.stargift = vqaVar.u1();
                updatestargiftprice.resell_amount = q;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(vqaVar.a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z = tLObject instanceof TLRPC.Updates;
                                final vqa vqaVar2 = vqaVar;
                                final Runnable runnable2 = runnable;
                                if (z) {
                                    na7.q1(vqaVar2.a).R3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final nj njVar2 = njVar;
                                    gl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z2;
                                            byte b = r5;
                                            oj ojVar = oj.a;
                                            oj ojVar2 = oj.b;
                                            Runnable runnable3 = runnable2;
                                            nj njVar3 = njVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            vqa vqaVar3 = vqaVar2;
                                            boolean z3 = false;
                                            switch (b) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (njVar3.a == ojVar2) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(njVar3.e(ojVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(njVar3.e(ojVar2).q());
                                                    vqaVar3.a2.setResellPrice(njVar3);
                                                    eq8 eq8Var = vqaVar3.i3;
                                                    if (eq8Var != null) {
                                                        eq8Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    vqaVar3.j().Q(2131623990, 36, k96.a0(null, null, 2131750012, vqaVar3.s1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    if (njVar3.a == ojVar2) {
                                                        z3 = true;
                                                    }
                                                    tL_starGiftUnique3.resale_ton_only = z3;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(njVar3.e(ojVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(njVar3.e(ojVar2).q());
                                                    vqaVar3.a2.setResellPrice(njVar3);
                                                    eq8 eq8Var2 = vqaVar3.i3;
                                                    if (eq8Var2 != null) {
                                                        eq8Var2.run();
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
                                        gl.c3(new go6(vqaVar2, Long.parseLong(tL_error.text.substring(26)), runnable2, (byte) 25));
                                        return;
                                    } else {
                                        gl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b = r4;
                                                Runnable runnable3 = runnable2;
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                vqa vqaVar3 = vqaVar2;
                                                switch (b) {
                                                    case 0:
                                                        vqaVar3.j().g0(tL_error2, false);
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        vqaVar3.j().g0(tL_error2, false);
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
                                final vqa vqaVar3 = vqaVar;
                                final Runnable runnable3 = runnable;
                                if (z2) {
                                    na7.q1(vqaVar3.a).R3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final nj njVar3 = njVar;
                                    gl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z22;
                                            byte b = r5;
                                            oj ojVar = oj.a;
                                            oj ojVar2 = oj.b;
                                            Runnable runnable32 = runnable3;
                                            nj njVar32 = njVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            vqa vqaVar32 = vqaVar3;
                                            boolean z3 = false;
                                            switch (b) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (njVar32.a == ojVar2) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z22;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(njVar32.e(ojVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(njVar32.e(ojVar2).q());
                                                    vqaVar32.a2.setResellPrice(njVar32);
                                                    eq8 eq8Var = vqaVar32.i3;
                                                    if (eq8Var != null) {
                                                        eq8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    vqaVar32.j().Q(2131623990, 36, k96.a0(null, null, 2131750012, vqaVar32.s1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (njVar32.a == ojVar2) {
                                                        z3 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z3;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(njVar32.e(ojVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(njVar32.e(ojVar2).q());
                                                    vqaVar32.a2.setResellPrice(njVar32);
                                                    eq8 eq8Var2 = vqaVar32.i3;
                                                    if (eq8Var2 != null) {
                                                        eq8Var2.run();
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
                                    gl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Runnable runnable32 = runnable3;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            vqa vqaVar32 = vqaVar3;
                                            switch (b) {
                                                case 0:
                                                    vqaVar32.j().g0(tL_error2, false);
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    vqaVar32.j().g0(tL_error2, false);
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
                p8c p8cVar = (p8c) obj;
                Boolean bool = (Boolean) obj2;
                vqa vqaVar2 = this.b;
                x99 x99Var = vqaVar2.R2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                if (x99Var == null) {
                    x99 x99Var2 = new x99(vqaVar2.a, tL_starGiftUnique2.gift_id);
                    vqaVar2.R2 = x99Var2;
                    x99Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i = 0;
                while (true) {
                    spa[] spaVarArr = vqaVar2.a2.N.n;
                    if (i < spaVarArr.length) {
                        TL_stars.StarGift starGift2 = spaVarArr[i].h;
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
                        y99 y99Var = new y99(vqaVar2.getContext(), tL_starGiftUnique2.title, vqaVar2.R2);
                        y99Var.b2.addAll(hashSet);
                        y99Var.d2.O(true);
                        y99Var.c2 = bool.booleanValue();
                        y99Var.Z1.set(gl.S2(k96.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        y99Var.a2 = new w52(p8cVar, (byte) 4);
                        y99Var.show();
                        return;
                    }
                }
            default:
                final nj njVar2 = (nj) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount q2 = njVar2.q();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final vqa vqaVar3 = this.b;
                updatestargiftprice2.stargift = vqaVar3.u1();
                updatestargiftprice2.resell_amount = q2;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(vqaVar3.a);
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                boolean z = tLObject instanceof TLRPC.Updates;
                                final vqa vqaVar22 = vqaVar3;
                                final Runnable runnable22 = runnable2;
                                if (z) {
                                    na7.q1(vqaVar22.a).R3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final nj njVar22 = njVar2;
                                    gl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z22;
                                            byte b = r5;
                                            oj ojVar = oj.a;
                                            oj ojVar2 = oj.b;
                                            Runnable runnable32 = runnable22;
                                            nj njVar32 = njVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            vqa vqaVar32 = vqaVar22;
                                            boolean z3 = false;
                                            switch (b) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (njVar32.a == ojVar2) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z22;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(njVar32.e(ojVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(njVar32.e(ojVar2).q());
                                                    vqaVar32.a2.setResellPrice(njVar32);
                                                    eq8 eq8Var = vqaVar32.i3;
                                                    if (eq8Var != null) {
                                                        eq8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    vqaVar32.j().Q(2131623990, 36, k96.a0(null, null, 2131750012, vqaVar32.s1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    if (njVar32.a == ojVar2) {
                                                        z3 = true;
                                                    }
                                                    tL_starGiftUnique32.resale_ton_only = z3;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(njVar32.e(ojVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(njVar32.e(ojVar2).q());
                                                    vqaVar32.a2.setResellPrice(njVar32);
                                                    eq8 eq8Var2 = vqaVar32.i3;
                                                    if (eq8Var2 != null) {
                                                        eq8Var2.run();
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
                                        gl.c3(new go6(vqaVar22, Long.parseLong(tL_error.text.substring(26)), runnable22, (byte) 25));
                                        return;
                                    } else {
                                        gl.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b = r4;
                                                Runnable runnable32 = runnable22;
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                vqa vqaVar32 = vqaVar22;
                                                switch (b) {
                                                    case 0:
                                                        vqaVar32.j().g0(tL_error2, false);
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        vqaVar32.j().g0(tL_error2, false);
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
                                final vqa vqaVar32 = vqaVar3;
                                final Runnable runnable3 = runnable2;
                                if (z2) {
                                    na7.q1(vqaVar32.a).R3((TLRPC.Updates) tLObject, false);
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final nj njVar3 = njVar2;
                                    gl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            boolean z22;
                                            byte b = r5;
                                            oj ojVar = oj.a;
                                            oj ojVar2 = oj.b;
                                            Runnable runnable32 = runnable3;
                                            nj njVar32 = njVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            vqa vqaVar322 = vqaVar32;
                                            boolean z3 = false;
                                            switch (b) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (njVar32.a == ojVar2) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z22;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(njVar32.e(ojVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(njVar32.e(ojVar2).q());
                                                    vqaVar322.a2.setResellPrice(njVar32);
                                                    eq8 eq8Var = vqaVar322.i3;
                                                    if (eq8Var != null) {
                                                        eq8Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    vqaVar322.j().Q(2131623990, 36, k96.a0(null, null, 2131750012, vqaVar322.s1())).j();
                                                    return;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    if (njVar32.a == ojVar2) {
                                                        z3 = true;
                                                    }
                                                    tL_starGiftUnique322.resale_ton_only = z3;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(njVar32.e(ojVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(njVar32.e(ojVar2).q());
                                                    vqaVar322.a2.setResellPrice(njVar32);
                                                    eq8 eq8Var2 = vqaVar322.i3;
                                                    if (eq8Var2 != null) {
                                                        eq8Var2.run();
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
                                    gl.c3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Runnable runnable32 = runnable3;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            vqa vqaVar322 = vqaVar32;
                                            switch (b) {
                                                case 0:
                                                    vqaVar322.j().g0(tL_error2, false);
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    vqaVar322.j().g0(tL_error2, false);
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
