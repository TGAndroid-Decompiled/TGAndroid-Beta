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
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.va0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a31;
import org.telegram.ui.bv;
import org.telegram.ui.cf1;
import org.telegram.ui.f81;
import org.telegram.ui.g70;
import org.telegram.ui.h70;
import org.telegram.ui.ir;
import org.telegram.ui.kc0;
import org.telegram.ui.mh0;
import org.telegram.ui.mr;
import org.telegram.ui.op;
import org.telegram.ui.or;
import org.telegram.ui.ot;
import org.telegram.ui.pp;
import org.telegram.ui.qt;
import org.telegram.ui.rc0;
import org.telegram.ui.wb;
import org.telegram.ui.xq0;
import org.telegram.ui.ye1;
import org.telegram.ui.zj0;
public final class e2 extends org.telegram.ui.ActionBar.s0 {
    public final int f15690a;
    public final Object f15691b;

    public e2(Object obj, int i10) {
        this.f15690a = i10;
        this.f15691b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f15690a) {
            case 16:
                ((xq0) this.f15691b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator e() {
        switch (this.f15690a) {
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) this.f15691b;
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
        switch (this.f15690a) {
            case 0:
                f2 f2Var = (f2) this.f15691b;
                f2Var.d = false;
                f2Var.e = null;
                f2Var.f15703a.f32504g3.O(true);
                f2Var.f15703a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.f15691b;
                wbVar.f44613v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.V0(true);
                    return;
                }
                return;
            case 2:
                pp ppVar = (pp) this.f15691b;
                ppVar.e.F(null);
                ppVar.N = false;
                ppVar.getClass();
                ppVar.f42465b.setAdapter(ppVar.f42464a);
                ppVar.f42464a.l();
                ppVar.f42465b.setFastScrollVisible(true);
                ppVar.f42465b.setVerticalScrollBarEnabled(false);
                ppVar.d.setShowAtCenter(false);
                ppVar.d.b();
                return;
            case 3:
                mr mrVar = (mr) this.f15691b;
                mrVar.e.F(null);
                mrVar.f41532n1 = false;
                bi.r1 r1Var = mrVar.f41508c;
                r1Var.W1 = false;
                r1Var.X1 = 0;
                r1Var.setAdapter(mrVar.f41502a);
                mrVar.f41502a.l();
                mrVar.f41508c.setFastScrollVisible(true);
                mrVar.f41508c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                or orVar = (or) this.f15691b;
                orVar.f42179n = null;
                m71 m71Var = orVar.f30764a;
                if (m71Var != null) {
                    m71Var.f32504g3.O(true);
                    return;
                }
                return;
            case 5:
                m8 m8Var = (m8) this.f15691b;
                if (m8Var.h) {
                    m8Var.f30436f = false;
                    m8Var.h = false;
                    m8Var.setAllowNestedScroll(true);
                    m8Var.f30451s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var = m8Var.f30441j0;
                    if (w0Var != null) {
                        w0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                nk nkVar = (nk) this.f15691b;
                nkVar.f30941b0 = false;
                nkVar.G.setVisibility(0);
                ck ckVar = nkVar.f30947r;
                s4.h0 adapter = ckVar.getAdapter();
                gk gkVar = nkVar.v;
                if (adapter != gkVar) {
                    ckVar.setAdapter(gkVar);
                }
                gkVar.l();
                nkVar.f30951y.Y(null, true);
                return;
            case 7:
                sl slVar = (sl) this.f15691b;
                slVar.f32622i0 = false;
                slVar.f32623j0 = false;
                slVar.P.G(null, null);
                slVar.i0();
                slVar.N.setVisibility(0);
                slVar.L.setVisibility(0);
                slVar.O.setVisibility(8);
                slVar.v.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.f15691b;
                contactsActivity.h.G(null);
                contactsActivity.f35482b0 = null;
                contactsActivity.f35501y = false;
                contactsActivity.f35500x = false;
                contactsActivity.d.setAdapter(contactsActivity.f35481b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f35481b.l();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.c0(contactsActivity);
                return;
            case 9:
                qt qtVar = (qt) this.f15691b;
                ot otVar = qtVar.d;
                otVar.getClass();
                otVar.e = null;
                qtVar.f42785f = false;
                qtVar.e = false;
                qtVar.f42782a.setAdapter(qtVar.f42784c);
                qtVar.f42782a.setFastScrollVisible(true);
                return;
            case 10:
                bv bvVar = (bv) this.f15691b;
                bvVar.f38105a.getActionBar().g(false);
                bvVar.f38106b.getActionBar().g(false);
                return;
            case 11:
                h70 h70Var = (h70) this.f15691b;
                if (h70Var.M) {
                    g70.E(h70Var.f39806f, null);
                    h70Var.M = false;
                    h70Var.d.setAdapter(h70Var.e);
                    return;
                }
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f15691b;
                languageSelectActivity.j0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35542b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35542b.setAdapter(languageSelectActivity.f35541a);
                    return;
                }
                return;
            case 13:
                rc0 rc0Var = (rc0) this.f15691b;
                rc0Var.f42941q0 = false;
                rc0Var.f42943r0 = false;
                rc0Var.W.G(null, null);
                rc0Var.C0();
                if (rc0Var.F0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = rc0Var.Z;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                    }
                    rc0Var.U.setVisibility(0);
                    rc0Var.S.setVisibility(0);
                    rc0Var.V.setAdapter(null);
                    rc0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                va0 va0Var = ((mh0) this.f15691b).f41444a;
                va0Var.f52688y = false;
                va0Var.j(null);
                return;
            case 15:
                zj0.Y((zj0) this.f15691b, false);
                return;
            case 16:
            case 17:
            default:
                return;
            case 18:
                a31 a31Var = (a31) this.f15691b;
                a31Var.f37675f = null;
                if (a31Var.f37673b != null) {
                    a31Var.d.setVisibility(8);
                    a31Var.f37673b.setAdapter(a31Var.f37672a);
                    return;
                }
                return;
            case 19:
                f81 f81Var = (f81) this.f15691b;
                f81Var.f39256a.a(false, true);
                f81Var.n0(false, true);
                f81Var.f39260c.f32504g3.O(false);
                return;
            case 20:
                cf1.b0((cf1) this.f15691b, false);
                return;
        }
    }

    @Override
    public void i() {
        int top;
        switch (this.f15690a) {
            case 0:
                f2 f2Var = (f2) this.f15691b;
                f2Var.d = true;
                f2Var.f15703a.f32504g3.O(true);
                f2Var.f15703a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.f15691b;
                wbVar.I.setVisibility(8);
                wbVar.getClass();
                return;
            case 2:
                pp ppVar = (pp) this.f15691b;
                ppVar.N = true;
                ppVar.d.setShowAtCenter(true);
                return;
            case 3:
                ((mr) this.f15691b).f41532n1 = true;
                return;
            case 4:
                return;
            case 5:
                m8 m8Var = (m8) this.f15691b;
                m8Var.f30450r0 = m8Var.f30449r.N0();
                View m10 = m8Var.f30449r.m(m8Var.f30450r0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                m8Var.f30452s0 = top;
                m8Var.h = true;
                m8Var.setAllowNestedScroll(false);
                m8Var.f30451s.l();
                org.telegram.ui.ActionBar.w0 w0Var = m8Var.f30441j0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 6:
                nk nkVar = (nk) this.f15691b;
                nkVar.f30941b0 = true;
                nkVar.G.setVisibility(8);
                nkVar.f30254b.z1(nkVar.F.getSearchField(), true);
                return;
            case 7:
                sl slVar = (sl) this.f15691b;
                slVar.f32622i0 = true;
                slVar.f30254b.z1(slVar.f32640x.getSearchField(), true);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.f15691b;
                contactsActivity.f35501y = true;
                ContactsActivity.c0(contactsActivity);
                return;
            case 9:
                ((qt) this.f15691b).f42785f = true;
                return;
            case 10:
                bv bvVar = (bv) this.f15691b;
                bvVar.f38105a.getActionBar().v();
                bvVar.f38106b.getActionBar().v();
                bvVar.f38107c.getSearchField().requestFocus();
                return;
            case 11:
                return;
            case 12:
                ((LanguageSelectActivity) this.f15691b).getClass();
                return;
            case 13:
                ((rc0) this.f15691b).f42941q0 = true;
                return;
            case 14:
                ((mh0) this.f15691b).f41444a.f52688y = true;
                return;
            case 15:
                zj0.Y((zj0) this.f15691b, true);
                return;
            case 16:
                xq0 xq0Var = (xq0) this.f15691b;
                xq0Var.f45760a.getActionBar().v();
                xq0Var.f45761b.getActionBar().v();
                xq0Var.f45762c.getSearchField().requestFocus();
                return;
            case 17:
            default:
                return;
            case 18:
                return;
            case 19:
                f81 f81Var = (f81) this.f15691b;
                f81Var.f39256a.a(true, true);
                f81Var.f39264f.I("");
                f81Var.n0(false, true);
                f81Var.f39260c.f32504g3.O(false);
                return;
            case 20:
                cf1 cf1Var = (cf1) this.f15691b;
                cf1.b0(cf1Var, true);
                ye1 ye1Var = cf1Var.f38325r0;
                if (!ye1Var.f45986d0.equals("")) {
                    ye1Var.M(ye1Var.e[0], ye1Var.getCurrentPosition(), "", false);
                }
                cf1Var.f38325r0.setAlpha(0.0f);
                cf1Var.f38325r0.f45997p0.e(true, false);
                return;
        }
    }

    @Override
    public void j(ig.p0 p0Var) {
        switch (this.f15690a) {
            case 6:
                nk nkVar = (nk) this.f15691b;
                mk mkVar = nkVar.f30951y;
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
        switch (this.f15690a) {
            case 1:
                wb wbVar = (wb) this.f15691b;
                wbVar.U = true;
                wbVar.f44613v0 = editTextBoldCursor.getText().toString();
                wbVar.V0(true);
                return;
            case 16:
                xq0 xq0Var = (xq0) this.f15691b;
                xq0Var.f45760a.getActionBar().u();
                xq0Var.f45761b.getActionBar().u();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        nm0 nm0Var;
        int h;
        bi.r1 r1Var;
        s4.h0 h0Var;
        switch (this.f15690a) {
            case 0:
                f2 f2Var = (f2) this.f15691b;
                f2Var.e = editText.getText().toString();
                f2Var.f15703a.f32504g3.O(true);
                f2Var.f15703a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                pp ppVar = (pp) this.f15691b;
                if (ppVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (nm0Var = ppVar.f42465b) != null) {
                        s4.h0 adapter = nm0Var.getAdapter();
                        op opVar = ppVar.e;
                        if (adapter != opVar) {
                            ppVar.f42465b.setAdapter(opVar);
                            ppVar.e.l();
                            ppVar.f42465b.setFastScrollVisible(false);
                            ppVar.f42465b.setVerticalScrollBarEnabled(true);
                            ppVar.d.b();
                        }
                    }
                    ppVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                mr mrVar = (mr) this.f15691b;
                if (mrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (mrVar.f41508c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = mrVar.f41508c.getAdapter().h();
                    }
                    mrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (r1Var = mrVar.f41508c) != null) {
                        s4.h0 adapter2 = r1Var.getAdapter();
                        ir irVar = mrVar.f41502a;
                        if (adapter2 != irVar) {
                            bi.r1 r1Var2 = mrVar.f41508c;
                            r1Var2.W1 = false;
                            r1Var2.X1 = 0;
                            r1Var2.setAdapter(irVar);
                            if (h == 0) {
                                mrVar.z0(0);
                            }
                        }
                    }
                    mrVar.C1.setVisibility(8);
                    mrVar.B1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                or orVar = (or) this.f15691b;
                orVar.f42179n = editText.getText().toString();
                m71 m71Var = orVar.f30764a;
                if (m71Var != null) {
                    m71Var.f32504g3.O(true);
                    return;
                }
                return;
            case 5:
                m8 m8Var = (m8) this.f15691b;
                if (editText.length() > 0) {
                    m8Var.f30451s.E(editText.getText().toString());
                    return;
                }
                m8Var.f30436f = false;
                m8Var.f30451s.E(null);
                return;
            case 6:
                ((nk) this.f15691b).f30951y.Y(editText.getText().toString(), false);
                return;
            case 7:
                sl slVar = (sl) this.f15691b;
                bh.r rVar = slVar.L;
                bi.r1 r1Var3 = slVar.N;
                nm0 nm0Var2 = slVar.O;
                ll llVar = slVar.P;
                if (llVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        slVar.f32623j0 = true;
                        slVar.f32640x.setShowSearchProgress(true);
                        r1Var3.setVisibility(8);
                        rVar.setVisibility(8);
                        if (nm0Var2.getAdapter() != llVar) {
                            nm0Var2.setAdapter(llVar);
                        }
                        nm0Var2.setVisibility(0);
                        if (llVar.f14011s.size() == 0 && llVar.f14010r.size() == 0) {
                            z10 = true;
                        }
                        slVar.f32624k0 = z10;
                        slVar.i0();
                    } else {
                        r1Var3.setVisibility(0);
                        rVar.setVisibility(0);
                        nm0Var2.setAdapter(null);
                        nm0Var2.setVisibility(8);
                        slVar.v.setVisibility(8);
                    }
                    llVar.G(obj3, slVar.f32628o0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.f15691b;
                if (contactsActivity.h != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f35482b0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.f35500x = true;
                        nm0 nm0Var3 = contactsActivity.d;
                        if (nm0Var3 != null) {
                            nm0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.l();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f35483c.e(true, true);
                        contactsActivity.h.G(obj4);
                        return;
                    }
                    contactsActivity.f35500x = false;
                    contactsActivity.h.G(null);
                    nm0 nm0Var4 = contactsActivity.d;
                    if (nm0Var4 != null) {
                        nm0Var4.setAdapter(contactsActivity.f35481b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                qt qtVar = (qt) this.f15691b;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    ot otVar = qtVar.d;
                    otVar.getClass();
                    otVar.e = null;
                    qtVar.e = false;
                    qtVar.f42782a.setAdapter(qtVar.f42784c);
                    qtVar.f42782a.setFastScrollVisible(true);
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
                    timer2.schedule(new ig.r1(otVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    qtVar.e = true;
                    return;
                }
                return;
            case 10:
                bv bvVar = (bv) this.f15691b;
                bvVar.f38105a.getActionBar().setSearchFieldText(editText.getText().toString());
                bvVar.f38106b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                String obj6 = editText.getText().toString();
                h70 h70Var = (h70) this.f15691b;
                g70.E(h70Var.f39806f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != h70Var.M) {
                    h70Var.M = z11;
                    nm0 nm0Var5 = h70Var.d;
                    if (nm0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = h70Var.f39806f;
                        } else {
                            h0Var = h70Var.e;
                        }
                        nm0Var5.setAdapter(h0Var);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f15691b;
                languageSelectActivity.j0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    nm0 nm0Var6 = languageSelectActivity.f35542b;
                    if (nm0Var6 != null) {
                        nm0Var6.setAdapter(languageSelectActivity.f35543c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35542b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35542b.setAdapter(languageSelectActivity.f35541a);
                    return;
                }
                return;
            case 13:
                rc0 rc0Var = (rc0) this.f15691b;
                if (rc0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        rc0Var.f42943r0 = true;
                        rc0Var.f42949w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = rc0Var.Z;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        rc0Var.U.setVisibility(8);
                        rc0Var.S.setVisibility(8);
                        s4.h0 adapter3 = rc0Var.V.getAdapter();
                        kc0 kc0Var = rc0Var.W;
                        if (adapter3 != kc0Var) {
                            rc0Var.V.setAdapter(kc0Var);
                        }
                        rc0Var.V.setVisibility(0);
                        if (rc0Var.W.h() == 0) {
                            z12 = true;
                        }
                        rc0Var.f42945s0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = rc0Var.Z;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        rc0Var.U.setVisibility(0);
                        rc0Var.S.setVisibility(0);
                        rc0Var.V.setAdapter(null);
                        rc0Var.V.setVisibility(8);
                    }
                    rc0Var.C0();
                    rc0Var.W.G(obj8, rc0Var.f42950w0);
                    return;
                }
                return;
            case 14:
                ((mh0) this.f15691b).f41444a.j(editText.getText().toString());
                return;
            case 15:
                ((zj0) this.f15691b).n0(editText.getText().toString().trim());
                return;
            case 16:
                xq0 xq0Var = (xq0) this.f15691b;
                xq0Var.f45760a.getActionBar().setSearchFieldText(editText.getText().toString());
                xq0Var.f45761b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 17:
                ((ProfileActivity) this.f15691b).e.I(editText.getText().toString().toLowerCase());
                return;
            case 18:
                String obj9 = editText.getText().toString();
                a31 a31Var = (a31) this.f15691b;
                if (obj9 == null) {
                    a31Var.f37675f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = a31Var.f37675f;
                    if (arrayList == null) {
                        a31Var.f37675f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < a31Var.h.size(); i10++) {
                        TranslateController.Language language = (TranslateController.Language) a31Var.h.get(i10);
                        if (language.f19569q.startsWith(lowerCase)) {
                            a31Var.f37675f.add(0, language);
                        } else if (language.f19569q.contains(lowerCase)) {
                            a31Var.f37675f.add(language);
                        }
                    }
                    a31Var.f37674c.l();
                }
                if (obj9.length() != 0) {
                    nm0 nm0Var7 = a31Var.f37673b;
                    if (nm0Var7 != null) {
                        nm0Var7.setAdapter(a31Var.f37674c);
                        return;
                    }
                    return;
                } else if (a31Var.f37673b != null) {
                    a31Var.d.setVisibility(8);
                    a31Var.f37673b.setAdapter(a31Var.f37672a);
                    return;
                } else {
                    return;
                }
            case 19:
                ((f81) this.f15691b).f39264f.I(editText.getText().toString());
                return;
            case 20:
                String obj10 = editText.getText().toString();
                ye1 ye1Var = ((cf1) this.f15691b).f38325r0;
                if (!ye1Var.f45986d0.equals(obj10)) {
                    ye1Var.M(ye1Var.e[0], ye1Var.getCurrentPosition(), obj10, false);
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
