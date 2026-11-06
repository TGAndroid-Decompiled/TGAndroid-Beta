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
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.an0;
import org.telegram.ui.au;
import org.telegram.ui.dv;
import org.telegram.ui.fw;
import org.telegram.ui.kq;
import org.telegram.ui.l50;
import org.telegram.ui.lw;
import org.telegram.ui.m31;
import org.telegram.ui.m50;
import org.telegram.ui.mb;
import org.telegram.ui.oq;
import org.telegram.ui.pa0;
import org.telegram.ui.qq;
import org.telegram.ui.qs;
import org.telegram.ui.qy0;
import org.telegram.ui.r91;
import org.telegram.ui.rc1;
import org.telegram.ui.ro;
import org.telegram.ui.so;
import org.telegram.ui.sw;
import org.telegram.ui.v91;
import org.telegram.ui.vw;
import org.telegram.ui.w50;
import org.telegram.ui.ww;
import org.telegram.ui.z50;
public final class v1 extends org.telegram.ui.ActionBar.n0 {
    public final int f17560a;
    public final Object f17561b;

    public v1(Object obj, int i7) {
        this.f17560a = i7;
        this.f17561b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f17560a) {
            case 11:
                ww wwVar = (ww) this.f17561b;
                org.telegram.ui.ActionBar.r0 r0Var = wwVar.D1;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                if (wwVar.f51579n2 != null) {
                    wwVar.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((an0) this.f17561b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f17560a) {
            case 11:
                ww wwVar = (ww) this.f17561b;
                kVar = ((f2) wwVar).actionBar;
                if (!kVar.v() && wwVar.Q3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f17560a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f17561b;
                boolean z9 = profileActivity.V1;
                profileActivity.V1 = !z9;
                if (z9) {
                    f5 f5Var = profileActivity.T0;
                    f5Var.f28425e.clearFocus();
                    org.telegram.messenger.g0.v1(f5Var.f28425e);
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
        switch (this.f17560a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f17561b;
                rc1 rc1Var = wallpapersListActivity.H;
                rc1Var.f49467n = null;
                rc1Var.E(null, true);
                wallpapersListActivity.J.setSearchFieldHint(hd.M0(2131745817, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        oi.q qVar;
        int i7 = this.f17560a;
        lz lzVar = null;
        Object obj = this.f17561b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.d = false;
                w1Var.f17570e = null;
                w1Var.f17567a.f35167f3.O(true);
                w1Var.f17567a.v0(0);
                return;
            case 1:
                mb mbVar = (mb) obj;
                mbVar.f47745v0 = "";
                mbVar.I.setVisibility(0);
                if (mbVar.U) {
                    mbVar.U = false;
                    mbVar.Z0(true);
                    return;
                }
                return;
            case 2:
                so soVar = (so) obj;
                soVar.f49779e.F(null);
                soVar.N = false;
                soVar.getClass();
                soVar.f49777b.setAdapter(soVar.f49776a);
                soVar.f49776a.f();
                soVar.f49777b.setFastScrollVisible(true);
                soVar.f49777b.setVerticalScrollBarEnabled(false);
                soVar.d.setShowAtCenter(false);
                soVar.d.b();
                return;
            case 3:
                oq oqVar = (oq) obj;
                oqVar.f48452e.F(null);
                oqVar.n1 = false;
                bi.q1 q1Var = oqVar.f48447c;
                q1Var.W1 = false;
                q1Var.X1 = 0;
                q1Var.setAdapter(oqVar.f48441a);
                oqVar.f48441a.f();
                oqVar.f48447c.setFastScrollVisible(true);
                oqVar.f48447c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                qq qqVar = (qq) obj;
                qqVar.f49267n = null;
                w3 w3Var = qqVar.f34211a;
                if (w3Var != null) {
                    w3Var.f35167f3.O(true);
                    return;
                }
                return;
            case 5:
                b8 b8Var = (b8) obj;
                if (b8Var.n1) {
                    b8Var.f32048m1 = false;
                    b8Var.n1 = false;
                    b8Var.f28640q0 = true;
                    b8Var.f32055q1.E(null);
                    org.telegram.ui.ActionBar.r0 r0Var = b8Var.f32034a2;
                    if (r0Var != null) {
                        r0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                vj vjVar = (vj) obj;
                vjVar.f38961b0 = false;
                vjVar.G.setVisibility(0);
                kj kjVar = vjVar.f38967r;
                v4.g0 adapter = kjVar.getAdapter();
                oj ojVar = vjVar.f38969w;
                if (adapter != ojVar) {
                    kjVar.setAdapter(ojVar);
                }
                ojVar.f();
                vjVar.D.Y(null, true);
                return;
            case 7:
                wk wkVar = (wk) obj;
                wkVar.f39982c0 = false;
                wkVar.f39983d0 = false;
                wkVar.N.G(null);
                wkVar.j0();
                wkVar.L.setVisibility(0);
                wkVar.J.setVisibility(0);
                wkVar.M.setVisibility(8);
                wkVar.f39999s.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f41154b0 = null;
                contactsActivity.D = false;
                contactsActivity.f41174y = false;
                contactsActivity.d.setAdapter(contactsActivity.f41153b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f41153b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 9:
                qs qsVar = (qs) obj;
                oj ojVar2 = qsVar.d;
                ojVar2.getClass();
                ojVar2.f36734e = null;
                qsVar.f49287f = false;
                qsVar.f49286e = false;
                qsVar.f49283a.setAdapter(qsVar.f49285c);
                qsVar.f49283a.setFastScrollVisible(true);
                return;
            case 10:
                au auVar = (au) obj;
                auVar.f44074a.getActionBar().l(false);
                auVar.f44075b.getActionBar().l(false);
                return;
            case 11:
                ww wwVar = (ww) obj;
                lw lwVar = wwVar.X;
                if (lwVar != null) {
                    ArrayList arrayList = lwVar.F;
                    if (!arrayList.isEmpty() && lwVar.H != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((dv) lwVar.H).h((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                wwVar.f51562j2 = false;
                wwVar.f51566k2 = false;
                vw vwVar = wwVar.f51534e0[0];
                if (vwVar != null) {
                    sw swVar = vwVar.f50833a;
                    if (wwVar.W2 == 0) {
                        lzVar = vwVar.f50842x;
                    }
                    swVar.setEmptyView(lzVar);
                    wwVar.a5(false, false, true, false);
                }
                wwVar.m5(false, false);
                org.telegram.messenger.qs.e().k(268, Boolean.TRUE);
                wwVar.X.setCloseButtonVisible(false);
                wwVar.l5(true);
                wwVar.N3();
                qVar = ((f2) wwVar).glassEngine;
                qVar.g();
                return;
            case 12:
                m50 m50Var = (m50) obj;
                if (m50Var.M) {
                    l50.E(m50Var.f47643f, null);
                    m50Var.M = false;
                    m50Var.d.setAdapter(m50Var.f47642e);
                    return;
                }
                return;
            case 13:
                z50.d0((z50) obj);
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f41220b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f41220b.setAdapter(languageSelectActivity.f41219a);
                    return;
                }
                return;
            case 15:
                pa0 pa0Var = (pa0) obj;
                pa0Var.f48760t0 = false;
                pa0Var.f48761u0 = false;
                pa0Var.S.G(null);
                pa0Var.L0();
                f5 f5Var = pa0Var.V;
                if (f5Var != null) {
                    f5Var.setVisibility(0);
                }
                pa0Var.Q.setVisibility(0);
                pa0Var.O.setVisibility(0);
                pa0Var.R.setAdapter(null);
                pa0Var.R.setVisibility(8);
                pa0Var.K0(false);
                return;
            case 16:
                w80 w80Var = (w80) ((w4) obj).f4962b;
                w80Var.f59441y = false;
                w80Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f41279f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f41277c.setText(hd.M0(2131748210, "NoExceptions"));
                notificationsCustomSettingsActivity.f41275a.setAdapter(notificationsCustomSettingsActivity.f41276b);
                notificationsCustomSettingsActivity.f41276b.f();
                notificationsCustomSettingsActivity.f41275a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f41275a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f41277c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                qy0 qy0Var = (qy0) obj;
                qy0Var.f49311f = null;
                if (qy0Var.f49308b != null) {
                    qy0Var.d.setVisibility(8);
                    qy0Var.f49308b.setAdapter(qy0Var.f49307a);
                    return;
                }
                return;
            case 21:
                m31 m31Var = (m31) obj;
                m31Var.f47615a.a(false, true);
                m31Var.o0(false, true);
                m31Var.f47619c.f35167f3.O(false);
                return;
            case 22:
                v91.f0((v91) obj, false);
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
        switch (this.f17560a) {
            case 6:
                vj vjVar = (vj) this.f17561b;
                uj ujVar = vjVar.D;
                ujVar.R.remove(o0Var);
                ujVar.Y(vjVar.F.getSearchField().getText().toString(), false);
                ujVar.a0(null, null, true);
                return;
            case 22:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f17560a) {
            case 1:
                mb mbVar = (mb) this.f17561b;
                mbVar.U = true;
                mbVar.f47745v0 = editTextBoldCursor.getText().toString();
                mbVar.Z0(true);
                return;
            case 18:
                an0 an0Var = (an0) this.f17561b;
                an0Var.f44025a.getActionBar().z();
                an0Var.f44026b.getActionBar().z();
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
        fw fwVar;
        yl0 yl0Var;
        v4.g0 g0Var;
        int i7 = this.f17560a;
        boolean z9 = true;
        Object obj = this.f17561b;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                w1Var.f17570e = editText.getText().toString();
                w1Var.f17567a.f35167f3.O(true);
                w1Var.f17567a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                so soVar = (so) obj;
                if (soVar.f49779e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (pj0Var = soVar.f49777b) != null) {
                        v4.g0 adapter = pj0Var.getAdapter();
                        ro roVar = soVar.f49779e;
                        if (adapter != roVar) {
                            soVar.f49777b.setAdapter(roVar);
                            soVar.f49779e.f();
                            soVar.f49777b.setFastScrollVisible(false);
                            soVar.f49777b.setVerticalScrollBarEnabled(true);
                            soVar.d.b();
                        }
                    }
                    soVar.f49779e.F(obj2);
                    return;
                }
                return;
            case 3:
                oq oqVar = (oq) obj;
                if (oqVar.f48452e != null) {
                    String obj3 = editText.getText().toString();
                    if (oqVar.f48447c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = oqVar.f48447c.getAdapter().b();
                    }
                    oqVar.f48452e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (q1Var = oqVar.f48447c) != null) {
                        v4.g0 adapter2 = q1Var.getAdapter();
                        kq kqVar = oqVar.f48441a;
                        if (adapter2 != kqVar) {
                            bi.q1 q1Var2 = oqVar.f48447c;
                            q1Var2.W1 = false;
                            q1Var2.X1 = 0;
                            q1Var2.setAdapter(kqVar);
                            if (b10 == 0) {
                                oqVar.D0(0);
                            }
                        }
                    }
                    oqVar.C1.setVisibility(8);
                    oqVar.B1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                qq qqVar = (qq) obj;
                qqVar.f49267n = editText.getText().toString();
                w3 w3Var = qqVar.f34211a;
                if (w3Var != null) {
                    w3Var.f35167f3.O(true);
                    return;
                }
                return;
            case 5:
                b8 b8Var = (b8) obj;
                if (editText.length() > 0) {
                    b8Var.f32055q1.E(editText.getText().toString());
                    return;
                }
                b8Var.f32048m1 = false;
                b8Var.f32055q1.E(null);
                return;
            case 6:
                ((vj) obj).D.Y(editText.getText().toString(), false);
                return;
            case 7:
                wk wkVar = (wk) obj;
                e5 e5Var = wkVar.J;
                bi.q1 q1Var3 = wkVar.L;
                pj0 pj0Var2 = wkVar.M;
                uk ukVar = wkVar.N;
                if (ukVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        wkVar.f39983d0 = true;
                        wkVar.f40006x.setShowSearchProgress(true);
                        q1Var3.setVisibility(8);
                        e5Var.setVisibility(8);
                        if (pj0Var2.getAdapter() != ukVar) {
                            pj0Var2.setAdapter(ukVar);
                        }
                        pj0Var2.setVisibility(0);
                        wkVar.f39984e0 = ukVar.f16671f.isEmpty();
                        wkVar.j0();
                    } else {
                        q1Var3.setVisibility(0);
                        e5Var.setVisibility(0);
                        pj0Var2.setAdapter(null);
                        pj0Var2.setVisibility(8);
                        wkVar.f39999s.setVisibility(8);
                    }
                    ukVar.G(obj4);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f41154b0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f41174y = true;
                        pj0 pj0Var3 = contactsActivity.d;
                        if (pj0Var3 != null) {
                            pj0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f41155c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f41174y = false;
                    contactsActivity.h.G(null);
                    pj0 pj0Var4 = contactsActivity.d;
                    if (pj0Var4 != null) {
                        pj0Var4.setAdapter(contactsActivity.f41153b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                qs qsVar = (qs) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    oj ojVar = qsVar.d;
                    ojVar.getClass();
                    ojVar.f36734e = null;
                    qsVar.f49286e = false;
                    qsVar.f49283a.setAdapter(qsVar.f49285c);
                    qsVar.f49283a.setFastScrollVisible(true);
                    return;
                }
                oj ojVar2 = qsVar.d;
                ojVar2.getClass();
                if (obj6 == null) {
                    ojVar2.f36734e = null;
                } else {
                    try {
                        Timer timer = (Timer) ojVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    ojVar2.h = timer2;
                    timer2.schedule(new jg.q1(2, ojVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    qsVar.f49286e = true;
                    return;
                }
                return;
            case 10:
                au auVar = (au) obj;
                auVar.f44074a.getActionBar().setSearchFieldText(editText.getText().toString());
                auVar.f44075b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                ww wwVar = (ww) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((fwVar = wwVar.C0) != null && (yl0Var = fwVar.f33637d0) != null && yl0Var.M()) || wwVar.f51611t3 || wwVar.K)) {
                    wwVar.f51566k2 = true;
                    if (!wwVar.f51594q3) {
                        wwVar.a5(true, false, true, false);
                    }
                }
                fw fwVar2 = wwVar.C0;
                if (fwVar2 != null) {
                    View currentView = fwVar2.getCurrentView();
                    boolean z10 = !fwVar2.f33640g0;
                    if (!TextUtils.isEmpty(fwVar2.M0)) {
                        z9 = z10;
                    }
                    fwVar2.M0 = obj7;
                    fwVar2.P(currentView, fwVar2.getCurrentPosition(), obj7, z9);
                    return;
                }
                return;
            case 12:
                String obj8 = editText.getText().toString();
                m50 m50Var = (m50) obj;
                l50.E(m50Var.f47643f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z11 = !isEmpty;
                if (z11 != m50Var.M) {
                    m50Var.M = z11;
                    pj0 pj0Var5 = m50Var.d;
                    if (pj0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = m50Var.f47643f;
                        } else {
                            g0Var = m50Var.f47642e;
                        }
                        pj0Var5.setAdapter(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                z50 z50Var = (z50) obj;
                if (editText.length() != 0) {
                    z50Var.f52480y = true;
                    w50 w50Var = z50Var.f52477s;
                    if (!w50Var.h) {
                        w50Var.h = true;
                        w50Var.f();
                    }
                    z50Var.f52477s.E(editText.getText().toString());
                    z50Var.h.setFastScrollVisible(false);
                    z50Var.h.setVerticalScrollBarEnabled(true);
                    z50Var.f52476r.e(true, true);
                    z50Var.f52476r.setStickerType(1);
                    z50Var.f52476r.d.setText(hd.M0(2131748166, null));
                    z50Var.f52476r.f31917e.setText(hd.M0(2131745808, null));
                    return;
                }
                z50.d0(z50Var);
                return;
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    pj0 pj0Var6 = languageSelectActivity.f41220b;
                    if (pj0Var6 != null) {
                        pj0Var6.setAdapter(languageSelectActivity.f41221c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f41220b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f41220b.setAdapter(languageSelectActivity.f41219a);
                    return;
                }
                return;
            case 15:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.S != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        pa0Var.f48761u0 = true;
                        pa0Var.f48756r.setShowSearchProgress(true);
                        f5 f5Var = pa0Var.V;
                        if (f5Var != null) {
                            f5Var.setVisibility(8);
                        }
                        pa0Var.Q.setVisibility(8);
                        pa0Var.O.setVisibility(8);
                        v4.g0 adapter3 = pa0Var.R.getAdapter();
                        uk ukVar2 = pa0Var.S;
                        if (adapter3 != ukVar2) {
                            pa0Var.R.setAdapter(ukVar2);
                        }
                        pa0Var.R.setVisibility(0);
                        if (pa0Var.S.b() != 0) {
                            z9 = false;
                        }
                        pa0Var.f48762v0 = z9;
                    } else {
                        f5 f5Var2 = pa0Var.V;
                        if (f5Var2 != null) {
                            f5Var2.setVisibility(0);
                        }
                        pa0Var.Q.setVisibility(0);
                        pa0Var.O.setVisibility(0);
                        pa0Var.R.setAdapter(null);
                        pa0Var.R.setVisibility(8);
                    }
                    pa0Var.L0();
                    pa0Var.M0();
                    pa0Var.S.G(obj10);
                    return;
                }
                return;
            case 16:
                ((w80) ((w4) obj).f4962b).j(editText.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f41275a != null) {
                            notificationsCustomSettingsActivity.f41277c.setText(hd.M0(2131748166, "NoResult"));
                            notificationsCustomSettingsActivity.f41277c.b();
                            notificationsCustomSettingsActivity.f41275a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f41275a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f41275a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                an0 an0Var = (an0) obj;
                an0Var.f44025a.getActionBar().setSearchFieldText(editText.getText().toString());
                an0Var.f44026b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).f41693e.I(editText.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editText.getText().toString();
                qy0 qy0Var = (qy0) obj;
                if (obj12 == null) {
                    qy0Var.f49311f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = qy0Var.f49311f;
                    if (arrayList == null) {
                        qy0Var.f49311f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < qy0Var.h.size(); i10++) {
                        y00 y00Var = (y00) qy0Var.h.get(i10);
                        if (y00Var.d.startsWith(lowerCase)) {
                            qy0Var.f49311f.add(0, y00Var);
                        } else if (y00Var.d.contains(lowerCase)) {
                            qy0Var.f49311f.add(y00Var);
                        }
                    }
                    qy0Var.f49309c.f();
                }
                if (obj12.length() != 0) {
                    pj0 pj0Var7 = qy0Var.f49308b;
                    if (pj0Var7 != null) {
                        pj0Var7.setAdapter(qy0Var.f49309c);
                        return;
                    }
                    return;
                } else if (qy0Var.f49308b != null) {
                    qy0Var.d.setVisibility(8);
                    qy0Var.f49308b.setAdapter(qy0Var.f49307a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((m31) obj).f47624f.I(editText.getText().toString());
                return;
            case 22:
                String obj13 = editText.getText().toString();
                r91 r91Var = ((v91) obj).f50656r0;
                if (!r91Var.f49398d0.equals(obj13)) {
                    r91Var.M(r91Var.f36906e[0], r91Var.getCurrentPosition(), obj13, false);
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
