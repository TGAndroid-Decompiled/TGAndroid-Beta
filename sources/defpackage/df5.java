package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class df5 {
    public static volatile df5[] g = new df5[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final cf5 b;
    public final cf5 c;
    public final cf5 d;
    public final SharedPreferences e;
    public final ArrayList f;

    static {
        for (int i = 0; i < 4; i++) {
            h[i] = new Object();
        }
    }

    public df5(int i) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.a = i;
        this.b = new cf5(i);
        this.c = new cf5(i);
        this.d = new cf5(i);
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("hashtag_search_history" + i, 0);
        this.e = sharedPreferences;
        int i2 = sharedPreferences.getInt("count", 0);
        arrayList.clear();
        arrayList.ensureCapacity(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            String string = sharedPreferences.getString("e_" + i3, "");
            if (!string.startsWith("#") && !string.startsWith("$")) {
                string = "#".concat(string);
            }
            arrayList.add(string);
        }
    }

    public static df5 a(int i) {
        df5 df5Var;
        df5 df5Var2 = g[i];
        if (df5Var2 == null) {
            synchronized (h[i]) {
                df5Var = g[i];
                if (df5Var == null) {
                    df5[] df5VarArr = g;
                    df5 df5Var3 = new df5(i);
                    df5VarArr[i] = df5Var3;
                    df5Var = df5Var3;
                }
            }
            return df5Var;
        }
        return df5Var2;
    }

    public final cf5 b(int i) {
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        xi4.l("Unknown search type");
        return null;
    }

    public final void c(String str) {
        if (str.startsWith("#") || str.startsWith("$")) {
            ArrayList arrayList = this.f;
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
        SharedPreferences.Editor edit = this.e.edit();
        edit.clear();
        ArrayList arrayList = this.f;
        edit.putInt("count", arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            edit.putString(uh9.k(i, "e_"), (String) arrayList.get(i));
        }
        edit.apply();
    }

    public final void e(final int i, final int i2, final int i3, String str) {
        final String str2;
        String str3;
        final String str4;
        final df5 df5Var;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        final cf5 b = b(i2);
        String str5 = b.k;
        if (str5 != null || str != null) {
            if (str != null) {
                if (!str.isEmpty()) {
                    if (!TextUtils.equals(str, b.k)) {
                        b.a();
                    } else if (b.f) {
                        return;
                    }
                    str2 = str;
                } else {
                    return;
                }
            } else {
                str2 = str5;
            }
            b.k = str2;
            int indexOf = str2.indexOf(64);
            TLObject tLObject = null;
            if (indexOf >= 0) {
                String substring = str2.substring(indexOf + 1);
                str3 = str2.substring(0, indexOf);
                str4 = substring;
            } else {
                str3 = str2;
                str4 = null;
            }
            b.f = true;
            boolean isEmpty = TextUtils.isEmpty(str4);
            int i4 = this.a;
            if (!isEmpty) {
                TLObject c2 = uc7.s1(i4).c2(str4);
                if (c2 == null) {
                    a39 a = uc7.s1(i4).a2().a(str4, null, new pcc() {
                        @Override
                        public final void a(Object obj) {
                            Long l = (Long) obj;
                            df5 df5Var2 = df5.this;
                            int i5 = df5Var2.a;
                            cf5 cf5Var = b;
                            String str6 = cf5Var.k;
                            String str7 = str2;
                            if (TextUtils.equals(str6, str7)) {
                                TLObject c22 = uc7.s1(i5).c2(str4);
                                int i6 = i;
                                if (c22 == null) {
                                    if (r5[0] == cf5Var.e) {
                                        cf5Var.e = null;
                                        cf5Var.f = false;
                                        cf5Var.n = true;
                                        cf5Var.m = 0;
                                        jn7.f(i5).k(jn7.I0, Integer.valueOf(i6), Integer.valueOf(cf5Var.m), Boolean.valueOf(cf5Var.n), Integer.valueOf(cf5Var.b()), Integer.valueOf(cf5Var.l), 0);
                                        return;
                                    }
                                    return;
                                }
                                df5Var2.e(i6, i2, i3, str7);
                            }
                        }
                    });
                    b.e = a;
                    final Runnable[] runnableArr = {a};
                    return;
                }
                df5Var = this;
                tLObject = c2;
            } else {
                df5Var = this;
            }
            if (i2 == 1) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.limit = 21;
                tL_messages_searchGlobal.q = str2;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                tL_channels_searchPosts = tL_messages_searchGlobal;
                if (b.i != null) {
                    tL_messages_searchGlobal.offset_rate = b.g;
                    tL_messages_searchGlobal.offset_id = b.h;
                    tL_messages_searchGlobal.offset_peer = uc7.s1(i4).m1(b.i);
                    tL_channels_searchPosts = tL_messages_searchGlobal;
                }
            } else if (tLObject != null) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.peer = uc7.k1(tLObject);
                tL_messages_search.q = str3;
                tL_messages_search.limit = 21;
                int i5 = b.h;
                tL_channels_searchPosts = tL_messages_search;
                if (i5 != 0) {
                    tL_messages_search.offset_id = i5;
                    tL_channels_searchPosts = tL_messages_search;
                }
            } else {
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts2 = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts2.flags |= 1;
                tL_channels_searchPosts2.hashtag = str2;
                tL_channels_searchPosts2.limit = 21;
                tL_channels_searchPosts2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                tL_channels_searchPosts = tL_channels_searchPosts2;
                if (b.i != null) {
                    tL_channels_searchPosts2.offset_rate = b.g;
                    tL_channels_searchPosts2.offset_id = b.h;
                    tL_channels_searchPosts2.offset_peer = uc7.s1(i4).m1(b.i);
                    tL_channels_searchPosts = tL_channels_searchPosts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i4).sendRequest(tL_channels_searchPosts, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        final ArrayList arrayList = new ArrayList();
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i6 = 0;
                        while (true) {
                            final df5 df5Var2 = df5.this;
                            if (i6 < size) {
                                TLRPC.Message message = arrayList2.get(i6);
                                i6++;
                                r47 r47Var = new r47(df5Var2.a, message, null, null, null, null, null, true, true, 0L, false, false, false, i2);
                                if (r47Var.z2()) {
                                    r47Var.S2 = true;
                                }
                                r47Var.J5(str2, false);
                                arrayList.add(r47Var);
                            } else {
                                final int[] iArr = r4;
                                final cf5 cf5Var = b;
                                final int i7 = i;
                                final int i8 = i3;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z;
                                        int i9 = df5.this.a;
                                        int i10 = iArr[0];
                                        cf5 cf5Var2 = cf5Var;
                                        int i11 = cf5Var2.d;
                                        HashMap hashMap = cf5Var2.b;
                                        if (i10 == i11) {
                                            cf5Var2.d = -1;
                                            cf5Var2.f = false;
                                            TLRPC.messages_Messages messages_messages2 = messages_messages;
                                            cf5Var2.g = messages_messages2.next_rate;
                                            ArrayList arrayList3 = arrayList;
                                            int size2 = arrayList3.size();
                                            int i12 = 0;
                                            while (i12 < size2) {
                                                Object obj = arrayList3.get(i12);
                                                i12++;
                                                r47 r47Var2 = (r47) obj;
                                                bf5 bf5Var = new bf5(r47Var2.k);
                                                Integer num = (Integer) hashMap.get(bf5Var);
                                                if (num == null) {
                                                    int i13 = cf5Var2.j;
                                                    cf5Var2.j = i13 - 1;
                                                    num = Integer.valueOf(i13);
                                                    hashMap.put(bf5Var, num);
                                                    cf5Var2.a.add(r47Var2);
                                                }
                                                TLRPC.Message message2 = r47Var2.k;
                                                message2.realId = message2.id;
                                                message2.id = num.intValue();
                                            }
                                            if (!messages_messages2.messages.isEmpty()) {
                                                TLRPC.Message message3 = (TLRPC.Message) c00.g(1, messages_messages2.messages);
                                                cf5Var2.h = message3.realId;
                                                cf5Var2.i = message3.peer_id;
                                            }
                                            jf7.Y(i9).j1(messages_messages2.users, messages_messages2.chats, true, true);
                                            uc7.s1(i9).j4(messages_messages2.users, false);
                                            uc7.s1(i9).c4(messages_messages2.chats, false);
                                            if (messages_messages2.messages.size() < 21) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            cf5Var2.n = z;
                                            cf5Var2.m = Math.max(messages_messages2.count, messages_messages2.messages.size());
                                            jn7 f = jn7.f(i9);
                                            Integer valueOf = Integer.valueOf(arrayList3.size());
                                            int i14 = i7;
                                            f.k(jn7.C, 0L, valueOf, arrayList3, Boolean.FALSE, 0, 0, 0, 0, 2, Boolean.TRUE, Integer.valueOf(i14), Integer.valueOf(i8), 0, 0, 7);
                                            jn7.f(i9).k(jn7.I0, Integer.valueOf(i14), Integer.valueOf(cf5Var2.m), Boolean.valueOf(cf5Var2.n), Integer.valueOf(cf5Var2.b()), Integer.valueOf(cf5Var2.l), 0);
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                }
            });
            b.d = sendRequest;
            final int[] iArr = {sendRequest};
        }
    }
}
