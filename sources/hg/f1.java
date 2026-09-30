package hg;

import ai.y5;
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
import ci.i2;
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
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wp;
public final class f1 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public boolean G;
    public u61 f10271a;
    public sr f10272b;
    public org.telegram.ui.ActionBar.u0 f10273c;
    public boolean d;
    public FrameLayout e;
    public c1 f10274f;
    public FrameLayout h;
    public e1 f10275n;
    public hq f10276r;
    public y5 f10277s;
    public boolean v;
    public TLRPC.TL_businessLocation f10278w;
    public TLRPC.GeoPoint f10279x;
    public String f10280y;

    public f1() {
        super(null);
        this.F = -4;
    }

    public final void U(boolean z10) {
        float f7;
        float f10;
        boolean z11;
        float f11;
        float f12;
        if (this.f10273c != null) {
            boolean V = V();
            this.f10273c.setEnabled(V);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f10273c.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f10273c;
                if (V) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f10273c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f10273c;
                if (V) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            u61 u61Var = this.f10271a;
            if (u61Var != null && u61Var.f28778f3 != null) {
                boolean z12 = this.G;
                if (this.f10278w != null && (this.f10279x != null || !TextUtils.isEmpty(this.f10280y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f10271a.f28778f3.N(true);
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
        if (this.f10279x == null && TextUtils.isEmpty(this.f10280y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f10278w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f10279x == null && TextUtils.isEmpty(this.f10280y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f10278w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f10280y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f10279x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f10278w;
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
        if (this.f10272b.f28333c > 0.0f) {
            return;
        }
        if (this.f10279x == null && TextUtils.isEmpty(this.f10280y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f10280y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                c1 c1Var = this.f10274f;
                int i10 = -this.F;
                this.F = i10;
                AndroidUtilities.shakeViewSpring(c1Var, i10);
                return;
            }
        }
        this.f10272b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f10279x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f10279x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f10280y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f10280y;
                if (this.f10279x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f10279x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new b1(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        m61 m61Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f10278w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f10279x = tL_businessLocation.geo_point;
            this.f10280y = tL_businessLocation.address;
        } else {
            this.f10279x = null;
            this.f10280y = "";
        }
        c1 c1Var = this.f10274f;
        if (c1Var != null) {
            this.d = true;
            c1Var.setText(this.f10280y);
            c1 c1Var2 = this.f10274f;
            c1Var2.setSelection(c1Var2.getText().length());
            this.d = false;
        }
        Y();
        u61 u61Var = this.f10271a;
        if (u61Var != null && (m61Var = u61Var.f28778f3) != null) {
            m61Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        y5 y5Var;
        int measuredWidth;
        e1 e1Var = this.f10275n;
        if (e1Var != null && (y5Var = this.f10277s) != null) {
            if (this.f10279x != null) {
                e1Var.setAlpha(0.0f);
                this.f10275n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f10277s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f10277s.getMeasuredWidth();
                }
                float f7 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                y5 y5Var2 = this.f10277s;
                TLRPC.GeoPoint geoPoint = this.f10279x;
                y5Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a4.a.n(i10, "_240"), this.f10276r, null);
                return;
            }
            y5Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f19409v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f10272b = new sr(mutate, new wp(h6.w0(null, i10, false)));
        this.f10273c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10272b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.f19020a7, false));
        c1 c1Var = new c1(this, getParentActivity());
        this.f10274f = c1Var;
        c1Var.setTextSize(1, 17.0f);
        this.f10274f.setHintTextColor(h6.w0(null, h6.H6, false));
        c1 c1Var2 = this.f10274f;
        int i11 = h6.G6;
        c1Var2.setTextColor(h6.w0(null, i11, false));
        this.f10274f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f10274f.setMaxLines(5);
        this.f10274f.setSingleLine(false);
        this.f10274f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        c1 c1Var3 = this.f10274f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        c1Var3.setGravity(i12 | 48);
        this.f10274f.setInputType(180225);
        this.f10274f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f10274f.setCursorColor(h6.w0(null, i11, false));
        this.f10274f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f10274f.setCursorWidth(1.5f);
        this.f10274f.addTextChangedListener(new i2(this, 3));
        this.f10274f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f10274f, w7.y5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i13 = h6.f19076d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        c1 c1Var4 = this.f10274f;
        if (c1Var4 != null) {
            this.d = true;
            c1Var4.setText(this.f10280y);
            c1 c1Var5 = this.f10274f;
            c1Var5.setSelection(c1Var5.getText().length());
            this.d = false;
        }
        this.f10277s = new y5(this, context, 1);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, h6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f10277s.getImageReceiver());
        hq hqVar = new hq(svgThumb);
        this.f10276r = hqVar;
        hqVar.setCallback(this.f10277s);
        this.f10277s.setBackgroundColor(getThemedColor(i13));
        this.f10275n = new e1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f10277s, w7.y5.c(-1.0f, -1));
        this.h.addView(this.f10275n, w7.y5.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        u61 u61Var = new u61(this, new bi.v(this, 26), new a1(this, 0), null);
        this.f10271a = u61Var;
        u61Var.s1();
        u61 u61Var2 = this.f10271a;
        u61Var2.f28778f3.f26223r = false;
        frameLayout.addView(u61Var2, w7.y5.c(-1.0f, -1));
        this.actionBar.z(this.f10271a, true);
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
        if (this.f10279x == null && TextUtils.isEmpty(this.f10280y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (V() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a1(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a1(this, 2));
                showDialog(alertDialog$Builder.f18678a);
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
        this.f10271a.setPadding(0, 0, 0, i13);
        this.f10271a.setClipToPadding(false);
    }
}
