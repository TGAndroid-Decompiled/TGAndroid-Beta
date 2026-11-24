package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class bu9 {
    public au9 a;
    public ArrayList k;
    public ArrayList l;
    public String n;
    public final boolean o;
    public ArrayList q;
    public HashMap r;
    public final ArrayList b = new ArrayList();
    public String c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final vh6 f = new vh6();
    public final ArrayList g = new ArrayList();
    public final vh6 h = new vh6();
    public final vh6 i = new vh6();
    public final ArrayList j = new ArrayList();
    public final int m = z8c.t0;
    public boolean p = true;
    public boolean s = false;

    public bu9(boolean z) {
        this.o = z;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence != null) {
            Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
            boolean z = false;
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (charSequence.charAt(start) != '@' && charSequence.charAt(start) != '#') {
                    start++;
                }
                String charSequence2 = charSequence.subSequence(start, end).toString();
                if (this.r == null) {
                    this.r = new HashMap();
                    this.q = new ArrayList();
                }
                zt9 zt9Var = (zt9) this.r.get(charSequence2);
                if (zt9Var == 0) {
                    zt9Var = new Object();
                    zt9Var.a = charSequence2;
                    this.r.put(charSequence2, zt9Var);
                } else {
                    this.q.remove((Object) zt9Var);
                }
                zt9Var.b = (int) (System.currentTimeMillis() / 1000);
                this.q.add(0, zt9Var);
                z = true;
            }
            if (z) {
                cf7.Y(this.m).a.c(new il9(this, this.q, (byte) 14));
            }
        }
    }

    public final void b() {
        this.e.clear();
        this.f.b();
        this.d.clear();
    }

    public final void c() {
        this.q = new ArrayList();
        this.r = new HashMap();
        cf7.Y(this.m).a.c(new yt9(this, (byte) 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.k = arrayList;
        this.l = arrayList2;
        vh6 vh6Var = this.f;
        if (vh6Var.m() != 0) {
            if (arrayList == null) {
                if (arrayList2 != null) {
                    size = 0;
                } else {
                    return;
                }
            } else {
                size = arrayList.size();
            }
            if (arrayList2 == null) {
                size2 = 0;
            } else {
                size2 = arrayList2.size();
            }
            int i = size2 + size;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < size) {
                    obj = arrayList.get(i2);
                } else {
                    obj = arrayList2.get(i2 - size);
                }
                if (obj instanceof lm3) {
                    obj = ((lm3) obj).a;
                }
                if (obj instanceof ica) {
                    obj = ((ica) obj).b;
                }
                boolean z = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.d;
                ArrayList arrayList4 = this.e;
                if (z) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) vh6Var.f(user.id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        vh6Var.l(user2.id);
                    }
                    long j = user.id;
                    vh6 vh6Var2 = this.h;
                    TLObject tLObject = (TLObject) vh6Var2.f(j);
                    if (tLObject != null) {
                        this.g.remove(tLObject);
                        vh6Var2.l(user.id);
                    }
                    long j2 = user.id;
                    vh6 vh6Var3 = this.i;
                    Object f = vh6Var3.f(j2);
                    if (f != null) {
                        this.j.remove(f);
                        vh6Var3.l(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) vh6Var.f(-((TLRPC.Chat) obj).id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    vh6Var.l(-chat.id);
                }
            }
        }
    }

    public final void g(String str, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, int i, int i2) {
        h(str, z, z2, z3, z4, false, j, z5, i, i2, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu9.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public final void i() {
        vh6 vh6Var = this.f;
        if (vh6Var.m() != 0) {
            vh6 vh6Var2 = this.h;
            int m = vh6Var2.m();
            for (int i = 0; i < m; i++) {
                TLRPC.User user = (TLRPC.User) vh6Var.f(vh6Var2.j(i));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    vh6Var.l(user.id);
                }
            }
        }
    }
}
