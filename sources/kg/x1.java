package kg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import bi.g2;
import bi.t6;
import bi.v3;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.v00;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.y80;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.cu;
import org.telegram.ui.ev;
import org.telegram.ui.hw;
import org.telegram.ui.k31;
import org.telegram.ui.k50;
import org.telegram.ui.l50;
import org.telegram.ui.lb;
import org.telegram.ui.mq;
import org.telegram.ui.nw;
import org.telegram.ui.oy0;
import org.telegram.ui.pa0;
import org.telegram.ui.q91;
import org.telegram.ui.qq;
import org.telegram.ui.rc1;
import org.telegram.ui.so;
import org.telegram.ui.sq;
import org.telegram.ui.to;
import org.telegram.ui.ts;
import org.telegram.ui.u91;
import org.telegram.ui.uw;
import org.telegram.ui.v50;
import org.telegram.ui.xw;
import org.telegram.ui.y50;
import org.telegram.ui.yw;
public final class x1 extends org.telegram.ui.ActionBar.m0 {
    public final int f18139a;
    public final Object f18140b;

    public x1(Object obj, int i7) {
        this.f18139a = i7;
        this.f18140b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f18139a) {
            case 11:
                yw ywVar = (yw) this.f18140b;
                org.telegram.ui.ActionBar.q0 q0Var = ywVar.F1;
                if (q0Var != null) {
                    q0Var.setVisibility(0);
                }
                if (ywVar.f53721p2 != null) {
                    ywVar.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((bn0) this.f18140b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f18139a) {
            case 11:
                yw ywVar = (yw) this.f18140b;
                kVar = ((e2) ywVar).actionBar;
                if (!kVar.x() && ywVar.S3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f18139a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f18140b;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    d5 d5Var = profileActivity.U0;
                    d5Var.f29502e.clearFocus();
                    org.telegram.messenger.g0.v1(d5Var.f29502e);
                }
                if (profileActivity.X1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.X1);
            default:
                return super.e();
        }
    }

    @Override
    public void f() {
        switch (this.f18139a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f18140b;
                rc1 rc1Var = wallpapersListActivity.I;
                rc1Var.f50922n = null;
                rc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(hd.M0(2131745816, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        ri.q qVar;
        int i7 = this.f18139a;
        pz pzVar = null;
        Object obj = this.f18140b;
        switch (i7) {
            case 0:
                y1 y1Var = (y1) obj;
                y1Var.d = false;
                y1Var.f18150e = null;
                y1Var.f18147a.f39895g3.O(true);
                y1Var.f18147a.v0(0);
                return;
            case 1:
                lb lbVar = (lb) obj;
                lbVar.f48959w0 = "";
                lbVar.J.setVisibility(0);
                if (lbVar.V) {
                    lbVar.V = false;
                    lbVar.Z0(true);
                    return;
                }
                return;
            case 2:
                to toVar = (to) obj;
                toVar.f51620e.F(null);
                toVar.O = false;
                toVar.getClass();
                toVar.f51618b.setAdapter(toVar.f51617a);
                toVar.f51617a.f();
                toVar.f51618b.setFastScrollVisible(true);
                toVar.f51618b.setVerticalScrollBarEnabled(false);
                toVar.d.setShowAtCenter(false);
                toVar.d.b();
                return;
            case 3:
                qq qqVar = (qq) obj;
                qqVar.f50720e.F(null);
                qqVar.f50741o1 = false;
                di.c1 c1Var = qqVar.f50715c;
                c1Var.X1 = false;
                c1Var.Y1 = 0;
                c1Var.setAdapter(qqVar.f50709a);
                qqVar.f50709a.f();
                qqVar.f50715c.setFastScrollVisible(true);
                qqVar.f50715c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.f51259n = null;
                v3 v3Var = sqVar.f38882a;
                if (v3Var != null) {
                    v3Var.f39895g3.O(true);
                    return;
                }
                return;
            case 5:
                y7 y7Var = (y7) obj;
                if (y7Var.f41914r1) {
                    y7Var.f41912q1 = false;
                    y7Var.f41914r1 = false;
                    y7Var.f29713r0 = true;
                    y7Var.f41920u1.E(null);
                    org.telegram.ui.ActionBar.q0 q0Var = y7Var.f41897e2;
                    if (q0Var != null) {
                        q0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                dk dkVar = (dk) obj;
                dkVar.f33959c0 = false;
                dkVar.H.setVisibility(0);
                rj rjVar = dkVar.f33965r;
                v4.h0 adapter = rjVar.getAdapter();
                vj vjVar = dkVar.f33967w;
                if (adapter != vjVar) {
                    rjVar.setAdapter(vjVar);
                }
                vjVar.f();
                dkVar.E.Y(null, true);
                return;
            case 7:
                dl dlVar = (dl) obj;
                dlVar.f33977d0 = false;
                dlVar.f33978e0 = false;
                dlVar.O.G(null);
                dlVar.j0();
                dlVar.M.setVisibility(0);
                dlVar.K.setVisibility(0);
                dlVar.N.setVisibility(8);
                dlVar.f33993s.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f42537c0 = null;
                contactsActivity.E = false;
                contactsActivity.f42556y = false;
                contactsActivity.d.setAdapter(contactsActivity.f42534b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f42534b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 9:
                ts tsVar = (ts) obj;
                vj vjVar2 = tsVar.d;
                vjVar2.getClass();
                vjVar2.f40444e = null;
                tsVar.f51661f = false;
                tsVar.f51660e = false;
                tsVar.f51657a.setAdapter(tsVar.f51659c);
                tsVar.f51657a.setFastScrollVisible(true);
                return;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.f46245a.getActionBar().n(false);
                cuVar.f46246b.getActionBar().n(false);
                return;
            case 11:
                yw ywVar = (yw) obj;
                nw nwVar = ywVar.Y;
                if (nwVar != null) {
                    ArrayList arrayList = nwVar.G;
                    if (!arrayList.isEmpty() && nwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((ev) nwVar.I).g((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                ywVar.f53703l2 = false;
                ywVar.f53707m2 = false;
                xw xwVar = ywVar.f53673f0[0];
                if (xwVar != null) {
                    uw uwVar = xwVar.f53331a;
                    if (ywVar.Y2 == 0) {
                        pzVar = xwVar.f53340x;
                    }
                    uwVar.setEmptyView(pzVar);
                    ywVar.a5(false, false, true, false);
                }
                ywVar.m5(false, false);
                ns.e().k(268, Boolean.TRUE);
                ywVar.Y.setCloseButtonVisible(false);
                ywVar.l5(true);
                ywVar.N3();
                qVar = ((e2) ywVar).glassEngine;
                qVar.g();
                return;
            case 12:
                l50 l50Var = (l50) obj;
                if (l50Var.N) {
                    k50.E(l50Var.f48849f, null);
                    l50Var.N = false;
                    l50Var.d.setAdapter(l50Var.f48848e);
                    return;
                }
                return;
            case 13:
                y50.d0((y50) obj);
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f42616b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f42616b.setAdapter(languageSelectActivity.f42615a);
                    return;
                }
                return;
            case 15:
                pa0 pa0Var = (pa0) obj;
                pa0Var.f50219u0 = false;
                pa0Var.f50220v0 = false;
                pa0Var.T.G(null);
                pa0Var.L0();
                d5 d5Var = pa0Var.W;
                if (d5Var != null) {
                    d5Var.setVisibility(0);
                }
                pa0Var.R.setVisibility(0);
                pa0Var.P.setVisibility(0);
                pa0Var.S.setAdapter(null);
                pa0Var.S.setVisibility(8);
                pa0Var.K0(false);
                return;
            case 16:
                y80 y80Var = (y80) ((t6) obj).f3882b;
                y80Var.f61463y = false;
                y80Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f42675f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f42673c.setText(hd.M0(2131748211, "NoExceptions"));
                notificationsCustomSettingsActivity.f42671a.setAdapter(notificationsCustomSettingsActivity.f42672b);
                notificationsCustomSettingsActivity.f42672b.f();
                notificationsCustomSettingsActivity.f42671a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f42671a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f42673c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                oy0 oy0Var = (oy0) obj;
                oy0Var.f50088f = null;
                if (oy0Var.f50085b != null) {
                    oy0Var.d.setVisibility(8);
                    oy0Var.f50085b.setAdapter(oy0Var.f50084a);
                    return;
                }
                return;
            case 21:
                k31 k31Var = (k31) obj;
                k31Var.f48561a.a(false, true);
                k31Var.o0(false, true);
                k31Var.f48565c.f39895g3.O(false);
                return;
            case 22:
                u91.f0((u91) obj, false);
                return;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.G.setAdapter(wallpapersListActivity.H);
                wallpapersListActivity.G.invalidate();
                wallpapersListActivity.I.E(null, true);
                wallpapersListActivity.K.setSearchFieldCaption(null);
                f();
                return;
        }
    }

    @Override
    public void i() {
        throw new UnsupportedOperationException("Method not decompiled: kg.x1.i():void");
    }

    @Override
    public void j(jg.o0 o0Var) {
        switch (this.f18139a) {
            case 6:
                dk dkVar = (dk) this.f18140b;
                ck ckVar = dkVar.E;
                ckVar.S.remove(o0Var);
                ckVar.Y(dkVar.G.getSearchField().getText().toString(), false);
                ckVar.a0(null, null, true);
                return;
            case 22:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f18139a) {
            case 1:
                lb lbVar = (lb) this.f18140b;
                lbVar.V = true;
                lbVar.f48959w0 = editTextBoldCursor.getText().toString();
                lbVar.Z0(true);
                return;
            case 18:
                bn0 bn0Var = (bn0) this.f18140b;
                bn0Var.f45790a.getActionBar().B();
                bn0Var.f45791b.getActionBar().B();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        uj0 uj0Var;
        int b10;
        di.c1 c1Var;
        hw hwVar;
        cm0 cm0Var;
        v4.h0 h0Var;
        int i7 = this.f18139a;
        boolean z10 = true;
        Object obj = this.f18140b;
        switch (i7) {
            case 0:
                y1 y1Var = (y1) obj;
                y1Var.f18150e = editText.getText().toString();
                y1Var.f18147a.f39895g3.O(true);
                y1Var.f18147a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                to toVar = (to) obj;
                if (toVar.f51620e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (uj0Var = toVar.f51618b) != null) {
                        v4.h0 adapter = uj0Var.getAdapter();
                        so soVar = toVar.f51620e;
                        if (adapter != soVar) {
                            toVar.f51618b.setAdapter(soVar);
                            toVar.f51620e.f();
                            toVar.f51618b.setFastScrollVisible(false);
                            toVar.f51618b.setVerticalScrollBarEnabled(true);
                            toVar.d.b();
                        }
                    }
                    toVar.f51620e.F(obj2);
                    return;
                }
                return;
            case 3:
                qq qqVar = (qq) obj;
                if (qqVar.f50720e != null) {
                    String obj3 = editText.getText().toString();
                    if (qqVar.f50715c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = qqVar.f50715c.getAdapter().b();
                    }
                    qqVar.f50720e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (c1Var = qqVar.f50715c) != null) {
                        v4.h0 adapter2 = c1Var.getAdapter();
                        mq mqVar = qqVar.f50709a;
                        if (adapter2 != mqVar) {
                            di.c1 c1Var2 = qqVar.f50715c;
                            c1Var2.X1 = false;
                            c1Var2.Y1 = 0;
                            c1Var2.setAdapter(mqVar);
                            if (b10 == 0) {
                                qqVar.D0(0);
                            }
                        }
                    }
                    qqVar.D1.setVisibility(8);
                    qqVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.f51259n = editText.getText().toString();
                v3 v3Var = sqVar.f38882a;
                if (v3Var != null) {
                    v3Var.f39895g3.O(true);
                    return;
                }
                return;
            case 5:
                y7 y7Var = (y7) obj;
                if (editText.length() > 0) {
                    y7Var.f41920u1.E(editText.getText().toString());
                    return;
                }
                y7Var.f41912q1 = false;
                y7Var.f41920u1.E(null);
                return;
            case 6:
                ((dk) obj).E.Y(editText.getText().toString(), false);
                return;
            case 7:
                dl dlVar = (dl) obj;
                g2 g2Var = dlVar.K;
                di.c1 c1Var3 = dlVar.M;
                uj0 uj0Var2 = dlVar.N;
                bl blVar = dlVar.O;
                if (blVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        dlVar.f33978e0 = true;
                        dlVar.f34000x.setShowSearchProgress(true);
                        c1Var3.setVisibility(8);
                        g2Var.setVisibility(8);
                        if (uj0Var2.getAdapter() != blVar) {
                            uj0Var2.setAdapter(blVar);
                        }
                        uj0Var2.setVisibility(0);
                        dlVar.f33979f0 = blVar.f17023f.isEmpty();
                        dlVar.j0();
                    } else {
                        c1Var3.setVisibility(0);
                        g2Var.setVisibility(0);
                        uj0Var2.setAdapter(null);
                        uj0Var2.setVisibility(8);
                        dlVar.f33993s.setVisibility(8);
                    }
                    blVar.G(obj4);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f42537c0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f42556y = true;
                        uj0 uj0Var3 = contactsActivity.d;
                        if (uj0Var3 != null) {
                            uj0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f42536c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f42556y = false;
                    contactsActivity.h.G(null);
                    uj0 uj0Var4 = contactsActivity.d;
                    if (uj0Var4 != null) {
                        uj0Var4.setAdapter(contactsActivity.f42534b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ts tsVar = (ts) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    vj vjVar = tsVar.d;
                    vjVar.getClass();
                    vjVar.f40444e = null;
                    tsVar.f51660e = false;
                    tsVar.f51657a.setAdapter(tsVar.f51659c);
                    tsVar.f51657a.setFastScrollVisible(true);
                    return;
                }
                vj vjVar2 = tsVar.d;
                vjVar2.getClass();
                if (obj6 == null) {
                    vjVar2.f40444e = null;
                } else {
                    try {
                        Timer timer = (Timer) vjVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    vjVar2.h = timer2;
                    timer2.schedule(new jg.q1(2, vjVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    tsVar.f51660e = true;
                    return;
                }
                return;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.f46245a.getActionBar().setSearchFieldText(editText.getText().toString());
                cuVar.f46246b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                yw ywVar = (yw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((hwVar = ywVar.D0) != null && (cm0Var = hwVar.f36050e0) != null && cm0Var.M()) || ywVar.f53754v3 || ywVar.L)) {
                    ywVar.f53707m2 = true;
                    if (!ywVar.f53739s3) {
                        ywVar.a5(true, false, true, false);
                    }
                }
                hw hwVar2 = ywVar.D0;
                if (hwVar2 != null) {
                    View currentView = hwVar2.getCurrentView();
                    boolean z11 = !hwVar2.f36053h0;
                    if (!TextUtils.isEmpty(hwVar2.N0)) {
                        z10 = z11;
                    }
                    hwVar2.N0 = obj7;
                    hwVar2.O(currentView, hwVar2.getCurrentPosition(), obj7, z10);
                    return;
                }
                return;
            case 12:
                String obj8 = editText.getText().toString();
                l50 l50Var = (l50) obj;
                k50.E(l50Var.f48849f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z12 = !isEmpty;
                if (z12 != l50Var.N) {
                    l50Var.N = z12;
                    uj0 uj0Var5 = l50Var.d;
                    if (uj0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = l50Var.f48849f;
                        } else {
                            h0Var = l50Var.f48848e;
                        }
                        uj0Var5.setAdapter(h0Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                y50 y50Var = (y50) obj;
                if (editText.length() != 0) {
                    y50Var.f53427y = true;
                    v50 v50Var = y50Var.f53424s;
                    if (!v50Var.h) {
                        v50Var.h = true;
                        v50Var.f();
                    }
                    y50Var.f53424s.E(editText.getText().toString());
                    y50Var.h.setFastScrollVisible(false);
                    y50Var.h.setVerticalScrollBarEnabled(true);
                    y50Var.f53423r.e(true, true);
                    y50Var.f53423r.setStickerType(1);
                    y50Var.f53423r.d.setText(hd.M0(2131748167, null));
                    y50Var.f53423r.f33707e.setText(hd.M0(2131745807, null));
                    return;
                }
                y50.d0(y50Var);
                return;
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    uj0 uj0Var6 = languageSelectActivity.f42616b;
                    if (uj0Var6 != null) {
                        uj0Var6.setAdapter(languageSelectActivity.f42617c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f42616b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f42616b.setAdapter(languageSelectActivity.f42615a);
                    return;
                }
                return;
            case 15:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        pa0Var.f50220v0 = true;
                        pa0Var.f50214r.setShowSearchProgress(true);
                        d5 d5Var = pa0Var.W;
                        if (d5Var != null) {
                            d5Var.setVisibility(8);
                        }
                        pa0Var.R.setVisibility(8);
                        pa0Var.P.setVisibility(8);
                        v4.h0 adapter3 = pa0Var.S.getAdapter();
                        bl blVar2 = pa0Var.T;
                        if (adapter3 != blVar2) {
                            pa0Var.S.setAdapter(blVar2);
                        }
                        pa0Var.S.setVisibility(0);
                        if (pa0Var.T.b() != 0) {
                            z10 = false;
                        }
                        pa0Var.f50222w0 = z10;
                    } else {
                        d5 d5Var2 = pa0Var.W;
                        if (d5Var2 != null) {
                            d5Var2.setVisibility(0);
                        }
                        pa0Var.R.setVisibility(0);
                        pa0Var.P.setVisibility(0);
                        pa0Var.S.setAdapter(null);
                        pa0Var.S.setVisibility(8);
                    }
                    pa0Var.L0();
                    pa0Var.M0();
                    pa0Var.T.G(obj10);
                    return;
                }
                return;
            case 16:
                ((y80) ((t6) obj).f3882b).j(editText.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f42671a != null) {
                            notificationsCustomSettingsActivity.f42673c.setText(hd.M0(2131748167, "NoResult"));
                            notificationsCustomSettingsActivity.f42673c.b();
                            notificationsCustomSettingsActivity.f42671a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f42671a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f42671a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                bn0 bn0Var = (bn0) obj;
                bn0Var.f45790a.getActionBar().setSearchFieldText(editText.getText().toString());
                bn0Var.f45791b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).f43092e.I(editText.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editText.getText().toString();
                oy0 oy0Var = (oy0) obj;
                if (obj12 == null) {
                    oy0Var.f50088f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = oy0Var.f50088f;
                    if (arrayList == null) {
                        oy0Var.f50088f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < oy0Var.h.size(); i10++) {
                        v00 v00Var = (v00) oy0Var.h.get(i10);
                        if (v00Var.d.startsWith(lowerCase)) {
                            oy0Var.f50088f.add(0, v00Var);
                        } else if (v00Var.d.contains(lowerCase)) {
                            oy0Var.f50088f.add(v00Var);
                        }
                    }
                    oy0Var.f50086c.f();
                }
                if (obj12.length() != 0) {
                    uj0 uj0Var7 = oy0Var.f50085b;
                    if (uj0Var7 != null) {
                        uj0Var7.setAdapter(oy0Var.f50086c);
                        return;
                    }
                    return;
                } else if (oy0Var.f50085b != null) {
                    oy0Var.d.setVisibility(8);
                    oy0Var.f50085b.setAdapter(oy0Var.f50084a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((k31) obj).f48570f.I(editText.getText().toString());
                return;
            case 22:
                String obj13 = editText.getText().toString();
                q91 q91Var = ((u91) obj).f51874s0;
                if (!q91Var.f50522e0.equals(obj13)) {
                    q91Var.K(q91Var.f41297e[0], q91Var.getCurrentPosition(), obj13, false);
                    return;
                }
                return;
            case 23:
                ((WallpapersListActivity) obj).I.E(editText.getText().toString(), false);
                return;
        }
    }

    private final void q(jg.o0 o0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
