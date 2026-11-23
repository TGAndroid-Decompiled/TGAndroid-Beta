package kg;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import fi.t3;
import hi.d7;
import org.telegram.messenger.gc;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.q2;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.h51;
public final class c1 extends g2 implements gs {
    public boolean E;
    public int F;
    public boolean G;
    public h51 f18304a;
    public c5 f18305b;
    public boolean f18306c;
    public FrameLayout d;
    public z0 f18307e;
    public FrameLayout f18308f;
    public b1 h;
    public eq f18309n;
    public t3 f18310r;
    public boolean f18311s;
    public TLRPC.TL_businessLocation f18312w;
    public TLRPC.GeoPoint f18313x;
    public String f18314y;

    public c1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        boolean z11;
        if (this.f18305b != null) {
            this.f18305b.a(a0(), z10);
            h51 h51Var = this.f18304a;
            if (h51Var != null && h51Var.f35789g3 != null) {
                boolean z12 = this.G;
                if (this.f18312w != null && (this.f18313x != null || !TextUtils.isEmpty(this.f18314y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f18304a.f35789g3.O(true);
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
        if (this.f18313x == null && TextUtils.isEmpty(this.f18314y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f18312w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f18313x == null && TextUtils.isEmpty(this.f18314y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f18312w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f18314y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f18313x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f18312w;
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
        if (this.f18305b.f28859y.f57701f) {
            return;
        }
        if (this.f18313x == null && TextUtils.isEmpty(this.f18314y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.f18314y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                q2.APP_ERROR.a();
                z0 z0Var = this.f18307e;
                int i7 = -this.F;
                this.F = i7;
                org.telegram.messenger.g0.E3(i7, z0Var, null);
                return;
            }
        }
        this.f18305b.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f18313x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f18313x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f18314y;
            if (d2 != null) {
                d2.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                d2.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f18314y;
                if (this.f18313x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = d2.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f18313x;
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
        c51 c51Var;
        if (this.f18311s) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = d2.business_location;
        this.f18312w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f18313x = tL_businessLocation.geo_point;
            this.f18314y = tL_businessLocation.address;
        } else {
            this.f18313x = null;
            this.f18314y = "";
        }
        z0 z0Var = this.f18307e;
        if (z0Var != null) {
            this.f18306c = true;
            z0Var.setText(this.f18314y);
            z0 z0Var2 = this.f18307e;
            z0Var2.setSelection(z0Var2.getText().length());
            this.f18306c = false;
        }
        d0();
        h51 h51Var = this.f18304a;
        if (h51Var != null && (c51Var = h51Var.f35789g3) != null) {
            c51Var.O(true);
        }
        this.f18311s = true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.N0(2131752686, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 10));
        this.f18305b = this.simpleActionBar.s(hd.N0(2131745750, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        z0 z0Var = new z0(this, getParentActivity());
        this.f18307e = z0Var;
        z0Var.setTextSize(1, 17.0f);
        t6.D(this.f18307e, m6.H6, null);
        z0 z0Var2 = this.f18307e;
        int i7 = m6.G6;
        t6.U(z0Var2, i7, null);
        this.f18307e.setBackgroundDrawable(null);
        int i10 = 5;
        this.f18307e.setMaxLines(5);
        this.f18307e.setSingleLine(false);
        this.f18307e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        z0 z0Var3 = this.f18307e;
        if (!hd.f24444a0) {
            i10 = 3;
        }
        z0Var3.setGravity(i10 | 48);
        this.f18307e.setInputType(180225);
        this.f18307e.setHint(hd.N0(2131752685, null));
        t6.v(this.f18307e, i7, null);
        this.f18307e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18307e.setCursorWidth(1.5f);
        this.f18307e.addTextChangedListener(new ah.j(this, 12));
        this.f18307e.setFilters(new InputFilter[]{new a1(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.f18307e, ma.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i11 = m6.f29381d6;
        t6.h(i11, frameLayout3, getResourceProvider());
        z0 z0Var4 = this.f18307e;
        if (z0Var4 != null) {
            this.f18306c = true;
            z0Var4.setText(this.f18314y);
            z0 z0Var5 = this.f18307e;
            z0Var5.setSelection(z0Var5.getText().length());
            this.f18306c = false;
        }
        this.f18310r = new t3(1, context, this);
        mz c10 = u5.c(0.2f, m6.Gc);
        h6 resourceProvider = getResourceProvider();
        c10.f25699m = i7;
        c10.f25701o = resourceProvider;
        c10.f25706t = true;
        c10.f25697k = this.f18310r.getImageReceiver();
        eq eqVar = new eq(c10);
        this.f18309n = eqVar;
        eqVar.setCallback(this.f18310r);
        t6.h(i11, this.f18310r, getResourceProvider());
        this.h = new b1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f18308f = frameLayout4;
        frameLayout4.addView(this.f18310r, ma.c(-1.0f, -1));
        this.f18308f.addView(this.h, ma.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        h51 h51Var = new h51(this, new d7(this, 12), new x0(this, 0), null);
        this.f18304a = h51Var;
        h51Var.r1();
        this.f18304a.setSectionsDrawBackground(true);
        h51 h51Var2 = this.f18304a;
        h51Var2.f35789g3.f34062r = false;
        frameLayout.addView(h51Var2, ma.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        t3 t3Var;
        int measuredWidth;
        b1 b1Var = this.h;
        if (b1Var != null && (t3Var = this.f18310r) != null) {
            if (this.f18313x != null) {
                b1Var.setAlpha(0.0f);
                this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                if (this.f18310r.getMeasuredWidth() <= 0) {
                    measuredWidth = org.telegram.messenger.g0.f24046q.x;
                } else {
                    measuredWidth = this.f18310r.getMeasuredWidth();
                }
                float f10 = org.telegram.messenger.g0.f24045p;
                int i7 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                t3 t3Var2 = this.f18310r;
                TLRPC.GeoPoint geoPoint = this.f18313x;
                t3Var2.p(gc.p(i20.a(geoPoint.lat, geoPoint._long, 0L, min * i7, min * 240, 15, min)), e2.i(i7, "_240"), this.f18309n, null);
                return;
            }
            t3Var.setImageBitmap(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.E0) {
            c0();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18304a;
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
        if (this.f18313x == null && TextUtils.isEmpty(this.f18314y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a0() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = hd.N0(2131743590, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131752678, null);
                alertDialog$Builder.k(hd.N0(2131754213, null), new x0(this, 1));
                alertDialog$Builder.h(hd.N0(2131747386, null), new x0(this, 2));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ls.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
