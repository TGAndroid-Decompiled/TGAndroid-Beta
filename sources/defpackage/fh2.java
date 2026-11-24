package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
public final class fh2 extends c6 {
    public final byte a;
    public final Object b;

    public fh2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(int i) {
        int i2;
        rja rjaVar;
        sj3 sj3Var;
        int i3;
        long j;
        a aVar;
        a aVar2;
        int i4;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hh2 hh2Var = (hh2) obj;
                if (i == -1) {
                    if (hh2Var.onBackPressed(true)) {
                        hh2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    hh2Var.f0();
                    return;
                } else {
                    return;
                }
            case 1:
                if (i == -1) {
                    ((io2) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i == -1) {
                    ((po2) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i == -1) {
                    ((ap2) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                pp2 pp2Var = ((jp2) obj).n;
                if (i == -1) {
                    if (pp2Var.H1) {
                        pp2Var.dismiss();
                        return;
                    }
                    pp2Var.u1.d.g3.O(false);
                    pp2Var.n1.E(0);
                    return;
                } else if (i == 3) {
                    pp2Var.m1.a(true, true);
                    pp2Var.r0(false);
                    pp2Var.M1 = null;
                    pp2Var.A1.g3.O(true);
                    pp2Var.y1.r.getText().clear();
                    pp2Var.y1.r.requestFocus();
                    gm.E3(pp2Var.y1.r);
                    return;
                } else {
                    return;
                }
            case 5:
                pp2 pp2Var2 = ((kp2) obj).r;
                if (i == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", pp2Var2.o1);
                    pp2Var2.t1.presentFragment(new po2(bundle));
                    pp2Var2.dismiss();
                    return;
                } else if (i == 3) {
                    pp2Var2.l1.a(true, true);
                    pp2Var2.r0(false);
                    TextUtils.isEmpty(pp2Var2.L1);
                    pp2Var2.L1 = null;
                    pp2Var2.z1.h(0L, pp2Var2.o1, 0L, 0L, null, false, null, true);
                    pp2Var2.x1.r.getText().clear();
                    pp2Var2.x1.r.requestFocus();
                    gm.E3(pp2Var2.x1.r);
                    return;
                } else {
                    return;
                }
            case 6:
                pp2 pp2Var3 = ((jp2) obj).n;
                if (i == -1) {
                    pp2Var3.u1.d.g3.O(false);
                    pp2Var3.n1.E(0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i == -1) {
                    rjaVar = ((d) contactsActivity).simpleActionBar;
                    if (rjaVar.x()) {
                        contactsActivity.i0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i == 100) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, contactsActivity.getResourceProvider(), contactsActivity.getParentActivity());
                    vh6 vh6Var = contactsActivity.a0;
                    int m = vh6Var.m();
                    he heVar = alertDialog$Builder.a;
                    if (m == 1) {
                        heVar.S = jb6.M0(2131751487, null);
                        heVar.U = jb6.M0(2131751488, null);
                    } else {
                        heVar.S = jb6.G(vh6Var.m(), "DeleteContactsTitle", new Object[0]);
                        heVar.U = jb6.M0(2131751486, null);
                    }
                    alertDialog$Builder.j(jb6.M0(2131751535, null), new xu2(contactsActivity));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), new a32((byte) 24));
                    heVar.show();
                    heVar.h();
                    return;
                } else if (i == 1) {
                    gda.H0 = !gda.H0;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putBoolean("sortContactsByName", gda.H0);
                    edit.apply();
                    contactsActivity.r = gda.H0;
                    zja zjaVar = contactsActivity.n;
                    if (zjaVar != null) {
                        s09 iconView = zjaVar.getIconView();
                        if (contactsActivity.r) {
                            i2 = 2131232108;
                        } else {
                            i2 = 2131232107;
                        }
                        gm.L3(iconView, i2);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(d53.g).withEndAction(new vu2(contactsActivity, (byte) 0));
                    contactsActivity.f0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 8:
                if (i == -1) {
                    ((az2) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i == -1) {
                    ((t93) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i == -1) {
                    ((ug3) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                nk3 nk3Var = (nk3) obj;
                ArrayList arrayList = nk3Var.K2;
                if ((i == 201 || i == 200 || i == 202 || i == 203) && (sj3Var = nk3Var.D0) != null) {
                    HashMap hashMap = sj3Var.C0;
                    nk3 nk3Var2 = sj3Var.M0;
                    if (i == 202) {
                        if (nk3Var2 != null && nk3Var2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nk3Var2.getParentActivity());
                            String G = jb6.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            he heVar2 = alertDialog$Builder2.a;
                            heVar2.S = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) gm.S2(jb6.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) jb6.M0(2131746052, null));
                            heVar2.U = spannableStringBuilder;
                            alertDialog$Builder2.g(jb6.M0(2131752542, null), new dq9((byte) 5));
                            alertDialog$Builder2.j(jb6.M0(2131751535, null), new xr8(sj3Var, arrayList2, (byte) 15));
                            TextView textView = (TextView) alertDialog$Builder2.o().c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i == 203) {
                        if (sj3Var.O()) {
                            nk3Var2.showDialog(new kj8((d) nk3Var2, 2, true));
                            return;
                        }
                        return;
                    } else if (i == 200) {
                        if (hashMap.size() == 1) {
                            sj3Var.r((k47) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i == 201) {
                        nk3 nk3Var3 = new nk3(td4.j(3, "onlySelect", "dialogsType", true));
                        nk3Var3.E2 = new yf9(sj3Var, (byte) 13);
                        nk3Var2.presentFragment(nk3Var3);
                        return;
                    } else {
                        return;
                    }
                } else if (i == -1) {
                    dj3 dj3Var = nk3Var.H3;
                    if (dj3Var != null && dj3Var.c()) {
                        aVar2 = ((d) nk3Var).actionBar;
                        if (aVar2.y()) {
                            sj3 sj3Var2 = nk3Var.D0;
                            if (sj3Var2 != null && sj3Var2.getVisibility() == 0) {
                                sj3 sj3Var3 = nk3Var.D0;
                                if (sj3Var3.B0) {
                                    sj3Var3.R(false);
                                    return;
                                }
                            }
                            nk3Var.A3(true);
                            return;
                        }
                        nk3Var.H3.a();
                        sj3 sj3Var4 = nk3Var.D0;
                        if (sj3Var4 != null) {
                            sj3Var4.S();
                            return;
                        }
                        return;
                    }
                    ak3 ak3Var = nk3Var.A0;
                    if (ak3Var == null || !ak3Var.n) {
                        aVar = ((d) nk3Var).actionBar;
                        if (aVar.y()) {
                            sj3 sj3Var5 = nk3Var.D0;
                            if (sj3Var5 != null && sj3Var5.getVisibility() == 0) {
                                sj3 sj3Var6 = nk3Var.D0;
                                if (sj3Var6.B0) {
                                    sj3Var6.R(false);
                                    return;
                                }
                            }
                            nk3Var.A3(true);
                            return;
                        } else if (nk3Var.n2 || nk3Var.Y2 != 0 || nk3Var.a3 != 0) {
                            nk3Var.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    ak3Var.setIsEditing(false);
                    nk3Var.d5(false);
                    return;
                } else if (i == 1) {
                    if (nk3Var.getParentActivity() != null) {
                        gda.w = true;
                        gda.x();
                        int[] iArr = new int[2];
                        nk3Var.g0.getLocationInWindow(iArr);
                        ((LaunchActivity) nk3Var.getParentActivity()).K0(false, true, (nk3Var.g0.getMeasuredWidth() / 2) + iArr[0], (nk3Var.g0.getMeasuredHeight() / 2) + iArr[1], new bi3(this, (byte) 4));
                        nk3Var.getNotificationsController().Y();
                        nk3Var.U2();
                        return;
                    }
                    return;
                } else if (i == 3) {
                    nk3Var.k5(true, true, true, false);
                    nk3Var.Z.b(true);
                    return;
                } else if (i == 11) {
                    nk3Var.E4(nk3Var.F1);
                    return;
                } else if (i == 109) {
                    dh4 dh4Var = new dh4(nk3Var, arrayList);
                    dh4Var.t1 = new wm2(this, (byte) 27);
                    nk3Var.showDialog(dh4Var);
                    return;
                } else if (i == 110) {
                    ub7 ub7Var = (ub7) nk3Var.getMessagesController().S0().get(nk3Var.f0[0].h);
                    ArrayList D0 = dh4.D0(nk3Var, ub7Var, arrayList, false, false);
                    if (ub7Var != null) {
                        i3 = ub7Var.i.size();
                    } else {
                        i3 = 0;
                    }
                    if (D0.size() + i3 > 100) {
                        nk3Var.showDialog(ik.K(nk3Var.getParentActivity(), jb6.M0(2131750747, null), jb6.M0(2131750748, null)).a);
                        return;
                    }
                    if (!D0.isEmpty()) {
                        ArrayList arrayList3 = ub7Var.i;
                        LongSparseIntArray longSparseIntArray = ub7Var.j;
                        arrayList3.addAll(D0);
                        for (int i5 = 0; i5 < D0.size(); i5++) {
                            Long l = (Long) D0.get(i5);
                            ub7Var.h.remove(l);
                            longSparseIntArray.delete(l.longValue());
                        }
                        if (ub7Var.c()) {
                            ub7Var.i.clear();
                        }
                        qf4.z0(ub7Var, ub7Var.g, ub7Var.b, ub7Var.c, ub7Var.n, ub7Var.m, ub7Var.h, ub7Var.i, longSparseIntArray, false, false, true, false, false, nk3Var, null);
                    }
                    if (D0.size() == 1) {
                        j = ((Long) D0.get(0)).longValue();
                    } else {
                        j = 0;
                    }
                    UndoView w3 = nk3Var.w3();
                    if (w3 != null) {
                        w3.k(j, 21, Integer.valueOf(D0.size()), ub7Var, null, null);
                    }
                    nk3Var.A3(false);
                    return;
                } else if (i == 100 || i == 101 || i == 102 || i == 103 || i == 104 || i == 105 || i == 106 || i == 107 || i == 108) {
                    nk3Var.K4(nk3Var.K2, i, true, false, null);
                    return;
                } else {
                    return;
                }
            case 14:
                kv3 kv3Var = (kv3) obj;
                int i6 = kv3Var.x;
                ArrayList arrayList4 = kv3Var.e;
                int i7 = kv3Var.y;
                if (i == -1) {
                    if (kv3Var.E == null) {
                        kv3Var.c0();
                        return;
                    } else {
                        kv3Var.finishFragment();
                        return;
                    }
                } else if (i == 1 && kv3Var.getParentActivity() != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                        arrayList5.add(bf7.a(((Long) arrayList4.get(i8)).longValue(), 0L));
                    }
                    cf7 messagesStorage = kv3Var.getMessagesStorage();
                    messagesStorage.a.c(new ad7(messagesStorage, i7, arrayList5, (byte) 0));
                    SharedPreferences.Editor edit2 = kv3Var.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    String j2 = hg9.j(i7, "account");
                    i4 = ((d) kv3Var).currentAccount;
                    edit2.putInt(j2, i4);
                    edit2.putInt("type" + i7, i6);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(kv3Var.getParentActivity());
                    if (i6 == 0) {
                        ChatsWidgetProvider.a(kv3Var.getParentActivity(), appWidgetManager, i7);
                    } else {
                        ContactsWidgetProvider.a(kv3Var.getParentActivity(), appWidgetManager, i7);
                    }
                    gv3 gv3Var = kv3Var.E;
                    if (gv3Var != null) {
                        gv3Var.l();
                        return;
                    } else {
                        kv3Var.c0();
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                if (i == -1) {
                    ((x34) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                me4 me4Var = (me4) obj;
                if (i == -1) {
                    if (me4Var.Z(true)) {
                        me4Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    me4Var.h0();
                    return;
                } else {
                    return;
                }
            case 17:
                qf4 qf4Var = (qf4) obj;
                if (i == -1) {
                    if (qf4Var.k0(true)) {
                        qf4Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    qf4Var.w0();
                    return;
                } else {
                    return;
                }
            case 18:
                if (i == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                tt4 tt4Var = (tt4) obj;
                if (i == -1) {
                    Runnable runnable = tt4Var.W;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i >= 10) {
                    tt4Var.e((yn6) tt4Var.h0.get(i - 10), false);
                    return;
                } else {
                    return;
                }
            case 20:
                if (i == -1) {
                    ((yw4) obj).dismiss();
                    return;
                }
                return;
            case 21:
                if (i == -1) {
                    ((ux4) obj).dismiss();
                    return;
                }
                return;
            case 22:
                if (i == -1) {
                    ((h15) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                n55 n55Var = (n55) obj;
                if (i == -1) {
                    if (n55Var.onBackPressed(true)) {
                        n55Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    n55Var.c0();
                    return;
                } else {
                    return;
                }
            case 24:
                oc5 oc5Var = (oc5) obj;
                if (i == -1) {
                    if (oc5Var.h0(true)) {
                        oc5Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    oc5Var.s0();
                    return;
                } else {
                    return;
                }
            case 25:
                if (i == -1) {
                    ((uc5) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i == -1) {
                    ((zc5) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i == -1) {
                    ((kd5) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i == -1) {
                    ((re5) obj).finishFragment();
                    return;
                }
                return;
            default:
                lg5 lg5Var = (lg5) obj;
                if (i == -1) {
                    if (lg5.d0(lg5Var).y()) {
                        lg5.e0(lg5Var).x();
                        lg5Var.w.clear();
                        gm.d0(lg5Var.a, new bn0((byte) 16));
                        return;
                    }
                    lg5Var.finishFragment();
                    return;
                }
                return;
        }
    }
}
