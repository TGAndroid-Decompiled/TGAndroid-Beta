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
public final class qk3 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;
    public final TLObject f;

    public qk3(Object obj, Object obj2, int i, int i2, TLObject tLObject, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = i2;
        this.f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        ConcurrentHashMap concurrentHashMap;
        int i2;
        byte[] bArr;
        boolean z;
        switch (this.a) {
            case 0:
                bl3 bl3Var = (bl3) this.b;
                String str = (String) this.c;
                int i3 = this.d;
                int i4 = this.e;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    vf6 vf6Var = new vf6();
                    vf6 vf6Var2 = new vf6();
                    for (int i5 = 0; i5 < messages_messages.chats.size(); i5++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i5);
                        vf6Var.k(chat, chat.id);
                    }
                    for (int i6 = 0; i6 < messages_messages.users.size(); i6++) {
                        TLRPC.User user = messages_messages.users.get(i6);
                        vf6Var2.k(user, user.id);
                    }
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        k27 k27Var = new k27(bl3Var.t0, messages_messages.messages.get(i7), vf6Var2, vf6Var, false, true);
                        arrayList.add(k27Var);
                        k27Var.J5(str, true);
                    }
                }
                gl.d3(new sk3(bl3Var, i3, i4, tL_error, str, tLObject, tL_messages_search, arrayList, (byte) 0));
                return;
            case 1:
                boolean z2 = true;
                bl3 bl3Var2 = (bl3) this.b;
                String str2 = (String) this.c;
                int i8 = this.d;
                int i9 = this.e;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f;
                int i10 = bl3Var2.t0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    vf6 vf6Var3 = new vf6();
                    vf6 vf6Var4 = new vf6();
                    int i11 = 0;
                    while (i11 < messages_messages2.chats.size()) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i11);
                        vf6Var3.k(chat2, chat2.id);
                        i11++;
                        i10 = i10;
                    }
                    i = i10;
                    for (int i12 = 0; i12 < messages_messages2.users.size(); i12++) {
                        TLRPC.User user2 = messages_messages2.users.get(i12);
                        vf6Var4.k(user2, user2.id);
                    }
                    int i13 = 0;
                    while (i13 < messages_messages2.messages.size()) {
                        vf6 vf6Var5 = vf6Var3;
                        k27 k27Var2 = new k27(bl3Var2.t0, messages_messages2.messages.get(i13), vf6Var4, vf6Var5, false, true);
                        arrayList2.add(k27Var2);
                        k27Var2.J5(str2, z2);
                        i13++;
                        vf6Var3 = vf6Var5;
                        z2 = true;
                    }
                } else {
                    i = i10;
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    for (int i14 = 0; i14 < messages_messages3.messages.size(); i14++) {
                        TLRPC.Message message = messages_messages3.messages.get(i14);
                        long B0 = k27.B0(message);
                        if (message.out) {
                            concurrentHashMap = na7.q1(i).Q;
                        } else {
                            concurrentHashMap = na7.q1(i).P;
                        }
                        if (((Integer) concurrentHashMap.get(Long.valueOf(B0))) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(B0)));
                        }
                    }
                }
                sk3 sk3Var = new sk3(bl3Var2, i8, i9, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, (byte) 1);
                if (hashSet.isEmpty()) {
                    gl.d3(sk3Var);
                    return;
                } else {
                    ad7.Y(i).a.c(new mg3(bl3Var2, hashSet, sk3Var, (byte) 4));
                    return;
                }
            default:
                l94 l94Var = (l94) this.b;
                k94 k94Var = (k94) this.c;
                int i15 = this.d;
                int i16 = this.e;
                TLObject tLObject2 = this.f;
                if (k94Var.k) {
                    fa4.d("received chunk but definitely cancelled offset=" + k94Var.e + " size=" + k94Var.c + " token=" + k94Var.a);
                    return;
                }
                if (k94Var.j) {
                    fa4.d("received cancelled chunk after cancelRequests! offset=" + k94Var.e + " size=" + k94Var.c + " token=" + k94Var.a);
                }
                if (!l94Var.G0.contains(k94Var)) {
                    if (l94Var.H0.contains(k94Var)) {
                        int i17 = 0;
                        boolean z3 = false;
                        while (i17 < l94Var.G0.size()) {
                            k94 k94Var2 = (k94) l94Var.G0.get(i17);
                            if (k94Var2 != null && k94Var2 != k94Var) {
                                z = z3;
                                if (k94Var2.e == k94Var.e && k94Var2.c == k94Var.c) {
                                    fa4.d("received cancelled chunk faster than new one! received=" + k94Var.a + " new=" + k94Var2.a);
                                    ArrayList arrayList3 = l94Var.G0;
                                    if (!z) {
                                        arrayList3.set(i17, k94Var);
                                        z3 = true;
                                        i17++;
                                    } else {
                                        arrayList3.remove(i17);
                                        i17--;
                                    }
                                }
                            } else {
                                z = z3;
                            }
                            z3 = z;
                            i17++;
                        }
                    } else {
                        return;
                    }
                }
                int i18 = 0;
                while (i18 < l94Var.H0.size()) {
                    k94 k94Var3 = (k94) l94Var.H0.get(i18);
                    if (k94Var3 != null && k94Var3 != k94Var && k94Var3.e == k94Var.e && k94Var3.c == k94Var.c) {
                        fa4.d("received new chunk faster than cancelled one! received=" + k94Var.a + " cancelled=" + k94Var3.a);
                        l94Var.H0.remove(i18);
                        i18 += -1;
                    }
                    i18++;
                }
                if (w01.a) {
                    StringBuilder sb = new StringBuilder("debug_loading: ");
                    sb.append(l94Var.L0.getName());
                    sb.append(" time=");
                    sb.append(System.currentTimeMillis() - k94Var.b);
                    sb.append(" dcId=");
                    sb.append(i15);
                    sb.append(" cdn=");
                    sb.append(l94Var.u0);
                    sb.append(" conType=");
                    sb.append(i16);
                    sb.append(" reqId");
                    b00.p(k94Var.a, sb);
                }
                if (k94Var == l94Var.f0) {
                    ug8.q(l94Var.f0.e, new StringBuilder("frame get request completed "));
                    l94Var.f0 = null;
                }
                if (tL_error != null) {
                    Runnable runnable = k94Var.l;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (tL_error.code == -2000) {
                        l94Var.G0.remove(k94Var);
                        long j = l94Var.Q;
                        long j2 = k94Var.c;
                        l94Var.Q = j - j2;
                        ArrayList arrayList4 = l94Var.O;
                        long j3 = k94Var.e;
                        l94.l(j3, j2 + j3, arrayList4);
                        return;
                    } else if (ab4.r(tL_error.text)) {
                        l94Var.n(k94Var);
                        return;
                    } else if ((tLObject2 instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                        l94Var.u0 = false;
                        l94Var.c(k94Var, false, false);
                        l94Var.q(i16);
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                    TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject;
                    if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                        if (l94Var.q0 == null) {
                            l94Var.q0 = new HashMap();
                        }
                        for (int i19 = 0; i19 < tL_upload_fileCdnRedirect.file_hashes.size(); i19++) {
                            TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i19);
                            l94Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
                    if (bArr2 != null && (bArr = tL_upload_fileCdnRedirect.encryption_key) != null && bArr2.length == 16 && bArr.length == 32) {
                        l94Var.u0 = true;
                        if (l94Var.P == null) {
                            ArrayList arrayList5 = new ArrayList();
                            l94Var.P = arrayList5;
                            arrayList5.add(new j94(0L, l94Var.q));
                        }
                        l94Var.y0 = tL_upload_fileCdnRedirect.dc_id;
                        l94Var.v0 = tL_upload_fileCdnRedirect.encryption_iv;
                        l94Var.w0 = tL_upload_fileCdnRedirect.encryption_key;
                        l94Var.x0 = tL_upload_fileCdnRedirect.file_token;
                        l94Var.c(k94Var, false, false);
                        l94Var.q(i16);
                        return;
                    }
                    Runnable runnable2 = k94Var.l;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "bad redirect response";
                    tL_error2.code = 400;
                    l94Var.k(k94Var, tL_error2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
                    if (!l94Var.z0) {
                        l94Var.c(k94Var, false, false);
                        l94Var.z0 = true;
                        TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
                        tL_upload_reuploadCdnFile.file_token = l94Var.x0;
                        tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject).request_token;
                        ConnectionsManager.getInstance(l94Var.R).sendRequest(tL_upload_reuploadCdnFile, new b97(l94Var, i16, k94Var, (byte) 5), null, null, 0, l94Var.T, 1, true);
                        return;
                    }
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_upload_file) {
                        k94Var.f = (TLRPC.TL_upload_file) tLObject;
                    } else if (tLObject instanceof TLRPC.TL_upload_webFile) {
                        TLRPC.TL_upload_webFile tL_upload_webFile = (TLRPC.TL_upload_webFile) tLObject;
                        k94Var.g = tL_upload_webFile;
                        if (l94Var.b0 == 0 && (i2 = tL_upload_webFile.size) != 0) {
                            l94Var.b0 = i2;
                        }
                    } else {
                        k94Var.h = (TLRPC.TL_upload_cdnFile) tLObject;
                    }
                    if (tLObject != null) {
                        int i20 = l94Var.b1;
                        if (i20 == 50331648) {
                            yxa.c(l94Var.R).f(tLObject.networkType, 3, tLObject.getObjectSize() + 4);
                        } else if (i20 == 33554432) {
                            yxa.c(l94Var.R).f(tLObject.networkType, 2, tLObject.getObjectSize() + 4);
                        } else if (i20 == 16777216) {
                            yxa.c(l94Var.R).f(tLObject.networkType, 4, tLObject.getObjectSize() + 4);
                        } else if (i20 == 67108864) {
                            String str3 = l94Var.P0;
                            if (str3 != null && (str3.toLowerCase().endsWith("mp3") || l94Var.P0.toLowerCase().endsWith("m4a"))) {
                                yxa.c(l94Var.R).f(tLObject.networkType, 7, tLObject.getObjectSize() + 4);
                            } else {
                                yxa.c(l94Var.R).f(tLObject.networkType, 5, tLObject.getObjectSize() + 4);
                            }
                        }
                    }
                    if (tL_error == null && tLObject != null) {
                        int objectSize = tLObject.getObjectSize();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = l94Var.g1;
                        if (j4 != 0 && elapsedRealtime - l94Var.h1 <= 2000) {
                            long j5 = l94Var.i1 + objectSize;
                            l94Var.i1 = j5;
                            int i21 = l94Var.j1 + 1;
                            l94Var.j1 = i21;
                            if (i21 >= 2 && j5 >= 131072) {
                                long j6 = elapsedRealtime - j4;
                                if (j6 >= 500) {
                                    long j7 = j5 << 3;
                                    synchronized (yp3.class) {
                                        if (j7 > 0 && j6 > 0) {
                                            double d = (j7 * 1000.0d) / j6;
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                            long j8 = yp3.b;
                                            if (j8 != 0 && elapsedRealtime2 - j8 <= 60000) {
                                                d = (d * 0.3d) + (yp3.a * 0.7d);
                                            }
                                            yp3.a = d;
                                            yp3.b = elapsedRealtime2;
                                        }
                                    }
                                    l94Var.g1 = elapsedRealtime;
                                    l94Var.i1 = 0L;
                                    l94Var.j1 = 0;
                                }
                            }
                        } else {
                            l94Var.g1 = elapsedRealtime;
                            l94Var.i1 = 0L;
                            l94Var.j1 = 0;
                        }
                        l94Var.h1 = elapsedRealtime;
                    }
                    l94Var.k(k94Var, tL_error);
                    Runnable runnable3 = k94Var.l;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
        }
    }
}
