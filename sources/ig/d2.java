package ig;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import di.h2;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.bd0;
import org.telegram.ui.bu;
import org.telegram.ui.eg1;
import org.telegram.ui.gr0;
import org.telegram.ui.h41;
import org.telegram.ui.i91;
import org.telegram.ui.id0;
import org.telegram.ui.ov;
import org.telegram.ui.qh1;
import org.telegram.ui.rr;
import org.telegram.ui.t70;
import org.telegram.ui.u70;
import org.telegram.ui.ub;
import org.telegram.ui.vr;
import org.telegram.ui.wp;
import org.telegram.ui.xp;
import org.telegram.ui.zh0;
import org.telegram.ui.zt;
public final class d2 extends g5 {
    public final int f12055f;
    public final Object h;

    public d2(Object obj, int i10) {
        this.f12055f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f12055f) {
            case 14:
                ((gr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f12055f) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    v0Var.f21410e.clearFocus();
                    AndroidUtilities.hideKeyboard(v0Var.f21410e);
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
        switch (this.f12055f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.f12081e = null;
                e2Var.f12078a.Y2.N(true);
                e2Var.f12078a.u0(0);
                return;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.f41077z0 = "";
                ubVar.M.setVisibility(0);
                if (ubVar.Y) {
                    ubVar.Y = false;
                    ubVar.V0(true);
                    return;
                }
                return;
            case 2:
                xp xpVar = (xp) this.h;
                xpVar.f42877e.F(null);
                xpVar.N = false;
                xpVar.getClass();
                xpVar.f42875b.setAdapter(xpVar.f42874a);
                xpVar.f42874a.l();
                xpVar.f42875b.setFastScrollVisible(true);
                xpVar.f42875b.setVerticalScrollBarEnabled(false);
                xpVar.d.setShowAtCenter(false);
                View view = xpVar.fragmentView;
                int i10 = j6.f20634a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                xpVar.fragmentView.setTag(Integer.valueOf(i10));
                xpVar.d.b();
                return;
            case 3:
                vr vrVar = (vr) this.h;
                vrVar.f41667e.F(null);
                vrVar.f41689o1 = false;
                bi.o0 o0Var = vrVar.f41662c;
                o0Var.Y1 = false;
                o0Var.Z1 = 0;
                o0Var.setAdapter(vrVar.f41656a);
                vrVar.f41656a.l();
                vrVar.f41662c.setFastScrollVisible(true);
                vrVar.f41662c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = vrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.h;
                if (k8Var.h) {
                    k8Var.f27748f = false;
                    k8Var.h = false;
                    k8Var.setAllowNestedScroll(true);
                    k8Var.f27763s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = k8Var.f27754k0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ok okVar = (ok) this.h;
                okVar.f29113b0 = false;
                okVar.G.setVisibility(0);
                dk dkVar = okVar.f29119r;
                s4.h0 adapter = dkVar.getAdapter();
                hk hkVar = okVar.v;
                if (adapter != hkVar) {
                    dkVar.setAdapter(hkVar);
                }
                hkVar.l();
                okVar.f29123y.Y(null, true);
                return;
            case 6:
                gl glVar = (gl) this.h;
                glVar.f26466l0 = false;
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
                contactsActivity.f33386r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33373f.setAdapter(contactsActivity.d);
                contactsActivity.f33373f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33373f.setFastScrollVisible(true);
                contactsActivity.f33373f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33373f.getFastScroll().f30364h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                bu buVar = (bu) this.h;
                zt ztVar = buVar.d;
                ztVar.getClass();
                ztVar.f43540e = null;
                buVar.f34954f = false;
                buVar.f34953e = false;
                buVar.f34950a.setAdapter(buVar.f34952c);
                buVar.f34950a.setFastScrollVisible(true);
                return;
            case 9:
                ov ovVar = (ov) this.h;
                ovVar.f39344a.getActionBar().h(false);
                ovVar.f39345b.getActionBar().h(false);
                return;
            case 10:
                u70 u70Var = (u70) this.h;
                if (u70Var.M) {
                    t70.E(u70Var.f40985f, null);
                    u70Var.M = false;
                    u70Var.d.setAdapter(u70Var.f40984e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33444b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33444b.setAdapter(languageSelectActivity.f33443a);
                    return;
                }
                return;
            case 12:
                id0 id0Var = (id0) this.h;
                id0Var.f37353r0 = false;
                id0Var.f37355s0 = false;
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
                da0 da0Var = ((zh0) this.h).f43464a;
                da0Var.f49492y = false;
                da0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                h41 h41Var = (h41) this.h;
                h41Var.f36909f = null;
                if (h41Var.f36906b != null) {
                    h41Var.d.setVisibility(8);
                    h41Var.f36906b.setAdapter(h41Var.f36905a);
                    return;
                }
                return;
            case 17:
                i91 i91Var = (i91) this.h;
                i91Var.f37291a.a(false, true);
                i91Var.o0(false, true);
                i91Var.f37295c.Y2.N(false);
                return;
            case 18:
                eg1.b0((eg1) this.h, false);
                return;
            case 19:
                qh1 qh1Var = (qh1) this.h;
                qh1Var.h = null;
                x51 x51Var = qh1Var.f32876a;
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
        switch (this.f12055f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.f12078a.Y2.N(true);
                e2Var.f12078a.u0(0);
                return;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.M.setVisibility(8);
                ubVar.getClass();
                return;
            case 2:
                xp xpVar = (xp) this.h;
                xpVar.N = true;
                xpVar.d.setShowAtCenter(true);
                return;
            case 3:
                vr vrVar = (vr) this.h;
                vrVar.f41689o1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = vrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.h;
                k8Var.f27764s0 = k8Var.f27761r.N0();
                View m10 = k8Var.f27761r.m(k8Var.f27764s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                k8Var.f27765t0 = top;
                k8Var.h = true;
                k8Var.setAllowNestedScroll(false);
                k8Var.f27763s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = k8Var.f27754k0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                ok okVar = (ok) this.h;
                okVar.f29113b0 = true;
                okVar.G.setVisibility(8);
                okVar.f28780b.t1(okVar.F.getSearchField(), true);
                return;
            case 6:
                gl glVar = (gl) this.h;
                glVar.f26466l0 = true;
                glVar.f28780b.t1(glVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((bu) this.h).f34954f = true;
                return;
            case 9:
                ov ovVar = (ov) this.h;
                ovVar.f39344a.getActionBar().x("");
                ovVar.f39345b.getActionBar().x("");
                ovVar.f39346c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((id0) this.h).f37353r0 = true;
                return;
            case 13:
                ((zh0) this.h).f43464a.f49492y = true;
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f36779a.getActionBar().x("");
                gr0Var.f36780b.getActionBar().x("");
                gr0Var.f36781c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                i91 i91Var = (i91) this.h;
                i91Var.f37291a.a(true, true);
                i91Var.h.I("");
                i91Var.o0(false, true);
                i91Var.f37295c.Y2.N(false);
                return;
            case 18:
                eg1 eg1Var = (eg1) this.h;
                eg1.b0(eg1Var, true);
                ag1 ag1Var = eg1Var.f36087r0;
                if (!ag1Var.f34455b0.equals("")) {
                    ag1Var.K(ag1Var.f27044e[0], ag1Var.getCurrentPosition(), "", false);
                }
                eg1Var.f36087r0.setAlpha(0.0f);
                eg1Var.f36087r0.f34466n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(hg.q0 q0Var) {
        switch (this.f12055f) {
            case 5:
                ok okVar = (ok) this.h;
                nk nkVar = okVar.f29123y;
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
        switch (this.f12055f) {
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.Y = true;
                ubVar.f41077z0 = h2Var.getText().toString();
                ubVar.V0(true);
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f36779a.getActionBar().w();
                gr0Var.f36780b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        ll0 ll0Var;
        int h;
        bi.o0 o0Var;
        s4.h0 h0Var;
        switch (this.f12055f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.f12081e = editText.getText().toString();
                e2Var.f12078a.Y2.N(true);
                e2Var.f12078a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                xp xpVar = (xp) this.h;
                if (xpVar.f42877e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (ll0Var = xpVar.f42875b) != null) {
                        s4.h0 adapter = ll0Var.getAdapter();
                        wp wpVar = xpVar.f42877e;
                        if (adapter != wpVar) {
                            xpVar.f42875b.setAdapter(wpVar);
                            View view = xpVar.fragmentView;
                            int i10 = j6.f20690d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
                            xpVar.fragmentView.setTag(Integer.valueOf(i10));
                            xpVar.f42877e.l();
                            xpVar.f42875b.setFastScrollVisible(false);
                            xpVar.f42875b.setVerticalScrollBarEnabled(true);
                            xpVar.d.b();
                        }
                    }
                    xpVar.f42877e.F(obj);
                    return;
                }
                return;
            case 3:
                vr vrVar = (vr) this.h;
                if (vrVar.f41667e != null) {
                    String obj2 = editText.getText().toString();
                    if (vrVar.f41662c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = vrVar.f41662c.getAdapter().h();
                    }
                    vrVar.f41667e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (o0Var = vrVar.f41662c) != null) {
                        s4.h0 adapter2 = o0Var.getAdapter();
                        rr rrVar = vrVar.f41656a;
                        if (adapter2 != rrVar) {
                            bi.o0 o0Var2 = vrVar.f41662c;
                            o0Var2.Y1 = false;
                            o0Var2.Z1 = 0;
                            o0Var2.setAdapter(rrVar);
                            if (h == 0) {
                                vrVar.y0(0);
                            }
                        }
                    }
                    vrVar.D1.setVisibility(8);
                    vrVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.h;
                if (editText.length() > 0) {
                    k8Var.f27763s.E(editText.getText().toString());
                    return;
                }
                k8Var.f27748f = false;
                k8Var.f27763s.E(null);
                return;
            case 5:
                ((ok) this.h).f29123y.Y(editText.getText().toString(), false);
                return;
            case 6:
                gl glVar = (gl) this.h;
                ah.y yVar = glVar.N;
                bi.o0 o0Var3 = glVar.P;
                ll0 ll0Var2 = glVar.Q;
                al alVar = glVar.R;
                if (alVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        glVar.m0 = true;
                        glVar.E.setShowSearchProgress(true);
                        o0Var3.setVisibility(8);
                        yVar.setVisibility(8);
                        if (ll0Var2.getAdapter() != alVar) {
                            ll0Var2.setAdapter(alVar);
                        }
                        ll0Var2.setVisibility(0);
                        if (alVar.f11026s.size() == 0 && alVar.f11025r.size() == 0) {
                            z10 = true;
                        }
                        glVar.f26468n0 = z10;
                        glVar.f0();
                    } else {
                        o0Var3.setVisibility(0);
                        yVar.setVisibility(0);
                        ll0Var2.setAdapter(null);
                        ll0Var2.setVisibility(8);
                        glVar.v.setVisibility(8);
                    }
                    alVar.G(obj3, glVar.f26473r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f33386r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33368c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33377i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        ll0 ll0Var3 = contactsActivity.f33373f;
                        if (ll0Var3 != null) {
                            ll0Var3.setAdapter(contactsActivity.f33386r);
                            contactsActivity.f33373f.setSectionsType(0);
                            contactsActivity.f33386r.l();
                            contactsActivity.f33373f.setFastScrollVisible(false);
                            contactsActivity.f33373f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f33371e.e(true, true);
                        contactsActivity.f33386r.G(obj4);
                        return;
                    }
                    ll0 ll0Var4 = contactsActivity.f33373f;
                    if (ll0Var4 != null) {
                        ll0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33373f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                bu buVar = (bu) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    zt ztVar = buVar.d;
                    ztVar.getClass();
                    ztVar.f43540e = null;
                    buVar.f34953e = false;
                    buVar.f34950a.setAdapter(buVar.f34952c);
                    buVar.f34950a.setFastScrollVisible(true);
                    return;
                }
                zt ztVar2 = buVar.d;
                ztVar2.getClass();
                if (obj5 == null) {
                    ztVar2.f43540e = null;
                } else {
                    try {
                        Timer timer = ztVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Timer timer2 = new Timer();
                    ztVar2.d = timer2;
                    timer2.schedule(new hg.s1(ztVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    buVar.f34953e = true;
                    return;
                }
                return;
            case 9:
                ov ovVar = (ov) this.h;
                ovVar.f39344a.getActionBar().setSearchFieldText(editText.getText().toString());
                ovVar.f39345b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                u70 u70Var = (u70) this.h;
                t70.E(u70Var.f40985f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != u70Var.M) {
                    u70Var.M = z11;
                    ll0 ll0Var5 = u70Var.d;
                    if (ll0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = u70Var.f40985f;
                        } else {
                            h0Var = u70Var.f40984e;
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
                    ll0 ll0Var6 = languageSelectActivity.f33444b;
                    if (ll0Var6 != null) {
                        ll0Var6.setAdapter(languageSelectActivity.f33445c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33444b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33444b.setAdapter(languageSelectActivity.f33443a);
                    return;
                }
                return;
            case 12:
                id0 id0Var = (id0) this.h;
                if (id0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        id0Var.f37355s0 = true;
                        id0Var.f37359w.setShowSearchProgress(true);
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
                        id0Var.f37356t0 = z12;
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
                    id0Var.W.G(obj8, id0Var.f37362x0);
                    return;
                }
                return;
            case 13:
                ((zh0) this.h).f43464a.j(editText.getText().toString());
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f36779a.getActionBar().setSearchFieldText(editText.getText().toString());
                gr0Var.f36780b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).f33913e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                h41 h41Var = (h41) this.h;
                if (obj9 == null) {
                    h41Var.f36909f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = h41Var.f36909f;
                    if (arrayList == null) {
                        h41Var.f36909f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < h41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) h41Var.h.get(i11);
                        if (language.f17129q.startsWith(lowerCase)) {
                            h41Var.f36909f.add(0, language);
                        } else if (language.f17129q.contains(lowerCase)) {
                            h41Var.f36909f.add(language);
                        }
                    }
                    h41Var.f36907c.l();
                }
                if (obj9.length() != 0) {
                    ll0 ll0Var7 = h41Var.f36906b;
                    if (ll0Var7 != null) {
                        ll0Var7.setAdapter(h41Var.f36907c);
                        return;
                    }
                    return;
                } else if (h41Var.f36906b != null) {
                    h41Var.d.setVisibility(8);
                    h41Var.f36906b.setAdapter(h41Var.f36905a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((i91) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                ag1 ag1Var = ((eg1) this.h).f36087r0;
                if (!ag1Var.f34455b0.equals(obj10)) {
                    ag1Var.K(ag1Var.f27044e[0], ag1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                qh1 qh1Var = (qh1) this.h;
                qh1Var.h = editText.getText().toString();
                x51 x51Var = qh1Var.f32876a;
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

    private final void w(hg.q0 q0Var) {
    }
}
