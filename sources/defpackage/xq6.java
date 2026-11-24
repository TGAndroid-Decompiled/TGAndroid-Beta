package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq6 implements RequestDelegate {
    public final byte a;
    public final hs6 b;

    public xq6(hs6 hs6Var, byte b) {
        this.a = b;
        this.b = hs6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error != null) {
                    gm.c3(new vp6(hs6Var, (byte) 11));
                    return;
                }
                hs6Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                gm.c3(new vp6(hs6Var, (byte) 12));
                return;
            case 1:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hs6 hs6Var2 = hs6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var3 = hs6Var;
                                    hs6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hs6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hs6Var3.getUserConfig().u(false);
                                    hs6Var3.t1(hs6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hs6Var3.currentAccount == z8c.t0) {
                                            hs6Var3.m1(gn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hs6Var2.getMessagesStorage().a.c(new vp6(hs6Var2, (byte) 13));
                                    hs6Var2.g0[0].clear();
                                    nm7.f(hs6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var4 = hs6Var;
                                    hs6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hs6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hs6Var4.getUserConfig().u(false);
                                    hs6Var4.t1(hs6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var5 = hs6Var;
                                    hs6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hs6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hs6Var5.getUserConfig().u(false);
                                    hs6Var5.t1(hs6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var5.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hs6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hs6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var6 = hs6Var;
                                    hs6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hs6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hs6Var6.getUserConfig().u(false);
                                    hs6Var6.t1(hs6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var6.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                gm.c3(new op6((Object) hs6Var, (Object) tL_error, (Object) tLObject, (byte) 0));
                return;
            case 3:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hs6 hs6Var2 = hs6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var3 = hs6Var;
                                    hs6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hs6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hs6Var3.getUserConfig().u(false);
                                    hs6Var3.t1(hs6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hs6Var3.currentAccount == z8c.t0) {
                                            hs6Var3.m1(gn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hs6Var2.getMessagesStorage().a.c(new vp6(hs6Var2, (byte) 13));
                                    hs6Var2.g0[0].clear();
                                    nm7.f(hs6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var4 = hs6Var;
                                    hs6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hs6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hs6Var4.getUserConfig().u(false);
                                    hs6Var4.t1(hs6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var5 = hs6Var;
                                    hs6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hs6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hs6Var5.getUserConfig().u(false);
                                    hs6Var5.t1(hs6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var5.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hs6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hs6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var6 = hs6Var;
                                    hs6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hs6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hs6Var6.getUserConfig().u(false);
                                    hs6Var6.t1(hs6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var6.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hs6 hs6Var2 = hs6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var3 = hs6Var;
                                    hs6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hs6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hs6Var3.getUserConfig().u(false);
                                    hs6Var3.t1(hs6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hs6Var3.currentAccount == z8c.t0) {
                                            hs6Var3.m1(gn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hs6Var2.getMessagesStorage().a.c(new vp6(hs6Var2, (byte) 13));
                                    hs6Var2.g0[0].clear();
                                    nm7.f(hs6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var4 = hs6Var;
                                    hs6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hs6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hs6Var4.getUserConfig().u(false);
                                    hs6Var4.t1(hs6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var5 = hs6Var;
                                    hs6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hs6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hs6Var5.getUserConfig().u(false);
                                    hs6Var5.t1(hs6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var5.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hs6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hs6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var6 = hs6Var;
                                    hs6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hs6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hs6Var6.getUserConfig().u(false);
                                    hs6Var6.t1(hs6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var6.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hs6 hs6Var2 = hs6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var3 = hs6Var;
                                    hs6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hs6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hs6Var3.getUserConfig().u(false);
                                    hs6Var3.t1(hs6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hs6Var3.currentAccount == z8c.t0) {
                                            hs6Var3.m1(gn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hs6Var2.getMessagesStorage().a.c(new vp6(hs6Var2, (byte) 13));
                                    hs6Var2.g0[0].clear();
                                    nm7.f(hs6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var4 = hs6Var;
                                    hs6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hs6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hs6Var4.getUserConfig().u(false);
                                    hs6Var4.t1(hs6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var5 = hs6Var;
                                    hs6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hs6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hs6Var5.getUserConfig().u(false);
                                    hs6Var5.t1(hs6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var5.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hs6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hs6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var6 = hs6Var;
                                    hs6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hs6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hs6Var6.getUserConfig().u(false);
                                    hs6Var6.t1(hs6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var6.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 6:
                if (tLObject != null) {
                    gm.c3(new tp6(hs6Var, (TLRPC.TL_messages_stickerSet) tLObject, (byte) 0));
                    return;
                }
                return;
            case 7:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hs6 hs6Var2 = hs6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var3 = hs6Var;
                                    hs6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hs6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hs6Var3.getUserConfig().u(false);
                                    hs6Var3.t1(hs6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hs6Var3.currentAccount == z8c.t0) {
                                            hs6Var3.m1(gn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hs6Var2.getMessagesStorage().a.c(new vp6(hs6Var2, (byte) 13));
                                    hs6Var2.g0[0].clear();
                                    nm7.f(hs6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var4 = hs6Var;
                                    hs6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hs6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hs6Var4.getUserConfig().u(false);
                                    hs6Var4.t1(hs6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var5 = hs6Var;
                                    hs6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hs6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hs6Var5.getUserConfig().u(false);
                                    hs6Var5.t1(hs6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var5.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hs6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hs6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var6 = hs6Var;
                                    hs6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hs6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hs6Var6.getUserConfig().u(false);
                                    hs6Var6.t1(hs6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var6.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 8:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hs6 hs6Var2 = hs6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var3 = hs6Var;
                                    hs6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hs6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hs6Var3.getUserConfig().u(false);
                                    hs6Var3.t1(hs6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hs6Var3.currentAccount == z8c.t0) {
                                            hs6Var3.m1(gn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hs6Var2.getMessagesStorage().a.c(new vp6(hs6Var2, (byte) 13));
                                    hs6Var2.g0[0].clear();
                                    nm7.f(hs6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var4 = hs6Var;
                                    hs6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hs6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hs6Var4.getUserConfig().u(false);
                                    hs6Var4.t1(hs6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var5 = hs6Var;
                                    hs6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hs6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hs6Var5.getUserConfig().u(false);
                                    hs6Var5.t1(hs6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var5.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hs6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hs6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hs6 hs6Var6 = hs6Var;
                                    hs6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hs6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hs6Var6.getUserConfig().u(false);
                                    hs6Var6.t1(hs6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hs6Var6.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    hs6Var.x1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    return;
                }
                return;
        }
    }
}
