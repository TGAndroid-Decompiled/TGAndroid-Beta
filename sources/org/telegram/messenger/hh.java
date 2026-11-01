package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hh implements RequestDelegate {
    public final int f16056a;
    public final vi f16057b;

    public hh(vi viVar, int i10) {
        this.f16056a = i10;
        this.f16057b = viVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16056a) {
            case 0:
                vi viVar = this.f16057b;
                if (tL_error != null) {
                    i0.g3(new fg(viVar, 10));
                    return;
                }
                viVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                i0.g3(new fg(viVar, 11));
                return;
            case 1:
                final vi viVar2 = this.f16057b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        vi viVar3 = viVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar4 = viVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar4.getUserConfig().f15514d0 = tL_messages_stickerSet.set.short_name;
                                    viVar4.getUserConfig().f15519h0 = System.currentTimeMillis();
                                    viVar4.getUserConfig().v(false);
                                    viVar4.s1(viVar4.getUserConfig().f15514d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (viVar4.currentAccount == e20.f15506s0) {
                                            viVar4.l1(jc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                viVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar3.getMessagesStorage().f16331a.c(new fg(viVar3, 12));
                                    viVar3.f18647f0[0].clear();
                                    at.f(viVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar5 = viVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar5.getUserConfig().f15515e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar5.getUserConfig().f15520i0 = System.currentTimeMillis();
                                    viVar5.getUserConfig().v(false);
                                    viVar5.s1(viVar5.getUserConfig().f15515e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                viVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar6 = viVar2;
                                    viVar6.getUserConfig().f15511b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar6.getUserConfig().f15517f0 = System.currentTimeMillis();
                                    viVar6.getUserConfig().v(false);
                                    viVar6.s1(viVar6.getUserConfig().f15511b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                viVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar3.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar3.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar2;
                                    viVar7.getUserConfig().f15513c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().f15518g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().f15513c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                i0.g3(new ng(this.f16057b, tL_error, tLObject, 0));
                return;
            case 3:
                final vi viVar3 = this.f16057b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        vi viVar32 = viVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar4 = viVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar4.getUserConfig().f15514d0 = tL_messages_stickerSet.set.short_name;
                                    viVar4.getUserConfig().f15519h0 = System.currentTimeMillis();
                                    viVar4.getUserConfig().v(false);
                                    viVar4.s1(viVar4.getUserConfig().f15514d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (viVar4.currentAccount == e20.f15506s0) {
                                            viVar4.l1(jc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                viVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().f16331a.c(new fg(viVar32, 12));
                                    viVar32.f18647f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar5 = viVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar5.getUserConfig().f15515e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar5.getUserConfig().f15520i0 = System.currentTimeMillis();
                                    viVar5.getUserConfig().v(false);
                                    viVar5.s1(viVar5.getUserConfig().f15515e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                viVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar6 = viVar3;
                                    viVar6.getUserConfig().f15511b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar6.getUserConfig().f15517f0 = System.currentTimeMillis();
                                    viVar6.getUserConfig().v(false);
                                    viVar6.s1(viVar6.getUserConfig().f15511b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar3;
                                    viVar7.getUserConfig().f15513c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().f15518g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().f15513c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                final vi viVar4 = this.f16057b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        vi viVar32 = viVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar42 = viVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar42.getUserConfig().f15514d0 = tL_messages_stickerSet.set.short_name;
                                    viVar42.getUserConfig().f15519h0 = System.currentTimeMillis();
                                    viVar42.getUserConfig().v(false);
                                    viVar42.s1(viVar42.getUserConfig().f15514d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (viVar42.currentAccount == e20.f15506s0) {
                                            viVar42.l1(jc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                viVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().f16331a.c(new fg(viVar32, 12));
                                    viVar32.f18647f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar5 = viVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar5.getUserConfig().f15515e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar5.getUserConfig().f15520i0 = System.currentTimeMillis();
                                    viVar5.getUserConfig().v(false);
                                    viVar5.s1(viVar5.getUserConfig().f15515e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                viVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar6 = viVar4;
                                    viVar6.getUserConfig().f15511b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar6.getUserConfig().f15517f0 = System.currentTimeMillis();
                                    viVar6.getUserConfig().v(false);
                                    viVar6.s1(viVar6.getUserConfig().f15511b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar4;
                                    viVar7.getUserConfig().f15513c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().f15518g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().f15513c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                final vi viVar5 = this.f16057b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        vi viVar32 = viVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar42 = viVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar42.getUserConfig().f15514d0 = tL_messages_stickerSet.set.short_name;
                                    viVar42.getUserConfig().f15519h0 = System.currentTimeMillis();
                                    viVar42.getUserConfig().v(false);
                                    viVar42.s1(viVar42.getUserConfig().f15514d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (viVar42.currentAccount == e20.f15506s0) {
                                            viVar42.l1(jc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                viVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().f16331a.c(new fg(viVar32, 12));
                                    viVar32.f18647f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar52 = viVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar52.getUserConfig().f15515e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar52.getUserConfig().f15520i0 = System.currentTimeMillis();
                                    viVar52.getUserConfig().v(false);
                                    viVar52.s1(viVar52.getUserConfig().f15515e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                viVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar6 = viVar5;
                                    viVar6.getUserConfig().f15511b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar6.getUserConfig().f15517f0 = System.currentTimeMillis();
                                    viVar6.getUserConfig().v(false);
                                    viVar6.s1(viVar6.getUserConfig().f15511b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar6.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar5;
                                    viVar7.getUserConfig().f15513c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().f15518g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().f15513c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 6:
                if (tLObject != null) {
                    i0.g3(new bg(this.f16057b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    return;
                }
                return;
            case 7:
                final vi viVar6 = this.f16057b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        vi viVar32 = viVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar42 = viVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar42.getUserConfig().f15514d0 = tL_messages_stickerSet.set.short_name;
                                    viVar42.getUserConfig().f15519h0 = System.currentTimeMillis();
                                    viVar42.getUserConfig().v(false);
                                    viVar42.s1(viVar42.getUserConfig().f15514d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (viVar42.currentAccount == e20.f15506s0) {
                                            viVar42.l1(jc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                viVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().f16331a.c(new fg(viVar32, 12));
                                    viVar32.f18647f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar52 = viVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar52.getUserConfig().f15515e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar52.getUserConfig().f15520i0 = System.currentTimeMillis();
                                    viVar52.getUserConfig().v(false);
                                    viVar52.s1(viVar52.getUserConfig().f15515e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                viVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar62 = viVar6;
                                    viVar62.getUserConfig().f15511b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar62.getUserConfig().f15517f0 = System.currentTimeMillis();
                                    viVar62.getUserConfig().v(false);
                                    viVar62.s1(viVar62.getUserConfig().f15511b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar62.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar6;
                                    viVar7.getUserConfig().f15513c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().f15518g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().f15513c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 8:
                final vi viVar7 = this.f16057b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        vi viVar32 = viVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar42 = viVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar42.getUserConfig().f15514d0 = tL_messages_stickerSet.set.short_name;
                                    viVar42.getUserConfig().f15519h0 = System.currentTimeMillis();
                                    viVar42.getUserConfig().v(false);
                                    viVar42.s1(viVar42.getUserConfig().f15514d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (viVar42.currentAccount == e20.f15506s0) {
                                            viVar42.l1(jc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    return;
                                }
                                viVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().f16331a.c(new fg(viVar32, 12));
                                    viVar32.f18647f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar52 = viVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar52.getUserConfig().f15515e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar52.getUserConfig().f15520i0 = System.currentTimeMillis();
                                    viVar52.getUserConfig().v(false);
                                    viVar52.s1(viVar52.getUserConfig().f15515e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                viVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar62 = viVar7;
                                    viVar62.getUserConfig().f15511b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar62.getUserConfig().f15517f0 = System.currentTimeMillis();
                                    viVar62.getUserConfig().v(false);
                                    viVar62.s1(viVar62.getUserConfig().f15511b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar62.getNotificationCenter().k(192, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar72 = viVar7;
                                    viVar72.getUserConfig().f15513c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar72.getUserConfig().f15518g0 = System.currentTimeMillis();
                                    viVar72.getUserConfig().v(false);
                                    viVar72.s1(viVar72.getUserConfig().f15513c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar72.getNotificationCenter().k(193, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                vi viVar8 = this.f16057b;
                viVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    viVar8.w1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    return;
                }
                return;
        }
    }
}
