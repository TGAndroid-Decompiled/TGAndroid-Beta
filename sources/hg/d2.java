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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.z51;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au;
import org.telegram.ui.bg1;
import org.telegram.ui.bi0;
import org.telegram.ui.cu;
import org.telegram.ui.dd0;
import org.telegram.ui.fg1;
import org.telegram.ui.g41;
import org.telegram.ui.g91;
import org.telegram.ui.ir0;
import org.telegram.ui.kd0;
import org.telegram.ui.pv;
import org.telegram.ui.qr;
import org.telegram.ui.u70;
import org.telegram.ui.ur;
import org.telegram.ui.v70;
import org.telegram.ui.vp;
import org.telegram.ui.wb;
import org.telegram.ui.wp;
import org.telegram.ui.wr;
public final class d2 extends h5 {
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
                ((ir0) this.h).finishFragment();
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
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                    w0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(w0Var.e);
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
                wb wbVar = (wb) this.h;
                wbVar.f38671v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.U0(true);
                    return;
                }
                return;
            case 2:
                wp wpVar = (wp) this.h;
                wpVar.e.F(null);
                wpVar.N = false;
                wpVar.getClass();
                wpVar.f39118b.setAdapter(wpVar.f39117a);
                wpVar.f39117a.l();
                wpVar.f39118b.setFastScrollVisible(true);
                wpVar.f39118b.setVerticalScrollBarEnabled(false);
                wpVar.d.setShowAtCenter(false);
                View view = wpVar.fragmentView;
                int i10 = j6.f18806a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                wpVar.fragmentView.setTag(Integer.valueOf(i10));
                wpVar.d.b();
                return;
            case 3:
                ur urVar = (ur) this.h;
                urVar.e.F(null);
                urVar.f38149o1 = false;
                ai.w0 w0Var = urVar.f38123c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(urVar.f38117a);
                urVar.f38117a.l();
                urVar.f38123c.setFastScrollVisible(true);
                urVar.f38123c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var2 = urVar.h;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(0);
                    return;
                }
                return;
            case 4:
                wr wrVar = (wr) this.h;
                wrVar.f39158n = null;
                z51 z51Var = wrVar.f22333a;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                h8 h8Var = (h8) this.h;
                if (h8Var.h) {
                    h8Var.f24550f = false;
                    h8Var.h = false;
                    h8Var.setAllowNestedScroll(true);
                    h8Var.f24565s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var3 = h8Var.f24556k0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) this.h;
                okVar.f26757b0 = false;
                okVar.G.setVisibility(0);
                dk dkVar = okVar.f26763r;
                s4.h0 adapter = dkVar.getAdapter();
                hk hkVar = okVar.v;
                if (adapter != hkVar) {
                    dkVar.setAdapter(hkVar);
                }
                hkVar.l();
                okVar.f26767y.Y(null, true);
                return;
            case 7:
                gl glVar = (gl) this.h;
                glVar.f24321l0 = false;
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
                contactsActivity.f30769r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f30756f.setAdapter(contactsActivity.d);
                contactsActivity.f30756f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f30756f.setFastScrollVisible(true);
                contactsActivity.f30756f.setVerticalScrollBarEnabled(false);
                contactsActivity.f30756f.getFastScroll().f28133h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                cu cuVar = (cu) this.h;
                au auVar = cuVar.d;
                auVar.getClass();
                auVar.e = null;
                cuVar.f32916f = false;
                cuVar.e = false;
                cuVar.f32913a.setAdapter(cuVar.f32915c);
                cuVar.f32913a.setFastScrollVisible(true);
                return;
            case 10:
                pv pvVar = (pv) this.h;
                pvVar.f36734a.getActionBar().h(false);
                pvVar.f36735b.getActionBar().h(false);
                return;
            case 11:
                v70 v70Var = (v70) this.h;
                if (v70Var.M) {
                    u70.E(v70Var.f38313f, null);
                    v70Var.M = false;
                    v70Var.d.setAdapter(v70Var.e);
                    return;
                }
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f30823b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f30823b.setAdapter(languageSelectActivity.f30822a);
                    return;
                }
                return;
            case 13:
                kd0 kd0Var = (kd0) this.h;
                kd0Var.f35236r0 = false;
                kd0Var.f35238s0 = false;
                kd0Var.W.G(null, null);
                kd0Var.B0();
                if (kd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var4 = kd0Var.Z;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                    }
                    kd0Var.U.setVisibility(0);
                    kd0Var.S.setVisibility(0);
                    kd0Var.V.setAdapter(null);
                    kd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ca0 ca0Var = ((bi0) this.h).f32186a;
                ca0Var.f45154y = false;
                ca0Var.j(null);
                return;
            case 15:
            case 16:
            default:
                return;
            case 17:
                g41 g41Var = (g41) this.h;
                g41Var.f33845f = null;
                if (g41Var.f33843b != null) {
                    g41Var.d.setVisibility(8);
                    g41Var.f33843b.setAdapter(g41Var.f33842a);
                    return;
                }
                return;
            case 18:
                g91 g91Var = (g91) this.h;
                g91Var.f33917a.a(false, true);
                g91Var.o0(false, true);
                g91Var.f33921c.Y2.N(false);
                return;
            case 19:
                fg1.b0((fg1) this.h, false);
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
                wb wbVar = (wb) this.h;
                wbVar.I.setVisibility(8);
                wbVar.getClass();
                return;
            case 2:
                wp wpVar = (wp) this.h;
                wpVar.N = true;
                wpVar.d.setShowAtCenter(true);
                return;
            case 3:
                ur urVar = (ur) this.h;
                urVar.f38149o1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = urVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                h8 h8Var = (h8) this.h;
                h8Var.f24566s0 = h8Var.f24563r.N0();
                View m10 = h8Var.f24563r.m(h8Var.f24566s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                h8Var.f24567t0 = top;
                h8Var.h = true;
                h8Var.setAllowNestedScroll(false);
                h8Var.f24565s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = h8Var.f24556k0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) this.h;
                okVar.f26757b0 = true;
                okVar.G.setVisibility(8);
                okVar.f26460b.t1(okVar.F.getSearchField(), true);
                return;
            case 7:
                gl glVar = (gl) this.h;
                glVar.f24321l0 = true;
                glVar.f26460b.t1(glVar.E.getSearchField(), true);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                ((cu) this.h).f32916f = true;
                return;
            case 10:
                pv pvVar = (pv) this.h;
                pvVar.f36734a.getActionBar().x("");
                pvVar.f36735b.getActionBar().x("");
                pvVar.f36736c.getSearchField().requestFocus();
                return;
            case 11:
                return;
            case 12:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 13:
                ((kd0) this.h).f35236r0 = true;
                return;
            case 14:
                ((bi0) this.h).f32186a.f45154y = true;
                return;
            case 15:
                ir0 ir0Var = (ir0) this.h;
                ir0Var.f34657a.getActionBar().x("");
                ir0Var.f34658b.getActionBar().x("");
                ir0Var.f34659c.getSearchField().requestFocus();
                return;
            case 16:
            default:
                return;
            case 17:
                return;
            case 18:
                g91 g91Var = (g91) this.h;
                g91Var.f33917a.a(true, true);
                g91Var.h.I("");
                g91Var.o0(false, true);
                g91Var.f33921c.Y2.N(false);
                return;
            case 19:
                fg1 fg1Var = (fg1) this.h;
                fg1.b0(fg1Var, true);
                bg1 bg1Var = fg1Var.f33670r0;
                if (!bg1Var.f32159c0.equals("")) {
                    bg1Var.L(bg1Var.e[0], bg1Var.getCurrentPosition(), "", false);
                }
                fg1Var.f33670r0.setAlpha(0.0f);
                fg1Var.f33670r0.f32170o0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f10255f) {
            case 6:
                ok okVar = (ok) this.h;
                nk nkVar = okVar.f26767y;
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
                wb wbVar = (wb) this.h;
                wbVar.U = true;
                wbVar.f38671v0 = h2Var.getText().toString();
                wbVar.U0(true);
                return;
            case 15:
                ir0 ir0Var = (ir0) this.h;
                ir0Var.f34657a.getActionBar().w();
                ir0Var.f34658b.getActionBar().w();
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
                wp wpVar = (wp) this.h;
                if (wpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (ml0Var = wpVar.f39118b) != null) {
                        s4.h0 adapter = ml0Var.getAdapter();
                        vp vpVar = wpVar.e;
                        if (adapter != vpVar) {
                            wpVar.f39118b.setAdapter(vpVar);
                            View view = wpVar.fragmentView;
                            int i10 = j6.f18862d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
                            wpVar.fragmentView.setTag(Integer.valueOf(i10));
                            wpVar.e.l();
                            wpVar.f39118b.setFastScrollVisible(false);
                            wpVar.f39118b.setVerticalScrollBarEnabled(true);
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
                    if (urVar.f38123c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = urVar.f38123c.getAdapter().h();
                    }
                    urVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = urVar.f38123c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        qr qrVar = urVar.f38117a;
                        if (adapter2 != qrVar) {
                            ai.w0 w0Var2 = urVar.f38123c;
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
                wr wrVar = (wr) this.h;
                wrVar.f39158n = editText.getText().toString();
                z51 z51Var = wrVar.f22333a;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                h8 h8Var = (h8) this.h;
                if (editText.length() > 0) {
                    h8Var.f24565s.E(editText.getText().toString());
                    return;
                }
                h8Var.f24550f = false;
                h8Var.f24565s.E(null);
                return;
            case 6:
                ((ok) this.h).f26767y.Y(editText.getText().toString(), false);
                return;
            case 7:
                gl glVar = (gl) this.h;
                ai.f0 f0Var = glVar.N;
                ai.w0 w0Var3 = glVar.P;
                ml0 ml0Var2 = glVar.Q;
                al alVar = glVar.R;
                if (alVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        glVar.m0 = true;
                        glVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (ml0Var2.getAdapter() != alVar) {
                            ml0Var2.setAdapter(alVar);
                        }
                        ml0Var2.setVisibility(0);
                        if (alVar.f9682s.size() == 0 && alVar.f9681r.size() == 0) {
                            z10 = true;
                        }
                        glVar.f24323n0 = z10;
                        glVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        ml0Var2.setAdapter(null);
                        ml0Var2.setVisibility(8);
                        glVar.v.setVisibility(8);
                    }
                    alVar.G(obj3, glVar.f24328r0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f30769r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f30752c.a(!obj4.isEmpty(), true);
                    contactsActivity.f30760i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        ml0 ml0Var3 = contactsActivity.f30756f;
                        if (ml0Var3 != null) {
                            ml0Var3.setAdapter(contactsActivity.f30769r);
                            contactsActivity.f30756f.setSectionsType(0);
                            contactsActivity.f30769r.l();
                            contactsActivity.f30756f.setFastScrollVisible(false);
                            contactsActivity.f30756f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f30769r.G(obj4);
                        return;
                    }
                    ml0 ml0Var4 = contactsActivity.f30756f;
                    if (ml0Var4 != null) {
                        ml0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f30756f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                cu cuVar = (cu) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    au auVar = cuVar.d;
                    auVar.getClass();
                    auVar.e = null;
                    cuVar.e = false;
                    cuVar.f32913a.setAdapter(cuVar.f32915c);
                    cuVar.f32913a.setFastScrollVisible(true);
                    return;
                }
                au auVar2 = cuVar.d;
                auVar2.getClass();
                if (obj5 == null) {
                    auVar2.e = null;
                } else {
                    try {
                        Timer timer = auVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    auVar2.d = timer2;
                    timer2.schedule(new gg.s1(auVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    cuVar.e = true;
                    return;
                }
                return;
            case 10:
                pv pvVar = (pv) this.h;
                pvVar.f36734a.getActionBar().setSearchFieldText(editText.getText().toString());
                pvVar.f36735b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                String obj6 = editText.getText().toString();
                v70 v70Var = (v70) this.h;
                u70.E(v70Var.f38313f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != v70Var.M) {
                    v70Var.M = z11;
                    ml0 ml0Var5 = v70Var.d;
                    if (ml0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = v70Var.f38313f;
                        } else {
                            h0Var = v70Var.e;
                        }
                        ml0Var5.setAdapter(h0Var);
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
                    ml0 ml0Var6 = languageSelectActivity.f30823b;
                    if (ml0Var6 != null) {
                        ml0Var6.setAdapter(languageSelectActivity.f30824c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f30823b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f30823b.setAdapter(languageSelectActivity.f30822a);
                    return;
                }
                return;
            case 13:
                kd0 kd0Var = (kd0) this.h;
                if (kd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        kd0Var.f35238s0 = true;
                        kd0Var.f35242w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var4 = kd0Var.Z;
                        if (w0Var4 != null) {
                            w0Var4.setVisibility(8);
                        }
                        kd0Var.U.setVisibility(8);
                        kd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = kd0Var.V.getAdapter();
                        dd0 dd0Var = kd0Var.W;
                        if (adapter3 != dd0Var) {
                            kd0Var.V.setAdapter(dd0Var);
                        }
                        kd0Var.V.setVisibility(0);
                        if (kd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        kd0Var.f35239t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var5 = kd0Var.Z;
                        if (w0Var5 != null) {
                            w0Var5.setVisibility(0);
                        }
                        kd0Var.U.setVisibility(0);
                        kd0Var.S.setVisibility(0);
                        kd0Var.V.setAdapter(null);
                        kd0Var.V.setVisibility(8);
                    }
                    kd0Var.B0();
                    kd0Var.W.G(obj8, kd0Var.f35245x0);
                    return;
                }
                return;
            case 14:
                ((bi0) this.h).f32186a.j(editText.getText().toString());
                return;
            case 15:
                ir0 ir0Var = (ir0) this.h;
                ir0Var.f34657a.getActionBar().setSearchFieldText(editText.getText().toString());
                ir0Var.f34658b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 16:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 17:
                String obj9 = editText.getText().toString();
                g41 g41Var = (g41) this.h;
                if (obj9 == null) {
                    g41Var.f33845f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = g41Var.f33845f;
                    if (arrayList == null) {
                        g41Var.f33845f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < g41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) g41Var.h.get(i11);
                        if (language.f15634q.startsWith(lowerCase)) {
                            g41Var.f33845f.add(0, language);
                        } else if (language.f15634q.contains(lowerCase)) {
                            g41Var.f33845f.add(language);
                        }
                    }
                    g41Var.f33844c.l();
                }
                if (obj9.length() != 0) {
                    ml0 ml0Var7 = g41Var.f33843b;
                    if (ml0Var7 != null) {
                        ml0Var7.setAdapter(g41Var.f33844c);
                        return;
                    }
                    return;
                } else if (g41Var.f33843b != null) {
                    g41Var.d.setVisibility(8);
                    g41Var.f33843b.setAdapter(g41Var.f33842a);
                    return;
                } else {
                    return;
                }
            case 18:
                ((g91) this.h).h.I(editText.getText().toString());
                return;
            case 19:
                String obj10 = editText.getText().toString();
                bg1 bg1Var = ((fg1) this.h).f33670r0;
                if (!bg1Var.f32159c0.equals(obj10)) {
                    bg1Var.L(bg1Var.e[0], bg1Var.getCurrentPosition(), obj10, false);
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
