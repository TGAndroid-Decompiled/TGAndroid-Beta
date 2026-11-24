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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class ou3 extends fx0 {
    public static ou3 R1;
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
    public final ju3 L1;
    public xa8 M1;
    public View N1;
    public int O1;
    public int P1;
    public final i4d Q1;
    public final ku3 l1;
    public final stc m1;
    public View n1;
    public final FrameLayout o1;
    public WebChromeClient.CustomViewCallback p1;
    public final View q1;
    public final RadialProgressView r1;
    public final Activity s1;
    public final LinearLayout t1;
    public final TextView u1;
    public final yc v1;
    public final ImageView w1;
    public boolean x1;
    public final int[] y1;
    public iu3 z1;

    public ou3(Activity activity, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        super(activity, false);
        float f;
        byte b;
        this.y1 = new int[2];
        this.F1 = -2;
        this.L1 = new ju3(this);
        this.Q1 = new i4d(this);
        this.V = true;
        this.v0 = false;
        this.w0 = false;
        this.K1 = i3;
        if (ug8.A(activity)) {
            this.s1 = activity;
        }
        this.E1 = str4;
        boolean z = str2 != null && str2.length() > 0;
        this.D1 = z;
        this.C1 = str3;
        this.A1 = i;
        this.B1 = i2;
        if (i == 0 || i2 == 0) {
            Point point = gl.q;
            this.A1 = point.x;
            this.B1 = point.y / 2;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.o1 = frameLayout;
        frameLayout.setKeepScreenOn(true);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnTouchListener(new jz1((byte) 7));
        this.c.addView(frameLayout, nme.c(-1.0f, -1));
        frameLayout.setVisibility(4);
        yc ycVar = new yc((byte) 17, activity, this);
        this.v1 = ycVar;
        ycVar.setOnTouchListener(new jz1((byte) 8));
        this.O = ycVar;
        ku3 ku3Var = new ku3(this, activity, activity, (byte) 0);
        this.l1 = ku3Var;
        ku3Var.getSettings().setJavaScriptEnabled(true);
        ku3Var.getSettings().setDomStorageEnabled(true);
        ku3Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ku3Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ku3Var, true);
        ku3Var.setWebChromeClient(new ru(this, (byte) 1));
        ku3Var.setWebViewClient(new su(this, (byte) 1));
        ycVar.addView(ku3Var, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 84));
        stc stcVar = new stc(activity, true, new lu3(this));
        this.m1 = stcVar;
        stcVar.setVisibility(4);
        ycVar.addView(stcVar, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 74));
        View view = new View(activity);
        this.q1 = view;
        view.setBackgroundColor(-16777216);
        view.setVisibility(4);
        ycVar.addView(view, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, (z ? 22 : 0) + 84));
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.r1 = radialProgressView;
        radialProgressView.setVisibility(4);
        ycVar.addView(radialProgressView, nme.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, ((z ? 22 : 0) + 84) / 2));
        if (z) {
            TextView textView = new TextView(activity);
            f = 18.0f;
            textView.setTextSize(1, 16.0f);
            zkb.X(textView, bkb.i5, null);
            textView.setText(str2);
            textView.setSingleLine(true);
            textView.setTypeface(gl.o());
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
            ycVar.addView(textView, nme.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        } else {
            f = 18.0f;
        }
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.o5, null);
        textView2.setText(str);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(gl.L(f), 0, gl.L(f), 0);
        ycVar.addView(textView2, nme.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 57.0f));
        View view2 = new View(activity);
        zkb.h(bkb.J5, null, view2);
        ycVar.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
        ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = gl.L(48.0f);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        zkb.h(bkb.g5, null, frameLayout2);
        ycVar.addView(frameLayout2, nme.e(-1, 48, 83));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        frameLayout2.addView(linearLayout, nme.e(-2, -1, 53));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(1, 14.0f);
        int i4 = bkb.n5;
        zkb.X(textView3, i4, null);
        textView3.setGravity(17);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        int i5 = bkb.H5;
        ff0 f0 = bkb.f0(bkb.w0(null, i5, false), 0, -1);
        vkb M = zkb.M(i5);
        textView3.setBackground(f0);
        zkb.j(textView3, f0, null, M, null);
        textView3.setPadding(gl.L(f), 0, gl.L(f), 0);
        textView3.setText(k96.M0(2131752029, null).toUpperCase());
        textView3.setTypeface(gl.o());
        frameLayout2.addView(textView3, nme.r(-2, -1, 51));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final ou3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b2 = r2;
                ou3 ou3Var = this.b;
                switch (b2) {
                    case 0:
                        ou3Var.dismiss();
                        return;
                    case 1:
                        ku3 ku3Var2 = ou3Var.l1;
                        xa8 a = mb3.c().a();
                        if (a != null) {
                            a.b();
                            Objects.requireNonNull(view3);
                            gl.d3(new uc(view3, (byte) 2), 300L);
                            return;
                        } else if (ou3Var.r1.getVisibility() != 0) {
                            ou3Var.J0(ku3Var2, ou3Var.A1, ou3Var.B1);
                            if (ou3Var.x1) {
                                ku3Var2.evaluateJavascript("hideControls();", null);
                            }
                            ou3Var.b.setTranslationY(0.0f);
                            ou3Var.I();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ou3Var.C1));
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        Activity activity2 = ou3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k93((byte) 22));
                        }
                        ou3Var.dismiss();
                        return;
                    default:
                        d01.t(ou3Var.s1, ou3Var.C1);
                        ou3Var.dismiss();
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.t1 = linearLayout2;
        linearLayout2.setVisibility(4);
        frameLayout2.addView(linearLayout2, nme.e(-2, -1, 17));
        ImageView imageView = new ImageView(activity);
        this.w1 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231277);
        imageView.setContentDescription(k96.M0(2131754807, null));
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView, i4, null, mode);
        ff0 f02 = bkb.f0(bkb.w0(null, i5, false), 0, -1);
        vkb M2 = zkb.M(i5);
        imageView.setBackground(f02);
        zkb.j(imageView, f02, null, M2, null);
        linearLayout2.addView(imageView, nme.d(48, 48.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ou3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b2 = r2;
                ou3 ou3Var = this.b;
                switch (b2) {
                    case 0:
                        ou3Var.dismiss();
                        return;
                    case 1:
                        ku3 ku3Var2 = ou3Var.l1;
                        xa8 a = mb3.c().a();
                        if (a != null) {
                            a.b();
                            Objects.requireNonNull(view3);
                            gl.d3(new uc(view3, (byte) 2), 300L);
                            return;
                        } else if (ou3Var.r1.getVisibility() != 0) {
                            ou3Var.J0(ku3Var2, ou3Var.A1, ou3Var.B1);
                            if (ou3Var.x1) {
                                ku3Var2.evaluateJavascript("hideControls();", null);
                            }
                            ou3Var.b.setTranslationY(0.0f);
                            ou3Var.I();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ou3Var.C1));
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        Activity activity2 = ou3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k93((byte) 22));
                        }
                        ou3Var.dismiss();
                        return;
                    default:
                        d01.t(ou3Var.s1, ou3Var.C1);
                        ou3Var.dismiss();
                        return;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final ou3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b2 = r2;
                ou3 ou3Var = this.b;
                switch (b2) {
                    case 0:
                        ou3Var.dismiss();
                        return;
                    case 1:
                        ku3 ku3Var2 = ou3Var.l1;
                        xa8 a = mb3.c().a();
                        if (a != null) {
                            a.b();
                            Objects.requireNonNull(view3);
                            gl.d3(new uc(view3, (byte) 2), 300L);
                            return;
                        } else if (ou3Var.r1.getVisibility() != 0) {
                            ou3Var.J0(ku3Var2, ou3Var.A1, ou3Var.B1);
                            if (ou3Var.x1) {
                                ku3Var2.evaluateJavascript("hideControls();", null);
                            }
                            ou3Var.b.setTranslationY(0.0f);
                            ou3Var.I();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ou3Var.C1));
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        Activity activity2 = ou3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k93((byte) 22));
                        }
                        ou3Var.dismiss();
                        return;
                    default:
                        d01.t(ou3Var.s1, ou3Var.C1);
                        ou3Var.dismiss();
                        return;
                }
            }
        };
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232108);
        imageView2.setContentDescription(k96.M0(2131751750, null));
        zkb.s(imageView2, i4, null, mode);
        ff0 f03 = bkb.f0(bkb.w0(null, i5, false), 0, -1);
        vkb M3 = zkb.M(i5);
        imageView2.setBackground(f03);
        zkb.j(imageView2, f03, null, M3, null);
        linearLayout2.addView(imageView2, nme.e(48, 48, 51));
        imageView2.setOnClickListener(onClickListener);
        TextView textView4 = new TextView(activity);
        this.u1 = textView4;
        textView4.setTextSize(1, 14.0f);
        zkb.X(textView4, i4, null);
        textView4.setGravity(17);
        textView4.setSingleLine(true);
        textView4.setEllipsize(truncateAt);
        ff0 f04 = bkb.f0(bkb.w0(null, i5, false), 0, -1);
        vkb M4 = zkb.M(i5);
        textView4.setBackground(f04);
        zkb.j(textView4, f04, null, M4, null);
        textView4.setPadding(gl.L(f), 0, gl.L(f), 0);
        textView4.setText(k96.M0(2131751755, null).toUpperCase());
        textView4.setTypeface(gl.o());
        linearLayout.addView(textView4, nme.e(-2, -1, 51));
        textView4.setOnClickListener(onClickListener);
        TextView textView5 = new TextView(activity);
        textView5.setTextSize(1, 14.0f);
        zkb.X(textView5, i4, null);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        ff0 f05 = bkb.f0(bkb.w0(null, i5, false), 0, -1);
        vkb M5 = zkb.M(i5);
        textView5.setBackground(f05);
        zkb.j(textView5, f05, null, M5, null);
        textView5.setPadding(gl.L(f), 0, gl.L(f), 0);
        textView5.setText(k96.M0(2131747605, null).toUpperCase());
        textView5.setTypeface(gl.o());
        linearLayout.addView(textView5, nme.e(-2, -1, 51));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final ou3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b2 = r2;
                ou3 ou3Var = this.b;
                switch (b2) {
                    case 0:
                        ou3Var.dismiss();
                        return;
                    case 1:
                        ku3 ku3Var2 = ou3Var.l1;
                        xa8 a = mb3.c().a();
                        if (a != null) {
                            a.b();
                            Objects.requireNonNull(view3);
                            gl.d3(new uc(view3, (byte) 2), 300L);
                            return;
                        } else if (ou3Var.r1.getVisibility() != 0) {
                            ou3Var.J0(ku3Var2, ou3Var.A1, ou3Var.B1);
                            if (ou3Var.x1) {
                                ku3Var2.evaluateJavascript("hideControls();", null);
                            }
                            ou3Var.b.setTranslationY(0.0f);
                            ou3Var.I();
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        try {
                            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ou3Var.C1));
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        Activity activity2 = ou3Var.s1;
                        if (activity2 instanceof LaunchActivity) {
                            ((LaunchActivity) activity2).H0(new k93((byte) 22));
                        }
                        ou3Var.dismiss();
                        return;
                    default:
                        d01.t(ou3Var.s1, ou3Var.C1);
                        ou3Var.dismiss();
                        return;
                }
            }
        });
        boolean z2 = stc.a(str4) || stc.a(str3);
        stcVar.setVisibility(z2 ? 0 : 4);
        if (z2) {
            otc otcVar = stcVar.g0;
            otcVar.setVisibility(4);
            b = 0;
            otcVar.d(false, false);
            stcVar.j(true, false);
        } else {
            b = 0;
        }
        this.z0 = new mu3(this, z2);
        this.z1 = new iu3(b, a.b, this);
        String e = stc.e(str4);
        if (e != null || !z2) {
            radialProgressView.setVisibility(b);
            ku3Var.setVisibility(b);
            linearLayout2.setVisibility(b);
            if (e != null) {
                view.setVisibility(b);
            }
            textView4.setVisibility(4);
            ku3Var.setKeepScreenOn(true);
            stcVar.setVisibility(4);
            stcVar.getControlsView().setVisibility(4);
            stcVar.getTextureView().setVisibility(4);
            if (stcVar.getTextureImageView() != null) {
                stcVar.getTextureImageView().setVisibility(4);
            }
            if (e != null && "disabled".equals(na7.q1(this.a).k4.I0.f)) {
                imageView.setVisibility(8);
            }
        }
        boolean canDetectOrientation = this.z1.canDetectOrientation();
        iu3 iu3Var = this.z1;
        if (canDetectOrientation) {
            iu3Var.enable();
        } else {
            iu3Var.disable();
            this.z1 = null;
        }
        R1 = this;
    }

    public static void I0(d dVar, k27 k27Var, i98 i98Var, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z) {
        String str5;
        TLRPC.MessageMedia messageMedia;
        ou3 ou3Var = R1;
        if (ou3Var != null) {
            ou3Var.E0();
        }
        if (k27Var != null && (messageMedia = k27Var.k.media) != null && messageMedia.webpage != null) {
            str5 = stc.e(str4);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            PhotoViewer.r0().T1(null, dVar, null);
            PhotoViewer.r0().n1(k27Var, null, null, null, null, null, null, 0, i98Var, null, 0L, 0L, 0L, true, null, Integer.valueOf(i3));
            return;
        }
        ou3 ou3Var2 = new ou3(dVar.getParentActivity(), str, str2, str3, str4, i, i2, i3);
        ou3Var2.i0 = z;
        ou3Var2.n = z;
        ou3Var2.show();
    }

    @Override
    public final boolean D() {
        stc stcVar = this.m1;
        if (stcVar.getVisibility() == 0 && stcVar.U) {
            return false;
        }
        return true;
    }

    public final void D0() {
        xa8 xa8Var = this.M1;
        if (xa8Var != null) {
            this.M1 = null;
            xa8Var.a(new bm0((byte) 10));
            xa8Var.g();
        }
    }

    @Override
    public final boolean E() {
        if (this.o1.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    public final void E0() {
        ku3 ku3Var = this.l1;
        if (ku3Var != null && ku3Var.getVisibility() == 0) {
            this.v1.removeView(ku3Var);
            ku3Var.stopLoading();
            ku3Var.loadUrl("about:blank");
            ku3Var.destroy();
        }
        xa8 xa8Var = this.M1;
        if (xa8Var != null) {
            this.M1 = null;
            xa8Var.b();
        }
        stc stcVar = this.m1;
        if (stcVar != null) {
            stcVar.b();
        }
        R1 = null;
        I();
    }

    public final void F0() {
        int i;
        ImageView imageView;
        if (this.l1 != null && H0()) {
            if (this.N1 != this.l1) {
                stc stcVar = this.m1;
                if (stcVar.V && (imageView = stcVar.e0) != null) {
                    imageView.callOnClick();
                    return;
                }
                return;
            }
            if (a.x) {
                try {
                    this.s1.startService(new Intent(a.b, BringAppForegroundService.class));
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            }
            if (this.x1) {
                this.l1.evaluateJavascript("showControls();", null);
            }
            ViewGroup viewGroup = (ViewGroup) this.l1.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.l1);
            }
            yc ycVar = this.v1;
            ku3 ku3Var = this.l1;
            if (this.D1) {
                i = 22;
            } else {
                i = 0;
            }
            ycVar.addView(ku3Var, 0, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i + 84));
            this.f0 = true;
            show();
            D0();
        }
    }

    public final l29 G0(boolean z, float f) {
        xa8 xa8Var;
        sj4 sj4Var;
        RectF rectF = new RectF();
        if (!z && (xa8Var = this.M1) != null && (sj4Var = xa8Var.e) != null) {
            sj4Var.g(rectF);
        } else {
            sj4.j(rectF, 1000, Math.round(1000.0f / f));
        }
        ?? obj = new Object();
        obj.a = rectF.left;
        obj.b = rectF.top;
        obj.c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public final boolean H0() {
        xa8 xa8Var = this.M1;
        if (xa8Var != null && xa8Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void I() {
        super.I();
        iu3 iu3Var = this.z1;
        if (iu3Var != null) {
            iu3Var.disable();
            this.z1 = null;
        }
    }

    public final void J0(View view, int i, int i2) {
        xa8 a = mb3.c().a();
        if (a != null) {
            a.b();
        }
        this.N1 = view;
        this.O1 = i;
        this.P1 = i2;
        xa8 k = mb3.c().k(this.Q1);
        this.M1 = k;
        k.h(this.s1, null, true);
    }

    public final void K0() {
        stc stcVar = this.m1;
        View aspectRatioView = stcVar.getAspectRatioView();
        int[] iArr = this.y1;
        aspectRatioView.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - R();
        if (!stcVar.f() && !this.I1) {
            TextureView textureView = stcVar.getTextureView();
            textureView.setTranslationX(iArr[0]);
            textureView.setTranslationY(iArr[1]);
            ImageView textureImageView = stcVar.getTextureImageView();
            if (textureImageView != null) {
                textureImageView.setTranslationX(iArr[0]);
                textureImageView.setTranslationY(iArr[1]);
            }
        }
        View controlsView = stcVar.getControlsView();
        if (controlsView.getParent() == this.c) {
            controlsView.setTranslationY(iArr[1]);
        } else {
            controlsView.setTranslationY(0.0f);
        }
    }

    @Override
    public final void Z(Configuration configuration) {
        stc stcVar = this.m1;
        if (stcVar.getVisibility() == 0 && stcVar.x && !stcVar.f()) {
            int i = configuration.orientation;
            boolean z = stcVar.U;
            if (i == 2) {
                if (!z && !z) {
                    stcVar.U = true;
                    stcVar.m();
                    stcVar.l(false);
                }
            } else if (z && z) {
                stcVar.U = false;
                stcVar.m();
                stcVar.l(false);
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
                stc stcVar = this.m1;
                TextureView textureView = stcVar.d;
                ImageView imageView = stcVar.e;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap a = dc1.a(width, height);
                        stcVar.h = a;
                        stcVar.n.getBitmap(a);
                    } catch (Throwable th) {
                        Bitmap bitmap = stcVar.h;
                        if (bitmap != null) {
                            bitmap.recycle();
                            stcVar.h = null;
                        }
                        fa4.g(th, true);
                    }
                    if (stcVar.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(stcVar.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                D0();
                return;
            }
            this.c.invalidate();
        }
    }

    @Override
    public final void d0(float f) {
        K0();
    }

    @Override
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        if (view == this.m1.getControlsView()) {
            K0();
            return false;
        }
        return false;
    }

    @Override
    public final boolean i0(View view, int i, int i2) {
        int L;
        stc stcVar = this.m1;
        if (view == stcVar.getControlsView()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = stcVar.getMeasuredWidth();
            int measuredHeight = stcVar.getAspectRatioView().getMeasuredHeight();
            if (stcVar.U) {
                L = 0;
            } else {
                L = gl.L(10.0f);
            }
            layoutParams.height = measuredHeight + L;
        }
        return false;
    }
}
