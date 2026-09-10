package gg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import bi.ld;
import bi.t2;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fl;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.bd0;
import org.telegram.ui.bu;
import org.telegram.ui.eg1;
import org.telegram.ui.gr0;
import org.telegram.ui.id0;
import org.telegram.ui.ig1;
import org.telegram.ui.k41;
import org.telegram.ui.k91;
import org.telegram.ui.pv;
import org.telegram.ui.r70;
import org.telegram.ui.s70;
import org.telegram.ui.sr;
import org.telegram.ui.vh1;
import org.telegram.ui.wb;
import org.telegram.ui.wr;
import org.telegram.ui.xp;
import org.telegram.ui.yp;
import org.telegram.ui.zt;
public final class m2 extends i5 {
    public final int f8954f;
    public final Object h;

    public m2(Object obj, int i10) {
        this.f8954f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f8954f) {
            case 14:
                ((gr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f8954f) {
            case 15:
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
        switch (this.f8954f) {
            case 0:
                n2 n2Var = (n2) this.h;
                n2Var.d = false;
                n2Var.e = null;
                n2Var.f8971a.Y2.N(true);
                n2Var.f8971a.u0(0);
                return;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.f37823z0 = "";
                wbVar.M.setVisibility(0);
                if (wbVar.Y) {
                    wbVar.Y = false;
                    wbVar.V0(true);
                    return;
                }
                return;
            case 2:
                yp ypVar = (yp) this.h;
                ypVar.e.F(null);
                ypVar.N = false;
                ypVar.getClass();
                ypVar.f39077b.setAdapter(ypVar.f39076a);
                ypVar.f39076a.l();
                ypVar.f39077b.setFastScrollVisible(true);
                ypVar.f39077b.setVerticalScrollBarEnabled(false);
                ypVar.d.setShowAtCenter(false);
                View view = ypVar.fragmentView;
                int i10 = j6.f17872a7;
                view.setBackgroundColor(j6.w0(null, i10, false));
                ypVar.fragmentView.setTag(Integer.valueOf(i10));
                ypVar.d.b();
                return;
            case 3:
                wr wrVar = (wr) this.h;
                wrVar.e.F(null);
                wrVar.f38349o1 = false;
                bi.y1 y1Var = wrVar.f38323c;
                y1Var.Y1 = false;
                y1Var.Z1 = 0;
                y1Var.setAdapter(wrVar.f38317a);
                wrVar.f38317a.l();
                wrVar.f38323c.setFastScrollVisible(true);
                wrVar.f38323c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = wrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                if (j8Var.h) {
                    j8Var.f24283f = false;
                    j8Var.h = false;
                    j8Var.setAllowNestedScroll(true);
                    j8Var.f24298s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var2 = j8Var.f24289k0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                tk tkVar = (tk) this.h;
                tkVar.f27422b0 = false;
                tkVar.G.setVisibility(0);
                ik ikVar = tkVar.f27428r;
                s4.h0 adapter = ikVar.getAdapter();
                mk mkVar = tkVar.v;
                if (adapter != mkVar) {
                    ikVar.setAdapter(mkVar);
                }
                mkVar.l();
                tkVar.f27432y.Y(null, true);
                return;
            case 6:
                ll llVar = (ll) this.h;
                llVar.f25035l0 = false;
                llVar.m0 = false;
                llVar.R.G(null, null);
                llVar.f0();
                llVar.P.setVisibility(0);
                llVar.N.setVisibility(0);
                llVar.Q.setVisibility(8);
                llVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f29868r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f29855f.setAdapter(contactsActivity.d);
                contactsActivity.f29855f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f29855f.setFastScrollVisible(true);
                contactsActivity.f29855f.setVerticalScrollBarEnabled(false);
                contactsActivity.f29855f.getFastScroll().f22166h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                bu buVar = (bu) this.h;
                zt ztVar = buVar.d;
                ztVar.getClass();
                ztVar.e = null;
                buVar.f31403f = false;
                buVar.e = false;
                buVar.f31400a.setAdapter(buVar.f31402c);
                buVar.f31400a.setFastScrollVisible(true);
                return;
            case 9:
                pv pvVar = (pv) this.h;
                pvVar.f35907a.getActionBar().h(false);
                pvVar.f35908b.getActionBar().h(false);
                return;
            case 10:
                s70 s70Var = (s70) this.h;
                if (s70Var.M) {
                    r70.E(s70Var.f36569f, null);
                    s70Var.M = false;
                    s70Var.d.setAdapter(s70Var.e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f29922b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f29922b.setAdapter(languageSelectActivity.f29921a);
                    return;
                }
                return;
            case 12:
                id0 id0Var = (id0) this.h;
                id0Var.f33636r0 = false;
                id0Var.f33638s0 = false;
                id0Var.W.G(null, null);
                id0Var.B0();
                if (id0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = id0Var.Z;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    id0Var.U.setVisibility(0);
                    id0Var.S.setVisibility(0);
                    id0Var.V.setAdapter(null);
                    id0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                ma0 ma0Var = ((ai0) this.h).f31012a;
                ma0Var.f43418y = false;
                ma0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                k41 k41Var = (k41) this.h;
                k41Var.f34224f = null;
                if (k41Var.f34222b != null) {
                    k41Var.d.setVisibility(8);
                    k41Var.f34222b.setAdapter(k41Var.f34221a);
                    return;
                }
                return;
            case 17:
                k91 k91Var = (k91) this.h;
                k91Var.f34294a.a(false, true);
                k91Var.o0(false, true);
                k91Var.f34298c.Y2.N(false);
                return;
            case 18:
                ig1.b0((ig1) this.h, false);
                return;
            case 19:
                vh1 vh1Var = (vh1) this.h;
                vh1Var.h = null;
                l61 l61Var = vh1Var.f25171a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f8954f) {
            case 0:
                n2 n2Var = (n2) this.h;
                n2Var.d = true;
                n2Var.f8971a.Y2.N(true);
                n2Var.f8971a.u0(0);
                return;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.M.setVisibility(8);
                wbVar.getClass();
                return;
            case 2:
                yp ypVar = (yp) this.h;
                ypVar.N = true;
                ypVar.d.setShowAtCenter(true);
                return;
            case 3:
                wr wrVar = (wr) this.h;
                wrVar.f38349o1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = wrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                j8Var.f24299s0 = j8Var.f24296r.N0();
                View m10 = j8Var.f24296r.m(j8Var.f24299s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                j8Var.f24300t0 = top;
                j8Var.h = true;
                j8Var.setAllowNestedScroll(false);
                j8Var.f24298s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = j8Var.f24289k0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                tk tkVar = (tk) this.h;
                tkVar.f27422b0 = true;
                tkVar.G.setVisibility(8);
                tkVar.f26422b.t1(tkVar.F.getSearchField(), true);
                return;
            case 6:
                ll llVar = (ll) this.h;
                llVar.f25035l0 = true;
                llVar.f26422b.t1(llVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((bu) this.h).f31403f = true;
                return;
            case 9:
                pv pvVar = (pv) this.h;
                pvVar.f35907a.getActionBar().x("");
                pvVar.f35908b.getActionBar().x("");
                pvVar.f35909c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((id0) this.h).f33636r0 = true;
                return;
            case 13:
                ((ai0) this.h).f31012a.f43418y = true;
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f33166a.getActionBar().x("");
                gr0Var.f33167b.getActionBar().x("");
                gr0Var.f33168c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                k91 k91Var = (k91) this.h;
                k91Var.f34294a.a(true, true);
                k91Var.h.I("");
                k91Var.o0(false, true);
                k91Var.f34298c.Y2.N(false);
                return;
            case 18:
                ig1 ig1Var = (ig1) this.h;
                ig1.b0(ig1Var, true);
                eg1 eg1Var = ig1Var.f33715r0;
                if (!eg1Var.f32188b0.equals("")) {
                    eg1Var.K(eg1Var.e[0], eg1Var.getCurrentPosition(), "", false);
                }
                ig1Var.f33715r0.setAlpha(0.0f);
                ig1Var.f33715r0.f32199n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(fg.q0 q0Var) {
        switch (this.f8954f) {
            case 5:
                tk tkVar = (tk) this.h;
                sk skVar = tkVar.f27432y;
                skVar.R.remove(q0Var);
                skVar.Y(tkVar.F.getSearchField().getText().toString(), false);
                skVar.a0(null, null, true);
                return;
            case 18:
            default:
                return;
        }
    }

    @Override
    public void p(t2 t2Var) {
        switch (this.f8954f) {
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.Y = true;
                wbVar.f37823z0 = t2Var.getText().toString();
                wbVar.V0(true);
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f33166a.getActionBar().w();
                gr0Var.f33167b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        vl0 vl0Var;
        int h;
        bi.y1 y1Var;
        s4.h0 h0Var;
        switch (this.f8954f) {
            case 0:
                n2 n2Var = (n2) this.h;
                n2Var.e = editText.getText().toString();
                n2Var.f8971a.Y2.N(true);
                n2Var.f8971a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                yp ypVar = (yp) this.h;
                if (ypVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (vl0Var = ypVar.f39077b) != null) {
                        s4.h0 adapter = vl0Var.getAdapter();
                        xp xpVar = ypVar.e;
                        if (adapter != xpVar) {
                            ypVar.f39077b.setAdapter(xpVar);
                            View view = ypVar.fragmentView;
                            int i10 = j6.f17928d6;
                            view.setBackgroundColor(j6.w0(null, i10, false));
                            ypVar.fragmentView.setTag(Integer.valueOf(i10));
                            ypVar.e.l();
                            ypVar.f39077b.setFastScrollVisible(false);
                            ypVar.f39077b.setVerticalScrollBarEnabled(true);
                            ypVar.d.b();
                        }
                    }
                    ypVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                wr wrVar = (wr) this.h;
                if (wrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (wrVar.f38323c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = wrVar.f38323c.getAdapter().h();
                    }
                    wrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (y1Var = wrVar.f38323c) != null) {
                        s4.h0 adapter2 = y1Var.getAdapter();
                        sr srVar = wrVar.f38317a;
                        if (adapter2 != srVar) {
                            bi.y1 y1Var2 = wrVar.f38323c;
                            y1Var2.Y1 = false;
                            y1Var2.Z1 = 0;
                            y1Var2.setAdapter(srVar);
                            if (h == 0) {
                                wrVar.y0(0);
                            }
                        }
                    }
                    wrVar.D1.setVisibility(8);
                    wrVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.f24298s.E(editText.getText().toString());
                    return;
                }
                j8Var.f24283f = false;
                j8Var.f24298s.E(null);
                return;
            case 5:
                ((tk) this.h).f27432y.Y(editText.getText().toString(), false);
                return;
            case 6:
                ll llVar = (ll) this.h;
                ld ldVar = llVar.N;
                bi.y1 y1Var3 = llVar.P;
                vl0 vl0Var2 = llVar.Q;
                fl flVar = llVar.R;
                if (flVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        llVar.m0 = true;
                        llVar.E.setShowSearchProgress(true);
                        y1Var3.setVisibility(8);
                        ldVar.setVisibility(8);
                        if (vl0Var2.getAdapter() != flVar) {
                            vl0Var2.setAdapter(flVar);
                        }
                        vl0Var2.setVisibility(0);
                        if (flVar.f7964s.size() == 0 && flVar.f7963r.size() == 0) {
                            z10 = true;
                        }
                        llVar.f25037n0 = z10;
                        llVar.f0();
                    } else {
                        y1Var3.setVisibility(0);
                        ldVar.setVisibility(0);
                        vl0Var2.setAdapter(null);
                        vl0Var2.setVisibility(8);
                        llVar.v.setVisibility(8);
                    }
                    flVar.G(obj3, llVar.f25042r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f29868r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f29851c.a(!obj4.isEmpty(), true);
                    contactsActivity.f29859i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        vl0 vl0Var3 = contactsActivity.f29855f;
                        if (vl0Var3 != null) {
                            vl0Var3.setAdapter(contactsActivity.f29868r);
                            contactsActivity.f29855f.setSectionsType(0);
                            contactsActivity.f29868r.l();
                            contactsActivity.f29855f.setFastScrollVisible(false);
                            contactsActivity.f29855f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f29868r.G(obj4);
                        return;
                    }
                    vl0 vl0Var4 = contactsActivity.f29855f;
                    if (vl0Var4 != null) {
                        vl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f29855f.setSectionsType(1);
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
                    ztVar.e = null;
                    buVar.e = false;
                    buVar.f31400a.setAdapter(buVar.f31402c);
                    buVar.f31400a.setFastScrollVisible(true);
                    return;
                }
                zt ztVar2 = buVar.d;
                ztVar2.getClass();
                if (obj5 == null) {
                    ztVar2.e = null;
                } else {
                    try {
                        Timer timer = ztVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    ztVar2.d = timer2;
                    timer2.schedule(new fg.u1(ztVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    buVar.e = true;
                    return;
                }
                return;
            case 9:
                pv pvVar = (pv) this.h;
                pvVar.f35907a.getActionBar().setSearchFieldText(editText.getText().toString());
                pvVar.f35908b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                s70 s70Var = (s70) this.h;
                r70.E(s70Var.f36569f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != s70Var.M) {
                    s70Var.M = z11;
                    vl0 vl0Var5 = s70Var.d;
                    if (vl0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = s70Var.f36569f;
                        } else {
                            h0Var = s70Var.e;
                        }
                        vl0Var5.setAdapter(h0Var);
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
                    vl0 vl0Var6 = languageSelectActivity.f29922b;
                    if (vl0Var6 != null) {
                        vl0Var6.setAdapter(languageSelectActivity.f29923c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f29922b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f29922b.setAdapter(languageSelectActivity.f29921a);
                    return;
                }
                return;
            case 12:
                id0 id0Var = (id0) this.h;
                if (id0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        id0Var.f33638s0 = true;
                        id0Var.f33642w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = id0Var.Z;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
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
                        id0Var.f33639t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = id0Var.Z;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        id0Var.U.setVisibility(0);
                        id0Var.S.setVisibility(0);
                        id0Var.V.setAdapter(null);
                        id0Var.V.setVisibility(8);
                    }
                    id0Var.B0();
                    id0Var.W.G(obj8, id0Var.f33645x0);
                    return;
                }
                return;
            case 13:
                ((ai0) this.h).f31012a.j(editText.getText().toString());
                return;
            case 14:
                gr0 gr0Var = (gr0) this.h;
                gr0Var.f33166a.getActionBar().setSearchFieldText(editText.getText().toString());
                gr0Var.f33167b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                k41 k41Var = (k41) this.h;
                if (obj9 == null) {
                    k41Var.f34224f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = k41Var.f34224f;
                    if (arrayList == null) {
                        k41Var.f34224f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < k41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) k41Var.h.get(i11);
                        if (language.f14667q.startsWith(lowerCase)) {
                            k41Var.f34224f.add(0, language);
                        } else if (language.f14667q.contains(lowerCase)) {
                            k41Var.f34224f.add(language);
                        }
                    }
                    k41Var.f34223c.l();
                }
                if (obj9.length() != 0) {
                    vl0 vl0Var7 = k41Var.f34222b;
                    if (vl0Var7 != null) {
                        vl0Var7.setAdapter(k41Var.f34223c);
                        return;
                    }
                    return;
                } else if (k41Var.f34222b != null) {
                    k41Var.d.setVisibility(8);
                    k41Var.f34222b.setAdapter(k41Var.f34221a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((k91) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                eg1 eg1Var = ((ig1) this.h).f33715r0;
                if (!eg1Var.f32188b0.equals(obj10)) {
                    eg1Var.K(eg1Var.e[0], eg1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                vh1 vh1Var = (vh1) this.h;
                vh1Var.h = editText.getText().toString();
                l61 l61Var = vh1Var.f25171a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
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

    private final void w(fg.q0 q0Var) {
    }
}
