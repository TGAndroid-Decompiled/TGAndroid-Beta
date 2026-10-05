package gg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq0;
public class c2 {
    public b2 f10532a;
    public ArrayList f10540k;
    public ArrayList f10541l;
    public String f10543n;
    public final boolean f10544o;
    public ArrayList f10546q;
    public HashMap f10547r;
    public final ArrayList f10533b = new ArrayList();
    public String f10534c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f10535e = new ArrayList();
    public final a0.i f10536f = new a0.i();
    public final ArrayList f10537g = new ArrayList();
    public final a0.i h = new a0.i();
    public final a0.i f10538i = new a0.i();
    public final ArrayList f10539j = new ArrayList();
    public final int f10542m = UserConfig.selectedAccount;
    public boolean f10545p = true;
    public boolean f10548s = false;

    public c2(boolean z10) {
        this.f10544o = z10;
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
                if (this.f10547r == null) {
                    this.f10547r = new HashMap();
                    this.f10546q = new ArrayList();
                }
                a2 a2Var = (a2) this.f10547r.get(charSequence2);
                if (a2Var == 0) {
                    a2Var = new Object();
                    a2Var.f10513a = charSequence2;
                    this.f10547r.put(charSequence2, a2Var);
                } else {
                    this.f10546q.remove((Object) a2Var);
                }
                a2Var.f10514b = (int) (System.currentTimeMillis() / 1000);
                this.f10546q.add(0, a2Var);
                z10 = true;
            }
            if (z10) {
                MessagesStorage.getInstance(this.f10542m).getStorageQueue().postRunnable(new x1(0, this, this.f10546q));
            }
        }
    }

    public final void b() {
        this.f10535e.clear();
        this.f10536f.b();
        this.d.clear();
    }

    public final void c() {
        this.f10546q = new ArrayList();
        this.f10547r = new HashMap();
        MessagesStorage.getInstance(this.f10542m).getStorageQueue().postRunnable(new z1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f10533b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f10540k = arrayList;
        this.f10541l = arrayList2;
        a0.i iVar = this.f10536f;
        if (iVar.m() != 0) {
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
                    if (obj instanceof h0) {
                        obj = ((h0) obj).f10602a;
                    }
                    if (obj instanceof pq0) {
                        obj = ((pq0) obj).f29826b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f10535e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) iVar.f(user.f20194id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            iVar.l(user2.f20194id);
                        }
                        long j3 = user.f20194id;
                        a0.i iVar2 = this.h;
                        TLObject tLObject = (TLObject) iVar2.f(j3);
                        if (tLObject != null) {
                            this.f10537g.remove(tLObject);
                            iVar2.l(user.f20194id);
                        }
                        long j10 = user.f20194id;
                        a0.i iVar3 = this.f10538i;
                        Object f7 = iVar3.f(j10);
                        if (f7 != null) {
                            this.f10539j.remove(f7);
                            iVar3.l(user.f20194id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) iVar.f(-((TLRPC.Chat) obj).f20047id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        iVar.l(-chat.f20047id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j3, z14, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final org.telegram.ui.ActionBar.m5 r35) {
        throw new UnsupportedOperationException("Method not decompiled: gg.c2.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, org.telegram.ui.ActionBar.m5):void");
    }

    public final void i() {
        a0.i iVar = this.f10536f;
        if (iVar.m() != 0) {
            a0.i iVar2 = this.h;
            int m10 = iVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) iVar.f(iVar2.j(i10));
                if (user != null) {
                    this.f10535e.remove(user);
                    this.d.remove(user);
                    iVar.l(user.f20194id);
                }
            }
        }
    }
}
