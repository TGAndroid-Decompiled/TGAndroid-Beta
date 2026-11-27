package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class uc6 extends e implements fn7 {
    public Location A0;
    public int B0;
    public qp2 C0;
    public w05 D0;
    public boolean E;
    public boolean E0;
    public x05 F;
    public qj5 F0;
    public sj5 G;
    public cc6 G0;
    public xj5 H;
    public TLRPC.TL_channelLocation H0;
    public sj5 I;
    public TLRPC.TL_channelLocation I0;
    public boolean J;
    public r47 J0;
    public float K;
    public boolean K0;
    public ym4 L;
    public boolean L0;
    public double M;
    public qc6 M0;
    public boolean N;
    public final byte N0;
    public bx8 O;
    public int O0;
    public b6 P;
    public oc6 P0;
    public kc6 Q;
    public dc6 Q0;
    public gu R;
    public nc6 R0;
    public d79 S;
    public p55 S0;
    public q42 T;
    public TL_stories.MediaArea T0;
    public View U;
    public boolean U0;
    public x46 V;
    public boolean V0;
    public sla W;
    public Boolean W0;
    public FrameLayout X;
    public FrameLayout Y;
    public jl0 Z;
    public ImageView a;
    public final RectF a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public int c0;
    public sla d;
    public TextureView d0;
    public LinearLayout e;
    public jk6 e0;
    public ImageView f;
    public final RectF f0;
    public final Paint g0;
    public TextView h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public TextView n;
    public boolean n0;
    public final ArrayList o0;
    public final zh6 p0;
    public long q0;
    public sla r;
    public boolean r0;
    public kg5 s;
    public AnimatorSet s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public final UndoView[] x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public Location z0;

    public uc6(int i) {
        super(null);
        this.x = new UndoView[2];
        this.a0 = new RectF();
        this.f0 = new RectF();
        this.g0 = new Paint();
        this.j0 = true;
        this.k0 = false;
        this.l0 = true;
        this.n0 = true;
        this.o0 = new ArrayList();
        this.p0 = new zh6();
        this.q0 = -1L;
        this.t0 = true;
        this.O0 = (hl.q.x - a.getCurrentActionBarHeight()) - hl.L(66.0f);
        this.V0 = true;
        this.N0 = i;
        hl.a0();
    }

    public static View k0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View k0 = k0(viewGroup.getChildAt(i), cls);
                if (k0 != null) {
                    return k0;
                }
            }
            return null;
        }
        return null;
    }

    public static ak5 z0(ak5 ak5Var, double d, double d2) {
        double d3 = ak5Var.a;
        return new ak5(d3 + Math.toDegrees(d / 6366198.0d), ak5Var.b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d3)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        xj5 xj5Var = this.H;
        if (xj5Var != null && (gLSurfaceView = (GLSurfaceView) ((am2) xj5Var).f) != null && !this.J) {
            gLSurfaceView.queueEvent(new z56(this, gLSurfaceView, (byte) 9));
            return true;
        }
        return false;
    }

    public final void B0(pc6 pc6Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (pc6Var != null && (message = pc6Var.b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            r47 r47Var = this.J0;
            if (r47Var != null) {
                TLRPC.GeoPoint geoPoint2 = r47Var.k.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.H0.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        boolean z = f11.a;
        org.telegram.messenger.a.q();
        if (this.z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.z0.getLatitude()), Double.valueOf(this.z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public final void C0(final boolean z) {
        final TLRPC.User user;
        if (this.M0 != null && !i0() && getParentActivity() != null && this.z0 != null && f0()) {
            if (wf3.D(this.m0)) {
                user = getMessagesController().X1(Long.valueOf(this.m0));
            } else {
                user = null;
            }
            showDialog(jj.B(getParentActivity(), z, user, new df7() {
                @Override
                public final void a(int i) {
                    boolean z2 = z;
                    uc6.this.w0(i, user, z2);
                }
            }, null));
        }
    }

    public final void D0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.e0 != null && this.H != null) {
            TextureView textureView = this.d0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.e0.d) == null || !surfaceView.isAttachedToWindow())) {
                tt ttVar = (tt) ((am2) this.H).b;
                TextureView textureView2 = (TextureView) k0(ttVar, TextureView.class);
                this.d0 = textureView2;
                jk6 jk6Var = this.e0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) k0(ttVar, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (jk6Var.d != surfaceView2) {
                    jk6Var.d = surfaceView2;
                    jk6Var.a();
                }
                TextureView textureView3 = this.d0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof rc6)) {
                        this.d0.setSurfaceTextureListener(new rc6(this, surfaceTextureListener));
                    }
                }
                P0();
            }
            TextureView textureView4 = this.d0;
            if (textureView4 == null) {
                this.e0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof rc6)) {
                this.d0.setSurfaceTextureListener(new rc6(this, surfaceTextureListener2));
            }
        }
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.z0 = new Location(location);
        pc6 pc6Var = (pc6) this.p0.f(getUserConfig().e());
        hd6 h = getLocationController().h(this.m0);
        if (pc6Var != null && h != null && pc6Var.b.id == h.b) {
            ak5 ak5Var = new ak5(location.getLatitude(), location.getLongitude());
            pc6Var.e.b(ak5Var);
            w05 w05Var = pc6Var.f;
            if (w05Var != null) {
                w05Var.b(ak5Var);
            }
            if (this.q0 == pc6Var.a) {
                this.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(pc6Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            ak5 ak5Var2 = new ak5(location.getLatitude(), location.getLongitude());
            kc6 kc6Var = this.Q;
            if (kc6Var != null) {
                kc6Var.M(this.z0);
            }
            if (!this.K0) {
                this.A0 = new Location(location);
                if (this.L0) {
                    this.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(ak5Var2));
                } else {
                    this.L0 = true;
                    this.F.h(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(ak5Var2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.z0);
        }
        bx8 bx8Var = this.O;
        if (bx8Var != null) {
            bx8Var.c(true);
        }
        ym4 ym4Var = this.L;
        if (ym4Var != null) {
            double latitude = this.z0.getLatitude();
            double longitude = this.z0.getLongitude();
            xh2 xh2Var = (xh2) ym4Var.b;
            LatLng latLng = new LatLng(latitude, longitude);
            xh2Var.getClass();
            try {
                fre freVar = (fre) xh2Var.a;
                Parcel R = freVar.R();
                jld.b(R, latLng);
                freVar.V(R, 3);
            } catch (RemoteException e) {
                p3d.i(e);
                return;
            }
        }
        qp2 qp2Var = this.C0;
        if (qp2Var != null) {
            qp2Var.a(this.z0);
        }
        Q0(true);
        R0();
    }

    public final void F0(View view) {
        jl0 c = getBaseSimpleGlass().c.c(view, null, false);
        c.p(dtd.l(getResourceProvider()));
        c.r(hl.L(23.0f));
        c.q(hl.L(6.0f));
        view.setBackground(c);
        iye.a(view);
    }

    public final void G0(r47 r47Var) {
        this.J0 = r47Var;
        this.m0 = r47.B0(r47Var.k);
    }

    public final void H0(pc6 pc6Var) {
        if (pc6Var.h == null) {
            TLRPC.User user = pc6Var.c;
            TLRPC.Chat chat = pc6Var.d;
            if (user == null && chat == 0) {
                return;
            }
            rb0 rb0Var = new rb0((vnb) null);
            if (user != null) {
                rb0Var.q(user);
            } else {
                rb0Var.p(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.h1 = new u34(this, pc6Var, (byte) 19);
            imageReceiver.I();
            if (user == null) {
                user = chat;
            }
            imageReceiver.U(user, rb0Var, null);
            pc6Var.h = imageReceiver;
        }
    }

    public final void I0(int i, int i2, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = hl.b0(this.z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = hl.b0(this.z0.getLongitude());
        tL_messageMediaGeoLive.heading = id6.e(this.z0);
        int i3 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i;
        tL_messageMediaGeoLive.proximity_notification_radius = i2;
        tL_messageMediaGeoLive.flags = i3 | 9;
        this.M0.b(tL_messageMediaGeoLive, this.N0, true, 0, 0L);
        if (i2 > 0) {
            this.O.M = true;
            this.c.setImageResource(2131232216);
            bx8 bx8Var = this.O;
            if (bx8Var != null) {
                bx8Var.a();
            }
            q0().k(0L, 24, Integer.valueOf(i2), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void J0(boolean z, boolean z2) {
        float f;
        float f2;
        Boolean bool = this.W0;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        this.W0 = Boolean.valueOf(z);
        TextView textView = this.b;
        float f3 = 0.0f;
        int i = 0;
        float f4 = 0.7f;
        if (!z2) {
            if (!z) {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = this.b;
            if (z) {
                f3 = 1.0f;
            }
            textView2.setAlpha(f3);
            TextView textView3 = this.b;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.7f;
            }
            textView3.setScaleX(f2);
            TextView textView4 = this.b;
            if (z) {
                f4 = 1.0f;
            }
            textView4.setScaleY(f4);
            return;
        }
        textView.setVisibility(0);
        ViewPropertyAnimator animate = this.b.animate();
        if (z) {
            f3 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f3);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.7f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f);
        if (z) {
            f4 = 1.0f;
        }
        scaleX.scaleY(f4).setInterpolator(k43.h).setDuration(420L).withEndAction(new xac((byte) 24, this, z)).start();
    }

    public final void K0() {
        if (this.F != null && this.y0) {
            qp2 qp2Var = this.C0;
            if (qp2Var == null) {
                try {
                    SensorManager sensorManager = (SensorManager) org.telegram.messenger.a.b.getSystemService("sensor");
                    if (sensorManager != null) {
                        if (sensorManager.getDefaultSensor(11) == null) {
                            if (sensorManager.getDefaultSensor(2) != null) {
                                if (sensorManager.getDefaultSensor(1) == null) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        qp2Var = new qp2(new cc6(this, (byte) 3));
                        this.C0 = qp2Var;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
            qp2Var.a(this.z0);
            qp2 qp2Var2 = this.C0;
            if (!qp2Var2.f) {
                try {
                    if (qp2Var2.b == null) {
                        SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.a.b.getSystemService("sensor");
                        qp2Var2.b = sensorManager2;
                        if (sensorManager2 != null) {
                            Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                            qp2Var2.c = defaultSensor;
                            if (defaultSensor == null) {
                                qp2Var2.d = qp2Var2.b.getDefaultSensor(1);
                                qp2Var2.e = qp2Var2.b.getDefaultSensor(2);
                            }
                        } else {
                            return;
                        }
                    }
                    Sensor sensor = qp2Var2.c;
                    if (sensor != null) {
                        qp2Var2.b.registerListener(qp2Var2, sensor, 1);
                    } else {
                        Sensor sensor2 = qp2Var2.d;
                        if (sensor2 != null && qp2Var2.e != null) {
                            qp2Var2.b.registerListener(qp2Var2, sensor2, 1);
                            qp2Var2.b.registerListener(qp2Var2, qp2Var2.e, 1);
                        } else {
                            return;
                        }
                    }
                    qp2Var2.f = true;
                    qp2Var2.I = 0L;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
        }
    }

    public final void L0() {
        if (this.y0 && !this.k0) {
            if (this.G0 == null) {
                qj5 onCreateLocationRequest = ((pm3) org.telegram.messenger.a.i()).onCreateLocationRequest();
                this.F0 = onCreateLocationRequest;
                ((t05) onCreateLocationRequest).c();
                ((t05) this.F0).b();
                ((t05) this.F0).a();
                this.G0 = new cc6(this, (byte) 2);
            }
            try {
                ((pm3) org.telegram.messenger.a.i()).requestLocationUpdates(this.F0, this.G0);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void M0() {
        qp2 qp2Var = this.C0;
        if (qp2Var != null && qp2Var.f) {
            qp2Var.f = false;
            qp2Var.x = false;
            try {
                qp2Var.b.unregisterListener(qp2Var);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void N0(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        int i3;
        f89 L = this.R.L(0);
        if (L != null) {
            i = (int) L.a.getY();
            i2 = Math.min(i, 0) + this.O0;
            this.b0 = (this.O0 + i) - this.h0;
        } else {
            i = -this.P.getMeasuredHeight();
            this.b0 = -hl.L(41.0f);
            i2 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            xj5 xj5Var = this.H;
            int i4 = 4;
            if (i2 <= 0) {
                if (((tt) ((am2) xj5Var).b).getVisibility() == 0) {
                    ((tt) ((am2) this.H).b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((tt) ((am2) xj5Var).b).getVisibility() == 4) {
                ((tt) ((am2) this.H).b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i));
            int i5 = -i;
            ((tt) ((am2) this.H).b).setTranslationY(Math.max(0, i5 / 2));
            FrameLayout frameLayout = this.X;
            float f = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i));
                float l = Utilities.l((qu6.x(53.0f, i2 - this.h0, hl.L(46.0f) + eg0.f(this.mSystemInsets.b)) - hl.L(7.0f)) / hl.L(48.0f));
                FrameLayout frameLayout2 = this.X;
                frameLayout2.setAlpha(l);
                int i6 = (l > 0.0f ? 1 : (l == 0.0f ? 0 : -1));
                if (i6 > 0) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                frameLayout2.setVisibility(i3);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setAlpha(l);
                if (i6 > 0) {
                    i4 = 0;
                }
                frameLayout3.setVisibility(i4);
                P0();
            }
            View view = this.U;
            if (view != null) {
                if (view.getTag() != null) {
                    f = 69.0f;
                }
                int L2 = ((i2 / 2) + (i5 - hl.L(f))) - (this.h0 / 2);
                this.B0 = L2;
                view.setTranslationY(L2);
            }
            if (!z && (layoutParams = (FrameLayout.LayoutParams) ((tt) ((am2) this.H).b).getLayoutParams()) != null && layoutParams.height != o0()) {
                layoutParams.height = o0();
                x05 x05Var = this.F;
                if (x05Var != null) {
                    x05Var.n(hl.L(70.0f), 0, hl.L(70.0f), n0());
                }
                ((tt) ((am2) this.H).b).setLayoutParams(layoutParams);
            }
        }
    }

    public final void O0() {
        if (this.u0) {
            boolean z = this.w0;
            d79 d79Var = this.S;
            if (z) {
                d79Var.setEmptyView(null);
                this.e.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
            d79Var.setEmptyView(this.e);
            return;
        }
        this.e.setVisibility(8);
    }

    public final void P0() {
        xj5 xj5Var;
        boolean z;
        b6 b6Var;
        jk6 jk6Var = this.e0;
        if (jk6Var != null && (xj5Var = this.H) != null) {
            tt ttVar = (tt) ((am2) xj5Var).b;
            if (this.d0 == null && this.y0 && !isFinishing() && (b6Var = this.P) != null && b6Var.getVisibility() == 0 && ttVar.getParent() != null && ttVar.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (jk6Var.g != z) {
                jk6Var.g = z;
                if (z) {
                    jk6Var.a();
                } else {
                    jk6Var.d();
                }
            }
        }
    }

    public final void Q0(boolean z) {
        Location location;
        boolean z2;
        float f;
        int i;
        if (this.F != null && (location = this.z0) != null) {
            qp2 qp2Var = this.C0;
            if (qp2Var != null && qp2Var.H) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                w05 w05Var = this.D0;
                int i2 = 2131231653;
                if (w05Var == null) {
                    xh4 xh4Var = (xh4) ((z3f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                    ((el6) xh4Var.b).a = new LatLng(this.z0.getLatitude(), this.z0.getLongitude());
                    el6 el6Var = (el6) xh4Var.b;
                    el6Var.r = true;
                    el6Var.e = 0.5f;
                    el6Var.f = 0.5f;
                    if (z2) {
                        i = 2131231654;
                    } else {
                        i = 2131231653;
                    }
                    el6Var.d = usd.b(i);
                    this.D0 = this.F.a(xh4Var);
                    this.E0 = z2;
                } else if (z) {
                    double latitude = location.getLatitude();
                    double longitude = this.z0.getLongitude();
                    dl6 dl6Var = w05Var.a;
                    LatLng latLng = new LatLng(latitude, longitude);
                    dl6Var.getClass();
                    try {
                        hmf hmfVar = (hmf) dl6Var.a;
                        Parcel R = hmfVar.R();
                        jld.b(R, latLng);
                        hmfVar.V(R, 3);
                    } catch (RemoteException e) {
                        throw new RuntimeException(e);
                    }
                }
                w05 w05Var2 = this.D0;
                if (w05Var2 != null) {
                    if (z2 != this.E0) {
                        if (z2) {
                            i2 = 2131231654;
                        }
                        w05Var2.a.a(usd.b(i2));
                        this.E0 = z2;
                    }
                    w05 w05Var3 = this.D0;
                    if (z2) {
                        f = this.C0.G;
                    } else {
                        f = 0.0f;
                    }
                    w05Var3.c(f);
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public final void R0() {
        int i;
        boolean z;
        TLRPC.MessageMedia messageMedia;
        int i2;
        if (this.b == null) {
            return;
        }
        boolean z2 = false;
        if (this.r0) {
            J0(false, true);
            l0();
            return;
        }
        if (getConnectionsManager() != null) {
            i = getConnectionsManager().getCurrentTime();
        } else {
            i = 0;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.Message message = ((pc6) arrayList.get(i4)).b;
            if (message != null && (messageMedia = message.media) != null && ((i2 = messageMedia.period) == Integer.MAX_VALUE || message.date + i2 > i)) {
                i3++;
            }
        }
        if (this.p0.f(getUserConfig().e()) != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.z0 != null && !z) {
            i3++;
        }
        if (i3 >= 2) {
            z2 = true;
        }
        J0(z2, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.n5));
        hashSet.add(Integer.valueOf(aob.a7));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.Ji));
        hashSet.add(Integer.valueOf(aob.fj));
        hashSet.add(Integer.valueOf(aob.ij));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.xj));
    }

    public final pc6 b0(TLRPC.Message message) {
        pc6 pc6Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = r47.B1(message.from_id);
        zh6 zh6Var = this.p0;
        pc6 pc6Var2 = (pc6) zh6Var.f(B1);
        if (pc6Var2 == null) {
            ?? obj = new Object();
            obj.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.c = getMessagesController().X1(Long.valueOf(obj.b.from_id.user_id));
                obj.a = obj.b.from_id.user_id;
            } else {
                long B0 = r47.B0(message);
                if (wf3.D(B0)) {
                    obj.c = getMessagesController().X1(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().M0(Long.valueOf(-B0));
                }
                obj.a = B0;
            }
            H0(obj);
            try {
                xh4 xh4Var = (xh4) ((z3f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                el6 el6Var = (el6) xh4Var.b;
                ((el6) xh4Var.b).a = new LatLng(d, d2);
                Bitmap h0 = h0(obj);
                pc6Var = obj;
                if (h0 != null) {
                    el6Var.d = usd.a(h0);
                    el6Var.e = 0.5f;
                    el6Var.f = 0.8010882f;
                    obj.e = this.F.a(xh4Var);
                    if (!lbc.D(obj.c)) {
                        xh4 xh4Var2 = (xh4) ((z3f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                        ((el6) xh4Var2.b).a = new LatLng(d, d2);
                        el6 el6Var2 = (el6) xh4Var2.b;
                        el6Var2.r = true;
                        el6Var2.e = 0.5f;
                        el6Var2.f = 0.5f;
                        w05 a = this.F.a(xh4Var2);
                        obj.f = a;
                        int i = message.media.heading;
                        if (i != 0) {
                            a.c(i);
                            obj.f.a.a(usd.b(2131231654));
                            obj.g = true;
                        } else {
                            a.c(0.0f);
                            obj.f.a.a(usd.b(2131231653));
                            obj.g = false;
                        }
                    }
                    this.o0.add(obj);
                    zh6Var.k(obj.a, obj);
                    hd6 h = getLocationController().h(this.m0);
                    int i2 = (obj.a > getUserConfig().e() ? 1 : (obj.a == getUserConfig().e() ? 0 : -1));
                    pc6Var = obj;
                    pc6Var = obj;
                    if (i2 == 0 && h != null) {
                        int i3 = obj.b.id;
                        pc6Var = obj;
                        if (i3 == h.b) {
                            Location location = this.z0;
                            pc6Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.z0.getLongitude();
                                dl6 dl6Var = obj.e.a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                dl6Var.getClass();
                                try {
                                    hmf hmfVar = (hmf) dl6Var.a;
                                    Parcel R = hmfVar.R();
                                    jld.b(R, latLng);
                                    hmfVar.V(R, 3);
                                    pc6Var = obj;
                                } catch (RemoteException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
                pc6Var = obj;
            }
        } else {
            pc6Var2.b = message;
            dl6 dl6Var2 = pc6Var2.e.a;
            LatLng latLng2 = new LatLng(d, d2);
            dl6Var2.getClass();
            try {
                hmf hmfVar2 = (hmf) dl6Var2.a;
                Parcel R2 = hmfVar2.R();
                jld.b(R2, latLng2);
                hmfVar2.V(R2, 3);
                int i4 = (this.q0 > pc6Var2.a ? 1 : (this.q0 == pc6Var2.a ? 0 : -1));
                pc6Var = pc6Var2;
                if (i4 == 0) {
                    this.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(pc6Var2.e.a()));
                    pc6Var = pc6Var2;
                }
            } catch (RemoteException e3) {
                p3d.i(e3);
                return null;
            }
        }
        bx8 bx8Var = this.O;
        if (bx8Var != null) {
            bx8Var.c(true);
        }
        R0();
        return pc6Var;
    }

    public final void c0() {
        if (this.fragmentView != null && this.R != null) {
            mq5 mq5Var = this.mSystemInsets;
            int i = mq5Var.b;
            int i2 = mq5Var.d;
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                int f = eg0.f(i) - hl.L(6.0f);
                if (layoutParams.topMargin != f) {
                    layoutParams.topMargin = f;
                    this.X.requestLayout();
                }
            }
            this.R.setClipToPadding(false);
            this.R.setPadding(0, 0, 0, i2);
            d79 d79Var = this.S;
            if (d79Var != null) {
                d79Var.setClipToPadding(false);
                eg0.g(this.S, i, i2, a.getCurrentActionBarHeight(), 0);
            }
            if (this.fragmentView.getMeasuredHeight() > 0) {
                m0(false);
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc6.createView(android.content.Context):android.view.View");
    }

    public final void d0(Canvas canvas, RectF rectF) {
        tt ttVar;
        int i = aob.h5;
        int themedColor = getThemedColor(i);
        Paint paint = this.g0;
        paint.setColor(themedColor);
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        d79 d79Var = this.S;
        if (d79Var != null && d79Var.getVisibility() == 0) {
            d79 d79Var2 = this.S;
            uk0.a(d79Var2, canvas, rectF, d79Var2, viewGroup);
            return;
        }
        if (this.P.getVisibility() == 0) {
            canvas.save();
            canvas.translate(this.P.getX(), this.P.getY());
            canvas.clipRect(0.0f, 0.0f, this.P.getWidth(), viewGroup.getHeight() - this.P.getY());
            Drawable background = this.P.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            xj5 xj5Var = this.H;
            if (xj5Var != null) {
                ttVar = (tt) ((am2) xj5Var).b;
            } else {
                ttVar = null;
            }
            if (ttVar != null && ttVar.getParent() == this.P && ttVar.getVisibility() == 0 && ttVar.getAlpha() > 0.0f) {
                TextureView textureView = this.d0;
                RectF rectF2 = this.f0;
                if (textureView != null && textureView.isAttachedToWindow() && yic.c(this.d0, this.P, rectF2)) {
                    if (ttVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (ttVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    this.d0.draw(canvas);
                    canvas.restore();
                } else if (this.e0 != null) {
                    rectF2.set(ttVar.getX(), ttVar.getY(), ttVar.getX() + ttVar.getWidth(), ttVar.getY() + ttVar.getHeight());
                    jk6 jk6Var = this.e0;
                    float alpha = ttVar.getAlpha();
                    Paint paint2 = jk6Var.c;
                    Bitmap bitmap = jk6Var.e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = this.U;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (this.R.getVisibility() == 0) {
            int L = hl.L(22.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            float f = L;
            if (rectF.top >= f) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f), viewGroup.getWidth(), f);
            if (this.b0 < L) {
                paint.setColor(getThemedColor(i));
                paint.setAlpha(205);
                canvas.drawRect(0.0f, Math.max(this.b0, rectF.top), viewGroup.getWidth(), f, paint);
            }
            gu guVar = this.R;
            uk0.a(guVar, canvas, rectF, guVar, viewGroup);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        kc6 kc6Var;
        long B0;
        kc6 kc6Var2;
        if (i == jn7.s) {
            removeSelfFromStack(true);
            return;
        }
        if (i == jn7.y4) {
            this.k0 = false;
            kc6 kc6Var3 = this.Q;
            if (kc6Var3 != null) {
                kc6Var3.O(false, false);
            }
            L0();
        } else if (i == jn7.z4) {
            this.k0 = true;
            kc6 kc6Var4 = this.Q;
            if (kc6Var4 != null) {
                kc6Var4.O(true, false);
            }
        } else if (i == jn7.G4) {
            kc6 kc6Var5 = this.Q;
            if (kc6Var5 != null) {
                kc6Var5.f();
            }
            R0();
        } else if (i == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.m0 && this.J0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z = false;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    r47 r47Var = (r47) arrayList.get(i3);
                    boolean C3 = r47Var.C3();
                    TLRPC.Message message = r47Var.k;
                    if (C3) {
                        b0(message);
                        z = true;
                    } else if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && wf3.D(r47.B0(message))) {
                        this.c.setImageResource(2131232215);
                        ym4 ym4Var = this.L;
                        if (ym4Var != null) {
                            ym4Var.H0();
                            this.L = null;
                        }
                    }
                }
                if (z && (kc6Var2 = this.Q) != null) {
                    kc6Var2.N(this.o0);
                }
            }
        } else if (i == jn7.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.m0 && this.J0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    r47 r47Var2 = (r47) arrayList2.get(i4);
                    if (r47Var2.C3()) {
                        TLRPC.Message message2 = r47Var2.k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = r47.B1(peer);
                        } else {
                            B0 = r47.B0(message2);
                        }
                        pc6 pc6Var = (pc6) this.p0.f(B0);
                        if (pc6Var != null) {
                            hd6 h = getLocationController().h(longValue);
                            if (h == null || h.b != r47Var2.e1()) {
                                TLRPC.Message message3 = r47Var2.k;
                                pc6Var.b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                ak5 ak5Var = new ak5(geoPoint.lat, geoPoint._long);
                                pc6Var.e.b(ak5Var);
                                if (this.q0 == pc6Var.a) {
                                    this.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(pc6Var.e.a()));
                                }
                                w05 w05Var = pc6Var.f;
                                if (w05Var != null) {
                                    w05Var.a();
                                    pc6Var.f.b(ak5Var);
                                    int i5 = r47Var2.k.media.heading;
                                    if (i5 != 0) {
                                        pc6Var.f.c(i5);
                                        if (!pc6Var.g) {
                                            pc6Var.f.a.a(usd.b(2131231654));
                                            pc6Var.g = true;
                                        }
                                    } else if (pc6Var.g) {
                                        pc6Var.f.c(0.0f);
                                        pc6Var.f.a.a(usd.b(2131231653));
                                        pc6Var.g = false;
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                }
                if (z2 && (kc6Var = this.Q) != null) {
                    kc6Var.f();
                    bx8 bx8Var = this.O;
                    if (bx8Var != null) {
                        bx8Var.c(true);
                    }
                }
                if (z2) {
                    R0();
                }
            }
        }
    }

    public final void e0() {
        int i;
        jl0 jl0Var = this.Z;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        gu guVar = this.R;
        if (guVar != null) {
            guVar.invalidate();
        }
        if (this.F != null) {
            if (hl.B(getThemedColor(aob.d6)) < 0.721f) {
                i = 2131624086;
            } else {
                i = 0;
            }
            boolean z = this.i0;
            if (i != 0) {
                if (!z) {
                    this.i0 = true;
                    this.F.i(((z3f) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, i));
                    ym4 ym4Var = this.L;
                    if (ym4Var != null) {
                        ym4Var.S0(-1);
                        this.L.L0(553648127);
                    }
                }
            } else if (z) {
                this.i0 = false;
                this.F.i(null);
                ym4 ym4Var2 = this.L;
                if (ym4Var2 != null) {
                    ym4Var2.S0(-16777216);
                    this.L.L0(536870912);
                }
            }
            D0();
        }
    }

    public final boolean f0() {
        if (i0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i = aob.L5;
                    alertDialog$Builder.l(2131624120, 72, getThemedColor(i), null);
                    alertDialog$Builder.m(i, getResourceProvider());
                    alertDialog$Builder.a.U = ob6.M0(2131749301, null);
                    alertDialog$Builder.j(ob6.M0(2131751771, null), new cc6(this, (byte) 5));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return true;
            }
        }
        return true;
    }

    @Override
    public final boolean finishFragment(boolean z) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z);
    }

    public final void g0(int i) {
        z0f v3dVar;
        if (this.F == null) {
            return;
        }
        List<ek5> asList = Arrays.asList(new ek5[]{new Object(), new Object()});
        tj5 onCreateCircleOptions = ((z3f) org.telegram.messenger.a.j()).onCreateCircleOptions();
        double latitude = this.z0.getLatitude();
        double longitude = this.z0.getLongitude();
        zh2 zh2Var = (zh2) ((v34) onCreateCircleOptions).b;
        LatLng latLng = new LatLng(latitude, longitude);
        zh2Var.getClass();
        zh2Var.a = latLng;
        double d = i;
        zh2 zh2Var2 = (zh2) ((v34) onCreateCircleOptions).b;
        zh2Var2.b = d;
        if (r0()) {
            zh2Var2.d = -1771658281;
            zh2Var2.e = 476488663;
        } else {
            zh2Var2.d = -1774024971;
            zh2Var2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (ek5 ek5Var : asList) {
            if (ek5Var instanceof dk5) {
                arrayList.add(new y53(20.0f, (byte) 1));
            } else if (ek5Var instanceof ck5) {
                arrayList.add(new y53(20.0f, (byte) 0));
            }
        }
        zh2Var2.r = arrayList;
        zh2Var2.c = 2.0f;
        x05 x05Var = this.F;
        um4 um4Var = x05Var.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.b(R, zh2Var2);
            Parcel Q = qaeVar.Q(R, 35);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i2 = pwe.b;
            if (readStrongBinder == null) {
                v3dVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (queryLocalInterface instanceof z0f) {
                    v3dVar = (z0f) queryLocalInterface;
                } else {
                    v3dVar = new v3d(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", (byte) 6);
                }
            }
            Q.recycle();
            xh2 xh2Var = new xh2(v3dVar);
            ym4 ym4Var = new ym4(x05Var, xh2Var, false, (byte) 2);
            x05Var.c.put(xh2Var, ym4Var);
            this.L = ym4Var;
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            UndoView[] undoViewArr = this.x;
            if (i >= undoViewArr.length) {
                break;
            }
            arrayList.add(new apb(undoViewArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.wj));
            i++;
        }
        arrayList.add(new apb(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h5));
        sla slaVar = this.r;
        if (slaVar != null) {
            editTextBoldCursor = slaVar.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new apb(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.j5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.jj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.kj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.pj));
        arrayList.add(new apb(this.R, 393216, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.ej));
        arrayList.add(new apb(this.R, 393216, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.hj));
        arrayList.add(new apb(this.R, 393248, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.dj));
        arrayList.add(new apb(this.R, 393248, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.gj));
        arrayList.add(new apb(this.R, 196608, new Class[]{jd6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.Hi));
        return arrayList;
    }

    public final Bitmap h0(pc6 pc6Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(hl.L(62.0f), hl.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.a.b.getResources().getDrawable(2131231655);
                drawable.setBounds(0, 0, hl.L(62.0f), hl.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                rb0 rb0Var = new rb0((vnb) null);
                TLRPC.User user = pc6Var.c;
                if (user != null) {
                    rb0Var.q(user);
                } else {
                    TLRPC.Chat chat = pc6Var.d;
                    if (chat != null) {
                        rb0Var.p(chat);
                    }
                }
                canvas.translate(hl.L(6.0f), hl.L(6.0f));
                rb0Var.setBounds(0, 0, hl.L(50.0f), hl.L(50.0f));
                rb0Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = pc6Var.h;
                if (imageReceiver != null && imageReceiver.C()) {
                    bitmap = pc6Var.h.n();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = hl.L(50.0f) / bitmap.getWidth();
                    matrix.postScale(L, L);
                    matrix.postTranslate(hl.L(6.0f), hl.L(6.0f));
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(hl.L(6.0f), hl.L(6.0f), hl.L(56.0f), hl.L(56.0f));
                    canvas.drawRoundRect(rectF, hl.L(25.0f), hl.L(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th) {
                th = th;
                bitmap2 = createBitmap;
                cc4.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean i0() {
        return this instanceof gu1;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (vm2.h(getThemedColor(aob.d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(ArrayList arrayList) {
        vj5 vj5Var;
        if (this.n0) {
            vj5Var = ((z3f) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
        } else {
            vj5Var = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            int i2 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i3 = messageMedia.period;
            if (i2 + i3 > currentTime || i3 == Integer.MAX_VALUE) {
                if (vj5Var != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((kj4) vj5Var).T(new ak5(geoPoint.lat, geoPoint._long));
                }
                b0(message);
                if (this.c.getVisibility() != 8 && r47.B1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new ad5(this, (byte) 12)).start();
                }
            }
        }
        if (vj5Var != null) {
            if (this.n0) {
                this.R.y0(0, hl.L(99.0f), null);
            }
            this.n0 = false;
            this.Q.N(this.o0);
            if (this.J0.C3()) {
                try {
                    kj4 kj4Var = (kj4) vj5Var;
                    ak5 a = kj4Var.d().a();
                    ak5 z0 = z0(a, 100.0d, 100.0d);
                    kj4Var.T(z0(a, -100.0d, -100.0d));
                    kj4Var.T(z0);
                    v05 d = kj4Var.d();
                    if (arrayList.size() > 1) {
                        try {
                            sj5 newCameraUpdateLatLngBounds = ((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(d, hl.L(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.h(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean l0() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i2;
        boolean z4 = false;
        if (this.F != null) {
            ArrayList arrayList = new ArrayList();
            if (getConnectionsManager() != null) {
                i = getConnectionsManager().getCurrentTime();
            } else {
                i = 0;
            }
            ArrayList arrayList2 = this.o0;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                pc6 pc6Var = (pc6) arrayList2.get(i3);
                w05 w05Var = pc6Var.e;
                if (w05Var != null && (message = pc6Var.b) != null && (messageMedia = message.media) != null && ((i2 = messageMedia.period) == Integer.MAX_VALUE || message.date + i2 > i)) {
                    arrayList.add(w05Var.a());
                }
            }
            if (this.p0.f(getUserConfig().e()) != null) {
                z = true;
            } else {
                z = false;
            }
            Location location = this.z0;
            if (location != null && !z) {
                arrayList.add(new ak5(location.getLatitude(), this.z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    vj5 onCreateLatLngBoundsBuilder = ((z3f) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i4 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d3 = Double.MAX_VALUE;
                    double d4 = -1.7976931348623157E308d;
                    while (i4 < size2) {
                        ak5 ak5Var = (ak5) arrayList.get(i4);
                        z2 = z4;
                        try {
                            ((kj4) onCreateLatLngBoundsBuilder).T(ak5Var);
                            int i5 = size2;
                            z3 = true;
                            try {
                                double d5 = ak5Var.a;
                                if (d5 < d2) {
                                    d2 = d5;
                                }
                                if (d5 > d) {
                                    d = d5;
                                }
                                double d6 = ak5Var.b;
                                if (d6 < d3) {
                                    d3 = d6;
                                }
                                if (d6 > d4) {
                                    d4 = d6;
                                }
                                i4++;
                                z4 = z2;
                                size2 = i5;
                            } catch (Exception e) {
                                e = e;
                                cc4.g(e, z3);
                                return z2;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z3 = true;
                            cc4.g(e, z3);
                            return z2;
                        }
                    }
                    z2 = z4;
                    z3 = true;
                    double d7 = (d2 + d) / 2.0d;
                    double d8 = (d3 + d4) / 2.0d;
                    double radians = Math.toRadians(d4 - d3) * 6366198.0d * Math.cos(Math.toRadians(d7));
                    if (Math.toRadians(d - d2) * 6366198.0d < 30.0d || radians < 30.0d) {
                        kj4 kj4Var = (kj4) onCreateLatLngBoundsBuilder;
                        kj4Var.T(new ak5(1.3499999414033853E-4d + d7, d8 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                        kj4Var.T(new ak5(d7 - 1.3499999414033853E-4d, d8 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                    }
                    this.F.c(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(((kj4) onCreateLatLngBoundsBuilder).d(), hl.L(60.0f)));
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    z2 = z4;
                }
            }
        }
        return false;
    }

    public final void m0(boolean z) {
        int i;
        if (this.R != null) {
            int i2 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                byte b = this.N0;
                if (b == 6) {
                    this.O0 = qu6.x(66.0f, measuredHeight, i2);
                } else if (b == 2) {
                    this.O0 = qu6.x(73.0f, measuredHeight, i2);
                } else {
                    this.O0 = qu6.x(66.0f, measuredHeight, i2);
                }
                nc6 nc6Var = this.R0;
                if (nc6Var != null && nc6Var.W(8) > 0) {
                    this.O0 -= hl.L(200.0f);
                }
                this.c0 = hl.L(100.0f) + (measuredHeight - this.O0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = hl.L(29.0f) + this.O0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.O0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((tt) ((am2) this.H).b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = o0();
                    x05 x05Var = this.F;
                    if (x05Var != null) {
                        x05Var.n(hl.L(70.0f), 0, hl.L(70.0f), n0());
                    }
                    ((tt) ((am2) this.H).b).setLayoutParams(layoutParams2);
                }
                this.Q.f();
                if (z) {
                    if (b == 3) {
                        i = 73;
                    } else if (b != 1 && b != 2) {
                        i = 0;
                    } else {
                        i = 66;
                    }
                    this.V.g1(0, -hl.L(i));
                    N0(false);
                    this.R.post(new gw1(this, i, (byte) 3));
                    return;
                }
                N0(false);
            }
        }
    }

    public final int n0() {
        return hl.L(10.0f) + this.h0 + this.c0;
    }

    public final int o0() {
        return hl.L(10.0f) + this.O0 + this.c0;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        bx8 bx8Var = this.O;
        if (bx8Var != null) {
            if (z) {
                bx8Var.a();
                return false;
            }
        } else {
            xj5 xj5Var = this.H;
            if (xj5Var != null && ((GLSurfaceView) ((am2) xj5Var).f) != null && !this.J) {
                if (z) {
                    A0();
                }
            } else {
                return super.onBackPressed(z);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, jn7.s);
        jn7.e().b(this, jn7.y4);
        jn7.e().b(this, jn7.z4);
        jn7.e().b(this, jn7.G4);
        r47 r47Var = this.J0;
        if (r47Var != null && r47Var.C3()) {
            getNotificationCenter().b(this, 1);
            getNotificationCenter().b(this, jn7.m0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jk6 jk6Var = this.e0;
        if (jk6Var != null) {
            jk6Var.i = true;
            jk6Var.g = false;
            jk6Var.d();
            jk6Var.d = null;
            jk6Var.e = null;
            jk6Var.f = null;
        }
        jn7.e().n(this, jn7.y4);
        jn7.e().n(this, jn7.z4);
        jn7.e().n(this, jn7.G4);
        getNotificationCenter().n(this, jn7.s);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, jn7.m0);
        M0();
        if (this.G0 != null) {
            try {
                ((pm3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        this.C0 = null;
        this.D0 = null;
        try {
            xj5 xj5Var = this.H;
            if (xj5Var != null) {
                ((am2) xj5Var).G();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        kc6 kc6Var = this.Q;
        if (kc6Var != null) {
            kc6Var.F();
        }
        q42 q42Var = this.T;
        if (q42Var != null) {
            q42Var.F();
        }
        dc6 dc6Var = this.Q0;
        if (dc6Var != null) {
            hl.r(dc6Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pc6 pc6Var = (pc6) arrayList.get(i);
            ImageReceiver imageReceiver = pc6Var.h;
            if (imageReceiver != null) {
                imageReceiver.K();
                pc6Var.h = null;
            }
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        c0();
    }

    @Override
    public final void onLowMemory() {
        ko9 ko9Var;
        super.onLowMemory();
        xj5 xj5Var = this.H;
        if (xj5Var != null && this.x0 && (ko9Var = (ko9) ((xq2) ((tt) ((am2) xj5Var).b).b).a) != null) {
            try {
                b1f b1fVar = (b1f) ko9Var.c;
                b1fVar.V(b1fVar.R(), 6);
            } catch (RemoteException e) {
                p3d.i(e);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        xj5 xj5Var = this.H;
        if (xj5Var != null && this.x0) {
            try {
                ((am2) xj5Var).H();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.y0 = false;
        M0();
        if (this.G0 != null) {
            try {
                ((pm3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
        P0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        hl.y2(getParentActivity(), this.classGuid);
        xj5 xj5Var = this.H;
        if (xj5Var != null && this.x0) {
            try {
                ((am2) xj5Var).I();
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        this.y0 = true;
        K0();
        L0();
        D0();
        m0(true);
        if (i0()) {
            this.t0 = false;
        } else if (this.t0 && (parentActivity = getParentActivity()) != null) {
            this.t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        dc6 dc6Var = this.Q0;
        if (dc6Var != null) {
            hl.r(dc6Var);
            hl.d3(this.Q0, 5000L);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            sla slaVar = this.r;
            if (slaVar != null && slaVar.getSearchField() != null) {
                this.r.getSearchField().setCursorColor(getThemedColor(aob.j5));
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2) {
            try {
                if (((tt) ((am2) this.H).b).getParent() instanceof ViewGroup) {
                    ((ViewGroup) ((tt) ((am2) this.H).b).getParent()).removeView((tt) ((am2) this.H).b);
                }
            } catch (Exception unused) {
            }
            b6 b6Var = this.P;
            if (b6Var != null) {
                b6Var.addView((tt) ((am2) this.H).b, 0, tre.e(-1, o0(), 51));
                N0(false);
                y0();
                D0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((tt) ((am2) this.H).b, 0, tre.e(-1, -1, 51));
            }
        }
    }

    public final boolean p0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(r47.B0(this.J0.k));
        if (arrayList != null && arrayList.isEmpty()) {
            j0(arrayList);
        } else {
            arrayList = null;
        }
        if (wf3.y(this.m0)) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.m0));
            if (xc2.T(M0) && !M0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = r47.B0(this.J0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().j1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new yu2(this, B0, (byte) 1));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView q0() {
        UndoView[] undoViewArr = this.x;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.P.removeView(undoViewArr[0]);
            this.P.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean r0() {
        if ((getResourceProvider() == null && aob.I.o()) || hl.B(getThemedColor(aob.d6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void s0(int i) {
        float e;
        float f;
        TLRPC.TL_messageMediaVenue H = this.T.H(i);
        if (H != null && H.icon != null && this.F != null) {
            this.K0 = true;
            this.simpleActionBar.o(true);
            boolean equals = "pin".equals(H.icon);
            x05 x05Var = this.F;
            if (equals) {
                e = x05Var.e();
                f = 4.0f;
            } else {
                e = x05Var.e();
                f = 9.0f;
            }
            float f2 = e - f;
            x05 x05Var2 = this.F;
            IMapsProvider j = org.telegram.messenger.a.j();
            TLRPC.GeoPoint geoPoint = H.geo;
            x05Var2.b(((z3f) j).newCameraUpdateLatLngZoom(new ak5(geoPoint.lat, geoPoint._long), f2));
            Location location = this.A0;
            if (location != null) {
                location.setLatitude(H.geo.lat);
                this.A0.setLongitude(H.geo._long);
            }
            this.Q.L(this.A0);
        }
    }

    public final void t0() {
        dc6 dc6Var;
        getLocationController().j(this.m0);
        if (!this.isPaused && (dc6Var = this.Q0) != null) {
            hl.d3(dc6Var, 5000L);
        }
    }

    public final void u0() {
        this.glassEngine.g();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0(int i, TLRPC.User user, boolean z) {
        int i2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z) {
            hd6 h = getLocationController().h(this.m0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = getMessagesController().j1(h.a);
                tL_messages_editMessage.id = h.b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = id6.f(this.currentAccount).s;
                tL_messages_editMessage.media.geo_point.lat = hl.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = hl.b0(location.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i3 = h.g;
                int i4 = h.f;
                if (i3 != i4) {
                    inputMedia.proximity_notification_radius = i4;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = id6.e(location);
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
                int i5 = inputMedia2.flags;
                inputMedia2.flags = i5 | 4;
                int i6 = Integer.MAX_VALUE;
                if (i == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = h.d + i;
                }
                h.d = i2;
                inputMedia2.period = i2;
                if (i != Integer.MAX_VALUE) {
                    i6 = h.c + i;
                }
                h.c = i6;
                inputMedia2.flags = i5 | 6;
                r47 r47Var = h.h;
                if (r47Var != null && (message = r47Var.k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i2;
                    getMessagesStorage().o1(h.h.k, null, null, true);
                }
                getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                jn7.e().k(jn7.G4, new Object[0]);
                return;
            }
            return;
        }
        I0(i, 0, user);
    }

    public final void x0() {
        this.glassEngine.g();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void y0() {
        SharedPreferences e1;
        int i;
        ImageView imageView = this.c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.E && (i = (e1 = uc7.e1()).getInt("proximityhint", 0)) < 3) {
            e1.edit().putInt("proximityhint", i + 1).commit();
            if (wf3.D(this.m0)) {
                this.s.t(ob6.a0("ProximityTooltioUser", null, 2131746339, lbc.k(getMessagesController().X1(Long.valueOf(this.m0)), true)));
            } else {
                this.s.t(ob6.M0(2131746340, null));
            }
            this.s.v();
        }
    }
}
