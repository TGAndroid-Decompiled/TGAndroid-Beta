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
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.br0;
import org.telegram.ui.gd0;
import org.telegram.ui.nr;
import org.telegram.ui.nv;
import org.telegram.ui.r70;
import org.telegram.ui.rr;
import org.telegram.ui.s70;
import org.telegram.ui.sf1;
import org.telegram.ui.sp;
import org.telegram.ui.tp;
import org.telegram.ui.tr;
import org.telegram.ui.w31;
import org.telegram.ui.wb;
import org.telegram.ui.wf1;
import org.telegram.ui.xh0;
import org.telegram.ui.xt;
import org.telegram.ui.y81;
import org.telegram.ui.zc0;
import org.telegram.ui.zt;
public final class d2 extends f5 {
    public final int f11150f;
    public final Object h;

    public d2(Object obj, int i10) {
        this.f11150f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f11150f) {
            case 15:
                ((br0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f11150f) {
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    v0Var.f21584e.clearFocus();
                    AndroidUtilities.hideKeyboard(v0Var.f21584e);
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
        switch (this.f11150f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.f11168e = null;
                e2Var.f11165a.f26034f3.N(true);
                e2Var.f11165a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.f42064v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.U0(true);
                    return;
                }
                return;
            case 2:
                tp tpVar = (tp) this.h;
                tpVar.f40985e.F(null);
                tpVar.N = false;
                tpVar.getClass();
                tpVar.f40983b.setAdapter(tpVar.f40982a);
                tpVar.f40982a.l();
                tpVar.f40983b.setFastScrollVisible(true);
                tpVar.f40983b.setVerticalScrollBarEnabled(false);
                tpVar.d.setShowAtCenter(false);
                tpVar.d.b();
                return;
            case 3:
                rr rrVar = (rr) this.h;
                rrVar.f40175e.F(null);
                rrVar.f40197o1 = false;
                ai.w0 w0Var = rrVar.f40170c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(rrVar.f40164a);
                rrVar.f40164a.l();
                rrVar.f40170c.setFastScrollVisible(true);
                rrVar.f40170c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = rrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                tr trVar = (tr) this.h;
                trVar.f41008n = null;
                y61 y61Var = trVar.f33438a;
                if (y61Var != null) {
                    y61Var.f26034f3.N(true);
                    return;
                }
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                if (j8Var.h) {
                    j8Var.f27708f = false;
                    j8Var.h = false;
                    j8Var.setAllowNestedScroll(true);
                    j8Var.f27723s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.f27714k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                rk rkVar = (rk) this.h;
                rkVar.f30515b0 = false;
                rkVar.G.setVisibility(0);
                gk gkVar = rkVar.f30521r;
                s4.h0 adapter = gkVar.getAdapter();
                kk kkVar = rkVar.v;
                if (adapter != kkVar) {
                    gkVar.setAdapter(kkVar);
                }
                kkVar.l();
                rkVar.f30525y.Y(null, true);
                return;
            case 7:
                jl jlVar = (jl) this.h;
                jlVar.f27887l0 = false;
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
                contactsActivity.f33723r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33710f.setAdapter(contactsActivity.d);
                contactsActivity.f33710f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33710f.setFastScrollVisible(true);
                contactsActivity.f33710f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33710f.getFastScroll().f26512h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                zt ztVar = (zt) this.h;
                xt xtVar = ztVar.d;
                xtVar.getClass();
                xtVar.f43012e = null;
                ztVar.f43897f = false;
                ztVar.f43896e = false;
                ztVar.f43893a.setAdapter(ztVar.f43895c);
                ztVar.f43893a.setFastScrollVisible(true);
                return;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.f39040a.getActionBar().h(false);
                nvVar.f39041b.getActionBar().h(false);
                return;
            case 11:
                s70 s70Var = (s70) this.h;
                if (s70Var.M) {
                    r70.E(s70Var.f40364f, null);
                    s70Var.M = false;
                    s70Var.d.setAdapter(s70Var.f40363e);
                    return;
                }
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33781b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33781b.setAdapter(languageSelectActivity.f33780a);
                    return;
                }
                return;
            case 13:
                gd0 gd0Var = (gd0) this.h;
                gd0Var.f36624r0 = false;
                gd0Var.f36626s0 = false;
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
                qa0 qa0Var = ((xh0) this.h).f42946a;
                qa0Var.f49171y = false;
                qa0Var.j(null);
                return;
            case 15:
            case 16:
            default:
                return;
            case 17:
                w31 w31Var = (w31) this.h;
                w31Var.f41909f = null;
                if (w31Var.f41906b != null) {
                    w31Var.d.setVisibility(8);
                    w31Var.f41906b.setAdapter(w31Var.f41905a);
                    return;
                }
                return;
            case 18:
                y81 y81Var = (y81) this.h;
                y81Var.f43138a.a(false, true);
                y81Var.m0(false, true);
                y81Var.f43140c.f26034f3.N(false);
                return;
            case 19:
                wf1.b0((wf1) this.h, false);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f11150f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.f11165a.f26034f3.N(true);
                e2Var.f11165a.v0(0);
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
                rrVar.f40197o1 = true;
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
                j8Var.f27724s0 = j8Var.f27721r.N0();
                View m10 = j8Var.f27721r.m(j8Var.f27724s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                j8Var.f27725t0 = top;
                j8Var.h = true;
                j8Var.setAllowNestedScroll(false);
                j8Var.f27723s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.f27714k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    return;
                }
                return;
            case 6:
                rk rkVar = (rk) this.h;
                rkVar.f30515b0 = true;
                rkVar.G.setVisibility(8);
                rkVar.f29741b.s1(rkVar.F.getSearchField(), true);
                return;
            case 7:
                jl jlVar = (jl) this.h;
                jlVar.f27887l0 = true;
                jlVar.f29741b.s1(jlVar.E.getSearchField(), true);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                ((zt) this.h).f43897f = true;
                return;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.f39040a.getActionBar().x("");
                nvVar.f39041b.getActionBar().x("");
                nvVar.f39042c.getSearchField().requestFocus();
                return;
            case 11:
                return;
            case 12:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 13:
                ((gd0) this.h).f36624r0 = true;
                return;
            case 14:
                ((xh0) this.h).f42946a.f49171y = true;
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f35205a.getActionBar().x("");
                br0Var.f35206b.getActionBar().x("");
                br0Var.f35207c.getSearchField().requestFocus();
                return;
            case 16:
            default:
                return;
            case 17:
                return;
            case 18:
                y81 y81Var = (y81) this.h;
                y81Var.f43138a.a(true, true);
                y81Var.f43142f.I("");
                y81Var.m0(false, true);
                y81Var.f43140c.f26034f3.N(false);
                return;
            case 19:
                wf1 wf1Var = (wf1) this.h;
                wf1.b0(wf1Var, true);
                sf1 sf1Var = wf1Var.f42502r0;
                if (!sf1Var.f40472d0.equals("")) {
                    sf1Var.M(sf1Var.f27168e[0], sf1Var.getCurrentPosition(), "", false);
                }
                wf1Var.f42502r0.setAlpha(0.0f);
                wf1Var.f42502r0.f40483p0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f11150f) {
            case 6:
                rk rkVar = (rk) this.h;
                qk qkVar = rkVar.f30525y;
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
        switch (this.f11150f) {
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.U = true;
                wbVar.f42064v0 = h2Var.getText().toString();
                wbVar.U0(true);
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f35205a.getActionBar().w();
                br0Var.f35206b.getActionBar().w();
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
        switch (this.f11150f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.f11168e = editText.getText().toString();
                e2Var.f11165a.f26034f3.N(true);
                e2Var.f11165a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                tp tpVar = (tp) this.h;
                if (tpVar.f40985e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (zl0Var = tpVar.f40983b) != null) {
                        s4.h0 adapter = zl0Var.getAdapter();
                        sp spVar = tpVar.f40985e;
                        if (adapter != spVar) {
                            tpVar.f40983b.setAdapter(spVar);
                            tpVar.f40985e.l();
                            tpVar.f40983b.setFastScrollVisible(false);
                            tpVar.f40983b.setVerticalScrollBarEnabled(true);
                            tpVar.d.b();
                        }
                    }
                    tpVar.f40985e.F(obj);
                    return;
                }
                return;
            case 3:
                rr rrVar = (rr) this.h;
                if (rrVar.f40175e != null) {
                    String obj2 = editText.getText().toString();
                    if (rrVar.f40170c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = rrVar.f40170c.getAdapter().h();
                    }
                    rrVar.f40175e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = rrVar.f40170c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        nr nrVar = rrVar.f40164a;
                        if (adapter2 != nrVar) {
                            ai.w0 w0Var2 = rrVar.f40170c;
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
                trVar.f41008n = editText.getText().toString();
                y61 y61Var = trVar.f33438a;
                if (y61Var != null) {
                    y61Var.f26034f3.N(true);
                    return;
                }
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.f27723s.E(editText.getText().toString());
                    return;
                }
                j8Var.f27708f = false;
                j8Var.f27723s.E(null);
                return;
            case 6:
                ((rk) this.h).f30525y.Y(editText.getText().toString(), false);
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
                        if (dlVar.f10523s.size() == 0 && dlVar.f10522r.size() == 0) {
                            z10 = true;
                        }
                        jlVar.f27889n0 = z10;
                        jlVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        zl0Var2.setAdapter(null);
                        zl0Var2.setVisibility(8);
                        jlVar.v.setVisibility(8);
                    }
                    dlVar.G(obj3, jlVar.f27894r0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f33723r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33705c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33714i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        zl0 zl0Var3 = contactsActivity.f33710f;
                        if (zl0Var3 != null) {
                            zl0Var3.setAdapter(contactsActivity.f33723r);
                            contactsActivity.f33710f.setSectionsType(0);
                            contactsActivity.f33723r.l();
                            contactsActivity.f33710f.setFastScrollVisible(false);
                            contactsActivity.f33710f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f33708e.e(true, true);
                        contactsActivity.f33723r.G(obj4);
                        return;
                    }
                    zl0 zl0Var4 = contactsActivity.f33710f;
                    if (zl0Var4 != null) {
                        zl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33710f.setSectionsType(1);
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
                    xtVar.f43012e = null;
                    ztVar.f43896e = false;
                    ztVar.f43893a.setAdapter(ztVar.f43895c);
                    ztVar.f43893a.setFastScrollVisible(true);
                    return;
                }
                xt xtVar2 = ztVar.d;
                xtVar2.getClass();
                if (obj5 == null) {
                    xtVar2.f43012e = null;
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
                    ztVar.f43896e = true;
                    return;
                }
                return;
            case 10:
                nv nvVar = (nv) this.h;
                nvVar.f39040a.getActionBar().setSearchFieldText(editText.getText().toString());
                nvVar.f39041b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                String obj6 = editText.getText().toString();
                s70 s70Var = (s70) this.h;
                r70.E(s70Var.f40364f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != s70Var.M) {
                    s70Var.M = z11;
                    zl0 zl0Var5 = s70Var.d;
                    if (zl0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = s70Var.f40364f;
                        } else {
                            h0Var = s70Var.f40363e;
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
                    zl0 zl0Var6 = languageSelectActivity.f33781b;
                    if (zl0Var6 != null) {
                        zl0Var6.setAdapter(languageSelectActivity.f33782c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33781b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33781b.setAdapter(languageSelectActivity.f33780a);
                    return;
                }
                return;
            case 13:
                gd0 gd0Var = (gd0) this.h;
                if (gd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        gd0Var.f36626s0 = true;
                        gd0Var.f36630w.setShowSearchProgress(true);
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
                        gd0Var.f36627t0 = z12;
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
                    gd0Var.W.G(obj8, gd0Var.f36633x0);
                    return;
                }
                return;
            case 14:
                ((xh0) this.h).f42946a.j(editText.getText().toString());
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f35205a.getActionBar().setSearchFieldText(editText.getText().toString());
                br0Var.f35206b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 16:
                ((ProfileActivity) this.h).f34251e.I(editText.getText().toString().toLowerCase());
                return;
            case 17:
                String obj9 = editText.getText().toString();
                w31 w31Var = (w31) this.h;
                if (obj9 == null) {
                    w31Var.f41909f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = w31Var.f41909f;
                    if (arrayList == null) {
                        w31Var.f41909f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < w31Var.h.size(); i10++) {
                        TranslateController.Language language = (TranslateController.Language) w31Var.h.get(i10);
                        if (language.f17287q.startsWith(lowerCase)) {
                            w31Var.f41909f.add(0, language);
                        } else if (language.f17287q.contains(lowerCase)) {
                            w31Var.f41909f.add(language);
                        }
                    }
                    w31Var.f41907c.l();
                }
                if (obj9.length() != 0) {
                    zl0 zl0Var7 = w31Var.f41906b;
                    if (zl0Var7 != null) {
                        zl0Var7.setAdapter(w31Var.f41907c);
                        return;
                    }
                    return;
                } else if (w31Var.f41906b != null) {
                    w31Var.d.setVisibility(8);
                    w31Var.f41906b.setAdapter(w31Var.f41905a);
                    return;
                } else {
                    return;
                }
            case 18:
                ((y81) this.h).f43142f.I(editText.getText().toString());
                return;
            case 19:
                String obj10 = editText.getText().toString();
                sf1 sf1Var = ((wf1) this.h).f42502r0;
                if (!sf1Var.f40472d0.equals(obj10)) {
                    sf1Var.M(sf1Var.f27168e[0], sf1Var.getCurrentPosition(), obj10, false);
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
