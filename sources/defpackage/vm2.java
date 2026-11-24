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
public final class vm2 extends c6 {
    public final byte a;
    public final Object b;

    public vm2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(int i) {
        int i2;
        pha phaVar;
        hi3 hi3Var;
        int i3;
        long j;
        a aVar;
        a aVar2;
        int i4;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((xm2) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i == -1) {
                    ((en2) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i == -1) {
                    ((pn2) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                eo2 eo2Var = ((xn2) obj).n;
                if (i == -1) {
                    if (eo2Var.H1) {
                        eo2Var.dismiss();
                        return;
                    }
                    eo2Var.u1.d.g3.O(false);
                    eo2Var.n1.E(0);
                    return;
                } else if (i == 3) {
                    eo2Var.m1.a(true, true);
                    eo2Var.r0(false);
                    eo2Var.M1 = null;
                    eo2Var.A1.g3.O(true);
                    eo2Var.y1.r.getText().clear();
                    eo2Var.y1.r.requestFocus();
                    gl.E3(eo2Var.y1.r);
                    return;
                } else {
                    return;
                }
            case 4:
                eo2 eo2Var2 = ((yn2) obj).r;
                if (i == 2) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", eo2Var2.o1);
                    eo2Var2.t1.presentFragment(new en2(bundle));
                    eo2Var2.dismiss();
                    return;
                } else if (i == 3) {
                    eo2Var2.l1.a(true, true);
                    eo2Var2.r0(false);
                    TextUtils.isEmpty(eo2Var2.L1);
                    eo2Var2.L1 = null;
                    eo2Var2.z1.h(0L, eo2Var2.o1, 0L, 0L, null, false, null, true);
                    eo2Var2.x1.r.getText().clear();
                    eo2Var2.x1.r.requestFocus();
                    gl.E3(eo2Var2.x1.r);
                    return;
                } else {
                    return;
                }
            case 5:
                eo2 eo2Var3 = ((xn2) obj).n;
                if (i == -1) {
                    eo2Var3.u1.d.g3.O(false);
                    eo2Var3.n1.E(0);
                    return;
                }
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i == -1) {
                    phaVar = ((d) contactsActivity).simpleActionBar;
                    if (phaVar.x()) {
                        contactsActivity.h0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i == 100) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, contactsActivity.getResourceProvider(), contactsActivity.getParentActivity());
                    vf6 vf6Var = contactsActivity.a0;
                    int m = vf6Var.m();
                    hd hdVar = alertDialog$Builder.a;
                    if (m == 1) {
                        hdVar.S = k96.M0(2131751538, null);
                        hdVar.U = k96.M0(2131751539, null);
                    } else {
                        hdVar.S = k96.G(vf6Var.m(), "DeleteContactsTitle", new Object[0]);
                        hdVar.U = k96.M0(2131751537, null);
                    }
                    alertDialog$Builder.j(k96.M0(2131751586, null), new mt2(contactsActivity));
                    alertDialog$Builder.g(k96.M0(2131752577, null), new k32((byte) 23));
                    hdVar.show();
                    hdVar.h();
                    return;
                } else if (i == 1) {
                    gba.H0 = !gba.H0;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putBoolean("sortContactsByName", gba.H0);
                    edit.apply();
                    contactsActivity.r = gba.H0;
                    xha xhaVar = contactsActivity.n;
                    if (xhaVar != null) {
                        ry8 iconView = xhaVar.getIconView();
                        if (contactsActivity.r) {
                            i2 = 2131232107;
                        } else {
                            i2 = 2131232106;
                        }
                        gl.L3(iconView, i2);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(s33.g).withEndAction(new kt2(contactsActivity, (byte) 0));
                    contactsActivity.f0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 7:
                if (i == -1) {
                    ((qx2) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i == -1) {
                    ((h83) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i == -1) {
                    ((hf3) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                cj3 cj3Var = (cj3) obj;
                ArrayList arrayList = cj3Var.K2;
                if ((i == 201 || i == 200 || i == 202 || i == 203) && (hi3Var = cj3Var.D0) != null) {
                    HashMap hashMap = hi3Var.C0;
                    cj3 cj3Var2 = hi3Var.M0;
                    if (i == 202) {
                        if (cj3Var2 != null && cj3Var2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cj3Var2.getParentActivity());
                            String G = k96.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            hd hdVar2 = alertDialog$Builder2.a;
                            hdVar2.S = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) gl.S2(k96.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) k96.M0(2131746126, null));
                            hdVar2.U = spannableStringBuilder;
                            alertDialog$Builder2.g(k96.M0(2131752577, null), new ho9((byte) 4));
                            alertDialog$Builder2.j(k96.M0(2131751586, null), new kq8(hi3Var, arrayList2, (byte) 14));
                            TextView textView = (TextView) alertDialog$Builder2.o().c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i == 203) {
                        if (hi3Var.O()) {
                            cj3Var2.showDialog(new jh8((d) cj3Var2, 2, true));
                            return;
                        }
                        return;
                    } else if (i == 200) {
                        if (hashMap.size() == 1) {
                            hi3Var.n((k27) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i == 201) {
                        cj3 cj3Var3 = new cj3(tb4.j(3, "onlySelect", "dialogsType", true));
                        cj3Var3.E2 = new wh9(hi3Var, (byte) 9);
                        cj3Var2.presentFragment(cj3Var3);
                        return;
                    } else {
                        return;
                    }
                } else if (i == -1) {
                    rh3 rh3Var = cj3Var.H3;
                    if (rh3Var != null && rh3Var.c()) {
                        aVar2 = ((d) cj3Var).actionBar;
                        if (aVar2.y()) {
                            hi3 hi3Var2 = cj3Var.D0;
                            if (hi3Var2 != null && hi3Var2.getVisibility() == 0) {
                                hi3 hi3Var3 = cj3Var.D0;
                                if (hi3Var3.B0) {
                                    hi3Var3.R(false);
                                    return;
                                }
                            }
                            cj3Var.y3(true);
                            return;
                        }
                        cj3Var.H3.a();
                        hi3 hi3Var4 = cj3Var.D0;
                        if (hi3Var4 != null) {
                            hi3Var4.S();
                            return;
                        }
                        return;
                    }
                    qi3 qi3Var = cj3Var.A0;
                    if (qi3Var == null || !qi3Var.n) {
                        aVar = ((d) cj3Var).actionBar;
                        if (aVar.y()) {
                            hi3 hi3Var5 = cj3Var.D0;
                            if (hi3Var5 != null && hi3Var5.getVisibility() == 0) {
                                hi3 hi3Var6 = cj3Var.D0;
                                if (hi3Var6.B0) {
                                    hi3Var6.R(false);
                                    return;
                                }
                            }
                            cj3Var.y3(true);
                            return;
                        } else if (cj3Var.n2 || cj3Var.Y2 != 0 || cj3Var.a3 != 0) {
                            cj3Var.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    qi3Var.setIsEditing(false);
                    cj3Var.Z4(false);
                    return;
                } else if (i == 1) {
                    if (cj3Var.getParentActivity() != null) {
                        gba.w = true;
                        gba.x();
                        int[] iArr = new int[2];
                        cj3Var.g0.getLocationInWindow(iArr);
                        ((LaunchActivity) cj3Var.getParentActivity()).K0(false, true, (cj3Var.g0.getMeasuredWidth() / 2) + iArr[0], (cj3Var.g0.getMeasuredHeight() / 2) + iArr[1], new mk2(this, (byte) 29));
                        cj3Var.getNotificationsController().Y();
                        cj3Var.S2();
                        return;
                    }
                    return;
                } else if (i == 3) {
                    cj3Var.g5(true, true, true, false);
                    cj3Var.Z.b(true);
                    return;
                } else if (i == 11) {
                    cj3Var.A4(cj3Var.F1);
                    return;
                } else if (i == 109) {
                    cf4 cf4Var = new cf4(cj3Var, arrayList);
                    cf4Var.t1 = new vu2(this, (byte) 24);
                    cj3Var.showDialog(cf4Var);
                    return;
                } else if (i == 110) {
                    t97 t97Var = (t97) cj3Var.getMessagesController().R0().get(cj3Var.f0[0].h);
                    ArrayList D0 = cf4.D0(cj3Var, t97Var, arrayList, false, false);
                    if (t97Var != null) {
                        i3 = t97Var.i.size();
                    } else {
                        i3 = 0;
                    }
                    if (D0.size() + i3 > 100) {
                        cj3Var.showDialog(ij.K(cj3Var.getParentActivity(), k96.M0(2131750798, null), k96.M0(2131750799, null)).a);
                        return;
                    }
                    if (!D0.isEmpty()) {
                        ArrayList arrayList3 = t97Var.i;
                        LongSparseIntArray longSparseIntArray = t97Var.j;
                        arrayList3.addAll(D0);
                        for (int i5 = 0; i5 < D0.size(); i5++) {
                            Long l = (Long) D0.get(i5);
                            t97Var.h.remove(l);
                            longSparseIntArray.delete(l.longValue());
                        }
                        if (t97Var.c()) {
                            t97Var.i.clear();
                        }
                        pd4.y0(t97Var, t97Var.g, t97Var.b, t97Var.c, t97Var.n, t97Var.m, t97Var.h, t97Var.i, longSparseIntArray, false, false, true, false, false, cj3Var, null);
                    }
                    if (D0.size() == 1) {
                        j = ((Long) D0.get(0)).longValue();
                    } else {
                        j = 0;
                    }
                    UndoView u3 = cj3Var.u3();
                    if (u3 != null) {
                        u3.k(j, 21, Integer.valueOf(D0.size()), t97Var, null, null);
                    }
                    cj3Var.y3(false);
                    return;
                } else if (i == 100 || i == 101 || i == 102 || i == 103 || i == 104 || i == 105 || i == 106 || i == 107 || i == 108) {
                    cj3Var.G4(cj3Var.K2, i, true, false, null);
                    return;
                } else {
                    return;
                }
            case 13:
                zt3 zt3Var = (zt3) obj;
                int i6 = zt3Var.x;
                ArrayList arrayList4 = zt3Var.e;
                int i7 = zt3Var.y;
                if (i == -1) {
                    if (zt3Var.E == null) {
                        zt3Var.b0();
                        return;
                    } else {
                        zt3Var.finishFragment();
                        return;
                    }
                } else if (i == 1 && zt3Var.getParentActivity() != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                        arrayList5.add(zc7.a(((Long) arrayList4.get(i8)).longValue(), 0L));
                    }
                    ad7 messagesStorage = zt3Var.getMessagesStorage();
                    messagesStorage.a.c(new za7(messagesStorage, i7, arrayList5, (byte) 0));
                    SharedPreferences.Editor edit2 = zt3Var.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    String k = de9.k(i7, "account");
                    i4 = ((d) zt3Var).currentAccount;
                    edit2.putInt(k, i4);
                    edit2.putInt("type" + i7, i6);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(zt3Var.getParentActivity());
                    if (i6 == 0) {
                        ChatsWidgetProvider.a(zt3Var.getParentActivity(), appWidgetManager, i7);
                    } else {
                        ContactsWidgetProvider.a(zt3Var.getParentActivity(), appWidgetManager, i7);
                    }
                    vt3 vt3Var = zt3Var.E;
                    if (vt3Var != null) {
                        vt3Var.m();
                        return;
                    } else {
                        zt3Var.b0();
                        return;
                    }
                } else {
                    return;
                }
            case 14:
                if (i == -1) {
                    ((m24) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                mc4 mc4Var = (mc4) obj;
                if (i == -1) {
                    if (mc4Var.Y(true)) {
                        mc4Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    mc4Var.g0();
                    return;
                } else {
                    return;
                }
            case 16:
                pd4 pd4Var = (pd4) obj;
                if (i == -1) {
                    if (pd4Var.j0(true)) {
                        pd4Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    pd4Var.v0();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                sr4 sr4Var = (sr4) obj;
                if (i == -1) {
                    Runnable runnable = sr4Var.W;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i >= 10) {
                    sr4Var.e((xl6) sr4Var.h0.get(i - 10), false);
                    return;
                } else {
                    return;
                }
            case 19:
                if (i == -1) {
                    ((xu4) obj).dismiss();
                    return;
                }
                return;
            case 20:
                if (i == -1) {
                    ((tv4) obj).dismiss();
                    return;
                }
                return;
            case 21:
                if (i == -1) {
                    ((iz4) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                o35 o35Var = (o35) obj;
                if (i == -1) {
                    if (o35Var.onBackPressed(true)) {
                        o35Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    o35Var.b0();
                    return;
                } else {
                    return;
                }
            case 23:
                qa5 qa5Var = (qa5) obj;
                if (i == -1) {
                    if (qa5Var.g0(true)) {
                        qa5Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i == 1) {
                    qa5Var.r0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i == -1) {
                    ((wa5) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i == -1) {
                    ((bb5) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i == -1) {
                    ((mb5) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i == -1) {
                    ((tc5) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                me5 me5Var = (me5) obj;
                if (i == -1) {
                    if (me5.c0(me5Var).y()) {
                        me5.d0(me5Var).x();
                        me5Var.w.clear();
                        gl.d0(me5Var.a, new bm0((byte) 16));
                        return;
                    }
                    me5Var.finishFragment();
                    return;
                }
                return;
            default:
                if (i == -1) {
                    ((xj5) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
