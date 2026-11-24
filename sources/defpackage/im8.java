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
public final class im8 extends c6 {
    public final byte a;
    public final Object b;

    public im8(Object obj, byte b) {
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
                    ((km8) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i == -1) {
                    ((om8) obj).a(false, false);
                    return;
                }
                return;
            case 2:
                if (i == -1) {
                    ((cic) obj).a(false, false);
                    return;
                }
                return;
            case 3:
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
                wp8 wp8Var = profileActivity.O;
                if (wp8Var == null || !wp8Var.E(true)) {
                    if (profileActivity.J0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f1);
                        bundle.putLong("user_id", profileActivity.e1);
                        profileActivity.presentFragment(new iy8(bundle));
                        return;
                    }
                    profileActivity.finishFragment();
                    return;
                }
                return;
            case 4:
                if (i == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                gw8 gw8Var = (gw8) obj;
                boolean z2 = gw8Var.J;
                fda fdaVar = gw8Var.K;
                if (i == -1) {
                    gw8Var.finishFragment();
                    return;
                } else if (i == 1 && gw8Var.getParentActivity() != null) {
                    i66 a = bw8.a();
                    a.o(gw8Var.w);
                    String obj2 = gw8Var.a[0].getText().toString();
                    String str4 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a.c = obj2;
                    if (gw8Var.w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(gw8Var.a[1].getText().toString()).intValue();
                    }
                    a.b = intValue;
                    if (gw8Var.w != 1) {
                        str = "";
                    } else {
                        str = gw8Var.a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a.d = str;
                    if (gw8Var.w != 1) {
                        str2 = "";
                    } else {
                        str2 = gw8Var.a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a.e = str2;
                    if (gw8Var.w == 1) {
                        str3 = "";
                    } else {
                        str3 = gw8Var.a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str4 = str3;
                    }
                    a.f = str4;
                    fdaVar.a = a.c();
                    SharedPreferences d1 = oc7.d1();
                    SharedPreferences.Editor edit = d1.edit();
                    if (z2) {
                        gda.a(fdaVar);
                        gda.x1 = fdaVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z = d1.getBoolean("proxy_enabled", false);
                        gda.y();
                    }
                    if (z2 || gda.x1 == fdaVar) {
                        fdaVar.a.i(edit);
                        ConnectionsManager.setProxySettings(z, fdaVar.a);
                    }
                    edit.commit();
                    nm7.e().k(282, new Object[0]);
                    gw8Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                lz8 lz8Var = (lz8) obj;
                ArrayList arrayList = lz8Var.b;
                if (i == -1) {
                    if (arrayList.isEmpty()) {
                        lz8Var.finishFragment();
                        return;
                    } else {
                        lz8Var.e0();
                        return;
                    }
                } else if (i == 1) {
                    if (arrayList.size() == 1) {
                        int intValue2 = ((Integer) arrayList.get(0)).intValue();
                        oz8 c = pz8.f(lz8.Z(lz8Var)).c(intValue2);
                        if (c != null) {
                            lz8.h0(lz8Var.getParentActivity(), lz8.a0(lz8Var), null, c, lz8.b0(lz8Var), new jr0(this, intValue2, (byte) 4));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, lz8Var.getResourceProvider(), lz8Var.getParentActivity());
                    String G = jb6.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = G;
                    heVar.U = jb6.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                    alertDialog$Builder.j(jb6.M0(2131746054, null), new h68(this, (byte) 20));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    lz8Var.showDialog(heVar);
                    return;
                } else {
                    return;
                }
            case 7:
                if (i == -1) {
                    ((a39) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i == -1) {
                    ((zb9) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i == -1) {
                    ((qc9) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i == -1) {
                    ((vn9) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i == -1) {
                    ((SecretMediaViewer) obj).c(true, false);
                    return;
                }
                return;
            case 13:
                if (i == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                daa daaVar = (daa) obj;
                if (i == -1) {
                    if (daaVar.O) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", daaVar.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        daaVar.presentFragment(new iy8(bundle2));
                        return;
                    }
                    daaVar.finishFragment();
                    return;
                } else if (i == 2) {
                    daaVar.k0(new d(null));
                    return;
                } else {
                    return;
                }
            case 15:
                ((tca) obj).onBackPressed();
                return;
            case 16:
                if (i == -1) {
                    ((xza) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                stickersActivity.o0(i);
                return;
            case 18:
                if (i == -1) {
                    ((hdb) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                zob zobVar = (zob) obj;
                if (i == -1) {
                    zobVar.finishFragment();
                    return;
                } else if (i == 1) {
                    zobVar.e0();
                    return;
                } else {
                    return;
                }
            case 20:
                if (i == -1) {
                    ((wqb) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i == -1) {
                    ((avb) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i == -1) {
                    ((zxb) obj).finishFragment();
                    return;
                }
                return;
            case 23:
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
            case 24:
                if (i == -1) {
                    ((n7c) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    userInfoActivity.h0(true);
                    return;
                } else {
                    return;
                }
            case 26:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i == 1) {
                    usersSelectActivity.c0();
                    return;
                } else {
                    return;
                }
            default:
                rrc rrcVar = (rrc) obj;
                if (i == -1) {
                    rrcVar.finishFragment();
                    return;
                } else if (i == 2) {
                    goc.M0(rrc.d0(rrcVar), rrcVar.getResourceProvider(), rrcVar.getParentActivity());
                    return;
                } else if (i == 3) {
                    rrcVar.t0();
                    return;
                } else {
                    return;
                }
        }
    }
}
