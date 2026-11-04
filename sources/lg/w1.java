package lg;

import ai.c7;
import ai.h4;
import ai.o2;
import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.q00;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.av;
import org.telegram.ui.c31;
import org.telegram.ui.cw;
import org.telegram.ui.f50;
import org.telegram.ui.g50;
import org.telegram.ui.gy0;
import org.telegram.ui.i91;
import org.telegram.ui.iq;
import org.telegram.ui.iw;
import org.telegram.ui.kb;
import org.telegram.ui.la0;
import org.telegram.ui.m91;
import org.telegram.ui.nc1;
import org.telegram.ui.nq;
import org.telegram.ui.os;
import org.telegram.ui.po;
import org.telegram.ui.pq;
import org.telegram.ui.pw;
import org.telegram.ui.q50;
import org.telegram.ui.qo;
import org.telegram.ui.t50;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.vm0;
import org.telegram.ui.yt;
public final class w1 extends org.telegram.ui.ActionBar.m0 {
    public final int f18502a;
    public final Object f18503b;

    public w1(Object obj, int i3) {
        this.f18502a = i3;
        this.f18503b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f18502a) {
            case 11:
                uw uwVar = (uw) this.f18503b;
                org.telegram.ui.ActionBar.q0 q0Var = uwVar.E1;
                if (q0Var != null) {
                    q0Var.setVisibility(0);
                }
                if (uwVar.f50273o2 != null) {
                    uwVar.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((vm0) this.f18503b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f18502a) {
            case 11:
                uw uwVar = (uw) this.f18503b;
                kVar = ((d2) uwVar).actionBar;
                if (!kVar.v() && uwVar.R3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f18502a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f18503b;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    f5 f5Var = profileActivity.U0;
                    f5Var.f28445e.clearFocus();
                    org.telegram.messenger.g0.v1(f5Var.f28445e);
                }
                if (profileActivity.W1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.W1);
            default:
                return super.e();
        }
    }

    @Override
    public void f() {
        switch (this.f18502a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f18503b;
                nc1 nc1Var = wallpapersListActivity.I;
                nc1Var.f47970n = null;
                nc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(bd.M0(2131745826, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        pi.q qVar;
        int i3 = this.f18502a;
        iz izVar = null;
        Object obj = this.f18503b;
        switch (i3) {
            case 0:
                x1 x1Var = (x1) obj;
                x1Var.d = false;
                x1Var.f18511e = null;
                x1Var.f18508a.f35594g3.O(true);
                x1Var.f18508a.v0(0);
                return;
            case 1:
                kb kbVar = (kb) obj;
                kbVar.f46886w0 = "";
                kbVar.J.setVisibility(0);
                if (kbVar.V) {
                    kbVar.V = false;
                    kbVar.Z0(true);
                    return;
                }
                return;
            case 2:
                qo qoVar = (qo) obj;
                qoVar.f48923e.F(null);
                qoVar.O = false;
                qoVar.getClass();
                qoVar.f48921b.setAdapter(qoVar.f48920a);
                qoVar.f48920a.f();
                qoVar.f48921b.setFastScrollVisible(true);
                qoVar.f48921b.setVerticalScrollBarEnabled(false);
                qoVar.d.setShowAtCenter(false);
                qoVar.d.b();
                return;
            case 3:
                nq nqVar = (nq) obj;
                nqVar.f48057e.F(null);
                nqVar.f48078o1 = false;
                ci.j1 j1Var = nqVar.f48052c;
                j1Var.X1 = false;
                j1Var.Y1 = 0;
                j1Var.setAdapter(nqVar.f48046a);
                nqVar.f48046a.f();
                nqVar.f48052c.setFastScrollVisible(true);
                nqVar.f48052c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                pq pqVar = (pq) obj;
                pqVar.f48633n = null;
                h4 h4Var = pqVar.f34298a;
                if (h4Var != null) {
                    h4Var.f35594g3.O(true);
                    return;
                }
                return;
            case 5:
                z7 z7Var = (z7) obj;
                if (z7Var.f40956o1) {
                    z7Var.f40954n1 = false;
                    z7Var.f40956o1 = false;
                    z7Var.f28614r0 = true;
                    z7Var.f40962r1.E(null);
                    org.telegram.ui.ActionBar.q0 q0Var = z7Var.f40941b2;
                    if (q0Var != null) {
                        q0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                uj ujVar = (uj) obj;
                ujVar.f38764c0 = false;
                ujVar.H.setVisibility(0);
                jj jjVar = ujVar.f38770r;
                u4.h0 adapter = jjVar.getAdapter();
                nj njVar = ujVar.f38772w;
                if (adapter != njVar) {
                    jjVar.setAdapter(njVar);
                }
                njVar.f();
                ujVar.E.Y(null, true);
                return;
            case 7:
                uk ukVar = (uk) obj;
                ukVar.f38783d0 = false;
                ukVar.f38784e0 = false;
                ukVar.O.G(null);
                ukVar.j0();
                ukVar.M.setVisibility(0);
                ukVar.K.setVisibility(0);
                ukVar.N.setVisibility(8);
                ukVar.f38799s.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f41212c0 = null;
                contactsActivity.E = false;
                contactsActivity.f41231y = false;
                contactsActivity.d.setAdapter(contactsActivity.f41209b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f41209b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 9:
                os osVar = (os) obj;
                nj njVar2 = osVar.d;
                njVar2.getClass();
                njVar2.f36567e = null;
                osVar.f48342f = false;
                osVar.f48341e = false;
                osVar.f48338a.setAdapter(osVar.f48340c);
                osVar.f48338a.setFastScrollVisible(true);
                return;
            case 10:
                yt ytVar = (yt) obj;
                ytVar.f52399a.getActionBar().l(false);
                ytVar.f52400b.getActionBar().l(false);
                return;
            case 11:
                uw uwVar = (uw) obj;
                iw iwVar = uwVar.Y;
                if (iwVar != null) {
                    ArrayList arrayList = iwVar.G;
                    if (!arrayList.isEmpty() && iwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((kg.l0) arrayList.get(i10)).h) {
                                ((av) iwVar.I).g((kg.l0) arrayList.get(i10));
                            }
                        }
                    }
                }
                uwVar.f50255k2 = false;
                uwVar.f50260l2 = false;
                tw twVar = uwVar.f50230f0[0];
                if (twVar != null) {
                    pw pwVar = twVar.f49897a;
                    if (uwVar.X2 == 0) {
                        izVar = twVar.f49906x;
                    }
                    pwVar.setEmptyView(izVar);
                    uwVar.a5(false, false, true, false);
                }
                uwVar.m5(false, false);
                hs.e().k(268, Boolean.TRUE);
                uwVar.Y.setCloseButtonVisible(false);
                uwVar.l5(true);
                uwVar.N3();
                qVar = ((d2) uwVar).glassEngine;
                qVar.g();
                return;
            case 12:
                g50 g50Var = (g50) obj;
                if (g50Var.N) {
                    f50.E(g50Var.f45537f, null);
                    g50Var.N = false;
                    g50Var.d.setAdapter(g50Var.f45536e);
                    return;
                }
                return;
            case 13:
                t50.d0((t50) obj);
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f41277b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f41277b.setAdapter(languageSelectActivity.f41276a);
                    return;
                }
                return;
            case 15:
                la0 la0Var = (la0) obj;
                la0Var.f47266u0 = false;
                la0Var.f47267v0 = false;
                la0Var.T.G(null);
                la0Var.L0();
                f5 f5Var = la0Var.W;
                if (f5Var != null) {
                    f5Var.setVisibility(0);
                }
                la0Var.R.setVisibility(0);
                la0Var.P.setVisibility(0);
                la0Var.S.setAdapter(null);
                la0Var.S.setVisibility(8);
                la0Var.K0(false);
                return;
            case 16:
                s80 s80Var = (s80) ((c7) obj).f553b;
                s80Var.f60601y = false;
                s80Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f41336f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f41334c.setText(bd.M0(2131748219, "NoExceptions"));
                notificationsCustomSettingsActivity.f41332a.setAdapter(notificationsCustomSettingsActivity.f41333b);
                notificationsCustomSettingsActivity.f41333b.f();
                notificationsCustomSettingsActivity.f41332a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f41332a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f41334c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                gy0 gy0Var = (gy0) obj;
                gy0Var.f45735f = null;
                if (gy0Var.f45732b != null) {
                    gy0Var.d.setVisibility(8);
                    gy0Var.f45732b.setAdapter(gy0Var.f45731a);
                    return;
                }
                return;
            case 21:
                c31 c31Var = (c31) obj;
                c31Var.f44214a.a(false, true);
                c31Var.o0(false, true);
                c31Var.f44218c.f35594g3.O(false);
                return;
            case 22:
                m91.f0((m91) obj, false);
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
        throw new UnsupportedOperationException("Method not decompiled: lg.w1.i():void");
    }

    @Override
    public void j(kg.l0 l0Var) {
        switch (this.f18502a) {
            case 6:
                uj ujVar = (uj) this.f18503b;
                tj tjVar = ujVar.E;
                tjVar.S.remove(l0Var);
                tjVar.Y(ujVar.G.getSearchField().getText().toString(), false);
                tjVar.a0(null, null, true);
                return;
            case 22:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f18502a) {
            case 1:
                kb kbVar = (kb) this.f18503b;
                kbVar.V = true;
                kbVar.f46886w0 = editTextBoldCursor.getText().toString();
                kbVar.Z0(true);
                return;
            case 18:
                vm0 vm0Var = (vm0) this.f18503b;
                vm0Var.f50553a.getActionBar().z();
                vm0Var.f50554b.getActionBar().z();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        tj0 tj0Var;
        int b10;
        ci.j1 j1Var;
        cw cwVar;
        bm0 bm0Var;
        u4.h0 h0Var;
        int i3 = this.f18502a;
        boolean z10 = true;
        Object obj = this.f18503b;
        switch (i3) {
            case 0:
                x1 x1Var = (x1) obj;
                x1Var.f18511e = editText.getText().toString();
                x1Var.f18508a.f35594g3.O(true);
                x1Var.f18508a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                qo qoVar = (qo) obj;
                if (qoVar.f48923e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (tj0Var = qoVar.f48921b) != null) {
                        u4.h0 adapter = tj0Var.getAdapter();
                        po poVar = qoVar.f48923e;
                        if (adapter != poVar) {
                            qoVar.f48921b.setAdapter(poVar);
                            qoVar.f48923e.f();
                            qoVar.f48921b.setFastScrollVisible(false);
                            qoVar.f48921b.setVerticalScrollBarEnabled(true);
                            qoVar.d.b();
                        }
                    }
                    qoVar.f48923e.F(obj2);
                    return;
                }
                return;
            case 3:
                nq nqVar = (nq) obj;
                if (nqVar.f48057e != null) {
                    String obj3 = editText.getText().toString();
                    if (nqVar.f48052c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = nqVar.f48052c.getAdapter().b();
                    }
                    nqVar.f48057e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (j1Var = nqVar.f48052c) != null) {
                        u4.h0 adapter2 = j1Var.getAdapter();
                        iq iqVar = nqVar.f48046a;
                        if (adapter2 != iqVar) {
                            ci.j1 j1Var2 = nqVar.f48052c;
                            j1Var2.X1 = false;
                            j1Var2.Y1 = 0;
                            j1Var2.setAdapter(iqVar);
                            if (b10 == 0) {
                                nqVar.D0(0);
                            }
                        }
                    }
                    nqVar.D1.setVisibility(8);
                    nqVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                pq pqVar = (pq) obj;
                pqVar.f48633n = editText.getText().toString();
                h4 h4Var = pqVar.f34298a;
                if (h4Var != null) {
                    h4Var.f35594g3.O(true);
                    return;
                }
                return;
            case 5:
                z7 z7Var = (z7) obj;
                if (editText.length() > 0) {
                    z7Var.f40962r1.E(editText.getText().toString());
                    return;
                }
                z7Var.f40954n1 = false;
                z7Var.f40962r1.E(null);
                return;
            case 6:
                ((uj) obj).E.Y(editText.getText().toString(), false);
                return;
            case 7:
                uk ukVar = (uk) obj;
                o2 o2Var = ukVar.K;
                ci.j1 j1Var3 = ukVar.M;
                tj0 tj0Var2 = ukVar.N;
                sk skVar = ukVar.O;
                if (skVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        ukVar.f38784e0 = true;
                        ukVar.f38806x.setShowSearchProgress(true);
                        j1Var3.setVisibility(8);
                        o2Var.setVisibility(8);
                        if (tj0Var2.getAdapter() != skVar) {
                            tj0Var2.setAdapter(skVar);
                        }
                        tj0Var2.setVisibility(0);
                        ukVar.f38785f0 = skVar.f16933f.isEmpty();
                        ukVar.j0();
                    } else {
                        j1Var3.setVisibility(0);
                        o2Var.setVisibility(0);
                        tj0Var2.setAdapter(null);
                        tj0Var2.setVisibility(8);
                        ukVar.f38799s.setVisibility(8);
                    }
                    skVar.G(obj4);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f41212c0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f41231y = true;
                        tj0 tj0Var3 = contactsActivity.d;
                        if (tj0Var3 != null) {
                            tj0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f41211c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f41231y = false;
                    contactsActivity.h.G(null);
                    tj0 tj0Var4 = contactsActivity.d;
                    if (tj0Var4 != null) {
                        tj0Var4.setAdapter(contactsActivity.f41209b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                os osVar = (os) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    nj njVar = osVar.d;
                    njVar.getClass();
                    njVar.f36567e = null;
                    osVar.f48341e = false;
                    osVar.f48338a.setAdapter(osVar.f48340c);
                    osVar.f48338a.setFastScrollVisible(true);
                    return;
                }
                nj njVar2 = osVar.d;
                njVar2.getClass();
                if (obj6 == null) {
                    njVar2.f36567e = null;
                } else {
                    try {
                        Timer timer = (Timer) njVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    njVar2.h = timer2;
                    timer2.schedule(new kg.m1(2, njVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    osVar.f48341e = true;
                    return;
                }
                return;
            case 10:
                yt ytVar = (yt) obj;
                ytVar.f52399a.getActionBar().setSearchFieldText(editText.getText().toString());
                ytVar.f52400b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                uw uwVar = (uw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((cwVar = uwVar.D0) != null && (bm0Var = cwVar.f34751e0) != null && bm0Var.M()) || uwVar.f50306u3 || uwVar.L)) {
                    uwVar.f50260l2 = true;
                    if (!uwVar.f50290r3) {
                        uwVar.a5(true, false, true, false);
                    }
                }
                cw cwVar2 = uwVar.D0;
                if (cwVar2 != null) {
                    View currentView = cwVar2.getCurrentView();
                    boolean z11 = !cwVar2.f34754h0;
                    if (!TextUtils.isEmpty(cwVar2.N0)) {
                        z10 = z11;
                    }
                    cwVar2.N0 = obj7;
                    cwVar2.P(currentView, cwVar2.getCurrentPosition(), obj7, z10);
                    return;
                }
                return;
            case 12:
                String obj8 = editText.getText().toString();
                g50 g50Var = (g50) obj;
                f50.E(g50Var.f45537f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z12 = !isEmpty;
                if (z12 != g50Var.N) {
                    g50Var.N = z12;
                    tj0 tj0Var5 = g50Var.d;
                    if (tj0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = g50Var.f45537f;
                        } else {
                            h0Var = g50Var.f45536e;
                        }
                        tj0Var5.setAdapter(h0Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                t50 t50Var = (t50) obj;
                if (editText.length() != 0) {
                    t50Var.f49710y = true;
                    q50 q50Var = t50Var.f49707s;
                    if (!q50Var.h) {
                        q50Var.h = true;
                        q50Var.f();
                    }
                    t50Var.f49707s.E(editText.getText().toString());
                    t50Var.h.setFastScrollVisible(false);
                    t50Var.h.setVerticalScrollBarEnabled(true);
                    t50Var.f49706r.e(true, true);
                    t50Var.f49706r.setStickerType(1);
                    t50Var.f49706r.d.setText(bd.M0(2131748175, null));
                    t50Var.f49706r.f41128e.setText(bd.M0(2131745817, null));
                    return;
                }
                t50.d0(t50Var);
                return;
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    tj0 tj0Var6 = languageSelectActivity.f41277b;
                    if (tj0Var6 != null) {
                        tj0Var6.setAdapter(languageSelectActivity.f41278c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f41277b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f41277b.setAdapter(languageSelectActivity.f41276a);
                    return;
                }
                return;
            case 15:
                la0 la0Var = (la0) obj;
                if (la0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        la0Var.f47267v0 = true;
                        la0Var.f47261r.setShowSearchProgress(true);
                        f5 f5Var = la0Var.W;
                        if (f5Var != null) {
                            f5Var.setVisibility(8);
                        }
                        la0Var.R.setVisibility(8);
                        la0Var.P.setVisibility(8);
                        u4.h0 adapter3 = la0Var.S.getAdapter();
                        sk skVar2 = la0Var.T;
                        if (adapter3 != skVar2) {
                            la0Var.S.setAdapter(skVar2);
                        }
                        la0Var.S.setVisibility(0);
                        if (la0Var.T.b() != 0) {
                            z10 = false;
                        }
                        la0Var.f47269w0 = z10;
                    } else {
                        f5 f5Var2 = la0Var.W;
                        if (f5Var2 != null) {
                            f5Var2.setVisibility(0);
                        }
                        la0Var.R.setVisibility(0);
                        la0Var.P.setVisibility(0);
                        la0Var.S.setAdapter(null);
                        la0Var.S.setVisibility(8);
                    }
                    la0Var.L0();
                    la0Var.M0();
                    la0Var.T.G(obj10);
                    return;
                }
                return;
            case 16:
                ((s80) ((c7) obj).f553b).j(editText.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f41332a != null) {
                            notificationsCustomSettingsActivity.f41334c.setText(bd.M0(2131748175, "NoResult"));
                            notificationsCustomSettingsActivity.f41334c.b();
                            notificationsCustomSettingsActivity.f41332a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f41332a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f41332a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                vm0 vm0Var = (vm0) obj;
                vm0Var.f50553a.getActionBar().setSearchFieldText(editText.getText().toString());
                vm0Var.f50554b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).f41749e.I(editText.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editText.getText().toString();
                gy0 gy0Var = (gy0) obj;
                if (obj12 == null) {
                    gy0Var.f45735f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = gy0Var.f45735f;
                    if (arrayList == null) {
                        gy0Var.f45735f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < gy0Var.h.size(); i10++) {
                        q00 q00Var = (q00) gy0Var.h.get(i10);
                        if (q00Var.d.startsWith(lowerCase)) {
                            gy0Var.f45735f.add(0, q00Var);
                        } else if (q00Var.d.contains(lowerCase)) {
                            gy0Var.f45735f.add(q00Var);
                        }
                    }
                    gy0Var.f45733c.f();
                }
                if (obj12.length() != 0) {
                    tj0 tj0Var7 = gy0Var.f45732b;
                    if (tj0Var7 != null) {
                        tj0Var7.setAdapter(gy0Var.f45733c);
                        return;
                    }
                    return;
                } else if (gy0Var.f45732b != null) {
                    gy0Var.d.setVisibility(8);
                    gy0Var.f45732b.setAdapter(gy0Var.f45731a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((c31) obj).f44223f.I(editText.getText().toString());
                return;
            case 22:
                String obj13 = editText.getText().toString();
                i91 i91Var = ((m91) obj).f47615s0;
                if (!i91Var.f46205e0.equals(obj13)) {
                    i91Var.M(i91Var.f36386e[0], i91Var.getCurrentPosition(), obj13, false);
                    return;
                }
                return;
            case 23:
                ((WallpapersListActivity) obj).I.E(editText.getText().toString(), false);
                return;
        }
    }

    private final void q(kg.l0 l0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
