package m4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.d20;
import org.telegram.messenger.ha;
import org.telegram.messenger.hj;
import org.telegram.messenger.kj;
import org.telegram.messenger.s2;
import org.telegram.messenger.sw;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.g5;
import org.telegram.ui.jl0;
import org.telegram.ui.kg0;
import org.telegram.ui.ps0;
import org.telegram.ui.px;
import org.telegram.ui.rk0;
import org.telegram.ui.xh0;
import org.telegram.ui.xk0;
import org.telegram.ui.yx;
import org.telegram.ui.zx;
import th.n7;
import th.o7;
import th.u2;
import th.z2;
public final class c implements e2.d, nn0, kt, org.telegram.ui.Cells.l1, kk0, xk0, hi.a, com.google.android.gms.common.api.internal.s {
    public final int f12705a;
    public Object f12706b;
    public Object f12707c;

    public c(char c10, int i10) {
        this.f12705a = i10;
    }

    public static m4.c r(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.r(android.content.Context):m4.c");
    }

    @Override
    public boolean A1(org.telegram.ui.Cells.q1 q1Var, kj kjVar) {
        return false;
    }

    public void B(int i10, int i11, int i12) {
        sw[] swVarArr = (sw[]) this.f12706b;
        ?? obj = new Object();
        obj.f18171c = null;
        swVarArr[i10] = obj;
        obj.d = i11;
        obj.e = (i11 + i12) - 1;
        if (i12 == 1) {
            long j10 = ((long[]) this.f12707c)[i11];
            obj.f18169a = j10;
            obj.f18170b = j10;
            return;
        }
        int i13 = i10 * 2;
        int i14 = i12 / 2;
        B(i13, i11, i14);
        int i15 = i13 + 1;
        B(i15, i11 + i14, i12 - i14);
        sw swVar = swVarArr[i10];
        sw swVar2 = swVarArr[i13];
        swVar2.getClass();
        sw swVar3 = swVarArr[i15];
        swVar3.getClass();
        swVar.getClass();
        swVar.f18169a = Math.max(swVar2.f18169a, swVar3.f18169a);
        swVarArr[i10].f18170b = Math.min(swVarArr[i13].f18170b, swVarArr[i15].f18170b);
    }

    public void B0(s4.c1 c1Var) {
        s4.j1 j1Var = (s4.j1) ((a0.f) this.f12706b).get(c1Var);
        if (j1Var == null) {
            return;
        }
        j1Var.f47967a &= -2;
    }

    public void D(sw swVar, int i10) {
        swVar.f18171c = Integer.valueOf(i10);
        int i11 = swVar.d;
        long j10 = i10;
        swVar.f18169a = j10;
        swVar.f18170b = j10;
        ((long[]) this.f12707c)[i11] = j10;
    }

    public com.google.android.datatransport.cct.CctBackendFactory E(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.E(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public void E0(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f12706b;
        a0.h hVar = (a0.h) this.f12707c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (c1Var == hVar.n(m10)) {
                Object[] objArr = hVar.f16c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.f17a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.f14a = true;
                }
            } else {
                m10--;
            }
        }
        s4.j1 j1Var = (s4.j1) fVar.get(c1Var);
        if (j1Var != null) {
            fVar.remove(c1Var);
            j1Var.f47967a = 0;
            j1Var.f47968b = null;
            j1Var.f47969c = null;
            s4.j1.d.r(j1Var);
        }
    }

    @Override
    public boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public xh0 F(int i10, long j10, boolean z10) {
        if (i10 > 0) {
            i10 = ((SparseIntArray) this.f12707c).get(i10, 0);
        }
        Object obj = null;
        if (i10 == 0) {
            return null;
        }
        long j11 = i10;
        LongSparseArray p5 = ((l2.f) this.f12706b).p(j10, 0L);
        if (p5 != null) {
            obj = p5.get(j11);
        }
        xh0 xh0Var = (xh0) obj;
        if (xh0Var == null && z10) {
            xh0 xh0Var2 = new xh0();
            ((l2.f) this.f12706b).O(j10, 0L, j11, xh0Var2);
            return xh0Var2;
        }
        return xh0Var;
    }

