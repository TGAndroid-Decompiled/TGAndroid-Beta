package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class b97 implements Runnable {
    public final byte a = 2;
    public final boolean b;
    public final Serializable c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;

    public b97(ub4 ub4Var, boolean z, String str, boolean z2, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, nd4 nd4Var) {
        this.e = ub4Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = nd4Var;
    }

    @Override
    public final void run() {
        nd4 nd4Var;
        nd4 nd4Var2;
        String str;
        TLRPC.TL_secureData tL_secureData;
        LinearLayout linearLayout;
        int i = 0;
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.e;
                s24 s24Var = (e) this.f;
                l01 l01Var = (l01) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str2 = (String) this.c;
                boolean z = this.b;
                boolean z2 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (s24Var == null) {
                    s24Var = LaunchActivity.S();
                }
                if (s24Var != null) {
                    if (l01Var != null) {
                        l01Var.b();
                    }
                    if (!zArr[0]) {
                        String E1 = uc7Var.E1(user.restriction_reason);
                        if (!TextUtils.isEmpty(E1)) {
                            uc7.f5(E1, s24Var);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j = user.id;
                            if (s24Var instanceof zu1) {
                                j = ((zu1) s24Var).a();
                            } else if (s24Var instanceof ProfileActivity) {
                                j = ((ProfileActivity) s24Var).a();
                            }
                            if (s24Var.getParentLayout() instanceof ActionBarLayout) {
                                s24Var = ((ActionBarLayout) s24Var.getParentLayout()).getSheetFragment();
                            }
                            hl.t1(s24Var.getFragmentView());
                            gzc b = gzc.b(uc7Var.currentAccount, j, user.id, null, null, 4, 0, 0L, null, false, str2, user, 0, z, z2);
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().l(b) == null) {
                                xw0 xw0Var = new xw0(s24Var.getContext(), s24Var.getResourceProvider());
                                xw0Var.B(true);
                                xw0Var.C0 = false;
                                xw0Var.m0 = s24Var.getParentActivity();
                                xw0Var.x(s24Var, b);
                                xw0Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (s24Var.getParentLayout() instanceof ActionBarLayout) {
                                    s24Var = ((ActionBarLayout) s24Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                hl.t1(s24Var.getFragmentView());
                                int i2 = uc7Var.currentAccount;
                                long j2 = user.id;
                                gzc b2 = gzc.b(i2, j2, j2, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str2, user, 0, z, z2);
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.H1.O().l(b2) == null) {
                                    xw0 xw0Var2 = new xw0(s24Var.getContext(), s24Var.getResourceProvider());
                                    xw0Var2.B(false);
                                    xw0Var2.C0 = true;
                                    xw0Var2.m0 = s24Var.getParentActivity();
                                    xw0Var2.x(s24Var, b2);
                                    xw0Var2.show();
                                    return;
                                }
                                return;
                            }
                            s24Var.presentFragment(zu1.ha(user.id));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                ub4 ub4Var = (ub4) this.e;
                boolean z3 = this.b;
                String str3 = (String) this.c;
                boolean z4 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                nd4 nd4Var3 = (nd4) this.s;
                xb4 xb4Var = ub4Var.d;
                if (z3) {
                    xb4Var.n.remove(str3);
                } else {
                    xb4Var.h.remove(str3);
                }
                xb4 xb4Var2 = ub4Var.d;
                if (z4) {
                    int i3 = xb4Var2.s - 1;
                    xb4Var2.s = i3;
                    if (i3 < 1 && (nd4Var2 = (nd4) xb4Var2.f.poll()) != null) {
                        ub4Var.d.s++;
                        nd4Var2.c();
                    }
                } else {
                    int i4 = xb4Var2.r - 1;
                    xb4Var2.r = i4;
                    if (i4 < 1 && (nd4Var = (nd4) xb4Var2.e.poll()) != null) {
                        ub4Var.d.r++;
                        nd4Var.c();
                    }
                }
                sm5 sm5Var = ub4Var.d.F;
                if (sm5Var != null) {
                    Utilities.d.c(new as0(sm5Var, sm5Var.a, str3, inputFile, inputEncryptedFile, bArr, bArr2, nd4Var3.t));
                    return;
                }
                return;
            default:
                b18 b18Var = (b18) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                vz7 vz7Var = (vz7) this.h;
                boolean z5 = this.b;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.n;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.r;
                boolean z6 = this.d;
                ArrayList arrayList = (ArrayList) this.c;
                sz7 sz7Var = (sz7) this.s;
                String str4 = null;
                if (tL_error != null) {
                    if (vz7Var != null) {
                        String str5 = tL_error.text;
                        vz7Var.b.A1();
                    }
                    b18Var.P1(ob6.M0(2131689472, null), tL_error.text);
                    return;
                }
                if (z5) {
                    if (tL_secureRequiredType != null) {
                        b18Var.K1(tL_secureRequiredType);
                    } else {
                        b18Var.K1(tL_secureRequiredType2);
                    }
                } else {
                    if (z6) {
                        b18Var.K1(tL_secureRequiredType2);
                    }
                    b18Var.K1(tL_secureRequiredType);
                }
                if (b18Var.b == 8) {
                    a18 a18Var = (a18) b18Var.r1.remove(tL_secureRequiredType2);
                    if (a18Var != null) {
                        b18Var.d0.removeView(a18Var);
                        View childAt = b18Var.d0.getChildAt(linearLayout.getChildCount() - 6);
                        if (childAt instanceof a18) {
                            ((a18) childAt).setNeedDivider(false);
                        }
                    }
                    b18Var.U1();
                } else {
                    if (tL_secureRequiredType != null && arrayList != null && arrayList.size() > 1) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(i5);
                                TLRPC.TL_secureValue l1 = b18Var.l1(tL_secureRequiredType3, false);
                                if (l1 != null) {
                                    TLRPC.TL_secureData tL_secureData2 = l1.data;
                                    if (tL_secureData2 != null) {
                                        str = b18.a1(tL_secureData2.data, b18Var.b1(tL_secureData2.secret, tL_secureData2.data_hash), l1.data.data_hash);
                                    } else {
                                        str = null;
                                    }
                                    tL_secureRequiredType = tL_secureRequiredType3;
                                } else {
                                    i5++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        if (tL_secureRequiredType == null) {
                            tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList.get(0);
                        }
                    } else {
                        str = null;
                    }
                    if (z6) {
                        if (arrayList != null) {
                            i = arrayList.size();
                        }
                        b18Var.O1(tL_secureRequiredType2, null, null, tL_secureRequiredType, str, z5, i);
                    } else {
                        String str6 = str;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                        TLRPC.TL_secureValue l12 = b18Var.l1(tL_secureRequiredType2, false);
                        if (l12 != null && (tL_secureData = l12.data) != null) {
                            str4 = b18.a1(tL_secureData.data, b18Var.b1(tL_secureData.secret, tL_secureData.data_hash), l12.data.data_hash);
                        }
                        String str7 = str4;
                        if (arrayList != null) {
                            i = arrayList.size();
                        }
                        b18Var.O1(tL_secureRequiredType2, null, str7, tL_secureRequiredType4, str6, z5, i);
                    }
                }
                if (sz7Var != null) {
                    sz7Var.run();
                    return;
                }
                return;
        }
    }

    public b97(uc7 uc7Var, e eVar, l01 l01Var, boolean[] zArr, TLRPC.User user, String str, boolean z, boolean z2, TL_bots.BotInfo[] botInfoArr) {
        this.e = uc7Var;
        this.f = eVar;
        this.h = l01Var;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z;
        this.d = z2;
        this.s = botInfoArr;
    }

    public b97(b18 b18Var, TLRPC.TL_error tL_error, vz7 vz7Var, boolean z, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, boolean z2, ArrayList arrayList, sz7 sz7Var) {
        this.e = b18Var;
        this.f = tL_error;
        this.h = vz7Var;
        this.b = z;
        this.n = tL_secureRequiredType;
        this.r = tL_secureRequiredType2;
        this.d = z2;
        this.c = arrayList;
        this.s = sz7Var;
    }
}
