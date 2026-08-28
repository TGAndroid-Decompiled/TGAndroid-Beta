package of;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh.o8;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fp0;
public class v1 {
    public u1 f19524a;
    public ArrayList f19532k;
    public ArrayList f19533l;
    public String f19535n;
    public final boolean f19536o;
    public ArrayList f19538q;
    public HashMap f19539r;
    public final ArrayList f19525b = new ArrayList();
    public String f19526c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f19527e = new ArrayList();
    public final a0.h f19528f = new a0.h();
    public final ArrayList f19529g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f19530i = new a0.h();
    public final ArrayList f19531j = new ArrayList();
    public final int f19534m = UserConfig.selectedAccount;
    public boolean f19537p = true;
    public boolean f19540s = false;

    public v1(boolean z10) {
        this.f19536o = z10;
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
                if (this.f19539r == null) {
                    this.f19539r = new HashMap();
                    this.f19538q = new ArrayList();
                }
                t1 t1Var = (t1) this.f19539r.get(charSequence2);
                if (t1Var == 0) {
                    t1Var = new Object();
                    t1Var.f19510a = charSequence2;
                    this.f19539r.put(charSequence2, t1Var);
                } else {
                    this.f19538q.remove((Object) t1Var);
                }
                t1Var.f19511b = (int) (System.currentTimeMillis() / 1000);
                this.f19538q.add(0, t1Var);
                z10 = true;
            }
            if (z10) {
                MessagesStorage.getInstance(this.f19534m).getStorageQueue().postRunnable(new o8(18, this, this.f19538q));
            }
        }
    }

    public final void b() {
        this.f19527e.clear();
        this.f19528f.b();
        this.d.clear();
    }

    public final void c() {
        this.f19538q = new ArrayList();
        this.f19539r = new HashMap();
        MessagesStorage.getInstance(this.f19534m).getStorageQueue().postRunnable(new s1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f19525b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f19532k = arrayList;
        this.f19533l = arrayList2;
        a0.h hVar = this.f19528f;
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
                int i9 = size2 + size;
                for (int i10 = 0; i10 < i9; i10++) {
                    if (i10 < size) {
                        obj = arrayList.get(i10);
                    } else {
                        obj = arrayList2.get(i10 - size);
                    }
                    if (obj instanceof e0) {
                        obj = ((e0) obj).f19279a;
                    }
                    if (obj instanceof fp0) {
                        obj = ((fp0) obj).f28540b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f19527e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f22527id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f22527id);
                        }
                        long j10 = user.f22527id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f19529g.remove(tLObject);
                            hVar2.l(user.f22527id);
                        }
                        long j11 = user.f22527id;
                        a0.h hVar3 = this.f19530i;
                        Object f10 = hVar3.f(j11);
                        if (f10 != null) {
                            this.f19531j.remove(f10);
                            hVar3.l(user.f22527id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f22380id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f22380id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i9, int i10) {
        h(str, z10, z11, z12, z13, false, j10, z14, i9, i10, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final org.telegram.ui.k6 r35) {
        throw new UnsupportedOperationException("Method not decompiled: of.v1.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, org.telegram.ui.k6):void");
    }

    public final void i() {
        a0.h hVar = this.f19528f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i9 = 0; i9 < m10; i9++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i9));
                if (user != null) {
                    this.f19527e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f22527id);
                }
            }
        }
    }
}
