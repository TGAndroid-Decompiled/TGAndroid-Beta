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
public final class q10 extends n7 {
    public final byte a;
    public final Object b;

    public q10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 10:
                cj3 cj3Var = (cj3) obj;
                r7 r7Var = cj3Var.F1;
                if (r7Var != null) {
                    r7Var.setVisibility(0);
                }
                if (cj3Var.p2 != null) {
                    cj3Var.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((b68) obj).finishFragment();
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
                cj3 cj3Var = (cj3) this.b;
                aVar = ((d) cj3Var).actionBar;
                if (!aVar.y() && cj3Var.V3 == null) {
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
                    xha xhaVar = profileActivity.U0;
                    xhaVar.e.clearFocus();
                    gl.t1(xhaVar.e);
                }
                if (profileActivity.X1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return profileActivity.k3(profileActivity.X1);
            default:
                return super.e();
        }
    }

    @Override
    public final void f() {
        switch (this.a) {
            case 24:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                orc orcVar = wallpapersListActivity.I;
                orcVar.n = null;
                orcVar.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(k96.M0(2131745624, null));
                return;
            default:
                return;
        }
    }

    @Override
    public final void h() {
        qw4 qw4Var;
        byte b = this.a;
        pi4 pi4Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                i20 i20Var = (i20) obj;
                if (i20Var.q1) {
                    i20Var.p1 = false;
                    i20Var.q1 = false;
                    i20Var.r0 = true;
                    i20Var.t1.E(null);
                    r7 r7Var = i20Var.d2;
                    if (r7Var != null) {
                        r7Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                nf1 nf1Var = (nf1) obj;
                nf1Var.w0 = "";
                nf1Var.J.setVisibility(0);
                if (nf1Var.V) {
                    nf1Var.V = false;
                    nf1Var.W0(true);
                    return;
                }
                return;
            case 2:
                d32 d32Var = (d32) obj;
                d32Var.c0 = false;
                d32Var.H.setVisibility(0);
                r22 r22Var = d32Var.r;
                w39 adapter = r22Var.getAdapter();
                v22 v22Var = d32Var.w;
                if (adapter != v22Var) {
                    r22Var.setAdapter(v22Var);
                }
                v22Var.f();
                d32Var.E.Y(null, true);
                return;
            case 3:
                c42 c42Var = (c42) obj;
                c42Var.d0 = false;
                c42Var.e0 = false;
                c42Var.O.G(null);
                c42Var.i0();
                c42Var.M.setVisibility(0);
                c42Var.K.setVisibility(0);
                c42Var.N.setVisibility(8);
                c42Var.s.setVisibility(8);
                return;
            case 4:
                x92 x92Var = (x92) obj;
                x92Var.e.F(null);
                x92Var.O = false;
                x92Var.b.setAdapter(x92Var.a);
                x92Var.a.f();
                x92Var.b.setFastScrollVisible(true);
                x92Var.b.setVerticalScrollBarEnabled(false);
                x92Var.d.setShowAtCenter(false);
                x92Var.d.b();
                return;
            case 5:
                kf2 kf2Var = (kf2) obj;
                kf2Var.e.F(null);
                kf2Var.o1 = false;
                fu fuVar = kf2Var.c;
                fuVar.X1 = false;
                fuVar.Y1 = false;
                fuVar.setAdapter(kf2Var.a);
                kf2Var.a.f();
                kf2Var.c.setFastScrollVisible(true);
                kf2Var.c.setVerticalScrollBarEnabled(false);
                return;
            case 6:
                kg2 kg2Var = (kg2) obj;
                kg2Var.n = null;
                va vaVar = kg2Var.a;
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
                contactsActivity.e0();
                return;
            case 8:
                qx2 qx2Var = (qx2) obj;
                v22 v22Var2 = qx2Var.d;
                v22Var2.getClass();
                v22Var2.e = null;
                qx2Var.f = false;
                qx2Var.e = false;
                qx2Var.a.setAdapter(qx2Var.c);
                qx2Var.a.setFastScrollVisible(true);
                return;
            case 9:
                hf3 hf3Var = (hf3) obj;
                hf3Var.a.getActionBar().n(false);
                hf3Var.b.getActionBar().n(false);
                return;
            case 10:
                cj3 cj3Var = (cj3) obj;
                pi3 pi3Var = cj3Var.Y;
                if (pi3Var != null) {
                    ArrayList arrayList = pi3Var.G;
                    if (!arrayList.isEmpty() && pi3Var.I != null) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (((rf4) arrayList.get(i)).h) {
                                ((di3) pi3Var.I).a((rf4) arrayList.get(i));
                            }
                        }
                    }
                }
                cj3Var.l2 = false;
                cj3Var.m2 = false;
                bj3 bj3Var = cj3Var.f0[0];
                if (bj3Var != null) {
                    yi3 yi3Var = bj3Var.a;
                    if (cj3Var.Y2 == 0) {
                        pi4Var = bj3Var.x;
                    }
                    yi3Var.setEmptyView(pi4Var);
                    cj3Var.g5(false, false, true, false);
                }
                cj3Var.s5(false, false);
                kk7.e().k(271, Boolean.TRUE);
                cj3Var.Y.setCloseButtonVisible(false);
                cj3Var.r5(true);
                cj3Var.V2();
                qw4Var = ((d) cj3Var).glassEngine;
                qw4Var.g();
                return;
            case 11:
                ((xu4) obj).d1(null);
                return;
            case 12:
                mb5 mb5Var = (mb5) obj;
                if (mb5Var.N) {
                    mb5Var.f.E(null);
                    mb5Var.N = false;
                    mb5Var.d.setAdapter(mb5Var.e);
                    return;
                }
                return;
            case 13:
                ((gq5) obj).b0();
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
                qa6 qa6Var = (qa6) obj;
                qa6Var.u0 = false;
                qa6Var.v0 = false;
                qa6Var.T.G(null);
                qa6Var.N0();
                xha xhaVar = qa6Var.W;
                if (xhaVar != null) {
                    xhaVar.setVisibility(0);
                }
                qa6Var.R.setVisibility(0);
                qa6Var.P.setVisibility(0);
                qa6Var.S.setAdapter(null);
                qa6Var.S.setVisibility(8);
                qa6Var.M0(false);
                return;
            case 16:
                my6 my6Var = (my6) ((hu0) obj).b;
                my6Var.y = false;
                my6Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f = false;
                notificationsCustomSettingsActivity.c.setText(k96.M0(2131748019, "NoExceptions"));
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
                qa9 qa9Var = (qa9) obj;
                qa9Var.f = null;
                if (qa9Var.b != null) {
                    qa9Var.d.setVisibility(8);
                    qa9Var.b.setAdapter(qa9Var.a);
                    return;
                }
                return;
            case 21:
                d8a d8aVar = (d8a) obj;
                d8aVar.a.a(false, true);
                d8aVar.n0(false, true);
                d8aVar.c.g3.O(false);
                return;
            case 22:
                vob vobVar = (vob) obj;
                vobVar.d = false;
                vobVar.e = null;
                vobVar.a.g3.O(true);
                vobVar.a.w0(0);
                return;
            case 23:
                ((qvb) obj).w0(false);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q10.i():void");
    }

