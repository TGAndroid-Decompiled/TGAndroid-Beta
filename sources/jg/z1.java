package jg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.j10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.po0;
public class z1 {
    public y1 f17752a;
    public ArrayList f17760k;
    public ArrayList f17761l;
    public String f17763n;
    public final boolean f17764o;
    public ArrayList f17766q;
    public HashMap f17767r;
    public final ArrayList f17753b = new ArrayList();
    public String f17754c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f17755e = new ArrayList();
    public final a0.h f17756f = new a0.h();
    public final ArrayList f17757g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f17758i = new a0.h();
    public final ArrayList f17759j = new ArrayList();
    public final int f17762m = j10.f24798t0;
    public boolean f17765p = true;
    public boolean f17768s = false;

    public z1(boolean z10) {
        this.f17764o = z10;
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
                if (this.f17767r == null) {
                    this.f17767r = new HashMap();
                    this.f17766q = new ArrayList();
                }
                x1 x1Var = (x1) this.f17767r.get(charSequence2);
                if (x1Var == 0) {
                    x1Var = new Object();
                    x1Var.f17741a = charSequence2;
                    this.f17767r.put(charSequence2, x1Var);
                } else {
                    this.f17766q.remove((Object) x1Var);
                }
                x1Var.f17742b = (int) (System.currentTimeMillis() / 1000);
                this.f17766q.add(0, x1Var);
                z10 = true;
            }
            if (z10) {
                tr.a0(this.f17762m).f27080a.c(new hi.c(27, this, this.f17766q));
            }
        }
    }

    public final void b() {
        this.f17755e.clear();
        this.f17756f.b();
        this.d.clear();
    }

    public final void c() {
        this.f17766q = new ArrayList();
        this.f17767r = new HashMap();
        tr.a0(this.f17762m).f27080a.c(new w1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f17753b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f17760k = arrayList;
        this.f17761l = arrayList2;
        a0.h hVar = this.f17756f;
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
                int i7 = size2 + size;
                for (int i10 = 0; i10 < i7; i10++) {
                    if (i10 < size) {
                        obj = arrayList.get(i10);
                    } else {
                        obj = arrayList2.get(i10 - size);
                    }
                    if (obj instanceof g0) {
                        obj = ((g0) obj).f17485a;
                    }
                    if (obj instanceof po0) {
                        obj = ((po0) obj).f38648b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f17755e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f28580id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f28580id);
                        }
                        long j3 = user.f28580id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j3);
                        if (tLObject != null) {
                            this.f17757g.remove(tLObject);
                            hVar2.l(user.f28580id);
                        }
                        long j10 = user.f28580id;
                        a0.h hVar3 = this.f17758i;
                        Object f10 = hVar3.f(j10);
                        if (f10 != null) {
                            this.f17759j.remove(f10);
                            hVar3.l(user.f28580id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f28431id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f28431id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, boolean z14, int i7, int i10) {
        h(str, z10, z11, z12, z13, false, j3, z14, i7, i10, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: jg.z1.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public final void i() {
        a0.h hVar = this.f17756f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i7 = 0; i7 < m10; i7++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i7));
                if (user != null) {
                    this.f17755e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f28580id);
                }
            }
        }
    }
}
