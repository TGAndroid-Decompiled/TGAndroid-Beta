package gg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr0;
public class b2 {
    public a2 f10530a;
    public ArrayList f10538k;
    public ArrayList f10539l;
    public String f10541n;
    public final boolean f10542o;
    public ArrayList f10544q;
    public HashMap f10545r;
    public final ArrayList f10531b = new ArrayList();
    public String f10532c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f10533e = new ArrayList();
    public final a0.i f10534f = new a0.i();
    public final ArrayList f10535g = new ArrayList();
    public final a0.i h = new a0.i();
    public final a0.i f10536i = new a0.i();
    public final ArrayList f10537j = new ArrayList();
    public final int f10540m = UserConfig.selectedAccount;
    public boolean f10543p = true;
    public boolean f10546s = false;

    public b2(boolean z10) {
        this.f10542o = z10;
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
                if (this.f10545r == null) {
                    this.f10545r = new HashMap();
                    this.f10544q = new ArrayList();
                }
                z1 z1Var = (z1) this.f10545r.get(charSequence2);
                if (z1Var == 0) {
                    z1Var = new Object();
                    z1Var.f10877a = charSequence2;
                    this.f10545r.put(charSequence2, z1Var);
                } else {
                    this.f10544q.remove((Object) z1Var);
                }
                z1Var.f10878b = (int) (System.currentTimeMillis() / 1000);
                this.f10544q.add(0, z1Var);
                z10 = true;
            }
            if (z10) {
                MessagesStorage.getInstance(this.f10540m).getStorageQueue().postRunnable(new w1(0, this, this.f10544q));
            }
        }
    }

    public final void b() {
        this.f10533e.clear();
        this.f10534f.b();
        this.d.clear();
    }

    public final void c() {
        this.f10544q = new ArrayList();
        this.f10545r = new HashMap();
        MessagesStorage.getInstance(this.f10540m).getStorageQueue().postRunnable(new y1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f10531b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f10538k = arrayList;
        this.f10539l = arrayList2;
        a0.i iVar = this.f10534f;
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
                    if (obj instanceof g0) {
                        obj = ((g0) obj).f10607a;
                    }
                    if (obj instanceof gr0) {
                        obj = ((gr0) obj).f26498b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f10533e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) iVar.f(user.f19949id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            iVar.l(user2.f19949id);
                        }
                        long j3 = user.f19949id;
                        a0.i iVar2 = this.h;
                        TLObject tLObject = (TLObject) iVar2.f(j3);
                        if (tLObject != null) {
                            this.f10535g.remove(tLObject);
                            iVar2.l(user.f19949id);
                        }
                        long j10 = user.f19949id;
                        a0.i iVar3 = this.f10536i;
                        Object f7 = iVar3.f(j10);
                        if (f7 != null) {
                            this.f10537j.remove(f7);
                            iVar3.l(user.f19949id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) iVar.f(-((TLRPC.Chat) obj).f19802id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        iVar.l(-chat.f19802id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j3, z14, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: gg.b2.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public final void i() {
        a0.i iVar = this.f10534f;
        if (iVar.m() != 0) {
            a0.i iVar2 = this.h;
            int m10 = iVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) iVar.f(iVar2.j(i10));
                if (user != null) {
                    this.f10533e.remove(user);
                    this.d.remove(user);
                    iVar.l(user.f19949id);
                }
            }
        }
    }
}
