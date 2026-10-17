package n2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.z;
import b2.u0;
import c3.j0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.m0;
import e9.l0;
import e9.n0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.l5;
import org.telegram.ui.cw;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.n5;
import org.telegram.ui.xu0;
import s4.b1;
import s4.i1;
import sg.z0;
import u2.c1;
import w7.pa;
public final class e implements bp0, l1, zl0, gh.a, p2.u, ne.d, com.google.android.gms.common.api.internal.r, SuccessContinuation {
    public final int f17034a;
    public Object f17035b;
    public Object f17036c;

    public e(int i10, Object obj, Object obj2) {
        this.f17034a = i10;
        this.f17035b = obj;
        this.f17036c = obj2;
    }

    public static n2.e a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.a(android.content.Context):n2.e");
    }

    @Override
    public boolean B1() {
        return false;
    }

    public String C(String str) {
        Resources resources = (Resources) this.f17035b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f17036c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public void E(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.E(float, int):void");
    }

    @Override
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    public void H(sa.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f46174a);
            jSONObject.put("Status", m1.j.c(aVar.f46175b));
            jSONObject.put("AuthToken", aVar.f46176c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f46177f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f46178g);
            l9.h hVar = (l9.h) this.f17036c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f15961a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(z())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        return null;
    }

    @Override
    public y2.n J() {
        return new mi.q(22, ((p2.u) this.f17035b).J(), (List) this.f17036c);
    }

    @Override
    public boolean J0(long j10) {
        return ((v01) this.f17036c).v;
    }

    @Override
    public boolean J1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void L(float f7, boolean z10) {
        n5.f39310c = f7;
        ((TextView) this.f17035b).setText("Saturation " + (f7 * 5.0f));
        jw0 jw0Var = ((n5) this.f17036c).f39311b;
        jw0Var.N();
        jw0Var.M();
    }

    @Override
    public boolean N(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public boolean O() {
        l5 l5Var = (l5) this.f17036c;
        if (l5Var.J0 <= 0.0f && !l5Var.v0()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public xu0 P1() {
        return null;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q1(long j10) {
        return ((v01) this.f17036c).f31133s;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public y2.n U(p2.q qVar, p2.n nVar) {
        return new mi.q(22, ((p2.u) this.f17035b).U(qVar, nVar), (List) this.f17036c);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public ih.a W() {
        return null;
    }

    public void X(Exception exc, boolean z10) {
        int i10;
        this.f17036c = null;
        HashSet hashSet = (HashSet) this.f17035b;
        n0 u10 = n0.u(hashSet);
        hashSet.clear();
        l0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            b bVar = (b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.l(i10, exc);
        }
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public boolean Z(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, u1 u1Var) {
        return false;
    }

    public void a0(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f17036c;
        a6.i iVar = (a6.i) this.f17035b;
        int i10 = fVar.f17518b;
        if (i10 == 0) {
            oVar.execute(new j9.u(20, iVar, fVar.f17517a));
        } else {
            oVar.execute(new androidx.activity.i(iVar, i10));
        }
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.accept(java.lang.Object, java.lang.Object):void");
    }

    public u0 b0(b1 b1Var, int i10) {
        i1 i1Var;
        u0 u0Var;
        a0.f fVar = (a0.f) this.f17035b;
        int c10 = fVar.c(b1Var);
        if (c10 >= 0 && (i1Var = (i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f45995a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f45995a = i12;
                if (i10 == 4) {
                    u0Var = i1Var.f45996b;
                } else if (i10 == 8) {
                    u0Var = i1Var.f45997c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f45995a = 0;
                    i1Var.f45996b = null;
                    i1Var.f45997c = null;
                    i1.d.t(i1Var);
                }
                return u0Var;
            }
        }
        return null;
    }

    @Override
    public boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        ey eyVar = (ey) this.f17036c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.f22869n2) {
                eyVar.L4(r2Var.getDialogId(), view);
                return true;
            }
        }
        cw cwVar = eyVar.f36736z0;
        if (cwVar != null && cwVar.getVisibility() == 0 && eyVar.f36736z0.f30107n) {
            return false;
        }
        return eyVar.m4(view, i10, f7, ((dy) this.f17035b).d);
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return t0.a(messageObject);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public dh.d f() {
        return new dh.f(this);
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    public void g0(b bVar) {
        ((HashSet) this.f17035b).add(bVar);
        if (((b) this.f17036c) != null) {
            return;
        }
        this.f17036c = bVar;
        q o10 = bVar.f17010b.o();
        bVar.f17030z = o10;
        android.support.v4.media.session.f fVar = bVar.f17024s;
        String str = m0.f8254a;
        o10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new a(u2.u.f47460g.getAndIncrement(), true, SystemClock.elapsedRealtime(), o10)).sendToTarget();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ey) this.f17036c).finishPreviewFragment();
        }
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    public sa.a j0() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(z());
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

    public void k(b1 b1Var, u0 u0Var) {
        a0.f fVar = (a0.f) this.f17035b;
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var == null) {
            i1Var = i1.a();
            fVar.put(b1Var, i1Var);
        }
        i1Var.f45997c = u0Var;
        i1Var.f45995a |= 8;
    }

    public void k0() {
        try {
            ((FileLock) this.f17036c).release();
            ((FileChannel) this.f17035b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(int i10) {
        return false;
    }

    public void m0(b1 b1Var) {
        i1 i1Var = (i1) ((a0.f) this.f17035b).get(b1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f45995a &= -2;
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ey) this.f17036c).movePreviewFragment(f7);
        }
    }

    @Override
    public boolean o0(a6 a6Var) {
        return false;
    }

    public void p0(b1 b1Var) {
        a0.f fVar = (a0.f) this.f17035b;
        a0.h hVar = (a0.h) this.f17036c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (b1Var == hVar.n(m10)) {
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
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var != null) {
            fVar.remove(b1Var);
            i1Var.f45995a = 0;
            i1Var.f45996b = null;
            i1Var.f45997c = null;
            i1.d.t(i1Var);
        }
    }

    @Override
    public o9 p2() {
        return null;
    }

    public void r(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f17036c;
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
                    printWriter.println(aVar.f48475l);
                    a6.d dVar = aVar.f48475l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f293a);
                    if (dVar.f294b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f294b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f295c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f295c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f297g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f297g);
                        printWriter.print(" waiting=");
                        dVar.f297g.getClass();
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
                    if (aVar.f48477n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f48477n);
                        b2.t tVar = aVar.f48477n;
                        tVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(tVar.f4008b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f48475l;
                    Object obj2 = aVar.e;
                    if (obj2 != z.f3382k) {
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
                    if (aVar.f3385c > 0) {
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

    public j0 r0(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f17035b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((c1[]) this.f17036c)[i11];
                }
                i11++;
            } else {
                e2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public Task then(Object obj) {
        switch (this.f17034a) {
            case 26:
                ea.a aVar = (ea.a) obj;
                x9.m mVar = ((x9.k) this.f17036c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(x9.m.b(mVar), mVar.f49720m.D((Executor) this.f17035b, null));
            default:
                return ((x9.m) this.f17036c).e.w(new u4.f(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f17034a) {
            case 22:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f17035b).getClass();
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
    public void u(int i10, float f7, float f10, ne.e eVar) {
        qh.i iVar = (qh.i) this.f17036c;
        iVar.f44755c.a(f7);
        iVar.d.a(f7);
        iVar.f44754b.a(f7);
        ((Runnable) this.f17035b).run();
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        String trim = ((EditTextBoldCursor) this.f17035b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((v01) this.f17036c).f31133s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    public byte[] x(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f17036c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17035b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f17077a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f17078b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f17079c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f17035b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f17036c;
        z0 z0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f33496h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(h6.f20928a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        z0Var.d(0, (-premiumPreviewFragment.f33491d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33488b0, 0, premiumPreviewFragment.f33491d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f33491d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, z0Var.f46524f);
    }

    public File z() {
        if (((File) this.f17035b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f17035b) == null) {
                        l9.h hVar = (l9.h) this.f17036c;
                        hVar.a();
                        File filesDir = hVar.f15961a.getFilesDir();
                        this.f17035b = new File(filesDir, "PersistedInstallation." + ((l9.h) this.f17036c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f17035b;
    }

    @Override
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public e(int i10, boolean z10) {
        this.f17034a = i10;
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f17034a = i10;
        this.f17036c = obj;
        this.f17035b = obj2;
    }

    public e(Context context) {
        this.f17034a = 2;
        n6.l.h(context);
        Resources resources = context.getResources();
        this.f17035b = resources;
        this.f17036c = resources.getResourcePackageName(2131689566);
    }

    public e(u2.c cVar) {
        this.f17034a = 23;
        this.f17036c = new Object();
        this.f17035b = cVar;
        pa.b();
    }

    public e(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f17034a = 22;
        this.f17035b = tVar;
        this.f17036c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f48478f).m(w1.b.class);
    }

    public e(qg.j0 j0Var) {
        this.f17034a = 14;
        this.f17035b = j0Var;
    }

    public e(l9.h hVar) {
        this.f17034a = 19;
        this.f17036c = hVar;
    }

    public e(x9.k kVar, Executor executor, String str) {
        this.f17034a = 26;
        this.f17036c = kVar;
        this.f17035b = executor;
    }

    public e(PremiumPreviewFragment premiumPreviewFragment) {
        this.f17034a = 11;
        this.f17036c = premiumPreviewFragment;
        this.f17035b = new Paint();
    }

    public e(int i10) {
        this.f17034a = i10;
        switch (i10) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f17035b = byteArrayOutputStream;
                this.f17036c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 18:
                this.f17035b = new a0.l(0);
                this.f17036c = new a0.h();
                return;
            case 28:
                this.f17035b = new AtomicInteger();
                this.f17036c = new AtomicInteger();
                return;
            default:
                this.f17035b = new HashSet();
                return;
        }
    }

    @Override
    public void L1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void v() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void C0(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(u1 u1Var) {
    }

    @Override
    public void K0(u1 u1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void T0(u1 u1Var) {
    }

    @Override
    public void U1(u1 u1Var) {
    }

    @Override
    public void V0(u1 u1Var) {
    }

    @Override
    public void c2(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void m(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(u1 u1Var) {
    }

    @Override
    public void s(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void w1(u1 u1Var) {
    }

    @Override
    public void x0(u1 u1Var) {
    }

    @Override
    public void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K(int i10, u1 u1Var) {
    }

    @Override
    public void K1(u1 u1Var, ah.t tVar) {
    }

    @Override
    public void M0(int i10, u1 u1Var) {
    }

    @Override
    public void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W1(u1 u1Var, long j10) {
    }

    @Override
    public void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void o2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void p1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
