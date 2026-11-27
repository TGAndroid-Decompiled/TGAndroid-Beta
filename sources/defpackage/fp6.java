package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fp6 implements RequestDelegate {
    public final byte a;
    public final ls6 b;

    public fp6(ls6 ls6Var, byte b) {
        this.a = b;
        this.b = ls6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                if (tL_error != null) {
                    hl.c3(new ip6(ls6Var, (byte) 11));
                    return;
                }
                ls6Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                hl.c3(new ip6(ls6Var, (byte) 12));
                return;
            case 2:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                hl.c3(new es6((Object) ls6Var, (Object) tL_error, (Object) tLObject, (byte) 0));
                return;
            case 4:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 6:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 7:
                if (tLObject != null) {
                    hl.c3(new mp6(ls6Var, (TLRPC.TL_messages_stickerSet) tLObject, (byte) 4));
                    return;
                }
                return;
            case 8:
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    ls6Var.x1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    return;
                }
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                            case 3:
                                int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis2, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis2, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(196, new Object[0]);
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
