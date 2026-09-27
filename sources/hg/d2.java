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
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a91;
import org.telegram.ui.br0;
import org.telegram.ui.fd0;
import org.telegram.ui.lv;
import org.telegram.ui.mr;
import org.telegram.ui.q70;
import org.telegram.ui.qr;
import org.telegram.ui.r70;
import org.telegram.ui.rp;
import org.telegram.ui.sf1;
import org.telegram.ui.sp;
import org.telegram.ui.sr;
import org.telegram.ui.wb;
import org.telegram.ui.wf1;
import org.telegram.ui.wh0;
import org.telegram.ui.wt;
import org.telegram.ui.y31;
import org.telegram.ui.yc0;
import org.telegram.ui.yt;
public final class d2 extends g5 {
    public final int f10243f;
    public final Object h;

    public d2(Object obj, int i10) {
        this.f10243f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f10243f) {
            case 15:
                ((br0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f10243f) {
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
        switch (this.f10243f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = false;
                e2Var.e = null;
                e2Var.f10264a.Y2.N(true);
                e2Var.f10264a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.f38896v0 = "";
                wbVar.I.setVisibility(0);
                if (wbVar.U) {
                    wbVar.U = false;
                    wbVar.U0(true);
                    return;
                }
                return;
            case 2:
                sp spVar = (sp) this.h;
                spVar.e.F(null);
                spVar.N = false;
                spVar.getClass();
                spVar.f37541b.setAdapter(spVar.f37540a);
                spVar.f37540a.l();
                spVar.f37541b.setFastScrollVisible(true);
                spVar.f37541b.setVerticalScrollBarEnabled(false);
                spVar.d.setShowAtCenter(false);
                View view = spVar.fragmentView;
                int i10 = i6.f19001a7;
                view.setBackgroundColor(i6.w0(null, i10, false));
                spVar.fragmentView.setTag(Integer.valueOf(i10));
                spVar.d.b();
                return;
            case 3:
                qr qrVar = (qr) this.h;
                qrVar.e.F(null);
                qrVar.f36849o1 = false;
                ai.w0 w0Var = qrVar.f36823c;
                w0Var.Y1 = false;
                w0Var.Z1 = 0;
                w0Var.setAdapter(qrVar.f36817a);
                qrVar.f36817a.l();
                qrVar.f36823c.setFastScrollVisible(true);
                qrVar.f36823c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var2 = qrVar.h;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(0);
                    return;
                }
                return;
            case 4:
                sr srVar = (sr) this.h;
                srVar.f37569n = null;
                n61 n61Var = srVar.f27008a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                if (j8Var.h) {
                    j8Var.f25351f = false;
                    j8Var.h = false;
                    j8Var.setAllowNestedScroll(true);
                    j8Var.f25366s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var3 = j8Var.f25357k0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                qk qkVar = (qk) this.h;
                qkVar.f27756b0 = false;
                qkVar.G.setVisibility(0);
                fk fkVar = qkVar.f27762r;
                s4.h0 adapter = fkVar.getAdapter();
                jk jkVar = qkVar.v;
                if (adapter != jkVar) {
                    fkVar.setAdapter(jkVar);
                }
                jkVar.l();
                qkVar.f27766y.Y(null, true);
                return;
            case 7:
                il ilVar = (il) this.h;
                ilVar.f25179l0 = false;
                ilVar.m0 = false;
                ilVar.R.G(null, null);
                ilVar.f0();
                ilVar.P.setVisibility(0);
                ilVar.N.setVisibility(0);
                ilVar.Q.setVisibility(8);
                ilVar.v.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f31043r.G(null);
                contactsActivity.F = false;
                contactsActivity.E = false;
                contactsActivity.f31030f.setAdapter(contactsActivity.d);
                contactsActivity.f31030f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f31030f.setFastScrollVisible(true);
                contactsActivity.f31030f.setVerticalScrollBarEnabled(false);
                contactsActivity.f31030f.getFastScroll().f24319h0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                yt ytVar = (yt) this.h;
                wt wtVar = ytVar.d;
                wtVar.getClass();
                wtVar.e = null;
                ytVar.f40319f = false;
                ytVar.e = false;
                ytVar.f40316a.setAdapter(ytVar.f40318c);
                ytVar.f40316a.setFastScrollVisible(true);
                return;
            case 10:
                lv lvVar = (lv) this.h;
                lvVar.f35453a.getActionBar().i(false);
                lvVar.f35454b.getActionBar().i(false);
                return;
            case 11:
                r70 r70Var = (r70) this.h;
                if (r70Var.M) {
                    q70.E(r70Var.f37022f, null);
                    r70Var.M = false;
                    r70Var.d.setAdapter(r70Var.e);
                    return;
                }
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31097b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31097b.setAdapter(languageSelectActivity.f31096a);
                    return;
                }
                return;
            case 13:
                fd0 fd0Var = (fd0) this.h;
                fd0Var.f33508r0 = false;
                fd0Var.f33510s0 = false;
                fd0Var.W.G(null, null);
                fd0Var.B0();
                if (fd0Var.G0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var4 = fd0Var.Z;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                    }
                    fd0Var.U.setVisibility(0);
                    fd0Var.S.setVisibility(0);
                    fd0Var.V.setAdapter(null);
                    fd0Var.V.setVisibility(8);
                    return;
                }
                return;
            case 14:
                pa0 pa0Var = ((wh0) this.h).f39346a;
                pa0Var.f45455y = false;
                pa0Var.j(null);
                return;
            case 15:
            case 16:
            default:
                return;
            case 17:
                y31 y31Var = (y31) this.h;
                y31Var.f40126f = null;
                if (y31Var.f40124b != null) {
                    y31Var.d.setVisibility(8);
                    y31Var.f40124b.setAdapter(y31Var.f40123a);
                    return;
                }
                return;
            case 18:
                a91 a91Var = (a91) this.h;
                a91Var.f32010a.a(false, true);
                a91Var.p0(false, true);
                a91Var.f32014c.Y2.N(false);
                return;
            case 19:
                wf1.b0((wf1) this.h, false);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f10243f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.d = true;
                e2Var.f10264a.Y2.N(true);
                e2Var.f10264a.v0(0);
                return;
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.I.setVisibility(8);
                wbVar.getClass();
                return;
            case 2:
                sp spVar = (sp) this.h;
                spVar.N = true;
                spVar.d.setShowAtCenter(true);
                return;
            case 3:
                qr qrVar = (qr) this.h;
                qrVar.f36849o1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = qrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                j8Var.f25367s0 = j8Var.f25364r.N0();
                View m10 = j8Var.f25364r.m(j8Var.f25367s0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                j8Var.f25368t0 = top;
                j8Var.h = true;
                j8Var.setAllowNestedScroll(false);
                j8Var.f25366s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = j8Var.f25357k0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    return;
                }
                return;
            case 6:
                qk qkVar = (qk) this.h;
                qkVar.f27756b0 = true;
                qkVar.G.setVisibility(8);
                qkVar.f27104b.q1(qkVar.F.getSearchField(), true);
                return;
            case 7:
                il ilVar = (il) this.h;
                ilVar.f25179l0 = true;
                ilVar.f27104b.q1(ilVar.E.getSearchField(), true);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.F = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 9:
                ((yt) this.h).f40319f = true;
                return;
            case 10:
                lv lvVar = (lv) this.h;
                lvVar.f35453a.getActionBar().y("");
                lvVar.f35454b.getActionBar().y("");
                lvVar.f35455c.getSearchField().requestFocus();
                return;
            case 11:
                return;
            case 12:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 13:
                ((fd0) this.h).f33508r0 = true;
                return;
            case 14:
                ((wh0) this.h).f39346a.f45455y = true;
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f32419a.getActionBar().y("");
                br0Var.f32420b.getActionBar().y("");
                br0Var.f32421c.getSearchField().requestFocus();
                return;
            case 16:
            default:
                return;
            case 17:
                return;
            case 18:
                a91 a91Var = (a91) this.h;
                a91Var.f32010a.a(true, true);
                a91Var.h.I("");
                a91Var.p0(false, true);
                a91Var.f32014c.Y2.N(false);
                return;
            case 19:
                wf1 wf1Var = (wf1) this.h;
                wf1.b0(wf1Var, true);
                sf1 sf1Var = wf1Var.f39321r0;
                if (!sf1Var.f37427c0.equals("")) {
                    sf1Var.L(sf1Var.e[0], sf1Var.getCurrentPosition(), "", false);
                }
                wf1Var.f39321r0.setAlpha(0.0f);
                wf1Var.f39321r0.f37438o0.e(true, false);
                return;
        }
    }

