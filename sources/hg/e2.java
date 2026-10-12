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
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zl;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au;
import org.telegram.ui.bd0;
import org.telegram.ui.bi0;
import org.telegram.ui.cu;
import org.telegram.ui.dg1;
import org.telegram.ui.h41;
import org.telegram.ui.hg1;
import org.telegram.ui.id0;
import org.telegram.ui.ir0;
import org.telegram.ui.k91;
import org.telegram.ui.pv;
import org.telegram.ui.sr;
import org.telegram.ui.th1;
import org.telegram.ui.u70;
import org.telegram.ui.v70;
import org.telegram.ui.wp;
import org.telegram.ui.wr;
import org.telegram.ui.xp;
import org.telegram.ui.yb;
public final class e2 extends e5 {
    public final int f11214f;
    public final Object h;

    public e2(Object obj, int i10) {
        this.f11214f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f11214f) {
            case 14:
                ((ir0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator g() {
        switch (this.f11214f) {
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.W1;
                profileActivity.W1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                    u0Var.f21315e.clearFocus();
                    AndroidUtilities.hideKeyboard(u0Var.f21315e);
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
        switch (this.f11214f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = false;
                f2Var.f11231e = null;
                f2Var.f11228a.W2.N(true);
                f2Var.f11228a.u0(0);
                return;
            case 1:
                yb ybVar = (yb) this.h;
                ybVar.f44438v0 = "";
                ybVar.I.setVisibility(0);
                if (ybVar.U) {
                    ybVar.U = false;
                    ybVar.U0(true);
                    return;
                }
                return;
            case 2:
                xp xpVar = (xp) this.h;
                xpVar.f44135e.F(null);
                xpVar.N = false;
                xpVar.getClass();
                xpVar.f44133b.setAdapter(xpVar.f44132a);
                xpVar.f44132a.l();
                xpVar.f44133b.setFastScrollVisible(true);
                xpVar.f44133b.setVerticalScrollBarEnabled(false);
                xpVar.d.setShowAtCenter(false);
                View view = xpVar.fragmentView;
                int i10 = h6.f20504a7;
                view.setBackgroundColor(h6.x0(null, i10, false));
                xpVar.fragmentView.setTag(Integer.valueOf(i10));
                xpVar.d.b();
                return;
            case 3:
                wr wrVar = (wr) this.h;
                wrVar.f43624e.F(null);
                wrVar.f43646o1 = false;
                ai.w0 w0Var = wrVar.f43619c;
                w0Var.W1 = false;
                w0Var.X1 = 0;
                w0Var.setAdapter(wrVar.f43613a);
                wrVar.f43613a.l();
                wrVar.f43619c.setFastScrollVisible(true);
                wrVar.f43619c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.u0 u0Var = wrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(0);
                    return;
                }
                return;
            case 4:
                l8 l8Var = (l8) this.h;
                if (l8Var.h) {
                    l8Var.f28061f = false;
                    l8Var.h = false;
                    l8Var.setAllowNestedScroll(true);
                    l8Var.f28076s.E(null);
                    org.telegram.ui.ActionBar.u0 u0Var2 = l8Var.f28067k0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                uk ukVar = (uk) this.h;
                ukVar.f31180b0 = false;
                ukVar.G.setVisibility(0);
                jk jkVar = ukVar.f31186r;
                s4.i0 adapter = jkVar.getAdapter();
                nk nkVar = ukVar.v;
                if (adapter != nkVar) {
                    jkVar.setAdapter(nkVar);
                }
                nkVar.l();
                ukVar.f31190y.Y(null, true);
                return;
            case 6:
                zl zlVar = (zl) this.h;
                zlVar.f33411l0 = false;
                zlVar.m0 = false;
                zlVar.R.G(null, null);
                zlVar.i0();
                zlVar.P.setVisibility(0);
                zlVar.N.setVisibility(0);
                zlVar.Q.setVisibility(8);
                zlVar.v.setVisibility(8);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f33552r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f33539f.setAdapter(contactsActivity.d);
                contactsActivity.f33539f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f33539f.setFastScrollVisible(true);
                contactsActivity.f33539f.setVerticalScrollBarEnabled(false);
                contactsActivity.f33539f.getFastScroll().f25407h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                cu cuVar = (cu) this.h;
                au auVar = cuVar.d;
                auVar.getClass();
                auVar.f35980e = null;
                cuVar.f36515f = false;
                cuVar.f36514e = false;
                cuVar.f36511a.setAdapter(cuVar.f36513c);
                cuVar.f36511a.setFastScrollVisible(true);
                return;
            case 9:
                pv pvVar = (pv) this.h;
                pvVar.f41099a.getActionBar().i(false);
                pvVar.f41100b.getActionBar().i(false);
                return;
            case 10:
                v70 v70Var = (v70) this.h;
                if (v70Var.M) {
                    u70.E(v70Var.f42700f, null);
                    v70Var.M = false;
                    v70Var.d.setAdapter(v70Var.f42699e);
                    return;
                }
                return;
            case 11:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33610b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33610b.setAdapter(languageSelectActivity.f33609a);
                    return;
                }
                return;
            case 12:
                id0 id0Var = (id0) this.h;
                id0Var.f38868r0 = false;
                id0Var.f38870s0 = false;
                id0Var.W.G(null, null);
                id0Var.A0();
                if (id0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.u0 u0Var3 = id0Var.Z;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(0);
                    }
                    id0Var.U.setVisibility(0);
                    id0Var.S.setVisibility(0);
                    id0Var.V.setAdapter(null);
                    id0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 13:
                ib0 ib0Var = ((bi0) this.h).f36180a;
                ib0Var.f50686y = false;
                ib0Var.j(null);
                return;
            case 14:
            case 15:
            default:
                return;
            case 16:
                h41 h41Var = (h41) this.h;
                h41Var.f38244f = null;
                if (h41Var.f38241b != null) {
                    h41Var.d.setVisibility(8);
                    h41Var.f38241b.setAdapter(h41Var.f38240a);
                    return;
                }
                return;
            case 17:
                k91 k91Var = (k91) this.h;
                k91Var.f39416a.a(false, true);
                k91Var.o0(false, true);
                k91Var.f39420c.W2.N(false);
                return;
            case 18:
                hg1.b0((hg1) this.h, false);
                return;
            case 19:
                th1 th1Var = (th1) this.h;
                th1Var.h = null;
                j71 j71Var = th1Var.f27776a;
                if (j71Var != null) {
                    j71Var.W2.N(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f11214f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.d = true;
                f2Var.f11228a.W2.N(true);
                f2Var.f11228a.u0(0);
                return;
            case 1:
                yb ybVar = (yb) this.h;
                ybVar.I.setVisibility(8);
                ybVar.getClass();
                return;
            case 2:
                xp xpVar = (xp) this.h;
                xpVar.N = true;
                xpVar.d.setShowAtCenter(true);
                return;
            case 3:
                wr wrVar = (wr) this.h;
                wrVar.f43646o1 = true;
                org.telegram.ui.ActionBar.u0 u0Var = wrVar.h;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                l8 l8Var = (l8) this.h;
                l8Var.f28077s0 = l8Var.f28074r.N0();
                View m10 = l8Var.f28074r.m(l8Var.f28077s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                l8Var.f28078t0 = top;
                l8Var.h = true;
                l8Var.setAllowNestedScroll(false);
                l8Var.f28076s.l();
                org.telegram.ui.ActionBar.u0 u0Var2 = l8Var.f28067k0;
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                    return;
                }
                return;
            case 5:
                uk ukVar = (uk) this.h;
                ukVar.f31180b0 = true;
                ukVar.G.setVisibility(8);
                ukVar.f30570b.w1(ukVar.F.getSearchField(), true);
                return;
            case 6:
                zl zlVar = (zl) this.h;
                zlVar.f33411l0 = true;
                zlVar.f30570b.w1(zlVar.E.getSearchField(), true);
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 8:
                ((cu) this.h).f36515f = true;
                return;
            case 9:
                pv pvVar = (pv) this.h;
                pvVar.f41099a.getActionBar().z("");
                pvVar.f41100b.getActionBar().z("");
                pvVar.f41101c.getSearchField().requestFocus();
                return;
            case 10:
                return;
            case 11:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 12:
                ((id0) this.h).f38868r0 = true;
                return;
            case 13:
                ((bi0) this.h).f36180a.f50686y = true;
                return;
            case 14:
                ir0 ir0Var = (ir0) this.h;
                ir0Var.f38976a.getActionBar().z("");
                ir0Var.f38977b.getActionBar().z("");
                ir0Var.f38978c.getSearchField().requestFocus();
                return;
            case 15:
            case 19:
            default:
                return;
            case 16:
                return;
            case 17:
                k91 k91Var = (k91) this.h;
                k91Var.f39416a.a(true, true);
                k91Var.h.I("");
                k91Var.o0(false, true);
                k91Var.f39420c.W2.N(false);
                return;
            case 18:
                hg1 hg1Var = (hg1) this.h;
                hg1.b0(hg1Var, true);
                dg1 dg1Var = hg1Var.f38411r0;
                if (!dg1Var.f36809b0.equals("")) {
                    dg1Var.K(dg1Var.f31109e[0], dg1Var.getCurrentPosition(), "", false);
                }
                hg1Var.f38411r0.setAlpha(0.0f);
                hg1Var.f38411r0.f36820n0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.p0 p0Var) {
        switch (this.f11214f) {
            case 5:
                uk ukVar = (uk) this.h;
                tk tkVar = ukVar.f31190y;
                tkVar.R.remove(p0Var);
                tkVar.Y(ukVar.F.getSearchField().getText().toString(), false);
                tkVar.a0(null, null, true);
                return;
            case 18:
            default:
                return;
        }
    }

    @Override
    public void p(ci.g2 g2Var) {
        switch (this.f11214f) {
            case 1:
                yb ybVar = (yb) this.h;
                ybVar.U = true;
                ybVar.f44438v0 = g2Var.getText().toString();
                ybVar.U0(true);
                return;
            case 14:
                ir0 ir0Var = (ir0) this.h;
                ir0Var.f38976a.getActionBar().y();
                ir0Var.f38977b.getActionBar().y();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        wm0 wm0Var;
        int h;
        ai.w0 w0Var;
        s4.i0 i0Var;
        switch (this.f11214f) {
            case 0:
                f2 f2Var = (f2) this.h;
                f2Var.f11231e = editText.getText().toString();
                f2Var.f11228a.W2.N(true);
                f2Var.f11228a.u0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                xp xpVar = (xp) this.h;
                if (xpVar.f44135e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (wm0Var = xpVar.f44133b) != null) {
                        s4.i0 adapter = wm0Var.getAdapter();
                        wp wpVar = xpVar.f44135e;
                        if (adapter != wpVar) {
                            xpVar.f44133b.setAdapter(wpVar);
                            View view = xpVar.fragmentView;
                            int i10 = h6.f20560d6;
                            view.setBackgroundColor(h6.x0(null, i10, false));
                            xpVar.fragmentView.setTag(Integer.valueOf(i10));
                            xpVar.f44135e.l();
                            xpVar.f44133b.setFastScrollVisible(false);
                            xpVar.f44133b.setVerticalScrollBarEnabled(true);
                            xpVar.d.b();
                        }
                    }
                    xpVar.f44135e.F(obj);
                    return;
                }
                return;
            case 3:
                wr wrVar = (wr) this.h;
                if (wrVar.f43624e != null) {
                    String obj2 = editText.getText().toString();
                    if (wrVar.f43619c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = wrVar.f43619c.getAdapter().h();
                    }
                    wrVar.f43624e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = wrVar.f43619c) != null) {
                        s4.i0 adapter2 = w0Var.getAdapter();
                        sr srVar = wrVar.f43613a;
                        if (adapter2 != srVar) {
                            ai.w0 w0Var2 = wrVar.f43619c;
                            w0Var2.W1 = false;
                            w0Var2.X1 = 0;
                            w0Var2.setAdapter(srVar);
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
                l8 l8Var = (l8) this.h;
                if (editText.length() > 0) {
                    l8Var.f28076s.E(editText.getText().toString());
                    return;
                }
                l8Var.f28061f = false;
                l8Var.f28076s.E(null);
                return;
            case 5:
                ((uk) this.h).f31190y.Y(editText.getText().toString(), false);
                return;
            case 6:
                zl zlVar = (zl) this.h;
                ai.f0 f0Var = zlVar.N;
                ai.w0 w0Var3 = zlVar.P;
                wm0 wm0Var2 = zlVar.Q;
                tl tlVar = zlVar.R;
                if (tlVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        zlVar.m0 = true;
                        zlVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (wm0Var2.getAdapter() != tlVar) {
                            wm0Var2.setAdapter(tlVar);
                        }
                        wm0Var2.setVisibility(0);
                        if (tlVar.f10551s.size() == 0 && tlVar.f10550r.size() == 0) {
                            z10 = true;
                        }
                        zlVar.f33413n0 = z10;
                        zlVar.i0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        wm0Var2.setAdapter(null);
                        wm0Var2.setVisibility(8);
                        zlVar.v.setVisibility(8);
                    }
                    tlVar.G(obj3, zlVar.f33418r0);
                    return;
                }
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f33552r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f33534c.a(!obj4.isEmpty(), true);
                    contactsActivity.f33543i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        wm0 wm0Var3 = contactsActivity.f33539f;
                        if (wm0Var3 != null) {
                            wm0Var3.setAdapter(contactsActivity.f33552r);
                            contactsActivity.f33539f.setSectionsType(0);
                            contactsActivity.f33552r.l();
                            contactsActivity.f33539f.setFastScrollVisible(false);
                            contactsActivity.f33539f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f33537e.e(true, true);
                        contactsActivity.f33552r.G(obj4);
                        return;
                    }
                    wm0 wm0Var4 = contactsActivity.f33539f;
                    if (wm0Var4 != null) {
                        wm0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f33539f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                cu cuVar = (cu) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    au auVar = cuVar.d;
                    auVar.getClass();
                    auVar.f35980e = null;
                    cuVar.f36514e = false;
                    cuVar.f36511a.setAdapter(cuVar.f36513c);
                    cuVar.f36511a.setFastScrollVisible(true);
                    return;
                }
                au auVar2 = cuVar.d;
                auVar2.getClass();
                if (obj5 == null) {
                    auVar2.f35980e = null;
                } else {
                    try {
                        Timer timer = auVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Timer timer2 = new Timer();
                    auVar2.d = timer2;
                    timer2.schedule(new gg.r1(auVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    cuVar.f36514e = true;
                    return;
                }
                return;
            case 9:
                pv pvVar = (pv) this.h;
                pvVar.f41099a.getActionBar().setSearchFieldText(editText.getText().toString());
                pvVar.f41100b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 10:
                String obj6 = editText.getText().toString();
                v70 v70Var = (v70) this.h;
                u70.E(v70Var.f42700f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != v70Var.M) {
                    v70Var.M = z11;
                    wm0 wm0Var5 = v70Var.d;
                    if (wm0Var5 != null) {
                        if (!isEmpty) {
                            i0Var = v70Var.f42700f;
                        } else {
                            i0Var = v70Var.f42699e;
                        }
                        wm0Var5.setAdapter(i0Var);
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
                    wm0 wm0Var6 = languageSelectActivity.f33610b;
                    if (wm0Var6 != null) {
                        wm0Var6.setAdapter(languageSelectActivity.f33611c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f33610b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f33610b.setAdapter(languageSelectActivity.f33609a);
                    return;
                }
                return;
            case 12:
                id0 id0Var = (id0) this.h;
                if (id0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        id0Var.f38870s0 = true;
                        id0Var.f38874w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.u0 u0Var = id0Var.Z;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        id0Var.U.setVisibility(8);
                        id0Var.S.setVisibility(8);
                        s4.i0 adapter3 = id0Var.V.getAdapter();
                        bd0 bd0Var = id0Var.W;
                        if (adapter3 != bd0Var) {
                            id0Var.V.setAdapter(bd0Var);
                        }
                        id0Var.V.setVisibility(0);
                        if (id0Var.W.h() == 0) {
                            z12 = true;
                        }
                        id0Var.f38871t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.u0 u0Var2 = id0Var.Z;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(0);
                        }
                        id0Var.U.setVisibility(0);
                        id0Var.S.setVisibility(0);
                        id0Var.V.setAdapter(null);
                        id0Var.V.setVisibility(8);
                    }
                    id0Var.A0();
                    id0Var.W.G(obj8, id0Var.f38877x0);
                    return;
                }
                return;
            case 13:
                ((bi0) this.h).f36180a.j(editText.getText().toString());
                return;
            case 14:
                ir0 ir0Var = (ir0) this.h;
                ir0Var.f38976a.getActionBar().setSearchFieldText(editText.getText().toString());
                ir0Var.f38977b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 15:
                ((ProfileActivity) this.h).f34080e.I(editText.getText().toString().toLowerCase());
                return;
            case 16:
                String obj9 = editText.getText().toString();
                h41 h41Var = (h41) this.h;
                if (obj9 == null) {
                    h41Var.f38244f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = h41Var.f38244f;
                    if (arrayList == null) {
                        h41Var.f38244f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < h41Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) h41Var.h.get(i11);
                        if (language.f17025q.startsWith(lowerCase)) {
                            h41Var.f38244f.add(0, language);
                        } else if (language.f17025q.contains(lowerCase)) {
                            h41Var.f38244f.add(language);
                        }
                    }
                    h41Var.f38242c.l();
                }
                if (obj9.length() != 0) {
                    wm0 wm0Var7 = h41Var.f38241b;
                    if (wm0Var7 != null) {
                        wm0Var7.setAdapter(h41Var.f38242c);
                        return;
                    }
                    return;
                } else if (h41Var.f38241b != null) {
                    h41Var.d.setVisibility(8);
                    h41Var.f38241b.setAdapter(h41Var.f38240a);
                    return;
                } else {
                    return;
                }
            case 17:
                ((k91) this.h).h.I(editText.getText().toString());
                return;
            case 18:
                String obj10 = editText.getText().toString();
                dg1 dg1Var = ((hg1) this.h).f38411r0;
                if (!dg1Var.f36809b0.equals(obj10)) {
                    dg1Var.K(dg1Var.f31109e[0], dg1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 19:
                th1 th1Var = (th1) this.h;
                th1Var.h = editText.getText().toString();
                j71 j71Var = th1Var.f27776a;
                if (j71Var != null) {
                    j71Var.W2.N(true);
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
