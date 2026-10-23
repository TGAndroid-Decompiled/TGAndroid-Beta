package ig;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c81;
import org.telegram.ui.cv;
import org.telegram.ui.d70;
import org.telegram.ui.e70;
import org.telegram.ui.fr;
import org.telegram.ui.jg1;
import org.telegram.ui.jp;
import org.telegram.ui.jr;
import org.telegram.ui.kp;
import org.telegram.ui.lc0;
import org.telegram.ui.nh0;
import org.telegram.ui.pt;
import org.telegram.ui.rq0;
import org.telegram.ui.rt;
import org.telegram.ui.sc0;
import org.telegram.ui.te1;
import org.telegram.ui.v21;
import org.telegram.ui.vb;
import org.telegram.ui.ye1;
public final class b2 extends k5 {
    public final int f12862r;
    public final Object f12863s;

    public b2(Object obj, int i10) {
        this.f12862r = i10;
        this.f12863s = obj;
    }

    @Override
    public boolean b() {
        switch (this.f12862r) {
            case 14:
                ((rq0) this.f12863s).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f12862r) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.f12863s;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                    u0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(u0Var.e);
                }
                if (profileActivity.X1) {
                    profileActivity.V0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.X1);
            default:
                return super.h();
        }
    }

    @Override
    public void m() {
        switch (this.f12862r) {
            case 0:
                c2 c2Var = (c2) this.f12863s;
                c2Var.d = false;
                c2Var.e = null;
                c2Var.f12885a.Z2.N(true);
                c2Var.f12885a.u0(0);
                return;
            case 1:
                vb vbVar = (vb) this.f12863s;
                vbVar.f42705v0 = "";
                vbVar.I.setVisibility(0);
                if (vbVar.U) {
                    vbVar.U = false;
                    vbVar.U0(true);
                    return;
                }
                return;
            case 2:
                kp kpVar = (kp) this.f12863s;
                kpVar.e.F(null);
                kpVar.N = false;
                kpVar.getClass();
                kpVar.f39021b.setAdapter(kpVar.f39020a);
                kpVar.f39020a.l();
                kpVar.f39021b.setFastScrollVisible(true);
                kpVar.f39021b.setVerticalScrollBarEnabled(false);
                kpVar.d.setShowAtCenter(false);
                View view = kpVar.fragmentView;
                int i10 = k6.f21125a7;
                r6.i(i10, view, null);
                kpVar.fragmentView.setTag(Integer.valueOf(i10));
                kpVar.d.b();
                return;
            case 3:
                jr jrVar = (jr) this.f12863s;
                jrVar.e.F(null);
                jrVar.f38660o1 = false;
                ai.u1 u1Var = jrVar.f38634c;
                u1Var.W1 = false;
                u1Var.X1 = 0;
                u1Var.setAdapter(jrVar.f38628a);
                jrVar.f38628a.l();
                jrVar.f38634c.setFastScrollVisible(true);
                jrVar.f38634c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12863s;
                if (k8Var.h) {
                    k8Var.f27921f = false;
                    k8Var.h = false;
                    k8Var.setAllowNestedScroll(true);
                    k8Var.f27936s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.f27926j0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f12863s;
                nkVar.f28971b0 = false;
                nkVar.G.setVisibility(0);
                ck ckVar = nkVar.f28977r;
                s4.g0 adapter = ckVar.getAdapter();
                gk gkVar = nkVar.v;
                if (adapter != gkVar) {
                    ckVar.setAdapter(gkVar);
                }
                gkVar.l();
                nkVar.f28981y.Y(null, true);
                return;
            case 6:
                rl rlVar = (rl) this.f12863s;
                rlVar.f30199j0 = false;
                rlVar.f30200k0 = false;
                rlVar.P.G(null, null);
                rlVar.j0();
                rlVar.N.setVisibility(0);
                rlVar.L.setVisibility(0);
                rlVar.O.setVisibility(8);
                rlVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12863s;
                contactsActivity.f33398r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33385f.setAdapter(contactsActivity.d);
                contactsActivity.f33385f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33385f.setFastScrollVisible(true);
                contactsActivity.f33385f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33385f.getFastScroll().f30831h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.d0(contactsActivity);
                return;
            case 8:
                rt rtVar = (rt) this.f12863s;
                pt ptVar = rtVar.d;
                ptVar.getClass();
                ptVar.e = null;
                rtVar.f41243f = false;
                rtVar.e = false;
                rtVar.f41240a.setAdapter(rtVar.f41242c);
                rtVar.f41240a.setFastScrollVisible(true);
                return;
            case 9:
                cv cvVar = (cv) this.f12863s;
                cvVar.f36429a.getActionBar().g(false);
                cvVar.f36430b.getActionBar().g(false);
                return;
            case 10:
                e70 e70Var = (e70) this.f12863s;
                if (e70Var.M) {
                    d70.E(e70Var.f36837f, null);
                    e70Var.M = false;
                    e70Var.d.setAdapter(e70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f12863s;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33452b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33452b.setAdapter(languageSelectActivity.f33451a);
                    return;
                }
                return;
            case 12:
                sc0 sc0Var = (sc0) this.f12863s;
                sc0Var.f41369r0 = false;
                sc0Var.f41371s0 = false;
                sc0Var.W.G(null, null);
                sc0Var.B0();
                if (sc0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = sc0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    sc0Var.U.setVisibility(0);
                    sc0Var.S.setVisibility(0);
                    sc0Var.V.setAdapter(null);
                    sc0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                ya0 ya0Var = ((nh0) this.f12863s).f39873a;
                ya0Var.f50327y = false;
                ya0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                v21 v21Var = (v21) this.f12863s;
                v21Var.f42580f = null;
                if (v21Var.f42578b != null) {
                    v21Var.d.setVisibility(8);
                    v21Var.f42578b.setAdapter(v21Var.f42577a);
                    return;
                }
                return;
            case 17:
                c81 c81Var = (c81) this.f12863s;
                c81Var.f36290a.a(false, true);
                c81Var.q0(false, true);
                c81Var.f36294c.Z2.N(false);
                return;
            case 18:
                ye1.a0((ye1) this.f12863s, false);
                return;
            case 19:
                jg1 jg1Var = (jg1) this.f12863s;
                jg1Var.h = null;
                d71 d71Var = jg1Var.f25907a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f12862r) {
            case 0:
                c2 c2Var = (c2) this.f12863s;
                c2Var.d = true;
                c2Var.f12885a.Z2.N(true);
                c2Var.f12885a.u0(0);
                return;
            case 1:
                vb vbVar = (vb) this.f12863s;
                vbVar.I.setVisibility(8);
                vbVar.getClass();
                return;
            case 2:
                kp kpVar = (kp) this.f12863s;
                kpVar.N = true;
                kpVar.d.setShowAtCenter(true);
                return;
            case 3:
                jr jrVar = (jr) this.f12863s;
                jrVar.f38660o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12863s;
                k8Var.f27935r0 = k8Var.f27934r.N0();
                View m10 = k8Var.f27934r.m(k8Var.f27935r0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                k8Var.f27937s0 = top;
                k8Var.h = true;
                k8Var.setAllowNestedScroll(false);
                k8Var.f27936s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.f27926j0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f12863s;
                nkVar.f28971b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.f28366b.z1(nkVar.F.getSearchField(), true);
                return;
            case 6:
                rl rlVar = (rl) this.f12863s;
                rlVar.f30199j0 = true;
                rlVar.f28366b.z1(rlVar.f30216x.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12863s;
                contactsActivity.F = true;
                ContactsActivity.d0(contactsActivity);
                return;
            case 8:
                ((rt) this.f12863s).f41243f = true;
                return;
            case 9:
                cv cvVar = (cv) this.f12863s;
                cvVar.f36429a.getActionBar().x("");
                cvVar.f36430b.getActionBar().x("");
                cvVar.f36431c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.f12863s).getClass();
                return;
            case 12:
                ((sc0) this.f12863s).f41369r0 = true;
                return;
            case 13:
                ((nh0) this.f12863s).f39873a.f50327y = true;
                return;
            case 14:
                rq0 rq0Var = (rq0) this.f12863s;
                rq0Var.f41223a.getActionBar().x("");
                rq0Var.f41224b.getActionBar().x("");
                rq0Var.f41225c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                c81 c81Var = (c81) this.f12863s;
                c81Var.f36290a.a(true, true);
                c81Var.h.I("");
                c81Var.q0(false, true);
                c81Var.f36294c.Z2.N(false);
                return;
            case 18:
                ye1 ye1Var = (ye1) this.f12863s;
                ye1.a0(ye1Var, true);
                te1 te1Var = ye1Var.f43829r0;
                if (!te1Var.f41975b0.equals("")) {
                    te1Var.K(te1Var.e[0], te1Var.getCurrentPosition(), "", false);
                }
                ye1Var.f43829r0.setAlpha(0.0f);
                ye1Var.f43829r0.f41986n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(hg.o0 o0Var) {
        switch (this.f12862r) {
            case 5:
                nk nkVar = (nk) this.f12863s;
                mk mkVar = nkVar.f28981y;
                mkVar.R.remove(o0Var);
                mkVar.Y(nkVar.F.getSearchField().getText().toString(), false);
                mkVar.a0(null, null, true);
                return;
            case 18:
            default:
                return;
        }
    }

    @Override
    public void p(ei.e2 e2Var) {
        switch (this.f12862r) {
            case 1:
                vb vbVar = (vb) this.f12863s;
                vbVar.U = true;
                vbVar.f42705v0 = e2Var.getText().toString();
                vbVar.U0(true);
                return;
            case 14:
                rq0 rq0Var = (rq0) this.f12863s;
                rq0Var.f41223a.getActionBar().w();
                rq0Var.f41224b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        mm0 mm0Var;
        int h;
        ai.u1 u1Var;
        s4.g0 g0Var;
        switch (this.f12862r) {
            case 0:
                c2 c2Var = (c2) this.f12863s;
                c2Var.e = editText.getText().toString();
                c2Var.f12885a.Z2.N(true);
                c2Var.f12885a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                kp kpVar = (kp) this.f12863s;
                if (kpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (mm0Var = kpVar.f39021b) != null) {
                        s4.g0 adapter = mm0Var.getAdapter();
                        jp jpVar = kpVar.e;
                        if (adapter != jpVar) {
                            kpVar.f39021b.setAdapter(jpVar);
                            View view = kpVar.fragmentView;
                            int i10 = k6.f21183d6;
                            r6.i(i10, view, null);
                            kpVar.fragmentView.setTag(Integer.valueOf(i10));
                            kpVar.e.l();
                            kpVar.f39021b.setFastScrollVisible(false);
                            kpVar.f39021b.setVerticalScrollBarEnabled(true);
                            kpVar.d.b();
                        }
                    }
                    kpVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                jr jrVar = (jr) this.f12863s;
                if (jrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (jrVar.f38634c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = jrVar.f38634c.getAdapter().h();
                    }
                    jrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (u1Var = jrVar.f38634c) != null) {
                        s4.g0 adapter2 = u1Var.getAdapter();
                        fr frVar = jrVar.f38628a;
                        if (adapter2 != frVar) {
                            ai.u1 u1Var2 = jrVar.f38634c;
                            u1Var2.W1 = false;
                            u1Var2.X1 = 0;
                            u1Var2.setAdapter(frVar);
                            if (h == 0) {
                                jrVar.y0(0);
                            }
                        }
                    }
                    jrVar.D1.setVisibility(8);
                    jrVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12863s;
                if (editText.length() > 0) {
                    k8Var.f27936s.E(editText.getText().toString());
                    return;
                }
                k8Var.f27921f = false;
                k8Var.f27936s.E(null);
                return;
            case 5:
                ((nk) this.f12863s).f28981y.Y(editText.getText().toString(), false);
                return;
            case 6:
                rl rlVar = (rl) this.f12863s;
                ah.x xVar = rlVar.L;
                ai.u1 u1Var3 = rlVar.N;
                mm0 mm0Var2 = rlVar.O;
                ll llVar = rlVar.P;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        rlVar.f30200k0 = true;
                        rlVar.f30216x.setShowSearchProgress(true);
                        u1Var3.setVisibility(8);
                        xVar.setVisibility(8);
                        if (mm0Var2.getAdapter() != llVar) {
                            mm0Var2.setAdapter(llVar);
                        }
                        mm0Var2.setVisibility(0);
                        if (llVar.f11845s.size() == 0 && llVar.f11844r.size() == 0) {
                            z10 = true;
                        }
                        rlVar.f30201l0 = z10;
                        rlVar.j0();
                    } else {
                        u1Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        mm0Var2.setAdapter(null);
                        mm0Var2.setVisibility(8);
                        rlVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, rlVar.f30205p0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12863s;
                if (contactsActivity.f33398r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33381c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33389i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        mm0 mm0Var3 = contactsActivity.f33385f;
                        if (mm0Var3 != null) {
                            mm0Var3.setAdapter(contactsActivity.f33398r);
                            contactsActivity.f33385f.setSectionsType(0);
                            contactsActivity.f33398r.l();
                            contactsActivity.f33385f.setFastScrollVisible(false);
                            contactsActivity.f33385f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f33398r.G(obj4);
                        return;
                    }
                    mm0 mm0Var4 = contactsActivity.f33385f;
                    if (mm0Var4 != null) {
                        mm0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33385f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                rt rtVar = (rt) this.f12863s;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    pt ptVar = rtVar.d;
                    ptVar.getClass();
                    ptVar.e = null;
                    rtVar.e = false;
                    rtVar.f41240a.setAdapter(rtVar.f41242c);
                    rtVar.f41240a.setFastScrollVisible(true);
                    return;
                }
                pt ptVar2 = rtVar.d;
                ptVar2.getClass();
                if (obj5 == null) {
                    ptVar2.e = null;
                } else {
                    try {
                        Timer timer = ptVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    ptVar2.d = timer2;
                    timer2.schedule(new hg.r1(ptVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    rtVar.e = true;
                    return;
                }
                return;
            case 9:
                cv cvVar = (cv) this.f12863s;
                cvVar.f36429a.getActionBar().setSearchFieldText(editText.getText().toString());
                cvVar.f36430b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                e70 e70Var = (e70) this.f12863s;
                d70.E(e70Var.f36837f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != e70Var.M) {
                    e70Var.M = z11;
                    mm0 mm0Var5 = e70Var.d;
                    if (mm0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = e70Var.f36837f;
                        } else {
                            g0Var = e70Var.e;
                        }
                        mm0Var5.setAdapter(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f12863s;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    mm0 mm0Var6 = languageSelectActivity.f33452b;
                    if (mm0Var6 != null) {
                        mm0Var6.setAdapter(languageSelectActivity.f33453c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33452b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33452b.setAdapter(languageSelectActivity.f33451a);
                    return;
                }
                return;
            case 12:
                sc0 sc0Var = (sc0) this.f12863s;
                if (sc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        sc0Var.f41371s0 = true;
                        sc0Var.f41375w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = sc0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        sc0Var.U.setVisibility(8);
                        sc0Var.S.setVisibility(8);
                        s4.g0 adapter3 = sc0Var.V.getAdapter();
                        lc0 lc0Var = sc0Var.W;
                        if (adapter3 != lc0Var) {
                            sc0Var.V.setAdapter(lc0Var);
                        }
                        sc0Var.V.setVisibility(0);
                        if (sc0Var.W.h() == 0) {
                            z12 = true;
                        }
                        sc0Var.f41372t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = sc0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        sc0Var.U.setVisibility(0);
                        sc0Var.S.setVisibility(0);
                        sc0Var.V.setAdapter(null);
                        sc0Var.V.setVisibility(8);
                    }
                    sc0Var.B0();
                    sc0Var.W.G(obj8, sc0Var.f41378x0);
                    return;
                }
                return;
            case 13:
                ((nh0) this.f12863s).f39873a.j(editText.getText().toString());
                return;
            case 14:
                rq0 rq0Var = (rq0) this.f12863s;
                rq0Var.f41223a.getActionBar().setSearchFieldText(editText.getText().toString());
                rq0Var.f41224b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.f12863s).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                v21 v21Var = (v21) this.f12863s;
                if (obj9 == null) {
                    v21Var.f42580f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = v21Var.f42580f;
                    if (arrayList == null) {
                        v21Var.f42580f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < v21Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) v21Var.h.get(i11);
                        if (language.f17883q.startsWith(lowerCase)) {
                            v21Var.f42580f.add(0, language);
                        } else if (language.f17883q.contains(lowerCase)) {
                            v21Var.f42580f.add(language);
                        }
                    }
                    v21Var.f42579c.l();
                }
                if (obj9.length() != 0) {
                    mm0 mm0Var7 = v21Var.f42578b;
                    if (mm0Var7 != null) {
                        mm0Var7.setAdapter(v21Var.f42579c);
                        return;
                    }
                    return;
                } else if (v21Var.f42578b != null) {
                    v21Var.d.setVisibility(8);
                    v21Var.f42578b.setAdapter(v21Var.f42577a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((c81) this.f12863s).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                te1 te1Var = ((ye1) this.f12863s).f43829r0;
                if (!te1Var.f41975b0.equals(obj10)) {
                    te1Var.K(te1Var.e[0], te1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                jg1 jg1Var = (jg1) this.f12863s;
                jg1Var.h = editText.getText().toString();
                d71 d71Var = jg1Var.f25907a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                    return;
                }
                return;
        }
    }

    private final void w() {
    }

    private final void x() {
    }

    private final void y() {
    }

    private final void z(hg.o0 o0Var) {
    }
}
