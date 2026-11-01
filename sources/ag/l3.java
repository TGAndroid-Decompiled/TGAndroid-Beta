package ag;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.n10;
import org.telegram.messenger.we;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.c51;
import org.telegram.ui.cv;
import org.telegram.ui.e01;
import org.telegram.ui.hw;
import org.telegram.ui.i60;
import org.telegram.ui.j60;
import org.telegram.ui.jb1;
import org.telegram.ui.jx;
import org.telegram.ui.lr;
import org.telegram.ui.mo0;
import org.telegram.ui.nb1;
import org.telegram.ui.ne1;
import org.telegram.ui.ox;
import org.telegram.ui.pp;
import org.telegram.ui.pr;
import org.telegram.ui.qp;
import org.telegram.ui.qt;
import org.telegram.ui.rr;
import org.telegram.ui.sb;
import org.telegram.ui.u60;
import org.telegram.ui.vx;
import org.telegram.ui.x60;
import org.telegram.ui.xb0;
import org.telegram.ui.yx;
import org.telegram.ui.zx;
public final class l3 extends org.telegram.ui.ActionBar.p0 {
    public final int f627a;
    public final Object f628b;

    public l3(Object obj, int i10) {
        this.f627a = i10;
        this.f628b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f627a) {
            case 11:
                zx zxVar = (zx) this.f628b;
                org.telegram.ui.ActionBar.t0 t0Var = zxVar.D1;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                if (zxVar.f44183n2 != null) {
                    zxVar.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((mo0) this.f628b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f627a) {
            case 11:
                zx zxVar = (zx) this.f628b;
                lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                if (!lVar.u() && zxVar.Q3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f627a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f628b;
                boolean z10 = profileActivity.V1;
                profileActivity.V1 = !z10;
                if (z10) {
                    p5 p5Var = profileActivity.T0;
                    p5Var.e.clearFocus();
                    org.telegram.messenger.i0.v1(p5Var.e);
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
        switch (this.f627a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f628b;
                ne1 ne1Var = wallpapersListActivity.H;
                ne1Var.f39889n = null;
                ne1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(dd.L0(2131745833, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        ei.r rVar;
        int i10 = this.f627a;
        zz zzVar = null;
        Object obj = this.f628b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.d = false;
                m3Var.e = null;
                m3Var.f641a.f31183f3.O(true);
                m3Var.f641a.v0(0);
                return;
            case 1:
                sb sbVar = (sb) obj;
                sbVar.f41328v0 = "";
                sbVar.I.setVisibility(0);
                if (sbVar.U) {
                    sbVar.U = false;
                    sbVar.Z0(true);
                    return;
                }
                return;
            case 2:
                qp qpVar = (qp) obj;
                qpVar.e.F(null);
                qpVar.N = false;
                qpVar.getClass();
                qpVar.f40870b.setAdapter(qpVar.f40869a);
                qpVar.f40869a.f();
                qpVar.f40870b.setFastScrollVisible(true);
                qpVar.f40870b.setVerticalScrollBarEnabled(false);
                qpVar.d.setShowAtCenter(false);
                qpVar.d.b();
                return;
            case 3:
                pr prVar = (pr) obj;
                prVar.e.F(null);
                prVar.f40555n1 = false;
                b1 b1Var = prVar.f40531c;
                b1Var.W1 = false;
                b1Var.X1 = 0;
                b1Var.setAdapter(prVar.f40525a);
                prVar.f40525a.f();
                prVar.f40531c.setFastScrollVisible(true);
                prVar.f40531c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                rr rrVar = (rr) obj;
                rrVar.f41139n = null;
                ii iiVar = rrVar.f30217a;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                    return;
                }
                return;
            case 5:
                w7 w7Var = (w7) obj;
                if (w7Var.f32108n1) {
                    w7Var.f32106m1 = false;
                    w7Var.f32108n1 = false;
                    w7Var.f21611q0 = true;
                    w7Var.f32114q1.E(null);
                    org.telegram.ui.ActionBar.t0 t0Var = w7Var.a2;
                    if (t0Var != null) {
                        t0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                xj xjVar = (xj) obj;
                xjVar.f32581b0 = false;
                xjVar.G.setVisibility(0);
                lj ljVar = xjVar.f32587r;
                s4.g0 adapter = ljVar.getAdapter();
                pj pjVar = xjVar.f32589w;
                if (adapter != pjVar) {
                    ljVar.setAdapter(pjVar);
                }
                pjVar.f();
                xjVar.D.Y(null, true);
                return;
            case 7:
                bl blVar = (bl) obj;
                blVar.f24858i0 = false;
                blVar.f24859j0 = false;
                blVar.P.G(null, null);
                blVar.i0();
                blVar.N.setVisibility(0);
                blVar.L.setVisibility(0);
                blVar.O.setVisibility(8);
                blVar.f24874w.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f33288b0 = null;
                contactsActivity.D = false;
                contactsActivity.f33307y = false;
                contactsActivity.d.setAdapter(contactsActivity.f33287b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f33287b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 9:
                qt qtVar = (qt) obj;
                pj pjVar2 = qtVar.d;
                pjVar2.getClass();
                pjVar2.e = null;
                qtVar.f40895f = false;
                qtVar.e = false;
                qtVar.f40892a.setAdapter(qtVar.f40894c);
                qtVar.f40892a.setFastScrollVisible(true);
                return;
            case 10:
                cv cvVar = (cv) obj;
                cvVar.f36415a.getActionBar().k(false);
                cvVar.f36416b.getActionBar().k(false);
                return;
            case 11:
                zx zxVar = (zx) obj;
                ox oxVar = zxVar.X;
                if (oxVar != null) {
                    ArrayList arrayList = oxVar.F;
                    if (!arrayList.isEmpty() && oxVar.H != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (((zf.e0) arrayList.get(i11)).h) {
                                ((hw) oxVar.H).h((zf.e0) arrayList.get(i11));
                            }
                        }
                    }
                }
                zxVar.f44165j2 = false;
                zxVar.f44170k2 = false;
                yx yxVar = zxVar.f44137e0[0];
                if (yxVar != null) {
                    vx vxVar = yxVar.f43733a;
                    if (zxVar.W2 == 0) {
                        zzVar = yxVar.f43741x;
                    }
                    vxVar.setEmptyView(zzVar);
                    zxVar.a5(false, false, true, false);
                }
                zxVar.m5(false, false);
                at.e().k(268, Boolean.TRUE);
                zxVar.X.setCloseButtonVisible(false);
                zxVar.l5(true);
                zxVar.N3();
                rVar = ((org.telegram.ui.ActionBar.k2) zxVar).glassEngine;
                rVar.g();
                return;
            case 12:
                j60 j60Var = (j60) obj;
                if (j60Var.M) {
                    i60.E(j60Var.f38285f, null);
                    j60Var.M = false;
                    j60Var.d.setAdapter(j60Var.e);
                    return;
                }
                return;
            case 13:
                x60.d0((x60) obj);
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.n0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33349b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33349b.setAdapter(languageSelectActivity.f33348a);
                    return;
                }
                return;
            case 15:
                xb0 xb0Var = (xb0) obj;
                xb0Var.f43334z0 = false;
                xb0Var.A0 = false;
                xb0Var.U.G(null, null);
                xb0Var.Q0();
                p5 p5Var = xb0Var.X;
                if (p5Var != null) {
                    p5Var.setVisibility(0);
                }
                xb0Var.S.setVisibility(0);
                xb0Var.Q.setVisibility(0);
                xb0Var.T.setAdapter(null);
                xb0Var.T.setVisibility(8);
                xb0Var.P0(false);
                return;
            case 16:
                o90 o90Var = (o90) ((kg.q1) obj).f11252b;
                o90Var.f14313y = false;
                o90Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f33407f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f33406c.setText(dd.L0(2131748228, "NoExceptions"));
                notificationsCustomSettingsActivity.f33404a.setAdapter(notificationsCustomSettingsActivity.f33405b);
                notificationsCustomSettingsActivity.f33405b.f();
                notificationsCustomSettingsActivity.f33404a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f33404a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f33406c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                e01 e01Var = (e01) obj;
                e01Var.f36711f = null;
                if (e01Var.f36709b != null) {
                    e01Var.d.setVisibility(8);
                    e01Var.f36709b.setAdapter(e01Var.f36708a);
                    return;
                }
                return;
            case 21:
                c51 c51Var = (c51) obj;
                c51Var.f36185a.a(false, true);
                c51Var.o0(false, true);
                c51Var.f36189c.f31183f3.O(false);
                return;
            case 22:
                nb1.f0((nb1) obj, false);
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
        throw new UnsupportedOperationException("Method not decompiled: ag.l3.i():void");
    }

    @Override
    public void j(zf.e0 e0Var) {
        switch (this.f627a) {
            case 6:
                xj xjVar = (xj) this.f628b;
                wj wjVar = xjVar.D;
                wjVar.R.remove(e0Var);
                wjVar.Y(xjVar.F.getSearchField().getText().toString(), false);
                wjVar.a0(null, null, true);
                return;
            case 22:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f627a) {
            case 1:
                sb sbVar = (sb) this.f628b;
                sbVar.U = true;
                sbVar.f41328v0 = editTextBoldCursor.getText().toString();
                sbVar.Z0(true);
                return;
            case 18:
                mo0 mo0Var = (mo0) this.f628b;
                mo0Var.f39585a.getActionBar().z();
                mo0Var.f39586b.getActionBar().z();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        uk0 uk0Var;
        int b10;
        b1 b1Var;
        jx jxVar;
        an0 an0Var;
        s4.g0 g0Var;
        int i10 = this.f627a;
        boolean z10 = true;
        Object obj = this.f628b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.e = editText.getText().toString();
                m3Var.f641a.f31183f3.O(true);
                m3Var.f641a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                qp qpVar = (qp) obj;
                if (qpVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (uk0Var = qpVar.f40870b) != null) {
                        s4.g0 adapter = uk0Var.getAdapter();
                        pp ppVar = qpVar.e;
                        if (adapter != ppVar) {
                            qpVar.f40870b.setAdapter(ppVar);
                            qpVar.e.f();
                            qpVar.f40870b.setFastScrollVisible(false);
                            qpVar.f40870b.setVerticalScrollBarEnabled(true);
                            qpVar.d.b();
                        }
                    }
                    qpVar.e.F(obj2);
                    return;
                }
                return;
            case 3:
                pr prVar = (pr) obj;
                if (prVar.e != null) {
                    String obj3 = editText.getText().toString();
                    if (prVar.f40531c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = prVar.f40531c.getAdapter().b();
                    }
                    prVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = prVar.f40531c) != null) {
                        s4.g0 adapter2 = b1Var.getAdapter();
                        lr lrVar = prVar.f40525a;
                        if (adapter2 != lrVar) {
                            b1 b1Var2 = prVar.f40531c;
                            b1Var2.W1 = false;
                            b1Var2.X1 = 0;
                            b1Var2.setAdapter(lrVar);
                            if (b10 == 0) {
                                prVar.D0(0);
                            }
                        }
                    }
                    prVar.C1.setVisibility(8);
                    prVar.B1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                rr rrVar = (rr) obj;
                rrVar.f41139n = editText.getText().toString();
                ii iiVar = rrVar.f30217a;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                    return;
                }
                return;
            case 5:
                w7 w7Var = (w7) obj;
                if (editText.length() > 0) {
                    w7Var.f32114q1.E(editText.getText().toString());
                    return;
                }
                w7Var.f32106m1 = false;
                w7Var.f32114q1.E(null);
                return;
            case 6:
                ((xj) obj).D.Y(editText.getText().toString(), false);
                return;
            case 7:
                bl blVar = (bl) obj;
                jg.l0 l0Var = blVar.L;
                b1 b1Var3 = blVar.N;
                uk0 uk0Var2 = blVar.O;
                vk vkVar = blVar.P;
                if (vkVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        blVar.f24859j0 = true;
                        blVar.f24878y.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        l0Var.setVisibility(8);
                        if (uk0Var2.getAdapter() != vkVar) {
                            uk0Var2.setAdapter(vkVar);
                        }
                        uk0Var2.setVisibility(0);
                        blVar.f24860k0 = (vkVar.f55473s.size() == 0 && vkVar.f55472r.size() == 0) ? false : false;
                        blVar.i0();
                    } else {
                        b1Var3.setVisibility(0);
                        l0Var.setVisibility(0);
                        uk0Var2.setAdapter(null);
                        uk0Var2.setVisibility(8);
                        blVar.f24874w.setVisibility(8);
                    }
                    vkVar.G(obj4, blVar.f24864o0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f33288b0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f33307y = true;
                        uk0 uk0Var3 = contactsActivity.d;
                        if (uk0Var3 != null) {
                            uk0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f33289c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f33307y = false;
                    contactsActivity.h.G(null);
                    uk0 uk0Var4 = contactsActivity.d;
                    if (uk0Var4 != null) {
                        uk0Var4.setAdapter(contactsActivity.f33287b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                qt qtVar = (qt) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    pj pjVar = qtVar.d;
                    pjVar.getClass();
                    pjVar.e = null;
                    qtVar.e = false;
                    qtVar.f40892a.setAdapter(qtVar.f40894c);
                    qtVar.f40892a.setFastScrollVisible(true);
                    return;
                }
                pj pjVar2 = qtVar.d;
                pjVar2.getClass();
                if (obj6 == null) {
                    pjVar2.e = null;
                } else {
                    try {
                        Timer timer = (Timer) pjVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    Timer timer2 = new Timer();
                    pjVar2.h = timer2;
                    timer2.schedule(new we(1, pjVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    qtVar.e = true;
                    return;
                }
                return;
            case 10:
                cv cvVar = (cv) obj;
                cvVar.f36415a.getActionBar().setSearchFieldText(editText.getText().toString());
                cvVar.f36416b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                zx zxVar = (zx) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((jxVar = zxVar.C0) != null && (an0Var = jxVar.f26872d0) != null && an0Var.M()) || zxVar.f44216t3 || zxVar.K)) {
                    zxVar.f44170k2 = true;
                    if (!zxVar.f44199q3) {
                        zxVar.a5(true, false, true, false);
                    }
                }
                jx jxVar2 = zxVar.C0;
                if (jxVar2 != null) {
                    View currentView = jxVar2.getCurrentView();
                    boolean z11 = !jxVar2.f26875g0;
                    if (!TextUtils.isEmpty(jxVar2.M0)) {
                        z10 = z11;
                    }
                    jxVar2.M0 = obj7;
                    jxVar2.P(currentView, jxVar2.getCurrentPosition(), obj7, z10);
                    return;
                }
                return;
            case 12:
                String obj8 = editText.getText().toString();
                j60 j60Var = (j60) obj;
                i60.E(j60Var.f38285f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z12 = !isEmpty;
                if (z12 != j60Var.M) {
                    j60Var.M = z12;
                    uk0 uk0Var5 = j60Var.d;
                    if (uk0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = j60Var.f38285f;
                        } else {
                            g0Var = j60Var.e;
                        }
                        uk0Var5.setAdapter(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                x60 x60Var = (x60) obj;
                if (editText.length() != 0) {
                    x60Var.f43273y = true;
                    u60 u60Var = x60Var.f43270s;
                    if (!u60Var.h) {
                        u60Var.h = true;
                        u60Var.f();
                    }
                    x60Var.f43270s.E(editText.getText().toString());
                    x60Var.h.setFastScrollVisible(false);
                    x60Var.h.setVerticalScrollBarEnabled(true);
                    x60Var.f43269r.e(true, true);
                    x60Var.f43269r.setStickerType(1);
                    x60Var.f43269r.d.setText(dd.L0(2131748183, null));
                    x60Var.f43269r.e.setText(dd.L0(2131745824, null));
                    return;
                }
                x60.d0(x60Var);
                return;
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.n0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    uk0 uk0Var6 = languageSelectActivity.f33349b;
                    if (uk0Var6 != null) {
                        uk0Var6.setAdapter(languageSelectActivity.f33350c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33349b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33349b.setAdapter(languageSelectActivity.f33348a);
                    return;
                }
                return;
            case 15:
                xb0 xb0Var = (xb0) obj;
                if (xb0Var.U != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        xb0Var.A0 = true;
                        xb0Var.f43323s.setShowSearchProgress(true);
                        p5 p5Var = xb0Var.X;
                        if (p5Var != null) {
                            p5Var.setVisibility(8);
                        }
                        xb0Var.S.setVisibility(8);
                        xb0Var.Q.setVisibility(8);
                        s4.g0 adapter3 = xb0Var.T.getAdapter();
                        vk vkVar2 = xb0Var.U;
                        if (adapter3 != vkVar2) {
                            xb0Var.T.setAdapter(vkVar2);
                        }
                        xb0Var.T.setVisibility(0);
                        if (xb0Var.U.b() != 0) {
                            z10 = false;
                        }
                        xb0Var.B0 = z10;
                    } else {
                        p5 p5Var2 = xb0Var.X;
                        if (p5Var2 != null) {
                            p5Var2.setVisibility(0);
                        }
                        xb0Var.S.setVisibility(0);
                        xb0Var.Q.setVisibility(0);
                        xb0Var.T.setAdapter(null);
                        xb0Var.T.setVisibility(8);
                    }
                    xb0Var.Q0();
                    xb0Var.R0();
                    xb0Var.U.G(obj10, xb0Var.F0);
                    return;
                }
                return;
            case 16:
                ((o90) ((kg.q1) obj).f11252b).j(editText.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f33404a != null) {
                            notificationsCustomSettingsActivity.f33406c.setText(dd.L0(2131748183, "NoResult"));
                            notificationsCustomSettingsActivity.f33406c.b();
                            notificationsCustomSettingsActivity.f33404a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f33404a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f33404a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                mo0 mo0Var = (mo0) obj;
                mo0Var.f39585a.getActionBar().setSearchFieldText(editText.getText().toString());
                mo0Var.f39586b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editText.getText().toString();
                e01 e01Var = (e01) obj;
                if (obj12 == null) {
                    e01Var.f36711f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = e01Var.f36711f;
                    if (arrayList == null) {
                        e01Var.f36711f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < e01Var.h.size(); i11++) {
                        n10 n10Var = (n10) e01Var.h.get(i11);
                        if (n10Var.d.startsWith(lowerCase)) {
                            e01Var.f36711f.add(0, n10Var);
                        } else if (n10Var.d.contains(lowerCase)) {
                            e01Var.f36711f.add(n10Var);
                        }
                    }
                    e01Var.f36710c.f();
                }
                if (obj12.length() != 0) {
                    uk0 uk0Var7 = e01Var.f36709b;
                    if (uk0Var7 != null) {
                        uk0Var7.setAdapter(e01Var.f36710c);
                        return;
                    }
                    return;
                } else if (e01Var.f36709b != null) {
                    e01Var.d.setVisibility(8);
                    e01Var.f36709b.setAdapter(e01Var.f36708a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((c51) obj).f36193f.I(editText.getText().toString());
                return;
            case 22:
                String obj13 = editText.getText().toString();
                jb1 jb1Var = ((nb1) obj).f39834r0;
                if (!jb1Var.f38339d0.equals(obj13)) {
                    jb1Var.M(jb1Var.e[0], jb1Var.getCurrentPosition(), obj13, false);
                    return;
                }
                return;
            case 23:
                ((WallpapersListActivity) obj).H.E(editText.getText().toString(), false);
                return;
        }
    }

    private final void q(zf.e0 e0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
