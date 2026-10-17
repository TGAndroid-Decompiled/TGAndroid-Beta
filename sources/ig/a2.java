package ig;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import ei.e2;
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
import org.telegram.ui.bv;
import org.telegram.ui.c70;
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
import org.telegram.ui.pq0;
import org.telegram.ui.qt;
import org.telegram.ui.t21;
import org.telegram.ui.te1;
import org.telegram.ui.xb;
import org.telegram.ui.z71;
public final class a2 extends g5 {
    public final int f12827r;
    public final Object f12828s;

    public a2(Object obj, int i10) {
        this.f12827r = i10;
        this.f12828s = obj;
    }

    @Override
    public boolean b() {
        switch (this.f12827r) {
            case 14:
                ((pq0) this.f12828s).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator g() {
        switch (this.f12827r) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.f12828s;
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
        switch (this.f12827r) {
            case 0:
                b2 b2Var = (b2) this.f12828s;
                b2Var.d = false;
                b2Var.e = null;
                b2Var.f12843a.W2.N(true);
                b2Var.f12843a.u0(0);
                return;
            case 1:
                xb xbVar = (xb) this.f12828s;
                xbVar.f43069v0 = "";
                xbVar.I.setVisibility(0);
                if (xbVar.U) {
                    xbVar.U = false;
                    xbVar.U0(true);
                    return;
                }
                return;
            case 2:
                kp kpVar = (kp) this.f12828s;
                kpVar.e.F(null);
                kpVar.N = false;
                kpVar.getClass();
                kpVar.f38623b.setAdapter(kpVar.f38622a);
                kpVar.f38622a.l();
                kpVar.f38623b.setFastScrollVisible(true);
                kpVar.f38623b.setVerticalScrollBarEnabled(false);
                kpVar.d.setShowAtCenter(false);
                View view = kpVar.fragmentView;
                int i10 = h6.f20928a7;
                view.setBackgroundColor(h6.x0(null, i10, false));
                kpVar.fragmentView.setTag(Integer.valueOf(i10));
                kpVar.d.b();
                return;
            case 3:
                jr jrVar = (jr) this.f12828s;
                jrVar.e.F(null);
                jrVar.f38296o1 = false;
                ai.u1 u1Var = jrVar.f38270c;
                u1Var.W1 = false;
                u1Var.X1 = 0;
                u1Var.setAdapter(jrVar.f38264a);
                jrVar.f38264a.l();
                jrVar.f38270c.setFastScrollVisible(true);
                jrVar.f38270c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12828s;
                if (k8Var.h) {
                    k8Var.f27771f = false;
                    k8Var.h = false;
                    k8Var.setAllowNestedScroll(true);
                    k8Var.f27786s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.f27777k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f12828s;
                nkVar.f28768b0 = false;
                nkVar.G.setVisibility(0);
                ck ckVar = nkVar.f28774r;
                s4.g0 adapter = ckVar.getAdapter();
                gk gkVar = nkVar.v;
                if (adapter != gkVar) {
                    ckVar.setAdapter(gkVar);
                }
                gkVar.l();
                nkVar.f28778y.Y(null, true);
                return;
            case 6:
                rl rlVar = (rl) this.f12828s;
                rlVar.f29972l0 = false;
                rlVar.m0 = false;
                rlVar.R.G(null, null);
                rlVar.i0();
                rlVar.P.setVisibility(0);
                rlVar.N.setVisibility(0);
                rlVar.Q.setVisibility(8);
                rlVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12828s;
                contactsActivity.f33084r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33071f.setAdapter(contactsActivity.d);
                contactsActivity.f33071f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33071f.setFastScrollVisible(true);
                contactsActivity.f33071f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33071f.getFastScroll().f29346h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                qt qtVar = (qt) this.f12828s;
                ot otVar = qtVar.d;
                otVar.getClass();
                otVar.e = null;
                qtVar.f40497f = false;
                qtVar.e = false;
                qtVar.f40494a.setAdapter(qtVar.f40496c);
                qtVar.f40494a.setFastScrollVisible(true);
                return;
            case 9:
                bv bvVar = (bv) this.f12828s;
                bvVar.f35744a.getActionBar().h(false);
                bvVar.f35745b.getActionBar().h(false);
                return;
            case 10:
                c70 c70Var = (c70) this.f12828s;
                if (c70Var.M) {
                    b70.E(c70Var.f35863f, null);
                    c70Var.M = false;
                    c70Var.d.setAdapter(c70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f12828s;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33138b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33138b.setAdapter(languageSelectActivity.f33137a);
                    return;
                }
                return;
            case 12:
                pc0 pc0Var = (pc0) this.f12828s;
                pc0Var.f40059r0 = false;
                pc0Var.f40061s0 = false;
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
                xa0 xa0Var = ((lh0) this.f12828s).f38885a;
                xa0Var.f49899y = false;
                xa0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                t21 t21Var = (t21) this.f12828s;
                t21Var.f41571f = null;
                if (t21Var.f41569b != null) {
                    t21Var.d.setVisibility(8);
                    t21Var.f41569b.setAdapter(t21Var.f41568a);
                    return;
                }
                return;
            case 17:
                z71 z71Var = (z71) this.f12828s;
                z71Var.f43650a.a(false, true);
                z71Var.o0(false, true);
                z71Var.f43654c.W2.N(false);
                return;
            case 18:
                te1.b0((te1) this.f12828s, false);
                return;
            case 19:
                fg1 fg1Var = (fg1) this.f12828s;
                fg1Var.h = null;
                u61 u61Var = fg1Var.f31190a;
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
        switch (this.f12827r) {
            case 0:
                b2 b2Var = (b2) this.f12828s;
                b2Var.d = true;
                b2Var.f12843a.W2.N(true);
                b2Var.f12843a.u0(0);
                return;
            case 1:
                xb xbVar = (xb) this.f12828s;
                xbVar.I.setVisibility(8);
                xbVar.getClass();
                return;
            case 2:
                kp kpVar = (kp) this.f12828s;
                kpVar.N = true;
                kpVar.d.setShowAtCenter(true);
                return;
            case 3:
                jr jrVar = (jr) this.f12828s;
                jrVar.f38296o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = jrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12828s;
                k8Var.f27787s0 = k8Var.f27784r.N0();
                View m10 = k8Var.f27784r.m(k8Var.f27787s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                k8Var.f27788t0 = top;
                k8Var.h = true;
                k8Var.setAllowNestedScroll(false);
                k8Var.f27786s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.f27777k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f12828s;
                nkVar.f28768b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.f28238b.w1(nkVar.F.getSearchField(), true);
                return;
            case 6:
                rl rlVar = (rl) this.f12828s;
                rlVar.f29972l0 = true;
                rlVar.f28238b.w1(rlVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12828s;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((qt) this.f12828s).f40497f = true;
                return;
            case 9:
                bv bvVar = (bv) this.f12828s;
                bvVar.f35744a.getActionBar().y("");
                bvVar.f35745b.getActionBar().y("");
                bvVar.f35746c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.f12828s).getClass();
                return;
            case 12:
                ((pc0) this.f12828s).f40059r0 = true;
                return;
            case 13:
                ((lh0) this.f12828s).f38885a.f49899y = true;
                return;
            case 14:
                pq0 pq0Var = (pq0) this.f12828s;
                pq0Var.f40219a.getActionBar().y("");
                pq0Var.f40220b.getActionBar().y("");
                pq0Var.f40221c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                z71 z71Var = (z71) this.f12828s;
                z71Var.f43650a.a(true, true);
                z71Var.h.I("");
                z71Var.o0(false, true);
                z71Var.f43654c.W2.N(false);
                return;
            case 18:
                te1 te1Var = (te1) this.f12828s;
                te1.b0(te1Var, true);
                pe1 pe1Var = te1Var.f41713r0;
                if (!pe1Var.f40103b0.equals("")) {
                    pe1Var.K(pe1Var.e[0], pe1Var.getCurrentPosition(), "", false);
                }
                te1Var.f41713r0.setAlpha(0.0f);
                te1Var.f41713r0.f40114n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(hg.o0 o0Var) {
        switch (this.f12827r) {
            case 5:
                nk nkVar = (nk) this.f12828s;
                mk mkVar = nkVar.f28778y;
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
    public void p(e2 e2Var) {
        switch (this.f12827r) {
            case 1:
                xb xbVar = (xb) this.f12828s;
                xbVar.U = true;
                xbVar.f43069v0 = e2Var.getText().toString();
                xbVar.U0(true);
                return;
            case 14:
                pq0 pq0Var = (pq0) this.f12828s;
                pq0Var.f40219a.getActionBar().x();
                pq0Var.f40220b.getActionBar().x();
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
        switch (this.f12827r) {
            case 0:
                b2 b2Var = (b2) this.f12828s;
                b2Var.e = editText.getText().toString();
                b2Var.f12843a.W2.N(true);
                b2Var.f12843a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                kp kpVar = (kp) this.f12828s;
                if (kpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (im0Var = kpVar.f38623b) != null) {
                        s4.g0 adapter = im0Var.getAdapter();
                        jp jpVar = kpVar.e;
                        if (adapter != jpVar) {
                            kpVar.f38623b.setAdapter(jpVar);
                            View view = kpVar.fragmentView;
                            int i10 = h6.f20986d6;
                            view.setBackgroundColor(h6.x0(null, i10, false));
                            kpVar.fragmentView.setTag(Integer.valueOf(i10));
                            kpVar.e.l();
                            kpVar.f38623b.setFastScrollVisible(false);
                            kpVar.f38623b.setVerticalScrollBarEnabled(true);
                            kpVar.d.b();
                        }
                    }
                    kpVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                jr jrVar = (jr) this.f12828s;
                if (jrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (jrVar.f38270c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = jrVar.f38270c.getAdapter().h();
                    }
                    jrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (u1Var = jrVar.f38270c) != null) {
                        s4.g0 adapter2 = u1Var.getAdapter();
                        fr frVar = jrVar.f38264a;
                        if (adapter2 != frVar) {
                            ai.u1 u1Var2 = jrVar.f38270c;
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
                k8 k8Var = (k8) this.f12828s;
                if (editText.length() > 0) {
                    k8Var.f27786s.E(editText.getText().toString());
                    return;
                }
                k8Var.f27771f = false;
                k8Var.f27786s.E(null);
                return;
            case 5:
                ((nk) this.f12828s).f28778y.Y(editText.getText().toString(), false);
                return;
            case 6:
                rl rlVar = (rl) this.f12828s;
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
                        if (llVar.f11819s.size() == 0 && llVar.f11818r.size() == 0) {
                            z10 = true;
                        }
                        rlVar.f29974n0 = z10;
                        rlVar.i0();
                    } else {
                        u1Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        im0Var2.setAdapter(null);
                        im0Var2.setVisibility(8);
                        rlVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, rlVar.f29979r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12828s;
                if (contactsActivity.f33084r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33067c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33075i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        im0 im0Var3 = contactsActivity.f33071f;
                        if (im0Var3 != null) {
                            im0Var3.setAdapter(contactsActivity.f33084r);
                            contactsActivity.f33071f.setSectionsType(0);
                            contactsActivity.f33084r.l();
                            contactsActivity.f33071f.setFastScrollVisible(false);
                            contactsActivity.f33071f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f33084r.G(obj4);
                        return;
                    }
                    im0 im0Var4 = contactsActivity.f33071f;
                    if (im0Var4 != null) {
                        im0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33071f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                qt qtVar = (qt) this.f12828s;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    ot otVar = qtVar.d;
                    otVar.getClass();
                    otVar.e = null;
                    qtVar.e = false;
                    qtVar.f40494a.setAdapter(qtVar.f40496c);
                    qtVar.f40494a.setFastScrollVisible(true);
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
                bv bvVar = (bv) this.f12828s;
                bvVar.f35744a.getActionBar().setSearchFieldText(editText.getText().toString());
                bvVar.f35745b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                c70 c70Var = (c70) this.f12828s;
                b70.E(c70Var.f35863f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != c70Var.M) {
                    c70Var.M = z11;
                    im0 im0Var5 = c70Var.d;
                    if (im0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = c70Var.f35863f;
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
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f12828s;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    im0 im0Var6 = languageSelectActivity.f33138b;
                    if (im0Var6 != null) {
                        im0Var6.setAdapter(languageSelectActivity.f33139c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33138b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33138b.setAdapter(languageSelectActivity.f33137a);
                    return;
                }
                return;
            case 12:
                pc0 pc0Var = (pc0) this.f12828s;
                if (pc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        pc0Var.f40061s0 = true;
                        pc0Var.f40065w.setShowSearchProgress(true);
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
                        pc0Var.f40062t0 = z12;
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
                    pc0Var.W.G(obj8, pc0Var.f40068x0);
                    return;
                }
                return;
            case 13:
                ((lh0) this.f12828s).f38885a.j(editText.getText().toString());
                return;
            case 14:
                pq0 pq0Var = (pq0) this.f12828s;
                pq0Var.f40219a.getActionBar().setSearchFieldText(editText.getText().toString());
                pq0Var.f40220b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.f12828s).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                t21 t21Var = (t21) this.f12828s;
                if (obj9 == null) {
                    t21Var.f41571f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = t21Var.f41571f;
                    if (arrayList == null) {
                        t21Var.f41571f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < t21Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) t21Var.h.get(i11);
                        if (language.f17816q.startsWith(lowerCase)) {
                            t21Var.f41571f.add(0, language);
                        } else if (language.f17816q.contains(lowerCase)) {
                            t21Var.f41571f.add(language);
                        }
                    }
                    t21Var.f41570c.l();
                }
                if (obj9.length() != 0) {
                    im0 im0Var7 = t21Var.f41569b;
                    if (im0Var7 != null) {
                        im0Var7.setAdapter(t21Var.f41570c);
                        return;
                    }
                    return;
                } else if (t21Var.f41569b != null) {
                    t21Var.d.setVisibility(8);
                    t21Var.f41569b.setAdapter(t21Var.f41568a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((z71) this.f12828s).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                pe1 pe1Var = ((te1) this.f12828s).f41713r0;
                if (!pe1Var.f40103b0.equals(obj10)) {
                    pe1Var.K(pe1Var.e[0], pe1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                fg1 fg1Var = (fg1) this.f12828s;
                fg1Var.h = editText.getText().toString();
                u61 u61Var = fg1Var.f31190a;
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
