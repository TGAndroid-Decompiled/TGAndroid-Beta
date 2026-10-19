package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import ci.k4;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.t61;
import w7.z5;
public final class d1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public boolean G;
    public b71 f12854a;
    public as f12855b;
    public org.telegram.ui.ActionBar.u0 f12856c;
    public boolean d;
    public FrameLayout e;
    public a1 f12857f;
    public FrameLayout h;
    public c1 f12858n;
    public oq f12859r;
    public k4 f12860s;
    public boolean v;
    public TLRPC.TL_businessLocation f12861w;
    public TLRPC.GeoPoint f12862x;
    public String f12863y;

    public d1() {
        super(null);
        this.F = -4;
    }

    public final void U(boolean z10) {
        float f7;
        float f10;
        boolean z11;
        float f11;
        float f12;
        if (this.f12856c != null) {
            boolean V = V();
            this.f12856c.setEnabled(V);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f12856c.animate();
                if (V) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (V) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f12);
                if (V) {
                    f13 = 1.0f;
                }
                scaleX.scaleY(f13).setDuration(180L).start();
            } else {
                org.telegram.ui.ActionBar.u0 u0Var = this.f12856c;
                if (V) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f12856c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f12856c;
                if (V) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            b71 b71Var = this.f12854a;
            if (b71Var != null && b71Var.W2 != null) {
                boolean z12 = this.G;
                if (this.f12861w != null && (this.f12862x != null || !TextUtils.isEmpty(this.f12863y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f12854a.W2.N(true);
                }
            }
        }
    }

    public final boolean V() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        boolean z14;
        boolean z15;
        TLRPC.GeoPoint geoPoint;
        if (this.f12862x == null && TextUtils.isEmpty(this.f12863y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f12861w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f12862x == null && TextUtils.isEmpty(this.f12863y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f12861w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f12863y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f12862x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f12861w;
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

    public final void W() {
        boolean z10;
        String trim;
        if (this.f12855b.f24691c > 0.0f) {
            return;
        }
        if (this.f12862x == null && TextUtils.isEmpty(this.f12863y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f12863y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                a1 a1Var = this.f12857f;
                int i10 = -this.F;
                this.F = i10;
                AndroidUtilities.shakeViewSpring(a1Var, i10);
                return;
            }
        }
        this.f12855b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f12862x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f12862x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f12863y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f12863y;
                if (this.f12862x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f12862x;
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

    public final void X() {
        t61 t61Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f12861w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f12862x = tL_businessLocation.geo_point;
            this.f12863y = tL_businessLocation.address;
        } else {
            this.f12862x = null;
            this.f12863y = "";
        }
        a1 a1Var = this.f12857f;
        if (a1Var != null) {
            this.d = true;
            a1Var.setText(this.f12863y);
            a1 a1Var2 = this.f12857f;
            a1Var2.setSelection(a1Var2.getText().length());
            this.d = false;
        }
        Y();
        b71 b71Var = this.f12854a;
        if (b71Var != null && (t61Var = b71Var.W2) != null) {
            t61Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        k4 k4Var;
        int measuredWidth;
        c1 c1Var = this.f12858n;
        if (c1Var != null && (k4Var = this.f12860s) != null) {
            if (this.f12862x != null) {
                c1Var.setAlpha(0.0f);
                this.f12858n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f12860s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f12860s.getMeasuredWidth();
                }
                float f7 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                k4 k4Var2 = this.f12860s;
                TLRPC.GeoPoint geoPoint = this.f12862x;
                k4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a1.g.m(i10, "_240"), this.f12859r, null);
                return;
            }
            k4Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 15));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f21324v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f12855b = new as(mutate, new dq(h6.x0(null, i10, false)));
        this.f12856c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12855b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20931a7, false));
        a1 a1Var = new a1(this, getParentActivity());
        this.f12857f = a1Var;
        a1Var.setTextSize(1, 17.0f);
        this.f12857f.setHintTextColor(h6.x0(null, h6.H6, false));
        a1 a1Var2 = this.f12857f;
        int i11 = h6.G6;
        a1Var2.setTextColor(h6.x0(null, i11, false));
        this.f12857f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f12857f.setMaxLines(5);
        this.f12857f.setSingleLine(false);
        this.f12857f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        a1 a1Var3 = this.f12857f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        a1Var3.setGravity(i12 | 48);
        this.f12857f.setInputType(180225);
        this.f12857f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f12857f.setCursorColor(h6.x0(null, i11, false));
        this.f12857f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f12857f.setCursorWidth(1.5f);
        this.f12857f.addTextChangedListener(new ai.u(this, 4));
        this.f12857f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f12857f, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i13 = h6.f20989d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        a1 a1Var4 = this.f12857f;
        if (a1Var4 != null) {
            this.d = true;
            a1Var4.setText(this.f12863y);
            a1 a1Var5 = this.f12857f;
            a1Var5.setSelection(a1Var5.getText().length());
            this.d = false;
        }
        this.f12860s = new k4(this, context, 1);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, h6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f12860s.getImageReceiver());
        oq oqVar = new oq(svgThumb);
        this.f12859r = oqVar;
        oqVar.setCallback(this.f12860s);
        this.f12860s.setBackgroundColor(getThemedColor(i13));
        this.f12858n = new c1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f12860s, z5.c(-1.0f, -1));
        this.h.addView(this.f12858n, z5.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        b71 b71Var = new b71(this, new hg.o(this, 7), new y0(this, 0), null);
        this.f12854a = b71Var;
        b71Var.p1();
        b71 b71Var2 = this.f12854a;
        b71Var2.W2.f30438r = false;
        frameLayout.addView(b71Var2, z5.c(-1.0f, -1));
        this.actionBar.A(this.f12854a, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            X();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !V();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11;
        if (this.f12862x == null && TextUtils.isEmpty(this.f12863y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (V() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new y0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new y0(this, 2));
                showDialog(alertDialog$Builder.f20604a);
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f12854a.setPadding(0, 0, 0, i13);
        this.f12854a.setClipToPadding(false);
    }
}
