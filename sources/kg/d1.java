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
import hi.e7;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.q2;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.z41;
public final class d1 extends h2 implements fs {
    public boolean E;
    public int F;
    public boolean G;
    public e51 f18279a;
    public d5 f18280b;
    public boolean f18281c;
    public FrameLayout d;
    public a1 f18282e;
    public FrameLayout f18283f;
    public c1 h;
    public cq f18284n;
    public t3 f18285r;
    public boolean f18286s;
    public TLRPC.TL_businessLocation f18287w;
    public TLRPC.GeoPoint f18288x;
    public String f18289y;

    public d1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        boolean z11;
        if (this.f18280b != null) {
            this.f18280b.a(a0(), z10);
            e51 e51Var = this.f18279a;
            if (e51Var != null && e51Var.f34607g3 != null) {
                boolean z12 = this.G;
                if (this.f18287w != null && (this.f18288x != null || !TextUtils.isEmpty(this.f18289y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f18279a.f34607g3.O(true);
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
        if (this.f18288x == null && TextUtils.isEmpty(this.f18289y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f18287w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f18288x == null && TextUtils.isEmpty(this.f18289y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f18287w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f18289y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f18288x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f18287w;
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
        if (this.f18280b.f28873y.f57658f) {
            return;
        }
        if (this.f18288x == null && TextUtils.isEmpty(this.f18289y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.f18289y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                q2.APP_ERROR.a();
                a1 a1Var = this.f18282e;
                int i7 = -this.F;
                this.F = i7;
                org.telegram.messenger.g0.E3(i7, a1Var, null);
                return;
            }
        }
        this.f18280b.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f18288x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f18288x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f18289y;
            if (d2 != null) {
                d2.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                d2.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f18289y;
                if (this.f18288x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = d2.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f18288x;
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
        z41 z41Var;
        if (this.f18286s) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = d2.business_location;
        this.f18287w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f18288x = tL_businessLocation.geo_point;
            this.f18289y = tL_businessLocation.address;
        } else {
            this.f18288x = null;
            this.f18289y = "";
        }
        a1 a1Var = this.f18282e;
        if (a1Var != null) {
            this.f18281c = true;
            a1Var.setText(this.f18289y);
            a1 a1Var2 = this.f18282e;
            a1Var2.setSelection(a1Var2.getText().length());
            this.f18281c = false;
        }
        d0();
        e51 e51Var = this.f18279a;
        if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
            z41Var.O(true);
        }
        this.f18286s = true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(gd.M0(2131752687, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 10));
        this.f18280b = this.simpleActionBar.s(gd.M0(2131745751, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a1 a1Var = new a1(this, getParentActivity());
        this.f18282e = a1Var;
        a1Var.setTextSize(1, 17.0f);
        u6.D(this.f18282e, n6.H6, null);
        a1 a1Var2 = this.f18282e;
        int i7 = n6.G6;
        u6.U(a1Var2, i7, null);
        this.f18282e.setBackgroundDrawable(null);
        int i10 = 5;
        this.f18282e.setMaxLines(5);
        this.f18282e.setSingleLine(false);
        this.f18282e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        a1 a1Var3 = this.f18282e;
        if (!gd.f24216a0) {
            i10 = 3;
        }
        a1Var3.setGravity(i10 | 48);
        this.f18282e.setInputType(180225);
        this.f18282e.setHint(gd.M0(2131752686, null));
        u6.v(this.f18282e, i7, null);
        this.f18282e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18282e.setCursorWidth(1.5f);
        this.f18282e.addTextChangedListener(new ah.j(this, 12));
        this.f18282e.setFilters(new InputFilter[]{new b1(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.f18282e, ma.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i11 = n6.f29396d6;
        u6.h(i11, frameLayout3, getResourceProvider());
        a1 a1Var4 = this.f18282e;
        if (a1Var4 != null) {
            this.f18281c = true;
            a1Var4.setText(this.f18289y);
            a1 a1Var5 = this.f18282e;
            a1Var5.setSelection(a1Var5.getText().length());
            this.f18281c = false;
        }
        this.f18285r = new t3(1, context, this);
        lz c10 = u5.c(0.2f, n6.Gc);
        i6 resourceProvider = getResourceProvider();
        c10.f25495m = i7;
        c10.f25497o = resourceProvider;
        c10.f25502t = true;
        c10.f25493k = this.f18285r.getImageReceiver();
        cq cqVar = new cq(c10);
        this.f18284n = cqVar;
        cqVar.setCallback(this.f18285r);
        u6.h(i11, this.f18285r, getResourceProvider());
        this.h = new c1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f18283f = frameLayout4;
        frameLayout4.addView(this.f18285r, ma.c(-1.0f, -1));
        this.f18283f.addView(this.h, ma.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        e51 e51Var = new e51(this, new e7(this, 12), new y0(this, 0), null);
        this.f18279a = e51Var;
        e51Var.r1();
        this.f18279a.setSectionsDrawBackground(true);
        e51 e51Var2 = this.f18279a;
        e51Var2.f34607g3.f42809r = false;
        frameLayout.addView(e51Var2, ma.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        t3 t3Var;
        int measuredWidth;
        c1 c1Var = this.h;
        if (c1Var != null && (t3Var = this.f18285r) != null) {
            if (this.f18288x != null) {
                c1Var.setAlpha(0.0f);
                this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                if (this.f18285r.getMeasuredWidth() <= 0) {
                    measuredWidth = org.telegram.messenger.g0.f24121q.x;
                } else {
                    measuredWidth = this.f18285r.getMeasuredWidth();
                }
                float f10 = org.telegram.messenger.g0.f24120p;
                int i7 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                t3 t3Var2 = this.f18285r;
                TLRPC.GeoPoint geoPoint = this.f18288x;
                t3Var2.p(fc.p(h20.a(geoPoint.lat, geoPoint._long, 0L, min * i7, min * 240, 15, min)), e2.i(i7, "_240"), this.f18284n, null);
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
    public final ck0 getListViewForSimpleGlass() {
        return this.f18279a;
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
        if (this.f18288x == null && TextUtils.isEmpty(this.f18289y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a0() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = gd.M0(2131743598, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131752679, null);
                alertDialog$Builder.k(gd.M0(2131754214, null), new y0(this, 1));
                alertDialog$Builder.h(gd.M0(2131747387, null), new y0(this, 2));
                showDialog(u1Var);
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
