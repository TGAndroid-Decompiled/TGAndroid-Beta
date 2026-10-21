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
import androidx.lifecycle.t0;
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
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.x01;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.aw;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.n5;
import org.telegram.ui.vu0;
import qg.k0;
import s4.b1;
import s4.i1;
import sg.a1;
import u2.d1;
import w7.pa;
public final class e implements cp0, l1, am0, gh.a, p2.u, ne.d, com.google.android.gms.common.api.internal.r, SuccessContinuation {
    public final int f17038a;
    public Object f17039b;
    public Object f17040c;

    public e(int i10, Object obj, Object obj2) {
        this.f17038a = i10;
        this.f17039b = obj;
        this.f17040c = obj2;
    }

    public static n2.e a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.a(android.content.Context):n2.e");
    }

    @Override
    public boolean B1() {
        return false;
    }

    public String C(String str) {
        Resources resources = (Resources) this.f17039b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f17040c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void E(sa.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f46153a);
            jSONObject.put("Status", m1.j.c(aVar.f46154b));
            jSONObject.put("AuthToken", aVar.f46155c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f46156f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f46157g);
            l9.h hVar = (l9.h) this.f17040c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f15967a.getFilesDir());
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
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override
    public void H(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n2.e.H(float, int):void");
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        return null;
    }

    @Override
    public y2.n J() {
        return new mi.q(22, ((p2.u) this.f17039b).J(), (List) this.f17040c);
    }

    @Override
    public boolean J0(long j10) {
        return ((x01) this.f17040c).v;
    }

    @Override
    public boolean J1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void L(float f7, boolean z10) {
        n5.f39412c = f7;
        ((TextView) this.f17039b).setText("Saturation " + (f7 * 5.0f));
        lw0 lw0Var = ((n5) this.f17040c).f39413b;
        lw0Var.N();
        lw0Var.M();
    }

    @Override
    public boolean N(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public boolean O() {
        o5 o5Var = (o5) this.f17040c;
        if (o5Var.H0 <= 0.0f && !o5Var.v0()) {
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
    public vu0 P1() {
        return null;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q1(long j10) {
        return ((x01) this.f17040c).f32295s;
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
        return new mi.q(22, ((p2.u) this.f17039b).U(qVar, nVar), (List) this.f17040c);
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
        this.f17040c = null;
        HashSet hashSet = (HashSet) this.f17039b;
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
        androidx.biometric.o oVar = (androidx.biometric.o) this.f17040c;
        a6.i iVar = (a6.i) this.f17039b;
        int i10 = fVar.f17522b;
        if (i10 == 0) {
            oVar.execute(new j9.u(20, iVar, fVar.f17521a));
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
        a0.f fVar = (a0.f) this.f17039b;
        int c10 = fVar.c(b1Var);
        if (c10 >= 0 && (i1Var = (i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f45974a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f45974a = i12;
                if (i10 == 4) {
                    u0Var = i1Var.f45975b;
                } else if (i10 == 8) {
                    u0Var = i1Var.f45976c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f45974a = 0;
                    i1Var.f45975b = null;
                    i1Var.f45976c = null;
                    i1.d.w(i1Var);
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
        cy cyVar = (cy) this.f17040c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.f22870n2) {
                cyVar.L4(r2Var.getDialogId(), view);
                return true;
            }
        }
        aw awVar = cyVar.f36198z0;
        if (awVar != null && awVar.getVisibility() == 0 && cyVar.f36198z0.f30081n) {
            return false;
        }
        return cyVar.m4(view, i10, f7, ((ay) this.f17039b).d);
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return c1.a(messageObject);
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
        ((HashSet) this.f17039b).add(bVar);
        if (((b) this.f17040c) != null) {
            return;
        }
        this.f17040c = bVar;
        q o10 = bVar.f17014b.o();
        bVar.f17034z = o10;
        android.support.v4.media.session.f fVar = bVar.f17028s;
        String str = m0.f8252a;
        o10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new a(u2.u.f47440g.getAndIncrement(), true, SystemClock.elapsedRealtime(), o10)).sendToTarget();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((cy) this.f17040c).finishPreviewFragment();
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
        a0.f fVar = (a0.f) this.f17039b;
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var == null) {
            i1Var = i1.a();
            fVar.put(b1Var, i1Var);
        }
        i1Var.f45976c = u0Var;
        i1Var.f45974a |= 8;
    }

    public void k0() {
        try {
            ((FileLock) this.f17040c).release();
            ((FileChannel) this.f17039b).close();
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
        i1 i1Var = (i1) ((a0.f) this.f17039b).get(b1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f45974a &= -2;
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((cy) this.f17040c).movePreviewFragment(f7);
        }
    }

    @Override
    public boolean o0(a6 a6Var) {
        return false;
    }

    public void p0(b1 b1Var) {
        a0.f fVar = (a0.f) this.f17039b;
        a0.h hVar = (a0.h) this.f17040c;
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
            i1Var.f45974a = 0;
            i1Var.f45975b = null;
            i1Var.f45976c = null;
            i1.d.w(i1Var);
        }
    }

    @Override
    public o9 p2() {
        return null;
    }

    @Override
    public void r(int i10, float f7, float f10, ne.e eVar) {
        qh.i iVar = (qh.i) this.f17040c;
        iVar.f44738c.a(f7);
        iVar.d.a(f7);
        iVar.f44737b.a(f7);
        ((Runnable) this.f17039b).run();
    }

    public j0 r0(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f17039b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((d1[]) this.f17040c)[i11];
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
        switch (this.f17038a) {
            case 26:
                ea.a aVar = (ea.a) obj;
                x9.m mVar = ((x9.k) this.f17040c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(x9.m.b(mVar), mVar.f49704m.D((Executor) this.f17039b, null));
            default:
                return ((x9.m) this.f17040c).e.w(new u4.f(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f17038a) {
            case 22:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f17039b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f17040c;
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
                    printWriter.println(aVar.f48460l);
                    a6.d dVar = aVar.f48460l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f294a);
                    if (dVar.f295b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f295b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f296c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f296c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f298g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f298g);
                        printWriter.print(" waiting=");
                        dVar.f298g.getClass();
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
                    if (aVar.f48462n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f48462n);
                        b2.t tVar = aVar.f48462n;
                        tVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(tVar.f4005b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f48460l;
                    Object obj2 = aVar.e;
                    if (obj2 != z.f3379k) {
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
                    if (aVar.f3382c > 0) {
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

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        String trim = ((EditTextBoldCursor) this.f17039b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((x01) this.f17040c).f32295s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    public byte[] x(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f17040c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f17039b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f17081a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f17082b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f17083c);
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
        Paint paint = (Paint) this.f17039b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f17040c;
        a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f33509h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(h6.f20932a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f33504d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33501b0, 0, premiumPreviewFragment.f33504d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f33504d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f46191f);
    }

    public File z() {
        if (((File) this.f17039b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f17039b) == null) {
                        l9.h hVar = (l9.h) this.f17040c;
                        hVar.a();
                        File filesDir = hVar.f15967a.getFilesDir();
                        this.f17039b = new File(filesDir, "PersistedInstallation." + ((l9.h) this.f17040c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f17039b;
    }

    @Override
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public e(int i10, boolean z10) {
        this.f17038a = i10;
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f17038a = i10;
        this.f17040c = obj;
        this.f17039b = obj2;
    }

    public e(Context context) {
        this.f17038a = 2;
        n6.l.h(context);
        Resources resources = context.getResources();
        this.f17039b = resources;
        this.f17040c = resources.getResourcePackageName(2131689566);
    }

    public e(u2.c cVar) {
        this.f17038a = 23;
        this.f17040c = new Object();
        this.f17039b = cVar;
        pa.b();
    }

    public e(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f17038a = 22;
        this.f17039b = tVar;
        this.f17040c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f48463f).j(w1.b.class);
    }

    public e(k0 k0Var) {
        this.f17038a = 14;
        this.f17039b = k0Var;
    }

    public e(l9.h hVar) {
        this.f17038a = 19;
        this.f17040c = hVar;
    }

    public e(x9.k kVar, Executor executor, String str) {
        this.f17038a = 26;
        this.f17040c = kVar;
        this.f17039b = executor;
    }

    public e(PremiumPreviewFragment premiumPreviewFragment) {
        this.f17038a = 11;
        this.f17040c = premiumPreviewFragment;
        this.f17039b = new Paint();
    }

    public e(int i10) {
        this.f17038a = i10;
        switch (i10) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f17039b = byteArrayOutputStream;
                this.f17040c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 18:
                this.f17039b = new a0.l(0);
                this.f17040c = new a0.h();
                return;
            case 28:
                this.f17039b = new AtomicInteger();
                this.f17040c = new AtomicInteger();
                return;
            default:
                this.f17039b = new HashSet();
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
