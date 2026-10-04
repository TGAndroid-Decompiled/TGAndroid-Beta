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
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a91;
import org.telegram.ui.br0;
import org.telegram.ui.gd0;
import org.telegram.ui.nr;
import org.telegram.ui.nv;
import org.telegram.ui.r70;
import org.telegram.ui.rr;
import org.telegram.ui.s70;
import org.telegram.ui.sp;
import org.telegram.ui.tp;
import org.telegram.ui.tr;
import org.telegram.ui.uf1;
import org.telegram.ui.wb;
import org.telegram.ui.xh0;
import org.telegram.ui.xt;
import org.telegram.ui.y31;
import org.telegram.ui.yf1;
import org.telegram.ui.zc0;
import org.telegram.ui.zt;
public final class d2 extends f5 {
    public final int f11152f;
    public final Object h;

    public d2(Object obj, int i10) {
        this.f11152f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f11152f) {
            case 15:
                ((br0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f11152f) {
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    v0Var.f21576e.clearFocus();
                    AndroidUtilities.hideKeyboard(v0Var.f21576e);
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
        switch (this.f11152f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.f11178e = null;
                e2Var.f11175a.f25245f3.N(true);
                e2Var.f11175a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.f42042v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.U0(true);
                    return;
                }
                return;
            case 2:
                tp tpVar = (tp) this.h;
                tpVar.f40923e.F(null);
                tpVar.N = false;
                tpVar.getClass();
                tpVar.f40921b.setAdapter(tpVar.f40920a);
                tpVar.f40920a.l();
                tpVar.f40921b.setFastScrollVisible(true);
                tpVar.f40921b.setVerticalScrollBarEnabled(false);
                tpVar.d.setShowAtCenter(false);
                View view = tpVar.fragmentView;
                int i10 = i6.f20762a7;
                view.setBackgroundColor(i6.w0(null, i10, false));
                tpVar.fragmentView.setTag(Integer.valueOf(i10));
                tpVar.d.b();
                return;
            case 3:
                rr rrVar = (rr) this.h;
                rrVar.f40195e.F(null);
                rrVar.f40217o1 = false;
                ai.w0 w0Var = rrVar.f40190c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(rrVar.f40184a);
                rrVar.f40184a.l();
                rrVar.f40190c.setFastScrollVisible(true);
                rrVar.f40190c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = rrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                tr trVar = (tr) this.h;
                trVar.f40946n = null;
                w61 w61Var = trVar.f32725a;
                if (w61Var != null) {
                    w61Var.f25245f3.N(true);
                    return;
                }
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                if (j8Var.h) {
                    j8Var.f27630f = false;
                    j8Var.h = false;
                    j8Var.setAllowNestedScroll(true);
                    j8Var.f27645s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.f27636k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                rk rkVar = (rk) this.h;
                rkVar.f30427b0 = false;
                rkVar.G.setVisibility(0);
                gk gkVar = rkVar.f30433r;
                s4.h0 adapter = gkVar.getAdapter();
                kk kkVar = rkVar.v;
                if (adapter != kkVar) {
                    gkVar.setAdapter(kkVar);
                }
                kkVar.l();
                rkVar.f30437y.Y(null, true);
                return;
            case 7:
                jl jlVar = (jl) this.h;
                jlVar.f27815l0 = false;
                jlVar.m0 = false;
                jlVar.R.G(null, null);
                jlVar.f0();
                jlVar.P.setVisibility(0);
                jlVar.N.setVisibility(0);
                jlVar.Q.setVisibility(8);
                jlVar.v.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f33704r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33691f.setAdapter(contactsActivity.d);
                contactsActivity.f33691f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33691f.setFastScrollVisible(true);
                contactsActivity.f33691f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33691f.getFastScroll().f26500h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                zt ztVar = (zt) this.h;
                xt xtVar = ztVar.d;
                xtVar.getClass();
                xtVar.f42943e = null;
                ztVar.f43883f = false;
                ztVar.f43882e = false;
                ztVar.f43879a.setAdapter(ztVar.f43881c);
                ztVar.f43879a.setFastScrollVisible(true);
                return;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.f39046a.getActionBar().h(false);
                nvVar.f39047b.getActionBar().h(false);
                return;
            case 11:
                s70 s70Var = (s70) this.h;
                if (s70Var.M) {
                    r70.E(s70Var.f40379f, null);
                    s70Var.M = false;
                    s70Var.d.setAdapter(s70Var.f40378e);
                    return;
                }
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33762b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33762b.setAdapter(languageSelectActivity.f33761a);
                    return;
                }
                return;
            case 13:
                gd0 gd0Var = (gd0) this.h;
                gd0Var.f36585r0 = false;
                gd0Var.f36587s0 = false;
                gd0Var.W.G(null, null);
                gd0Var.B0();
                if (gd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = gd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    gd0Var.U.setVisibility(0);
                    gd0Var.S.setVisibility(0);
                    gd0Var.V.setAdapter(null);
                    gd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                qa0 qa0Var = ((xh0) this.h).f42889a;
                qa0Var.f49156y = false;
                qa0Var.j(null);
                return;
            case 15:
            case 16:
            default:
                return;
            case 17:
                y31 y31Var = (y31) this.h;
                y31Var.f43041f = null;
                if (y31Var.f43038b != null) {
                    y31Var.d.setVisibility(8);
                    y31Var.f43038b.setAdapter(y31Var.f43037a);
                    return;
                }
                return;
            case 18:
                a91 a91Var = (a91) this.h;
                a91Var.f34736a.a(false, true);
                a91Var.n0(false, true);
                a91Var.f34739c.f25245f3.N(false);
                return;
            case 19:
                yf1.b0((yf1) this.h, false);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f11152f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.f11175a.f25245f3.N(true);
                e2Var.f11175a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.I.setVisibility(8);
                wbVar.getClass();
                return;
            case 2:
                tp tpVar = (tp) this.h;
                tpVar.N = true;
                tpVar.d.setShowAtCenter(true);
                return;
            case 3:
                rr rrVar = (rr) this.h;
                rrVar.f40217o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = rrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                j8Var.f27646s0 = j8Var.f27643r.N0();
                View m10 = j8Var.f27643r.m(j8Var.f27646s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                j8Var.f27647t0 = top;
                j8Var.h = true;
                j8Var.setAllowNestedScroll(false);
                j8Var.f27645s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.f27636k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    return;
                }
                return;
            case 6:
                rk rkVar = (rk) this.h;
                rkVar.f30427b0 = true;
                rkVar.G.setVisibility(8);
                rkVar.f29643b.q1(rkVar.F.getSearchField(), true);
                return;
            case 7:
                jl jlVar = (jl) this.h;
                jlVar.f27815l0 = true;
                jlVar.f29643b.q1(jlVar.E.getSearchField(), true);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                ((zt) this.h).f43883f = true;
                return;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.f39046a.getActionBar().x("");
                nvVar.f39047b.getActionBar().x("");
                nvVar.f39048c.getSearchField().requestFocus();
                return;
            case 11:
                return;
            case 12:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 13:
                ((gd0) this.h).f36585r0 = true;
                return;
            case 14:
                ((xh0) this.h).f42889a.f49156y = true;
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f35176a.getActionBar().x("");
                br0Var.f35177b.getActionBar().x("");
                br0Var.f35178c.getSearchField().requestFocus();
                return;
            case 16:
            default:
                return;
            case 17:
                return;
            case 18:
                a91 a91Var = (a91) this.h;
                a91Var.f34736a.a(true, true);
                a91Var.f34741f.I("");
                a91Var.n0(false, true);
                a91Var.f34739c.f25245f3.N(false);
                return;
            case 19:
                yf1 yf1Var = (yf1) this.h;
                yf1.b0(yf1Var, true);
                uf1 uf1Var = yf1Var.f43198r0;
                if (!uf1Var.f41172c0.equals("")) {
                    uf1Var.M(uf1Var.f26733e[0], uf1Var.getCurrentPosition(), "", false);
                }
                yf1Var.f43198r0.setAlpha(0.0f);
                yf1Var.f43198r0.f41183o0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f11152f) {
            case 6:
                rk rkVar = (rk) this.h;
                qk qkVar = rkVar.f30437y;
                qkVar.R.remove(q0Var);
                qkVar.Y(rkVar.F.getSearchField().getText().toString(), false);
                qkVar.a0(null, null, true);
                return;
            case 19:
            default:
                return;
        }
    }

    @Override
    public void p(h2 h2Var) {
        switch (this.f11152f) {
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.U = true;
                wbVar.f42042v0 = h2Var.getText().toString();
                wbVar.U0(true);
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f35176a.getActionBar().w();
                br0Var.f35177b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        zl0 zl0Var;
        int h;
        ai.w0 w0Var;
        s4.h0 h0Var;
        switch (this.f11152f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.f11178e = editText.getText().toString();
                e2Var.f11175a.f25245f3.N(true);
                e2Var.f11175a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                tp tpVar = (tp) this.h;
                if (tpVar.f40923e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (zl0Var = tpVar.f40921b) != null) {
                        s4.h0 adapter = zl0Var.getAdapter();
                        sp spVar = tpVar.f40923e;
                        if (adapter != spVar) {
                            tpVar.f40921b.setAdapter(spVar);
                            View view = tpVar.fragmentView;
                            int i10 = i6.f20818d6;
                            view.setBackgroundColor(i6.w0(null, i10, false));
                            tpVar.fragmentView.setTag(Integer.valueOf(i10));
                            tpVar.f40923e.l();
                            tpVar.f40921b.setFastScrollVisible(false);
                            tpVar.f40921b.setVerticalScrollBarEnabled(true);
                            tpVar.d.b();
                        }
                    }
                    tpVar.f40923e.F(obj);
                    return;
                }
                return;
            case 3:
                rr rrVar = (rr) this.h;
                if (rrVar.f40195e != null) {
                    String obj2 = editText.getText().toString();
                    if (rrVar.f40190c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = rrVar.f40190c.getAdapter().h();
                    }
                    rrVar.f40195e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = rrVar.f40190c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        nr nrVar = rrVar.f40184a;
                        if (adapter2 != nrVar) {
                            ai.w0 w0Var2 = rrVar.f40190c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(nrVar);
                            if (h == 0) {
                                rrVar.y0(0);
                            }
                        }
                    }
                    rrVar.D1.setVisibility(8);
                    rrVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                tr trVar = (tr) this.h;
                trVar.f40946n = editText.getText().toString();
                w61 w61Var = trVar.f32725a;
                if (w61Var != null) {
                    w61Var.f25245f3.N(true);
                    return;
                }
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.f27645s.E(editText.getText().toString());
                    return;
                }
                j8Var.f27630f = false;
                j8Var.f27645s.E(null);
                return;
            case 6:
                ((rk) this.h).f30437y.Y(editText.getText().toString(), false);
                return;
            case 7:
                jl jlVar = (jl) this.h;
                ai.f0 f0Var = jlVar.N;
                ai.w0 w0Var3 = jlVar.P;
                zl0 zl0Var2 = jlVar.Q;
                dl dlVar = jlVar.R;
                if (dlVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        jlVar.m0 = true;
                        jlVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (zl0Var2.getAdapter() != dlVar) {
                            zl0Var2.setAdapter(dlVar);
                        }
                        zl0Var2.setVisibility(0);
                        if (dlVar.f10522s.size() == 0 && dlVar.f10521r.size() == 0) {
                            z10 = true;
                        }
                        jlVar.f27817n0 = z10;
                        jlVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        zl0Var2.setAdapter(null);
                        zl0Var2.setVisibility(8);
                        jlVar.v.setVisibility(8);
                    }
                    dlVar.G(obj3, jlVar.f27822r0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f33704r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33686c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33695i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        zl0 zl0Var3 = contactsActivity.f33691f;
                        if (zl0Var3 != null) {
                            zl0Var3.setAdapter(contactsActivity.f33704r);
                            contactsActivity.f33691f.setSectionsType(0);
                            contactsActivity.f33704r.l();
                            contactsActivity.f33691f.setFastScrollVisible(false);
                            contactsActivity.f33691f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f33689e.e(true, true);
                        contactsActivity.f33704r.G(obj4);
                        return;
                    }
                    zl0 zl0Var4 = contactsActivity.f33691f;
                    if (zl0Var4 != null) {
                        zl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33691f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                zt ztVar = (zt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    xt xtVar = ztVar.d;
                    xtVar.getClass();
                    xtVar.f42943e = null;
                    ztVar.f43882e = false;
                    ztVar.f43879a.setAdapter(ztVar.f43881c);
                    ztVar.f43879a.setFastScrollVisible(true);
                    return;
                }
                xt xtVar2 = ztVar.d;
                xtVar2.getClass();
                if (obj5 == null) {
                    xtVar2.f42943e = null;
                } else {
                    try {
                        Timer timer = xtVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Timer timer2 = new Timer();
                    xtVar2.d = timer2;
                    timer2.schedule(new gg.s1(xtVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    ztVar.f43882e = true;
                    return;
                }
                return;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.f39046a.getActionBar().setSearchFieldText(editText.getText().toString());
                nvVar.f39047b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                String obj6 = editText.getText().toString();
                s70 s70Var = (s70) this.h;
                r70.E(s70Var.f40379f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != s70Var.M) {
                    s70Var.M = z11;
                    zl0 zl0Var5 = s70Var.d;
                    if (zl0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = s70Var.f40379f;
                        } else {
                            h0Var = s70Var.f40378e;
                        }
                        zl0Var5.setAdapter(h0Var);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    zl0 zl0Var6 = languageSelectActivity.f33762b;
                    if (zl0Var6 != null) {
                        zl0Var6.setAdapter(languageSelectActivity.f33763c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33762b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33762b.setAdapter(languageSelectActivity.f33761a);
                    return;
                }
                return;
            case 13:
                gd0 gd0Var = (gd0) this.h;
                if (gd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        gd0Var.f36587s0 = true;
                        gd0Var.f36591w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = gd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        gd0Var.U.setVisibility(8);
                        gd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = gd0Var.V.getAdapter();
                        zc0 zc0Var = gd0Var.W;
                        if (adapter3 != zc0Var) {
                            gd0Var.V.setAdapter(zc0Var);
                        }
                        gd0Var.V.setVisibility(0);
                        if (gd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        gd0Var.f36588t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = gd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        gd0Var.U.setVisibility(0);
                        gd0Var.S.setVisibility(0);
                        gd0Var.V.setAdapter(null);
                        gd0Var.V.setVisibility(8);
                    }
                    gd0Var.B0();
                    gd0Var.W.G(obj8, gd0Var.f36594x0);
                    return;
                }
                return;
            case 14:
                ((xh0) this.h).f42889a.j(editText.getText().toString());
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f35176a.getActionBar().setSearchFieldText(editText.getText().toString());
                br0Var.f35177b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 16:
                ((ProfileActivity) this.h).f34232e.I(editText.getText().toString().toLowerCase());
                return;
            case 17:
                String obj9 = editText.getText().toString();
                y31 y31Var = (y31) this.h;
                if (obj9 == null) {
                    y31Var.f43041f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = y31Var.f43041f;
                    if (arrayList == null) {
                        y31Var.f43041f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < y31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) y31Var.h.get(i11);
                        if (language.f17278q.startsWith(lowerCase)) {
                            y31Var.f43041f.add(0, language);
                        } else if (language.f17278q.contains(lowerCase)) {
                            y31Var.f43041f.add(language);
                        }
                    }
                    y31Var.f43039c.l();
                }
                if (obj9.length() != 0) {
                    zl0 zl0Var7 = y31Var.f43038b;
                    if (zl0Var7 != null) {
                        zl0Var7.setAdapter(y31Var.f43039c);
                        return;
                    }
                    return;
                } else if (y31Var.f43038b != null) {
                    y31Var.d.setVisibility(8);
                    y31Var.f43038b.setAdapter(y31Var.f43037a);
                    return;
                } else {
                    return;
                }
            case 18:
                ((a91) this.h).f34741f.I(editText.getText().toString());
                return;
            case 19:
                String obj10 = editText.getText().toString();
                uf1 uf1Var = ((yf1) this.h).f43198r0;
                if (!uf1Var.f41172c0.equals(obj10)) {
                    uf1Var.M(uf1Var.f26733e[0], uf1Var.getCurrentPosition(), obj10, false);
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
