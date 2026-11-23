package bi;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.r00;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.zj;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.a60;
import org.telegram.ui.ax;
import org.telegram.ui.bx;
import org.telegram.ui.dn0;
import org.telegram.ui.du;
import org.telegram.ui.gv;
import org.telegram.ui.jw;
import org.telegram.ui.lb;
import org.telegram.ui.m50;
import org.telegram.ui.n31;
import org.telegram.ui.n50;
import org.telegram.ui.nq;
import org.telegram.ui.pa0;
import org.telegram.ui.pw;
import org.telegram.ui.rq;
import org.telegram.ui.ry0;
import org.telegram.ui.s91;
import org.telegram.ui.sc1;
import org.telegram.ui.to;
import org.telegram.ui.tq;
import org.telegram.ui.ts;
import org.telegram.ui.uo;
import org.telegram.ui.w91;
import org.telegram.ui.x50;
import org.telegram.ui.xw;
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
                bx bxVar = (bx) this.f4197b;
                org.telegram.ui.ActionBar.q0 q0Var = bxVar.F1;
                if (q0Var != null) {
                    q0Var.setVisibility(0);
                }
                if (bxVar.f46597p2 != null) {
                    bxVar.finishFragment();
                    return false;
                }
                return true;
            case 19:
                ((dn0) this.f4197b).finishFragment();
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
                bx bxVar = (bx) this.f4197b;
                kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                if (!kVar.x() && bxVar.V3 == null) {
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
                    g5Var.f29964e.clearFocus();
                    org.telegram.messenger.g0.v1(g5Var.f29964e);
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
                sc1 sc1Var = wallpapersListActivity.I;
                sc1Var.f52057n = null;
                sc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(gd.N0(2131745620, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        ri.q qVar;
        int i7 = this.f4196a;
        vz vzVar = null;
        Object obj = this.f4197b;
        switch (i7) {
            case 0:
                f2.e1((f2) obj, null);
                return;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.d = false;
                y1Var.f18635e = null;
                y1Var.f18632a.f35323g3.O(true);
                y1Var.f18632a.v0(0);
                return;
            case 2:
                lb lbVar = (lb) obj;
                lbVar.f49708w0 = "";
                lbVar.J.setVisibility(0);
                if (lbVar.V) {
                    lbVar.V = false;
                    lbVar.Z0(true);
                    return;
                }
                return;
            case 3:
                uo uoVar = (uo) obj;
                uoVar.f52699e.F(null);
                uoVar.O = false;
                uoVar.getClass();
                uoVar.f52697b.setAdapter(uoVar.f52696a);
                uoVar.f52696a.f();
                uoVar.f52697b.setFastScrollVisible(true);
                uoVar.f52697b.setVerticalScrollBarEnabled(false);
                uoVar.d.setShowAtCenter(false);
                uoVar.d.b();
                return;
            case 4:
                rq rqVar = (rq) obj;
                rqVar.f51821e.F(null);
                rqVar.f51842o1 = false;
                di.b1 b1Var = rqVar.f51816c;
                b1Var.X1 = false;
                b1Var.Y1 = 0;
                b1Var.setAdapter(rqVar.f51810a);
                rqVar.f51810a.f();
                rqVar.f51816c.setFastScrollVisible(true);
                rqVar.f51816c.setVerticalScrollBarEnabled(false);
                return;
            case 5:
                tq tqVar = (tq) obj;
                tqVar.f52448n = null;
                i6 i6Var = tqVar.f34213a;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj;
                if (e8Var.f34612r1) {
                    e8Var.f34610q1 = false;
                    e8Var.f34612r1 = false;
                    e8Var.f30257r0 = true;
                    e8Var.f34618u1.E(null);
                    org.telegram.ui.ActionBar.q0 q0Var = e8Var.f34595e2;
                    if (q0Var != null) {
                        q0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                kk kkVar = (kk) obj;
                kkVar.f36760c0 = false;
                kkVar.H.setVisibility(0);
                zj zjVar = kkVar.f36766r;
                v4.i0 adapter = zjVar.getAdapter();
                dk dkVar = kkVar.f36768w;
                if (adapter != dkVar) {
                    zjVar.setAdapter(dkVar);
                }
                dkVar.f();
                kkVar.E.Y(null, true);
                return;
            case 8:
                kl klVar = (kl) obj;
                klVar.f36775d0 = false;
                klVar.f36776e0 = false;
                klVar.O.G(null);
                klVar.j0();
                klVar.M.setVisibility(0);
                klVar.K.setVisibility(0);
                klVar.N.setVisibility(8);
                klVar.f36791s.setVisibility(8);
                return;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f43101c0 = null;
                contactsActivity.E = false;
                contactsActivity.f43120y = false;
                contactsActivity.d.setAdapter(contactsActivity.f43098b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f43098b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 10:
                ts tsVar = (ts) obj;
                dk dkVar2 = tsVar.d;
                dkVar2.getClass();
                dkVar2.f34376e = null;
                tsVar.f52466f = false;
                tsVar.f52465e = false;
                tsVar.f52462a.setAdapter(tsVar.f52464c);
                tsVar.f52462a.setFastScrollVisible(true);
                return;
            case 11:
                du duVar = (du) obj;
                duVar.f47227a.getActionBar().n(false);
                duVar.f47228b.getActionBar().n(false);
                return;
            case 12:
                bx bxVar = (bx) obj;
                pw pwVar = bxVar.Y;
                if (pwVar != null) {
                    ArrayList arrayList = pwVar.G;
                    if (!arrayList.isEmpty() && pwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((gv) pwVar.I).e((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                bxVar.f46579l2 = false;
                bxVar.f46583m2 = false;
                ax axVar = bxVar.f46549f0[0];
                if (axVar != null) {
                    xw xwVar = axVar.f45822a;
                    if (bxVar.Y2 == 0) {
                        vzVar = axVar.f45831x;
                    }
                    xwVar.setEmptyView(vzVar);
                    bxVar.i5(false, false, true, false);
                }
                bxVar.u5(false, false);
                ks.e().k(271, Boolean.TRUE);
                bxVar.Y.setCloseButtonVisible(false);
                bxVar.t5(true);
                bxVar.N3();
                qVar = ((org.telegram.ui.ActionBar.g2) bxVar).glassEngine;
                qVar.g();
                return;
            case 13:
                n50 n50Var = (n50) obj;
                if (n50Var.N) {
                    m50.E(n50Var.f50225f, null);
                    n50Var.N = false;
                    n50Var.d.setAdapter(n50Var.f50224e);
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
                if (languageSelectActivity.f43181b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f43181b.setAdapter(languageSelectActivity.f43180a);
                    return;
                }
                return;
            case 16:
                pa0 pa0Var = (pa0) obj;
                pa0Var.f50945u0 = false;
                pa0Var.f50946v0 = false;
                pa0Var.T.G(null);
                pa0Var.O0();
                org.telegram.ui.ActionBar.g5 g5Var = pa0Var.W;
                if (g5Var != null) {
                    g5Var.setVisibility(0);
                }
                pa0Var.R.setVisibility(0);
                pa0Var.P.setVisibility(0);
                pa0Var.S.setAdapter(null);
                pa0Var.S.setVisibility(8);
                pa0Var.N0(false);
                return;
            case 17:
                i90 i90Var = (i90) ((e9) obj).f3516b;
                i90Var.f62158y = false;
                i90Var.j(null);
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f43240f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f43238c.setText(gd.N0(2131748018, "NoExceptions"));
                notificationsCustomSettingsActivity.f43236a.setAdapter(notificationsCustomSettingsActivity.f43237b);
                notificationsCustomSettingsActivity.f43237b.f();
                notificationsCustomSettingsActivity.f43236a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f43236a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f43238c.setShowAtCenter(false);
                return;
            case 19:
            case 20:
            default:
                return;
            case 21:
                ry0 ry0Var = (ry0) obj;
                ry0Var.f51921f = null;
                if (ry0Var.f51918b != null) {
                    ry0Var.d.setVisibility(8);
                    ry0Var.f51918b.setAdapter(ry0Var.f51917a);
                    return;
                }
                return;
            case 22:
                n31 n31Var = (n31) obj;
                n31Var.f50188a.a(false, true);
                n31Var.o0(false, true);
                n31Var.f50192c.f35323g3.O(false);
                return;
            case 23:
                w91.f0((w91) obj, false);
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
                kk kkVar = (kk) this.f4197b;
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
        switch (this.f4196a) {
            case 2:
                lb lbVar = (lb) this.f4197b;
                lbVar.V = true;
                lbVar.f49708w0 = editTextBoldCursor.getText().toString();
                lbVar.Z0(true);
                return;
            case 19:
                dn0 dn0Var = (dn0) this.f4197b;
                dn0Var.f47195a.getActionBar().B();
                dn0Var.f47196b.getActionBar().B();
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
        jw jwVar;
        mm0 mm0Var;
        v4.i0 i0Var;
        int i7 = this.f4196a;
        boolean z10 = true;
        Object obj = this.f4197b;
        switch (i7) {
            case 0:
                f2.e1((f2) obj, editText.getText().toString());
                return;
            case 1:
                kg.y1 y1Var = (kg.y1) obj;
                y1Var.f18635e = editText.getText().toString();
                y1Var.f18632a.f35323g3.O(true);
                y1Var.f18632a.v0(0);
                return;
            case 2:
            default:
                return;
            case 3:
                uo uoVar = (uo) obj;
                if (uoVar.f52699e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (ek0Var = uoVar.f52697b) != null) {
                        v4.i0 adapter = ek0Var.getAdapter();
                        to toVar = uoVar.f52699e;
                        if (adapter != toVar) {
                            uoVar.f52697b.setAdapter(toVar);
                            uoVar.f52699e.f();
                            uoVar.f52697b.setFastScrollVisible(false);
                            uoVar.f52697b.setVerticalScrollBarEnabled(true);
                            uoVar.d.b();
                        }
                    }
                    uoVar.f52699e.F(obj2);
                    return;
                }
                return;
            case 4:
                rq rqVar = (rq) obj;
                if (rqVar.f51821e != null) {
                    String obj3 = editText.getText().toString();
                    if (rqVar.f51816c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = rqVar.f51816c.getAdapter().b();
                    }
                    rqVar.f51821e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = rqVar.f51816c) != null) {
                        v4.i0 adapter2 = b1Var.getAdapter();
                        nq nqVar = rqVar.f51810a;
                        if (adapter2 != nqVar) {
                            di.b1 b1Var2 = rqVar.f51816c;
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
                tqVar.f52448n = editText.getText().toString();
                i6 i6Var = tqVar.f34213a;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj;
                if (editText.length() > 0) {
                    e8Var.f34618u1.E(editText.getText().toString());
                    return;
                }
                e8Var.f34610q1 = false;
                e8Var.f34618u1.E(null);
                return;
            case 7:
                ((kk) obj).E.Y(editText.getText().toString(), false);
                return;
            case 8:
                kl klVar = (kl) obj;
                g3 g3Var = klVar.K;
                di.b1 b1Var3 = klVar.M;
                ek0 ek0Var2 = klVar.N;
                il ilVar = klVar.O;
                if (ilVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        klVar.f36776e0 = true;
                        klVar.f36798x.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        g3Var.setVisibility(8);
                        if (ek0Var2.getAdapter() != ilVar) {
                            ek0Var2.setAdapter(ilVar);
                        }
                        ek0Var2.setVisibility(0);
                        klVar.f36777f0 = ilVar.f17502f.isEmpty();
                        klVar.j0();
                    } else {
                        b1Var3.setVisibility(0);
                        g3Var.setVisibility(0);
                        ek0Var2.setAdapter(null);
                        ek0Var2.setVisibility(8);
                        klVar.f36791s.setVisibility(8);
                    }
                    ilVar.G(obj4);
                    return;
                }
                return;
            case 9:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f43101c0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f43120y = true;
                        ek0 ek0Var3 = contactsActivity.d;
                        if (ek0Var3 != null) {
                            ek0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f43100c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f43120y = false;
                    contactsActivity.h.G(null);
                    ek0 ek0Var4 = contactsActivity.d;
                    if (ek0Var4 != null) {
                        ek0Var4.setAdapter(contactsActivity.f43098b);
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
                    dk dkVar = tsVar.d;
                    dkVar.getClass();
                    dkVar.f34376e = null;
                    tsVar.f52465e = false;
                    tsVar.f52462a.setAdapter(tsVar.f52464c);
                    tsVar.f52462a.setFastScrollVisible(true);
                    return;
                }
                dk dkVar2 = tsVar.d;
                dkVar2.getClass();
                if (obj6 == null) {
                    dkVar2.f34376e = null;
                } else {
                    try {
                        Timer timer = (Timer) dkVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    dkVar2.h = timer2;
                    timer2.schedule(new jg.q1(2, dkVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    tsVar.f52465e = true;
                    return;
                }
                return;
            case 11:
                du duVar = (du) obj;
                duVar.f47227a.getActionBar().setSearchFieldText(editText.getText().toString());
                duVar.f47228b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 12:
                bx bxVar = (bx) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((jwVar = bxVar.D0) != null && (mm0Var = jwVar.f40085e0) != null && mm0Var.M()) || bxVar.f46630v3 || bxVar.L)) {
                    bxVar.f46583m2 = true;
                    if (!bxVar.f46615s3) {
                        bxVar.i5(true, false, true, false);
                    }
                }
                jw jwVar2 = bxVar.D0;
                if (jwVar2 != null) {
                    View currentView = jwVar2.getCurrentView();
                    boolean z11 = !jwVar2.f40088h0;
                    if (!TextUtils.isEmpty(jwVar2.N0)) {
                        z10 = z11;
                    }
                    jwVar2.N0 = obj7;
                    jwVar2.N(currentView, jwVar2.getCurrentPosition(), obj7, z10);
                    return;
                }
                return;
            case 13:
                String obj8 = editText.getText().toString();
                n50 n50Var = (n50) obj;
                m50.E(n50Var.f50225f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z12 = !isEmpty;
                if (z12 != n50Var.N) {
                    n50Var.N = z12;
                    ek0 ek0Var5 = n50Var.d;
                    if (ek0Var5 != null) {
                        if (!isEmpty) {
                            i0Var = n50Var.f50225f;
                        } else {
                            i0Var = n50Var.f50224e;
                        }
                        ek0Var5.setAdapter(i0Var);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                a60 a60Var = (a60) obj;
                if (editText.length() != 0) {
                    a60Var.f45605y = true;
                    x50 x50Var = a60Var.f45602s;
                    if (!x50Var.h) {
                        x50Var.h = true;
                        x50Var.f();
                    }
                    a60Var.f45602s.E(editText.getText().toString());
                    a60Var.h.setFastScrollVisible(false);
                    a60Var.h.setVerticalScrollBarEnabled(true);
                    a60Var.f45601r.e(true, true);
                    a60Var.f45601r.setStickerType(1);
                    a60Var.f45601r.d.setText(gd.N0(2131747974, null));
                    a60Var.f45601r.f37553e.setText(gd.N0(2131745611, null));
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
                    ek0 ek0Var6 = languageSelectActivity.f43181b;
                    if (ek0Var6 != null) {
                        ek0Var6.setAdapter(languageSelectActivity.f43182c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f43181b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f43181b.setAdapter(languageSelectActivity.f43180a);
                    return;
                }
                return;
            case 16:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        pa0Var.f50946v0 = true;
                        pa0Var.f50940r.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.g5 g5Var = pa0Var.W;
                        if (g5Var != null) {
                            g5Var.setVisibility(8);
                        }
                        pa0Var.R.setVisibility(8);
                        pa0Var.P.setVisibility(8);
                        v4.i0 adapter3 = pa0Var.S.getAdapter();
                        il ilVar2 = pa0Var.T;
                        if (adapter3 != ilVar2) {
                            pa0Var.S.setAdapter(ilVar2);
                        }
                        pa0Var.S.setVisibility(0);
                        if (pa0Var.T.b() != 0) {
                            z10 = false;
                        }
                        pa0Var.f50948w0 = z10;
                    } else {
                        org.telegram.ui.ActionBar.g5 g5Var2 = pa0Var.W;
                        if (g5Var2 != null) {
                            g5Var2.setVisibility(0);
                        }
                        pa0Var.R.setVisibility(0);
                        pa0Var.P.setVisibility(0);
                        pa0Var.S.setAdapter(null);
                        pa0Var.S.setVisibility(8);
                    }
                    pa0Var.O0();
                    pa0Var.P0();
                    pa0Var.T.G(obj10);
                    return;
                }
                return;
            case 17:
                ((i90) ((e9) obj).f3516b).j(editText.getText().toString());
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f43236a != null) {
                            notificationsCustomSettingsActivity.f43238c.setText(gd.N0(2131747974, "NoResult"));
                            notificationsCustomSettingsActivity.f43238c.b();
                            notificationsCustomSettingsActivity.f43236a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f43236a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f43236a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 19:
                dn0 dn0Var = (dn0) obj;
                dn0Var.f47195a.getActionBar().setSearchFieldText(editText.getText().toString());
                dn0Var.f47196b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 20:
                ((ProfileActivity) obj).f43664e.I(editText.getText().toString().toLowerCase());
                return;
            case 21:
                String obj12 = editText.getText().toString();
                ry0 ry0Var = (ry0) obj;
                if (obj12 == null) {
                    ry0Var.f51921f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = ry0Var.f51921f;
                    if (arrayList == null) {
                        ry0Var.f51921f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < ry0Var.h.size(); i10++) {
                        r00 r00Var = (r00) ry0Var.h.get(i10);
                        if (r00Var.d.startsWith(lowerCase)) {
                            ry0Var.f51921f.add(0, r00Var);
                        } else if (r00Var.d.contains(lowerCase)) {
                            ry0Var.f51921f.add(r00Var);
                        }
                    }
                    ry0Var.f51919c.f();
                }
                if (obj12.length() != 0) {
                    ek0 ek0Var7 = ry0Var.f51918b;
                    if (ek0Var7 != null) {
                        ek0Var7.setAdapter(ry0Var.f51919c);
                        return;
                    }
                    return;
                } else if (ry0Var.f51918b != null) {
                    ry0Var.d.setVisibility(8);
                    ry0Var.f51918b.setAdapter(ry0Var.f51917a);
                    return;
                } else {
                    return;
                }
            case 22:
                ((n31) obj).f50197f.I(editText.getText().toString());
                return;
            case 23:
                String obj13 = editText.getText().toString();
                s91 s91Var = ((w91) obj).f53257s0;
                if (!s91Var.f52010e0.equals(obj13)) {
                    s91Var.K(s91Var.f36665e[0], s91Var.getCurrentPosition(), obj13, false);
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
