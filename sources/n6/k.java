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
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.l4;
import org.telegram.ui.l5;
import org.telegram.ui.sv0;
import org.telegram.ui.sw;
import org.telegram.ui.u31;
import org.telegram.ui.uy;
import org.telegram.ui.vy;
import org.telegram.ui.y41;
import r0.k1;
import rg.a1;
import s4.d1;
import w7.pa;
public final class k implements pp0, l1, nm0, fh.a, n81, p2.s, r2.k, y2.n, SuccessContinuation, r0.n {
    public final int f16432a;
    public Object f16433b;
    public Object f16434c;

    public k(int i10) {
        this.f16432a = i10;
    }

    public static n6.k a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n6.k.a(android.content.Context):n6.k");
    }

    public void C() {
        String str = (String) this.f16433b;
        try {
            ba.c cVar = (ba.c) this.f16434c;
            cVar.getClass();
            new File(cVar.f3798b, str).createNewFile();
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e7);
        }
    }

    @Override
    public boolean C0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean C2(int i10) {
        return false;
    }

    @Override
    public y2.n D(p2.o oVar, p2.l lVar) {
        return new k(18, ((p2.s) this.f16433b).D(oVar, lVar), (List) this.f16434c);
    }

    @Override
    public r2.c m(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f7950a).f47118a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f16433b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f16434c).get()), (r2.j) nVar.f7954f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f7950a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f7951b, surface, (MediaCrypto) nVar.f7953e, i10);
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

    @Override
    public p9 G2() {
        return null;
    }

    public void H(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f16434c;
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
                    printWriter.println(aVar.f49987l);
                    a6.d dVar = aVar.f49987l;
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
                    if (aVar.f49989n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f49989n);
                        b2.p pVar = aVar.f49989n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f3503b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f49987l;
                    Object obj2 = aVar.f2907e;
                    if (obj2 != androidx.lifecycle.z.f2903k) {
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
                    if (aVar.f2906c > 0) {
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
        if (((File) this.f16433b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f16433b) == null) {
                        k9.h hVar = (k9.h) this.f16434c;
                        hVar.a();
                        File filesDir = hVar.f14744a.getFilesDir();
                        this.f16433b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f16434c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f16433b;
    }

    public void K(ra.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f47356a);
            jSONObject.put("Status", m1.j.c(bVar.f47357b));
            jSONObject.put("AuthToken", bVar.f47358c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f47360f);
            jSONObject.put("ExpiresInSecs", bVar.f47359e);
            jSONObject.put("FisError", bVar.f47361g);
            k9.h hVar = (k9.h) this.f16434c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f14744a.getFilesDir());
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
    public k1 M0(View view, k1 k1Var) {
        z4.g gVar = (z4.g) this.f16434c;
        k1 g10 = r0.i0.g(view, k1Var);
        if (g10.f47000a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.f16433b;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            k1 b10 = r0.i0.b(gVar.getChildAt(i10), g10);
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
    public boolean R0(long j3) {
        return ((j11) this.f16434c).v;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    public void U(o0.f fVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f16434c;
        xa.c cVar = (xa.c) this.f16433b;
        int i10 = fVar.f16651b;
        if (i10 == 0) {
            nVar.execute(new i9.s(20, cVar, fVar.f16650a));
        } else {
            nVar.execute(new r4(cVar, i10));
        }
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override
    public int V() {
        return 0;
    }

    public q0 W(d1 d1Var, int i10) {
        s4.k1 k1Var;
        q0 q0Var;
        a0.f fVar = (a0.f) this.f16433b;
        int c10 = fVar.c(d1Var);
        if (c10 >= 0 && (k1Var = (s4.k1) fVar.h(c10)) != null) {
            int i11 = k1Var.f47974a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                k1Var.f47974a = i12;
                if (i10 == 4) {
                    q0Var = k1Var.f47975b;
                } else if (i10 == 8) {
                    q0Var = k1Var.f47976c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    k1Var.f47974a = 0;
                    k1Var.f47975b = null;
                    k1Var.f47976c = null;
                    s4.k1.d.s(k1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        l5.f39636c = f7;
        ((TextView) this.f16433b).setText("Saturation " + (f7 * 5.0f));
        yw0 yw0Var = ((l5) this.f16434c).f39638b;
        yw0Var.N();
        yw0Var.M();
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

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    public void b0() {
        try {
            ((FileLock) this.f16434c).release();
            ((FileChannel) this.f16433b).close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    @Override
    public boolean b1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        vy vyVar = (vy) this.f16434c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f22594n2) {
                vyVar.K4(s2Var.getDialogId(), view);
                return true;
            }
        }
        sw swVar = vyVar.f43009z0;
        if (swVar != null && swVar.getVisibility() == 0 && vyVar.f43009z0.f25172n) {
            return false;
        }
        return vyVar.l4(view, i10, f7, ((uy) this.f16433b).d);
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    public void d(Object obj, String str) {
        ((ArrayList) this.f16433b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    public void d0(d1 d1Var) {
        s4.k1 k1Var = (s4.k1) ((a0.f) this.f16433b).get(d1Var);
        if (k1Var == null) {
            return;
        }
        k1Var.f47974a &= -2;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public sv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    public void g0(d1 d1Var) {
        a0.f fVar = (a0.f) this.f16433b;
        a0.i iVar = (a0.i) this.f16434c;
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
        s4.k1 k1Var = (s4.k1) fVar.get(d1Var);
        if (k1Var != null) {
            fVar.remove(d1Var);
            k1Var.f47974a = 0;
            k1Var.f47975b = null;
            k1Var.f47976c = null;
            s4.k1.d.s(k1Var);
        }
    }

    @Override
    public boolean g2(long j3) {
        return ((j11) this.f16434c).f27337s;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((vy) this.f16434c).finishPreviewFragment();
        }
    }

    public int i0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f16433b;
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
            i10 = ((k6.e) this.f16434c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
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
    public int j0(u1 u1Var) {
        return 0;
    }

    @Override
    public ch.d l() {
        return new ch.f(this);
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public void onError(q81 q81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16434c;
        int i10 = secretMediaViewer.f34255b0;
        if (i10 > 0) {
            secretMediaViewer.f34255b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new u31(4, this, (File) this.f16433b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16434c;
        y41 y41Var = secretMediaViewer.f34273i1;
        if (secretMediaViewer.f34306y != null && secretMediaViewer.f34270h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(y41Var);
            AndroidUtilities.runOnUIThread(y41Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f34254b.getWindow().addFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                try {
                    secretMediaViewer.f34254b.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (i10 == 3 && secretMediaViewer.f34301w.getVisibility() != 0) {
                secretMediaViewer.f34301w.setVisibility(0);
            }
            if (secretMediaViewer.f34306y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f34288q1);
                        return;
                    }
                    secretMediaViewer.f34306y.L(0L, false);
                    secretMediaViewer.f34306y.C();
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
        l4 l4Var = ((SecretMediaViewer) this.f16434c).f34301w;
        if (l4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            l4Var.a(f10, 0);
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((vy) this.f16434c).movePreviewFragment(f7);
        }
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean s0(b6 b6Var) {
        return false;
    }

    @Override
    public Object t2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f16433b).t2(uri, kVar);
        List list = (List) this.f16434c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public Task then(Object obj) {
        da.b bVar = (da.b) obj;
        u4.f fVar = (u4.f) this.f16434c;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        z0 z0Var = (z0) fVar.f49084c;
        w9.n.b((w9.n) ((z0) fVar.f49084c).f16574c);
        ((w9.n) z0Var.f16574c).f50491m.y((Executor) this.f16433b, null);
        ((w9.n) z0Var.f16574c).f50495q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16432a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f16434c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f16433b;
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
                Class<?> cls = ((androidx.lifecycle.t) this.f16433b).getClass();
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
        Paint paint = (Paint) this.f16433b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f16434c;
        a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f33976h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(h6.f20504a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f33970d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33967b0, 0, premiumPreviewFragment.f33970d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f33970d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f47401f);
    }

    @Override
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.f16433b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((j11) this.f16434c).f27337s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public void x(d1 d1Var, q0 q0Var) {
        a0.f fVar = (a0.f) this.f16433b;
        s4.k1 k1Var = (s4.k1) fVar.get(d1Var);
        if (k1Var == null) {
            k1Var = s4.k1.a();
            fVar.put(d1Var, k1Var);
        }
        k1Var.f47976c = q0Var;
        k1Var.f47974a |= 8;
    }

    @Override
    public y2.n y() {
        return new k(18, ((p2.s) this.f16433b).y(), (List) this.f16434c);
    }

    public k(int i10, Object obj, Object obj2) {
        this.f16432a = i10;
        this.f16433b = obj;
        this.f16434c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16434c;
        if (secretMediaViewer.f34258c0) {
            return;
        }
        secretMediaViewer.f34258c0 = true;
        secretMediaViewer.f34262e.invalidate();
    }

    public k(Object obj, Object obj2, boolean z10, int i10) {
        this.f16432a = i10;
        this.f16434c = obj;
        this.f16433b = obj2;
    }

    public k(Object obj) {
        this.f16432a = 0;
        this.f16434c = obj;
        this.f16433b = new ArrayList();
    }

    public k(v7.k kVar) {
        this.f16432a = 23;
        this.f16434c = new Object();
        this.f16433b = kVar;
        pa.b();
    }

    public k(k6.e eVar) {
        this.f16432a = 1;
        this.f16433b = new SparseIntArray();
        m.h(eVar);
        this.f16434c = eVar;
    }

    public k(Context context, int i10) {
        this.f16432a = i10;
        switch (i10) {
            case 21:
                this.f16434c = new AtomicLong(-1L);
                this.f16433b = new com.google.android.gms.common.api.j(context, p6.b.f45368k, new q("mlkit:natural_language"), com.google.android.gms.common.api.i.f6535c);
                return;
            default:
                this.f16433b = context;
                this.f16434c = null;
                return;
        }
    }

    public k() {
        this.f16432a = 17;
        this.f16433b = new a0.m(0);
        this.f16434c = new a0.i();
    }

    public k(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f16432a = 22;
        this.f16433b = tVar;
        this.f16434c = (w1.b) new aa.a(t0Var, w1.b.f49990f).k(w1.b.class);
    }

    @Override
    public void E0() {
    }

    @Override
    public void E2() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void b() {
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
    public void x2() {
    }

    @Override
    public void z() {
    }

    public k(k9.h hVar) {
        this.f16432a = 16;
        this.f16434c = hVar;
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(u1 u1Var) {
    }

    @Override
    public void J1(u1 u1Var) {
    }

    @Override
    public void K0(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
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
    public void T(u1 u1Var) {
    }

    @Override
    public void c1(u1 u1Var) {
    }

    @Override
    public void e0(int i10) {
    }

    @Override
    public void e1(u1 u1Var) {
    }

    @Override
    public void k0(u1 u1Var) {
    }

    @Override
    public void k2(u1 u1Var) {
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
        this.f16432a = 20;
        this.f16433b = str;
        this.f16434c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public k(EditText editText) {
        this.f16432a = 13;
        this.f16433b = editText;
        q1.i iVar = new q1.i(editText);
        this.f16434c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f45846b == null) {
            synchronized (q1.a.f45845a) {
                try {
                    if (q1.a.f45846b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f45847c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f45846b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f45846b);
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
    public void U0(int i10, u1 u1Var) {
    }

    @Override
    public void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
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
        this.f16432a = 29;
        this.f16434c = gVar;
        this.f16433b = new Rect();
    }

    public k(PremiumPreviewFragment premiumPreviewFragment) {
        this.f16432a = 9;
        this.f16434c = premiumPreviewFragment;
        this.f16433b = new Paint();
    }

    @Override
    public void B1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void F0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void a1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void u0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void z0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void z2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
