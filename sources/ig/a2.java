package ig;

import hi.u2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.br0;
public class a2 {
    public z1 f13987a;
    public ArrayList f13994k;
    public ArrayList f13995l;
    public String f13997n;
    public final boolean f13998o;
    public ArrayList f14000q;
    public HashMap f14001r;
    public final ArrayList f13988b = new ArrayList();
    public String f13989c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.h f13990f = new a0.h();
    public final ArrayList f13991g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h f13992i = new a0.h();
    public final ArrayList f13993j = new ArrayList();
    public final int f13996m = UserConfig.selectedAccount;
    public boolean f13999p = true;
    public boolean f14002s = false;

    public a2(boolean z10) {
        this.f13998o = z10;
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
                if (this.f14001r == null) {
                    this.f14001r = new HashMap();
                    this.f14000q = new ArrayList();
                }
                y1 y1Var = (y1) this.f14001r.get(charSequence2);
                if (y1Var == 0) {
                    y1Var = new Object();
                    y1Var.f14304a = charSequence2;
                    this.f14001r.put(charSequence2, y1Var);
                } else {
                    this.f14000q.remove((Object) y1Var);
                }
                y1Var.f14305b = (int) (System.currentTimeMillis() / 1000);
                this.f14000q.add(0, y1Var);
                z10 = true;
            }
            if (z10) {
                MessagesStorage.getInstance(this.f13996m).getStorageQueue().postRunnable(new u2(12, this, this.f14000q));
            }
        }
    }

    public final void b() {
        this.e.clear();
        this.f13990f.b();
        this.d.clear();
    }

    public final void c() {
        this.f14000q = new ArrayList();
        this.f14001r = new HashMap();
        MessagesStorage.getInstance(this.f13996m).getStorageQueue().postRunnable(new x1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        if (this.f13988b.size() > 0) {
            return true;
        }
        return false;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        Object obj;
        TLRPC.Chat chat;
        this.f13994k = arrayList;
        this.f13995l = arrayList2;
        a0.h hVar = this.f13990f;
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
                int i10 = size2 + size;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 < size) {
                        obj = arrayList.get(i11);
                    } else {
                        obj = arrayList2.get(i11 - size);
                    }
                    if (obj instanceof h0) {
                        obj = ((h0) obj).f14063a;
                    }
                    if (obj instanceof br0) {
                        obj = ((br0) obj).f26899b;
                    }
                    boolean z10 = obj instanceof TLRPC.User;
                    ArrayList arrayList3 = this.d;
                    ArrayList arrayList4 = this.e;
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) obj;
                        TLRPC.User user2 = (TLRPC.User) hVar.f(user.f22177id);
                        if (user2 != null) {
                            arrayList4.remove(user2);
                            arrayList3.remove(user2);
                            hVar.l(user2.f22177id);
                        }
                        long j10 = user.f22177id;
                        a0.h hVar2 = this.h;
                        TLObject tLObject = (TLObject) hVar2.f(j10);
                        if (tLObject != null) {
                            this.f13991g.remove(tLObject);
                            hVar2.l(user.f22177id);
                        }
                        long j11 = user.f22177id;
                        a0.h hVar3 = this.f13992i;
                        Object f7 = hVar3.f(j11);
                        if (f7 != null) {
                            this.f13993j.remove(f7);
                            hVar3.l(user.f22177id);
                        }
                    } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).f22028id)) != null) {
                        arrayList4.remove(chat);
                        arrayList3.remove(chat);
                        hVar.l(-chat.f22028id);
                    }
                }
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j10, z14, i10, i11, 0L, null);
    }

    public final void h(final java.lang.String r22, boolean r23, final boolean r24, final boolean r25, boolean r26, final boolean r27, long r28, boolean r30, int r31, final int r32, final long r33, final java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: ig.a2.h(java.lang.String, boolean, boolean, boolean, boolean, boolean, long, boolean, int, int, long, java.lang.Runnable):void");
    }

    public final void i() {
        a0.h hVar = this.f13990f;
        if (hVar.m() != 0) {
            a0.h hVar2 = this.h;
            int m10 = hVar2.m();
            for (int i10 = 0; i10 < m10; i10++) {
                TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i10));
                if (user != null) {
                    this.e.remove(user);
                    this.d.remove(user);
                    hVar.l(user.f22177id);
                }
            }
        }
    }
}
