package m5;

import a0.m;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.t0;
import androidx.lifecycle.z;
import b2.u;
import e0.h;
import e9.l0;
import e9.n0;
import g2.l;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import k2.m0;
import ki.j;
import ki.k;
import mg.c2;
import n2.p;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.as;
import org.telegram.messenger.at;
import org.telegram.messenger.c00;
import org.telegram.messenger.dd;
import org.telegram.messenger.e00;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.ne;
import org.telegram.messenger.pt;
import org.telegram.messenger.qi;
import org.telegram.messenger.r20;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.z60;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.c8;
import org.telegram.ui.dy;
import org.telegram.ui.e8;
import org.telegram.ui.g5;
import org.telegram.ui.h8;
import org.telegram.ui.hy;
import org.telegram.ui.i7;
import org.telegram.ui.k4;
import org.telegram.ui.r01;
import org.telegram.ui.s6;
import org.telegram.ui.ty0;
import org.telegram.ui.un;
import org.telegram.ui.xu;
import org.telegram.ui.y01;
import org.telegram.ui.yu;
import org.xml.sax.Attributes;
import p2.t;
import qh.x;
import qh.y;
import s4.h1;
import s4.i1;
import s5.g;
import s5.i;
import vh.t8;
import w7.na;
import y2.n;
public final class e implements n5.b, nn0, as, fo, t8, i7, kk0, t61, t, x, n {
    public final int f13013a;
    public Object f13014b;
    public Object f13015c;

    public e(int i10, Object obj, Object obj2) {
        this.f13013a = i10;
        this.f13014b = obj;
        this.f13015c = obj2;
    }

