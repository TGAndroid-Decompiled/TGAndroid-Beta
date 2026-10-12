package ig;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import di.g2;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.ul;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ac;
import org.telegram.ui.aq;
import org.telegram.ui.du;
import org.telegram.ui.fi0;
import org.telegram.ui.fu;
import org.telegram.ui.gd0;
import org.telegram.ui.hg1;
import org.telegram.ui.l41;
import org.telegram.ui.lg1;
import org.telegram.ui.mr0;
import org.telegram.ui.nd0;
import org.telegram.ui.o91;
import org.telegram.ui.sv;
import org.telegram.ui.ur;
import org.telegram.ui.x70;
import org.telegram.ui.xh1;
import org.telegram.ui.y70;
import org.telegram.ui.yr;
import org.telegram.ui.zp;
public final class d2 extends e5 {
    public final int f11468f;
    public final Object h;

    public d2(Object obj, int i10) {
        this.f11468f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f11468f) {
            case 14:
                ((mr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator g() {
        switch (this.f11468f) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                    u0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(u0Var.e);
                }
                if (profileActivity.W1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.W1);
            default:
                return super.g();
        }
    }

    @Override
    public void m() {
        switch (this.f11468f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.e = null;
                e2Var.f11489a.W2.N(true);
                e2Var.f11489a.u0(0);
                return;
            case 1:
                ac acVar = (ac) this.h;
                acVar.f34157v0 = "";
                acVar.I.setVisibility(0);
                if (acVar.U) {
                    acVar.U = false;
                    acVar.U0(true);
                    return;
                }
                return;
            case 2:
                aq aqVar = (aq) this.h;
                aqVar.e.F(null);
                aqVar.N = false;
                aqVar.getClass();
                aqVar.f34293b.setAdapter(aqVar.f34292a);
                aqVar.f34292a.l();
                aqVar.f34293b.setFastScrollVisible(true);
                aqVar.f34293b.setVerticalScrollBarEnabled(false);
                aqVar.d.setShowAtCenter(false);
                View view = aqVar.fragmentView;
                int i10 = g6.f19843a7;
                view.setBackgroundColor(g6.x0(null, i10, false));
                aqVar.fragmentView.setTag(Integer.valueOf(i10));
                aqVar.d.b();
                return;
            case 3:
                yr yrVar = (yr) this.h;
                yrVar.e.F(null);
                yrVar.f42244o1 = false;
                bi.o0 o0Var = yrVar.f42218c;
                o0Var.W1 = false;
                o0Var.X1 = 0;
                o0Var.setAdapter(yrVar.f42212a);
                yrVar.f42212a.l();
                yrVar.f42218c.setFastScrollVisible(true);
                yrVar.f42218c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = yrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                m8 m8Var = (m8) this.h;
                if (m8Var.h) {
                    m8Var.f27240f = false;
                    m8Var.h = false;
                    m8Var.setAllowNestedScroll(true);
                    m8Var.f27255s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = m8Var.f27246k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                pk pkVar = (pk) this.h;
                pkVar.f28348b0 = false;
                pkVar.G.setVisibility(0);
                ek ekVar = pkVar.f28354r;
                s4.g0 adapter = ekVar.getAdapter();
                ik ikVar = pkVar.v;
                if (adapter != ikVar) {
                    ekVar.setAdapter(ikVar);
                }
                ikVar.l();
                pkVar.f28358y.Y(null, true);
                return;
            case 6:
                ul ulVar = (ul) this.h;
                ulVar.f29717l0 = false;
                ulVar.m0 = false;
                ulVar.R.G(null, null);
                ulVar.i0();
                ulVar.P.setVisibility(0);
                ulVar.N.setVisibility(0);
                ulVar.Q.setVisibility(8);
                ulVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f32044r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f32031f.setAdapter(contactsActivity.d);
                contactsActivity.f32031f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f32031f.setFastScrollVisible(true);
                contactsActivity.f32031f.setVerticalScrollBarEnabled(false);
                contactsActivity.f32031f.getFastScroll().f29428h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                fu fuVar = (fu) this.h;
                du duVar = fuVar.d;
                duVar.getClass();
                duVar.e = null;
                fuVar.f36230f = false;
                fuVar.e = false;
                fuVar.f36227a.setAdapter(fuVar.f36229c);
                fuVar.f36227a.setFastScrollVisible(true);
                return;
            case 9:
                sv svVar = (sv) this.h;
                svVar.f40217a.getActionBar().h(false);
                svVar.f40218b.getActionBar().h(false);
                return;
            case 10:
                y70 y70Var = (y70) this.h;
                if (y70Var.M) {
                    x70.E(y70Var.f42060f, null);
                    y70Var.M = false;
                    y70Var.d.setAdapter(y70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f32098b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f32098b.setAdapter(languageSelectActivity.f32097a);
                    return;
                }
                return;
            case 12:
                nd0 nd0Var = (nd0) this.h;
                nd0Var.f38669r0 = false;
                nd0Var.f38671s0 = false;
                nd0Var.W.G(null, null);
                nd0Var.A0();
                if (nd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = nd0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    nd0Var.U.setVisibility(0);
                    nd0Var.S.setVisibility(0);
                    nd0Var.V.setAdapter(null);
                    nd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                db0 db0Var = ((fi0) this.h).f35842a;
                db0Var.f48495y = false;
                db0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                l41 l41Var = (l41) this.h;
                l41Var.f37841f = null;
                if (l41Var.f37839b != null) {
                    l41Var.d.setVisibility(8);
                    l41Var.f37839b.setAdapter(l41Var.f37838a);
                    return;
                }
                return;
            case 17:
                o91 o91Var = (o91) this.h;
                o91Var.f38893a.a(false, true);
                o91Var.o0(false, true);
                o91Var.f38897c.W2.N(false);
                return;
            case 18:
                lg1.b0((lg1) this.h, false);
                return;
            case 19:
                xh1 xh1Var = (xh1) this.h;
                xh1Var.h = null;
                b71 b71Var = xh1Var.f23964a;
                if (b71Var != null) {
                    b71Var.W2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f11468f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.f11489a.W2.N(true);
                e2Var.f11489a.u0(0);
                return;
            case 1:
                ac acVar = (ac) this.h;
                acVar.I.setVisibility(8);
                acVar.getClass();
                return;
            case 2:
                aq aqVar = (aq) this.h;
                aqVar.N = true;
                aqVar.d.setShowAtCenter(true);
                return;
            case 3:
                yr yrVar = (yr) this.h;
                yrVar.f42244o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = yrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                m8 m8Var = (m8) this.h;
                m8Var.f27256s0 = m8Var.f27253r.N0();
                View m10 = m8Var.f27253r.m(m8Var.f27256s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                m8Var.f27257t0 = top;
                m8Var.h = true;
                m8Var.setAllowNestedScroll(false);
                m8Var.f27255s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = m8Var.f27246k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                pk pkVar = (pk) this.h;
                pkVar.f28348b0 = true;
                pkVar.G.setVisibility(8);
                pkVar.f27671b.w1(pkVar.F.getSearchField(), true);
                return;
            case 6:
                ul ulVar = (ul) this.h;
                ulVar.f29717l0 = true;
                ulVar.f27671b.w1(ulVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((fu) this.h).f36230f = true;
                return;
            case 9:
                sv svVar = (sv) this.h;
                svVar.f40217a.getActionBar().y("");
                svVar.f40218b.getActionBar().y("");
                svVar.f40219c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((nd0) this.h).f38669r0 = true;
                return;
            case 13:
                ((fi0) this.h).f35842a.f48495y = true;
                return;
            case 14:
                mr0 mr0Var = (mr0) this.h;
                mr0Var.f38318a.getActionBar().y("");
                mr0Var.f38319b.getActionBar().y("");
                mr0Var.f38320c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                o91 o91Var = (o91) this.h;
                o91Var.f38893a.a(true, true);
                o91Var.h.I("");
                o91Var.o0(false, true);
                o91Var.f38897c.W2.N(false);
                return;
            case 18:
                lg1 lg1Var = (lg1) this.h;
                lg1.b0(lg1Var, true);
                hg1 hg1Var = lg1Var.f37991r0;
                if (!hg1Var.f36797b0.equals("")) {
                    hg1Var.K(hg1Var.e[0], hg1Var.getCurrentPosition(), "", false);
                }
                lg1Var.f37991r0.setAlpha(0.0f);
                lg1Var.f37991r0.f36808n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(hg.p0 p0Var) {
        switch (this.f11468f) {
            case 5:
                pk pkVar = (pk) this.h;
                ok okVar = pkVar.f28358y;
                okVar.R.remove(p0Var);
                okVar.Y(pkVar.F.getSearchField().getText().toString(), false);
                okVar.a0(null, null, true);
                return;
            case 18:
            default:
                return;
        }
    }

    @Override
    public void p(g2 g2Var) {
        switch (this.f11468f) {
            case 1:
                ac acVar = (ac) this.h;
                acVar.U = true;
                acVar.f34157v0 = g2Var.getText().toString();
                acVar.U0(true);
                return;
            case 14:
                mr0 mr0Var = (mr0) this.h;
                mr0Var.f38318a.getActionBar().x();
                mr0Var.f38319b.getActionBar().x();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        mm0 mm0Var;
        int h;
        bi.o0 o0Var;
        s4.g0 g0Var;
        switch (this.f11468f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.f11489a.W2.N(true);
                e2Var.f11489a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                aq aqVar = (aq) this.h;
                if (aqVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (mm0Var = aqVar.f34293b) != null) {
                        s4.g0 adapter = mm0Var.getAdapter();
                        zp zpVar = aqVar.e;
                        if (adapter != zpVar) {
                            aqVar.f34293b.setAdapter(zpVar);
                            View view = aqVar.fragmentView;
                            int i10 = g6.f19901d6;
                            view.setBackgroundColor(g6.x0(null, i10, false));
                            aqVar.fragmentView.setTag(Integer.valueOf(i10));
                            aqVar.e.l();
                            aqVar.f34293b.setFastScrollVisible(false);
                            aqVar.f34293b.setVerticalScrollBarEnabled(true);
                            aqVar.d.b();
                        }
                    }
                    aqVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                yr yrVar = (yr) this.h;
                if (yrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (yrVar.f42218c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = yrVar.f42218c.getAdapter().h();
                    }
                    yrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (o0Var = yrVar.f42218c) != null) {
                        s4.g0 adapter2 = o0Var.getAdapter();
                        ur urVar = yrVar.f42212a;
                        if (adapter2 != urVar) {
                            bi.o0 o0Var2 = yrVar.f42218c;
                            o0Var2.W1 = false;
                            o0Var2.X1 = 0;
                            o0Var2.setAdapter(urVar);
                            if (h == 0) {
                                yrVar.y0(0);
                            }
                        }
                    }
                    yrVar.D1.setVisibility(8);
                    yrVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                m8 m8Var = (m8) this.h;
                if (editText.length() > 0) {
                    m8Var.f27255s.E(editText.getText().toString());
                    return;
                }
                m8Var.f27240f = false;
                m8Var.f27255s.E(null);
                return;
            case 5:
                ((pk) this.h).f28358y.Y(editText.getText().toString(), false);
                return;
            case 6:
                ul ulVar = (ul) this.h;
                ah.x xVar = ulVar.N;
                bi.o0 o0Var3 = ulVar.P;
                mm0 mm0Var2 = ulVar.Q;
                ol olVar = ulVar.R;
                if (olVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        ulVar.m0 = true;
                        ulVar.E.setShowSearchProgress(true);
                        o0Var3.setVisibility(8);
                        xVar.setVisibility(8);
                        if (mm0Var2.getAdapter() != olVar) {
                            mm0Var2.setAdapter(olVar);
                        }
                        mm0Var2.setVisibility(0);
                        if (olVar.f10510s.size() == 0 && olVar.f10509r.size() == 0) {
                            z10 = true;
                        }
                        ulVar.f29719n0 = z10;
                        ulVar.i0();
                    } else {
                        o0Var3.setVisibility(0);
                        xVar.setVisibility(0);
                        mm0Var2.setAdapter(null);
                        mm0Var2.setVisibility(8);
                        ulVar.v.setVisibility(8);
                    }
                    olVar.G(obj3, ulVar.f29724r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f32044r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f32027c.a(!obj4.isEmpty(), true);
                    contactsActivity.f32035i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        mm0 mm0Var3 = contactsActivity.f32031f;
                        if (mm0Var3 != null) {
                            mm0Var3.setAdapter(contactsActivity.f32044r);
                            contactsActivity.f32031f.setSectionsType(0);
                            contactsActivity.f32044r.l();
                            contactsActivity.f32031f.setFastScrollVisible(false);
                            contactsActivity.f32031f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f32044r.G(obj4);
                        return;
                    }
                    mm0 mm0Var4 = contactsActivity.f32031f;
                    if (mm0Var4 != null) {
                        mm0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f32031f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                fu fuVar = (fu) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    du duVar = fuVar.d;
                    duVar.getClass();
                    duVar.e = null;
                    fuVar.e = false;
                    fuVar.f36227a.setAdapter(fuVar.f36229c);
                    fuVar.f36227a.setFastScrollVisible(true);
                    return;
                }
                du duVar2 = fuVar.d;
                duVar2.getClass();
                if (obj5 == null) {
                    duVar2.e = null;
                } else {
                    try {
                        Timer timer = duVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    duVar2.d = timer2;
                    timer2.schedule(new hg.r1(duVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    fuVar.e = true;
                    return;
                }
                return;
            case 9:
                sv svVar = (sv) this.h;
                svVar.f40217a.getActionBar().setSearchFieldText(editText.getText().toString());
                svVar.f40218b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                y70 y70Var = (y70) this.h;
                x70.E(y70Var.f42060f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != y70Var.M) {
                    y70Var.M = z11;
                    mm0 mm0Var5 = y70Var.d;
                    if (mm0Var5 != null) {
                        if (!isEmpty) {
                            g0Var = y70Var.f42060f;
                        } else {
                            g0Var = y70Var.e;
                        }
                        mm0Var5.setAdapter(g0Var);
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
                    mm0 mm0Var6 = languageSelectActivity.f32098b;
                    if (mm0Var6 != null) {
                        mm0Var6.setAdapter(languageSelectActivity.f32099c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f32098b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f32098b.setAdapter(languageSelectActivity.f32097a);
                    return;
                }
                return;
            case 12:
                nd0 nd0Var = (nd0) this.h;
                if (nd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        nd0Var.f38671s0 = true;
                        nd0Var.f38675w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = nd0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        nd0Var.U.setVisibility(8);
                        nd0Var.S.setVisibility(8);
                        s4.g0 adapter3 = nd0Var.V.getAdapter();
                        gd0 gd0Var = nd0Var.W;
                        if (adapter3 != gd0Var) {
                            nd0Var.V.setAdapter(gd0Var);
                        }
                        nd0Var.V.setVisibility(0);
                        if (nd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        nd0Var.f38672t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = nd0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        nd0Var.U.setVisibility(0);
                        nd0Var.S.setVisibility(0);
                        nd0Var.V.setAdapter(null);
                        nd0Var.V.setVisibility(8);
                    }
                    nd0Var.A0();
                    nd0Var.W.G(obj8, nd0Var.f38678x0);
                    return;
                }
                return;
            case 13:
                ((fi0) this.h).f35842a.j(editText.getText().toString());
                return;
            case 14:
                mr0 mr0Var = (mr0) this.h;
                mr0Var.f38318a.getActionBar().setSearchFieldText(editText.getText().toString());
                mr0Var.f38319b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                l41 l41Var = (l41) this.h;
                if (obj9 == null) {
                    l41Var.f37841f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = l41Var.f37841f;
                    if (arrayList == null) {
                        l41Var.f37841f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < l41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) l41Var.h.get(i11);
                        if (language.f16729q.startsWith(lowerCase)) {
                            l41Var.f37841f.add(0, language);
                        } else if (language.f16729q.contains(lowerCase)) {
                            l41Var.f37841f.add(language);
                        }
                    }
                    l41Var.f37840c.l();
                }
                if (obj9.length() != 0) {
                    mm0 mm0Var7 = l41Var.f37839b;
                    if (mm0Var7 != null) {
                        mm0Var7.setAdapter(l41Var.f37840c);
                        return;
                    }
                    return;
                } else if (l41Var.f37839b != null) {
                    l41Var.d.setVisibility(8);
                    l41Var.f37839b.setAdapter(l41Var.f37838a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((o91) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                hg1 hg1Var = ((lg1) this.h).f37991r0;
                if (!hg1Var.f36797b0.equals(obj10)) {
                    hg1Var.K(hg1Var.e[0], hg1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                xh1 xh1Var = (xh1) this.h;
                xh1Var.h = editText.getText().toString();
                b71 b71Var = xh1Var.f23964a;
                if (b71Var != null) {
                    b71Var.W2.N(true);
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

    private final void w(hg.p0 p0Var) {
    }
}
