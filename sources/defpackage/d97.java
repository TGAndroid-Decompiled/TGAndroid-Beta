package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
public final class d97 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public d97(a28 a28Var, View view, h19 h19Var, boolean z, boolean z2) {
        this.a = (byte) 9;
        this.c = a28Var;
        this.d = view;
        this.e = h19Var;
        this.b = z;
    }

    @Override
    public final void run() {
        int i;
        char c;
        int size;
        boolean z;
        boolean z2;
        vf6 vf6Var;
        boolean z3;
        Integer num;
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        Integer num2;
        Integer num3;
        Integer num4;
        int i5;
        int i6;
        byte[] bArr;
        byte[] bArr2;
        boolean z4;
        File file;
        int i7;
        long min;
        int i8;
        boolean z5;
        Bitmap.CompressFormat compressFormat;
        Object[] objArr;
        String[] split;
        byte[] bArr3 = null;
        Boolean bool = null;
        bArr3 = null;
        switch (this.a) {
            case 0:
                na7 na7Var = (na7) this.c;
                boolean z6 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                if (z6) {
                    i = 0;
                    na7Var.getNotificationCenter().k(2, 64);
                } else {
                    i = 0;
                }
                na7Var.q5(i, -updates.chat_id, arrayList2);
                na7Var.getNotificationCenter().k(3, new Object[i]);
                return;
            case 1:
                r97 r97Var = (r97) this.c;
                TLObject tLObject = (TLObject) this.e;
                boolean z7 = this.b;
                int i9 = r97Var.a;
                ArrayList arrayList3 = r97Var.e;
                if (((int[]) this.d)[0] == r97Var.f) {
                    r97Var.c = false;
                    r97Var.f = -1;
                    if (tLObject instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                        na7.q1(i9).U3(messages_chats.chats, false);
                        if (z7) {
                            arrayList3.clear();
                        }
                        arrayList3.addAll(messages_chats.chats);
                        if (messages_chats instanceof TLRPC.TL_messages_chatsSlice) {
                            size = messages_chats.count;
                        } else {
                            size = messages_chats.chats.size();
                        }
                        r97Var.g = size;
                        if (arrayList3.size() >= r97Var.g) {
                            z = true;
                        } else {
                            z = false;
                        }
                        r97Var.d = z;
                        c = 1;
                    } else {
                        c = 1;
                        r97Var.d = true;
                    }
                    kk7 f = kk7.f(i9);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Long.valueOf(r97Var.b);
                    objArr2[c] = r97Var;
                    f.k(242, objArr2);
                    return;
                }
                return;
            case 2:
                ((ad7) this.c).k1((List) this.d, (List) this.e, this.b);
                return;
            case 3:
                im7 im7Var = (im7) this.c;
                vf6 vf6Var2 = (vf6) this.d;
                boolean z8 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = im7Var.b;
                vf6 vf6Var3 = im7Var.c;
                vf6 vf6Var4 = im7Var.f;
                int i10 = im7Var.J;
                im7Var.getAccountInstance().d();
                Integer num5 = 0;
                int i11 = 0;
                while (i11 < vf6Var2.m()) {
                    long j = vf6Var2.j(i11);
                    SparseArray sparseArray = (SparseArray) vf6Var3.f(j);
                    if (sparseArray == null) {
                        vf6Var = vf6Var2;
                        z3 = z8;
                        num = num5;
                        i2 = i11;
                    } else {
                        ArrayList arrayList6 = (ArrayList) vf6Var2.f(j);
                        int i12 = 0;
                        for (int size2 = arrayList6.size(); i12 < size2; size2 = i4) {
                            vf6 vf6Var5 = vf6Var2;
                            int intValue = ((Integer) arrayList6.get(i12)).intValue();
                            boolean z9 = z8;
                            k27 k27Var = (k27) sparseArray.get(intValue);
                            Integer num6 = num5;
                            if (k27Var == null || k27Var.J || (z9 && !k27Var.I)) {
                                i3 = i11;
                                arrayList = arrayList6;
                                i4 = size2;
                            } else {
                                i3 = i11;
                                long B0 = k27.B0(k27Var.k);
                                Integer num7 = (Integer) vf6Var4.f(B0);
                                if (num7 == null) {
                                    num2 = num6;
                                } else {
                                    num2 = num7;
                                }
                                int intValue2 = num2.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    arrayList = arrayList6;
                                    im7Var.e.l(B0);
                                    Integer num8 = num2;
                                    i4 = size2;
                                    num3 = num8;
                                    num4 = num6;
                                } else {
                                    arrayList = arrayList6;
                                    Integer num9 = num2;
                                    i4 = size2;
                                    num3 = num9;
                                    num4 = valueOf;
                                }
                                if (!num4.equals(num3)) {
                                    Integer num10 = num3;
                                    if (!im7Var.getMessagesController().l2(B0)) {
                                        boolean r2 = im7Var.getMessagesController().r2(B0);
                                        int i13 = im7Var.J;
                                        if (r2) {
                                            if (num10.intValue() > 0) {
                                                i5 = 1;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i14 = i13 - i5;
                                            im7Var.J = i14;
                                            if (num4.intValue() > 0) {
                                                i6 = 1;
                                            } else {
                                                i6 = 0;
                                            }
                                            im7Var.J = i14 + i6;
                                        } else {
                                            int intValue3 = i13 - num10.intValue();
                                            im7Var.J = intValue3;
                                            im7Var.J = num4.intValue() + intValue3;
                                        }
                                    }
                                    vf6Var4.k(num4, B0);
                                }
                                if (num4.intValue() == 0) {
                                    vf6Var4.l(B0);
                                    im7Var.r.l(B0);
                                }
                                sparseArray.remove(intValue);
                                arrayList5.remove(k27Var);
                                im7Var.a.remove(k27Var);
                                if (im7.y(k27Var)) {
                                    im7Var.K--;
                                }
                                arrayList4.add(k27Var);
                            }
                            i12++;
                            num5 = num6;
                            i11 = i3;
                            vf6Var2 = vf6Var5;
                            z8 = z9;
                            arrayList6 = arrayList;
                        }
                        vf6Var = vf6Var2;
                        z3 = z8;
                        num = num5;
                        i2 = i11;
                        if (sparseArray.size() == 0) {
                            vf6Var3.l(j);
                        }
                    }
                    i11 = i2 + 1;
                    num5 = num;
                    vf6Var2 = vf6Var;
                    z8 = z3;
                }
                if (!arrayList4.isEmpty()) {
                    gl.d3(new yl7(im7Var, arrayList4, (byte) 1));
                }
                if (i10 != im7Var.J) {
                    if (!im7Var.L) {
                        arrayList5.clear();
                        im7Var.Z(im7Var.L);
                    } else {
                        if (im7Var.M > im7Var.getConnectionsManager().getCurrentTime()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        im7Var.Q(z2);
                    }
                    gl.d3(new cm7(im7Var, vf6Var4.m(), (byte) 1));
                }
                im7Var.L = false;
                if (im7Var.S) {
                    im7Var.S(im7Var.t());
                    return;
                }
                return;
            case 4:
                gu7 gu7Var = (gu7) this.c;
                boolean z10 = this.b;
                gu7Var.f.f(new eu7(gu7Var, (qx) this.d, (byte) 0));
                gu7Var.f.f(new eu7(gu7Var, (qx) this.e, (byte) 0));
                gu7Var.E = z10;
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z11 = this.b;
                vx7 vx7Var = ((lx7) this.c).e;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    vx7Var.K = password;
                    TwoStepVerificationActivity.e0(password);
                    vx7Var.D1(z11);
                    return;
                }
                return;
            case 6:
                lx7 lx7Var = (lx7) this.c;
                String str = (String) this.e;
                boolean z12 = this.b;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                vx7 vx7Var2 = lx7Var.e;
                if (tL_secureSecretSettings != null) {
                    vx7Var2.d1 = tL_secureSecretSettings.secure_secret;
                    vx7Var2.c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        vx7Var2.f1 = Utilities.s(bArr, gl.g1(str), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        vx7Var2.f1 = Utilities.m(gl.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        gl.d3(new d97(lx7Var, passwordsettings, z12, bArr2, (byte) 7));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        gl.d3(new oq7(lx7Var, (byte) 8));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = vx7Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        vx7Var2.f1 = Utilities.m(gl.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    vx7Var2.d1 = null;
                    vx7Var2.c1 = 0L;
                }
                bArr2 = bArr;
                gl.d3(new d97(lx7Var, passwordsettings, z12, bArr2, (byte) 7));
                return;
            case 7:
                lx7 lx7Var2 = (lx7) this.c;
                boolean z13 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                vx7 vx7Var3 = lx7Var2.e;
                vx7Var3.e1 = ((TL_account.passwordSettings) this.d).email;
                if (z13) {
                    vx7Var3.f1 = vx7Var3.Q0;
                }
                byte[] bArr7 = vx7Var3.d1;
                byte[] bArr8 = vx7Var3.f1;
                if (bArr7 != null && bArr7.length == 32) {
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr9, 0, 32);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 32, bArr10, 0, 16);
                    byte[] bArr11 = new byte[32];
                    System.arraycopy(bArr7, 0, bArr11, 0, 32);
                    Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 0);
                    bArr3 = bArr11;
                }
                if (vx7.R0(bArr3, Long.valueOf(vx7Var3.c1)) && bArr6.length != 0 && vx7Var3.c1 != 0) {
                    if (vx7Var3.c == 0) {
                        ConnectionsManager.getInstance(vx7.m0(vx7Var3)).sendRequest(new TL_account.getAllSecureValues(), new jx7(lx7Var2, (byte) 0));
                        return;
                    } else {
                        lx7Var2.a();
                        return;
                    }
                } else if (z13) {
                    y6c.h(vx7.l0(vx7Var3)).t();
                    vx7Var3.O0 = (byte) 0;
                    vx7Var3.U1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = vx7Var3.E;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        vx7Var3.E.errors.clear();
                    }
                    byte[] bArr12 = vx7Var3.d1;
                    if (bArr12 != null && bArr12.length != 0) {
                        lx7Var2.b();
                        return;
                    } else {
                        Utilities.e.c(new pc7(lx7Var2, lx7Var2.b, lx7Var2.d, (byte) 11));
                        return;
                    }
                }
            case 8:
                p pVar = (p) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z14 = this.b;
                pVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    pVar.b0 = password2;
                    TwoStepVerificationActivity.e0(password2);
                    pVar.F0(z14);
                    return;
                }
                return;
            case 9:
                a28 a28Var = (a28) this.c;
                h19 h19Var = (h19) this.e;
                boolean z15 = this.b;
                y28 y28Var = a28Var.a;
                ij.X(y28Var.s2, y28Var.r1, 1, new gv1(a28Var, z15, h19Var, (View) this.d));
                return;
            case 10:
                d dVar = (d) this.d;
                boolean z16 = this.b;
                ve9 ve9Var = (ve9) this.e;
                String trim = ((EditTextBoldCursor) this.c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    lf9.k(dVar, z16, new kq8(ve9Var, trim, (byte) 8));
                    return;
                }
                return;
            case 11:
                ul9 ul9Var = (ul9) this.c;
                nk9 nk9Var = (nk9) this.d;
                boolean z17 = this.b;
                ql9 ql9Var = (ql9) this.e;
                long j2 = ul9Var.q;
                long nanoTime = System.nanoTime();
                try {
                    nk9Var.g();
                    long h = nk9Var.h();
                    ul9Var.m.b("active output finalized: size=" + nk9Var.a.length() + ", durationMs=" + h + ", elapsedMs=" + ul9.f(nanoTime));
                    ul9Var.g();
                    if (h > j2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z17 && !z4) {
                        ul9Var.k.execute(new gl9(ul9Var, ql9Var, nk9Var.a, h, true));
                        return;
                    }
                    File file2 = nk9Var.a;
                    try {
                        synchronized (nk9Var) {
                            try {
                                i7 = nk9Var.s;
                            } finally {
                                th = th;
                                file = file2;
                                while (true) {
                                    try {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                            cte.c(file);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                        min = Math.min(j2, h);
                        if (z4) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        ul9Var.u(file, i7, 0L, min, z17, i8);
                        cte.c(file);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        cte.c(file);
                        throw th;
                    }
                } catch (Exception e) {
                    ul9Var.i.post(new el9(ul9Var, e, (byte) 2));
                    return;
                }
            case 12:
                w3a w3aVar = (w3a) this.c;
                y3a y3aVar = (y3a) this.e;
                boolean z18 = this.b;
                w3aVar.a = z3a.B(((j5) this.d).a).z(y3aVar.c, y3aVar.a, y3aVar.x);
                if (z18 && y3aVar.r) {
                    new File(y3aVar.c).delete();
                }
                w3aVar.c.countDown();
                return;
            case 13:
                n6a n6aVar = (n6a) this.c;
                dz2 dz2Var = (dz2) this.d;
                k44 k44Var = (k44) this.e;
                boolean z19 = this.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                n6aVar.b.e(dz2Var, k44Var.a, z19);
                return;
            case 14:
                xsa xsaVar = (xsa) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z20 = this.b;
                ArrayList arrayList7 = xsaVar.l;
                int i15 = xsaVar.a;
                if (((int[]) this.d)[0] == xsaVar.m) {
                    xsaVar.i = false;
                    xsaVar.m = -1;
                    if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                        na7.q1(i15).a4(tL_payments_savedStarGifts.users, false);
                        na7.q1(i15).U3(tL_payments_savedStarGifts.chats, false);
                        if (z20) {
                            arrayList7.clear();
                        }
                        arrayList7.addAll(tL_payments_savedStarGifts.gifts);
                        xsaVar.k = tL_payments_savedStarGifts.next_offset;
                        xsaVar.n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        xsaVar.h = bool;
                        if (arrayList7.size() <= xsaVar.n && xsaVar.k != null) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        xsaVar.j = z5;
                    } else {
                        xsaVar.j = true;
                    }
                    kk7.f(i15).k(232, Long.valueOf(xsaVar.b), xsaVar);
                    return;
                }
                return;
            case 15:
                TLObject tLObject5 = (TLObject) this.d;
                boolean z21 = this.b;
                hd hdVar = (hd) this.e;
                u0b u0bVar = ((j0b) this.c).a;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    hq6.d0(y6c.t0).L1(tL_messages_stickerSet, true);
                    if (z21) {
                        hq6.d0(y6c.t0).h2(null, tLObject5, 0, null, false, false);
                    } else {
                        u0bVar.M1 = tL_messages_stickerSet;
                        u0bVar.L0();
                        u0bVar.T0();
                    }
                }
                hdVar.dismiss();
                return;
            case 16:
                f4b f4bVar = (f4b) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z22 = this.b;
                Runnable runnable = (Runnable) this.e;
                f4bVar.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(f4bVar.Z0);
                    if (z22) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e2) {
                    fa4.g(e2, false);
                    if (z22) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(f4bVar.Z0));
                        } catch (Exception e3) {
                            fa4.g(e3, false);
                        }
                    }
                }
                bitmap.recycle();
                gl.d3(runnable);
                return;
            case 17:
                String[] strArr = (String[]) this.c;
                akb akbVar = (akb) this.d;
                boolean z23 = this.b;
                b1 b1Var = (b1) this.e;
                try {
                    bkb.f0 = bkb.jm.get(bkb.f5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        String str2 = strArr[0];
                        bkb.g0 = str2;
                        String absolutePath = sqc.d(str2).getAbsolutePath();
                        try {
                            String str3 = akbVar.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(akbVar.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        akbVar.c = absolutePath;
                        Uri parse = Uri.parse(bkb.g0);
                        akbVar.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i16 = 0; i16 < split.length; i16++) {
                                if ("blur".equals(split[i16])) {
                                    akbVar.h = true;
                                } else if ("motion".equals(split[i16])) {
                                    akbVar.n = true;
                                }
                            }
                        }
                        Utilities.z(parse.getQueryParameter("intensity"));
                        akbVar.y = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                akbVar.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && gl.Q1(queryParameter2.charAt(6))) {
                                    akbVar.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && gl.Q1(queryParameter2.charAt(13))) {
                                    akbVar.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && gl.Q1(queryParameter2.charAt(20))) {
                                    akbVar.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                akbVar.y = Utilities.z(queryParameter3).intValue();
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        try {
                            if (akbVar.c != null) {
                                new File(akbVar.c).delete();
                            }
                        } catch (Exception unused4) {
                        }
                        akbVar.c = null;
                        bkb.g0 = null;
                    }
                    if (!z23 && bkb.M == null) {
                        bkb.K = akbVar;
                        if (bkb.I == bkb.J) {
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        if (objArr != null) {
                            bkb.T = 2000;
                            bkb.U = SystemClock.elapsedRealtime();
                            gl.e3(new am6((byte) 2), 2100L);
                        }
                    }
                    bkb.I = akbVar;
                    bkb.r1(false, false);
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
                if (bkb.M == null && !bkb.Q) {
                    na7.q1(akbVar.F).z4(akbVar, akbVar.i(false), z23, false);
                }
                b1Var.run();
                return;
            case 18:
                ((p3c) this.c).w0((TLObject) this.e, (TLRPC.TL_error) this.d, this.b);
                return;
            default:
                ((VoIPService) this.c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.b);
                return;
        }
    }

    public d97(na7 na7Var, boolean z, TLRPC.Updates updates, ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = na7Var;
        this.b = z;
        this.d = updates;
        this.e = arrayList;
    }

    public d97(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public d97(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
