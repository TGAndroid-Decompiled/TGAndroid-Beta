package hg;

import ai.z5;
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
import ci.h2;
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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.uq;
import w7.x5;
public final class e1 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public boolean G;
    public l71 f11204a;
    public hs f11205b;
    public org.telegram.ui.ActionBar.u0 f11206c;
    public boolean d;
    public FrameLayout f11207e;
    public b1 f11208f;
    public FrameLayout h;
    public d1 f11209n;
    public uq f11210r;
    public z5 f11211s;
    public boolean v;
    public TLRPC.TL_businessLocation f11212w;
    public TLRPC.GeoPoint f11213x;
    public String f11214y;

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
        if (this.f11206c != null) {
            boolean V = V();
            this.f11206c.setEnabled(V);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f11206c.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f11206c;
                if (V) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f11206c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f11206c;
                if (V) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            l71 l71Var = this.f11204a;
            if (l71Var != null && l71Var.W2 != null) {
                boolean z12 = this.G;
                if (this.f11212w != null && (this.f11213x != null || !TextUtils.isEmpty(this.f11214y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f11204a.W2.N(true);
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
        if (this.f11213x == null && TextUtils.isEmpty(this.f11214y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f11212w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f11213x == null && TextUtils.isEmpty(this.f11214y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f11212w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f11214y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f11213x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f11212w;
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
        if (this.f11205b.f27225c > 0.0f) {
            return;
        }
        if (this.f11213x == null && TextUtils.isEmpty(this.f11214y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f11214y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                b1 b1Var = this.f11208f;
                int i10 = -this.F;
                this.F = i10;
                AndroidUtilities.shakeViewSpring(b1Var, i10);
                return;
            }
        }
        this.f11205b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f11213x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f11213x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f11214y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f11214y;
                if (this.f11213x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f11213x;
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
        d71 d71Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f11212w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f11213x = tL_businessLocation.geo_point;
            this.f11214y = tL_businessLocation.address;
        } else {
            this.f11213x = null;
            this.f11214y = "";
        }
        b1 b1Var = this.f11208f;
        if (b1Var != null) {
            this.d = true;
            b1Var.setText(this.f11214y);
            b1 b1Var2 = this.f11208f;
            b1Var2.setSelection(b1Var2.getText().length());
            this.d = false;
        }
        Y();
        l71 l71Var = this.f11204a;
        if (l71Var != null && (d71Var = l71Var.W2) != null) {
            d71Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        z5 z5Var;
        int measuredWidth;
        d1 d1Var = this.f11209n;
        if (d1Var != null && (z5Var = this.f11211s) != null) {
            if (this.f11213x != null) {
                d1Var.setAlpha(0.0f);
                this.f11209n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f11211s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f11211s.getMeasuredWidth();
                }
                float f7 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                z5 z5Var2 = this.f11211s;
                TLRPC.GeoPoint geoPoint = this.f11213x;
                z5Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a1.g.n(i10, "_240"), this.f11210r, null);
                return;
            }
            z5Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f21156v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11205b = new hs(mutate, new jq(h6.x0(null, i10, false)));
        this.f11206c = this.actionBar.o().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11205b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20766a7, false));
        b1 b1Var = new b1(this, getParentActivity());
        this.f11208f = b1Var;
        b1Var.setTextSize(1, 17.0f);
        this.f11208f.setHintTextColor(h6.x0(null, h6.H6, false));
        b1 b1Var2 = this.f11208f;
        int i11 = h6.G6;
        b1Var2.setTextColor(h6.x0(null, i11, false));
        this.f11208f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f11208f.setMaxLines(5);
        this.f11208f.setSingleLine(false);
        this.f11208f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        b1 b1Var3 = this.f11208f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        b1Var3.setGravity(i12 | 48);
        this.f11208f.setInputType(180225);
        this.f11208f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f11208f.setCursorColor(h6.x0(null, i11, false));
        this.f11208f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f11208f.setCursorWidth(1.5f);
        this.f11208f.addTextChangedListener(new h2(this, 3));
        this.f11208f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f11207e = frameLayout2;
        frameLayout2.addView(this.f11208f, x5.a(-1.0f, 21.0f, 15.0f, 21.0f, 15.0f, -1, 48));
        FrameLayout frameLayout3 = this.f11207e;
        int i13 = h6.f20822d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        b1 b1Var4 = this.f11208f;
        if (b1Var4 != null) {
            this.d = true;
            b1Var4.setText(this.f11214y);
            b1 b1Var5 = this.f11208f;
            b1Var5.setSelection(b1Var5.getText().length());
            this.d = false;
        }
        this.f11211s = new z5(this, context, 1);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, h6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f11211s.getImageReceiver());
        uq uqVar = new uq(svgThumb);
        this.f11210r = uqVar;
        uqVar.setCallback(this.f11211s);
        this.f11211s.setBackgroundColor(getThemedColor(i13));
        this.f11209n = new d1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f11211s, x5.d(-1.0f, -1));
        this.h.addView(this.f11209n, x5.a(-2.0f, 0.0f, -31.0f, 0.0f, 0.0f, -2, 17));
        Y();
        l71 l71Var = new l71(this, new bi.v(this, 26), new z0(this, 0), null);
        this.f11204a = l71Var;
        l71Var.p1();
        l71 l71Var2 = this.f11204a;
        l71Var2.W2.f25649r = false;
        frameLayout.addView(l71Var2, x5.d(-1.0f, -1));
        this.actionBar.B(this.f11204a, true);
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
        if (this.f11213x == null && TextUtils.isEmpty(this.f11214y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (V() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new z0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new z0(this, 2));
                showDialog(alertDialog$Builder.f20404a);
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
        this.f11204a.setPadding(0, 0, 0, i13);
        this.f11204a.setClipToPadding(false);
    }
}
