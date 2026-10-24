package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import ci.j4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.yr;
import w7.z5;
public final class c1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public boolean F;
    public int G;
    public boolean H;
    public i71 f12875a;
    public yr f12876b;
    public cq f12877c;
    public org.telegram.ui.ActionBar.u0 d;
    public boolean e;
    public FrameLayout f12878f;
    public z0 h;
    public FrameLayout f12879n;
    public b1 f12880r;
    public mq f12881s;
    public j4 v;
    public boolean f12882w;
    public TLRPC.TL_businessLocation f12883x;
    public TLRPC.GeoPoint f12884y;

    public c1() {
        super(null);
        this.G = -4;
    }

    public final void U(boolean z10) {
        float f7;
        float f10;
        boolean z11;
        float f11;
        float f12;
        if (this.d != null) {
            boolean V = V();
            this.d.setEnabled(V);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.d.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.d;
                if (V) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.d;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.d;
                if (V) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            i71 i71Var = this.f12875a;
            if (i71Var != null && i71Var.Z2 != null) {
                boolean z12 = this.H;
                if (this.f12883x != null && (this.f12884y != null || !TextUtils.isEmpty(this.E))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f12875a.Z2.N(true);
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
        if (this.f12884y == null && TextUtils.isEmpty(this.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f12883x != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f12884y == null && TextUtils.isEmpty(this.E)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f12883x;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.E;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f12884y;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f12883x;
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
        if (this.f12876b.f33027c > 0.0f) {
            return;
        }
        if (this.f12884y == null && TextUtils.isEmpty(this.E)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.E;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                z0 z0Var = this.h;
                int i10 = -this.G;
                this.G = i10;
                AndroidUtilities.shakeViewSpring(z0Var, i10);
                return;
            }
        }
        this.f12876b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f12884y != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f12884y;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.E;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.E;
                if (this.f12884y != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f12884y;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new y0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        a71 a71Var;
        if (this.f12882w) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f12883x = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f12884y = tL_businessLocation.geo_point;
            this.E = tL_businessLocation.address;
        } else {
            this.f12884y = null;
            this.E = "";
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            this.e = true;
            z0Var.setText(this.E);
            z0 z0Var2 = this.h;
            z0Var2.setSelection(z0Var2.getText().length());
            this.e = false;
        }
        Y();
        i71 i71Var = this.f12875a;
        if (i71Var != null && (a71Var = i71Var.Z2) != null) {
            a71Var.N(true);
        }
        this.f12882w = true;
    }

    public final void Y() {
        j4 j4Var;
        int measuredWidth;
        b1 b1Var = this.f12880r;
        if (b1Var != null && (j4Var = this.v) != null) {
            if (this.f12884y != null) {
                b1Var.setAlpha(0.0f);
                this.f12880r.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.v.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.v.getMeasuredWidth();
                }
                float f7 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                j4 j4Var2 = this.v;
                TLRPC.GeoPoint geoPoint = this.f12884y;
                j4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a1.g.m(i10, "_240"), this.f12881s, null);
                return;
            }
            j4Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 15));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.f21519v8;
        r6.z(kVar, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
        cq cqVar = new cq(k6.x0(null, i10, false));
        this.f12877c = cqVar;
        this.f12876b = new yr(mutate, cqVar);
        this.d = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12876b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21126a7, frameLayout, null);
        z0 z0Var = new z0(this, getParentActivity());
        this.h = z0Var;
        z0Var.setTextSize(1, 17.0f);
        r6.F(this.h, k6.H6, null);
        z0 z0Var2 = this.h;
        int i11 = k6.G6;
        r6.W(z0Var2, i11, null);
        this.h.setBackgroundDrawable(null);
        int i12 = 5;
        this.h.setMaxLines(5);
        this.h.setSingleLine(false);
        this.h.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        z0 z0Var3 = this.h;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        z0Var3.setGravity(i12 | 48);
        this.h.setInputType(180225);
        this.h.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        r6.x(this.h, i11, null);
        this.h.setCursorSize(AndroidUtilities.dp(19.0f));
        this.h.setCursorWidth(1.5f);
        this.h.addTextChangedListener(new ai.u(this, 4));
        this.h.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12878f = frameLayout2;
        frameLayout2.addView(this.h, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f12878f;
        int i13 = k6.f21184d6;
        r6.i(i13, frameLayout3, getResourceProvider());
        z0 z0Var4 = this.h;
        if (z0Var4 != null) {
            this.e = true;
            z0Var4.setText(this.E);
            z0 z0Var5 = this.h;
            z0Var5.setSelection(z0Var5.getText().length());
            this.e = false;
        }
        this.v = new j4(this, context, 1);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, k6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.v.getImageReceiver());
        mq mqVar = new mq(svgThumb);
        this.f12881s = mqVar;
        mqVar.setCallback(this.v);
        r6.i(i13, this.v, getResourceProvider());
        this.f12880r = new b1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f12879n = frameLayout4;
        frameLayout4.addView(this.v, z5.c(-1.0f, -1));
        this.f12879n.addView(this.f12880r, z5.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        i71 i71Var = new i71(this, new hg.o(this, 7), new x0(this, 0), null);
        this.f12875a = i71Var;
        i71Var.t1();
        i71 i71Var2 = this.f12875a;
        i71Var2.Z2.f24646r = false;
        frameLayout.addView(i71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.f12875a, true);
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
        if (this.f12884y == null && TextUtils.isEmpty(this.E)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (V() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new x0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new x0(this, 2));
                showDialog(alertDialog$Builder.f20679a);
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
        this.f12875a.setPadding(0, 0, 0, i13);
        this.f12875a.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            try {
                cq cqVar = this.f12877c;
                if (cqVar != null) {
                    cqVar.b(k6.x0(null, k6.f21519v8, false));
                    yr yrVar = this.f12876b;
                    if (yrVar != null) {
                        yrVar.invalidateSelf();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
