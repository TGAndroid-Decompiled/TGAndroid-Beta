package n6;

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
import androidx.lifecycle.t0;
import b2.v0;
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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
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
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.z01;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.d51;
import org.telegram.ui.hz0;
import org.telegram.ui.m5;
import org.telegram.ui.n4;
import org.telegram.ui.wv0;
import org.telegram.ui.ww;
import org.telegram.ui.xy;
import org.telegram.ui.yy;
import s4.b1;
import s4.i1;
import sg.a1;
import u2.c1;
import w7.pa;
public final class o implements fp0, l1, dm0, gh.a, e81, p2.t, ne.d, com.google.android.gms.common.api.internal.s, SuccessContinuation {
    public final int f16130a;
    public Object f16131b;
    public Object f16132c;

    public o(int i10, Object obj, Object obj2) {
        this.f16130a = i10;
        this.f16131b = obj;
        this.f16132c = obj2;
    }

    public static n6.o a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n6.o.a(android.content.Context):n6.o");
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public void C(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n6.o.C(float, int):void");
    }

    public void D(sa.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f45077a);
            jSONObject.put("Status", m1.j.c(aVar.f45078b));
            jSONObject.put("AuthToken", aVar.f45079c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f45080f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f45081g);
            l9.h hVar = (l9.h) this.f16132c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f14626a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(x())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void G(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f16132c;
        a6.i iVar = (a6.i) this.f16131b;
        int i10 = fVar.f16431b;
        if (i10 == 0) {
            oVar.execute(new j9.u(20, iVar, fVar.f16430a));
        } else {
            oVar.execute(new androidx.activity.i(iVar, i10));
        }
    }

