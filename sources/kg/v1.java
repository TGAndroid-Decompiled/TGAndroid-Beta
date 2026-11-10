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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.c60;
import org.telegram.ui.dn0;
import org.telegram.ui.du;
import org.telegram.ui.gv;
import org.telegram.ui.iw;
import org.telegram.ui.mb;
import org.telegram.ui.nq;
import org.telegram.ui.o31;
import org.telegram.ui.o50;
import org.telegram.ui.ow;
import org.telegram.ui.p50;
import org.telegram.ui.rq;
import org.telegram.ui.sa0;
import org.telegram.ui.to;
import org.telegram.ui.tq;
import org.telegram.ui.ts;
import org.telegram.ui.uo;
import org.telegram.ui.uy0;
import org.telegram.ui.v91;
import org.telegram.ui.vw;
import org.telegram.ui.wc1;
import org.telegram.ui.yw;
import org.telegram.ui.z50;
import org.telegram.ui.z91;
import org.telegram.ui.zw;
public final class v1 extends org.telegram.ui.ActionBar.n0 {
    public final int f17566a;
    public final Object f17567b;

    public v1(Object obj, int i7) {
        this.f17566a = i7;
        this.f17567b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f17566a) {
            case 11:
                zw zwVar = (zw) this.f17567b;
                org.telegram.ui.ActionBar.r0 r0Var = zwVar.E1;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                if (zwVar.f52627o2 != null) {
                    zwVar.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((dn0) this.f17567b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f17566a) {
            case 11:
                zw zwVar = (zw) this.f17567b;
                lVar = ((f2) zwVar).actionBar;
                if (!lVar.x() && zwVar.R3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f17566a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f17567b;
                boolean z9 = profileActivity.V1;
                profileActivity.V1 = !z9;
                if (z9) {
                    g5 g5Var = profileActivity.T0;
                    g5Var.f28435e.clearFocus();
                    org.telegram.messenger.g0.v1(g5Var.f28435e);
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
        switch (this.f17566a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f17567b;
                wc1 wc1Var = wallpapersListActivity.H;
                wc1Var.f50994n = null;
                wc1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(id.M0(2131745816, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        oi.q qVar;
        int i7 = this.f17566a;
        lz lzVar = null;
        Object obj = this.f17567b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.d = false;
                w1Var.f17576e = null;
                w1Var.f17573a.f37496f3.O(true);
                w1Var.f17573a.v0(0);
                return;
            case 1:
                mb mbVar = (mb) obj;
                mbVar.f47900v0 = "";
                mbVar.I.setVisibility(0);
                if (mbVar.U) {
                    mbVar.U = false;
                    mbVar.Z0(true);
                    return;
                }
                return;
            case 2:
                uo uoVar = (uo) obj;
                uoVar.f50530e.F(null);
                uoVar.N = false;
                uoVar.getClass();
                uoVar.f50528b.setAdapter(uoVar.f50527a);
                uoVar.f50527a.f();
                uoVar.f50528b.setFastScrollVisible(true);
                uoVar.f50528b.setVerticalScrollBarEnabled(false);
                uoVar.d.setShowAtCenter(false);
                uoVar.d.b();
                return;
            case 3:
                rq rqVar = (rq) obj;
                rqVar.f49507e.F(null);
                rqVar.n1 = false;
                bi.q1 q1Var = rqVar.f49502c;
                q1Var.W1 = false;
                q1Var.X1 = 0;
                q1Var.setAdapter(rqVar.f49496a);
                rqVar.f49496a.f();
                rqVar.f49502c.setFastScrollVisible(true);
                rqVar.f49502c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                tq tqVar = (tq) obj;
                tqVar.f50324n = null;
                w3 w3Var = tqVar.f36518a;
                if (w3Var != null) {
                    w3Var.f37496f3.O(true);
                    return;
                }
                return;
            case 5:
                a8 a8Var = (a8) obj;
                if (a8Var.f31752q1) {
                    a8Var.f31750p1 = false;
                    a8Var.f31752q1 = false;
                    a8Var.f28700q0 = true;
                    a8Var.f31758t1.E(null);
                    org.telegram.ui.ActionBar.r0 r0Var = a8Var.d2;
                    if (r0Var != null) {
                        r0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                uj ujVar = (uj) obj;
                ujVar.f38692b0 = false;
                ujVar.G.setVisibility(0);
                jj jjVar = ujVar.f38698r;
                v4.g0 adapter = jjVar.getAdapter();
                nj njVar = ujVar.f38700w;
                if (adapter != njVar) {
                    jjVar.setAdapter(njVar);
                }
                njVar.f();
                ujVar.D.Y(null, true);
                return;
            case 7:
                vk vkVar = (vk) obj;
                vkVar.f39018c0 = false;
                vkVar.f39019d0 = false;
                vkVar.N.G(null);
                vkVar.j0();
                vkVar.L.setVisibility(0);
                vkVar.J.setVisibility(0);
                vkVar.M.setVisibility(8);
                vkVar.f39035s.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f41180b0 = null;
                contactsActivity.D = false;
                contactsActivity.f41200y = false;
                contactsActivity.d.setAdapter(contactsActivity.f41179b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f41179b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 9:
                ts tsVar = (ts) obj;
                nj njVar2 = tsVar.d;
                njVar2.getClass();
                njVar2.f36318e = null;
                tsVar.f50334f = false;
                tsVar.f50333e = false;
                tsVar.f50330a.setAdapter(tsVar.f50332c);
                tsVar.f50330a.setFastScrollVisible(true);
                return;
            case 10:
                du duVar = (du) obj;
                duVar.f45050a.getActionBar().n(false);
                duVar.f45051b.getActionBar().n(false);
                return;
            case 11:
                zw zwVar = (zw) obj;
                ow owVar = zwVar.X;
                if (owVar != null) {
                    ArrayList arrayList = owVar.F;
                    if (!arrayList.isEmpty() && owVar.H != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((gv) owVar.H).h((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                zwVar.f52609k2 = false;
                zwVar.f52613l2 = false;
                yw ywVar = zwVar.f52577e0[0];
                if (ywVar != null) {
                    vw vwVar = ywVar.f52125a;
                    if (zwVar.X2 == 0) {
                        lzVar = ywVar.f52134x;
                    }
                    vwVar.setEmptyView(lzVar);
                    zwVar.a5(false, false, true, false);
                }
                zwVar.m5(false, false);
                qs.e().k(268, Boolean.TRUE);
                zwVar.X.setCloseButtonVisible(false);
                zwVar.l5(true);
                zwVar.N3();
                qVar = ((f2) zwVar).glassEngine;
                qVar.g();
                return;
            case 12:
                p50 p50Var = (p50) obj;
                if (p50Var.M) {
                    o50.E(p50Var.f48661f, null);
                    p50Var.M = false;
                    p50Var.d.setAdapter(p50Var.f48660e);
                    return;
                }
                return;
            case 13:
                c60.d0((c60) obj);
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f41246b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f41246b.setAdapter(languageSelectActivity.f41245a);
                    return;
                }
                return;
            case 15:
                sa0 sa0Var = (sa0) obj;
                sa0Var.f49793t0 = false;
                sa0Var.f49794u0 = false;
                sa0Var.S.G(null);
                sa0Var.L0();
                g5 g5Var = sa0Var.V;
                if (g5Var != null) {
                    g5Var.setVisibility(0);
                }
                sa0Var.Q.setVisibility(0);
                sa0Var.O.setVisibility(0);
                sa0Var.R.setAdapter(null);
                sa0Var.R.setVisibility(8);
                sa0Var.K0(false);
                return;
            case 16:
                w80 w80Var = (w80) ((w4) obj).f4964b;
                w80Var.f59571y = false;
                w80Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f41305f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f41303c.setText(id.M0(2131748211, "NoExceptions"));
                notificationsCustomSettingsActivity.f41301a.setAdapter(notificationsCustomSettingsActivity.f41302b);
                notificationsCustomSettingsActivity.f41302b.f();
                notificationsCustomSettingsActivity.f41301a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f41301a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f41303c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                uy0 uy0Var = (uy0) obj;
                uy0Var.f50592f = null;
                if (uy0Var.f50589b != null) {
                    uy0Var.d.setVisibility(8);
                    uy0Var.f50589b.setAdapter(uy0Var.f50588a);
                    return;
                }
                return;
            case 21:
                o31 o31Var = (o31) obj;
                o31Var.f48408a.a(false, true);
                o31Var.o0(false, true);
                o31Var.f48412c.f37496f3.O(false);
                return;
            case 22:
                z91.f0((z91) obj, false);
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
        switch (this.f17566a) {
            case 6:
                uj ujVar = (uj) this.f17567b;
                tj tjVar = ujVar.D;
                tjVar.R.remove(o0Var);
                tjVar.Y(ujVar.F.getSearchField().getText().toString(), false);
                tjVar.a0(null, null, true);
                return;
            case 22:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f17566a) {
            case 1:
                mb mbVar = (mb) this.f17567b;
                mbVar.U = true;
                mbVar.f47900v0 = editTextBoldCursor.getText().toString();
                mbVar.Z0(true);
                return;
            case 18:
                dn0 dn0Var = (dn0) this.f17567b;
                dn0Var.f45014a.getActionBar().B();
                dn0Var.f45015b.getActionBar().B();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        pj0 pj0Var;
        int b10;
        bi.q1 q1Var;
        iw iwVar;
        yl0 yl0Var;
        v4.g0 g0Var;
        int i7 = this.f17566a;
        boolean z9 = true;
        Object obj = this.f17567b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.f17576e = editText.getText().toString();
                w1Var.f17573a.f37496f3.O(true);
                w1Var.f17573a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                uo uoVar = (uo) obj;
                if (uoVar.f50530e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (pj0Var = uoVar.f50528b) != null) {
                        v4.g0 adapter = pj0Var.getAdapter();
                        to toVar = uoVar.f50530e;
                        if (adapter != toVar) {
                            uoVar.f50528b.setAdapter(toVar);
                            uoVar.f50530e.f();
                            uoVar.f50528b.setFastScrollVisible(false);
                            uoVar.f50528b.setVerticalScrollBarEnabled(true);
                            uoVar.d.b();
                        }
                    }
                    uoVar.f50530e.F(obj2);
                    return;
                }
                return;
            case 3:
                rq rqVar = (rq) obj;
                if (rqVar.f49507e != null) {
                    String obj3 = editText.getText().toString();
                    if (rqVar.f49502c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = rqVar.f49502c.getAdapter().b();
                    }
                    rqVar.f49507e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (q1Var = rqVar.f49502c) != null) {
                        v4.g0 adapter2 = q1Var.getAdapter();
                        nq nqVar = rqVar.f49496a;
                        if (adapter2 != nqVar) {
                            bi.q1 q1Var2 = rqVar.f49502c;
                            q1Var2.W1 = false;
                            q1Var2.X1 = 0;
                            q1Var2.setAdapter(nqVar);
                            if (b10 == 0) {
                                rqVar.D0(0);
                            }
                        }
                    }
                    rqVar.C1.setVisibility(8);
                    rqVar.B1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                tq tqVar = (tq) obj;
                tqVar.f50324n = editText.getText().toString();
                w3 w3Var = tqVar.f36518a;
                if (w3Var != null) {
                    w3Var.f37496f3.O(true);
                    return;
                }
                return;
            case 5:
                a8 a8Var = (a8) obj;
                if (editText.length() > 0) {
                    a8Var.f31758t1.E(editText.getText().toString());
                    return;
                }
                a8Var.f31750p1 = false;
                a8Var.f31758t1.E(null);
                return;
            case 6:
                ((uj) obj).D.Y(editText.getText().toString(), false);
                return;
            case 7:
                vk vkVar = (vk) obj;
                e5 e5Var = vkVar.J;
                bi.q1 q1Var3 = vkVar.L;
                pj0 pj0Var2 = vkVar.M;
                tk tkVar = vkVar.N;
                if (tkVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        vkVar.f39019d0 = true;
                        vkVar.f39042x.setShowSearchProgress(true);
                        q1Var3.setVisibility(8);
                        e5Var.setVisibility(8);
                        if (pj0Var2.getAdapter() != tkVar) {
                            pj0Var2.setAdapter(tkVar);
                        }
                        pj0Var2.setVisibility(0);
                        vkVar.f39020e0 = tkVar.f16674f.isEmpty();
                        vkVar.j0();
                    } else {
                        q1Var3.setVisibility(0);
                        e5Var.setVisibility(0);
                        pj0Var2.setAdapter(null);
                        pj0Var2.setVisibility(8);
                        vkVar.f39035s.setVisibility(8);
                    }
                    tkVar.G(obj4);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f41180b0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f41200y = true;
                        pj0 pj0Var3 = contactsActivity.d;
                        if (pj0Var3 != null) {
                            pj0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f41181c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f41200y = false;
                    contactsActivity.h.G(null);
                    pj0 pj0Var4 = contactsActivity.d;
                    if (pj0Var4 != null) {
                        pj0Var4.setAdapter(contactsActivity.f41179b);
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
                    nj njVar = tsVar.d;
                    njVar.getClass();
                    njVar.f36318e = null;
                    tsVar.f50333e = false;
                    tsVar.f50330a.setAdapter(tsVar.f50332c);
                    tsVar.f50330a.setFastScrollVisible(true);
                    return;
                }
                nj njVar2 = tsVar.d;
                njVar2.getClass();
                if (obj6 == null) {
                    njVar2.f36318e = null;
                } else {
                    try {
                        Timer timer = (Timer) njVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    njVar2.h = timer2;
                    timer2.schedule(new jg.q1(2, njVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    tsVar.f50333e = true;
                    return;
                }
                return;
            case 10:
                du duVar = (du) obj;
                duVar.f45050a.getActionBar().setSearchFieldText(editText.getText().toString());
                duVar.f45051b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                zw zwVar = (zw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((iwVar = zwVar.C0) != null && (yl0Var = iwVar.f33590d0) != null && yl0Var.M()) || zwVar.f52659u3 || zwVar.K)) {
                    zwVar.f52613l2 = true;
                    if (!zwVar.f52643r3) {
                        zwVar.a5(true, false, true, false);
                    }
                }
                iw iwVar2 = zwVar.C0;
                if (iwVar2 != null) {
                    View currentView = iwVar2.getCurrentView();
                    boolean z10 = !iwVar2.f33593g0;
                    if (!TextUtils.isEmpty(iwVar2.M0)) {
                        z9 = z10;
                    }
                    iwVar2.M0 = obj7;
                    iwVar2.P(currentView, iwVar2.getCurrentPosition(), obj7, z9);
                    return;
                }
                return;
            case 12:
                String obj8 = editText.getText().toString();
                p50 p50Var = (p50) obj;
                o50.E(p50Var.f48661f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != p50Var.M) {
                    p50Var.M = z11;
                    pj0 pj0Var5 = p50Var.d;
                    if (pj0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = p50Var.f48661f;
                        } else {
                            g0Var = p50Var.f48660e;
                        }
                        pj0Var5.setAdapter(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                c60 c60Var = (c60) obj;
                if (editText.length() != 0) {
                    c60Var.f44262y = true;
                    z50 z50Var = c60Var.f44259s;
                    if (!z50Var.h) {
                        z50Var.h = true;
                        z50Var.f();
                    }
                    c60Var.f44259s.E(editText.getText().toString());
                    c60Var.h.setFastScrollVisible(false);
                    c60Var.h.setVerticalScrollBarEnabled(true);
                    c60Var.f44258r.e(true, true);
                    c60Var.f44258r.setStickerType(1);
                    c60Var.f44258r.d.setText(id.M0(2131748167, null));
                    c60Var.f44258r.f32368e.setText(id.M0(2131745807, null));
                    return;
                }
                c60.d0(c60Var);
                return;
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    pj0 pj0Var6 = languageSelectActivity.f41246b;
                    if (pj0Var6 != null) {
                        pj0Var6.setAdapter(languageSelectActivity.f41247c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f41246b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f41246b.setAdapter(languageSelectActivity.f41245a);
                    return;
                }
                return;
            case 15:
                sa0 sa0Var = (sa0) obj;
                if (sa0Var.S != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        sa0Var.f49794u0 = true;
                        sa0Var.f49789r.setShowSearchProgress(true);
                        g5 g5Var = sa0Var.V;
                        if (g5Var != null) {
                            g5Var.setVisibility(8);
                        }
                        sa0Var.Q.setVisibility(8);
                        sa0Var.O.setVisibility(8);
                        v4.g0 adapter3 = sa0Var.R.getAdapter();
                        tk tkVar2 = sa0Var.S;
                        if (adapter3 != tkVar2) {
                            sa0Var.R.setAdapter(tkVar2);
                        }
                        sa0Var.R.setVisibility(0);
                        if (sa0Var.S.b() != 0) {
                            z9 = false;
                        }
                        sa0Var.f49795v0 = z9;
                    } else {
                        g5 g5Var2 = sa0Var.V;
                        if (g5Var2 != null) {
                            g5Var2.setVisibility(0);
                        }
                        sa0Var.Q.setVisibility(0);
                        sa0Var.O.setVisibility(0);
                        sa0Var.R.setAdapter(null);
                        sa0Var.R.setVisibility(8);
                    }
                    sa0Var.L0();
                    sa0Var.M0();
                    sa0Var.S.G(obj10);
                    return;
                }
                return;
            case 16:
                ((w80) ((w4) obj).f4964b).j(editText.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f41301a != null) {
                            notificationsCustomSettingsActivity.f41303c.setText(id.M0(2131748167, "NoResult"));
                            notificationsCustomSettingsActivity.f41303c.b();
                            notificationsCustomSettingsActivity.f41301a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f41301a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f41301a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                dn0 dn0Var = (dn0) obj;
                dn0Var.f45014a.getActionBar().setSearchFieldText(editText.getText().toString());
                dn0Var.f45015b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).f41719e.I(editText.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editText.getText().toString();
                uy0 uy0Var = (uy0) obj;
                if (obj12 == null) {
                    uy0Var.f50592f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = uy0Var.f50592f;
                    if (arrayList == null) {
                        uy0Var.f50592f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < uy0Var.h.size(); i10++) {
                        y00 y00Var = (y00) uy0Var.h.get(i10);
                        if (y00Var.d.startsWith(lowerCase)) {
                            uy0Var.f50592f.add(0, y00Var);
                        } else if (y00Var.d.contains(lowerCase)) {
                            uy0Var.f50592f.add(y00Var);
                        }
                    }
                    uy0Var.f50590c.f();
                }
                if (obj12.length() != 0) {
                    pj0 pj0Var7 = uy0Var.f50589b;
                    if (pj0Var7 != null) {
                        pj0Var7.setAdapter(uy0Var.f50590c);
                        return;
                    }
                    return;
                } else if (uy0Var.f50589b != null) {
                    uy0Var.d.setVisibility(8);
                    uy0Var.f50589b.setAdapter(uy0Var.f50588a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((o31) obj).f48417f.I(editText.getText().toString());
                return;
            case 22:
                String obj13 = editText.getText().toString();
                v91 v91Var = ((z91) obj).f52380r0;
                if (!v91Var.f50665d0.equals(obj13)) {
                    v91Var.M(v91Var.f38893e[0], v91Var.getCurrentPosition(), obj13, false);
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
