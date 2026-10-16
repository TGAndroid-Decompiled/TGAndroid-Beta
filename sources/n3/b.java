package n3;

import a6.i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.z;
import b2.v0;
import c3.i0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j9.u;
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
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l9.h;
import m1.j;
import n6.l;
import ne.d;
import ne.e;
import o0.f;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.d51;
import org.telegram.ui.i11;
import org.telegram.ui.m5;
import org.telegram.ui.n4;
import org.telegram.ui.vv0;
import org.telegram.ui.ww;
import org.telegram.ui.xy;
import org.telegram.ui.yy;
import p2.m;
import p2.p;
import p2.t;
import qg.h0;
import s4.b1;
import s4.i1;
import sg.a1;
import u2.c;
import w7.pa;
import x9.k;
import y2.n;
public final class b implements fp0, l1, dm0, gh.a, f81, t, d, s, SuccessContinuation {
    public final int f15702a;
    public Object f15703b;
    public Object f15704c;

    public b(int i10, Object obj, Object obj2) {
        this.f15702a = i10;
        this.f15703b = obj;
        this.f15704c = obj2;
    }

    public static n3.b a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n3.b.a(android.content.Context):n3.b");
    }

    @Override
    public void A(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n3.b.A(float, int):void");
    }

    @Override
    public boolean A1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean C1() {
        return false;
    }

    public String D(String str) {
        Resources resources = (Resources) this.f15703b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f15704c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void F(sa.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f45077a);
            jSONObject.put("Status", j.c(aVar.f45078b));
            jSONObject.put("AuthToken", aVar.f45079c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f45080f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f45081g);
            h hVar = (h) this.f15704c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f14626a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(y())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void H(f fVar) {
        o oVar = (o) this.f15704c;
        i iVar = (i) this.f15703b;
        int i10 = fVar.f16124b;
        if (i10 == 0) {
            oVar.execute(new u(20, iVar, fVar.f16123a));
        } else {
            oVar.execute(new androidx.activity.i(iVar, i10));
        }
    }

    public v0 J(b1 b1Var, int i10) {
        i1 i1Var;
        v0 v0Var;
        a0.f fVar = (a0.f) this.f15703b;
        int c10 = fVar.c(b1Var);
        if (c10 >= 0 && (i1Var = (i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f44895a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f44895a = i12;
                if (i10 == 4) {
                    v0Var = i1Var.f44896b;
                } else if (i10 == 8) {
                    v0Var = i1Var.f44897c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f44895a = 0;
                    i1Var.f44896b = null;
                    i1Var.f44897c = null;
                    i1.d.q(i1Var);
                }
                return v0Var;
            }
        }
        return null;
    }

    @Override
    public void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    public sa.a K() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(y());
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
        int i10 = j.d(5)[optInt];
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

    @Override
    public boolean K0(long j10) {
        return ((a11) this.f15704c).v;
    }

    @Override
    public CharacterStyle K1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean M1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public vv0 S1() {
        return null;
    }

    @Override
    public boolean T0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean T1(long j10) {
        return ((a11) this.f15704c).f23099s;
    }

    @Override
    public n U() {
        return new m2.t(24, ((t) this.f15703b).U(), (List) this.f15704c);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    public void W() {
        try {
            ((FileLock) this.f15704c).release();
            ((FileChannel) this.f15703b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        m5.f37909c = f7;
        ((TextView) this.f15703b).setText("Saturation " + (f7 * 5.0f));
        ow0 ow0Var = ((m5) this.f15704c).f37910b;
        ow0Var.N();
        ow0Var.M();
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public boolean Z(u1 u1Var) {
        return false;
    }

    public void a0(b1 b1Var) {
        i1 i1Var = (i1) ((a0.f) this.f15703b).get(b1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f44895a &= -2;
    }

    @Override
    public boolean a1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: n3.b.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public n b0(p pVar, m mVar) {
        return new m2.t(24, ((t) this.f15703b).b0(pVar, mVar), (List) this.f15704c);
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
        yy yyVar = (yy) this.f15704c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f21565n2) {
                yyVar.L4(s2Var.getDialogId(), view);
                return true;
            }
        }
        ww wwVar = yyVar.f42110z0;
        if (wwVar != null && wwVar.getVisibility() == 0 && yyVar.f42110z0.f30377n) {
            return false;
        }
        return yyVar.m4(view, i10, f7, ((xy) this.f15703b).d);
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
    public boolean e1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock) {
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

    public void g0(b1 b1Var) {
        a0.f fVar = (a0.f) this.f15703b;
        a0.h hVar = (a0.h) this.f15704c;
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
            i1Var.f44895a = 0;
            i1Var.f44896b = null;
            i1Var.f44897c = null;
            i1.d.q(i1Var);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((yy) this.f15704c).finishPreviewFragment();
        }
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    public i0 j0(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f15703b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((u2.c1[]) this.f15704c)[i11];
                }
                i11++;
            } else {
                e2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    public void k(b1 b1Var, v0 v0Var) {
        a0.f fVar = (a0.f) this.f15703b;
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var == null) {
            i1Var = i1.a();
            fVar.put(b1Var, i1Var);
        }
        i1Var.f44897c = v0Var;
        i1Var.f44895a |= 8;
    }

    @Override
    public int k0() {
        return 0;
    }

    public void l(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f15704c;
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
                    printWriter.println(aVar.f47068l);
                    a6.d dVar = aVar.f47068l;
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
                    if (aVar.f47070n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f47070n);
                        b2.u uVar = aVar.f47070n;
                        uVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(uVar.f2400b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f47068l;
                    Object obj2 = aVar.e;
                    if (obj2 != z.f1769k) {
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
                    if (aVar.f1772c > 0) {
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
    public boolean l0() {
        return false;
    }

    @Override
    public boolean o0(b6 b6Var) {
        return false;
    }

    @Override
    public void onError(i81 i81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15704c;
        int i10 = secretMediaViewer.f32433b0;
        if (i10 > 0) {
            secretMediaViewer.f32433b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new i11(12, this, (File) this.f15703b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15704c;
        d51 d51Var = secretMediaViewer.f32450i1;
        if (secretMediaViewer.f32483y != null && secretMediaViewer.f32447h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(d51Var);
            AndroidUtilities.runOnUIThread(d51Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f32432b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f32432b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f32478w.getVisibility() != 0) {
                secretMediaViewer.f32478w.setVisibility(0);
            }
            if (secretMediaViewer.f32483y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f32465q1);
                        return;
                    }
                    secretMediaViewer.f32483y.L(0L, false);
                    secretMediaViewer.f32483y.C();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        n4 n4Var = ((SecretMediaViewer) this.f15704c).f32478w;
        if (n4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            n4Var.a(f10, 0);
        }
    }

    @Override
    public void p(int i10, float f7, float f10, e eVar) {
        qh.i iVar = (qh.i) this.f15704c;
        iVar.f43382c.a(f7);
        iVar.d.a(f7);
        iVar.f43381b.a(f7);
        ((Runnable) this.f15703b).run();
    }

    @Override
    public boolean p2(int i10) {
        return false;
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((yy) this.f15704c).movePreviewFragment(f7);
        }
    }

    @Override
    public p9 t2() {
        return null;
    }

    @Override
    public Task then(Object obj) {
        switch (this.f15702a) {
            case 25:
                ea.a aVar = (ea.a) obj;
                x9.n nVar = ((k) this.f15704c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(x9.n.b(nVar), nVar.f48313m.y((Executor) this.f15703b, null));
            default:
                return ((x9.n) this.f15704c).e.w(new u4.f(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f15702a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f15703b).getClass();
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
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f15703b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f15704c;
        a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f32158h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(g6.f19543a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f32153d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f32150b0, 0, premiumPreviewFragment.f32153d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f32153d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f45117f);
    }

    public byte[] w(a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f15704c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f15703b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f15698a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f15699b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f15700c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public String x(long j10) {
        String trim = ((EditTextBoldCursor) this.f15703b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((a11) this.f15704c).f23099s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    public File y() {
        if (((File) this.f15703b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f15703b) == null) {
                        h hVar = (h) this.f15704c;
                        hVar.a();
                        File filesDir = hVar.f14626a.getFilesDir();
                        this.f15703b = new File(filesDir, "PersistedInstallation." + ((h) this.f15704c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f15703b;
    }

    public b(int i10, boolean z10) {
        this.f15702a = i10;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f15704c;
        if (secretMediaViewer.f32436c0) {
            return;
        }
        secretMediaViewer.f32436c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f15702a = i10;
        this.f15704c = obj;
        this.f15703b = obj2;
    }

    public b(Context context) {
        this.f15702a = 1;
        l.h(context);
        Resources resources = context.getResources();
        this.f15703b = resources;
        this.f15704c = resources.getResourcePackageName(2131689566);
    }

    public b(c cVar) {
        this.f15702a = 22;
        this.f15704c = new Object();
        this.f15703b = cVar;
        pa.b();
    }

    public b(int i10) {
        this.f15702a = i10;
        switch (i10) {
            case 17:
                this.f15703b = new a0.l(0);
                this.f15704c = new a0.h();
                return;
            case 27:
                this.f15703b = new AtomicInteger();
                this.f15704c = new AtomicInteger();
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f15703b = byteArrayOutputStream;
                this.f15704c = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    public b(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f15702a = 21;
        this.f15703b = tVar;
        this.f15704c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f47071f).k(w1.b.class);
    }

    @Override
    public void O1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void z() {
    }

    @Override
    public void z0() {
    }

    public b(h0 h0Var) {
        this.f15702a = 13;
        this.f15703b = h0Var;
    }

    public b(h hVar) {
        this.f15702a = 18;
        this.f15704c = hVar;
    }

    public b(k kVar, Executor executor, String str) {
        this.f15702a = 25;
        this.f15704c = kVar;
        this.f15703b = executor;
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void C(u1 u1Var) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void E1(u1 u1Var) {
    }

    @Override
    public void F0(u1 u1Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void H0(u1 u1Var) {
    }

    @Override
    public void H1(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void L0(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void U0(u1 u1Var) {
    }

    @Override
    public void W0(u1 u1Var) {
    }

    @Override
    public void X1(u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void f2(u1 u1Var) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void n(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void x1(u1 u1Var) {
    }

    @Override
    public void y0(u1 u1Var) {
    }

    public b(PremiumPreviewFragment premiumPreviewFragment) {
        this.f15702a = 10;
        this.f15704c = premiumPreviewFragment;
        this.f15703b = new Paint();
    }

    @Override
    public void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N0(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, ah.t tVar) {
    }

    @Override
    public void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Z1(u1 u1Var, long j10) {
    }

    @Override
    public void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void y1(u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void s2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void U1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
