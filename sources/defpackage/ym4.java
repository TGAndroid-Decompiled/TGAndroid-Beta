package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PremiumPreviewFragment;
public final class ym4 implements mm4, l12, up5, mqa, mz4, oi0, n09, uw8, tw8, xj0, p7b, rb2 {
    public final byte a;
    public Object b;
    public Object c;

    public ym4(long[] jArr) {
        this.a = (byte) 22;
        this.c = jArr;
        if (jArr.length >= 30) {
            this.b = new rz0[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / 0.6931471805599453d) + 1.0d)) * 2.0d)];
            n(1, 0, jArr.length);
        }
    }

    @Override
    public final boolean A1(hm hmVar) {
        return false;
    }

    public final File B() {
        if (((File) this.b) == null) {
            synchronized (this) {
                if (((File) this.b) == null) {
                    String str = "PersistedInstallation." + ((ji4) this.c).d() + ".json";
                    ji4 ji4Var = (ji4) this.c;
                    ji4Var.a();
                    File file = new File(ji4Var.a.getNoBackupFilesDir(), str);
                    this.b = file;
                    if (file.exists()) {
                        return (File) this.b;
                    }
                    ji4 ji4Var2 = (ji4) this.c;
                    ji4Var2.a();
                    File file2 = new File(ji4Var2.a.getFilesDir(), str);
                    if (file2.exists() && !file2.renameTo((File) this.b)) {
                        Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                        return file2;
                    }
                }
            }
        }
        return (File) this.b;
    }

    public final long B0(int i, int i2) {
        long[] jArr = (long[]) this.c;
        if (jArr.length < 30) {
            if (i < 0) {
                i = 0;
            }
            if (i2 > jArr.length - 1) {
                i2 = jArr.length - 1;
            }
            long j = Long.MAX_VALUE;
            while (i <= i2) {
                long j2 = jArr[i];
                if (j2 < j) {
                    j = j2;
                }
                i++;
            }
            return j;
        }
        return D0(1, i, i2);
    }

    public final String C(String str) {
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", (String) this.c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public final long D0(int i, int i2, int i3) {
        rz0 rz0Var = ((rz0[]) this.b)[i];
        Integer num = (Integer) rz0Var.e;
        if (num != null) {
            int i4 = rz0Var.c;
            int i5 = rz0Var.d;
            if (i2 >= i4 && i3 <= i5) {
                return num.intValue();
            }
        }
        int i6 = rz0Var.c;
        int i7 = rz0Var.d;
        if (i6 >= i2 && i7 <= i3) {
            return rz0Var.b;
        }
        if ((i2 <= i6 && i3 >= i6) || (i2 >= i6 && i2 <= i7)) {
            t0(i);
            int i8 = i << 1;
            return Math.min(D0(i8, i2, i3), D0(i8 + 1, i2, i3));
        }
        return 2147483647L;
    }

    @Override
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean E0() {
        System.currentTimeMillis();
        return true;
    }

    public final ia0 F0() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(B());
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
        int i = ia0.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = ik8.G(5)[optInt];
        if (i2 != 0) {
            byte b2 = (byte) (((byte) (b | 2)) | 1);
            if (b2 == 3 && i2 != 0) {
                return new ia0(optString, i2, optString2, optString3, optLong2, optLong, optString4);
            }
            StringBuilder sb = new StringBuilder();
            if (i2 == 0) {
                sb.append(" registrationStatus");
            }
            if ((b2 & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((b2 & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            grb.i(bs2.o("Missing required properties:", sb));
            return null;
        }
        p3d.h("Null registrationStatus");
        return null;
    }

    @Override
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    public final void H0() {
        xh2 xh2Var = (xh2) this.b;
        xh2Var.getClass();
        try {
            fre freVar = (fre) xh2Var.a;
            freVar.V(freVar.R(), 1);
            ((x05) this.c).c.remove(xh2Var);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    public final boolean I(Long l) {
        boolean z;
        synchronized (((HashMap) this.c)) {
            r89 r89Var = (r89) ((HashMap) this.c).get(l);
            if (r89Var != null && !r89Var.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void J(ia0 ia0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ia0Var.a);
            jSONObject.put("Status", ik8.F(ia0Var.b));
            jSONObject.put("AuthToken", ia0Var.c);
            jSONObject.put("RefreshToken", ia0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", ia0Var.f);
            jSONObject.put("ExpiresInSecs", ia0Var.e);
            jSONObject.put("FisError", ia0Var.g);
            ji4 ji4Var = (ji4) this.c;
            ji4Var.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", ji4Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(B())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public final de8 J1() {
        return null;
    }

    @Override
    public final boolean K() {
        return false;
    }

    public final void L0(int i) {
        xh2 xh2Var = (xh2) this.b;
        xh2Var.getClass();
        try {
            fre freVar = (fre) xh2Var.a;
            Parcel R = freVar.R();
            R.writeInt(i);
            freVar.V(R, 11);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override
    public final boolean L1(long j) {
        return ((sjb) this.c).s;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final int N() {
        return 0;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public final void R0(double d) {
        xh2 xh2Var = (xh2) this.b;
        xh2Var.getClass();
        try {
            fre freVar = (fre) xh2Var.a;
            Parcel R = freVar.R();
            R.writeDouble(d);
            freVar.V(R, 5);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override
    public final iv1 S() {
        return null;
    }

    public final void S0(int i) {
        xh2 xh2Var = (xh2) this.b;
        xh2Var.getClass();
        try {
            fre freVar = (fre) xh2Var.a;
            Parcel R = freVar.R();
            R.writeInt(i);
            freVar.V(R, 9);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override
    public final x76 X(nt6 nt6Var) {
        x76 X = ((ed) this.b).X(nt6Var);
        if (X == null) {
            return null;
        }
        return e4.o(X, new dr4(this, (byte) 2));
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final void a(m09 m09Var, int i) {
        int[] iArr = (int[]) this.c;
        try {
            m09Var.read((byte[]) this.b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            m09Var.close();
        }
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final x76 b0(byte[] bArr) {
        return e4.o(((ed) this.b).b0(bArr), new dr4(this, (byte) 2));
    }

    @Override
    public final ni0 c(cb3 cb3Var, long j) {
        long j2 = cb3Var.d;
        int min = (int) Math.min(20000L, cb3Var.c - j2);
        ey7 ey7Var = (ey7) this.c;
        ey7Var.K(min);
        cb3Var.d(ey7Var.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (ey7Var.a() >= 4) {
            if (dk4.b(ey7Var.b, ey7Var.a) != 442) {
                ey7Var.O(1);
            } else {
                ey7Var.O(4);
                long c = px8.c(ey7Var);
                if (c != -9223372036854775807L) {
                    long b = ((usb) this.b).b(c);
                    if (b > j) {
                        if (j3 == -9223372036854775807L) {
                            return new ni0(b, -1, j2);
                        }
                        return new ni0(-9223372036854775807L, 0, j2 + i2);
                    }
                    int i3 = ((b + 100000) > j ? 1 : ((b + 100000) == j ? 0 : -1));
                    int i4 = ey7Var.b;
                    if (i3 > 0) {
                        return new ni0(-9223372036854775807L, 0, j2 + i4);
                    }
                    i2 = i4;
                    j3 = b;
                }
                int i5 = ey7Var.c;
                if (ey7Var.a() < 10) {
                    ey7Var.N(i5);
                } else {
                    ey7Var.O(9);
                    int A = ey7Var.A() & 7;
                    if (ey7Var.a() < A) {
                        ey7Var.N(i5);
                    } else {
                        ey7Var.O(A);
                        if (ey7Var.a() < 4) {
                            ey7Var.N(i5);
                        } else {
                            if (dk4.b(ey7Var.b, ey7Var.a) == 443) {
                                ey7Var.O(4);
                                int H = ey7Var.H();
                                if (ey7Var.a() < H) {
                                    ey7Var.N(i5);
                                } else {
                                    ey7Var.O(H);
                                }
                            }
                            while (true) {
                                if (ey7Var.a() < 4) {
                                    break;
                                }
                                int b2 = dk4.b(ey7Var.b, ey7Var.a);
                                if (b2 == 442 || b2 == 441 || (b2 >>> 8) != 1) {
                                    break;
                                }
                                ey7Var.O(4);
                                if (ey7Var.a() < 2) {
                                    ey7Var.N(i5);
                                    break;
                                }
                                ey7Var.N(Math.min(ey7Var.c, ey7Var.b + ey7Var.H()));
                            }
                        }
                    }
                }
                i = ey7Var.b;
            }
        }
        if (j3 != -9223372036854775807L) {
            return new ni0(j3, -2, j2 + i);
        }
        return ni0.d;
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        al8 al8Var = premiumPreviewFragment.n0;
        if (premiumPreviewFragment.i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(aob.a7));
            canvas.drawRect(f, f2, f3, f4, paint);
            return;
        }
        al8Var.d(0, (-premiumPreviewFragment.e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, premiumPreviewFragment.e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.e0.getMeasuredHeight());
        canvas.drawRect(f, f2, f3, f4, al8Var.f);
    }

    @Override
    public final void f() {
        byte[] bArr = gcc.b;
        ((ey7) this.c).L(bArr.length, bArr);
    }

    @Override
    public final String g() {
        return "tg|" + ((Uri) this.b).getQueryParameter("id") + "|" + ((Long) this.c);
    }

    @Override
    public final Object mo21get() {
        switch (this.a) {
            case 21:
                ?? obj = new Object();
                z6f z6fVar = new z6f((byte) 28);
                hu9 hu9Var = (hu9) ((pq8) this.b).mo21get();
                return new ds9(obj, z6fVar, s90.f, hu9Var, (uw8) this.c);
            default:
                return new bba((aca) ((tw8) this.b).mo21get(), (aca) ((tw8) this.c).mo21get());
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean i2(int i) {
        return false;
    }

    @Override
    public final Closeable j(MediaExtractor mediaExtractor) {
        q7b q7bVar = new q7b(((Long) this.c).longValue(), (Uri) this.b);
        mediaExtractor.setDataSource(q7bVar);
        return q7bVar;
    }

    @Override
    public final boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    @Override
    public final Object k(nm4 nm4Var, zw2 zw2Var) {
        Object k = ((um4) this.b).k(new an4(new Object(), nm4Var, (w73) this.c), zw2Var);
        if (k == vx2.a) {
            return k;
        }
        return f9c.a;
    }

    @Override
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override
    public final bmb l2() {
        return null;
    }

    public final boolean m0(uy6 uy6Var, String str) {
        int i = uy6Var.b;
        Context context = (Context) this.b;
        if (i < 0) {
            if (context.getPackageManager().checkPermission(str, uy6Var.a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i, uy6Var.c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void n(int i, int i2, int i3) {
        rz0[] rz0VarArr = (rz0[]) this.b;
        ?? obj = new Object();
        obj.e = null;
        rz0VarArr[i] = obj;
        obj.c = i2;
        obj.d = (i2 + i3) - 1;
        if (i3 == 1) {
            long j = ((long[]) this.c)[i2];
            obj.a = j;
            obj.b = j;
            return;
        }
        int i4 = i << 1;
        int i5 = i3 / 2;
        n(i4, i2, i5);
        int i6 = i4 + 1;
        n(i6, i2 + i5, i3 - i5);
        rz0 rz0Var = rz0VarArr[i];
        rz0 rz0Var2 = rz0VarArr[i4];
        rz0Var2.getClass();
        rz0 rz0Var3 = rz0VarArr[i6];
        rz0Var3.getClass();
        rz0Var.getClass();
        rz0Var.a = Math.max(rz0Var2.a, rz0Var3.a);
        rz0VarArr[i].b = Math.min(rz0VarArr[i4].b, rz0VarArr[i6].b);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final StackTraceElement[] p(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        mqa[] mqaVarArr = (mqa[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            mqa mqaVar = mqaVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = mqaVar.p(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rg7) this.c).p(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public final boolean p0(View view) {
        tgc tgcVar = (tgc) this.c;
        ugc ugcVar = (ugc) this.b;
        int m = ugcVar.m();
        int A = ugcVar.A();
        int c = ugcVar.c(view);
        int C = ugcVar.C(view);
        tgcVar.b = m;
        tgcVar.c = A;
        tgcVar.d = c;
        tgcVar.e = C;
        tgcVar.a = 24579;
        return tgcVar.a();
    }

    @Override
    public final tp5 q(um4 um4Var) {
        int i;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) um4Var.b;
        if (arrayList2 != null) {
            i = arrayList2.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            ArrayList arrayList3 = new ArrayList(arrayList.size() + i);
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            arrayList = arrayList3;
        }
        return new gl6(um4Var, (ArrayList) this.b, arrayList);
    }

    public final void s(rz0 rz0Var, int i) {
        rz0Var.e = Integer.valueOf(i);
        int i2 = rz0Var.c;
        long j = i;
        rz0Var.a = j;
        rz0Var.b = j;
        ((long[]) this.c)[i2] = j;
    }

    @Override
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public final void t() {
        this.b = null;
        this.c = null;
    }

    public final void t0(int i) {
        rz0[] rz0VarArr = (rz0[]) this.b;
        rz0 rz0Var = rz0VarArr[i];
        Integer num = (Integer) rz0Var.e;
        if (num != null) {
            int i2 = i << 1;
            s(rz0VarArr[i2], num.intValue());
            s(rz0VarArr[i2 + 1], ((Integer) rz0Var.e).intValue());
            rz0Var.e = null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((i36) this.b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public final String u(long j) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((sjb) this.c).s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    public final long v0(int i, int i2) {
        long[] jArr = (long[]) this.c;
        if (jArr.length < 30) {
            if (i < 0) {
                i = 0;
            }
            if (i2 > jArr.length - 1) {
                i2 = jArr.length - 1;
            }
            long j = Long.MIN_VALUE;
            while (i <= i2) {
                long j2 = jArr[i];
                if (j2 > j) {
                    j = j2;
                }
                i++;
            }
            return j;
        }
        return x0(1, i, i2);
    }

    public final void w(String str, PrintWriter printWriter) {
        boolean z;
        ta6 ta6Var = (ta6) this.c;
        if (ta6Var.b.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String concat = str.concat("    ");
            int i = 0;
            while (true) {
                koa koaVar = ta6Var.b;
                if (i < koaVar.c) {
                    sa6 sa6Var = (sa6) koaVar.b[i];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(ta6Var.b.a[i]);
                    printWriter.print(": ");
                    printWriter.println(sa6Var.toString());
                    printWriter.print(concat);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(concat);
                    printWriter.print("mLoader=");
                    printWriter.println(sa6Var.l);
                    m8d m8dVar = sa6Var.l;
                    String concat2 = concat.concat("  ");
                    m8dVar.getClass();
                    printWriter.print(concat2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(m8dVar.a);
                    if (m8dVar.b || m8dVar.e) {
                        printWriter.print(concat2);
                        printWriter.print("mStarted=");
                        printWriter.print(m8dVar.b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(m8dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (m8dVar.c || m8dVar.d) {
                        printWriter.print(concat2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(m8dVar.c);
                        printWriter.print(" mReset=");
                        printWriter.println(m8dVar.d);
                    }
                    if (m8dVar.g != null) {
                        printWriter.print(concat2);
                        printWriter.print("mTask=");
                        printWriter.print(m8dVar.g);
                        printWriter.print(" waiting=");
                        m8dVar.g.getClass();
                        printWriter.println(false);
                    }
                    if (m8dVar.h != null) {
                        printWriter.print(concat2);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(m8dVar.h);
                        printWriter.print(" waiting=");
                        m8dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (sa6Var.n != null) {
                        printWriter.print(concat);
                        printWriter.print("mCallbacks=");
                        printWriter.println(sa6Var.n);
                        n31 n31Var = sa6Var.n;
                        String concat3 = concat.concat("  ");
                        n31Var.getClass();
                        printWriter.print(concat3);
                        printWriter.print("mDeliveredData=");
                        printWriter.println(n31Var.b);
                    }
                    printWriter.print(concat);
                    printWriter.print("mData=");
                    m8d m8dVar2 = sa6Var.l;
                    Object obj2 = sa6Var.e;
                    if (obj2 != qj7.k) {
                        obj = obj2;
                    }
                    m8dVar2.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    if (obj == null) {
                        sb.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb.append(cls.getSimpleName());
                        sb.append("{");
                        sb.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb.append("}");
                    }
                    printWriter.println(sb.toString());
                    printWriter.print(concat);
                    printWriter.print("mStarted=");
                    if (sa6Var.c > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    printWriter.println(z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    public final View x(int i, int i2, int i3, int i4) {
        int i5;
        tgc tgcVar = (tgc) this.c;
        ugc ugcVar = (ugc) this.b;
        int m = ugcVar.m();
        int A = ugcVar.A();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View B = ugcVar.B(i);
            int c = ugcVar.c(B);
            int C = ugcVar.C(B);
            tgcVar.b = m;
            tgcVar.c = A;
            tgcVar.d = c;
            tgcVar.e = C;
            if (i3 != 0) {
                tgcVar.a = i3;
                if (tgcVar.a()) {
                    return B;
                }
            }
            if (i4 != 0) {
                tgcVar.a = i4;
                if (tgcVar.a()) {
                    view = B;
                }
            }
            i += i5;
        }
        return view;
    }

    public final long x0(int i, int i2, int i3) {
        rz0 rz0Var = ((rz0[]) this.b)[i];
        Integer num = (Integer) rz0Var.e;
        if (num != null) {
            int i4 = rz0Var.c;
            int i5 = rz0Var.d;
            if (i2 >= i4 && i3 <= i5) {
                return num.intValue();
            }
        }
        int i6 = rz0Var.c;
        int i7 = rz0Var.d;
        if (i6 >= i2 && i7 <= i3) {
            return rz0Var.a;
        }
        if ((i2 <= i6 && i3 >= i6) || (i2 >= i6 && i2 <= i7)) {
            t0(i);
            int i8 = i << 1;
            return Math.max(x0(i8, i2, i3), x0(i8 + 1, i2, i3));
        }
        return 0L;
    }

    public final com.google.android.datatransport.cct.CctBackendFactory y(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym4.y(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public final boolean y0(long j) {
        return ((sjb) this.c).w;
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        n12 n12Var = (n12) this.b;
        try {
            HashMap<Object, Object> selectedPhotos = n12Var.d2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                no6 no6Var = (no6) selectedPhotos.values().iterator().next();
                String str = no6Var.h;
                if (str == null) {
                    str = no6Var.I;
                }
                wy5 wy5Var = (wy5) this.c;
                wy5Var.a0(wy5Var.d0(str, true));
                n12Var.dismiss();
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void A(wb2 wb2Var) {
    }

    @Override
    public final void C0(wb2 wb2Var) {
    }

    @Override
    public final void G(wb2 wb2Var) {
    }

    @Override
    public final void G1(wb2 wb2Var) {
    }

    @Override
    public final void I1(wb2 wb2Var) {
    }

    @Override
    public final void J0(wb2 wb2Var) {
    }

    @Override
    public final void N0(wb2 wb2Var) {
    }

    @Override
    public final void N1(wb2 wb2Var) {
    }

    @Override
    public final void O(wb2 wb2Var) {
    }

    @Override
    public final void Q(wb2 wb2Var) {
    }

    @Override
    public final void T(r47 r47Var) {
    }

    @Override
    public final void U0(wb2 wb2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Y0(wb2 wb2Var) {
    }

    @Override
    public final void a1(wb2 wb2Var) {
    }

    @Override
    public final void d0(r47 r47Var) {
    }

    @Override
    public final void e0(Object obj) {
    }

    @Override
    public final void e2(wb2 wb2Var) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void h1(wb2 wb2Var) {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }

    @Override
    public final void j0(wb2 wb2Var) {
    }

    @Override
    public final void l(wb2 wb2Var) {
    }

    @Override
    public final void m2(wb2 wb2Var) {
    }

    @Override
    public final void n1(o47 o47Var) {
    }

    @Override
    public final void v1(wb2 wb2Var) {
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(String str, String str2) {
    }

    @Override
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
    }

    @Override
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    public ym4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ym4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public ym4(byte b, boolean z) {
        this.a = b;
    }

    public ym4(byte b) {
        this.a = b;
        switch (b) {
            case 19:
                this.c = new HashMap();
                return;
            default:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                return;
        }
    }

    public ym4(mqa[] mqaVarArr) {
        this.a = (byte) 10;
        this.b = mqaVarArr;
        this.c = new rg7((byte) 22);
    }

    public ym4(ExecutorService executorService) {
        this.a = (byte) 20;
        this.c = new vla(0);
        this.b = executorService;
    }

    public ym4(i36 i36Var, rhc rhcVar) {
        this.a = (byte) 5;
        this.b = i36Var;
        this.c = (ta6) new pq8(rhcVar, ta6.d).n(ta6.class);
    }

    @Override
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void K0(wb2 wb2Var, float f, float f2) {
    }

    @Override
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void a2(wb2 wb2Var, float f, float f2) {
    }

    @Override
    public final void f1(wb2 wb2Var, float f, float f2) {
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void v(wb2 wb2Var, float f, float f2) {
    }

    public ym4(byte[] bArr) {
        this.a = (byte) 7;
        this.b = bArr;
    }

    public ym4(usb usbVar) {
        this.a = (byte) 16;
        this.b = usbVar;
        this.c = new ey7();
    }

    public ym4(ji4 ji4Var) {
        this.a = (byte) 14;
        this.c = ji4Var;
    }

    public ym4(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 27:
                xve.h(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(2131689567);
                return;
            default:
                this.c = null;
                this.b = context;
                return;
        }
    }

    public ym4(ugc ugcVar) {
        this.a = (byte) 29;
        this.b = ugcVar;
        ?? obj = new Object();
        obj.a = 0;
        this.c = obj;
    }

    public ym4(int i) {
        this.a = (byte) 25;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public ym4(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = (byte) 15;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void q0(wb2 wb2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(wb2 wb2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
