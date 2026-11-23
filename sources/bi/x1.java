package bi;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.t00;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.a60;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.eu;
import org.telegram.ui.fn0;
import org.telegram.ui.hv;
import org.telegram.ui.kw;
import org.telegram.ui.lb;
import org.telegram.ui.m50;
import org.telegram.ui.n50;
import org.telegram.ui.nq;
import org.telegram.ui.o31;
import org.telegram.ui.qa0;
import org.telegram.ui.qw;
import org.telegram.ui.rq;
import org.telegram.ui.sy0;
import org.telegram.ui.to;
import org.telegram.ui.tq;
import org.telegram.ui.ts;
import org.telegram.ui.u91;
import org.telegram.ui.uc1;
import org.telegram.ui.uo;
import org.telegram.ui.x50;
import org.telegram.ui.y91;
import org.telegram.ui.yw;
public final class x1 extends org.telegram.ui.ActionBar.m0 {
    public final int f4196a;
    public final Object f4197b;

    public x1(Object obj, int i7) {
        this.f4196a = i7;
        this.f4197b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f4196a) {
            case 12:
                cx cxVar = (cx) this.f4197b;
                org.telegram.ui.ActionBar.q0 q0Var = cxVar.F1;
                if (q0Var != null) {
                    q0Var.setVisibility(0);
                }
                if (cxVar.f46731p2 != null) {
                    cxVar.finishFragment();
                    return false;
                }
                return true;
            case 19:
                ((fn0) this.f4197b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f4196a) {
            case 12:
                cx cxVar = (cx) this.f4197b;
                kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                if (!kVar.x() && cxVar.V3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f4196a) {
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) this.f4197b;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                    g5Var.f29873e.clearFocus();
                    org.telegram.messenger.g0.v1(g5Var.f29873e);
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
        switch (this.f4196a) {
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f4197b;
                uc1 uc1Var = wallpapersListActivity.I;
                uc1Var.f52529n = null;
                uc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(hd.N0(2131745620, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        ri.q qVar;
        int i7 = this.f4196a;
        yz yzVar = null;
        Object obj = this.f4197b;
        switch (i7) {
            case 0:
                f2.e1((f2) obj, null);
                return;
            case 1:
                kg.z1 z1Var = (kg.z1) obj;
                z1Var.d = false;
                z1Var.f18549e = null;
                z1Var.f18546a.f35742g3.O(true);
                z1Var.f18546a.v0(0);
                return;
            case 2:
                lb lbVar = (lb) obj;
                lbVar.f49549w0 = "";
                lbVar.J.setVisibility(0);
                if (lbVar.V) {
                    lbVar.V = false;
                    lbVar.Z0(true);
                    return;
                }
                return;
            case 3:
                uo uoVar = (uo) obj;
                uoVar.f52600e.F(null);
                uoVar.O = false;
                uoVar.getClass();
                uoVar.f52598b.setAdapter(uoVar.f52597a);
                uoVar.f52597a.f();
                uoVar.f52598b.setFastScrollVisible(true);
                uoVar.f52598b.setVerticalScrollBarEnabled(false);
                uoVar.d.setShowAtCenter(false);
                uoVar.d.b();
                return;
            case 4:
                rq rqVar = (rq) obj;
                rqVar.f51736e.F(null);
                rqVar.f51757o1 = false;
                di.b1 b1Var = rqVar.f51731c;
                b1Var.X1 = false;
                b1Var.Y1 = 0;
                b1Var.setAdapter(rqVar.f51725a);
                rqVar.f51725a.f();
                rqVar.f51731c.setFastScrollVisible(true);
                rqVar.f51731c.setVerticalScrollBarEnabled(false);
                return;
            case 5:
                tq tqVar = (tq) obj;
                tqVar.f52320n = null;
                i6 i6Var = tqVar.f34671a;
                if (i6Var != null) {
                    i6Var.f35742g3.O(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) obj;
                if (f8Var.f35106r1) {
                    f8Var.f35104q1 = false;
                    f8Var.f35106r1 = false;
                    f8Var.f30173r0 = true;
                    f8Var.f35112u1.E(null);
                    org.telegram.ui.ActionBar.q0 q0Var = f8Var.f35089e2;
                    if (q0Var != null) {
                        q0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                mk mkVar = (mk) obj;
                mkVar.f37486c0 = false;
                mkVar.H.setVisibility(0);
                ak akVar = mkVar.f37492r;
                v4.h0 adapter = akVar.getAdapter();
                ek ekVar = mkVar.f37494w;
                if (adapter != ekVar) {
                    akVar.setAdapter(ekVar);
                }
                ekVar.f();
                mkVar.E.Y(null, true);
                return;
            case 8:
                ml mlVar = (ml) obj;
                mlVar.f37507d0 = false;
                mlVar.f37508e0 = false;
                mlVar.O.G(null);
                mlVar.j0();
                mlVar.M.setVisibility(0);
                mlVar.K.setVisibility(0);
                mlVar.N.setVisibility(8);
                mlVar.f37523s.setVisibility(8);
                return;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f42991c0 = null;
                contactsActivity.E = false;
                contactsActivity.f43010y = false;
                contactsActivity.d.setAdapter(contactsActivity.f42988b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f42988b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 10:
                ts tsVar = (ts) obj;
                ek ekVar2 = tsVar.d;
                ekVar2.getClass();
                ekVar2.f34825e = null;
                tsVar.f52343f = false;
                tsVar.f52342e = false;
                tsVar.f52339a.setAdapter(tsVar.f52341c);
                tsVar.f52339a.setFastScrollVisible(true);
                return;
            case 11:
                eu euVar = (eu) obj;
                euVar.f47341a.getActionBar().n(false);
                euVar.f47342b.getActionBar().n(false);
                return;
            case 12:
                cx cxVar = (cx) obj;
                qw qwVar = cxVar.Y;
                if (qwVar != null) {
                    ArrayList arrayList = qwVar.G;
                    if (!arrayList.isEmpty() && qwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((hv) qwVar.I).e((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                cxVar.f46713l2 = false;
                cxVar.f46717m2 = false;
                bx bxVar = cxVar.f46683f0[0];
                if (bxVar != null) {
                    yw ywVar = bxVar.f46318a;
                    if (cxVar.Y2 == 0) {
                        yzVar = bxVar.f46327x;
                    }
                    ywVar.setEmptyView(yzVar);
                    cxVar.i5(false, false, true, false);
                }
                cxVar.u5(false, false);
                ls.e().k(271, Boolean.TRUE);
                cxVar.Y.setCloseButtonVisible(false);
                cxVar.t5(true);
                cxVar.N3();
                qVar = ((org.telegram.ui.ActionBar.g2) cxVar).glassEngine;
                qVar.g();
                return;
            case 13:
                n50 n50Var = (n50) obj;
                if (n50Var.N) {
                    m50.E(n50Var.f50080f, null);
                    n50Var.N = false;
                    n50Var.d.setAdapter(n50Var.f50079e);
                    return;
                }
                return;
            case 14:
                a60.d0((a60) obj);
                return;
            case 15:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f43071b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f43071b.setAdapter(languageSelectActivity.f43070a);
                    return;
                }
                return;
            case 16:
                qa0 qa0Var = (qa0) obj;
                qa0Var.f51114u0 = false;
                qa0Var.f51115v0 = false;
                qa0Var.T.G(null);
                qa0Var.O0();
                org.telegram.ui.ActionBar.g5 g5Var = qa0Var.W;
                if (g5Var != null) {
                    g5Var.setVisibility(0);
                }
                qa0Var.R.setVisibility(0);
                qa0Var.P.setVisibility(0);
                qa0Var.S.setAdapter(null);
                qa0Var.S.setVisibility(8);
                qa0Var.N0(false);
                return;
            case 17:
                l90 l90Var = (l90) ((e9) obj).f3516b;
                l90Var.f62040y = false;
                l90Var.j(null);
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f43130f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f43128c.setText(hd.N0(2131748018, "NoExceptions"));
                notificationsCustomSettingsActivity.f43126a.setAdapter(notificationsCustomSettingsActivity.f43127b);
                notificationsCustomSettingsActivity.f43127b.f();
                notificationsCustomSettingsActivity.f43126a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f43126a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f43128c.setShowAtCenter(false);
                return;
            case 19:
            case 20:
            default:
                return;
            case 21:
                sy0 sy0Var = (sy0) obj;
                sy0Var.f52112f = null;
                if (sy0Var.f52109b != null) {
                    sy0Var.d.setVisibility(8);
                    sy0Var.f52109b.setAdapter(sy0Var.f52108a);
                    return;
                }
                return;
            case 22:
                o31 o31Var = (o31) obj;
                o31Var.f50440a.a(false, true);
                o31Var.o0(false, true);
                o31Var.f50444c.f35742g3.O(false);
                return;
            case 23:
                y91.f0((y91) obj, false);
                return;
            case 24:
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
        throw new UnsupportedOperationException("Method not decompiled: bi.x1.i():void");
    }

    @Override
    public void j(jg.o0 o0Var) {
        switch (this.f4196a) {
            case 7:
                mk mkVar = (mk) this.f4197b;
                lk lkVar = mkVar.E;
                lkVar.S.remove(o0Var);
                lkVar.Y(mkVar.G.getSearchField().getText().toString(), false);
                lkVar.a0(null, null, true);
                return;
            case 23:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f4196a) {
            case 2:
                lb lbVar = (lb) this.f4197b;
                lbVar.V = true;
                lbVar.f49549w0 = editTextBoldCursor.getText().toString();
                lbVar.Z0(true);
                return;
            case 19:
                fn0 fn0Var = (fn0) this.f4197b;
                fn0Var.f47762a.getActionBar().B();
                fn0Var.f47763b.getActionBar().B();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        ek0 ek0Var;
        int b10;
        di.b1 b1Var;
        kw kwVar;
        mm0 mm0Var;
        v4.h0 h0Var;
        int i7 = this.f4196a;
        boolean z10 = true;
        Object obj = this.f4197b;
        switch (i7) {
            case 0:
                f2.e1((f2) obj, editText.getText().toString());
                return;
            case 1:
                kg.z1 z1Var = (kg.z1) obj;
                z1Var.f18549e = editText.getText().toString();
                z1Var.f18546a.f35742g3.O(true);
                z1Var.f18546a.v0(0);
                return;
            case 2:
            default:
                return;
            case 3:
                uo uoVar = (uo) obj;
                if (uoVar.f52600e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (ek0Var = uoVar.f52598b) != null) {
                        v4.h0 adapter = ek0Var.getAdapter();
                        to toVar = uoVar.f52600e;
                        if (adapter != toVar) {
                            uoVar.f52598b.setAdapter(toVar);
                            uoVar.f52600e.f();
                            uoVar.f52598b.setFastScrollVisible(false);
                            uoVar.f52598b.setVerticalScrollBarEnabled(true);
                            uoVar.d.b();
                        }
                    }
                    uoVar.f52600e.F(obj2);
                    return;
                }
                return;
            case 4:
                rq rqVar = (rq) obj;
                if (rqVar.f51736e != null) {
                    String obj3 = editText.getText().toString();
                    if (rqVar.f51731c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = rqVar.f51731c.getAdapter().b();
                    }
                    rqVar.f51736e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = rqVar.f51731c) != null) {
                        v4.h0 adapter2 = b1Var.getAdapter();
                        nq nqVar = rqVar.f51725a;
                        if (adapter2 != nqVar) {
                            di.b1 b1Var2 = rqVar.f51731c;
                            b1Var2.X1 = false;
                            b1Var2.Y1 = 0;
                            b1Var2.setAdapter(nqVar);
                            if (b10 == 0) {
                                rqVar.D0(0);
                            }
                        }
                    }
                    rqVar.D1.setVisibility(8);
                    rqVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 5:
                tq tqVar = (tq) obj;
                tqVar.f52320n = editText.getText().toString();
                i6 i6Var = tqVar.f34671a;
                if (i6Var != null) {
                    i6Var.f35742g3.O(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) obj;
                if (editText.length() > 0) {
                    f8Var.f35112u1.E(editText.getText().toString());
                    return;
                }
                f8Var.f35104q1 = false;
                f8Var.f35112u1.E(null);
                return;
            case 7:
                ((mk) obj).E.Y(editText.getText().toString(), false);
                return;
            case 8:
                ml mlVar = (ml) obj;
                g3 g3Var = mlVar.K;
                di.b1 b1Var3 = mlVar.M;
                ek0 ek0Var2 = mlVar.N;
                kl klVar = mlVar.O;
                if (klVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        mlVar.f37508e0 = true;
                        mlVar.f37530x.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        g3Var.setVisibility(8);
                        if (ek0Var2.getAdapter() != klVar) {
                            ek0Var2.setAdapter(klVar);
                        }
                        ek0Var2.setVisibility(0);
                        mlVar.f37509f0 = klVar.f17400f.isEmpty();
                        mlVar.j0();
                    } else {
                        b1Var3.setVisibility(0);
                        g3Var.setVisibility(0);
                        ek0Var2.setAdapter(null);
                        ek0Var2.setVisibility(8);
                        mlVar.f37523s.setVisibility(8);
                    }
                    klVar.G(obj4);
                    return;
                }
                return;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f42991c0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f43010y = true;
                        ek0 ek0Var3 = contactsActivity.d;
                        if (ek0Var3 != null) {
                            ek0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f42990c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f43010y = false;
                    contactsActivity.h.G(null);
                    ek0 ek0Var4 = contactsActivity.d;
                    if (ek0Var4 != null) {
                        ek0Var4.setAdapter(contactsActivity.f42988b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ts tsVar = (ts) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    ek ekVar = tsVar.d;
                    ekVar.getClass();
                    ekVar.f34825e = null;
                    tsVar.f52342e = false;
                    tsVar.f52339a.setAdapter(tsVar.f52341c);
                    tsVar.f52339a.setFastScrollVisible(true);
                    return;
                }
                ek ekVar2 = tsVar.d;
                ekVar2.getClass();
                if (obj6 == null) {
                    ekVar2.f34825e = null;
                } else {
                    try {
                        Timer timer = (Timer) ekVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    ekVar2.h = timer2;
                    timer2.schedule(new jg.q1(2, ekVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    tsVar.f52342e = true;
                    return;
                }
                return;
            case 11:
                eu euVar = (eu) obj;
                euVar.f47341a.getActionBar().setSearchFieldText(editText.getText().toString());
                euVar.f47342b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 12:
                cx cxVar = (cx) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((kwVar = cxVar.D0) != null && (mm0Var = kwVar.f39905e0) != null && mm0Var.M()) || cxVar.f46764v3 || cxVar.L)) {
                    cxVar.f46717m2 = true;
                    if (!cxVar.f46749s3) {
                        cxVar.i5(true, false, true, false);
                    }
                }
                kw kwVar2 = cxVar.D0;
                if (kwVar2 != null) {
                    View currentView = kwVar2.getCurrentView();
                    boolean z11 = !kwVar2.f39908h0;
                    if (!TextUtils.isEmpty(kwVar2.N0)) {
                        z10 = z11;
                    }
                    kwVar2.N0 = obj7;
                    kwVar2.L(currentView, kwVar2.getCurrentPosition(), obj7, z10);
                    return;
                }
                return;
            case 13:
                String obj8 = editText.getText().toString();
                n50 n50Var = (n50) obj;
                m50.E(n50Var.f50080f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z12 = !isEmpty;
                if (z12 != n50Var.N) {
                    n50Var.N = z12;
                    ek0 ek0Var5 = n50Var.d;
                    if (ek0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = n50Var.f50080f;
                        } else {
                            h0Var = n50Var.f50079e;
                        }
                        ek0Var5.setAdapter(h0Var);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                a60 a60Var = (a60) obj;
                if (editText.length() != 0) {
                    a60Var.f45487y = true;
                    x50 x50Var = a60Var.f45484s;
                    if (!x50Var.h) {
                        x50Var.h = true;
                        x50Var.f();
                    }
                    a60Var.f45484s.E(editText.getText().toString());
                    a60Var.h.setFastScrollVisible(false);
                    a60Var.h.setVerticalScrollBarEnabled(true);
                    a60Var.f45483r.e(true, true);
                    a60Var.f45483r.setStickerType(1);
                    a60Var.f45483r.d.setText(hd.N0(2131747974, null));
                    a60Var.f45483r.f37962e.setText(hd.N0(2131745611, null));
                    return;
                }
                a60.d0(a60Var);
                return;
            case 15:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    ek0 ek0Var6 = languageSelectActivity.f43071b;
                    if (ek0Var6 != null) {
                        ek0Var6.setAdapter(languageSelectActivity.f43072c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f43071b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f43071b.setAdapter(languageSelectActivity.f43070a);
                    return;
                }
                return;
            case 16:
                qa0 qa0Var = (qa0) obj;
                if (qa0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        qa0Var.f51115v0 = true;
                        qa0Var.f51109r.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.g5 g5Var = qa0Var.W;
                        if (g5Var != null) {
                            g5Var.setVisibility(8);
                        }
                        qa0Var.R.setVisibility(8);
                        qa0Var.P.setVisibility(8);
                        v4.h0 adapter3 = qa0Var.S.getAdapter();
                        kl klVar2 = qa0Var.T;
                        if (adapter3 != klVar2) {
                            qa0Var.S.setAdapter(klVar2);
                        }
                        qa0Var.S.setVisibility(0);
                        if (qa0Var.T.b() != 0) {
                            z10 = false;
                        }
                        qa0Var.f51117w0 = z10;
                    } else {
                        org.telegram.ui.ActionBar.g5 g5Var2 = qa0Var.W;
                        if (g5Var2 != null) {
                            g5Var2.setVisibility(0);
                        }
                        qa0Var.R.setVisibility(0);
                        qa0Var.P.setVisibility(0);
                        qa0Var.S.setAdapter(null);
                        qa0Var.S.setVisibility(8);
                    }
                    qa0Var.O0();
                    qa0Var.P0();
                    qa0Var.T.G(obj10);
                    return;
                }
                return;
            case 17:
                ((l90) ((e9) obj).f3516b).j(editText.getText().toString());
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f43126a != null) {
                            notificationsCustomSettingsActivity.f43128c.setText(hd.N0(2131747974, "NoResult"));
                            notificationsCustomSettingsActivity.f43128c.b();
                            notificationsCustomSettingsActivity.f43126a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f43126a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f43126a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 19:
                fn0 fn0Var = (fn0) obj;
                fn0Var.f47762a.getActionBar().setSearchFieldText(editText.getText().toString());
                fn0Var.f47763b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 20:
                ((ProfileActivity) obj).f43548e.I(editText.getText().toString().toLowerCase());
                return;
            case 21:
                String obj12 = editText.getText().toString();
                sy0 sy0Var = (sy0) obj;
                if (obj12 == null) {
                    sy0Var.f52112f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = sy0Var.f52112f;
                    if (arrayList == null) {
                        sy0Var.f52112f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < sy0Var.h.size(); i10++) {
                        t00 t00Var = (t00) sy0Var.h.get(i10);
                        if (t00Var.d.startsWith(lowerCase)) {
                            sy0Var.f52112f.add(0, t00Var);
                        } else if (t00Var.d.contains(lowerCase)) {
                            sy0Var.f52112f.add(t00Var);
                        }
                    }
                    sy0Var.f52110c.f();
                }
                if (obj12.length() != 0) {
                    ek0 ek0Var7 = sy0Var.f52109b;
                    if (ek0Var7 != null) {
                        ek0Var7.setAdapter(sy0Var.f52110c);
                        return;
                    }
                    return;
                } else if (sy0Var.f52109b != null) {
                    sy0Var.d.setVisibility(8);
                    sy0Var.f52109b.setAdapter(sy0Var.f52108a);
                    return;
                } else {
                    return;
                }
            case 22:
                ((o31) obj).f50449f.I(editText.getText().toString());
                return;
            case 23:
                String obj13 = editText.getText().toString();
                u91 u91Var = ((y91) obj).f54116s0;
                if (!u91Var.f52478e0.equals(obj13)) {
                    u91Var.I(u91Var.f36393e[0], u91Var.getCurrentPosition(), obj13, false);
                    return;
                }
                return;
            case 24:
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
