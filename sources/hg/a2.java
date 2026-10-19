package hg;

import ei.p6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sq0;
public class a2 {
    public z1 f11794a;
    public ArrayList f11801k;
    public ArrayList f11802l;
    public String f11804n;
    public final boolean f11805o;
    public ArrayList f11807q;
    public HashMap f11808r;
    public final ArrayList f11795b = new ArrayList();
    public String f11796c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.h f11797f = new a0.h();
    public final ArrayList f11798g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f11799i = new a0.h();
    public final ArrayList f11800j = new ArrayList();
    public final int f11803m = UserConfig.selectedAccount;
    public boolean f11806p = true;
    public boolean f11809s = false;

    public a2(boolean z10) {
        this.f11805o = z10;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence != null) {
            Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
            boolean z10 = false;
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (charSequence.charAt(start) != '@' && charSequence.charAt(start) != '#') {
                    start++;
                }
                String charSequence2 = charSequence.subSequence(start, end).toString();
                if (this.f11808r == null) {
                    this.f11808r = new HashMap();
                    this.f11807q = new ArrayList();
                }
                y1 y1Var = (y1) this.f11808r.get(charSequence2);
                if (y1Var == 0) {
                    y1Var = new Object();
                    y1Var.f12111a = charSequence2;
                    this.f11808r.put(charSequence2, y1Var);
                } else {
                    this.f11807q.remove((Object) y1Var);
                }
                y1Var.f12112b = (int) (System.currentTimeMillis() / 1000);
                this.f11807q.add(0, y1Var);
                z10 = true;
            }
            if (z10) {
                MessagesStorage.getInstance(this.f11803m).getStorageQueue().postRunnable(new p6(28, this, this.f11807q));
            }
        }
    }

    public final void b() {
        this.e.clear();
        this.f11797f.b();
        this.d.clear();
    }

    public final void c() {
        this.f11807q = new ArrayList();
        this.f11808r = new HashMap();
        MessagesStorage.getInstance(this.f11803m).getStorageQueue().postRunnable(new x1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f11795b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f11801k = arrayList;
        this.f11802l = arrayList2;
        a0.h hVar = this.f11797f;
        if (hVar.m() != 0) {
            if (arrayList != null || arrayList2 != null) {
                if (arrayList == null) {
                    size = 0;
                } else {
                    size = arrayList.size();
                }
                if (arrayList2 == null) {
                    size2 = 0;
                } else {
                    size2 = arrayList2.size();
                }
                int i10 = size2 + size;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 < size) {
                        obj = arrayList.get(i11);
                    } else {
                        obj = arrayList2.get(i11 - size);
                    }
                    if (obj instanceof g0) {
                        obj = ((g0) obj).f11868a;
                    }
                    if (obj instanceof sq0) {
                        obj = ((sq0) obj).f30308b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f20422id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f20422id);
                        }
                        long j10 = user.f20422id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f11798g.remove(tLObject);
                            hVar2.l(user.f20422id);
                        }
                        long j11 = user.f20422id;
                        a0.h hVar3 = this.f11799i;
                        Object f7 = hVar3.f(j11);
                        if (f7 != null) {
                            this.f11800j.remove(f7);
                            hVar3.l(user.f20422id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f20275id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f20275id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j10, z14, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: hg.a2.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public final void i() {
        a0.h hVar = this.f11797f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f20422id);
                }
            }
        }
    }
}
