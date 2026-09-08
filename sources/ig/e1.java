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
import bi.i5;
import di.i2;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.v51;
import w7.x5;
public final class e1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public boolean G;
    public d61 f12067a;
    public or f12068b;
    public org.telegram.ui.ActionBar.v0 f12069c;
    public boolean d;
    public FrameLayout f12070e;
    public b1 f12071f;
    public FrameLayout h;
    public d1 f12072n;
    public dq f12073r;
    public i5 f12074s;
    public boolean v;
    public TLRPC.TL_businessLocation f12075w;
    public TLRPC.GeoPoint f12076x;
    public String f12077y;

    public e1() {
        super(null);
        this.F = -4;
    }

    public final void U(boolean z10) {
        float f7;
        float f10;
        boolean z11;
        float f11;
        float f12;
        if (this.f12069c != null) {
            boolean V = V();
            this.f12069c.setEnabled(V);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f12069c.animate();
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
                org.telegram.ui.ActionBar.v0 v0Var = this.f12069c;
                if (V) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.v0 v0Var2 = this.f12069c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                v0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.v0 v0Var3 = this.f12069c;
                if (V) {
                    f13 = 1.0f;
                }
                v0Var3.setScaleY(f13);
            }
            d61 d61Var = this.f12067a;
            if (d61Var != null && d61Var.Y2 != null) {
                boolean z12 = this.G;
                if (this.f12075w != null && (this.f12076x != null || !TextUtils.isEmpty(this.f12077y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f12067a.Y2.N(true);
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
        if (this.f12076x == null && TextUtils.isEmpty(this.f12077y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f12075w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f12076x == null && TextUtils.isEmpty(this.f12077y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f12075w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f12077y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f12076x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f12075w;
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
        if (this.f12068b.f29198c > 0.0f) {
            return;
        }
        if (this.f12076x == null && TextUtils.isEmpty(this.f12077y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f12077y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                b1 b1Var = this.f12071f;
                int i10 = -this.F;
                this.F = i10;
                AndroidUtilities.shakeViewSpring(b1Var, i10);
                return;
            }
        }
        this.f12068b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f12076x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f12076x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f12077y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f12077y;
                if (this.f12076x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f12076x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new a1(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        v51 v51Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f12075w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f12076x = tL_businessLocation.geo_point;
            this.f12077y = tL_businessLocation.address;
        } else {
            this.f12076x = null;
            this.f12077y = "";
        }
        b1 b1Var = this.f12071f;
        if (b1Var != null) {
            this.d = true;
            b1Var.setText(this.f12077y);
            b1 b1Var2 = this.f12071f;
            b1Var2.setSelection(b1Var2.getText().length());
            this.d = false;
        }
        Y();
        d61 d61Var = this.f12067a;
        if (d61Var != null && (v51Var = d61Var.Y2) != null) {
            v51Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        i5 i5Var;
        int measuredWidth;
        d1 d1Var = this.f12072n;
        if (d1Var != null && (i5Var = this.f12074s) != null) {
            if (this.f12076x != null) {
                d1Var.setAlpha(0.0f);
                this.f12072n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f12074s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f12074s.getMeasuredWidth();
                }
                float f7 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                i5 i5Var2 = this.f12074s;
                TLRPC.GeoPoint geoPoint = this.f12076x;
                i5Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a4.a.m(i10, "_240"), this.f12073r, null);
                return;
            }
            i5Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 14));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.f21019v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f12068b = new or(mutate, new sp(j6.w0(null, i10, false)));
        this.f12069c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12068b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f20634a7, false));
        b1 b1Var = new b1(this, getParentActivity());
        this.f12071f = b1Var;
        b1Var.setTextSize(1, 17.0f);
        this.f12071f.setHintTextColor(j6.w0(null, j6.H6, false));
        b1 b1Var2 = this.f12071f;
        int i11 = j6.G6;
        b1Var2.setTextColor(j6.w0(null, i11, false));
        this.f12071f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f12071f.setMaxLines(5);
        this.f12071f.setSingleLine(false);
        this.f12071f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        b1 b1Var3 = this.f12071f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        b1Var3.setGravity(i12 | 48);
        this.f12071f.setInputType(180225);
        this.f12071f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f12071f.setCursorColor(j6.w0(null, i11, false));
        this.f12071f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f12071f.setCursorWidth(1.5f);
        this.f12071f.addTextChangedListener(new i2(this, 3));
        this.f12071f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12070e = frameLayout2;
        frameLayout2.addView(this.f12071f, x5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f12070e;
        int i13 = j6.f20690d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        b1 b1Var4 = this.f12071f;
        if (b1Var4 != null) {
            this.d = true;
            b1Var4.setText(this.f12077y);
            b1 b1Var5 = this.f12071f;
            b1Var5.setSelection(b1Var5.getText().length());
            this.d = false;
        }
        this.f12074s = new i5(this, context, 1);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, j6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f12074s.getImageReceiver());
        dq dqVar = new dq(svgThumb);
        this.f12073r = dqVar;
        dqVar.setCallback(this.f12074s);
        this.f12074s.setBackgroundColor(getThemedColor(i13));
        this.f12072n = new d1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f12074s, x5.c(-1.0f, -1));
        this.h.addView(this.f12072n, x5.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        d61 d61Var = new d61(this, new ci.u(this, 26), new z0(this, 0), null);
        this.f12067a = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.f12067a;
        d61Var2.Y2.f31162r = false;
        frameLayout.addView(d61Var2, x5.c(-1.0f, -1));
        this.actionBar.A(this.f12067a, true);
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
        if (this.f12076x == null && TextUtils.isEmpty(this.f12077y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (V() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new z0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new z0(this, 2));
                showDialog(alertDialog$Builder.f20225a);
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
        this.f12067a.setPadding(0, 0, 0, i13);
        this.f12067a.setClipToPadding(false);
    }
}
