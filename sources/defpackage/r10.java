package defpackage;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
public final class r10 extends o7 {
    public final byte a;
    public final Object b;

    public r10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                uj3 uj3Var = (uj3) obj;
                s7 s7Var = uj3Var.F1;
                if (s7Var != null) {
                    s7Var.setVisibility(0);
                }
                if (uj3Var.p2 != null) {
                    uj3Var.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((s98) obj).finishFragment();
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
                uj3 uj3Var = (uj3) this.b;
                aVar = ((e) uj3Var).actionBar;
                if (!aVar.z() && uj3Var.X3 == null) {
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
                    sla slaVar = profileActivity.U0;
                    slaVar.e.clearFocus();
                    hl.t1(slaVar.e);
                }
                if (profileActivity.X1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return profileActivity.l3(profileActivity.X1);
            default:
                return super.e();
        }
    }

    @Override
    public final void f() {
        switch (this.a) {
            case 25:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                cwc cwcVar = wallpapersListActivity.I;
                cwcVar.n = null;
                cwcVar.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(ob6.M0(2131745544, null));
                return;
            default:
                return;
        }
    }

    @Override
    public final void h() {
        vy4 vy4Var;
        byte b = this.a;
        tk4 tk4Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                j20 j20Var = (j20) obj;
                if (j20Var.q1) {
                    j20Var.p1 = false;
                    j20Var.q1 = false;
                    j20Var.r0 = true;
                    j20Var.t1.E(null);
                    s7 s7Var = j20Var.d2;
                    if (s7Var != null) {
                        s7Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wf1 wf1Var = (wf1) obj;
                wf1Var.w0 = "";
                wf1Var.J.setVisibility(0);
                if (wf1Var.V) {
                    wf1Var.V = false;
                    wf1Var.X0(true);
                    return;
                }
                return;
            case 2:
                u32 u32Var = (u32) obj;
                u32Var.c0 = false;
                u32Var.H.setVisibility(0);
                i32 i32Var = u32Var.r;
                j79 adapter = i32Var.getAdapter();
                m32 m32Var = u32Var.w;
                if (adapter != m32Var) {
                    i32Var.setAdapter(m32Var);
                }
                m32Var.f();
                u32Var.E.Y(null, true);
                return;
            case 3:
                s42 s42Var = (s42) obj;
                s42Var.d0 = false;
                s42Var.e0 = false;
                s42Var.O.G(null);
                s42Var.h0();
                s42Var.M.setVisibility(0);
                s42Var.K.setVisibility(0);
                s42Var.N.setVisibility(8);
                s42Var.s.setVisibility(8);
                return;
            case 4:
                na2 na2Var = (na2) obj;
                na2Var.e.F(null);
                na2Var.O = false;
                na2Var.b.setAdapter(na2Var.a);
                na2Var.a.f();
                na2Var.b.setFastScrollVisible(true);
                na2Var.b.setVerticalScrollBarEnabled(false);
                na2Var.d.setShowAtCenter(false);
                na2Var.d.b();
                return;
            case 5:
                bg2 bg2Var = (bg2) obj;
                bg2Var.e.F(null);
                bg2Var.o1 = false;
                gu guVar = bg2Var.c;
                guVar.X1 = false;
                guVar.Y1 = false;
                guVar.setAdapter(bg2Var.a);
                bg2Var.a.f();
                bg2Var.c.setFastScrollVisible(true);
                bg2Var.c.setVerticalScrollBarEnabled(false);
                return;
            case 6:
                ch2 ch2Var = (ch2) obj;
                ch2Var.n = null;
                wa waVar = ch2Var.a;
                if (waVar != null) {
                    waVar.g3.O(true);
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
                contactsActivity.e0();
                return;
            case 8:
                ky2 ky2Var = (ky2) obj;
                m32 m32Var2 = ky2Var.d;
                m32Var2.getClass();
                m32Var2.e = null;
                ky2Var.f = false;
                ky2Var.e = false;
                ky2Var.a.setAdapter(ky2Var.c);
                ky2Var.a.setFastScrollVisible(true);
                return;
            case 9:
                bg3 bg3Var = (bg3) obj;
                bg3Var.a.getActionBar().o(false);
                bg3Var.b.getActionBar().o(false);
                return;
            case 10:
                uj3 uj3Var = (uj3) obj;
                hj3 hj3Var = uj3Var.Y;
                if (hj3Var != null) {
                    ArrayList arrayList = hj3Var.H;
                    if (!arrayList.isEmpty() && hj3Var.J != null) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (((ph4) arrayList.get(i)).h) {
                                ((xi3) hj3Var.J).a((ph4) arrayList.get(i));
                            }
                        }
                    }
                }
                uj3Var.l2 = false;
                uj3Var.m2 = false;
                tj3 tj3Var = uj3Var.f0[0];
                if (tj3Var != null) {
                    qj3 qj3Var = tj3Var.a;
                    if (uj3Var.Y2 == 0) {
                        tk4Var = tj3Var.x;
                    }
                    qj3Var.setEmptyView(tk4Var);
                    uj3Var.k5(false, false, true, false);
                }
                uj3Var.w5(false, false);
                jn7.e().k(272, Boolean.TRUE);
                uj3Var.Y.setCloseButtonVisible(false);
                uj3Var.v5(true);
                uj3Var.X2();
                vy4Var = ((e) uj3Var).glassEngine;
                vy4Var.g();
                return;
            case 11:
                ((bx4) obj).e1(null);
                return;
            case 12:
                nd5 nd5Var = (nd5) obj;
                if (nd5Var.N) {
                    nd5Var.f.E(null);
                    nd5Var.N = false;
                    nd5Var.d.setAdapter(nd5Var.e);
                    return;
                }
                return;
            case 13:
                ((hs5) obj).b0();
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.l0(null);
                if (languageSelectActivity.b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    return;
                }
                return;
            case 15:
                uc6 uc6Var = (uc6) obj;
                uc6Var.u0 = false;
                uc6Var.v0 = false;
                uc6Var.T.G(null);
                uc6Var.O0();
                sla slaVar = uc6Var.W;
                if (slaVar != null) {
                    slaVar.setVisibility(0);
                }
                uc6Var.R.setVisibility(0);
                uc6Var.P.setVisibility(0);
                uc6Var.S.setAdapter(null);
                uc6Var.S.setVisibility(8);
                uc6Var.N0(false);
                return;
            case 16:
                t07 t07Var = (t07) ((qu0) obj).b;
                t07Var.y = false;
                t07Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.c.setText(ob6.M0(2131747942, "NoExceptions"));
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
                nd9 nd9Var = (nd9) obj;
                nd9Var.o0(true);
                hl.r(nd9Var.L);
                nd9Var.K = null;
                nd9Var.e.s(null);
                return;
            case 21:
                ee9 ee9Var = (ee9) obj;
                ee9Var.f = null;
                if (ee9Var.b != null) {
                    ee9Var.d.setVisibility(8);
                    ee9Var.b.setAdapter(ee9Var.a);
                    return;
                }
                return;
            case 22:
                tba tbaVar = (tba) obj;
                tbaVar.a.a(false, true);
                tbaVar.n0(false, true);
                tbaVar.c.g3.O(false);
                return;
            case 23:
                vsb vsbVar = (vsb) obj;
                vsbVar.d = false;
                vsbVar.e = null;
                vsbVar.a.g3.O(true);
                vsbVar.a.x0(0);
                return;
            case 24:
                ((tzb) obj).x0(false);
                return;
            case 25:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r10.i():void");
    }

    @Override
    public final void j(ph4 ph4Var) {
        switch (this.a) {
            case 2:
                u32 u32Var = (u32) this.b;
                t32 t32Var = u32Var.E;
                t32Var.S.remove(ph4Var);
                t32Var.Y(u32Var.G.getSearchField().getText().toString(), false);
                t32Var.a0(null, null, true);
                return;
            case 24:
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
                wf1 wf1Var = (wf1) obj;
                wf1Var.V = true;
                wf1Var.w0 = editTextBoldCursor.getText().toString();
                wf1Var.X0(true);
                return;
            case 18:
                s98 s98Var = (s98) obj;
                s98Var.a.getActionBar().D();
                s98Var.b.getActionBar().D();
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        d79 d79Var;
        int b;
        gu guVar;
        bj3 bj3Var;
        gx9 gx9Var;
        j79 j79Var;
        byte b2 = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b2) {
            case 0:
                int length = editTextBoldCursor.length();
                j20 j20Var = (j20) obj;
                i20 i20Var = j20Var.t1;
                if (length > 0) {
                    i20Var.E(editTextBoldCursor.getText().toString());
                    return;
                }
                j20Var.p1 = false;
                i20Var.E(null);
                return;
            case 1:
            default:
                return;
            case 2:
                ((u32) obj).E.Y(editTextBoldCursor.getText().toString(), false);
                return;
            case 3:
                s42 s42Var = (s42) obj;
                zc zcVar = s42Var.K;
                gu guVar2 = s42Var.M;
                d79 d79Var2 = s42Var.N;
                q42 q42Var = s42Var.O;
                if (q42Var != null) {
                    String obj2 = editTextBoldCursor.getText().toString();
                    if (obj2.length() != 0) {
                        s42Var.e0 = true;
                        s42Var.x.setShowSearchProgress(true);
                        guVar2.setVisibility(8);
                        zcVar.setVisibility(8);
                        if (d79Var2.getAdapter() != q42Var) {
                            d79Var2.setAdapter(q42Var);
                        }
                        d79Var2.setVisibility(0);
                        s42Var.f0 = q42Var.f.isEmpty();
                        s42Var.h0();
                    } else {
                        guVar2.setVisibility(0);
                        zcVar.setVisibility(0);
                        d79Var2.setAdapter(null);
                        d79Var2.setVisibility(8);
                        s42Var.s.setVisibility(8);
                    }
                    q42Var.G(obj2);
                    return;
                }
                return;
            case 4:
                na2 na2Var = (na2) obj;
                if (na2Var.e != null) {
                    String obj3 = editTextBoldCursor.getText().toString();
                    if (obj3.length() != 0 && (d79Var = na2Var.b) != null) {
                        j79 adapter = d79Var.getAdapter();
                        ma2 ma2Var = na2Var.e;
                        if (adapter != ma2Var) {
                            na2Var.b.setAdapter(ma2Var);
                            na2Var.e.f();
                            na2Var.b.setFastScrollVisible(false);
                            na2Var.b.setVerticalScrollBarEnabled(true);
                            na2Var.d.b();
                        }
                    }
                    na2Var.e.F(obj3);
                    return;
                }
                return;
            case 5:
                bg2 bg2Var = (bg2) obj;
                if (bg2Var.e != null) {
                    String obj4 = editTextBoldCursor.getText().toString();
                    if (bg2Var.c.getAdapter() == null) {
                        b = 0;
                    } else {
                        b = bg2Var.c.getAdapter().b();
                    }
                    bg2Var.e.F(obj4);
                    if (TextUtils.isEmpty(obj4) && (guVar = bg2Var.c) != null) {
                        j79 adapter2 = guVar.getAdapter();
                        xf2 xf2Var = bg2Var.a;
                        if (adapter2 != xf2Var) {
                            gu guVar3 = bg2Var.c;
                            guVar3.X1 = false;
                            guVar3.Y1 = false;
                            guVar3.setAdapter(xf2Var);
                            if (b == 0) {
                                bg2Var.C0(0);
                            }
                        }
                    }
                    bg2Var.D1.setVisibility(8);
                    bg2Var.C1.setVisibility(0);
                    return;
                }
                return;
            case 6:
                ch2 ch2Var = (ch2) obj;
                ch2Var.n = editTextBoldCursor.getText().toString();
                wa waVar = ch2Var.a;
                if (waVar != null) {
                    waVar.g3.O(true);
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
                        d79 d79Var3 = contactsActivity.d;
                        if (d79Var3 != null) {
                            d79Var3.setAdapter(contactsActivity.h);
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
                    d79 d79Var4 = contactsActivity.d;
                    if (d79Var4 != null) {
                        d79Var4.setAdapter(contactsActivity.b);
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
                ky2 ky2Var = (ky2) obj;
                m32 m32Var = ky2Var.d;
                if (isEmpty) {
                    m32Var.getClass();
                    m32Var.e = null;
                    ky2Var.e = false;
                    ky2Var.a.setAdapter(ky2Var.c);
                    ky2Var.a.setFastScrollVisible(true);
                    return;
                }
                m32Var.getClass();
                if (obj6 == null) {
                    m32Var.e = null;
                } else {
                    try {
                        Timer timer = (Timer) m32Var.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    Timer timer2 = new Timer();
                    m32Var.h = timer2;
                    timer2.schedule(new iy2(m32Var, obj6, (byte) 0), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    ky2Var.e = true;
                    return;
                }
                return;
            case 9:
                bg3 bg3Var = (bg3) obj;
                bg3Var.a.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                bg3Var.b.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                return;
            case 10:
                uj3 uj3Var = (uj3) obj;
                String obj7 = editTextBoldCursor.getText().toString();
                if (!obj7.isEmpty() || (((bj3Var = uj3Var.D0) != null && (gx9Var = bj3Var.e0) != null && gx9Var.M()) || uj3Var.v3 || uj3Var.L)) {
                    uj3Var.m2 = true;
                    if (!uj3Var.s3) {
                        uj3Var.k5(true, false, true, false);
                    }
                }
                bj3 bj3Var2 = uj3Var.D0;
                if (bj3Var2 != null) {
                    View currentView = bj3Var2.getCurrentView();
                    boolean z2 = !bj3Var2.h0;
                    if (!TextUtils.isEmpty(bj3Var2.N0)) {
                        z = z2;
                    }
                    bj3Var2.N0 = obj7;
                    bj3Var2.Q(currentView, bj3Var2.getCurrentPosition(), obj7, z);
                    return;
                }
                return;
            case 11:
                ((bx4) obj).e1(editTextBoldCursor.getText().toString());
                return;
            case 12:
                String obj8 = editTextBoldCursor.getText().toString();
                nd5 nd5Var = (nd5) obj;
                nd5Var.f.E(obj8);
                boolean isEmpty2 = TextUtils.isEmpty(obj8);
                boolean z3 = !isEmpty2;
                if (z3 != nd5Var.N) {
                    nd5Var.N = z3;
                    d79 d79Var5 = nd5Var.d;
                    if (d79Var5 != null) {
                        if (!isEmpty2) {
                            j79Var = nd5Var.f;
                        } else {
                            j79Var = nd5Var.e;
                        }
                        d79Var5.setAdapter(j79Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                hs5 hs5Var = (hs5) obj;
                if (editTextBoldCursor.length() != 0) {
                    hs5Var.y = true;
                    es5 es5Var = hs5Var.s;
                    if (!es5Var.h) {
                        es5Var.h = true;
                        es5Var.f();
                    }
                    hs5Var.s.E(editTextBoldCursor.getText().toString());
                    hs5Var.h.setFastScrollVisible(false);
                    hs5Var.h.setVerticalScrollBarEnabled(true);
                    hs5Var.r.e(true, true);
                    hs5Var.r.setStickerType(1);
                    hs5Var.r.d.setText(ob6.M0(2131747898, null));
                    hs5Var.r.e.setText(ob6.M0(2131745535, null));
                    return;
                }
                hs5Var.b0();
                return;
            case 14:
                String obj9 = editTextBoldCursor.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.l0(obj9);
                int length2 = obj9.length();
                d79 d79Var6 = languageSelectActivity.b;
                if (length2 != 0) {
                    if (d79Var6 != null) {
                        d79Var6.setAdapter(languageSelectActivity.c);
                        return;
                    }
                    return;
                } else if (d79Var6 != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    return;
                } else {
                    return;
                }
            case 15:
                uc6 uc6Var = (uc6) obj;
                if (uc6Var.T != null) {
                    String obj10 = editTextBoldCursor.getText().toString();
                    if (obj10.length() != 0) {
                        uc6Var.v0 = true;
                        uc6Var.r.setShowSearchProgress(true);
                        sla slaVar = uc6Var.W;
                        if (slaVar != null) {
                            slaVar.setVisibility(8);
                        }
                        uc6Var.R.setVisibility(8);
                        uc6Var.P.setVisibility(8);
                        j79 adapter3 = uc6Var.S.getAdapter();
                        q42 q42Var2 = uc6Var.T;
                        if (adapter3 != q42Var2) {
                            uc6Var.S.setAdapter(q42Var2);
                        }
                        uc6Var.S.setVisibility(0);
                        if (uc6Var.T.b() != 0) {
                            z = false;
                        }
                        uc6Var.w0 = z;
                    } else {
                        sla slaVar2 = uc6Var.W;
                        if (slaVar2 != null) {
                            slaVar2.setVisibility(0);
                        }
                        uc6Var.R.setVisibility(0);
                        uc6Var.P.setVisibility(0);
                        uc6Var.S.setAdapter(null);
                        uc6Var.S.setVisibility(8);
                    }
                    uc6Var.O0();
                    uc6Var.P0();
                    uc6Var.T.G(obj10);
                    return;
                }
                return;
            case 16:
                ((t07) ((qu0) obj).b).j(editTextBoldCursor.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editTextBoldCursor.getText().toString();
                    if (obj11.length() != 0 && notificationsCustomSettingsActivity.a != null) {
                        notificationsCustomSettingsActivity.c.setText(ob6.M0(2131747898, "NoResult"));
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
                s98 s98Var = (s98) obj;
                s98Var.a.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                s98Var.b.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).e.I(editTextBoldCursor.getText().toString().toLowerCase());
                return;
            case 20:
                nd9 nd9Var = (nd9) obj;
                nd9Var.K = editTextBoldCursor.getText().toString();
                bc9 bc9Var = nd9Var.L;
                hl.r(bc9Var);
                hl.d3(bc9Var, 350L);
                return;
            case 21:
                String obj12 = editTextBoldCursor.getText().toString();
                ee9 ee9Var = (ee9) obj;
                if (obj12 == null) {
                    ee9Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = ee9Var.f;
                    if (arrayList == null) {
                        ee9Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i = 0; i < ee9Var.h.size(); i++) {
                        t4c t4cVar = (t4c) ee9Var.h.get(i);
                        if (t4cVar.d.startsWith(lowerCase)) {
                            ee9Var.f.add(0, t4cVar);
                        } else if (t4cVar.d.contains(lowerCase)) {
                            ee9Var.f.add(t4cVar);
                        }
                    }
                    ee9Var.c.f();
                }
                int length3 = obj12.length();
                d79 d79Var7 = ee9Var.b;
                if (length3 != 0) {
                    if (d79Var7 != null) {
                        d79Var7.setAdapter(ee9Var.c);
                        return;
                    }
                    return;
                } else if (d79Var7 != null) {
                    ee9Var.d.setVisibility(8);
                    ee9Var.b.setAdapter(ee9Var.a);
                    return;
                } else {
                    return;
                }
            case 22:
                ((tba) obj).f.I(editTextBoldCursor.getText().toString());
                return;
            case 23:
                vsb vsbVar = (vsb) obj;
                vsbVar.e = editTextBoldCursor.getText().toString();
                vsbVar.a.g3.O(true);
                vsbVar.a.x0(0);
                return;
            case 24:
                String obj13 = editTextBoldCursor.getText().toString();
                ozb ozbVar = ((tzb) obj).s0;
                if (!ozbVar.e0.equals(obj13)) {
                    ozbVar.N(ozbVar.e[0], ozbVar.getCurrentPosition(), obj13, false);
                    return;
                }
                return;
            case 25:
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

    private final void r(ph4 ph4Var) {
    }
}