    @Override
    public final void j(rf4 rf4Var) {
        switch (this.a) {
            case 2:
                d32 d32Var = (d32) this.b;
                c32 c32Var = d32Var.E;
                c32Var.S.remove(rf4Var);
                c32Var.Y(d32Var.G.getSearchField().getText().toString(), false);
                c32Var.a0(null, null, true);
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
                nf1 nf1Var = (nf1) obj;
                nf1Var.V = true;
                nf1Var.w0 = editTextBoldCursor.getText().toString();
                nf1Var.W0(true);
                return;
            case 18:
                b68 b68Var = (b68) obj;
                b68Var.a.getActionBar().C();
                b68Var.b.getActionBar().C();
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        o39 o39Var;
        int b;
        fu fuVar;
        hi3 hi3Var;
        mt9 mt9Var;
        w39 w39Var;
        byte b2 = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b2) {
            case 0:
                int length = editTextBoldCursor.length();
                i20 i20Var = (i20) obj;
                h20 h20Var = i20Var.t1;
                if (length > 0) {
                    h20Var.E(editTextBoldCursor.getText().toString());
                    return;
                }
                i20Var.p1 = false;
                h20Var.E(null);
                return;
            case 1:
            default:
                return;
            case 2:
                ((d32) obj).E.Y(editTextBoldCursor.getText().toString(), false);
                return;
            case 3:
                c42 c42Var = (c42) obj;
                yc ycVar = c42Var.K;
                fu fuVar2 = c42Var.M;
                o39 o39Var2 = c42Var.N;
                a42 a42Var = c42Var.O;
                if (a42Var != null) {
                    String obj2 = editTextBoldCursor.getText().toString();
                    if (obj2.length() != 0) {
                        c42Var.e0 = true;
                        c42Var.x.setShowSearchProgress(true);
                        fuVar2.setVisibility(8);
                        ycVar.setVisibility(8);
                        if (o39Var2.getAdapter() != a42Var) {
                            o39Var2.setAdapter(a42Var);
                        }
                        o39Var2.setVisibility(0);
                        c42Var.f0 = a42Var.f.isEmpty();
                        c42Var.i0();
                    } else {
                        fuVar2.setVisibility(0);
                        ycVar.setVisibility(0);
                        o39Var2.setAdapter(null);
                        o39Var2.setVisibility(8);
                        c42Var.s.setVisibility(8);
                    }
                    a42Var.G(obj2);
                    return;
                }
                return;
            case 4:
                x92 x92Var = (x92) obj;
                if (x92Var.e != null) {
                    String obj3 = editTextBoldCursor.getText().toString();
                    if (obj3.length() != 0 && (o39Var = x92Var.b) != null) {
                        w39 adapter = o39Var.getAdapter();
                        w92 w92Var = x92Var.e;
                        if (adapter != w92Var) {
                            x92Var.b.setAdapter(w92Var);
                            x92Var.e.f();
                            x92Var.b.setFastScrollVisible(false);
                            x92Var.b.setVerticalScrollBarEnabled(true);
                            x92Var.d.b();
                        }
                    }
                    x92Var.e.F(obj3);
                    return;
                }
                return;
            case 5:
                kf2 kf2Var = (kf2) obj;
                if (kf2Var.e != null) {
                    String obj4 = editTextBoldCursor.getText().toString();
                    if (kf2Var.c.getAdapter() == null) {
                        b = 0;
                    } else {
                        b = kf2Var.c.getAdapter().b();
                    }
                    kf2Var.e.F(obj4);
                    if (TextUtils.isEmpty(obj4) && (fuVar = kf2Var.c) != null) {
                        w39 adapter2 = fuVar.getAdapter();
                        gf2 gf2Var = kf2Var.a;
                        if (adapter2 != gf2Var) {
                            fu fuVar3 = kf2Var.c;
                            fuVar3.X1 = false;
                            fuVar3.Y1 = false;
                            fuVar3.setAdapter(gf2Var);
                            if (b == 0) {
                                kf2Var.B0(0);
                            }
                        }
                    }
                    kf2Var.D1.setVisibility(8);
                    kf2Var.C1.setVisibility(0);
                    return;
                }
                return;
            case 6:
                kg2 kg2Var = (kg2) obj;
                kg2Var.n = editTextBoldCursor.getText().toString();
                va vaVar = kg2Var.a;
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
                        o39 o39Var3 = contactsActivity.d;
                        if (o39Var3 != null) {
                            o39Var3.setAdapter(contactsActivity.h);
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
                    o39 o39Var4 = contactsActivity.d;
                    if (o39Var4 != null) {
                        o39Var4.setAdapter(contactsActivity.b);
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
                qx2 qx2Var = (qx2) obj;
                v22 v22Var = qx2Var.d;
                if (isEmpty) {
                    v22Var.getClass();
                    v22Var.e = null;
                    qx2Var.e = false;
                    qx2Var.a.setAdapter(qx2Var.c);
                    qx2Var.a.setFastScrollVisible(true);
                    return;
                }
                v22Var.getClass();
                if (obj6 == null) {
                    v22Var.e = null;
                } else {
                    try {
                        Timer timer = (Timer) v22Var.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    Timer timer2 = new Timer();
                    v22Var.h = timer2;
                    timer2.schedule(new ox2(v22Var, obj6, (byte) 0), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    qx2Var.e = true;
                    return;
                }
                return;
            case 9:
                hf3 hf3Var = (hf3) obj;
                hf3Var.a.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                hf3Var.b.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                return;
            case 10:
                cj3 cj3Var = (cj3) obj;
                String obj7 = editTextBoldCursor.getText().toString();
                if (!obj7.isEmpty() || (((hi3Var = cj3Var.D0) != null && (mt9Var = hi3Var.e0) != null && mt9Var.M()) || cj3Var.v3 || cj3Var.L)) {
                    cj3Var.m2 = true;
                    if (!cj3Var.s3) {
                        cj3Var.g5(true, false, true, false);
                    }
                }
                hi3 hi3Var2 = cj3Var.D0;
                if (hi3Var2 != null) {
                    View currentView = hi3Var2.getCurrentView();
                    boolean z2 = !hi3Var2.h0;
                    if (!TextUtils.isEmpty(hi3Var2.N0)) {
                        z = z2;
                    }
                    hi3Var2.N0 = obj7;
                    hi3Var2.P(currentView, hi3Var2.getCurrentPosition(), obj7, z);
                    return;
                }
                return;
            case 11:
                ((xu4) obj).d1(editTextBoldCursor.getText().toString());
                return;
            case 12:
                String obj8 = editTextBoldCursor.getText().toString();
                mb5 mb5Var = (mb5) obj;
                mb5Var.f.E(obj8);
                boolean isEmpty2 = TextUtils.isEmpty(obj8);
                boolean z3 = !isEmpty2;
                if (z3 != mb5Var.N) {
                    mb5Var.N = z3;
                    o39 o39Var5 = mb5Var.d;
                    if (o39Var5 != null) {
                        if (!isEmpty2) {
                            w39Var = mb5Var.f;
                        } else {
                            w39Var = mb5Var.e;
                        }
                        o39Var5.setAdapter(w39Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                gq5 gq5Var = (gq5) obj;
                if (editTextBoldCursor.length() != 0) {
                    gq5Var.y = true;
                    dq5 dq5Var = gq5Var.s;
                    if (!dq5Var.h) {
                        dq5Var.h = true;
                        dq5Var.f();
                    }
                    gq5Var.s.E(editTextBoldCursor.getText().toString());
                    gq5Var.h.setFastScrollVisible(false);
                    gq5Var.h.setVerticalScrollBarEnabled(true);
                    gq5Var.r.e(true, true);
                    gq5Var.r.setStickerType(1);
                    gq5Var.r.d.setText(k96.M0(2131747975, null));
                    gq5Var.r.e.setText(k96.M0(2131745615, null));
                    return;
                }
                gq5Var.b0();
                return;
            case 14:
                String obj9 = editTextBoldCursor.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.l0(obj9);
                int length2 = obj9.length();
                o39 o39Var6 = languageSelectActivity.b;
                if (length2 != 0) {
                    if (o39Var6 != null) {
                        o39Var6.setAdapter(languageSelectActivity.c);
                        return;
                    }
                    return;
                } else if (o39Var6 != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.b.setAdapter(languageSelectActivity.a);
                    return;
                } else {
                    return;
                }
            case 15:
                qa6 qa6Var = (qa6) obj;
                if (qa6Var.T != null) {
                    String obj10 = editTextBoldCursor.getText().toString();
                    if (obj10.length() != 0) {
                        qa6Var.v0 = true;
                        qa6Var.r.setShowSearchProgress(true);
                        xha xhaVar = qa6Var.W;
                        if (xhaVar != null) {
                            xhaVar.setVisibility(8);
                        }
                        qa6Var.R.setVisibility(8);
                        qa6Var.P.setVisibility(8);
                        w39 adapter3 = qa6Var.S.getAdapter();
                        a42 a42Var2 = qa6Var.T;
                        if (adapter3 != a42Var2) {
                            qa6Var.S.setAdapter(a42Var2);
                        }
                        qa6Var.S.setVisibility(0);
                        if (qa6Var.T.b() != 0) {
                            z = false;
                        }
                        qa6Var.w0 = z;
                    } else {
                        xha xhaVar2 = qa6Var.W;
                        if (xhaVar2 != null) {
                            xhaVar2.setVisibility(0);
                        }
                        qa6Var.R.setVisibility(0);
                        qa6Var.P.setVisibility(0);
                        qa6Var.S.setAdapter(null);
                        qa6Var.S.setVisibility(8);
                    }
                    qa6Var.N0();
                    qa6Var.O0();
                    qa6Var.T.G(obj10);
                    return;
                }
                return;
            case 16:
                ((my6) ((hu0) obj).b).j(editTextBoldCursor.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editTextBoldCursor.getText().toString();
                    if (obj11.length() != 0 && notificationsCustomSettingsActivity.a != null) {
                        notificationsCustomSettingsActivity.c.setText(k96.M0(2131747975, "NoResult"));
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
                b68 b68Var = (b68) obj;
                b68Var.a.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                b68Var.b.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).e.I(editTextBoldCursor.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editTextBoldCursor.getText().toString();
                qa9 qa9Var = (qa9) obj;
                if (obj12 == null) {
                    qa9Var.f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = qa9Var.f;
                    if (arrayList == null) {
                        qa9Var.f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i = 0; i < qa9Var.h.size(); i++) {
                        u0c u0cVar = (u0c) qa9Var.h.get(i);
                        if (u0cVar.d.startsWith(lowerCase)) {
                            qa9Var.f.add(0, u0cVar);
                        } else if (u0cVar.d.contains(lowerCase)) {
                            qa9Var.f.add(u0cVar);
                        }
                    }
                    qa9Var.c.f();
                }
                int length3 = obj12.length();
                o39 o39Var7 = qa9Var.b;
                if (length3 != 0) {
                    if (o39Var7 != null) {
                        o39Var7.setAdapter(qa9Var.c);
                        return;
                    }
                    return;
                } else if (o39Var7 != null) {
                    qa9Var.d.setVisibility(8);
                    qa9Var.b.setAdapter(qa9Var.a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((d8a) obj).f.I(editTextBoldCursor.getText().toString());
                return;
            case 22:
                vob vobVar = (vob) obj;
                vobVar.e = editTextBoldCursor.getText().toString();
                vobVar.a.g3.O(true);
                vobVar.a.w0(0);
                return;
            case 23:
                String obj13 = editTextBoldCursor.getText().toString();
                mvb mvbVar = ((qvb) obj).s0;
                if (!mvbVar.e0.equals(obj13)) {
                    mvbVar.M(mvbVar.e[0], mvbVar.getCurrentPosition(), obj13, false);
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

    private final void r(rf4 rf4Var) {
    }
}
