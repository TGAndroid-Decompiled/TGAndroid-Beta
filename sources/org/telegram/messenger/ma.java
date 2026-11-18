package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public static volatile ma[] f25547g = new ma[4];
    public static final Object[] h = new Object[4];
    public final int f25548a;
    public final la f25549b;
    public final la f25550c;
    public final la d;
    public final SharedPreferences f25551e;
    public final ArrayList f25552f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public ma(int i7) {
        ArrayList arrayList = new ArrayList();
        this.f25552f = arrayList;
        this.f25548a = i7;
        this.f25549b = new la(i7);
        this.f25550c = new la(i7);
        this.d = new la(i7);
        SharedPreferences sharedPreferences = t0.f26913b.getSharedPreferences("hashtag_search_history" + i7, 0);
        this.f25551e = sharedPreferences;
        int i10 = sharedPreferences.getInt("count", 0);
        arrayList.clear();
        arrayList.ensureCapacity(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            String string = sharedPreferences.getString("e_" + i11, "");
            if (!string.startsWith("#") && !string.startsWith("$")) {
                string = "#".concat(string);
            }
            arrayList.add(string);
        }
    }

    public static ma a(int i7) {
        ma maVar;
        ma maVar2 = f25547g[i7];
        if (maVar2 == null) {
            synchronized (h[i7]) {
                try {
                    maVar = f25547g[i7];
                    if (maVar == null) {
                        ma[] maVarArr = f25547g;
                        ma maVar3 = new ma(i7);
                        maVarArr[i7] = maVar3;
                        maVar = maVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return maVar;
        }
        return maVar2;
    }

    public final la b(int i7) {
        if (i7 == 1) {
            return this.f25549b;
        }
        if (i7 == 2) {
            return this.f25550c;
        }
        if (i7 == 3) {
            return this.d;
        }
        throw new RuntimeException("Unknown search type");
    }

    public final void c(String str) {
        if (str.startsWith("#") || str.startsWith("$")) {
            ArrayList arrayList = this.f25552f;
            int indexOf = arrayList.indexOf(str);
            if (indexOf != -1) {
                if (indexOf == 0) {
                    return;
                }
                arrayList.remove(indexOf);
            }
            arrayList.add(0, str);
            if (arrayList.size() >= 100) {
                arrayList.subList(99, arrayList.size()).clear();
            }
            d();
        }
    }

    public final void d() {
        SharedPreferences.Editor edit = this.f25551e.edit();
        edit.clear();
        ArrayList arrayList = this.f25552f;
        edit.putInt("count", arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            edit.putString(i5.c.i(i7, "e_"), (String) arrayList.get(i7));
        }
        edit.apply();
    }

    public final void e(final int i7, final int i10, final int i11, String str) {
        String str2;
        final String str3;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        final la b10 = b(i10);
        if (b10.f25347k != null || str != null) {
            if (str == null || !str.isEmpty()) {
                if (str == null) {
                    str = b10.f25347k;
                } else if (!TextUtils.equals(str, b10.f25347k)) {
                    b10.a();
                } else if (b10.f25343f) {
                    return;
                }
                final String str4 = str;
                b10.f25347k = str4;
                int indexOf = str4.indexOf(64);
                TLObject tLObject = null;
                if (indexOf >= 0) {
                    String substring = str4.substring(indexOf + 1);
                    str2 = str4.substring(0, indexOf);
                    str3 = substring;
                } else {
                    str2 = str4;
                    str3 = null;
                }
                b10.f25343f = true;
                boolean isEmpty = TextUtils.isEmpty(str3);
                int i12 = this.f25548a;
                if (!isEmpty) {
                    TLObject h22 = mp.u1(i12).h2(str3);
                    if (h22 == null) {
                        l7 a10 = mp.u1(i12).f2().a(str3, null, new x10() {
                            @Override
                            public final void a(Object obj) {
                                Long l10 = (Long) obj;
                                ma maVar = ma.this;
                                int i13 = maVar.f25548a;
                                la laVar = b10;
                                String str5 = laVar.f25347k;
                                String str6 = str4;
                                if (TextUtils.equals(str5, str6)) {
                                    TLObject h23 = mp.u1(i13).h2(str3);
                                    int i14 = i7;
                                    if (h23 == null) {
                                        if (r5[0] == laVar.f25342e) {
                                            laVar.f25342e = null;
                                            laVar.f25343f = false;
                                            laVar.f25350n = true;
                                            laVar.f25349m = 0;
                                            ks.f(i13).k(ks.I0, Integer.valueOf(i14), Integer.valueOf(laVar.f25349m), Boolean.valueOf(laVar.f25350n), Integer.valueOf(laVar.b()), Integer.valueOf(laVar.f25348l), 0);
                                            return;
                                        }
                                        return;
                                    }
                                    maVar.e(i14, i10, i11, str6);
                                }
                            }
                        });
                        b10.f25342e = a10;
                        final Runnable[] runnableArr = {a10};
                        return;
                    }
                    tLObject = h22;
                }
                if (i10 == 1) {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal.limit = 21;
                    tL_messages_searchGlobal.f28516q = str4;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    tL_channels_searchPosts = tL_messages_searchGlobal;
                    if (b10.f25345i != null) {
                        tL_messages_searchGlobal.offset_rate = b10.f25344g;
                        tL_messages_searchGlobal.offset_id = b10.h;
                        tL_messages_searchGlobal.offset_peer = mp.u1(i12).o1(b10.f25345i);
                        tL_channels_searchPosts = tL_messages_searchGlobal;
                    }
                } else if (tLObject != null) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = mp.m1(tLObject);
                    tL_messages_search.f28514q = str2;
                    tL_messages_search.limit = 21;
                    int i13 = b10.h;
                    tL_channels_searchPosts = tL_messages_search;
                    if (i13 != 0) {
                        tL_messages_search.offset_id = i13;
                        tL_channels_searchPosts = tL_messages_search;
                    }
                } else {
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts2 = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts2.flags |= 1;
                    tL_channels_searchPosts2.hashtag = str4;
                    tL_channels_searchPosts2.limit = 21;
                    tL_channels_searchPosts2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    tL_channels_searchPosts = tL_channels_searchPosts2;
                    if (b10.f25345i != null) {
                        tL_channels_searchPosts2.offset_rate = b10.f25344g;
                        tL_channels_searchPosts2.offset_id = b10.h;
                        tL_channels_searchPosts2.offset_peer = mp.u1(i12).o1(b10.f25345i);
                        tL_channels_searchPosts = tL_channels_searchPosts2;
                    }
                }
                int sendRequest = ConnectionsManager.getInstance(i12).sendRequest(tL_channels_searchPosts, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        if (tLObject2 instanceof TLRPC.messages_Messages) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                            ArrayList arrayList = new ArrayList();
                            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                            int size = arrayList2.size();
                            int i14 = 0;
                            while (true) {
                                ma maVar = ma.this;
                                if (i14 < size) {
                                    TLRPC.Message message = arrayList2.get(i14);
                                    i14++;
                                    fj fjVar = new fj(maVar.f25548a, message, null, null, null, null, null, true, true, 0L, false, false, false, i10);
                                    if (fjVar.z2()) {
                                        fjVar.S2 = true;
                                    }
                                    fjVar.K5(str4, false);
                                    arrayList.add(fjVar);
                                } else {
                                    g0.g3(new ja(maVar, r4, b10, messages_messages, arrayList, i7, i11));
                                    return;
                                }
                            }
                        }
                    }
                });
                b10.d = sendRequest;
                final int[] iArr = {sendRequest};
            }
        }
    }
}
