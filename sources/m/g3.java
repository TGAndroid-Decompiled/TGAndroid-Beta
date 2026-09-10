package m;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.l9;
import org.telegram.ui.ss0;
import org.telegram.ui.t9;
import org.telegram.ui.zt0;
import v7.f5;
public final class g3 implements l.j, o0.a, no0, le.f, kg.o, zg.g, t9, pg.v1, r2.k, com.google.android.gms.common.api.internal.o, s4.h1, com.google.android.gms.common.api.internal.s, androidx.lifecycle.s0, w2.d, Continuation {
    public final int f13017a;
    public Object f13018b;

    public g3(int i10, boolean z10) {
        this.f13017a = i10;
    }

    @Override
    public void A() {
        cf0 cf0Var = ((df0) this.f13018b).f22404a;
        if (cf0Var != null) {
            ((ss0) cf0Var).f36749a.f30049e0.invalidate();
        }
    }

    @Override
    public boolean B(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.f13018b).getClass();
        return false;
    }

    @Override
    public androidx.lifecycle.p0 C(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f13018b) {
            if (cVar.f42844a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public void D(String str, n4.i0 i0Var) {
        Rating rating;
        float f7 = i0Var.f13785b;
        int i10 = i0Var.f13784a;
        Integer num = (Integer) n4.m.f13796c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.f13018b;
        if (i0Var.f13786c == null) {
            if (i0Var.b()) {
                boolean z10 = true;
                switch (i10) {
                    case 1:
                        if (i10 != 1 || f7 != 1.0f) {
                            z10 = false;
                        }
                        i0Var.f13786c = Rating.newHeartRating(z10);
                        break;
                    case 2:
                        if (i10 != 2 || f7 != 1.0f) {
                            z10 = false;
                        }
                        i0Var.f13786c = Rating.newThumbRating(z10);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i0Var.f13786c = Rating.newStarRating(i10, i0Var.a());
                        break;
                    case 6:
                        i0Var.f13786c = Rating.newPercentageRating((i10 == 6 && i0Var.b()) ? -1.0f : -1.0f);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            i0Var.f13786c = Rating.newUnratedRating(i10);
        }
        rating = i0Var.f13786c;
        bundle.putParcelable(str, rating);
    }

    public void E(String str, String str2) {
        Integer num = (Integer) n4.m.f13796c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f13018b).putCharSequence(str, str2);
    }

    public void F(CharSequence charSequence, String str) {
        Integer num = (Integer) n4.m.f13796c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.f13018b).putCharSequence(str, charSequence);
    }

    @Override
    public void J(String str) {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f13018b;
        try {
            c1Var.P = System.currentTimeMillis();
            c1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public String J0() {
        return ((org.telegram.ui.web.c1) this.f13018b).f37888i0;
    }

    @Override
    public void N(boolean z10) {
        ((df0) this.f13018b).f22406c.setAspectLock(z10);
    }

    @Override
    public void V(float f7) {
        zt0 zt0Var = (zt0) this.f13018b;
        og.x0.e(zt0Var.P1).k(String.valueOf(og.m.f14420a.indexOf(zt0Var.W0.getCurrentBrush())), f7);
        og.v1 v1Var = zt0Var.K1;
        v1Var.f14536c = f7;
        zt0Var.s0(v1Var, null);
    }

    @Override
    public void W(float f7, boolean z10) {
        fc1 fc1Var = (fc1) ((org.telegram.ui.Cells.k0) this.f13018b);
        int i10 = (int) (j6.f18155q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        j6.f18155q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = fc1Var.e.e;
            fl0 fl0Var = (fl0) themeActivity.f30663b.K(themeActivity.f30670f0);
            if (fl0Var != null) {
                ((f9) fl0Var.f41610a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (j6.f18155q * 100.0f))));
            }
            j6.E(true);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13017a) {
            case 20:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar);
                k7.a.c(I0, (s6.a) this.f13018b);
                I0.writeStrongBinder(null);
                eVar.J0(I0, 2);
                return;
            default:
                v8.e eVar2 = (v8.e) this.f13018b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.f7343a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f7351a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    f5.a(Status.h, Boolean.FALSE, aVar.f7342b);
                    return;
                }
        }
    }

    @Override
    public androidx.lifecycle.p0 b(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public r2.l c(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 >= 31 || ((context = (Context) this.f13018b) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int h = b2.r0.h(((b2.s) nVar.f6105c).f2002r);
            e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + e2.d0.G(h));
            return new n7.a1(14, new r2.b(h, 0), new r2.b(h, 1)).c(nVar);
        }
        return new rb.a(20).c(nVar);
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13018b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(Canvas canvas) {
        sq0 sq0Var = (sq0) this.f13018b;
        canvas.drawColor(sq0Var.getThemedColor(j6.f17928d6));
        if (SharedConfig.chatBlurEnabled()) {
            sq0Var.O0.b(canvas, -3);
        }
    }

    @Override
    public boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override
    public int f(View view) {
        return s4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).topMargin;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public float get() {
        zt0 zt0Var = (zt0) this.f13018b;
        int i10 = zt0Var.P1;
        og.m currentBrush = zt0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return og.x0.e(i10).f14557i;
        }
        return og.x0.e(i10).f(String.valueOf(og.m.f14420a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public void h(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f13018b);
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    @Override
    public void i0(boolean z10) {
        df0 df0Var = (df0) this.f13018b;
        df0Var.getClass();
        cf0 cf0Var = df0Var.f22404a;
        if (cf0Var != null) {
            ((ss0) cf0Var).a(z10);
        }
    }

    public void k(int i10, int i11, c3.p pVar) {
        char c10;
        char c11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        u3.d dVar = (u3.d) this.f13018b;
        u3.e eVar = dVar.f42547b;
        SparseArray sparseArray = dVar.f42549c;
        e2.v vVar = dVar.f42557k;
        e2.v vVar2 = dVar.f42555i;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        dVar.d(i10);
                                        byte[] bArr2 = new byte[i11];
                                        dVar.f42569x.f42536x = bArr2;
                                        pVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw b2.s0.a(null, "Unexpected id: " + i10);
                                }
                                dVar.d(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f42569x.f42525l = bArr3;
                                pVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(vVar.f7234a, (byte) 0);
                            pVar.readFully(vVar.f7234a, 4 - i11, i11);
                            vVar.J(0);
                            dVar.f42571z = (int) vVar.z();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        pVar.readFully(bArr4, 0, i11);
                        dVar.d(i10);
                        dVar.f42569x.f42524k = new c3.g0(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.d(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f42569x.f42523j = bArr5;
                    pVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.d(i10);
                u3.c cVar = dVar.f42569x;
                int i19 = cVar.h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    pVar.q(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.P = bArr6;
                pVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.J == 2) {
                u3.c cVar2 = (u3.c) sparseArray.get(dVar.P);
                int i20 = dVar.S;
                e2.v vVar3 = dVar.f42562p;
                if (i20 == 4 && "V_VP9".equals(cVar2.f42519c)) {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.f7234a, 0, i11);
                    return;
                }
                pVar.q(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.f42574c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.q(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i21 = (vVar2.f7234a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i22 = (vVar2.f7234a[3] & 255) + 1;
                dVar.N = i22;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.O = iArr2;
                if (i21 == 2) {
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, ((i11 - dVar.Q) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        dVar.O[i24] = 0;
                        while (true) {
                            i14 = i26 + 1;
                            dVar.j(pVar, i14);
                            int i27 = vVar2.f7234a[i26] & 255;
                            int[] iArr3 = dVar.O;
                            i15 = iArr3[i24] + i27;
                            iArr3[i24] = i15;
                            if (i27 != 255) {
                                break;
                            }
                            i26 = i14;
                        }
                        i25 += i15;
                        i24++;
                        i26 = i14;
                    }
                    dVar.O[i13] = ((i11 - dVar.Q) - i26) - i25;
                } else if (i21 == 3) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = dVar.N - i17;
                        if (i28 < i31) {
                            dVar.O[i28] = i18;
                            int i32 = i30 + 1;
                            dVar.j(pVar, i32);
                            if (vVar2.f7234a[i30] != 0) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 8) {
                                        int i34 = 1 << (7 - i33);
                                        if ((vVar2.f7234a[i30] & i34) != 0) {
                                            i12 = i32 + i33;
                                            dVar.j(pVar, i12);
                                            j3 = vVar2.f7234a[i30] & b10 & (~i34);
                                            while (i32 < i12) {
                                                j3 = (j3 << 8) | (vVar2.f7234a[i32] & b10);
                                                i32++;
                                                b10 = 255;
                                            }
                                            if (i28 > 0) {
                                                j3 -= (1 << ((i33 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i33++;
                                            b10 = 255;
                                        }
                                    } else {
                                        j3 = 0;
                                        i12 = i32;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i35 = (int) j3;
                                int[] iArr4 = dVar.O;
                                if (i28 != 0) {
                                    i35 += iArr4[i28 - 1];
                                }
                                iArr4[i28] = i35;
                                i29 += i35;
                                i28++;
                                i30 = i12;
                                b10 = 255;
                                i17 = 1;
                                i18 = 0;
                            } else {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            c10 = 1;
                            c11 = 0;
                            dVar.O[i31] = ((i11 - dVar.Q) - i30) - i29;
                            break;
                        }
                    }
                    throw b2.s0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw b2.s0.a(null, "Unexpected lacing value: " + i21);
                }
            }
            c10 = 1;
            c11 = 0;
            int i36 = vVar2.f7234a[c10] & 255;
            dVar.K = dVar.l(i36 | (bArr[c11] << 8)) + dVar.E;
            if (cVar3.e != 2 && (i10 != 163 || (vVar2.f7234a[2] & 128) != 128)) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            dVar.R = i16;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = dVar.M;
                if (i37 < dVar.N) {
                    dVar.e(cVar3, ((dVar.M * cVar3.f42520f) / 1000) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i37], false), 0);
                    dVar.M++;
                } else {
                    dVar.J = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = dVar.M;
                if (i38 < dVar.N) {
                    int[] iArr5 = dVar.O;
                    iArr5[i38] = dVar.n(pVar, cVar3, iArr5[i38], true);
                    dVar.M++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public int k0() {
        return 0;
    }

    public void l(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f13018b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override
    public int m() {
        return ((s4.o0) this.f13018b).G();
    }

    @Override
    public void m0() {
        cf0 cf0Var = ((df0) this.f13018b).f22404a;
        if (cf0Var != null) {
            PhotoViewer photoViewer = ((ss0) cf0Var).f36749a;
            if (photoViewer.f30033c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public Cursor n(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13018b;
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

    @Override
    public void o(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.f13018b;
        h hVar = toolbar.f710a.J;
        if (hVar != null && hVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f13002c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.b0) it.next()).f1092a.t();
        }
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f13018b;
        c1Var.y("scan_qr_popup_closed", null);
        c1Var.f37887h0 = false;
    }

    public void p() {
        HashMap hashMap = (HashMap) this.f13018b;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    @Override
    public int q() {
        s4.o0 o0Var = (s4.o0) this.f13018b;
        return o0Var.f41712n - o0Var.C();
    }

    @Override
    public View r(int i10) {
        return ((s4.o0) this.f13018b).q(i10);
    }

    @Override
    public int s(View view) {
        return s4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).bottomMargin;
    }

    public void t(int i10, long j3) {
        u3.d dVar = (u3.d) this.f13018b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        dVar.d(i10);
                        dVar.f42569x.e = (int) j3;
                        return;
                    case 136:
                        dVar.d(i10);
                        u3.c cVar = dVar.f42569x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar.X = z10;
                        return;
                    case 155:
                        dVar.L = dVar.l(j3);
                        return;
                    case 159:
                        dVar.d(i10);
                        dVar.f42569x.Q = (int) j3;
                        return;
                    case 176:
                        dVar.d(i10);
                        dVar.f42569x.f42527n = (int) j3;
                        return;
                    case 179:
                        dVar.a(i10);
                        dVar.F.b(dVar.l(j3));
                        return;
                    case 186:
                        dVar.d(i10);
                        dVar.f42569x.f42528o = (int) j3;
                        return;
                    case 215:
                        dVar.d(i10);
                        dVar.f42569x.d = (int) j3;
                        return;
                    case 231:
                        dVar.E = dVar.l(j3);
                        return;
                    case 238:
                        dVar.S = (int) j3;
                        return;
                    case 241:
                        if (!dVar.H) {
                            dVar.a(i10);
                            dVar.G.b(j3);
                            dVar.H = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.T = true;
                        return;
                    case 16871:
                        dVar.d(i10);
                        dVar.f42569x.h = (int) j3;
                        return;
                    case 16980:
                        if (j3 != 3) {
                            throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j3 < 1 || j3 > 2) {
                            throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j3 != 5) {
                            throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j3 != 1) {
                            throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.A = j3 + dVar.f42565s;
                        return;
                    case 21432:
                        int i11 = (int) j3;
                        dVar.d(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f42569x.f42537y = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f42569x.f42537y = 1;
                                return;
                            }
                            dVar.f42569x.f42537y = 2;
                            return;
                        }
                        dVar.f42569x.f42537y = 0;
                        return;
                    case 21680:
                        dVar.d(i10);
                        dVar.f42569x.f42530q = (int) j3;
                        return;
                    case 21682:
                        dVar.d(i10);
                        dVar.f42569x.f42532s = (int) j3;
                        return;
                    case 21690:
                        dVar.d(i10);
                        dVar.f42569x.f42531r = (int) j3;
                        return;
                    case 21930:
                        dVar.d(i10);
                        u3.c cVar2 = dVar.f42569x;
                        if (j3 == 1) {
                            z10 = true;
                        }
                        cVar2.W = z10;
                        return;
                    case 21938:
                        dVar.d(i10);
                        u3.c cVar3 = dVar.f42569x;
                        cVar3.f42538z = true;
                        cVar3.f42529p = (int) j3;
                        return;
                    case 21998:
                        dVar.d(i10);
                        dVar.f42569x.f42521g = (int) j3;
                        return;
                    case 22186:
                        dVar.d(i10);
                        dVar.f42569x.T = j3;
                        return;
                    case 22203:
                        dVar.d(i10);
                        dVar.f42569x.U = j3;
                        return;
                    case 25188:
                        dVar.d(i10);
                        dVar.f42569x.R = (int) j3;
                        return;
                    case 30114:
                        dVar.U = j3;
                        return;
                    case 30321:
                        dVar.d(i10);
                        int i12 = (int) j3;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f42569x.f42533t = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f42569x.f42533t = 2;
                                return;
                            }
                            dVar.f42569x.f42533t = 1;
                            return;
                        }
                        dVar.f42569x.f42533t = 0;
                        return;
                    case 2352003:
                        dVar.d(i10);
                        dVar.f42569x.f42520f = (int) j3;
                        return;
                    case 2807729:
                        dVar.f42566t = j3;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.d(i10);
                                int i13 = (int) j3;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f42569x.C = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f42569x.C = 2;
                                return;
                            case 21946:
                                dVar.d(i10);
                                int g10 = b2.j.g((int) j3);
                                if (g10 != -1) {
                                    dVar.f42569x.B = g10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i10);
                                dVar.f42569x.f42538z = true;
                                int f7 = b2.j.f((int) j3);
                                if (f7 != -1) {
                                    dVar.f42569x.A = f7;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i10);
                                dVar.f42569x.D = (int) j3;
                                return;
                            case 21949:
                                dVar.d(i10);
                                dVar.f42569x.E = (int) j3;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j3 != 1) {
                throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
            }
        } else if (j3 == 0) {
        } else {
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f13018b).call();
    }

    public String toString() {
        switch (this.f13017a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f13018b).flattenToShortString() + " }";
            case 17:
                re.b bVar = re.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((qg.m0) this.f13018b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u(g.z zVar) {
        zVar.a(((sq0) this.f13018b).getThemedColor(j6.f17928d6));
        zVar.b(SharedConfig.chatBlurEnabled());
    }

    public void v(za.b0 b0Var) {
        ((l5.q) ((i5.f) ((pa.b) this.f13018b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new th.e(this, 18)).a(new i5.a(null, b0Var, i5.d.f10477a, null), new j2.h(10));
    }

    public void w(String str, Bitmap bitmap) {
        Integer num = (Integer) n4.m.f13796c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f13018b).putParcelable(str, bitmap);
    }

    @Override
    public void x() {
        ((org.telegram.ui.Components.l9) this.f13018b).f24905a.invalidate();
    }

    public void z(long j3, String str) {
        Integer num = (Integer) n4.m.f13796c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f13018b).putLong(str, j3);
    }

    public g3(Object obj, int i10) {
        this.f13017a = i10;
        this.f13018b = obj;
    }

    public g3(s6.g gVar, s6.a aVar) {
        this.f13017a = 20;
        this.f13018b = aVar;
    }

    public g3(v1.c[] initializers) {
        this.f13017a = 22;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f13018b = initializers;
    }

    public g3(ArrayList arrayList) {
        this.f13017a = 18;
        this.f13018b = DesugarCollections.unmodifiableList(arrayList);
    }

    public g3(TextView textView) {
        this.f13017a = 14;
        this.f13018b = new q1.g(textView);
    }

    public g3(Context context, Uri uri) {
        this.f13017a = 3;
        this.f13018b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g3(int i10) {
        this.f13017a = i10;
        switch (i10) {
            case 4:
                this.f13018b = new LinkedHashMap(5, 1.0f, false);
                return;
            case 9:
                this.f13018b = new HashMap();
                return;
            case 24:
                this.f13018b = new rb.a(28);
                return;
            case 27:
                this.f13018b = new CopyOnWriteArrayList();
                return;
            case 28:
                this.f13018b = new og.u0[yf.b.values().length];
                return;
            default:
                this.f13018b = new Bundle();
                return;
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void y() {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void e(boolean z10) {
    }
}
