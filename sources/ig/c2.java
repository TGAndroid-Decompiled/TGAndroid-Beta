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
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a70;
import org.telegram.ui.av;
import org.telegram.ui.dg1;
import org.telegram.ui.dr;
import org.telegram.ui.gc0;
import org.telegram.ui.hp;
import org.telegram.ui.hr;
import org.telegram.ui.ip;
import org.telegram.ui.jh0;
import org.telegram.ui.mt;
import org.telegram.ui.nc0;
import org.telegram.ui.ne1;
import org.telegram.ui.oq0;
import org.telegram.ui.ot;
import org.telegram.ui.r21;
import org.telegram.ui.re1;
import org.telegram.ui.vb;
import org.telegram.ui.x71;
import org.telegram.ui.z60;
public final class c2 extends g5 {
    public final int f12847r;
    public final Object f12848s;

    public c2(Object obj, int i10) {
        this.f12847r = i10;
        this.f12848s = obj;
    }

    @Override
    public boolean b() {
        switch (this.f12847r) {
            case 14:
                ((oq0) this.f12848s).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator g() {
        switch (this.f12847r) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.f12848s;
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
                return ProfileActivity.I0(profileActivity, profileActivity.X1);
            default:
                return super.g();
        }
    }

    @Override
    public void m() {
        switch (this.f12847r) {
            case 0:
                d2 d2Var = (d2) this.f12848s;
                d2Var.d = false;
                d2Var.e = null;
                d2Var.f12862a.W2.N(true);
                d2Var.f12862a.u0(0);
                return;
            case 1:
                vb vbVar = (vb) this.f12848s;
                vbVar.f42181v0 = "";
                vbVar.I.setVisibility(0);
                if (vbVar.U) {
                    vbVar.U = false;
                    vbVar.U0(true);
                    return;
                }
                return;
            case 2:
                ip ipVar = (ip) this.f12848s;
                ipVar.e.F(null);
                ipVar.N = false;
                ipVar.getClass();
                ipVar.f38064b.setAdapter(ipVar.f38063a);
                ipVar.f38063a.l();
                ipVar.f38064b.setFastScrollVisible(true);
                ipVar.f38064b.setVerticalScrollBarEnabled(false);
                ipVar.d.setShowAtCenter(false);
                View view = ipVar.fragmentView;
                int i10 = h6.f20929a7;
                view.setBackgroundColor(h6.x0(null, i10, false));
                ipVar.fragmentView.setTag(Integer.valueOf(i10));
                ipVar.d.b();
                return;
            case 3:
                hr hrVar = (hr) this.f12848s;
                hrVar.e.F(null);
                hrVar.f37741o1 = false;
                ai.u1 u1Var = hrVar.f37715c;
                u1Var.W1 = false;
                u1Var.X1 = 0;
                u1Var.setAdapter(hrVar.f37709a);
                hrVar.f37709a.l();
                hrVar.f37715c.setFastScrollVisible(true);
                hrVar.f37715c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = hrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12848s;
                if (k8Var.h) {
                    k8Var.f27748f = false;
                    k8Var.h = false;
                    k8Var.setAllowNestedScroll(true);
                    k8Var.f27763s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.f27754k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f12848s;
                nkVar.f28784b0 = false;
                nkVar.G.setVisibility(0);
                ck ckVar = nkVar.f28790r;
                s4.g0 adapter = ckVar.getAdapter();
                gk gkVar = nkVar.v;
                if (adapter != gkVar) {
                    ckVar.setAdapter(gkVar);
                }
                gkVar.l();
                nkVar.f28794y.Y(null, true);
                return;
            case 6:
                rl rlVar = (rl) this.f12848s;
                rlVar.f29978l0 = false;
                rlVar.m0 = false;
                rlVar.R.G(null, null);
                rlVar.i0();
                rlVar.P.setVisibility(0);
                rlVar.N.setVisibility(0);
                rlVar.Q.setVisibility(8);
                rlVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12848s;
                contactsActivity.f33090r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33077f.setAdapter(contactsActivity.d);
                contactsActivity.f33077f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33077f.setFastScrollVisible(true);
                contactsActivity.f33077f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33077f.getFastScroll().f29316h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ot otVar = (ot) this.f12848s;
                mt mtVar = otVar.d;
                mtVar.getClass();
                mtVar.e = null;
                otVar.f39971f = false;
                otVar.e = false;
                otVar.f39968a.setAdapter(otVar.f39970c);
                otVar.f39968a.setFastScrollVisible(true);
                return;
            case 9:
                av avVar = (av) this.f12848s;
                avVar.f35421a.getActionBar().h(false);
                avVar.f35422b.getActionBar().h(false);
                return;
            case 10:
                a70 a70Var = (a70) this.f12848s;
                if (a70Var.M) {
                    z60.E(a70Var.f35287f, null);
                    a70Var.M = false;
                    a70Var.d.setAdapter(a70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f12848s;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33144b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33144b.setAdapter(languageSelectActivity.f33143a);
                    return;
                }
                return;
            case 12:
                nc0 nc0Var = (nc0) this.f12848s;
                nc0Var.f39514r0 = false;
                nc0Var.f39516s0 = false;
                nc0Var.W.G(null, null);
                nc0Var.A0();
                if (nc0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = nc0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    nc0Var.U.setVisibility(0);
                    nc0Var.S.setVisibility(0);
                    nc0Var.V.setAdapter(null);
                    nc0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                xa0 xa0Var = ((jh0) this.f12848s).f38259a;
                xa0Var.f49878y = false;
                xa0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                r21 r21Var = (r21) this.f12848s;
                r21Var.f41034f = null;
                if (r21Var.f41032b != null) {
                    r21Var.d.setVisibility(8);
                    r21Var.f41032b.setAdapter(r21Var.f41031a);
                    return;
                }
                return;
            case 17:
                x71 x71Var = (x71) this.f12848s;
                x71Var.f43114a.a(false, true);
                x71Var.o0(false, true);
                x71Var.f43118c.W2.N(false);
                return;
            case 18:
                re1.b0((re1) this.f12848s, false);
                return;
            case 19:
                dg1 dg1Var = (dg1) this.f12848s;
                dg1Var.h = null;
                v61 v61Var = dg1Var.f32025a;
                if (v61Var != null) {
                    v61Var.W2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f12847r) {
            case 0:
                d2 d2Var = (d2) this.f12848s;
                d2Var.d = true;
                d2Var.f12862a.W2.N(true);
                d2Var.f12862a.u0(0);
                return;
            case 1:
                vb vbVar = (vb) this.f12848s;
                vbVar.I.setVisibility(8);
                vbVar.getClass();
                return;
            case 2:
                ip ipVar = (ip) this.f12848s;
                ipVar.N = true;
                ipVar.d.setShowAtCenter(true);
                return;
            case 3:
                hr hrVar = (hr) this.f12848s;
                hrVar.f37741o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = hrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12848s;
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
                org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.f27754k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                nk nkVar = (nk) this.f12848s;
                nkVar.f28784b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.f28223b.w1(nkVar.F.getSearchField(), true);
                return;
            case 6:
                rl rlVar = (rl) this.f12848s;
                rlVar.f29978l0 = true;
                rlVar.f28223b.w1(rlVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12848s;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((ot) this.f12848s).f39971f = true;
                return;
            case 9:
                av avVar = (av) this.f12848s;
                avVar.f35421a.getActionBar().y("");
                avVar.f35422b.getActionBar().y("");
                avVar.f35423c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.f12848s).getClass();
                return;
            case 12:
                ((nc0) this.f12848s).f39514r0 = true;
                return;
            case 13:
                ((jh0) this.f12848s).f38259a.f49878y = true;
                return;
            case 14:
                oq0 oq0Var = (oq0) this.f12848s;
                oq0Var.f39954a.getActionBar().y("");
                oq0Var.f39955b.getActionBar().y("");
                oq0Var.f39956c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                x71 x71Var = (x71) this.f12848s;
                x71Var.f43114a.a(true, true);
                x71Var.h.I("");
                x71Var.o0(false, true);
                x71Var.f43118c.W2.N(false);
                return;
            case 18:
                re1 re1Var = (re1) this.f12848s;
                re1.b0(re1Var, true);
                ne1 ne1Var = re1Var.f41176r0;
                if (!ne1Var.f39558b0.equals("")) {
                    ne1Var.K(ne1Var.e[0], ne1Var.getCurrentPosition(), "", false);
                }
                re1Var.f41176r0.setAlpha(0.0f);
                re1Var.f41176r0.f39569n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(hg.o0 o0Var) {
        switch (this.f12847r) {
            case 5:
                nk nkVar = (nk) this.f12848s;
                mk mkVar = nkVar.f28794y;
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
        switch (this.f12847r) {
            case 1:
                vb vbVar = (vb) this.f12848s;
                vbVar.U = true;
                vbVar.f42181v0 = e2Var.getText().toString();
                vbVar.U0(true);
                return;
            case 14:
                oq0 oq0Var = (oq0) this.f12848s;
                oq0Var.f39954a.getActionBar().x();
                oq0Var.f39955b.getActionBar().x();
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
        switch (this.f12847r) {
            case 0:
                d2 d2Var = (d2) this.f12848s;
                d2Var.e = editText.getText().toString();
                d2Var.f12862a.W2.N(true);
                d2Var.f12862a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                ip ipVar = (ip) this.f12848s;
                if (ipVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (im0Var = ipVar.f38064b) != null) {
                        s4.g0 adapter = im0Var.getAdapter();
                        hp hpVar = ipVar.e;
                        if (adapter != hpVar) {
                            ipVar.f38064b.setAdapter(hpVar);
                            View view = ipVar.fragmentView;
                            int i10 = h6.f20987d6;
                            view.setBackgroundColor(h6.x0(null, i10, false));
                            ipVar.fragmentView.setTag(Integer.valueOf(i10));
                            ipVar.e.l();
                            ipVar.f38064b.setFastScrollVisible(false);
                            ipVar.f38064b.setVerticalScrollBarEnabled(true);
                            ipVar.d.b();
                        }
                    }
                    ipVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                hr hrVar = (hr) this.f12848s;
                if (hrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (hrVar.f37715c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = hrVar.f37715c.getAdapter().h();
                    }
                    hrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (u1Var = hrVar.f37715c) != null) {
                        s4.g0 adapter2 = u1Var.getAdapter();
                        dr drVar = hrVar.f37709a;
                        if (adapter2 != drVar) {
                            ai.u1 u1Var2 = hrVar.f37715c;
                            u1Var2.W1 = false;
                            u1Var2.X1 = 0;
                            u1Var2.setAdapter(drVar);
                            if (h == 0) {
                                hrVar.y0(0);
                            }
                        }
                    }
                    hrVar.D1.setVisibility(8);
                    hrVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                k8 k8Var = (k8) this.f12848s;
                if (editText.length() > 0) {
                    k8Var.f27763s.E(editText.getText().toString());
                    return;
                }
                k8Var.f27748f = false;
                k8Var.f27763s.E(null);
                return;
            case 5:
                ((nk) this.f12848s).f28794y.Y(editText.getText().toString(), false);
                return;
            case 6:
                rl rlVar = (rl) this.f12848s;
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
                        if (llVar.f11818s.size() == 0 && llVar.f11817r.size() == 0) {
                            z10 = true;
                        }
                        rlVar.f29980n0 = z10;
                        rlVar.i0();
                    } else {
                        u1Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        im0Var2.setAdapter(null);
                        im0Var2.setVisibility(8);
                        rlVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, rlVar.f29985r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.f12848s;
                if (contactsActivity.f33090r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33073c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33081i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        im0 im0Var3 = contactsActivity.f33077f;
                        if (im0Var3 != null) {
                            im0Var3.setAdapter(contactsActivity.f33090r);
                            contactsActivity.f33077f.setSectionsType(0);
                            contactsActivity.f33090r.l();
                            contactsActivity.f33077f.setFastScrollVisible(false);
                            contactsActivity.f33077f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f33090r.G(obj4);
                        return;
                    }
                    im0 im0Var4 = contactsActivity.f33077f;
                    if (im0Var4 != null) {
                        im0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33077f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ot otVar = (ot) this.f12848s;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    mt mtVar = otVar.d;
                    mtVar.getClass();
                    mtVar.e = null;
                    otVar.e = false;
                    otVar.f39968a.setAdapter(otVar.f39970c);
                    otVar.f39968a.setFastScrollVisible(true);
                    return;
                }
                mt mtVar2 = otVar.d;
                mtVar2.getClass();
                if (obj5 == null) {
                    mtVar2.e = null;
                } else {
                    try {
                        Timer timer = mtVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    mtVar2.d = timer2;
                    timer2.schedule(new hg.r1(mtVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    otVar.e = true;
                    return;
                }
                return;
            case 9:
                av avVar = (av) this.f12848s;
                avVar.f35421a.getActionBar().setSearchFieldText(editText.getText().toString());
                avVar.f35422b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                a70 a70Var = (a70) this.f12848s;
                z60.E(a70Var.f35287f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != a70Var.M) {
                    a70Var.M = z11;
                    im0 im0Var5 = a70Var.d;
                    if (im0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = a70Var.f35287f;
                        } else {
                            g0Var = a70Var.e;
                        }
                        im0Var5.setAdapter(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f12848s;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    im0 im0Var6 = languageSelectActivity.f33144b;
                    if (im0Var6 != null) {
                        im0Var6.setAdapter(languageSelectActivity.f33145c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33144b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33144b.setAdapter(languageSelectActivity.f33143a);
                    return;
                }
                return;
            case 12:
                nc0 nc0Var = (nc0) this.f12848s;
                if (nc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        nc0Var.f39516s0 = true;
                        nc0Var.f39520w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = nc0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        nc0Var.U.setVisibility(8);
                        nc0Var.S.setVisibility(8);
                        s4.g0 adapter3 = nc0Var.V.getAdapter();
                        gc0 gc0Var = nc0Var.W;
                        if (adapter3 != gc0Var) {
                            nc0Var.V.setAdapter(gc0Var);
                        }
                        nc0Var.V.setVisibility(0);
                        if (nc0Var.W.h() == 0) {
                            z12 = true;
                        }
                        nc0Var.f39517t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = nc0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        nc0Var.U.setVisibility(0);
                        nc0Var.S.setVisibility(0);
                        nc0Var.V.setAdapter(null);
                        nc0Var.V.setVisibility(8);
                    }
                    nc0Var.A0();
                    nc0Var.W.G(obj8, nc0Var.f39523x0);
                    return;
                }
                return;
            case 13:
                ((jh0) this.f12848s).f38259a.j(editText.getText().toString());
                return;
            case 14:
                oq0 oq0Var = (oq0) this.f12848s;
                oq0Var.f39954a.getActionBar().setSearchFieldText(editText.getText().toString());
                oq0Var.f39955b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.f12848s).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                r21 r21Var = (r21) this.f12848s;
                if (obj9 == null) {
                    r21Var.f41034f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = r21Var.f41034f;
                    if (arrayList == null) {
                        r21Var.f41034f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < r21Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) r21Var.h.get(i11);
                        if (language.f17820q.startsWith(lowerCase)) {
                            r21Var.f41034f.add(0, language);
                        } else if (language.f17820q.contains(lowerCase)) {
                            r21Var.f41034f.add(language);
                        }
                    }
                    r21Var.f41033c.l();
                }
                if (obj9.length() != 0) {
                    im0 im0Var7 = r21Var.f41032b;
                    if (im0Var7 != null) {
                        im0Var7.setAdapter(r21Var.f41033c);
                        return;
                    }
                    return;
                } else if (r21Var.f41032b != null) {
                    r21Var.d.setVisibility(8);
                    r21Var.f41032b.setAdapter(r21Var.f41031a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((x71) this.f12848s).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                ne1 ne1Var = ((re1) this.f12848s).f41176r0;
                if (!ne1Var.f39558b0.equals(obj10)) {
                    ne1Var.K(ne1Var.e[0], ne1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                dg1 dg1Var = (dg1) this.f12848s;
                dg1Var.h = editText.getText().toString();
                v61 v61Var = dg1Var.f32025a;
                if (v61Var != null) {
                    v61Var.W2.N(true);
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
