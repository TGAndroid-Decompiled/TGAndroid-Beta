package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih implements RequestDelegate {
    public final int f24798a;
    public final ri f24799b;

    public ih(ri riVar, int i7) {
        this.f24798a = i7;
        this.f24799b = riVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24798a) {
            case 0:
                ri riVar = this.f24799b;
                if (tL_error != null) {
                    g0.g3(new eg(riVar, 11));
                    return;
                }
                riVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                g0.g3(new eg(riVar, 12));
                return;
            case 1:
                final ri riVar2 = this.f24799b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ri riVar3 = riVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar4 = riVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar4.getUserConfig().f24647e0 = tL_messages_stickerSet.set.short_name;
                                    riVar4.getUserConfig().f24652i0 = System.currentTimeMillis();
                                    riVar4.getUserConfig().v(false);
                                    riVar4.v1(riVar4.getUserConfig().f24647e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (riVar4.currentAccount == i10.f24637t0) {
                                            riVar4.o1(fc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                riVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar3.getMessagesStorage().f27149a.c(new eg(riVar3, 13));
                                    riVar3.f26714g0[0].clear();
                                    ks.f(riVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar5 = riVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar5.getUserConfig().f24649f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar5.getUserConfig().f24653j0 = System.currentTimeMillis();
                                    riVar5.getUserConfig().v(false);
                                    riVar5.v1(riVar5.getUserConfig().f24649f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                riVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar6 = riVar2;
                                    riVar6.getUserConfig().f24644c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar6.getUserConfig().f24650g0 = System.currentTimeMillis();
                                    riVar6.getUserConfig().v(false);
                                    riVar6.v1(riVar6.getUserConfig().f24644c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar6.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                riVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar3.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar3.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar2;
                                    riVar7.getUserConfig().f24645d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().f24651h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().f24645d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                g0.g3(new yf(this.f24799b, tL_error, tLObject, 0));
                return;
            case 3:
                final ri riVar3 = this.f24799b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ri riVar32 = riVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar4 = riVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar4.getUserConfig().f24647e0 = tL_messages_stickerSet.set.short_name;
                                    riVar4.getUserConfig().f24652i0 = System.currentTimeMillis();
                                    riVar4.getUserConfig().v(false);
                                    riVar4.v1(riVar4.getUserConfig().f24647e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (riVar4.currentAccount == i10.f24637t0) {
                                            riVar4.o1(fc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                riVar4.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().f27149a.c(new eg(riVar32, 13));
                                    riVar32.f26714g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar5 = riVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar5.getUserConfig().f24649f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar5.getUserConfig().f24653j0 = System.currentTimeMillis();
                                    riVar5.getUserConfig().v(false);
                                    riVar5.v1(riVar5.getUserConfig().f24649f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                riVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar6 = riVar3;
                                    riVar6.getUserConfig().f24644c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar6.getUserConfig().f24650g0 = System.currentTimeMillis();
                                    riVar6.getUserConfig().v(false);
                                    riVar6.v1(riVar6.getUserConfig().f24644c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar6.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar3;
                                    riVar7.getUserConfig().f24645d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().f24651h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().f24645d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                final ri riVar4 = this.f24799b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ri riVar32 = riVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar42 = riVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar42.getUserConfig().f24647e0 = tL_messages_stickerSet.set.short_name;
                                    riVar42.getUserConfig().f24652i0 = System.currentTimeMillis();
                                    riVar42.getUserConfig().v(false);
                                    riVar42.v1(riVar42.getUserConfig().f24647e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (riVar42.currentAccount == i10.f24637t0) {
                                            riVar42.o1(fc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                riVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().f27149a.c(new eg(riVar32, 13));
                                    riVar32.f26714g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar5 = riVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar5.getUserConfig().f24649f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar5.getUserConfig().f24653j0 = System.currentTimeMillis();
                                    riVar5.getUserConfig().v(false);
                                    riVar5.v1(riVar5.getUserConfig().f24649f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                riVar5.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar6 = riVar4;
                                    riVar6.getUserConfig().f24644c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar6.getUserConfig().f24650g0 = System.currentTimeMillis();
                                    riVar6.getUserConfig().v(false);
                                    riVar6.v1(riVar6.getUserConfig().f24644c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar6.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar4;
                                    riVar7.getUserConfig().f24645d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().f24651h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().f24645d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                final ri riVar5 = this.f24799b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ri riVar32 = riVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar42 = riVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar42.getUserConfig().f24647e0 = tL_messages_stickerSet.set.short_name;
                                    riVar42.getUserConfig().f24652i0 = System.currentTimeMillis();
                                    riVar42.getUserConfig().v(false);
                                    riVar42.v1(riVar42.getUserConfig().f24647e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (riVar42.currentAccount == i10.f24637t0) {
                                            riVar42.o1(fc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                riVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().f27149a.c(new eg(riVar32, 13));
                                    riVar32.f26714g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar52 = riVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar52.getUserConfig().f24649f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar52.getUserConfig().f24653j0 = System.currentTimeMillis();
                                    riVar52.getUserConfig().v(false);
                                    riVar52.v1(riVar52.getUserConfig().f24649f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                riVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar6 = riVar5;
                                    riVar6.getUserConfig().f24644c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar6.getUserConfig().f24650g0 = System.currentTimeMillis();
                                    riVar6.getUserConfig().v(false);
                                    riVar6.v1(riVar6.getUserConfig().f24644c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar6.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar5;
                                    riVar7.getUserConfig().f24645d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().f24651h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().f24645d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 6:
                if (tLObject != null) {
                    g0.g3(new cg(this.f24799b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    return;
                }
                return;
            case 7:
                final ri riVar6 = this.f24799b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ri riVar32 = riVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar42 = riVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar42.getUserConfig().f24647e0 = tL_messages_stickerSet.set.short_name;
                                    riVar42.getUserConfig().f24652i0 = System.currentTimeMillis();
                                    riVar42.getUserConfig().v(false);
                                    riVar42.v1(riVar42.getUserConfig().f24647e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (riVar42.currentAccount == i10.f24637t0) {
                                            riVar42.o1(fc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                riVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().f27149a.c(new eg(riVar32, 13));
                                    riVar32.f26714g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar52 = riVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar52.getUserConfig().f24649f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar52.getUserConfig().f24653j0 = System.currentTimeMillis();
                                    riVar52.getUserConfig().v(false);
                                    riVar52.v1(riVar52.getUserConfig().f24649f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                riVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar62 = riVar6;
                                    riVar62.getUserConfig().f24644c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar62.getUserConfig().f24650g0 = System.currentTimeMillis();
                                    riVar62.getUserConfig().v(false);
                                    riVar62.v1(riVar62.getUserConfig().f24644c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar62.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar6;
                                    riVar7.getUserConfig().f24645d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().f24651h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().f24645d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 8:
                final ri riVar7 = this.f24799b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        ri riVar32 = riVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar42 = riVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar42.getUserConfig().f24647e0 = tL_messages_stickerSet.set.short_name;
                                    riVar42.getUserConfig().f24652i0 = System.currentTimeMillis();
                                    riVar42.getUserConfig().v(false);
                                    riVar42.v1(riVar42.getUserConfig().f24647e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                                        if (riVar42.currentAccount == i10.f24637t0) {
                                            riVar42.o1(fc.b(tL_messages_stickerSet.documents.get(i10)), 0);
                                        }
                                    }
                                    return;
                                }
                                riVar42.getClass();
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().f27149a.c(new eg(riVar32, 13));
                                    riVar32.f26714g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar52 = riVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar52.getUserConfig().f24649f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar52.getUserConfig().f24653j0 = System.currentTimeMillis();
                                    riVar52.getUserConfig().v(false);
                                    riVar52.v1(riVar52.getUserConfig().f24649f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                riVar52.getClass();
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar62 = riVar7;
                                    riVar62.getUserConfig().f24644c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar62.getUserConfig().f24650g0 = System.currentTimeMillis();
                                    riVar62.getUserConfig().v(false);
                                    riVar62.v1(riVar62.getUserConfig().f24644c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar62.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar72 = riVar7;
                                    riVar72.getUserConfig().f24645d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar72.getUserConfig().f24651h0 = System.currentTimeMillis();
                                    riVar72.getUserConfig().v(false);
                                    riVar72.v1(riVar72.getUserConfig().f24645d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar72.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ri riVar8 = this.f24799b;
                riVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    riVar8.z1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    return;
                }
                return;
        }
    }
}
