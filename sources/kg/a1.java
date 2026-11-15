package kg;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import fi.v3;
import hi.q4;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.k20;
import org.telegram.messenger.ns;
import org.telegram.messenger.p2;
import org.telegram.messenger.pz;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vp;
public final class a1 extends e2 implements is {
    public boolean E;
    public int F;
    public boolean G;
    public u41 f17860a;
    public z4 f17861b;
    public boolean f17862c;
    public FrameLayout d;
    public x0 f17863e;
    public FrameLayout f17864f;
    public z0 h;
    public vp f17865n;
    public v3 f17866r;
    public boolean f17867s;
    public TLRPC.TL_businessLocation f17868w;
    public TLRPC.GeoPoint f17869x;
    public String f17870y;

    public a1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        boolean z11;
        if (this.f17861b != null) {
            this.f17861b.a(a0(), z10);
            u41 u41Var = this.f17860a;
            if (u41Var != null && u41Var.f39892g3 != null) {
                boolean z12 = this.G;
                if (this.f17868w != null && (this.f17869x != null || !TextUtils.isEmpty(this.f17870y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f17860a.f39892g3.O(true);
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
        if (this.f17869x == null && TextUtils.isEmpty(this.f17870y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f17868w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f17869x == null && TextUtils.isEmpty(this.f17870y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f17868w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f17870y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f17869x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f17868w;
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
        if (this.f17861b.f29950y.f57086f) {
            return;
        }
        if (this.f17869x == null && TextUtils.isEmpty(this.f17870y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.f17870y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                p2.APP_ERROR.a();
                x0 x0Var = this.f17863e;
                int i7 = -this.F;
                this.F = i7;
                org.telegram.messenger.g0.F3(i7, x0Var, null);
                return;
            }
        }
        this.f17861b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f17869x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f17869x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f17870y;
            if (b22 != null) {
                b22.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                b22.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f17870y;
                if (this.f17869x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = b22.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f17869x;
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
        p41 p41Var;
        if (this.f17867s) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = b22.business_location;
        this.f17868w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f17869x = tL_businessLocation.geo_point;
            this.f17870y = tL_businessLocation.address;
        } else {
            this.f17869x = null;
            this.f17870y = "";
        }
        x0 x0Var = this.f17863e;
        if (x0Var != null) {
            this.f17862c = true;
            x0Var.setText(this.f17870y);
            x0 x0Var2 = this.f17863e;
            x0Var2.setSelection(x0Var2.getText().length());
            this.f17862c = false;
        }
        d0();
        u41 u41Var = this.f17860a;
        if (u41Var != null && (p41Var = u41Var.f39892g3) != null) {
            p41Var.O(true);
        }
        this.f17867s = true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.M0(2131752698, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 8));
        this.f17861b = this.simpleActionBar.q(hd.M0(2131745946, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        x0 x0Var = new x0(this, getParentActivity());
        this.f17863e = x0Var;
        x0Var.setTextSize(1, 17.0f);
        q6.D(this.f17863e, j6.H6, null);
        x0 x0Var2 = this.f17863e;
        int i7 = j6.G6;
        q6.U(x0Var2, i7, null);
        this.f17863e.setBackgroundDrawable(null);
        int i10 = 5;
        this.f17863e.setMaxLines(5);
        this.f17863e.setSingleLine(false);
        this.f17863e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        x0 x0Var3 = this.f17863e;
        if (!hd.f24104a0) {
            i10 = 3;
        }
        x0Var3.setGravity(i10 | 48);
        this.f17863e.setInputType(180225);
        this.f17863e.setHint(hd.M0(2131752697, null));
        q6.v(this.f17863e, i7, null);
        this.f17863e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f17863e.setCursorWidth(1.5f);
        this.f17863e.addTextChangedListener(new ah.j(this, 11));
        this.f17863e.setFilters(new InputFilter[]{new y0(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.f17863e, ja.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i11 = j6.f28849d6;
        q6.h(i11, frameLayout3, getResourceProvider());
        x0 x0Var4 = this.f17863e;
        if (x0Var4 != null) {
            this.f17862c = true;
            x0Var4.setText(this.f17870y);
            x0 x0Var5 = this.f17863e;
            x0Var5.setSelection(x0Var5.getText().length());
            this.f17862c = false;
        }
        this.f17866r = new v3(1, context, this);
        pz c10 = t5.c(0.2f, j6.Gc);
        e6 resourceProvider = getResourceProvider();
        c10.f26036m = i7;
        c10.f26038o = resourceProvider;
        c10.f26043t = true;
        c10.f26034k = this.f17866r.getImageReceiver();
        vp vpVar = new vp(c10);
        this.f17865n = vpVar;
        vpVar.setCallback(this.f17866r);
        q6.h(i11, this.f17866r, getResourceProvider());
        this.h = new z0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f17864f = frameLayout4;
        frameLayout4.addView(this.f17866r, ja.c(-1.0f, -1));
        this.f17864f.addView(this.h, ja.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        u41 u41Var = new u41(this, new q4(this, 12), new v0(this, 0), null);
        this.f17860a = u41Var;
        u41Var.r1();
        this.f17860a.setSectionsDrawBackground(true);
        u41 u41Var2 = this.f17860a;
        u41Var2.f39892g3.f38199r = false;
        frameLayout.addView(u41Var2, ja.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        v3 v3Var;
        int measuredWidth;
        z0 z0Var = this.h;
        if (z0Var != null && (v3Var = this.f17866r) != null) {
            if (this.f17869x != null) {
                z0Var.setAlpha(0.0f);
                this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                if (this.f17866r.getMeasuredWidth() <= 0) {
                    measuredWidth = org.telegram.messenger.g0.f23611q.x;
                } else {
                    measuredWidth = this.f17866r.getMeasuredWidth();
                }
                float f10 = org.telegram.messenger.g0.f23610p;
                int i7 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                v3 v3Var2 = this.f17866r;
                TLRPC.GeoPoint geoPoint = this.f17869x;
                v3Var2.p(gc.p(k20.a(geoPoint.lat, geoPoint._long, 0L, min * i7, min * 240, 15, min)), com.google.android.gms.internal.vision.e2.i(i7, "_240"), this.f17865n, null);
                return;
            }
            v3Var.setImageBitmap(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.E0) {
            c0();
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f17860a;
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
        if (this.f17869x == null && TextUtils.isEmpty(this.f17870y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a0() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743835, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131752690, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new v0(this, 1));
                alertDialog$Builder.h(hd.M0(2131747580, null), new v0(this, 2));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
