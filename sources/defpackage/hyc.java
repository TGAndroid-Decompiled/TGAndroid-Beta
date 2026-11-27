package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.widget.ImageView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.a;
import org.telegram.ui.Components.RadialProgressView;
public final class hyc extends ViewGroup implements ifc, AudioManager.OnAudioFocusChangeListener {
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public float O;
    public int P;
    public boolean Q;
    public final Paint R;
    public AsyncTask S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final kfc a;
    public boolean a0;
    public final t28 b;
    public final RadialProgressView b0;
    public final dc8 c;
    public final ImageView c0;
    public final TextureView d;
    public final ImageView d0;
    public final ImageView e;
    public final ImageView e0;
    public final ViewGroup f;
    public AnimatorSet f0;
    public final dyc g0;
    public Bitmap h;
    public int h0;
    public int i0;
    public final ayc j0;
    public final wr5 k0;
    public final ayc l0;
    public TextureView n;
    public byte r;
    public boolean s;
    public final eyc w;
    public boolean x;
    public String y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern y0 = Pattern.compile("var\\s");
    public static final Pattern z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public hyc(Activity activity, boolean z, eyc eycVar) {
        super(activity);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.j0 = new ayc(this, (byte) 0);
        this.k0 = new wr5(this, (byte) 6);
        this.l0 = new ayc(this, (byte) 1);
        setWillNotDraw(false);
        this.w = eycVar;
        paint.setColor(-16777216);
        dc8 dc8Var = new dc8((byte) 1, activity, this);
        this.c = dc8Var;
        addView(dc8Var, tre.e(-1, -1, 17));
        t28 t28Var = new t28(activity, activity);
        this.b = t28Var;
        final ftb ftbVar = new ftb(this, (byte) 19);
        t28Var.addJavascriptInterface(new Object(ftbVar) {
            public final ftb a;

            {
                this.a = ftbVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                hyc hycVar = (hyc) this.a.b;
                AsyncTask asyncTask = hycVar.S;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = hycVar.S;
                    if (asyncTask2 instanceof gyc) {
                        gyc gycVar = (gyc) asyncTask2;
                        int i = gyc.f;
                        String[] strArr = gycVar.c;
                        String str2 = strArr[0];
                        String str3 = gycVar.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        gycVar.b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = t28Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup h = eycVar.h();
        this.f = h;
        TextureView textureView = new TextureView(activity);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (h != null) {
            h.addView(textureView);
            ImageView imageView = new ImageView(activity);
            this.e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            h.addView(imageView);
        } else {
            dc8Var.addView(textureView, tre.e(-1, -1, 17));
        }
        kfc kfcVar = new kfc();
        this.a = kfcVar;
        kfcVar.K = this;
        kfcVar.z0(textureView);
        dyc dycVar = new dyc(this, activity);
        this.g0 = dycVar;
        if (h != null) {
            h.addView(dycVar);
        } else {
            addView(dycVar, tre.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, tre.e(48, 48, 17));
        ImageView imageView2 = new ImageView(activity);
        this.c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        dycVar.addView(imageView2, tre.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final hyc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hyc hycVar = this.b;
                switch (b) {
                    case 0:
                        if (hycVar.x && !hycVar.T && !hycVar.a0 && hycVar.N) {
                            hycVar.U = !hycVar.U;
                            hycVar.l(true);
                            return;
                        }
                        return;
                    case 1:
                        kfc kfcVar2 = hycVar.a;
                        if (hycVar.x && hycVar.y != null) {
                            if (kfcVar2.d == null) {
                                hycVar.i();
                            }
                            if (kfcVar2.c0()) {
                                kfcVar2.f0();
                            } else {
                                hycVar.W = false;
                                kfcVar2.g0();
                            }
                            hycVar.n();
                            return;
                        }
                        return;
                    default:
                        ViewGroup viewGroup = hycVar.f;
                        boolean z2 = hycVar.J;
                        eyc eycVar2 = hycVar.w;
                        dyc dycVar2 = hycVar.g0;
                        dc8 dc8Var2 = hycVar.c;
                        TextureView textureView2 = hycVar.d;
                        if (textureView2 != null && eycVar2.i() && !hycVar.T && !hycVar.a0 && hycVar.N) {
                            hycVar.a0 = true;
                            if (!hycVar.V) {
                                hycVar.U = false;
                                eycVar2.a(true, hycVar.l0, dc8Var2.getAspectRatio(), z2);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) dc8Var2.getParent();
                            if (viewGroup2 != hycVar) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(dc8Var2);
                                }
                                hycVar.addView(dc8Var2, 0, tre.e(-1, -1, 17));
                                dc8Var2.measure(View.MeasureSpec.makeMeasureSpec(hycVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hycVar.getMeasuredHeight() - hl.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = hycVar.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                hycVar.h = null;
                            }
                            hycVar.T = true;
                            hycVar.V = false;
                            hycVar.n();
                            hycVar.o();
                            hycVar.k();
                            hycVar.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                dc8Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) dycVar2.getParent();
                            if (viewGroup3 != hycVar) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(dycVar2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(dycVar2);
                                } else {
                                    hycVar.addView(dycVar2, 1);
                                }
                            }
                            dycVar2.d(false, false);
                            eycVar2.a(false, null, dc8Var2.getAspectRatio(), z2);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(activity);
        this.d0 = imageView3;
        imageView3.setScaleType(scaleType);
        dycVar.addView(imageView3, tre.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final hyc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hyc hycVar = this.b;
                switch (b) {
                    case 0:
                        if (hycVar.x && !hycVar.T && !hycVar.a0 && hycVar.N) {
                            hycVar.U = !hycVar.U;
                            hycVar.l(true);
                            return;
                        }
                        return;
                    case 1:
                        kfc kfcVar2 = hycVar.a;
                        if (hycVar.x && hycVar.y != null) {
                            if (kfcVar2.d == null) {
                                hycVar.i();
                            }
                            if (kfcVar2.c0()) {
                                kfcVar2.f0();
                            } else {
                                hycVar.W = false;
                                kfcVar2.g0();
                            }
                            hycVar.n();
                            return;
                        }
                        return;
                    default:
                        ViewGroup viewGroup = hycVar.f;
                        boolean z2 = hycVar.J;
                        eyc eycVar2 = hycVar.w;
                        dyc dycVar2 = hycVar.g0;
                        dc8 dc8Var2 = hycVar.c;
                        TextureView textureView2 = hycVar.d;
                        if (textureView2 != null && eycVar2.i() && !hycVar.T && !hycVar.a0 && hycVar.N) {
                            hycVar.a0 = true;
                            if (!hycVar.V) {
                                hycVar.U = false;
                                eycVar2.a(true, hycVar.l0, dc8Var2.getAspectRatio(), z2);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) dc8Var2.getParent();
                            if (viewGroup2 != hycVar) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(dc8Var2);
                                }
                                hycVar.addView(dc8Var2, 0, tre.e(-1, -1, 17));
                                dc8Var2.measure(View.MeasureSpec.makeMeasureSpec(hycVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hycVar.getMeasuredHeight() - hl.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = hycVar.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                hycVar.h = null;
                            }
                            hycVar.T = true;
                            hycVar.V = false;
                            hycVar.n();
                            hycVar.o();
                            hycVar.k();
                            hycVar.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                dc8Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) dycVar2.getParent();
                            if (viewGroup3 != hycVar) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(dycVar2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(dycVar2);
                                } else {
                                    hycVar.addView(dycVar2, 1);
                                }
                            }
                            dycVar2.d(false, false);
                            eycVar2.a(false, null, dc8Var2.getAspectRatio(), z2);
                            return;
                        }
                        return;
                }
            }
        });
        if (z) {
            ImageView imageView4 = new ImageView(activity);
            this.e0 = imageView4;
            imageView4.setScaleType(scaleType);
            dycVar.addView(imageView4, tre.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final hyc b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    hyc hycVar = this.b;
                    switch (b) {
                        case 0:
                            if (hycVar.x && !hycVar.T && !hycVar.a0 && hycVar.N) {
                                hycVar.U = !hycVar.U;
                                hycVar.l(true);
                                return;
                            }
                            return;
                        case 1:
                            kfc kfcVar2 = hycVar.a;
                            if (hycVar.x && hycVar.y != null) {
                                if (kfcVar2.d == null) {
                                    hycVar.i();
                                }
                                if (kfcVar2.c0()) {
                                    kfcVar2.f0();
                                } else {
                                    hycVar.W = false;
                                    kfcVar2.g0();
                                }
                                hycVar.n();
                                return;
                            }
                            return;
                        default:
                            ViewGroup viewGroup = hycVar.f;
                            boolean z2 = hycVar.J;
                            eyc eycVar2 = hycVar.w;
                            dyc dycVar2 = hycVar.g0;
                            dc8 dc8Var2 = hycVar.c;
                            TextureView textureView2 = hycVar.d;
                            if (textureView2 != null && eycVar2.i() && !hycVar.T && !hycVar.a0 && hycVar.N) {
                                hycVar.a0 = true;
                                if (!hycVar.V) {
                                    hycVar.U = false;
                                    eycVar2.a(true, hycVar.l0, dc8Var2.getAspectRatio(), z2);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) dc8Var2.getParent();
                                if (viewGroup2 != hycVar) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(dc8Var2);
                                    }
                                    hycVar.addView(dc8Var2, 0, tre.e(-1, -1, 17));
                                    dc8Var2.measure(View.MeasureSpec.makeMeasureSpec(hycVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hycVar.getMeasuredHeight() - hl.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = hycVar.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    hycVar.h = null;
                                }
                                hycVar.T = true;
                                hycVar.V = false;
                                hycVar.n();
                                hycVar.o();
                                hycVar.k();
                                hycVar.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    dc8Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) dycVar2.getParent();
                                if (viewGroup3 != hycVar) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(dycVar2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(dycVar2);
                                    } else {
                                        hycVar.addView(dycVar2, 1);
                                    }
                                }
                                dycVar2.d(false, false);
                                eycVar2.a(false, null, dc8Var2.getAspectRatio(), z2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        n();
        k();
        m();
        o();
    }

    public static boolean a(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyc.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyc.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = o0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = m0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.g0;
    }

    private View getProgressView() {
        return this.b0;
    }

    public final void b() {
        this.a.l0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.b.stopLoading();
    }

    public final boolean f() {
        if (!this.V && !this.a0) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyc.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.c;
    }

    public View getControlsView() {
        return this.g0;
    }

    public ImageView getTextureImageView() {
        return this.e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        dyc dycVar = this.g0;
        if (dycVar.getParent() != this) {
            dycVar.setVisibility(8);
        }
        this.w.e();
    }

    public final void i() {
        String str = this.y;
        if (str != null) {
            String str2 = this.F;
            kfc kfcVar = this.a;
            if (str2 != null) {
                kfcVar.k0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                kfcVar.i0(Uri.parse(str), this.E);
            }
            kfcVar.t0(this.s);
            int i = (kfcVar.U() > (-9223372036854775807L) ? 1 : (kfcVar.U() == (-9223372036854775807L) ? 0 : -1));
            dyc dycVar = this.g0;
            if (i != 0) {
                dycVar.b((int) (kfcVar.U() / 1000));
            } else {
                dycVar.b(0);
            }
            k();
            o();
            m();
            dycVar.invalidate();
            int i2 = this.P;
            if (i2 != -1) {
                kfcVar.p0(i2 * 1000, false);
            }
        }
    }

    public final void j(boolean z, boolean z2) {
        float f = 0.0f;
        RadialProgressView radialProgressView = this.b0;
        if (z2) {
            AnimatorSet animatorSet = this.f0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f0 = animatorSet2;
            if (z) {
                f = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f));
            this.f0.setDuration(150L);
            this.f0.addListener(new ztc(this, (byte) 1));
            this.f0.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        radialProgressView.setAlpha(f);
    }

    public final void k() {
        s64 s64Var = this.a.d;
        ImageView imageView = this.c0;
        if (s64Var != null && !this.V) {
            imageView.setVisibility(0);
            if (!this.U) {
                imageView.setImageResource(2131231276);
                imageView.setLayoutParams(tre.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231453);
            imageView.setLayoutParams(tre.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
            return;
        }
        imageView.setVisibility(8);
    }

    public final void l(boolean z) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f;
        dc8 dc8Var = this.c;
        if (viewGroup2 == null) {
            this.T = true;
            if (!this.U) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    dc8Var.addView(textureView);
                }
            }
            boolean z2 = this.U;
            dyc dycVar = this.g0;
            if (z2) {
                ViewGroup viewGroup3 = (ViewGroup) dycVar.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(dycVar);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) dycVar.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(dycVar);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(dycVar);
                    } else {
                        addView(dycVar, 1);
                    }
                }
            }
            TextureView b = this.w.b(this.g0, this.U, dc8Var.getAspectRatio(), dc8Var.getVideoRotation(), z);
            this.n = b;
            b.setVisibility(4);
            if (this.U && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i = dyc.J;
            dycVar.a();
            return;
        }
        if (this.U) {
            ViewGroup viewGroup5 = (ViewGroup) dc8Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(dc8Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) dc8Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(dc8Var);
                }
                addView(dc8Var, 0);
            }
        }
        this.w.b(this.g0, this.U, dc8Var.getAspectRatio(), dc8Var.getVideoRotation(), z);
    }

