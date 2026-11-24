package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xo6 implements RequestDelegate {
    public final byte a;
    public final hq6 b;

    public xo6(hq6 hq6Var, byte b) {
        this.a = b;
        this.b = hq6Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error != null) {
                    gl.c3(new un6(hq6Var, (byte) 11));
                    return;
                }
                hq6Var.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                gl.c3(new un6(hq6Var, (byte) 12));
                return;
            case 1:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hq6 hq6Var2 = hq6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var3 = hq6Var;
                                    hq6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hq6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hq6Var3.getUserConfig().u(false);
                                    hq6Var3.t1(hq6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hq6Var3.currentAccount == y6c.t0) {
                                            hq6Var3.m1(gl5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hq6Var2.getMessagesStorage().a.c(new un6(hq6Var2, (byte) 13));
                                    hq6Var2.g0[0].clear();
                                    kk7.f(hq6Var2.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var4 = hq6Var;
                                    hq6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hq6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hq6Var4.getUserConfig().u(false);
                                    hq6Var4.t1(hq6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var5 = hq6Var;
                                    hq6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hq6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hq6Var5.getUserConfig().u(false);
                                    hq6Var5.t1(hq6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var5.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hq6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hq6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var6 = hq6Var;
                                    hq6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hq6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hq6Var6.getUserConfig().u(false);
                                    hq6Var6.t1(hq6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var6.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                gl.c3(new nn6(hq6Var, tL_error, tLObject, (byte) 0));
                return;
            case 3:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hq6 hq6Var2 = hq6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var3 = hq6Var;
                                    hq6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hq6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hq6Var3.getUserConfig().u(false);
                                    hq6Var3.t1(hq6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hq6Var3.currentAccount == y6c.t0) {
                                            hq6Var3.m1(gl5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hq6Var2.getMessagesStorage().a.c(new un6(hq6Var2, (byte) 13));
                                    hq6Var2.g0[0].clear();
                                    kk7.f(hq6Var2.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var4 = hq6Var;
                                    hq6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hq6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hq6Var4.getUserConfig().u(false);
                                    hq6Var4.t1(hq6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var5 = hq6Var;
                                    hq6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hq6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hq6Var5.getUserConfig().u(false);
                                    hq6Var5.t1(hq6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var5.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hq6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hq6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var6 = hq6Var;
                                    hq6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hq6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hq6Var6.getUserConfig().u(false);
                                    hq6Var6.t1(hq6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var6.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hq6 hq6Var2 = hq6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var3 = hq6Var;
                                    hq6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hq6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hq6Var3.getUserConfig().u(false);
                                    hq6Var3.t1(hq6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hq6Var3.currentAccount == y6c.t0) {
                                            hq6Var3.m1(gl5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hq6Var2.getMessagesStorage().a.c(new un6(hq6Var2, (byte) 13));
                                    hq6Var2.g0[0].clear();
                                    kk7.f(hq6Var2.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var4 = hq6Var;
                                    hq6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hq6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hq6Var4.getUserConfig().u(false);
                                    hq6Var4.t1(hq6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var5 = hq6Var;
                                    hq6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hq6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hq6Var5.getUserConfig().u(false);
                                    hq6Var5.t1(hq6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var5.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hq6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hq6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var6 = hq6Var;
                                    hq6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hq6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hq6Var6.getUserConfig().u(false);
                                    hq6Var6.t1(hq6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var6.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 5:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hq6 hq6Var2 = hq6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var3 = hq6Var;
                                    hq6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hq6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hq6Var3.getUserConfig().u(false);
                                    hq6Var3.t1(hq6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hq6Var3.currentAccount == y6c.t0) {
                                            hq6Var3.m1(gl5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hq6Var2.getMessagesStorage().a.c(new un6(hq6Var2, (byte) 13));
                                    hq6Var2.g0[0].clear();
                                    kk7.f(hq6Var2.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var4 = hq6Var;
                                    hq6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hq6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hq6Var4.getUserConfig().u(false);
                                    hq6Var4.t1(hq6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var5 = hq6Var;
                                    hq6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hq6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hq6Var5.getUserConfig().u(false);
                                    hq6Var5.t1(hq6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var5.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hq6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hq6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var6 = hq6Var;
                                    hq6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hq6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hq6Var6.getUserConfig().u(false);
                                    hq6Var6.t1(hq6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var6.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 6:
                if (tLObject != null) {
                    gl.c3(new sn6(hq6Var, (TLRPC.TL_messages_stickerSet) tLObject, (byte) 0));
                    return;
                }
                return;
            case 7:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hq6 hq6Var2 = hq6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var3 = hq6Var;
                                    hq6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hq6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hq6Var3.getUserConfig().u(false);
                                    hq6Var3.t1(hq6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hq6Var3.currentAccount == y6c.t0) {
                                            hq6Var3.m1(gl5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hq6Var2.getMessagesStorage().a.c(new un6(hq6Var2, (byte) 13));
                                    hq6Var2.g0[0].clear();
                                    kk7.f(hq6Var2.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var4 = hq6Var;
                                    hq6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hq6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hq6Var4.getUserConfig().u(false);
                                    hq6Var4.t1(hq6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var5 = hq6Var;
                                    hq6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hq6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hq6Var5.getUserConfig().u(false);
                                    hq6Var5.t1(hq6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var5.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hq6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hq6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var6 = hq6Var;
                                    hq6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hq6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hq6Var6.getUserConfig().u(false);
                                    hq6Var6.t1(hq6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var6.getNotificationCenter().k(195, new Object[0]);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 8:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        hq6 hq6Var2 = hq6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var3 = hq6Var;
                                    hq6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    hq6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    hq6Var3.getUserConfig().u(false);
                                    hq6Var3.t1(hq6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (hq6Var3.currentAccount == y6c.t0) {
                                            hq6Var3.m1(gl5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    hq6Var2.getMessagesStorage().a.c(new un6(hq6Var2, (byte) 13));
                                    hq6Var2.g0[0].clear();
                                    kk7.f(hq6Var2.currentAccount).k(86, Boolean.FALSE, 0);
                                    return;
                                }
                                return;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var4 = hq6Var;
                                    hq6Var4.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    hq6Var4.getUserConfig().j0 = System.currentTimeMillis();
                                    hq6Var4.getUserConfig().u(false);
                                    hq6Var4.t1(hq6Var4.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    return;
                                }
                                return;
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var5 = hq6Var;
                                    hq6Var5.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    hq6Var5.getUserConfig().g0 = System.currentTimeMillis();
                                    hq6Var5.getUserConfig().u(false);
                                    hq6Var5.t1(hq6Var5.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var5.getNotificationCenter().k(194, new Object[0]);
                                    return;
                                }
                                return;
                            case 4:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    hq6Var2.y1(0, currentTimeMillis, null, false);
                                    return;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    hq6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    hq6 hq6Var6 = hq6Var;
                                    hq6Var6.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    hq6Var6.getUserConfig().h0 = System.currentTimeMillis();
                                    hq6Var6.getUserConfig().u(false);
                                    hq6Var6.t1(hq6Var6.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    hq6Var6.getNotificationCenter().k(195, new Object[0]);
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
                    hq6Var.x1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    return;
                }
                return;
        }
    }
}
