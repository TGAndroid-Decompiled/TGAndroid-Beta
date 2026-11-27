package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.UsersSelectActivity;
public final class rn8 extends d6 {
    public final byte a;
    public final Object b;

    public rn8(Object obj, byte b) {
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
        d6 d6Var = null;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i == -1) {
                    ((vn8) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i == -1) {
                    ((zn8) obj).a(false, false);
                    return;
                }
                return;
            case 3:
                if (i == -1) {
                    ((gkc) obj).a(false, false);
                    return;
                }
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i != -1) {
                    aVar = ((e) profileActivity).actionBar;
                    if (aVar != null) {
                        aVar2 = ((e) profileActivity).actionBar;
                        d6Var = aVar2.getActionBarMenuOnItemClick();
                    }
                    if (d6Var != null) {
                        d6Var.b(i);
                        return;
                    }
                    return;
                }
                gr8 gr8Var = profileActivity.O;
                if (gr8Var == null || !gr8Var.E(true)) {
                    if (profileActivity.J0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f1);
                        bundle.putLong("user_id", profileActivity.e1);
                        profileActivity.presentFragment(new rz8(bundle));
                        return;
                    }
                    profileActivity.finishFragment();
                    return;
                }
                return;
            case 5:
                if (i == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                ox8 ox8Var = (ox8) obj;
                boolean z2 = ox8Var.J;
                wea weaVar = ox8Var.K;
                if (i == -1) {
                    ox8Var.finishFragment();
                    return;
                } else if (i == 1 && ox8Var.getParentActivity() != null) {
                    m66 a = jx8.a();
                    a.o(ox8Var.w);
                    String obj2 = ox8Var.a[0].getText().toString();
                    String str4 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a.c = obj2;
                    if (ox8Var.w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(ox8Var.a[1].getText().toString()).intValue();
                    }
                    a.b = intValue;
                    if (ox8Var.w != 1) {
                        str = "";
                    } else {
                        str = ox8Var.a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a.d = str;
                    if (ox8Var.w != 1) {
                        str2 = "";
                    } else {
                        str2 = ox8Var.a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a.e = str2;
                    if (ox8Var.w == 1) {
                        str3 = "";
                    } else {
                        str3 = ox8Var.a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str4 = str3;
                    }
                    a.f = str4;
                    weaVar.a = a.c();
                    SharedPreferences e1 = uc7.e1();
                    SharedPreferences.Editor edit = e1.edit();
                    if (z2) {
                        xea.a(weaVar);
                        xea.x1 = weaVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z = e1.getBoolean("proxy_enabled", false);
                        xea.y();
                    }
                    if (z2 || xea.x1 == weaVar) {
                        weaVar.a.i(edit);
                        ConnectionsManager.setProxySettings(z, weaVar.a);
                    }
                    edit.commit();
                    jn7.e().k(281, new Object[0]);
                    ox8Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 7:
                x09 x09Var = (x09) obj;
                ArrayList arrayList = x09Var.b;
                if (i == -1) {
                    if (arrayList.isEmpty()) {
                        x09Var.finishFragment();
                        return;
                    } else {
                        x09Var.d0();
                        return;
                    }
                } else if (i == 1) {
                    if (arrayList.size() == 1) {
                        int intValue2 = ((Integer) arrayList.get(0)).intValue();
                        a19 c = b19.f(x09.Y(x09Var)).c(intValue2);
                        if (c != null) {
                            x09.g0(x09Var.getParentActivity(), x09.Z(x09Var), null, c, x09.a0(x09Var), new jq0(this, intValue2, (byte) 4));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, x09Var.getResourceProvider(), x09Var.getParentActivity());
                    String G = ob6.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = G;
                    idVar.U = ob6.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.j(ob6.M0(2131746048, null), new jz7(this, (byte) 23));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    x09Var.showDialog(idVar);
                    return;
                } else {
                    return;
                }
            case 8:
                if (i == -1) {
                    ((n49) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i == -1) {
                    ((nd9) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i == -1) {
                    ((ee9) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i == -1) {
                    ((kp9) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i == -1) {
                    ((SecretMediaViewer) obj).c(true, false);
                    return;
                }
                return;
            case 14:
                if (i == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                uba ubaVar = (uba) obj;
                if (i == -1) {
                    if (ubaVar.O) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", ubaVar.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        ubaVar.presentFragment(new rz8(bundle2));
                        return;
                    }
                    ubaVar.finishFragment();
                    return;
                } else if (i == 2) {
                    ubaVar.j0(new e(null));
                    return;
                } else {
                    return;
                }
            case 16:
                ((kea) obj).onBackPressed();
                return;
            case 17:
                if (i == -1) {
                    ((w1b) obj).finishFragment();
                    return;
                }
                return;
            case 18:
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
            case 19:
                if (i == -1) {
                    ((bfb) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                xqb xqbVar = (xqb) obj;
                if (i == -1) {
                    xqbVar.finishFragment();
                    return;
                } else if (i == 1) {
                    xqbVar.d0();
                    return;
                } else {
                    return;
                }
            case 21:
                if (i == -1) {
                    ((vsb) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i == -1) {
                    ((axb) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i == -1) {
                    ((zzb) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.Y >= 0) {
                        twoStepVerificationActivity.C0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 25:
                if (i == -1) {
                    ((n9c) obj).finishFragment();
                    return;
                }
                return;
            case 26:
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
            case 27:
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
                euc eucVar = (euc) obj;
                if (i == -1) {
                    eucVar.finishFragment();
                    return;
                } else if (i == 2) {
                    uqc.L0(euc.c0(eucVar), eucVar.getResourceProvider(), eucVar.getParentActivity());
                    return;
                } else if (i == 3) {
                    eucVar.s0();
                    return;
                } else {
                    return;
                }
        }
    }
}
