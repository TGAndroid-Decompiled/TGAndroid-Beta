package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih implements RequestDelegate {
    public final int f23200a;
    public final ui f23201b;

    public ih(ui uiVar, int i7) {
        this.f23200a = i7;
        this.f23201b = uiVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23200a) {
            case 0:
                ui uiVar = this.f23201b;
                if (tL_error != null) {
                    g0.h3(new fg(uiVar, 10));
                    return;
                }
                uiVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                g0.h3(new fg(uiVar, 11));
                return;
            case 1:
                final ui uiVar2 = this.f23201b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ui uiVar3 = uiVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z9 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar4 = uiVar2;
                                if (z9) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar4.getUserConfig().f24478d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar4.getUserConfig().f24484h0 = System.currentTimeMillis();
                                    uiVar4.getUserConfig().v(false);
                                    uiVar4.s1(uiVar4.getUserConfig().f24478d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (uiVar4.currentAccount == p10.f24470s0) {
                                            uiVar4.l1(hc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar3.getMessagesStorage().f26719a.c(new fg(uiVar3, 12));
                                    uiVar3.f25814f0[0].clear();
                                    qs.f(uiVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().f24480e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().f24485i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().f24480e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar2;
                                    uiVar6.getUserConfig().f24475b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f24482f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().f24475b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
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
                                    uiVar7.getUserConfig().f24477c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f24483g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f24477c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                g0.h3(new ng(this.f23201b, tL_error, tLObject, 0));
                return;
            case 3:
                final ui uiVar3 = this.f23201b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ui uiVar32 = uiVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z9 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar4 = uiVar3;
                                if (z9) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar4.getUserConfig().f24478d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar4.getUserConfig().f24484h0 = System.currentTimeMillis();
                                    uiVar4.getUserConfig().v(false);
                                    uiVar4.s1(uiVar4.getUserConfig().f24478d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (uiVar4.currentAccount == p10.f24470s0) {
                                            uiVar4.l1(hc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f26719a.c(new fg(uiVar32, 12));
                                    uiVar32.f25814f0[0].clear();
                                    qs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().f24480e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().f24485i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().f24480e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar3;
                                    uiVar6.getUserConfig().f24475b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f24482f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().f24475b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
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
                                    uiVar7.getUserConfig().f24477c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f24483g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f24477c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                final ui uiVar4 = this.f23201b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ui uiVar32 = uiVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z9 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar4;
                                if (z9) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().f24478d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().f24484h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().f24478d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (uiVar42.currentAccount == p10.f24470s0) {
                                            uiVar42.l1(hc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f26719a.c(new fg(uiVar32, 12));
                                    uiVar32.f25814f0[0].clear();
                                    qs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().f24480e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().f24485i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().f24480e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar4;
                                    uiVar6.getUserConfig().f24475b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f24482f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().f24475b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
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
                                    uiVar7.getUserConfig().f24477c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f24483g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f24477c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                final ui uiVar5 = this.f23201b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ui uiVar32 = uiVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z9 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar5;
                                if (z9) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().f24478d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().f24484h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().f24478d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (uiVar42.currentAccount == p10.f24470s0) {
                                            uiVar42.l1(hc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f26719a.c(new fg(uiVar32, 12));
                                    uiVar32.f25814f0[0].clear();
                                    qs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().f24480e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().f24485i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().f24480e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar5;
                                    uiVar6.getUserConfig().f24475b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f24482f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().f24475b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
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
                                    uiVar7.getUserConfig().f24477c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f24483g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f24477c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
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
                    g0.h3(new cg(this.f23201b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    return;
                }
                return;
            case 7:
                final ui uiVar6 = this.f23201b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ui uiVar32 = uiVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z9 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar6;
                                if (z9) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().f24478d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().f24484h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().f24478d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (uiVar42.currentAccount == p10.f24470s0) {
                                            uiVar42.l1(hc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f26719a.c(new fg(uiVar32, 12));
                                    uiVar32.f25814f0[0].clear();
                                    qs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().f24480e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().f24485i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().f24480e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar62 = uiVar6;
                                    uiVar62.getUserConfig().f24475b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar62.getUserConfig().f24482f0 = System.currentTimeMillis();
                                    uiVar62.getUserConfig().v(false);
                                    uiVar62.s1(uiVar62.getUserConfig().f24475b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
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
                                    uiVar7.getUserConfig().f24477c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().f24483g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().f24477c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 8:
                final ui uiVar7 = this.f23201b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ui uiVar32 = uiVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z9 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar7;
                                if (z9) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().f24478d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().f24484h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().f24478d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (uiVar42.currentAccount == p10.f24470s0) {
                                            uiVar42.l1(hc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                uiVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().f26719a.c(new fg(uiVar32, 12));
                                    uiVar32.f25814f0[0].clear();
                                    qs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().f24480e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().f24485i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().f24480e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                uiVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar62 = uiVar7;
                                    uiVar62.getUserConfig().f24475b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar62.getUserConfig().f24482f0 = System.currentTimeMillis();
                                    uiVar62.getUserConfig().v(false);
                                    uiVar62.s1(uiVar62.getUserConfig().f24475b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
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
                                    uiVar72.getUserConfig().f24477c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar72.getUserConfig().f24483g0 = System.currentTimeMillis();
                                    uiVar72.getUserConfig().v(false);
                                    uiVar72.s1(uiVar72.getUserConfig().f24477c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar72.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ui uiVar8 = this.f23201b;
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
