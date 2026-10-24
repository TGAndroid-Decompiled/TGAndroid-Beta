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
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b81;
import org.telegram.ui.cv;
import org.telegram.ui.d70;
import org.telegram.ui.e70;
import org.telegram.ui.fr;
import org.telegram.ui.ig1;
import org.telegram.ui.jp;
import org.telegram.ui.jr;
import org.telegram.ui.kc0;
import org.telegram.ui.kp;
import org.telegram.ui.mh0;
import org.telegram.ui.pt;
import org.telegram.ui.qq0;
import org.telegram.ui.rc0;
import org.telegram.ui.rt;
import org.telegram.ui.se1;
import org.telegram.ui.u21;
import org.telegram.ui.vb;
import org.telegram.ui.xe1;
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
                ((qq0) this.f12863s).finishFragment();
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
                vbVar.f42673v0 = "";
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
                kpVar.f38989b.setAdapter(kpVar.f38988a);
                kpVar.f38988a.l();
                kpVar.f38989b.setFastScrollVisible(true);
                kpVar.f38989b.setVerticalScrollBarEnabled(false);
                kpVar.d.setShowAtCenter(false);
                View view = kpVar.fragmentView;
                int i10 = k6.f21126a7;
                r6.i(i10, view, null);
                kpVar.fragmentView.setTag(Integer.valueOf(i10));
                kpVar.d.b();
                return;
            case 3:
                jr jrVar = (jr) this.f12863s;
                jrVar.e.F(null);
                jrVar.f38648o1 = false;
                ai.u1 u1Var = jrVar.f38622c;
                u1Var.W1 = false;
                u1Var.X1 = 0;
                u1Var.setAdapter(jrVar.f38616a);
                jrVar.f38616a.l();
                jrVar.f38622c.setFastScrollVisible(true);
                jrVar.f38622c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                i8 i8Var = (i8) this.f12863s;
                if (i8Var.h) {
                    i8Var.f27332f = false;
                    i8Var.h = false;
                    i8Var.setAllowNestedScroll(true);
                    i8Var.f27347s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = i8Var.f27337j0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                lk lkVar = (lk) this.f12863s;
                lkVar.f28352b0 = false;
                lkVar.G.setVisibility(0);
                ak akVar = lkVar.f28358r;
                s4.g0 adapter = akVar.getAdapter();
                ek ekVar = lkVar.v;
                if (adapter != ekVar) {
                    akVar.setAdapter(ekVar);
                }
                ekVar.l();
                lkVar.f28362y.Y(null, true);
                return;
            case 6:
                pl plVar = (pl) this.f12863s;
                plVar.f29596i0 = false;
                plVar.f29597j0 = false;
                plVar.P.G(null, null);
                plVar.i0();
                plVar.N.setVisibility(0);
                plVar.L.setVisibility(0);
                plVar.O.setVisibility(8);
                plVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12863s;
                contactsActivity.f33400r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33387f.setAdapter(contactsActivity.d);
                contactsActivity.f33387f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33387f.setFastScrollVisible(true);
                contactsActivity.f33387f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33387f.getFastScroll().f30552h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.d0(contactsActivity);
                return;
            case 8:
                rt rtVar = (rt) this.f12863s;
                pt ptVar = rtVar.d;
                ptVar.getClass();
                ptVar.e = null;
                rtVar.f41226f = false;
                rtVar.e = false;
                rtVar.f41223a.setAdapter(rtVar.f41225c);
                rtVar.f41223a.setFastScrollVisible(true);
                return;
            case 9:
                cv cvVar = (cv) this.f12863s;
                cvVar.f36406a.getActionBar().g(false);
                cvVar.f36407b.getActionBar().g(false);
                return;
            case 10:
                e70 e70Var = (e70) this.f12863s;
                if (e70Var.M) {
                    d70.E(e70Var.f36820f, null);
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
                if (languageSelectActivity.f33454b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33454b.setAdapter(languageSelectActivity.f33453a);
                    return;
                }
                return;
            case 12:
                rc0 rc0Var = (rc0) this.f12863s;
                rc0Var.f41112q0 = false;
                rc0Var.f41114r0 = false;
                rc0Var.W.G(null, null);
                rc0Var.B0();
                if (rc0Var.F0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = rc0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    rc0Var.U.setVisibility(0);
                    rc0Var.S.setVisibility(0);
                    rc0Var.V.setAdapter(null);
                    rc0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                wa0 wa0Var = ((mh0) this.f12863s).f39593a;
                wa0Var.f50326y = false;
                wa0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                u21 u21Var = (u21) this.f12863s;
                u21Var.f42190f = null;
                if (u21Var.f42188b != null) {
                    u21Var.d.setVisibility(8);
                    u21Var.f42188b.setAdapter(u21Var.f42187a);
                    return;
                }
                return;
            case 17:
                b81 b81Var = (b81) this.f12863s;
                b81Var.f35952a.a(false, true);
                b81Var.q0(false, true);
                b81Var.f35956c.Z2.N(false);
                return;
            case 18:
                xe1.a0((xe1) this.f12863s, false);
                return;
            case 19:
                ig1 ig1Var = (ig1) this.f12863s;
                ig1Var.h = null;
                c71 c71Var = ig1Var.f25615a;
                if (c71Var != null) {
                    c71Var.Z2.N(true);
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
                jrVar.f38648o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                i8 i8Var = (i8) this.f12863s;
                i8Var.f27346r0 = i8Var.f27345r.N0();
                View m10 = i8Var.f27345r.m(i8Var.f27346r0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                i8Var.f27348s0 = top;
                i8Var.h = true;
                i8Var.setAllowNestedScroll(false);
                i8Var.f27347s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = i8Var.f27337j0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                lk lkVar = (lk) this.f12863s;
                lkVar.f28352b0 = true;
                lkVar.G.setVisibility(8);
                lkVar.f27704b.z1(lkVar.F.getSearchField(), true);
                return;
            case 6:
                pl plVar = (pl) this.f12863s;
                plVar.f29596i0 = true;
                plVar.f27704b.z1(plVar.f29614x.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12863s;
                contactsActivity.F = true;
                ContactsActivity.d0(contactsActivity);
                return;
            case 8:
                ((rt) this.f12863s).f41226f = true;
                return;
            case 9:
                cv cvVar = (cv) this.f12863s;
                cvVar.f36406a.getActionBar().x("");
                cvVar.f36407b.getActionBar().x("");
                cvVar.f36408c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.f12863s).getClass();
                return;
            case 12:
                ((rc0) this.f12863s).f41112q0 = true;
                return;
            case 13:
                ((mh0) this.f12863s).f39593a.f50326y = true;
                return;
            case 14:
                qq0 qq0Var = (qq0) this.f12863s;
                qq0Var.f40920a.getActionBar().x("");
                qq0Var.f40921b.getActionBar().x("");
                qq0Var.f40922c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                b81 b81Var = (b81) this.f12863s;
                b81Var.f35952a.a(true, true);
                b81Var.h.I("");
                b81Var.q0(false, true);
                b81Var.f35956c.Z2.N(false);
                return;
            case 18:
                xe1 xe1Var = (xe1) this.f12863s;
                xe1.a0(xe1Var, true);
                se1 se1Var = xe1Var.f43582r0;
                if (!se1Var.f41367b0.equals("")) {
                    se1Var.K(se1Var.e[0], se1Var.getCurrentPosition(), "", false);
                }
                xe1Var.f43582r0.setAlpha(0.0f);
                xe1Var.f43582r0.f41378n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(hg.o0 o0Var) {
        switch (this.f12862r) {
            case 5:
                lk lkVar = (lk) this.f12863s;
                kk kkVar = lkVar.f28362y;
                kkVar.R.remove(o0Var);
                kkVar.Y(lkVar.F.getSearchField().getText().toString(), false);
                kkVar.a0(null, null, true);
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
                vbVar.f42673v0 = e2Var.getText().toString();
                vbVar.U0(true);
                return;
            case 14:
                qq0 qq0Var = (qq0) this.f12863s;
                qq0Var.f40920a.getActionBar().w();
                qq0Var.f40921b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        lm0 lm0Var;
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
                    if (obj.length() != 0 && (lm0Var = kpVar.f38989b) != null) {
                        s4.g0 adapter = lm0Var.getAdapter();
                        jp jpVar = kpVar.e;
                        if (adapter != jpVar) {
                            kpVar.f38989b.setAdapter(jpVar);
                            View view = kpVar.fragmentView;
                            int i10 = k6.f21184d6;
                            r6.i(i10, view, null);
                            kpVar.fragmentView.setTag(Integer.valueOf(i10));
                            kpVar.e.l();
                            kpVar.f38989b.setFastScrollVisible(false);
                            kpVar.f38989b.setVerticalScrollBarEnabled(true);
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
                    if (jrVar.f38622c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = jrVar.f38622c.getAdapter().h();
                    }
                    jrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (u1Var = jrVar.f38622c) != null) {
                        s4.g0 adapter2 = u1Var.getAdapter();
                        fr frVar = jrVar.f38616a;
                        if (adapter2 != frVar) {
                            ai.u1 u1Var2 = jrVar.f38622c;
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
                i8 i8Var = (i8) this.f12863s;
                if (editText.length() > 0) {
                    i8Var.f27347s.E(editText.getText().toString());
                    return;
                }
                i8Var.f27332f = false;
                i8Var.f27347s.E(null);
                return;
            case 5:
                ((lk) this.f12863s).f28362y.Y(editText.getText().toString(), false);
                return;
            case 6:
                pl plVar = (pl) this.f12863s;
                ah.x xVar = plVar.L;
                ai.u1 u1Var3 = plVar.N;
                lm0 lm0Var2 = plVar.O;
                jl jlVar = plVar.P;
                if (jlVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        plVar.f29597j0 = true;
                        plVar.f29614x.setShowSearchProgress(true);
                        u1Var3.setVisibility(8);
                        xVar.setVisibility(8);
                        if (lm0Var2.getAdapter() != jlVar) {
                            lm0Var2.setAdapter(jlVar);
                        }
                        lm0Var2.setVisibility(0);
                        if (jlVar.f11845s.size() == 0 && jlVar.f11844r.size() == 0) {
                            z10 = true;
                        }
                        plVar.f29598k0 = z10;
                        plVar.i0();
                    } else {
                        u1Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        lm0Var2.setAdapter(null);
                        lm0Var2.setVisibility(8);
                        plVar.v.setVisibility(8);
                    }
                    jlVar.G(obj3, plVar.f29602o0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12863s;
                if (contactsActivity.f33400r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33383c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33391i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        lm0 lm0Var3 = contactsActivity.f33387f;
                        if (lm0Var3 != null) {
                            lm0Var3.setAdapter(contactsActivity.f33400r);
                            contactsActivity.f33387f.setSectionsType(0);
                            contactsActivity.f33400r.l();
                            contactsActivity.f33387f.setFastScrollVisible(false);
                            contactsActivity.f33387f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f33400r.G(obj4);
                        return;
                    }
                    lm0 lm0Var4 = contactsActivity.f33387f;
                    if (lm0Var4 != null) {
                        lm0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33387f.setSectionsType(1);
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
                    rtVar.f41223a.setAdapter(rtVar.f41225c);
                    rtVar.f41223a.setFastScrollVisible(true);
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
                cvVar.f36406a.getActionBar().setSearchFieldText(editText.getText().toString());
                cvVar.f36407b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                e70 e70Var = (e70) this.f12863s;
                d70.E(e70Var.f36820f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != e70Var.M) {
                    e70Var.M = z11;
                    lm0 lm0Var5 = e70Var.d;
                    if (lm0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = e70Var.f36820f;
                        } else {
                            g0Var = e70Var.e;
                        }
                        lm0Var5.setAdapter(g0Var);
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
                    lm0 lm0Var6 = languageSelectActivity.f33454b;
                    if (lm0Var6 != null) {
                        lm0Var6.setAdapter(languageSelectActivity.f33455c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33454b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33454b.setAdapter(languageSelectActivity.f33453a);
                    return;
                }
                return;
            case 12:
                rc0 rc0Var = (rc0) this.f12863s;
                if (rc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        rc0Var.f41114r0 = true;
                        rc0Var.f41120w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = rc0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        rc0Var.U.setVisibility(8);
                        rc0Var.S.setVisibility(8);
                        s4.g0 adapter3 = rc0Var.V.getAdapter();
                        kc0 kc0Var = rc0Var.W;
                        if (adapter3 != kc0Var) {
                            rc0Var.V.setAdapter(kc0Var);
                        }
                        rc0Var.V.setVisibility(0);
                        if (rc0Var.W.h() == 0) {
                            z12 = true;
                        }
                        rc0Var.f41116s0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = rc0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        rc0Var.U.setVisibility(0);
                        rc0Var.S.setVisibility(0);
                        rc0Var.V.setAdapter(null);
                        rc0Var.V.setVisibility(8);
                    }
                    rc0Var.B0();
                    rc0Var.W.G(obj8, rc0Var.f41121w0);
                    return;
                }
                return;
            case 13:
                ((mh0) this.f12863s).f39593a.j(editText.getText().toString());
                return;
            case 14:
                qq0 qq0Var = (qq0) this.f12863s;
                qq0Var.f40920a.getActionBar().setSearchFieldText(editText.getText().toString());
                qq0Var.f40921b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.f12863s).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                u21 u21Var = (u21) this.f12863s;
                if (obj9 == null) {
                    u21Var.f42190f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = u21Var.f42190f;
                    if (arrayList == null) {
                        u21Var.f42190f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < u21Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) u21Var.h.get(i11);
                        if (language.f17883q.startsWith(lowerCase)) {
                            u21Var.f42190f.add(0, language);
                        } else if (language.f17883q.contains(lowerCase)) {
                            u21Var.f42190f.add(language);
                        }
                    }
                    u21Var.f42189c.l();
                }
                if (obj9.length() != 0) {
                    lm0 lm0Var7 = u21Var.f42188b;
                    if (lm0Var7 != null) {
                        lm0Var7.setAdapter(u21Var.f42189c);
                        return;
                    }
                    return;
                } else if (u21Var.f42188b != null) {
                    u21Var.d.setVisibility(8);
                    u21Var.f42188b.setAdapter(u21Var.f42187a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((b81) this.f12863s).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                se1 se1Var = ((xe1) this.f12863s).f43582r0;
                if (!se1Var.f41367b0.equals(obj10)) {
                    se1Var.K(se1Var.e[0], se1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                ig1 ig1Var = (ig1) this.f12863s;
                ig1Var.h = editText.getText().toString();
                c71 c71Var = ig1Var.f25615a;
                if (c71Var != null) {
                    c71Var.Z2.N(true);
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
