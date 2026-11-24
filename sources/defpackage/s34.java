package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class s34 implements co7, zu9, ml4, r9, uec, xb1, nh5, b79, no7, or8, d34, ka8, i33, t58, qac, ibc, cr8, xv8 {
    public final byte a;
    public Object b;

    public s34(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                return;
            case 8:
                this.b = new xu7(10);
                return;
            case 11:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 16:
                this.b = new Bundle();
                return;
            default:
                this.b = new vf6();
                return;
        }
    }

    public static void K(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    public static w56 w(Looper looper, Object obj, String str) {
        fre.i(obj, "Listener must not be null");
        fre.i(looper, "Looper must not be null");
        return new w56(looper, obj, str);
    }

    @Override
    public final l34 A() {
        return ((x6b) this.b).z0;
    }

    @Override
    public final boolean B(int i) {
        return false;
    }

    @Override
    public final void C() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public final void D(yv8 yv8Var) {
        gw8 gw8Var = (gw8) this.b;
        FrameLayout frameLayout = gw8Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(yv8Var);
        }
        if (gw8Var.G == yv8Var) {
            gw8Var.G = null;
        }
        vw8 vw8Var = gw8Var.d;
        if (vw8Var != null) {
            vw8Var.setScanHidden(false);
        }
    }

    @Override
    public final void D2(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        bg4 bg4Var = (bg4) this.b;
        Handler handler = bg4Var.B0;
        ez3 ez3Var = bg4Var.C0;
        handler.removeCallbacks(ez3Var);
        TextView textView = bg4Var.H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(ez3Var, 2000L);
    }

    @Override
    public final FrameLayout E() {
        return (q88) this.b;
    }

    @Override
    public final void F(String str) {
        ((b68) this.b).l0(str);
    }

    @Override
    public final Cursor G(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public final SparseIntArray H(long j) {
        return (SparseIntArray) ((vf6) this.b).f(j);
    }

    @Override
    public final long I() {
        return ((q88) this.b).getCaptionsTrimEnd();
    }

    @Override
    public final long J() {
        return ((q88) this.b).getCaptionsTrimStart();
    }

    @Override
    public final void K0() {
        u48 u48Var = ((v48) this.b).a;
        if (u48Var != null) {
            ((c78) u48Var).a.f0.invalidate();
        }
    }

    @Override
    public final void L(cc1 cc1Var) {
        ((q88) this.b).a0(cc1Var);
    }

    @Override
    public final void M(long j) {
        y54 y54Var;
        PhotoViewer photoViewer = ((q88) this.b).j2;
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null && (y54Var = lbcVar.d) != null && y54Var.c0()) {
            photoViewer.G2.o0(j);
        }
    }

    public final defpackage.ld7 O(defpackage.ja3 r17, defpackage.rj5 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s34.O(ja3, rj5, int):ld7");
    }

    @Override
    public final void P() {
        dj6 dj6Var = (dj6) this.b;
        dj6Var.b.a.h();
        dj6Var.x.setViewHidden(false);
        PhotoViewer photoViewer = ((p88) dj6Var).L;
        Drawable[] drawableArr = PhotoViewer.d9;
        photoViewer.g2(true, true);
    }

    public final void Q(String str, Bitmap bitmap) {
        Integer num = (Integer) kr6.c.get(str);
        if (num != null && num.intValue() != 2) {
            w26.j(tb4.y("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            ((Bundle) this.b).putParcelable(str, bitmap);
        }
    }

    @Override
    public final void R(l34 l34Var) {
        ((q88) this.b).s0(l34Var);
    }

    public final void S(long j, String str) {
        Integer num = (Integer) kr6.c.get(str);
        if (num != null && num.intValue() != 0) {
            w26.j(tb4.y("The ", str, " key cannot be used to put a long"));
        } else {
            ((Bundle) this.b).putLong(str, j);
        }
    }

    @Override
    public final void T() {
        ((dj6) this.b).x.setViewHidden(true);
    }

    public final void U(String str, hz8 hz8Var) {
        Rating rating;
        float f = hz8Var.b;
        Integer num = (Integer) kr6.c.get(str);
        if (num != null && num.intValue() != 3) {
            w26.j(tb4.y("The ", str, " key cannot be used to put a Rating"));
            return;
        }
        Bundle bundle = (Bundle) this.b;
        Rating rating2 = hz8Var.c;
        if (rating2 == null) {
            boolean b = hz8Var.b();
            int i = hz8Var.a;
            if (b) {
                boolean z = true;
                switch (i) {
                    case 1:
                        if (i != 1 || f != 1.0f) {
                            z = false;
                        }
                        rating2 = Rating.newHeartRating(z);
                        hz8Var.c = rating2;
                        break;
                    case 2:
                        if (i != 2 || f != 1.0f) {
                            z = false;
                        }
                        rating2 = Rating.newThumbRating(z);
                        hz8Var.c = rating2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        rating2 = Rating.newStarRating(i, hz8Var.a());
                        hz8Var.c = rating2;
                        break;
                    case 6:
                        rating2 = Rating.newPercentageRating((i == 6 && hz8Var.b()) ? -1.0f : -1.0f);
                        hz8Var.c = rating2;
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            rating2 = Rating.newUnratedRating(i);
            hz8Var.c = rating2;
        }
        rating = rating2;
        bundle.putParcelable(str, rating);
    }

    public final void V(String str, String str2) {
        Integer num = (Integer) kr6.c.get(str);
        if (num != null && num.intValue() != 1) {
            w26.j(tb4.y("The ", str, " key cannot be used to put a String"));
        } else {
            ((Bundle) this.b).putCharSequence(str, str2);
        }
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        switch (this.a) {
            case 17:
                j47 j47Var = (j47) this.b;
                io5 H0 = gl.H0(vxcVar, false);
                j47Var.d = H0;
                j47Var.G.setPadding(H0.a, H0.b, H0.c, H0.d);
                j47Var.F.requestLayout();
                return vxc.b;
            default:
                ve8 ve8Var = (ve8) this.b;
                io5 g = vxcVar.a.g(519);
                ve8Var.r = g;
                ve8Var.d.setPadding(g.a, g.b, g.c, g.d);
                ve8Var.c.requestLayout();
                return vxc.b;
        }
    }

    public final void X(CharSequence charSequence, String str) {
        Integer num = (Integer) kr6.c.get(str);
        if (num != null && num.intValue() != 1) {
            w26.j(tb4.y("The ", str, " key cannot be used to put a CharSequence"));
        } else {
            ((Bundle) this.b).putCharSequence(str, charSequence);
        }
    }

    public final void Y() {
        ln8 ln8Var = (ln8) this.b;
        ln8Var.getClass();
        try {
            hgd hgdVar = (hgd) ln8Var.b;
            Parcel R = hgdVar.R();
            int i = sgd.a;
            R.writeInt(0);
            hgdVar.V(R, 2);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void Z() {
        ln8 ln8Var = (ln8) this.b;
        ln8Var.getClass();
        try {
            hgd hgdVar = (hgd) ln8Var.b;
            Parcel R = hgdVar.R();
            int i = sgd.a;
            R.writeInt(0);
            hgdVar.V(R, 3);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    @Override
    public final void a(int i, boolean z) {
        tv4 tv4Var = (tv4) this.b;
        if (tv4Var.l2 == i) {
            return;
        }
        tv4Var.l2 = i;
        tv4Var.d2.g();
        tv4Var.T1.O(true);
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final void b0() {
        ln8 ln8Var = (ln8) this.b;
        ln8Var.getClass();
        try {
            hgd hgdVar = (hgd) ln8Var.b;
            Parcel R = hgdVar.R();
            int i = sgd.a;
            R.writeInt(0);
            hgdVar.V(R, 1);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final void c0(ng5 ng5Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((buc) this.b).c) {
            }
            throw new nq7(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), ng5Var);
        }
    }

    @Override
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                z2.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public final void d() {
        b68 b68Var = (b68) this.b;
        b68Var.a.b0();
        b68Var.b.b0();
    }

    @Override
    public final void e(String str) {
        gw8 gw8Var = (gw8) this.b;
        if (gw8Var.getParentActivity() != null) {
            d01.t(gw8Var.getParentActivity(), str);
        }
    }

    @Override
    public final void f(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override
    public final CharSequence getContentDescription() {
        gj4 gj4Var = (gj4) this.b;
        float f = gj4Var.b;
        return String.valueOf(Math.round((gj4Var.a.getProgress() * (gj4Var.c - f)) + f));
    }

    @Override
    public final void h2(boolean z) {
        u48 u48Var = ((v48) this.b).a;
        if (u48Var != null) {
            ((c78) u48Var).b(z);
        }
    }

    @Override
    public final void i(Object obj) {
        q9 q9Var = (q9) obj;
        go4 go4Var = (go4) this.b;
        co4 co4Var = (co4) go4Var.F.pollFirst();
        if (co4Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = co4Var.a;
        int i = co4Var.b;
        bn4 n = go4Var.c.n(str);
        if (n == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        n.x(i, q9Var.a, q9Var.b);
    }

    @Override
    public final void invalidate() {
        ((PhotoViewer) this.b).f0.invalidate();
    }

    @Override
    public final void j(boolean z, float f) {
        gj4 gj4Var = (gj4) this.b;
        float f2 = gj4Var.b;
        float A = tb4.A(gj4Var.c, f2, f, f2);
        gj4Var.d = A;
        if (z) {
            qn qnVar = gj4Var.e;
            qnVar.getClass();
            qnVar.c(null, A);
        }
        gj4Var.invalidate();
    }

    public final void k(StringBuilder sb, Iterator it) {
        zb3 zb3Var = (zb3) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(zb3.f(entry.getKey()));
            sb.append("=");
            sb.append(zb3.f(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) zb3Var.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(zb3.f(entry2.getKey()));
                sb.append("=");
                sb.append(zb3.f(entry2.getValue()));
            }
        }
    }

    @Override
    public final TextureView k0() {
        byte b = this.a;
        return null;
    }

    @Override
    public final void l(boolean z) {
        q88 q88Var = (q88) this.b;
        PhotoViewer photoViewer = q88Var.j2;
        lbc lbcVar = photoViewer.G2;
        if (lbcVar != null) {
            if (z) {
                if (lbcVar.c0()) {
                    q88Var.i2 = true;
                    photoViewer.n();
                    photoViewer.G2.f0();
                }
            } else if (q88Var.i2) {
                q88Var.i2 = false;
                if (!photoViewer.H2 && !photoViewer.T0()) {
                    photoViewer.G2.g0();
                }
            }
        }
    }

    @Override
    public final FrameLayout m() {
        return ((q88) this.b).j2.f0;
    }

    @Override
    public final void n() {
        ((nm7) this.b).b();
    }

    @Override
    public final wjb o() {
        return ((q88) this.b).G1;
    }

    @Override
    public final void o1(boolean z) {
        ((v48) this.b).c.setAspectLock(z);
    }

    @Override
    public final void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        ((eb6) this.b).m(location);
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        zi8 zi8Var = (zi8) this.b;
        lbc lbcVar = zi8Var.y;
        if (lbcVar == null) {
            return;
        }
        boolean c0 = lbcVar.c0();
        yi8 yi8Var = zi8Var.N;
        if (c0) {
            gl.c3(yi8Var);
        } else {
            gl.r(yi8Var);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        am9 am9Var = ((zi8) this.b).x;
        if (am9Var != null) {
            float f2 = i / i2;
            if (Math.abs(am9Var.A0 - f2) >= 1.0E-4f) {
                am9Var.A0 = f2;
                am9Var.requestLayout();
            }
        }
    }

    @Override
    public final cc1 p() {
        return ((q88) this.b).c0();
    }

    @Override
    public final void q() {
        dj6 dj6Var = (dj6) this.b;
        dj6Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ni4(dj6Var, (byte) 23)).setInterpolator(s33.h);
    }

    @Override
    public final cc1 t() {
        mw5 mw5Var = ((q88) this.b).P0;
        for (int i = 0; i < mw5Var.getChildCount(); i++) {
            if (mw5Var.getChildAt(i) instanceof cc1) {
                return (cc1) mw5Var.getChildAt(i);
            }
        }
        return null;
    }

    @Override
    public final void t2() {
        u48 u48Var = ((v48) this.b).a;
        if (u48Var != null) {
            PhotoViewer photoViewer = ((c78) u48Var).a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.B2();
            }
        }
    }

    @Override
    public final void u() {
        x6b x6bVar = (x6b) this.b;
        x6bVar.D0(null, true);
        if (x6bVar.C0) {
            t7b t7bVar = x6bVar.u2;
            t7bVar.d1.f.d();
            t7bVar.k0(-1, false, true);
            x6bVar.C0 = false;
        }
        x6bVar.O0(false);
    }

    @Override
    public final void u0(k27 k27Var) {
        switch (this.a) {
            case 21:
                ((d8b) ((y28) this.b).G1).f(false);
                return;
            default:
                kp8 kp8Var = ((ProfileActivity) this.b).n0;
                if (kp8Var != null && kp8Var.a) {
                    kp8Var.L.e(true, 0.0f);
                    kp8Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final long v() {
        return ((q88) this.b).getCaptionsVideoPosition();
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final void z(k27 k27Var) {
        switch (this.a) {
            case 21:
                ((d8b) ((y28) this.b).G1).f(true);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                profileActivity.a.J0(true);
                vn8 vn8Var = profileActivity.O;
                if (vn8Var != null && vn8Var.getCurrentListView() != null) {
                    profileActivity.O.getCurrentListView().J0(true);
                }
                profileActivity.d1.setBackgroundColor(bm2.f(0.1f, profileActivity.X1(profileActivity.Z4.f), bkb.v0(bkb.Z6, profileActivity.A0)));
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e0() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void N(ArrayList arrayList) {
    }

    @Override
    public final void g(float f) {
    }

    @Override
    public final void h(vm7 vm7Var) {
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    @Override
    public final void onSeekFinished(tj tjVar) {
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void onError(lbc lbcVar, Exception exc) {
    }

    public s34(Context context, Uri uri) {
        this.a = (byte) 3;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public s34(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
