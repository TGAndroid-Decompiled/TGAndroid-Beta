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
public final class pa6 extends d implements gk7 {
    public boolean E;
    public int F;
    public boolean G;
    public q5c a;
    public sha b;
    public boolean c;
    public FrameLayout d;
    public p32 e;
    public FrameLayout f;
    public ha6 h;
    public ni2 n;
    public kb0 r;
    public boolean s;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public pa6() {
        super(null);
        this.F = -4;
    }

    public final void Y(boolean z) {
        boolean z2;
        if (this.b != null) {
            this.b.a(Z(), z);
            q5c q5cVar = this.a;
            if (q5cVar != null && q5cVar.g3 != null) {
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

    public final boolean Z() {
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

    public final void a0() {
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
            if (!Z()) {
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
                pw0.APP_ERROR.a();
                p32 p32Var = this.e;
                int i = -this.F;
                this.F = i;
                gl.A3(i, p32Var, null);
                return;
            }
        }
        this.b.b(true);
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
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
            if (W1 != null) {
                W1.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                W1.business_location = tL_businessLocation;
                tL_businessLocation.address = this.y;
                if (this.x != null) {
                    tL_businessLocation.flags |= 1;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = W1.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (W1 != null) {
            W1.flags2 &= -3;
            W1.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new ca6(this, (byte) 0));
        getMessagesStorage().g2(W1, false);
    }

    public final void b0() {
        String str;
        l5c l5cVar;
        if (this.s) {
            return;
        }
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
        if (W1 == null) {
            getMessagesController().i3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = W1.business_location;
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
        p32 p32Var = this.e;
        if (p32Var != null) {
            this.c = true;
            p32Var.setText(str);
            p32 p32Var2 = this.e;
            p32Var2.setSelection(p32Var2.getText().length());
            this.c = false;
        }
        c0();
        q5c q5cVar = this.a;
        if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
            l5cVar.O(true);
        }
        this.s = true;
    }

    public final void c0() {
        kb0 kb0Var;
        int measuredWidth;
        ha6 ha6Var = this.h;
        if (ha6Var != null && (kb0Var = this.r) != null) {
            if (this.x != null) {
                ha6Var.setAlpha(0.0f);
                this.h.setTranslationY(-gl.L(12.0f));
                if (this.r.getMeasuredWidth() <= 0) {
                    measuredWidth = gl.q.x;
                } else {
                    measuredWidth = this.r.getMeasuredWidth();
                }
                float f = gl.p;
                int i = (int) (measuredWidth / f);
                int min = Math.min(2, (int) Math.ceil(f));
                kb0 kb0Var2 = this.r;
                TLRPC.GeoPoint geoPoint = this.x;
                kb0Var2.p(gl5.p(usc.a(geoPoint.lat, geoPoint._long, 0L, min * i, min * 240, 15, min)), oo1.n(i, "_240"), this.n, null);
                return;
            }
            kb0Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131752686, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 4));
        this.b = this.simpleActionBar.s(k96.M0(2131745754, null));
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        p32 p32Var = new p32(this, getParentActivity());
        this.e = p32Var;
        p32Var.setTextSize(1, 17.0f);
        zkb.D(this.e, bkb.G6, null);
        p32 p32Var2 = this.e;
        int i = bkb.F6;
        zkb.X(p32Var2, i, null);
        this.e.setBackgroundDrawable(null);
        int i2 = 5;
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, gl.L(42.0f), 0);
        p32 p32Var3 = this.e;
        if (!k96.a0) {
            i2 = 3;
        }
        p32Var3.setGravity(i2 | 48);
        this.e.setInputType(180225);
        this.e.setHint(k96.M0(2131752685, null));
        zkb.v(this.e, i, null);
        this.e.setCursorSize(gl.L(19.0f));
        this.e.setCursorWidth(1.5f);
        this.e.addTextChangedListener(new b7(this, (byte) 26));
        this.e.setFilters(new InputFilter[]{new fa6((byte) 0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, nme.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i3 = bkb.c6;
        zkb.h(i3, getResourceProvider(), frameLayout3);
        p32 p32Var4 = this.e;
        if (p32Var4 != null) {
            this.c = true;
            p32Var4.setText(this.y);
            p32 p32Var5 = this.e;
            p32Var5.setSelection(p32Var5.getText().length());
            this.c = false;
        }
        this.r = new kb0((byte) 6, context, this);
        kcb c = uo3.c(0.2f, bkb.Fc);
        wjb resourceProvider = getResourceProvider();
        c.m = i;
        c.o = resourceProvider;
        c.t = true;
        c.k = this.r.getImageReceiver();
        ni2 ni2Var = new ni2(c);
        this.n = ni2Var;
        ni2Var.setCallback(this.r);
        zkb.h(i3, getResourceProvider(), this.r);
        this.h = new ha6(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, nme.c(-1.0f, -1));
        this.f.addView(this.h, nme.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        c0();
        q5c q5cVar = new q5c(this, new ur4(this, (byte) 14), new w96(this, (byte) 0), null);
        this.a = q5cVar;
        q5cVar.r1();
        this.a.setSectionsDrawBackground(true);
        q5c q5cVar2 = this.a;
        q5cVar2.g3.r = false;
        frameLayout.addView(q5cVar2, nme.c(-1.0f, -1));
        b0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.D0) {
            b0();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Z();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        boolean z2;
        if (this.x == null && TextUtils.isEmpty(this.y)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Z() && !z2) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131743596, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131752678, null);
                alertDialog$Builder.j(k96.M0(2131754213, null), new w96(this, (byte) 1));
                alertDialog$Builder.g(k96.M0(2131747387, null), new w96(this, (byte) 2));
                showDialog(hdVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.D0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.D0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
