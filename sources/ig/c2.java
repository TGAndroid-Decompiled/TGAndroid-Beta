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
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b70;
import org.telegram.ui.c70;
import org.telegram.ui.cv;
import org.telegram.ui.fg1;
import org.telegram.ui.fr;
import org.telegram.ui.ic0;
import org.telegram.ui.jp;
import org.telegram.ui.jr;
import org.telegram.ui.kp;
import org.telegram.ui.lh0;
import org.telegram.ui.ot;
import org.telegram.ui.pc0;
import org.telegram.ui.pe1;
import org.telegram.ui.qq0;
import org.telegram.ui.qt;
import org.telegram.ui.t21;
import org.telegram.ui.te1;
import org.telegram.ui.xb;
import org.telegram.ui.z71;
public final class c2 extends g5 {
    public final int f12849r;
    public final Object f12850s;

    public c2(Object obj, int i10) {
        this.f12849r = i10;
        this.f12850s = obj;
    }

    @Override
    public boolean b() {
        switch (this.f12849r) {
            case 14:
                ((qq0) this.f12850s).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator g() {
        switch (this.f12849r) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.f12850s;
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
                return super.g();
        }
    }

    @Override
    public void m() {
        switch (this.f12849r) {
            case 0:
                d2 d2Var = (d2) this.f12850s;
                d2Var.d = false;
                d2Var.e = null;
                d2Var.f12864a.W2.N(true);
                d2Var.f12864a.u0(0);
                return;
            case 1:
                xb xbVar = (xb) this.f12850s;
                xbVar.f43089v0 = "";
                xbVar.I.setVisibility(0);
                if (xbVar.U) {
                    xbVar.U = false;
                    xbVar.U0(true);
                    return;
                }
                return;
            case 2:
                kp kpVar = (kp) this.f12850s;
                kpVar.e.F(null);
                kpVar.N = false;
                kpVar.getClass();
                kpVar.f38629b.setAdapter(kpVar.f38628a);
                kpVar.f38628a.l();
                kpVar.f38629b.setFastScrollVisible(true);
                kpVar.f38629b.setVerticalScrollBarEnabled(false);
                kpVar.d.setShowAtCenter(false);
                View view = kpVar.fragmentView;
                int i10 = h6.f20935a7;
                view.setBackgroundColor(h6.x0(null, i10, false));
                kpVar.fragmentView.setTag(Integer.valueOf(i10));
                kpVar.d.b();
                return;
            case 3:
                jr jrVar = (jr) this.f12850s;
                jrVar.e.F(null);
                jrVar.f38305o1 = false;
                ai.u1 u1Var = jrVar.f38279c;
                u1Var.W1 = false;
                u1Var.X1 = 0;
                u1Var.setAdapter(jrVar.f38273a);
                jrVar.f38273a.l();
                jrVar.f38279c.setFastScrollVisible(true);
                jrVar.f38279c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12850s;
                if (k8Var.h) {
                    k8Var.f27778f = false;
                    k8Var.h = false;
                    k8Var.setAllowNestedScroll(true);
                    k8Var.f27793s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.f27784k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f12850s;
                nkVar.f28775b0 = false;
                nkVar.G.setVisibility(0);
                ck ckVar = nkVar.f28781r;
                s4.g0 adapter = ckVar.getAdapter();
                gk gkVar = nkVar.v;
                if (adapter != gkVar) {
                    ckVar.setAdapter(gkVar);
                }
                gkVar.l();
                nkVar.f28785y.Y(null, true);
                return;
            case 6:
                rl rlVar = (rl) this.f12850s;
                rlVar.f29980l0 = false;
                rlVar.m0 = false;
                rlVar.R.G(null, null);
                rlVar.i0();
                rlVar.P.setVisibility(0);
                rlVar.N.setVisibility(0);
                rlVar.Q.setVisibility(8);
                rlVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12850s;
                contactsActivity.f33091r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33078f.setAdapter(contactsActivity.d);
                contactsActivity.f33078f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33078f.setFastScrollVisible(true);
                contactsActivity.f33078f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33078f.getFastScroll().f29353h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                qt qtVar = (qt) this.f12850s;
                ot otVar = qtVar.d;
                otVar.getClass();
                otVar.e = null;
                qtVar.f40522f = false;
                qtVar.e = false;
                qtVar.f40519a.setAdapter(qtVar.f40521c);
                qtVar.f40519a.setFastScrollVisible(true);
                return;
            case 9:
                cv cvVar = (cv) this.f12850s;
                cvVar.f36010a.getActionBar().h(false);
                cvVar.f36011b.getActionBar().h(false);
                return;
            case 10:
                c70 c70Var = (c70) this.f12850s;
                if (c70Var.M) {
                    b70.E(c70Var.f35876f, null);
                    c70Var.M = false;
                    c70Var.d.setAdapter(c70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f12850s;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33145b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33145b.setAdapter(languageSelectActivity.f33144a);
                    return;
                }
                return;
            case 12:
                pc0 pc0Var = (pc0) this.f12850s;
                pc0Var.f40078r0 = false;
                pc0Var.f40080s0 = false;
                pc0Var.W.G(null, null);
                pc0Var.A0();
                if (pc0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = pc0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    pc0Var.U.setVisibility(0);
                    pc0Var.S.setVisibility(0);
                    pc0Var.V.setAdapter(null);
                    pc0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                xa0 xa0Var = ((lh0) this.f12850s).f38876a;
                xa0Var.f49924y = false;
                xa0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                t21 t21Var = (t21) this.f12850s;
                t21Var.f41597f = null;
                if (t21Var.f41595b != null) {
                    t21Var.d.setVisibility(8);
                    t21Var.f41595b.setAdapter(t21Var.f41594a);
                    return;
                }
                return;
            case 17:
                z71 z71Var = (z71) this.f12850s;
                z71Var.f43676a.a(false, true);
                z71Var.o0(false, true);
                z71Var.f43680c.W2.N(false);
                return;
            case 18:
                te1.b0((te1) this.f12850s, false);
                return;
            case 19:
                fg1 fg1Var = (fg1) this.f12850s;
                fg1Var.h = null;
                u61 u61Var = fg1Var.f31197a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f12849r) {
            case 0:
                d2 d2Var = (d2) this.f12850s;
                d2Var.d = true;
                d2Var.f12864a.W2.N(true);
                d2Var.f12864a.u0(0);
                return;
            case 1:
                xb xbVar = (xb) this.f12850s;
                xbVar.I.setVisibility(8);
                xbVar.getClass();
                return;
            case 2:
                kp kpVar = (kp) this.f12850s;
                kpVar.N = true;
                kpVar.d.setShowAtCenter(true);
                return;
            case 3:
                jr jrVar = (jr) this.f12850s;
                jrVar.f38305o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12850s;
                k8Var.f27794s0 = k8Var.f27791r.N0();
                View m10 = k8Var.f27791r.m(k8Var.f27794s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                k8Var.f27795t0 = top;
                k8Var.h = true;
                k8Var.setAllowNestedScroll(false);
                k8Var.f27793s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.f27784k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f12850s;
                nkVar.f28775b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.f28245b.w1(nkVar.F.getSearchField(), true);
                return;
            case 6:
                rl rlVar = (rl) this.f12850s;
                rlVar.f29980l0 = true;
                rlVar.f28245b.w1(rlVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12850s;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((qt) this.f12850s).f40522f = true;
                return;
            case 9:
                cv cvVar = (cv) this.f12850s;
                cvVar.f36010a.getActionBar().y("");
                cvVar.f36011b.getActionBar().y("");
                cvVar.f36012c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.f12850s).getClass();
                return;
            case 12:
                ((pc0) this.f12850s).f40078r0 = true;
                return;
            case 13:
                ((lh0) this.f12850s).f38876a.f49924y = true;
                return;
            case 14:
                qq0 qq0Var = (qq0) this.f12850s;
                qq0Var.f40505a.getActionBar().y("");
                qq0Var.f40506b.getActionBar().y("");
                qq0Var.f40507c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                z71 z71Var = (z71) this.f12850s;
                z71Var.f43676a.a(true, true);
                z71Var.h.I("");
                z71Var.o0(false, true);
                z71Var.f43680c.W2.N(false);
                return;
            case 18:
                te1 te1Var = (te1) this.f12850s;
                te1.b0(te1Var, true);
                pe1 pe1Var = te1Var.f41739r0;
                if (!pe1Var.f40122b0.equals("")) {
                    pe1Var.K(pe1Var.e[0], pe1Var.getCurrentPosition(), "", false);
                }
                te1Var.f41739r0.setAlpha(0.0f);
                te1Var.f41739r0.f40133n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(hg.o0 o0Var) {
        switch (this.f12849r) {
            case 5:
                nk nkVar = (nk) this.f12850s;
                mk mkVar = nkVar.f28785y;
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
        switch (this.f12849r) {
            case 1:
                xb xbVar = (xb) this.f12850s;
                xbVar.U = true;
                xbVar.f43089v0 = e2Var.getText().toString();
                xbVar.U0(true);
                return;
            case 14:
                qq0 qq0Var = (qq0) this.f12850s;
                qq0Var.f40505a.getActionBar().x();
                qq0Var.f40506b.getActionBar().x();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        im0 im0Var;
        int h;
        ai.u1 u1Var;
        s4.g0 g0Var;
        switch (this.f12849r) {
            case 0:
                d2 d2Var = (d2) this.f12850s;
                d2Var.e = editText.getText().toString();
                d2Var.f12864a.W2.N(true);
                d2Var.f12864a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                kp kpVar = (kp) this.f12850s;
                if (kpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (im0Var = kpVar.f38629b) != null) {
                        s4.g0 adapter = im0Var.getAdapter();
                        jp jpVar = kpVar.e;
                        if (adapter != jpVar) {
                            kpVar.f38629b.setAdapter(jpVar);
                            View view = kpVar.fragmentView;
                            int i10 = h6.f20993d6;
                            view.setBackgroundColor(h6.x0(null, i10, false));
                            kpVar.fragmentView.setTag(Integer.valueOf(i10));
                            kpVar.e.l();
                            kpVar.f38629b.setFastScrollVisible(false);
                            kpVar.f38629b.setVerticalScrollBarEnabled(true);
                            kpVar.d.b();
                        }
                    }
                    kpVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                jr jrVar = (jr) this.f12850s;
                if (jrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (jrVar.f38279c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = jrVar.f38279c.getAdapter().h();
                    }
                    jrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (u1Var = jrVar.f38279c) != null) {
                        s4.g0 adapter2 = u1Var.getAdapter();
                        fr frVar = jrVar.f38273a;
                        if (adapter2 != frVar) {
                            ai.u1 u1Var2 = jrVar.f38279c;
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
                k8 k8Var = (k8) this.f12850s;
                if (editText.length() > 0) {
                    k8Var.f27793s.E(editText.getText().toString());
                    return;
                }
                k8Var.f27778f = false;
                k8Var.f27793s.E(null);
                return;
            case 5:
                ((nk) this.f12850s).f28785y.Y(editText.getText().toString(), false);
                return;
            case 6:
                rl rlVar = (rl) this.f12850s;
                ah.x xVar = rlVar.N;
                ai.u1 u1Var3 = rlVar.P;
                im0 im0Var2 = rlVar.Q;
                ll llVar = rlVar.R;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        rlVar.m0 = true;
                        rlVar.E.setShowSearchProgress(true);
                        u1Var3.setVisibility(8);
                        xVar.setVisibility(8);
                        if (im0Var2.getAdapter() != llVar) {
                            im0Var2.setAdapter(llVar);
                        }
                        im0Var2.setVisibility(0);
                        if (llVar.f11821s.size() == 0 && llVar.f11820r.size() == 0) {
                            z10 = true;
                        }
                        rlVar.f29982n0 = z10;
                        rlVar.i0();
                    } else {
                        u1Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        im0Var2.setAdapter(null);
                        im0Var2.setVisibility(8);
                        rlVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, rlVar.f29987r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12850s;
                if (contactsActivity.f33091r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33074c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33082i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        im0 im0Var3 = contactsActivity.f33078f;
                        if (im0Var3 != null) {
                            im0Var3.setAdapter(contactsActivity.f33091r);
                            contactsActivity.f33078f.setSectionsType(0);
                            contactsActivity.f33091r.l();
                            contactsActivity.f33078f.setFastScrollVisible(false);
                            contactsActivity.f33078f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f33091r.G(obj4);
                        return;
                    }
                    im0 im0Var4 = contactsActivity.f33078f;
                    if (im0Var4 != null) {
                        im0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33078f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                qt qtVar = (qt) this.f12850s;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    ot otVar = qtVar.d;
                    otVar.getClass();
                    otVar.e = null;
                    qtVar.e = false;
                    qtVar.f40519a.setAdapter(qtVar.f40521c);
                    qtVar.f40519a.setFastScrollVisible(true);
                    return;
                }
                ot otVar2 = qtVar.d;
                otVar2.getClass();
                if (obj5 == null) {
                    otVar2.e = null;
                } else {
                    try {
                        Timer timer = otVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    otVar2.d = timer2;
                    timer2.schedule(new hg.r1(otVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    qtVar.e = true;
                    return;
                }
                return;
            case 9:
                cv cvVar = (cv) this.f12850s;
                cvVar.f36010a.getActionBar().setSearchFieldText(editText.getText().toString());
                cvVar.f36011b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                c70 c70Var = (c70) this.f12850s;
                b70.E(c70Var.f35876f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != c70Var.M) {
                    c70Var.M = z11;
                    im0 im0Var5 = c70Var.d;
                    if (im0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = c70Var.f35876f;
                        } else {
                            g0Var = c70Var.e;
                        }
                        im0Var5.setAdapter(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f12850s;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    im0 im0Var6 = languageSelectActivity.f33145b;
                    if (im0Var6 != null) {
                        im0Var6.setAdapter(languageSelectActivity.f33146c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33145b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33145b.setAdapter(languageSelectActivity.f33144a);
                    return;
                }
                return;
            case 12:
                pc0 pc0Var = (pc0) this.f12850s;
                if (pc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        pc0Var.f40080s0 = true;
                        pc0Var.f40084w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = pc0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        pc0Var.U.setVisibility(8);
                        pc0Var.S.setVisibility(8);
                        s4.g0 adapter3 = pc0Var.V.getAdapter();
                        ic0 ic0Var = pc0Var.W;
                        if (adapter3 != ic0Var) {
                            pc0Var.V.setAdapter(ic0Var);
                        }
                        pc0Var.V.setVisibility(0);
                        if (pc0Var.W.h() == 0) {
                            z12 = true;
                        }
                        pc0Var.f40081t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = pc0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        pc0Var.U.setVisibility(0);
                        pc0Var.S.setVisibility(0);
                        pc0Var.V.setAdapter(null);
                        pc0Var.V.setVisibility(8);
                    }
                    pc0Var.A0();
                    pc0Var.W.G(obj8, pc0Var.f40087x0);
                    return;
                }
                return;
            case 13:
                ((lh0) this.f12850s).f38876a.j(editText.getText().toString());
                return;
            case 14:
                qq0 qq0Var = (qq0) this.f12850s;
                qq0Var.f40505a.getActionBar().setSearchFieldText(editText.getText().toString());
                qq0Var.f40506b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.f12850s).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                t21 t21Var = (t21) this.f12850s;
                if (obj9 == null) {
                    t21Var.f41597f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = t21Var.f41597f;
                    if (arrayList == null) {
                        t21Var.f41597f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < t21Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) t21Var.h.get(i11);
                        if (language.f17823q.startsWith(lowerCase)) {
                            t21Var.f41597f.add(0, language);
                        } else if (language.f17823q.contains(lowerCase)) {
                            t21Var.f41597f.add(language);
                        }
                    }
                    t21Var.f41596c.l();
                }
                if (obj9.length() != 0) {
                    im0 im0Var7 = t21Var.f41595b;
                    if (im0Var7 != null) {
                        im0Var7.setAdapter(t21Var.f41596c);
                        return;
                    }
                    return;
                } else if (t21Var.f41595b != null) {
                    t21Var.d.setVisibility(8);
                    t21Var.f41595b.setAdapter(t21Var.f41594a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((z71) this.f12850s).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                pe1 pe1Var = ((te1) this.f12850s).f41739r0;
                if (!pe1Var.f40122b0.equals(obj10)) {
                    pe1Var.K(pe1Var.e[0], pe1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                fg1 fg1Var = (fg1) this.f12850s;
                fg1Var.h = editText.getText().toString();
                u61 u61Var = fg1Var.f31197a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
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
