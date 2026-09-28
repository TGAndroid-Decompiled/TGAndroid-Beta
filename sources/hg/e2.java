package hg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import ci.h2;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.ih1;
import org.telegram.ui.jv;
import org.telegram.ui.lr;
import org.telegram.ui.n70;
import org.telegram.ui.o70;
import org.telegram.ui.pr;
import org.telegram.ui.qp;
import org.telegram.ui.rp;
import org.telegram.ui.sf1;
import org.telegram.ui.th0;
import org.telegram.ui.ub;
import org.telegram.ui.ut;
import org.telegram.ui.vc0;
import org.telegram.ui.w31;
import org.telegram.ui.wf1;
import org.telegram.ui.wt;
import org.telegram.ui.yq0;
import org.telegram.ui.z81;
public final class e2 extends e5 {
    public final int f10245f;
    public final Object h;

    public e2(Object obj, int i10) {
        this.f10245f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f10245f) {
            case 14:
                ((yq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f10245f) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                    u0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(u0Var.e);
                }
                if (profileActivity.W1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.W1);
            default:
                return super.h();
        }
    }

    @Override
    public void m() {
        switch (this.f10245f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = false;
                f2Var.e = null;
                f2Var.f10267a.Y2.N(true);
                f2Var.f10267a.u0(0);
                return;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.f38414v0 = "";
                ubVar.I.setVisibility(0);
                if (ubVar.U) {
                    ubVar.U = false;
                    ubVar.U0(true);
                    return;
                }
                return;
            case 2:
                rp rpVar = (rp) this.h;
                rpVar.e.F(null);
                rpVar.N = false;
                rpVar.getClass();
                rpVar.f37427b.setAdapter(rpVar.f37426a);
                rpVar.f37426a.l();
                rpVar.f37427b.setFastScrollVisible(true);
                rpVar.f37427b.setVerticalScrollBarEnabled(false);
                rpVar.d.setShowAtCenter(false);
                View view = rpVar.fragmentView;
                int i10 = h6.f19003a7;
                view.setBackgroundColor(h6.w0(null, i10, false));
                rpVar.fragmentView.setTag(Integer.valueOf(i10));
                rpVar.d.b();
                return;
            case 3:
                pr prVar = (pr) this.h;
                prVar.e.F(null);
                prVar.f36641o1 = false;
                ai.w0 w0Var = prVar.f36615c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(prVar.f36609a);
                prVar.f36609a.l();
                prVar.f36615c.setFastScrollVisible(true);
                prVar.f36615c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = prVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                if (j8Var.h) {
                    j8Var.f25336f = false;
                    j8Var.h = false;
                    j8Var.setAllowNestedScroll(true);
                    j8Var.f25351s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = j8Var.f25342k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                qk qkVar = (qk) this.h;
                qkVar.f27742b0 = false;
                qkVar.G.setVisibility(0);
                fk fkVar = qkVar.f27748r;
                s4.h0 adapter = fkVar.getAdapter();
                jk jkVar = qkVar.v;
                if (adapter != jkVar) {
                    fkVar.setAdapter(jkVar);
                }
                jkVar.l();
                qkVar.f27752y.Y(null, true);
                return;
            case 6:
                il ilVar = (il) this.h;
                ilVar.f25157l0 = false;
                ilVar.m0 = false;
                ilVar.R.G(null, null);
                ilVar.f0();
                ilVar.P.setVisibility(0);
                ilVar.N.setVisibility(0);
                ilVar.Q.setVisibility(8);
                ilVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f31041r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f31028f.setAdapter(contactsActivity.d);
                contactsActivity.f31028f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f31028f.setFastScrollVisible(true);
                contactsActivity.f31028f.setVerticalScrollBarEnabled(false);
                contactsActivity.f31028f.getFastScroll().f24279h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                wt wtVar = (wt) this.h;
                ut utVar = wtVar.d;
                utVar.getClass();
                utVar.e = null;
                wtVar.f39756f = false;
                wtVar.e = false;
                wtVar.f39753a.setAdapter(wtVar.f39755c);
                wtVar.f39753a.setFastScrollVisible(true);
                return;
            case 9:
                jv jvVar = (jv) this.h;
                jvVar.f34874a.getActionBar().h(false);
                jvVar.f34875b.getActionBar().h(false);
                return;
            case 10:
                o70 o70Var = (o70) this.h;
                if (o70Var.M) {
                    n70.E(o70Var.f36069f, null);
                    o70Var.M = false;
                    o70Var.d.setAdapter(o70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31095b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31095b.setAdapter(languageSelectActivity.f31094a);
                    return;
                }
                return;
            case 12:
                cd0 cd0Var = (cd0) this.h;
                cd0Var.f32677r0 = false;
                cd0Var.f32679s0 = false;
                cd0Var.W.G(null, null);
                cd0Var.B0();
                if (cd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = cd0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    cd0Var.U.setVisibility(0);
                    cd0Var.S.setVisibility(0);
                    cd0Var.V.setAdapter(null);
                    cd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                qa0 qa0Var = ((th0) this.h).f38123a;
                qa0Var.f45409y = false;
                qa0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                w31 w31Var = (w31) this.h;
                w31Var.f38888f = null;
                if (w31Var.f38886b != null) {
                    w31Var.d.setVisibility(8);
                    w31Var.f38886b.setAdapter(w31Var.f38885a);
                    return;
                }
                return;
            case 17:
                z81 z81Var = (z81) this.h;
                z81Var.f40408a.a(false, true);
                z81Var.o0(false, true);
                z81Var.f40412c.Y2.N(false);
                return;
            case 18:
                wf1.b0((wf1) this.h, false);
                return;
            case 19:
                ih1 ih1Var = (ih1) this.h;
                ih1Var.h = null;
                n61 n61Var = ih1Var.f26973a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f10245f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = true;
                f2Var.f10267a.Y2.N(true);
                f2Var.f10267a.u0(0);
                return;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.I.setVisibility(8);
                ubVar.getClass();
                return;
            case 2:
                rp rpVar = (rp) this.h;
                rpVar.N = true;
                rpVar.d.setShowAtCenter(true);
                return;
            case 3:
                pr prVar = (pr) this.h;
                prVar.f36641o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = prVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                j8Var.f25352s0 = j8Var.f25349r.N0();
                View m10 = j8Var.f25349r.m(j8Var.f25352s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                j8Var.f25353t0 = top;
                j8Var.h = true;
                j8Var.setAllowNestedScroll(false);
                j8Var.f25351s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = j8Var.f25342k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                qk qkVar = (qk) this.h;
                qkVar.f27742b0 = true;
                qkVar.G.setVisibility(8);
                qkVar.f27076b.t1(qkVar.F.getSearchField(), true);
                return;
            case 6:
                il ilVar = (il) this.h;
                ilVar.f25157l0 = true;
                ilVar.f27076b.t1(ilVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((wt) this.h).f39756f = true;
                return;
            case 9:
                jv jvVar = (jv) this.h;
                jvVar.f34874a.getActionBar().x("");
                jvVar.f34875b.getActionBar().x("");
                jvVar.f34876c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((cd0) this.h).f32677r0 = true;
                return;
            case 13:
                ((th0) this.h).f38123a.f45409y = true;
                return;
            case 14:
                yq0 yq0Var = (yq0) this.h;
                yq0Var.f40225a.getActionBar().x("");
                yq0Var.f40226b.getActionBar().x("");
                yq0Var.f40227c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                z81 z81Var = (z81) this.h;
                z81Var.f40408a.a(true, true);
                z81Var.h.I("");
                z81Var.o0(false, true);
                z81Var.f40412c.Y2.N(false);
                return;
            case 18:
                wf1 wf1Var = (wf1) this.h;
                wf1.b0(wf1Var, true);
                sf1 sf1Var = wf1Var.f39342r0;
                if (!sf1Var.f37736b0.equals("")) {
                    sf1Var.K(sf1Var.e[0], sf1Var.getCurrentPosition(), "", false);
                }
                wf1Var.f39342r0.setAlpha(0.0f);
                wf1Var.f39342r0.f37747n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f10245f) {
            case 5:
                qk qkVar = (qk) this.h;
                pk pkVar = qkVar.f27752y;
                pkVar.R.remove(q0Var);
                pkVar.Y(qkVar.F.getSearchField().getText().toString(), false);
                pkVar.a0(null, null, true);
                return;
            case 18:
            default:
                return;
        }
    }

    @Override
    public void p(h2 h2Var) {
        switch (this.f10245f) {
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.U = true;
                ubVar.f38414v0 = h2Var.getText().toString();
                ubVar.U0(true);
                return;
            case 14:
                yq0 yq0Var = (yq0) this.h;
                yq0Var.f40225a.getActionBar().w();
                yq0Var.f40226b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        yl0 yl0Var;
        int h;
        ai.w0 w0Var;
        s4.h0 h0Var;
        switch (this.f10245f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.e = editText.getText().toString();
                f2Var.f10267a.Y2.N(true);
                f2Var.f10267a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                rp rpVar = (rp) this.h;
                if (rpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (yl0Var = rpVar.f37427b) != null) {
                        s4.h0 adapter = yl0Var.getAdapter();
                        qp qpVar = rpVar.e;
                        if (adapter != qpVar) {
                            rpVar.f37427b.setAdapter(qpVar);
                            View view = rpVar.fragmentView;
                            int i10 = h6.f19059d6;
                            view.setBackgroundColor(h6.w0(null, i10, false));
                            rpVar.fragmentView.setTag(Integer.valueOf(i10));
                            rpVar.e.l();
                            rpVar.f37427b.setFastScrollVisible(false);
                            rpVar.f37427b.setVerticalScrollBarEnabled(true);
                            rpVar.d.b();
                        }
                    }
                    rpVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                pr prVar = (pr) this.h;
                if (prVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (prVar.f36615c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = prVar.f36615c.getAdapter().h();
                    }
                    prVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = prVar.f36615c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        lr lrVar = prVar.f36609a;
                        if (adapter2 != lrVar) {
                            ai.w0 w0Var2 = prVar.f36615c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(lrVar);
                            if (h == 0) {
                                prVar.y0(0);
                            }
                        }
                    }
                    prVar.D1.setVisibility(8);
                    prVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.f25351s.E(editText.getText().toString());
                    return;
                }
                j8Var.f25336f = false;
                j8Var.f25351s.E(null);
                return;
            case 5:
                ((qk) this.h).f27752y.Y(editText.getText().toString(), false);
                return;
            case 6:
                il ilVar = (il) this.h;
                ai.f0 f0Var = ilVar.N;
                ai.w0 w0Var3 = ilVar.P;
                yl0 yl0Var2 = ilVar.Q;
                cl clVar = ilVar.R;
                if (clVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        ilVar.m0 = true;
                        ilVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (yl0Var2.getAdapter() != clVar) {
                            yl0Var2.setAdapter(clVar);
                        }
                        yl0Var2.setVisibility(0);
                        if (clVar.f9663s.size() == 0 && clVar.f9662r.size() == 0) {
                            z10 = true;
                        }
                        ilVar.f25159n0 = z10;
                        ilVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        yl0Var2.setAdapter(null);
                        yl0Var2.setVisibility(8);
                        ilVar.v.setVisibility(8);
                    }
                    clVar.G(obj3, ilVar.f25164r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f31041r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f31024c.a(!obj4.isEmpty(), true);
                    contactsActivity.f31032i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        yl0 yl0Var3 = contactsActivity.f31028f;
                        if (yl0Var3 != null) {
                            yl0Var3.setAdapter(contactsActivity.f31041r);
                            contactsActivity.f31028f.setSectionsType(0);
                            contactsActivity.f31041r.l();
                            contactsActivity.f31028f.setFastScrollVisible(false);
                            contactsActivity.f31028f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f31041r.G(obj4);
                        return;
                    }
                    yl0 yl0Var4 = contactsActivity.f31028f;
                    if (yl0Var4 != null) {
                        yl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f31028f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                wt wtVar = (wt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    ut utVar = wtVar.d;
                    utVar.getClass();
                    utVar.e = null;
                    wtVar.e = false;
                    wtVar.f39753a.setAdapter(wtVar.f39755c);
                    wtVar.f39753a.setFastScrollVisible(true);
                    return;
                }
                ut utVar2 = wtVar.d;
                utVar2.getClass();
                if (obj5 == null) {
                    utVar2.e = null;
                } else {
                    try {
                        Timer timer = utVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    utVar2.d = timer2;
                    timer2.schedule(new gg.s1(utVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    wtVar.e = true;
                    return;
                }
                return;
            case 9:
                jv jvVar = (jv) this.h;
                jvVar.f34874a.getActionBar().setSearchFieldText(editText.getText().toString());
                jvVar.f34875b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                o70 o70Var = (o70) this.h;
                n70.E(o70Var.f36069f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != o70Var.M) {
                    o70Var.M = z11;
                    yl0 yl0Var5 = o70Var.d;
                    if (yl0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = o70Var.f36069f;
                        } else {
                            h0Var = o70Var.e;
                        }
                        yl0Var5.setAdapter(h0Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    yl0 yl0Var6 = languageSelectActivity.f31095b;
                    if (yl0Var6 != null) {
                        yl0Var6.setAdapter(languageSelectActivity.f31096c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31095b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31095b.setAdapter(languageSelectActivity.f31094a);
                    return;
                }
                return;
            case 12:
                cd0 cd0Var = (cd0) this.h;
                if (cd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        cd0Var.f32679s0 = true;
                        cd0Var.f32683w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = cd0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        cd0Var.U.setVisibility(8);
                        cd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = cd0Var.V.getAdapter();
                        vc0 vc0Var = cd0Var.W;
                        if (adapter3 != vc0Var) {
                            cd0Var.V.setAdapter(vc0Var);
                        }
                        cd0Var.V.setVisibility(0);
                        if (cd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        cd0Var.f32680t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = cd0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        cd0Var.U.setVisibility(0);
                        cd0Var.S.setVisibility(0);
                        cd0Var.V.setAdapter(null);
                        cd0Var.V.setVisibility(8);
                    }
                    cd0Var.B0();
                    cd0Var.W.G(obj8, cd0Var.f32686x0);
                    return;
                }
                return;
            case 13:
                ((th0) this.h).f38123a.j(editText.getText().toString());
                return;
            case 14:
                yq0 yq0Var = (yq0) this.h;
                yq0Var.f40225a.getActionBar().setSearchFieldText(editText.getText().toString());
                yq0Var.f40226b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                w31 w31Var = (w31) this.h;
                if (obj9 == null) {
                    w31Var.f38888f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = w31Var.f38888f;
                    if (arrayList == null) {
                        w31Var.f38888f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < w31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) w31Var.h.get(i11);
                        if (language.f15853q.startsWith(lowerCase)) {
                            w31Var.f38888f.add(0, language);
                        } else if (language.f15853q.contains(lowerCase)) {
                            w31Var.f38888f.add(language);
                        }
                    }
                    w31Var.f38887c.l();
                }
                if (obj9.length() != 0) {
                    yl0 yl0Var7 = w31Var.f38886b;
                    if (yl0Var7 != null) {
                        yl0Var7.setAdapter(w31Var.f38887c);
                        return;
                    }
                    return;
                } else if (w31Var.f38886b != null) {
                    w31Var.d.setVisibility(8);
                    w31Var.f38886b.setAdapter(w31Var.f38885a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((z81) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                sf1 sf1Var = ((wf1) this.h).f39342r0;
                if (!sf1Var.f37736b0.equals(obj10)) {
                    sf1Var.K(sf1Var.e[0], sf1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                ih1 ih1Var = (ih1) this.h;
                ih1Var.h = editText.getText().toString();
                n61 n61Var = ih1Var.f26973a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w(gg.q0 q0Var) {
    }
}