    @Override
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.s(u1Var.getContext(), str);
    }

    @Override
    public y2.n H() {
        return new m4.c(24, ((p2.t) this.f16131b).H(), (List) this.f16132c);
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        return null;
    }

    public v0 J(b1 b1Var, int i10) {
        i1 i1Var;
        v0 v0Var;
        a0.f fVar = (a0.f) this.f16131b;
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
                    i1.d.u(i1Var);
                }
                return v0Var;
            }
        }
        return null;
    }

    @Override
    public boolean J0(long j10) {
        return ((z01) this.f16132c).v;
    }

    @Override
    public boolean J1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    public sa.a K() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(x());
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

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
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
    public wv0 P1() {
        return null;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q1(long j10) {
        return ((z01) this.f16132c).f31724s;
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
    public y2.n U(p2.p pVar, p2.m mVar) {
        return new m4.c(24, ((p2.t) this.f16131b).U(pVar, mVar), (List) this.f16132c);
    }

    @Override
    public int V() {
        return 0;
    }

    public void W() {
        try {
            ((FileLock) this.f16132c).release();
            ((FileChannel) this.f16131b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override
    public void X(float f7, boolean z10) {
        m5.f38163c = f7;
        ((TextView) this.f16131b).setText("Saturation " + (f7 * 5.0f));
        ow0 ow0Var = ((m5) this.f16132c).f38164b;
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

    @Override
    public boolean Z0(int i10, u1 u1Var) {
        return false;
    }

    public void a0(b1 b1Var) {
        i1 i1Var = (i1) ((a0.f) this.f16131b).get(b1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f44895a &= -2;
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: n6.o.accept(java.lang.Object, java.lang.Object):void");
    }

    public void b0(b1 b1Var) {
        a0.f fVar = (a0.f) this.f16131b;
        a0.h hVar = (a0.h) this.f16132c;
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
            i1.d.u(i1Var);
        }
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
        yy yyVar = (yy) this.f16132c;
        if (view instanceof s2) {
            s2 s2Var = (s2) view;
            if (s2Var.f21868n2) {
                yyVar.K4(s2Var.getDialogId(), view);
                return true;
            }
        }
        ww wwVar = yyVar.f42430z0;
        if (wwVar != null && wwVar.getVisibility() == 0 && yyVar.f42430z0.f30711n) {
            return false;
        }
        return yyVar.l4(view, i10, f7, ((xy) this.f16131b).d);
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.d0.a(messageObject);
    }

    public void e(b1 b1Var, v0 v0Var) {
        a0.f fVar = (a0.f) this.f16131b;
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var == null) {
            i1Var = i1.a();
            fVar.put(b1Var, i1Var);
        }
        i1Var.f44897c = v0Var;
        i1Var.f44895a |= 8;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    public c3.i0 g0(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f16131b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((c1[]) this.f16132c)[i11];
                }
                i11++;
            } else {
                e2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
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
            ((yy) this.f16132c).finishPreviewFragment();
        }
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public dh.d k() {
        return new dh.f(this);
    }

    @Override
    public int k0() {
        return 0;
    }

    public void l(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f16132c;
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
                    printWriter.println(dVar.f292a);
                    if (dVar.f293b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f293b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f294c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f294c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f296g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f296g);
                        printWriter.print(" waiting=");
                        dVar.f296g.getClass();
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
                        printWriter.println(uVar.f2396b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f47068l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f1765k) {
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
                    if (aVar.f1768c > 0) {
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
    public boolean l2(int i10) {
        return false;
    }

    @Override
    public boolean o0(b6 b6Var) {
        return false;
    }

    @Override
    public void onError(h81 h81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16132c;
        int i10 = secretMediaViewer.f32731b0;
        if (i10 > 0) {
            secretMediaViewer.f32731b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new hz0(17, this, (File) this.f16131b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16132c;
        d51 d51Var = secretMediaViewer.f32748i1;
        if (secretMediaViewer.f32781y != null && secretMediaViewer.f32745h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(d51Var);
            AndroidUtilities.runOnUIThread(d51Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f32730b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f32730b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (i10 == 3 && secretMediaViewer.f32776w.getVisibility() != 0) {
                secretMediaViewer.f32776w.setVisibility(0);
            }
            if (secretMediaViewer.f32781y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f32763q1);
                        return;
                    }
                    secretMediaViewer.f32781y.L(0L, false);
                    secretMediaViewer.f32781y.C();
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
        n4 n4Var = ((SecretMediaViewer) this.f16132c).f32776w;
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
    public void p(int i10, float f7, float f10, ne.e eVar) {
        qh.i iVar = (qh.i) this.f16132c;
        iVar.f43640c.a(f7);
        iVar.d.a(f7);
        iVar.f43639b.a(f7);
        ((Runnable) this.f16131b).run();
    }

    @Override
    public p9 p2() {
        return null;
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((yy) this.f16132c).movePreviewFragment(f7);
        }
    }

    @Override
    public Task then(Object obj) {
        switch (this.f16130a) {
            case 24:
                ea.a aVar = (ea.a) obj;
                x9.n nVar = ((x9.k) this.f16132c).e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(x9.n.b(nVar), nVar.f48314m.y((Executor) this.f16131b, null));
            default:
                return ((x9.n) this.f16132c).e.w(new u4.f(1, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f16130a) {
            case 20:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f16131b).getClass();
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
        Paint paint = (Paint) this.f16131b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f16132c;
        a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f32456h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(g6.f19843a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f32451d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f32448b0, 0, premiumPreviewFragment.f32451d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f32451d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f45117f);
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        String trim = ((EditTextBoldCursor) this.f16131b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((z01) this.f16132c).f31724s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    public File x() {
        if (((File) this.f16131b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f16131b) == null) {
                        l9.h hVar = (l9.h) this.f16132c;
                        hVar.a();
                        File filesDir = hVar.f14626a.getFilesDir();
                        this.f16131b = new File(filesDir, "PersistedInstallation." + ((l9.h) this.f16132c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f16131b;
    }

    public String y(String str) {
        Resources resources = (Resources) this.f16131b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f16132c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public o(int i10, boolean z10) {
        this.f16130a = i10;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f16132c;
        if (secretMediaViewer.f32734c0) {
            return;
        }
        secretMediaViewer.f32734c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public o(Object obj, Object obj2, boolean z10, int i10) {
        this.f16130a = i10;
        this.f16132c = obj;
        this.f16131b = obj2;
    }

    public o(Context context, int i10) {
        this.f16130a = i10;
        switch (i10) {
            case 29:
                this.f16132c = new AtomicLong(-1L);
                this.f16131b = new com.google.android.gms.common.api.j(context, p6.b.f43145k, new q("mlkit:vision"), com.google.android.gms.common.api.i.f4897c);
                return;
            default:
                l.h(context);
                Resources resources = context.getResources();
                this.f16131b = resources;
                this.f16132c = resources.getResourcePackageName(2131689566);
                return;
        }
    }

    public o(u2.c cVar) {
        this.f16130a = 21;
        this.f16132c = new Object();
        this.f16131b = cVar;
        pa.b();
    }

    public o(int i10) {
        this.f16130a = i10;
        switch (i10) {
            case 26:
                this.f16131b = new AtomicInteger();
                this.f16132c = new AtomicInteger();
                return;
            default:
                this.f16131b = new a0.l(0);
                this.f16132c = new a0.h();
                return;
        }
    }

    public o(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f16130a = 20;
        this.f16131b = tVar;
        this.f16132c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f47071f).m(w1.b.class);
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
    public void n2() {
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

    @Override
    public void z() {
    }

    public o(qg.h0 h0Var) {
        this.f16130a = 12;
        this.f16131b = h0Var;
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
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
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
    public void w1(u1 u1Var) {
    }

    @Override
    public void x0(u1 u1Var) {
    }

    public o(l9.h hVar) {
        this.f16130a = 17;
        this.f16132c = hVar;
    }

    public o(x9.k kVar, Executor executor, String str) {
        this.f16130a = 24;
        this.f16132c = kVar;
        this.f16131b = executor;
    }

    public o(PremiumPreviewFragment premiumPreviewFragment) {
        this.f16130a = 9;
        this.f16132c = premiumPreviewFragment;
        this.f16131b = new Paint();
    }

    @Override
    public void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(u1 u1Var, ah.t tVar) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
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
    public void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
