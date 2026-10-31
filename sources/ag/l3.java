package ag;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.m10;
import org.telegram.messenger.ve;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ay;
import org.telegram.ui.dv;
import org.telegram.ui.e01;
import org.telegram.ui.e51;
import org.telegram.ui.iw;
import org.telegram.ui.j60;
import org.telegram.ui.k60;
import org.telegram.ui.kx;
import org.telegram.ui.lb1;
import org.telegram.ui.lr;
import org.telegram.ui.oo0;
import org.telegram.ui.pb1;
import org.telegram.ui.pe1;
import org.telegram.ui.pp;
import org.telegram.ui.pr;
import org.telegram.ui.px;
import org.telegram.ui.qp;
import org.telegram.ui.rr;
import org.telegram.ui.rt;
import org.telegram.ui.sb;
import org.telegram.ui.v60;
import org.telegram.ui.wx;
import org.telegram.ui.y60;
import org.telegram.ui.yb0;
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
                ay ayVar = (ay) this.f628b;
                org.telegram.ui.ActionBar.t0 t0Var = ayVar.D1;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                if (ayVar.f35840n2 != null) {
                    ayVar.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((oo0) this.f628b).finishFragment();
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
                ay ayVar = (ay) this.f628b;
                lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                if (!lVar.u() && ayVar.Q3 == null) {
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
                return ProfileActivity.O0(profileActivity, profileActivity.V1);
            default:
                return super.e();
        }
    }

    @Override
    public void f() {
        switch (this.f627a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f628b;
                pe1 pe1Var = wallpapersListActivity.H;
                pe1Var.f40653n = null;
                pe1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(cd.L0(2131745833, null));
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
                m3Var.f641a.f30819f3.O(true);
                m3Var.f641a.v0(0);
                return;
            case 1:
                sb sbVar = (sb) obj;
                sbVar.f41452v0 = "";
                sbVar.I.setVisibility(0);
                if (sbVar.U) {
                    sbVar.U = false;
                    sbVar.Y0(true);
                    return;
                }
                return;
            case 2:
                qp qpVar = (qp) obj;
                qpVar.e.F(null);
                qpVar.N = false;
                qpVar.getClass();
                qpVar.f41021b.setAdapter(qpVar.f41020a);
                qpVar.f41020a.f();
                qpVar.f41021b.setFastScrollVisible(true);
                qpVar.f41021b.setVerticalScrollBarEnabled(false);
                qpVar.d.setShowAtCenter(false);
                qpVar.d.b();
                return;
            case 3:
                pr prVar = (pr) obj;
                prVar.e.F(null);
                prVar.f40748n1 = false;
                b1 b1Var = prVar.f40724c;
                b1Var.W1 = false;
                b1Var.X1 = 0;
                b1Var.setAdapter(prVar.f40718a);
                prVar.f40718a.f();
                prVar.f40724c.setFastScrollVisible(true);
                prVar.f40724c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                rr rrVar = (rr) obj;
                rrVar.f41273n = null;
                ii iiVar = rrVar.f29837a;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                    return;
                }
                return;
            case 5:
                w7 w7Var = (w7) obj;
                if (w7Var.f32060n1) {
                    w7Var.f32058m1 = false;
                    w7Var.f32060n1 = false;
                    w7Var.f21610q0 = true;
                    w7Var.f32066q1.E(null);
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
                xjVar.f32481b0 = false;
                xjVar.G.setVisibility(0);
                lj ljVar = xjVar.f32487r;
                s4.g0 adapter = ljVar.getAdapter();
                pj pjVar = xjVar.f32489w;
                if (adapter != pjVar) {
                    ljVar.setAdapter(pjVar);
                }
                pjVar.f();
                xjVar.D.Y(null, true);
                return;
            case 7:
                bl blVar = (bl) obj;
                blVar.f24803i0 = false;
                blVar.f24804j0 = false;
                blVar.P.G(null, null);
                blVar.i0();
                blVar.N.setVisibility(0);
                blVar.L.setVisibility(0);
                blVar.O.setVisibility(8);
                blVar.f24819w.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f33281b0 = null;
                contactsActivity.D = false;
                contactsActivity.f33300y = false;
                contactsActivity.d.setAdapter(contactsActivity.f33280b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f33280b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.f0(contactsActivity);
                return;
            case 9:
                rt rtVar = (rt) obj;
                pj pjVar2 = rtVar.d;
                pjVar2.getClass();
                pjVar2.e = null;
                rtVar.f41283f = false;
                rtVar.e = false;
                rtVar.f41280a.setAdapter(rtVar.f41282c);
                rtVar.f41280a.setFastScrollVisible(true);
                return;
            case 10:
                dv dvVar = (dv) obj;
                dvVar.f36838a.getActionBar().k(false);
                dvVar.f36839b.getActionBar().k(false);
                return;
            case 11:
                ay ayVar = (ay) obj;
                px pxVar = ayVar.X;
                if (pxVar != null) {
                    ArrayList arrayList = pxVar.F;
                    if (!arrayList.isEmpty() && pxVar.H != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (((zf.e0) arrayList.get(i11)).h) {
                                ((iw) pxVar.H).h((zf.e0) arrayList.get(i11));
                            }
                        }
                    }
                }
                ayVar.f35822j2 = false;
                ayVar.f35827k2 = false;
                zx zxVar = ayVar.f35794e0[0];
                if (zxVar != null) {
                    wx wxVar = zxVar.f44239a;
                    if (ayVar.W2 == 0) {
                        zzVar = zxVar.f44247x;
                    }
                    wxVar.setEmptyView(zzVar);
                    ayVar.Z4(false, false, true, false);
                }
                ayVar.l5(false, false);
                zs.e().k(268, Boolean.TRUE);
                ayVar.X.setCloseButtonVisible(false);
                ayVar.k5(true);
                ayVar.M3();
                rVar = ((org.telegram.ui.ActionBar.k2) ayVar).glassEngine;
                rVar.g();
                return;
            case 12:
                k60 k60Var = (k60) obj;
                if (k60Var.M) {
                    j60.E(k60Var.f38698f, null);
                    k60Var.M = false;
                    k60Var.d.setAdapter(k60Var.e);
                    return;
                }
                return;
            case 13:
                y60.c0((y60) obj);
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33342b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33342b.setAdapter(languageSelectActivity.f33341a);
                    return;
                }
                return;
            case 15:
                yb0 yb0Var = (yb0) obj;
                yb0Var.f43814z0 = false;
                yb0Var.A0 = false;
                yb0Var.U.G(null, null);
                yb0Var.P0();
                p5 p5Var = yb0Var.X;
                if (p5Var != null) {
                    p5Var.setVisibility(0);
                }
                yb0Var.S.setVisibility(0);
                yb0Var.Q.setVisibility(0);
                yb0Var.T.setAdapter(null);
                yb0Var.T.setVisibility(8);
                yb0Var.O0(false);
                return;
            case 16:
                o90 o90Var = (o90) ((kg.q1) obj).f11251b;
                o90Var.f14312y = false;
                o90Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f33400f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f33399c.setText(cd.L0(2131748228, "NoExceptions"));
                notificationsCustomSettingsActivity.f33397a.setAdapter(notificationsCustomSettingsActivity.f33398b);
                notificationsCustomSettingsActivity.f33398b.f();
                notificationsCustomSettingsActivity.f33397a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f33397a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f33399c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                e01 e01Var = (e01) obj;
                e01Var.f36885f = null;
                if (e01Var.f36883b != null) {
                    e01Var.d.setVisibility(8);
                    e01Var.f36883b.setAdapter(e01Var.f36882a);
                    return;
                }
                return;
            case 21:
                e51 e51Var = (e51) obj;
                e51Var.f36931a.a(false, true);
                e51Var.n0(false, true);
                e51Var.f36935c.f30819f3.O(false);
                return;
            case 22:
                pb1.e0((pb1) obj, false);
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
                sbVar.f41452v0 = editTextBoldCursor.getText().toString();
                sbVar.Y0(true);
                return;
            case 18:
                oo0 oo0Var = (oo0) this.f628b;
                oo0Var.f40349a.getActionBar().z();
                oo0Var.f40350b.getActionBar().z();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        tk0 tk0Var;
        int b10;
        b1 b1Var;
        kx kxVar;
        zm0 zm0Var;
        s4.g0 g0Var;
        int i10 = this.f627a;
        boolean z10 = true;
        Object obj = this.f628b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.e = editText.getText().toString();
                m3Var.f641a.f30819f3.O(true);
                m3Var.f641a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                qp qpVar = (qp) obj;
                if (qpVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (tk0Var = qpVar.f41021b) != null) {
                        s4.g0 adapter = tk0Var.getAdapter();
                        pp ppVar = qpVar.e;
                        if (adapter != ppVar) {
                            qpVar.f41021b.setAdapter(ppVar);
                            qpVar.e.f();
                            qpVar.f41021b.setFastScrollVisible(false);
                            qpVar.f41021b.setVerticalScrollBarEnabled(true);
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
                    if (prVar.f40724c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = prVar.f40724c.getAdapter().b();
                    }
                    prVar.e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (b1Var = prVar.f40724c) != null) {
                        s4.g0 adapter2 = b1Var.getAdapter();
                        lr lrVar = prVar.f40718a;
                        if (adapter2 != lrVar) {
                            b1 b1Var2 = prVar.f40724c;
                            b1Var2.W1 = false;
                            b1Var2.X1 = 0;
                            b1Var2.setAdapter(lrVar);
                            if (b10 == 0) {
                                prVar.C0(0);
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
                rrVar.f41273n = editText.getText().toString();
                ii iiVar = rrVar.f29837a;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                    return;
                }
                return;
            case 5:
                w7 w7Var = (w7) obj;
                if (editText.length() > 0) {
                    w7Var.f32066q1.E(editText.getText().toString());
                    return;
                }
                w7Var.f32058m1 = false;
                w7Var.f32066q1.E(null);
                return;
            case 6:
                ((xj) obj).D.Y(editText.getText().toString(), false);
                return;
            case 7:
                bl blVar = (bl) obj;
                jg.l0 l0Var = blVar.L;
                b1 b1Var3 = blVar.N;
                tk0 tk0Var2 = blVar.O;
                vk vkVar = blVar.P;
                if (vkVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        blVar.f24804j0 = true;
                        blVar.f24823y.setShowSearchProgress(true);
                        b1Var3.setVisibility(8);
                        l0Var.setVisibility(8);
                        if (tk0Var2.getAdapter() != vkVar) {
                            tk0Var2.setAdapter(vkVar);
                        }
                        tk0Var2.setVisibility(0);
                        blVar.f24805k0 = (vkVar.f55455s.size() == 0 && vkVar.f55454r.size() == 0) ? false : false;
                        blVar.i0();
                    } else {
                        b1Var3.setVisibility(0);
                        l0Var.setVisibility(0);
                        tk0Var2.setAdapter(null);
                        tk0Var2.setVisibility(8);
                        blVar.f24819w.setVisibility(8);
                    }
                    vkVar.G(obj4, blVar.f24809o0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f33281b0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f33300y = true;
                        tk0 tk0Var3 = contactsActivity.d;
                        if (tk0Var3 != null) {
                            tk0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f33282c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f33300y = false;
                    contactsActivity.h.G(null);
                    tk0 tk0Var4 = contactsActivity.d;
                    if (tk0Var4 != null) {
                        tk0Var4.setAdapter(contactsActivity.f33280b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                rt rtVar = (rt) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    pj pjVar = rtVar.d;
                    pjVar.getClass();
                    pjVar.e = null;
                    rtVar.e = false;
                    rtVar.f41280a.setAdapter(rtVar.f41282c);
                    rtVar.f41280a.setFastScrollVisible(true);
                    return;
                }
                pj pjVar2 = rtVar.d;
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
                    timer2.schedule(new ve(1, pjVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    rtVar.e = true;
                    return;
                }
                return;
            case 10:
                dv dvVar = (dv) obj;
                dvVar.f36838a.getActionBar().setSearchFieldText(editText.getText().toString());
                dvVar.f36839b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                ay ayVar = (ay) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((kxVar = ayVar.C0) != null && (zm0Var = kxVar.f26451d0) != null && zm0Var.M()) || ayVar.f35873t3 || ayVar.K)) {
                    ayVar.f35827k2 = true;
                    if (!ayVar.f35856q3) {
                        ayVar.Z4(true, false, true, false);
                    }
                }
                kx kxVar2 = ayVar.C0;
                if (kxVar2 != null) {
                    View currentView = kxVar2.getCurrentView();
                    boolean z11 = !kxVar2.f26454g0;
                    if (!TextUtils.isEmpty(kxVar2.M0)) {
                        z10 = z11;
                    }
                    kxVar2.M0 = obj7;
                    kxVar2.P(currentView, kxVar2.getCurrentPosition(), obj7, z10);
                    return;
                }
                return;
            case 12:
                String obj8 = editText.getText().toString();
                k60 k60Var = (k60) obj;
                j60.E(k60Var.f38698f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z12 = !isEmpty;
                if (z12 != k60Var.M) {
                    k60Var.M = z12;
                    tk0 tk0Var5 = k60Var.d;
                    if (tk0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = k60Var.f38698f;
                        } else {
                            g0Var = k60Var.e;
                        }
                        tk0Var5.setAdapter(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                y60 y60Var = (y60) obj;
                if (editText.length() != 0) {
                    y60Var.f43741y = true;
                    v60 v60Var = y60Var.f43738s;
                    if (!v60Var.h) {
                        v60Var.h = true;
                        v60Var.f();
                    }
                    y60Var.f43738s.E(editText.getText().toString());
                    y60Var.h.setFastScrollVisible(false);
                    y60Var.h.setVerticalScrollBarEnabled(true);
                    y60Var.f43737r.e(true, true);
                    y60Var.f43737r.setStickerType(1);
                    y60Var.f43737r.d.setText(cd.L0(2131748183, null));
                    y60Var.f43737r.e.setText(cd.L0(2131745824, null));
                    return;
                }
                y60.c0(y60Var);
                return;
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    tk0 tk0Var6 = languageSelectActivity.f33342b;
                    if (tk0Var6 != null) {
                        tk0Var6.setAdapter(languageSelectActivity.f33343c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33342b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33342b.setAdapter(languageSelectActivity.f33341a);
                    return;
                }
                return;
            case 15:
                yb0 yb0Var = (yb0) obj;
                if (yb0Var.U != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        yb0Var.A0 = true;
                        yb0Var.f43803s.setShowSearchProgress(true);
                        p5 p5Var = yb0Var.X;
                        if (p5Var != null) {
                            p5Var.setVisibility(8);
                        }
                        yb0Var.S.setVisibility(8);
                        yb0Var.Q.setVisibility(8);
                        s4.g0 adapter3 = yb0Var.T.getAdapter();
                        vk vkVar2 = yb0Var.U;
                        if (adapter3 != vkVar2) {
                            yb0Var.T.setAdapter(vkVar2);
                        }
                        yb0Var.T.setVisibility(0);
                        if (yb0Var.U.b() != 0) {
                            z10 = false;
                        }
                        yb0Var.B0 = z10;
                    } else {
                        p5 p5Var2 = yb0Var.X;
                        if (p5Var2 != null) {
                            p5Var2.setVisibility(0);
                        }
                        yb0Var.S.setVisibility(0);
                        yb0Var.Q.setVisibility(0);
                        yb0Var.T.setAdapter(null);
                        yb0Var.T.setVisibility(8);
                    }
                    yb0Var.P0();
                    yb0Var.Q0();
                    yb0Var.U.G(obj10, yb0Var.F0);
                    return;
                }
                return;
            case 16:
                ((o90) ((kg.q1) obj).f11251b).j(editText.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f33397a != null) {
                            notificationsCustomSettingsActivity.f33399c.setText(cd.L0(2131748183, "NoResult"));
                            notificationsCustomSettingsActivity.f33399c.b();
                            notificationsCustomSettingsActivity.f33397a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f33397a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f33397a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                oo0 oo0Var = (oo0) obj;
                oo0Var.f40349a.getActionBar().setSearchFieldText(editText.getText().toString());
                oo0Var.f40350b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).e.I(editText.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editText.getText().toString();
                e01 e01Var = (e01) obj;
                if (obj12 == null) {
                    e01Var.f36885f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = e01Var.f36885f;
                    if (arrayList == null) {
                        e01Var.f36885f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < e01Var.h.size(); i11++) {
                        m10 m10Var = (m10) e01Var.h.get(i11);
                        if (m10Var.d.startsWith(lowerCase)) {
                            e01Var.f36885f.add(0, m10Var);
                        } else if (m10Var.d.contains(lowerCase)) {
                            e01Var.f36885f.add(m10Var);
                        }
                    }
                    e01Var.f36884c.f();
                }
                if (obj12.length() != 0) {
                    tk0 tk0Var7 = e01Var.f36883b;
                    if (tk0Var7 != null) {
                        tk0Var7.setAdapter(e01Var.f36884c);
                        return;
                    }
                    return;
                } else if (e01Var.f36883b != null) {
                    e01Var.d.setVisibility(8);
                    e01Var.f36883b.setAdapter(e01Var.f36882a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((e51) obj).f36939f.I(editText.getText().toString());
                return;
            case 22:
                String obj13 = editText.getText().toString();
                lb1 lb1Var = ((pb1) obj).f40603r0;
                if (!lb1Var.f39152d0.equals(obj13)) {
                    lb1Var.M(lb1Var.e[0], lb1Var.getCurrentPosition(), obj13, false);
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
