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
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.au;
import org.telegram.ui.cd0;
import org.telegram.ui.dg1;
import org.telegram.ui.e41;
import org.telegram.ui.f91;
import org.telegram.ui.hr0;
import org.telegram.ui.jd0;
import org.telegram.ui.or;
import org.telegram.ui.ov;
import org.telegram.ui.s70;
import org.telegram.ui.sr;
import org.telegram.ui.t70;
import org.telegram.ui.tp;
import org.telegram.ui.up;
import org.telegram.ui.ur;
import org.telegram.ui.vb;
import org.telegram.ui.yt;
import org.telegram.ui.zf1;
public final class d2 extends g5 {
    public final int f10255f;
    public final Object h;

    public d2(Object obj, int i10) {
        this.f10255f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f10255f) {
            case 15:
                ((hr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f10255f) {
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
        switch (this.f10255f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.e = null;
                e2Var.f10276a.Y2.N(true);
                e2Var.f10276a.v0(0);
                return;
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.f38438v0 = "";
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
                upVar.f38071b.setAdapter(upVar.f38070a);
                upVar.f38070a.l();
                upVar.f38071b.setFastScrollVisible(true);
                upVar.f38071b.setVerticalScrollBarEnabled(false);
                upVar.d.setShowAtCenter(false);
                View view = upVar.fragmentView;
                int i10 = j6.f19006a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                upVar.fragmentView.setTag(Integer.valueOf(i10));
                upVar.d.b();
                return;
            case 3:
                sr srVar = (sr) this.h;
                srVar.e.F(null);
                srVar.f37424o1 = false;
                ai.w0 w0Var = srVar.f37398c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(srVar.f37392a);
                srVar.f37392a.l();
                srVar.f37398c.setFastScrollVisible(true);
                srVar.f37398c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = srVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                ur urVar = (ur) this.h;
                urVar.f38091n = null;
                n61 n61Var = urVar.f26891a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                if (j8Var.h) {
                    j8Var.f25207f = false;
                    j8Var.h = false;
                    j8Var.setAllowNestedScroll(true);
                    j8Var.f25222s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.f25213k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) this.h;
                okVar.f26962b0 = false;
                okVar.G.setVisibility(0);
                dk dkVar = okVar.f26968r;
                s4.h0 adapter = dkVar.getAdapter();
                hk hkVar = okVar.v;
                if (adapter != hkVar) {
                    dkVar.setAdapter(hkVar);
                }
                hkVar.l();
                okVar.f26972y.Y(null, true);
                return;
            case 7:
                gl glVar = (gl) this.h;
                glVar.f24436l0 = false;
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
                contactsActivity.f30999r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f30986f.setAdapter(contactsActivity.d);
                contactsActivity.f30986f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f30986f.setFastScrollVisible(true);
                contactsActivity.f30986f.setVerticalScrollBarEnabled(false);
                contactsActivity.f30986f.getFastScroll().f23614h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                au auVar = (au) this.h;
                yt ytVar = auVar.d;
                ytVar.getClass();
                ytVar.e = null;
                auVar.f32138f = false;
                auVar.e = false;
                auVar.f32135a.setAdapter(auVar.f32137c);
                auVar.f32135a.setFastScrollVisible(true);
                return;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.f36255a.getActionBar().h(false);
                ovVar.f36256b.getActionBar().h(false);
                return;
            case 11:
                t70 t70Var = (t70) this.h;
                if (t70Var.M) {
                    s70.E(t70Var.f37599f, null);
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
                if (languageSelectActivity.f31053b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31053b.setAdapter(languageSelectActivity.f31052a);
                    return;
                }
                return;
            case 13:
                jd0 jd0Var = (jd0) this.h;
                jd0Var.f34833r0 = false;
                jd0Var.f34835s0 = false;
                jd0Var.W.G(null, null);
                jd0Var.B0();
                if (jd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = jd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    jd0Var.U.setVisibility(0);
                    jd0Var.S.setVisibility(0);
                    jd0Var.V.setAdapter(null);
                    jd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                la0 la0Var = ((ai0) this.h).f32077a;
                la0Var.f45382y = false;
                la0Var.j(null);
                return;
            case 15:
            case 16:
            default:
                return;
            case 17:
                e41 e41Var = (e41) this.h;
                e41Var.f33173f = null;
                if (e41Var.f33171b != null) {
                    e41Var.d.setVisibility(8);
                    e41Var.f33171b.setAdapter(e41Var.f33170a);
                    return;
                }
                return;
            case 18:
                f91 f91Var = (f91) this.h;
                f91Var.f33479a.a(false, true);
                f91Var.o0(false, true);
                f91Var.f33483c.Y2.N(false);
                return;
            case 19:
                dg1.b0((dg1) this.h, false);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f10255f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.f10276a.Y2.N(true);
                e2Var.f10276a.v0(0);
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
                srVar.f37424o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = srVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                j8Var.f25223s0 = j8Var.f25220r.N0();
                View m10 = j8Var.f25220r.m(j8Var.f25223s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                j8Var.f25224t0 = top;
                j8Var.h = true;
                j8Var.setAllowNestedScroll(false);
                j8Var.f25222s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.f25213k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) this.h;
                okVar.f26962b0 = true;
                okVar.G.setVisibility(8);
                okVar.f26688b.t1(okVar.F.getSearchField(), true);
                return;
            case 7:
                gl glVar = (gl) this.h;
                glVar.f24436l0 = true;
                glVar.f26688b.t1(glVar.E.getSearchField(), true);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                ((au) this.h).f32138f = true;
                return;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.f36255a.getActionBar().x("");
                ovVar.f36256b.getActionBar().x("");
                ovVar.f36257c.getSearchField().requestFocus();
                return;
            case 11:
                return;
            case 12:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 13:
                ((jd0) this.h).f34833r0 = true;
                return;
            case 14:
                ((ai0) this.h).f32077a.f45382y = true;
                return;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.f34215a.getActionBar().x("");
                hr0Var.f34216b.getActionBar().x("");
                hr0Var.f34217c.getSearchField().requestFocus();
                return;
            case 16:
            default:
                return;
            case 17:
                return;
            case 18:
                f91 f91Var = (f91) this.h;
                f91Var.f33479a.a(true, true);
                f91Var.h.I("");
                f91Var.o0(false, true);
                f91Var.f33483c.Y2.N(false);
                return;
            case 19:
                dg1 dg1Var = (dg1) this.h;
                dg1.b0(dg1Var, true);
                zf1 zf1Var = dg1Var.f33004r0;
                if (!zf1Var.f40116c0.equals("")) {
                    zf1Var.L(zf1Var.e[0], zf1Var.getCurrentPosition(), "", false);
                }
                dg1Var.f33004r0.setAlpha(0.0f);
                dg1Var.f33004r0.f40127o0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f10255f) {
            case 6:
                ok okVar = (ok) this.h;
                nk nkVar = okVar.f26972y;
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
        switch (this.f10255f) {
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.U = true;
                vbVar.f38438v0 = h2Var.getText().toString();
                vbVar.U0(true);
                return;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.f34215a.getActionBar().w();
                hr0Var.f34216b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        wl0 wl0Var;
        int h;
        ai.w0 w0Var;
        s4.h0 h0Var;
        switch (this.f10255f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.f10276a.Y2.N(true);
                e2Var.f10276a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                up upVar = (up) this.h;
                if (upVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (wl0Var = upVar.f38071b) != null) {
                        s4.h0 adapter = wl0Var.getAdapter();
                        tp tpVar = upVar.e;
                        if (adapter != tpVar) {
                            upVar.f38071b.setAdapter(tpVar);
                            View view = upVar.fragmentView;
                            int i10 = j6.f19062d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
                            upVar.fragmentView.setTag(Integer.valueOf(i10));
                            upVar.e.l();
                            upVar.f38071b.setFastScrollVisible(false);
                            upVar.f38071b.setVerticalScrollBarEnabled(true);
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
                    if (srVar.f37398c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = srVar.f37398c.getAdapter().h();
                    }
                    srVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = srVar.f37398c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        or orVar = srVar.f37392a;
                        if (adapter2 != orVar) {
                            ai.w0 w0Var2 = srVar.f37398c;
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
                urVar.f38091n = editText.getText().toString();
                n61 n61Var = urVar.f26891a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.f25222s.E(editText.getText().toString());
                    return;
                }
                j8Var.f25207f = false;
                j8Var.f25222s.E(null);
                return;
            case 6:
                ((ok) this.h).f26972y.Y(editText.getText().toString(), false);
                return;
            case 7:
                gl glVar = (gl) this.h;
                ai.f0 f0Var = glVar.N;
                ai.w0 w0Var3 = glVar.P;
                wl0 wl0Var2 = glVar.Q;
                al alVar = glVar.R;
                if (alVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        glVar.m0 = true;
                        glVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (wl0Var2.getAdapter() != alVar) {
                            wl0Var2.setAdapter(alVar);
                        }
                        wl0Var2.setVisibility(0);
                        if (alVar.f9681s.size() == 0 && alVar.f9680r.size() == 0) {
                            z10 = true;
                        }
                        glVar.f24438n0 = z10;
                        glVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        wl0Var2.setAdapter(null);
                        wl0Var2.setVisibility(8);
                        glVar.v.setVisibility(8);
                    }
                    alVar.G(obj3, glVar.f24443r0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f30999r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f30982c.a(!obj4.isEmpty(), true);
                    contactsActivity.f30990i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        wl0 wl0Var3 = contactsActivity.f30986f;
                        if (wl0Var3 != null) {
                            wl0Var3.setAdapter(contactsActivity.f30999r);
                            contactsActivity.f30986f.setSectionsType(0);
                            contactsActivity.f30999r.l();
                            contactsActivity.f30986f.setFastScrollVisible(false);
                            contactsActivity.f30986f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f30999r.G(obj4);
                        return;
                    }
                    wl0 wl0Var4 = contactsActivity.f30986f;
                    if (wl0Var4 != null) {
                        wl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f30986f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                au auVar = (au) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    yt ytVar = auVar.d;
                    ytVar.getClass();
                    ytVar.e = null;
                    auVar.e = false;
                    auVar.f32135a.setAdapter(auVar.f32137c);
                    auVar.f32135a.setFastScrollVisible(true);
                    return;
                }
                yt ytVar2 = auVar.d;
                ytVar2.getClass();
                if (obj5 == null) {
                    ytVar2.e = null;
                } else {
                    try {
                        Timer timer = ytVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    ytVar2.d = timer2;
                    timer2.schedule(new gg.s1(ytVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    auVar.e = true;
                    return;
                }
                return;
            case 10:
                ov ovVar = (ov) this.h;
                ovVar.f36255a.getActionBar().setSearchFieldText(editText.getText().toString());
                ovVar.f36256b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                String obj6 = editText.getText().toString();
                t70 t70Var = (t70) this.h;
                s70.E(t70Var.f37599f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != t70Var.M) {
                    t70Var.M = z11;
                    wl0 wl0Var5 = t70Var.d;
                    if (wl0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = t70Var.f37599f;
                        } else {
                            h0Var = t70Var.e;
                        }
                        wl0Var5.setAdapter(h0Var);
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
                    wl0 wl0Var6 = languageSelectActivity.f31053b;
                    if (wl0Var6 != null) {
                        wl0Var6.setAdapter(languageSelectActivity.f31054c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31053b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31053b.setAdapter(languageSelectActivity.f31052a);
                    return;
                }
                return;
            case 13:
                jd0 jd0Var = (jd0) this.h;
                if (jd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        jd0Var.f34835s0 = true;
                        jd0Var.f34839w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = jd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        jd0Var.U.setVisibility(8);
                        jd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = jd0Var.V.getAdapter();
                        cd0 cd0Var = jd0Var.W;
                        if (adapter3 != cd0Var) {
                            jd0Var.V.setAdapter(cd0Var);
                        }
                        jd0Var.V.setVisibility(0);
                        if (jd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        jd0Var.f34836t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = jd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        jd0Var.U.setVisibility(0);
                        jd0Var.S.setVisibility(0);
                        jd0Var.V.setAdapter(null);
                        jd0Var.V.setVisibility(8);
                    }
                    jd0Var.B0();
                    jd0Var.W.G(obj8, jd0Var.f34842x0);
                    return;
                }
                return;
            case 14:
                ((ai0) this.h).f32077a.j(editText.getText().toString());
                return;
            case 15:
                hr0 hr0Var = (hr0) this.h;
                hr0Var.f34215a.getActionBar().setSearchFieldText(editText.getText().toString());
                hr0Var.f34216b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 16:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 17:
                String obj9 = editText.getText().toString();
                e41 e41Var = (e41) this.h;
                if (obj9 == null) {
                    e41Var.f33173f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = e41Var.f33173f;
                    if (arrayList == null) {
                        e41Var.f33173f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < e41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) e41Var.h.get(i11);
                        if (language.f15811q.startsWith(lowerCase)) {
                            e41Var.f33173f.add(0, language);
                        } else if (language.f15811q.contains(lowerCase)) {
                            e41Var.f33173f.add(language);
                        }
                    }
                    e41Var.f33172c.l();
                }
                if (obj9.length() != 0) {
                    wl0 wl0Var7 = e41Var.f33171b;
                    if (wl0Var7 != null) {
                        wl0Var7.setAdapter(e41Var.f33172c);
                        return;
                    }
                    return;
                } else if (e41Var.f33171b != null) {
                    e41Var.d.setVisibility(8);
                    e41Var.f33171b.setAdapter(e41Var.f33170a);
                    return;
                } else {
                    return;
                }
            case 18:
                ((f91) this.h).h.I(editText.getText().toString());
                return;
            case 19:
                String obj10 = editText.getText().toString();
                zf1 zf1Var = ((dg1) this.h).f33004r0;
                if (!zf1Var.f40116c0.equals(obj10)) {
                    zf1Var.L(zf1Var.e[0], zf1Var.getCurrentPosition(), obj10, false);
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
