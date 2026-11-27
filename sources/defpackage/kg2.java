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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
public final class kg2 extends d6 {
    public final byte a;
    public final Object b;

    public kg2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(int i) {
        int i2;
        jla jlaVar;
        bj3 bj3Var;
        int i3;
        long j;
        a aVar;
        a aVar2;
        int i4;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mg2 mg2Var = (mg2) obj;
                if (i == -1) {
                    if (mg2Var.onBackPressed(true)) {
                        mg2Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    mg2Var.e0();
                    return;
                } else {
                    return;
                }
            case 1:
                if (i == -1) {
                    ((qn2) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i == -1) {
                    ((xn2) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i == -1) {
                    ((io2) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                xo2 xo2Var = ((qo2) obj).n;
                if (i == -1) {
                    if (xo2Var.H1) {
                        xo2Var.dismiss();
                        return;
                    }
                    xo2Var.u1.d.g3.O(false);
                    xo2Var.n1.F(0);
                    return;
                } else if (i == 3) {
                    xo2Var.m1.a(true, true);
                    xo2Var.r0(false);
                    xo2Var.M1 = null;
                    xo2Var.A1.g3.O(true);
                    xo2Var.y1.r.getText().clear();
                    xo2Var.y1.r.requestFocus();
                    hl.E3(xo2Var.y1.r);
                    return;
                } else {
                    return;
                }
            case 5:
                xo2 xo2Var2 = ((ro2) obj).r;
                if (i == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", xo2Var2.o1);
                    xo2Var2.t1.presentFragment(new xn2(bundle));
                    xo2Var2.dismiss();
                    return;
                } else if (i == 3) {
                    xo2Var2.l1.a(true, true);
                    xo2Var2.r0(false);
                    TextUtils.isEmpty(xo2Var2.L1);
                    xo2Var2.L1 = null;
                    xo2Var2.z1.h(0L, xo2Var2.o1, 0L, 0L, null, false, null, true);
                    xo2Var2.x1.r.getText().clear();
                    xo2Var2.x1.r.requestFocus();
                    hl.E3(xo2Var2.x1.r);
                    return;
                } else {
                    return;
                }
            case 6:
                xo2 xo2Var3 = ((qo2) obj).n;
                if (i == -1) {
                    xo2Var3.u1.d.g3.O(false);
                    xo2Var3.n1.F(0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i == -1) {
                    jlaVar = ((e) contactsActivity).simpleActionBar;
                    if (jlaVar.z()) {
                        contactsActivity.h0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i == 100) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, contactsActivity.getResourceProvider(), contactsActivity.getParentActivity());
                    zh6 zh6Var = contactsActivity.a0;
                    int m = zh6Var.m();
                    id idVar = alertDialog$Builder.a;
                    if (m == 1) {
                        idVar.S = ob6.M0(2131751515, null);
                        idVar.U = ob6.M0(2131751516, null);
                    } else {
                        idVar.S = ob6.G(zh6Var.m(), "DeleteContactsTitle", new Object[0]);
                        idVar.U = ob6.M0(2131751514, null);
                    }
                    alertDialog$Builder.j(ob6.M0(2131751563, null), new gu2(contactsActivity));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), new c22((byte) 28));
                    idVar.show();
                    idVar.h();
                    return;
                } else if (i == 1) {
                    xea.H0 = !xea.H0;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putBoolean("sortContactsByName", xea.H0);
                    edit.apply();
                    contactsActivity.r = xea.H0;
                    sla slaVar = contactsActivity.n;
                    if (slaVar != null) {
                        e29 iconView = slaVar.getIconView();
                        if (contactsActivity.r) {
                            i2 = 2131232107;
                        } else {
                            i2 = 2131232106;
                        }
                        hl.L3(iconView, i2);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(k43.g).withEndAction(new eu2(contactsActivity, (byte) 1));
                    contactsActivity.f0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 8:
                if (i == -1) {
                    ((ky2) obj).finishFragment();
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
                    ((a93) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i == -1) {
                    ((bg3) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                uj3 uj3Var = (uj3) obj;
                ArrayList arrayList = uj3Var.K2;
                if ((i == 201 || i == 200 || i == 202 || i == 203) && (bj3Var = uj3Var.D0) != null) {
                    HashMap hashMap = bj3Var.C0;
                    uj3 uj3Var2 = bj3Var.M0;
                    if (i == 202) {
                        if (uj3Var2 != null && uj3Var2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(uj3Var2.getParentActivity());
                            String G = ob6.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            id idVar2 = alertDialog$Builder2.a;
                            idVar2.S = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) hl.S2(ob6.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) ob6.M0(2131746046, null));
                            idVar2.U = spannableStringBuilder;
                            alertDialog$Builder2.g(ob6.M0(2131752570, null), new vr9((byte) 7));
                            alertDialog$Builder2.j(ob6.M0(2131751563, null), new yw9(bj3Var, arrayList2, (byte) 0));
                            TextView textView = (TextView) alertDialog$Builder2.o().c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i == 203) {
                        if (bj3Var.P()) {
                            uj3Var2.showDialog(new xk8((e) uj3Var2, 2, true));
                            return;
                        }
                        return;
                    } else if (i == 200) {
                        if (hashMap.size() == 1) {
                            bj3Var.r((r47) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i == 201) {
                        uj3 uj3Var3 = new uj3(qd4.j(3, "onlySelect", "dialogsType", true));
                        uj3Var3.E2 = new ye9(bj3Var, (byte) 22);
                        uj3Var2.presentFragment(uj3Var3);
                        return;
                    } else {
                        return;
                    }
                } else if (i == -1) {
                    li3 li3Var = uj3Var.H3;
                    if (li3Var != null && li3Var.c()) {
                        aVar2 = ((e) uj3Var).actionBar;
                        if (aVar2.z()) {
                            bj3 bj3Var2 = uj3Var.D0;
                            if (bj3Var2 != null && bj3Var2.getVisibility() == 0) {
                                bj3 bj3Var3 = uj3Var.D0;
                                if (bj3Var3.B0) {
                                    bj3Var3.S(false);
                                    return;
                                }
                            }
                            uj3Var.A3(true);
                            return;
                        }
                        uj3Var.H3.a();
                        bj3 bj3Var4 = uj3Var.D0;
                        if (bj3Var4 != null) {
                            bj3Var4.T();
                            return;
                        }
                        return;
                    }
                    ij3 ij3Var = uj3Var.A0;
                    if (ij3Var == null || !ij3Var.n) {
                        aVar = ((e) uj3Var).actionBar;
                        if (aVar.z()) {
                            bj3 bj3Var5 = uj3Var.D0;
                            if (bj3Var5 != null && bj3Var5.getVisibility() == 0) {
                                bj3 bj3Var6 = uj3Var.D0;
                                if (bj3Var6.B0) {
                                    bj3Var6.S(false);
                                    return;
                                }
                            }
                            uj3Var.A3(true);
                            return;
                        } else if (uj3Var.n2 || uj3Var.Y2 != 0 || uj3Var.a3 != 0) {
                            uj3Var.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    ij3Var.setIsEditing(false);
                    uj3Var.d5(false);
                    return;
                } else if (i == 1) {
                    if (uj3Var.getParentActivity() != null) {
                        xea.w = true;
                        xea.x();
                        int[] iArr = new int[2];
                        uj3Var.g0.getLocationInWindow(iArr);
                        ((LaunchActivity) uj3Var.getParentActivity()).K0(false, true, (uj3Var.g0.getMeasuredWidth() / 2) + iArr[0], (uj3Var.g0.getMeasuredHeight() / 2) + iArr[1], new zg3(this, (byte) 5));
                        uj3Var.getNotificationsController().Y();
                        uj3Var.U2();
                        return;
                    }
                    return;
                } else if (i == 3) {
                    uj3Var.k5(true, true, true, false);
                    uj3Var.Z.b(true);
                    return;
                } else if (i == 11) {
                    uj3Var.E4(uj3Var.F1);
                    return;
                } else if (i == 109) {
                    ah4 ah4Var = new ah4(uj3Var, arrayList);
                    ah4Var.t1 = new ht2(this, (byte) 26);
                    uj3Var.showDialog(ah4Var);
                    return;
                } else if (i == 110) {
                    ac7 ac7Var = (ac7) uj3Var.getMessagesController().T0().get(uj3Var.f0[0].h);
                    ArrayList E0 = ah4.E0(uj3Var, ac7Var, arrayList, false, false);
                    if (ac7Var != null) {
                        i3 = ac7Var.i.size();
                    } else {
                        i3 = 0;
                    }
                    if (E0.size() + i3 > 100) {
                        uj3Var.showDialog(jj.K(uj3Var.getParentActivity(), ob6.M0(2131750775, null), ob6.M0(2131750776, null)).a);
                        return;
                    }
                    if (!E0.isEmpty()) {
                        ArrayList arrayList3 = ac7Var.i;
                        LongSparseIntArray longSparseIntArray = ac7Var.j;
                        arrayList3.addAll(E0);
                        for (int i5 = 0; i5 < E0.size(); i5++) {
                            Long l = (Long) E0.get(i5);
                            ac7Var.h.remove(l);
                            longSparseIntArray.delete(l.longValue());
                        }
                        if (ac7Var.c()) {
                            ac7Var.i.clear();
                        }
                        nf4.z0(ac7Var, ac7Var.g, ac7Var.b, ac7Var.c, ac7Var.n, ac7Var.m, ac7Var.h, ac7Var.i, longSparseIntArray, false, false, true, false, false, uj3Var, null);
                    }
                    if (E0.size() == 1) {
                        j = ((Long) E0.get(0)).longValue();
                    } else {
                        j = 0;
                    }
                    UndoView w3 = uj3Var.w3();
                    if (w3 != null) {
                        w3.k(j, 21, Integer.valueOf(E0.size()), ac7Var, null, null);
                    }
                    uj3Var.A3(false);
                    return;
                } else if (i == 100 || i == 101 || i == 102 || i == 103 || i == 104 || i == 105 || i == 106 || i == 107 || i == 108) {
                    uj3Var.K4(uj3Var.K2, i, true, false, null);
                    return;
                } else {
                    return;
                }
            case 14:
                ru3 ru3Var = (ru3) obj;
                int i6 = ru3Var.x;
                ArrayList arrayList4 = ru3Var.e;
                int i7 = ru3Var.y;
                if (i == -1) {
                    if (ru3Var.E == null) {
                        ru3Var.b0();
                        return;
                    } else {
                        ru3Var.finishFragment();
                        return;
                    }
                } else if (i == 1 && ru3Var.getParentActivity() != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                        arrayList5.add(if7.a(((Long) arrayList4.get(i8)).longValue(), 0L));
                    }
                    jf7 messagesStorage = ru3Var.getMessagesStorage();
                    messagesStorage.a.c(new de7(messagesStorage, i7, arrayList5, (byte) 1));
                    SharedPreferences.Editor edit2 = ru3Var.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    String k = uh9.k(i7, "account");
                    i4 = ((e) ru3Var).currentAccount;
                    edit2.putInt(k, i4);
                    edit2.putInt("type" + i7, i6);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(ru3Var.getParentActivity());
                    if (i6 == 0) {
                        ChatsWidgetProvider.a(ru3Var.getParentActivity(), appWidgetManager, i7);
                    } else {
                        ContactsWidgetProvider.a(ru3Var.getParentActivity(), appWidgetManager, i7);
                    }
                    nu3 nu3Var = ru3Var.E;
                    if (nu3Var != null) {
                        nu3Var.h();
                        return;
                    } else {
                        ru3Var.b0();
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                if (i == -1) {
                    ((h34) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                je4 je4Var = (je4) obj;
                if (i == -1) {
                    if (je4Var.Y(true)) {
                        je4Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    je4Var.g0();
                    return;
                } else {
                    return;
                }
            case 17:
                nf4 nf4Var = (nf4) obj;
                if (i == -1) {
                    if (nf4Var.j0(true)) {
                        nf4Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    nf4Var.w0();
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
                wt4 wt4Var = (wt4) obj;
                if (i == -1) {
                    Runnable runnable = wt4Var.W;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i >= 10) {
                    wt4Var.e((do6) wt4Var.h0.get(i - 10), false);
                    return;
                } else {
                    return;
                }
            case 20:
                if (i == -1) {
                    ((bx4) obj).dismiss();
                    return;
                }
                return;
            case 21:
                if (i == -1) {
                    ((yx4) obj).dismiss();
                    return;
                }
                return;
            case 22:
                if (i == -1) {
                    ((m15) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                r55 r55Var = (r55) obj;
                if (i == -1) {
                    if (r55Var.onBackPressed(true)) {
                        r55Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    r55Var.b0();
                    return;
                } else {
                    return;
                }
            case 24:
                rc5 rc5Var = (rc5) obj;
                if (i == -1) {
                    if (rc5Var.g0(true)) {
                        rc5Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    rc5Var.r0();
                    return;
                } else {
                    return;
                }
            case 25:
                if (i == -1) {
                    ((xc5) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i == -1) {
                    ((dd5) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i == -1) {
                    ((nd5) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i == -1) {
                    ((ue5) obj).finishFragment();
                    return;
                }
                return;
            default:
                ng5 ng5Var = (ng5) obj;
                if (i == -1) {
                    if (ng5.c0(ng5Var).z()) {
                        ng5.d0(ng5Var).y();
                        ng5Var.w.clear();
                        hl.d0(ng5Var.a, new bm0((byte) 16));
                        return;
                    }
                    ng5Var.finishFragment();
                    return;
                }
                return;
        }
    }
}
