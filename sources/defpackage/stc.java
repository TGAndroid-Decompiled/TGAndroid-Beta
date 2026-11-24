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
public final class stc extends ViewGroup implements ibc, AudioManager.OnAudioFocusChangeListener {
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
    public final lbc a;
    public boolean a0;
    public final nz7 b;
    public final RadialProgressView b0;
    public final m88 c;
    public final ImageView c0;
    public final TextureView d;
    public final ImageView d0;
    public final ImageView e;
    public final ImageView e0;
    public final ViewGroup f;
    public AnimatorSet f0;
    public final otc g0;
    public Bitmap h;
    public int h0;
    public int i0;
    public final ltc j0;
    public final up5 k0;
    public final ltc l0;
    public TextureView n;
    public byte r;
    public boolean s;
    public final ptc w;
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

    public stc(Activity activity, boolean z, ptc ptcVar) {
        super(activity);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.j0 = new ltc(this, (byte) 0);
        this.k0 = new up5(this, (byte) 6);
        this.l0 = new ltc(this, (byte) 1);
        setWillNotDraw(false);
        this.w = ptcVar;
        paint.setColor(-16777216);
        m88 m88Var = new m88((byte) 2, activity, this);
        this.c = m88Var;
        addView(m88Var, nme.e(-1, -1, 17));
        nz7 nz7Var = new nz7(activity, activity);
        this.b = nz7Var;
        final dkc dkcVar = new dkc(this, (byte) 5);
        nz7Var.addJavascriptInterface(new Object(dkcVar) {
            public final dkc a;

            {
                this.a = dkcVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                stc stcVar = (stc) this.a.b;
                AsyncTask asyncTask = stcVar.S;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = stcVar.S;
                    if (asyncTask2 instanceof rtc) {
                        rtc rtcVar = (rtc) asyncTask2;
                        int i = rtc.f;
                        String[] strArr = rtcVar.c;
                        String str2 = strArr[0];
                        String str3 = rtcVar.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        rtcVar.b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = nz7Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup h = ptcVar.h();
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
            m88Var.addView(textureView, nme.e(-1, -1, 17));
        }
        lbc lbcVar = new lbc();
        this.a = lbcVar;
        lbcVar.K = this;
        lbcVar.z0(textureView);
        otc otcVar = new otc(this, activity);
        this.g0 = otcVar;
        if (h != null) {
            h.addView(otcVar);
        } else {
            addView(otcVar, nme.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, nme.e(48, 48, 17));
        ImageView imageView2 = new ImageView(activity);
        this.c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        otcVar.addView(imageView2, nme.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final stc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                stc stcVar = this.b;
                switch (b) {
                    case 0:
                        if (stcVar.x && !stcVar.T && !stcVar.a0 && stcVar.N) {
                            stcVar.U = !stcVar.U;
                            stcVar.l(true);
                            return;
                        }
                        return;
                    case 1:
                        lbc lbcVar2 = stcVar.a;
                        if (stcVar.x && stcVar.y != null) {
                            if (lbcVar2.d == null) {
                                stcVar.i();
                            }
                            if (lbcVar2.c0()) {
                                lbcVar2.f0();
                            } else {
                                stcVar.W = false;
                                lbcVar2.g0();
                            }
                            stcVar.n();
                            return;
                        }
                        return;
                    default:
                        ViewGroup viewGroup = stcVar.f;
                        boolean z2 = stcVar.J;
                        ptc ptcVar2 = stcVar.w;
                        otc otcVar2 = stcVar.g0;
                        m88 m88Var2 = stcVar.c;
                        TextureView textureView2 = stcVar.d;
                        if (textureView2 != null && ptcVar2.i() && !stcVar.T && !stcVar.a0 && stcVar.N) {
                            stcVar.a0 = true;
                            if (!stcVar.V) {
                                stcVar.U = false;
                                ptcVar2.a(true, stcVar.l0, m88Var2.getAspectRatio(), z2);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) m88Var2.getParent();
                            if (viewGroup2 != stcVar) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(m88Var2);
                                }
                                stcVar.addView(m88Var2, 0, nme.e(-1, -1, 17));
                                m88Var2.measure(View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredHeight() - gl.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = stcVar.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                stcVar.h = null;
                            }
                            stcVar.T = true;
                            stcVar.V = false;
                            stcVar.n();
                            stcVar.o();
                            stcVar.k();
                            stcVar.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                m88Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) otcVar2.getParent();
                            if (viewGroup3 != stcVar) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(otcVar2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(otcVar2);
                                } else {
                                    stcVar.addView(otcVar2, 1);
                                }
                            }
                            otcVar2.d(false, false);
                            ptcVar2.a(false, null, m88Var2.getAspectRatio(), z2);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(activity);
        this.d0 = imageView3;
        imageView3.setScaleType(scaleType);
        otcVar.addView(imageView3, nme.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final stc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                stc stcVar = this.b;
                switch (b) {
                    case 0:
                        if (stcVar.x && !stcVar.T && !stcVar.a0 && stcVar.N) {
                            stcVar.U = !stcVar.U;
                            stcVar.l(true);
                            return;
                        }
                        return;
                    case 1:
                        lbc lbcVar2 = stcVar.a;
                        if (stcVar.x && stcVar.y != null) {
                            if (lbcVar2.d == null) {
                                stcVar.i();
                            }
                            if (lbcVar2.c0()) {
                                lbcVar2.f0();
                            } else {
                                stcVar.W = false;
                                lbcVar2.g0();
                            }
                            stcVar.n();
                            return;
                        }
                        return;
                    default:
                        ViewGroup viewGroup = stcVar.f;
                        boolean z2 = stcVar.J;
                        ptc ptcVar2 = stcVar.w;
                        otc otcVar2 = stcVar.g0;
                        m88 m88Var2 = stcVar.c;
                        TextureView textureView2 = stcVar.d;
                        if (textureView2 != null && ptcVar2.i() && !stcVar.T && !stcVar.a0 && stcVar.N) {
                            stcVar.a0 = true;
                            if (!stcVar.V) {
                                stcVar.U = false;
                                ptcVar2.a(true, stcVar.l0, m88Var2.getAspectRatio(), z2);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) m88Var2.getParent();
                            if (viewGroup2 != stcVar) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(m88Var2);
                                }
                                stcVar.addView(m88Var2, 0, nme.e(-1, -1, 17));
                                m88Var2.measure(View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredHeight() - gl.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = stcVar.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                stcVar.h = null;
                            }
                            stcVar.T = true;
                            stcVar.V = false;
                            stcVar.n();
                            stcVar.o();
                            stcVar.k();
                            stcVar.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                m88Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) otcVar2.getParent();
                            if (viewGroup3 != stcVar) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(otcVar2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(otcVar2);
                                } else {
                                    stcVar.addView(otcVar2, 1);
                                }
                            }
                            otcVar2.d(false, false);
                            ptcVar2.a(false, null, m88Var2.getAspectRatio(), z2);
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
            otcVar.addView(imageView4, nme.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final stc b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    stc stcVar = this.b;
                    switch (b) {
                        case 0:
                            if (stcVar.x && !stcVar.T && !stcVar.a0 && stcVar.N) {
                                stcVar.U = !stcVar.U;
                                stcVar.l(true);
                                return;
                            }
                            return;
                        case 1:
                            lbc lbcVar2 = stcVar.a;
                            if (stcVar.x && stcVar.y != null) {
                                if (lbcVar2.d == null) {
                                    stcVar.i();
                                }
                                if (lbcVar2.c0()) {
                                    lbcVar2.f0();
                                } else {
                                    stcVar.W = false;
                                    lbcVar2.g0();
                                }
                                stcVar.n();
                                return;
                            }
                            return;
                        default:
                            ViewGroup viewGroup = stcVar.f;
                            boolean z2 = stcVar.J;
                            ptc ptcVar2 = stcVar.w;
                            otc otcVar2 = stcVar.g0;
                            m88 m88Var2 = stcVar.c;
                            TextureView textureView2 = stcVar.d;
                            if (textureView2 != null && ptcVar2.i() && !stcVar.T && !stcVar.a0 && stcVar.N) {
                                stcVar.a0 = true;
                                if (!stcVar.V) {
                                    stcVar.U = false;
                                    ptcVar2.a(true, stcVar.l0, m88Var2.getAspectRatio(), z2);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) m88Var2.getParent();
                                if (viewGroup2 != stcVar) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(m88Var2);
                                    }
                                    stcVar.addView(m88Var2, 0, nme.e(-1, -1, 17));
                                    m88Var2.measure(View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredHeight() - gl.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = stcVar.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    stcVar.h = null;
                                }
                                stcVar.T = true;
                                stcVar.V = false;
                                stcVar.n();
                                stcVar.o();
                                stcVar.k();
                                stcVar.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    m88Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) otcVar2.getParent();
                                if (viewGroup3 != stcVar) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(otcVar2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(otcVar2);
                                    } else {
                                        stcVar.addView(otcVar2, 1);
                                    }
                                }
                                otcVar2.d(false, false);
                                ptcVar2.a(false, null, m88Var2.getAspectRatio(), z2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stc.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stc.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
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
                fa4.g(e, true);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stc.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
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
        otc otcVar = this.g0;
        if (otcVar.getParent() != this) {
            otcVar.setVisibility(8);
        }
        this.w.e();
    }

    public final void i() {
        String str = this.y;
        if (str != null) {
            String str2 = this.F;
            lbc lbcVar = this.a;
            if (str2 != null) {
                lbcVar.k0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                lbcVar.i0(Uri.parse(str), this.E);
            }
            lbcVar.t0(this.s);
            int i = (lbcVar.U() > (-9223372036854775807L) ? 1 : (lbcVar.U() == (-9223372036854775807L) ? 0 : -1));
            otc otcVar = this.g0;
            if (i != 0) {
                otcVar.b((int) (lbcVar.U() / 1000));
            } else {
                otcVar.b(0);
            }
            k();
            o();
            m();
            otcVar.invalidate();
            int i2 = this.P;
            if (i2 != -1) {
                lbcVar.p0(i2 * 1000, false);
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
            this.f0.addListener(new yoc(this, (byte) 2));
            this.f0.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        radialProgressView.setAlpha(f);
    }

    public final void k() {
        y54 y54Var = this.a.d;
        ImageView imageView = this.c0;
        if (y54Var != null && !this.V) {
            imageView.setVisibility(0);
            if (!this.U) {
                imageView.setImageResource(2131231276);
                imageView.setLayoutParams(nme.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231453);
            imageView.setLayoutParams(nme.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        m88 m88Var = this.c;
        if (viewGroup2 == null) {
            this.T = true;
            if (!this.U) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    m88Var.addView(textureView);
                }
            }
            boolean z2 = this.U;
            otc otcVar = this.g0;
            if (z2) {
                ViewGroup viewGroup3 = (ViewGroup) otcVar.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(otcVar);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) otcVar.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(otcVar);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(otcVar);
                    } else {
                        addView(otcVar, 1);
                    }
                }
            }
            TextureView b = this.w.b(this.g0, this.U, m88Var.getAspectRatio(), m88Var.getVideoRotation(), z);
            this.n = b;
            b.setVisibility(4);
            if (this.U && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i = otc.J;
            otcVar.a();
            return;
        }
        if (this.U) {
            ViewGroup viewGroup5 = (ViewGroup) m88Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(m88Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) m88Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(m88Var);
                }
                addView(m88Var, 0);
            }
        }
        this.w.b(this.g0, this.U, m88Var.getAspectRatio(), m88Var.getVideoRotation(), z);
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
            imageView.setLayoutParams(nme.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(nme.e(56, 50, 53));
        }
    }

    public final void n() {
        int i;
        int i2;
        int i3;
        otc otcVar = this.g0;
        int i4 = otc.J;
        otcVar.a();
        gl.r(this.j0);
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
        gl.e3(this.j0, 500L);
        if (!this.K) {
            this.K = true;
            ((AudioManager) a.b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i) {
        gl.d3(new on7(this, i, (byte) 29));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(10.0f), this.R);
    }

    @Override
    public final void onError(lbc lbcVar, Exception exc) {
        fa4.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        m88 m88Var = this.c;
        int measuredWidth = (i5 - m88Var.getMeasuredWidth()) / 2;
        int i6 = i4 - i2;
        int L = ((i6 - gl.L(10.0f)) - m88Var.getMeasuredHeight()) / 2;
        m88Var.layout(measuredWidth, L, m88Var.getMeasuredWidth() + measuredWidth, m88Var.getMeasuredHeight() + L);
        otc otcVar = this.g0;
        if (otcVar.getParent() == this) {
            otcVar.layout(0, 0, otcVar.getMeasuredWidth(), otcVar.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.b0;
        int measuredWidth2 = (i5 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i6 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        otcVar.a.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(10.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - gl.L(10.0f), 1073741824));
        otc otcVar = this.g0;
        if (otcVar.getParent() == this) {
            otcVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.b0.measure(View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), 1073741824));
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
        otc otcVar = this.g0;
        lbc lbcVar = this.a;
        if (i != 2) {
            if (lbcVar.U() != -9223372036854775807L) {
                otcVar.b((int) (lbcVar.U() / 1000));
            } else {
                otcVar.b(0);
            }
        }
        ptc ptcVar = this.w;
        if (i != 4 && i != 1 && lbcVar.c0()) {
            ptcVar.g(this, true);
        } else {
            ptcVar.g(this, false);
        }
        if (lbcVar.c0() && i != 4) {
            n();
        } else if (i == 4) {
            this.W = true;
            lbcVar.f0();
            lbcVar.p0(0L, false);
            n();
            otcVar.d(true, true);
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
        m88 m88Var = this.c;
        if (m88Var != null) {
            float f3 = i * f;
            this.h0 = (int) f3;
            this.i0 = i2;
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = f3 / i2;
            }
            m88Var.a(f2, 0);
            if (this.U) {
                this.w.d(f2);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    public final void o() {
    }

    @Override
    public final void onSeekFinished(tj tjVar) {
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
    }
}
