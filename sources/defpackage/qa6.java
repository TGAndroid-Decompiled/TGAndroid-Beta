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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class qa6 extends d implements gk7 {
    public Location A0;
    public int B0;
    public xo2 C0;
    public sy4 D0;
    public boolean E;
    public boolean E0;
    public ty4 F;
    public oh5 F0;
    public qh5 G;
    public z96 G0;
    public vh5 H;
    public TLRPC.TL_channelLocation H0;
    public qh5 I;
    public TLRPC.TL_channelLocation I0;
    public boolean J;
    public k27 J0;
    public float K;
    public boolean K0;
    public sk4 L;
    public boolean L0;
    public double M;
    public ma6 M0;
    public boolean N;
    public final byte N0;
    public st8 O;
    public int O0;
    public a6 P;
    public ka6 P0;
    public ga6 Q;
    public t96 Q0;
    public fu R;
    public ja6 R0;
    public o39 S;
    public l35 S0;
    public a42 T;
    public TL_stories.MediaArea T0;
    public View U;
    public boolean U0;
    public t26 V;
    public boolean V0;
    public xha W;
    public Boolean W0;
    public FrameLayout X;
    public FrameLayout Y;
    public il0 Z;
    public ImageView a;
    public final RectF a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public int c0;
    public xha d;
    public TextureView d0;
    public LinearLayout e;
    public fi6 e0;
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
    public final vf6 p0;
    public long q0;
    public xha r;
    public boolean r0;
    public je5 s;
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

    public qa6(int i) {
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
        this.p0 = new vf6();
        this.q0 = -1L;
        this.t0 = true;
        this.O0 = (gl.q.x - a.getCurrentActionBarHeight()) - gl.L(66.0f);
        this.V0 = true;
        this.N0 = i;
        gl.a0();
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

    public static yh5 y0(yh5 yh5Var, double d, double d2) {
        double d3 = yh5Var.a;
        return new yh5(d3 + Math.toDegrees(d / 6366198.0d), yh5Var.b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d3)) * 6366198.0d)));
    }

    public final void A0(la6 la6Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (la6Var != null && (message = la6Var.b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            k27 k27Var = this.J0;
            if (k27Var != null) {
                TLRPC.GeoPoint geoPoint2 = k27Var.k.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.H0.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        boolean z = w01.a;
        org.telegram.messenger.a.q();
        if (this.z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.z0.getLatitude()), Double.valueOf(this.z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public final void B0(final boolean z) {
        final TLRPC.User user;
        if (this.M0 != null && !i0() && getParentActivity() != null && this.z0 != null && f0()) {
            if (cf3.D(this.m0)) {
                user = getMessagesController().V1(Long.valueOf(this.m0));
            } else {
                user = null;
            }
            showDialog(ij.B(getParentActivity(), z, user, new uc7() {
                @Override
                public final void a(int i) {
                    boolean z2 = z;
                    qa6.this.v0(i, user, z2);
                }
            }, null));
        }
    }

    public final void C0() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        if (this.e0 != null && this.H != null) {
            TextureView textureView = this.d0;
            if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.e0.d) == null || !surfaceView.isAttachedToWindow())) {
                st stVar = (st) ((gl2) this.H).b;
                TextureView textureView2 = (TextureView) k0(stVar, TextureView.class);
                this.d0 = textureView2;
                fi6 fi6Var = this.e0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) k0(stVar, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (fi6Var.d != surfaceView2) {
                    fi6Var.d = surfaceView2;
                    fi6Var.a();
                }
                TextureView textureView3 = this.d0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof na6)) {
                        this.d0.setSurfaceTextureListener(new na6(this, surfaceTextureListener));
                    }
                }
                O0();
            }
            TextureView textureView4 = this.d0;
            if (textureView4 == null) {
                this.e0.a();
                return;
            }
            TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
            if (!(surfaceTextureListener2 instanceof na6)) {
                this.d0.setSurfaceTextureListener(new na6(this, surfaceTextureListener2));
            }
        }
    }

    public final void D0(Location location) {
        if (location == null) {
            return;
        }
        this.z0 = new Location(location);
        la6 la6Var = (la6) this.p0.f(getUserConfig().e());
        db6 h = getLocationController().h(this.m0);
        if (la6Var != null && h != null && la6Var.b.id == h.b) {
            yh5 yh5Var = new yh5(location.getLatitude(), location.getLongitude());
            la6Var.e.b(yh5Var);
            sy4 sy4Var = la6Var.f;
            if (sy4Var != null) {
                sy4Var.b(yh5Var);
            }
            if (this.q0 == la6Var.a) {
                this.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(la6Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            yh5 yh5Var2 = new yh5(location.getLatitude(), location.getLongitude());
            ga6 ga6Var = this.Q;
            if (ga6Var != null) {
                ga6Var.M(this.z0);
            }
            if (!this.K0) {
                this.A0 = new Location(location);
                if (this.L0) {
                    this.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(yh5Var2));
                } else {
                    this.L0 = true;
                    this.F.h(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(yh5Var2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.z0);
        }
        st8 st8Var = this.O;
        if (st8Var != null) {
            st8Var.c(true);
        }
        sk4 sk4Var = this.L;
        if (sk4Var != null) {
            double latitude = this.z0.getLatitude();
            double longitude = this.z0.getLongitude();
            fh2 fh2Var = (fh2) sk4Var.b;
            LatLng latLng = new LatLng(latitude, longitude);
            fh2Var.getClass();
            try {
                ome omeVar = (ome) fh2Var.a;
                Parcel R = omeVar.R();
                sgd.b(R, latLng);
                omeVar.V(R, 3);
            } catch (RemoteException e) {
                fvc.g(e);
                return;
            }
        }
        xo2 xo2Var = this.C0;
        if (xo2Var != null) {
            xo2Var.a(this.z0);
        }
        P0(true);
        Q0();
    }

    public final void E0(View view) {
        il0 c = getBaseSimpleGlass().c.c(view, null, false);
        c.p(nod.l(getResourceProvider()));
        c.r(gl.L(23.0f));
        c.q(gl.L(6.0f));
        view.setBackground(c);
        ote.a(view);
    }

    public final void F0(k27 k27Var) {
        this.J0 = k27Var;
        this.m0 = k27.B0(k27Var.k);
    }

    public final void G0(la6 la6Var) {
        if (la6Var.h == null) {
            TLRPC.User user = la6Var.c;
            TLRPC.Chat chat = la6Var.d;
            if (user == null && chat == 0) {
                return;
            }
            pb0 pb0Var = new pb0((wjb) null);
            if (user != null) {
                pb0Var.q(user);
            } else {
                pb0Var.p(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.h1 = new h45(this, la6Var, (byte) 14);
            imageReceiver.I();
            if (user == null) {
                user = chat;
            }
            imageReceiver.U(user, pb0Var, null);
            la6Var.h = imageReceiver;
        }
    }

    public final void H0(int i, int i2, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = gl.b0(this.z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = gl.b0(this.z0.getLongitude());
        tL_messageMediaGeoLive.heading = eb6.e(this.z0);
        int i3 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i;
        tL_messageMediaGeoLive.proximity_notification_radius = i2;
        tL_messageMediaGeoLive.flags = i3 | 9;
        this.M0.b(tL_messageMediaGeoLive, this.N0, true, 0, 0L);
        if (i2 > 0) {
            this.O.M = true;
            this.c.setImageResource(2131232216);
            st8 st8Var = this.O;
            if (st8Var != null) {
                st8Var.a();
            }
            q0().k(0L, 24, Integer.valueOf(i2), user, null, null);
            return;
        }
        finishFragment();
    }

    public final void I0(boolean z, boolean z2) {
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
        scaleX.scaleY(f4).setInterpolator(s33.h).setDuration(420L).withEndAction(new x6c((byte) 24, this, z)).start();
    }

    public final void J0() {
        if (this.F != null && this.y0) {
            xo2 xo2Var = this.C0;
            if (xo2Var == null) {
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
                        xo2Var = new xo2(new z96(this, (byte) 3));
                        this.C0 = xo2Var;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            xo2Var.a(this.z0);
            xo2 xo2Var2 = this.C0;
            if (!xo2Var2.f) {
                try {
                    if (xo2Var2.b == null) {
                        SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.a.b.getSystemService("sensor");
                        xo2Var2.b = sensorManager2;
                        if (sensorManager2 != null) {
                            Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                            xo2Var2.c = defaultSensor;
                            if (defaultSensor == null) {
                                xo2Var2.d = xo2Var2.b.getDefaultSensor(1);
                                xo2Var2.e = xo2Var2.b.getDefaultSensor(2);
                            }
                        } else {
                            return;
                        }
                    }
                    Sensor sensor = xo2Var2.c;
                    if (sensor != null) {
                        xo2Var2.b.registerListener(xo2Var2, sensor, 1);
                    } else {
                        Sensor sensor2 = xo2Var2.d;
                        if (sensor2 != null && xo2Var2.e != null) {
                            xo2Var2.b.registerListener(xo2Var2, sensor2, 1);
                            xo2Var2.b.registerListener(xo2Var2, xo2Var2.e, 1);
                        } else {
                            return;
                        }
                    }
                    xo2Var2.f = true;
                    xo2Var2.I = 0L;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
        }
    }

    public final void K0() {
        if (this.y0 && !this.k0) {
            if (this.G0 == null) {
                oh5 onCreateLocationRequest = ((xl3) org.telegram.messenger.a.i()).onCreateLocationRequest();
                this.F0 = onCreateLocationRequest;
                ((oy4) onCreateLocationRequest).c();
                ((oy4) this.F0).b();
                ((oy4) this.F0).a();
                this.G0 = new z96(this, (byte) 2);
            }
            try {
                ((xl3) org.telegram.messenger.a.i()).requestLocationUpdates(this.F0, this.G0);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void L0() {
        xo2 xo2Var = this.C0;
        if (xo2Var != null && xo2Var.f) {
            xo2Var.f = false;
            xo2Var.x = false;
            try {
                xo2Var.b.unregisterListener(xo2Var);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void M0(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        int i3;
        s49 K = this.R.K(0);
        if (K != null) {
            i = (int) K.a.getY();
            i2 = Math.min(i, 0) + this.O0;
            this.b0 = (this.O0 + i) - this.h0;
        } else {
            i = -this.P.getMeasuredHeight();
            this.b0 = -gl.L(41.0f);
            i2 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            vh5 vh5Var = this.H;
            int i4 = 4;
            if (i2 <= 0) {
                if (((st) ((gl2) vh5Var).b).getVisibility() == 0) {
                    ((st) ((gl2) this.H).b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((st) ((gl2) vh5Var).b).getVisibility() == 4) {
                ((st) ((gl2) this.H).b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i));
            int i5 = -i;
            ((st) ((gl2) this.H).b).setTranslationY(Math.max(0, i5 / 2));
            FrameLayout frameLayout = this.X;
            float f = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i));
                float l = Utilities.l((ls6.x(53.0f, i2 - this.h0, gl.L(46.0f) + dg0.d(this.mSystemInsets.b)) - gl.L(7.0f)) / gl.L(48.0f));
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
                O0();
            }
            View view = this.U;
            if (view != null) {
                if (view.getTag() != null) {
                    f = 69.0f;
                }
                int L = ((i2 / 2) + (i5 - gl.L(f))) - (this.h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (!z && (layoutParams = (FrameLayout.LayoutParams) ((st) ((gl2) this.H).b).getLayoutParams()) != null && layoutParams.height != o0()) {
                layoutParams.height = o0();
                ty4 ty4Var = this.F;
                if (ty4Var != null) {
                    ty4Var.n(gl.L(70.0f), 0, gl.L(70.0f), n0());
                }
                ((st) ((gl2) this.H).b).setLayoutParams(layoutParams);
            }
        }
    }

    public final void N0() {
        if (this.u0) {
            boolean z = this.w0;
            o39 o39Var = this.S;
            if (z) {
                o39Var.setEmptyView(null);
                this.e.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
            o39Var.setEmptyView(this.e);
            return;
        }
        this.e.setVisibility(8);
    }

    public final void O0() {
        vh5 vh5Var;
        boolean z;
        a6 a6Var;
        fi6 fi6Var = this.e0;
        if (fi6Var != null && (vh5Var = this.H) != null) {
            st stVar = (st) ((gl2) vh5Var).b;
            if (this.d0 == null && this.y0 && !isFinishing() && (a6Var = this.P) != null && a6Var.getVisibility() == 0 && stVar.getParent() != null && stVar.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (fi6Var.g != z) {
                fi6Var.g = z;
                if (z) {
                    fi6Var.a();
                } else {
                    fi6Var.d();
                }
            }
        }
    }

    public final void P0(boolean z) {
        Location location;
        boolean z2;
        float f;
        int i;
        if (this.F != null && (location = this.z0) != null) {
            xo2 xo2Var = this.C0;
            if (xo2Var != null && xo2Var.H) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                sy4 sy4Var = this.D0;
                int i2 = 2131231653;
                if (sy4Var == null) {
                    z24 z24Var = (z24) ((ize) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                    ((zi6) z24Var.b).a = new LatLng(this.z0.getLatitude(), this.z0.getLongitude());
                    zi6 zi6Var = (zi6) z24Var.b;
                    zi6Var.r = true;
                    zi6Var.e = 0.5f;
                    zi6Var.f = 0.5f;
                    if (z2) {
                        i = 2131231654;
                    } else {
                        i = 2131231653;
                    }
                    zi6Var.d = eod.b(i);
                    this.D0 = this.F.a(z24Var);
                    this.E0 = z2;
                } else if (z) {
                    double latitude = location.getLatitude();
                    double longitude = this.z0.getLongitude();
                    yi6 yi6Var = sy4Var.a;
                    LatLng latLng = new LatLng(latitude, longitude);
                    yi6Var.getClass();
                    try {
                        rhf rhfVar = (rhf) yi6Var.a;
                        Parcel R = rhfVar.R();
                        sgd.b(R, latLng);
                        rhfVar.V(R, 3);
                    } catch (RemoteException e) {
                        throw new RuntimeException(e);
                    }
                }
                sy4 sy4Var2 = this.D0;
                if (sy4Var2 != null) {
                    if (z2 != this.E0) {
                        if (z2) {
                            i2 = 2131231654;
                        }
                        sy4Var2.a.a(eod.b(i2));
                        this.E0 = z2;
                    }
                    sy4 sy4Var3 = this.D0;
                    if (z2) {
                        f = this.C0.G;
                    } else {
                        f = 0.0f;
                    }
                    sy4Var3.c(f);
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    public final void Q0() {
        int i;
        boolean z;
        TLRPC.MessageMedia messageMedia;
        int i2;
        if (this.b == null) {
            return;
        }
        boolean z2 = false;
        if (this.r0) {
            I0(false, true);
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
            TLRPC.Message message = ((la6) arrayList.get(i4)).b;
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
        I0(z2, true);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.m5));
        hashSet.add(Integer.valueOf(bkb.Z6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.Ii));
        hashSet.add(Integer.valueOf(bkb.ej));
        hashSet.add(Integer.valueOf(bkb.hj));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.wj));
    }

    public final la6 b0(TLRPC.Message message) {
        la6 la6Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = k27.B1(message.from_id);
        vf6 vf6Var = this.p0;
        la6 la6Var2 = (la6) vf6Var.f(B1);
        if (la6Var2 == null) {
            ?? obj = new Object();
            obj.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.c = getMessagesController().V1(Long.valueOf(obj.b.from_id.user_id));
                obj.a = obj.b.from_id.user_id;
            } else {
                long B0 = k27.B0(message);
                if (cf3.D(B0)) {
                    obj.c = getMessagesController().V1(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().K0(Long.valueOf(-B0));
                }
                obj.a = B0;
            }
            G0(obj);
            try {
                z24 z24Var = (z24) ((ize) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                zi6 zi6Var = (zi6) z24Var.b;
                ((zi6) z24Var.b).a = new LatLng(d, d2);
                Bitmap h0 = h0(obj);
                la6Var = obj;
                if (h0 != null) {
                    zi6Var.d = eod.a(h0);
                    zi6Var.e = 0.5f;
                    zi6Var.f = 0.8010882f;
                    obj.e = this.F.a(z24Var);
                    if (!l7c.D(obj.c)) {
                        z24 z24Var2 = (z24) ((ize) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                        ((zi6) z24Var2.b).a = new LatLng(d, d2);
                        zi6 zi6Var2 = (zi6) z24Var2.b;
                        zi6Var2.r = true;
                        zi6Var2.e = 0.5f;
                        zi6Var2.f = 0.5f;
                        sy4 a = this.F.a(z24Var2);
                        obj.f = a;
                        int i = message.media.heading;
                        if (i != 0) {
                            a.c(i);
                            obj.f.a.a(eod.b(2131231654));
                            obj.g = true;
                        } else {
                            a.c(0.0f);
                            obj.f.a.a(eod.b(2131231653));
                            obj.g = false;
                        }
                    }
                    this.o0.add(obj);
                    vf6Var.k(obj, obj.a);
                    db6 h = getLocationController().h(this.m0);
                    int i2 = (obj.a > getUserConfig().e() ? 1 : (obj.a == getUserConfig().e() ? 0 : -1));
                    la6Var = obj;
                    la6Var = obj;
                    if (i2 == 0 && h != null) {
                        int i3 = obj.b.id;
                        la6Var = obj;
                        if (i3 == h.b) {
                            Location location = this.z0;
                            la6Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.z0.getLongitude();
                                yi6 yi6Var = obj.e.a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                yi6Var.getClass();
                                try {
                                    rhf rhfVar = (rhf) yi6Var.a;
                                    Parcel R = rhfVar.R();
                                    sgd.b(R, latLng);
                                    rhfVar.V(R, 3);
                                    la6Var = obj;
                                } catch (RemoteException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
                la6Var = obj;
            }
        } else {
            la6Var2.b = message;
            yi6 yi6Var2 = la6Var2.e.a;
            LatLng latLng2 = new LatLng(d, d2);
            yi6Var2.getClass();
            try {
                rhf rhfVar2 = (rhf) yi6Var2.a;
                Parcel R2 = rhfVar2.R();
                sgd.b(R2, latLng2);
                rhfVar2.V(R2, 3);
                int i4 = (this.q0 > la6Var2.a ? 1 : (this.q0 == la6Var2.a ? 0 : -1));
                la6Var = la6Var2;
                if (i4 == 0) {
                    this.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(la6Var2.e.a()));
                    la6Var = la6Var2;
                }
            } catch (RemoteException e3) {
                fvc.g(e3);
                return null;
            }
        }
        st8 st8Var = this.O;
        if (st8Var != null) {
            st8Var.c(true);
        }
        Q0();
        return la6Var;
    }

    public final void c0() {
        if (this.fragmentView != null && this.R != null) {
            io5 io5Var = this.mSystemInsets;
            int i = io5Var.b;
            int i2 = io5Var.d;
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                int d = dg0.d(i) - gl.L(6.0f);
                if (layoutParams.topMargin != d) {
                    layoutParams.topMargin = d;
                    this.X.requestLayout();
                }
            }
            this.R.setClipToPadding(false);
            this.R.setPadding(0, 0, 0, i2);
            o39 o39Var = this.S;
            if (o39Var != null) {
                o39Var.setClipToPadding(false);
                dg0.e(this.S, i, i2, a.getCurrentActionBarHeight(), 0);
            }
            if (this.fragmentView.getMeasuredHeight() > 0) {
                m0(false);
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa6.createView(android.content.Context):android.view.View");
    }

    public final void d0(Canvas canvas, RectF rectF) {
        st stVar;
        int i = bkb.g5;
        int themedColor = getThemedColor(i);
        Paint paint = this.g0;
        paint.setColor(themedColor);
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        o39 o39Var = this.S;
        if (o39Var != null && o39Var.getVisibility() == 0) {
            o39 o39Var2 = this.S;
            tk0.a(o39Var2, canvas, rectF, o39Var2, viewGroup);
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
            vh5 vh5Var = this.H;
            if (vh5Var != null) {
                stVar = (st) ((gl2) vh5Var).b;
            } else {
                stVar = null;
            }
            if (stVar != null && stVar.getParent() == this.P && stVar.getVisibility() == 0 && stVar.getAlpha() > 0.0f) {
                TextureView textureView = this.d0;
                RectF rectF2 = this.f0;
                if (textureView != null && textureView.isAttachedToWindow() && zec.c(this.d0, this.P, rectF2)) {
                    if (stVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (stVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    this.d0.draw(canvas);
                    canvas.restore();
                } else if (this.e0 != null) {
                    rectF2.set(stVar.getX(), stVar.getY(), stVar.getX() + stVar.getWidth(), stVar.getY() + stVar.getHeight());
                    fi6 fi6Var = this.e0;
                    float alpha = stVar.getAlpha();
                    Paint paint2 = fi6Var.c;
                    Bitmap bitmap = fi6Var.e;
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
            int L = gl.L(22.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
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
            fu fuVar = this.R;
            tk0.a(fuVar, canvas, rectF, fuVar, viewGroup);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ga6 ga6Var;
        long B0;
        ga6 ga6Var2;
        if (i == kk7.s) {
            removeSelfFromStack(true);
            return;
        }
        if (i == kk7.x4) {
            this.k0 = false;
            ga6 ga6Var3 = this.Q;
            if (ga6Var3 != null) {
                ga6Var3.O(false, false);
            }
            K0();
        } else if (i == kk7.y4) {
            this.k0 = true;
            ga6 ga6Var4 = this.Q;
            if (ga6Var4 != null) {
                ga6Var4.O(true, false);
            }
        } else if (i == kk7.F4) {
            ga6 ga6Var5 = this.Q;
            if (ga6Var5 != null) {
                ga6Var5.f();
            }
            Q0();
        } else if (i == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.m0 && this.J0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z = false;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    k27 k27Var = (k27) arrayList.get(i3);
                    boolean C3 = k27Var.C3();
                    TLRPC.Message message = k27Var.k;
                    if (C3) {
                        b0(message);
                        z = true;
                    } else if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && cf3.D(k27.B0(message))) {
                        this.c.setImageResource(2131232215);
                        sk4 sk4Var = this.L;
                        if (sk4Var != null) {
                            sk4Var.h0();
                            this.L = null;
                        }
                    }
                }
                if (z && (ga6Var2 = this.Q) != null) {
                    ga6Var2.N(this.o0);
                }
            }
        } else if (i == kk7.l0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.m0 && this.J0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    k27 k27Var2 = (k27) arrayList2.get(i4);
                    if (k27Var2.C3()) {
                        TLRPC.Message message2 = k27Var2.k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = k27.B1(peer);
                        } else {
                            B0 = k27.B0(message2);
                        }
                        la6 la6Var = (la6) this.p0.f(B0);
                        if (la6Var != null) {
                            db6 h = getLocationController().h(longValue);
                            if (h == null || h.b != k27Var2.e1()) {
                                TLRPC.Message message3 = k27Var2.k;
                                la6Var.b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                yh5 yh5Var = new yh5(geoPoint.lat, geoPoint._long);
                                la6Var.e.b(yh5Var);
                                if (this.q0 == la6Var.a) {
                                    this.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(la6Var.e.a()));
                                }
                                sy4 sy4Var = la6Var.f;
                                if (sy4Var != null) {
                                    sy4Var.a();
                                    la6Var.f.b(yh5Var);
                                    int i5 = k27Var2.k.media.heading;
                                    if (i5 != 0) {
                                        la6Var.f.c(i5);
                                        if (!la6Var.g) {
                                            la6Var.f.a.a(eod.b(2131231654));
                                            la6Var.g = true;
                                        }
                                    } else if (la6Var.g) {
                                        la6Var.f.c(0.0f);
                                        la6Var.f.a.a(eod.b(2131231653));
                                        la6Var.g = false;
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                }
                if (z2 && (ga6Var = this.Q) != null) {
                    ga6Var.f();
                    st8 st8Var = this.O;
                    if (st8Var != null) {
                        st8Var.c(true);
                    }
                }
                if (z2) {
                    Q0();
                }
            }
        }
    }

    public final void e0() {
        int i;
        il0 il0Var = this.Z;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        fu fuVar = this.R;
        if (fuVar != null) {
            fuVar.invalidate();
        }
        if (this.F != null) {
            if (gl.B(getThemedColor(bkb.c6)) < 0.721f) {
                i = 2131624086;
            } else {
                i = 0;
            }
            boolean z = this.i0;
            if (i != 0) {
                if (!z) {
                    this.i0 = true;
                    this.F.i(((ize) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, i));
                    sk4 sk4Var = this.L;
                    if (sk4Var != null) {
                        sk4Var.o0(-1);
                        this.L.k0(553648127);
                    }
                }
            } else if (z) {
                this.i0 = false;
                this.F.i(null);
                sk4 sk4Var2 = this.L;
                if (sk4Var2 != null) {
                    sk4Var2.o0(-16777216);
                    this.L.k0(536870912);
                }
            }
            C0();
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
                    int i = bkb.K5;
                    alertDialog$Builder.l(2131624120, 72, getThemedColor(i), null);
                    alertDialog$Builder.m(i, getResourceProvider());
                    alertDialog$Builder.a.U = k96.M0(2131749355, null);
                    alertDialog$Builder.j(k96.M0(2131751794, null), new z96(this, (byte) 5));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return true;
            }
        }
        return true;
    }

    @Override
    public final boolean finishFragment(boolean z) {
        if (z0()) {
            return false;
        }
        return super.finishFragment(z);
    }

    public final void g0(int i) {
        iwe ezcVar;
        if (this.F == null) {
            return;
        }
        List<ci5> asList = Arrays.asList(new ci5[]{new Object(), new Object()});
        rh5 onCreateCircleOptions = ((ize) org.telegram.messenger.a.j()).onCreateCircleOptions();
        double latitude = this.z0.getLatitude();
        double longitude = this.z0.getLongitude();
        hh2 hh2Var = (hh2) ((pj4) onCreateCircleOptions).b;
        LatLng latLng = new LatLng(latitude, longitude);
        hh2Var.getClass();
        hh2Var.a = latLng;
        double d = i;
        hh2 hh2Var2 = (hh2) ((pj4) onCreateCircleOptions).b;
        hh2Var2.b = d;
        if (r0()) {
            hh2Var2.d = -1771658281;
            hh2Var2.e = 476488663;
        } else {
            hh2Var2.d = -1774024971;
            hh2Var2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (ci5 ci5Var : asList) {
            if (ci5Var instanceof bi5) {
                arrayList.add(new g53(20.0f, (byte) 1));
            } else if (ci5Var instanceof ai5) {
                arrayList.add(new g53(20.0f, (byte) 0));
            }
        }
        hh2Var2.r = arrayList;
        hh2Var2.c = 2.0f;
        ty4 ty4Var = this.F;
        wk4 wk4Var = ty4Var.a;
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            sgd.b(R, hh2Var2);
            Parcel Q = a6eVar.Q(R, 35);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i2 = yre.b;
            if (readStrongBinder == null) {
                ezcVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (queryLocalInterface instanceof iwe) {
                    ezcVar = (iwe) queryLocalInterface;
                } else {
                    ezcVar = new ezc(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", (byte) 6);
                }
            }
            Q.recycle();
            fh2 fh2Var = new fh2(ezcVar);
            sk4 sk4Var = new sk4(ty4Var, fh2Var, false, (byte) 2);
            ty4Var.c.put(fh2Var, sk4Var);
            this.L = sk4Var;
        } catch (RemoteException e) {
            fvc.g(e);
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
            arrayList.add(new blb(undoViewArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.vj));
            i++;
        }
        arrayList.add(new blb(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g5));
        xha xhaVar = this.r;
        if (xhaVar != null) {
            editTextBoldCursor = xhaVar.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new blb(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.i5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ij));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.jj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.oj));
        arrayList.add(new blb(this.R, 393216, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.dj));
        arrayList.add(new blb(this.R, 393216, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.gj));
        arrayList.add(new blb(this.R, 393248, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.cj));
        arrayList.add(new blb(this.R, 393248, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.fj));
        arrayList.add(new blb(this.R, 196608, new Class[]{fb6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.Gi));
        return arrayList;
    }

    public final Bitmap h0(la6 la6Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(gl.L(62.0f), gl.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.a.b.getResources().getDrawable(2131231655);
                drawable.setBounds(0, 0, gl.L(62.0f), gl.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                pb0 pb0Var = new pb0((wjb) null);
                TLRPC.User user = la6Var.c;
                if (user != null) {
                    pb0Var.q(user);
                } else {
                    TLRPC.Chat chat = la6Var.d;
                    if (chat != null) {
                        pb0Var.p(chat);
                    }
                }
                canvas.translate(gl.L(6.0f), gl.L(6.0f));
                pb0Var.setBounds(0, 0, gl.L(50.0f), gl.L(50.0f));
                pb0Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = la6Var.h;
                if (imageReceiver != null && imageReceiver.C()) {
                    bitmap = la6Var.h.n();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = gl.L(50.0f) / bitmap.getWidth();
                    matrix.postScale(L, L);
                    matrix.postTranslate(gl.L(6.0f), gl.L(6.0f));
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(gl.L(6.0f), gl.L(6.0f), gl.L(56.0f), gl.L(56.0f));
                    canvas.drawRoundRect(rectF, gl.L(25.0f), gl.L(25.0f), paint);
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
                fa4.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean i0() {
        return this instanceof tt1;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (bm2.h(getThemedColor(bkb.c6)) > 0.699999988079071d) {
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
        th5 th5Var;
        if (this.n0) {
            th5Var = ((ize) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
        } else {
            th5Var = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            int i2 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i3 = messageMedia.period;
            if (i2 + i3 > currentTime || i3 == Integer.MAX_VALUE) {
                if (th5Var != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((gi3) th5Var).t(new yh5(geoPoint.lat, geoPoint._long));
                }
                b0(message);
                if (this.c.getVisibility() != 8 && k27.B1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new v85(this, (byte) 13)).start();
                }
            }
        }
        if (th5Var != null) {
            if (this.n0) {
                this.R.x0(0, gl.L(99.0f), null);
            }
            this.n0 = false;
            this.Q.N(this.o0);
            if (this.J0.C3()) {
                try {
                    gi3 gi3Var = (gi3) th5Var;
                    yh5 a = gi3Var.c().a();
                    yh5 y0 = y0(a, 100.0d, 100.0d);
                    gi3Var.t(y0(a, -100.0d, -100.0d));
                    gi3Var.t(y0);
                    qy4 c = gi3Var.c();
                    if (arrayList.size() > 1) {
                        try {
                            qh5 newCameraUpdateLatLngBounds = ((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(c, gl.L(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.h(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e) {
                            fa4.g(e, true);
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
                la6 la6Var = (la6) arrayList2.get(i3);
                sy4 sy4Var = la6Var.e;
                if (sy4Var != null && (message = la6Var.b) != null && (messageMedia = message.media) != null && ((i2 = messageMedia.period) == Integer.MAX_VALUE || message.date + i2 > i)) {
                    arrayList.add(sy4Var.a());
                }
            }
            if (this.p0.f(getUserConfig().e()) != null) {
                z = true;
            } else {
                z = false;
            }
            Location location = this.z0;
            if (location != null && !z) {
                arrayList.add(new yh5(location.getLatitude(), this.z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    th5 onCreateLatLngBoundsBuilder = ((ize) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i4 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d3 = Double.MAX_VALUE;
                    double d4 = -1.7976931348623157E308d;
                    while (i4 < size2) {
                        yh5 yh5Var = (yh5) arrayList.get(i4);
                        z2 = z4;
                        try {
                            ((gi3) onCreateLatLngBoundsBuilder).t(yh5Var);
                            int i5 = size2;
                            z3 = true;
                            try {
                                double d5 = yh5Var.a;
                                if (d5 < d2) {
                                    d2 = d5;
                                }
                                if (d5 > d) {
                                    d = d5;
                                }
                                double d6 = yh5Var.b;
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
                                fa4.g(e, z3);
                                return z2;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z3 = true;
                            fa4.g(e, z3);
                            return z2;
                        }
                    }
                    z2 = z4;
                    z3 = true;
                    double d7 = (d2 + d) / 2.0d;
                    double d8 = (d3 + d4) / 2.0d;
                    double radians = Math.toRadians(d4 - d3) * 6366198.0d * Math.cos(Math.toRadians(d7));
                    if (Math.toRadians(d - d2) * 6366198.0d < 30.0d || radians < 30.0d) {
                        gi3 gi3Var = (gi3) onCreateLatLngBoundsBuilder;
                        gi3Var.t(new yh5(1.3499999414033853E-4d + d7, d8 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                        gi3Var.t(new yh5(d7 - 1.3499999414033853E-4d, d8 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                    }
                    this.F.c(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(((gi3) onCreateLatLngBoundsBuilder).c(), gl.L(60.0f)));
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
                    this.O0 = ls6.x(66.0f, measuredHeight, i2);
                } else if (b == 2) {
                    this.O0 = ls6.x(73.0f, measuredHeight, i2);
                } else {
                    this.O0 = ls6.x(66.0f, measuredHeight, i2);
                }
                ja6 ja6Var = this.R0;
                if (ja6Var != null && ja6Var.W(8) > 0) {
                    this.O0 -= gl.L(200.0f);
                }
                this.c0 = gl.L(100.0f) + (measuredHeight - this.O0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = gl.L(29.0f) + this.O0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.O0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((st) ((gl2) this.H).b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = o0();
                    ty4 ty4Var = this.F;
                    if (ty4Var != null) {
                        ty4Var.n(gl.L(70.0f), 0, gl.L(70.0f), n0());
                    }
                    ((st) ((gl2) this.H).b).setLayoutParams(layoutParams2);
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
                    this.V.g1(0, -gl.L(i));
                    M0(false);
                    this.R.post(new sv1(this, i, (byte) 3));
                    return;
                }
                M0(false);
            }
        }
    }

    public final int n0() {
        return gl.L(10.0f) + this.h0 + this.c0;
    }

    public final int o0() {
        return gl.L(10.0f) + this.O0 + this.c0;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        st8 st8Var = this.O;
        if (st8Var != null) {
            if (z) {
                st8Var.a();
                return false;
            }
        } else {
            vh5 vh5Var = this.H;
            if (vh5Var != null && ((GLSurfaceView) ((gl2) vh5Var).f) != null && !this.J) {
                if (z) {
                    z0();
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
        getNotificationCenter().b(this, kk7.s);
        kk7.e().b(this, kk7.x4);
        kk7.e().b(this, kk7.y4);
        kk7.e().b(this, kk7.F4);
        k27 k27Var = this.J0;
        if (k27Var != null && k27Var.C3()) {
            getNotificationCenter().b(this, 1);
            getNotificationCenter().b(this, kk7.l0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        fi6 fi6Var = this.e0;
        if (fi6Var != null) {
            fi6Var.i = true;
            fi6Var.g = false;
            fi6Var.d();
            fi6Var.d = null;
            fi6Var.e = null;
            fi6Var.f = null;
        }
        kk7.e().n(this, kk7.x4);
        kk7.e().n(this, kk7.y4);
        kk7.e().n(this, kk7.F4);
        getNotificationCenter().n(this, kk7.s);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, kk7.l0);
        L0();
        if (this.G0 != null) {
            try {
                ((xl3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        this.C0 = null;
        this.D0 = null;
        try {
            vh5 vh5Var = this.H;
            if (vh5Var != null) {
                ((gl2) vh5Var).H();
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ga6 ga6Var = this.Q;
        if (ga6Var != null) {
            ga6Var.F();
        }
        a42 a42Var = this.T;
        if (a42Var != null) {
            a42Var.F();
        }
        t96 t96Var = this.Q0;
        if (t96Var != null) {
            gl.r(t96Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            la6 la6Var = (la6) arrayList.get(i);
            ImageReceiver imageReceiver = la6Var.h;
            if (imageReceiver != null) {
                imageReceiver.K();
                la6Var.h = null;
            }
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        c0();
    }

    @Override
    public final void onLowMemory() {
        vk9 vk9Var;
        super.onLowMemory();
        vh5 vh5Var = this.H;
        if (vh5Var != null && this.x0 && (vk9Var = (vk9) ((eq2) ((st) ((gl2) vh5Var).b).b).a) != null) {
            try {
                kwe kweVar = (kwe) vk9Var.c;
                kweVar.V(kweVar.R(), 6);
            } catch (RemoteException e) {
                fvc.g(e);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        vh5 vh5Var = this.H;
        if (vh5Var != null && this.x0) {
            try {
                ((gl2) vh5Var).I();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.y0 = false;
        L0();
        if (this.G0 != null) {
            try {
                ((xl3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        O0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        gl.V2(getParentActivity(), this.classGuid);
        gl.y2(getParentActivity(), this.classGuid);
        vh5 vh5Var = this.H;
        if (vh5Var != null && this.x0) {
            try {
                ((gl2) vh5Var).J();
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        this.y0 = true;
        J0();
        K0();
        C0();
        m0(true);
        if (i0()) {
            this.t0 = false;
        } else if (this.t0 && (parentActivity = getParentActivity()) != null) {
            this.t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        t96 t96Var = this.Q0;
        if (t96Var != null) {
            gl.r(t96Var);
            gl.d3(this.Q0, 5000L);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            xha xhaVar = this.r;
            if (xhaVar != null && xhaVar.getSearchField() != null) {
                this.r.getSearchField().setCursorColor(getThemedColor(bkb.i5));
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2) {
            try {
                if (((st) ((gl2) this.H).b).getParent() instanceof ViewGroup) {
                    ((ViewGroup) ((st) ((gl2) this.H).b).getParent()).removeView((st) ((gl2) this.H).b);
                }
            } catch (Exception unused) {
            }
            a6 a6Var = this.P;
            if (a6Var != null) {
                a6Var.addView((st) ((gl2) this.H).b, 0, nme.e(-1, o0(), 51));
                M0(false);
                x0();
                C0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((st) ((gl2) this.H).b, 0, nme.e(-1, -1, 51));
            }
        }
    }

    public final boolean p0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(k27.B0(this.J0.k));
        if (arrayList != null && arrayList.isEmpty()) {
            j0(arrayList);
        } else {
            arrayList = null;
        }
        if (cf3.y(this.m0)) {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-this.m0));
            if (hc2.T(K0) && !K0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = k27.B0(this.J0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().h1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new eu2(this, B0, (byte) 1));
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
        if ((getResourceProvider() == null && bkb.I.o()) || gl.B(getThemedColor(bkb.c6)) < 0.721f) {
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
            this.simpleActionBar.n(true);
            boolean equals = "pin".equals(H.icon);
            ty4 ty4Var = this.F;
            if (equals) {
                e = ty4Var.e();
                f = 4.0f;
            } else {
                e = ty4Var.e();
                f = 9.0f;
            }
            float f2 = e - f;
            ty4 ty4Var2 = this.F;
            IMapsProvider j = org.telegram.messenger.a.j();
            TLRPC.GeoPoint geoPoint = H.geo;
            ty4Var2.b(((ize) j).newCameraUpdateLatLngZoom(new yh5(geoPoint.lat, geoPoint._long), f2));
            Location location = this.A0;
            if (location != null) {
                location.setLatitude(H.geo.lat);
                this.A0.setLongitude(H.geo._long);
            }
            this.Q.L(this.A0);
        }
    }

    public final void t0() {
        t96 t96Var;
        getLocationController().j(this.m0);
        if (!this.isPaused && (t96Var = this.Q0) != null) {
            gl.d3(t96Var, 5000L);
        }
    }

    public final void u0() {
        this.glassEngine.g();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(int i, TLRPC.User user, boolean z) {
        int i2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z) {
            db6 h = getLocationController().h(this.m0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = getMessagesController().h1(h.a);
                tL_messages_editMessage.id = h.b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = eb6.f(this.currentAccount).s;
                tL_messages_editMessage.media.geo_point.lat = gl.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = gl.b0(location.getLongitude());
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
                inputMedia.heading = eb6.e(location);
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
                k27 k27Var = h.h;
                if (k27Var != null && (message = k27Var.k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i2;
                    getMessagesStorage().o1(h.h.k, null, null, true);
                }
                getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                kk7.e().k(kk7.F4, new Object[0]);
                return;
            }
            return;
        }
        H0(i, 0, user);
    }

    public final void w0() {
        this.glassEngine.g();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void x0() {
        SharedPreferences c1;
        int i;
        ImageView imageView = this.c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.E && (i = (c1 = na7.c1()).getInt("proximityhint", 0)) < 3) {
            c1.edit().putInt("proximityhint", i + 1).commit();
            if (cf3.D(this.m0)) {
                this.s.t(k96.a0("ProximityTooltioUser", null, 2131746419, l7c.k(getMessagesController().V1(Long.valueOf(this.m0)), true)));
            } else {
                this.s.t(k96.M0(2131746420, null));
            }
            this.s.v();
        }
    }

    public final boolean z0() {
        GLSurfaceView gLSurfaceView;
        vh5 vh5Var = this.H;
        if (vh5Var != null && (gLSurfaceView = (GLSurfaceView) ((gl2) vh5Var).f) != null && !this.J) {
            gLSurfaceView.queueEvent(new kz5(this, gLSurfaceView, (byte) 12));
            return true;
        }
        return false;
    }
}
