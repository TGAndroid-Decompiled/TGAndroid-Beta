package jg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.j10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.no0;
public class z1 {
    public y1 f17730a;
    public ArrayList f17738k;
    public ArrayList f17739l;
    public String f17741n;
    public final boolean f17742o;
    public ArrayList f17744q;
    public HashMap f17745r;
    public final ArrayList f17731b = new ArrayList();
    public String f17732c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f17733e = new ArrayList();
    public final a0.h f17734f = new a0.h();
    public final ArrayList f17735g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f17736i = new a0.h();
    public final ArrayList f17737j = new ArrayList();
    public final int f17740m = j10.f24773t0;
    public boolean f17743p = true;
    public boolean f17746s = false;

    public z1(boolean z10) {
        this.f17742o = z10;
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
                if (this.f17745r == null) {
                    this.f17745r = new HashMap();
                    this.f17744q = new ArrayList();
                }
                x1 x1Var = (x1) this.f17745r.get(charSequence2);
                if (x1Var == 0) {
                    x1Var = new Object();
                    x1Var.f17719a = charSequence2;
                    this.f17745r.put(charSequence2, x1Var);
                } else {
                    this.f17744q.remove((Object) x1Var);
                }
                x1Var.f17720b = (int) (System.currentTimeMillis() / 1000);
                this.f17744q.add(0, x1Var);
                z10 = true;
            }
            if (z10) {
                tr.a0(this.f17740m).f27054a.c(new hi.r1(25, this, this.f17744q));
            }
        }
    }

    public final void b() {
        this.f17733e.clear();
        this.f17734f.b();
        this.d.clear();
    }

    public final void c() {
        this.f17744q = new ArrayList();
        this.f17745r = new HashMap();
        tr.a0(this.f17740m).f27054a.c(new w1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f17731b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f17738k = arrayList;
        this.f17739l = arrayList2;
        a0.h hVar = this.f17734f;
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
                        obj = ((g0) obj).f17463a;
                    }
                    if (obj instanceof no0) {
                        obj = ((no0) obj).f37836b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f17733e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f28554id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f28554id);
                        }
                        long j3 = user.f28554id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j3);
                        if (tLObject != null) {
                            this.f17735g.remove(tLObject);
                            hVar2.l(user.f28554id);
                        }
                        long j10 = user.f28554id;
                        a0.h hVar3 = this.f17736i;
                        Object f10 = hVar3.f(j10);
                        if (f10 != null) {
                            this.f17737j.remove(f10);
                            hVar3.l(user.f28554id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f28405id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f28405id);
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
        a0.h hVar = this.f17734f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i7 = 0; i7 < m10; i7++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i7));
                if (user != null) {
                    this.f17733e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f28554id);
                }
            }
        }
    }
}
