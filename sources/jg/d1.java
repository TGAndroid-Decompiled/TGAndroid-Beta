package jg;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import di.k4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.r71;
public final class d1 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public boolean F;
    public r71 f15666a;
    public u5 f15667b;
    public boolean f15668c;
    public FrameLayout d;
    public a1 e;
    public FrameLayout f15669f;
    public c1 h;
    public qq f15670n;
    public k4 f15671r;
    public boolean f15672s;
    public TLRPC.TL_businessLocation v;
    public TLRPC.GeoPoint f15673w;
    public String f15674x;
    public boolean f15675y;

    public d1() {
        super(null);
        this.E = -4;
    }

    public final void V(boolean z10) {
        boolean z11;
        if (this.f15667b != null) {
            this.f15667b.a(W(), z10);
            r71 r71Var = this.f15666a;
            if (r71Var != null && r71Var.f32150g3 != null) {
                boolean z12 = this.F;
                if (this.v != null && (this.f15673w != null || !TextUtils.isEmpty(this.f15674x))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f15666a.f32150g3.O(true);
                }
            }
        }
    }

    public final boolean W() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        boolean z14;
        boolean z15;
        TLRPC.GeoPoint geoPoint;
        if (this.f15673w == null && TextUtils.isEmpty(this.f15674x)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.v != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f15673w == null && TextUtils.isEmpty(this.f15674x)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.v;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f15674x;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f15673w;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.v;
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

    public final void X() {
        boolean z10;
        String trim;
        if (this.f15667b.f23137x.f19327f) {
            return;
        }
        if (this.f15673w == null && TextUtils.isEmpty(this.f15674x)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!W()) {
                finishFragment();
                return;
            }
            String str = this.f15674x;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                a1 a1Var = this.e;
                int i10 = -this.E;
                this.E = i10;
                AndroidUtilities.shakeViewSpring(a1Var, i10);
                return;
            }
        }
        this.f15667b.b(true);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f15673w != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f15673w;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f15674x;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f15674x;
                if (this.f15673w != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f15673w;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new z0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void Y() {
        j71 j71Var;
        if (this.f15672s) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.v = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f15673w = tL_businessLocation.geo_point;
            this.f15674x = tL_businessLocation.address;
        } else {
            this.f15673w = null;
            this.f15674x = "";
        }
        a1 a1Var = this.e;
        if (a1Var != null) {
            this.f15668c = true;
            a1Var.setText(this.f15674x);
            a1 a1Var2 = this.e;
            a1Var2.setSelection(a1Var2.getText().length());
            this.f15668c = false;
        }
        Z();
        r71 r71Var = this.f15666a;
        if (r71Var != null && (j71Var = r71Var.f32150g3) != null) {
            j71Var.O(true);
        }
        this.f15672s = true;
    }

    public final void Z() {
        k4 k4Var;
        int measuredWidth;
        c1 c1Var = this.h;
        if (c1Var != null && (k4Var = this.f15671r) != null) {
            if (this.f15673w != null) {
                c1Var.setAlpha(0.0f);
                this.h.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f15671r.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f15671r.getMeasuredWidth();
                }
                float f7 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                k4 k4Var2 = this.f15671r;
                TLRPC.GeoPoint geoPoint = this.f15673w;
                k4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a1.g.m(i10, "_240"), this.f15670n, null);
                return;
            }
            k4Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 15));
        this.f15667b = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a1 a1Var = new a1(this, getParentActivity());
        this.e = a1Var;
        a1Var.setTextSize(1, 17.0f);
        f7.E(this.e, y6.H6, null);
        a1 a1Var2 = this.e;
        int i10 = y6.G6;
        f7.V(a1Var2, i10, null);
        this.e.setBackgroundDrawable(null);
        int i11 = 5;
        this.e.setMaxLines(5);
        this.e.setSingleLine(false);
        this.e.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        a1 a1Var3 = this.e;
        if (!LocaleController.isRTL) {
            i11 = 3;
        }
        a1Var3.setGravity(i11 | 48);
        this.e.setInputType(180225);
        this.e.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        f7.w(this.e, i10, null);
        this.e.setCursorSize(AndroidUtilities.dp(19.0f));
        this.e.setCursorWidth(1.5f);
        this.e.addTextChangedListener(new bi.u(this, 4));
        this.e.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.addView(this.e, gb1.h(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.d;
        int i12 = y6.f23354d6;
        f7.i(i12, frameLayout3, getResourceProvider());
        a1 a1Var4 = this.e;
        if (a1Var4 != null) {
            this.f15668c = true;
            a1Var4.setText(this.f15674x);
            a1 a1Var5 = this.e;
            a1Var5.setSelection(a1Var5.getText().length());
            this.f15668c = false;
        }
        this.f15671r = new k4(this, context, 1);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, y6.Pb, 0.2f);
        svgThumb.setColorKey(i10, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f15671r.getImageReceiver());
        qq qqVar = new qq(svgThumb);
        this.f15670n = qqVar;
        qqVar.setCallback(this.f15671r);
        f7.i(i12, this.f15671r, getResourceProvider());
        this.h = new c1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f15669f = frameLayout4;
        frameLayout4.addView(this.f15671r, gb1.g(-1.0f, -1));
        this.f15669f.addView(this.h, gb1.h(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Z();
        r71 r71Var = new r71(this, new hi.e2(this, 10), new y0(this, 0), null);
        this.f15666a = r71Var;
        r71Var.u1();
        this.f15666a.setSectionsDrawBackground(true);
        r71 r71Var2 = this.f15666a;
        r71Var2.f32150g3.f29505r = false;
        frameLayout.addView(r71Var2, gb1.g(-1.0f, -1));
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            Y();
        }
    }

    @Override
    public final mm0 getListViewForSimpleGlass() {
        return this.f15666a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !W();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11;
        if (this.f15673w == null && TextUtils.isEmpty(this.f15674x)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (W() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new y0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new y0(this, 2));
                showDialog(alertDialog$Builder.f22366a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
