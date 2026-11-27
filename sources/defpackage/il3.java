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
public final class il3 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;
    public final TLObject f;

    public il3(Object obj, Object obj2, int i, int i2, TLObject tLObject, byte b) {
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
        switch (this.a) {
            case 0:
                tl3 tl3Var = (tl3) this.b;
                String str = (String) this.c;
                int i2 = this.d;
                int i3 = this.e;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    zh6 zh6Var = new zh6();
                    zh6 zh6Var2 = new zh6();
                    for (int i4 = 0; i4 < messages_messages.chats.size(); i4++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i4);
                        zh6Var.k(chat.id, chat);
                    }
                    for (int i5 = 0; i5 < messages_messages.users.size(); i5++) {
                        TLRPC.User user = messages_messages.users.get(i5);
                        zh6Var2.k(user.id, user);
                    }
                    int i6 = 0;
                    while (i6 < messages_messages.messages.size()) {
                        zh6 zh6Var3 = zh6Var;
                        r47 r47Var = new r47(tl3Var.t0, messages_messages.messages.get(i6), zh6Var2, zh6Var3, false, true);
                        arrayList.add(r47Var);
                        r47Var.J5(str, true);
                        i6++;
                        zh6Var = zh6Var3;
                    }
                }
                hl.c3(new jl3(tl3Var, i2, i3, tL_error, str, tLObject, tL_messages_search, arrayList, (byte) 0));
                return;
            case 1:
                boolean z = true;
                tl3 tl3Var2 = (tl3) this.b;
                String str2 = (String) this.c;
                int i7 = this.d;
                int i8 = this.e;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f;
                int i9 = tl3Var2.t0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    zh6 zh6Var4 = new zh6();
                    zh6 zh6Var5 = new zh6();
                    int i10 = 0;
                    while (i10 < messages_messages2.chats.size()) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i10);
                        zh6Var4.k(chat2.id, chat2);
                        i10++;
                        arrayList2 = arrayList2;
                    }
                    ArrayList arrayList3 = arrayList2;
                    for (int i11 = 0; i11 < messages_messages2.users.size(); i11++) {
                        TLRPC.User user2 = messages_messages2.users.get(i11);
                        zh6Var5.k(user2.id, user2);
                    }
                    int i12 = 0;
                    while (i12 < messages_messages2.messages.size()) {
                        zh6 zh6Var6 = zh6Var4;
                        r47 r47Var2 = new r47(tl3Var2.t0, messages_messages2.messages.get(i12), zh6Var5, zh6Var6, false, true);
                        arrayList3.add(r47Var2);
                        r47Var2.J5(str2, z);
                        i12++;
                        zh6Var4 = zh6Var6;
                        z = true;
                    }
                    arrayList2 = arrayList3;
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    int i13 = 0;
                    while (i13 < messages_messages3.messages.size()) {
                        TLRPC.Message message = messages_messages3.messages.get(i13);
                        long B0 = r47.B0(message);
                        if (message.out) {
                            concurrentHashMap = uc7.s1(i9).Q;
                        } else {
                            concurrentHashMap = uc7.s1(i9).P;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = tL_messages_searchGlobal;
                        if (((Integer) concurrentHashMap.get(Long.valueOf(B0))) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(B0)));
                        }
                        i13++;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                jl3 jl3Var = new jl3(tl3Var2, i7, i8, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, (byte) 1);
                if (hashSet.isEmpty()) {
                    hl.c3(jl3Var);
                    return;
                } else {
                    kf7.a0(i9).a.c(new cv2(tl3Var2, hashSet, jl3Var, (byte) 8));
                    return;
                }
            default:
                hb4 hb4Var = (hb4) this.b;
                gb4 gb4Var = (gb4) this.c;
                int i14 = this.d;
                int i15 = this.e;
                TLObject tLObject2 = this.f;
                if (gb4Var.k) {
                    cc4.d("received chunk but definitely cancelled offset=" + gb4Var.e + " size=" + gb4Var.c + " token=" + gb4Var.a);
                    return;
                }
                if (gb4Var.j) {
                    cc4.d("received cancelled chunk after cancelRequests! offset=" + gb4Var.e + " size=" + gb4Var.c + " token=" + gb4Var.a);
                }
                if (!hb4Var.G0.contains(gb4Var)) {
                    if (hb4Var.H0.contains(gb4Var)) {
                        int i16 = 0;
                        boolean z2 = false;
                        while (i16 < hb4Var.G0.size()) {
                            gb4 gb4Var2 = (gb4) hb4Var.G0.get(i16);
                            if (gb4Var2 != null && gb4Var2 != gb4Var && gb4Var2.e == gb4Var.e && gb4Var2.c == gb4Var.c) {
                                cc4.d("received cancelled chunk faster than new one! received=" + gb4Var.a + " new=" + gb4Var2.a);
                                ArrayList arrayList4 = hb4Var.G0;
                                if (!z2) {
                                    arrayList4.set(i16, gb4Var);
                                    z2 = true;
                                } else {
                                    arrayList4.remove(i16);
                                    i16--;
                                }
                            }
                            i16++;
                        }
                    } else {
                        return;
                    }
                }
                int i17 = 0;
                while (i17 < hb4Var.H0.size()) {
                    gb4 gb4Var3 = (gb4) hb4Var.H0.get(i17);
                    if (gb4Var3 != null && gb4Var3 != gb4Var && gb4Var3.e == gb4Var.e && gb4Var3.c == gb4Var.c) {
                        cc4.d("received new chunk faster than cancelled one! received=" + gb4Var.a + " cancelled=" + gb4Var3.a);
                        hb4Var.H0.remove(i17);
                        i17 += -1;
                    }
                    i17++;
                }
                if (f11.a) {
                    StringBuilder sb = new StringBuilder("debug_loading: ");
                    sb.append(hb4Var.L0.getName());
                    sb.append(" time=");
                    sb.append(System.currentTimeMillis() - gb4Var.b);
                    sb.append(" dcId=");
                    sb.append(i14);
                    sb.append(" cdn=");
                    sb.append(hb4Var.u0);
                    sb.append(" conType=");
                    sb.append(i15);
                    sb.append(" reqId");
                    c00.q(gb4Var.a, sb);
                }
                if (gb4Var == hb4Var.f0) {
                    ik8.q(hb4Var.f0.e, new StringBuilder("frame get request completed "));
                    hb4Var.f0 = null;
                }
                if (tL_error != null) {
                    Runnable runnable = gb4Var.l;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (tL_error.code == -2000) {
                        hb4Var.G0.remove(gb4Var);
                        long j = hb4Var.Q;
                        long j2 = gb4Var.c;
                        hb4Var.Q = j - j2;
                        ArrayList arrayList5 = hb4Var.O;
                        long j3 = gb4Var.e;
                        hb4.l(j3, j2 + j3, arrayList5);
                        return;
                    } else if (xc4.r(tL_error.text)) {
                        hb4Var.n(gb4Var);
                        return;
                    } else if ((tLObject2 instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                        hb4Var.u0 = false;
                        hb4Var.c(gb4Var, false, false);
                        hb4Var.q(i15);
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                    TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject;
                    if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                        if (hb4Var.q0 == null) {
                            hb4Var.q0 = new HashMap();
                        }
                        for (int i18 = 0; i18 < tL_upload_fileCdnRedirect.file_hashes.size(); i18++) {
                            TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i18);
                            hb4Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
                    if (bArr2 != null && (bArr = tL_upload_fileCdnRedirect.encryption_key) != null && bArr2.length == 16 && bArr.length == 32) {
                        hb4Var.u0 = true;
                        if (hb4Var.P == null) {
                            ArrayList arrayList6 = new ArrayList();
                            hb4Var.P = arrayList6;
                            arrayList6.add(new fb4(0L, hb4Var.q));
                        }
                        hb4Var.y0 = tL_upload_fileCdnRedirect.dc_id;
                        hb4Var.v0 = tL_upload_fileCdnRedirect.encryption_iv;
                        hb4Var.w0 = tL_upload_fileCdnRedirect.encryption_key;
                        hb4Var.x0 = tL_upload_fileCdnRedirect.file_token;
                        hb4Var.c(gb4Var, false, false);
                        hb4Var.q(i15);
                        return;
                    }
                    Runnable runnable2 = gb4Var.l;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "bad redirect response";
                    tL_error2.code = 400;
                    hb4Var.k(gb4Var, tL_error2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
                    if (!hb4Var.z0) {
                        hb4Var.c(gb4Var, false, false);
                        hb4Var.z0 = true;
                        TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
                        tL_upload_reuploadCdnFile.file_token = hb4Var.x0;
                        tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject).request_token;
                        ConnectionsManager.getInstance(hb4Var.R).sendRequest(tL_upload_reuploadCdnFile, new hb7(hb4Var, i15, gb4Var, (byte) 6), null, null, 0, hb4Var.T, 1, true);
                        return;
                    }
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_upload_file) {
                        gb4Var.f = (TLRPC.TL_upload_file) tLObject;
                    } else if (tLObject instanceof TLRPC.TL_upload_webFile) {
                        TLRPC.TL_upload_webFile tL_upload_webFile = (TLRPC.TL_upload_webFile) tLObject;
                        gb4Var.g = tL_upload_webFile;
                        if (hb4Var.b0 == 0 && (i = tL_upload_webFile.size) != 0) {
                            hb4Var.b0 = i;
                        }
                    } else {
                        gb4Var.h = (TLRPC.TL_upload_cdnFile) tLObject;
                    }
                    if (tLObject != null) {
                        int i19 = hb4Var.b1;
                        if (i19 == 50331648) {
                            a2b.c(hb4Var.R).f(tLObject.networkType, 3, tLObject.getObjectSize() + 4);
                        } else if (i19 == 33554432) {
                            a2b.c(hb4Var.R).f(tLObject.networkType, 2, tLObject.getObjectSize() + 4);
                        } else if (i19 == 16777216) {
                            a2b.c(hb4Var.R).f(tLObject.networkType, 4, tLObject.getObjectSize() + 4);
                        } else if (i19 == 67108864) {
                            String str3 = hb4Var.P0;
                            if (str3 != null && (str3.toLowerCase().endsWith("mp3") || hb4Var.P0.toLowerCase().endsWith("m4a"))) {
                                a2b.c(hb4Var.R).f(tLObject.networkType, 7, tLObject.getObjectSize() + 4);
                            } else {
                                a2b.c(hb4Var.R).f(tLObject.networkType, 5, tLObject.getObjectSize() + 4);
                            }
                        }
                    }
                    if (tL_error == null && tLObject != null) {
                        int objectSize = tLObject.getObjectSize();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = hb4Var.g1;
                        if (j4 != 0 && elapsedRealtime - hb4Var.h1 <= 2000) {
                            long j5 = hb4Var.i1 + objectSize;
                            hb4Var.i1 = j5;
                            int i20 = hb4Var.j1 + 1;
                            hb4Var.j1 = i20;
                            if (i20 >= 2 && j5 >= 131072) {
                                long j6 = elapsedRealtime - j4;
                                if (j6 >= 500) {
                                    long j7 = j5 << 3;
                                    synchronized (pq3.class) {
                                        if (j7 > 0 && j6 > 0) {
                                            double d = (j7 * 1000.0d) / j6;
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                            long j8 = pq3.b;
                                            if (j8 != 0 && elapsedRealtime2 - j8 <= 60000) {
                                                d = (d * 0.3d) + (pq3.a * 0.7d);
                                            }
                                            pq3.a = d;
                                            pq3.b = elapsedRealtime2;
                                        }
                                    }
                                    hb4Var.g1 = elapsedRealtime;
                                    hb4Var.i1 = 0L;
                                    hb4Var.j1 = 0;
                                }
                            }
                        } else {
                            hb4Var.g1 = elapsedRealtime;
                            hb4Var.i1 = 0L;
                            hb4Var.j1 = 0;
                        }
                        hb4Var.h1 = elapsedRealtime;
                    }
                    hb4Var.k(gb4Var, tL_error);
                    Runnable runnable3 = gb4Var.l;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
        }
    }
}
