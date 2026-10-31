package org.telegram.messenger;

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
public final class c7 implements RequestDelegate {
    public final int f14917a;
    public final int f14918b;
    public final int f14919c;
    public final Object d;
    public final Object e;
    public final TLObject f14920f;

    public c7(int i10, int i11, int i12, Object obj, Object obj2, TLObject tLObject) {
        this.f14917a = i12;
        this.d = obj;
        this.e = obj2;
        this.f14918b = i10;
        this.f14919c = i11;
        this.f14920f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        byte[] bArr;
        int i11;
        ConcurrentHashMap concurrentHashMap;
        switch (this.f14917a) {
            case 0:
                m7 m7Var = (m7) this.d;
                l7 l7Var = (l7) this.e;
                int i12 = this.f14918b;
                int i13 = this.f14919c;
                TLObject tLObject2 = this.f14920f;
                if (l7Var.f16712k) {
                    f8.d("received chunk but definitely cancelled offset=" + l7Var.e + " size=" + l7Var.f16707c + " token=" + l7Var.f16705a);
                    return;
                }
                if (l7Var.f16711j) {
                    f8.d("received cancelled chunk after cancelRequests! offset=" + l7Var.e + " size=" + l7Var.f16707c + " token=" + l7Var.f16705a);
                }
                if (!m7Var.G0.contains(l7Var)) {
                    if (m7Var.H0.contains(l7Var)) {
                        int i14 = 0;
                        boolean z10 = false;
                        while (i14 < m7Var.G0.size()) {
                            l7 l7Var2 = (l7) m7Var.G0.get(i14);
                            if (l7Var2 != null && l7Var2 != l7Var) {
                                i11 = 1;
                                if (l7Var2.e == l7Var.e && l7Var2.f16707c == l7Var.f16707c) {
                                    f8.d("received cancelled chunk faster than new one! received=" + l7Var.f16705a + " new=" + l7Var2.f16705a);
                                    if (!z10) {
                                        m7Var.G0.set(i14, l7Var);
                                        z10 = true;
                                    } else {
                                        m7Var.G0.remove(i14);
                                        i14--;
                                    }
                                }
                            } else {
                                i11 = 1;
                            }
                            i14 += i11;
                        }
                    } else {
                        return;
                    }
                }
                int i15 = 0;
                while (i15 < m7Var.H0.size()) {
                    l7 l7Var3 = (l7) m7Var.H0.get(i15);
                    if (l7Var3 != null && l7Var3 != l7Var && l7Var3.e == l7Var.e && l7Var3.f16707c == l7Var.f16707c) {
                        f8.d("received new chunk faster than cancelled one! received=" + l7Var.f16705a + " cancelled=" + l7Var3.f16705a);
                        m7Var.H0.remove(i15);
                        i15 += -1;
                    }
                    i15++;
                }
                if (v2.f18448a) {
                    StringBuilder sb2 = new StringBuilder("debug_loading: ");
                    sb2.append(m7Var.L0.getName());
                    sb2.append(" time=");
                    sb2.append(System.currentTimeMillis() - l7Var.f16706b);
                    sb2.append(" dcId=");
                    sb2.append(i12);
                    sb2.append(" cdn=");
                    sb2.append(m7Var.f16919u0);
                    sb2.append(" conType=");
                    sb2.append(i13);
                    sb2.append(" reqId");
                    i0.a.p(l7Var.f16705a, sb2);
                }
                if (l7Var == m7Var.f16886f0) {
                    i0.a.q(m7Var.f16886f0.e, new StringBuilder("frame get request completed "));
                    m7Var.f16886f0 = null;
                }
                if (tL_error != null) {
                    Runnable runnable = l7Var.f16713l;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (tL_error.code == -2000) {
                        m7Var.G0.remove(l7Var);
                        long j10 = m7Var.Q;
                        long j11 = l7Var.f16707c;
                        m7Var.Q = j10 - j11;
                        ArrayList arrayList = m7Var.O;
                        long j12 = l7Var.e;
                        m7.n(j12, j11 + j12, arrayList);
                        return;
                    } else if (w8.r(tL_error.text)) {
                        m7Var.p(l7Var);
                        return;
                    } else if ((tLObject2 instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                        m7Var.f16919u0 = false;
                        m7Var.e(l7Var, false, false);
                        m7Var.s(i13);
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_upload_fileCdnRedirect) {
                    TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject;
                    if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                        if (m7Var.f16911q0 == null) {
                            m7Var.f16911q0 = new HashMap();
                        }
                        for (int i16 = 0; i16 < tL_upload_fileCdnRedirect.file_hashes.size(); i16++) {
                            TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i16);
                            m7Var.f16911q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
                    if (bArr2 != null && (bArr = tL_upload_fileCdnRedirect.encryption_key) != null && bArr2.length == 16 && bArr.length == 32) {
                        m7Var.f16919u0 = true;
                        if (m7Var.P == null) {
                            ArrayList arrayList2 = new ArrayList();
                            m7Var.P = arrayList2;
                            arrayList2.add(new k7(0L, m7Var.f16910q));
                        }
                        m7Var.f16926y0 = tL_upload_fileCdnRedirect.dc_id;
                        m7Var.f16920v0 = tL_upload_fileCdnRedirect.encryption_iv;
                        m7Var.f16922w0 = tL_upload_fileCdnRedirect.encryption_key;
                        m7Var.f16924x0 = tL_upload_fileCdnRedirect.file_token;
                        m7Var.e(l7Var, false, false);
                        m7Var.s(i13);
                        return;
                    }
                    Runnable runnable2 = l7Var.f16713l;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "bad redirect response";
                    tL_error2.code = 400;
                    m7Var.m(l7Var, tL_error2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
                    if (!m7Var.f16928z0) {
                        m7Var.e(l7Var, false, false);
                        m7Var.f16928z0 = true;
                        TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
                        tL_upload_reuploadCdnFile.file_token = m7Var.f16924x0;
                        tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject).request_token;
                        ConnectionsManager.getInstance(m7Var.R).sendRequest(tL_upload_reuploadCdnFile, new fo(m7Var, i13, l7Var, 1), null, null, 0, m7Var.T, 1, true);
                        return;
                    }
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_upload_file) {
                        l7Var.f16708f = (TLRPC.TL_upload_file) tLObject;
                    } else if (tLObject instanceof TLRPC.TL_upload_webFile) {
                        TLRPC.TL_upload_webFile tL_upload_webFile = (TLRPC.TL_upload_webFile) tLObject;
                        l7Var.f16709g = tL_upload_webFile;
                        if (m7Var.f16876b0 == 0 && (i10 = tL_upload_webFile.size) != 0) {
                            m7Var.f16876b0 = i10;
                        }
                    } else {
                        l7Var.h = (TLRPC.TL_upload_cdnFile) tLObject;
                    }
                    if (tLObject != null) {
                        int i17 = m7Var.f16877b1;
                        if (i17 == 50331648) {
                            uz.e(m7Var.R).h(tLObject.networkType, 3, tLObject.getObjectSize() + 4);
                        } else if (i17 == 33554432) {
                            uz.e(m7Var.R).h(tLObject.networkType, 2, tLObject.getObjectSize() + 4);
                        } else if (i17 == 16777216) {
                            uz.e(m7Var.R).h(tLObject.networkType, 4, tLObject.getObjectSize() + 4);
                        } else if (i17 == 67108864) {
                            String str = m7Var.P0;
                            if (str != null && (str.toLowerCase().endsWith("mp3") || m7Var.P0.toLowerCase().endsWith("m4a"))) {
                                uz.e(m7Var.R).h(tLObject.networkType, 7, tLObject.getObjectSize() + 4);
                            } else {
                                uz.e(m7Var.R).h(tLObject.networkType, 5, tLObject.getObjectSize() + 4);
                            }
                        }
                    }
                    if (tL_error == null && tLObject != null) {
                        int objectSize = tLObject.getObjectSize();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j13 = m7Var.f16890g1;
                        if (j13 != 0 && elapsedRealtime - m7Var.f16892h1 <= 2000) {
                            long j14 = m7Var.f16895i1 + objectSize;
                            m7Var.f16895i1 = j14;
                            int i18 = m7Var.f16898j1 + 1;
                            m7Var.f16898j1 = i18;
                            if (i18 >= 2 && j14 >= 131072) {
                                long j15 = elapsedRealtime - j13;
                                if (j15 >= 500) {
                                    long j16 = j14 * 8;
                                    synchronized (d6.class) {
                                        if (j16 > 0 && j15 > 0) {
                                            double d = (j16 * 1000.0d) / j15;
                                            try {
                                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                                long j17 = d6.f15185b;
                                                if (j17 != 0 && elapsedRealtime2 - j17 <= 60000) {
                                                    d = (d * 0.3d) + (d6.f15184a * 0.7d);
                                                }
                                                d6.f15184a = d;
                                                d6.f15185b = elapsedRealtime2;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                    m7Var.f16890g1 = elapsedRealtime;
                                    m7Var.f16895i1 = 0L;
                                    m7Var.f16898j1 = 0;
                                }
                            }
                        } else {
                            m7Var.f16890g1 = elapsedRealtime;
                            m7Var.f16895i1 = 0L;
                            m7Var.f16898j1 = 0;
                        }
                        m7Var.f16892h1 = elapsedRealtime;
                    }
                    m7Var.m(l7Var, tL_error);
                    Runnable runnable3 = l7Var.f16713l;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
            case 1:
                zf.z zVar = (zf.z) this.d;
                String str2 = (String) this.e;
                int i19 = this.f14918b;
                int i20 = this.f14919c;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f14920f;
                ArrayList arrayList3 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i21 = 0; i21 < messages_messages.chats.size(); i21++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i21);
                        hVar.k(chat, chat.f19793id);
                    }
                    for (int i22 = 0; i22 < messages_messages.users.size(); i22++) {
                        TLRPC.User user = messages_messages.users.get(i22);
                        hVar2.k(user, user.f19942id);
                    }
                    for (int i23 = 0; i23 < messages_messages.messages.size(); i23++) {
                        jj jjVar = new jj(zVar.f55704s0, messages_messages.messages.get(i23), hVar2, hVar, false, true);
                        arrayList3.add(jjVar);
                        jjVar.J5(str2, true);
                    }
                }
                i0.g3(new bg(zVar, i19, i20, tL_error, str2, tLObject, tL_messages_search, arrayList3, 1));
                return;
            default:
                zf.z zVar2 = (zf.z) this.d;
                String str3 = (String) this.e;
                int i24 = this.f14918b;
                int i25 = this.f14919c;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f14920f;
                int i26 = zVar2.f55704s0;
                ArrayList arrayList4 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    for (int i27 = 0; i27 < messages_messages2.chats.size(); i27++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i27);
                        hVar3.k(chat2, chat2.f19793id);
                    }
                    for (int i28 = 0; i28 < messages_messages2.users.size(); i28++) {
                        TLRPC.User user2 = messages_messages2.users.get(i28);
                        hVar4.k(user2, user2.f19942id);
                    }
                    for (int i29 = 0; i29 < messages_messages2.messages.size(); i29++) {
                        jj jjVar2 = new jj(zVar2.f55704s0, messages_messages2.messages.get(i29), hVar4, hVar3, false, true);
                        arrayList4.add(jjVar2);
                        jjVar2.J5(str3, true);
                    }
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    for (int i30 = 0; i30 < messages_messages3.messages.size(); i30++) {
                        TLRPC.Message message = messages_messages3.messages.get(i30);
                        long B0 = jj.B0(message);
                        if (message.out) {
                            concurrentHashMap = vp.r1(i26).P;
                        } else {
                            concurrentHashMap = vp.r1(i26).O;
                        }
                        if (((Integer) concurrentHashMap.get(Long.valueOf(B0))) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(B0)));
                        }
                    }
                }
                bg bgVar = new bg(zVar2, i24, i25, tL_error, str3, tLObject, tL_messages_searchGlobal, arrayList4, 2);
                if (hashSet.isEmpty()) {
                    i0.g3(bgVar);
                    return;
                } else {
                    hs.a0(i26).f15938a.c(new rh.l5(zVar2, hashSet, bgVar, 27));
                    return;
                }
        }
    }
}
