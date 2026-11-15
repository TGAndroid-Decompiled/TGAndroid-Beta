package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class na {
    public static volatile na[] f25175g = new na[4];
    public static final Object[] h = new Object[4];
    public final int f25176a;
    public final ma f25177b;
    public final ma f25178c;
    public final ma d;
    public final SharedPreferences f25179e;
    public final ArrayList f25180f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public na(int i7) {
        ArrayList arrayList = new ArrayList();
        this.f25180f = arrayList;
        this.f25176a = i7;
        this.f25177b = new ma(i7);
        this.f25178c = new ma(i7);
        this.d = new ma(i7);
        SharedPreferences sharedPreferences = t0.f26600b.getSharedPreferences("hashtag_search_history" + i7, 0);
        this.f25179e = sharedPreferences;
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

    public static na a(int i7) {
        na naVar;
        na naVar2 = f25175g[i7];
        if (naVar2 == null) {
            synchronized (h[i7]) {
                try {
                    naVar = f25175g[i7];
                    if (naVar == null) {
                        na[] naVarArr = f25175g;
                        na naVar3 = new na(i7);
                        naVarArr[i7] = naVar3;
                        naVar = naVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return naVar;
        }
        return naVar2;
    }

    public final ma b(int i7) {
        if (i7 == 1) {
            return this.f25177b;
        }
        if (i7 == 2) {
            return this.f25178c;
        }
        if (i7 == 3) {
            return this.d;
        }
        throw new RuntimeException("Unknown search type");
    }

    public final void c(String str) {
        if (str.startsWith("#") || str.startsWith("$")) {
            ArrayList arrayList = this.f25180f;
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
        SharedPreferences.Editor edit = this.f25179e.edit();
        edit.clear();
        ArrayList arrayList = this.f25180f;
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
        final ma b10 = b(i10);
        if (b10.f25005k != null || str != null) {
            if (str == null || !str.isEmpty()) {
                if (str == null) {
                    str = b10.f25005k;
                } else if (!TextUtils.equals(str, b10.f25005k)) {
                    b10.a();
                } else if (b10.f25001f) {
                    return;
                }
                final String str4 = str;
                b10.f25005k = str4;
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
                b10.f25001f = true;
                boolean isEmpty = TextUtils.isEmpty(str3);
                int i12 = this.f25176a;
                if (!isEmpty) {
                    TLObject f22 = np.s1(i12).f2(str3);
                    if (f22 == null) {
                        l7 a10 = np.s1(i12).d2().a(str3, null, new z10() {
                            @Override
                            public final void a(Object obj) {
                                Long l10 = (Long) obj;
                                na naVar = na.this;
                                int i13 = naVar.f25176a;
                                ma maVar = b10;
                                String str5 = maVar.f25005k;
                                String str6 = str4;
                                if (TextUtils.equals(str5, str6)) {
                                    TLObject f23 = np.s1(i13).f2(str3);
                                    int i14 = i7;
                                    if (f23 == null) {
                                        if (r5[0] == maVar.f25000e) {
                                            maVar.f25000e = null;
                                            maVar.f25001f = false;
                                            maVar.f25008n = true;
                                            maVar.f25007m = 0;
                                            ns.f(i13).k(ns.I0, Integer.valueOf(i14), Integer.valueOf(maVar.f25007m), Boolean.valueOf(maVar.f25008n), Integer.valueOf(maVar.b()), Integer.valueOf(maVar.f25006l), 0);
                                            return;
                                        }
                                        return;
                                    }
                                    naVar.e(i14, i10, i11, str6);
                                }
                            }
                        });
                        b10.f25000e = a10;
                        final Runnable[] runnableArr = {a10};
                        return;
                    }
                    tLObject = f22;
                }
                if (i10 == 1) {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal.limit = 21;
                    tL_messages_searchGlobal.f28164q = str4;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    tL_channels_searchPosts = tL_messages_searchGlobal;
                    if (b10.f25003i != null) {
                        tL_messages_searchGlobal.offset_rate = b10.f25002g;
                        tL_messages_searchGlobal.offset_id = b10.h;
                        tL_messages_searchGlobal.offset_peer = np.s1(i12).m1(b10.f25003i);
                        tL_channels_searchPosts = tL_messages_searchGlobal;
                    }
                } else if (tLObject != null) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = np.k1(tLObject);
                    tL_messages_search.f28162q = str2;
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
                    if (b10.f25003i != null) {
                        tL_channels_searchPosts2.offset_rate = b10.f25002g;
                        tL_channels_searchPosts2.offset_id = b10.h;
                        tL_channels_searchPosts2.offset_peer = np.s1(i12).m1(b10.f25003i);
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
                                na naVar = na.this;
                                if (i14 < size) {
                                    TLRPC.Message message = arrayList2.get(i14);
                                    i14++;
                                    gj gjVar = new gj(naVar.f25176a, message, null, null, null, null, null, true, true, 0L, false, false, false, i10);
                                    if (gjVar.z2()) {
                                        gjVar.S2 = true;
                                    }
                                    gjVar.K5(str4, false);
                                    arrayList.add(gjVar);
                                } else {
                                    g0.h3(new ka(naVar, r4, b10, messages_messages, arrayList, i7, i11));
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
