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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ar0;
import org.telegram.ui.dd0;
import org.telegram.ui.ih1;
import org.telegram.ui.kv;
import org.telegram.ui.mr;
import org.telegram.ui.p70;
import org.telegram.ui.q70;
import org.telegram.ui.qr;
import org.telegram.ui.rp;
import org.telegram.ui.sf1;
import org.telegram.ui.sp;
import org.telegram.ui.ub;
import org.telegram.ui.uh0;
import org.telegram.ui.vt;
import org.telegram.ui.wc0;
import org.telegram.ui.wf1;
import org.telegram.ui.x31;
import org.telegram.ui.x81;
import org.telegram.ui.xt;
public final class e2 extends f5 {
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
                ((ar0) this.h).finishFragment();
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
                ubVar.f38036v0 = "";
                ubVar.I.setVisibility(0);
                if (ubVar.U) {
                    ubVar.U = false;
                    ubVar.U0(true);
                    return;
                }
                return;
            case 2:
                sp spVar = (sp) this.h;
                spVar.e.F(null);
                spVar.N = false;
                spVar.getClass();
                spVar.f37381b.setAdapter(spVar.f37380a);
                spVar.f37380a.l();
                spVar.f37381b.setFastScrollVisible(true);
                spVar.f37381b.setVerticalScrollBarEnabled(false);
                spVar.d.setShowAtCenter(false);
                View view = spVar.fragmentView;
                int i10 = h6.f18733a7;
                view.setBackgroundColor(h6.w0(null, i10, false));
                spVar.fragmentView.setTag(Integer.valueOf(i10));
                spVar.d.b();
                return;
            case 3:
                qr qrVar = (qr) this.h;
                qrVar.e.F(null);
                qrVar.f36577o1 = false;
                ai.w0 w0Var = qrVar.f36551c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(qrVar.f36545a);
                qrVar.f36545a.l();
                qrVar.f36551c.setFastScrollVisible(true);
                qrVar.f36551c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = qrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                if (j8Var.h) {
                    j8Var.f25169f = false;
                    j8Var.h = false;
                    j8Var.setAllowNestedScroll(true);
                    j8Var.f25184s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.f25175k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                pk pkVar = (pk) this.h;
                pkVar.f27062b0 = false;
                pkVar.G.setVisibility(0);
                ek ekVar = pkVar.f27068r;
                s4.h0 adapter = ekVar.getAdapter();
                ik ikVar = pkVar.v;
                if (adapter != ikVar) {
                    ekVar.setAdapter(ikVar);
                }
                ikVar.l();
                pkVar.f27072y.Y(null, true);
                return;
            case 6:
                hl hlVar = (hl) this.h;
                hlVar.f24728l0 = false;
                hlVar.m0 = false;
                hlVar.R.G(null, null);
                hlVar.f0();
                hlVar.P.setVisibility(0);
                hlVar.N.setVisibility(0);
                hlVar.Q.setVisibility(8);
                hlVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f30726r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f30713f.setAdapter(contactsActivity.d);
                contactsActivity.f30713f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f30713f.setFastScrollVisible(true);
                contactsActivity.f30713f.setVerticalScrollBarEnabled(false);
                contactsActivity.f30713f.getFastScroll().f28231h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                xt xtVar = (xt) this.h;
                vt vtVar = xtVar.d;
                vtVar.getClass();
                vtVar.e = null;
                xtVar.f39658f = false;
                xtVar.e = false;
                xtVar.f39655a.setAdapter(xtVar.f39657c);
                xtVar.f39655a.setFastScrollVisible(true);
                return;
            case 9:
                kv kvVar = (kv) this.h;
                kvVar.f34803a.getActionBar().h(false);
                kvVar.f34804b.getActionBar().h(false);
                return;
            case 10:
                q70 q70Var = (q70) this.h;
                if (q70Var.M) {
                    p70.E(q70Var.f36309f, null);
                    q70Var.M = false;
                    q70Var.d.setAdapter(q70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f30780b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f30780b.setAdapter(languageSelectActivity.f30779a);
                    return;
                }
                return;
            case 12:
                dd0 dd0Var = (dd0) this.h;
                dd0Var.f32602r0 = false;
                dd0Var.f32604s0 = false;
                dd0Var.W.G(null, null);
                dd0Var.B0();
                if (dd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = dd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    dd0Var.U.setVisibility(0);
                    dd0Var.S.setVisibility(0);
                    dd0Var.V.setAdapter(null);
                    dd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                da0 da0Var = ((uh0) this.h).f38112a;
                da0Var.f45081y = false;
                da0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                x31 x31Var = (x31) this.h;
                x31Var.f39183f = null;
                if (x31Var.f39181b != null) {
                    x31Var.d.setVisibility(8);
                    x31Var.f39181b.setAdapter(x31Var.f39180a);
                    return;
                }
                return;
            case 17:
                x81 x81Var = (x81) this.h;
                x81Var.f39206a.a(false, true);
                x81Var.o0(false, true);
                x81Var.f39210c.Y2.N(false);
                return;
            case 18:
                wf1.b0((wf1) this.h, false);
                return;
            case 19:
                ih1 ih1Var = (ih1) this.h;
                ih1Var.h = null;
                x51 x51Var = ih1Var.f30163a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
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
                sp spVar = (sp) this.h;
                spVar.N = true;
                spVar.d.setShowAtCenter(true);
                return;
            case 3:
                qr qrVar = (qr) this.h;
                qrVar.f36577o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = qrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                j8Var.f25185s0 = j8Var.f25182r.N0();
                View m10 = j8Var.f25182r.m(j8Var.f25185s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                j8Var.f25186t0 = top;
                j8Var.h = true;
                j8Var.setAllowNestedScroll(false);
                j8Var.f25184s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.f25175k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                pk pkVar = (pk) this.h;
                pkVar.f27062b0 = true;
                pkVar.G.setVisibility(8);
                pkVar.f26744b.t1(pkVar.F.getSearchField(), true);
                return;
            case 6:
                hl hlVar = (hl) this.h;
                hlVar.f24728l0 = true;
                hlVar.f26744b.t1(hlVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((xt) this.h).f39658f = true;
                return;
            case 9:
                kv kvVar = (kv) this.h;
                kvVar.f34803a.getActionBar().x("");
                kvVar.f34804b.getActionBar().x("");
                kvVar.f34805c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((dd0) this.h).f32602r0 = true;
                return;
            case 13:
                ((uh0) this.h).f38112a.f45081y = true;
                return;
            case 14:
                ar0 ar0Var = (ar0) this.h;
                ar0Var.f31867a.getActionBar().x("");
                ar0Var.f31868b.getActionBar().x("");
                ar0Var.f31869c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                x81 x81Var = (x81) this.h;
                x81Var.f39206a.a(true, true);
                x81Var.h.I("");
                x81Var.o0(false, true);
                x81Var.f39210c.Y2.N(false);
                return;
            case 18:
                wf1 wf1Var = (wf1) this.h;
                wf1.b0(wf1Var, true);
                sf1 sf1Var = wf1Var.f38970r0;
                if (!sf1Var.f37277b0.equals("")) {
                    sf1Var.K(sf1Var.e[0], sf1Var.getCurrentPosition(), "", false);
                }
                wf1Var.f38970r0.setAlpha(0.0f);
                wf1Var.f38970r0.f37288n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f10245f) {
            case 5:
                pk pkVar = (pk) this.h;
                ok okVar = pkVar.f27072y;
                okVar.R.remove(q0Var);
                okVar.Y(pkVar.F.getSearchField().getText().toString(), false);
                okVar.a0(null, null, true);
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
                ubVar.f38036v0 = h2Var.getText().toString();
                ubVar.U0(true);
                return;
            case 14:
                ar0 ar0Var = (ar0) this.h;
                ar0Var.f31867a.getActionBar().w();
                ar0Var.f31868b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        ml0 ml0Var;
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
                sp spVar = (sp) this.h;
                if (spVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (ml0Var = spVar.f37381b) != null) {
                        s4.h0 adapter = ml0Var.getAdapter();
                        rp rpVar = spVar.e;
                        if (adapter != rpVar) {
                            spVar.f37381b.setAdapter(rpVar);
                            View view = spVar.fragmentView;
                            int i10 = h6.f18789d6;
                            view.setBackgroundColor(h6.w0(null, i10, false));
                            spVar.fragmentView.setTag(Integer.valueOf(i10));
                            spVar.e.l();
                            spVar.f37381b.setFastScrollVisible(false);
                            spVar.f37381b.setVerticalScrollBarEnabled(true);
                            spVar.d.b();
                        }
                    }
                    spVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                qr qrVar = (qr) this.h;
                if (qrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (qrVar.f36551c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = qrVar.f36551c.getAdapter().h();
                    }
                    qrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = qrVar.f36551c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        mr mrVar = qrVar.f36545a;
                        if (adapter2 != mrVar) {
                            ai.w0 w0Var2 = qrVar.f36551c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(mrVar);
                            if (h == 0) {
                                qrVar.y0(0);
                            }
                        }
                    }
                    qrVar.D1.setVisibility(8);
                    qrVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.f25184s.E(editText.getText().toString());
                    return;
                }
                j8Var.f25169f = false;
                j8Var.f25184s.E(null);
                return;
            case 5:
                ((pk) this.h).f27072y.Y(editText.getText().toString(), false);
                return;
            case 6:
                hl hlVar = (hl) this.h;
                ai.f0 f0Var = hlVar.N;
                ai.w0 w0Var3 = hlVar.P;
                ml0 ml0Var2 = hlVar.Q;
                bl blVar = hlVar.R;
                if (blVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        hlVar.m0 = true;
                        hlVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (ml0Var2.getAdapter() != blVar) {
                            ml0Var2.setAdapter(blVar);
                        }
                        ml0Var2.setVisibility(0);
                        if (blVar.f9664s.size() == 0 && blVar.f9663r.size() == 0) {
                            z10 = true;
                        }
                        hlVar.f24730n0 = z10;
                        hlVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        ml0Var2.setAdapter(null);
                        ml0Var2.setVisibility(8);
                        hlVar.v.setVisibility(8);
                    }
                    blVar.G(obj3, hlVar.f24735r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f30726r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f30709c.a(!obj4.isEmpty(), true);
                    contactsActivity.f30717i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        ml0 ml0Var3 = contactsActivity.f30713f;
                        if (ml0Var3 != null) {
                            ml0Var3.setAdapter(contactsActivity.f30726r);
                            contactsActivity.f30713f.setSectionsType(0);
                            contactsActivity.f30726r.l();
                            contactsActivity.f30713f.setFastScrollVisible(false);
                            contactsActivity.f30713f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f30726r.G(obj4);
                        return;
                    }
                    ml0 ml0Var4 = contactsActivity.f30713f;
                    if (ml0Var4 != null) {
                        ml0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f30713f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                xt xtVar = (xt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    vt vtVar = xtVar.d;
                    vtVar.getClass();
                    vtVar.e = null;
                    xtVar.e = false;
                    xtVar.f39655a.setAdapter(xtVar.f39657c);
                    xtVar.f39655a.setFastScrollVisible(true);
                    return;
                }
                vt vtVar2 = xtVar.d;
                vtVar2.getClass();
                if (obj5 == null) {
                    vtVar2.e = null;
                } else {
                    try {
                        Timer timer = vtVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    vtVar2.d = timer2;
                    timer2.schedule(new gg.s1(vtVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    xtVar.e = true;
                    return;
                }
                return;
            case 9:
                kv kvVar = (kv) this.h;
                kvVar.f34803a.getActionBar().setSearchFieldText(editText.getText().toString());
                kvVar.f34804b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                q70 q70Var = (q70) this.h;
                p70.E(q70Var.f36309f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != q70Var.M) {
                    q70Var.M = z11;
                    ml0 ml0Var5 = q70Var.d;
                    if (ml0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = q70Var.f36309f;
                        } else {
                            h0Var = q70Var.e;
                        }
                        ml0Var5.setAdapter(h0Var);
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
                    ml0 ml0Var6 = languageSelectActivity.f30780b;
                    if (ml0Var6 != null) {
                        ml0Var6.setAdapter(languageSelectActivity.f30781c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f30780b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f30780b.setAdapter(languageSelectActivity.f30779a);
                    return;
                }
                return;
            case 12:
                dd0 dd0Var = (dd0) this.h;
                if (dd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        dd0Var.f32604s0 = true;
                        dd0Var.f32608w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = dd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        dd0Var.U.setVisibility(8);
                        dd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = dd0Var.V.getAdapter();
                        wc0 wc0Var = dd0Var.W;
                        if (adapter3 != wc0Var) {
                            dd0Var.V.setAdapter(wc0Var);
                        }
                        dd0Var.V.setVisibility(0);
                        if (dd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        dd0Var.f32605t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = dd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        dd0Var.U.setVisibility(0);
                        dd0Var.S.setVisibility(0);
                        dd0Var.V.setAdapter(null);
                        dd0Var.V.setVisibility(8);
                    }
                    dd0Var.B0();
                    dd0Var.W.G(obj8, dd0Var.f32611x0);
                    return;
                }
                return;
            case 13:
                ((uh0) this.h).f38112a.j(editText.getText().toString());
                return;
            case 14:
                ar0 ar0Var = (ar0) this.h;
                ar0Var.f31867a.getActionBar().setSearchFieldText(editText.getText().toString());
                ar0Var.f31868b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                x31 x31Var = (x31) this.h;
                if (obj9 == null) {
                    x31Var.f39183f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = x31Var.f39183f;
                    if (arrayList == null) {
                        x31Var.f39183f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < x31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) x31Var.h.get(i11);
                        if (language.f15598q.startsWith(lowerCase)) {
                            x31Var.f39183f.add(0, language);
                        } else if (language.f15598q.contains(lowerCase)) {
                            x31Var.f39183f.add(language);
                        }
                    }
                    x31Var.f39182c.l();
                }
                if (obj9.length() != 0) {
                    ml0 ml0Var7 = x31Var.f39181b;
                    if (ml0Var7 != null) {
                        ml0Var7.setAdapter(x31Var.f39182c);
                        return;
                    }
                    return;
                } else if (x31Var.f39181b != null) {
                    x31Var.d.setVisibility(8);
                    x31Var.f39181b.setAdapter(x31Var.f39180a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((x81) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                sf1 sf1Var = ((wf1) this.h).f38970r0;
                if (!sf1Var.f37277b0.equals(obj10)) {
                    sf1Var.K(sf1Var.e[0], sf1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                ih1 ih1Var = (ih1) this.h;
                ih1Var.h = editText.getText().toString();
                x51 x51Var = ih1Var.f30163a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
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
