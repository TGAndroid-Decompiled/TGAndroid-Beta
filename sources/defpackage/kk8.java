package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.UsersSelectActivity;
public final class kk8 extends c6 {
    public final byte a;
    public final Object b;

    public kk8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(int i) {
        a aVar;
        a aVar2;
        int intValue;
        String str;
        String str2;
        String str3;
        byte b = this.a;
        c6 c6Var = null;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((mk8) obj).a(false, false);
                    return;
                }
                return;
            case 1:
                if (i == -1) {
                    ((bgc) obj).a(false, false);
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i != -1) {
                    aVar = ((d) profileActivity).actionBar;
                    if (aVar != null) {
                        aVar2 = ((d) profileActivity).actionBar;
                        c6Var = aVar2.getActionBarMenuOnItemClick();
                    }
                    if (c6Var != null) {
                        c6Var.b(i);
                        return;
                    }
                    return;
                }
                vn8 vn8Var = profileActivity.O;
                if (vn8Var == null || !vn8Var.E(true)) {
                    if (profileActivity.J0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f1);
                        bundle.putLong("user_id", profileActivity.e1);
                        profileActivity.presentFragment(new gw8(bundle));
                        return;
                    }
                    profileActivity.finishFragment();
                    return;
                }
                return;
            case 3:
                if (i == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                fu8 fu8Var = (fu8) obj;
                boolean z2 = fu8Var.J;
                fba fbaVar = fu8Var.K;
                if (i == -1) {
                    fu8Var.finishFragment();
                    return;
                } else if (i == 1 && fu8Var.getParentActivity() != null) {
                    i46 a = au8.a();
                    a.o(fu8Var.w);
                    String obj2 = fu8Var.a[0].getText().toString();
                    String str4 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a.c = obj2;
                    if (fu8Var.w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(fu8Var.a[1].getText().toString()).intValue();
                    }
                    a.b = intValue;
                    if (fu8Var.w != 1) {
                        str = "";
                    } else {
                        str = fu8Var.a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a.d = str;
                    if (fu8Var.w != 1) {
                        str2 = "";
                    } else {
                        str2 = fu8Var.a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a.e = str2;
                    if (fu8Var.w == 1) {
                        str3 = "";
                    } else {
                        str3 = fu8Var.a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str4 = str3;
                    }
                    a.f = str4;
                    fbaVar.a = a.c();
                    SharedPreferences c1 = na7.c1();
                    SharedPreferences.Editor edit = c1.edit();
                    if (z2) {
                        gba.a(fbaVar);
                        gba.y1 = fbaVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z = c1.getBoolean("proxy_enabled", false);
                        gba.y();
                    }
                    if (z2 || gba.y1 == fbaVar) {
                        fbaVar.a.i(edit);
                        ConnectionsManager.setProxySettings(z, fbaVar.a);
                    }
                    edit.commit();
                    kk7.e().k(280, new Object[0]);
                    fu8Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 5:
                kx8 kx8Var = (kx8) obj;
                ArrayList arrayList = kx8Var.b;
                if (i == -1) {
                    if (arrayList.isEmpty()) {
                        kx8Var.finishFragment();
                        return;
                    } else {
                        kx8Var.d0();
                        return;
                    }
                } else if (i == 1) {
                    if (arrayList.size() == 1) {
                        int intValue2 = ((Integer) arrayList.get(0)).intValue();
                        nx8 c = ox8.f(kx8.Y(kx8Var)).c(intValue2);
                        if (c != null) {
                            kx8.g0(kx8Var.getParentActivity(), kx8.Z(kx8Var), null, c, kx8.a0(kx8Var), new jq0(this, intValue2, (byte) 4));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kx8Var.getResourceProvider(), kx8Var.getParentActivity());
                    String G = k96.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = G;
                    hdVar.U = k96.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.j(k96.M0(2131746128, null), new k88(this, (byte) 16));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    kx8Var.showDialog(hdVar);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i == -1) {
                    ((y09) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i == -1) {
                    ((z99) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i == -1) {
                    ((qa9) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i == -1) {
                    ((vl9) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i == -1) {
                    ((SecretMediaViewer) obj).c(true, false);
                    return;
                }
                return;
            case 12:
                if (i == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                d8a d8aVar = (d8a) obj;
                if (i == -1) {
                    if (d8aVar.O) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", d8aVar.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        d8aVar.presentFragment(new gw8(bundle2));
                        return;
                    }
                    d8aVar.finishFragment();
                    return;
                } else if (i == 2) {
                    d8aVar.j0(new d(null));
                    return;
                } else {
                    return;
                }
            case 14:
                ((taa) obj).onBackPressed();
                return;
            case 15:
                if (i == -1) {
                    ((uxa) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                stickersActivity.n0(i);
                return;
            case 17:
                if (i == -1) {
                    ((fbb) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                ymb ymbVar = (ymb) obj;
                if (i == -1) {
                    ymbVar.finishFragment();
                    return;
                } else if (i == 1) {
                    ymbVar.d0();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i == -1) {
                    ((vob) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i == -1) {
                    ((zsb) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i == -1) {
                    ((wvb) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.Y >= 0) {
                        twoStepVerificationActivity.B0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 23:
                if (i == -1) {
                    ((n5c) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    userInfoActivity.g0(true);
                    return;
                } else {
                    return;
                }
            case 25:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i == 1) {
                    usersSelectActivity.b0();
                    return;
                } else {
                    return;
                }
            default:
                qpc qpcVar = (qpc) obj;
                if (i == -1) {
                    qpcVar.finishFragment();
                    return;
                } else if (i == 2) {
                    hmc.L0(qpc.c0(qpcVar), qpcVar.getResourceProvider(), qpcVar.getParentActivity());
                    return;
                } else if (i == 3) {
                    qpcVar.s0();
                    return;
                } else {
                    return;
                }
        }
    }
}
