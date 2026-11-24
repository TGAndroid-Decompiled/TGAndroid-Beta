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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class g97 implements Runnable {
    public final byte a = 0;
    public final boolean b;
    public final Serializable c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;

    public g97(yb4 yb4Var, boolean z, String str, boolean z2, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, qd4 qd4Var) {
        this.e = yb4Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = qd4Var;
    }

    @Override
    public final void run() {
        qd4 qd4Var;
        qd4 qd4Var2;
        String str;
        TLRPC.TL_secureData tL_secureData;
        LinearLayout linearLayout;
        int i = 0;
        switch (this.a) {
            case 0:
                oc7 oc7Var = (oc7) this.e;
                i34 i34Var = (d) this.f;
                k11 k11Var = (k11) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str2 = (String) this.c;
                boolean z = this.b;
                boolean z2 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (i34Var == null) {
                    i34Var = LaunchActivity.S();
                }
                if (i34Var != null) {
                    if (k11Var != null) {
                        k11Var.b();
                    }
                    if (!zArr[0]) {
                        String D1 = oc7Var.D1(user.restriction_reason);
                        if (!TextUtils.isEmpty(D1)) {
                            oc7.Z4(D1, i34Var);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j = user.id;
                            if (i34Var instanceof yv1) {
                                j = ((yv1) i34Var).a();
                            } else if (i34Var instanceof ProfileActivity) {
                                j = ((ProfileActivity) i34Var).a();
                            }
                            if (i34Var.getParentLayout() instanceof ActionBarLayout) {
                                i34Var = ((ActionBarLayout) i34Var.getParentLayout()).getSheetFragment();
                            }
                            gm.t1(i34Var.getFragmentView());
                            rwc b = rwc.b(oc7Var.currentAccount, j, user.id, null, null, 4, 0, 0L, null, false, str2, user, 0, z, z2);
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().l(b) == null) {
                                wx0 wx0Var = new wx0(i34Var.getContext(), i34Var.getResourceProvider());
                                wx0Var.B(true);
                                wx0Var.C0 = false;
                                wx0Var.m0 = i34Var.getParentActivity();
                                wx0Var.x(i34Var, b);
                                wx0Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (i34Var.getParentLayout() instanceof ActionBarLayout) {
                                    i34Var = ((ActionBarLayout) i34Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                gm.t1(i34Var.getFragmentView());
                                int i2 = oc7Var.currentAccount;
                                long j2 = user.id;
                                rwc b2 = rwc.b(i2, j2, j2, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str2, user, 0, z, z2);
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.H1.O().l(b2) == null) {
                                    wx0 wx0Var2 = new wx0(i34Var.getContext(), i34Var.getResourceProvider());
                                    wx0Var2.B(false);
                                    wx0Var2.C0 = true;
                                    wx0Var2.m0 = i34Var.getParentActivity();
                                    wx0Var2.x(i34Var, b2);
                                    wx0Var2.show();
                                    return;
                                }
                                return;
                            }
                            i34Var.presentFragment(yv1.ga(user.id));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                yb4 yb4Var = (yb4) this.e;
                boolean z3 = this.b;
                String str3 = (String) this.c;
                boolean z4 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                qd4 qd4Var3 = (qd4) this.s;
                bc4 bc4Var = yb4Var.d;
                if (z3) {
                    bc4Var.n.remove(str3);
                } else {
                    bc4Var.h.remove(str3);
                }
                bc4 bc4Var2 = yb4Var.d;
                if (z4) {
                    int i3 = bc4Var2.s - 1;
                    bc4Var2.s = i3;
                    if (i3 < 1 && (qd4Var2 = (qd4) bc4Var2.f.poll()) != null) {
                        yb4Var.d.s++;
                        qd4Var2.c();
                    }
                } else {
                    int i4 = bc4Var2.r - 1;
                    bc4Var2.r = i4;
                    if (i4 < 1 && (qd4Var = (qd4) bc4Var2.e.poll()) != null) {
                        yb4Var.d.r++;
                        qd4Var.c();
                    }
                }
                pm5 pm5Var = yb4Var.d.F;
                if (pm5Var != null) {
                    Utilities.d.c(new at0(pm5Var, pm5Var.a, str3, inputFile, inputEncryptedFile, bArr, bArr2, qd4Var3.t));
                    return;
                }
                return;
            default:
                xz7 xz7Var = (xz7) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                qy7 qy7Var = (qy7) this.h;
                boolean z5 = this.b;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.n;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.r;
                boolean z6 = this.d;
                ArrayList arrayList = (ArrayList) this.c;
                ny7 ny7Var = (ny7) this.s;
                String str4 = null;
                if (tL_error != null) {
                    if (qy7Var != null) {
                        String str5 = tL_error.text;
                        qy7Var.b.A1();
                    }
                    xz7Var.P1(jb6.M0(2131689472, null), tL_error.text);
                    return;
                }
                if (z5) {
                    if (tL_secureRequiredType != null) {
                        xz7Var.K1(tL_secureRequiredType);
                    } else {
                        xz7Var.K1(tL_secureRequiredType2);
                    }
                } else {
                    if (z6) {
                        xz7Var.K1(tL_secureRequiredType2);
                    }
                    xz7Var.K1(tL_secureRequiredType);
                }
                if (xz7Var.b == 8) {
                    wz7 wz7Var = (wz7) xz7Var.r1.remove(tL_secureRequiredType2);
                    if (wz7Var != null) {
                        xz7Var.d0.removeView(wz7Var);
                        View childAt = xz7Var.d0.getChildAt(linearLayout.getChildCount() - 6);
                        if (childAt instanceof wz7) {
                            ((wz7) childAt).setNeedDivider(false);
                        }
                    }
                    xz7Var.U1();
                } else {
                    if (tL_secureRequiredType != null && arrayList != null && arrayList.size() > 1) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(i5);
                                TLRPC.TL_secureValue l1 = xz7Var.l1(tL_secureRequiredType3, false);
                                if (l1 != null) {
                                    TLRPC.TL_secureData tL_secureData2 = l1.data;
                                    if (tL_secureData2 != null) {
                                        str = xz7.a1(tL_secureData2.data, xz7Var.b1(tL_secureData2.secret, tL_secureData2.data_hash), l1.data.data_hash);
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
                        xz7Var.O1(tL_secureRequiredType2, null, null, tL_secureRequiredType, str, z5, i);
                    } else {
                        String str6 = str;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                        TLRPC.TL_secureValue l12 = xz7Var.l1(tL_secureRequiredType2, false);
                        if (l12 != null && (tL_secureData = l12.data) != null) {
                            str4 = xz7.a1(tL_secureData.data, xz7Var.b1(tL_secureData.secret, tL_secureData.data_hash), l12.data.data_hash);
                        }
                        String str7 = str4;
                        if (arrayList != null) {
                            i = arrayList.size();
                        }
                        xz7Var.O1(tL_secureRequiredType2, null, str7, tL_secureRequiredType4, str6, z5, i);
                    }
                }
                if (ny7Var != null) {
                    ny7Var.run();
                    return;
                }
                return;
        }
    }

    public g97(oc7 oc7Var, d dVar, k11 k11Var, boolean[] zArr, TLRPC.User user, String str, boolean z, boolean z2, TL_bots.BotInfo[] botInfoArr) {
        this.e = oc7Var;
        this.f = dVar;
        this.h = k11Var;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z;
        this.d = z2;
        this.s = botInfoArr;
    }

    public g97(xz7 xz7Var, TLRPC.TL_error tL_error, qy7 qy7Var, boolean z, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, boolean z2, ArrayList arrayList, ny7 ny7Var) {
        this.e = xz7Var;
        this.f = tL_error;
        this.h = qy7Var;
        this.b = z;
        this.n = tL_secureRequiredType;
        this.r = tL_secureRequiredType2;
        this.d = z2;
        this.c = arrayList;
        this.s = ny7Var;
    }
}
