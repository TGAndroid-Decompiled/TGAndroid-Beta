package fg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gq0;
public class d2 {
    public c2 f7979a;
    public ArrayList f7986k;
    public ArrayList f7987l;
    public String f7989n;
    public final boolean f7990o;
    public ArrayList f7992q;
    public HashMap f7993r;
    public final ArrayList f7980b = new ArrayList();
    public String f7981c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.i f7982f = new a0.i();
    public final ArrayList f7983g = new ArrayList();
    public final a0.i h = new a0.i();
    public final a0.i f7984i = new a0.i();
    public final ArrayList f7985j = new ArrayList();
    public final int f7988m = UserConfig.selectedAccount;
    public boolean f7991p = true;
    public boolean f7994s = false;

    public d2(boolean z10) {
        this.f7990o = z10;
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
                if (this.f7993r == null) {
                    this.f7993r = new HashMap();
                    this.f7992q = new ArrayList();
                }
                b2 b2Var = (b2) this.f7993r.get(charSequence2);
                if (b2Var == 0) {
                    b2Var = new Object();
                    b2Var.f7959a = charSequence2;
                    this.f7993r.put(charSequence2, b2Var);
                } else {
                    this.f7992q.remove((Object) b2Var);
                }
                b2Var.f7960b = (int) (System.currentTimeMillis() / 1000);
                this.f7992q.add(0, b2Var);
                z10 = true;
            }
            if (z10) {
                MessagesStorage.getInstance(this.f7988m).getStorageQueue().postRunnable(new s1(1, this, this.f7992q));
            }
        }
    }

    public final void b() {
        this.e.clear();
        this.f7982f.b();
        this.d.clear();
    }

    public final void c() {
        this.f7992q = new ArrayList();
        this.f7993r = new HashMap();
        MessagesStorage.getInstance(this.f7988m).getStorageQueue().postRunnable(new a2(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f7980b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f7986k = arrayList;
        this.f7987l = arrayList2;
        a0.i iVar = this.f7982f;
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
                        obj = ((g0) obj).f8020a;
                    }
                    if (obj instanceof gq0) {
                        obj = ((gq0) obj).f23401b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) iVar.f(user.f17342id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            iVar.l(user2.f17342id);
                        }
                        long j3 = user.f17342id;
                        a0.i iVar2 = this.h;
                        TLObject tLObject = (TLObject) iVar2.f(j3);
                        if (tLObject != null) {
                            this.f7983g.remove(tLObject);
                            iVar2.l(user.f17342id);
                        }
                        long j10 = user.f17342id;
                        a0.i iVar3 = this.f7984i;
                        Object f7 = iVar3.f(j10);
                        if (f7 != null) {
                            this.f7985j.remove(f7);
                            iVar3.l(user.f17342id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) iVar.f(-((TLRPC.Chat) obj).f17195id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        iVar.l(-chat.f17195id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j3, z14, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final org.telegram.ui.da r35) {
        throw new UnsupportedOperationException("Method not decompiled: fg.d2.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, org.telegram.ui.da):void");
    }

    public final void i() {
        a0.i iVar = this.f7982f;
        if (iVar.m() != 0) {
            a0.i iVar2 = this.h;
            int m10 = iVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) iVar.f(iVar2.j(i10));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    iVar.l(user.f17342id);
                }
            }
        }
    }
}
