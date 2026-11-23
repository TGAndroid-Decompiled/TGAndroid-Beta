package kg;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import com.google.android.gms.internal.vision.e2;
import fi.t3;
import hi.y7;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.g20;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.q2;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
public final class c1 extends g2 implements fs {
    public boolean E;
    public int F;
    public boolean G;
    public g51 f18366a;
    public c5 f18367b;
    public boolean f18368c;
    public FrameLayout d;
    public z0 f18369e;
    public FrameLayout f18370f;
    public b1 h;
    public bq f18371n;
    public t3 f18372r;
    public boolean f18373s;
    public TLRPC.TL_businessLocation f18374w;
    public TLRPC.GeoPoint f18375x;
    public String f18376y;

    public c1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        boolean z11;
        if (this.f18367b != null) {
            this.f18367b.a(a0(), z10);
            g51 g51Var = this.f18366a;
            if (g51Var != null && g51Var.f35323g3 != null) {
                boolean z12 = this.G;
                if (this.f18374w != null && (this.f18375x != null || !TextUtils.isEmpty(this.f18376y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f18366a.f35323g3.O(true);
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
        if (this.f18375x == null && TextUtils.isEmpty(this.f18376y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f18374w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f18375x == null && TextUtils.isEmpty(this.f18376y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f18374w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f18376y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f18375x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f18374w;
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
        if (this.f18367b.f28920y.f57780f) {
            return;
        }
        if (this.f18375x == null && TextUtils.isEmpty(this.f18376y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.f18376y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                q2.APP_ERROR.a();
                z0 z0Var = this.f18369e;
                int i7 = -this.F;
                this.F = i7;
                org.telegram.messenger.g0.E3(i7, z0Var, null);
                return;
            }
        }
        this.f18367b.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f18375x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f18375x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f18376y;
            if (d2 != null) {
                d2.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                d2.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f18376y;
                if (this.f18375x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = d2.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f18375x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (d2 != null) {
            d2.flags2 &= -3;
            d2.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new y0(this, 0));
        getMessagesStorage().j2(d2, false);
    }

    public final void c0() {
        b51 b51Var;
        if (this.f18373s) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = d2.business_location;
        this.f18374w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f18375x = tL_businessLocation.geo_point;
            this.f18376y = tL_businessLocation.address;
        } else {
            this.f18375x = null;
            this.f18376y = "";
        }
        z0 z0Var = this.f18369e;
        if (z0Var != null) {
            this.f18368c = true;
            z0Var.setText(this.f18376y);
            z0 z0Var2 = this.f18369e;
            z0Var2.setSelection(z0Var2.getText().length());
            this.f18368c = false;
        }
        d0();
        g51 g51Var = this.f18366a;
        if (g51Var != null && (b51Var = g51Var.f35323g3) != null) {
            b51Var.O(true);
        }
        this.f18373s = true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(gd.N0(2131752686, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 10));
        this.f18367b = this.simpleActionBar.s(gd.N0(2131745750, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        z0 z0Var = new z0(this, getParentActivity());
        this.f18369e = z0Var;
        z0Var.setTextSize(1, 17.0f);
        u6.D(this.f18369e, n6.H6, null);
        z0 z0Var2 = this.f18369e;
        int i7 = n6.G6;
        u6.U(z0Var2, i7, null);
        this.f18369e.setBackgroundDrawable(null);
        int i10 = 5;
        this.f18369e.setMaxLines(5);
        this.f18369e.setSingleLine(false);
        this.f18369e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        z0 z0Var3 = this.f18369e;
        if (!gd.f24314a0) {
            i10 = 3;
        }
        z0Var3.setGravity(i10 | 48);
        this.f18369e.setInputType(180225);
        this.f18369e.setHint(gd.N0(2131752685, null));
        u6.v(this.f18369e, i7, null);
        this.f18369e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18369e.setCursorWidth(1.5f);
        this.f18369e.addTextChangedListener(new ah.j(this, 12));
        this.f18369e.setFilters(new InputFilter[]{new a1(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.f18369e, na.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i11 = n6.f29451d6;
        u6.h(i11, frameLayout3, getResourceProvider());
        z0 z0Var4 = this.f18369e;
        if (z0Var4 != null) {
            this.f18368c = true;
            z0Var4.setText(this.f18376y);
            z0 z0Var5 = this.f18369e;
            z0Var5.setSelection(z0Var5.getText().length());
            this.f18368c = false;
        }
        this.f18372r = new t3(1, context, this);
        kz c10 = u5.c(0.2f, n6.Gc);
        i6 resourceProvider = getResourceProvider();
        c10.f25416m = i7;
        c10.f25418o = resourceProvider;
        c10.f25423t = true;
        c10.f25414k = this.f18372r.getImageReceiver();
        bq bqVar = new bq(c10);
        this.f18371n = bqVar;
        bqVar.setCallback(this.f18372r);
        u6.h(i11, this.f18372r, getResourceProvider());
        this.h = new b1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f18370f = frameLayout4;
        frameLayout4.addView(this.f18372r, na.c(-1.0f, -1));
        this.f18370f.addView(this.h, na.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        g51 g51Var = new g51(this, new y7(this, 12), new x0(this, 0), null);
        this.f18366a = g51Var;
        g51Var.r1();
        this.f18366a.setSectionsDrawBackground(true);
        g51 g51Var2 = this.f18366a;
        g51Var2.f35323g3.f33631r = false;
        frameLayout.addView(g51Var2, na.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        t3 t3Var;
        int measuredWidth;
        b1 b1Var = this.h;
        if (b1Var != null && (t3Var = this.f18372r) != null) {
            if (this.f18375x != null) {
                b1Var.setAlpha(0.0f);
                this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                if (this.f18372r.getMeasuredWidth() <= 0) {
                    measuredWidth = org.telegram.messenger.g0.f24226q.x;
                } else {
                    measuredWidth = this.f18372r.getMeasuredWidth();
                }
                float f10 = org.telegram.messenger.g0.f24225p;
                int i7 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                t3 t3Var2 = this.f18372r;
                TLRPC.GeoPoint geoPoint = this.f18375x;
                t3Var2.p(fc.p(g20.a(geoPoint.lat, geoPoint._long, 0L, min * i7, min * 240, 15, min)), e2.i(i7, "_240"), this.f18371n, null);
                return;
            }
            t3Var.setImageBitmap(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.E0) {
            c0();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18366a;
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
        if (this.f18375x == null && TextUtils.isEmpty(this.f18376y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a0() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = gd.N0(2131743588, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131752678, null);
                alertDialog$Builder.k(gd.N0(2131754213, null), new x0(this, 1));
                alertDialog$Builder.h(gd.N0(2131747386, null), new x0(this, 2));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
