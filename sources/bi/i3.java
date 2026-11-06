package bi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.c20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class i3 implements Runnable {
    public final int f4034a = 0;
    public final long f4035b;
    public final long f4036c;
    public final c20 d;
    public final Object f4037e;
    public final Object f4038f;
    public final Object h;

    public i3(k7 k7Var, c20 c20Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.f4037e = k7Var;
        this.d = c20Var;
        this.f4038f = tL_error;
        this.h = tLObject;
        this.f4035b = j3;
        this.f4036c = j10;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        switch (this.f4034a) {
            case 0:
                k7 k7Var = (k7) this.f4037e;
                c20 c20Var = this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4038f;
                TLObject tLObject = (TLObject) this.h;
                long j3 = this.f4035b;
                long j10 = this.f4036c;
                c20Var.a(tL_error);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        if (j3 >= 0 && j10 >= 0) {
                            an ra2 = an.ra(j3);
                            ra2.whenFullyVisible(new s3(k7Var, ra2, j3, 0));
                            T.presentFragment(ra2);
                        } else {
                            org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(T).I(2131624028, org.telegram.messenger.hd.M0(2131749896, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749897, k7Var.z1(), org.telegram.messenger.m5.t(j3))));
                            I.f32524t = true;
                            I.j();
                        }
                    } else {
                        org.telegram.ui.Components.hc.a0(T).f0(tL_error, false);
                    }
                }
                ea.y(k7Var.f28613a, false).P(j3);
                ea.y(k7Var.f28613a, false).P(j10);
                return;
            default:
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f4037e;
                String str3 = (String) this.f4038f;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.h;
                long j11 = this.f4035b;
                ?? r72 = this.f4036c;
                c20 c20Var2 = this.d;
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
                    r72 = k0Var;
                    linkedHashMap = linkedHashMap2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = arrayList2;
                    r72 = k0Var;
                    linkedHashMap = linkedHashMap2;
                }
                if (!str3.isEmpty() && k0Var != null && !k0Var.d()) {
                    Object obj = org.telegram.ui.Wallet.r0.f43078f;
                    synchronized (obj) {
                        try {
                            r0Var.c(j11);
                            try {
                                ew0 r10 = r0Var.r();
                                try {
                                    if (!((LinkedHashMap) r10.f33361e).isEmpty() && r10.f33358a != r72) {
                                        throw new Exception("USER_MISMATCH");
                                    }
                                    r10.f33358a = r72;
                                    arrayList = arrayList2;
                                    try {
                                        r0Var.s(r10, str3, linkedHashMap2, arrayList, j11);
                                        linkedHashMap = linkedHashMap2;
                                        try {
                                            ((LinkedHashMap) r10.f33361e).put(str3, r0Var.j(r10, str3, k0Var, arrayList, j11));
                                            linkedHashMap.put(str3, k0Var);
                                            r10.f33359b = ConnectionsManager.getInstance(r0Var.f43082b).getCurrentTime();
                                            synchronized (obj) {
                                                r0Var.c(j11);
                                                r0Var.v(r10, linkedHashMap);
                                                r0Var.d(r10);
                                            }
                                            k0Var.close();
                                            for (org.telegram.ui.Wallet.k0 k0Var2 : linkedHashMap.values()) {
                                                k0Var2.close();
                                            }
                                            str2 = null;
                                        } catch (Exception e12) {
                                            e = e12;
                                            r72 = k0Var;
                                            org.telegram.messenger.a8.g(e, true);
                                            if (e instanceof org.telegram.ui.Wallet.q0) {
                                                str = e.getMessage();
                                            } else {
                                                str = "STORAGE_BROKEN";
                                            }
                                            if (r72 != 0) {
                                                r72.close();
                                            }
                                            for (org.telegram.ui.Wallet.k0 k0Var3 : linkedHashMap.values()) {
                                                k0Var3.close();
                                            }
                                            str2 = str;
                                            r0Var.e(arrayList);
                                            org.telegram.messenger.g0.h3(new w2(r0Var, c20Var2, j11, str2));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r72 = k0Var;
                                            if (r72 != 0) {
                                                r72.close();
                                            }
                                            for (org.telegram.ui.Wallet.k0 k0Var4 : linkedHashMap.values()) {
                                                k0Var4.close();
                                            }
                                            r0Var.e(arrayList);
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
                                    r72 = k0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r72 = k0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                }
                                r0Var.e(arrayList);
                                org.telegram.messenger.g0.h3(new w2(r0Var, c20Var2, j11, str2));
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

    public i3(org.telegram.ui.Wallet.r0 r0Var, String str, org.telegram.ui.Wallet.k0 k0Var, long j3, long j10, c20 c20Var) {
        this.f4037e = r0Var;
        this.f4038f = str;
        this.h = k0Var;
        this.f4035b = j3;
        this.f4036c = j10;
        this.d = c20Var;
    }
}
