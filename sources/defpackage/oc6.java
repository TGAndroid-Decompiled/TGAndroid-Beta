package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class oc6 extends d implements jm7 {
    public boolean E;
    public int F;
    public boolean G;
    public q7c a;
    public uja b;
    public boolean c;
    public FrameLayout d;
    public a52 e;
    public FrameLayout f;
    public gc6 h;
    public bk2 n;
    public kc0 r;
    public boolean s;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public oc6() {
        super(null);
        this.F = -4;
    }

    public final void Z(boolean z) {
        boolean z2;
        if (this.b != null) {
            this.b.a(a0(), z);
            q7c q7cVar = this.a;
            if (q7cVar != null && q7cVar.g3 != null) {
                boolean z3 = this.G;
                if (this.w != null && (this.x != null || !TextUtils.isEmpty(this.y))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 != z2) {
                    this.a.g3.O(true);
                }
            }
        }
    }

    public final boolean a0() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        boolean z5;
        boolean z6;
        TLRPC.GeoPoint geoPoint;
        if (this.x == null && TextUtils.isEmpty(this.y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.w != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return true;
        }
        if (this.x == null && TextUtils.isEmpty(this.y)) {
            z3 = false;
        } else {
            z3 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return true;
        }
        String str2 = this.y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.x;
        if (geoPoint2 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w;
        if (tL_businessLocation2 != null && tL_businessLocation2.geo_point != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return true;
        }
        if (geoPoint2 == null || (tL_businessLocation2 != null && (geoPoint = tL_businessLocation2.geo_point) != null && ((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)))) {
            return false;
        }
        return true;
    }

    public final void b0() {
        boolean z;
        String trim;
        if (this.b.y.f) {
            return;
        }
        if (this.x == null && TextUtils.isEmpty(this.y)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!a0()) {
                finishFragment();
                return;
            }
            String str = this.y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                xx0.APP_ERROR.a();
                a52 a52Var = this.e;
                int i = -this.F;
                this.F = i;
                gm.A3(i, a52Var, null);
                return;
            }
        }
        this.b.b(true);
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z) {
            if (this.x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.y;
            if (X1 != null) {
                X1.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                X1.business_location = tL_businessLocation;
                tL_businessLocation.address = this.y;
                if (this.x != null) {
                    tL_businessLocation.flags |= 1;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = X1.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (X1 != null) {
            X1.flags2 &= -3;
            X1.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new bc6(this, (byte) 0));
        getMessagesStorage().g2(X1, false);
    }

    public final void c0() {
        String str;
        l7c l7cVar;
        if (this.s) {
            return;
        }
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        if (X1 == null) {
            getMessagesController().k3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = X1.business_location;
        this.w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.x = tL_businessLocation.geo_point;
            str = tL_businessLocation.address;
            this.y = str;
        } else {
            this.x = null;
            str = "";
            this.y = "";
        }
        a52 a52Var = this.e;
        if (a52Var != null) {
            this.c = true;
            a52Var.setText(str);
            a52 a52Var2 = this.e;
            a52Var2.setSelection(a52Var2.getText().length());
            this.c = false;
        }
        d0();
        q7c q7cVar = this.a;
        if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
            l7cVar.O(true);
        }
        this.s = true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131752651, null));
        int i = 5;
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 5));
        this.b = this.simpleActionBar.s(jb6.M0(2131745680, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a52 a52Var = new a52(this, getParentActivity());
        this.e = a52Var;
        a52Var.setTextSize(1, 17.0f);
        anb.D(this.e, cmb.G6, null);
        a52 a52Var2 = this.e;
        int i2 = cmb.F6;
        anb.X(a52Var2, i2, null);
        this.e.setBackgroundDrawable(null);
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, gm.L(42.0f), 0);
        a52 a52Var3 = this.e;
        if (!jb6.a0) {
            i = 3;
        }
        a52Var3.setGravity(i | 48);
        this.e.setInputType(180225);
        this.e.setHint(jb6.M0(2131752650, null));
        anb.v(this.e, i2, null);
        this.e.setCursorSize(gm.L(19.0f));
        this.e.setCursorWidth(1.5f);
        this.e.addTextChangedListener(new b7(this, (byte) 27));
        this.e.setFilters(new InputFilter[]{new ec6((byte) 0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, qoe.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i3 = cmb.c6;
        anb.h(i3, getResourceProvider(), frameLayout3);
        a52 a52Var4 = this.e;
        if (a52Var4 != null) {
            this.c = true;
            a52Var4.setText(this.y);
            a52 a52Var5 = this.e;
            a52Var5.setSelection(a52Var5.getText().length());
            this.c = false;
        }
        this.r = new kc0((byte) 6, context, this);
        meb c = eq3.c(0.2f, cmb.Fc);
        ylb resourceProvider = getResourceProvider();
        c.m = i2;
        c.o = resourceProvider;
        c.t = true;
        c.k = this.r.getImageReceiver();
        bk2 bk2Var = new bk2(c);
        this.n = bk2Var;
        bk2Var.setCallback(this.r);
        anb.h(i3, getResourceProvider(), this.r);
        this.h = new gc6(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, qoe.c(-1.0f, -1));
        this.f.addView(this.h, qoe.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        d0();
        q7c q7cVar = new q7c(this, new vt4(this, (byte) 14), new vb6(this, (byte) 0), null);
        this.a = q7cVar;
        q7cVar.r1();
        this.a.setSectionsDrawBackground(true);
        q7c q7cVar2 = this.a;
        q7cVar2.g3.r = false;
        frameLayout.addView(q7cVar2, qoe.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        kc0 kc0Var;
        int measuredWidth;
        gc6 gc6Var = this.h;
        if (gc6Var != null && (kc0Var = this.r) != null) {
            if (this.x != null) {
                gc6Var.setAlpha(0.0f);
                this.h.setTranslationY(-gm.L(12.0f));
                if (this.r.getMeasuredWidth() <= 0) {
                    measuredWidth = gm.q.x;
                } else {
                    measuredWidth = this.r.getMeasuredWidth();
                }
                float f = gm.p;
                int i = (int) (measuredWidth / f);
                int min = Math.min(2, (int) Math.ceil(f));
                kc0 kc0Var2 = this.r;
                TLRPC.GeoPoint geoPoint = this.x;
                kc0Var2.p(gn5.p(vuc.a(geoPoint.lat, geoPoint._long, 0L, min * i, min * 240, 15, min)), aq1.n(i, "_240"), this.n, null);
                return;
            }
            kc0Var.setImageBitmap(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.E0) {
            c0();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
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
    public final boolean onBackPressed(boolean z) {
        boolean z2;
        if (this.x == null && TextUtils.isEmpty(this.y)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a0() && !z2) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131743522, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131752643, null);
                alertDialog$Builder.j(jb6.M0(2131754181, null), new vb6(this, (byte) 1));
                alertDialog$Builder.g(jb6.M0(2131747313, null), new vb6(this, (byte) 2));
                showDialog(heVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
