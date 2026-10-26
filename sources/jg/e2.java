package jg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.af1;
import org.telegram.ui.d81;
import org.telegram.ui.e70;
import org.telegram.ui.f70;
import org.telegram.ui.gr;
import org.telegram.ui.ic0;
import org.telegram.ui.kh0;
import org.telegram.ui.kr;
import org.telegram.ui.mp;
import org.telegram.ui.mr;
import org.telegram.ui.mt;
import org.telegram.ui.np;
import org.telegram.ui.ot;
import org.telegram.ui.pc0;
import org.telegram.ui.vq0;
import org.telegram.ui.wb;
import org.telegram.ui.we1;
import org.telegram.ui.xj0;
import org.telegram.ui.y21;
import org.telegram.ui.zu;
public final class e2 extends org.telegram.ui.ActionBar.s0 {
    public final int f15691a;
    public final Object f15692b;

    public e2(Object obj, int i10) {
        this.f15691a = i10;
        this.f15692b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f15691a) {
            case 16:
                ((vq0) this.f15692b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator e() {
        switch (this.f15691a) {
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) this.f15692b;
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
                return ProfileActivity.I0(profileActivity, profileActivity.W1);
            default:
                return super.e();
        }
    }

    @Override
    public void h() {
        switch (this.f15691a) {
            case 0:
                f2 f2Var = (f2) this.f15692b;
                f2Var.d = false;
                f2Var.e = null;
                f2Var.f15704a.f32152g3.O(true);
                f2Var.f15704a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.f15692b;
                wbVar.f45087v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.V0(true);
                    return;
                }
                return;
            case 2:
                np npVar = (np) this.f15692b;
                npVar.e.F(null);
                npVar.N = false;
                npVar.getClass();
                npVar.f41962b.setAdapter(npVar.f41961a);
                npVar.f41961a.l();
                npVar.f41962b.setFastScrollVisible(true);
                npVar.f41962b.setVerticalScrollBarEnabled(false);
                npVar.d.setShowAtCenter(false);
                npVar.d.b();
                return;
            case 3:
                kr krVar = (kr) this.f15692b;
                krVar.e.F(null);
                krVar.f41034n1 = false;
                bi.r1 r1Var = krVar.f41010c;
                r1Var.W1 = false;
                r1Var.X1 = 0;
                r1Var.setAdapter(krVar.f41004a);
                krVar.f41004a.l();
                krVar.f41010c.setFastScrollVisible(true);
                krVar.f41010c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                mr mrVar = (mr) this.f15692b;
                mrVar.f41647n = null;
                l71 l71Var = mrVar.f30419a;
                if (l71Var != null) {
                    l71Var.f32152g3.O(true);
                    return;
                }
                return;
            case 5:
                m8 m8Var = (m8) this.f15692b;
                if (m8Var.h) {
                    m8Var.f30429f = false;
                    m8Var.h = false;
                    m8Var.setAllowNestedScroll(true);
                    m8Var.f30444s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var = m8Var.f30434j0;
                    if (w0Var != null) {
                        w0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                nk nkVar = (nk) this.f15692b;
                nkVar.f31028b0 = false;
                nkVar.G.setVisibility(0);
                ck ckVar = nkVar.f31034r;
                s4.h0 adapter = ckVar.getAdapter();
                gk gkVar = nkVar.v;
                if (adapter != gkVar) {
                    ckVar.setAdapter(gkVar);
                }
                gkVar.l();
                nkVar.f31038y.Y(null, true);
                return;
            case 7:
                sl slVar = (sl) this.f15692b;
                slVar.f32601i0 = false;
                slVar.f32602j0 = false;
                slVar.P.G(null, null);
                slVar.i0();
                slVar.N.setVisibility(0);
                slVar.L.setVisibility(0);
                slVar.O.setVisibility(8);
                slVar.v.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.f15692b;
                contactsActivity.h.G(null);
                contactsActivity.f35458b0 = null;
                contactsActivity.f35477y = false;
                contactsActivity.f35476x = false;
                contactsActivity.d.setAdapter(contactsActivity.f35457b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f35457b.l();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.c0(contactsActivity);
                return;
            case 9:
                ot otVar = (ot) this.f15692b;
                mt mtVar = otVar.d;
                mtVar.getClass();
                mtVar.e = null;
                otVar.f42284f = false;
                otVar.e = false;
                otVar.f42281a.setAdapter(otVar.f42283c);
                otVar.f42281a.setFastScrollVisible(true);
                return;
            case 10:
                zu zuVar = (zu) this.f15692b;
                zuVar.f46363a.getActionBar().g(false);
                zuVar.f46364b.getActionBar().g(false);
                return;
            case 11:
                f70 f70Var = (f70) this.f15692b;
                if (f70Var.M) {
                    e70.E(f70Var.f39291f, null);
                    f70Var.M = false;
                    f70Var.d.setAdapter(f70Var.e);
                    return;
                }
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f15692b;
                languageSelectActivity.j0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35518b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35518b.setAdapter(languageSelectActivity.f35517a);
                    return;
                }
                return;
            case 13:
                pc0 pc0Var = (pc0) this.f15692b;
                pc0Var.f42448q0 = false;
                pc0Var.f42450r0 = false;
                pc0Var.W.G(null, null);
                pc0Var.C0();
                if (pc0Var.F0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = pc0Var.Z;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                    }
                    pc0Var.U.setVisibility(0);
                    pc0Var.S.setVisibility(0);
                    pc0Var.V.setAdapter(null);
                    pc0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                ua0 ua0Var = ((kh0) this.f15692b).f40947a;
                ua0Var.f52630y = false;
                ua0Var.j(null);
                return;
            case 15:
                xj0.Y((xj0) this.f15692b, false);
                return;
            case 16:
            case 17:
            default:
                return;
            case 18:
                y21 y21Var = (y21) this.f15692b;
                y21Var.f45941f = null;
                if (y21Var.f45939b != null) {
                    y21Var.d.setVisibility(8);
                    y21Var.f45939b.setAdapter(y21Var.f45938a);
                    return;
                }
                return;
            case 19:
                d81 d81Var = (d81) this.f15692b;
                d81Var.f38758a.a(false, true);
                d81Var.n0(false, true);
                d81Var.f38762c.f32152g3.O(false);
                return;
            case 20:
                af1.b0((af1) this.f15692b, false);
                return;
        }
    }

    @Override
    public void i() {
        int top;
        switch (this.f15691a) {
            case 0:
                f2 f2Var = (f2) this.f15692b;
                f2Var.d = true;
                f2Var.f15704a.f32152g3.O(true);
                f2Var.f15704a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.f15692b;
                wbVar.I.setVisibility(8);
                wbVar.getClass();
                return;
            case 2:
                np npVar = (np) this.f15692b;
                npVar.N = true;
                npVar.d.setShowAtCenter(true);
                return;
            case 3:
                ((kr) this.f15692b).f41034n1 = true;
                return;
            case 4:
                return;
            case 5:
                m8 m8Var = (m8) this.f15692b;
                m8Var.f30443r0 = m8Var.f30442r.N0();
                View m10 = m8Var.f30442r.m(m8Var.f30443r0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                m8Var.f30445s0 = top;
                m8Var.h = true;
                m8Var.setAllowNestedScroll(false);
                m8Var.f30444s.l();
                org.telegram.ui.ActionBar.w0 w0Var = m8Var.f30434j0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 6:
                nk nkVar = (nk) this.f15692b;
                nkVar.f31028b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.f30215b.y1(nkVar.F.getSearchField(), true);
                return;
            case 7:
                sl slVar = (sl) this.f15692b;
                slVar.f32601i0 = true;
                slVar.f30215b.y1(slVar.f32619x.getSearchField(), true);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.f15692b;
                contactsActivity.f35477y = true;
                ContactsActivity.c0(contactsActivity);
                return;
            case 9:
                ((ot) this.f15692b).f42284f = true;
                return;
            case 10:
                zu zuVar = (zu) this.f15692b;
                zuVar.f46363a.getActionBar().v();
                zuVar.f46364b.getActionBar().v();
                zuVar.f46365c.getSearchField().requestFocus();
                return;
            case 11:
                return;
            case 12:
                ((LanguageSelectActivity) this.f15692b).getClass();
                return;
            case 13:
                ((pc0) this.f15692b).f42448q0 = true;
                return;
            case 14:
                ((kh0) this.f15692b).f40947a.f52630y = true;
                return;
            case 15:
                xj0.Y((xj0) this.f15692b, true);
                return;
            case 16:
                vq0 vq0Var = (vq0) this.f15692b;
                vq0Var.f44885a.getActionBar().v();
                vq0Var.f44886b.getActionBar().v();
                vq0Var.f44887c.getSearchField().requestFocus();
                return;
            case 17:
            default:
                return;
            case 18:
                return;
            case 19:
                d81 d81Var = (d81) this.f15692b;
                d81Var.f38758a.a(true, true);
                d81Var.f38766f.I("");
                d81Var.n0(false, true);
                d81Var.f38762c.f32152g3.O(false);
                return;
            case 20:
                af1 af1Var = (af1) this.f15692b;
                af1.b0(af1Var, true);
                we1 we1Var = af1Var.f37771r0;
                if (!we1Var.f45125d0.equals("")) {
                    we1Var.M(we1Var.e[0], we1Var.getCurrentPosition(), "", false);
                }
                af1Var.f37771r0.setAlpha(0.0f);
                af1Var.f37771r0.f45136p0.e(true, false);
                return;
        }
    }

    @Override
    public void j(ig.p0 p0Var) {
        switch (this.f15691a) {
            case 6:
                nk nkVar = (nk) this.f15692b;
                mk mkVar = nkVar.f31038y;
                mkVar.R.remove(p0Var);
                mkVar.Y(nkVar.F.getSearchField().getText().toString(), false);
                mkVar.a0(null, null, true);
                return;
            case 20:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f15691a) {
            case 1:
                wb wbVar = (wb) this.f15692b;
                wbVar.U = true;
                wbVar.f45087v0 = editTextBoldCursor.getText().toString();
                wbVar.V0(true);
                return;
            case 16:
                vq0 vq0Var = (vq0) this.f15692b;
                vq0Var.f44885a.getActionBar().u();
                vq0Var.f44886b.getActionBar().u();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        mm0 mm0Var;
        int h;
        bi.r1 r1Var;
        s4.h0 h0Var;
        switch (this.f15691a) {
            case 0:
                f2 f2Var = (f2) this.f15692b;
                f2Var.e = editText.getText().toString();
                f2Var.f15704a.f32152g3.O(true);
                f2Var.f15704a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                np npVar = (np) this.f15692b;
                if (npVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (mm0Var = npVar.f41962b) != null) {
                        s4.h0 adapter = mm0Var.getAdapter();
                        mp mpVar = npVar.e;
                        if (adapter != mpVar) {
                            npVar.f41962b.setAdapter(mpVar);
                            npVar.e.l();
                            npVar.f41962b.setFastScrollVisible(false);
                            npVar.f41962b.setVerticalScrollBarEnabled(true);
                            npVar.d.b();
                        }
                    }
                    npVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                kr krVar = (kr) this.f15692b;
                if (krVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (krVar.f41010c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = krVar.f41010c.getAdapter().h();
                    }
                    krVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (r1Var = krVar.f41010c) != null) {
                        s4.h0 adapter2 = r1Var.getAdapter();
                        gr grVar = krVar.f41004a;
                        if (adapter2 != grVar) {
                            bi.r1 r1Var2 = krVar.f41010c;
                            r1Var2.W1 = false;
                            r1Var2.X1 = 0;
                            r1Var2.setAdapter(grVar);
                            if (h == 0) {
                                krVar.z0(0);
                            }
                        }
                    }
                    krVar.C1.setVisibility(8);
                    krVar.B1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                mr mrVar = (mr) this.f15692b;
                mrVar.f41647n = editText.getText().toString();
                l71 l71Var = mrVar.f30419a;
                if (l71Var != null) {
                    l71Var.f32152g3.O(true);
                    return;
                }
                return;
            case 5:
                m8 m8Var = (m8) this.f15692b;
                if (editText.length() > 0) {
                    m8Var.f30444s.E(editText.getText().toString());
                    return;
                }
                m8Var.f30429f = false;
                m8Var.f30444s.E(null);
                return;
            case 6:
                ((nk) this.f15692b).f31038y.Y(editText.getText().toString(), false);
                return;
            case 7:
                sl slVar = (sl) this.f15692b;
                bh.r rVar = slVar.L;
                bi.r1 r1Var3 = slVar.N;
                mm0 mm0Var2 = slVar.O;
                ll llVar = slVar.P;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        slVar.f32602j0 = true;
                        slVar.f32619x.setShowSearchProgress(true);
                        r1Var3.setVisibility(8);
                        rVar.setVisibility(8);
                        if (mm0Var2.getAdapter() != llVar) {
                            mm0Var2.setAdapter(llVar);
                        }
                        mm0Var2.setVisibility(0);
                        if (llVar.f14012s.size() == 0 && llVar.f14011r.size() == 0) {
                            z10 = true;
                        }
                        slVar.f32603k0 = z10;
                        slVar.i0();
                    } else {
                        r1Var3.setVisibility(0);
                        rVar.setVisibility(0);
                        mm0Var2.setAdapter(null);
                        mm0Var2.setVisibility(8);
                        slVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, slVar.f32607o0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.f15692b;
                if (contactsActivity.h != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f35458b0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.f35476x = true;
                        mm0 mm0Var3 = contactsActivity.d;
                        if (mm0Var3 != null) {
                            mm0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.l();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f35459c.e(true, true);
                        contactsActivity.h.G(obj4);
                        return;
                    }
                    contactsActivity.f35476x = false;
                    contactsActivity.h.G(null);
                    mm0 mm0Var4 = contactsActivity.d;
                    if (mm0Var4 != null) {
                        mm0Var4.setAdapter(contactsActivity.f35457b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ot otVar = (ot) this.f15692b;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    mt mtVar = otVar.d;
                    mtVar.getClass();
                    mtVar.e = null;
                    otVar.e = false;
                    otVar.f42281a.setAdapter(otVar.f42283c);
                    otVar.f42281a.setFastScrollVisible(true);
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
                    timer2.schedule(new ig.r1(mtVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    otVar.e = true;
                    return;
                }
                return;
            case 10:
                zu zuVar = (zu) this.f15692b;
                zuVar.f46363a.getActionBar().setSearchFieldText(editText.getText().toString());
                zuVar.f46364b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                String obj6 = editText.getText().toString();
                f70 f70Var = (f70) this.f15692b;
                e70.E(f70Var.f39291f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != f70Var.M) {
                    f70Var.M = z11;
                    mm0 mm0Var5 = f70Var.d;
                    if (mm0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = f70Var.f39291f;
                        } else {
                            h0Var = f70Var.e;
                        }
                        mm0Var5.setAdapter(h0Var);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f15692b;
                languageSelectActivity.j0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    mm0 mm0Var6 = languageSelectActivity.f35518b;
                    if (mm0Var6 != null) {
                        mm0Var6.setAdapter(languageSelectActivity.f35519c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35518b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35518b.setAdapter(languageSelectActivity.f35517a);
                    return;
                }
                return;
            case 13:
                pc0 pc0Var = (pc0) this.f15692b;
                if (pc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        pc0Var.f42450r0 = true;
                        pc0Var.f42456w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = pc0Var.Z;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        pc0Var.U.setVisibility(8);
                        pc0Var.S.setVisibility(8);
                        s4.h0 adapter3 = pc0Var.V.getAdapter();
                        ic0 ic0Var = pc0Var.W;
                        if (adapter3 != ic0Var) {
                            pc0Var.V.setAdapter(ic0Var);
                        }
                        pc0Var.V.setVisibility(0);
                        if (pc0Var.W.h() == 0) {
                            z12 = true;
                        }
                        pc0Var.f42452s0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = pc0Var.Z;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        pc0Var.U.setVisibility(0);
                        pc0Var.S.setVisibility(0);
                        pc0Var.V.setAdapter(null);
                        pc0Var.V.setVisibility(8);
                    }
                    pc0Var.C0();
                    pc0Var.W.G(obj8, pc0Var.f42457w0);
                    return;
                }
                return;
            case 14:
                ((kh0) this.f15692b).f40947a.j(editText.getText().toString());
                return;
            case 15:
                ((xj0) this.f15692b).n0(editText.getText().toString().trim());
                return;
            case 16:
                vq0 vq0Var = (vq0) this.f15692b;
                vq0Var.f44885a.getActionBar().setSearchFieldText(editText.getText().toString());
                vq0Var.f44886b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 17:
                ((ProfileActivity) this.f15692b).e.I(editText.getText().toString().toLowerCase());
                return;
            case 18:
                String obj9 = editText.getText().toString();
                y21 y21Var = (y21) this.f15692b;
                if (obj9 == null) {
                    y21Var.f45941f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = y21Var.f45941f;
                    if (arrayList == null) {
                        y21Var.f45941f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < y21Var.h.size(); i10++) {
                        TranslateController.Language language = (TranslateController.Language) y21Var.h.get(i10);
                        if (language.f19570q.startsWith(lowerCase)) {
                            y21Var.f45941f.add(0, language);
                        } else if (language.f19570q.contains(lowerCase)) {
                            y21Var.f45941f.add(language);
                        }
                    }
                    y21Var.f45940c.l();
                }
                if (obj9.length() != 0) {
                    mm0 mm0Var7 = y21Var.f45939b;
                    if (mm0Var7 != null) {
                        mm0Var7.setAdapter(y21Var.f45940c);
                        return;
                    }
                    return;
                } else if (y21Var.f45939b != null) {
                    y21Var.d.setVisibility(8);
                    y21Var.f45939b.setAdapter(y21Var.f45938a);
                    return;
                } else {
                    return;
                }
            case 19:
                ((d81) this.f15692b).f38766f.I(editText.getText().toString());
                return;
            case 20:
                String obj10 = editText.getText().toString();
                we1 we1Var = ((af1) this.f15692b).f37771r0;
                if (!we1Var.f45125d0.equals(obj10)) {
                    we1Var.M(we1Var.e[0], we1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
        }
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q(ig.p0 p0Var) {
    }
}
