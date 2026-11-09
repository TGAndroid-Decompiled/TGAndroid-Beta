package kg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import bi.e5;
import bi.w4;
import fi.w3;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.b60;
import org.telegram.ui.cn0;
import org.telegram.ui.cu;
import org.telegram.ui.fv;
import org.telegram.ui.hw;
import org.telegram.ui.mb;
import org.telegram.ui.mq;
import org.telegram.ui.n31;
import org.telegram.ui.n50;
import org.telegram.ui.nw;
import org.telegram.ui.o50;
import org.telegram.ui.qq;
import org.telegram.ui.ra0;
import org.telegram.ui.sq;
import org.telegram.ui.ss;
import org.telegram.ui.to;
import org.telegram.ui.ty0;
import org.telegram.ui.u91;
import org.telegram.ui.uo;
import org.telegram.ui.uw;
import org.telegram.ui.vc1;
import org.telegram.ui.xw;
import org.telegram.ui.y50;
import org.telegram.ui.y91;
import org.telegram.ui.yw;
public final class v1 extends org.telegram.ui.ActionBar.n0 {
    public final int f17563a;
    public final Object f17564b;

    public v1(Object obj, int i7) {
        this.f17563a = i7;
        this.f17564b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f17563a) {
            case 11:
                yw ywVar = (yw) this.f17564b;
                org.telegram.ui.ActionBar.r0 r0Var = ywVar.E1;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                if (ywVar.f52281o2 != null) {
                    ywVar.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((cn0) this.f17564b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f17563a) {
            case 11:
                yw ywVar = (yw) this.f17564b;
                kVar = ((f2) ywVar).actionBar;
                if (!kVar.w() && ywVar.R3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f17563a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f17564b;
                boolean z9 = profileActivity.V1;
                profileActivity.V1 = !z9;
                if (z9) {
                    f5 f5Var = profileActivity.T0;
                    f5Var.f28430e.clearFocus();
                    org.telegram.messenger.g0.v1(f5Var.f28430e);
                }
                if (profileActivity.V1) {
                    profileActivity.T0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.V1);
            default:
                return super.e();
        }
    }

    @Override
    public void f() {
        switch (this.f17563a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f17564b;
                vc1 vc1Var = wallpapersListActivity.H;
                vc1Var.f50647n = null;
                vc1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(id.M0(2131745816, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        oi.q qVar;
        int i7 = this.f17563a;
        mz mzVar = null;
        Object obj = this.f17564b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.d = false;
                w1Var.f17573e = null;
                w1Var.f17570a.f37556f3.O(true);
                w1Var.f17570a.v0(0);
                return;
            case 1:
                mb mbVar = (mb) obj;
                mbVar.f47833v0 = "";
                mbVar.I.setVisibility(0);
                if (mbVar.U) {
                    mbVar.U = false;
                    mbVar.Z0(true);
                    return;
                }
                return;
            case 2:
                uo uoVar = (uo) obj;
                uoVar.f50434e.F(null);
                uoVar.N = false;
                uoVar.getClass();
                uoVar.f50432b.setAdapter(uoVar.f50431a);
                uoVar.f50431a.f();
                uoVar.f50432b.setFastScrollVisible(true);
                uoVar.f50432b.setVerticalScrollBarEnabled(false);
                uoVar.d.setShowAtCenter(false);
                uoVar.d.b();
                return;
            case 3:
                qq qqVar = (qq) obj;
                qqVar.f49126e.F(null);
                qqVar.n1 = false;
                bi.q1 q1Var = qqVar.f49121c;
                q1Var.W1 = false;
                q1Var.X1 = 0;
                q1Var.setAdapter(qqVar.f49115a);
                qqVar.f49115a.f();
                qqVar.f49121c.setFastScrollVisible(true);
                qqVar.f49121c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.f49975n = null;
                w3 w3Var = sqVar.f36649a;
                if (w3Var != null) {
                    w3Var.f37556f3.O(true);
                    return;
                }
                return;
            case 5:
                b8 b8Var = (b8) obj;
                if (b8Var.n1) {
                    b8Var.f32139m1 = false;
                    b8Var.n1 = false;
                    b8Var.f28649q0 = true;
                    b8Var.f32146q1.E(null);
                    org.telegram.ui.ActionBar.r0 r0Var = b8Var.f32125a2;
                    if (r0Var != null) {
                        r0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                vj vjVar = (vj) obj;
                vjVar.f39107b0 = false;
                vjVar.G.setVisibility(0);
                kj kjVar = vjVar.f39113r;
                v4.g0 adapter = kjVar.getAdapter();
                oj ojVar = vjVar.f39115w;
                if (adapter != ojVar) {
                    kjVar.setAdapter(ojVar);
                }
                ojVar.f();
                vjVar.D.Y(null, true);
                return;
            case 7:
                wk wkVar = (wk) obj;
                wkVar.f40067c0 = false;
                wkVar.f40068d0 = false;
                wkVar.N.G(null);
                wkVar.j0();
                wkVar.L.setVisibility(0);
                wkVar.J.setVisibility(0);
                wkVar.M.setVisibility(8);
                wkVar.f40084s.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f41189b0 = null;
                contactsActivity.D = false;
                contactsActivity.f41209y = false;
                contactsActivity.d.setAdapter(contactsActivity.f41188b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f41188b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 9:
                ss ssVar = (ss) obj;
                oj ojVar2 = ssVar.d;
                ojVar2.getClass();
                ojVar2.f36728e = null;
                ssVar.f49985f = false;
                ssVar.f49984e = false;
                ssVar.f49981a.setAdapter(ssVar.f49983c);
                ssVar.f49981a.setFastScrollVisible(true);
                return;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.f44752a.getActionBar().m(false);
                cuVar.f44753b.getActionBar().m(false);
                return;
            case 11:
                yw ywVar = (yw) obj;
                nw nwVar = ywVar.X;
                if (nwVar != null) {
                    ArrayList arrayList = nwVar.F;
                    if (!arrayList.isEmpty() && nwVar.H != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((fv) nwVar.H).h((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                ywVar.f52263k2 = false;
                ywVar.f52267l2 = false;
                xw xwVar = ywVar.f52231e0[0];
                if (xwVar != null) {
                    uw uwVar = xwVar.f51772a;
                    if (ywVar.X2 == 0) {
                        mzVar = xwVar.f51781x;
                    }
                    uwVar.setEmptyView(mzVar);
                    ywVar.a5(false, false, true, false);
                }
                ywVar.m5(false, false);
                qs.e().k(268, Boolean.TRUE);
                ywVar.X.setCloseButtonVisible(false);
                ywVar.l5(true);
                ywVar.N3();
                qVar = ((f2) ywVar).glassEngine;
                qVar.g();
                return;
            case 12:
                o50 o50Var = (o50) obj;
                if (o50Var.M) {
                    n50.E(o50Var.f48344f, null);
                    o50Var.M = false;
                    o50Var.d.setAdapter(o50Var.f48343e);
                    return;
                }
                return;
            case 13:
                b60.d0((b60) obj);
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f41255b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f41255b.setAdapter(languageSelectActivity.f41254a);
                    return;
                }
                return;
            case 15:
                ra0 ra0Var = (ra0) obj;
                ra0Var.f49384t0 = false;
                ra0Var.f49385u0 = false;
                ra0Var.S.G(null);
                ra0Var.L0();
                f5 f5Var = ra0Var.V;
                if (f5Var != null) {
                    f5Var.setVisibility(0);
                }
                ra0Var.Q.setVisibility(0);
                ra0Var.O.setVisibility(0);
                ra0Var.R.setAdapter(null);
                ra0Var.R.setVisibility(8);
                ra0Var.K0(false);
                return;
            case 16:
                x80 x80Var = (x80) ((w4) obj).f4960b;
                x80Var.f59573y = false;
                x80Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f41314f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f41312c.setText(id.M0(2131748211, "NoExceptions"));
                notificationsCustomSettingsActivity.f41310a.setAdapter(notificationsCustomSettingsActivity.f41311b);
                notificationsCustomSettingsActivity.f41311b.f();
                notificationsCustomSettingsActivity.f41310a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f41310a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f41312c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                ty0 ty0Var = (ty0) obj;
                ty0Var.f50264f = null;
                if (ty0Var.f50261b != null) {
                    ty0Var.d.setVisibility(8);
                    ty0Var.f50261b.setAdapter(ty0Var.f50260a);
                    return;
                }
                return;
            case 21:
                n31 n31Var = (n31) obj;
                n31Var.f48074a.a(false, true);
                n31Var.o0(false, true);
                n31Var.f48078c.f37556f3.O(false);
                return;
            case 22:
                y91.f0((y91) obj, false);
                return;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
                wallpapersListActivity.F.invalidate();
                wallpapersListActivity.H.E(null, true);
                wallpapersListActivity.J.setSearchFieldCaption(null);
                f();
                return;
        }
    }

    @Override
    public void i() {
        throw new UnsupportedOperationException("Method not decompiled: kg.v1.i():void");
    }

    @Override
    public void j(jg.o0 o0Var) {
        switch (this.f17563a) {
            case 6:
                vj vjVar = (vj) this.f17564b;
                uj ujVar = vjVar.D;
                ujVar.R.remove(o0Var);
                ujVar.Y(vjVar.F.getSearchField().getText().toString(), false);
                ujVar.a0(null, null, true);
                return;
            case 22:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f17563a) {
            case 1:
                mb mbVar = (mb) this.f17564b;
                mbVar.U = true;
                mbVar.f47833v0 = editTextBoldCursor.getText().toString();
                mbVar.Z0(true);
                return;
            case 18:
                cn0 cn0Var = (cn0) this.f17564b;
                cn0Var.f44712a.getActionBar().A();
                cn0Var.f44713b.getActionBar().A();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        qj0 qj0Var;
        int b10;
        bi.q1 q1Var;
        hw hwVar;
        zl0 zl0Var;
        v4.g0 g0Var;
        int i7 = this.f17563a;
        boolean z9 = true;
        Object obj = this.f17564b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.f17573e = editText.getText().toString();
                w1Var.f17570a.f37556f3.O(true);
                w1Var.f17570a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                uo uoVar = (uo) obj;
                if (uoVar.f50434e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (qj0Var = uoVar.f50432b) != null) {
                        v4.g0 adapter = qj0Var.getAdapter();
                        to toVar = uoVar.f50434e;
                        if (adapter != toVar) {
                            uoVar.f50432b.setAdapter(toVar);
                            uoVar.f50434e.f();
                            uoVar.f50432b.setFastScrollVisible(false);
                            uoVar.f50432b.setVerticalScrollBarEnabled(true);
                            uoVar.d.b();
                        }
                    }
                    uoVar.f50434e.F(obj2);
                    return;
                }
                return;
            case 3:
                qq qqVar = (qq) obj;
                if (qqVar.f49126e != null) {
                    String obj3 = editText.getText().toString();
                    if (qqVar.f49121c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = qqVar.f49121c.getAdapter().b();
                    }
                    qqVar.f49126e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (q1Var = qqVar.f49121c) != null) {
                        v4.g0 adapter2 = q1Var.getAdapter();
                        mq mqVar = qqVar.f49115a;
                        if (adapter2 != mqVar) {
                            bi.q1 q1Var2 = qqVar.f49121c;
                            q1Var2.W1 = false;
                            q1Var2.X1 = 0;
                            q1Var2.setAdapter(mqVar);
                            if (b10 == 0) {
                                qqVar.D0(0);
                            }
                        }
                    }
                    qqVar.C1.setVisibility(8);
                    qqVar.B1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.f49975n = editText.getText().toString();
                w3 w3Var = sqVar.f36649a;
                if (w3Var != null) {
                    w3Var.f37556f3.O(true);
                    return;
                }
                return;
            case 5:
                b8 b8Var = (b8) obj;
                if (editText.length() > 0) {
                    b8Var.f32146q1.E(editText.getText().toString());
                    return;
                }
                b8Var.f32139m1 = false;
                b8Var.f32146q1.E(null);
                return;
            case 6:
                ((vj) obj).D.Y(editText.getText().toString(), false);
                return;
            case 7:
                wk wkVar = (wk) obj;
                e5 e5Var = wkVar.J;
                bi.q1 q1Var3 = wkVar.L;
                qj0 qj0Var2 = wkVar.M;
                uk ukVar = wkVar.N;
                if (ukVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        wkVar.f40068d0 = true;
                        wkVar.f40091x.setShowSearchProgress(true);
                        q1Var3.setVisibility(8);
                        e5Var.setVisibility(8);
                        if (qj0Var2.getAdapter() != ukVar) {
                            qj0Var2.setAdapter(ukVar);
                        }
                        qj0Var2.setVisibility(0);
                        wkVar.f40069e0 = ukVar.f16674f.isEmpty();
                        wkVar.j0();
                    } else {
                        q1Var3.setVisibility(0);
                        e5Var.setVisibility(0);
                        qj0Var2.setAdapter(null);
                        qj0Var2.setVisibility(8);
                        wkVar.f40084s.setVisibility(8);
                    }
                    ukVar.G(obj4);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f41189b0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f41209y = true;
                        qj0 qj0Var3 = contactsActivity.d;
                        if (qj0Var3 != null) {
                            qj0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f41190c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f41209y = false;
                    contactsActivity.h.G(null);
                    qj0 qj0Var4 = contactsActivity.d;
                    if (qj0Var4 != null) {
                        qj0Var4.setAdapter(contactsActivity.f41188b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ss ssVar = (ss) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    oj ojVar = ssVar.d;
                    ojVar.getClass();
                    ojVar.f36728e = null;
                    ssVar.f49984e = false;
                    ssVar.f49981a.setAdapter(ssVar.f49983c);
                    ssVar.f49981a.setFastScrollVisible(true);
                    return;
                }
                oj ojVar2 = ssVar.d;
                ojVar2.getClass();
                if (obj6 == null) {
                    ojVar2.f36728e = null;
                } else {
                    try {
                        Timer timer = (Timer) ojVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    ojVar2.h = timer2;
                    timer2.schedule(new jg.q1(2, ojVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    ssVar.f49984e = true;
                    return;
                }
                return;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.f44752a.getActionBar().setSearchFieldText(editText.getText().toString());
                cuVar.f44753b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                yw ywVar = (yw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((hwVar = ywVar.C0) != null && (zl0Var = hwVar.f33995d0) != null && zl0Var.M()) || ywVar.f52313u3 || ywVar.K)) {
                    ywVar.f52267l2 = true;
                    if (!ywVar.f52297r3) {
                        ywVar.a5(true, false, true, false);
                    }
                }
                hw hwVar2 = ywVar.C0;
                if (hwVar2 != null) {
                    View currentView = hwVar2.getCurrentView();
                    boolean z10 = !hwVar2.f33998g0;
                    if (!TextUtils.isEmpty(hwVar2.M0)) {
                        z9 = z10;
                    }
                    hwVar2.M0 = obj7;
                    hwVar2.P(currentView, hwVar2.getCurrentPosition(), obj7, z9);
                    return;
                }
                return;
            case 12:
                String obj8 = editText.getText().toString();
                o50 o50Var = (o50) obj;
                n50.E(o50Var.f48344f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != o50Var.M) {
                    o50Var.M = z11;
                    qj0 qj0Var5 = o50Var.d;
                    if (qj0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = o50Var.f48344f;
                        } else {
                            g0Var = o50Var.f48343e;
                        }
                        qj0Var5.setAdapter(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                b60 b60Var = (b60) obj;
                if (editText.length() != 0) {
                    b60Var.f43918y = true;
                    y50 y50Var = b60Var.f43915s;
                    if (!y50Var.h) {
                        y50Var.h = true;
                        y50Var.f();
                    }
                    b60Var.f43915s.E(editText.getText().toString());
                    b60Var.h.setFastScrollVisible(false);
                    b60Var.h.setVerticalScrollBarEnabled(true);
                    b60Var.f43914r.e(true, true);
                    b60Var.f43914r.setStickerType(1);
                    b60Var.f43914r.d.setText(id.M0(2131748167, null));
                    b60Var.f43914r.f32768e.setText(id.M0(2131745807, null));
                    return;
                }
                b60.d0(b60Var);
                return;
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    qj0 qj0Var6 = languageSelectActivity.f41255b;
                    if (qj0Var6 != null) {
                        qj0Var6.setAdapter(languageSelectActivity.f41256c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f41255b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f41255b.setAdapter(languageSelectActivity.f41254a);
                    return;
                }
                return;
            case 15:
                ra0 ra0Var = (ra0) obj;
                if (ra0Var.S != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        ra0Var.f49385u0 = true;
                        ra0Var.f49380r.setShowSearchProgress(true);
                        f5 f5Var = ra0Var.V;
                        if (f5Var != null) {
                            f5Var.setVisibility(8);
                        }
                        ra0Var.Q.setVisibility(8);
                        ra0Var.O.setVisibility(8);
                        v4.g0 adapter3 = ra0Var.R.getAdapter();
                        uk ukVar2 = ra0Var.S;
                        if (adapter3 != ukVar2) {
                            ra0Var.R.setAdapter(ukVar2);
                        }
                        ra0Var.R.setVisibility(0);
                        if (ra0Var.S.b() != 0) {
                            z9 = false;
                        }
                        ra0Var.f49386v0 = z9;
                    } else {
                        f5 f5Var2 = ra0Var.V;
                        if (f5Var2 != null) {
                            f5Var2.setVisibility(0);
                        }
                        ra0Var.Q.setVisibility(0);
                        ra0Var.O.setVisibility(0);
                        ra0Var.R.setAdapter(null);
                        ra0Var.R.setVisibility(8);
                    }
                    ra0Var.L0();
                    ra0Var.M0();
                    ra0Var.S.G(obj10);
                    return;
                }
                return;
            case 16:
                ((x80) ((w4) obj).f4960b).j(editText.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f41310a != null) {
                            notificationsCustomSettingsActivity.f41312c.setText(id.M0(2131748167, "NoResult"));
                            notificationsCustomSettingsActivity.f41312c.b();
                            notificationsCustomSettingsActivity.f41310a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f41310a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f41310a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                cn0 cn0Var = (cn0) obj;
                cn0Var.f44712a.getActionBar().setSearchFieldText(editText.getText().toString());
                cn0Var.f44713b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).f41728e.I(editText.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editText.getText().toString();
                ty0 ty0Var = (ty0) obj;
                if (obj12 == null) {
                    ty0Var.f50264f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = ty0Var.f50264f;
                    if (arrayList == null) {
                        ty0Var.f50264f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < ty0Var.h.size(); i10++) {
                        y00 y00Var = (y00) ty0Var.h.get(i10);
                        if (y00Var.d.startsWith(lowerCase)) {
                            ty0Var.f50264f.add(0, y00Var);
                        } else if (y00Var.d.contains(lowerCase)) {
                            ty0Var.f50264f.add(y00Var);
                        }
                    }
                    ty0Var.f50262c.f();
                }
                if (obj12.length() != 0) {
                    qj0 qj0Var7 = ty0Var.f50261b;
                    if (qj0Var7 != null) {
                        qj0Var7.setAdapter(ty0Var.f50262c);
                        return;
                    }
                    return;
                } else if (ty0Var.f50261b != null) {
                    ty0Var.d.setVisibility(8);
                    ty0Var.f50261b.setAdapter(ty0Var.f50260a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((n31) obj).f48083f.I(editText.getText().toString());
                return;
            case 22:
                String obj13 = editText.getText().toString();
                u91 u91Var = ((y91) obj).f52050r0;
                if (!u91Var.f50327d0.equals(obj13)) {
                    u91Var.M(u91Var.f39950e[0], u91Var.getCurrentPosition(), obj13, false);
                    return;
                }
                return;
            case 23:
                ((WallpapersListActivity) obj).H.E(editText.getText().toString(), false);
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
