package n6;

import ai.r4;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.t0;
import b2.q0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
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
import java.util.concurrent.atomic.AtomicLong;
import n7.z0;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.h5;
import org.telegram.ui.k4;
import org.telegram.ui.m31;
import org.telegram.ui.pv0;
import org.telegram.ui.qw;
import org.telegram.ui.ry;
import org.telegram.ui.sy;
import org.telegram.ui.v41;
import rg.a1;
import s4.d1;
import s4.k1;
import w7.pa;
public final class k implements kp0, l1, im0, fh.a, i81, p2.s, r2.l, y2.n, SuccessContinuation, r0.n {
    public final int f16764a;
    public Object f16765b;
    public Object f16766c;

    public k(int i10) {
        this.f16764a = i10;
    }

    public static n6.k a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n6.k.a(android.content.Context):n6.k");
    }

    @Override
    public boolean A2(int i10) {
        return false;
    }

    public void C(d1 d1Var, q0 q0Var) {
        a0.f fVar = (a0.f) this.f16765b;
        k1 k1Var = (k1) fVar.get(d1Var);
        if (k1Var == null) {
            k1Var = k1.a();
            fVar.put(d1Var, k1Var);
        }
        k1Var.f47861c = q0Var;
        k1Var.f47859a |= 8;
    }

    public void D() {
        String str = (String) this.f16765b;
        try {
            ba.c cVar = (ba.c) this.f16766c;
            cVar.getClass();
            new File(cVar.f3800b, str).createNewFile();
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e7);
        }
    }

    @Override
    public boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override
    public p9 E2() {
        return null;
    }

    @Override
    public r2.c b(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.p) nVar.f7953a).f47020a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f16765b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f16766c).get()), (r2.k) nVar.f7957f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.p) nVar.f7953a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7954b, surface, (MediaCrypto) nVar.f7956e, i10);
                    return cVar2;
                } catch (Exception e7) {
                    e = e7;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    public void H(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f16766c;
        if (bVar.d.f36c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.n nVar = bVar.d;
                if (i10 < nVar.f36c) {
                    w1.a aVar = (w1.a) nVar.f35b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f34a[i10]);
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
                    printWriter.println(aVar.f49872l);
                    a6.d dVar = aVar.f49872l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f312a);
                    if (dVar.f313b || dVar.f315e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f313b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f315e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f314c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f314c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f317g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f317g);
                        printWriter.print(" waiting=");
                        dVar.f317g.getClass();
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
                    if (aVar.f49874n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f49874n);
                        b2.p pVar = aVar.f49874n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3505b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f49872l;
                    Object obj2 = aVar.f2909e;
                    if (obj2 != androidx.lifecycle.z.f2905k) {
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
                    if (aVar.f2908c > 0) {
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
    public boolean H1() {
        return false;
    }

    public File J() {
        if (((File) this.f16765b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f16765b) == null) {
                        k9.h hVar = (k9.h) this.f16766c;
                        hVar.a();
                        File filesDir = hVar.f14746a.getFilesDir();
                        this.f16765b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f16766c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f16765b;
    }

    public void K(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f47258a);
            jSONObject.put("Status", m1.j.c(bVar.f47259b));
            jSONObject.put("AuthToken", bVar.f47260c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f47262f);
            jSONObject.put("ExpiresInSecs", bVar.f47261e);
            jSONObject.put("FisError", bVar.f47263g);
            k9.h hVar = (k9.h) this.f16766c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f14746a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(J())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        z4.g gVar = (z4.g) this.f16766c;
        r0.k1 g10 = r0.i0.g(view, k1Var);
        if (g10.f46901a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.f16765b;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.k1 b10 = r0.i0.b(gVar.getChildAt(i10), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1() {
        return false;
    }

    public void P(o0.f fVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f16766c;
        xa.c cVar = (xa.c) this.f16765b;
        int i10 = fVar.f16984b;
        if (i10 == 0) {
            nVar.execute(new i9.s(20, cVar, fVar.f16983a));
        } else {
            nVar.execute(new r4(cVar, i10));
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(u1 u1Var) {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return ((e11) this.f16766c).v;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        return null;
    }

    public q0 V(d1 d1Var, int i10) {
        k1 k1Var;
        q0 q0Var;
        a0.f fVar = (a0.f) this.f16765b;
        int c10 = fVar.c(d1Var);
        if (c10 >= 0 && (k1Var = (k1) fVar.h(c10)) != null) {
            int i11 = k1Var.f47859a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                k1Var.f47859a = i12;
                if (i10 == 4) {
                    q0Var = k1Var.f47860b;
                } else if (i10 == 8) {
                    q0Var = k1Var.f47861c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    k1Var.f47859a = 0;
                    k1Var.f47860b = null;
                    k1Var.f47861c = null;
                    k1.d.q(k1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        h5.f38328c = f7;
        ((TextView) this.f16765b).setText("Saturation " + (f7 * 5.0f));
        tw0 tw0Var = ((h5) this.f16766c).f38330b;
        tw0Var.N();
        tw0Var.M();
    }

    @Override
    public hh.a Y() {
        return null;
    }

    public ra.b Z() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(J());
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
                return new ra.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void a0() {
        try {
            ((FileLock) this.f16766c).release();
            ((FileChannel) this.f16765b).close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    @Override
    public boolean b0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        sy syVar = (sy) this.f16766c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f22858n2) {
                syVar.K4(s2Var.getDialogId(), view);
                return true;
            }
        }
        qw qwVar = syVar.f42045z0;
        if (qwVar != null && qwVar.getVisibility() == 0 && syVar.f42045z0.f24829n) {
            return false;
        }
        return syVar.l4(view, i10, f7, ((ry) this.f16765b).d);
    }

    public void c0(d1 d1Var) {
        k1 k1Var = (k1) ((a0.f) this.f16765b).get(d1Var);
        if (k1Var == null) {
            return;
        }
        k1Var.f47859a &= -2;
    }

    @Override
    public boolean c1(u1 u1Var, boolean z10) {
        return false;
    }

    public void d0(d1 d1Var) {
        a0.f fVar = (a0.f) this.f16765b;
        a0.i iVar = (a0.i) this.f16766c;
        int m10 = iVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (d1Var == iVar.n(m10)) {
                Object[] objArr = iVar.f21c;
                Object obj = objArr[m10];
                Object obj2 = a0.j.f22a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    iVar.f19a = true;
                }
            } else {
                m10--;
            }
        }
        k1 k1Var = (k1) fVar.get(d1Var);
        if (k1Var != null) {
            fVar.remove(d1Var);
            k1Var.f47859a = 0;
            k1Var.f47860b = null;
            k1Var.f47861c = null;
            k1.d.q(k1Var);
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public pv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    public int f0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16765b;
        m.h(context);
        m.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.f16766c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public boolean g2(long j3) {
        return ((e11) this.f16766c).f25942s;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sy) this.f16766c).finishPreviewFragment();
        }
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public int i0() {
        return 0;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public ch.d l() {
        return new ch.f(this);
    }

    @Override
    public int l0(u1 u1Var) {
        return 0;
    }

    public void m(Object obj, String str) {
        ((ArrayList) this.f16765b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public void onError(l81 l81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16766c;
        int i10 = secretMediaViewer.f34478b0;
        if (i10 > 0) {
            secretMediaViewer.f34478b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new m31(5, this, (File) this.f16765b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16766c;
        v41 v41Var = secretMediaViewer.f34496i1;
        if (secretMediaViewer.f34529y != null && secretMediaViewer.f34493h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(v41Var);
            AndroidUtilities.runOnUIThread(v41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f34477b.getWindow().addFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                try {
                    secretMediaViewer.f34477b.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (i10 == 3 && secretMediaViewer.f34524w.getVisibility() != 0) {
                secretMediaViewer.f34524w.setVisibility(0);
            }
            if (secretMediaViewer.f34529y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f34511q1);
                        return;
                    }
                    secretMediaViewer.f34529y.L(0L, false);
                    secretMediaViewer.f34529y.C();
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
        k4 k4Var = ((SecretMediaViewer) this.f16766c).f34524w;
        if (k4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            k4Var.a(f10, 0);
        }
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((sy) this.f16766c).movePreviewFragment(f7);
        }
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean t0(b6 b6Var) {
        return false;
    }

    @Override
    public Object t2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f16765b).t2(uri, kVar);
        List list = (List) this.f16766c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public Task then(Object obj) {
        da.b bVar = (da.b) obj;
        u4.f fVar = (u4.f) this.f16766c;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        z0 z0Var = (z0) fVar.f48969c;
        w9.m.b((w9.m) ((z0) fVar.f48969c).f16906c);
        ((w9.m) z0Var.f16906c).f50376m.y((Executor) this.f16765b, null);
        ((w9.m) z0Var.f16906c).f50380q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16764a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f16766c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f16765b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 22:
                StringBuilder sb3 = new StringBuilder(128);
                sb3.append("LoaderManager{");
                sb3.append(Integer.toHexString(System.identityHashCode(this)));
                sb3.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f16765b).getClass();
                sb3.append(cls.getSimpleName());
                sb3.append("{");
                sb3.append(Integer.toHexString(System.identityHashCode(cls)));
                sb3.append("}}");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f16765b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f16766c;
        a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f34199h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(h6.f20766a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f34193d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f34190b0, 0, premiumPreviewFragment.f34193d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f34193d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f47303f);
    }

    @Override
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.f16765b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((e11) this.f16766c).f25942s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public y2.n x() {
        return new k(18, ((p2.s) this.f16765b).x(), (List) this.f16766c);
    }

    @Override
    public y2.n y(p2.o oVar, p2.l lVar) {
        return new k(18, ((p2.s) this.f16765b).y(oVar, lVar), (List) this.f16766c);
    }

    public k(int i10, Object obj, Object obj2) {
        this.f16764a = i10;
        this.f16765b = obj;
        this.f16766c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16766c;
        if (secretMediaViewer.f34481c0) {
            return;
        }
        secretMediaViewer.f34481c0 = true;
        secretMediaViewer.f34485e.invalidate();
    }

    public k(Object obj, Object obj2, boolean z10, int i10) {
        this.f16764a = i10;
        this.f16766c = obj;
        this.f16765b = obj2;
    }

    public k(Object obj) {
        this.f16764a = 0;
        this.f16766c = obj;
        this.f16765b = new ArrayList();
    }

    public k(v7.k kVar) {
        this.f16764a = 23;
        this.f16766c = new Object();
        this.f16765b = kVar;
        pa.b();
    }

    public k(k6.e eVar) {
        this.f16764a = 1;
        this.f16765b = new SparseIntArray();
        m.h(eVar);
        this.f16766c = eVar;
    }

    public k(Context context, int i10) {
        this.f16764a = i10;
        switch (i10) {
            case 21:
                this.f16766c = new AtomicLong(-1L);
                this.f16765b = new com.google.android.gms.common.api.j(context, p6.b.f45545k, new q("mlkit:natural_language"), com.google.android.gms.common.api.i.f6536c);
                return;
            default:
                this.f16765b = context;
                this.f16766c = null;
                return;
        }
    }

    public k() {
        this.f16764a = 17;
        this.f16765b = new a0.m(0);
        this.f16766c = new a0.i();
    }

    public k(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f16764a = 22;
        this.f16765b = tVar;
        this.f16766c = (w1.b) new aa.a(t0Var, w1.b.f49875f).j(w1.b.class);
    }

    @Override
    public void C2() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void d() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void z() {
    }

    public k(k9.h hVar) {
        this.f16764a = 16;
        this.f16766c = hVar;
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(u1 u1Var) {
    }

    @Override
    public void J1(u1 u1Var) {
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
    public void N0(u1 u1Var) {
    }

    @Override
    public void Q1(u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var) {
    }

    @Override
    public void S1(MessageObject messageObject) {
    }

    @Override
    public void U(u1 u1Var) {
    }

    @Override
    public void d1(u1 u1Var) {
    }

    @Override
    public void f1(u1 u1Var) {
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void k2(u1 u1Var) {
    }

    @Override
    public void m0(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
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
    public void r0(String str) {
    }

    @Override
    public void s2(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    public k(String str, String str2) {
        this.f16764a = 20;
        this.f16765b = str;
        this.f16766c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public k(EditText editText) {
        this.f16764a = 13;
        this.f16765b = editText;
        q1.i iVar = new q1.i(editText);
        this.f16766c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f46010b == null) {
            synchronized (q1.a.f46009a) {
                try {
                    if (q1.a.f46010b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f46011c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f46010b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f46010b);
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void V0(int i10, u1 u1Var) {
    }

    @Override
    public void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m2(u1 u1Var, long j3) {
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
    }

    public k(z4.g gVar) {
        this.f16764a = 29;
        this.f16766c = gVar;
        this.f16765b = new Rect();
    }

    public k(PremiumPreviewFragment premiumPreviewFragment) {
        this.f16764a = 9;
        this.f16766c = premiumPreviewFragment;
        this.f16765b = new Paint();
    }

    @Override
    public void A1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void D2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void H0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
