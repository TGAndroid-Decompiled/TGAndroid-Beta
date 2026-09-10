package n7;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
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
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cn0;
import org.telegram.ui.h7;
import org.telegram.ui.i5;
import org.telegram.ui.kv;
import org.telegram.ui.lv;
import org.telegram.ui.on0;
import org.telegram.ui.ql0;
import org.telegram.ui.r6;
import org.telegram.ui.rv0;
import org.telegram.ui.wm0;
import v7.a6;
import w7.pa;
public class a1 implements le.d, no0, org.telegram.ui.Cells.k1, h7, cn0, eh.a, f6, r2.k, SuccessContinuation, r0.n {
    public final int f13937a;
    public Object f13938b;
    public Object f13939c;

    public a1(int i10, byte b10) {
        this.f13937a = i10;
    }

    public static n7.a1 h(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.a1.h(android.content.Context):n7.a1");
    }

    @Override
    public void B(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: n7.a1.B(float, int):void");
    }

    public void C() {
        String str = (String) this.f13938b;
        try {
            ba.c cVar = (ba.c) this.f13939c;
            cVar.getClass();
            new File(cVar.f2145b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override
    public boolean E1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public Paint F(String str) {
        switch (this.f13937a) {
            case 10:
                return j6.S0(str);
            default:
                f6 f6Var = (f6) this.f13939c;
                if (f6Var == null) {
                    return j6.S0(str);
                }
                return f6Var.F(str);
        }
    }

    @Override
    public int F0(int i10) {
        switch (this.f13937a) {
            case 10:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f13938b;
                if (sparseIntArray != null) {
                    return sparseIntArray.get(i10);
                }
                return j6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f13938b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                f6 f6Var = (f6) this.f13939c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.F0(i10);
        }
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        oh.i iVar = (oh.i) this.f13939c;
        iVar.f14593c.a(f7);
        iVar.d.a(f7);
        iVar.f14592b.a(f7);
        ((Runnable) this.f13938b).run();
    }

    @Override
    public boolean G1() {
        return false;
    }

    @Override
    public r2.c c(com.google.firebase.messaging.n nVar) {
        MediaCodec mediaCodec;
        int i10;
        String str = ((r2.o) nVar.f6103a).f41182a;
        r2.c cVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                r2.c cVar2 = new r2.c(mediaCodec, (HandlerThread) ((r2.b) this.f13938b).get(), new r2.e(mediaCodec, (HandlerThread) ((r2.b) this.f13939c).get()), (r2.j) nVar.f6106f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) nVar.d;
                    if (surface == null && ((r2.o) nVar.f6103a).h && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    r2.c.l(cVar2, (MediaFormat) nVar.f6104b, surface, (MediaCrypto) nVar.e, i10);
                    return cVar2;
                } catch (Exception e) {
                    e = e;
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
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }

    public void J(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f13939c;
        if (bVar.d.f31c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.m mVar = bVar.d;
                if (i10 < mVar.f31c) {
                    w1.a aVar = (w1.a) mVar.f30b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f29a[i10]);
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
                    printWriter.println(aVar.f43430l);
                    a6.d dVar = aVar.f43430l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f288a);
                    if (dVar.f289b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f289b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f290c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f290c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f292g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f292g);
                        printWriter.print(" waiting=");
                        dVar.f292g.getClass();
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
                    if (aVar.f43432n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f43432n);
                        b2.p pVar = aVar.f43432n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f1869b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f43430l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f1308k) {
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
                    if (aVar.f1311c > 0) {
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
    public void L0(int i10, int i11) {
        switch (this.f13937a) {
            case 10:
                return;
            default:
                f6 f6Var = (f6) this.f13939c;
                if (f6Var != null) {
                    f6Var.L0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean M0(long j3) {
        return ((n01) this.f13939c).v;
    }

    @Override
    public CharacterStyle M1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean O1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean P(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        z4.g gVar = (z4.g) this.f13939c;
        r0.l1 h = r0.i0.h(view, l1Var);
        if (h.f41074a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f13938b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.l1 b10 = r0.i0.b(gVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public File T() {
        if (((File) this.f13938b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f13938b) == null) {
                        k9.h hVar = (k9.h) this.f13939c;
                        hVar.a();
                        File filesDir = hVar.f12392a.getFilesDir();
                        this.f13938b = new File(filesDir, "PersistedInstallation." + ((k9.h) this.f13939c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f13938b;
    }

    @Override
    public int U() {
        return 0;
    }

    public void V(ra.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f41392a);
            jSONObject.put("Status", m1.j.c(aVar.f41393b));
            jSONObject.put("AuthToken", aVar.f41394c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f41395f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f41396g);
            k9.h hVar = (k9.h) this.f13939c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f12392a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(T())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void W(float f7, boolean z10) {
        i5.f33535c = f7;
        ((TextView) this.f13938b).setText("Saturation " + (f7 * 5.0f));
        aw0 aw0Var = ((i5) this.f13939c).f33536b;
        aw0Var.N();
        aw0Var.M();
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public gh.a X() {
        return null;
    }

    @Override
    public rv0 X1() {
        return null;
    }

    @Override
    public boolean Y(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Y1(long j3) {
        return ((n01) this.f13939c).f25360s;
    }

    public b2.q0 Z(s4.c1 c1Var, int i10) {
        s4.i1 i1Var;
        b2.q0 q0Var;
        a0.f fVar = (a0.f) this.f13938b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (i1Var = (s4.i1) fVar.h(c10)) != null) {
            int i11 = i1Var.f41664a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.f41664a = i12;
                if (i10 == 4) {
                    q0Var = i1Var.f41665b;
                } else if (i10 == 8) {
                    q0Var = i1Var.f41666c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.f41664a = 0;
                    i1Var.f41665b = null;
                    i1Var.f41666c = null;
                    s4.i1.d.i(i1Var);
                }
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public boolean a() {
        switch (this.f13937a) {
            case 10:
            default:
                return j6.I.q();
        }
    }

    @Override
    public void a0(r6 r6Var, yh.a aVar, boolean z10) {
        lv lvVar = (lv) this.f13939c;
        kv kvVar = lvVar.X;
        if (aVar != null) {
            ((yh.b) this.f13938b).i(aVar);
            lvVar.f34783e0.d();
            yh.b bVar = lvVar.f34785g0;
            oy0[] oy0VarArr = lvVar.f34780b0;
            z1[] z1VarArr = lvVar.f34781c0;
            z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                oy0 oy0Var = oy0VarArr[0];
                boolean z11 = bVar.f47181m;
                oy0Var.f25942c = z11;
                z1Var.c(z11, true);
            }
            z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                oy0 oy0Var2 = oy0VarArr[1];
                boolean z12 = bVar.f47182n;
                oy0Var2.f25942c = z12;
                z1Var2.c(z12, true);
            }
            z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                oy0 oy0Var3 = oy0VarArr[2];
                boolean z13 = bVar.f47183o;
                oy0Var3.f25942c = z13;
                z1Var3.c(z13, true);
            }
            z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                oy0 oy0Var4 = oy0VarArr[3];
                boolean z14 = bVar.f47184p;
                oy0Var4.f25942c = z14;
                z1Var4.c(z14, true);
            }
            z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                oy0 oy0Var5 = oy0VarArr[4];
                boolean z15 = bVar.f47185q;
                oy0Var5.f25942c = z15;
                z1Var5.c(z15, true);
            }
            lvVar.f34779a0.a(kvVar.d(), true);
            kvVar.c(true);
        }
    }

    @Override
    public boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public void d(String str, String str2) {
        on0 on0Var = ((wm0) this.f13939c).f38247a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            on0Var.O1(true, str2, (ql0) this.f13938b, this, on0Var.B1);
        } else {
            on0Var.N1(true, false);
        }
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public void dismiss() {
        ((lv) this.f13939c).dismiss();
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public int e0(int i10) {
        switch (this.f13937a) {
            case 10:
                return F0(i10);
            default:
                f6 f6Var = (f6) this.f13939c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.e0(i10);
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f1(int i10) {
        switch (this.f13937a) {
            case 10:
                return F0(i10);
            default:
                f6 f6Var = (f6) this.f13939c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.f1(i10);
        }
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    public ra.a g0() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(T());
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
                return new ra.a(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    @Override
    public boolean g1(MessageObject messageObject) {
        return em.a(messageObject);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f13937a) {
            case 10:
                return null;
            default:
                f6 f6Var = (f6) this.f13939c;
                if (f6Var == null) {
                    return j6.O0(str);
                }
                return f6Var.getDrawable(str);
        }
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    public void j0() {
        try {
            ((FileLock) this.f13939c).release();
            ((FileChannel) this.f13938b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override
    public boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public bh.d k() {
        if (Build.VERSION.SDK_INT >= 29) {
            bh.e eVar = new bh.e(this);
            ((PhotoViewer) this.f13939c).Z.add(eVar);
            return eVar;
        }
        return new bh.f(this);
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        switch (this.f13937a) {
            case 10:
                j6.q(f7, f10, i10, i11);
                return;
            default:
                f6 f6Var = (f6) this.f13939c;
                if (f6Var == null) {
                    j6.q(f7, f10, i10, i11);
                    return;
                } else {
                    f6Var.l(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean m0() {
        switch (this.f13937a) {
            case 10:
                return false;
            default:
                f6 f6Var = (f6) this.f13939c;
                if (f6Var == null) {
                    return j6.a1();
                }
                return f6Var.m0();
        }
    }

    @Override
    public boolean o0(y5 y5Var) {
        return false;
    }

    public void p(s4.c1 c1Var, b2.q0 q0Var) {
        a0.f fVar = (a0.f) this.f13938b;
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var == null) {
            i1Var = s4.i1.a();
            fVar.put(c1Var, i1Var);
        }
        i1Var.f41666c = q0Var;
        i1Var.f41664a |= 8;
    }

    public void p0(s4.c1 c1Var) {
        s4.i1 i1Var = (s4.i1) ((a0.f) this.f13938b).get(c1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.f41664a &= -2;
    }

    public void r0(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.f13938b;
        a0.i iVar = (a0.i) this.f13939c;
        int m10 = iVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (c1Var == iVar.n(m10)) {
                Object[] objArr = iVar.f19c;
                Object obj = objArr[m10];
                Object obj2 = a0.j.f20a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    iVar.f17a = true;
                }
            } else {
                m10--;
            }
        }
        s4.i1 i1Var = (s4.i1) fVar.get(c1Var);
        if (i1Var != null) {
            fVar.remove(c1Var);
            i1Var.f41664a = 0;
            i1Var.f41665b = null;
            i1Var.f41666c = null;
            s4.i1.d.i(i1Var);
        }
    }

    public c3.h0 t0(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f13938b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((u2.c1[]) this.f13939c)[i11];
                }
                i11++;
            } else {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public boolean t2(int i10) {
        return false;
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f13939c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        og.u0 u0Var = (og.u0) gVar.f42591c;
        w9.m.b((w9.m) ((og.u0) gVar.f42591c).f14498c);
        ((w9.m) u0Var.f14498c).f43904m.y((Executor) this.f13938b, null);
        ((w9.m) u0Var.f14498c).f43908q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f13937a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f13938b).getClass();
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
    public void u(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f13939c).T0(canvas, (ma) this.f13938b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public String v(long j3) {
        String trim = ((EditTextBoldCursor) this.f13938b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((n01) this.f13939c).f25360s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public ColorFilter w() {
        switch (this.f13937a) {
            case 10:
                return j6.f18251v3;
            default:
                f6 f6Var = (f6) this.f13939c;
                if (f6Var == null) {
                    return j6.f18251v3;
                }
                return f6Var.w();
        }
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public t9 x2() {
        return null;
    }

    @Override
    public boolean z1() {
        return false;
    }

    public a1(int i10, Object obj, Object obj2) {
        this.f13937a = i10;
        this.f13938b = obj;
        this.f13939c = obj2;
    }

    public a1(Object obj, int i10) {
        this.f13937a = i10;
        this.f13939c = obj;
    }

    public a1(Object obj, Object obj2, boolean z10, int i10) {
        this.f13937a = i10;
        this.f13939c = obj;
        this.f13938b = obj2;
    }

    public a1(a6 a6Var) {
        this.f13937a = 22;
        this.f13939c = new Object();
        this.f13938b = a6Var;
        pa.b();
    }

    public a1(f6 f6Var) {
        this.f13937a = 11;
        this.f13938b = new SparseIntArray();
        this.f13939c = f6Var;
        x();
    }

    public a1() {
        this.f13937a = 16;
        this.f13938b = new a0.l(0);
        this.f13939c = new a0.i();
    }

    public a1(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f13937a = 21;
        this.f13938b = tVar;
        this.f13939c = (w1.b) new aa.a(t0Var, w1.b.f43433f).m(w1.b.class);
    }

    public a1(og.k0 k0Var) {
        this.f13937a = 1;
        this.f13938b = k0Var;
    }

    public a1(int i10) {
        this.f13937a = 19;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f13938b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f13939c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override
    public void A0() {
    }

    @Override
    public void Q1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void h1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void r() {
    }

    @Override
    public void v2() {
    }

    public void x() {
    }

    @Override
    public void y() {
    }

    public a1(EditText editText) {
        this.f13937a = 12;
        this.f13938b = editText;
        q1.i iVar = new q1.i(editText);
        this.f13939c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f40455b == null) {
            synchronized (q1.a.f40454a) {
                try {
                    if (q1.a.f40455b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f40456c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f40455b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f40455b);
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B1(t1 t1Var) {
    }

    @Override
    public void E(t1 t1Var) {
    }

    @Override
    public void E0(t1 t1Var) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void I1(t1 t1Var) {
    }

    @Override
    public void K(t1 t1Var) {
    }

    @Override
    public void K1(MessageObject messageObject) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void S(t1 t1Var) {
    }

    @Override
    public void X0(t1 t1Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void c2(t1 t1Var) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void k2(t1 t1Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void z0(t1 t1Var) {
    }

    private final void s0(int i10, int i11) {
    }

    @Override
    public void C1(t1 t1Var, boolean z10) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, t1 t1Var) {
    }

    @Override
    public void P0(int i10, t1 t1Var) {
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(t1 t1Var, ai.j jVar) {
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void e2(t1 t1Var, long j3) {
    }

    @Override
    public void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void o1(t1 t1Var, TLRPC.Document document) {
    }

    public a1(z4.g gVar) {
        this.f13937a = 28;
        this.f13939c = gVar;
        this.f13938b = new Rect();
    }

    public a1(PhotoViewer photoViewer) {
        this.f13937a = 9;
        this.f13939c = photoViewer;
        this.f13938b = new ma(photoViewer.f30021b0, photoViewer.f30049e0, 0, false);
    }

    @Override
    public void B0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void t1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void w2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
