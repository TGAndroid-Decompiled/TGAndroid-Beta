package gg;

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
import bi.u2;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.zp;
import w7.a6;
public final class k1 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public boolean G;
    public r61 f8926a;
    public vr f8927b;
    public org.telegram.ui.ActionBar.w0 f8928c;
    public boolean d;
    public FrameLayout e;
    public f1 f8929f;
    public FrameLayout h;
    public j1 f8930n;
    public kq f8931r;
    public i1 f8932s;
    public boolean v;
    public TLRPC.TL_businessLocation f8933w;
    public TLRPC.GeoPoint f8934x;
    public String f8935y;

    public k1() {
        super(null);
        this.F = -4;
    }

    public final void U(boolean z10) {
        float f7;
        float f10;
        boolean z11;
        float f11;
        float f12;
        if (this.f8928c != null) {
            boolean V = V();
            this.f8928c.setEnabled(V);
            float f13 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.f8928c.animate();
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
                org.telegram.ui.ActionBar.w0 w0Var = this.f8928c;
                if (V) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                w0Var.setAlpha(f7);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f8928c;
                if (V) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var2.setScaleX(f10);
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f8928c;
                if (V) {
                    f13 = 1.0f;
                }
                w0Var3.setScaleY(f13);
            }
            r61 r61Var = this.f8926a;
            if (r61Var != null && r61Var.Y2 != null) {
                boolean z12 = this.G;
                if (this.f8933w != null && (this.f8934x != null || !TextUtils.isEmpty(this.f8935y))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12 != z11) {
                    this.f8926a.Y2.N(true);
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
        if (this.f8934x == null && TextUtils.isEmpty(this.f8935y)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f8933w != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            return true;
        }
        if (this.f8934x == null && TextUtils.isEmpty(this.f8935y)) {
            z12 = false;
        } else {
            z12 = true;
        }
        TLRPC.TL_businessLocation tL_businessLocation = this.f8933w;
        if (tL_businessLocation != null && !(tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            return true;
        }
        String str2 = this.f8935y;
        if (tL_businessLocation != null) {
            str = tL_businessLocation.address;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str2, str)) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.f8934x;
        if (geoPoint2 != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        TLRPC.TL_businessLocation tL_businessLocation2 = this.f8933w;
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
        if (this.f8927b.f28591c > 0.0f) {
            return;
        }
        if (this.f8934x == null && TextUtils.isEmpty(this.f8935y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.f8935y;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                f1 f1Var = this.f8929f;
                int i10 = -this.F;
                this.F = i10;
                AndroidUtilities.shakeViewSpring(f1Var, i10);
                return;
            }
        }
        this.f8927b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.f8934x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.f8934x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.f8935y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.f8935y;
                if (this.f8934x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.f8934x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new e1(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        j61 j61Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.f8933w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.f8934x = tL_businessLocation.geo_point;
            this.f8935y = tL_businessLocation.address;
        } else {
            this.f8934x = null;
            this.f8935y = "";
        }
        f1 f1Var = this.f8929f;
        if (f1Var != null) {
            this.d = true;
            f1Var.setText(this.f8935y);
            f1 f1Var2 = this.f8929f;
            f1Var2.setSelection(f1Var2.getText().length());
            this.d = false;
        }
        Y();
        r61 r61Var = this.f8926a;
        if (r61Var != null && (j61Var = r61Var.Y2) != null) {
            j61Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        i1 i1Var;
        int measuredWidth;
        j1 j1Var = this.f8930n;
        if (j1Var != null && (i1Var = this.f8932s) != null) {
            if (this.f8934x != null) {
                j1Var.setAlpha(0.0f);
                this.f8930n.setTranslationY(-AndroidUtilities.dp(12.0f));
                if (this.f8932s.getMeasuredWidth() <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                } else {
                    measuredWidth = this.f8932s.getMeasuredWidth();
                }
                float f7 = AndroidUtilities.density;
                int i10 = (int) (measuredWidth / f7);
                int min = Math.min(2, (int) Math.ceil(f7));
                i1 i1Var2 = this.f8932s;
                TLRPC.GeoPoint geoPoint = this.f8934x;
                i1Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), a4.a.m(i10, "_240"), this.f8931r, null);
                return;
            }
            i1Var.setImageBitmap(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.f18256v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f8927b = new vr(mutate, new zp(j6.w0(null, i10, false)));
        this.f8928c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f8927b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        f1 f1Var = new f1(this, getParentActivity());
        this.f8929f = f1Var;
        f1Var.setTextSize(1, 17.0f);
        this.f8929f.setHintTextColor(j6.w0(null, j6.H6, false));
        f1 f1Var2 = this.f8929f;
        int i11 = j6.G6;
        f1Var2.setTextColor(j6.w0(null, i11, false));
        this.f8929f.setBackgroundDrawable(null);
        int i12 = 5;
        this.f8929f.setMaxLines(5);
        this.f8929f.setSingleLine(false);
        this.f8929f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        f1 f1Var3 = this.f8929f;
        if (!LocaleController.isRTL) {
            i12 = 3;
        }
        f1Var3.setGravity(i12 | 48);
        this.f8929f.setInputType(180225);
        this.f8929f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f8929f.setCursorColor(j6.w0(null, i11, false));
        this.f8929f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f8929f.setCursorWidth(1.5f);
        this.f8929f.addTextChangedListener(new u2(this, 3));
        this.f8929f.setFilters(new InputFilter[]{new Object()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f8929f, a6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i13 = j6.f17928d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        f1 f1Var4 = this.f8929f;
        if (f1Var4 != null) {
            this.d = true;
            f1Var4.setText(this.f8935y);
            f1 f1Var5 = this.f8929f;
            f1Var5.setSelection(f1Var5.getText().length());
            this.d = false;
        }
        this.f8932s = new i1(this, context, 0);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, j6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.f8932s.getImageReceiver());
        kq kqVar = new kq(svgThumb);
        this.f8931r = kqVar;
        kqVar.setCallback(this.f8932s);
        this.f8932s.setBackgroundColor(getThemedColor(i13));
        this.f8930n = new j1(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.f8932s, a6.c(-1.0f, -1));
        this.h.addView(this.f8930n, a6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        r61 r61Var = new r61(this, new ai.c0(this, 26), new d1(this, 0), null);
        this.f8926a = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.f8926a;
        r61Var2.Y2.f24250r = false;
        frameLayout.addView(r61Var2, a6.c(-1.0f, -1));
        this.actionBar.z(this.f8926a, true);
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
        if (this.f8934x == null && TextUtils.isEmpty(this.f8935y)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (V() && !z11) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new d1(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new d1(this, 2));
                showDialog(alertDialog$Builder.f17528a);
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
        this.f8926a.setPadding(0, 0, 0, i13);
        this.f8926a.setClipToPadding(false);
    }
}