    public final void m() {
        int i;
        int i2;
        ImageView imageView = this.e0;
        if (imageView == null) {
            return;
        }
        if (this.V) {
            i = 2131231277;
        } else {
            i = 2131231454;
        }
        imageView.setImageResource(i);
        if (this.a.d != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        if (this.V) {
            imageView.setLayoutParams(tre.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(tre.e(56, 50, 53));
        }
    }

    public final void n() {
        int i;
        int i2;
        int i3;
        dyc dycVar = this.g0;
        int i4 = dyc.J;
        dycVar.a();
        hl.r(this.j0);
        if (!this.a.c0()) {
            boolean z = this.W;
            ImageView imageView = this.d0;
            boolean z2 = this.V;
            if (z) {
                if (z2) {
                    i3 = 2131231255;
                } else {
                    i3 = 2131231254;
                }
                imageView.setImageResource(i3);
                return;
            }
            if (z2) {
                i2 = 2131231459;
            } else {
                i2 = 2131231457;
            }
            imageView.setImageResource(i2);
            return;
        }
        ImageView imageView2 = this.d0;
        if (this.V) {
            i = 2131231456;
        } else {
            i = 2131231455;
        }
        imageView2.setImageResource(i);
        hl.d3(this.j0, 500L);
        if (!this.K) {
            this.K = true;
            ((AudioManager) a.b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i) {
        hl.c3(new zsc(this, i, (byte) 2));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(10.0f), this.R);
    }

    @Override
    public final void onError(kfc kfcVar, Exception exc) {
        cc4.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        dc8 dc8Var = this.c;
        int measuredWidth = (i5 - dc8Var.getMeasuredWidth()) / 2;
        int i6 = i4 - i2;
        int L = ((i6 - hl.L(10.0f)) - dc8Var.getMeasuredHeight()) / 2;
        dc8Var.layout(measuredWidth, L, dc8Var.getMeasuredWidth() + measuredWidth, dc8Var.getMeasuredHeight() + L);
        dyc dycVar = this.g0;
        if (dycVar.getParent() == this) {
            dycVar.layout(0, 0, dycVar.getMeasuredWidth(), dycVar.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.b0;
        int measuredWidth2 = (i5 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i6 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        dycVar.a.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(10.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - hl.L(10.0f), 1073741824));
        dyc dycVar = this.g0;
        if (dycVar.getParent() == this) {
            dycVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.b0.measure(View.MeasureSpec.makeMeasureSpec(hl.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.g0.invalidate();
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        dyc dycVar = this.g0;
        kfc kfcVar = this.a;
        if (i != 2) {
            if (kfcVar.U() != -9223372036854775807L) {
                dycVar.b((int) (kfcVar.U() / 1000));
            } else {
                dycVar.b(0);
            }
        }
        eyc eycVar = this.w;
        if (i != 4 && i != 1 && kfcVar.c0()) {
            eycVar.g(this, true);
        } else {
            eycVar.g(this, false);
        }
        if (kfcVar.c0() && i != 4) {
            n();
        } else if (i == 4) {
            this.W = true;
            kfcVar.f0();
            kfcVar.p0(0L, false);
            n();
            dycVar.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.T) {
            this.T = false;
            if (this.U || this.V) {
                if (this.V) {
                    this.r = (byte) 1;
                }
                this.n.setSurfaceTexture(surfaceTexture);
                this.n.setSurfaceTextureListener(this.k0);
                this.n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.r == 2) {
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.a0 = false;
            int i = this.h0;
            int i2 = this.i0;
            this.c.getVideoRotation();
            this.w.f(this.g0, false, i, i2, this.J);
            this.r = (byte) 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        float f2;
        dc8 dc8Var = this.c;
        if (dc8Var != null) {
            float f3 = i * f;
            this.h0 = (int) f3;
            this.i0 = i2;
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = f3 / i2;
            }
            dc8Var.a(f2, 0);
            if (this.U) {
                this.w.d(f2);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    public final void o() {
    }

    @Override
    public final void onSeekFinished(uj ujVar) {
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
    }
}