    public void G0(int i10) {
        try {
            s7.f fVar = (s7.f) ((j8.a) this.f12706b).f9707a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            fVar.T0(P0, 11);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void H0(double d) {
        j8.a aVar = (j8.a) this.f12706b;
        aVar.getClass();
        try {
            s7.f fVar = (s7.f) aVar.f9707a;
            Parcel P0 = fVar.P0();
            P0.writeDouble(d);
            fVar.T0(P0, 5);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ps0 H1() {
        return null;
    }

    public File I() {
        if (((File) this.f12706b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f12706b) == null) {
                        l9.h hVar = (l9.h) this.f12707c;
                        hVar.a();
                        File filesDir = hVar.f11708a.getFilesDir();
                        this.f12706b = new File(filesDir, "PersistedInstallation." + ((l9.h) this.f12707c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f12706b;
    }

    @Override
    public boolean I0(long j10) {
        return ((jz0) this.f12707c).f27670w;
    }

    public void K(sa.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f48133a);
            jSONObject.put("Status", m1.j.c(aVar.f48134b));
            jSONObject.put("AuthToken", aVar.f48135c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f48136f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f48137g);
            l9.h hVar = (l9.h) this.f12707c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f11708a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(I())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public boolean K1(long j10) {
        return ((jz0) this.f12707c).f27669s;
    }

    public boolean L() {
        b6 b6Var = (b6) this.f12707c;
        if (b6Var.I0 <= 0.0f && !b6Var.A0()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    public boolean N(n4.t tVar, String str) {
        Context context = (Context) this.f12706b;
        int i10 = tVar.f13531b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, tVar.f13530a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, tVar.f13532c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void P0(int i10) {
        try {
            s7.f fVar = (s7.f) ((j8.a) this.f12706b).f9707a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            fVar.T0(P0, 9);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    public int Q0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f12706b;
        n6.l.g(context);
        n6.l.g(cVar);
        int i10 = 0;
        if (!cVar.l()) {
            return 0;
        }
        int m10 = cVar.m();
        int i11 = sparseIntArray.get(m10, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > m10 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.f12707c).d(context, m10);
        }
        sparseIntArray.put(m10, i10);
        return i10;
    }

    @Override
    public boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean S0(kj kjVar) {
        return org.telegram.ui.Cells.f1.a(kjVar);
    }

    public void V(long j10, File file) {
        synchronized (((e0.h) this.f12707c).f6022f) {
            ((HashMap) ((e0.h) this.f12707c).f6023g).put(Long.valueOf(j10), file);
        }
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public void X(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f12706b;
        u2 u2Var = (u2) this.f12707c;
        o7 o7Var = u2Var.e;
        o7.B1 = f7;
        n7 n7Var = o7Var.f49360z0;
        if (n7Var != null) {
            n7Var.setSpeed(f7);
        }
        z2.Y(u2Var.f49526x, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public zg.a Y() {
        return null;
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public j9.y a(b2.s0 s0Var) {
        Uri uri;
        byte[] bArr;
        li.k kVar = (li.k) this.f12707c;
        if (kVar != null && (((uri = (Uri) kVar.f12102c) != null && uri.equals(s0Var.f2257n)) || ((bArr = (byte[]) kVar.f12101b) != null && Arrays.equals(bArr, s0Var.f2254k)))) {
            j9.y yVar = (j9.y) ((li.k) this.f12707c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y a2 = ((e2.d) this.f12706b).a(s0Var);
        if (a2 == null) {
            return null;
        }
        this.f12707c = new li.k(s0Var, a2);
        return a2;
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void accept(java.lang.Object r51, java.lang.Object r52) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        zx zxVar = (zx) this.f12707c;
        if (view instanceof v2) {
            v2 v2Var = (v2) view;
            if (v2Var.f23239n2) {
                zxVar.Z4(v2Var.getDialogId(), view);
                return true;
            }
        }
        px pxVar = zxVar.f44243z0;
        if (pxVar != null && pxVar.getVisibility() == 0 && zxVar.f44243z0.f30763n) {
            return false;
        }
        return zxVar.A4(view, i10, f7, ((yx) this.f12706b).d);
    }

    public ac.g b0(s4.c1 c1Var, int i10) {
        s4.j1 j1Var;
        ac.g gVar;
        a0.f fVar = (a0.f) this.f12706b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (j1Var = (s4.j1) fVar.h(c10)) != null) {
            int i11 = j1Var.f47967a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                j1Var.f47967a = i12;
                if (i10 == 4) {
                    gVar = j1Var.f47968b;
                } else if (i10 == 8) {
                    gVar = j1Var.f47969c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    j1Var.f47967a = 0;
                    j1Var.f47968b = null;
                    j1Var.f47969c = null;
                    s4.j1.d.r(j1Var);
                }
                return gVar;
            }
        }
        return null;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c2(int i10) {
        return false;
    }

    @Override
    public void d(String str, String str2) {
        jl0 jl0Var = ((rk0) this.f12707c).f41099a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            jl0Var.S1(true, str2, (kg0) this.f12706b, this, jl0Var.B1);
        } else {
            jl0Var.R1(true, false);
        }
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f12706b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f12707c;
        kg.k1 k1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f33707h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(t6.f20873a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        k1Var.d(0, (-premiumPreviewFragment.f33702d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33699b0, 0, premiumPreviewFragment.f33702d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f33702d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, k1Var.f11143f);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public void g() {
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            ((zx) this.f12707c).finishPreviewFragment();
        }
    }

    @Override
    public l9 g2() {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    public void h0(int i10) {
        sw[] swVarArr = (sw[]) this.f12706b;
        sw swVar = swVarArr[i10];
        Integer num = swVar.f18171c;
        if (num != null) {
            int i11 = i10 * 2;
            D(swVarArr[i11], num.intValue());
            D(swVarArr[i11 + 1], swVar.f18171c.intValue());
            swVar.f18171c = null;
        }
    }

    @Override
    public boolean i0() {
        return false;
    }

    public long j0(int i10, int i11) {
        long[] jArr = (long[]) this.f12707c;
        if (jArr.length < 30) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 > jArr.length - 1) {
                i11 = jArr.length - 1;
            }
            long j10 = Long.MIN_VALUE;
            while (i10 <= i11) {
                long j11 = jArr[i10];
                if (j11 > j10) {
                    j10 = j11;
                }
                i10++;
            }
            return j10;
        }
        return k0(1, i10, i11);
    }

    @Override
    public boolean j1() {
        return false;
    }

    @Override
    public void k(boolean z10, float f7) {
        g5.f37351j1 = f7;
        ((TextView) this.f12706b).setText("Saturation " + (f7 * 5.0f));
        vu0 vu0Var = ((g5) this.f12707c).f37353i1;
        vu0Var.M();
        vu0Var.K();
    }

    public long k0(int i10, int i11, int i12) {
        sw swVar = ((sw[]) this.f12706b)[i10];
        Integer num = swVar.f18171c;
        if (num != null) {
            int i13 = swVar.d;
            int i14 = swVar.e;
            if (i11 >= i13 && i12 <= i14) {
                return num.intValue();
            }
        }
        int i15 = swVar.d;
        int i16 = swVar.e;
        if (i15 >= i11 && i16 <= i12) {
            return swVar.f18169a;
        }
        if ((i11 <= i15 && i12 >= i15) || (i11 >= i15 && i11 <= i16)) {
            h0(i10);
            int i17 = i10 * 2;
            return Math.max(k0(i17, i11, i12), k0(i17 + 1, i11, i12));
        }
        return 0L;
    }

    @Override
    public boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        return false;
    }

    @Override
    public void m() {
        ((j3) this.f12707c).b(((mt) this.f12706b).getText());
    }

    @Override
    public boolean m0(o5 o5Var) {
        return false;
    }

    public long n0(int i10, int i11) {
        long[] jArr = (long[]) this.f12707c;
        if (jArr.length < 30) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 > jArr.length - 1) {
                i11 = jArr.length - 1;
            }
            long j10 = Long.MAX_VALUE;
            while (i10 <= i11) {
                long j11 = jArr[i10];
                if (j11 < j10) {
                    j10 = j11;
                }
                i10++;
            }
            return j10;
        }
        return q0(1, i10, i11);
    }

    @Override
    public void p(float f7) {
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            ((zx) this.f12707c).movePreviewFragment(f7);
        }
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    public long q0(int i10, int i11, int i12) {
        sw swVar = ((sw[]) this.f12706b)[i10];
        Integer num = swVar.f18171c;
        if (num != null) {
            int i13 = swVar.d;
            int i14 = swVar.e;
            if (i11 >= i13 && i12 <= i14) {
                return num.intValue();
            }
        }
        int i15 = swVar.d;
        int i16 = swVar.e;
        if (i15 >= i11 && i16 <= i12) {
            return swVar.f18170b;
        }
        if ((i11 <= i15 && i12 >= i15) || (i11 >= i15 && i11 <= i16)) {
            h0(i10);
            int i17 = i10 * 2;
            return Math.min(q0(i17, i11, i12), q0(i17 + 1, i11, i12));
        }
        return 2147483647L;
    }

    @Override
    public boolean r1() {
        return false;
    }

    public sa.a t0() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(I());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = m1.j.d(5)[optInt];
        if (i10 != 0) {
            if (i10 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new sa.a(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public String toString() {
        switch (this.f12705a) {
            case 5:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f12707c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f12706b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj, String str) {
        ((ArrayList) this.f12706b).add(a1.g.C(str, "=", String.valueOf(obj)));
    }

    public void u0() {
        try {
            ((FileLock) this.f12707c).release();
            ((FileChannel) this.f12706b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void v0() {
        j8.a aVar = (j8.a) this.f12706b;
        try {
            s7.f fVar = (s7.f) aVar.f9707a;
            fVar.T0(fVar.P0(), 1);
            ((ha) this.f12707c).f16040c.remove(aVar);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public j9.y w(byte[] bArr) {
        byte[] bArr2;
        li.k kVar = (li.k) this.f12707c;
        if (kVar != null && (bArr2 = (byte[]) kVar.f12101b) != null && Arrays.equals(bArr2, bArr)) {
            j9.y yVar = (j9.y) ((li.k) this.f12707c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y w9 = ((e2.d) this.f12706b).w(bArr);
        this.f12707c = new li.k(bArr, w9);
        return w9;
    }

    @Override
    public boolean w0(kj kjVar) {
        return true;
    }

    @Override
    public void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override
    public String x(long j10) {
        String trim = ((EditTextBoldCursor) this.f12706b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((jz0) this.f12707c).f27669s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public void y(s4.c1 c1Var, ac.g gVar) {
        a0.f fVar = (a0.f) this.f12706b;
        s4.j1 j1Var = (s4.j1) fVar.get(c1Var);
        if (j1Var == null) {
            j1Var = s4.j1.a();
            fVar.put(c1Var, j1Var);
        }
        j1Var.f47969c = gVar;
        j1Var.f47967a |= 8;
    }

    @Override
    public CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    public c(int i10, Object obj, Object obj2) {
        this.f12705a = i10;
        this.f12707c = obj;
        this.f12706b = obj2;
    }

    public c(Object obj, int i10) {
        this.f12705a = i10;
        this.f12706b = obj;
    }

    public c(Object obj, Object obj2, boolean z10, int i10) {
        this.f12705a = i10;
        this.f12706b = obj;
        this.f12707c = obj2;
    }

    public c(Object obj) {
        this.f12705a = 5;
        this.f12707c = obj;
        this.f12706b = new ArrayList();
    }

    public c(k6.e eVar) {
        this.f12705a = 6;
        this.f12706b = new SparseIntArray();
        n6.l.g(eVar);
        this.f12707c = eVar;
    }

    public c(long[] jArr) {
        this.f12705a = 11;
        this.f12707c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.f12706b = new sw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        B(1, 0, jArr.length);
    }

    public c(l9.h hVar) {
        this.f12705a = 27;
        this.f12707c = hVar;
    }

    public c(Context context) {
        this.f12705a = 1;
        this.f12707c = null;
        this.f12706b = context;
    }

    public c(int i10) {
        this.f12705a = 7;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f12706b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f12707c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override
    public void B1() {
    }

    @Override
    public void C() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void s() {
    }

    @Override
    public void y0() {
    }

    public c(EditText editText) {
        this.f12705a = 22;
        this.f12706b = editText;
        q1.i iVar = new q1.i(editText);
        this.f12707c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f45403b == null) {
            synchronized (q1.a.f45402a) {
                try {
                    if (q1.a.f45403b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f45404c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f45403b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f45403b);
    }

    @Override
    public void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void J(hj hjVar) {
    }

    @Override
    public void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void O(kj kjVar) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void l0(String str) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void v1(kj kjVar) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    public c(PremiumPreviewFragment premiumPreviewFragment) {
        this.f12705a = 19;
        this.f12707c = premiumPreviewFragment;
        this.f12706b = new Paint();
    }

    public c(int i10, byte b10) {
        this.f12705a = i10;
        switch (i10) {
            case 26:
                this.f12706b = new a0.l(0);
                this.f12707c = new a0.h();
                return;
            default:
                this.f12706b = new l2.f(9);
                this.f12707c = new SparseIntArray();
                return;
        }
    }

    @Override
    public void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.q1 q1Var, d20 d20Var) {
    }

    @Override
    public void G(org.telegram.ui.Cells.q1 q1Var, s2 s2Var) {
    }

    @Override
    public void J1(String str, String str2) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override
    public void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override
    public void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override
    public void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void z1(kj kjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
