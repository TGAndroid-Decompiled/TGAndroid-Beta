package o0;

import a0.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.z;
import b2.p;
import c3.h0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import n4.y;
import n7.z0;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.z5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dn0;
import org.telegram.ui.g31;
import org.telegram.ui.i5;
import org.telegram.ui.i7;
import org.telegram.ui.jv;
import org.telegram.ui.kv;
import org.telegram.ui.ov0;
import org.telegram.ui.pn0;
import org.telegram.ui.rl0;
import org.telegram.ui.s6;
import org.telegram.ui.xm0;
import r0.i0;
import r0.l1;
import r0.n;
import s4.g1;
import s4.h1;
import t7.u;
import u2.a1;
import v7.a6;
import w7.pa;
public class a implements eo0, k1, i7, dn0, gh.a, f6, s, n5.b, SuccessContinuation, n, ce.b {
    public final int f16795a;
    public Object f16796b;
    public Object f16797c;

    public a(int i10, byte b10) {
        this.f16795a = i10;
    }

    public static o0.a d(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: o0.a.d(android.content.Context):o0.a");
    }

    @Override
    public boolean B1() {
        return false;
    }

    public View C(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f16797c;
        h1 h1Var = (h1) this.f16796b;
        int e7 = h1Var.e();
        int m10 = h1Var.m();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View r10 = h1Var.r(i10);
            int b10 = h1Var.b(r10);
            int t10 = h1Var.t(r10);
            g1Var.f45814b = e7;
            g1Var.f45815c = m10;
            g1Var.d = b10;
            g1Var.f45816e = t10;
            if (i12 != 0) {
                g1Var.f45813a = i12;
                if (g1Var.a()) {
                    return r10;
                }
            }
            if (i13 != 0) {
                g1Var.f45813a = i13;
                if (g1Var.a()) {
                    view = r10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean D(View view) {
        g1 g1Var = (g1) this.f16797c;
        h1 h1Var = (h1) this.f16796b;
        int e7 = h1Var.e();
        int m10 = h1Var.m();
        int b10 = h1Var.b(view);
        int t10 = h1Var.t(view);
        g1Var.f45814b = e7;
        g1Var.f45815c = m10;
        g1Var.d = b10;
        g1Var.f45816e = t10;
        g1Var.f45813a = 24579;
        return g1Var.a();
    }

    @Override
    public Paint G(String str) {
        switch (this.f16795a) {
            case 8:
                return j6.S0(str);
            default:
                f6 f6Var = (f6) this.f16797c;
                if (f6Var == null) {
                    return j6.S0(str);
                }
                return f6Var.G(str);
        }
    }

    @Override
    public int G0(int i10) {
        switch (this.f16795a) {
            case 8:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f16796b;
                if (sparseIntArray != null) {
                    return sparseIntArray.get(i10);
                }
                return j6.w0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f16796b;
                int indexOfKey = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey);
                }
                f6 f6Var = (f6) this.f16797c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.G0(i10);
        }
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    public void H(g gVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f16797c;
        xa.c cVar = (xa.c) this.f16796b;
        int i10 = gVar.f16812b;
        if (i10 == 0) {
            nVar.execute(new i9.s(19, cVar, gVar.f16811a));
        } else {
            nVar.execute(new androidx.activity.i(cVar, i10));
        }
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean I0(long j3) {
        return ((a01) this.f16797c).v;
    }

    public void J() {
        try {
            ((FileLock) this.f16797c).release();
            ((FileChannel) this.f16796b).close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(int i10, int i11) {
        switch (this.f16795a) {
            case 8:
                return;
            default:
                f6 f6Var = (f6) this.f16797c;
                if (f6Var != null) {
                    f6Var.O0(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(t1 t1Var) {
        return false;
    }

    @Override
    public ov0 Q1() {
        return null;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(long j3) {
        return ((a01) this.f16797c).f24235s;
    }

    @Override
    public l1 T0(View view, l1 l1Var) {
        z4.g gVar = (z4.g) this.f16797c;
        l1 h = i0.h(view, l1Var);
        if (h.f44739a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f16796b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            l1 b10 = i0.b(gVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public h0 U(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f16796b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((a1[]) this.f16797c)[i11];
                }
                i11++;
            } else {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
        }
    }

    @Override
    public boolean U1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void X(float f7, boolean z10) {
        i5.f37267c = f7;
        ((TextView) this.f16796b).setText("Saturation " + (f7 * 5.0f));
        org.telegram.ui.Components.ov0 ov0Var = ((i5) this.f16797c).f37269b;
        ov0Var.N();
        ov0Var.M();
    }

    @Override
    public boolean X0(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public ih.a Y() {
        return null;
    }

    @Override
    public boolean Z(t1 t1Var) {
        return false;
    }

    @Override
    public boolean a() {
        switch (this.f16795a) {
            case 8:
            default:
                return j6.I.q();
        }
    }

    @Override
    public boolean a0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: o0.a.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void b(String str, String str2) {
        pn0 pn0Var = ((xm0) this.f16797c).f42790a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            pn0Var.O1(true, str2, (rl0) this.f16796b, this, pn0Var.B1);
        } else {
            pn0Var.N1(true, false);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c1(MessageObject messageObject) {
        return wl.a(messageObject);
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean d2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void dismiss() {
        ((kv) this.f16797c).dismiss();
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(t1 t1Var) {
        return 0;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public Object mo28get() {
        u uVar = new u(23);
        rb.a aVar = new rb.a(23);
        Object mo28get = ((fd.a) this.f16796b).mo28get();
        fd.a aVar2 = (fd.a) this.f16797c;
        return new s5.g(uVar, aVar, s5.a.f45955f, (s5.i) mo28get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public Drawable getDrawable(String str) {
        switch (this.f16795a) {
            case 8:
                return null;
            default:
                f6 f6Var = (f6) this.f16797c;
                if (f6Var == null) {
                    return j6.O0(str);
                }
                return f6Var.getDrawable(str);
        }
    }

    @Override
    public int h0(int i10) {
        switch (this.f16795a) {
            case 8:
                return G0(i10);
            default:
                f6 f6Var = (f6) this.f16797c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.h0(i10);
        }
    }

    @Override
    public int h1(int i10) {
        switch (this.f16795a) {
            case 8:
                return G0(i10);
            default:
                f6 f6Var = (f6) this.f16797c;
                if (f6Var == null) {
                    return j6.w0(null, i10, false);
                }
                return f6Var.h1(i10);
        }
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public dh.d k() {
        if (Build.VERSION.SDK_INT >= 29) {
            dh.e eVar = new dh.e(this);
            ((PhotoViewer) this.f16797c).Z.add(eVar);
            return eVar;
        }
        return new dh.f(this);
    }

    @Override
    public void k1(s6 s6Var, ai.b bVar, boolean z10) {
        kv kvVar = (kv) this.f16797c;
        jv jvVar = kvVar.X;
        if (bVar != null) {
            ((ai.c) this.f16796b).i(bVar);
            kvVar.f38165e0.d();
            ai.c cVar = kvVar.f38167g0;
            by0[] by0VarArr = kvVar.f38162b0;
            z1[] z1VarArr = kvVar.f38163c0;
            z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                by0 by0Var = by0VarArr[0];
                boolean z11 = cVar.f766m;
                by0Var.f24849c = z11;
                z1Var.c(z11, true);
            }
            z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                by0 by0Var2 = by0VarArr[1];
                boolean z12 = cVar.f767n;
                by0Var2.f24849c = z12;
                z1Var2.c(z12, true);
            }
            z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                by0 by0Var3 = by0VarArr[2];
                boolean z13 = cVar.f768o;
                by0Var3.f24849c = z13;
                z1Var3.c(z13, true);
            }
            z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                by0 by0Var4 = by0VarArr[3];
                boolean z14 = cVar.f769p;
                by0Var4.f24849c = z14;
                z1Var4.c(z14, true);
            }
            z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                by0 by0Var5 = by0VarArr[4];
                boolean z15 = cVar.f770q;
                by0Var5.f24849c = z15;
                z1Var5.c(z15, true);
            }
            kvVar.f38161a0.a(jvVar.d(), true);
            jvVar.c(true);
        }
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        switch (this.f16795a) {
            case 8:
                j6.q(f7, f10, i10, i11);
                return;
            default:
                f6 f6Var = (f6) this.f16797c;
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
    public int l0() {
        return 0;
    }

    @Override
    public boolean m2(int i10) {
        return false;
    }

    @Override
    public boolean n0(z5 z5Var) {
        return false;
    }

    @Override
    public boolean o0() {
        switch (this.f16795a) {
            case 8:
                return false;
            default:
                f6 f6Var = (f6) this.f16797c;
                if (f6Var == null) {
                    return j6.a1();
                }
                return f6Var.o0();
        }
    }

    public void p() {
        String str = (String) this.f16796b;
        try {
            ba.c cVar = (ba.c) this.f16797c;
            cVar.getClass();
            new File(cVar.f2554b, str).createNewFile();
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e7);
        }
    }

    public void q(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f16797c;
        if (bVar.d.f34c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                m mVar = bVar.d;
                if (i10 < mVar.f34c) {
                    w1.a aVar = (w1.a) mVar.f33b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f32a[i10]);
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
                    printWriter.println(aVar.f47935l);
                    a6.d dVar = aVar.f47935l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f310a);
                    if (dVar.f311b || dVar.f313e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f311b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f313e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f312c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f312c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f315g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f315g);
                        printWriter.print(" waiting=");
                        dVar.f315g.getClass();
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
                    if (aVar.f47937n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f47937n);
                        p pVar = aVar.f47937n;
                        pVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(pVar.f2259b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f47935l;
                    Object obj2 = aVar.f1663e;
                    if (obj2 != z.f1659k) {
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
                    if (aVar.f1662c > 0) {
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
    public r9 q2() {
        return null;
    }

    @Override
    public Task then(Object obj) {
        da.a aVar = (da.a) obj;
        u4.g gVar = (u4.g) this.f16797c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        z0 z0Var = (z0) gVar.f46975c;
        w9.m.b((w9.m) ((z0) gVar.f46975c).f16731c);
        ((w9.m) z0Var.f16731c).f48441m.y((Executor) this.f16796b, null);
        ((w9.m) z0Var.f16731c).f48445q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16795a) {
            case 13:
                return "Bounds{lower=" + ((i0.c) this.f16796b) + " upper=" + ((i0.c) this.f16797c) + "}";
            case 20:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((t) this.f16796b).getClass();
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
    public boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean u1() {
        return false;
    }

    @Override
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f16797c).T0(canvas, (na) this.f16796b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public String w(long j3) {
        String trim = ((EditTextBoldCursor) this.f16796b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((a01) this.f16797c).f24235s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public ColorFilter x() {
        switch (this.f16795a) {
            case 8:
                return j6.f21014v3;
            default:
                f6 f6Var = (f6) this.f16797c;
                if (f6Var == null) {
                    return j6.f21014v3;
                }
                return f6Var.x();
        }
    }

    @Override
    public Object z(ce.c cVar, kd.c cVar2) {
        Object z10 = ((y) this.f16796b).z(new k1.p(cVar, (za.y) this.f16797c), cVar2);
        if (z10 == jd.a.f13640a) {
            return z10;
        }
        return gd.i.f10616a;
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public a(int i10, Object obj, Object obj2) {
        this.f16795a = i10;
        this.f16796b = obj;
        this.f16797c = obj2;
    }

    public a(Object obj, Object obj2, boolean z10, int i10) {
        this.f16795a = i10;
        this.f16797c = obj;
        this.f16796b = obj2;
    }

    public a(Context context) {
        this.f16795a = 26;
        this.f16797c = new AtomicLong(-1L);
        this.f16796b = new com.google.android.gms.common.api.j(context, p6.b.f43982k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4985c);
    }

    public a(a6 a6Var) {
        this.f16795a = 21;
        this.f16797c = new Object();
        this.f16796b = a6Var;
        pa.b();
    }

    public a(f6 f6Var) {
        this.f16795a = 9;
        this.f16796b = new SparseIntArray();
        this.f16797c = f6Var;
        h();
    }

    public a(t tVar, t0 t0Var) {
        this.f16795a = 20;
        this.f16796b = tVar;
        this.f16797c = (w1.b) new aa.a(t0Var, w1.b.f47938f).n(w1.b.class);
    }

    public a(h1 h1Var) {
        this.f16795a = 15;
        this.f16796b = h1Var;
        ?? obj = new Object();
        obj.f45813a = 0;
        this.f16797c = obj;
    }

    @Override
    public void B() {
    }

    @Override
    public void L1() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void e() {
    }

    @Override
    public void e1() {
    }

    public void h() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void w0() {
    }

    public a(int i10) {
        this.f16795a = 24;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f16796b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f16797c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public a(EditText editText) {
        this.f16795a = 10;
        this.f16796b = editText;
        q1.i iVar = new q1.i(editText);
        this.f16797c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f44130b == null) {
            synchronized (q1.a.f44129a) {
                try {
                    if (q1.a.f44130b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f44131c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f44130b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f44130b);
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void A0(t1 t1Var) {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void D1(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(t1 t1Var) {
    }

    @Override
    public void L(t1 t1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void S0(t1 t1Var) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void U0(t1 t1Var) {
    }

    @Override
    public void W1(t1 t1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void e2(t1 t1Var) {
    }

    @Override
    public void g0(t1 t1Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void v0(t1 t1Var) {
    }

    @Override
    public void v1(t1 t1Var) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    private final void K(int i10, int i11) {
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(t1 t1Var, ah.u uVar) {
    }

    @Override
    public void L0(int i10, t1 t1Var) {
    }

    @Override
    public void M(int i10, t1 t1Var) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void N0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(t1 t1Var, long j3) {
    }

    @Override
    public void g1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void j1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void w1(t1 t1Var, boolean z10) {
    }

    public a(z4.g gVar) {
        this.f16795a = 27;
        this.f16797c = gVar;
        this.f16796b = new Rect();
    }

    public a(g31 g31Var) {
        this.f16795a = 8;
        this.f16797c = g31Var;
    }

    public a(PhotoViewer photoViewer) {
        this.f16795a = 7;
        this.f16797c = photoViewer;
        this.f16796b = new na(photoViewer.f33547b0, photoViewer.f33576e0, 0, false);
    }

    @Override
    public void Q0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void o1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void p2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void x0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void y0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void s0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void t0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void T1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
