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
public final class d77 implements Runnable {
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

    public d77(y94 y94Var, boolean z, String str, boolean z2, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, qb4 qb4Var) {
        this.e = y94Var;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = qb4Var;
    }

    @Override
    public final void run() {
        qb4 qb4Var;
        qb4 qb4Var2;
        String str;
        TLRPC.TL_secureData tL_secureData;
        LinearLayout linearLayout;
        int i = 0;
        switch (this.a) {
            case 0:
                na7 na7Var = (na7) this.e;
                x14 x14Var = (d) this.f;
                c01 c01Var = (c01) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str2 = (String) this.c;
                boolean z = this.b;
                boolean z2 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (x14Var == null) {
                    x14Var = LaunchActivity.S();
                }
                if (x14Var != null) {
                    if (c01Var != null) {
                        c01Var.b();
                    }
                    if (!zArr[0]) {
                        String C1 = na7Var.C1(user.restriction_reason);
                        if (!TextUtils.isEmpty(C1)) {
                            na7.W4(C1, x14Var);
                            return;
                        } else if (user.bot_has_main_app) {
                            long j = user.id;
                            if (x14Var instanceof mu1) {
                                j = ((mu1) x14Var).a();
                            } else if (x14Var instanceof ProfileActivity) {
                                j = ((ProfileActivity) x14Var).a();
                            }
                            if (x14Var.getParentLayout() instanceof ActionBarLayout) {
                                x14Var = ((ActionBarLayout) x14Var.getParentLayout()).getSheetFragment();
                            }
                            gl.t1(x14Var.getFragmentView());
                            quc b = quc.b(na7Var.currentAccount, j, user.id, null, null, 4, 0, 0L, null, false, str2, user, 0, z, z2);
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().l(b) == null) {
                                ow0 ow0Var = new ow0(x14Var.getContext(), x14Var.getResourceProvider());
                                ow0Var.B(true);
                                ow0Var.C0 = false;
                                ow0Var.m0 = x14Var.getParentActivity();
                                ow0Var.x(x14Var, b);
                                ow0Var.show();
                                return;
                            }
                            return;
                        } else {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (x14Var.getParentLayout() instanceof ActionBarLayout) {
                                    x14Var = ((ActionBarLayout) x14Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                gl.t1(x14Var.getFragmentView());
                                int i2 = na7Var.currentAccount;
                                long j2 = user.id;
                                quc b2 = quc.b(i2, j2, j2, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str2, user, 0, z, z2);
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.H1.O().l(b2) == null) {
                                    ow0 ow0Var2 = new ow0(x14Var.getContext(), x14Var.getResourceProvider());
                                    ow0Var2.B(false);
                                    ow0Var2.C0 = true;
                                    ow0Var2.m0 = x14Var.getParentActivity();
                                    ow0Var2.x(x14Var, b2);
                                    ow0Var2.show();
                                    return;
                                }
                                return;
                            }
                            x14Var.presentFragment(mu1.U9(user.id));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                y94 y94Var = (y94) this.e;
                boolean z3 = this.b;
                String str3 = (String) this.c;
                boolean z4 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                qb4 qb4Var3 = (qb4) this.s;
                ba4 ba4Var = y94Var.d;
                if (z3) {
                    ba4Var.n.remove(str3);
                } else {
                    ba4Var.h.remove(str3);
                }
                ba4 ba4Var2 = y94Var.d;
                if (z4) {
                    int i3 = ba4Var2.s - 1;
                    ba4Var2.s = i3;
                    if (i3 < 1 && (qb4Var2 = (qb4) ba4Var2.f.poll()) != null) {
                        y94Var.d.s++;
                        qb4Var2.c();
                    }
                } else {
                    int i4 = ba4Var2.r - 1;
                    ba4Var2.r = i4;
                    if (i4 < 1 && (qb4Var = (qb4) ba4Var2.e.poll()) != null) {
                        y94Var.d.r++;
                        qb4Var.c();
                    }
                }
                pk5 pk5Var = y94Var.d.F;
                if (pk5Var != null) {
                    Utilities.d.c(new sr0(pk5Var, pk5Var.a, str3, inputFile, inputEncryptedFile, bArr, bArr2, qb4Var3.t));
                    return;
                }
                return;
            default:
                vx7 vx7Var = (vx7) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                nw7 nw7Var = (nw7) this.h;
                boolean z5 = this.b;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) this.n;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.r;
                boolean z6 = this.d;
                ArrayList arrayList = (ArrayList) this.c;
                kw7 kw7Var = (kw7) this.s;
                String str4 = null;
                if (tL_error != null) {
                    if (nw7Var != null) {
                        String str5 = tL_error.text;
                        nw7Var.b.z1();
                    }
                    vx7Var.O1(k96.M0(2131689472, null), tL_error.text);
                    return;
                }
                if (z5) {
                    if (tL_secureRequiredType != null) {
                        vx7Var.J1(tL_secureRequiredType);
                    } else {
                        vx7Var.J1(tL_secureRequiredType2);
                    }
                } else {
                    if (z6) {
                        vx7Var.J1(tL_secureRequiredType2);
                    }
                    vx7Var.J1(tL_secureRequiredType);
                }
                if (vx7Var.b == 8) {
                    ux7 ux7Var = (ux7) vx7Var.r1.remove(tL_secureRequiredType2);
                    if (ux7Var != null) {
                        vx7Var.d0.removeView(ux7Var);
                        View childAt = vx7Var.d0.getChildAt(linearLayout.getChildCount() - 6);
                        if (childAt instanceof ux7) {
                            ((ux7) childAt).setNeedDivider(false);
                        }
                    }
                    vx7Var.T1();
                } else {
                    if (tL_secureRequiredType != null && arrayList != null && arrayList.size() > 1) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(i5);
                                TLRPC.TL_secureValue k1 = vx7Var.k1(tL_secureRequiredType3, false);
                                if (k1 != null) {
                                    TLRPC.TL_secureData tL_secureData2 = k1.data;
                                    if (tL_secureData2 != null) {
                                        str = vx7.Z0(tL_secureData2.data, vx7Var.a1(tL_secureData2.secret, tL_secureData2.data_hash), k1.data.data_hash);
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
                        vx7Var.N1(tL_secureRequiredType2, null, null, tL_secureRequiredType, str, z5, i);
                    } else {
                        String str6 = str;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                        TLRPC.TL_secureValue k12 = vx7Var.k1(tL_secureRequiredType2, false);
                        if (k12 != null && (tL_secureData = k12.data) != null) {
                            str4 = vx7.Z0(tL_secureData.data, vx7Var.a1(tL_secureData.secret, tL_secureData.data_hash), k12.data.data_hash);
                        }
                        String str7 = str4;
                        if (arrayList != null) {
                            i = arrayList.size();
                        }
                        vx7Var.N1(tL_secureRequiredType2, null, str7, tL_secureRequiredType4, str6, z5, i);
                    }
                }
                if (kw7Var != null) {
                    kw7Var.run();
                    return;
                }
                return;
        }
    }

    public d77(na7 na7Var, d dVar, c01 c01Var, boolean[] zArr, TLRPC.User user, String str, boolean z, boolean z2, TL_bots.BotInfo[] botInfoArr) {
        this.e = na7Var;
        this.f = dVar;
        this.h = c01Var;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z;
        this.d = z2;
        this.s = botInfoArr;
    }

    public d77(vx7 vx7Var, TLRPC.TL_error tL_error, nw7 nw7Var, boolean z, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, boolean z2, ArrayList arrayList, kw7 kw7Var) {
        this.e = vx7Var;
        this.f = tL_error;
        this.h = nw7Var;
        this.b = z;
        this.n = tL_secureRequiredType;
        this.r = tL_secureRequiredType2;
        this.d = z2;
        this.c = arrayList;
        this.s = kw7Var;
    }
}
