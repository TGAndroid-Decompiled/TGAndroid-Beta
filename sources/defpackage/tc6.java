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
import org.telegram.ui.ActionBar.e;
public final class tc6 extends e implements fn7 {
    public boolean E;
    public int F;
    public boolean G;
    public q9c a;
    public nla b;
    public boolean c;
    public FrameLayout d;
    public f42 e;
    public FrameLayout f;
    public lc6 h;
    public jj2 n;
    public mb0 r;
    public boolean s;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public tc6() {
        super(null);
        this.F = -4;
    }

    public final void Y(boolean z) {
        boolean z2;
        if (this.b != null) {
            this.b.a(Z(), z);
            q9c q9cVar = this.a;
            if (q9cVar != null && q9cVar.g3 != null) {
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
                yw0.APP_ERROR.a();
                f42 f42Var = this.e;
                int i = -this.F;
                this.F = i;
                hl.A3(i, f42Var, null);
                return;
            }
        }
        this.b.b(true);
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
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
            if (Y1 != null) {
                Y1.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                Y1.business_location = tL_businessLocation;
                tL_businessLocation.address = this.y;
                if (this.x != null) {
                    tL_businessLocation.flags |= 1;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = Y1.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (Y1 != null) {
            Y1.flags2 &= -3;
            Y1.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new gc6(this, (byte) 0));
        getMessagesStorage().g2(Y1, false);
    }

    public final void b0() {
        String str;
        l9c l9cVar;
        if (this.s) {
            return;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (Y1 == null) {
            getMessagesController().o3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = Y1.business_location;
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
        f42 f42Var = this.e;
        if (f42Var != null) {
            this.c = true;
            f42Var.setText(str);
            f42 f42Var2 = this.e;
            f42Var2.setSelection(f42Var2.getText().length());
            this.c = false;
        }
        c0();
        q9c q9cVar = this.a;
        if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
            l9cVar.O(true);
        }
        this.s = true;
    }

    public final void c0() {
        mb0 mb0Var;
        int measuredWidth;
        lc6 lc6Var = this.h;
        if (lc6Var != null && (mb0Var = this.r) != null) {
            if (this.x != null) {
                lc6Var.setAlpha(0.0f);
                this.h.setTranslationY(-hl.L(12.0f));
                if (this.r.getMeasuredWidth() <= 0) {
                    measuredWidth = hl.q.x;
                } else {
                    measuredWidth = this.r.getMeasuredWidth();
                }
                float f = hl.p;
                int i = (int) (measuredWidth / f);
                int min = Math.min(2, (int) Math.ceil(f));
                mb0 mb0Var2 = this.r;
                TLRPC.GeoPoint geoPoint = this.x;
                mb0Var2.p(jn5.p(jxc.a(geoPoint.lat, geoPoint._long, 0L, min * i, min * 240, 15, min)), bp1.n(i, "_240"), this.n, null);
                return;
            }
            mb0Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131752679, null));
        int i = 5;
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 5));
        this.b = this.simpleActionBar.u(ob6.M0(2131745674, null));
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        f42 f42Var = new f42(this, getParentActivity());
        this.e = f42Var;
        f42Var.setTextSize(1, 17.0f);
        yob.D(this.e, aob.H6, null);
        f42 f42Var2 = this.e;
        int i2 = aob.G6;
        yob.X(f42Var2, i2, null);
        this.e.setBackgroundDrawable(null);
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, hl.L(42.0f), 0);
        f42 f42Var3 = this.e;
        if (!ob6.a0) {
            i = 3;
        }
        f42Var3.setGravity(i | 48);
        this.e.setInputType(180225);
        this.e.setHint(ob6.M0(2131752678, null));
        yob.v(this.e, i2, null);
        this.e.setCursorSize(hl.L(19.0f));
        this.e.setCursorWidth(1.5f);
        this.e.addTextChangedListener(new c7(this, (byte) 26));
        this.e.setFilters(new InputFilter[]{new jc6((byte) 0)});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, tre.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i3 = aob.d6;
        yob.h(i3, getResourceProvider(), frameLayout3);
        f42 f42Var4 = this.e;
        if (f42Var4 != null) {
            this.c = true;
            f42Var4.setText(this.y);
            f42 f42Var5 = this.e;
            f42Var5.setSelection(f42Var5.getText().length());
            this.c = false;
        }
        this.r = new mb0((byte) 6, context, this);
        ggb c = lp3.c(0.2f, aob.Gc);
        vnb resourceProvider = getResourceProvider();
        c.m = i2;
        c.o = resourceProvider;
        c.t = true;
        c.k = this.r.getImageReceiver();
        jj2 jj2Var = new jj2(c);
        this.n = jj2Var;
        jj2Var.setCallback(this.r);
        yob.h(i3, getResourceProvider(), this.r);
        this.h = new lc6(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f = frameLayout4;
        frameLayout4.addView(this.r, tre.c(-1.0f, -1));
        this.f.addView(this.h, tre.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        c0();
        q9c q9cVar = new q9c(this, new yt4(this, (byte) 14), new zb6(this, (byte) 0), null);
        this.a = q9cVar;
        q9cVar.s1();
        this.a.setSectionsDrawBackground(true);
        q9c q9cVar2 = this.a;
        q9cVar2.g3.r = false;
        frameLayout.addView(q9cVar2, tre.c(-1.0f, -1));
        b0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.E0) {
            b0();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
                String M0 = ob6.M0(2131743490, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131752671, null);
                alertDialog$Builder.j(ob6.M0(2131754209, null), new zb6(this, (byte) 1));
                alertDialog$Builder.g(ob6.M0(2131747307, null), new zb6(this, (byte) 2));
                showDialog(idVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
