package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public final class wu6 extends ie {
    public static final short G0;
    public int A0;
    public Interpolator B0;
    public final Interpolator C0;
    public final Interpolator D0;
    public Button E;
    public final AccessibilityManager E0;
    public Button F;
    public final o04 F0;
    public ImageButton G;
    public MediaRouteExpandCollapseButton H;
    public FrameLayout I;
    public LinearLayout J;
    public FrameLayout K;
    public ImageView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public final boolean P;
    public final boolean Q;
    public LinearLayout R;
    public RelativeLayout S;
    public LinearLayout T;
    public View U;
    public OverlayListView V;
    public vu6 W;
    public ArrayList X;
    public HashSet Y;
    public HashSet Z;
    public HashSet a0;
    public SeekBar b0;
    public uu6 c0;
    public ew6 d0;
    public int e0;
    public int f0;
    public int g0;
    public final gw6 h;
    public final int h0;
    public HashMap i0;
    public wm4 j0;
    public final tu6 k0;
    public PlaybackStateCompat l0;
    public MediaDescriptionCompat m0;
    public final hu6 n;
    public su6 n0;
    public Bitmap o0;
    public Uri p0;
    public boolean q0;
    public final ew6 r;
    public Bitmap r0;
    public final Context s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public int y;
    public int y0;
    public int z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        G0 = (short) 30000;
    }

    public wu6(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu6.<init>(android.content.Context):void");
    }

    public static void o(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i, View view) {
        pu6 pu6Var = new pu6(view.getLayoutParams().height, i, view, (byte) 0);
        pu6Var.setDuration(this.y0);
        pu6Var.setInterpolator(this.B0);
        view.startAnimation(pu6Var);
    }

    public final boolean h() {
        if (this.m0 == null && this.l0 == null) {
            return false;
        }
        return true;
    }

    public final void i(boolean z) {
        OverlayListView overlayListView;
        HashSet hashSet;
        int firstVisiblePosition = this.V.getFirstVisiblePosition();
        int i = 0;
        while (true) {
            int childCount = this.V.getChildCount();
            overlayListView = this.V;
            if (i >= childCount) {
                break;
            }
            View childAt = overlayListView.getChildAt(i);
            ew6 ew6Var = (ew6) this.W.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.Y) == null || !hashSet.contains(ew6Var)) {
                ((LinearLayout) childAt.findViewById(2131296736)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
            i++;
        }
        ArrayList arrayList = overlayListView.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            it7 it7Var = (it7) obj;
            it7Var.j = true;
            it7Var.k = true;
            wm4 wm4Var = it7Var.l;
            if (wm4Var != null) {
                wu6 wu6Var = (wu6) wm4Var.c;
                wu6Var.a0.remove((ew6) wm4Var.b);
                wu6Var.W.notifyDataSetChanged();
            }
        }
        if (!z) {
            j(false);
        }
    }

    public final void j(boolean z) {
        this.Y = null;
        this.Z = null;
        this.w0 = false;
        if (this.x0) {
            this.x0 = false;
            t(z);
        }
        this.V.setEnabled(true);
    }

    public final int k(int i, int i2) {
        float d;
        float f = this.y;
        if (i >= i2) {
            d = ((f * i2) / i) + 0.5f;
        } else {
            d = kt6.d(f, 9.0f, 16.0f, 0.5f);
        }
        return (int) d;
    }

    public final int l(boolean z) {
        if (!z && this.T.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.R.getPaddingBottom() + this.R.getPaddingTop();
        if (z) {
            paddingBottom += this.S.getMeasuredHeight();
        }
        if (this.T.getVisibility() == 0) {
            paddingBottom += this.T.getMeasuredHeight();
        }
        if (z && this.T.getVisibility() == 0) {
            return this.U.getMeasuredHeight() + paddingBottom;
        }
        return paddingBottom;
    }

    public final boolean n() {
        ew6 ew6Var = this.r;
        if (ew6Var.e() && DesugarCollections.unmodifiableList(ew6Var.v).size() > 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        this.h.a(yv6.c, this.n, 2);
        p(gw6.e());
    }

    @Override
    public final void onCreate(Bundle bundle) {
        Interpolator interpolator;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(2131492930);
        findViewById(16908315).setVisibility(8);
        ru6 ru6Var = new ru6(this, (byte) 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131296562);
        this.I = frameLayout;
        frameLayout.setOnClickListener(new ru6(this, (byte) 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131296561);
        this.J = linearLayout;
        linearLayout.setOnClickListener(new Object());
        Context context = this.s;
        int f = yqe.f(context, 2130968731);
        if (on2.g(f, yqe.f(context, 16842801)) < 3.0d) {
            f = yqe.f(context, 2130968724);
        }
        Button button = (Button) findViewById(16908314);
        this.E = button;
        button.setText(2131689654);
        this.E.setTextColor(f);
        this.E.setOnClickListener(ru6Var);
        Button button2 = (Button) findViewById(16908313);
        this.F = button2;
        button2.setText(2131689661);
        this.F.setTextColor(f);
        this.F.setOnClickListener(ru6Var);
        this.O = (TextView) findViewById(2131296566);
        ((ImageButton) findViewById(2131296553)).setOnClickListener(ru6Var);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(2131296559);
        this.K = (FrameLayout) findViewById(2131296560);
        ru6 ru6Var2 = new ru6(this, (byte) 2);
        ImageView imageView = (ImageView) findViewById(2131296518);
        this.L = imageView;
        imageView.setOnClickListener(ru6Var2);
        findViewById(2131296558).setOnClickListener(ru6Var2);
        this.R = (LinearLayout) findViewById(2131296565);
        this.U = findViewById(2131296554);
        this.S = (RelativeLayout) findViewById(2131296573);
        this.M = (TextView) findViewById(2131296557);
        this.N = (TextView) findViewById(2131296556);
        ImageButton imageButton = (ImageButton) findViewById(2131296555);
        this.G = imageButton;
        imageButton.setOnClickListener(ru6Var);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(2131296575);
        this.T = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(2131296578);
        this.b0 = seekBar;
        ew6 ew6Var = this.r;
        seekBar.setTag(ew6Var);
        uu6 uu6Var = new uu6(this);
        this.c0 = uu6Var;
        this.b0.setOnSeekBarChangeListener(uu6Var);
        this.V = (OverlayListView) findViewById(2131296576);
        this.X = new ArrayList();
        vu6 vu6Var = new vu6(this, this.V.getContext(), this.X);
        this.W = vu6Var;
        this.V.setAdapter((ListAdapter) vu6Var);
        this.a0 = new HashSet();
        LinearLayout linearLayout3 = this.R;
        OverlayListView overlayListView = this.V;
        boolean n = n();
        int f2 = yqe.f(context, 2130968731);
        int f3 = yqe.f(context, 2130968732);
        if (n && yqe.b(context) == -570425344) {
            f3 = f2;
            f2 = -1;
        }
        linearLayout3.setBackgroundColor(f2);
        overlayListView.setBackgroundColor(f3);
        linearLayout3.setTag(Integer.valueOf(f2));
        overlayListView.setTag(Integer.valueOf(f3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.b0;
        LinearLayout linearLayout4 = this.R;
        int b = yqe.b(context);
        if (Color.alpha(b) != 255) {
            b = on2.l(b, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b, b);
        HashMap hashMap = new HashMap();
        this.i0 = hashMap;
        hashMap.put(ew6Var, this.b0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(2131296563);
        this.H = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.r = new ru6(this, (byte) 3);
        if (this.v0) {
            interpolator = this.C0;
        } else {
            interpolator = this.D0;
        }
        this.B0 = interpolator;
        this.y0 = context.getResources().getInteger(2131361804);
        this.z0 = context.getResources().getInteger(2131361805);
        this.A0 = context.getResources().getInteger(2131361806);
        this.w = true;
        s();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.h.h(this.n);
        p(null);
        this.x = false;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.Q || !this.v0) {
            if (i == 25) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            this.r.k(i2);
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void p(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaDescriptionCompat a;
        PlaybackStateCompat h;
        wm4 wm4Var = this.j0;
        tu6 tu6Var = this.k0;
        PlaybackStateCompat playbackStateCompat = null;
        if (wm4Var != null) {
            wm4Var.g0(tu6Var);
            this.j0 = null;
        }
        if (mediaSessionCompat$Token == null || !this.x) {
            return;
        }
        wm4 wm4Var2 = new wm4(this.s, mediaSessionCompat$Token);
        this.j0 = wm4Var2;
        wm4Var2.d0(tu6Var);
        MediaMetadata metadata = ((a) this.j0.b).a.getMetadata();
        if (metadata != null) {
            qt qtVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.b = metadata;
        } else {
            mediaMetadataCompat = null;
        }
        if (mediaMetadataCompat == null) {
            a = null;
        } else {
            a = mediaMetadataCompat.a();
        }
        this.m0 = a;
        a aVar = (a) this.j0.b;
        MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
        if (mediaSessionCompat$Token2.a() != null) {
            try {
                h = mediaSessionCompat$Token2.a().h();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
            this.l0 = h;
            r();
            q(false);
        }
        PlaybackState playbackState = aVar.a.getPlaybackState();
        if (playbackState != null) {
            playbackStateCompat = PlaybackStateCompat.a(playbackState);
        }
        h = playbackStateCompat;
        this.l0 = h;
        r();
        q(false);
    }

    public final void q(boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu6.q(boolean):void");
    }

    public final void r() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.m0;
        if (mediaDescriptionCompat == null) {
            uri = null;
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.e;
            uri = mediaDescriptionCompat.f;
        }
        su6 su6Var = this.n0;
        if (su6Var == null) {
            bitmap2 = this.o0;
            uri2 = this.p0;
        } else {
            Bitmap bitmap3 = su6Var.a;
            uri2 = su6Var.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 == bitmap) {
            if (bitmap2 == null) {
                if (uri2 != null) {
                    if (uri2.equals(uri)) {
                        return;
                    }
                } else if (uri == null) {
                    return;
                }
            } else {
                return;
            }
        }
        if (!n() || this.Q) {
            su6 su6Var2 = this.n0;
            if (su6Var2 != null) {
                su6Var2.cancel(true);
            }
            su6 su6Var3 = new su6(this);
            this.n0 = su6Var3;
            su6Var3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.s;
        int a = uqe.a(context);
        getWindow().setLayout(a, -2);
        View decorView = getWindow().getDecorView();
        this.y = (a - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.e0 = resources.getDimensionPixelSize(2131165330);
        this.f0 = resources.getDimensionPixelSize(2131165329);
        this.g0 = resources.getDimensionPixelSize(2131165331);
        this.o0 = null;
        this.p0 = null;
        r();
        q(false);
    }

    public final void t(boolean z) {
        this.K.requestLayout();
        this.K.getViewTreeObserver().addOnGlobalLayoutListener(new ou6(this, z));
    }

    public final void u(boolean z) {
        int i;
        View view = this.U;
        int i2 = 0;
        if (this.T.getVisibility() == 0 && z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        LinearLayout linearLayout = this.R;
        if (this.T.getVisibility() == 8 && !z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }
}
