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
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bg1;
import org.telegram.ui.bi0;
import org.telegram.ui.bu;
import org.telegram.ui.dd0;
import org.telegram.ui.f41;
import org.telegram.ui.fg1;
import org.telegram.ui.hr0;
import org.telegram.ui.i91;
import org.telegram.ui.kd0;
import org.telegram.ui.or;
import org.telegram.ui.ov;
import org.telegram.ui.s70;
import org.telegram.ui.sr;
import org.telegram.ui.t70;
import org.telegram.ui.tp;
import org.telegram.ui.up;
import org.telegram.ui.ur;
import org.telegram.ui.vb;
import org.telegram.ui.zt;
public final class d2 extends g5 {
    public final int f10256f;
    public final Object h;

    public d2(Object obj, int i10) {
        this.f10256f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f10256f) {
            case 15:
                ((hr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f10256f) {
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    v0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(v0Var.e);
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
        switch (this.f10256f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.e = null;
                e2Var.f10277a.Y2.N(true);
                e2Var.f10277a.v0(0);
                return;
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.f38499v0 = "";
                vbVar.I.setVisibility(0);
                if (vbVar.U) {
                    vbVar.U = false;
                    vbVar.U0(true);
                    return;
                }
                return;
            case 2:
                up upVar = (up) this.h;
                upVar.e.F(null);
                upVar.N = false;
                upVar.getClass();
                upVar.f38180b.setAdapter(upVar.f38179a);
                upVar.f38179a.l();
                upVar.f38180b.setFastScrollVisible(true);
                upVar.f38180b.setVerticalScrollBarEnabled(false);
                upVar.d.setShowAtCenter(false);
                View view = upVar.fragmentView;
                int i10 = j6.f19038a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                upVar.fragmentView.setTag(Integer.valueOf(i10));
                upVar.d.b();
                return;
            case 3:
                sr srVar = (sr) this.h;
                srVar.e.F(null);
                srVar.f37479o1 = false;
                ai.w0 w0Var = srVar.f37453c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(srVar.f37447a);
                srVar.f37447a.l();
                srVar.f37453c.setFastScrollVisible(true);
                srVar.f37453c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = srVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                ur urVar = (ur) this.h;
                urVar.f38200n = null;
                m61 m61Var = urVar.f26598a;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                i8 i8Var = (i8) this.h;
                if (i8Var.h) {
                    i8Var.f24916f = false;
                    i8Var.h = false;
                    i8Var.setAllowNestedScroll(true);
                    i8Var.f24931s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = i8Var.f24922k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) this.h;
                okVar.f26959b0 = false;
                okVar.G.setVisibility(0);
                dk dkVar = okVar.f26965r;
                s4.h0 adapter = dkVar.getAdapter();
                hk hkVar = okVar.v;
                if (adapter != hkVar) {
                    dkVar.setAdapter(hkVar);
                }
                hkVar.l();
                okVar.f26969y.Y(null, true);
                return;
            case 7:
                gl glVar = (gl) this.h;
                glVar.f24395l0 = false;
                glVar.m0 = false;
                glVar.R.G(null, null);
                glVar.f0();
                glVar.P.setVisibility(0);
                glVar.N.setVisibility(0);
                glVar.Q.setVisibility(8);
                glVar.v.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f31039r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f31026f.setAdapter(contactsActivity.d);
                contactsActivity.f31026f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f31026f.setFastScrollVisible(true);
                contactsActivity.f31026f.setVerticalScrollBarEnabled(false);
                contactsActivity.f31026f.getFastScroll().f23333h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                bu buVar = (bu) this.h;
                zt ztVar = buVar.d;
                ztVar.getClass();
                ztVar.e = null;
                buVar.f32542f = false;
                buVar.e = false;
                buVar.f32539a.setAdapter(buVar.f32541c);
                buVar.f32539a.setFastScrollVisible(true);
                return;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.f36383a.getActionBar().h(false);
                ovVar.f36384b.getActionBar().h(false);
                return;
            case 11:
                t70 t70Var = (t70) this.h;
                if (t70Var.M) {
                    s70.E(t70Var.f37658f, null);
                    t70Var.M = false;
                    t70Var.d.setAdapter(t70Var.e);
                    return;
                }
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31093b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31093b.setAdapter(languageSelectActivity.f31092a);
                    return;
                }
                return;
            case 13:
                kd0 kd0Var = (kd0) this.h;
                kd0Var.f35115r0 = false;
                kd0Var.f35117s0 = false;
                kd0Var.W.G(null, null);
                kd0Var.B0();
                if (kd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = kd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    kd0Var.U.setVisibility(0);
                    kd0Var.S.setVisibility(0);
                    kd0Var.V.setAdapter(null);
                    kd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ka0 ka0Var = ((bi0) this.h).f32469a;
                ka0Var.f45426y = false;
                ka0Var.j(null);
                return;
            case 15:
            case 16:
            default:
                return;
            case 17:
                f41 f41Var = (f41) this.h;
                f41Var.f33490f = null;
                if (f41Var.f33488b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.f33488b.setAdapter(f41Var.f33487a);
                    return;
                }
                return;
            case 18:
                i91 i91Var = (i91) this.h;
                i91Var.f34502a.a(false, true);
                i91Var.o0(false, true);
                i91Var.f34506c.Y2.N(false);
                return;
            case 19:
                fg1.b0((fg1) this.h, false);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f10256f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.f10277a.Y2.N(true);
                e2Var.f10277a.v0(0);
                return;
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.I.setVisibility(8);
                vbVar.getClass();
                return;
            case 2:
                up upVar = (up) this.h;
                upVar.N = true;
                upVar.d.setShowAtCenter(true);
                return;
            case 3:
                sr srVar = (sr) this.h;
                srVar.f37479o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = srVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                i8 i8Var = (i8) this.h;
                i8Var.f24932s0 = i8Var.f24929r.N0();
                View m10 = i8Var.f24929r.m(i8Var.f24932s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                i8Var.f24933t0 = top;
                i8Var.h = true;
                i8Var.setAllowNestedScroll(false);
                i8Var.f24931s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = i8Var.f24922k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) this.h;
                okVar.f26959b0 = true;
                okVar.G.setVisibility(8);
                okVar.f26655b.t1(okVar.F.getSearchField(), true);
                return;
            case 7:
                gl glVar = (gl) this.h;
                glVar.f24395l0 = true;
                glVar.f26655b.t1(glVar.E.getSearchField(), true);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                ((bu) this.h).f32542f = true;
                return;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.f36383a.getActionBar().x("");
                ovVar.f36384b.getActionBar().x("");
                ovVar.f36385c.getSearchField().requestFocus();
                return;
            case 11:
                return;
            case 12:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 13:
                ((kd0) this.h).f35115r0 = true;
                return;
            case 14:
                ((bi0) this.h).f32469a.f45426y = true;
                return;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.f34263a.getActionBar().x("");
                hr0Var.f34264b.getActionBar().x("");
                hr0Var.f34265c.getSearchField().requestFocus();
                return;
            case 16:
            default:
                return;
            case 17:
                return;
            case 18:
                i91 i91Var = (i91) this.h;
                i91Var.f34502a.a(true, true);
                i91Var.h.I("");
                i91Var.o0(false, true);
                i91Var.f34506c.Y2.N(false);
                return;
            case 19:
                fg1 fg1Var = (fg1) this.h;
                fg1.b0(fg1Var, true);
                bg1 bg1Var = fg1Var.f33630r0;
                if (!bg1Var.f32442c0.equals("")) {
                    bg1Var.L(bg1Var.e[0], bg1Var.getCurrentPosition(), "", false);
                }
                fg1Var.f33630r0.setAlpha(0.0f);
                fg1Var.f33630r0.f32453o0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f10256f) {
            case 6:
                ok okVar = (ok) this.h;
                nk nkVar = okVar.f26969y;
                nkVar.R.remove(q0Var);
                nkVar.Y(okVar.F.getSearchField().getText().toString(), false);
                nkVar.a0(null, null, true);
                return;
            case 19:
            default:
                return;
        }
    }

    @Override
    public void p(h2 h2Var) {
        switch (this.f10256f) {
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.U = true;
                vbVar.f38499v0 = h2Var.getText().toString();
                vbVar.U0(true);
                return;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.f34263a.getActionBar().w();
                hr0Var.f34264b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        vl0 vl0Var;
        int h;
        ai.w0 w0Var;
        s4.h0 h0Var;
        switch (this.f10256f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.f10277a.Y2.N(true);
                e2Var.f10277a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                up upVar = (up) this.h;
                if (upVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (vl0Var = upVar.f38180b) != null) {
                        s4.h0 adapter = vl0Var.getAdapter();
                        tp tpVar = upVar.e;
                        if (adapter != tpVar) {
                            upVar.f38180b.setAdapter(tpVar);
                            View view = upVar.fragmentView;
                            int i10 = j6.f19094d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
                            upVar.fragmentView.setTag(Integer.valueOf(i10));
                            upVar.e.l();
                            upVar.f38180b.setFastScrollVisible(false);
                            upVar.f38180b.setVerticalScrollBarEnabled(true);
                            upVar.d.b();
                        }
                    }
                    upVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                sr srVar = (sr) this.h;
                if (srVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (srVar.f37453c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = srVar.f37453c.getAdapter().h();
                    }
                    srVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = srVar.f37453c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        or orVar = srVar.f37447a;
                        if (adapter2 != orVar) {
                            ai.w0 w0Var2 = srVar.f37453c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(orVar);
                            if (h == 0) {
                                srVar.y0(0);
                            }
                        }
                    }
                    srVar.D1.setVisibility(8);
                    srVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                ur urVar = (ur) this.h;
                urVar.f38200n = editText.getText().toString();
                m61 m61Var = urVar.f26598a;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                i8 i8Var = (i8) this.h;
                if (editText.length() > 0) {
                    i8Var.f24931s.E(editText.getText().toString());
                    return;
                }
                i8Var.f24916f = false;
                i8Var.f24931s.E(null);
                return;
            case 6:
                ((ok) this.h).f26969y.Y(editText.getText().toString(), false);
                return;
            case 7:
                gl glVar = (gl) this.h;
                ai.f0 f0Var = glVar.N;
                ai.w0 w0Var3 = glVar.P;
                vl0 vl0Var2 = glVar.Q;
                al alVar = glVar.R;
                if (alVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        glVar.m0 = true;
                        glVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (vl0Var2.getAdapter() != alVar) {
                            vl0Var2.setAdapter(alVar);
                        }
                        vl0Var2.setVisibility(0);
                        if (alVar.f9682s.size() == 0 && alVar.f9681r.size() == 0) {
                            z10 = true;
                        }
                        glVar.f24397n0 = z10;
                        glVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        vl0Var2.setAdapter(null);
                        vl0Var2.setVisibility(8);
                        glVar.v.setVisibility(8);
                    }
                    alVar.G(obj3, glVar.f24402r0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f31039r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f31022c.a(!obj4.isEmpty(), true);
                    contactsActivity.f31030i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        vl0 vl0Var3 = contactsActivity.f31026f;
                        if (vl0Var3 != null) {
                            vl0Var3.setAdapter(contactsActivity.f31039r);
                            contactsActivity.f31026f.setSectionsType(0);
                            contactsActivity.f31039r.l();
                            contactsActivity.f31026f.setFastScrollVisible(false);
                            contactsActivity.f31026f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f31039r.G(obj4);
                        return;
                    }
                    vl0 vl0Var4 = contactsActivity.f31026f;
                    if (vl0Var4 != null) {
                        vl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f31026f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                bu buVar = (bu) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    zt ztVar = buVar.d;
                    ztVar.getClass();
                    ztVar.e = null;
                    buVar.e = false;
                    buVar.f32539a.setAdapter(buVar.f32541c);
                    buVar.f32539a.setFastScrollVisible(true);
                    return;
                }
                zt ztVar2 = buVar.d;
                ztVar2.getClass();
                if (obj5 == null) {
                    ztVar2.e = null;
                } else {
                    try {
                        Timer timer = ztVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    ztVar2.d = timer2;
                    timer2.schedule(new gg.s1(ztVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    buVar.e = true;
                    return;
                }
                return;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.f36383a.getActionBar().setSearchFieldText(editText.getText().toString());
                ovVar.f36384b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                String obj6 = editText.getText().toString();
                t70 t70Var = (t70) this.h;
                s70.E(t70Var.f37658f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != t70Var.M) {
                    t70Var.M = z11;
                    vl0 vl0Var5 = t70Var.d;
                    if (vl0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = t70Var.f37658f;
                        } else {
                            h0Var = t70Var.e;
                        }
                        vl0Var5.setAdapter(h0Var);
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
                    vl0 vl0Var6 = languageSelectActivity.f31093b;
                    if (vl0Var6 != null) {
                        vl0Var6.setAdapter(languageSelectActivity.f31094c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31093b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31093b.setAdapter(languageSelectActivity.f31092a);
                    return;
                }
                return;
            case 13:
                kd0 kd0Var = (kd0) this.h;
                if (kd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        kd0Var.f35117s0 = true;
                        kd0Var.f35121w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = kd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        kd0Var.U.setVisibility(8);
                        kd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = kd0Var.V.getAdapter();
                        dd0 dd0Var = kd0Var.W;
                        if (adapter3 != dd0Var) {
                            kd0Var.V.setAdapter(dd0Var);
                        }
                        kd0Var.V.setVisibility(0);
                        if (kd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        kd0Var.f35118t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = kd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        kd0Var.U.setVisibility(0);
                        kd0Var.S.setVisibility(0);
                        kd0Var.V.setAdapter(null);
                        kd0Var.V.setVisibility(8);
                    }
                    kd0Var.B0();
                    kd0Var.W.G(obj8, kd0Var.f35124x0);
                    return;
                }
                return;
            case 14:
                ((bi0) this.h).f32469a.j(editText.getText().toString());
                return;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.f34263a.getActionBar().setSearchFieldText(editText.getText().toString());
                hr0Var.f34264b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 16:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 17:
                String obj9 = editText.getText().toString();
                f41 f41Var = (f41) this.h;
                if (obj9 == null) {
                    f41Var.f33490f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = f41Var.f33490f;
                    if (arrayList == null) {
                        f41Var.f33490f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < f41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) f41Var.h.get(i11);
                        if (language.f15843q.startsWith(lowerCase)) {
                            f41Var.f33490f.add(0, language);
                        } else if (language.f15843q.contains(lowerCase)) {
                            f41Var.f33490f.add(language);
                        }
                    }
                    f41Var.f33489c.l();
                }
                if (obj9.length() != 0) {
                    vl0 vl0Var7 = f41Var.f33488b;
                    if (vl0Var7 != null) {
                        vl0Var7.setAdapter(f41Var.f33489c);
                        return;
                    }
                    return;
                } else if (f41Var.f33488b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.f33488b.setAdapter(f41Var.f33487a);
                    return;
                } else {
                    return;
                }
            case 18:
                ((i91) this.h).h.I(editText.getText().toString());
                return;
            case 19:
                String obj10 = editText.getText().toString();
                bg1 bg1Var = ((fg1) this.h).f33630r0;
                if (!bg1Var.f32442c0.equals(obj10)) {
                    bg1Var.L(bg1Var.e[0], bg1Var.getCurrentPosition(), obj10, false);
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
