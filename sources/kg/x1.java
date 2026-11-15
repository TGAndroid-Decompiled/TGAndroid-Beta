package kg;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import bi.g2;
import bi.t6;
import bi.v3;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.v00;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.z80;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cn0;
import org.telegram.ui.cu;
import org.telegram.ui.ev;
import org.telegram.ui.hw;
import org.telegram.ui.k31;
import org.telegram.ui.k50;
import org.telegram.ui.l50;
import org.telegram.ui.lb;
import org.telegram.ui.mq;
import org.telegram.ui.nw;
import org.telegram.ui.oy0;
import org.telegram.ui.pa0;
import org.telegram.ui.q91;
import org.telegram.ui.qq;
import org.telegram.ui.rc1;
import org.telegram.ui.so;
import org.telegram.ui.sq;
import org.telegram.ui.to;
import org.telegram.ui.ts;
import org.telegram.ui.u91;
import org.telegram.ui.uw;
import org.telegram.ui.v50;
import org.telegram.ui.xw;
import org.telegram.ui.y50;
import org.telegram.ui.yw;
public final class x1 extends org.telegram.ui.ActionBar.m0 {
    public final int f18139a;
    public final Object f18140b;

    public x1(Object obj, int i7) {
        this.f18139a = i7;
        this.f18140b = obj;
    }

    @Override
    public boolean b() {
        switch (this.f18139a) {
            case 11:
                yw ywVar = (yw) this.f18140b;
                org.telegram.ui.ActionBar.q0 q0Var = ywVar.F1;
                if (q0Var != null) {
                    q0Var.setVisibility(0);
                }
                if (ywVar.f53686p2 != null) {
                    ywVar.finishFragment();
                    return false;
                }
                return true;
            case 18:
                ((cn0) this.f18140b).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f18139a) {
            case 11:
                yw ywVar = (yw) this.f18140b;
                kVar = ((e2) ywVar).actionBar;
                if (!kVar.x() && ywVar.S3 == null) {
                    return true;
                }
                return false;
            default:
                return super.c();
        }
    }

    @Override
    public Animator e() {
        switch (this.f18139a) {
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f18140b;
                boolean z10 = profileActivity.X1;
                profileActivity.X1 = !z10;
                if (z10) {
                    d5 d5Var = profileActivity.U0;
                    d5Var.f29502e.clearFocus();
                    org.telegram.messenger.g0.v1(d5Var.f29502e);
                }
                if (profileActivity.X1) {
                    profileActivity.U0.getSearchField().setText("");
                }
                return ProfileActivity.P0(profileActivity, profileActivity.X1);
            default:
                return super.e();
        }
    }

    @Override
    public void f() {
        switch (this.f18139a) {
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f18140b;
                rc1 rc1Var = wallpapersListActivity.I;
                rc1Var.f50921n = null;
                rc1Var.E(null, true);
                wallpapersListActivity.K.setSearchFieldHint(hd.M0(2131745816, null));
                return;
            default:
                return;
        }
    }

