package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements RequestDelegate {
    public final int f24871a;
    public final si f24872b;

    public jh(si siVar, int i7) {
        this.f24871a = i7;
        this.f24872b = siVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24871a) {
            case 0:
                si siVar = this.f24872b;
                if (tL_error != null) {
                    g0.g3(new fg(siVar, 11));
                    return;
                }
                siVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                g0.g3(new fg(siVar, 12));
                return;
            case 1:
                final si siVar2 = this.f24872b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        si siVar3 = siVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar4 = siVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar4.getUserConfig().f24978e0 = tL_messages_stickerSet.set.short_name;
                                    siVar4.getUserConfig().f24983i0 = System.currentTimeMillis();
                                    siVar4.getUserConfig().v(false);
                                    siVar4.v1(siVar4.getUserConfig().f24978e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (siVar4.currentAccount == k10.f24968t0) {
                                            siVar4.o1(gc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                siVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar3.getMessagesStorage().f27250a.c(new fg(siVar3, 13));
                                    siVar3.f26827g0[0].clear();
                                    ls.f(siVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar5 = siVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar5.getUserConfig().f24980f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar5.getUserConfig().f24984j0 = System.currentTimeMillis();
                                    siVar5.getUserConfig().v(false);
                                    siVar5.v1(siVar5.getUserConfig().f24980f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                siVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar6 = siVar2;
                                    siVar6.getUserConfig().f24975c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar6.getUserConfig().f24981g0 = System.currentTimeMillis();
                                    siVar6.getUserConfig().v(false);
                                    siVar6.v1(siVar6.getUserConfig().f24975c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar6.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                siVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar3.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar3.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar2;
                                    siVar7.getUserConfig().f24976d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().f24982h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.v1(siVar7.getUserConfig().f24976d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                g0.g3(new zf(this.f24872b, tL_error, tLObject, 0));
                return;
            case 3:
                final si siVar3 = this.f24872b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        si siVar32 = siVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar4 = siVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar4.getUserConfig().f24978e0 = tL_messages_stickerSet.set.short_name;
                                    siVar4.getUserConfig().f24983i0 = System.currentTimeMillis();
                                    siVar4.getUserConfig().v(false);
                                    siVar4.v1(siVar4.getUserConfig().f24978e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (siVar4.currentAccount == k10.f24968t0) {
                                            siVar4.o1(gc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                siVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().f27250a.c(new fg(siVar32, 13));
                                    siVar32.f26827g0[0].clear();
                                    ls.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar5 = siVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar5.getUserConfig().f24980f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar5.getUserConfig().f24984j0 = System.currentTimeMillis();
                                    siVar5.getUserConfig().v(false);
                                    siVar5.v1(siVar5.getUserConfig().f24980f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                siVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar6 = siVar3;
                                    siVar6.getUserConfig().f24975c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar6.getUserConfig().f24981g0 = System.currentTimeMillis();
                                    siVar6.getUserConfig().v(false);
                                    siVar6.v1(siVar6.getUserConfig().f24975c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar6.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar3;
                                    siVar7.getUserConfig().f24976d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().f24982h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.v1(siVar7.getUserConfig().f24976d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                final si siVar4 = this.f24872b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        si siVar32 = siVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar42 = siVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar42.getUserConfig().f24978e0 = tL_messages_stickerSet.set.short_name;
                                    siVar42.getUserConfig().f24983i0 = System.currentTimeMillis();
                                    siVar42.getUserConfig().v(false);
                                    siVar42.v1(siVar42.getUserConfig().f24978e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (siVar42.currentAccount == k10.f24968t0) {
                                            siVar42.o1(gc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                siVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().f27250a.c(new fg(siVar32, 13));
                                    siVar32.f26827g0[0].clear();
                                    ls.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar5 = siVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar5.getUserConfig().f24980f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar5.getUserConfig().f24984j0 = System.currentTimeMillis();
                                    siVar5.getUserConfig().v(false);
                                    siVar5.v1(siVar5.getUserConfig().f24980f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                siVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar6 = siVar4;
                                    siVar6.getUserConfig().f24975c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar6.getUserConfig().f24981g0 = System.currentTimeMillis();
                                    siVar6.getUserConfig().v(false);
                                    siVar6.v1(siVar6.getUserConfig().f24975c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar6.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar4;
                                    siVar7.getUserConfig().f24976d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().f24982h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.v1(siVar7.getUserConfig().f24976d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                final si siVar5 = this.f24872b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        si siVar32 = siVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar42 = siVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar42.getUserConfig().f24978e0 = tL_messages_stickerSet.set.short_name;
                                    siVar42.getUserConfig().f24983i0 = System.currentTimeMillis();
                                    siVar42.getUserConfig().v(false);
                                    siVar42.v1(siVar42.getUserConfig().f24978e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (siVar42.currentAccount == k10.f24968t0) {
                                            siVar42.o1(gc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                siVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().f27250a.c(new fg(siVar32, 13));
                                    siVar32.f26827g0[0].clear();
                                    ls.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar52 = siVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar52.getUserConfig().f24980f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar52.getUserConfig().f24984j0 = System.currentTimeMillis();
                                    siVar52.getUserConfig().v(false);
                                    siVar52.v1(siVar52.getUserConfig().f24980f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                siVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar6 = siVar5;
                                    siVar6.getUserConfig().f24975c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar6.getUserConfig().f24981g0 = System.currentTimeMillis();
                                    siVar6.getUserConfig().v(false);
                                    siVar6.v1(siVar6.getUserConfig().f24975c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar6.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar5;
                                    siVar7.getUserConfig().f24976d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().f24982h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.v1(siVar7.getUserConfig().f24976d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 6:
                if (tLObject != null) {
                    g0.g3(new dg(this.f24872b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    return;
                }
                return;
            case 7:
                final si siVar6 = this.f24872b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        si siVar32 = siVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar42 = siVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar42.getUserConfig().f24978e0 = tL_messages_stickerSet.set.short_name;
                                    siVar42.getUserConfig().f24983i0 = System.currentTimeMillis();
                                    siVar42.getUserConfig().v(false);
                                    siVar42.v1(siVar42.getUserConfig().f24978e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (siVar42.currentAccount == k10.f24968t0) {
                                            siVar42.o1(gc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                siVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().f27250a.c(new fg(siVar32, 13));
                                    siVar32.f26827g0[0].clear();
                                    ls.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar52 = siVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar52.getUserConfig().f24980f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar52.getUserConfig().f24984j0 = System.currentTimeMillis();
                                    siVar52.getUserConfig().v(false);
                                    siVar52.v1(siVar52.getUserConfig().f24980f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                siVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar62 = siVar6;
                                    siVar62.getUserConfig().f24975c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar62.getUserConfig().f24981g0 = System.currentTimeMillis();
                                    siVar62.getUserConfig().v(false);
                                    siVar62.v1(siVar62.getUserConfig().f24975c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar62.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar6;
                                    siVar7.getUserConfig().f24976d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().f24982h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.v1(siVar7.getUserConfig().f24976d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 8:
                final si siVar7 = this.f24872b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        si siVar32 = siVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar42 = siVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar42.getUserConfig().f24978e0 = tL_messages_stickerSet.set.short_name;
                                    siVar42.getUserConfig().f24983i0 = System.currentTimeMillis();
                                    siVar42.getUserConfig().v(false);
                                    siVar42.v1(siVar42.getUserConfig().f24978e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (siVar42.currentAccount == k10.f24968t0) {
                                            siVar42.o1(gc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                siVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().f27250a.c(new fg(siVar32, 13));
                                    siVar32.f26827g0[0].clear();
                                    ls.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar52 = siVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar52.getUserConfig().f24980f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar52.getUserConfig().f24984j0 = System.currentTimeMillis();
                                    siVar52.getUserConfig().v(false);
                                    siVar52.v1(siVar52.getUserConfig().f24980f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                siVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar62 = siVar7;
                                    siVar62.getUserConfig().f24975c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar62.getUserConfig().f24981g0 = System.currentTimeMillis();
                                    siVar62.getUserConfig().v(false);
                                    siVar62.v1(siVar62.getUserConfig().f24975c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar62.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar72 = siVar7;
                                    siVar72.getUserConfig().f24976d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar72.getUserConfig().f24982h0 = System.currentTimeMillis();
                                    siVar72.getUserConfig().v(false);
                                    siVar72.v1(siVar72.getUserConfig().f24976d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar72.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                si siVar8 = this.f24872b;
                siVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    siVar8.z1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    return;
                }
                return;
        }
    }
}
