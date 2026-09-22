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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.y51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.au;
import org.telegram.ui.bd0;
import org.telegram.ui.eg1;
import org.telegram.ui.f41;
import org.telegram.ui.f91;
import org.telegram.ui.gr0;
import org.telegram.ui.id0;
import org.telegram.ui.nv;
import org.telegram.ui.qh1;
import org.telegram.ui.qr;
import org.telegram.ui.s70;
import org.telegram.ui.t70;
import org.telegram.ui.ub;
import org.telegram.ui.ur;
import org.telegram.ui.vp;
import org.telegram.ui.wp;
import org.telegram.ui.yt;
import org.telegram.ui.zh0;
public final class e2 extends g5 {
    public final int f10259f;
    public final Object h;

    public e2(Object obj, int i10) {
        this.f10259f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f10259f) {
            case 14:
                ((gr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f10259f) {
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
        switch (this.f10259f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = false;
                f2Var.e = null;
                f2Var.f10281a.Y2.N(true);
                f2Var.f10281a.u0(0);
                return;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.f37930v0 = "";
                ubVar.I.setVisibility(0);
                if (ubVar.U) {
                    ubVar.U = false;
                    ubVar.U0(true);
                    return;
                }
                return;
            case 2:
                wp wpVar = (wp) this.h;
                wpVar.e.F(null);
                wpVar.N = false;
                wpVar.getClass();
                wpVar.f39344b.setAdapter(wpVar.f39343a);
                wpVar.f39343a.l();
                wpVar.f39344b.setFastScrollVisible(true);
                wpVar.f39344b.setVerticalScrollBarEnabled(false);
                wpVar.d.setShowAtCenter(false);
                View view = wpVar.fragmentView;
                int i10 = i6.f18778a7;
                view.setBackgroundColor(i6.w0(null, i10, false));
                wpVar.fragmentView.setTag(Integer.valueOf(i10));
                wpVar.d.b();
                return;
            case 3:
                ur urVar = (ur) this.h;
                urVar.e.F(null);
                urVar.f38139o1 = false;
                ai.w0 w0Var = urVar.f38113c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(urVar.f38107a);
                urVar.f38107a.l();
                urVar.f38113c.setFastScrollVisible(true);
                urVar.f38113c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = urVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                h8 h8Var = (h8) this.h;
                if (h8Var.h) {
                    h8Var.f24561f = false;
                    h8Var.h = false;
                    h8Var.setAllowNestedScroll(true);
                    h8Var.f24576s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = h8Var.f24567k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ok okVar = (ok) this.h;
                okVar.f26815b0 = false;
                okVar.G.setVisibility(0);
                dk dkVar = okVar.f26821r;
                s4.h0 adapter = dkVar.getAdapter();
                hk hkVar = okVar.v;
                if (adapter != hkVar) {
                    dkVar.setAdapter(hkVar);
                }
                hkVar.l();
                okVar.f26825y.Y(null, true);
                return;
            case 6:
                gl glVar = (gl) this.h;
                glVar.f24396l0 = false;
                glVar.m0 = false;
                glVar.R.G(null, null);
                glVar.f0();
                glVar.P.setVisibility(0);
                glVar.N.setVisibility(0);
                glVar.Q.setVisibility(8);
                glVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f30752r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f30739f.setAdapter(contactsActivity.d);
                contactsActivity.f30739f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f30739f.setFastScrollVisible(true);
                contactsActivity.f30739f.setVerticalScrollBarEnabled(false);
                contactsActivity.f30739f.getFastScroll().f27893h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                au auVar = (au) this.h;
                yt ytVar = auVar.d;
                ytVar.getClass();
                ytVar.e = null;
                auVar.f31936f = false;
                auVar.e = false;
                auVar.f31933a.setAdapter(auVar.f31935c);
                auVar.f31933a.setFastScrollVisible(true);
                return;
            case 9:
                nv nvVar = (nv) this.h;
                nvVar.f36052a.getActionBar().h(false);
                nvVar.f36053b.getActionBar().h(false);
                return;
            case 10:
                t70 t70Var = (t70) this.h;
                if (t70Var.M) {
                    s70.E(t70Var.f37587f, null);
                    t70Var.M = false;
                    t70Var.d.setAdapter(t70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f30806b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f30806b.setAdapter(languageSelectActivity.f30805a);
                    return;
                }
                return;
            case 12:
                id0 id0Var = (id0) this.h;
                id0Var.f34628r0 = false;
                id0Var.f34630s0 = false;
                id0Var.W.G(null, null);
                id0Var.B0();
                if (id0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = id0Var.Z;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    id0Var.U.setVisibility(0);
                    id0Var.S.setVisibility(0);
                    id0Var.V.setAdapter(null);
                    id0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                ca0 ca0Var = ((zh0) this.h).f40206a;
                ca0Var.f45127y = false;
                ca0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                f41 f41Var = (f41) this.h;
                f41Var.f33497f = null;
                if (f41Var.f33495b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.f33495b.setAdapter(f41Var.f33494a);
                    return;
                }
                return;
            case 17:
                f91 f91Var = (f91) this.h;
                f91Var.f33542a.a(false, true);
                f91Var.o0(false, true);
                f91Var.f33546c.Y2.N(false);
                return;
            case 18:
                eg1.b0((eg1) this.h, false);
                return;
            case 19:
                qh1 qh1Var = (qh1) this.h;
                qh1Var.h = null;
                y51 y51Var = qh1Var.f30482a;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f10259f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = true;
                f2Var.f10281a.Y2.N(true);
                f2Var.f10281a.u0(0);
                return;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.I.setVisibility(8);
                ubVar.getClass();
                return;
            case 2:
                wp wpVar = (wp) this.h;
                wpVar.N = true;
                wpVar.d.setShowAtCenter(true);
                return;
            case 3:
                ur urVar = (ur) this.h;
                urVar.f38139o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = urVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                h8 h8Var = (h8) this.h;
                h8Var.f24577s0 = h8Var.f24574r.N0();
                View m10 = h8Var.f24574r.m(h8Var.f24577s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                h8Var.f24578t0 = top;
                h8Var.h = true;
                h8Var.setAllowNestedScroll(false);
                h8Var.f24576s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = h8Var.f24567k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                ok okVar = (ok) this.h;
                okVar.f26815b0 = true;
                okVar.G.setVisibility(8);
                okVar.f26461b.t1(okVar.F.getSearchField(), true);
                return;
            case 6:
                gl glVar = (gl) this.h;
                glVar.f24396l0 = true;
                glVar.f26461b.t1(glVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((au) this.h).f31936f = true;
                return;
            case 9:
                nv nvVar = (nv) this.h;
                nvVar.f36052a.getActionBar().x("");
                nvVar.f36053b.getActionBar().x("");
                nvVar.f36054c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((id0) this.h).f34628r0 = true;
                return;
            case 13:
                ((zh0) this.h).f40206a.f45127y = true;
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f33923a.getActionBar().x("");
                gr0Var.f33924b.getActionBar().x("");
                gr0Var.f33925c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                f91 f91Var = (f91) this.h;
                f91Var.f33542a.a(true, true);
                f91Var.h.I("");
                f91Var.o0(false, true);
                f91Var.f33546c.Y2.N(false);
                return;
            case 18:
                eg1 eg1Var = (eg1) this.h;
                eg1.b0(eg1Var, true);
                ag1 ag1Var = eg1Var.f33325r0;
                if (!ag1Var.f31806b0.equals("")) {
                    ag1Var.K(ag1Var.e[0], ag1Var.getCurrentPosition(), "", false);
                }
                eg1Var.f33325r0.setAlpha(0.0f);
                eg1Var.f33325r0.f31817n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f10259f) {
            case 5:
                ok okVar = (ok) this.h;
                nk nkVar = okVar.f26825y;
                nkVar.R.remove(q0Var);
                nkVar.Y(okVar.F.getSearchField().getText().toString(), false);
                nkVar.a0(null, null, true);
                return;
            case 18:
            default:
                return;
        }
    }

    @Override
    public void p(h2 h2Var) {
        switch (this.f10259f) {
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.U = true;
                ubVar.f37930v0 = h2Var.getText().toString();
                ubVar.U0(true);
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f33923a.getActionBar().w();
                gr0Var.f33924b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        ll0 ll0Var;
        int h;
        ai.w0 w0Var;
        s4.h0 h0Var;
        switch (this.f10259f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.e = editText.getText().toString();
                f2Var.f10281a.Y2.N(true);
                f2Var.f10281a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                wp wpVar = (wp) this.h;
                if (wpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (ll0Var = wpVar.f39344b) != null) {
                        s4.h0 adapter = ll0Var.getAdapter();
                        vp vpVar = wpVar.e;
                        if (adapter != vpVar) {
                            wpVar.f39344b.setAdapter(vpVar);
                            View view = wpVar.fragmentView;
                            int i10 = i6.f18834d6;
                            view.setBackgroundColor(i6.w0(null, i10, false));
                            wpVar.fragmentView.setTag(Integer.valueOf(i10));
                            wpVar.e.l();
                            wpVar.f39344b.setFastScrollVisible(false);
                            wpVar.f39344b.setVerticalScrollBarEnabled(true);
                            wpVar.d.b();
                        }
                    }
                    wpVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                ur urVar = (ur) this.h;
                if (urVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (urVar.f38113c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = urVar.f38113c.getAdapter().h();
                    }
                    urVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = urVar.f38113c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        qr qrVar = urVar.f38107a;
                        if (adapter2 != qrVar) {
                            ai.w0 w0Var2 = urVar.f38113c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(qrVar);
                            if (h == 0) {
                                urVar.y0(0);
                            }
                        }
                    }
                    urVar.D1.setVisibility(8);
                    urVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                h8 h8Var = (h8) this.h;
                if (editText.length() > 0) {
                    h8Var.f24576s.E(editText.getText().toString());
                    return;
                }
                h8Var.f24561f = false;
                h8Var.f24576s.E(null);
                return;
            case 5:
                ((ok) this.h).f26825y.Y(editText.getText().toString(), false);
                return;
            case 6:
                gl glVar = (gl) this.h;
                ai.f0 f0Var = glVar.N;
                ai.w0 w0Var3 = glVar.P;
                ll0 ll0Var2 = glVar.Q;
                al alVar = glVar.R;
                if (alVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        glVar.m0 = true;
                        glVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (ll0Var2.getAdapter() != alVar) {
                            ll0Var2.setAdapter(alVar);
                        }
                        ll0Var2.setVisibility(0);
                        if (alVar.f9678s.size() == 0 && alVar.f9677r.size() == 0) {
                            z10 = true;
                        }
                        glVar.f24398n0 = z10;
                        glVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        ll0Var2.setAdapter(null);
                        ll0Var2.setVisibility(8);
                        glVar.v.setVisibility(8);
                    }
                    alVar.G(obj3, glVar.f24403r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f30752r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f30735c.a(!obj4.isEmpty(), true);
                    contactsActivity.f30743i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        ll0 ll0Var3 = contactsActivity.f30739f;
                        if (ll0Var3 != null) {
                            ll0Var3.setAdapter(contactsActivity.f30752r);
                            contactsActivity.f30739f.setSectionsType(0);
                            contactsActivity.f30752r.l();
                            contactsActivity.f30739f.setFastScrollVisible(false);
                            contactsActivity.f30739f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f30752r.G(obj4);
                        return;
                    }
                    ll0 ll0Var4 = contactsActivity.f30739f;
                    if (ll0Var4 != null) {
                        ll0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f30739f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                au auVar = (au) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    yt ytVar = auVar.d;
                    ytVar.getClass();
                    ytVar.e = null;
                    auVar.e = false;
                    auVar.f31933a.setAdapter(auVar.f31935c);
                    auVar.f31933a.setFastScrollVisible(true);
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
            case 9:
                nv nvVar = (nv) this.h;
                nvVar.f36052a.getActionBar().setSearchFieldText(editText.getText().toString());
                nvVar.f36053b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                t70 t70Var = (t70) this.h;
                s70.E(t70Var.f37587f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != t70Var.M) {
                    t70Var.M = z11;
                    ll0 ll0Var5 = t70Var.d;
                    if (ll0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = t70Var.f37587f;
                        } else {
                            h0Var = t70Var.e;
                        }
                        ll0Var5.setAdapter(h0Var);
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
                    ll0 ll0Var6 = languageSelectActivity.f30806b;
                    if (ll0Var6 != null) {
                        ll0Var6.setAdapter(languageSelectActivity.f30807c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f30806b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f30806b.setAdapter(languageSelectActivity.f30805a);
                    return;
                }
                return;
            case 12:
                id0 id0Var = (id0) this.h;
                if (id0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        id0Var.f34630s0 = true;
                        id0Var.f34634w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = id0Var.Z;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        id0Var.U.setVisibility(8);
                        id0Var.S.setVisibility(8);
                        s4.h0 adapter3 = id0Var.V.getAdapter();
                        bd0 bd0Var = id0Var.W;
                        if (adapter3 != bd0Var) {
                            id0Var.V.setAdapter(bd0Var);
                        }
                        id0Var.V.setVisibility(0);
                        if (id0Var.W.h() == 0) {
                            z12 = true;
                        }
                        id0Var.f34631t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = id0Var.Z;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        id0Var.U.setVisibility(0);
                        id0Var.S.setVisibility(0);
                        id0Var.V.setAdapter(null);
                        id0Var.V.setVisibility(8);
                    }
                    id0Var.B0();
                    id0Var.W.G(obj8, id0Var.f34637x0);
                    return;
                }
                return;
            case 13:
                ((zh0) this.h).f40206a.j(editText.getText().toString());
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f33923a.getActionBar().setSearchFieldText(editText.getText().toString());
                gr0Var.f33924b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                f41 f41Var = (f41) this.h;
                if (obj9 == null) {
                    f41Var.f33497f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = f41Var.f33497f;
                    if (arrayList == null) {
                        f41Var.f33497f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < f41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) f41Var.h.get(i11);
                        if (language.f15622q.startsWith(lowerCase)) {
                            f41Var.f33497f.add(0, language);
                        } else if (language.f15622q.contains(lowerCase)) {
                            f41Var.f33497f.add(language);
                        }
                    }
                    f41Var.f33496c.l();
                }
                if (obj9.length() != 0) {
                    ll0 ll0Var7 = f41Var.f33495b;
                    if (ll0Var7 != null) {
                        ll0Var7.setAdapter(f41Var.f33496c);
                        return;
                    }
                    return;
                } else if (f41Var.f33495b != null) {
                    f41Var.d.setVisibility(8);
                    f41Var.f33495b.setAdapter(f41Var.f33494a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((f91) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                ag1 ag1Var = ((eg1) this.h).f33325r0;
                if (!ag1Var.f31806b0.equals(obj10)) {
                    ag1Var.K(ag1Var.e[0], ag1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                qh1 qh1Var = (qh1) this.h;
                qh1Var.h = editText.getText().toString();
                y51 y51Var = qh1Var.f30482a;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
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
