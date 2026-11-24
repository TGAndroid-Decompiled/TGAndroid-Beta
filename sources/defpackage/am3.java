package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class am3 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;
    public final TLObject f;

    public am3(Object obj, Object obj2, int i, int i2, TLObject tLObject, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = i2;
        this.f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ConcurrentHashMap concurrentHashMap;
        int i;
        byte[] bArr;
        boolean z;
        switch (this.a) {
            case 0:
                mm3 mm3Var = (mm3) this.b;
                String str = (String) this.c;
                int i2 = this.d;
                int i3 = this.e;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    vh6 vh6Var = new vh6();
                    vh6 vh6Var2 = new vh6();
                    for (int i4 = 0; i4 < messages_messages.chats.size(); i4++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i4);
                        vh6Var.k(chat, chat.id);
                    }
                    for (int i5 = 0; i5 < messages_messages.users.size(); i5++) {
                        TLRPC.User user = messages_messages.users.get(i5);
                        vh6Var2.k(user, user.id);
                    }
                    for (int i6 = 0; i6 < messages_messages.messages.size(); i6++) {
                        k47 k47Var = new k47(mm3Var.t0, messages_messages.messages.get(i6), vh6Var2, vh6Var, false, true);
                        arrayList.add(k47Var);
                        k47Var.J5(str, true);
                    }
                }
                gm.c3(new dm3(mm3Var, i2, i3, tL_error, str, tLObject, tL_messages_search, arrayList, (byte) 0));
                return;
            case 1:
                boolean z2 = true;
                mm3 mm3Var2 = (mm3) this.b;
                String str2 = (String) this.c;
                int i7 = this.d;
                int i8 = this.e;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f;
                int i9 = mm3Var2.t0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    vh6 vh6Var3 = new vh6();
                    vh6 vh6Var4 = new vh6();
                    int i10 = 0;
                    while (i10 < messages_messages2.chats.size()) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i10);
                        vh6Var3.k(chat2, chat2.id);
                        i10++;
                        arrayList2 = arrayList2;
                    }
                    ArrayList arrayList3 = arrayList2;
                    for (int i11 = 0; i11 < messages_messages2.users.size(); i11++) {
                        TLRPC.User user2 = messages_messages2.users.get(i11);
                        vh6Var4.k(user2, user2.id);
                    }
                    int i12 = 0;
                    while (i12 < messages_messages2.messages.size()) {
                        vh6 vh6Var5 = vh6Var3;
                        vh6 vh6Var6 = vh6Var4;
                        k47 k47Var2 = new k47(mm3Var2.t0, messages_messages2.messages.get(i12), vh6Var6, vh6Var5, false, true);
                        arrayList3.add(k47Var2);
                        k47Var2.J5(str2, z2);
                        i12++;
                        vh6Var4 = vh6Var6;
                        vh6Var3 = vh6Var5;
                        z2 = true;
                    }
                    arrayList2 = arrayList3;
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (i13 < messages_messages3.messages.size()) {
                        TLRPC.Message message = messages_messages3.messages.get(i13);
                        long B0 = k47.B0(message);
                        if (message.out) {
                            concurrentHashMap = oc7.r1(i9).Q;
                        } else {
                            concurrentHashMap = oc7.r1(i9).P;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = tL_messages_searchGlobal;
                        if (((Integer) concurrentHashMap.get(Long.valueOf(B0))) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(B0)));
                        }
                        i13++;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                dm3 dm3Var = new dm3(mm3Var2, i7, i8, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, (byte) 1);
                if (hashSet.isEmpty()) {
                    gm.c3(dm3Var);
                    return;
                } else {
                    cf7.Y(i9).a.c(new pz2(mm3Var2, hashSet, dm3Var, (byte) 6));
                    return;
                }
            default:
                lb4 lb4Var = (lb4) this.b;
                kb4 kb4Var = (kb4) this.c;
                int i14 = this.d;
                int i15 = this.e;
                TLObject tLObject2 = this.f;
                if (kb4Var.k) {
                    fc4.d("received chunk but definitely cancelled offset=" + kb4Var.e + " size=" + kb4Var.c + " token=" + kb4Var.a);
                    return;
                }
                if (kb4Var.j) {
                    fc4.d("received cancelled chunk after cancelRequests! offset=" + kb4Var.e + " size=" + kb4Var.c + " token=" + kb4Var.a);
                }
                if (!lb4Var.G0.contains(kb4Var)) {
                    if (lb4Var.H0.contains(kb4Var)) {
                        int i16 = 0;
                        boolean z3 = false;
                        while (i16 < lb4Var.G0.size()) {
                            kb4 kb4Var2 = (kb4) lb4Var.G0.get(i16);
                            if (kb4Var2 != null && kb4Var2 != kb4Var) {
                                z = z3;
                                if (kb4Var2.e == kb4Var.e && kb4Var2.c == kb4Var.c) {
                                    fc4.d("received cancelled chunk faster than new one! received=" + kb4Var.a + " new=" + kb4Var2.a);
                                    ArrayList arrayList4 = lb4Var.G0;
                                    if (!z) {
                                        arrayList4.set(i16, kb4Var);
                                        z3 = true;
                                        i16++;
                                    } else {
                                        arrayList4.remove(i16);
                                        i16--;
                                    }
                                }
                            } else {
                                z = z3;
                            }
                            z3 = z;
                            i16++;
                        }
                    } else {
                        return;
                    }
                }
                int i17 = 0;
                while (i17 < lb4Var.H0.size()) {
                    kb4 kb4Var3 = (kb4) lb4Var.H0.get(i17);
                    if (kb4Var3 != null && kb4Var3 != kb4Var && kb4Var3.e == kb4Var.e && kb4Var3.c == kb4Var.c) {
                        fc4.d("received new chunk faster than cancelled one! received=" + kb4Var.a + " cancelled=" + kb4Var3.a);
                        lb4Var.H0.remove(i17);
                        i17 += -1;
                    }
                    i17++;
                }
                if (e21.a) {
                    StringBuilder sb = new StringBuilder("debug_loading: ");
                    sb.append(lb4Var.L0.getName());
                    sb.append(" time=");
                    sb.append(System.currentTimeMillis() - kb4Var.b);
                    sb.append(" dcId=");
                    sb.append(i14);
                    sb.append(" cdn=");
                    sb.append(lb4Var.u0);
                    sb.append(" conType=");
                    sb.append(i15);
                    sb.append(" reqId");
                    b10.p(kb4Var.a, sb);
                }
                if (kb4Var == lb4Var.f0) {
                    wi8.q(lb4Var.f0.e, new StringBuilder("frame get request completed "));
                    lb4Var.f0 = null;
                }
                if (tL_error != null) {
                    Runnable runnable = kb4Var.l;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (tL_error.code == -2000) {
                        lb4Var.G0.remove(kb4Var);
                        long j = lb4Var.Q;
                        long j2 = kb4Var.c;
                        lb4Var.Q = j - j2;
                        ArrayList arrayList5 = lb4Var.O;
                        long j3 = kb4Var.e;
                        lb4.l(j3, j2 + j3, arrayList5);
                        return;
                    } else if (ad4.r(tL_error.text)) {
                        lb4Var.n(kb4Var);
                        return;
                    } else if ((tLObject2 instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                        lb4Var.u0 = false;
                        lb4Var.c(kb4Var, false, false);
                        lb4Var.q(i15);
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                    TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject;
                    if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                        if (lb4Var.q0 == null) {
                            lb4Var.q0 = new HashMap();
                        }
                        for (int i18 = 0; i18 < tL_upload_fileCdnRedirect.file_hashes.size(); i18++) {
                            TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i18);
                            lb4Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
                    if (bArr2 != null && (bArr = tL_upload_fileCdnRedirect.encryption_key) != null && bArr2.length == 16 && bArr.length == 32) {
                        lb4Var.u0 = true;
                        if (lb4Var.P == null) {
                            ArrayList arrayList6 = new ArrayList();
                            lb4Var.P = arrayList6;
                            arrayList6.add(new jb4(0L, lb4Var.q));
                        }
                        lb4Var.y0 = tL_upload_fileCdnRedirect.dc_id;
                        lb4Var.v0 = tL_upload_fileCdnRedirect.encryption_iv;
                        lb4Var.w0 = tL_upload_fileCdnRedirect.encryption_key;
                        lb4Var.x0 = tL_upload_fileCdnRedirect.file_token;
                        lb4Var.c(kb4Var, false, false);
                        lb4Var.q(i15);
                        return;
                    }
                    Runnable runnable2 = kb4Var.l;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "bad redirect response";
                    tL_error2.code = 400;
                    lb4Var.k(kb4Var, tL_error2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
                    if (!lb4Var.z0) {
                        lb4Var.c(kb4Var, false, false);
                        lb4Var.z0 = true;
                        TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
                        tL_upload_reuploadCdnFile.file_token = lb4Var.x0;
                        tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject).request_token;
                        ConnectionsManager.getInstance(lb4Var.R).sendRequest(tL_upload_reuploadCdnFile, new cb7(lb4Var, i15, kb4Var, (byte) 6), null, null, 0, lb4Var.T, 1, true);
                        return;
                    }
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_upload_file) {
                        kb4Var.f = (TLRPC.TL_upload_file) tLObject;
                    } else if (tLObject instanceof TLRPC.TL_upload_webFile) {
                        TLRPC.TL_upload_webFile tL_upload_webFile = (TLRPC.TL_upload_webFile) tLObject;
                        kb4Var.g = tL_upload_webFile;
                        if (lb4Var.b0 == 0 && (i = tL_upload_webFile.size) != 0) {
                            lb4Var.b0 = i;
                        }
                    } else {
                        kb4Var.h = (TLRPC.TL_upload_cdnFile) tLObject;
                    }
                    if (tLObject != null) {
                        int i19 = lb4Var.b1;
                        if (i19 == 50331648) {
                            b0b.c(lb4Var.R).f(tLObject.networkType, 3, tLObject.getObjectSize() + 4);
                        } else if (i19 == 33554432) {
                            b0b.c(lb4Var.R).f(tLObject.networkType, 2, tLObject.getObjectSize() + 4);
                        } else if (i19 == 16777216) {
                            b0b.c(lb4Var.R).f(tLObject.networkType, 4, tLObject.getObjectSize() + 4);
                        } else if (i19 == 67108864) {
                            String str3 = lb4Var.P0;
                            if (str3 != null && (str3.toLowerCase().endsWith("mp3") || lb4Var.P0.toLowerCase().endsWith("m4a"))) {
                                b0b.c(lb4Var.R).f(tLObject.networkType, 7, tLObject.getObjectSize() + 4);
                            } else {
                                b0b.c(lb4Var.R).f(tLObject.networkType, 5, tLObject.getObjectSize() + 4);
                            }
                        }
                    }
                    if (tL_error == null && tLObject != null) {
                        int objectSize = tLObject.getObjectSize();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = lb4Var.g1;
                        if (j4 != 0 && elapsedRealtime - lb4Var.h1 <= 2000) {
                            long j5 = lb4Var.i1 + objectSize;
                            lb4Var.i1 = j5;
                            int i20 = lb4Var.j1 + 1;
                            lb4Var.j1 = i20;
                            if (i20 >= 2 && j5 >= 131072) {
                                long j6 = elapsedRealtime - j4;
                                if (j6 >= 500) {
                                    long j7 = j5 << 3;
                                    synchronized (ir3.class) {
                                        if (j7 > 0 && j6 > 0) {
                                            double d = (j7 * 1000.0d) / j6;
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                            long j8 = ir3.b;
                                            if (j8 != 0 && elapsedRealtime2 - j8 <= 60000) {
                                                d = (d * 0.3d) + (ir3.a * 0.7d);
                                            }
                                            ir3.a = d;
                                            ir3.b = elapsedRealtime2;
                                        }
                                    }
                                    lb4Var.g1 = elapsedRealtime;
                                    lb4Var.i1 = 0L;
                                    lb4Var.j1 = 0;
                                }
                            }
                        } else {
                            lb4Var.g1 = elapsedRealtime;
                            lb4Var.i1 = 0L;
                            lb4Var.j1 = 0;
                        }
                        lb4Var.h1 = elapsedRealtime;
                    }
                    lb4Var.k(kb4Var, tL_error);
                    Runnable runnable3 = kb4Var.l;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
        }
    }
}
