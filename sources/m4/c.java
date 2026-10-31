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
import org.telegram.messenger.c20;
import org.telegram.messenger.ga;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.rw;
import org.telegram.messenger.s2;
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
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.ay;
import org.telegram.ui.g5;
import org.telegram.ui.ll0;
import org.telegram.ui.mg0;
import org.telegram.ui.qs0;
import org.telegram.ui.qx;
import org.telegram.ui.tk0;
import org.telegram.ui.zh0;
import org.telegram.ui.zk0;
import org.telegram.ui.zx;
import th.n7;
import th.o7;
import th.u2;
import th.z2;
public final class c implements e2.d, mn0, kt, org.telegram.ui.Cells.l1, jk0, zk0, hi.a, com.google.android.gms.common.api.internal.s {
    public final int f12704a;
    public Object f12705b;
    public Object f12706c;

    public c(char c10, int i10) {
        this.f12704a = i10;
    }

    public static m4.c r(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.r(android.content.Context):m4.c");
    }

    @Override
    public boolean A1(org.telegram.ui.Cells.q1 q1Var, jj jjVar) {
        return false;
    }

    public void B(int i10, int i11, int i12) {
        rw[] rwVarArr = (rw[]) this.f12705b;
        ?? obj = new Object();
        obj.f17807c = null;
        rwVarArr[i10] = obj;
        obj.d = i11;
        obj.e = (i11 + i12) - 1;
        if (i12 == 1) {
            long j10 = ((long[]) this.f12706c)[i11];
            obj.f17805a = j10;
            obj.f17806b = j10;
            return;
        }
        int i13 = i10 * 2;
        int i14 = i12 / 2;
        B(i13, i11, i14);
        int i15 = i13 + 1;
        B(i15, i11 + i14, i12 - i14);
        rw rwVar = rwVarArr[i10];
        rw rwVar2 = rwVarArr[i13];
        rwVar2.getClass();
        rw rwVar3 = rwVarArr[i15];
        rwVar3.getClass();
        rwVar.getClass();
        rwVar.f17805a = Math.max(rwVar2.f17805a, rwVar3.f17805a);
        rwVarArr[i10].f17806b = Math.min(rwVarArr[i13].f17806b, rwVarArr[i15].f17806b);
    }

    public void B0(s4.c1 c1Var) {
        s4.j1 j1Var = (s4.j1) ((a0.f) this.f12705b).get(c1Var);
        if (j1Var == null) {
            return;
        }
        j1Var.f47956a &= -2;
    }

    public void D(rw rwVar, int i10) {
        rwVar.f17807c = Integer.valueOf(i10);
        int i11 = rwVar.d;
        long j10 = i10;
        rwVar.f17805a = j10;
        rwVar.f17806b = j10;
        ((long[]) this.f12706c)[i11] = j10;
    }

