package ag;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.at;
import org.telegram.messenger.c30;
import org.telegram.messenger.d00;
import org.telegram.messenger.dd;
import org.telegram.messenger.jc;
import org.telegram.messenger.v5;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.v51;
import w7.b6;
public final class f2 extends org.telegram.ui.ActionBar.k2 implements vs {
    public boolean D;
    public int E;
    public boolean F;
    public v51 f515a;
    public l5 f516b;
    public boolean f517c;
    public FrameLayout d;
    public a2 e;
    public FrameLayout f518f;
    public e2 h;
    public up f519n;
    public d2 f520r;
    public boolean f521s;
    public TLRPC.TL_businessLocation f522w;
    public TLRPC.GeoPoint f523x;
    public String f524y;

    public f2() {
        super(null);
        this.E = -4;
    }

    public final void Z(boolean z10) {
        boolean z11;
        if (this.f516b != null) {
            this.f516b.a(a0(), z10);
            v51 v51Var = this.f515a;
            if (v51Var != null && v51Var.f31183f3 != null) {
                boolean z12 = this.F;
                if (this.f522w != null && (this.f523x != null || !TextUtils.isEmpty(this.f524y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f515a.f31183f3.O(true);
                }
            }
        }
    }

    public final boolean a0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        boolean z14;
        boolean z15;
        TLRPC.GeoPoint geoPoint;
        if (this.f523x == null && TextUtils.isEmpty(this.f524y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f522w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f523x == null && TextUtils.isEmpty(this.f524y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f522w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f524y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f523x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f522w;
        if (tL_businessLocation2 != null && tL_businessLocation2.geo_point != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 != z15) {
            return true;
        }
        if (geoPoint2 == null || (tL_businessLocation2 != null && (geoPoint = tL_businessLocation2.geo_point) != null && ((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)))) {
            return false;
        }
        return true;
    }

    public final void b0() {
        boolean z10;
        String trim;
        if (this.f516b.f20548y.f7022f) {
            return;
        }
        if (this.f523x == null && TextUtils.isEmpty(this.f524y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.f524y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                org.telegram.messenger.t2.APP_ERROR.a();
                a2 a2Var = this.e;
                int i10 = -this.E;
                this.E = i10;
                org.telegram.messenger.i0.F3(i10, a2Var, null);
                return;
            }
        }
        this.f516b.b(true);
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f523x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f523x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f524y;
            if (a2 != null) {
                a2.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                a2.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f524y;
                if (this.f523x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = a2.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f523x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (a2 != null) {
            a2.flags2 &= -3;
            a2.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new z1(this, 0));
        getMessagesStorage().j2(a2, false);
    }

    public final void c0() {
        q51 q51Var;
        if (this.f521s) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = a2.business_location;
        this.f522w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f523x = tL_businessLocation.geo_point;
            this.f524y = tL_businessLocation.address;
        } else {
            this.f523x = null;
            this.f524y = "";
        }
        a2 a2Var = this.e;
        if (a2Var != null) {
            this.f517c = true;
            a2Var.setText(this.f524y);
            a2 a2Var2 = this.e;
            a2Var2.setSelection(a2Var2.getText().length());
            this.f517c = false;
        }
        d0();
        v51 v51Var = this.f515a;
        if (v51Var != null && (q51Var = v51Var.f31183f3) != null) {
            q51Var.O(true);
        }
        this.f521s = true;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(dd.L0(2131752698, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 4));
        this.f516b = this.simpleActionBar.n(dd.L0(2131745963, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a2 a2Var = new a2(this, getParentActivity());
        this.e = a2Var;
        a2Var.setTextSize(1, 17.0f);
        a7.E(this.e, t6.H6, null);
        a2 a2Var2 = this.e;
        int i11 = t6.G6;
        a7.V(a2Var2, i11, null);
        this.e.setBackgroundDrawable(null);
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, org.telegram.messenger.i0.L(42.0f), 0);
        a2 a2Var3 = this.e;
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        a2Var3.setGravity(i10 | 48);
        this.e.setInputType(180225);
        this.e.setHint(dd.L0(2131752697, null));
        a7.w(this.e, i11, null);
        this.e.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        this.e.setCursorWidth(1.5f);
        this.e.addTextChangedListener(new a1(this, 2));
        this.e.setFilters(new InputFilter[]{new b2(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, b6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i12 = t6.f20930d6;
        a7.i(i12, frameLayout3, getResourceProvider());
        a2 a2Var4 = this.e;
        if (a2Var4 != null) {
            this.f517c = true;
            a2Var4.setText(this.f524y);
            a2 a2Var5 = this.e;
            a2Var5.setSelection(a2Var5.getText().length());
            this.f517c = false;
        }
        this.f520r = new d2(this, context, 0);
        d00 c10 = v5.c(0.2f, t6.Dc);
        p6 resourceProvider = getResourceProvider();
        c10.f15270m = i11;
        c10.f15272o = resourceProvider;
        c10.f15277t = true;
        c10.f15268k = this.f520r.getImageReceiver();
        up upVar = new up(c10);
        this.f519n = upVar;
        upVar.setCallback(this.f520r);
        a7.i(i12, this.f520r, getResourceProvider());
        this.h = new e2(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f518f = frameLayout4;
        frameLayout4.addView(this.f520r, b6.c(-1.0f, -1));
        this.f518f.addView(this.h, b6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        v51 v51Var = new v51(this, new a(this, 5), new y1(this, 0), null);
        this.f515a = v51Var;
        v51Var.r1();
        this.f515a.setSectionsDrawBackground(true);
        v51 v51Var2 = this.f515a;
        v51Var2.f31183f3.f29638r = false;
        frameLayout.addView(v51Var2, b6.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        d2 d2Var;
        int measuredWidth;
        e2 e2Var = this.h;
        if (e2Var != null && (d2Var = this.f520r) != null) {
            if (this.f523x != null) {
                e2Var.setAlpha(0.0f);
                this.h.setTranslationY(-org.telegram.messenger.i0.L(12.0f));
                if (this.f520r.getMeasuredWidth() <= 0) {
                    measuredWidth = org.telegram.messenger.i0.f16172q.x;
                } else {
                    measuredWidth = this.f520r.getMeasuredWidth();
                }
                float f7 = org.telegram.messenger.i0.f16171p;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                d2 d2Var2 = this.f520r;
                TLRPC.GeoPoint geoPoint = this.f523x;
                d2Var2.p(jc.p(c30.a(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a1.g.k(i10, "_240"), this.f519n, null);
                return;
            }
            d2Var.setImageBitmap(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.E0) {
            c0();
        }
    }

    @Override
    public final uk0 getListViewForSimpleGlass() {
        return this.f515a;
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
    public final boolean onBackPressed(boolean z10) {
        boolean z11;
        if (this.f523x == null && TextUtils.isEmpty(this.f524y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a0() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = dd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = dd.L0(2131752690, null);
                alertDialog$Builder.k(dd.L0(2131754216, null), new y1(this, 1));
                alertDialog$Builder.h(dd.L0(2131747596, null), new y1(this, 2));
                showDialog(x1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
