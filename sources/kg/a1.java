package kg;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.d4;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m20;
import org.telegram.messenger.p2;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
public final class a1 extends f2 implements ls {
    public boolean D;
    public int E;
    public boolean F;
    public r41 f17301a;
    public c5 f17302b;
    public boolean f17303c;
    public FrameLayout d;
    public x0 f17304e;
    public FrameLayout f17305f;
    public z0 h;
    public np f17306n;
    public d4 f17307r;
    public boolean f17308s;
    public TLRPC.TL_businessLocation f17309w;
    public TLRPC.GeoPoint f17310x;
    public String f17311y;

    public a1() {
        super(null);
        this.E = -4;
    }

    public final void Z(boolean z9) {
        boolean z10;
        if (this.f17302b != null) {
            this.f17302b.a(a0(), z9);
            r41 r41Var = this.f17301a;
            if (r41Var != null && r41Var.f37496f3 != null) {
                boolean z11 = this.F;
                if (this.f17309w != null && (this.f17310x != null || !TextUtils.isEmpty(this.f17311y))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 != z10) {
                    this.f17301a.f37496f3.O(true);
                }
            }
        }
    }

    public final boolean a0() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        TLRPC.GeoPoint geoPoint;
        if (this.f17310x == null && TextUtils.isEmpty(this.f17311y)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f17309w != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            return true;
        }
        if (this.f17310x == null && TextUtils.isEmpty(this.f17311y)) {
            z11 = false;
        } else {
            z11 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f17309w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            return true;
        }
        String str2 = this.f17311y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f17310x;
        if (geoPoint2 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f17309w;
        if (tL_businessLocation2 != null && tL_businessLocation2.geo_point != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 != z14) {
            return true;
        }
        if (geoPoint2 == null || (tL_businessLocation2 != null && (geoPoint = tL_businessLocation2.geo_point) != null && ((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)))) {
            return false;
        }
        return true;
    }

    public final void b0() {
        boolean z9;
        String trim;
        if (this.f17302b.f27380y.f55499f) {
            return;
        }
        if (this.f17310x == null && TextUtils.isEmpty(this.f17311y)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.f17311y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                p2.APP_ERROR.a();
                x0 x0Var = this.f17304e;
                int i7 = -this.E;
                this.E = i7;
                org.telegram.messenger.g0.G3(i7, x0Var, null);
                return;
            }
        }
        this.f17302b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z9) {
            if (this.f17310x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f17310x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f17311y;
            if (b22 != null) {
                b22.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                b22.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f17311y;
                if (this.f17310x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = b22.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f17310x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (b22 != null) {
            b22.flags2 &= -3;
            b22.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new w0(this, 0));
        getMessagesStorage().j2(b22, false);
    }

    public final void c0() {
        m41 m41Var;
        if (this.f17308s) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = b22.business_location;
        this.f17309w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f17310x = tL_businessLocation.geo_point;
            this.f17311y = tL_businessLocation.address;
        } else {
            this.f17310x = null;
            this.f17311y = "";
        }
        x0 x0Var = this.f17304e;
        if (x0Var != null) {
            this.f17303c = true;
            x0Var.setText(this.f17311y);
            x0 x0Var2 = this.f17304e;
            x0Var2.setSelection(x0Var2.getText().length());
            this.f17303c = false;
        }
        d0();
        r41 r41Var = this.f17301a;
        if (r41Var != null && (m41Var = r41Var.f37496f3) != null) {
            m41Var.O(true);
        }
        this.f17308s = true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(id.M0(2131752698, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 15));
        this.f17302b = this.simpleActionBar.p(id.M0(2131745946, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        x0 x0Var = new x0(this, getParentActivity());
        this.f17304e = x0Var;
        x0Var.setTextSize(1, 17.0f);
        t6.D(this.f17304e, m6.H6, null);
        x0 x0Var2 = this.f17304e;
        int i7 = m6.G6;
        t6.U(x0Var2, i7, null);
        this.f17304e.setBackgroundDrawable(null);
        int i10 = 5;
        this.f17304e.setMaxLines(5);
        this.f17304e.setSingleLine(false);
        this.f17304e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        x0 x0Var3 = this.f17304e;
        if (!id.f23161a0) {
            i10 = 3;
        }
        x0Var3.setGravity(i10 | 48);
        this.f17304e.setInputType(180225);
        this.f17304e.setHint(id.M0(2131752697, null));
        t6.v(this.f17304e, i7, null);
        this.f17304e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f17304e.setCursorWidth(1.5f);
        this.f17304e.addTextChangedListener(new ah.j(this, 10));
        this.f17304e.setFilters(new InputFilter[]{new y0(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.f17304e, ha.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i11 = m6.f27890d6;
        t6.h(i11, frameLayout3, getResourceProvider());
        x0 x0Var4 = this.f17304e;
        if (x0Var4 != null) {
            this.f17303c = true;
            x0Var4.setText(this.f17311y);
            x0 x0Var5 = this.f17304e;
            x0Var5.setSelection(x0Var5.getText().length());
            this.f17303c = false;
        }
        this.f17307r = new d4(1, context, this);
        rz c10 = t5.c(0.2f, m6.Dc);
        h6 resourceProvider = getResourceProvider();
        c10.f25393m = i7;
        c10.f25395o = resourceProvider;
        c10.f25400t = true;
        c10.f25391k = this.f17307r.getImageReceiver();
        np npVar = new np(c10);
        this.f17306n = npVar;
        npVar.setCallback(this.f17307r);
        t6.h(i11, this.f17307r, getResourceProvider());
        this.h = new z0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f17305f = frameLayout4;
        frameLayout4.addView(this.f17307r, ha.c(-1.0f, -1));
        this.f17305f.addView(this.h, ha.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        r41 r41Var = new r41(this, new hi.u1(this, 10), new v0(this, 0), null);
        this.f17301a = r41Var;
        r41Var.r1();
        this.f17301a.setSectionsDrawBackground(true);
        r41 r41Var2 = this.f17301a;
        r41Var2.f37496f3.f35845r = false;
        frameLayout.addView(r41Var2, ha.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        d4 d4Var;
        int measuredWidth;
        z0 z0Var = this.h;
        if (z0Var != null && (d4Var = this.f17307r) != null) {
            if (this.f17310x != null) {
                z0Var.setAlpha(0.0f);
                this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                if (this.f17307r.getMeasuredWidth() <= 0) {
                    measuredWidth = org.telegram.messenger.g0.f22567q.x;
                } else {
                    measuredWidth = this.f17307r.getMeasuredWidth();
                }
                float f10 = org.telegram.messenger.g0.f22566p;
                int i7 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                d4 d4Var2 = this.f17307r;
                TLRPC.GeoPoint geoPoint = this.f17310x;
                d4Var2.p(hc.p(m20.a(geoPoint.lat, geoPoint._long, 0L, min * i7, min * 240, 15, min)), com.google.android.recaptcha.internal.a.i(i7, "_240"), this.f17306n, null);
                return;
            }
            d4Var.setImageBitmap(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.E0) {
            c0();
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17301a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !a0();
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        boolean z10;
        if (this.f17310x == null && TextUtils.isEmpty(this.f17311y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (a0() && !z10) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = id.M0(2131743835, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131752690, null);
                alertDialog$Builder.k(id.M0(2131754216, null), new v0(this, 1));
                alertDialog$Builder.h(id.M0(2131747580, null), new v0(this, 2));
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
