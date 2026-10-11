package hg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.xl;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.e41;
import org.telegram.ui.eg1;
import org.telegram.ui.fr0;
import org.telegram.ui.gd0;
import org.telegram.ui.h91;
import org.telegram.ui.lv;
import org.telegram.ui.or;
import org.telegram.ui.qh1;
import org.telegram.ui.r70;
import org.telegram.ui.s70;
import org.telegram.ui.sr;
import org.telegram.ui.tp;
import org.telegram.ui.ub;
import org.telegram.ui.up;
import org.telegram.ui.wt;
import org.telegram.ui.yt;
import org.telegram.ui.zc0;
import org.telegram.ui.zh0;
public final class e2 extends e5 {
    public final int f11215f;
    public final Object h;

    public e2(Object obj, int i10) {
        this.f11215f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f11215f) {
            case 14:
                ((fr0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator g() {
        switch (this.f11215f) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                    u0Var.f21576e.clearFocus();
                    AndroidUtilities.hideKeyboard(u0Var.f21576e);
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
        switch (this.f11215f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = false;
                f2Var.f11232e = null;
                f2Var.f11229a.W2.N(true);
                f2Var.f11229a.u0(0);
                return;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.f42530v0 = "";
                ubVar.I.setVisibility(0);
                if (ubVar.U) {
                    ubVar.U = false;
                    ubVar.U0(true);
                    return;
                }
                return;
            case 2:
                up upVar = (up) this.h;
                upVar.f42771e.F(null);
                upVar.N = false;
                upVar.getClass();
                upVar.f42769b.setAdapter(upVar.f42768a);
                upVar.f42768a.l();
                upVar.f42769b.setFastScrollVisible(true);
                upVar.f42769b.setVerticalScrollBarEnabled(false);
                upVar.d.setShowAtCenter(false);
                View view = upVar.fragmentView;
                int i10 = h6.f20766a7;
                view.setBackgroundColor(h6.x0(null, i10, false));
                upVar.fragmentView.setTag(Integer.valueOf(i10));
                upVar.d.b();
                return;
            case 3:
                sr srVar = (sr) this.h;
                srVar.f41829e.F(null);
                srVar.f41851o1 = false;
                ai.w0 w0Var = srVar.f41824c;
                w0Var.W1 = false;
                w0Var.X1 = 0;
                w0Var.setAdapter(srVar.f41818a);
                srVar.f41818a.l();
                srVar.f41824c.setFastScrollVisible(true);
                srVar.f41824c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = srVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                l8 l8Var = (l8) this.h;
                if (l8Var.h) {
                    l8Var.f28236f = false;
                    l8Var.h = false;
                    l8Var.setAllowNestedScroll(true);
                    l8Var.f28251s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = l8Var.f28242k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                sk skVar = (sk) this.h;
                skVar.f30884b0 = false;
                skVar.G.setVisibility(0);
                hk hkVar = skVar.f30890r;
                s4.i0 adapter = hkVar.getAdapter();
                lk lkVar = skVar.v;
                if (adapter != lkVar) {
                    hkVar.setAdapter(lkVar);
                }
                lkVar.l();
                skVar.f30894y.Y(null, true);
                return;
            case 6:
                xl xlVar = (xl) this.h;
                xlVar.f33007l0 = false;
                xlVar.m0 = false;
                xlVar.R.G(null, null);
                xlVar.i0();
                xlVar.P.setVisibility(0);
                xlVar.N.setVisibility(0);
                xlVar.Q.setVisibility(8);
                xlVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f33775r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33762f.setAdapter(contactsActivity.d);
                contactsActivity.f33762f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33762f.setFastScrollVisible(true);
                contactsActivity.f33762f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33762f.getFastScroll().f33395h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                yt ytVar = (yt) this.h;
                wt wtVar = ytVar.d;
                wtVar.getClass();
                wtVar.f43906e = null;
                ytVar.f44530f = false;
                ytVar.f44529e = false;
                ytVar.f44526a.setAdapter(ytVar.f44528c);
                ytVar.f44526a.setFastScrollVisible(true);
                return;
            case 9:
                lv lvVar = (lv) this.h;
                lvVar.f39767a.getActionBar().h(false);
                lvVar.f39768b.getActionBar().h(false);
                return;
            case 10:
                s70 s70Var = (s70) this.h;
                if (s70Var.M) {
                    r70.E(s70Var.f41652f, null);
                    s70Var.M = false;
                    s70Var.d.setAdapter(s70Var.f41651e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33833b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33833b.setAdapter(languageSelectActivity.f33832a);
                    return;
                }
                return;
            case 12:
                gd0 gd0Var = (gd0) this.h;
                gd0Var.f38070r0 = false;
                gd0Var.f38072s0 = false;
                gd0Var.W.G(null, null);
                gd0Var.A0();
                if (gd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = gd0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    gd0Var.U.setVisibility(0);
                    gd0Var.S.setVisibility(0);
                    gd0Var.V.setAdapter(null);
                    gd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                eb0 eb0Var = ((zh0) this.h).f44701a;
                eb0Var.f50571y = false;
                eb0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                e41 e41Var = (e41) this.h;
                e41Var.f37238f = null;
                if (e41Var.f37235b != null) {
                    e41Var.d.setVisibility(8);
                    e41Var.f37235b.setAdapter(e41Var.f37234a);
                    return;
                }
                return;
            case 17:
                h91 h91Var = (h91) this.h;
                h91Var.f38383a.a(false, true);
                h91Var.o0(false, true);
                h91Var.f38387c.W2.N(false);
                return;
            case 18:
                eg1.b0((eg1) this.h, false);
                return;
            case 19:
                qh1 qh1Var = (qh1) this.h;
                qh1Var.h = null;
                f71 f71Var = qh1Var.f26675a;
                if (f71Var != null) {
                    f71Var.W2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f11215f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = true;
                f2Var.f11229a.W2.N(true);
                f2Var.f11229a.u0(0);
                return;
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.I.setVisibility(8);
                ubVar.getClass();
                return;
            case 2:
                up upVar = (up) this.h;
                upVar.N = true;
                upVar.d.setShowAtCenter(true);
                return;
            case 3:
                sr srVar = (sr) this.h;
                srVar.f41851o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = srVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                l8 l8Var = (l8) this.h;
                l8Var.f28252s0 = l8Var.f28249r.N0();
                View m10 = l8Var.f28249r.m(l8Var.f28252s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                l8Var.f28253t0 = top;
                l8Var.h = true;
                l8Var.setAllowNestedScroll(false);
                l8Var.f28251s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = l8Var.f28242k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                sk skVar = (sk) this.h;
                skVar.f30884b0 = true;
                skVar.G.setVisibility(8);
                skVar.f30245b.w1(skVar.F.getSearchField(), true);
                return;
            case 6:
                xl xlVar = (xl) this.h;
                xlVar.f33007l0 = true;
                xlVar.f30245b.w1(xlVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((yt) this.h).f44530f = true;
                return;
            case 9:
                lv lvVar = (lv) this.h;
                lvVar.f39767a.getActionBar().y("");
                lvVar.f39768b.getActionBar().y("");
                lvVar.f39769c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((gd0) this.h).f38070r0 = true;
                return;
            case 13:
                ((zh0) this.h).f44701a.f50571y = true;
                return;
            case 14:
                fr0 fr0Var = (fr0) this.h;
                fr0Var.f37780a.getActionBar().y("");
                fr0Var.f37781b.getActionBar().y("");
                fr0Var.f37782c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                h91 h91Var = (h91) this.h;
                h91Var.f38383a.a(true, true);
                h91Var.h.I("");
                h91Var.o0(false, true);
                h91Var.f38387c.W2.N(false);
                return;
            case 18:
                eg1 eg1Var = (eg1) this.h;
                eg1.b0(eg1Var, true);
                ag1 ag1Var = eg1Var.f37380r0;
                if (!ag1Var.f36105b0.equals("")) {
                    ag1Var.K(ag1Var.f29798e[0], ag1Var.getCurrentPosition(), "", false);
                }
                eg1Var.f37380r0.setAlpha(0.0f);
                eg1Var.f37380r0.f36116n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.p0 p0Var) {
        switch (this.f11215f) {
            case 5:
                sk skVar = (sk) this.h;
                rk rkVar = skVar.f30894y;
                rkVar.R.remove(p0Var);
                rkVar.Y(skVar.F.getSearchField().getText().toString(), false);
                rkVar.a0(null, null, true);
                return;
            case 18:
            default:
                return;
        }
    }

    @Override
    public void p(ci.g2 g2Var) {
        switch (this.f11215f) {
            case 1:
                ub ubVar = (ub) this.h;
                ubVar.U = true;
                ubVar.f42530v0 = g2Var.getText().toString();
                ubVar.U0(true);
                return;
            case 14:
                fr0 fr0Var = (fr0) this.h;
                fr0Var.f37780a.getActionBar().x();
                fr0Var.f37781b.getActionBar().x();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        rm0 rm0Var;
        int h;
        ai.w0 w0Var;
        s4.i0 i0Var;
        switch (this.f11215f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.f11232e = editText.getText().toString();
                f2Var.f11229a.W2.N(true);
                f2Var.f11229a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                up upVar = (up) this.h;
                if (upVar.f42771e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (rm0Var = upVar.f42769b) != null) {
                        s4.i0 adapter = rm0Var.getAdapter();
                        tp tpVar = upVar.f42771e;
                        if (adapter != tpVar) {
                            upVar.f42769b.setAdapter(tpVar);
                            View view = upVar.fragmentView;
                            int i10 = h6.f20822d6;
                            view.setBackgroundColor(h6.x0(null, i10, false));
                            upVar.fragmentView.setTag(Integer.valueOf(i10));
                            upVar.f42771e.l();
                            upVar.f42769b.setFastScrollVisible(false);
                            upVar.f42769b.setVerticalScrollBarEnabled(true);
                            upVar.d.b();
                        }
                    }
                    upVar.f42771e.F(obj);
                    return;
                }
                return;
            case 3:
                sr srVar = (sr) this.h;
                if (srVar.f41829e != null) {
                    String obj2 = editText.getText().toString();
                    if (srVar.f41824c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = srVar.f41824c.getAdapter().h();
                    }
                    srVar.f41829e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = srVar.f41824c) != null) {
                        s4.i0 adapter2 = w0Var.getAdapter();
                        or orVar = srVar.f41818a;
                        if (adapter2 != orVar) {
                            ai.w0 w0Var2 = srVar.f41824c;
                            w0Var2.W1 = false;
                            w0Var2.X1 = 0;
                            w0Var2.setAdapter(orVar);
                            if (h == 0) {
                                srVar.y0(0);
                            }
                        }
                    }
                    srVar.D1.setVisibility(8);
                    srVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                l8 l8Var = (l8) this.h;
                if (editText.length() > 0) {
                    l8Var.f28251s.E(editText.getText().toString());
                    return;
                }
                l8Var.f28236f = false;
                l8Var.f28251s.E(null);
                return;
            case 5:
                ((sk) this.h).f30894y.Y(editText.getText().toString(), false);
                return;
            case 6:
                xl xlVar = (xl) this.h;
                ai.f0 f0Var = xlVar.N;
                ai.w0 w0Var3 = xlVar.P;
                rm0 rm0Var2 = xlVar.Q;
                rl rlVar = xlVar.R;
                if (rlVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        xlVar.m0 = true;
                        xlVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (rm0Var2.getAdapter() != rlVar) {
                            rm0Var2.setAdapter(rlVar);
                        }
                        rm0Var2.setVisibility(0);
                        if (rlVar.f10552s.size() == 0 && rlVar.f10551r.size() == 0) {
                            z10 = true;
                        }
                        xlVar.f33009n0 = z10;
                        xlVar.i0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        rm0Var2.setAdapter(null);
                        rm0Var2.setVisibility(8);
                        xlVar.v.setVisibility(8);
                    }
                    rlVar.G(obj3, xlVar.f33014r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f33775r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33757c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33766i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        rm0 rm0Var3 = contactsActivity.f33762f;
                        if (rm0Var3 != null) {
                            rm0Var3.setAdapter(contactsActivity.f33775r);
                            contactsActivity.f33762f.setSectionsType(0);
                            contactsActivity.f33775r.l();
                            contactsActivity.f33762f.setFastScrollVisible(false);
                            contactsActivity.f33762f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f33760e.e(true, true);
                        contactsActivity.f33775r.G(obj4);
                        return;
                    }
                    rm0 rm0Var4 = contactsActivity.f33762f;
                    if (rm0Var4 != null) {
                        rm0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33762f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                yt ytVar = (yt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    wt wtVar = ytVar.d;
                    wtVar.getClass();
                    wtVar.f43906e = null;
                    ytVar.f44529e = false;
                    ytVar.f44526a.setAdapter(ytVar.f44528c);
                    ytVar.f44526a.setFastScrollVisible(true);
                    return;
                }
                wt wtVar2 = ytVar.d;
                wtVar2.getClass();
                if (obj5 == null) {
                    wtVar2.f43906e = null;
                } else {
                    try {
                        Timer timer = wtVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Timer timer2 = new Timer();
                    wtVar2.d = timer2;
                    timer2.schedule(new gg.r1(wtVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    ytVar.f44529e = true;
                    return;
                }
                return;
            case 9:
                lv lvVar = (lv) this.h;
                lvVar.f39767a.getActionBar().setSearchFieldText(editText.getText().toString());
                lvVar.f39768b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                s70 s70Var = (s70) this.h;
                r70.E(s70Var.f41652f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != s70Var.M) {
                    s70Var.M = z11;
                    rm0 rm0Var5 = s70Var.d;
                    if (rm0Var5 != null) {
                        if (!isEmpty) {
                            i0Var = s70Var.f41652f;
                        } else {
                            i0Var = s70Var.f41651e;
                        }
                        rm0Var5.setAdapter(i0Var);
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
                    rm0 rm0Var6 = languageSelectActivity.f33833b;
                    if (rm0Var6 != null) {
                        rm0Var6.setAdapter(languageSelectActivity.f33834c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33833b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33833b.setAdapter(languageSelectActivity.f33832a);
                    return;
                }
                return;
            case 12:
                gd0 gd0Var = (gd0) this.h;
                if (gd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        gd0Var.f38072s0 = true;
                        gd0Var.f38076w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = gd0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        gd0Var.U.setVisibility(8);
                        gd0Var.S.setVisibility(8);
                        s4.i0 adapter3 = gd0Var.V.getAdapter();
                        zc0 zc0Var = gd0Var.W;
                        if (adapter3 != zc0Var) {
                            gd0Var.V.setAdapter(zc0Var);
                        }
                        gd0Var.V.setVisibility(0);
                        if (gd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        gd0Var.f38073t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = gd0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        gd0Var.U.setVisibility(0);
                        gd0Var.S.setVisibility(0);
                        gd0Var.V.setAdapter(null);
                        gd0Var.V.setVisibility(8);
                    }
                    gd0Var.A0();
                    gd0Var.W.G(obj8, gd0Var.f38079x0);
                    return;
                }
                return;
            case 13:
                ((zh0) this.h).f44701a.j(editText.getText().toString());
                return;
            case 14:
                fr0 fr0Var = (fr0) this.h;
                fr0Var.f37780a.getActionBar().setSearchFieldText(editText.getText().toString());
                fr0Var.f37781b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).f34303e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                e41 e41Var = (e41) this.h;
                if (obj9 == null) {
                    e41Var.f37238f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = e41Var.f37238f;
                    if (arrayList == null) {
                        e41Var.f37238f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < e41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) e41Var.h.get(i11);
                        if (language.f17308q.startsWith(lowerCase)) {
                            e41Var.f37238f.add(0, language);
                        } else if (language.f17308q.contains(lowerCase)) {
                            e41Var.f37238f.add(language);
                        }
                    }
                    e41Var.f37236c.l();
                }
                if (obj9.length() != 0) {
                    rm0 rm0Var7 = e41Var.f37235b;
                    if (rm0Var7 != null) {
                        rm0Var7.setAdapter(e41Var.f37236c);
                        return;
                    }
                    return;
                } else if (e41Var.f37235b != null) {
                    e41Var.d.setVisibility(8);
                    e41Var.f37235b.setAdapter(e41Var.f37234a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((h91) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                ag1 ag1Var = ((eg1) this.h).f37380r0;
                if (!ag1Var.f36105b0.equals(obj10)) {
                    ag1Var.K(ag1Var.f29798e[0], ag1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                qh1 qh1Var = (qh1) this.h;
                qh1Var.h = editText.getText().toString();
                f71 f71Var = qh1Var.f26675a;
                if (f71Var != null) {
                    f71Var.W2.N(true);
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

    private final void w(gg.p0 p0Var) {
    }
}
