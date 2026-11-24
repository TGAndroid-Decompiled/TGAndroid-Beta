package defpackage;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
public final class q20 extends n7 {
    public final byte a;
    public final Object b;

    public q20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                nk3 nk3Var = (nk3) obj;
                r7 r7Var = nk3Var.F1;
                if (r7Var != null) {
                    r7Var.setVisibility(0);
                }
                if (nk3Var.p2 != null) {
                    nk3Var.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((d88) obj).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public final boolean c() {
        a aVar;
        switch (this.a) {
            case 10:
                nk3 nk3Var = (nk3) this.b;
                aVar = ((d) nk3Var).actionBar;
                if (!aVar.y() && nk3Var.X3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public final Animator e() {
        switch (this.a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                boolean z = profileActivity.X1;
                profileActivity.X1 = !z;
                if (z) {
                    zja zjaVar = profileActivity.U0;
                    zjaVar.e.clearFocus();
                    gm.t1(zjaVar.e);
                }
                if (profileActivity.X1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return profileActivity.o3(profileActivity.X1);
            default:
                return super.e();
        }
    }

    @Override
    public final void f() {
        switch (this.a) {
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                qtc qtcVar = wallpapersListActivity.I;
                qtcVar.n = null;
                qtcVar.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(jb6.M0(2131745550, null));
                return;
            default:
                return;
        }
    }

    @Override
    public final void h() {
        sy4 sy4Var;
        byte b = this.a;
        tk4 tk4Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                i30 i30Var = (i30) obj;
                if (i30Var.q1) {
                    i30Var.p1 = false;
                    i30Var.q1 = false;
                    i30Var.r0 = true;
                    i30Var.t1.E(null);
                    r7 r7Var = i30Var.d2;
                    if (r7Var != null) {
                        r7Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                vg1 vg1Var = (vg1) obj;
                vg1Var.w0 = "";
                vg1Var.J.setVisibility(0);
                if (vg1Var.V) {
                    vg1Var.V = false;
                    vg1Var.X0(true);
                    return;
                }
                return;
            case 2:
                p42 p42Var = (p42) obj;
                p42Var.c0 = false;
                p42Var.H.setVisibility(0);
                d42 d42Var = p42Var.r;
                y59 adapter = d42Var.getAdapter();
                h42 h42Var = p42Var.w;
                if (adapter != h42Var) {
                    d42Var.setAdapter(h42Var);
                }
                h42Var.f();
                p42Var.E.Y(null, true);
                return;
            case 3:
                n52 n52Var = (n52) obj;
                n52Var.d0 = false;
                n52Var.e0 = false;
                n52Var.O.G(null);
                n52Var.i0();
                n52Var.M.setVisibility(0);
                n52Var.K.setVisibility(0);
                n52Var.N.setVisibility(8);
                n52Var.s.setVisibility(8);
                return;
            case 4:
                ib2 ib2Var = (ib2) obj;
                ib2Var.e.F(null);
                ib2Var.O = false;
                ib2Var.b.setAdapter(ib2Var.a);
                ib2Var.a.f();
                ib2Var.b.setFastScrollVisible(true);
                ib2Var.b.setVerticalScrollBarEnabled(false);
                ib2Var.d.setShowAtCenter(false);
                ib2Var.d.b();
                return;
            case 5:
                wg2 wg2Var = (wg2) obj;
                wg2Var.e.F(null);
                wg2Var.o1 = false;
                fv fvVar = wg2Var.c;
                fvVar.X1 = false;
                fvVar.Y1 = false;
                fvVar.setAdapter(wg2Var.a);
                wg2Var.a.f();
                wg2Var.c.setFastScrollVisible(true);
                wg2Var.c.setVerticalScrollBarEnabled(false);
                return;
            case 6:
                yh2 yh2Var = (yh2) obj;
                yh2Var.n = null;
                va vaVar = yh2Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.c0 = null;
                contactsActivity.E = false;
                contactsActivity.y = false;
                contactsActivity.d.setAdapter(contactsActivity.b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                contactsActivity.f0();
                return;
            case 8:
                az2 az2Var = (az2) obj;
                h42 h42Var2 = az2Var.d;
                h42Var2.getClass();
                h42Var2.e = null;
                az2Var.f = false;
                az2Var.e = false;
                az2Var.a.setAdapter(az2Var.c);
                az2Var.a.setFastScrollVisible(true);
                return;
            case 9:
                ug3 ug3Var = (ug3) obj;
                ug3Var.a.getActionBar().o(false);
                ug3Var.b.getActionBar().o(false);
                return;
            case 10:
                nk3 nk3Var = (nk3) obj;
                zj3 zj3Var = nk3Var.Y;
                if (zj3Var != null) {
                    ArrayList arrayList = zj3Var.G;
                    if (!arrayList.isEmpty() && zj3Var.I != null) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (((sh4) arrayList.get(i)).h) {
                                ((pj3) zj3Var.I).a((sh4) arrayList.get(i));
                            }
                        }
                    }
                }
                nk3Var.l2 = false;
                nk3Var.m2 = false;
                mk3 mk3Var = nk3Var.f0[0];
                if (mk3Var != null) {
                    jk3 jk3Var = mk3Var.a;
                    if (nk3Var.Y2 == 0) {
                        tk4Var = mk3Var.x;
                    }
                    jk3Var.setEmptyView(tk4Var);
                    nk3Var.k5(false, false, true, false);
                }
                nk3Var.w5(false, false);
                nm7.e().k(273, Boolean.TRUE);
                nk3Var.Y.setCloseButtonVisible(false);
                nk3Var.v5(true);
                nk3Var.X2();
                sy4Var = ((d) nk3Var).glassEngine;
                sy4Var.g();
                return;
            case 11:
                ((yw4) obj).d1(null);
                return;
            case 12:
                kd5 kd5Var = (kd5) obj;
                if (kd5Var.N) {
                    kd5Var.f.E(null);
                    kd5Var.N = false;
                    kd5Var.d.setAdapter(kd5Var.e);
                    return;
                }
                return;
            case 13:
                ((es5) obj).c0();
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                if (languageSelectActivity.b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    return;
                }
                return;
            case 15:
                pc6 pc6Var = (pc6) obj;
                pc6Var.u0 = false;
                pc6Var.v0 = false;
                pc6Var.T.G(null);
                pc6Var.O0();
                zja zjaVar = pc6Var.W;
                if (zjaVar != null) {
                    zjaVar.setVisibility(0);
                }
                pc6Var.R.setVisibility(0);
                pc6Var.P.setVisibility(0);
                pc6Var.S.setAdapter(null);
                pc6Var.S.setVisibility(8);
                pc6Var.N0(false);
                return;
            case 16:
                m07 m07Var = (m07) ((qv0) obj).b;
                m07Var.y = false;
                m07Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.c.setText(jb6.M0(2131747945, "NoExceptions"));
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
                notificationsCustomSettingsActivity.b.f();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                qc9 qc9Var = (qc9) obj;
                qc9Var.f = null;
                if (qc9Var.b != null) {
                    qc9Var.d.setVisibility(8);
                    qc9Var.b.setAdapter(qc9Var.a);
                    return;
                }
                return;
            case 21:
                daa daaVar = (daa) obj;
                daaVar.a.a(false, true);
                daaVar.o0(false, true);
                daaVar.c.g3.O(false);
                return;
            case 22:
                wqb wqbVar = (wqb) obj;
                wqbVar.d = false;
                wqbVar.e = null;
                wqbVar.a.g3.O(true);
                wqbVar.a.w0(0);
                return;
            case 23:
                ((sxb) obj).x0(false);
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
    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q20.i():void");
    }

    @Override
    public final void j(sh4 sh4Var) {
        switch (this.a) {
            case 2:
                p42 p42Var = (p42) this.b;
                o42 o42Var = p42Var.E;
                o42Var.S.remove(sh4Var);
                o42Var.Y(p42Var.G.getSearchField().getText().toString(), false);
                o42Var.a0(null, null, true);
                return;
            case 23:
            default:
                return;
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                vg1 vg1Var = (vg1) obj;
                vg1Var.V = true;
                vg1Var.w0 = editTextBoldCursor.getText().toString();
                vg1Var.X0(true);
                return;
            case 18:
                d88 d88Var = (d88) obj;
                d88Var.a.getActionBar().C();
                d88Var.b.getActionBar().C();
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        r59 r59Var;
        int b;
        fv fvVar;
        sj3 sj3Var;
        ov9 ov9Var;
        y59 y59Var;
        byte b2 = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b2) {
            case 0:
                int length = editTextBoldCursor.length();
                i30 i30Var = (i30) obj;
                h30 h30Var = i30Var.t1;
                if (length > 0) {
                    h30Var.E(editTextBoldCursor.getText().toString());
                    return;
                }
                i30Var.p1 = false;
                h30Var.E(null);
                return;
            case 1:
            default:
                return;
            case 2:
                ((p42) obj).E.Y(editTextBoldCursor.getText().toString(), false);
                return;
            case 3:
                n52 n52Var = (n52) obj;
                yd ydVar = n52Var.K;
                fv fvVar2 = n52Var.M;
                r59 r59Var2 = n52Var.N;
                l52 l52Var = n52Var.O;
                if (l52Var != null) {
                    String obj2 = editTextBoldCursor.getText().toString();
                    if (obj2.length() != 0) {
                        n52Var.e0 = true;
                        n52Var.x.setShowSearchProgress(true);
                        fvVar2.setVisibility(8);
                        ydVar.setVisibility(8);
                        if (r59Var2.getAdapter() != l52Var) {
                            r59Var2.setAdapter(l52Var);
                        }
                        r59Var2.setVisibility(0);
                        n52Var.f0 = l52Var.f.isEmpty();
                        n52Var.i0();
                    } else {
                        fvVar2.setVisibility(0);
                        ydVar.setVisibility(0);
                        r59Var2.setAdapter(null);
                        r59Var2.setVisibility(8);
                        n52Var.s.setVisibility(8);
                    }
                    l52Var.G(obj2);
                    return;
                }
                return;
            case 4:
                ib2 ib2Var = (ib2) obj;
                if (ib2Var.e != null) {
                    String obj3 = editTextBoldCursor.getText().toString();
                    if (obj3.length() != 0 && (r59Var = ib2Var.b) != null) {
                        y59 adapter = r59Var.getAdapter();
                        hb2 hb2Var = ib2Var.e;
                        if (adapter != hb2Var) {
                            ib2Var.b.setAdapter(hb2Var);
                            ib2Var.e.f();
                            ib2Var.b.setFastScrollVisible(false);
                            ib2Var.b.setVerticalScrollBarEnabled(true);
                            ib2Var.d.b();
                        }
                    }
                    ib2Var.e.F(obj3);
                    return;
                }
                return;
            case 5:
                wg2 wg2Var = (wg2) obj;
                if (wg2Var.e != null) {
                    String obj4 = editTextBoldCursor.getText().toString();
                    if (wg2Var.c.getAdapter() == null) {
                        b = 0;
                    } else {
                        b = wg2Var.c.getAdapter().b();
                    }
                    wg2Var.e.F(obj4);
                    if (TextUtils.isEmpty(obj4) && (fvVar = wg2Var.c) != null) {
                        y59 adapter2 = fvVar.getAdapter();
                        sg2 sg2Var = wg2Var.a;
                        if (adapter2 != sg2Var) {
                            fv fvVar3 = wg2Var.c;
                            fvVar3.X1 = false;
                            fvVar3.Y1 = false;
                            fvVar3.setAdapter(sg2Var);
                            if (b == 0) {
                                wg2Var.C0(0);
                            }
                        }
                    }
                    wg2Var.D1.setVisibility(8);
                    wg2Var.C1.setVisibility(0);
                    return;
                }
                return;
            case 6:
                yh2 yh2Var = (yh2) obj;
                yh2Var.n = editTextBoldCursor.getText().toString();
                va vaVar = yh2Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editTextBoldCursor.getText().toString();
                    contactsActivity.c0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.y = true;
                        r59 r59Var3 = contactsActivity.d;
                        if (r59Var3 != null) {
                            r59Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.y = false;
                    contactsActivity.h.G(null);
                    r59 r59Var4 = contactsActivity.d;
                    if (r59Var4 != null) {
                        r59Var4.setAdapter(contactsActivity.b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                String obj6 = editTextBoldCursor.getText().toString();
                boolean isEmpty = TextUtils.isEmpty(obj6);
                az2 az2Var = (az2) obj;
                h42 h42Var = az2Var.d;
                if (isEmpty) {
                    h42Var.getClass();
                    h42Var.e = null;
                    az2Var.e = false;
                    az2Var.a.setAdapter(az2Var.c);
                    az2Var.a.setFastScrollVisible(true);
                    return;
                }
                h42Var.getClass();
                if (obj6 == null) {
                    h42Var.e = null;
                } else {
                    try {
                        Timer timer = (Timer) h42Var.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    Timer timer2 = new Timer();
                    h42Var.h = timer2;
                    timer2.schedule(new yy2(h42Var, obj6, (byte) 0), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    az2Var.e = true;
                    return;
                }
                return;
            case 9:
                ug3 ug3Var = (ug3) obj;
                ug3Var.a.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                ug3Var.b.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                return;
            case 10:
                nk3 nk3Var = (nk3) obj;
                String obj7 = editTextBoldCursor.getText().toString();
                if (!obj7.isEmpty() || (((sj3Var = nk3Var.D0) != null && (ov9Var = sj3Var.e0) != null && ov9Var.M()) || nk3Var.v3 || nk3Var.L)) {
                    nk3Var.m2 = true;
                    if (!nk3Var.s3) {
                        nk3Var.k5(true, false, true, false);
                    }
                }
                sj3 sj3Var2 = nk3Var.D0;
                if (sj3Var2 != null) {
                    View currentView = sj3Var2.getCurrentView();
                    boolean z2 = !sj3Var2.h0;
                    if (!TextUtils.isEmpty(sj3Var2.N0)) {
                        z = z2;
                    }
                    sj3Var2.N0 = obj7;
                    sj3Var2.P(currentView, sj3Var2.getCurrentPosition(), obj7, z);
                    return;
                }
                return;
            case 11:
                ((yw4) obj).d1(editTextBoldCursor.getText().toString());
                return;
            case 12:
                String obj8 = editTextBoldCursor.getText().toString();
                kd5 kd5Var = (kd5) obj;
                kd5Var.f.E(obj8);
                boolean isEmpty2 = TextUtils.isEmpty(obj8);
                boolean z3 = !isEmpty2;
                if (z3 != kd5Var.N) {
                    kd5Var.N = z3;
                    r59 r59Var5 = kd5Var.d;
                    if (r59Var5 != null) {
                        if (!isEmpty2) {
                            y59Var = kd5Var.f;
                        } else {
                            y59Var = kd5Var.e;
                        }
                        r59Var5.setAdapter(y59Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                es5 es5Var = (es5) obj;
                if (editTextBoldCursor.length() != 0) {
                    es5Var.y = true;
                    bs5 bs5Var = es5Var.s;
                    if (!bs5Var.h) {
                        bs5Var.h = true;
                        bs5Var.f();
                    }
                    es5Var.s.E(editTextBoldCursor.getText().toString());
                    es5Var.h.setFastScrollVisible(false);
                    es5Var.h.setVerticalScrollBarEnabled(true);
                    es5Var.r.e(true, true);
                    es5Var.r.setStickerType(1);
                    es5Var.r.d.setText(jb6.M0(2131747901, null));
                    es5Var.r.e.setText(jb6.M0(2131745541, null));
                    return;
                }
                es5Var.c0();
                return;
            case 14:
                String obj9 = editTextBoldCursor.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                int length2 = obj9.length();
                r59 r59Var6 = languageSelectActivity.b;
                if (length2 != 0) {
                    if (r59Var6 != null) {
                        r59Var6.setAdapter(languageSelectActivity.c);
                        return;
                    }
                    return;
                } else if (r59Var6 != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    return;
                } else {
                    return;
                }
            case 15:
                pc6 pc6Var = (pc6) obj;
                if (pc6Var.T != null) {
                    String obj10 = editTextBoldCursor.getText().toString();
                    if (obj10.length() != 0) {
                        pc6Var.v0 = true;
                        pc6Var.r.setShowSearchProgress(true);
                        zja zjaVar = pc6Var.W;
                        if (zjaVar != null) {
                            zjaVar.setVisibility(8);
                        }
                        pc6Var.R.setVisibility(8);
                        pc6Var.P.setVisibility(8);
                        y59 adapter3 = pc6Var.S.getAdapter();
                        l52 l52Var2 = pc6Var.T;
                        if (adapter3 != l52Var2) {
                            pc6Var.S.setAdapter(l52Var2);
                        }
                        pc6Var.S.setVisibility(0);
                        if (pc6Var.T.b() != 0) {
                            z = false;
                        }
                        pc6Var.w0 = z;
                    } else {
                        zja zjaVar2 = pc6Var.W;
                        if (zjaVar2 != null) {
                            zjaVar2.setVisibility(0);
                        }
                        pc6Var.R.setVisibility(0);
                        pc6Var.P.setVisibility(0);
                        pc6Var.S.setAdapter(null);
                        pc6Var.S.setVisibility(8);
                    }
                    pc6Var.O0();
                    pc6Var.P0();
                    pc6Var.T.G(obj10);
                    return;
                }
                return;
            case 16:
                ((m07) ((qv0) obj).b).j(editTextBoldCursor.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editTextBoldCursor.getText().toString();
                    if (obj11.length() != 0 && notificationsCustomSettingsActivity.a != null) {
                        notificationsCustomSettingsActivity.c.setText(jb6.M0(2131747901, "NoResult"));
                        notificationsCustomSettingsActivity.c.b();
                        notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.d);
                        notificationsCustomSettingsActivity.d.f();
                        notificationsCustomSettingsActivity.a.setFastScrollVisible(false);
                        notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(true);
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                d88 d88Var = (d88) obj;
                d88Var.a.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                d88Var.b.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).e.I(editTextBoldCursor.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editTextBoldCursor.getText().toString();
                qc9 qc9Var = (qc9) obj;
                if (obj12 == null) {
                    qc9Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = qc9Var.f;
                    if (arrayList == null) {
                        qc9Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i = 0; i < qc9Var.h.size(); i++) {
                        u2c u2cVar = (u2c) qc9Var.h.get(i);
                        if (u2cVar.d.startsWith(lowerCase)) {
                            qc9Var.f.add(0, u2cVar);
                        } else if (u2cVar.d.contains(lowerCase)) {
                            qc9Var.f.add(u2cVar);
                        }
                    }
                    qc9Var.c.f();
                }
                int length3 = obj12.length();
                r59 r59Var7 = qc9Var.b;
                if (length3 != 0) {
                    if (r59Var7 != null) {
                        r59Var7.setAdapter(qc9Var.c);
                        return;
                    }
                    return;
                } else if (r59Var7 != null) {
                    qc9Var.d.setVisibility(8);
                    qc9Var.b.setAdapter(qc9Var.a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((daa) obj).f.I(editTextBoldCursor.getText().toString());
                return;
            case 22:
                wqb wqbVar = (wqb) obj;
                wqbVar.e = editTextBoldCursor.getText().toString();
                wqbVar.a.g3.O(true);
                wqbVar.a.w0(0);
                return;
            case 23:
                String obj13 = editTextBoldCursor.getText().toString();
                nxb nxbVar = ((sxb) obj).s0;
                if (!nxbVar.e0.equals(obj13)) {
                    nxbVar.M(nxbVar.e[0], nxbVar.getCurrentPosition(), obj13, false);
                    return;
                }
                return;
            case 24:
                ((WallpapersListActivity) obj).I.E(editTextBoldCursor.getText().toString(), false);
                return;
        }
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    private final void r(sh4 sh4Var) {
    }
}