    public static e M(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
        int i11;
        byte[] byteArray;
        e eVar = new e(7, false);
        if (bArr != null && bArr.length != 0) {
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    return eVar;
                }
                SerializedData serializedData = new SerializedData();
                serializedData.writeBytes(bArr2, 0, 16);
                serializedData.writeBytes(bArr, i11, 36);
                byte[] byteArray2 = serializedData.toByteArray();
                Pattern pattern = Utilities.f14519a;
                byte[] o10 = Utilities.o(byteArray2.length, byteArray2);
                serializedData.cleanup();
                SerializedData serializedData2 = new SerializedData();
                serializedData2.writeBytes(bArr, i11 + 40, 36);
                serializedData2.writeBytes(bArr2, 0, 16);
                byte[] o11 = Utilities.o(byteArray.length, serializedData2.toByteArray());
                serializedData2.cleanup();
                SerializedData serializedData3 = new SerializedData();
                serializedData3.writeBytes(o10, 0, 8);
                serializedData3.writeBytes(o11, 8, 16);
                serializedData3.writeBytes(o10, 24, 8);
                eVar.f13014b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o11, 0, 8);
                serializedData4.writeBytes(o10, 8, 16);
                serializedData4.writeBytes(o11, 24, 8);
                eVar.f13015c = serializedData4.toByteArray();
                serializedData4.cleanup();
                return eVar;
            }
            SerializedData serializedData5 = new SerializedData();
            serializedData5.writeBytes(bArr2);
            serializedData5.writeBytes(bArr, i11, 32);
            byte[] n10 = Utilities.n(serializedData5.toByteArray());
            serializedData5.cleanup();
            SerializedData serializedData6 = new SerializedData();
            serializedData6.writeBytes(bArr, i11 + 32, 16);
            serializedData6.writeBytes(bArr2);
            serializedData6.writeBytes(bArr, i11 + 48, 16);
            byte[] n11 = Utilities.n(serializedData6.toByteArray());
            serializedData6.cleanup();
            SerializedData serializedData7 = new SerializedData();
            serializedData7.writeBytes(bArr, i11 + 64, 32);
            serializedData7.writeBytes(bArr2);
            byte[] n12 = Utilities.n(serializedData7.toByteArray());
            serializedData7.cleanup();
            SerializedData serializedData8 = new SerializedData();
            serializedData8.writeBytes(bArr2);
            serializedData8.writeBytes(bArr, i11 + 96, 32);
            byte[] n13 = Utilities.n(serializedData8.toByteArray());
            serializedData8.cleanup();
            SerializedData serializedData9 = new SerializedData();
            serializedData9.writeBytes(n10, 0, 8);
            serializedData9.writeBytes(n11, 8, 12);
            serializedData9.writeBytes(n12, 4, 12);
            eVar.f13014b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n10, 8, 12);
            serializedData10.writeBytes(n11, 0, 8);
            serializedData10.writeBytes(n12, 16, 4);
            serializedData10.writeBytes(n13, 0, 8);
            eVar.f13015c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return eVar;
        }
        eVar.f13015c = null;
        eVar.f13014b = null;
        return eVar;
    }

    public void E(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f13015c;
        if (bVar.d.f30c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                m mVar = bVar.d;
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
                    printWriter.println(aVar.f52345l);
                    a6.d dVar = aVar.f52345l;
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
                    if (aVar.f52347n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f52347n);
                        u uVar = aVar.f52347n;
                        uVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(uVar.f2300b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a6.d dVar2 = aVar.f52345l;
                    Object obj2 = aVar.e;
                    if (obj2 != z.f1667k) {
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
                    if (aVar.f1670c > 0) {
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

    public byte[] G(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f13015c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f13014b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f13488a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f13489b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f13490c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public View I(int i10, int i11, int i12, int i13) {
        int i14;
        h1 h1Var = (h1) this.f13015c;
        i1 i1Var = (i1) this.f13014b;
        int s10 = i1Var.s();
        int y3 = i1Var.y();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View C = i1Var.C(i10);
            int k10 = i1Var.k(C);
            int E = i1Var.E(C);
            h1Var.f47951b = s10;
            h1Var.f47952c = y3;
            h1Var.d = k10;
            h1Var.e = E;
            if (i12 != 0) {
                h1Var.f47950a = i12;
                if (h1Var.a()) {
                    return C;
                }
            }
            if (i13 != 0) {
                h1Var.f47950a = i13;
                if (h1Var.a()) {
                    view = C;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public n M1() {
        return new e(25, ((t) this.f13014b).M1(), (List) this.f13015c);
    }

    public String P(String str) {
        ArrayList arrayList = (ArrayList) this.f13014b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                str2 = (String) ((c00) arrayList.get(i10)).f15047a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return e00.l(str, (Attributes) this.f13015c);
        }
        return str2;
    }

    public java.lang.Integer Q(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: m5.e.Q(java.lang.String):java.lang.Integer");
    }

    public String R(String str) {
        Resources resources = (Resources) this.f13014b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f13015c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean S(View view) {
        h1 h1Var = (h1) this.f13015c;
        i1 i1Var = (i1) this.f13014b;
        int s10 = i1Var.s();
        int y3 = i1Var.y();
        int k10 = i1Var.k(view);
        int E = i1Var.E(view);
        h1Var.f47951b = s10;
        h1Var.f47952c = y3;
        h1Var.d = k10;
        h1Var.e = E;
        h1Var.f47950a = 24579;
        return h1Var.a();
    }

    public void T(long j10, byte[] bArr) {
        File file;
        h hVar = (h) this.f13015c;
        if (hVar.f6020b) {
            hVar.f6020b = false;
            ((k) hVar.e).h();
            return;
        }
        k kVar = (k) hVar.e;
        kVar.getClass();
        k.q();
        j jVar = kVar.f11434z;
        if (kVar.G == 5 && jVar != null) {
            file = jVar.f11411b;
        } else {
            file = null;
        }
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = ((ne) this.f13014b).f17287a;
            String[] strArr = MediaController.U1;
            f8.e("AudioRecorderV2 failed", illegalStateException);
            at.f(mediaController.f14455g1).k(at.f14745m2, Integer.valueOf(mediaController.f14453f1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((ne) this.f13014b).f17287a;
        mediaController2.f14459i1 = file;
        mediaController2.f14461j1 = j10;
        mediaController2.G0(file, j10, bArr);
        vi.b0(mediaController2.f14455g1).B1(mediaController2.l1, mediaController2.f14465m1, qi.a(mediaController2, file.getAbsolutePath(), mediaController2.I1));
        at.f(mediaController2.f14455g1).k(at.f14757o2, new Object[0]);
        at.f(mediaController2.f14455g1).k(at.f14782s2, Integer.valueOf(mediaController2.f14453f1), mediaController2.f14450e1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public void U(Exception exc, boolean z10) {
        int i10;
        this.f13015c = null;
        HashSet hashSet = (HashSet) this.f13014b;
        n0 u10 = n0.u(hashSet);
        hashSet.clear();
        l0 listIterator = u10.listIterator(0);
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

    public void V(o0.f fVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f13015c;
        za.c cVar = (za.c) this.f13014b;
        int i10 = fVar.f13922b;
        if (i10 == 0) {
            nVar.execute(new j9.u(22, cVar, fVar.f13921a));
        } else {
            nVar.execute(new c2(cVar, i10));
        }
    }

    public void W(n2.b bVar) {
        ((HashSet) this.f13014b).add(bVar);
        if (((n2.b) this.f13015c) != null) {
            return;
        }
        this.f13015c = bVar;
        p u10 = bVar.f13422b.u();
        bVar.f13442z = u10;
        android.support.v4.media.session.f fVar = bVar.f13436s;
        String str = e2.l0.f6165a;
        u10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.f50028g.getAndIncrement(), true, SystemClock.elapsedRealtime(), u10)).sendToTarget();
    }

    @Override
    public void a(s6 s6Var, sh.a aVar, boolean z10) {
        yu yuVar = (yu) this.f13015c;
        xu xuVar = yuVar.P1;
        if (aVar != null) {
            ((sh.b) this.f13014b).i(aVar);
            yuVar.W1.e();
            sh.b bVar = yuVar.Y1;
            jx0[] jx0VarArr = yuVar.T1;
            org.telegram.ui.Cells.c2[] c2VarArr = yuVar.U1;
            org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                jx0 jx0Var = jx0VarArr[0];
                boolean z11 = bVar.f48517m;
                jx0Var.f27590c = z11;
                c2Var.c(z11, true);
            }
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[1];
            if (c2Var2 != null) {
                jx0 jx0Var2 = jx0VarArr[1];
                boolean z12 = bVar.f48518n;
                jx0Var2.f27590c = z12;
                c2Var2.c(z12, true);
            }
            org.telegram.ui.Cells.c2 c2Var3 = c2VarArr[2];
            if (c2Var3 != null) {
                jx0 jx0Var3 = jx0VarArr[2];
                boolean z13 = bVar.f48519o;
                jx0Var3.f27590c = z13;
                c2Var3.c(z13, true);
            }
            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[3];
            if (c2Var4 != null) {
                jx0 jx0Var4 = jx0VarArr[3];
                boolean z14 = bVar.f48520p;
                jx0Var4.f27590c = z14;
                c2Var4.c(z14, true);
            }
            org.telegram.ui.Cells.c2 c2Var5 = c2VarArr[4];
            if (c2Var5 != null) {
                jx0 jx0Var5 = jx0VarArr[4];
                boolean z15 = bVar.f48521q;
                jx0Var5.f27590c = z15;
                c2Var5.c(z15, true);
            }
            yuVar.S1.a(xuVar.d(), true);
            xuVar.c(true);
        }
    }

    @Override
    public n a2(p2.p pVar, p2.m mVar) {
        return new e(25, ((t) this.f13014b).a2(pVar, mVar), (List) this.f13015c);
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        Rect rect = (Rect) this.f13014b;
        hy hyVar = (hy) this.f13015c;
        if (hyVar.getParentActivity() != null && (view instanceof j4)) {
            ((ImageView) view.getTag(2131296585)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{dd.L0(2131751599, null)}, new dy(this, i10, 0));
                hyVar.showDialog(alertDialog$Builder.f20135a);
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(String str) {
        ((r20) this.f13014b).a(str);
    }

    @Override
    public void dismiss() {
        switch (this.f13013a) {
            case 11:
                ((z60) this.f13014b).u();
                return;
            default:
                ((yu) this.f13015c).dismiss();
                return;
        }
    }

    @Override
    public Object g1(Uri uri, l lVar) {
        t2.a aVar = (t2.a) ((n) this.f13014b).g1(uri, lVar);
        List list = (List) this.f13015c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public Object get() {
        switch (this.f13013a) {
            case 0:
                return new d((Context) ((m0) this.f13014b).f10701a, (li.k) ((l2.f) this.f13015c).get());
            default:
                t7.u uVar = new t7.u(21);
                oa.d dVar = new oa.d(21);
                i iVar = (i) ((zc.a) this.f13014b).get();
                return new g(uVar, dVar, s5.a.f48075f, iVar, (zc.a) this.f13015c);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void i(boolean z10) {
        e8 e8Var = ((c8) this.f13015c).f36221b;
        e8Var.f36775y.finishFragment();
        h8 h8Var = e8Var.f36775y;
        ((un) this.f13014b).e8(h8Var.P, h8Var.Q + 86400, z10);
    }

    @Override
    public void k(boolean z10, float f7) {
        ((TextView) this.f13014b).setText("Alpha " + g5.l1);
        g5.l1 = f7;
        ((g5) this.f13015c).f37353i1.K();
    }

    public ArrayList l() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f13014b;
        Class cls = (Class) ((m2.t) this.f13015c).f12685b;
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
            arrayList2.add(new r9.c(str2, 0));
        }
        return arrayList2;
    }

    @Override
    public void o(y yVar) {
        i0.E2(yVar);
        ((Runnable) this.f13015c).run();
    }

    @Override
    public void onError(v61 v61Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f13015c;
        int i10 = secretMediaViewer.Z;
        if (i10 > 0) {
            secretMediaViewer.Z = i10 - 1;
            i0.h3(new y01(0, this, (File) this.f13014b), 100L);
            return;
        }
        f8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f13015c;
        r01 r01Var = secretMediaViewer.f34000g1;
        if (secretMediaViewer.D != null && secretMediaViewer.f33997f0 != null) {
            i0.r(r01Var);
            i0.g3(r01Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f33986b.getWindow().addFlags(128);
                } catch (Exception e) {
                    f8.g(e, true);
                }
            } else {
                try {
                    secretMediaViewer.f33986b.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
            if (i10 == 3 && secretMediaViewer.f34033x.getVisibility() != 0) {
                secretMediaViewer.f34033x.setVisibility(0);
            }
            if (secretMediaViewer.D.d0() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f34015o1);
                        return;
                    }
                    secretMediaViewer.D.q0(0L, false);
                    secretMediaViewer.D.h0();
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
        k4 k4Var = ((SecretMediaViewer) this.f13015c).f34033x;
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
    public int p0() {
        return 0;
    }

    @Override
    public void q(boolean z10, float f7) {
        eb0 eb0Var = (eb0) this.f13014b;
        pe0 pe0Var = (pe0) this.f13015c;
        v61 v61Var = pe0Var.d;
        if (v61Var != null) {
            long U = v61Var.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j10 = (((f7 / (1.0f - max)) * max) + f7) * ((float) U);
            pe0Var.e = j10;
            pe0Var.d.q0(j10, !z10);
            if (!z10) {
                i0.r(eb0Var);
                i0.h3(eb0Var, 120L);
            }
        }
    }

    @Override
    public void s() {
        ((z60) this.f13014b).u();
        un unVar = (un) this.f13015c;
        unVar.zc(true);
        cc.A(unVar, unVar.getMessagesController().q2(unVar.f42108j6, unVar.b(), null), unVar.f42288xa).j();
    }

    public String toString() {
        switch (this.f13013a) {
            case 20:
                return "Bounds{lower=" + ((i0.c) this.f13014b) + " upper=" + ((i0.c) this.f13015c) + "}";
            case 27:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f13014b).getClass();
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
    public void v() {
        ((z60) this.f13014b).u();
        un unVar = (un) this.f13015c;
        if (unVar.f42108j6 != 0 && unVar.f42059f4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", unVar.f42108j6);
            if (unVar.b() != 0) {
                bundle.putLong("topic_id", unVar.b());
            }
            unVar.presentFragment(new ty0(bundle, unVar.f42288xa));
        }
    }

    @Override
    public void x() {
        int i10;
        ((z60) this.f13014b).u();
        un unVar = (un) this.f13015c;
        i10 = ((k2) unVar).currentAccount;
        SharedPreferences sharedPreferences = wp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + pt.v(unVar.f42108j6, unVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + pt.v(unVar.f42108j6, unVar.b(), false), z11).apply();
        if (cc.a(unVar)) {
            cc.S(z10 ? 1 : 0, unVar, unVar.getResourceProvider()).j();
        }
        unVar.pd(false);
    }

    @Override
    public void y(int i10) {
        un unVar = (un) this.f13015c;
        ((z60) this.f13014b).u();
        if (i10 == 0) {
            if (unVar.getMessagesController().q2(unVar.f42108j6, unVar.b(), null)) {
                unVar.zc(true);
            }
            if (cc.a(unVar)) {
                cc.z(unVar, 4, i10, unVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        unVar.getNotificationsController().H(unVar.f42108j6, i10, unVar.b());
        if (cc.a(unVar)) {
            cc.z(unVar, 5, i10, unVar.getResourceProvider()).j();
        }
    }

    public e(int i10, boolean z10) {
        this.f13013a = i10;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f13015c;
        if (secretMediaViewer.f33984a0) {
            return;
        }
        secretMediaViewer.f33984a0 = true;
        secretMediaViewer.e.invalidate();
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f13013a = i10;
        this.f13015c = obj;
        this.f13014b = obj2;
    }

    public e(Context context) {
        this.f13013a = 3;
        n6.l.g(context);
        Resources resources = context.getResources();
        this.f13014b = resources;
        this.f13015c = resources.getResourcePackageName(2131689566);
    }

    public e(q5.d dVar) {
        this.f13013a = 28;
        this.f13015c = new Object();
        this.f13014b = dVar;
        na.b();
    }

    public e(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f13013a = 27;
        this.f13014b = tVar;
        this.f13015c = (w1.b) new a0(t0Var, w1.b.f52348f).n(w1.b.class);
    }

    public e(pe0 pe0Var) {
        this.f13013a = 12;
        this.f13015c = pe0Var;
        this.f13014b = new eb0(this, 9);
    }

    public e(String str, String str2) {
        this.f13013a = 26;
        this.f13014b = str;
        this.f13015c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public e(i1 i1Var) {
        this.f13013a = 22;
        this.f13014b = i1Var;
        ?? obj = new Object();
        obj.f47950a = 0;
        this.f13015c = obj;
    }

    @Override
    public void C() {
    }

    @Override
    public void K() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void d() {
    }

    @Override
    public void g() {
    }

    @Override
    public void m() {
    }

    @Override
    public void n() {
    }

    public e(int i10) {
        this.f13013a = i10;
        switch (i10) {
            case 2:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f13014b = byteArrayOutputStream;
                this.f13015c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f13014b = new HashSet();
                return;
        }
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void D(float f7) {
    }

    @Override
    public void F(float f7) {
    }

    @Override
    public void J(float f7) {
    }

    @Override
    public void L(float f7) {
    }

    @Override
    public void O(long j10) {
    }

    @Override
    public void e(int i10) {
    }

    @Override
    public void f(float f7) {
    }

    @Override
    public void h(float f7) {
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
    public void p(float f7) {
    }

    @Override
    public void r(float f7) {
    }

    @Override
    public void t(boolean z10) {
    }

    @Override
    public void w(float f7) {
    }

    @Override
    public void z(long j10) {
    }

    public e(hy hyVar) {
        this.f13013a = 14;
        this.f13015c = hyVar;
        this.f13014b = new Rect();
    }

    public e(Attributes attributes, HashMap hashMap) {
        this.f13013a = 8;
        this.f13015c = attributes;
        String l4 = e00.l("style", attributes);
        if (l4 != null) {
            ArrayList arrayList = new ArrayList();
            this.f13014b = arrayList;
            arrayList.add(new c00(l4));
            return;
        }
        String l10 = e00.l("class", attributes);
        if (l10 != null) {
            this.f13014b = new ArrayList();
            for (String str : l10.split(" ")) {
                c00 c00Var = (c00) hashMap.get(str.trim());
                if (c00Var != null) {
                    ((ArrayList) this.f13014b).add(c00Var);
                }
            }
        }
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void H(float f7, int i10) {
    }

    @Override
    public void N(int i10, long j10) {
    }

    @Override
    public void j(long j10, boolean z10) {
    }

    @Override
    public void u(float f7, int i10) {
    }
}
