package gg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jq0;
public class c2 {
    public b2 f9671a;
    public ArrayList f9678k;
    public ArrayList f9679l;
    public String f9681n;
    public final boolean f9682o;
    public ArrayList f9684q;
    public HashMap f9685r;
    public final ArrayList f9672b = new ArrayList();
    public String f9673c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.i f9674f = new a0.i();
    public final ArrayList f9675g = new ArrayList();
    public final a0.i h = new a0.i();
    public final a0.i f9676i = new a0.i();
    public final ArrayList f9677j = new ArrayList();
    public final int f9680m = UserConfig.selectedAccount;
    public boolean f9683p = true;
    public boolean f9686s = false;

    public c2(boolean z10) {
        this.f9682o = z10;
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
                if (this.f9685r == null) {
                    this.f9685r = new HashMap();
                    this.f9684q = new ArrayList();
                }
                a2 a2Var = (a2) this.f9685r.get(charSequence2);
                if (a2Var == 0) {
                    a2Var = new Object();
                    a2Var.f9655a = charSequence2;
                    this.f9685r.put(charSequence2, a2Var);
                } else {
                    this.f9684q.remove((Object) a2Var);
                }
                a2Var.f9656b = (int) (System.currentTimeMillis() / 1000);
                this.f9684q.add(0, a2Var);
                z10 = true;
            }
            if (z10) {
                MessagesStorage.getInstance(this.f9680m).getStorageQueue().postRunnable(new x1(0, this, this.f9684q));
            }
        }
    }

    public final void b() {
        this.e.clear();
        this.f9674f.b();
        this.d.clear();
    }

    public final void c() {
        this.f9684q = new ArrayList();
        this.f9685r = new HashMap();
        MessagesStorage.getInstance(this.f9680m).getStorageQueue().postRunnable(new z1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f9672b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f9678k = arrayList;
        this.f9679l = arrayList2;
        a0.i iVar = this.f9674f;
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
                        obj = ((h0) obj).f9735a;
                    }
                    if (obj instanceof jq0) {
                        obj = ((jq0) obj).f25504b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) iVar.f(user.f18482id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            iVar.l(user2.f18482id);
                        }
                        long j3 = user.f18482id;
                        a0.i iVar2 = this.h;
                        TLObject tLObject = (TLObject) iVar2.f(j3);
                        if (tLObject != null) {
                            this.f9675g.remove(tLObject);
                            iVar2.l(user.f18482id);
                        }
                        long j10 = user.f18482id;
                        a0.i iVar3 = this.f9676i;
                        Object f7 = iVar3.f(j10);
                        if (f7 != null) {
                            this.f9677j.remove(f7);
                            iVar3.l(user.f18482id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) iVar.f(-((TLRPC.Chat) obj).f18335id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        iVar.l(-chat.f18335id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j3, z14, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final org.telegram.ui.ActionBar.l5 r35) {
        throw new UnsupportedOperationException("Method not decompiled: gg.c2.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, org.telegram.ui.ActionBar.l5):void");
    }

    public final void i() {
        a0.i iVar = this.f9674f;
        if (iVar.m() != 0) {
            a0.i iVar2 = this.h;
            int m10 = iVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) iVar.f(iVar2.j(i10));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    iVar.l(user.f18482id);
                }
            }
        }
    }
}
