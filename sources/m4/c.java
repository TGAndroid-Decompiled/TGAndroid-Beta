package m4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.ay;
import org.telegram.ui.cv0;
import org.telegram.ui.cy;
import org.telegram.ui.d3;
import org.telegram.ui.l5;
import org.telegram.ui.qx;
import x7.qa;
public final class c implements e2.d, kp0, org.telegram.ui.Cells.j1, cm0, hh.a, oe.d, y2.n, SuccessContinuation {
    public final int f18008a;
    public Object f18009b;
    public Object f18010c;

    public c(int i10, Object obj, Object obj2) {
        this.f18008a = i10;
        this.f18009b = obj;
        this.f18010c = obj2;
    }

    public void A(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f18010c;
        if (bVar.d.f30c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.m mVar = bVar.d;
                if (i10 < mVar.f30c) {
                    w1.a aVar = (w1.a) mVar.f29b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f28a[i10]);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(aVar.f50645l);
                    b6.d dVar = aVar.f50645l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f3657a);
                    if (dVar.f3658b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f3658b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f3659c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f3659c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f3661g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f3661g);
                        printWriter.print(" waiting=");
                        dVar.f3661g.getClass();
                        printWriter.println(false);
                    }
                    if (dVar.h != null) {
                        printWriter.print(str3);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(dVar.h);
                        printWriter.print(" waiting=");
                        dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (aVar.f50647n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f50647n);
                        b2.u uVar = aVar.f50647n;
                        uVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(uVar.f3463b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    b6.d dVar2 = aVar.f50645l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f2830k) {
                        obj = obj2;
                    }
                    dVar2.getClass();
                    StringBuilder sb2 = new StringBuilder(64);
                    if (obj == null) {
                        sb2.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb2.append(cls.getSimpleName());
                        sb2.append("{");
                        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb2.append("}");
                    }
                    printWriter.println(sb2.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (aVar.f2833c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    printWriter.println(z10);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public byte[] B(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f18010c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f18009b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f18649a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f18650b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f18651c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public c3.j0 B0(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f18009b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((u2.c1[]) this.f18010c)[i11];
                }
                i11++;
            } else {
                e2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public boolean C0(long j10) {
        return ((i11) this.f18010c).v;
    }

    @Override
    public boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        rh.i iVar = (rh.i) this.f18010c;
        iVar.f47618c.a(f7);
        iVar.d.a(f7);
        iVar.f47617b.a(f7);
        ((Runnable) this.f18009b).run();
    }

    @Override
    public cv0 E1() {
        return null;
    }

    public com.google.android.datatransport.cct.CctBackendFactory G(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.G(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public boolean G1(long j10) {
        return ((i11) this.f18010c).f29146s;
    }

    @Override
    public k9.y H(byte[] bArr) {
        byte[] bArr2;
        k6.c cVar = (k6.c) this.f18010c;
        if (cVar != null && (bArr2 = (byte[]) cVar.f16406b) != null && Arrays.equals(bArr2, bArr)) {
            k9.y yVar = (k9.y) ((k6.c) this.f18010c).d;
            yVar.getClass();
            return yVar;
        }
        k9.y H = ((e2.d) this.f18009b).H(bArr);
        this.f18010c = new k6.c(bArr, H);
        return H;
    }

    @Override
    public boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean M() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public File R() {
        if (((File) this.f18009b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f18009b) == null) {
                        m9.h hVar = (m9.h) this.f18010c;
                        hVar.a();
                        File filesDir = hVar.f18380a.getFilesDir();
                        this.f18009b = new File(filesDir, "PersistedInstallation." + ((m9.h) this.f18010c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f18009b;
    }

    @Override
    public int S() {
        return 0;
    }

    @Override
    public boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    @Override
    public Object S1(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f18009b).S1(uri, kVar);
        List list = (List) this.f18010c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    public String T(String str) {
        Resources resources = (Resources) this.f18009b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f18010c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public void U(float f7, boolean z10) {
        l5.f41136c = f7;
        ((TextView) this.f18009b).setText("Saturation " + (f7 * 5.0f));
        vw0 vw0Var = ((l5) this.f18010c).f41137b;
        vw0Var.M();
        vw0Var.L();
    }

    @Override
    public jh.a V() {
        return null;
    }

    @Override
    public boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override
    public boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean X1(int i10) {
        return false;
    }

    public void Y(ta.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f48755a);
            jSONObject.put("Status", m1.j.c(aVar.f48756b));
            jSONObject.put("AuthToken", aVar.f48757c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f48758f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f48759g);
            m9.h hVar = (m9.h) this.f18010c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f18380a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(R())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void a(s4.e1 e1Var, b2.v0 v0Var) {
        a0.f fVar = (a0.f) this.f18009b;
        s4.k1 k1Var = (s4.k1) fVar.get(e1Var);
        if (k1Var == null) {
            k1Var = s4.k1.a();
            fVar.put(e1Var, k1Var);
        }
        k1Var.f47783c = v0Var;
        k1Var.f47781a |= 8;
    }

    @Override
    public boolean a0() {
        return false;
    }

    public void b() {
        String str = (String) this.f18009b;
        try {
            da.c cVar = (da.c) this.f18010c;
            cVar.getClass();
            new File(cVar.f8274b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override
    public t9 b2() {
        return null;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        cy cyVar = (cy) this.f18010c;
        if (view instanceof p2) {
            p2 p2Var = (p2) view;
            if (p2Var.f24692n2) {
                cyVar.V4(p2Var.getDialogId(), view);
                return true;
            }
        }
        qx qxVar = cyVar.f38690z0;
        if (qxVar != null && qxVar.getVisibility() == 0 && cyVar.f38690z0.f32375n) {
            return false;
        }
        return cyVar.w4(view, i10, f7, ((ay) this.f18009b).d);
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public eh.d f() {
        return new eh.f(this);
    }

    public boolean f0() {
        m5 m5Var = (m5) this.f18010c;
        if (m5Var.I0 <= 0.0f && !m5Var.w0()) {
            return false;
        }
        return true;
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((cy) this.f18010c).finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override
    public boolean h0(c6 c6Var) {
        return false;
    }

    public void i0(Exception exc, boolean z10) {
        int i10;
        this.f18010c = null;
        HashSet hashSet = (HashSet) this.f18009b;
        f9.i0 u10 = f9.i0.u(hashSet);
        hashSet.clear();
        f9.g0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.l(i10, exc);
        }
    }

    public ArrayList k() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f18009b;
        Class cls = ((hb.e) this.f18010c).f12731a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new s9.c(str2, 0));
        }
        return arrayList2;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public boolean k1() {
        return false;
    }

    public b2.v0 l0(s4.e1 e1Var, int i10) {
        s4.k1 k1Var;
        b2.v0 v0Var;
        a0.f fVar = (a0.f) this.f18009b;
        int c10 = fVar.c(e1Var);
        if (c10 >= 0 && (k1Var = (s4.k1) fVar.h(c10)) != null) {
            int i11 = k1Var.f47781a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                k1Var.f47781a = i12;
                if (i10 == 4) {
                    v0Var = k1Var.f47782b;
                } else if (i10 == 8) {
                    v0Var = k1Var.f47783c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    k1Var.f47781a = 0;
                    k1Var.f47782b = null;
                    k1Var.f47783c = null;
                    s4.k1.d.r(k1Var);
                }
                return v0Var;
            }
        }
        return null;
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((cy) this.f18010c).movePreviewFragment(f7);
        }
    }

    public void p0(n2.b bVar) {
        ((HashSet) this.f18009b).add(bVar);
        if (((n2.b) this.f18010c) != null) {
            return;
        }
        this.f18010c = bVar;
        n2.p k10 = bVar.f18585b.k();
        bVar.f18605z = k10;
        android.support.v4.media.session.f fVar = bVar.f18599s;
        String str = e2.n0.f9692a;
        k10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.f49432g.getAndIncrement(), true, SystemClock.elapsedRealtime(), k10)).sendToTarget();
    }

    @Override
    public boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public k9.y t(b2.s0 s0Var) {
        Uri uri;
        byte[] bArr;
        k6.c cVar = (k6.c) this.f18010c;
        if (cVar != null && (((uri = (Uri) cVar.f16407c) != null && uri.equals(s0Var.f3420n)) || ((bArr = (byte[]) cVar.f16406b) != null && Arrays.equals(bArr, s0Var.f3417k)))) {
            k9.y yVar = (k9.y) ((k6.c) this.f18010c).d;
            yVar.getClass();
            return yVar;
        }
        k9.y t10 = ((e2.d) this.f18009b).t(s0Var);
        if (t10 == null) {
            return null;
        }
        this.f18010c = new k6.c(s0Var, t10);
        return t10;
    }

    @Override
    public Task then(Object obj) {
        fa.a aVar = (fa.a) obj;
        u4.f fVar = (u4.f) this.f18010c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        y9.l lVar = (y9.l) fVar.f49583c;
        y9.n.b((y9.n) ((y9.l) fVar.f49583c).f52435b);
        ((y9.n) lVar.f52435b).f52448m.v((Executor) this.f18009b, null);
        ((y9.n) lVar.f52435b).f52452q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f18008a) {
            case 24:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f18009b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public String u(long j10) {
        String trim = ((EditTextBoldCursor) this.f18009b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((i11) this.f18010c).f29146s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public ta.a v0() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(R());
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
                return new ta.a(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    @Override
    public void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public void w(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f18009b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f18010c;
        tg.a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f35873h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(y6.f23297a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f35868d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f35865b0, 0, premiumPreviewFragment.f35868d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f35868d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f48794f);
    }

    @Override
    public CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    public void x0(s4.e1 e1Var) {
        s4.k1 k1Var = (s4.k1) ((a0.f) this.f18009b).get(e1Var);
        if (k1Var == null) {
            return;
        }
        k1Var.f47781a &= -2;
    }

    @Override
    public boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void z(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.c.z(float, int):void");
    }

    public void z0(s4.e1 e1Var) {
        a0.f fVar = (a0.f) this.f18009b;
        a0.h hVar = (a0.h) this.f18010c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (e1Var == hVar.n(m10)) {
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
        s4.k1 k1Var = (s4.k1) fVar.get(e1Var);
        if (k1Var != null) {
            fVar.remove(e1Var);
            k1Var.f47781a = 0;
            k1Var.f47782b = null;
            k1Var.f47783c = null;
            s4.k1.d.r(k1Var);
        }
    }

    public c(int i10, boolean z10) {
        this.f18008a = i10;
    }

    public c(Context context, int i10) {
        this.f18008a = i10;
        this.f18010c = null;
        this.f18009b = context;
    }

    public c(Object obj, int i10) {
        this.f18008a = i10;
        this.f18009b = obj;
    }

    public c(Object obj, Object obj2, boolean z10, int i10) {
        this.f18008a = i10;
        this.f18010c = obj;
        this.f18009b = obj2;
    }

    public c(Context context) {
        this.f18008a = 5;
        o6.l.h(context);
        Resources resources = context.getResources();
        this.f18009b = resources;
        this.f18010c = resources.getResourcePackageName(2131689566);
    }

    public c(s4.d dVar) {
        this.f18008a = 26;
        this.f18010c = new Object();
        this.f18009b = dVar;
        qa.b();
    }

    public c(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f18008a = 24;
        this.f18009b = tVar;
        this.f18010c = (w1.b) new a8.h0(t0Var, w1.b.f50648f).m(w1.b.class);
    }

    public c(m9.h hVar) {
        this.f18008a = 21;
        this.f18010c = hVar;
    }

    public c(EditText editText) {
        this.f18008a = 15;
        this.f18009b = editText;
        q1.i iVar = new q1.i(editText);
        this.f18010c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f46894b == null) {
            synchronized (q1.a.f46893a) {
                try {
                    if (q1.a.f46894b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f46895c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f46894b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f46894b);
    }

    @Override
    public void U0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n() {
    }

    @Override
    public void q() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void y() {
    }

    @Override
    public void z1() {
    }

    @Override
    public void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K(MessageObject messageObject) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void Z(int i10) {
    }

    @Override
    public void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void g0(String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void u1(MessageObject messageObject) {
    }

    @Override
    public void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    public c(PremiumPreviewFragment premiumPreviewFragment) {
        this.f18008a = 13;
        this.f18010c = premiumPreviewFragment;
        this.f18009b = new Paint();
    }

    public c(int i10) {
        this.f18008a = i10;
        switch (i10) {
            case 2:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f18009b = byteArrayOutputStream;
                this.f18010c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 18:
                this.f18009b = new a0.l(0);
                this.f18010c = new a0.h();
                return;
            default:
                this.f18009b = new HashSet();
                return;
        }
    }

    @Override
    public void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override
    public void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override
    public void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
