package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh implements RequestDelegate {
    public final int f15707a;
    public final ui f15708b;

    public gh(ui uiVar, int i10) {
        this.f15707a = i10;
        this.f15708b = uiVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15707a) {
            case 0:
                ui uiVar = this.f15708b;
                if (tL_error != null) {
                    i0.g3(new eg(uiVar, 10));
                    return;
                }
                uiVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                i0.g3(new eg(uiVar, 11));
                return;
            case 1:
                final ui uiVar2 = this.f15708b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        ui uiVar3 = uiVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar4 = uiVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar4.getUserConfig().f15155d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar4.getUserConfig().f15160h0 = System.currentTimeMillis();
                                    uiVar4.getUserConfig().v(false);
                                    uiVar4.s1(uiVar4.getUserConfig().f15155d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (uiVar4.currentAccount == d20.f15147s0) {
                                            uiVar4.l1(ic.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar3.getMessagesStorage().f15938a.c(new eg(uiVar3, 12));
                                    uiVar3.f18318f0[0].clear();
                                    zs.f(uiVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().f15156e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().f15161i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().f15156e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar2;
                                    uiVar6.getUserConfig().f15152b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f15158f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().f15152b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                uiVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar3.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar3.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar2;
                                    uiVar7.getUserConfig().f15154c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f15159g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f15154c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                i0.g3(new mg(this.f15708b, tL_error, tLObject, 0));
                return;
            case 3:
                final ui uiVar3 = this.f15708b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        ui uiVar32 = uiVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar4 = uiVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar4.getUserConfig().f15155d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar4.getUserConfig().f15160h0 = System.currentTimeMillis();
                                    uiVar4.getUserConfig().v(false);
                                    uiVar4.s1(uiVar4.getUserConfig().f15155d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (uiVar4.currentAccount == d20.f15147s0) {
                                            uiVar4.l1(ic.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f15938a.c(new eg(uiVar32, 12));
                                    uiVar32.f18318f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().f15156e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().f15161i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().f15156e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar3;
                                    uiVar6.getUserConfig().f15152b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f15158f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().f15152b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar3;
                                    uiVar7.getUserConfig().f15154c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f15159g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f15154c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                final ui uiVar4 = this.f15708b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        ui uiVar32 = uiVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().f15155d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().f15160h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().f15155d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (uiVar42.currentAccount == d20.f15147s0) {
                                            uiVar42.l1(ic.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f15938a.c(new eg(uiVar32, 12));
                                    uiVar32.f18318f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().f15156e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().f15161i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().f15156e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar4;
                                    uiVar6.getUserConfig().f15152b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f15158f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().f15152b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar4;
                                    uiVar7.getUserConfig().f15154c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f15159g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f15154c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                final ui uiVar5 = this.f15708b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        ui uiVar32 = uiVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().f15155d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().f15160h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().f15155d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (uiVar42.currentAccount == d20.f15147s0) {
                                            uiVar42.l1(ic.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f15938a.c(new eg(uiVar32, 12));
                                    uiVar32.f18318f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().f15156e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().f15161i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().f15156e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar5;
                                    uiVar6.getUserConfig().f15152b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f15158f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().f15152b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar5;
                                    uiVar7.getUserConfig().f15154c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f15159g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f15154c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 6:
                if (tLObject != null) {
                    i0.g3(new ag(this.f15708b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    return;
                }
                return;
            case 7:
                final ui uiVar6 = this.f15708b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        ui uiVar32 = uiVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().f15155d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().f15160h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().f15155d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (uiVar42.currentAccount == d20.f15147s0) {
                                            uiVar42.l1(ic.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f15938a.c(new eg(uiVar32, 12));
                                    uiVar32.f18318f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().f15156e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().f15161i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().f15156e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar62 = uiVar6;
                                    uiVar62.getUserConfig().f15152b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar62.getUserConfig().f15158f0 = System.currentTimeMillis();
                                    uiVar62.getUserConfig().v(false);
                                    uiVar62.s1(uiVar62.getUserConfig().f15152b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar62.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar6;
                                    uiVar7.getUserConfig().f15154c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f15159g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f15154c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 8:
                final ui uiVar7 = this.f15708b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        ui uiVar32 = uiVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().f15155d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().f15160h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().f15155d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (uiVar42.currentAccount == d20.f15147s0) {
                                            uiVar42.l1(ic.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f15938a.c(new eg(uiVar32, 12));
                                    uiVar32.f18318f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().f15156e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().f15161i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().f15156e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar62 = uiVar7;
                                    uiVar62.getUserConfig().f15152b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar62.getUserConfig().f15158f0 = System.currentTimeMillis();
                                    uiVar62.getUserConfig().v(false);
                                    uiVar62.s1(uiVar62.getUserConfig().f15152b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar62.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar72 = uiVar7;
                                    uiVar72.getUserConfig().f15154c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar72.getUserConfig().f15159g0 = System.currentTimeMillis();
                                    uiVar72.getUserConfig().v(false);
                                    uiVar72.s1(uiVar72.getUserConfig().f15154c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar72.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ui uiVar8 = this.f15708b;
                uiVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    uiVar8.w1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    return;
                }
                return;
        }
    }
}
