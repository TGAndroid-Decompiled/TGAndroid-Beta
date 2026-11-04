package lg;

import ai.g5;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ei.d4;
import gi.q4;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.e20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.p2;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tj0;
public final class b1 extends d2 implements cs {
    public boolean E;
    public int F;
    public boolean G;
    public l41 f18238a;
    public b5 f18239b;
    public boolean f18240c;
    public FrameLayout d;
    public y0 f18241e;
    public FrameLayout f18242f;
    public a1 h;
    public np f18243n;
    public d4 f18244r;
    public boolean f18245s;
    public TLRPC.TL_businessLocation f18246w;
    public TLRPC.GeoPoint f18247x;
    public String f18248y;

    public b1() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z10) {
        boolean z11;
        if (this.f18239b != null) {
            this.f18239b.a(a0(), z10);
            l41 l41Var = this.f18238a;
            if (l41Var != null && l41Var.f35594g3 != null) {
                boolean z12 = this.G;
                if (this.f18246w != null && (this.f18247x != null || !TextUtils.isEmpty(this.f18248y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f18238a.f35594g3.O(true);
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
        if (this.f18247x == null && TextUtils.isEmpty(this.f18248y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f18246w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f18247x == null && TextUtils.isEmpty(this.f18248y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f18246w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f18248y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f18247x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f18246w;
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
        if (this.f18239b.f27421y.f53841f) {
            return;
        }
        if (this.f18247x == null && TextUtils.isEmpty(this.f18248y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.f18248y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                p2.APP_ERROR.a();
                y0 y0Var = this.f18241e;
                int i3 = -this.F;
                this.F = i3;
                org.telegram.messenger.g0.G3(i3, y0Var, null);
                return;
            }
        }
        this.f18239b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f18247x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f18247x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f18248y;
            if (b22 != null) {
                b22.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                b22.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f18248y;
                if (this.f18247x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = b22.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f18247x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (b22 != null) {
            b22.flags2 &= -3;
            b22.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new x0(this, 0));
        getMessagesStorage().j2(b22, false);
    }

    public final void c0() {
        f41 f41Var;
        if (this.f18245s) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = b22.business_location;
        this.f18246w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f18247x = tL_businessLocation.geo_point;
            this.f18248y = tL_businessLocation.address;
        } else {
            this.f18247x = null;
            this.f18248y = "";
        }
        y0 y0Var = this.f18241e;
        if (y0Var != null) {
            this.f18240c = true;
            y0Var.setText(this.f18248y);
            y0 y0Var2 = this.f18241e;
            y0Var2.setSelection(y0Var2.getText().length());
            this.f18240c = false;
        }
        d0();
        l41 l41Var = this.f18238a;
        if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
            f41Var.O(true);
        }
        this.f18245s = true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(bd.M0(2131752698, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 16));
        this.f18239b = this.simpleActionBar.n(bd.M0(2131745956, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        y0 y0Var = new y0(this, getParentActivity());
        this.f18241e = y0Var;
        y0Var.setTextSize(1, 17.0f);
        r6.E(this.f18241e, k6.H6, null);
        y0 y0Var2 = this.f18241e;
        int i3 = k6.G6;
        r6.V(y0Var2, i3, null);
        this.f18241e.setBackgroundDrawable(null);
        int i10 = 5;
        this.f18241e.setMaxLines(5);
        this.f18241e.setSingleLine(false);
        this.f18241e.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        y0 y0Var3 = this.f18241e;
        if (!bd.f21784a0) {
            i10 = 3;
        }
        y0Var3.setGravity(i10 | 48);
        this.f18241e.setInputType(180225);
        this.f18241e.setHint(bd.M0(2131752697, null));
        r6.w(this.f18241e, i3, null);
        this.f18241e.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18241e.setCursorWidth(1.5f);
        this.f18241e.addTextChangedListener(new bh.h(this, 10));
        this.f18241e.setFilters(new InputFilter[]{new z0(0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.f18241e, mf.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i11 = k6.f27878d6;
        r6.i(i11, frameLayout3, getResourceProvider());
        y0 y0Var4 = this.f18241e;
        if (y0Var4 != null) {
            this.f18240c = true;
            y0Var4.setText(this.f18248y);
            y0 y0Var5 = this.f18241e;
            y0Var5.setSelection(y0Var5.getText().length());
            this.f18240c = false;
        }
        this.f18244r = new d4(1, context, this);
        jz c2 = t5.c(0.2f, k6.Dc);
        e6 resourceProvider = getResourceProvider();
        c2.f23770m = i3;
        c2.f23772o = resourceProvider;
        c2.f23777t = true;
        c2.f23768k = this.f18244r.getImageReceiver();
        np npVar = new np(c2);
        this.f18243n = npVar;
        npVar.setCallback(this.f18244r);
        r6.i(i11, this.f18244r, getResourceProvider());
        this.h = new a1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f18242f = frameLayout4;
        frameLayout4.addView(this.f18244r, mf.c(-1.0f, -1));
        this.f18242f.addView(this.h, mf.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        l41 l41Var = new l41(this, new q4(this, 20), new w0(this, 0), null);
        this.f18238a = l41Var;
        l41Var.r1();
        this.f18238a.setSectionsDrawBackground(true);
        l41 l41Var2 = this.f18238a;
        l41Var2.f35594g3.f33698r = false;
        frameLayout.addView(l41Var2, mf.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        d4 d4Var;
        int measuredWidth;
        a1 a1Var = this.h;
        if (a1Var != null && (d4Var = this.f18244r) != null) {
            if (this.f18247x != null) {
                a1Var.setAlpha(0.0f);
                this.h.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
                if (this.f18244r.getMeasuredWidth() <= 0) {
                    measuredWidth = org.telegram.messenger.g0.f22608q.x;
                } else {
                    measuredWidth = this.f18244r.getMeasuredWidth();
                }
                float f10 = org.telegram.messenger.g0.f22607p;
                int i3 = (int) (measuredWidth / f10);
                int min = Math.min(2, (int) Math.ceil(f10));
                d4 d4Var2 = this.f18244r;
                TLRPC.GeoPoint geoPoint = this.f18247x;
                d4Var2.p(ac.p(e20.a(geoPoint.lat, geoPoint._long, 0L, min * i3, min * 240, 15, min)), com.google.android.recaptcha.internal.a.h(i3, "_240"), this.f18243n, null);
                return;
            }
            d4Var.setImageBitmap(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.E0) {
            c0();
        }
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f18238a;
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
        if (this.f18247x == null && TextUtils.isEmpty(this.f18248y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a0() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = bd.M0(2131743845, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131752690, null);
                alertDialog$Builder.k(bd.M0(2131754216, null), new w0(this, 1));
                alertDialog$Builder.h(bd.M0(2131747588, null), new w0(this, 2));
                showDialog(s1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
