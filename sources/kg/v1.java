package kg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.h10;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.do0;
public class v1 {
    public u1 f17206a;
    public ArrayList f17214k;
    public ArrayList f17215l;
    public String f17217n;
    public final boolean f17218o;
    public ArrayList f17220q;
    public HashMap f17221r;
    public final ArrayList f17207b = new ArrayList();
    public String f17208c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f17209e = new ArrayList();
    public final a0.h f17210f = new a0.h();
    public final ArrayList f17211g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f17212i = new a0.h();
    public final ArrayList f17213j = new ArrayList();
    public final int f17216m = h10.f22829t0;
    public boolean f17219p = true;
    public boolean f17222s = false;

    public v1(boolean z10) {
        this.f17218o = z10;
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
                if (this.f17221r == null) {
                    this.f17221r = new HashMap();
                    this.f17220q = new ArrayList();
                }
                t1 t1Var = (t1) this.f17221r.get(charSequence2);
                if (t1Var == 0) {
                    t1Var = new Object();
                    t1Var.f17197a = charSequence2;
                    this.f17221r.put(charSequence2, t1Var);
                } else {
                    this.f17220q.remove((Object) t1Var);
                }
                t1Var.f17198b = (int) (System.currentTimeMillis() / 1000);
                this.f17220q.add(0, t1Var);
                z10 = true;
            }
            if (z10) {
                qr.a0(this.f17216m).f24934a.c(new ii.e(16, this, this.f17220q));
            }
        }
    }

    public final void b() {
        this.f17209e.clear();
        this.f17210f.b();
        this.d.clear();
    }

    public final void c() {
        this.f17220q = new ArrayList();
        this.f17221r = new HashMap();
        qr.a0(this.f17216m).f24934a.c(new s1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f17207b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f17214k = arrayList;
        this.f17215l = arrayList2;
        a0.h hVar = this.f17210f;
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
                int i3 = size2 + size;
                for (int i10 = 0; i10 < i3; i10++) {
                    if (i10 < size) {
                        obj = arrayList.get(i10);
                    } else {
                        obj = arrayList2.get(i10 - size);
                    }
                    if (obj instanceof d0) {
                        obj = ((d0) obj).f16946a;
                    }
                    if (obj instanceof do0) {
                        obj = ((do0) obj).f33173b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f17209e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f27150id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f27150id);
                        }
                        long j10 = user.f27150id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f17211g.remove(tLObject);
                            hVar2.l(user.f27150id);
                        }
                        long j11 = user.f27150id;
                        a0.h hVar3 = this.f17212i;
                        Object f10 = hVar3.f(j11);
                        if (f10 != null) {
                            this.f17213j.remove(f10);
                            hVar3.l(user.f27150id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f27001id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f27001id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i3, int i10) {
        h(str, z10, z11, z12, z13, false, j10, z14, i3, i10, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: kg.v1.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public final void i() {
        a0.h hVar = this.f17210f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i3 = 0; i3 < m10; i3++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i3));
                if (user != null) {
                    this.f17209e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f27150id);
                }
            }
        }
    }
}
