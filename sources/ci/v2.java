package ci;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class v2 implements Runnable {
    public final int f6167a = 0;
    public final long f6168b;
    public final long f6169c;
    public final u10 d;
    public final Object f6170e;
    public final Object f6171f;
    public final Object h;

    public v2(l6 l6Var, u10 u10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, long j11) {
        this.f6170e = l6Var;
        this.d = u10Var;
        this.f6171f = tL_error;
        this.h = tLObject;
        this.f6168b = j10;
        this.f6169c = j11;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        switch (this.f6167a) {
            case 0:
                l6 l6Var = (l6) this.f6170e;
                u10 u10Var = this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6171f;
                TLObject tLObject = (TLObject) this.h;
                long j10 = this.f6168b;
                long j11 = this.f6169c;
                u10Var.a(tL_error);
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.Updates) {
                        if (j10 >= 0 && j11 >= 0) {
                            wm ra2 = wm.ra(j10);
                            ra2.whenFullyVisible(new f3(l6Var, ra2, j10, 0));
                            T.presentFragment(ra2);
                        } else {
                            org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(T).I(2131624028, bd.M0(2131749905, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749906, l6Var.z1(), org.telegram.messenger.m5.t(j10))));
                            I.f31802t = true;
                            I.j();
                        }
                    } else {
                        org.telegram.ui.Components.fc.a0(T).f0(tL_error, false);
                    }
                }
                e9.y(l6Var.f28583a, false).P(j10);
                e9.y(l6Var.f28583a, false).P(j11);
                return;
            default:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.f6170e;
                String str3 = (String) this.f6171f;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.h;
                long j12 = this.f6168b;
                ?? r72 = this.f6169c;
                u10 u10Var2 = this.d;
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
                    r72 = h0Var;
                    linkedHashMap = linkedHashMap2;
                } catch (Throwable th3) {
                    th = th3;
                    arrayList = arrayList2;
                    r72 = h0Var;
                    linkedHashMap = linkedHashMap2;
                }
                if (!str3.isEmpty() && h0Var != null && !h0Var.d()) {
                    Object obj = org.telegram.ui.Wallet.o0.f42982f;
                    synchronized (obj) {
                        try {
                            o0Var.c(j12);
                            try {
                                dw0 r5 = o0Var.r();
                                try {
                                    if (!((LinkedHashMap) r5.f33203e).isEmpty() && r5.f33200a != r72) {
                                        throw new Exception("USER_MISMATCH");
                                    }
                                    r5.f33200a = r72;
                                    arrayList = arrayList2;
                                    try {
                                        o0Var.s(r5, str3, linkedHashMap2, arrayList, j12);
                                        linkedHashMap = linkedHashMap2;
                                        try {
                                            ((LinkedHashMap) r5.f33203e).put(str3, o0Var.j(r5, str3, h0Var, arrayList, j12));
                                            linkedHashMap.put(str3, h0Var);
                                            r5.f33201b = ConnectionsManager.getInstance(o0Var.f42986b).getCurrentTime();
                                            synchronized (obj) {
                                                o0Var.c(j12);
                                                o0Var.v(r5, linkedHashMap);
                                                o0Var.d(r5);
                                            }
                                            h0Var.close();
                                            for (org.telegram.ui.Wallet.h0 h0Var2 : linkedHashMap.values()) {
                                                h0Var2.close();
                                            }
                                            str2 = null;
                                        } catch (Exception e12) {
                                            e = e12;
                                            r72 = h0Var;
                                            org.telegram.messenger.a8.g(e, true);
                                            if (e instanceof org.telegram.ui.Wallet.n0) {
                                                str = e.getMessage();
                                            } else {
                                                str = "STORAGE_BROKEN";
                                            }
                                            if (r72 != 0) {
                                                r72.close();
                                            }
                                            for (org.telegram.ui.Wallet.h0 h0Var3 : linkedHashMap.values()) {
                                                h0Var3.close();
                                            }
                                            str2 = str;
                                            o0Var.e(arrayList);
                                            org.telegram.messenger.g0.h3(new l2(o0Var, u10Var2, j12, str2));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r72 = h0Var;
                                            if (r72 != 0) {
                                                r72.close();
                                            }
                                            for (org.telegram.ui.Wallet.h0 h0Var4 : linkedHashMap.values()) {
                                                h0Var4.close();
                                            }
                                            o0Var.e(arrayList);
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
                                    r72 = h0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r72 = h0Var;
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                }
                                o0Var.e(arrayList);
                                org.telegram.messenger.g0.h3(new l2(o0Var, u10Var2, j12, str2));
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

    public v2(org.telegram.ui.Wallet.o0 o0Var, String str, org.telegram.ui.Wallet.h0 h0Var, long j10, long j11, u10 u10Var) {
        this.f6170e = o0Var;
        this.f6171f = str;
        this.h = h0Var;
        this.f6168b = j10;
        this.f6169c = j11;
        this.d = u10Var;
    }
}