    @Override
    public void o(gg.q0 q0Var) {
        switch (this.f10243f) {
            case 6:
                qk qkVar = (qk) this.h;
                pk pkVar = qkVar.f27766y;
                pkVar.R.remove(q0Var);
                pkVar.Y(qkVar.F.getSearchField().getText().toString(), false);
                pkVar.a0(null, null, true);
                return;
            case 19:
            default:
                return;
        }
    }

    @Override
    public void p(h2 h2Var) {
        switch (this.f10243f) {
            case 1:
                wb wbVar = (wb) this.h;
                wbVar.U = true;
                wbVar.f38896v0 = h2Var.getText().toString();
                wbVar.U0(true);
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f32419a.getActionBar().x();
                br0Var.f32420b.getActionBar().x();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        yl0 yl0Var;
        int h;
        ai.w0 w0Var;
        s4.h0 h0Var;
        switch (this.f10243f) {
            case 0:
                e2 e2Var = (e2) this.h;
                e2Var.e = editText.getText().toString();
                e2Var.f10264a.Y2.N(true);
                e2Var.f10264a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                sp spVar = (sp) this.h;
                if (spVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (yl0Var = spVar.f37541b) != null) {
                        s4.h0 adapter = yl0Var.getAdapter();
                        rp rpVar = spVar.e;
                        if (adapter != rpVar) {
                            spVar.f37541b.setAdapter(rpVar);
                            View view = spVar.fragmentView;
                            int i10 = i6.f19057d6;
                            view.setBackgroundColor(i6.w0(null, i10, false));
                            spVar.fragmentView.setTag(Integer.valueOf(i10));
                            spVar.e.l();
                            spVar.f37541b.setFastScrollVisible(false);
                            spVar.f37541b.setVerticalScrollBarEnabled(true);
                            spVar.d.b();
                        }
                    }
                    spVar.e.F(obj);
                    return;
                }
                return;
            case 3:
                qr qrVar = (qr) this.h;
                if (qrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (qrVar.f36823c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = qrVar.f36823c.getAdapter().h();
                    }
                    qrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (w0Var = qrVar.f36823c) != null) {
                        s4.h0 adapter2 = w0Var.getAdapter();
                        mr mrVar = qrVar.f36817a;
                        if (adapter2 != mrVar) {
                            ai.w0 w0Var2 = qrVar.f36823c;
                            w0Var2.Y1 = false;
                            w0Var2.Z1 = 0;
                            w0Var2.setAdapter(mrVar);
                            if (h == 0) {
                                qrVar.y0(0);
                            }
                        }
                    }
                    qrVar.D1.setVisibility(8);
                    qrVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                sr srVar = (sr) this.h;
                srVar.f37569n = editText.getText().toString();
                n61 n61Var = srVar.f27008a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            case 5:
                j8 j8Var = (j8) this.h;
                if (editText.length() > 0) {
                    j8Var.f25366s.E(editText.getText().toString());
                    return;
                }
                j8Var.f25351f = false;
                j8Var.f25366s.E(null);
                return;
            case 6:
                ((qk) this.h).f27766y.Y(editText.getText().toString(), false);
                return;
            case 7:
                il ilVar = (il) this.h;
                ai.f0 f0Var = ilVar.N;
                ai.w0 w0Var3 = ilVar.P;
                yl0 yl0Var2 = ilVar.Q;
                cl clVar = ilVar.R;
                if (clVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        ilVar.m0 = true;
                        ilVar.E.setShowSearchProgress(true);
                        w0Var3.setVisibility(8);
                        f0Var.setVisibility(8);
                        if (yl0Var2.getAdapter() != clVar) {
                            yl0Var2.setAdapter(clVar);
                        }
                        yl0Var2.setVisibility(0);
                        if (clVar.f9669s.size() == 0 && clVar.f9668r.size() == 0) {
                            z10 = true;
                        }
                        ilVar.f25181n0 = z10;
                        ilVar.f0();
                    } else {
                        w0Var3.setVisibility(0);
                        f0Var.setVisibility(0);
                        yl0Var2.setAdapter(null);
                        yl0Var2.setVisibility(8);
                        ilVar.v.setVisibility(8);
                    }
                    clVar.G(obj3, ilVar.f25186r0);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f31043r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f31026c.a(!obj4.isEmpty(), true);
                    contactsActivity.f31034i0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.E = true;
                        yl0 yl0Var3 = contactsActivity.f31030f;
                        if (yl0Var3 != null) {
                            yl0Var3.setAdapter(contactsActivity.f31043r);
                            contactsActivity.f31030f.setSectionsType(0);
                            contactsActivity.f31043r.l();
                            contactsActivity.f31030f.setFastScrollVisible(false);
                            contactsActivity.f31030f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f31043r.G(obj4);
                        return;
                    }
                    yl0 yl0Var4 = contactsActivity.f31030f;
                    if (yl0Var4 != null) {
                        yl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f31030f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                yt ytVar = (yt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    wt wtVar = ytVar.d;
                    wtVar.getClass();
                    wtVar.e = null;
                    ytVar.e = false;
                    ytVar.f40316a.setAdapter(ytVar.f40318c);
                    ytVar.f40316a.setFastScrollVisible(true);
                    return;
                }
                wt wtVar2 = ytVar.d;
                wtVar2.getClass();
                if (obj5 == null) {
                    wtVar2.e = null;
                } else {
                    try {
                        Timer timer = wtVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    wtVar2.d = timer2;
                    timer2.schedule(new gg.s1(wtVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    ytVar.e = true;
                    return;
                }
                return;
            case 10:
                lv lvVar = (lv) this.h;
                lvVar.f35453a.getActionBar().setSearchFieldText(editText.getText().toString());
                lvVar.f35454b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                String obj6 = editText.getText().toString();
                r70 r70Var = (r70) this.h;
                q70.E(r70Var.f37022f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != r70Var.M) {
                    r70Var.M = z11;
                    yl0 yl0Var5 = r70Var.d;
                    if (yl0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = r70Var.f37022f;
                        } else {
                            h0Var = r70Var.e;
                        }
                        yl0Var5.setAdapter(h0Var);
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
                    yl0 yl0Var6 = languageSelectActivity.f31097b;
                    if (yl0Var6 != null) {
                        yl0Var6.setAdapter(languageSelectActivity.f31098c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31097b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31097b.setAdapter(languageSelectActivity.f31096a);
                    return;
                }
                return;
            case 13:
                fd0 fd0Var = (fd0) this.h;
                if (fd0Var.W != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        fd0Var.f33510s0 = true;
                        fd0Var.f33514w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var4 = fd0Var.Z;
                        if (w0Var4 != null) {
                            w0Var4.setVisibility(8);
                        }
                        fd0Var.U.setVisibility(8);
                        fd0Var.S.setVisibility(8);
                        s4.h0 adapter3 = fd0Var.V.getAdapter();
                        yc0 yc0Var = fd0Var.W;
                        if (adapter3 != yc0Var) {
                            fd0Var.V.setAdapter(yc0Var);
                        }
                        fd0Var.V.setVisibility(0);
                        if (fd0Var.W.h() == 0) {
                            z12 = true;
                        }
                        fd0Var.f33511t0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var5 = fd0Var.Z;
                        if (w0Var5 != null) {
                            w0Var5.setVisibility(0);
                        }
                        fd0Var.U.setVisibility(0);
                        fd0Var.S.setVisibility(0);
                        fd0Var.V.setAdapter(null);
                        fd0Var.V.setVisibility(8);
                    }
                    fd0Var.B0();
                    fd0Var.W.G(obj8, fd0Var.f33517x0);
                    return;
                }
                return;
            case 14:
                ((wh0) this.h).f39346a.j(editText.getText().toString());
                return;
            case 15:
                br0 br0Var = (br0) this.h;
                br0Var.f32419a.getActionBar().setSearchFieldText(editText.getText().toString());
                br0Var.f32420b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 16:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 17:
                String obj9 = editText.getText().toString();
                y31 y31Var = (y31) this.h;
                if (obj9 == null) {
                    y31Var.f40126f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = y31Var.f40126f;
                    if (arrayList == null) {
                        y31Var.f40126f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < y31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) y31Var.h.get(i11);
                        if (language.f15847q.startsWith(lowerCase)) {
                            y31Var.f40126f.add(0, language);
                        } else if (language.f15847q.contains(lowerCase)) {
                            y31Var.f40126f.add(language);
                        }
                    }
                    y31Var.f40125c.l();
                }
                if (obj9.length() != 0) {
                    yl0 yl0Var7 = y31Var.f40124b;
                    if (yl0Var7 != null) {
                        yl0Var7.setAdapter(y31Var.f40125c);
                        return;
                    }
                    return;
                } else if (y31Var.f40124b != null) {
                    y31Var.d.setVisibility(8);
                    y31Var.f40124b.setAdapter(y31Var.f40123a);
                    return;
                } else {
                    return;
                }
            case 18:
                ((a91) this.h).h.I(editText.getText().toString());
                return;
            case 19:
                String obj10 = editText.getText().toString();
                sf1 sf1Var = ((wf1) this.h).f39321r0;
                if (!sf1Var.f37427c0.equals(obj10)) {
                    sf1Var.L(sf1Var.e[0], sf1Var.getCurrentPosition(), obj10, false);
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
