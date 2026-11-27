package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class iv3 extends nx0 {
    public static iv3 R1;
    public final int A1;
    public final int B1;
    public final String C1;
    public final boolean D1;
    public final String E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public final int K1;
    public final dv3 L1;
    public me8 M1;
    public View N1;
    public int O1;
    public int P1;
    public final zm9 Q1;
    public final ev3 l1;
    public final hyc m1;
    public View n1;
    public final FrameLayout o1;
    public WebChromeClient.CustomViewCallback p1;
    public final View q1;
    public final RadialProgressView r1;
    public final Activity s1;
    public final LinearLayout t1;
    public final TextView u1;
    public final zc v1;
    public final ImageView w1;
    public boolean x1;
    public final int[] y1;
    public cv3 z1;

    public iv3(Activity activity, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        super(activity, false);
        float f;
        byte b;
        this.y1 = new int[2];
        this.F1 = -2;
        this.L1 = new dv3(this);
        this.Q1 = new zm9(this, (byte) 29);
        this.V = true;
        this.v0 = false;
        this.w0 = false;
        this.K1 = i3;
        if (ik8.A(activity)) {
            this.s1 = activity;
        }
        this.E1 = str4;
        boolean z = str2 != null && str2.length() > 0;
        this.D1 = z;
        this.C1 = str3;
        this.A1 = i;
        this.B1 = i2;
        if (i == 0 || i2 == 0) {
            Point point = hl.q;
            this.A1 = point.x;
            this.B1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.o1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new b02((byte) 7));
        this.c.addView(frameLayout, tre.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        zc zcVar = new zc((byte) 17, activity, this);
        this.v1 = zcVar;
        zcVar.setOnTouchListener(new b02((byte) 8));
        this.O = zcVar;
        ev3 ev3Var = new ev3(this, activity, activity, (byte) 0);
        this.l1 = ev3Var;
        ev3Var.getSettings().setJavaScriptEnabled(true);
        ev3Var.getSettings().setDomStorageEnabled(true);
        ev3Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ev3Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ev3Var, true);
        ev3Var.setWebChromeClient(new su(this, (byte) 1));
        ev3Var.setWebViewClient(new tu(this, (byte) 1));
        zcVar.addView(ev3Var, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 84));
        hyc hycVar = new hyc(activity, true, new fv3(this));
        this.m1 = hycVar;
        hycVar.setVisibility(4);
        zcVar.addView(hycVar, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 74));
        View view = new View(activity);
        this.q1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        zcVar.addView(view, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.r1 = radialProgressView;
        radialProgressView.setVisibility(4);
        zcVar.addView(radialProgressView, tre.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z ? 22 : 0) + 84) / 2));
        if (z) {
            TextView textView = new TextView(activity);
            f = 18.0f;
            textView.setTextSize(1, 16.0f);
            yob.X(textView, aob.j5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(hl.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
            zcVar.addView(textView, tre.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f = 18.0f;
        }
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.p5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(hl.L(f), 0, hl.L(f), 0);
        zcVar.addView(textView2, tre.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        yob.h(aob.K5, null, view2);
        zcVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = hl.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        yob.h(aob.h5, null, frameLayout2);
        zcVar.addView(frameLayout2, tre.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, tre.e(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i4 = aob.o5;
        yob.X(textView3, i4, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i5 = aob.I5;
        hf0 f0 = aob.f0(aob.w0(null, i5, false), 0, -1);
        uob M = yob.M(i5);
        textView3.setBackground(f0);
        yob.j(textView3, f0, null, M, null);
        textView3.setPadding(hl.L(f), 0, hl.L(f), 0);
        textView3.setText(ob6.M0(2131752006, null).toUpperCase());
        textView3.setTypeface(hl.o());
        frameLayout2.addView(textView3, tre.r(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final iv3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b2 = r2;
                iv3 iv3Var = this.b;
                switch (b2) {
                    case 0:
                        iv3Var.dismiss();
                        return;
                    case 1:
                        ev3 ev3Var2 = iv3Var.l1;
                        me8 a = fc3.b().a();
                        if (a != null) {
                            a.b();
                            Objects.requireNonNull(view3);
                            hl.d3(new vc(view3, (byte) 2), 300L);
                            return;
                        } else if (iv3Var.r1.getVisibility() != 0) {
                            iv3Var.K0(ev3Var2, iv3Var.A1, iv3Var.B1);
                            if (iv3Var.x1) {
                                ev3Var2.evaluateJavascript("hideControls();", null);
                            }
                            iv3Var.b.setTranslationY(0.0f);
                            iv3Var.H();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", iv3Var.C1));
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        Activity activity2 = iv3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new su3((byte) 3));
                        }
                        iv3Var.dismiss();
                        return;
                    default:
                        m01.u(iv3Var.s1, iv3Var.C1);
                        iv3Var.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.t1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, tre.e(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.w1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231277);
        imageView.setContentDescription(ob6.M0(2131754803, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i4, null, mode);
        hf0 f02 = aob.f0(aob.w0(null, i5, false), 0, -1);
        uob M2 = yob.M(i5);
        imageView.setBackground(f02);
        yob.j(imageView, f02, null, M2, null);
        linearLayout2.addView(imageView, tre.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final iv3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b2 = r2;
                iv3 iv3Var = this.b;
                switch (b2) {
                    case 0:
                        iv3Var.dismiss();
                        return;
                    case 1:
                        ev3 ev3Var2 = iv3Var.l1;
                        me8 a = fc3.b().a();
                        if (a != null) {
                            a.b();
                            Objects.requireNonNull(view3);
                            hl.d3(new vc(view3, (byte) 2), 300L);
                            return;
                        } else if (iv3Var.r1.getVisibility() != 0) {
                            iv3Var.K0(ev3Var2, iv3Var.A1, iv3Var.B1);
                            if (iv3Var.x1) {
                                ev3Var2.evaluateJavascript("hideControls();", null);
                            }
                            iv3Var.b.setTranslationY(0.0f);
                            iv3Var.H();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", iv3Var.C1));
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        Activity activity2 = iv3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new su3((byte) 3));
                        }
                        iv3Var.dismiss();
                        return;
                    default:
                        m01.u(iv3Var.s1, iv3Var.C1);
                        iv3Var.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final iv3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b2 = r2;
                iv3 iv3Var = this.b;
                switch (b2) {
                    case 0:
                        iv3Var.dismiss();
                        return;
                    case 1:
                        ev3 ev3Var2 = iv3Var.l1;
                        me8 a = fc3.b().a();
                        if (a != null) {
                            a.b();
                            Objects.requireNonNull(view3);
                            hl.d3(new vc(view3, (byte) 2), 300L);
                            return;
                        } else if (iv3Var.r1.getVisibility() != 0) {
                            iv3Var.K0(ev3Var2, iv3Var.A1, iv3Var.B1);
                            if (iv3Var.x1) {
                                ev3Var2.evaluateJavascript("hideControls();", null);
                            }
                            iv3Var.b.setTranslationY(0.0f);
                            iv3Var.H();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", iv3Var.C1));
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        Activity activity2 = iv3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new su3((byte) 3));
                        }
                        iv3Var.dismiss();
                        return;
                    default:
                        m01.u(iv3Var.s1, iv3Var.C1);
                        iv3Var.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232108);
        imageView2.setContentDescription(ob6.M0(2131751727, null));
        yob.s(imageView2, i4, null, mode);
        hf0 f03 = aob.f0(aob.w0(null, i5, false), 0, -1);
        uob M3 = yob.M(i5);
        imageView2.setBackground(f03);
        yob.j(imageView2, f03, null, M3, null);
        linearLayout2.addView(imageView2, tre.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.u1 = textView4;
        textView4.setTextSize(1, 14.0f);
        yob.X(textView4, i4, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        hf0 f04 = aob.f0(aob.w0(null, i5, false), 0, -1);
        uob M4 = yob.M(i5);
        textView4.setBackground(f04);
        yob.j(textView4, f04, null, M4, null);
        textView4.setPadding(hl.L(f), 0, hl.L(f), 0);
        textView4.setText(ob6.M0(2131751732, null).toUpperCase());
        textView4.setTypeface(hl.o());
        linearLayout.addView(textView4, tre.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        yob.X(textView5, i4, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        hf0 f05 = aob.f0(aob.w0(null, i5, false), 0, -1);
        uob M5 = yob.M(i5);
        textView5.setBackground(f05);
        yob.j(textView5, f05, null, M5, null);
        textView5.setPadding(hl.L(f), 0, hl.L(f), 0);
        textView5.setText(ob6.M0(2131747525, null).toUpperCase());
        textView5.setTypeface(hl.o());
        linearLayout.addView(textView5, tre.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final iv3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b2 = r2;
                iv3 iv3Var = this.b;
                switch (b2) {
                    case 0:
                        iv3Var.dismiss();
                        return;
                    case 1:
                        ev3 ev3Var2 = iv3Var.l1;
                        me8 a = fc3.b().a();
                        if (a != null) {
                            a.b();
                            Objects.requireNonNull(view3);
                            hl.d3(new vc(view3, (byte) 2), 300L);
                            return;
                        } else if (iv3Var.r1.getVisibility() != 0) {
                            iv3Var.K0(ev3Var2, iv3Var.A1, iv3Var.B1);
                            if (iv3Var.x1) {
                                ev3Var2.evaluateJavascript("hideControls();", null);
                            }
                            iv3Var.b.setTranslationY(0.0f);
                            iv3Var.H();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", iv3Var.C1));
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        Activity activity2 = iv3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new su3((byte) 3));
                        }
                        iv3Var.dismiss();
                        return;
                    default:
                        m01.u(iv3Var.s1, iv3Var.C1);
                        iv3Var.dismiss();
                        return;
                }
            }
        });
        boolean z2 = hyc.a(str4) || hyc.a(str3);
        hycVar.setVisibility(z2 ? 0 : 4);
        if (z2) {
            dyc dycVar = hycVar.g0;
            dycVar.setVisibility(4);
            b = 0;
            dycVar.d(false, false);
            hycVar.j(true, false);
        } else {
            b = 0;
        }
        this.z0 = new gv3(this, z2);
        this.z1 = new cv3(b, a.b, this);
        String e = hyc.e(str4);
        if (e != null || !z2) {
            radialProgressView.setVisibility(b);
            ev3Var.setVisibility(b);
            linearLayout2.setVisibility(b);
            if (e != null) {
                view.setVisibility(b);
            }
            textView4.setVisibility(4);
            ev3Var.setKeepScreenOn(true);
            hycVar.setVisibility(4);
            hycVar.getControlsView().setVisibility(4);
            hycVar.getTextureView().setVisibility(4);
            if (hycVar.getTextureImageView() != null) {
                hycVar.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(uc7.s1(this.a).l4.Q0.f)) {
                imageView.setVisibility(8);
            }
        }
        boolean canDetectOrientation = this.z1.canDetectOrientation();
        cv3 cv3Var = this.z1;
        if (canDetectOrientation) {
            cv3Var.enable();
        } else {
            cv3Var.disable();
            this.z1 = null;
        }
        R1 = this;
    }

    public static void J0(e eVar, r47 r47Var, yc8 yc8Var, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z) {
        String str5;
        TLRPC.MessageMedia messageMedia;
        iv3 iv3Var = R1;
        if (iv3Var != null) {
            iv3Var.F0();
        }
        if (r47Var != null && (messageMedia = r47Var.k.media) != null && messageMedia.webpage != null) {
            str5 = hyc.e(str4);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            PhotoViewer.q0().T1(null, eVar, null);
            PhotoViewer.q0().m1(r47Var, null, null, null, null, null, null, 0, yc8Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i3));
            return;
        }
        iv3 iv3Var2 = new iv3(eVar.getParentActivity(), str, str2, str3, str4, i, i2, i3);
        iv3Var2.i0 = z;
        iv3Var2.n = z;
        iv3Var2.show();
    }

    @Override
    public final boolean D() {
        hyc hycVar = this.m1;
        if (hycVar.getVisibility() == 0 && hycVar.U) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean E() {
        if (this.o1.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public final void E0() {
        me8 me8Var = this.M1;
        if (me8Var != null) {
            this.M1 = null;
            me8Var.a(new bm0((byte) 10));
            me8Var.h();
        }
    }

    public final void F0() {
        ev3 ev3Var = this.l1;
        if (ev3Var != null && ev3Var.getVisibility() == 0) {
            this.v1.removeView(ev3Var);
            ev3Var.stopLoading();
            ev3Var.loadUrl("about:blank");
            ev3Var.destroy();
        }
        me8 me8Var = this.M1;
        if (me8Var != null) {
            this.M1 = null;
            me8Var.b();
        }
        hyc hycVar = this.m1;
        if (hycVar != null) {
            hycVar.b();
        }
        R1 = null;
        H();
    }

    public final void G0() {
        int i;
        ImageView imageView;
        if (this.l1 != null && I0()) {
            if (this.N1 != this.l1) {
                hyc hycVar = this.m1;
                if (hycVar.V && (imageView = hycVar.e0) != null) {
                    imageView.callOnClick();
                    return;
                }
                return;
            }
            if (a.x) {
                try {
                    this.s1.startService(new Intent(a.b, BringAppForegroundService.class));
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            if (this.x1) {
                this.l1.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.l1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.l1);
            }
            zc zcVar = this.v1;
            ev3 ev3Var = this.l1;
            if (this.D1) {
                i = 22;
            } else {
                i = 0;
            }
            zcVar.addView(ev3Var, 0, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i + 84));
            this.f0 = true;
            show();
            E0();
        }
    }

    @Override
    public final void H() {
        super.H();
        cv3 cv3Var = this.z1;
        if (cv3Var != null) {
            cv3Var.disable();
            this.z1 = null;
        }
    }

    public final a69 H0(boolean z, float f) {
        me8 me8Var;
        xl4 xl4Var;
        RectF rectF = new RectF();
        if (!z && (me8Var = this.M1) != null && (xl4Var = me8Var.e) != null) {
            xl4Var.g(rectF);
        } else {
            xl4.k(rectF, 1000, Math.round(1000.0f / f));
        }
        ?? obj = new Object();
        obj.a = rectF.left;
        obj.b = rectF.top;
        obj.c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public final boolean I0() {
        me8 me8Var = this.M1;
        if (me8Var != null && me8Var.g()) {
            return true;
        }
        return false;
    }

    public final void K0(View view, int i, int i2) {
        me8 a = fc3.b().a();
        if (a != null) {
            a.b();
        }
        this.N1 = view;
        this.O1 = i;
        this.P1 = i2;
        me8 k = fc3.b().k(this.Q1);
        this.M1 = k;
        k.i(this.s1, null, true);
    }

    public final void L0() {
        hyc hycVar = this.m1;
        View aspectRatioView = hycVar.getAspectRatioView();
        int[] iArr = this.y1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - Q();
        if (!hycVar.f() && !this.I1) {
            TextureView textureView = hycVar.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = hycVar.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = hycVar.getControlsView();
        if (controlsView.getParent() == this.c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final void Z(Configuration configuration) {
        hyc hycVar = this.m1;
        if (hycVar.getVisibility() == 0 && hycVar.x && !hycVar.f()) {
            int i = configuration.orientation;
            boolean z = hycVar.U;
            if (i == 2) {
                if (!z && !z) {
                    hycVar.U = true;
                    hycVar.m();
                    hycVar.l(false);
                }
            } else if (z && z) {
                hycVar.U = false;
                hycVar.m();
                hycVar.l(false);
            }
        }
    }

    @Override
    public final void a0() {
        int i = this.J1;
        if (i != 0) {
            int i2 = i - 1;
            this.J1 = i2;
            if (i2 == 0) {
                hyc hycVar = this.m1;
                TextureView textureView = hycVar.d;
                ImageView imageView = hycVar.e;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap a = lc1.a(width, height);
                        hycVar.h = a;
                        hycVar.n.getBitmap(a);
                    } catch (Throwable th) {
                        Bitmap bitmap = hycVar.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            hycVar.h = null;
                        }
                        cc4.g(th, true);
                    }
                    if (hycVar.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(hycVar.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                E0();
                return;
            }
            this.c.invalidate();
        }
    }

    @Override
    public final void d0(float f) {
        L0();
    }

    @Override
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        if (view == this.m1.getControlsView()) {
            L0();
            return false;
        }
        return false;
    }

    @Override
    public final boolean i0(View view, int i, int i2) {
        int L;
        hyc hycVar = this.m1;
        if (view == hycVar.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = hycVar.getMeasuredWidth();
            int measuredHeight = hycVar.getAspectRatioView().getMeasuredHeight();
            if (hycVar.U) {
                L = 0;
            } else {
                L = hl.L(10.0f);
            }
            layoutParams.height = measuredHeight + L;
        }
        return false;
    }
}
