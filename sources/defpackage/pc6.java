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
public class pc6 extends d implements jm7 {
    public Location A0;
    public int B0;
    public iq2 C0;
    public r05 D0;
    public boolean E;
    public boolean E0;
    public s05 F;
    public nj5 F0;
    public pj5 G;
    public yb6 G0;
    public uj5 H;
    public TLRPC.TL_channelLocation H0;
    public pj5 I;
    public TLRPC.TL_channelLocation I0;
    public boolean J;
    public k47 J0;
    public float K;
    public boolean K0;
    public mj4 L;
    public boolean L0;
    public double M;
    public lc6 M0;
    public boolean N;
    public final byte N0;
    public tv8 O;
    public int O0;
    public a6 P;
    public jc6 P0;
    public fc6 Q;
    public sb6 Q0;
    public fv R;
    public ic6 R0;
    public r59 S;
    public l55 S0;
    public l52 T;
    public TL_stories.MediaArea T0;
    public View U;
    public boolean U0;
    public u46 V;
    public boolean V0;
    public zja W;
    public Boolean W0;
    public FrameLayout X;
    public FrameLayout Y;
    public im0 Z;
    public ImageView a;
    public final RectF a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public int c0;
    public zja d;
    public TextureView d0;
    public LinearLayout e;
    public hk6 e0;
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
    public final vh6 p0;
    public long q0;
    public zja r;
    public boolean r0;
    public hg5 s;
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

    public pc6(int i) {
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
        this.p0 = new vh6();
        this.q0 = -1L;
        this.t0 = true;
        this.O0 = (gm.q.x - a.getCurrentActionBarHeight()) - gm.L(66.0f);
        this.V0 = true;
        this.N0 = i;
        gm.a0();
    }