    public com.google.android.datatransport.cct.CctBackendFactory E(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.E(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public void E0(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f12705b;
        a0.h hVar = (a0.h) this.f12706c;
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
            j1Var.f47956a = 0;
            j1Var.f47957b = null;
            j1Var.f47958c = null;
            s4.j1.d.r(j1Var);
        }
    }

    @Override
    public boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public zh0 F(int i10, long j10, boolean z10) {
        if (i10 > 0) {
            i10 = ((SparseIntArray) this.f12706c).get(i10, 0);
        }
        Object obj = null;
        if (i10 == 0) {
            return null;
        }
        long j11 = i10;
        LongSparseArray s10 = ((l2.f) this.f12705b).s(j10, 0L);
        if (s10 != null) {
            obj = s10.get(j11);
        }
        zh0 zh0Var = (zh0) obj;
        if (zh0Var == null && z10) {
            zh0 zh0Var2 = new zh0();
            ((l2.f) this.f12705b).O(j10, 0L, j11, zh0Var2);
            return zh0Var2;
        }
        return zh0Var;
    }

    public void G0(int i10) {
        try {
            s7.f fVar = (s7.f) ((j8.a) this.f12705b).f9706a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            fVar.T0(P0, 11);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void H0(double d) {
        j8.a aVar = (j8.a) this.f12705b;
        aVar.getClass();
        try {
            s7.f fVar = (s7.f) aVar.f9706a;
            Parcel P0 = fVar.P0();
            P0.writeDouble(d);
            fVar.T0(P0, 5);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public qs0 H1() {
        return null;
    }

    public File I() {
        if (((File) this.f12705b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f12705b) == null) {
                        l9.h hVar = (l9.h) this.f12706c;
                        hVar.a();
                        File filesDir = hVar.f11707a.getFilesDir();
                        this.f12705b = new File(filesDir, "PersistedInstallation." + ((l9.h) this.f12706c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f12705b;
    }

    @Override
    public boolean I0(long j10) {
        return ((iz0) this.f12706c).f27155w;
    }

    public void K(sa.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f48122a);
            jSONObject.put("Status", m1.j.c(aVar.f48123b));
            jSONObject.put("AuthToken", aVar.f48124c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f48125f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f48126g);
            l9.h hVar = (l9.h) this.f12706c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f11707a.getFilesDir());
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
        return ((iz0) this.f12706c).f27154s;
    }

    public boolean L() {
        b6 b6Var = (b6) this.f12706c;
        if (b6Var.I0 <= 0.0f && !b6Var.z0()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    public boolean N(n4.t tVar, String str) {
        Context context = (Context) this.f12705b;
        int i10 = tVar.f13530b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, tVar.f13529a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, tVar.f13531c) == 0) {
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
            s7.f fVar = (s7.f) ((j8.a) this.f12705b).f9706a;
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
        SparseIntArray sparseIntArray = (SparseIntArray) this.f12705b;
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
            i10 = ((k6.e) this.f12706c).d(context, m10);
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
    public boolean S0(jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    public void V(long j10, File file) {
        synchronized (((e0.h) this.f12706c).f6022f) {
            ((HashMap) ((e0.h) this.f12706c).f6023g).put(Long.valueOf(j10), file);
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
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f12705b;
        u2 u2Var = (u2) this.f12706c;
        o7 o7Var = u2Var.e;
        o7.B1 = f7;
        n7 n7Var = o7Var.f49346z0;
        if (n7Var != null) {
            n7Var.setSpeed(f7);
        }
        z2.Y(u2Var.f49512x, z10);
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
        li.k kVar = (li.k) this.f12706c;
        if (kVar != null && (((uri = (Uri) kVar.f12101c) != null && uri.equals(s0Var.f2257n)) || ((bArr = (byte[]) kVar.f12100b) != null && Arrays.equals(bArr, s0Var.f2254k)))) {
            j9.y yVar = (j9.y) ((li.k) this.f12706c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y a2 = ((e2.d) this.f12705b).a(s0Var);
        if (a2 == null) {
            return null;
        }
        this.f12706c = new li.k(s0Var, a2);
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
        ay ayVar = (ay) this.f12706c;
        if (view instanceof v2) {
            v2 v2Var = (v2) view;
            if (v2Var.f23238n2) {
                ayVar.Y4(v2Var.getDialogId(), view);
                return true;
            }
        }
        qx qxVar = ayVar.f35900z0;
        if (qxVar != null && qxVar.getVisibility() == 0 && ayVar.f35900z0.f30717n) {
            return false;
        }
        return ayVar.z4(view, i10, f7, ((zx) this.f12705b).d);
    }

    public ac.g b0(s4.c1 c1Var, int i10) {
        s4.j1 j1Var;
        ac.g gVar;
        a0.f fVar = (a0.f) this.f12705b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (j1Var = (s4.j1) fVar.h(c10)) != null) {
            int i11 = j1Var.f47956a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                j1Var.f47956a = i12;
                if (i10 == 4) {
                    gVar = j1Var.f47957b;
                } else if (i10 == 8) {
                    gVar = j1Var.f47958c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    j1Var.f47956a = 0;
                    j1Var.f47957b = null;
                    j1Var.f47958c = null;
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
        ll0 ll0Var = ((tk0) this.f12706c).f41855a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            ll0Var.R1(true, str2, (mg0) this.f12705b, this, ll0Var.B1);
        } else {
            ll0Var.Q1(true, false);
        }
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f12705b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f12706c;
        kg.k1 k1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f33700h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(t6.f20872a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        k1Var.d(0, (-premiumPreviewFragment.f33695d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33692b0, 0, premiumPreviewFragment.f33695d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f33695d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, k1Var.f11142f);
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
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            ((ay) this.f12706c).finishPreviewFragment();
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
        rw[] rwVarArr = (rw[]) this.f12705b;
        rw rwVar = rwVarArr[i10];
        Integer num = rwVar.f17807c;
        if (num != null) {
            int i11 = i10 * 2;
            D(rwVarArr[i11], num.intValue());
            D(rwVarArr[i11 + 1], rwVar.f17807c.intValue());
            rwVar.f17807c = null;
        }
    }

    @Override
    public boolean i0() {
        return false;
    }

    public long j0(int i10, int i11) {
        long[] jArr = (long[]) this.f12706c;
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
        g5.f37423j1 = f7;
        ((TextView) this.f12705b).setText("Saturation " + (f7 * 5.0f));
        uu0 uu0Var = ((g5) this.f12706c).f37425i1;
        uu0Var.M();
        uu0Var.L();
    }

    public long k0(int i10, int i11, int i12) {
        rw rwVar = ((rw[]) this.f12705b)[i10];
        Integer num = rwVar.f17807c;
        if (num != null) {
            int i13 = rwVar.d;
            int i14 = rwVar.e;
            if (i11 >= i13 && i12 <= i14) {
                return num.intValue();
            }
        }
        int i15 = rwVar.d;
        int i16 = rwVar.e;
        if (i15 >= i11 && i16 <= i12) {
            return rwVar.f17805a;
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
        ((j3) this.f12706c).b(((mt) this.f12705b).getText());
    }

    @Override
    public boolean m0(o5 o5Var) {
        return false;
    }

    public long n0(int i10, int i11) {
        long[] jArr = (long[]) this.f12706c;
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
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            ((ay) this.f12706c).movePreviewFragment(f7);
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
        rw rwVar = ((rw[]) this.f12705b)[i10];
        Integer num = rwVar.f17807c;
        if (num != null) {
            int i13 = rwVar.d;
            int i14 = rwVar.e;
            if (i11 >= i13 && i12 <= i14) {
                return num.intValue();
            }
        }
        int i15 = rwVar.d;
        int i16 = rwVar.e;
        if (i15 >= i11 && i16 <= i12) {
            return rwVar.f17806b;
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
        switch (this.f12704a) {
            case 5:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f12706c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f12705b;
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
        ((ArrayList) this.f12705b).add(a1.g.C(str, "=", String.valueOf(obj)));
    }

    public void u0() {
        try {
            ((FileLock) this.f12706c).release();
            ((FileChannel) this.f12705b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void v0() {
        j8.a aVar = (j8.a) this.f12705b;
        try {
            s7.f fVar = (s7.f) aVar.f9706a;
            fVar.T0(fVar.P0(), 1);
            ((ga) this.f12706c).f15691c.remove(aVar);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public j9.y w(byte[] bArr) {
        byte[] bArr2;
        li.k kVar = (li.k) this.f12706c;
        if (kVar != null && (bArr2 = (byte[]) kVar.f12100b) != null && Arrays.equals(bArr2, bArr)) {
            j9.y yVar = (j9.y) ((li.k) this.f12706c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y w9 = ((e2.d) this.f12705b).w(bArr);
        this.f12706c = new li.k(bArr, w9);
        return w9;
    }

    @Override
    public boolean w0(jj jjVar) {
        return true;
    }

    @Override
    public void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override
    public String x(long j10) {
        String trim = ((EditTextBoldCursor) this.f12705b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((iz0) this.f12706c).f27154s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public void y(s4.c1 c1Var, ac.g gVar) {
        a0.f fVar = (a0.f) this.f12705b;
        s4.j1 j1Var = (s4.j1) fVar.get(c1Var);
        if (j1Var == null) {
            j1Var = s4.j1.a();
            fVar.put(c1Var, j1Var);
        }
        j1Var.f47958c = gVar;
        j1Var.f47956a |= 8;
    }

    @Override
    public CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    public c(int i10, Object obj, Object obj2) {
        this.f12704a = i10;
        this.f12706c = obj;
        this.f12705b = obj2;
    }

    public c(Object obj, int i10) {
        this.f12704a = i10;
        this.f12705b = obj;
    }

    public c(Object obj, Object obj2, boolean z10, int i10) {
        this.f12704a = i10;
        this.f12705b = obj;
        this.f12706c = obj2;
    }

    public c(Object obj) {
        this.f12704a = 5;
        this.f12706c = obj;
        this.f12705b = new ArrayList();
    }

    public c(k6.e eVar) {
        this.f12704a = 6;
        this.f12705b = new SparseIntArray();
        n6.l.g(eVar);
        this.f12706c = eVar;
    }

    public c(long[] jArr) {
        this.f12704a = 11;
        this.f12706c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.f12705b = new rw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        B(1, 0, jArr.length);
    }

    public c(l9.h hVar) {
        this.f12704a = 27;
        this.f12706c = hVar;
    }

    public c(Context context) {
        this.f12704a = 1;
        this.f12706c = null;
        this.f12705b = context;
    }

    public c(int i10) {
        this.f12704a = 7;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f12705b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f12706c = new BitmapShader(createBitmap, tileMode, tileMode);
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
        this.f12704a = 22;
        this.f12705b = editText;
        q1.i iVar = new q1.i(editText);
        this.f12706c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f45392b == null) {
            synchronized (q1.a.f45391a) {
                try {
                    if (q1.a.f45392b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f45393c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f45392b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f45392b);
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
    public void J(gj gjVar) {
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
    public void O(jj jjVar) {
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
    public void v1(jj jjVar) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    public c(PremiumPreviewFragment premiumPreviewFragment) {
        this.f12704a = 19;
        this.f12706c = premiumPreviewFragment;
        this.f12705b = new Paint();
    }

    public c(int i10, byte b10) {
        this.f12704a = i10;
        switch (i10) {
            case 26:
                this.f12705b = new a0.l(0);
                this.f12706c = new a0.h();
                return;
            default:
                this.f12705b = new l2.f(9);
                this.f12706c = new SparseIntArray();
                return;
        }
    }

    @Override
    public void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.q1 q1Var, c20 c20Var) {
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
    public void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
