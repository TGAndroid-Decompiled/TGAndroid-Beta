package di;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class p2 implements Runnable {
    public final int f9209a = 0;
    public final long f9210b;
    public final long f9211c;
    public final z10 d;
    public final Object f9212e;
    public final Object f9213f;
    public final Object h;

    public p2(c6 c6Var, z10 z10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.f9212e = c6Var;
        this.d = z10Var;
        this.f9213f = tL_error;
        this.h = tLObject;
        this.f9210b = j3;
        this.f9211c = j10;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        switch (this.f9209a) {
            case 0:
                c6 c6Var = (c6) this.f9212e;
                z10 z10Var = this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9213f;
                TLObject tLObject = (TLObject) this.h;
                long j3 = this.f9210b;
                long j10 = this.f9211c;
                z10Var.a(tL_error);
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        if (j3 >= 0 && j10 >= 0) {
                            an ua2 = an.ua(j3);
                            ua2.whenFullyVisible(new y2(c6Var, ua2, j3, 0));
                            T.presentFragment(ua2);
                        } else {
                            org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(T).I(2131624029, hd.M0(2131749897, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749898, c6Var.z1(), org.telegram.messenger.m5.t(j3))));
                            I.f41645t = true;
                            I.j();
                        }
                    } else {
                        org.telegram.ui.Components.cc.a0(T).f0(tL_error, false);
                    }
                }
                u8.y(c6Var.f29679a, false).P(j3);
                u8.y(c6Var.f29679a, false).P(j10);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.f9212e;
                String str3 = (String) this.f9213f;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.h;
                long j11 = this.f9210b;
                ?? r72 = this.f9211c;
                z10 z10Var2 = this.d;
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                try {
                    try {
                        try {
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayList = arrayList2;
                    r72 = i0Var;
                    linkedHashMap = linkedHashMap2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = arrayList2;
                    r72 = i0Var;
                    linkedHashMap = linkedHashMap2;
                }
                if (!str3.isEmpty() && i0Var != null && !i0Var.d()) {
                    Object obj = org.telegram.ui.Wallet.p0.f44289f;
                    synchronized (obj) {
                        try {
                            p0Var.c(j11);
                            try {
                                hw0 r10 = p0Var.r();
                                try {
                                    if (!((LinkedHashMap) r10.f35358e).isEmpty() && r10.f35355a != r72) {
                                        throw new Exception("USER_MISMATCH");
                                    }
                                    r10.f35355a = r72;
                                    arrayList = arrayList2;
                                    try {
                                        p0Var.s(r10, str3, linkedHashMap2, arrayList, j11);
                                        linkedHashMap = linkedHashMap2;
                                        try {
                                            ((LinkedHashMap) r10.f35358e).put(str3, p0Var.j(r10, str3, i0Var, arrayList, j11));
                                            linkedHashMap.put(str3, i0Var);
                                            r10.f35356b = ConnectionsManager.getInstance(p0Var.f44293b).getCurrentTime();
                                            synchronized (obj) {
                                                p0Var.c(j11);
                                                p0Var.v(r10, linkedHashMap);
                                                p0Var.d(r10);
                                            }
                                            i0Var.close();
                                            for (org.telegram.ui.Wallet.i0 i0Var2 : linkedHashMap.values()) {
                                                i0Var2.close();
                                            }
                                            str2 = null;
                                        } catch (Exception e12) {
                                            e = e12;
                                            r72 = i0Var;
                                            org.telegram.messenger.a8.g(e, true);
                                            if (e instanceof org.telegram.ui.Wallet.o0) {
                                                str = e.getMessage();
                                            } else {
                                                str = "STORAGE_BROKEN";
                                            }
                                            if (r72 != 0) {
                                                r72.close();
                                            }
                                            for (org.telegram.ui.Wallet.i0 i0Var3 : linkedHashMap.values()) {
                                                i0Var3.close();
                                            }
                                            str2 = str;
                                            p0Var.e(arrayList);
                                            org.telegram.messenger.g0.h3(new f2(p0Var, z10Var2, j11, str2));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r72 = i0Var;
                                            if (r72 != 0) {
                                                r72.close();
                                            }
                                            for (org.telegram.ui.Wallet.i0 i0Var4 : linkedHashMap.values()) {
                                                i0Var4.close();
                                            }
                                            p0Var.e(arrayList);
                                            throw th;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        linkedHashMap = linkedHashMap2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        linkedHashMap = linkedHashMap2;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    r72 = i0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r72 = i0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                }
                                p0Var.e(arrayList);
                                org.telegram.messenger.g0.h3(new f2(p0Var, z10Var2, j11, str2));
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                } else {
                    throw new Exception("INVALID_ARGUMENT");
                }
                break;
        }
    }

    public p2(org.telegram.ui.Wallet.p0 p0Var, String str, org.telegram.ui.Wallet.i0 i0Var, long j3, long j10, z10 z10Var) {
        this.f9212e = p0Var;
        this.f9213f = str;
        this.h = i0Var;
        this.f9210b = j3;
        this.f9211c = j10;
        this.d = z10Var;
    }
}