    public static View l0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View l0 = l0(viewGroup.getChildAt(i), cls);
                if (l0 != null) {
                    return l0;
                }
            }
            return null;
        }
        return null;
    }

    public static xj5 z0(xj5 xj5Var, double d, double d2) {
        double d3 = xj5Var.a;
        return new xj5(d3 + Math.toDegrees(d / 6366198.0d), xj5Var.b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d3)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        uj5 uj5Var = this.H;
        if (uj5Var != null && (gLSurfaceView = (GLSurfaceView) ((sm2) uj5Var).f) != null && !this.J) {
            gLSurfaceView.queueEvent(new k16(this, gLSurfaceView, (byte) 13));
            return true;
        }
        return false;
    }

    public final void B0(kc6 kc6Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (kc6Var != null && (message = kc6Var.b) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            k47 k47Var = this.J0;
            if (k47Var != null) {
                TLRPC.GeoPoint geoPoint2 = k47Var.k.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.H0.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        boolean z = e21.a;
        org.telegram.messenger.a.q();
        if (this.z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.z0.getLatitude()), Double.valueOf(this.z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void C0(final boolean z) {
        final TLRPC.User user;
        if (this.M0 != null && !j0() && getParentActivity() != null && this.z0 != null && g0()) {
            if (pg3.D(this.m0)) {
                user = getMessagesController().W1(Long.valueOf(this.m0));
            } else {
                user = null;
            }
            showDialog(ik.B(getParentActivity(), z, user, new we7() {
                @Override
                public final void a(int i) {
                    boolean z2 = z;
                    pc6.this.w0(i, user, z2);
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
                su suVar = (su) ((sm2) this.H).b;
                TextureView textureView2 = (TextureView) l0(suVar, TextureView.class);
                this.d0 = textureView2;
                hk6 hk6Var = this.e0;
                if (textureView2 == null) {
                    surfaceView2 = (SurfaceView) l0(suVar, SurfaceView.class);
                } else {
                    surfaceView2 = null;
                }
                if (hk6Var.d != surfaceView2) {
                    hk6Var.d = surfaceView2;
                    hk6Var.a();
                }
                TextureView textureView3 = this.d0;
                if (textureView3 != null) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                    if (!(surfaceTextureListener instanceof mc6)) {
                        this.d0.setSurfaceTextureListener(new mc6(this, surfaceTextureListener));
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
            if (!(surfaceTextureListener2 instanceof mc6)) {
                this.d0.setSurfaceTextureListener(new mc6(this, surfaceTextureListener2));
            }
        }
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.z0 = new Location(location);
        kc6 kc6Var = (kc6) this.p0.f(getUserConfig().e());
        cd6 h = getLocationController().h(this.m0);
        if (kc6Var != null && h != null && kc6Var.b.id == h.b) {
            xj5 xj5Var = new xj5(location.getLatitude(), location.getLongitude());
            kc6Var.e.b(xj5Var);
            r05 r05Var = kc6Var.f;
            if (r05Var != null) {
                r05Var.b(xj5Var);
            }
            if (this.q0 == kc6Var.a) {
                this.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(kc6Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            xj5 xj5Var2 = new xj5(location.getLatitude(), location.getLongitude());
            fc6 fc6Var = this.Q;
            if (fc6Var != null) {
                fc6Var.M(this.z0);
            }
            if (!this.K0) {
                this.A0 = new Location(location);
                if (this.L0) {
                    this.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(xj5Var2));
                } else {
                    this.L0 = true;
                    this.F.h(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(xj5Var2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.z0);
        }
        tv8 tv8Var = this.O;
        if (tv8Var != null) {
            tv8Var.c(true);
        }
        mj4 mj4Var = this.L;
        if (mj4Var != null) {
            double latitude = this.z0.getLatitude();
            double longitude = this.z0.getLongitude();
            ti2 ti2Var = (ti2) mj4Var.b;
            LatLng latLng = new LatLng(latitude, longitude);
            ti2Var.getClass();
            try {
                roe roeVar = (roe) ti2Var.a;
                Parcel R = roeVar.R();
                tid.b(R, latLng);
                roeVar.V(R, 3);
            } catch (RemoteException e) {
                i2d.h(e);
                return;
            }
        }
        iq2 iq2Var = this.C0;
        if (iq2Var != null) {
            iq2Var.a(this.z0);
        }
        Q0(true);
        R0();
    }

    public final void F0(View view) {
        im0 c = getBaseSimpleGlass().c.c(view, null, false);
        c.p(qqd.l(getResourceProvider()));
        c.r(gm.L(23.0f));
        c.q(gm.L(6.0f));
        view.setBackground(c);
        rve.a(view);
    }

    public final void G0(k47 k47Var) {
        this.J0 = k47Var;
        this.m0 = k47.B0(k47Var.k);
    }

    public final void H0(kc6 kc6Var) {
        if (kc6Var.h == null) {
            TLRPC.User user = kc6Var.c;
            TLRPC.Chat chat = kc6Var.d;
            if (user == null && chat == 0) {
                return;
            }
            pc0 pc0Var = new pc0((ylb) null);
            if (user != null) {
                pc0Var.q(user);
            } else {
                pc0Var.p(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.h1 = new nv4(this, kc6Var, (byte) 15);
            imageReceiver.I();
            if (user == null) {
                user = chat;
            }
            imageReceiver.U(user, pc0Var, null);
            kc6Var.h = imageReceiver;
        }
    }

    public final void I0(int i, int i2, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = gm.b0(this.z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = gm.b0(this.z0.getLongitude());
        tL_messageMediaGeoLive.heading = dd6.e(this.z0);
        int i3 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i;
        tL_messageMediaGeoLive.proximity_notification_radius = i2;
        tL_messageMediaGeoLive.flags = i3 | 9;
        this.M0.b(tL_messageMediaGeoLive, this.N0, true, 0, 0L);
        if (i2 > 0) {
            this.O.M = true;
            this.c.setImageResource(2131232217);
            tv8 tv8Var = this.O;
            if (tv8Var != null) {
                tv8Var.a();
            }
            r0().k(0L, 24, Integer.valueOf(i2), user, null, null);
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
        scaleX.scaleY(f4).setInterpolator(d53.h).setDuration(420L).withEndAction(new y8c((byte) 24, this, z)).start();
    }

    public final void K0() {
        if (this.F != null && this.y0) {
            iq2 iq2Var = this.C0;
            if (iq2Var == null) {
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
                        iq2Var = new iq2(new yb6(this, (byte) 3));
                        this.C0 = iq2Var;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
            iq2Var.a(this.z0);
            iq2 iq2Var2 = this.C0;
            if (!iq2Var2.f) {
                try {
                    if (iq2Var2.b == null) {
                        SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.a.b.getSystemService("sensor");
                        iq2Var2.b = sensorManager2;
                        if (sensorManager2 != null) {
                            Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                            iq2Var2.c = defaultSensor;
                            if (defaultSensor == null) {
                                iq2Var2.d = iq2Var2.b.getDefaultSensor(1);
                                iq2Var2.e = iq2Var2.b.getDefaultSensor(2);
                            }
                        } else {
                            return;
                        }
                    }
                    Sensor sensor = iq2Var2.c;
                    if (sensor != null) {
                        iq2Var2.b.registerListener(iq2Var2, sensor, 1);
                    } else {
                        Sensor sensor2 = iq2Var2.d;
                        if (sensor2 != null && iq2Var2.e != null) {
                            iq2Var2.b.registerListener(iq2Var2, sensor2, 1);
                            iq2Var2.b.registerListener(iq2Var2, iq2Var2.e, 1);
                        } else {
                            return;
                        }
                    }
                    iq2Var2.f = true;
                    iq2Var2.I = 0L;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
        }
    }

    public final void L0() {
        if (this.y0 && !this.k0) {
            if (this.G0 == null) {
                nj5 onCreateLocationRequest = ((in3) org.telegram.messenger.a.i()).onCreateLocationRequest();
                this.F0 = onCreateLocationRequest;
                ((o05) onCreateLocationRequest).c();
                ((o05) this.F0).b();
                ((o05) this.F0).a();
                this.G0 = new yb6(this, (byte) 2);
            }
            try {
                ((in3) org.telegram.messenger.a.i()).requestLocationUpdates(this.F0, this.G0);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void M0() {
        iq2 iq2Var = this.C0;
        if (iq2Var != null && iq2Var.f) {
            iq2Var.f = false;
            iq2Var.x = false;
            try {
                iq2Var.b.unregisterListener(iq2Var);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void N0(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        int i3;
        u69 K = this.R.K(0);
        if (K != null) {
            i = (int) K.a.getY();
            i2 = Math.min(i, 0) + this.O0;
            this.b0 = (this.O0 + i) - this.h0;
        } else {
            i = -this.P.getMeasuredHeight();
            this.b0 = -gm.L(41.0f);
            i2 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            uj5 uj5Var = this.H;
            int i4 = 4;
            if (i2 <= 0) {
                if (((su) ((sm2) uj5Var).b).getVisibility() == 0) {
                    ((su) ((sm2) this.H).b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((su) ((sm2) uj5Var).b).getVisibility() == 4) {
                ((su) ((sm2) this.H).b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i));
            int i5 = -i;
            ((su) ((sm2) this.H).b).setTranslationY(Math.max(0, i5 / 2));
            FrameLayout frameLayout = this.X;
            float f = 48.0f;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i));
                float l = Utilities.l((kt6.y(53.0f, i2 - this.h0, gm.L(46.0f) + eh0.d(this.mSystemInsets.b)) - gm.L(7.0f)) / gm.L(48.0f));
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
                int L = ((i2 / 2) + (i5 - gm.L(f))) - (this.h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (!z && (layoutParams = (FrameLayout.LayoutParams) ((su) ((sm2) this.H).b).getLayoutParams()) != null && layoutParams.height != p0()) {
                layoutParams.height = p0();
                s05 s05Var = this.F;
                if (s05Var != null) {
                    s05Var.n(gm.L(70.0f), 0, gm.L(70.0f), o0());
                }
                ((su) ((sm2) this.H).b).setLayoutParams(layoutParams);
            }
        }
    }

    public final void O0() {
        if (this.u0) {
            boolean z = this.w0;
            r59 r59Var = this.S;
            if (z) {
                r59Var.setEmptyView(null);
                this.e.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
            r59Var.setEmptyView(this.e);
            return;
        }
        this.e.setVisibility(8);
    }

    public final void P0() {
        uj5 uj5Var;
        boolean z;
        a6 a6Var;
        hk6 hk6Var = this.e0;
        if (hk6Var != null && (uj5Var = this.H) != null) {
            su suVar = (su) ((sm2) uj5Var).b;
            if (this.d0 == null && this.y0 && !isFinishing() && (a6Var = this.P) != null && a6Var.getVisibility() == 0 && suVar.getParent() != null && suVar.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (hk6Var.g != z) {
                hk6Var.g = z;
                if (z) {
                    hk6Var.a();
                } else {
                    hk6Var.d();
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
            iq2 iq2Var = this.C0;
            if (iq2Var != null && iq2Var.H) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                r05 r05Var = this.D0;
                int i2 = 2131231654;
                if (r05Var == null) {
                    ai4 ai4Var = (ai4) ((k1f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                    ((cl6) ai4Var.b).a = new LatLng(this.z0.getLatitude(), this.z0.getLongitude());
                    cl6 cl6Var = (cl6) ai4Var.b;
                    cl6Var.r = true;
                    cl6Var.e = 0.5f;
                    cl6Var.f = 0.5f;
                    if (z2) {
                        i = 2131231655;
                    } else {
                        i = 2131231654;
                    }
                    cl6Var.d = hqd.b(i);
                    this.D0 = this.F.a(ai4Var);
                    this.E0 = z2;
                } else if (z) {
                    double latitude = location.getLatitude();
                    double longitude = this.z0.getLongitude();
                    bl6 bl6Var = r05Var.a;
                    LatLng latLng = new LatLng(latitude, longitude);
                    bl6Var.getClass();
                    try {
                        sjf sjfVar = (sjf) bl6Var.a;
                        Parcel R = sjfVar.R();
                        tid.b(R, latLng);
                        sjfVar.V(R, 3);
                    } catch (RemoteException e) {
                        throw new RuntimeException(e);
                    }
                }
                r05 r05Var2 = this.D0;
                if (r05Var2 != null) {
                    if (z2 != this.E0) {
                        if (z2) {
                            i2 = 2131231655;
                        }
                        r05Var2.a.a(hqd.b(i2));
                        this.E0 = z2;
                    }
                    r05 r05Var3 = this.D0;
                    if (z2) {
                        f = this.C0.G;
                    } else {
                        f = 0.0f;
                    }
                    r05Var3.c(f);
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
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
            m0();
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
            TLRPC.Message message = ((kc6) arrayList.get(i4)).b;
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
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.m5));
        hashSet.add(Integer.valueOf(cmb.Z6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.Ii));
        hashSet.add(Integer.valueOf(cmb.ej));
        hashSet.add(Integer.valueOf(cmb.hj));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.wj));
    }

    public final kc6 c0(TLRPC.Message message) {
        kc6 kc6Var;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = k47.B1(message.from_id);
        vh6 vh6Var = this.p0;
        kc6 kc6Var2 = (kc6) vh6Var.f(B1);
        if (kc6Var2 == null) {
            ?? obj = new Object();
            obj.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                obj.c = getMessagesController().W1(Long.valueOf(obj.b.from_id.user_id));
                obj.a = obj.b.from_id.user_id;
            } else {
                long B0 = k47.B0(message);
                if (pg3.D(B0)) {
                    obj.c = getMessagesController().W1(Long.valueOf(B0));
                } else {
                    obj.d = getMessagesController().L0(Long.valueOf(-B0));
                }
                obj.a = B0;
            }
            H0(obj);
            try {
                ai4 ai4Var = (ai4) ((k1f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                cl6 cl6Var = (cl6) ai4Var.b;
                ((cl6) ai4Var.b).a = new LatLng(d, d2);
                Bitmap i0 = i0(obj);
                kc6Var = obj;
                if (i0 != null) {
                    cl6Var.d = hqd.a(i0);
                    cl6Var.e = 0.5f;
                    cl6Var.f = 0.8010882f;
                    obj.e = this.F.a(ai4Var);
                    if (!m9c.D(obj.c)) {
                        ai4 ai4Var2 = (ai4) ((k1f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                        ((cl6) ai4Var2.b).a = new LatLng(d, d2);
                        cl6 cl6Var2 = (cl6) ai4Var2.b;
                        cl6Var2.r = true;
                        cl6Var2.e = 0.5f;
                        cl6Var2.f = 0.5f;
                        r05 a = this.F.a(ai4Var2);
                        obj.f = a;
                        int i = message.media.heading;
                        if (i != 0) {
                            a.c(i);
                            obj.f.a.a(hqd.b(2131231655));
                            obj.g = true;
                        } else {
                            a.c(0.0f);
                            obj.f.a.a(hqd.b(2131231654));
                            obj.g = false;
                        }
                    }
                    this.o0.add(obj);
                    vh6Var.k(obj, obj.a);
                    cd6 h = getLocationController().h(this.m0);
                    int i2 = (obj.a > getUserConfig().e() ? 1 : (obj.a == getUserConfig().e() ? 0 : -1));
                    kc6Var = obj;
                    kc6Var = obj;
                    if (i2 == 0 && h != null) {
                        int i3 = obj.b.id;
                        kc6Var = obj;
                        if (i3 == h.b) {
                            Location location = this.z0;
                            kc6Var = obj;
                            if (location != null) {
                                double latitude = location.getLatitude();
                                double longitude = this.z0.getLongitude();
                                bl6 bl6Var = obj.e.a;
                                LatLng latLng = new LatLng(latitude, longitude);
                                bl6Var.getClass();
                                try {
                                    sjf sjfVar = (sjf) bl6Var.a;
                                    Parcel R = sjfVar.R();
                                    tid.b(R, latLng);
                                    sjfVar.V(R, 3);
                                    kc6Var = obj;
                                } catch (RemoteException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
                kc6Var = obj;
            }
        } else {
            kc6Var2.b = message;
            bl6 bl6Var2 = kc6Var2.e.a;
            LatLng latLng2 = new LatLng(d, d2);
            bl6Var2.getClass();
            try {
                sjf sjfVar2 = (sjf) bl6Var2.a;
                Parcel R2 = sjfVar2.R();
                tid.b(R2, latLng2);
                sjfVar2.V(R2, 3);
                int i4 = (this.q0 > kc6Var2.a ? 1 : (this.q0 == kc6Var2.a ? 0 : -1));
                kc6Var = kc6Var2;
                if (i4 == 0) {
                    this.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(kc6Var2.e.a()));
                    kc6Var = kc6Var2;
                }
            } catch (RemoteException e3) {
                i2d.h(e3);
                return null;
            }
        }
        tv8 tv8Var = this.O;
        if (tv8Var != null) {
            tv8Var.c(true);
        }
        R0();
        return kc6Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc6.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        if (this.fragmentView != null && this.R != null) {
            iq5 iq5Var = this.mSystemInsets;
            int i = iq5Var.b;
            int i2 = iq5Var.d;
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                int d = eh0.d(i) - gm.L(6.0f);
                if (layoutParams.topMargin != d) {
                    layoutParams.topMargin = d;
                    this.X.requestLayout();
                }
            }
            this.R.setClipToPadding(false);
            this.R.setPadding(0, 0, 0, i2);
            r59 r59Var = this.S;
            if (r59Var != null) {
                r59Var.setClipToPadding(false);
                eh0.e(this.S, i, i2, a.getCurrentActionBarHeight(), 0);
            }
            if (this.fragmentView.getMeasuredHeight() > 0) {
                n0(false);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fc6 fc6Var;
        long B0;
        fc6 fc6Var2;
        if (i == nm7.s) {
            removeSelfFromStack(true);
            return;
        }
        if (i == nm7.z4) {
            this.k0 = false;
            fc6 fc6Var3 = this.Q;
            if (fc6Var3 != null) {
                fc6Var3.O(false, false);
            }
            L0();
        } else if (i == nm7.A4) {
            this.k0 = true;
            fc6 fc6Var4 = this.Q;
            if (fc6Var4 != null) {
                fc6Var4.O(true, false);
            }
        } else if (i == nm7.H4) {
            fc6 fc6Var5 = this.Q;
            if (fc6Var5 != null) {
                fc6Var5.f();
            }
            R0();
        } else if (i == 1) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.m0 && this.J0 != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z = false;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    k47 k47Var = (k47) arrayList.get(i3);
                    boolean C3 = k47Var.C3();
                    TLRPC.Message message = k47Var.k;
                    if (C3) {
                        c0(message);
                        z = true;
                    } else if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && pg3.D(k47.B0(message))) {
                        this.c.setImageResource(2131232216);
                        mj4 mj4Var = this.L;
                        if (mj4Var != null) {
                            mj4Var.y();
                            this.L = null;
                        }
                    }
                }
                if (z && (fc6Var2 = this.Q) != null) {
                    fc6Var2.N(this.o0);
                }
            }
        } else if (i == nm7.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.m0 && this.J0 != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    k47 k47Var2 = (k47) arrayList2.get(i4);
                    if (k47Var2.C3()) {
                        TLRPC.Message message2 = k47Var2.k;
                        TLRPC.Peer peer = message2.from_id;
                        if (peer != null) {
                            B0 = k47.B1(peer);
                        } else {
                            B0 = k47.B0(message2);
                        }
                        kc6 kc6Var = (kc6) this.p0.f(B0);
                        if (kc6Var != null) {
                            cd6 h = getLocationController().h(longValue);
                            if (h == null || h.b != k47Var2.e1()) {
                                TLRPC.Message message3 = k47Var2.k;
                                kc6Var.b = message3;
                                TLRPC.GeoPoint geoPoint = message3.media.geo;
                                xj5 xj5Var = new xj5(geoPoint.lat, geoPoint._long);
                                kc6Var.e.b(xj5Var);
                                if (this.q0 == kc6Var.a) {
                                    this.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(kc6Var.e.a()));
                                }
                                r05 r05Var = kc6Var.f;
                                if (r05Var != null) {
                                    r05Var.a();
                                    kc6Var.f.b(xj5Var);
                                    int i5 = k47Var2.k.media.heading;
                                    if (i5 != 0) {
                                        kc6Var.f.c(i5);
                                        if (!kc6Var.g) {
                                            kc6Var.f.a.a(hqd.b(2131231655));
                                            kc6Var.g = true;
                                        }
                                    } else if (kc6Var.g) {
                                        kc6Var.f.c(0.0f);
                                        kc6Var.f.a.a(hqd.b(2131231654));
                                        kc6Var.g = false;
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                }
                if (z2 && (fc6Var = this.Q) != null) {
                    fc6Var.f();
                    tv8 tv8Var = this.O;
                    if (tv8Var != null) {
                        tv8Var.c(true);
                    }
                }
                if (z2) {
                    R0();
                }
            }
        }
    }

    public final void e0(Canvas canvas, RectF rectF) {
        su suVar;
        int i = cmb.g5;
        int themedColor = getThemedColor(i);
        Paint paint = this.g0;
        paint.setColor(themedColor);
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        r59 r59Var = this.S;
        if (r59Var != null && r59Var.getVisibility() == 0) {
            r59 r59Var2 = this.S;
            tl0.a(r59Var2, canvas, rectF, r59Var2, viewGroup);
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
            uj5 uj5Var = this.H;
            if (uj5Var != null) {
                suVar = (su) ((sm2) uj5Var).b;
            } else {
                suVar = null;
            }
            if (suVar != null && suVar.getParent() == this.P && suVar.getVisibility() == 0 && suVar.getAlpha() > 0.0f) {
                TextureView textureView = this.d0;
                RectF rectF2 = this.f0;
                if (textureView != null && textureView.isAttachedToWindow() && zgc.c(this.d0, this.P, rectF2)) {
                    if (suVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (suVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    this.d0.draw(canvas);
                    canvas.restore();
                } else if (this.e0 != null) {
                    rectF2.set(suVar.getX(), suVar.getY(), suVar.getX() + suVar.getWidth(), suVar.getY() + suVar.getHeight());
                    hk6 hk6Var = this.e0;
                    float alpha = suVar.getAlpha();
                    Paint paint2 = hk6Var.c;
                    Bitmap bitmap = hk6Var.e;
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
            int L = gm.L(22.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
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
            fv fvVar = this.R;
            tl0.a(fvVar, canvas, rectF, fvVar, viewGroup);
            canvas.restore();
        }
    }

    public final void f0() {
        int i;
        im0 im0Var = this.Z;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        fv fvVar = this.R;
        if (fvVar != null) {
            fvVar.invalidate();
        }
        if (this.F != null) {
            if (gm.B(getThemedColor(cmb.c6)) < 0.721f) {
                i = 2131624086;
            } else {
                i = 0;
            }
            boolean z = this.i0;
            if (i != 0) {
                if (!z) {
                    this.i0 = true;
                    this.F.i(((k1f) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, i));
                    mj4 mj4Var = this.L;
                    if (mj4Var != null) {
                        mj4Var.C(-1);
                        this.L.z(553648127);
                    }
                }
            } else if (z) {
                this.i0 = false;
                this.F.i(null);
                mj4 mj4Var2 = this.L;
                if (mj4Var2 != null) {
                    mj4Var2.C(-16777216);
                    this.L.z(536870912);
                }
            }
            D0();
        }
    }

    @Override
    public final boolean finishFragment(boolean z) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z);
    }

    public final boolean g0() {
        if (j0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i = cmb.K5;
                    alertDialog$Builder.l(2131624120, 72, getThemedColor(i), null);
                    alertDialog$Builder.m(i, getResourceProvider());
                    alertDialog$Builder.a.U = jb6.M0(2131749304, null);
                    alertDialog$Builder.j(jb6.M0(2131751743, null), new yb6(this, (byte) 5));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return true;
            }
        }
        return true;
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
            arrayList.add(new cnb(undoViewArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.vj));
            i++;
        }
        arrayList.add(new cnb(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g5));
        zja zjaVar = this.r;
        if (zjaVar != null) {
            editTextBoldCursor = zjaVar.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new cnb(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.i5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ij));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.jj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.oj));
        arrayList.add(new cnb(this.R, 393216, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.dj));
        arrayList.add(new cnb(this.R, 393216, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.gj));
        arrayList.add(new cnb(this.R, 393248, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.cj));
        arrayList.add(new cnb(this.R, 393248, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.fj));
        arrayList.add(new cnb(this.R, 196608, new Class[]{ed6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.Gi));
        return arrayList;
    }

    public final void h0(int i) {
        kye f1dVar;
        if (this.F == null) {
            return;
        }
        List<bk5> asList = Arrays.asList(new bk5[]{new Object(), new Object()});
        qj5 onCreateCircleOptions = ((k1f) org.telegram.messenger.a.j()).onCreateCircleOptions();
        double latitude = this.z0.getLatitude();
        double longitude = this.z0.getLongitude();
        vi2 vi2Var = (vi2) ((k44) onCreateCircleOptions).b;
        LatLng latLng = new LatLng(latitude, longitude);
        vi2Var.getClass();
        vi2Var.a = latLng;
        double d = i;
        vi2 vi2Var2 = (vi2) ((k44) onCreateCircleOptions).b;
        vi2Var2.b = d;
        if (s0()) {
            vi2Var2.d = -1771658281;
            vi2Var2.e = 476488663;
        } else {
            vi2Var2.d = -1774024971;
            vi2Var2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (bk5 bk5Var : asList) {
            if (bk5Var instanceof ak5) {
                arrayList.add(new s63(20.0f, (byte) 1));
            } else if (bk5Var instanceof zj5) {
                arrayList.add(new s63(20.0f, (byte) 0));
            }
        }
        vi2Var2.r = arrayList;
        vi2Var2.c = 2.0f;
        s05 s05Var = this.F;
        wm4 wm4Var = s05Var.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.b(R, vi2Var2);
            Parcel Q = d8eVar.Q(R, 35);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i2 = bue.b;
            if (readStrongBinder == null) {
                f1dVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (queryLocalInterface instanceof kye) {
                    f1dVar = (kye) queryLocalInterface;
                } else {
                    f1dVar = new f1d(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", (byte) 6);
                }
            }
            Q.recycle();
            ti2 ti2Var = new ti2(f1dVar);
            mj4 mj4Var = new mj4(s05Var, ti2Var, false, (byte) 4);
            s05Var.c.put(ti2Var, mj4Var);
            this.L = mj4Var;
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final Bitmap i0(kc6 kc6Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(gm.L(62.0f), gm.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.a.b.getResources().getDrawable(2131231656);
                drawable.setBounds(0, 0, gm.L(62.0f), gm.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                pc0 pc0Var = new pc0((ylb) null);
                TLRPC.User user = kc6Var.c;
                if (user != null) {
                    pc0Var.q(user);
                } else {
                    TLRPC.Chat chat = kc6Var.d;
                    if (chat != null) {
                        pc0Var.p(chat);
                    }
                }
                canvas.translate(gm.L(6.0f), gm.L(6.0f));
                pc0Var.setBounds(0, 0, gm.L(50.0f), gm.L(50.0f));
                pc0Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = kc6Var.h;
                if (imageReceiver != null && imageReceiver.C()) {
                    bitmap = kc6Var.h.n();
                } else {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = gm.L(50.0f) / bitmap.getWidth();
                    matrix.postScale(L, L);
                    matrix.postTranslate(gm.L(6.0f), gm.L(6.0f));
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(gm.L(6.0f), gm.L(6.0f), gm.L(56.0f), gm.L(56.0f));
                    canvas.drawRoundRect(rectF, gm.L(25.0f), gm.L(25.0f), paint);
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
                fc4.g(th, true);
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (on2.h(getThemedColor(cmb.c6)) > 0.699999988079071d) {
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

    public boolean j0() {
        return this instanceof fv1;
    }

    public final void k0(ArrayList arrayList) {
        sj5 sj5Var;
        if (this.n0) {
            sj5Var = ((k1f) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
        } else {
            sj5Var = null;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            int i2 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i3 = messageMedia.period;
            if (i2 + i3 > currentTime || i3 == Integer.MAX_VALUE) {
                if (sj5Var != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((lj4) sj5Var).z(new xj5(geoPoint.lat, geoPoint._long));
                }
                c0(message);
                if (this.c.getVisibility() != 8 && k47.B1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new v85(this, (byte) 15)).start();
                }
            }
        }
        if (sj5Var != null) {
            if (this.n0) {
                this.R.x0(0, gm.L(99.0f), null);
            }
            this.n0 = false;
            this.Q.N(this.o0);
            if (this.J0.C3()) {
                try {
                    lj4 lj4Var = (lj4) sj5Var;
                    xj5 a = lj4Var.c().a();
                    xj5 z0 = z0(a, 100.0d, 100.0d);
                    lj4Var.z(z0(a, -100.0d, -100.0d));
                    lj4Var.z(z0);
                    q05 c = lj4Var.c();
                    if (arrayList.size() > 1) {
                        try {
                            pj5 newCameraUpdateLatLngBounds = ((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(c, gm.L(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.h(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean m0() {
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
                kc6 kc6Var = (kc6) arrayList2.get(i3);
                r05 r05Var = kc6Var.e;
                if (r05Var != null && (message = kc6Var.b) != null && (messageMedia = message.media) != null && ((i2 = messageMedia.period) == Integer.MAX_VALUE || message.date + i2 > i)) {
                    arrayList.add(r05Var.a());
                }
            }
            if (this.p0.f(getUserConfig().e()) != null) {
                z = true;
            } else {
                z = false;
            }
            Location location = this.z0;
            if (location != null && !z) {
                arrayList.add(new xj5(location.getLatitude(), this.z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    sj5 onCreateLatLngBoundsBuilder = ((k1f) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i4 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d3 = Double.MAX_VALUE;
                    double d4 = -1.7976931348623157E308d;
                    while (i4 < size2) {
                        xj5 xj5Var = (xj5) arrayList.get(i4);
                        z2 = z4;
                        try {
                            ((lj4) onCreateLatLngBoundsBuilder).z(xj5Var);
                            int i5 = size2;
                            z3 = true;
                            try {
                                double d5 = xj5Var.a;
                                if (d5 < d2) {
                                    d2 = d5;
                                }
                                if (d5 > d) {
                                    d = d5;
                                }
                                double d6 = xj5Var.b;
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
                                fc4.g(e, z3);
                                return z2;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z3 = true;
                            fc4.g(e, z3);
                            return z2;
                        }
                    }
                    z2 = z4;
                    z3 = true;
                    double d7 = (d2 + d) / 2.0d;
                    double d8 = (d3 + d4) / 2.0d;
                    double radians = Math.toRadians(d4 - d3) * 6366198.0d * Math.cos(Math.toRadians(d7));
                    if (Math.toRadians(d - d2) * 6366198.0d < 30.0d || radians < 30.0d) {
                        lj4 lj4Var = (lj4) onCreateLatLngBoundsBuilder;
                        lj4Var.z(new xj5(1.3499999414033853E-4d + d7, d8 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                        lj4Var.z(new xj5(d7 - 1.3499999414033853E-4d, d8 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                    }
                    this.F.c(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(((lj4) onCreateLatLngBoundsBuilder).c(), gm.L(60.0f)));
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    z2 = z4;
                }
            }
        }
        return false;
    }

    public final void n0(boolean z) {
        int i;
        if (this.R != null) {
            int i2 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                byte b = this.N0;
                if (b == 6) {
                    this.O0 = kt6.y(66.0f, measuredHeight, i2);
                } else if (b == 2) {
                    this.O0 = kt6.y(73.0f, measuredHeight, i2);
                } else {
                    this.O0 = kt6.y(66.0f, measuredHeight, i2);
                }
                ic6 ic6Var = this.R0;
                if (ic6Var != null && ic6Var.W(8) > 0) {
                    this.O0 -= gm.L(200.0f);
                }
                this.c0 = gm.L(100.0f) + (measuredHeight - this.O0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = gm.L(29.0f) + this.O0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.O0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((su) ((sm2) this.H).b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = p0();
                    s05 s05Var = this.F;
                    if (s05Var != null) {
                        s05Var.n(gm.L(70.0f), 0, gm.L(70.0f), o0());
                    }
                    ((su) ((sm2) this.H).b).setLayoutParams(layoutParams2);
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
                    this.V.g1(0, -gm.L(i));
                    N0(false);
                    this.R.post(new ex1(this, i, (byte) 3));
                    return;
                }
                N0(false);
            }
        }
    }

    public final int o0() {
        return gm.L(10.0f) + this.h0 + this.c0;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        tv8 tv8Var = this.O;
        if (tv8Var != null) {
            if (z) {
                tv8Var.a();
                return false;
            }
        } else {
            uj5 uj5Var = this.H;
            if (uj5Var != null && ((GLSurfaceView) ((sm2) uj5Var).f) != null && !this.J) {
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
        getNotificationCenter().b(this, nm7.s);
        nm7.e().b(this, nm7.z4);
        nm7.e().b(this, nm7.A4);
        nm7.e().b(this, nm7.H4);
        k47 k47Var = this.J0;
        if (k47Var != null && k47Var.C3()) {
            getNotificationCenter().b(this, 1);
            getNotificationCenter().b(this, nm7.m0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        hk6 hk6Var = this.e0;
        if (hk6Var != null) {
            hk6Var.i = true;
            hk6Var.g = false;
            hk6Var.d();
            hk6Var.d = null;
            hk6Var.e = null;
            hk6Var.f = null;
        }
        nm7.e().n(this, nm7.z4);
        nm7.e().n(this, nm7.A4);
        nm7.e().n(this, nm7.H4);
        getNotificationCenter().n(this, nm7.s);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, nm7.m0);
        M0();
        if (this.G0 != null) {
            try {
                ((in3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        this.C0 = null;
        this.D0 = null;
        try {
            uj5 uj5Var = this.H;
            if (uj5Var != null) {
                ((sm2) uj5Var).G();
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        fc6 fc6Var = this.Q;
        if (fc6Var != null) {
            fc6Var.F();
        }
        l52 l52Var = this.T;
        if (l52Var != null) {
            l52Var.F();
        }
        sb6 sb6Var = this.Q0;
        if (sb6Var != null) {
            gm.r(sb6Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kc6 kc6Var = (kc6) arrayList.get(i);
            ImageReceiver imageReceiver = kc6Var.h;
            if (imageReceiver != null) {
                imageReceiver.K();
                kc6Var.h = null;
            }
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        d0();
    }

    @Override
    public final void onLowMemory() {
        wm9 wm9Var;
        super.onLowMemory();
        uj5 uj5Var = this.H;
        if (uj5Var != null && this.x0 && (wm9Var = (wm9) ((pr2) ((su) ((sm2) uj5Var).b).b).a) != null) {
            try {
                mye myeVar = (mye) wm9Var.c;
                myeVar.V(myeVar.R(), 6);
            } catch (RemoteException e) {
                i2d.h(e);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        uj5 uj5Var = this.H;
        if (uj5Var != null && this.x0) {
            try {
                ((sm2) uj5Var).H();
            } catch (Exception e) {
                fc4.g(e, true);
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
                ((in3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        P0();
    }

    @Override
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
        gm.y2(getParentActivity(), this.classGuid);
        uj5 uj5Var = this.H;
        if (uj5Var != null && this.x0) {
            try {
                ((sm2) uj5Var).I();
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        this.y0 = true;
        K0();
        L0();
        D0();
        n0(true);
        if (j0()) {
            this.t0 = false;
        } else if (this.t0 && (parentActivity = getParentActivity()) != null) {
            this.t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        sb6 sb6Var = this.Q0;
        if (sb6Var != null) {
            gm.r(sb6Var);
            gm.d3(this.Q0, 5000L);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            zja zjaVar = this.r;
            if (zjaVar != null && zjaVar.getSearchField() != null) {
                this.r.getSearchField().setCursorColor(getThemedColor(cmb.i5));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2) {
            try {
                if (((su) ((sm2) this.H).b).getParent() instanceof ViewGroup) {
                    ((ViewGroup) ((su) ((sm2) this.H).b).getParent()).removeView((su) ((sm2) this.H).b);
                }
            } catch (Exception unused) {
            }
            a6 a6Var = this.P;
            if (a6Var != null) {
                a6Var.addView((su) ((sm2) this.H).b, 0, qoe.e(-1, p0(), 51));
                N0(false);
                y0();
                D0();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((su) ((sm2) this.H).b, 0, qoe.e(-1, -1, 51));
            }
        }
    }

    public final int p0() {
        return gm.L(10.0f) + this.O0 + this.c0;
    }

    public final boolean q0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(k47.B0(this.J0.k));
        if (arrayList != null && arrayList.isEmpty()) {
            k0(arrayList);
        } else {
            arrayList = null;
        }
        if (pg3.y(this.m0)) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.m0));
            if (sd2.T(L0) && !L0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = k47.B0(this.J0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().i1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new qv2(this, B0, (byte) 1));
        if (arrayList != null) {
            return true;
        }
        return false;
    }

    public final UndoView r0() {
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

    public final boolean s0() {
        if ((getResourceProvider() == null && cmb.I.o()) || gm.B(getThemedColor(cmb.c6)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void t0(int i) {
        float e;
        float f;
        TLRPC.TL_messageMediaVenue H = this.T.H(i);
        if (H != null && H.icon != null && this.F != null) {
            this.K0 = true;
            this.simpleActionBar.o(true);
            boolean equals = "pin".equals(H.icon);
            s05 s05Var = this.F;
            if (equals) {
                e = s05Var.e();
                f = 4.0f;
            } else {
                e = s05Var.e();
                f = 9.0f;
            }
            float f2 = e - f;
            s05 s05Var2 = this.F;
            IMapsProvider j = org.telegram.messenger.a.j();
            TLRPC.GeoPoint geoPoint = H.geo;
            s05Var2.b(((k1f) j).newCameraUpdateLatLngZoom(new xj5(geoPoint.lat, geoPoint._long), f2));
            Location location = this.A0;
            if (location != null) {
                location.setLatitude(H.geo.lat);
                this.A0.setLongitude(H.geo._long);
            }
            this.Q.L(this.A0);
        }
    }

    public final void u0() {
        sb6 sb6Var;
        getLocationController().j(this.m0);
        if (!this.isPaused && (sb6Var = this.Q0) != null) {
            gm.d3(sb6Var, 5000L);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        this.glassEngine.g();
    }

    public final void w0(int i, TLRPC.User user, boolean z) {
        int i2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z) {
            cd6 h = getLocationController().h(this.m0);
            if (h != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = getMessagesController().i1(h.a);
                tL_messages_editMessage.id = h.b;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location location = dd6.f(this.currentAccount).s;
                tL_messages_editMessage.media.geo_point.lat = gm.b0(location.getLatitude());
                tL_messages_editMessage.media.geo_point._long = gm.b0(location.getLongitude());
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
                inputMedia.heading = dd6.e(location);
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
                k47 k47Var = h.h;
                if (k47Var != null && (message = k47Var.k) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i2;
                    getMessagesStorage().o1(h.h.k, null, null, true);
                }
                getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                nm7.e().k(nm7.H4, new Object[0]);
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
        SharedPreferences d1;
        int i;
        ImageView imageView = this.c;
        if (imageView != null && imageView.getVisibility() == 0 && !this.E && (i = (d1 = oc7.d1()).getInt("proximityhint", 0)) < 3) {
            d1.edit().putInt("proximityhint", i + 1).commit();
            if (pg3.D(this.m0)) {
                this.s.t(jb6.a0("ProximityTooltioUser", null, 2131746345, m9c.k(getMessagesController().W1(Long.valueOf(this.m0)), true)));
            } else {
                this.s.t(jb6.M0(2131746346, null));
            }
            this.s.v();
        }
    }
}
