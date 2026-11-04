package mi;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import gi.za;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.ge;
import org.telegram.messenger.gi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.iz;
import org.telegram.messenger.kz;
import org.telegram.messenger.li;
import org.telegram.messenger.us;
import org.telegram.messenger.ye;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.zh;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cx;
import org.telegram.ui.d8;
import org.telegram.ui.f8;
import org.telegram.ui.i8;
import org.telegram.ui.j7;
import org.telegram.ui.qv0;
import org.telegram.ui.t6;
import org.telegram.ui.tt;
import org.telegram.ui.ty0;
import org.telegram.ui.ut;
import org.telegram.ui.wm;
import org.telegram.ui.xw;
import org.telegram.ui.yw0;
import org.xml.sax.Attributes;
public final class h0 implements g1, g2.e, om0, ir, wn, za, j7, ij0, k51, com.google.android.gms.common.api.internal.p, p5.b, zh {
    public final int f19643a;
    public Object f19644b;
    public Object f19645c;

    public h0(int i3, Object obj, Object obj2) {
        this.f19643a = i3;
        this.f19645c = obj;
        this.f19644b = obj2;
    }

    public static h0 x(int i3, boolean z10, byte[] bArr, byte[] bArr2) {
        int i10;
        byte[] byteArray;
        h0 h0Var = new h0(6, false);
        if (bArr != null && bArr.length != 0) {
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    return h0Var;
                }
                SerializedData serializedData = new SerializedData();
                serializedData.writeBytes(bArr2, 0, 16);
                serializedData.writeBytes(bArr, i10, 36);
                byte[] byteArray2 = serializedData.toByteArray();
                Pattern pattern = Utilities.f21384a;
                byte[] o10 = Utilities.o(byteArray2.length, byteArray2);
                serializedData.cleanup();
                SerializedData serializedData2 = new SerializedData();
                serializedData2.writeBytes(bArr, i10 + 40, 36);
                serializedData2.writeBytes(bArr2, 0, 16);
                byte[] o11 = Utilities.o(byteArray.length, serializedData2.toByteArray());
                serializedData2.cleanup();
                SerializedData serializedData3 = new SerializedData();
                serializedData3.writeBytes(o10, 0, 8);
                serializedData3.writeBytes(o11, 8, 16);
                serializedData3.writeBytes(o10, 24, 8);
                h0Var.f19644b = serializedData3.toByteArray();
                serializedData3.cleanup();
                SerializedData serializedData4 = new SerializedData();
                serializedData4.writeBytes(o11, 0, 8);
                serializedData4.writeBytes(o10, 8, 16);
                serializedData4.writeBytes(o11, 24, 8);
                h0Var.f19645c = serializedData4.toByteArray();
                serializedData4.cleanup();
                return h0Var;
            }
            SerializedData serializedData5 = new SerializedData();
            serializedData5.writeBytes(bArr2);
            serializedData5.writeBytes(bArr, i10, 32);
            byte[] n4 = Utilities.n(serializedData5.toByteArray());
            serializedData5.cleanup();
            SerializedData serializedData6 = new SerializedData();
            serializedData6.writeBytes(bArr, i10 + 32, 16);
            serializedData6.writeBytes(bArr2);
            serializedData6.writeBytes(bArr, i10 + 48, 16);
            byte[] n10 = Utilities.n(serializedData6.toByteArray());
            serializedData6.cleanup();
            SerializedData serializedData7 = new SerializedData();
            serializedData7.writeBytes(bArr, i10 + 64, 32);
            serializedData7.writeBytes(bArr2);
            byte[] n11 = Utilities.n(serializedData7.toByteArray());
            serializedData7.cleanup();
            SerializedData serializedData8 = new SerializedData();
            serializedData8.writeBytes(bArr2);
            serializedData8.writeBytes(bArr, i10 + 96, 32);
            byte[] n12 = Utilities.n(serializedData8.toByteArray());
            serializedData8.cleanup();
            SerializedData serializedData9 = new SerializedData();
            serializedData9.writeBytes(n4, 0, 8);
            serializedData9.writeBytes(n10, 8, 12);
            serializedData9.writeBytes(n11, 4, 12);
            h0Var.f19644b = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(n4, 8, 12);
            serializedData10.writeBytes(n10, 0, 8);
            serializedData10.writeBytes(n11, 16, 4);
            serializedData10.writeBytes(n12, 0, 8);
            h0Var.f19645c = serializedData10.toByteArray();
            serializedData10.cleanup();
            return h0Var;
        }
        h0Var.f19645c = null;
        h0Var.f19644b = null;
        return h0Var;
    }

    @Override
    public void A(int i3, int i10) {
        ((j0) this.f19644b).q1(i3, i10);
    }

    public com.google.android.datatransport.cct.CctBackendFactory B(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: mi.h0.B(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public void B1(Editable editable) {
        ((k0) this.f19645c).i();
        ((j0) this.f19644b).F1();
    }

    public String E(String str) {
        ArrayList arrayList = (ArrayList) this.f19644b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                str2 = (String) ((iz) arrayList.get(i3)).f23616a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return kz.l(str, (Attributes) this.f19645c);
        }
        return str2;
    }

    public File F() {
        if (((File) this.f19644b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f19644b) == null) {
                        String str = "PersistedInstallation." + ((n9.h) this.f19645c).d() + ".json";
                        n9.h hVar = (n9.h) this.f19645c;
                        hVar.a();
                        File file = new File(hVar.f20296a.getNoBackupFilesDir(), str);
                        this.f19644b = file;
                        if (file.exists()) {
                            return (File) this.f19644b;
                        }
                        n9.h hVar2 = (n9.h) this.f19645c;
                        hVar2.a();
                        File file2 = new File(hVar2.f20296a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f19644b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f19644b;
    }

    public java.lang.Integer G(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: mi.h0.G(java.lang.String):java.lang.Integer");
    }

    public String J(String str) {
        Resources resources = (Resources) this.f19644b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f19645c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public l9.y L(d2.q0 q0Var) {
        Uri uri;
        byte[] bArr;
        k4.j jVar = (k4.j) this.f19645c;
        if (jVar != null && (((uri = (Uri) jVar.f16870b) != null && uri.equals(q0Var.f8318n)) || ((bArr = (byte[]) jVar.f16869a) != null && Arrays.equals(bArr, q0Var.f8315k)))) {
            l9.y yVar = (l9.y) ((k4.j) this.f19645c).f16871c;
            yVar.getClass();
            return yVar;
        }
        l9.y L = ((g2.e) this.f19644b).L(q0Var);
        if (L == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f16869a = q0Var.f8315k;
        obj.f16870b = q0Var.f8318n;
        obj.f16871c = L;
        this.f19645c = obj;
        return L;
    }

    @Override
    public boolean L1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public boolean M0(h1 h1Var) {
        return false;
    }

    public void N(va.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f56492a);
            jSONObject.put("Status", o1.g.c(bVar.f56493b));
            jSONObject.put("AuthToken", bVar.f56494c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f56496f);
            jSONObject.put("ExpiresInSecs", bVar.f56495e);
            jSONObject.put("FisError", bVar.f56497g);
            n9.h hVar = (n9.h) this.f19645c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f20296a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(F())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean O(View view) {
        u4.h1 h1Var = (u4.h1) this.f19645c;
        u4.i1 i1Var = (u4.i1) this.f19644b;
        int g7 = i1Var.g();
        int i3 = i1Var.i();
        int d = i1Var.d(view);
        int l10 = i1Var.l(view);
        h1Var.f55582b = g7;
        h1Var.f55583c = i3;
        h1Var.d = d;
        h1Var.f55584e = l10;
        h1Var.f55581a = 24579;
        return h1Var.a();
    }

    public void Q(long j10, byte[] bArr) {
        File file;
        e0.g gVar = (e0.g) this.f19645c;
        if (gVar.f9234b) {
            gVar.f9234b = false;
            ((vi.j) gVar.f9236e).h();
            return;
        }
        vi.j jVar = (vi.j) gVar.f9236e;
        jVar.getClass();
        vi.j.q();
        vi.i iVar = jVar.f57003z;
        if (jVar.G == 5 && iVar != null) {
            file = iVar.f56978b;
        } else {
            file = null;
        }
        if (file == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Preview file is unavailable");
            MediaController mediaController = ((ge) this.f19644b).f22707a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", illegalStateException);
            hs.f(mediaController.f21323i1).k(hs.f23265m2, Integer.valueOf(mediaController.f21321h1));
            mediaController.x(false);
            return;
        }
        MediaController mediaController2 = ((ge) this.f19644b).f22707a;
        mediaController2.k1 = file;
        mediaController2.f21328l1 = j10;
        mediaController2.G0(file, j10, bArr);
        li.b0(mediaController2.f21323i1).B1(mediaController2.f21331n1, mediaController2.f21333o1, gi.a(mediaController2, file.getAbsolutePath(), mediaController2.K1));
        hs.f(mediaController2.f21323i1).k(hs.f23276o2, new Object[0]);
        hs.f(mediaController2.f21323i1).k(hs.f23301s2, Integer.valueOf(mediaController2.f21321h1), mediaController2.f21319g1, file.getAbsolutePath());
        mediaController2.Y(false);
        MediaController.j0(false);
    }

    public void S(Exception exc, boolean z10) {
        int i3;
        this.f19645c = null;
        HashSet hashSet = (HashSet) this.f19644b;
        g9.i0 q10 = g9.i0.q(hashSet);
        hashSet.clear();
        g9.g0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            p2.b bVar = (p2.b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i3 = 1;
            } else {
                i3 = 3;
            }
            bVar.l(i3, exc);
        }
    }

    public void U(o0.g gVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f19645c;
        gi.w5 w5Var = (gi.w5) this.f19644b;
        int i3 = gVar.f20490b;
        if (i3 == 0) {
            oVar.execute(new l9.u(23, w5Var, gVar.f20489a));
        } else {
            oVar.execute(new b0(w5Var, i3));
        }
    }

    @Override
    public void V0(h1 h1Var) {
        ((j0) this.f19644b).u();
    }

    @Override
    public boolean X1(boolean z10) {
        return false;
    }

    @Override
    public void Y(ng ngVar) {
        ngVar.run();
    }

    public void Z(p2.b bVar) {
        ((HashSet) this.f19644b).add(bVar);
        if (((p2.b) this.f19645c) != null) {
            return;
        }
        this.f19645c = bVar;
        p2.p W = bVar.f53073b.W();
        bVar.f53094z = W;
        android.support.v4.media.session.f fVar = bVar.f53088s;
        String str = g2.n0.f11873a;
        W.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new p2.a(w2.u.f57230g.getAndIncrement(), true, SystemClock.elapsedRealtime(), W)).sendToTarget();
    }

    @Override
    public void a(t6 t6Var, di.b bVar, boolean z10) {
        ut utVar = (ut) this.f19645c;
        tt ttVar = utVar.Q1;
        if (bVar != null) {
            ((di.c) this.f19644b).i(bVar);
            utVar.X1.e();
            di.c cVar = utVar.Z1;
            dw0[] dw0VarArr = utVar.U1;
            org.telegram.ui.Cells.c2[] c2VarArr = utVar.V1;
            org.telegram.ui.Cells.c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                dw0 dw0Var = dw0VarArr[0];
                boolean z11 = cVar.f9196m;
                dw0Var.f33202c = z11;
                c2Var.c(z11, true);
            }
            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[1];
            if (c2Var2 != null) {
                dw0 dw0Var2 = dw0VarArr[1];
                boolean z12 = cVar.f9197n;
                dw0Var2.f33202c = z12;
                c2Var2.c(z12, true);
            }
            org.telegram.ui.Cells.c2 c2Var3 = c2VarArr[2];
            if (c2Var3 != null) {
                dw0 dw0Var3 = dw0VarArr[2];
                boolean z13 = cVar.f9198o;
                dw0Var3.f33202c = z13;
                c2Var3.c(z13, true);
            }
            org.telegram.ui.Cells.c2 c2Var4 = c2VarArr[3];
            if (c2Var4 != null) {
                dw0 dw0Var4 = dw0VarArr[3];
                boolean z14 = cVar.f9199p;
                dw0Var4.f33202c = z14;
                c2Var4.c(z14, true);
            }
            org.telegram.ui.Cells.c2 c2Var5 = c2VarArr[4];
            if (c2Var5 != null) {
                dw0 dw0Var5 = dw0VarArr[4];
                boolean z15 = cVar.f9200q;
                dw0Var5.f33202c = z15;
                c2Var5.c(z15, true);
            }
            utVar.T1.a(ttVar.d(), true);
            ttVar.c(true);
        }
    }

    @Override
    public void accept(java.lang.Object r51, java.lang.Object r52) {
        throw new UnsupportedOperationException("Method not decompiled: mi.h0.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public boolean mo20b(float f10, float f11, int i3, View view) {
        Rect rect = (Rect) this.f19644b;
        cx cxVar = (cx) this.f19645c;
        if (cxVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            ((ImageView) view.getTag(2131296585)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{bd.M0(2131751599, null)}, new xw(this, i3, 0));
                cxVar.showDialog(alertDialog$Builder.f27343a);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean c0(h1 h1Var) {
        return false;
    }

    @Override
    public void dismiss() {
        switch (this.f19643a) {
            case 10:
                ((f60) this.f19644b).u();
                return;
            default:
                ((ut) this.f19645c).dismiss();
                return;
        }
    }

    public byte[] e(p3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f19645c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f19644b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f53138a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f53139b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f53140c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f53141e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public va.b e0() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(F());
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
        int i3 = va.b.h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i10 = o1.g.d(5)[optInt];
        if (i10 != 0) {
            byte b11 = (byte) (((byte) (b10 | 2)) | 1);
            if (b11 == 3 && i10 != 0) {
                return new va.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            StringBuilder sb2 = new StringBuilder();
            if (i10 == 0) {
                sb2.append(" registrationStatus");
            }
            if ((b11 & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((b11 & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    @Override
    public void f(h1 h1Var) {
        ((j0) this.f19644b).f(h1Var);
    }

    public View g(int i3, int i10, int i11, int i12) {
        int i13;
        u4.h1 h1Var = (u4.h1) this.f19645c;
        u4.i1 i1Var = (u4.i1) this.f19644b;
        int g7 = i1Var.g();
        int i14 = i1Var.i();
        if (i10 > i3) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i3 != i10) {
            View j10 = i1Var.j(i3);
            int d = i1Var.d(j10);
            int l10 = i1Var.l(j10);
            h1Var.f55582b = g7;
            h1Var.f55583c = i14;
            h1Var.d = d;
            h1Var.f55584e = l10;
            if (i11 != 0) {
                h1Var.f55581a = i11;
                if (h1Var.a()) {
                    return j10;
                }
            }
            if (i12 != 0) {
                h1Var.f55581a = i12;
                if (h1Var.a()) {
                    view = j10;
                }
            }
            i3 += i13;
        }
        return view;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public void g1(CharSequence charSequence) {
        ((j0) this.f19644b).W0(charSequence);
    }

    @Override
    public Object mo5get() {
        kb.a aVar = new kb.a(27);
        v7.s sVar = new v7.s(26);
        Object mo5get = ((cd.a) this.f19644b).mo5get();
        cd.a aVar2 = (cd.a) this.f19645c;
        return new u5.g(aVar, sVar, u5.a.f55710f, (u5.i) mo5get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void k(boolean z10, float f10) {
        ((TextView) this.f19644b).setText("Alpha " + org.telegram.ui.j5.m1);
        org.telegram.ui.j5.m1 = f10;
        ((org.telegram.ui.j5) this.f19645c).f46497j1.L();
    }

    @Override
    public void l(h1 h1Var, int i3, int i10) {
        h9 O0;
        j0 j0Var = (j0) this.f19644b;
        if (!((k0) this.f19645c).d && i3 != i10 && (O0 = j0Var.O0()) != null) {
            if (!O0.x() || O0.W != j0Var.e1()) {
                h1Var.post(new g0(this, h1Var, i10, O0, j0Var, i3));
            }
        }
    }

    @Override
    public boolean m() {
        return ((j0) this.f19644b).l1();
    }

    @Override
    public void o(boolean z10) {
        f8 f8Var = ((d8) this.f19645c).f44588b;
        f8Var.f45185y.finishFragment();
        i8 i8Var = f8Var.f45185y;
        ((wm) this.f19644b).h8(i8Var.Q, i8Var.R + 86400, z10);
    }

    @Override
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = (bi) this.f19644b;
        try {
            HashMap<Object, Object> selectedPhotos = biVar.f32215b2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                ye yeVar = (ye) selectedPhotos.values().iterator().next();
                String str = yeVar.h;
                if (str == null) {
                    str = yeVar.I;
                }
                ug.f0 f0Var = (ug.f0) this.f19645c;
                f0Var.d0(f0Var.f0(str, true));
                biVar.dismiss();
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public void onError(m51 m51Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f19645c;
        int i3 = secretMediaViewer.f41926a0;
        if (i3 > 0) {
            secretMediaViewer.f41926a0 = i3 - 1;
            org.telegram.messenger.g0.i3(new qv0(11, this, (File) this.f19644b), 100L);
            return;
        }
        a8.g(exc, true);
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f19645c;
        ty0 ty0Var = secretMediaViewer.f41945h1;
        if (secretMediaViewer.E != null && secretMediaViewer.f41942g0 != null) {
            org.telegram.messenger.g0.r(ty0Var);
            org.telegram.messenger.g0.h3(ty0Var);
            if (i3 != 4 && i3 != 1) {
                try {
                    secretMediaViewer.f41928b.getWindow().addFlags(128);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                try {
                    secretMediaViewer.f41928b.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (i3 == 3 && secretMediaViewer.f41976x.getVisibility() != 0) {
                secretMediaViewer.f41976x.setVisibility(0);
            }
            if (secretMediaViewer.E.d0() && i3 != 4) {
                if (!secretMediaViewer.F) {
                    secretMediaViewer.F = true;
                }
            } else if (secretMediaViewer.F) {
                secretMediaViewer.F = false;
                if (i3 == 4) {
                    secretMediaViewer.I = true;
                    if (secretMediaViewer.J) {
                        secretMediaViewer.e(true, !secretMediaViewer.f41959p1);
                        return;
                    }
                    secretMediaViewer.E.q0(0L, false);
                    secretMediaViewer.E.h0();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        float f11;
        org.telegram.ui.l4 l4Var = ((SecretMediaViewer) this.f19645c).f41976x;
        if (l4Var != null) {
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = (i3 * f10) / i10;
            }
            l4Var.a(f11, 0);
        }
    }

    @Override
    public void q() {
        ((f60) this.f19644b).u();
        wm wmVar = (wm) this.f19645c;
        wmVar.Ec(true);
        fc.A(wmVar, wmVar.getMessagesController().r2(wmVar.f51376k6, wmVar.b(), null), wmVar.f51557ya).j();
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public void t() {
        ((f60) this.f19644b).u();
        wm wmVar = (wm) this.f19645c;
        if (wmVar.f51376k6 != 0 && wmVar.f51325g4 != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", wmVar.f51376k6);
            if (wmVar.b() != 0) {
                bundle.putLong("topic_id", wmVar.b());
            }
            wmVar.presentFragment(new yw0(bundle, wmVar.f51557ya));
        }
    }

    public String toString() {
        switch (this.f19643a) {
            case 20:
                return "Bounds{lower=" + ((i0.b) this.f19644b) + " upper=" + ((i0.b) this.f19645c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public l9.y u(byte[] bArr) {
        byte[] bArr2;
        k4.j jVar = (k4.j) this.f19645c;
        if (jVar != null && (bArr2 = (byte[]) jVar.f16869a) != null && Arrays.equals(bArr2, bArr)) {
            l9.y yVar = (l9.y) ((k4.j) this.f19645c).f16871c;
            yVar.getClass();
            return yVar;
        }
        l9.y u10 = ((g2.e) this.f19644b).u(bArr);
        ?? obj = new Object();
        obj.f16869a = bArr;
        obj.f16870b = null;
        obj.f16871c = u10;
        this.f19645c = obj;
        return u10;
    }

    @Override
    public void v() {
        int i3;
        ((f60) this.f19644b).u();
        wm wmVar = (wm) this.f19645c;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        SharedPreferences sharedPreferences = hp.s1(i3).f22989d7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + us.v(wmVar.f51376k6, wmVar.b(), false), true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + us.v(wmVar.f51376k6, wmVar.b(), false), z11).apply();
        if (fc.a(wmVar)) {
            fc.S(z10 ? 1 : 0, wmVar, wmVar.getResourceProvider()).j();
        }
        wmVar.ud(false);
    }

    @Override
    public void w(boolean z10, float f10) {
        jb0 jb0Var = (jb0) this.f19644b;
        od0 od0Var = (od0) this.f19645c;
        m51 m51Var = od0Var.d;
        if (m51Var != null) {
            long U = m51Var.U();
            float max = 2.8f / ((float) Math.max(60L, U));
            long j10 = (((f10 / (1.0f - max)) * max) + f10) * ((float) U);
            od0Var.f36809e = j10;
            od0Var.d.q0(j10, !z10);
            if (!z10) {
                org.telegram.messenger.g0.r(jb0Var);
                org.telegram.messenger.g0.i3(jb0Var, 120L);
            }
        }
    }

    @Override
    public void z(int i3) {
        wm wmVar = (wm) this.f19645c;
        ((f60) this.f19644b).u();
        if (i3 == 0) {
            if (wmVar.getMessagesController().r2(wmVar.f51376k6, wmVar.b(), null)) {
                wmVar.Ec(true);
            }
            if (fc.a(wmVar)) {
                fc.z(wmVar, 4, i3, wmVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        wmVar.getNotificationsController().H(wmVar.f51376k6, i3, wmVar.b());
        if (fc.a(wmVar)) {
            fc.z(wmVar, 5, i3, wmVar.getResourceProvider()).j();
        }
    }

    public h0(int i3, boolean z10) {
        this.f19643a = i3;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f19645c;
        if (secretMediaViewer.f41929b0) {
            return;
        }
        secretMediaViewer.f41929b0 = true;
        secretMediaViewer.f41936e.invalidate();
    }

    public h0(Object obj, int i3) {
        this.f19643a = i3;
        this.f19644b = obj;
    }

    public h0(Object obj, Object obj2, boolean z10, int i3) {
        this.f19643a = i3;
        this.f19644b = obj;
        this.f19645c = obj2;
    }

    public h0(od0 od0Var) {
        this.f19643a = 11;
        this.f19645c = od0Var;
        this.f19644b = new jb0(this, 6);
    }

    public h0(n9.h hVar) {
        this.f19643a = 29;
        this.f19645c = hVar;
    }

    public h0(String str, String str2) {
        this.f19643a = 28;
        this.f19644b = str;
        this.f19645c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public h0(Context context, int i3) {
        this.f19643a = i3;
        switch (i3) {
            case 18:
                p6.m.g(context);
                Resources resources = context.getResources();
                this.f19644b = resources;
                this.f19645c = resources.getResourcePackageName(2131689567);
                return;
            default:
                this.f19645c = null;
                this.f19644b = context;
                return;
        }
    }

    public h0(u4.i1 i1Var) {
        this.f19643a = 24;
        this.f19644b = i1Var;
        ?? obj = new Object();
        obj.f55581a = 0;
        this.f19645c = obj;
    }

    public h0(EditText editText) {
        this.f19643a = 21;
        this.f19644b = editText;
        s1.i iVar = new s1.i(editText);
        this.f19645c = iVar;
        editText.addTextChangedListener(iVar);
        if (s1.a.f54573b == null) {
            synchronized (s1.a.f54572a) {
                try {
                    if (s1.a.f54573b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            s1.a.f54574c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, s1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        s1.a.f54573b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(s1.a.f54573b);
    }

    public h0(int i3) {
        this.f19643a = i3;
        switch (i3) {
            case 17:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f19644b = byteArrayOutputStream;
                this.f19645c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                this.f19644b = new HashSet();
                return;
        }
    }

    public h0(cx cxVar) {
        this.f19643a = 13;
        this.f19645c = cxVar;
        this.f19644b = new Rect();
    }

    public h0(Attributes attributes, HashMap hashMap) {
        this.f19643a = 7;
        this.f19645c = attributes;
        String l10 = kz.l("style", attributes);
        if (l10 != null) {
            ArrayList arrayList = new ArrayList();
            this.f19644b = arrayList;
            arrayList.add(new iz(l10));
            return;
        }
        String l11 = kz.l("class", attributes);
        if (l11 != null) {
            this.f19644b = new ArrayList();
            for (String str : l11.split(" ")) {
                iz izVar = (iz) hashMap.get(str.trim());
                if (izVar != null) {
                    ((ArrayList) this.f19644b).add(izVar);
                }
            }
        }
    }

    @Override
    public void D() {
    }

    @Override
    public void X() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void d() {
    }

    @Override
    public void h() {
    }

    @Override
    public void p() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void s() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void I(float f10) {
    }

    @Override
    public void I0(Object obj) {
    }

    @Override
    public void K(long j10) {
    }

    @Override
    public void M(boolean z10) {
    }

    @Override
    public void R(float f10) {
    }

    @Override
    public void T(float f10) {
    }

    @Override
    public void W(float f10) {
    }

    @Override
    public void a0(float f10) {
    }

    @Override
    public void a1(TLRPC.User user) {
    }

    @Override
    public void c(int i3) {
    }

    @Override
    public void d0(long j10) {
    }

    @Override
    public void i(float f10) {
    }

    @Override
    public void j(float f10) {
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void y(float f10) {
    }

    @Override
    public void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    @Override
    public void H(float f10, int i3) {
    }

    @Override
    public void P(float f10, int i3) {
    }

    @Override
    public void V(float f10, int i3) {
    }

    @Override
    public void b0(int i3, long j10) {
    }

    @Override
    public void n(long j10, boolean z10) {
    }
}
