package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa {
    public static volatile oa[] f24311g = new oa[4];
    public static final Object[] h = new Object[4];
    public final int f24312a;
    public final na f24313b;
    public final na f24314c;
    public final na d;
    public final SharedPreferences f24315e;
    public final ArrayList f24316f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public oa(int i7) {
        ArrayList arrayList = new ArrayList();
        this.f24316f = arrayList;
        this.f24312a = i7;
        this.f24313b = new na(i7);
        this.f24314c = new na(i7);
        this.d = new na(i7);
        SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("hashtag_search_history" + i7, 0);
        this.f24315e = sharedPreferences;
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

    public static oa a(int i7) {
        oa oaVar;
        oa oaVar2 = f24311g[i7];
        if (oaVar2 == null) {
            synchronized (h[i7]) {
                try {
                    oaVar = f24311g[i7];
                    if (oaVar == null) {
                        oa[] oaVarArr = f24311g;
                        oa oaVar3 = new oa(i7);
                        oaVarArr[i7] = oaVar3;
                        oaVar = oaVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return oaVar;
        }
        return oaVar2;
    }

    public final na b(int i7) {
        if (i7 == 1) {
            return this.f24313b;
        }
        if (i7 == 2) {
            return this.f24314c;
        }
        if (i7 == 3) {
            return this.d;
        }
        throw new RuntimeException("Unknown search type");
    }

    public final void c(String str) {
        if (str.startsWith("#") || str.startsWith("$")) {
            ArrayList arrayList = this.f24316f;
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
        SharedPreferences.Editor edit = this.f24315e.edit();
        edit.clear();
        ArrayList arrayList = this.f24316f;
        edit.putInt("count", arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            edit.putString(jg.g.j(i7, "e_"), (String) arrayList.get(i7));
        }
        edit.apply();
    }

    public final void e(final int i7, final int i10, final int i11, String str) {
        String str2;
        final String str3;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        final na b10 = b(i10);
        if (b10.f24167k != null || str != null) {
            if (str == null || !str.isEmpty()) {
                if (str == null) {
                    str = b10.f24167k;
                } else if (!TextUtils.equals(str, b10.f24167k)) {
                    b10.a();
                } else if (b10.f24163f) {
                    return;
                }
                final String str4 = str;
                b10.f24167k = str4;
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
                b10.f24163f = true;
                boolean isEmpty = TextUtils.isEmpty(str3);
                int i12 = this.f24312a;
                if (!isEmpty) {
                    TLObject f22 = qp.s1(i12).f2(str3);
                    if (f22 == null) {
                        l7 a10 = qp.s1(i12).d2().a(str3, null, new c20() {
                            @Override
                            public final void a(Object obj) {
                                Long l10 = (Long) obj;
                                oa oaVar = oa.this;
                                int i13 = oaVar.f24312a;
                                na naVar = b10;
                                String str5 = naVar.f24167k;
                                String str6 = str4;
                                if (TextUtils.equals(str5, str6)) {
                                    TLObject f23 = qp.s1(i13).f2(str3);
                                    int i14 = i7;
                                    if (f23 == null) {
                                        if (r5[0] == naVar.f24162e) {
                                            naVar.f24162e = null;
                                            naVar.f24163f = false;
                                            naVar.f24170n = true;
                                            naVar.f24169m = 0;
                                            qs.f(i13).k(qs.I0, Integer.valueOf(i14), Integer.valueOf(naVar.f24169m), Boolean.valueOf(naVar.f24170n), Integer.valueOf(naVar.b()), Integer.valueOf(naVar.f24168l), 0);
                                            return;
                                        }
                                        return;
                                    }
                                    oaVar.e(i14, i10, i11, str6);
                                }
                            }
                        });
                        b10.f24162e = a10;
                        final Runnable[] runnableArr = {a10};
                        return;
                    }
                    tLObject = f22;
                }
                if (i10 == 1) {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal.limit = 21;
                    tL_messages_searchGlobal.f27069q = str4;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    tL_channels_searchPosts = tL_messages_searchGlobal;
                    if (b10.f24165i != null) {
                        tL_messages_searchGlobal.offset_rate = b10.f24164g;
                        tL_messages_searchGlobal.offset_id = b10.h;
                        tL_messages_searchGlobal.offset_peer = qp.s1(i12).m1(b10.f24165i);
                        tL_channels_searchPosts = tL_messages_searchGlobal;
                    }
                } else if (tLObject != null) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = qp.k1(tLObject);
                    tL_messages_search.f27067q = str2;
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
                    if (b10.f24165i != null) {
                        tL_channels_searchPosts2.offset_rate = b10.f24164g;
                        tL_channels_searchPosts2.offset_id = b10.h;
                        tL_channels_searchPosts2.offset_peer = qp.s1(i12).m1(b10.f24165i);
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
                                oa oaVar = oa.this;
                                if (i14 < size) {
                                    TLRPC.Message message = arrayList2.get(i14);
                                    i14++;
                                    ij ijVar = new ij(oaVar.f24312a, message, null, null, null, null, null, true, true, 0L, false, false, false, i10);
                                    if (ijVar.A2()) {
                                        ijVar.Q2 = true;
                                    }
                                    ijVar.L5(str4, false);
                                    arrayList.add(ijVar);
                                } else {
                                    g0.h3(new la(oaVar, r4, b10, messages_messages, arrayList, i7, i11));
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
