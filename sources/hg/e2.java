package hg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.xl;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad0;
import org.telegram.ui.ai0;
import org.telegram.ui.bg1;
import org.telegram.ui.f41;
import org.telegram.ui.fg1;
import org.telegram.ui.gr0;
import org.telegram.ui.hd0;
import org.telegram.ui.i91;
import org.telegram.ui.mv;
import org.telegram.ui.pr;
import org.telegram.ui.r70;
import org.telegram.ui.rh1;
import org.telegram.ui.s70;
import org.telegram.ui.tp;
import org.telegram.ui.tr;
import org.telegram.ui.up;
import org.telegram.ui.vb;
import org.telegram.ui.xt;
import org.telegram.ui.zt;
public final class e2 extends g5 {
    public final int f11216f;
    public final Object h;

    public e2(Object obj, int i10) {
        this.f11216f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f11216f) {
            case 14:
                ((gr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator g() {
        switch (this.f11216f) {
            case 15:
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
                return super.g();
        }
    }

    @Override
    public void m() {
        switch (this.f11216f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = false;
                f2Var.f11233e = null;
                f2Var.f11230a.W2.N(true);
                f2Var.f11230a.u0(0);
                return;
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.f42796v0 = "";
                vbVar.I.setVisibility(0);
                if (vbVar.U) {
                    vbVar.U = false;
                    vbVar.U0(true);
                    return;
                }
                return;
            case 2:
                up upVar = (up) this.h;
                upVar.f42503e.F(null);
                upVar.N = false;
                upVar.getClass();
                upVar.f42501b.setAdapter(upVar.f42500a);
                upVar.f42500a.l();
                upVar.f42501b.setFastScrollVisible(true);
                upVar.f42501b.setVerticalScrollBarEnabled(false);
                upVar.d.setShowAtCenter(false);
                View view = upVar.fragmentView;
                int i10 = i6.f20741a7;
                view.setBackgroundColor(i6.x0(null, i10, false));
                upVar.fragmentView.setTag(Integer.valueOf(i10));
                upVar.d.b();
                return;
            case 3:
                tr trVar = (tr) this.h;
                trVar.f42063e.F(null);
                trVar.f42085o1 = false;
                ai.w0 w0Var = trVar.f42058c;
                w0Var.W1 = false;
                w0Var.X1 = 0;
                w0Var.setAdapter(trVar.f42052a);
                trVar.f42052a.l();
                trVar.f42058c.setFastScrollVisible(true);
                trVar.f42058c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = trVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                l8 l8Var = (l8) this.h;
                if (l8Var.h) {
                    l8Var.f28339f = false;
                    l8Var.h = false;
                    l8Var.setAllowNestedScroll(true);
                    l8Var.f28354s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = l8Var.f28345k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                sk skVar = (sk) this.h;
                skVar.f30831b0 = false;
                skVar.G.setVisibility(0);
                hk hkVar = skVar.f30837r;
                s4.i0 adapter = hkVar.getAdapter();
                lk lkVar = skVar.v;
                if (adapter != lkVar) {
                    hkVar.setAdapter(lkVar);
                }
                lkVar.l();
                skVar.f30841y.Y(null, true);
                return;
            case 6:
                xl xlVar = (xl) this.h;
                xlVar.f32915l0 = false;
                xlVar.m0 = false;
                xlVar.R.G(null, null);
                xlVar.i0();
                xlVar.P.setVisibility(0);
                xlVar.N.setVisibility(0);
                xlVar.Q.setVisibility(8);
                xlVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f33713r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33700f.setAdapter(contactsActivity.d);
                contactsActivity.f33700f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33700f.setFastScrollVisible(true);
                contactsActivity.f33700f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33700f.getFastScroll().f32947h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                zt ztVar = (zt) this.h;
                xt xtVar = ztVar.d;
                xtVar.getClass();
                xtVar.f44147e = null;
                ztVar.f45065f = false;
                ztVar.f45064e = false;
                ztVar.f45061a.setAdapter(ztVar.f45063c);
                ztVar.f45061a.setFastScrollVisible(true);
                return;
            case 9:
                mv mvVar = (mv) this.h;
                mvVar.f39991a.getActionBar().h(false);
                mvVar.f39992b.getActionBar().h(false);
                return;
            case 10:
                s70 s70Var = (s70) this.h;
                if (s70Var.M) {
                    r70.E(s70Var.f41597f, null);
                    s70Var.M = false;
                    s70Var.d.setAdapter(s70Var.f41596e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33771b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33771b.setAdapter(languageSelectActivity.f33770a);
                    return;
                }
                return;
            case 12:
                hd0 hd0Var = (hd0) this.h;
                hd0Var.f38278r0 = false;
                hd0Var.f38280s0 = false;
                hd0Var.W.G(null, null);
                hd0Var.A0();
                if (hd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = hd0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    hd0Var.U.setVisibility(0);
                    hd0Var.S.setVisibility(0);
                    hd0Var.V.setAdapter(null);
                    hd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                eb0 eb0Var = ((ai0) this.h).f35937a;
                eb0Var.f50449y = false;
                eb0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                f41 f41Var = (f41) this.h;
                f41Var.f37447f = null;
                if (f41Var.f37444b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.f37444b.setAdapter(f41Var.f37443a);
                    return;
                }
                return;
            case 17:
                i91 i91Var = (i91) this.h;
                i91Var.f38580a.a(false, true);
                i91Var.o0(false, true);
                i91Var.f38584c.W2.N(false);
                return;
            case 18:
                fg1.b0((fg1) this.h, false);
                return;
            case 19:
                rh1 rh1Var = (rh1) this.h;
                rh1Var.h = null;
                e71 e71Var = rh1Var.f26290a;
                if (e71Var != null) {
                    e71Var.W2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f11216f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = true;
                f2Var.f11230a.W2.N(true);
                f2Var.f11230a.u0(0);
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
                tr trVar = (tr) this.h;
                trVar.f42085o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = trVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                l8 l8Var = (l8) this.h;
                l8Var.f28355s0 = l8Var.f28352r.N0();
                View m10 = l8Var.f28352r.m(l8Var.f28355s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                l8Var.f28356t0 = top;
                l8Var.h = true;
                l8Var.setAllowNestedScroll(false);
                l8Var.f28354s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = l8Var.f28345k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                sk skVar = (sk) this.h;
                skVar.f30831b0 = true;
                skVar.G.setVisibility(8);
                skVar.f30173b.w1(skVar.F.getSearchField(), true);
                return;
            case 6:
                xl xlVar = (xl) this.h;
                xlVar.f32915l0 = true;
                xlVar.f30173b.w1(xlVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((zt) this.h).f45065f = true;
                return;
            case 9:
                mv mvVar = (mv) this.h;
                mvVar.f39991a.getActionBar().y("");
                mvVar.f39992b.getActionBar().y("");
                mvVar.f39993c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((hd0) this.h).f38278r0 = true;
                return;
            case 13:
                ((ai0) this.h).f35937a.f50449y = true;
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f38084a.getActionBar().y("");
                gr0Var.f38085b.getActionBar().y("");
                gr0Var.f38086c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                i91 i91Var = (i91) this.h;
                i91Var.f38580a.a(true, true);
                i91Var.h.I("");
                i91Var.o0(false, true);
                i91Var.f38584c.W2.N(false);
                return;
            case 18:
                fg1 fg1Var = (fg1) this.h;
                fg1.b0(fg1Var, true);
                bg1 bg1Var = fg1Var.f37593r0;
                if (!bg1Var.f36314b0.equals("")) {
                    bg1Var.K(bg1Var.f29429e[0], bg1Var.getCurrentPosition(), "", false);
                }
                fg1Var.f37593r0.setAlpha(0.0f);
                fg1Var.f37593r0.f36325n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.p0 p0Var) {
        switch (this.f11216f) {
            case 5:
                sk skVar = (sk) this.h;
                rk rkVar = skVar.f30841y;
                rkVar.R.remove(p0Var);
                rkVar.Y(skVar.F.getSearchField().getText().toString(), false);
                rkVar.a0(null, null, true);
                return;
            case 18:
            default:
                return;
        }
    }

    @Override
    public void p(ci.g2 g2Var) {
        switch (this.f11216f) {
            case 1:
                vb vbVar = (vb) this.h;
                vbVar.U = true;
                vbVar.f42796v0 = g2Var.getText().toString();
                vbVar.U0(true);
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f38084a.getActionBar().x();
                gr0Var.f38085b.getActionBar().x();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        qm0 qm0Var;
        int h;
        ai.w0 w0Var;
        s4.i0 i0Var;
        switch (this.f11216f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.f11233e = editText.getText().toString();
                f2Var.f11230a.W2.N(true);
                f2Var.f11230a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                up upVar = (up) this.h;
                if (upVar.f42503e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (qm0Var = upVar.f42501b) != null) {
                        s4.i0 adapter = qm0Var.getAdapter();
                        tp tpVar = upVar.f42503e;
                        if (adapter != tpVar) {
                            upVar.f42501b.setAdapter(tpVar);
                            View view = upVar.fragmentView;
                            int i10 = i6.f20797d6;
                            view.setBackgroundColor(i6.x0(null, i10, false));
                            upVar.fragmentView.setTag(Integer.valueOf(i10));
                            upVar.f42503e.l();
                            upVar.f42501b.setFastScrollVisible(false);
                            upVar.f42501b.setVerticalScrollBarEnabled(true);
                            upVar.d.b();
                        }
                    }
                    upVar.f42503e.F(obj);
                    return;
                }
                return;
            case 3:
                tr trVar = (tr) this.h;
                if (trVar.f42063e != null) {
                    String obj2 = editText.getText().toString();
                    if (trVar.f42058c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = trVar.f42058c.getAdapter().h();
                    }
                    trVar.f42063e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = trVar.f42058c) != null) {
                        s4.i0 adapter2 = w0Var.getAdapter();
                        pr prVar = trVar.f42052a;
                        if (adapter2 != prVar) {
                            ai.w0 w0Var2 = trVar.f42058c;
                            w0Var2.W1 = false;
                            w0Var2.X1 = 0;
                            w0Var2.setAdapter(prVar);
                            if (h == 0) {
                                trVar.y0(0);
                            }
                        }
                    }
                    trVar.D1.setVisibility(8);
                    trVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                l8 l8Var = (l8) this.h;
                if (editText.length() > 0) {
                    l8Var.f28354s.E(editText.getText().toString());
                    return;
                }
                l8Var.f28339f = false;
                l8Var.f28354s.E(null);
                return;
            case 5:
                ((sk) this.h).f30841y.Y(editText.getText().toString(), false);
                return;
            case 6:
                xl xlVar = (xl) this.h;
                ai.f0 f0Var = xlVar.N;
                ai.w0 w0Var3 = xlVar.P;
                qm0 qm0Var2 = xlVar.Q;
                rl rlVar = xlVar.R;
                if (rlVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        xlVar.m0 = true;
                        xlVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (qm0Var2.getAdapter() != rlVar) {
                            qm0Var2.setAdapter(rlVar);
                        }
                        qm0Var2.setVisibility(0);
                        if (rlVar.f10553s.size() == 0 && rlVar.f10552r.size() == 0) {
                            z10 = true;
                        }
                        xlVar.f32917n0 = z10;
                        xlVar.i0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        qm0Var2.setAdapter(null);
                        qm0Var2.setVisibility(8);
                        xlVar.v.setVisibility(8);
                    }
                    rlVar.G(obj3, xlVar.f32922r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f33713r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33695c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33704i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        qm0 qm0Var3 = contactsActivity.f33700f;
                        if (qm0Var3 != null) {
                            qm0Var3.setAdapter(contactsActivity.f33713r);
                            contactsActivity.f33700f.setSectionsType(0);
                            contactsActivity.f33713r.l();
                            contactsActivity.f33700f.setFastScrollVisible(false);
                            contactsActivity.f33700f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f33698e.e(true, true);
                        contactsActivity.f33713r.G(obj4);
                        return;
                    }
                    qm0 qm0Var4 = contactsActivity.f33700f;
                    if (qm0Var4 != null) {
                        qm0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33700f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                zt ztVar = (zt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    xt xtVar = ztVar.d;
                    xtVar.getClass();
                    xtVar.f44147e = null;
                    ztVar.f45064e = false;
                    ztVar.f45061a.setAdapter(ztVar.f45063c);
                    ztVar.f45061a.setFastScrollVisible(true);
                    return;
                }
                xt xtVar2 = ztVar.d;
                xtVar2.getClass();
                if (obj5 == null) {
                    xtVar2.f44147e = null;
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
                    timer2.schedule(new gg.r1(xtVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    ztVar.f45064e = true;
                    return;
                }
                return;
            case 9:
                mv mvVar = (mv) this.h;
                mvVar.f39991a.getActionBar().setSearchFieldText(editText.getText().toString());
                mvVar.f39992b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                s70 s70Var = (s70) this.h;
                r70.E(s70Var.f41597f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != s70Var.M) {
                    s70Var.M = z11;
                    qm0 qm0Var5 = s70Var.d;
                    if (qm0Var5 != null) {
                        if (!isEmpty) {
                            i0Var = s70Var.f41597f;
                        } else {
                            i0Var = s70Var.f41596e;
                        }
                        qm0Var5.setAdapter(i0Var);
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
                    qm0 qm0Var6 = languageSelectActivity.f33771b;
                    if (qm0Var6 != null) {
                        qm0Var6.setAdapter(languageSelectActivity.f33772c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33771b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33771b.setAdapter(languageSelectActivity.f33770a);
                    return;
                }
                return;
            case 12:
                hd0 hd0Var = (hd0) this.h;
                if (hd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        hd0Var.f38280s0 = true;
                        hd0Var.f38284w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = hd0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        hd0Var.U.setVisibility(8);
                        hd0Var.S.setVisibility(8);
                        s4.i0 adapter3 = hd0Var.V.getAdapter();
                        ad0 ad0Var = hd0Var.W;
                        if (adapter3 != ad0Var) {
                            hd0Var.V.setAdapter(ad0Var);
                        }
                        hd0Var.V.setVisibility(0);
                        if (hd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        hd0Var.f38281t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = hd0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        hd0Var.U.setVisibility(0);
                        hd0Var.S.setVisibility(0);
                        hd0Var.V.setAdapter(null);
                        hd0Var.V.setVisibility(8);
                    }
                    hd0Var.A0();
                    hd0Var.W.G(obj8, hd0Var.f38287x0);
                    return;
                }
                return;
            case 13:
                ((ai0) this.h).f35937a.j(editText.getText().toString());
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f38084a.getActionBar().setSearchFieldText(editText.getText().toString());
                gr0Var.f38085b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).f34241e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                f41 f41Var = (f41) this.h;
                if (obj9 == null) {
                    f41Var.f37447f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = f41Var.f37447f;
                    if (arrayList == null) {
                        f41Var.f37447f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < f41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) f41Var.h.get(i11);
                        if (language.f17273q.startsWith(lowerCase)) {
                            f41Var.f37447f.add(0, language);
                        } else if (language.f17273q.contains(lowerCase)) {
                            f41Var.f37447f.add(language);
                        }
                    }
                    f41Var.f37445c.l();
                }
                if (obj9.length() != 0) {
                    qm0 qm0Var7 = f41Var.f37444b;
                    if (qm0Var7 != null) {
                        qm0Var7.setAdapter(f41Var.f37445c);
                        return;
                    }
                    return;
                } else if (f41Var.f37444b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.f37444b.setAdapter(f41Var.f37443a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((i91) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                bg1 bg1Var = ((fg1) this.h).f37593r0;
                if (!bg1Var.f36314b0.equals(obj10)) {
                    bg1Var.K(bg1Var.f29429e[0], bg1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                rh1 rh1Var = (rh1) this.h;
                rh1Var.h = editText.getText().toString();
                e71 e71Var = rh1Var.f26290a;
                if (e71Var != null) {
                    e71Var.W2.N(true);
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

    private final void w(gg.p0 p0Var) {
    }
}