    @Override
    public void h() {
        ri.q qVar;
        int i7 = this.f18139a;
        pz pzVar = null;
        Object obj = this.f18140b;
        switch (i7) {
            case 0:
                y1 y1Var = (y1) obj;
                y1Var.d = false;
                y1Var.f18150e = null;
                y1Var.f18147a.f39892g3.O(true);
                y1Var.f18147a.v0(0);
                return;
            case 1:
                lb lbVar = (lb) obj;
                lbVar.f48955w0 = "";
                lbVar.J.setVisibility(0);
                if (lbVar.V) {
                    lbVar.V = false;
                    lbVar.Z0(true);
                    return;
                }
                return;
            case 2:
                to toVar = (to) obj;
                toVar.f51621e.F(null);
                toVar.O = false;
                toVar.getClass();
                toVar.f51619b.setAdapter(toVar.f51618a);
                toVar.f51618a.f();
                toVar.f51619b.setFastScrollVisible(true);
                toVar.f51619b.setVerticalScrollBarEnabled(false);
                toVar.d.setShowAtCenter(false);
                toVar.d.b();
                return;
            case 3:
                qq qqVar = (qq) obj;
                qqVar.f50719e.F(null);
                qqVar.f50740o1 = false;
                di.c1 c1Var = qqVar.f50714c;
                c1Var.X1 = false;
                c1Var.Y1 = 0;
                c1Var.setAdapter(qqVar.f50708a);
                qqVar.f50708a.f();
                qqVar.f50714c.setFastScrollVisible(true);
                qqVar.f50714c.setVerticalScrollBarEnabled(false);
                return;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.f51260n = null;
                v3 v3Var = sqVar.f38880a;
                if (v3Var != null) {
                    v3Var.f39892g3.O(true);
                    return;
                }
                return;
            case 5:
                y7 y7Var = (y7) obj;
                if (y7Var.f41906r1) {
                    y7Var.f41904q1 = false;
                    y7Var.f41906r1 = false;
                    y7Var.f29713r0 = true;
                    y7Var.f41912u1.E(null);
                    org.telegram.ui.ActionBar.q0 q0Var = y7Var.f41889e2;
                    if (q0Var != null) {
                        q0Var.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                dk dkVar = (dk) obj;
                dkVar.f33946c0 = false;
                dkVar.H.setVisibility(0);
                rj rjVar = dkVar.f33952r;
                v4.h0 adapter = rjVar.getAdapter();
                vj vjVar = dkVar.f33954w;
                if (adapter != vjVar) {
                    rjVar.setAdapter(vjVar);
                }
                vjVar.f();
                dkVar.E.Y(null, true);
                return;
            case 7:
                dl dlVar = (dl) obj;
                dlVar.f33964d0 = false;
                dlVar.f33965e0 = false;
                dlVar.O.G(null);
                dlVar.j0();
                dlVar.M.setVisibility(0);
                dlVar.K.setVisibility(0);
                dlVar.N.setVisibility(8);
                dlVar.f33980s.setVisibility(8);
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.h.G(null);
                contactsActivity.f42537c0 = null;
                contactsActivity.E = false;
                contactsActivity.f42556y = false;
                contactsActivity.d.setAdapter(contactsActivity.f42534b);
                contactsActivity.d.setSectionsType(1);
                contactsActivity.f42534b.f();
                contactsActivity.d.setFastScrollVisible(true);
                contactsActivity.d.setVerticalScrollBarEnabled(false);
                ContactsActivity.g0(contactsActivity);
                return;
            case 9:
                ts tsVar = (ts) obj;
                vj vjVar2 = tsVar.d;
                vjVar2.getClass();
                vjVar2.f40447e = null;
                tsVar.f51662f = false;
                tsVar.f51661e = false;
                tsVar.f51658a.setAdapter(tsVar.f51660c);
                tsVar.f51658a.setFastScrollVisible(true);
                return;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.f46217a.getActionBar().n(false);
                cuVar.f46218b.getActionBar().n(false);
                return;
            case 11:
                yw ywVar = (yw) obj;
                nw nwVar = ywVar.Y;
                if (nwVar != null) {
                    ArrayList arrayList = nwVar.G;
                    if (!arrayList.isEmpty() && nwVar.I != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((jg.o0) arrayList.get(i10)).h) {
                                ((ev) nwVar.I).g((jg.o0) arrayList.get(i10));
                            }
                        }
                    }
                }
                ywVar.f53668l2 = false;
                ywVar.f53672m2 = false;
                xw xwVar = ywVar.f53638f0[0];
                if (xwVar != null) {
                    uw uwVar = xwVar.f53335a;
                    if (ywVar.Y2 == 0) {
                        pzVar = xwVar.f53344x;
                    }
                    uwVar.setEmptyView(pzVar);
                    ywVar.a5(false, false, true, false);
                }
                ywVar.m5(false, false);
                ns.e().k(268, Boolean.TRUE);
                ywVar.Y.setCloseButtonVisible(false);
                ywVar.l5(true);
                ywVar.N3();
                qVar = ((e2) ywVar).glassEngine;
                qVar.g();
                return;
            case 12:
                l50 l50Var = (l50) obj;
                if (l50Var.N) {
                    k50.E(l50Var.f48845f, null);
                    l50Var.N = false;
                    l50Var.d.setAdapter(l50Var.f48844e);
                    return;
                }
                return;
            case 13:
                y50.d0((y50) obj);
                return;
            case 14:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f42616b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f42616b.setAdapter(languageSelectActivity.f42615a);
                    return;
                }
                return;
            case 15:
                pa0 pa0Var = (pa0) obj;
                pa0Var.f50196u0 = false;
                pa0Var.f50197v0 = false;
                pa0Var.T.G(null);
                pa0Var.L0();
                d5 d5Var = pa0Var.W;
                if (d5Var != null) {
                    d5Var.setVisibility(0);
                }
                pa0Var.R.setVisibility(0);
                pa0Var.P.setVisibility(0);
                pa0Var.S.setAdapter(null);
                pa0Var.S.setVisibility(8);
                pa0Var.K0(false);
                return;
            case 16:
                z80 z80Var = (z80) ((t6) obj).f3885b;
                z80Var.f61463y = false;
                z80Var.j(null);
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                notificationsCustomSettingsActivity.d.F(null);
                notificationsCustomSettingsActivity.f42675f = false;
                notificationsCustomSettingsActivity.getClass();
                notificationsCustomSettingsActivity.f42673c.setText(hd.M0(2131748211, "NoExceptions"));
                notificationsCustomSettingsActivity.f42671a.setAdapter(notificationsCustomSettingsActivity.f42672b);
                notificationsCustomSettingsActivity.f42672b.f();
                notificationsCustomSettingsActivity.f42671a.setFastScrollVisible(true);
                notificationsCustomSettingsActivity.f42671a.setVerticalScrollBarEnabled(false);
                notificationsCustomSettingsActivity.f42673c.setShowAtCenter(false);
                return;
            case 18:
            case 19:
            default:
                return;
            case 20:
                oy0 oy0Var = (oy0) obj;
                oy0Var.f50065f = null;
                if (oy0Var.f50062b != null) {
                    oy0Var.d.setVisibility(8);
                    oy0Var.f50062b.setAdapter(oy0Var.f50061a);
                    return;
                }
                return;
            case 21:
                k31 k31Var = (k31) obj;
                k31Var.f48515a.a(false, true);
                k31Var.o0(false, true);
                k31Var.f48519c.f39892g3.O(false);
                return;
            case 22:
                u91.f0((u91) obj, false);
                return;
            case 23:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                wallpapersListActivity.G.setAdapter(wallpapersListActivity.H);
                wallpapersListActivity.G.invalidate();
                wallpapersListActivity.I.E(null, true);
                wallpapersListActivity.K.setSearchFieldCaption(null);
                f();
                return;
        }
    }

    @Override
    public void i() {
        throw new UnsupportedOperationException("Method not decompiled: kg.x1.i():void");
    }

    @Override
    public void j(jg.o0 o0Var) {
        switch (this.f18139a) {
            case 6:
                dk dkVar = (dk) this.f18140b;
                ck ckVar = dkVar.E;
                ckVar.S.remove(o0Var);
                ckVar.Y(dkVar.G.getSearchField().getText().toString(), false);
                ckVar.a0(null, null, true);
                return;
            case 22:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f18139a) {
            case 1:
                lb lbVar = (lb) this.f18140b;
                lbVar.V = true;
                lbVar.f48955w0 = editTextBoldCursor.getText().toString();
                lbVar.Z0(true);
                return;
            case 18:
                cn0 cn0Var = (cn0) this.f18140b;
                cn0Var.f46183a.getActionBar().B();
                cn0Var.f46184b.getActionBar().B();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(EditText editText) {
        uj0 uj0Var;
        int b10;
        di.c1 c1Var;
        hw hwVar;
        cm0 cm0Var;
        v4.h0 h0Var;
        int i7 = this.f18139a;
        boolean z10 = true;
        Object obj = this.f18140b;
        switch (i7) {
            case 0:
                y1 y1Var = (y1) obj;
                y1Var.f18150e = editText.getText().toString();
                y1Var.f18147a.f39892g3.O(true);
                y1Var.f18147a.v0(0);
                return;
            case 1:
            default:
                return;
            case 2:
                to toVar = (to) obj;
                if (toVar.f51621e != null) {
                    String obj2 = editText.getText().toString();
                    if (obj2.length() != 0 && (uj0Var = toVar.f51619b) != null) {
                        v4.h0 adapter = uj0Var.getAdapter();
                        so soVar = toVar.f51621e;
                        if (adapter != soVar) {
                            toVar.f51619b.setAdapter(soVar);
                            toVar.f51621e.f();
                            toVar.f51619b.setFastScrollVisible(false);
                            toVar.f51619b.setVerticalScrollBarEnabled(true);
                            toVar.d.b();
                        }
                    }
                    toVar.f51621e.F(obj2);
                    return;
                }
                return;
            case 3:
                qq qqVar = (qq) obj;
                if (qqVar.f50719e != null) {
                    String obj3 = editText.getText().toString();
                    if (qqVar.f50714c.getAdapter() == null) {
                        b10 = 0;
                    } else {
                        b10 = qqVar.f50714c.getAdapter().b();
                    }
                    qqVar.f50719e.F(obj3);
                    if (TextUtils.isEmpty(obj3) && (c1Var = qqVar.f50714c) != null) {
                        v4.h0 adapter2 = c1Var.getAdapter();
                        mq mqVar = qqVar.f50708a;
                        if (adapter2 != mqVar) {
                            di.c1 c1Var2 = qqVar.f50714c;
                            c1Var2.X1 = false;
                            c1Var2.Y1 = 0;
                            c1Var2.setAdapter(mqVar);
                            if (b10 == 0) {
                                qqVar.D0(0);
                            }
                        }
                    }
                    qqVar.D1.setVisibility(8);
                    qqVar.C1.setVisibility(0);
                    return;
                }
                return;
            case 4:
                sq sqVar = (sq) obj;
                sqVar.f51260n = editText.getText().toString();
                v3 v3Var = sqVar.f38880a;
                if (v3Var != null) {
                    v3Var.f39892g3.O(true);
                    return;
                }
                return;
            case 5:
                y7 y7Var = (y7) obj;
                if (editText.length() > 0) {
                    y7Var.f41912u1.E(editText.getText().toString());
                    return;
                }
                y7Var.f41904q1 = false;
                y7Var.f41912u1.E(null);
                return;
            case 6:
                ((dk) obj).E.Y(editText.getText().toString(), false);
                return;
            case 7:
                dl dlVar = (dl) obj;
                g2 g2Var = dlVar.K;
                di.c1 c1Var3 = dlVar.M;
                uj0 uj0Var2 = dlVar.N;
                bl blVar = dlVar.O;
                if (blVar != null) {
                    String obj4 = editText.getText().toString();
                    if (obj4.length() != 0) {
                        dlVar.f33965e0 = true;
                        dlVar.f33987x.setShowSearchProgress(true);
                        c1Var3.setVisibility(8);
                        g2Var.setVisibility(8);
                        if (uj0Var2.getAdapter() != blVar) {
                            uj0Var2.setAdapter(blVar);
                        }
                        uj0Var2.setVisibility(0);
                        dlVar.f33966f0 = blVar.f17023f.isEmpty();
                        dlVar.j0();
                    } else {
                        c1Var3.setVisibility(0);
                        g2Var.setVisibility(0);
                        uj0Var2.setAdapter(null);
                        uj0Var2.setVisibility(8);
                        dlVar.f33980s.setVisibility(8);
                    }
                    blVar.G(obj4);
                    return;
                }
                return;
            case 8:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (contactsActivity.h != null) {
                    String obj5 = editText.getText().toString();
                    contactsActivity.f42537c0 = obj5;
                    if (!obj5.isEmpty()) {
                        contactsActivity.f42556y = true;
                        uj0 uj0Var3 = contactsActivity.d;
                        if (uj0Var3 != null) {
                            uj0Var3.setAdapter(contactsActivity.h);
                            contactsActivity.d.setSectionsType(0);
                            contactsActivity.h.f();
                            contactsActivity.d.setFastScrollVisible(false);
                            contactsActivity.d.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f42536c.e(true, true);
                        contactsActivity.h.G(obj5);
                        return;
                    }
                    contactsActivity.f42556y = false;
                    contactsActivity.h.G(null);
                    uj0 uj0Var4 = contactsActivity.d;
                    if (uj0Var4 != null) {
                        uj0Var4.setAdapter(contactsActivity.f42534b);
                        contactsActivity.d.setSectionsType(1);
                        contactsActivity.d.setFastScrollVisible(true);
                        contactsActivity.d.setVerticalScrollBarEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ts tsVar = (ts) obj;
                String obj6 = editText.getText().toString();
                if (TextUtils.isEmpty(obj6)) {
                    vj vjVar = tsVar.d;
                    vjVar.getClass();
                    vjVar.f40447e = null;
                    tsVar.f51661e = false;
                    tsVar.f51658a.setAdapter(tsVar.f51660c);
                    tsVar.f51658a.setFastScrollVisible(true);
                    return;
                }
                vj vjVar2 = tsVar.d;
                vjVar2.getClass();
                if (obj6 == null) {
                    vjVar2.f40447e = null;
                } else {
                    try {
                        Timer timer = (Timer) vjVar2.h;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    Timer timer2 = new Timer();
                    vjVar2.h = timer2;
                    timer2.schedule(new jg.q1(2, vjVar2, obj6), 100L, 300L);
                }
                if (obj6.length() != 0) {
                    tsVar.f51661e = true;
                    return;
                }
                return;
            case 10:
                cu cuVar = (cu) obj;
                cuVar.f46217a.getActionBar().setSearchFieldText(editText.getText().toString());
                cuVar.f46218b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 11:
                yw ywVar = (yw) obj;
                String obj7 = editText.getText().toString();
                if (!obj7.isEmpty() || (((hwVar = ywVar.D0) != null && (cm0Var = hwVar.f36040e0) != null && cm0Var.M()) || ywVar.f53719v3 || ywVar.L)) {
                    ywVar.f53672m2 = true;
                    if (!ywVar.f53704s3) {
                        ywVar.a5(true, false, true, false);
                    }
                }
                hw hwVar2 = ywVar.D0;
                if (hwVar2 != null) {
                    View currentView = hwVar2.getCurrentView();
                    boolean z11 = !hwVar2.f36043h0;
                    if (!TextUtils.isEmpty(hwVar2.N0)) {
                        z10 = z11;
                    }
                    hwVar2.N0 = obj7;
                    hwVar2.O(currentView, hwVar2.getCurrentPosition(), obj7, z10);
                    return;
                }
                return;
            case 12:
                String obj8 = editText.getText().toString();
                l50 l50Var = (l50) obj;
                k50.E(l50Var.f48845f, obj8);
                boolean isEmpty = TextUtils.isEmpty(obj8);
                boolean z12 = !isEmpty;
                if (z12 != l50Var.N) {
                    l50Var.N = z12;
                    uj0 uj0Var5 = l50Var.d;
                    if (uj0Var5 != null) {
                        if (!isEmpty) {
                            h0Var = l50Var.f48845f;
                        } else {
                            h0Var = l50Var.f48844e;
                        }
                        uj0Var5.setAdapter(h0Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                y50 y50Var = (y50) obj;
                if (editText.length() != 0) {
                    y50Var.f53431y = true;
                    v50 v50Var = y50Var.f53428s;
                    if (!v50Var.h) {
                        v50Var.h = true;
                        v50Var.f();
                    }
                    y50Var.f53428s.E(editText.getText().toString());
                    y50Var.h.setFastScrollVisible(false);
                    y50Var.h.setVerticalScrollBarEnabled(true);
                    y50Var.f53427r.e(true, true);
                    y50Var.f53427r.setStickerType(1);
                    y50Var.f53427r.d.setText(hd.M0(2131748167, null));
                    y50Var.f53427r.f33709e.setText(hd.M0(2131745807, null));
                    return;
                }
                y50.d0(y50Var);
                return;
            case 14:
                String obj9 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj;
                languageSelectActivity.m0(obj9);
                if (obj9.length() != 0) {
                    languageSelectActivity.getClass();
                    uj0 uj0Var6 = languageSelectActivity.f42616b;
                    if (uj0Var6 != null) {
                        uj0Var6.setAdapter(languageSelectActivity.f42617c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f42616b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f42616b.setAdapter(languageSelectActivity.f42615a);
                    return;
                }
                return;
            case 15:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.T != null) {
                    String obj10 = editText.getText().toString();
                    if (obj10.length() != 0) {
                        pa0Var.f50197v0 = true;
                        pa0Var.f50191r.setShowSearchProgress(true);
                        d5 d5Var = pa0Var.W;
                        if (d5Var != null) {
                            d5Var.setVisibility(8);
                        }
                        pa0Var.R.setVisibility(8);
                        pa0Var.P.setVisibility(8);
                        v4.h0 adapter3 = pa0Var.S.getAdapter();
                        bl blVar2 = pa0Var.T;
                        if (adapter3 != blVar2) {
                            pa0Var.S.setAdapter(blVar2);
                        }
                        pa0Var.S.setVisibility(0);
                        if (pa0Var.T.b() != 0) {
                            z10 = false;
                        }
                        pa0Var.f50199w0 = z10;
                    } else {
                        d5 d5Var2 = pa0Var.W;
                        if (d5Var2 != null) {
                            d5Var2.setVisibility(0);
                        }
                        pa0Var.R.setVisibility(0);
                        pa0Var.P.setVisibility(0);
                        pa0Var.S.setAdapter(null);
                        pa0Var.S.setVisibility(8);
                    }
                    pa0Var.L0();
                    pa0Var.M0();
                    pa0Var.T.G(obj10);
                    return;
                }
                return;
            case 16:
                ((z80) ((t6) obj).f3885b).j(editText.getText().toString());
                return;
            case 17:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (notificationsCustomSettingsActivity.d != null) {
                    String obj11 = editText.getText().toString();
                    if (obj11.length() != 0) {
                        notificationsCustomSettingsActivity.getClass();
                        if (notificationsCustomSettingsActivity.f42671a != null) {
                            notificationsCustomSettingsActivity.f42673c.setText(hd.M0(2131748167, "NoResult"));
                            notificationsCustomSettingsActivity.f42673c.b();
                            notificationsCustomSettingsActivity.f42671a.setAdapter(notificationsCustomSettingsActivity.d);
                            notificationsCustomSettingsActivity.d.f();
                            notificationsCustomSettingsActivity.f42671a.setFastScrollVisible(false);
                            notificationsCustomSettingsActivity.f42671a.setVerticalScrollBarEnabled(true);
                        }
                    }
                    notificationsCustomSettingsActivity.d.F(obj11);
                    return;
                }
                return;
            case 18:
                cn0 cn0Var = (cn0) obj;
                cn0Var.f46183a.getActionBar().setSearchFieldText(editText.getText().toString());
                cn0Var.f46184b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 19:
                ((ProfileActivity) obj).f43092e.I(editText.getText().toString().toLowerCase());
                return;
            case 20:
                String obj12 = editText.getText().toString();
                oy0 oy0Var = (oy0) obj;
                if (obj12 == null) {
                    oy0Var.f50065f = null;
                } else {
                    String lowerCase = obj12.trim().toLowerCase();
                    ArrayList arrayList = oy0Var.f50065f;
                    if (arrayList == null) {
                        oy0Var.f50065f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < oy0Var.h.size(); i10++) {
                        v00 v00Var = (v00) oy0Var.h.get(i10);
                        if (v00Var.d.startsWith(lowerCase)) {
                            oy0Var.f50065f.add(0, v00Var);
                        } else if (v00Var.d.contains(lowerCase)) {
                            oy0Var.f50065f.add(v00Var);
                        }
                    }
                    oy0Var.f50063c.f();
                }
                if (obj12.length() != 0) {
                    uj0 uj0Var7 = oy0Var.f50062b;
                    if (uj0Var7 != null) {
                        uj0Var7.setAdapter(oy0Var.f50063c);
                        return;
                    }
                    return;
                } else if (oy0Var.f50062b != null) {
                    oy0Var.d.setVisibility(8);
                    oy0Var.f50062b.setAdapter(oy0Var.f50061a);
                    return;
                } else {
                    return;
                }
            case 21:
                ((k31) obj).f48524f.I(editText.getText().toString());
                return;
            case 22:
                String obj13 = editText.getText().toString();
                q91 q91Var = ((u91) obj).f51875s0;
                if (!q91Var.f50513e0.equals(obj13)) {
                    q91Var.K(q91Var.f41300e[0], q91Var.getCurrentPosition(), obj13, false);
                    return;
                }
                return;
            case 23:
                ((WallpapersListActivity) obj).I.E(editText.getText().toString(), false);
                return;
        }
    }

    private final void q(jg.o0 o0Var) {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
