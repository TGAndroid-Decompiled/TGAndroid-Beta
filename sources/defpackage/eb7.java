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
public final class eb7 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public eb7(d48 d48Var, View view, k39 k39Var, boolean z, boolean z2) {
        this.a = (byte) 9;
        this.c = d48Var;
        this.d = view;
        this.e = k39Var;
        this.b = z;
    }

    @Override
    public final void run() {
        int i;
        char c;
        int size;
        boolean z;
        boolean z2;
        vh6 vh6Var;
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
                oc7 oc7Var = (oc7) this.c;
                boolean z6 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                if (z6) {
                    i = 0;
                    oc7Var.getNotificationCenter().k(2, 64);
                } else {
                    i = 0;
                }
                oc7Var.t5(i, -updates.chat_id, arrayList2);
                oc7Var.getNotificationCenter().k(3, new Object[i]);
                return;
            case 1:
                sb7 sb7Var = (sb7) this.c;
                TLObject tLObject = (TLObject) this.e;
                boolean z7 = this.b;
                int i9 = sb7Var.a;
                ArrayList arrayList3 = sb7Var.e;
                if (((int[]) this.d)[0] == sb7Var.f) {
                    sb7Var.c = false;
                    sb7Var.f = -1;
                    if (tLObject instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                        oc7.r1(i9).X3(messages_chats.chats, false);
                        if (z7) {
                            arrayList3.clear();
                        }
                        arrayList3.addAll(messages_chats.chats);
                        if (messages_chats instanceof TLRPC.TL_messages_chatsSlice) {
                            size = messages_chats.count;
                        } else {
                            size = messages_chats.chats.size();
                        }
                        sb7Var.g = size;
                        if (arrayList3.size() >= sb7Var.g) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb7Var.d = z;
                        c = 1;
                    } else {
                        c = 1;
                        sb7Var.d = true;
                    }
                    nm7 f = nm7.f(i9);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Long.valueOf(sb7Var.b);
                    objArr2[c] = sb7Var;
                    f.k(243, objArr2);
                    return;
                }
                return;
            case 2:
                ((cf7) this.c).k1((List) this.d, (List) this.e, this.b);
                return;
            case 3:
                lo7 lo7Var = (lo7) this.c;
                vh6 vh6Var2 = (vh6) this.d;
                boolean z8 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = lo7Var.b;
                vh6 vh6Var3 = lo7Var.c;
                vh6 vh6Var4 = lo7Var.f;
                int i10 = lo7Var.J;
                lo7Var.getAccountInstance().d();
                Integer num5 = 0;
                int i11 = 0;
                while (i11 < vh6Var2.m()) {
                    long j = vh6Var2.j(i11);
                    SparseArray sparseArray = (SparseArray) vh6Var3.f(j);
                    if (sparseArray == null) {
                        vh6Var = vh6Var2;
                        z3 = z8;
                        num = num5;
                        i2 = i11;
                    } else {
                        ArrayList arrayList6 = (ArrayList) vh6Var2.f(j);
                        int i12 = 0;
                        for (int size2 = arrayList6.size(); i12 < size2; size2 = i4) {
                            vh6 vh6Var5 = vh6Var2;
                            int intValue = ((Integer) arrayList6.get(i12)).intValue();
                            boolean z9 = z8;
                            k47 k47Var = (k47) sparseArray.get(intValue);
                            Integer num6 = num5;
                            if (k47Var == null || k47Var.J || (z9 && !k47Var.I)) {
                                i3 = i11;
                                arrayList = arrayList6;
                                i4 = size2;
                            } else {
                                i3 = i11;
                                long B0 = k47.B0(k47Var.k);
                                Integer num7 = (Integer) vh6Var4.f(B0);
                                if (num7 == null) {
                                    num2 = num6;
                                } else {
                                    num2 = num7;
                                }
                                int intValue2 = num2.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    arrayList = arrayList6;
                                    lo7Var.e.l(B0);
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
                                    if (!lo7Var.getMessagesController().m2(B0)) {
                                        boolean s2 = lo7Var.getMessagesController().s2(B0);
                                        int i13 = lo7Var.J;
                                        if (s2) {
                                            if (num10.intValue() > 0) {
                                                i5 = 1;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i14 = i13 - i5;
                                            lo7Var.J = i14;
                                            if (num4.intValue() > 0) {
                                                i6 = 1;
                                            } else {
                                                i6 = 0;
                                            }
                                            lo7Var.J = i14 + i6;
                                        } else {
                                            int intValue3 = i13 - num10.intValue();
                                            lo7Var.J = intValue3;
                                            lo7Var.J = num4.intValue() + intValue3;
                                        }
                                    }
                                    vh6Var4.k(num4, B0);
                                }
                                if (num4.intValue() == 0) {
                                    vh6Var4.l(B0);
                                    lo7Var.r.l(B0);
                                }
                                sparseArray.remove(intValue);
                                arrayList5.remove(k47Var);
                                lo7Var.a.remove(k47Var);
                                if (lo7.y(k47Var)) {
                                    lo7Var.K--;
                                }
                                arrayList4.add(k47Var);
                            }
                            i12++;
                            num5 = num6;
                            i11 = i3;
                            vh6Var2 = vh6Var5;
                            z8 = z9;
                            arrayList6 = arrayList;
                        }
                        vh6Var = vh6Var2;
                        z3 = z8;
                        num = num5;
                        i2 = i11;
                        if (sparseArray.size() == 0) {
                            vh6Var3.l(j);
                        }
                    }
                    i11 = i2 + 1;
                    num5 = num;
                    vh6Var2 = vh6Var;
                    z8 = z3;
                }
                if (!arrayList4.isEmpty()) {
                    gm.c3(new bo7(lo7Var, arrayList4, (byte) 1));
                }
                if (i10 != lo7Var.J) {
                    if (!lo7Var.L) {
                        arrayList5.clear();
                        lo7Var.Z(lo7Var.L);
                    } else {
                        if (lo7Var.M > lo7Var.getConnectionsManager().getCurrentTime()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        lo7Var.Q(z2);
                    }
                    gm.c3(new fo7(lo7Var, vh6Var4.m(), (byte) 1));
                }
                lo7Var.L = false;
                if (lo7Var.S) {
                    lo7Var.S(lo7Var.t());
                    return;
                }
                return;
            case 4:
                hw7 hw7Var = (hw7) this.c;
                boolean z10 = this.b;
                hw7Var.f.f(new fw7(hw7Var, (ry) this.d, (byte) 0));
                hw7Var.f.f(new fw7(hw7Var, (ry) this.e, (byte) 0));
                hw7Var.E = z10;
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z11 = this.b;
                xz7 xz7Var = ((nz7) this.c).e;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    xz7Var.K = password;
                    TwoStepVerificationActivity.f0(password);
                    xz7Var.E1(z11);
                    return;
                }
                return;
            case 6:
                nz7 nz7Var = (nz7) this.c;
                String str = (String) this.e;
                boolean z12 = this.b;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.d);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                xz7 xz7Var2 = nz7Var.e;
                if (tL_secureSecretSettings != null) {
                    xz7Var2.d1 = tL_secureSecretSettings.secure_secret;
                    xz7Var2.c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        xz7Var2.f1 = Utilities.s(bArr, gm.g1(str), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        xz7Var2.f1 = Utilities.m(gm.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        gm.c3(new eb7(nz7Var, passwordsettings, z12, bArr2, (byte) 7));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        gm.c3(new kl7(nz7Var, (byte) 15));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = xz7Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        xz7Var2.f1 = Utilities.m(gm.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    xz7Var2.d1 = null;
                    xz7Var2.c1 = 0L;
                }
                bArr2 = bArr;
                gm.c3(new eb7(nz7Var, passwordsettings, z12, bArr2, (byte) 7));
                return;
            case 7:
                nz7 nz7Var2 = (nz7) this.c;
                boolean z13 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                xz7 xz7Var3 = nz7Var2.e;
                xz7Var3.e1 = ((TL_account.passwordSettings) this.d).email;
                if (z13) {
                    xz7Var3.f1 = xz7Var3.Q0;
                }
                byte[] bArr7 = xz7Var3.d1;
                byte[] bArr8 = xz7Var3.f1;
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
                if (xz7.S0(bArr3, Long.valueOf(xz7Var3.c1)) && bArr6.length != 0 && xz7Var3.c1 != 0) {
                    if (xz7Var3.c == 0) {
                        ConnectionsManager.getInstance(xz7.n0(xz7Var3)).sendRequest(new TL_account.getAllSecureValues(), new lz7(nz7Var2, (byte) 0));
                        return;
                    } else {
                        nz7Var2.a();
                        return;
                    }
                } else if (z13) {
                    z8c.h(xz7.m0(xz7Var3)).t();
                    xz7Var3.O0 = (byte) 0;
                    xz7Var3.V1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = xz7Var3.E;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        xz7Var3.E.errors.clear();
                    }
                    byte[] bArr12 = xz7Var3.d1;
                    if (bArr12 != null && bArr12.length != 0) {
                        nz7Var2.b();
                        return;
                    } else {
                        Utilities.e.c(new ud7((byte) 14, nz7Var2, nz7Var2.b, nz7Var2.d));
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
                    TwoStepVerificationActivity.f0(password2);
                    pVar.G0(z14);
                    return;
                }
                return;
            case 9:
                d48 d48Var = (d48) this.c;
                k39 k39Var = (k39) this.e;
                boolean z15 = this.b;
                a58 a58Var = d48Var.a;
                ik.X(a58Var.s2, a58Var.r1, 1, new sw1(d48Var, z15, k39Var, (View) this.d));
                return;
            case 10:
                d dVar = (d) this.d;
                boolean z16 = this.b;
                zg9 zg9Var = (zg9) this.e;
                String trim = ((EditTextBoldCursor) this.c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    ph9.k(dVar, z16, new xr8(zg9Var, trim, (byte) 9));
                    return;
                }
                return;
            case 11:
                un9 un9Var = (un9) this.c;
                om9 om9Var = (om9) this.d;
                boolean z17 = this.b;
                qn9 qn9Var = (qn9) this.e;
                long j2 = un9Var.q;
                long nanoTime = System.nanoTime();
                try {
                    om9Var.g();
                    long h = om9Var.h();
                    un9Var.m.b("active output finalized: size=" + om9Var.a.length() + ", durationMs=" + h + ", elapsedMs=" + un9.f(nanoTime));
                    un9Var.g();
                    if (h > j2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z17 && !z4) {
                        un9Var.k.execute(new gn9(un9Var, qn9Var, om9Var.a, h, true));
                        return;
                    }
                    File file2 = om9Var.a;
                    try {
                        synchronized (om9Var) {
                            try {
                                i7 = om9Var.s;
                            } finally {
                                th = th;
                                file = file2;
                                while (true) {
                                    try {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                            fve.c(file);
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
                        un9Var.u(file, i7, 0L, min, z17, i8);
                        fve.c(file);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        fve.c(file);
                        throw th;
                    }
                } catch (Exception e) {
                    un9Var.i.post(new en9(un9Var, e, (byte) 2));
                    return;
                }
            case 12:
                x5a x5aVar = (x5a) this.c;
                z5a z5aVar = (z5a) this.e;
                boolean z18 = this.b;
                x5aVar.a = a6a.B(((j5) this.d).a).z(z5aVar.c, z5aVar.a, z5aVar.x);
                if (z18 && z5aVar.r) {
                    new File(z5aVar.c).delete();
                }
                x5aVar.c.countDown();
                return;
            case 13:
                p8a p8aVar = (p8a) this.c;
                o03 o03Var = (o03) this.d;
                v54 v54Var = (v54) this.e;
                boolean z19 = this.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                p8aVar.b.e(o03Var, v54Var.a, z19);
                return;
            case 14:
                ava avaVar = (ava) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z20 = this.b;
                ArrayList arrayList7 = avaVar.l;
                int i15 = avaVar.a;
                if (((int[]) this.d)[0] == avaVar.m) {
                    avaVar.i = false;
                    avaVar.m = -1;
                    if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                        oc7.r1(i15).d4(tL_payments_savedStarGifts.users, false);
                        oc7.r1(i15).X3(tL_payments_savedStarGifts.chats, false);
                        if (z20) {
                            arrayList7.clear();
                        }
                        arrayList7.addAll(tL_payments_savedStarGifts.gifts);
                        avaVar.k = tL_payments_savedStarGifts.next_offset;
                        avaVar.n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        avaVar.h = bool;
                        if (arrayList7.size() <= avaVar.n && avaVar.k != null) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        avaVar.j = z5;
                    } else {
                        avaVar.j = true;
                    }
                    nm7.f(i15).k(233, Long.valueOf(avaVar.b), avaVar);
                    return;
                }
                return;
            case 15:
                TLObject tLObject5 = (TLObject) this.d;
                boolean z21 = this.b;
                he heVar = (he) this.e;
                x2b x2bVar = ((m2b) this.c).a;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject5;
                    hs6.d0(z8c.t0).L1(tL_messages_stickerSet, true);
                    if (z21) {
                        hs6.d0(z8c.t0).h2(null, tLObject5, 0, null, false, false);
                    } else {
                        x2bVar.M1 = tL_messages_stickerSet;
                        x2bVar.L0();
                        x2bVar.T0();
                    }
                }
                heVar.dismiss();
                return;
            case 16:
                g6b g6bVar = (g6b) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z22 = this.b;
                Runnable runnable = (Runnable) this.e;
                g6bVar.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(g6bVar.Z0);
                    if (z22) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e2) {
                    fc4.g(e2, false);
                    if (z22) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(g6bVar.Z0));
                        } catch (Exception e3) {
                            fc4.g(e3, false);
                        }
                    }
                }
                bitmap.recycle();
                gm.c3(runnable);
                return;
            case 17:
                String[] strArr = (String[]) this.c;
                bmb bmbVar = (bmb) this.d;
                boolean z23 = this.b;
                b1 b1Var = (b1) this.e;
                try {
                    cmb.f0 = cmb.jm.get(cmb.f5, -1);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        String str2 = strArr[0];
                        cmb.g0 = str2;
                        String absolutePath = usc.d(str2).getAbsolutePath();
                        try {
                            String str3 = bmbVar.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(bmbVar.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        bmbVar.c = absolutePath;
                        Uri parse = Uri.parse(cmb.g0);
                        bmbVar.e = parse.getQueryParameter("slug");
                        String queryParameter = parse.getQueryParameter("mode");
                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                            for (int i16 = 0; i16 < split.length; i16++) {
                                if ("blur".equals(split[i16])) {
                                    bmbVar.h = true;
                                } else if ("motion".equals(split[i16])) {
                                    bmbVar.n = true;
                                }
                            }
                        }
                        Utilities.z(parse.getQueryParameter("intensity"));
                        bmbVar.y = 45;
                        try {
                            String queryParameter2 = parse.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                bmbVar.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && gm.Q1(queryParameter2.charAt(6))) {
                                    bmbVar.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && gm.Q1(queryParameter2.charAt(13))) {
                                    bmbVar.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && gm.Q1(queryParameter2.charAt(20))) {
                                    bmbVar.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            String queryParameter3 = parse.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                bmbVar.y = Utilities.z(queryParameter3).intValue();
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        try {
                            if (bmbVar.c != null) {
                                new File(bmbVar.c).delete();
                            }
                        } catch (Exception unused4) {
                        }
                        bmbVar.c = null;
                        cmb.g0 = null;
                    }
                    if (!z23 && cmb.M == null) {
                        cmb.K = bmbVar;
                        if (cmb.I == cmb.J) {
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        if (objArr != null) {
                            cmb.T = 2000;
                            cmb.U = SystemClock.elapsedRealtime();
                            gm.d3(new bo6((byte) 2), 2100L);
                        }
                    }
                    cmb.I = bmbVar;
                    cmb.r1(false, false);
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
                if (cmb.M == null && !cmb.Q) {
                    oc7.r1(bmbVar.F).C4(bmbVar, bmbVar.i(false), z23, false);
                }
                b1Var.run();
                return;
            case 18:
                ((p5c) this.c).x0((TLObject) this.e, (TLRPC.TL_error) this.d, this.b);
                return;
            default:
                ((VoIPService) this.c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.b);
                return;
        }
    }

    public eb7(oc7 oc7Var, boolean z, TLRPC.Updates updates, ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = oc7Var;
        this.b = z;
        this.d = updates;
        this.e = arrayList;
    }

    public eb7(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public eb7(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
