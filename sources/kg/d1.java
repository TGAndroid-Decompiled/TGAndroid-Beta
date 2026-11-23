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
import hi.e7;
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
public final class d1 extends g2 implements gs {
    public boolean E;
    public int F;
    public boolean G;
    public h51 f18274a;
    public c5 f18275b;
    public boolean f18276c;
    public FrameLayout d;
    public a1 f18277e;
    public FrameLayout f18278f;
    public c1 h;
    public eq f18279n;
    public t3 f18280r;
    public boolean f18281s;
    public TLRPC.TL_businessLocation f18282w;
    public TLRPC.GeoPoint f18283x;
    public String f18284y;

    public d1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        boolean z11;
        if (this.f18275b != null) {
            this.f18275b.a(a0(), z10);
            h51 h51Var = this.f18274a;
            if (h51Var != null && h51Var.f35742g3 != null) {
                boolean z12 = this.G;
                if (this.f18282w != null && (this.f18283x != null || !TextUtils.isEmpty(this.f18284y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f18274a.f35742g3.O(true);
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
        if (this.f18283x == null && TextUtils.isEmpty(this.f18284y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f18282w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f18283x == null && TextUtils.isEmpty(this.f18284y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f18282w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f18284y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f18283x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f18282w;
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
        if (this.f18275b.f28825y.f57666f) {
            return;
        }
        if (this.f18283x == null && TextUtils.isEmpty(this.f18284y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.f18284y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                q2.APP_ERROR.a();
                a1 a1Var = this.f18277e;
                int i7 = -this.F;
                this.F = i7;
                org.telegram.messenger.g0.E3(i7, a1Var, null);
                return;
            }
        }
        this.f18275b.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f18283x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f18283x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f18284y;
            if (d2 != null) {
                d2.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                d2.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f18284y;
                if (this.f18283x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = d2.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f18283x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (d2 != null) {
            d2.flags2 &= -3;
            d2.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new z0(this, 0));
        getMessagesStorage().j2(d2, false);
    }

    public final void c0() {
        c51 c51Var;
        if (this.f18281s) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = d2.business_location;
        this.f18282w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f18283x = tL_businessLocation.geo_point;
            this.f18284y = tL_businessLocation.address;
        } else {
            this.f18283x = null;
            this.f18284y = "";
        }
        a1 a1Var = this.f18277e;
        if (a1Var != null) {
            this.f18276c = true;
            a1Var.setText(this.f18284y);
            a1 a1Var2 = this.f18277e;
            a1Var2.setSelection(a1Var2.getText().length());
            this.f18276c = false;
        }
        d0();
        h51 h51Var = this.f18274a;
        if (h51Var != null && (c51Var = h51Var.f35742g3) != null) {
            c51Var.O(true);
        }
        this.f18281s = true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.N0(2131752686, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 10));
        this.f18275b = this.simpleActionBar.s(hd.N0(2131745750, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a1 a1Var = new a1(this, getParentActivity());
        this.f18277e = a1Var;
        a1Var.setTextSize(1, 17.0f);
        t6.D(this.f18277e, m6.H6, null);
        a1 a1Var2 = this.f18277e;
        int i7 = m6.G6;
        t6.U(a1Var2, i7, null);
        this.f18277e.setBackgroundDrawable(null);
        int i10 = 5;
        this.f18277e.setMaxLines(5);
        this.f18277e.setSingleLine(false);
        this.f18277e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        a1 a1Var3 = this.f18277e;
        if (!hd.f24408a0) {
            i10 = 3;
        }
        a1Var3.setGravity(i10 | 48);
        this.f18277e.setInputType(180225);
        this.f18277e.setHint(hd.N0(2131752685, null));
        t6.v(this.f18277e, i7, null);
        this.f18277e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18277e.setCursorWidth(1.5f);
        this.f18277e.addTextChangedListener(new ah.j(this, 12));
        this.f18277e.setFilters(new InputFilter[]{new b1(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.f18277e, na.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i11 = m6.f29347d6;
        t6.h(i11, frameLayout3, getResourceProvider());
        a1 a1Var4 = this.f18277e;
        if (a1Var4 != null) {
            this.f18276c = true;
            a1Var4.setText(this.f18284y);
            a1 a1Var5 = this.f18277e;
            a1Var5.setSelection(a1Var5.getText().length());
            this.f18276c = false;
        }
        this.f18280r = new t3(1, context, this);
        mz c10 = u5.c(0.2f, m6.Gc);
        h6 resourceProvider = getResourceProvider();
        c10.f25663m = i7;
        c10.f25665o = resourceProvider;
        c10.f25670t = true;
        c10.f25661k = this.f18280r.getImageReceiver();
        eq eqVar = new eq(c10);
        this.f18279n = eqVar;
        eqVar.setCallback(this.f18280r);
        t6.h(i11, this.f18280r, getResourceProvider());
        this.h = new c1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f18278f = frameLayout4;
        frameLayout4.addView(this.f18280r, na.c(-1.0f, -1));
        this.f18278f.addView(this.h, na.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        h51 h51Var = new h51(this, new e7(this, 12), new y0(this, 0), null);
        this.f18274a = h51Var;
        h51Var.r1();
        this.f18274a.setSectionsDrawBackground(true);
        h51 h51Var2 = this.f18274a;
        h51Var2.f35742g3.f34026r = false;
        frameLayout.addView(h51Var2, na.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        t3 t3Var;
        int measuredWidth;
        c1 c1Var = this.h;
        if (c1Var != null && (t3Var = this.f18280r) != null) {
            if (this.f18283x != null) {
                c1Var.setAlpha(0.0f);
                this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                if (this.f18280r.getMeasuredWidth() <= 0) {
                    measuredWidth = org.telegram.messenger.g0.f24010q.x;
                } else {
                    measuredWidth = this.f18280r.getMeasuredWidth();
                }
                float f10 = org.telegram.messenger.g0.f24009p;
                int i7 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                t3 t3Var2 = this.f18280r;
                TLRPC.GeoPoint geoPoint = this.f18283x;
                t3Var2.p(gc.p(i20.a(geoPoint.lat, geoPoint._long, 0L, min * i7, min * 240, 15, min)), e2.i(i7, "_240"), this.f18279n, null);
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
        return this.f18274a;
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
        if (this.f18283x == null && TextUtils.isEmpty(this.f18284y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a0() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = hd.N0(2131743592, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131752678, null);
                alertDialog$Builder.k(hd.N0(2131754213, null), new y0(this, 1));
                alertDialog$Builder.h(hd.N0(2131747386, null), new y0(this, 2));
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
