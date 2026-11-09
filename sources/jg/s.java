package jg;

import android.os.SystemClock;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.b6;
import org.telegram.messenger.bo;
import org.telegram.messenger.g7;
import org.telegram.messenger.h7;
import org.telegram.messenger.i7;
import org.telegram.messenger.ij;
import org.telegram.messenger.jz;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.r8;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s implements RequestDelegate {
    public final int f16909a;
    public final Object f16910b;
    public final Object f16911c;
    public final int d;
    public final int f16912e;
    public final TLObject f16913f;

    public s(int i7, int i10, int i11, Object obj, Object obj2, TLObject tLObject) {
        this.f16909a = i11;
        this.f16910b = obj;
        this.f16911c = obj2;
        this.d = i7;
        this.f16912e = i10;
        this.f16913f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ConcurrentHashMap concurrentHashMap;
        int i7;
        byte[] bArr;
        int i10;
        switch (this.f16909a) {
            case 0:
                h0 h0Var = (h0) this.f16910b;
                String str = (String) this.f16911c;
                int i11 = this.d;
                int i12 = this.f16912e;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f16913f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i13 = 0; i13 < messages_messages.chats.size(); i13++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i13);
                        hVar.k(chat, chat.f26956id);
                    }
                    for (int i14 = 0; i14 < messages_messages.users.size(); i14++) {
                        TLRPC.User user = messages_messages.users.get(i14);
                        hVar2.k(user, user.f27105id);
                    }
                    for (int i15 = 0; i15 < messages_messages.messages.size(); i15++) {
                        ij ijVar = new ij(h0Var.f16760s0, messages_messages.messages.get(i15), hVar2, hVar, false, true);
                        arrayList.add(ijVar);
                        ijVar.K5(str, true);
                    }
                }
                org.telegram.messenger.g0.h3(new u(h0Var, i11, i12, tL_error, str, tLObject, tL_messages_search, arrayList, 0));
                return;
            case 1:
                h0 h0Var2 = (h0) this.f16910b;
                String str2 = (String) this.f16911c;
                int i16 = this.d;
                int i17 = this.f16912e;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f16913f;
                int i18 = h0Var2.f16760s0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    int i19 = 0;
                    while (i19 < messages_messages2.chats.size()) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i19);
                        hVar3.k(chat2, chat2.f26956id);
                        i19++;
                        h0Var2 = h0Var2;
                    }
                    h0 h0Var3 = h0Var2;
                    for (int i20 = 0; i20 < messages_messages2.users.size(); i20++) {
                        TLRPC.User user2 = messages_messages2.users.get(i20);
                        hVar4.k(user2, user2.f27105id);
                    }
                    int i21 = 0;
                    while (i21 < messages_messages2.messages.size()) {
                        a0.h hVar5 = hVar3;
                        ij ijVar2 = new ij(h0Var3.f16760s0, messages_messages2.messages.get(i21), hVar4, hVar5, false, true);
                        arrayList2.add(ijVar2);
                        ijVar2.K5(str2, true);
                        i21++;
                        hVar3 = hVar5;
                    }
                    h0Var2 = h0Var3;
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    int i22 = 0;
                    while (i22 < messages_messages3.messages.size()) {
                        TLRPC.Message message = messages_messages3.messages.get(i22);
                        long B0 = ij.B0(message);
                        int i23 = i18;
                        if (message.out) {
                            concurrentHashMap = qp.s1(i23).P;
                        } else {
                            concurrentHashMap = qp.s1(i23).O;
                        }
                        TLRPC.messages_Messages messages_messages4 = messages_messages3;
                        if (((Integer) concurrentHashMap.get(Long.valueOf(B0))) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(B0)));
                        }
                        i22++;
                        i18 = i23;
                        messages_messages3 = messages_messages4;
                    }
                }
                int i24 = i18;
                u uVar = new u(h0Var2, i16, i17, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 1);
                if (hashSet.isEmpty()) {
                    org.telegram.messenger.g0.h3(uVar);
                    return;
                } else {
                    yr.a0(i24).f26719a.c(new fi.x1(h0Var2, hashSet, uVar, 16));
                    return;
                }
            default:
                i7 i7Var = (i7) this.f16910b;
                h7 h7Var = (h7) this.f16911c;
                int i25 = this.d;
                int i26 = this.f16912e;
                TLObject tLObject2 = this.f16913f;
                if (h7Var.f22855k) {
                    a8.d("received chunk but definitely cancelled offset=" + h7Var.f22850e + " size=" + h7Var.f22849c + " token=" + h7Var.f22847a);
                    return;
                }
                if (h7Var.f22854j) {
                    a8.d("received cancelled chunk after cancelRequests! offset=" + h7Var.f22850e + " size=" + h7Var.f22849c + " token=" + h7Var.f22847a);
                }
                if (!i7Var.G0.contains(h7Var)) {
                    if (i7Var.H0.contains(h7Var)) {
                        int i27 = 0;
                        boolean z9 = false;
                        while (i27 < i7Var.G0.size()) {
                            h7 h7Var2 = (h7) i7Var.G0.get(i27);
                            if (h7Var2 != null && h7Var2 != h7Var) {
                                i10 = 1;
                                if (h7Var2.f22850e == h7Var.f22850e && h7Var2.f22849c == h7Var.f22849c) {
                                    a8.d("received cancelled chunk faster than new one! received=" + h7Var.f22847a + " new=" + h7Var2.f22847a);
                                    if (!z9) {
                                        i7Var.G0.set(i27, h7Var);
                                        z9 = true;
                                    } else {
                                        i7Var.G0.remove(i27);
                                        i27--;
                                    }
                                }
                            } else {
                                i10 = 1;
                            }
                            i27 += i10;
                        }
                    } else {
                        return;
                    }
                }
                int i28 = 0;
                while (i28 < i7Var.H0.size()) {
                    h7 h7Var3 = (h7) i7Var.H0.get(i28);
                    if (h7Var3 != null && h7Var3 != h7Var && h7Var3.f22850e == h7Var.f22850e && h7Var3.f22849c == h7Var.f22849c) {
                        a8.d("received new chunk faster than cancelled one! received=" + h7Var.f22847a + " cancelled=" + h7Var3.f22847a);
                        i7Var.H0.remove(i28);
                        i28 += -1;
                    }
                    i28++;
                }
                if (r2.f25212a) {
                    StringBuilder sb2 = new StringBuilder("debug_loading: ");
                    sb2.append(i7Var.L0.getName());
                    sb2.append(" time=");
                    sb2.append(System.currentTimeMillis() - h7Var.f22848b);
                    sb2.append(" dcId=");
                    sb2.append(i25);
                    sb2.append(" cdn=");
                    sb2.append(i7Var.f23115u0);
                    sb2.append(" conType=");
                    sb2.append(i26);
                    sb2.append(" reqId");
                    g.s(h7Var.f22847a, sb2);
                }
                if (h7Var == i7Var.f23082f0) {
                    g.u(i7Var.f23082f0.f22850e, new StringBuilder("frame get request completed "));
                    i7Var.f23082f0 = null;
                }
                if (tL_error != null) {
                    Runnable runnable = h7Var.f22856l;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (tL_error.code == -2000) {
                        i7Var.G0.remove(h7Var);
                        long j3 = i7Var.Q;
                        long j10 = h7Var.f22849c;
                        i7Var.Q = j3 - j10;
                        ArrayList arrayList3 = i7Var.O;
                        long j11 = h7Var.f22850e;
                        i7.n(j11, j10 + j11, arrayList3);
                        return;
                    } else if (r8.r(tL_error.text)) {
                        i7Var.p(h7Var);
                        return;
                    } else if ((tLObject2 instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                        i7Var.f23115u0 = false;
                        i7Var.e(h7Var, false, false);
                        i7Var.s(i26);
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                    TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject;
                    if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                        if (i7Var.f23107q0 == null) {
                            i7Var.f23107q0 = new HashMap();
                        }
                        for (int i29 = 0; i29 < tL_upload_fileCdnRedirect.file_hashes.size(); i29++) {
                            TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i29);
                            i7Var.f23107q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
                    if (bArr2 != null && (bArr = tL_upload_fileCdnRedirect.encryption_key) != null && bArr2.length == 16 && bArr.length == 32) {
                        i7Var.f23115u0 = true;
                        if (i7Var.P == null) {
                            ArrayList arrayList4 = new ArrayList();
                            i7Var.P = arrayList4;
                            arrayList4.add(new g7(0L, i7Var.f23106q));
                        }
                        i7Var.f23122y0 = tL_upload_fileCdnRedirect.dc_id;
                        i7Var.f23116v0 = tL_upload_fileCdnRedirect.encryption_iv;
                        i7Var.f23118w0 = tL_upload_fileCdnRedirect.encryption_key;
                        i7Var.f23120x0 = tL_upload_fileCdnRedirect.file_token;
                        i7Var.e(h7Var, false, false);
                        i7Var.s(i26);
                        return;
                    }
                    Runnable runnable2 = h7Var.f22856l;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "bad redirect response";
                    tL_error2.code = 400;
                    i7Var.m(h7Var, tL_error2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
                    if (!i7Var.f23124z0) {
                        i7Var.e(h7Var, false, false);
                        i7Var.f23124z0 = true;
                        TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
                        tL_upload_reuploadCdnFile.file_token = i7Var.f23120x0;
                        tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject).request_token;
                        ConnectionsManager.getInstance(i7Var.R).sendRequest(tL_upload_reuploadCdnFile, new bo(i7Var, i26, h7Var, 1), null, null, 0, i7Var.T, 1, true);
                        return;
                    }
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_upload_file) {
                        h7Var.f22851f = (TLRPC.TL_upload_file) tLObject;
                    } else if (tLObject instanceof TLRPC.TL_upload_webFile) {
                        TLRPC.TL_upload_webFile tL_upload_webFile = (TLRPC.TL_upload_webFile) tLObject;
                        h7Var.f22852g = tL_upload_webFile;
                        if (i7Var.f23071b0 == 0 && (i7 = tL_upload_webFile.size) != 0) {
                            i7Var.f23071b0 = i7;
                        }
                    } else {
                        h7Var.h = (TLRPC.TL_upload_cdnFile) tLObject;
                    }
                    if (tLObject != null) {
                        int i30 = i7Var.f23072b1;
                        if (i30 == 50331648) {
                            jz.e(i7Var.R).h(tLObject.networkType, 3, tLObject.getObjectSize() + 4);
                        } else if (i30 == 33554432) {
                            jz.e(i7Var.R).h(tLObject.networkType, 2, tLObject.getObjectSize() + 4);
                        } else if (i30 == 16777216) {
                            jz.e(i7Var.R).h(tLObject.networkType, 4, tLObject.getObjectSize() + 4);
                        } else if (i30 == 67108864) {
                            String str3 = i7Var.P0;
                            if (str3 != null && (str3.toLowerCase().endsWith("mp3") || i7Var.P0.toLowerCase().endsWith("m4a"))) {
                                jz.e(i7Var.R).h(tLObject.networkType, 7, tLObject.getObjectSize() + 4);
                            } else {
                                jz.e(i7Var.R).h(tLObject.networkType, 5, tLObject.getObjectSize() + 4);
                            }
                        }
                    }
                    if (tL_error == null && tLObject != null) {
                        int objectSize = tLObject.getObjectSize();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j12 = i7Var.f23086g1;
                        if (j12 != 0 && elapsedRealtime - i7Var.f23088h1 <= 2000) {
                            long j13 = i7Var.f23091i1 + objectSize;
                            i7Var.f23091i1 = j13;
                            int i31 = i7Var.f23094j1 + 1;
                            i7Var.f23094j1 = i31;
                            if (i31 >= 2 && j13 >= 131072) {
                                long j14 = elapsedRealtime - j12;
                                if (j14 >= 500) {
                                    long j15 = j13 * 8;
                                    synchronized (b6.class) {
                                        if (j15 > 0 && j14 > 0) {
                                            double d = (j15 * 1000.0d) / j14;
                                            try {
                                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                                long j16 = b6.f21619b;
                                                if (j16 != 0 && elapsedRealtime2 - j16 <= 60000) {
                                                    d = (d * 0.3d) + (b6.f21618a * 0.7d);
                                                }
                                                b6.f21618a = d;
                                                b6.f21619b = elapsedRealtime2;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                    i7Var.f23086g1 = elapsedRealtime;
                                    i7Var.f23091i1 = 0L;
                                    i7Var.f23094j1 = 0;
                                }
                            }
                        } else {
                            i7Var.f23086g1 = elapsedRealtime;
                            i7Var.f23091i1 = 0L;
                            i7Var.f23094j1 = 0;
                        }
                        i7Var.f23088h1 = elapsedRealtime;
                    }
                    i7Var.m(h7Var, tL_error);
                    Runnable runnable3 = h7Var.f22856l;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
        }
    }
}
