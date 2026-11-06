package jg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.p10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bo0;
public class z1 {
    public y1 f16989a;
    public ArrayList f16997k;
    public ArrayList f16998l;
    public String f17000n;
    public final boolean f17001o;
    public ArrayList f17003q;
    public HashMap f17004r;
    public final ArrayList f16990b = new ArrayList();
    public String f16991c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList f16992e = new ArrayList();
    public final a0.h f16993f = new a0.h();
    public final ArrayList f16994g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f16995i = new a0.h();
    public final ArrayList f16996j = new ArrayList();
    public final int f16999m = p10.f24459s0;
    public boolean f17002p = true;
    public boolean f17005s = false;

    public z1(boolean z9) {
        this.f17001o = z9;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence != null) {
            Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
            boolean z9 = false;
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (charSequence.charAt(start) != '@' && charSequence.charAt(start) != '#') {
                    start++;
                }
                String charSequence2 = charSequence.subSequence(start, end).toString();
                if (this.f17004r == null) {
                    this.f17004r = new HashMap();
                    this.f17003q = new ArrayList();
                }
                x1 x1Var = (x1) this.f17004r.get(charSequence2);
                if (x1Var == 0) {
                    x1Var = new Object();
                    x1Var.f16978a = charSequence2;
                    this.f17004r.put(charSequence2, x1Var);
                } else {
                    this.f17003q.remove((Object) x1Var);
                }
                x1Var.f16979b = (int) (System.currentTimeMillis() / 1000);
                this.f17003q.add(0, x1Var);
                z9 = true;
            }
            if (z9) {
                yr.a0(this.f16999m).f26688a.c(new ha.b(15, this, this.f17003q));
            }
        }
    }

    public final void b() {
        this.f16992e.clear();
        this.f16993f.b();
        this.d.clear();
    }

    public final void c() {
        this.f17003q = new ArrayList();
        this.f17004r = new HashMap();
        yr.a0(this.f16999m).f26688a.c(new w1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f16990b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f16997k = arrayList;
        this.f16998l = arrayList2;
        a0.h hVar = this.f16993f;
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
                        obj = ((g0) obj).f16724a;
                    }
                    if (obj instanceof bo0) {
                        obj = ((bo0) obj).f32236b;
                    }
                    boolean z9 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.f16992e;
                    if (z9) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f27101id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f27101id);
                        }
                        long j3 = user.f27101id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j3);
                        if (tLObject != null) {
                            this.f16994g.remove(tLObject);
                            hVar2.l(user.f27101id);
                        }
                        long j10 = user.f27101id;
                        a0.h hVar3 = this.f16995i;
                        Object f10 = hVar3.f(j10);
                        if (f10 != null) {
                            this.f16996j.remove(f10);
                            hVar3.l(user.f27101id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f26952id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f26952id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z9, boolean z10, boolean z11, boolean z12, long j3, boolean z13, int i7, int i10) {
        h(str, z9, z10, z11, z12, false, j3, z13, i7, i10, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: jg.z1.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public final void i() {
        a0.h hVar = this.f16993f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i7 = 0; i7 < m10; i7++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i7));
                if (user != null) {
                    this.f16992e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f27101id);
                }
            }
        }
    }
}
