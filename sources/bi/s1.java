package bi;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.s00;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yj;
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
import org.telegram.ui.tq;
import org.telegram.ui.ts;
import org.telegram.ui.u91;
import org.telegram.ui.uc1;
import org.telegram.ui.uo;
import org.telegram.ui.vo;
import org.telegram.ui.x50;
import org.telegram.ui.y91;
import org.telegram.ui.yw;
public final class s1 extends org.telegram.ui.ActionBar.n0 {
    public final int f4016a;
    public final Object f4017b;

    public s1(Object obj, int i7) {
        this.f4016a = i7;
        this.f4017b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f4016a) {
            case 12:
                cx cxVar = (cx) this.f4017b;
                org.telegram.ui.ActionBar.r0 r0Var = cxVar.F1;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                if (cxVar.f46711p2 != null) {
                    cxVar.finishFragment();
                    return false;
                }
                return true;
            case 19:
                ((fn0) this.f4017b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f4016a) {
            case 12:
                cx cxVar = (cx) this.f4017b;
                kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
                if (!kVar.y() && cxVar.V3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f4016a) {
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) this.f4017b;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                    h5Var.f29921e.clearFocus();
                    org.telegram.messenger.g0.v1(h5Var.f29921e);
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
        switch (this.f4016a) {
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f4017b;
                uc1 uc1Var = wallpapersListActivity.I;
                uc1Var.f52523n = null;
                uc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(gd.M0(2131745621, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        ri.q qVar;
        int i7 = this.f4016a;
        wz wzVar = null;
        Object obj = this.f4017b;
        switch (i7) {
            case 0:
                a2.e1((a2) obj, null);
                return;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.d = false;
                y1Var.f18543e = null;
                y1Var.f18540a.f34607g3.O(true);
                y1Var.f18540a.v0(0);
                return;
            case 2:
                lb lbVar = (lb) obj;
                lbVar.f49529w0 = "";
                lbVar.J.setVisibility(0);
                if (lbVar.V) {
                    lbVar.V = false;
                    lbVar.Z0(true);
                    return;
                }
                return;
            case 3:
                vo voVar = (vo) obj;
                voVar.f52816e.F(null);
                voVar.O = false;
                voVar.getClass();
                voVar.f52814b.setAdapter(voVar.f52813a);
                voVar.f52813a.f();
                voVar.f52814b.setFastScrollVisible(true);
                voVar.f52814b.setVerticalScrollBarEnabled(false);
                voVar.d.setShowAtCenter(false);
                voVar.d.b();
                return;
            case 4:
                rq rqVar = (rq) obj;
                rqVar.f51727e.F(null);
                rqVar.f51748o1 = false;
                di.b1 b1Var = rqVar.f51722c;
                b1Var.X1 = false;
                b1Var.Y1 = 0;
                b1Var.setAdapter(rqVar.f51716a);
                rqVar.f51716a.f();
                rqVar.f51722c.setFastScrollVisible(true);
                rqVar.f51722c.setVerticalScrollBarEnabled(false);
                return;
            case 5:
                tq tqVar = (tq) obj;
                tqVar.f52325n = null;
                c6 c6Var = tqVar.f33530a;
                if (c6Var != null) {
                    c6Var.f34607g3.O(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj;
                if (g8Var.f35406r1) {
                    g8Var.f35404q1 = false;
                    g8Var.f35406r1 = false;
                    g8Var.f30221r0 = true;
                    g8Var.f35412u1.E(null);
                    org.telegram.ui.ActionBar.r0 r0Var = g8Var.f35389e2;
                    if (r0Var != null) {
                        r0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                kk kkVar = (kk) obj;
                kkVar.f36775c0 = false;
                kkVar.H.setVisibility(0);
                yj yjVar = kkVar.f36781r;
                v4.i0 adapter = yjVar.getAdapter();
                ck ckVar = kkVar.f36783w;
                if (adapter != ckVar) {
                    yjVar.setAdapter(ckVar);
                }
                ckVar.f();
                kkVar.E.Y(null, true);
                return;
            case 8:
                kl klVar = (kl) obj;
                klVar.f36796d0 = false;
                klVar.f36797e0 = false;
                klVar.O.G(null);
                klVar.j0();
                klVar.M.setVisibility(0);
                klVar.K.setVisibility(0);
                klVar.N.setVisibility(8);
                klVar.f36812s.setVisibility(8);
                return;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f42981c0 = null;
                contactsActivity.E = false;
                contactsActivity.f43000y = false;
                contactsActivity.d.setAdapter(contactsActivity.f42978b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f42978b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 10:
                ts tsVar = (ts) obj;
                ck ckVar2 = tsVar.d;
                ckVar2.getClass();
                ckVar2.f34040e = null;
                tsVar.f52344f = false;
                tsVar.f52343e = false;
                tsVar.f52340a.setAdapter(tsVar.f52342c);
                tsVar.f52340a.setFastScrollVisible(true);
                return;
            case 11:
                eu euVar = (eu) obj;
                euVar.f47311a.getActionBar().o(false);
                euVar.f47312b.getActionBar().o(false);
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
                cxVar.f46693l2 = false;
                cxVar.f46697m2 = false;
                bx bxVar = cxVar.f46663f0[0];
                if (bxVar != null) {
                    yw ywVar = bxVar.f46298a;
                    if (cxVar.Y2 == 0) {
                        wzVar = bxVar.f46307x;
                    }
                    ywVar.setEmptyView(wzVar);
                    cxVar.i5(false, false, true, false);
                }
                cxVar.u5(false, false);
                ks.e().k(271, Boolean.TRUE);
                cxVar.Y.setCloseButtonVisible(false);
                cxVar.t5(true);
                cxVar.N3();
                qVar = ((org.telegram.ui.ActionBar.h2) cxVar).glassEngine;
                qVar.g();
                return;
            case 13:
                n50 n50Var = (n50) obj;
                if (n50Var.N) {
                    m50.E(n50Var.f50061f, null);
                    n50Var.N = false;
                    n50Var.d.setAdapter(n50Var.f50060e);
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
                if (languageSelectActivity.f43061b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f43061b.setAdapter(languageSelectActivity.f43060a);
                    return;
                }
                return;
            case 16:
                qa0 qa0Var = (qa0) obj;
                qa0Var.f51133u0 = false;
                qa0Var.f51134v0 = false;
                qa0Var.T.G(null);
                qa0Var.O0();
                org.telegram.ui.ActionBar.h5 h5Var = qa0Var.W;
                if (h5Var != null) {
                    h5Var.setVisibility(0);
                }
                qa0Var.R.setVisibility(0);
                qa0Var.P.setVisibility(0);
                qa0Var.S.setAdapter(null);
                qa0Var.S.setVisibility(8);
                qa0Var.N0(false);
                return;
            case 17:
                j90 j90Var = (j90) ((y8) obj).f4255b;
                j90Var.f62030y = false;
                j90Var.j(null);
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f43120f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f43118c.setText(gd.M0(2131748019, "NoExceptions"));
                notificationsCustomSettingsActivity.f43116a.setAdapter(notificationsCustomSettingsActivity.f43117b);
                notificationsCustomSettingsActivity.f43117b.f();
                notificationsCustomSettingsActivity.f43116a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f43116a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f43118c.setShowAtCenter(false);
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
                o31Var.f50426a.a(false, true);
                o31Var.o0(false, true);
                o31Var.f50430c.f34607g3.O(false);
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
        throw new UnsupportedOperationException("Method not decompiled: bi.s1.i():void");
    }

    @Override
    public void j(jg.o0 o0Var) {
        switch (this.f4016a) {
            case 7:
                kk kkVar = (kk) this.f4017b;
                jk jkVar = kkVar.E;
                jkVar.S.remove(o0Var);
                jkVar.Y(kkVar.G.getSearchField().getText().toString(), false);
                jkVar.a0(null, null, true);
                return;
            case 23:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f4016a) {
            case 2:
                lb lbVar = (lb) this.f4017b;
                lbVar.V = true;
                lbVar.f49529w0 = editTextBoldCursor.getText().toString();
                lbVar.Z0(true);
                return;
            case 19:
                fn0 fn0Var = (fn0) this.f4017b;
                fn0Var.f47723a.getActionBar().C();
                fn0Var.f47724b.getActionBar().C();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        ck0 ck0Var;
        int b10;
        di.b1 b1Var;
        kw kwVar;
        km0 km0Var;
        v4.i0 i0Var;
        int i7 = this.f4016a;
        boolean z10 = true;
        Object obj = this.f4017b;
        switch (i7) {
            case 0:
                a2.e1((a2) obj, editText.getText().toString());
                return;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.f18543e = editText.getText().toString();
                y1Var.f18540a.f34607g3.O(true);
                y1Var.f18540a.v0(0);
                return;
            case 2:
            default:
                return;
            case 3:
                vo voVar = (vo) obj;
                if (voVar.f52816e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (ck0Var = voVar.f52814b) != null) {
                        v4.i0 adapter = ck0Var.getAdapter();
                        uo uoVar = voVar.f52816e;
                        if (adapter != uoVar) {
                            voVar.f52814b.setAdapter(uoVar);
                            voVar.f52816e.f();
                            voVar.f52814b.setFastScrollVisible(false);
                            voVar.f52814b.setVerticalScrollBarEnabled(true);
                            voVar.d.b();
                        }
                    }
                    voVar.f52816e.F(obj2);
                    return;
                }
                return;
            case 4:
                rq rqVar = (rq) obj;
                if (rqVar.f51727e != null) {
                    String obj3 = editText.getText().toString();
                    if (rqVar.f51722c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = rqVar.f51722c.getAdapter().b();
                    }
                    rqVar.f51727e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = rqVar.f51722c) != null) {
                        v4.i0 adapter2 = b1Var.getAdapter();
                        nq nqVar = rqVar.f51716a;
                        if (adapter2 != nqVar) {
                            di.b1 b1Var2 = rqVar.f51722c;
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
                tqVar.f52325n = editText.getText().toString();
                c6 c6Var = tqVar.f33530a;
                if (c6Var != null) {
                    c6Var.f34607g3.O(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj;
                if (editText.length() > 0) {
                    g8Var.f35412u1.E(editText.getText().toString());
                    return;
                }
                g8Var.f35404q1 = false;
                g8Var.f35412u1.E(null);
                return;
            case 7:
                ((kk) obj).E.Y(editText.getText().toString(), false);
                return;
            case 8:
                kl klVar = (kl) obj;
                a3 a3Var = klVar.K;
                di.b1 b1Var3 = klVar.M;
                ck0 ck0Var2 = klVar.N;
                il ilVar = klVar.O;
                if (ilVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        klVar.f36797e0 = true;
                        klVar.f36819x.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        a3Var.setVisibility(8);
                        if (ck0Var2.getAdapter() != ilVar) {
                            ck0Var2.setAdapter(ilVar);
                        }
                        ck0Var2.setVisibility(0);
                        klVar.f36798f0 = ilVar.f17406f.isEmpty();
                        klVar.j0();
                    } else {
                        b1Var3.setVisibility(0);
                        a3Var.setVisibility(0);
                        ck0Var2.setAdapter(null);
                        ck0Var2.setVisibility(8);
                        klVar.f36812s.setVisibility(8);
                    }
                    ilVar.G(obj4);
                    return;
                }
                return;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f42981c0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f43000y = true;
                        ck0 ck0Var3 = contactsActivity.d;
                        if (ck0Var3 != null) {
                            ck0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f42980c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f43000y = false;
                    contactsActivity.h.G(null);
                    ck0 ck0Var4 = contactsActivity.d;
                    if (ck0Var4 != null) {
                        ck0Var4.setAdapter(contactsActivity.f42978b);
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
                    ck ckVar = tsVar.d;
                    ckVar.getClass();
                    ckVar.f34040e = null;
                    tsVar.f52343e = false;
                    tsVar.f52340a.setAdapter(tsVar.f52342c);
                    tsVar.f52340a.setFastScrollVisible(true);
                    return;
                }
                ck ckVar2 = tsVar.d;
                ckVar2.getClass();
                if (obj6 == null) {
                    ckVar2.f34040e = null;
                } else {
                    try {
                        Timer timer = (Timer) ckVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    ckVar2.h = timer2;
                    timer2.schedule(new jg.q1(2, ckVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    tsVar.f52343e = true;
                    return;
                }
                return;
            case 11:
                eu euVar = (eu) obj;
                euVar.f47311a.getActionBar().setSearchFieldText(editText.getText().toString());
                euVar.f47312b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 12:
                cx cxVar = (cx) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((kwVar = cxVar.D0) != null && (km0Var = kwVar.f39185e0) != null && km0Var.M()) || cxVar.f46744v3 || cxVar.L)) {
                    cxVar.f46697m2 = true;
                    if (!cxVar.f46729s3) {
                        cxVar.i5(true, false, true, false);
                    }
                }
                kw kwVar2 = cxVar.D0;
                if (kwVar2 != null) {
                    View currentView = kwVar2.getCurrentView();
                    boolean z11 = !kwVar2.f39188h0;
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
                m50.E(n50Var.f50061f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z12 = !isEmpty;
                if (z12 != n50Var.N) {
                    n50Var.N = z12;
                    ck0 ck0Var5 = n50Var.d;
                    if (ck0Var5 != null) {
                        if (!isEmpty) {
                            i0Var = n50Var.f50061f;
                        } else {
                            i0Var = n50Var.f50060e;
                        }
                        ck0Var5.setAdapter(i0Var);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                a60 a60Var = (a60) obj;
                if (editText.length() != 0) {
                    a60Var.f45477y = true;
                    x50 x50Var = a60Var.f45474s;
                    if (!x50Var.h) {
                        x50Var.h = true;
                        x50Var.f();
                    }
                    a60Var.f45474s.E(editText.getText().toString());
                    a60Var.h.setFastScrollVisible(false);
                    a60Var.h.setVerticalScrollBarEnabled(true);
                    a60Var.f45473r.e(true, true);
                    a60Var.f45473r.setStickerType(1);
                    a60Var.f45473r.d.setText(gd.M0(2131747975, null));
                    a60Var.f45473r.f36896e.setText(gd.M0(2131745612, null));
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
                    ck0 ck0Var6 = languageSelectActivity.f43061b;
                    if (ck0Var6 != null) {
                        ck0Var6.setAdapter(languageSelectActivity.f43062c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f43061b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f43061b.setAdapter(languageSelectActivity.f43060a);
                    return;
                }
                return;
            case 16:
                qa0 qa0Var = (qa0) obj;
                if (qa0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        qa0Var.f51134v0 = true;
                        qa0Var.f51128r.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.h5 h5Var = qa0Var.W;
                        if (h5Var != null) {
                            h5Var.setVisibility(8);
                        }
                        qa0Var.R.setVisibility(8);
                        qa0Var.P.setVisibility(8);
                        v4.i0 adapter3 = qa0Var.S.getAdapter();
                        il ilVar2 = qa0Var.T;
                        if (adapter3 != ilVar2) {
                            qa0Var.S.setAdapter(ilVar2);
                        }
                        qa0Var.S.setVisibility(0);
                        if (qa0Var.T.b() != 0) {
                            z10 = false;
                        }
                        qa0Var.f51136w0 = z10;
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var2 = qa0Var.W;
                        if (h5Var2 != null) {
                            h5Var2.setVisibility(0);
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
                ((j90) ((y8) obj).f4255b).j(editText.getText().toString());
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f43116a != null) {
                            notificationsCustomSettingsActivity.f43118c.setText(gd.M0(2131747975, "NoResult"));
                            notificationsCustomSettingsActivity.f43118c.b();
                            notificationsCustomSettingsActivity.f43116a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f43116a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f43116a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 19:
                fn0 fn0Var = (fn0) obj;
                fn0Var.f47723a.getActionBar().setSearchFieldText(editText.getText().toString());
                fn0Var.f47724b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 20:
                ((ProfileActivity) obj).f43538e.I(editText.getText().toString().toLowerCase());
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
                        s00 s00Var = (s00) sy0Var.h.get(i10);
                        if (s00Var.d.startsWith(lowerCase)) {
                            sy0Var.f52112f.add(0, s00Var);
                        } else if (s00Var.d.contains(lowerCase)) {
                            sy0Var.f52112f.add(s00Var);
                        }
                    }
                    sy0Var.f52110c.f();
                }
                if (obj12.length() != 0) {
                    ck0 ck0Var7 = sy0Var.f52109b;
                    if (ck0Var7 != null) {
                        ck0Var7.setAdapter(sy0Var.f52110c);
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
                ((o31) obj).f50435f.I(editText.getText().toString());
                return;
            case 23:
                String obj13 = editText.getText().toString();
                u91 u91Var = ((y91) obj).f54091s0;
                if (!u91Var.f52472e0.equals(obj13)) {
                    u91Var.I(u91Var.f35378e[0], u91Var.getCurrentPosition(), obj13, false);
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
