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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.s61;
import w7.z5;
public final class b1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public boolean G;
    public a71 f12833a;
    public as f12834b;
    public org.telegram.ui.ActionBar.u0 f12835c;
    public boolean d;
    public FrameLayout e;
    public y0 f12836f;
    public FrameLayout h;
    public a1 f12837n;
    public oq f12838r;
    public k4 f12839s;
    public boolean v;
    public TLRPC.TL_businessLocation f12840w;
    public TLRPC.GeoPoint f12841x;
    public String f12842y;

    public b1() {
        super(null);
        this.F = -4;
    }

    public final void U(boolean z10) {
        float f7;
        float f10;
        boolean z11;
        float f11;
        float f12;
        if (this.f12835c != null) {
            boolean V = V();
            this.f12835c.setEnabled(V);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f12835c.animate();
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
                org.telegram.ui.ActionBar.u0 u0Var = this.f12835c;
                if (V) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f12835c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                u0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f12835c;
                if (V) {
                    f13 = 1.0f;
                }
                u0Var3.setScaleY(f13);
            }
            a71 a71Var = this.f12833a;
            if (a71Var != null && a71Var.W2 != null) {
                boolean z12 = this.G;
                if (this.f12840w != null && (this.f12841x != null || !TextUtils.isEmpty(this.f12842y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f12833a.W2.N(true);
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
        if (this.f12841x == null && TextUtils.isEmpty(this.f12842y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f12840w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f12841x == null && TextUtils.isEmpty(this.f12842y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f12840w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f12842y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f12841x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f12840w;
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
        if (this.f12834b.f24703c > 0.0f) {
            return;
        }
        if (this.f12841x == null && TextUtils.isEmpty(this.f12842y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f12842y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                y0 y0Var = this.f12836f;
                int i10 = -this.F;
                this.F = i10;
                AndroidUtilities.shakeViewSpring(y0Var, i10);
                return;
            }
        }
        this.f12834b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f12841x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f12841x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f12842y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f12842y;
                if (this.f12841x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f12841x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new x0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        s61 s61Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f12840w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f12841x = tL_businessLocation.geo_point;
            this.f12842y = tL_businessLocation.address;
        } else {
            this.f12841x = null;
            this.f12842y = "";
        }
        y0 y0Var = this.f12836f;
        if (y0Var != null) {
            this.d = true;
            y0Var.setText(this.f12842y);
            y0 y0Var2 = this.f12836f;
            y0Var2.setSelection(y0Var2.getText().length());
            this.d = false;
        }
        Y();
        a71 a71Var = this.f12833a;
        if (a71Var != null && (s61Var = a71Var.W2) != null) {
            s61Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        k4 k4Var;
        int measuredWidth;
        a1 a1Var = this.f12837n;
        if (a1Var != null && (k4Var = this.f12839s) != null) {
            if (this.f12841x != null) {
                a1Var.setAlpha(0.0f);
                this.f12837n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f12839s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f12839s.getMeasuredWidth();
                }
                float f7 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                k4 k4Var2 = this.f12839s;
                TLRPC.GeoPoint geoPoint = this.f12841x;
                k4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a1.g.m(i10, "_240"), this.f12838r, null);
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
        int i10 = h6.f21321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f12834b = new as(mutate, new dq(h6.x0(null, i10, false)));
        this.f12835c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12834b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20928a7, false));
        y0 y0Var = new y0(this, getParentActivity());
        this.f12836f = y0Var;
        y0Var.setTextSize(1, 17.0f);
        this.f12836f.setHintTextColor(h6.x0(null, h6.H6, false));
        y0 y0Var2 = this.f12836f;
        int i11 = h6.G6;
        y0Var2.setTextColor(h6.x0(null, i11, false));
        this.f12836f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f12836f.setMaxLines(5);
        this.f12836f.setSingleLine(false);
        this.f12836f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        y0 y0Var3 = this.f12836f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        y0Var3.setGravity(i12 | 48);
        this.f12836f.setInputType(180225);
        this.f12836f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f12836f.setCursorColor(h6.x0(null, i11, false));
        this.f12836f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f12836f.setCursorWidth(1.5f);
        this.f12836f.addTextChangedListener(new ai.u(this, 4));
        this.f12836f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f12836f, z5.a(-1.0f, 21.0f, 15.0f, 21.0f, 15.0f, -1, 48));
        FrameLayout frameLayout3 = this.e;
        int i13 = h6.f20986d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        y0 y0Var4 = this.f12836f;
        if (y0Var4 != null) {
            this.d = true;
            y0Var4.setText(this.f12842y);
            y0 y0Var5 = this.f12836f;
            y0Var5.setSelection(y0Var5.getText().length());
            this.d = false;
        }
        this.f12839s = new k4(this, context, 1);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, h6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f12839s.getImageReceiver());
        oq oqVar = new oq(svgThumb);
        this.f12838r = oqVar;
        oqVar.setCallback(this.f12839s);
        this.f12839s.setBackgroundColor(getThemedColor(i13));
        this.f12837n = new a1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f12839s, z5.d(-1.0f, -1));
        this.h.addView(this.f12837n, z5.a(-2.0f, 0.0f, -31.0f, 0.0f, 0.0f, -2, 17));
        Y();
        a71 a71Var = new a71(this, new hg.o(this, 7), new w0(this, 0), null);
        this.f12833a = a71Var;
        a71Var.p1();
        a71 a71Var2 = this.f12833a;
        a71Var2.W2.f30200r = false;
        frameLayout.addView(a71Var2, z5.d(-1.0f, -1));
        this.actionBar.A(this.f12833a, true);
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
        if (this.f12841x == null && TextUtils.isEmpty(this.f12842y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (V() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new w0(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new w0(this, 2));
                showDialog(alertDialog$Builder.f20601a);
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
        this.f12833a.setPadding(0, 0, 0, i13);
        this.f12833a.setClipToPadding(false);
    }
}
