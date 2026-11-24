package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class v0a extends ka {
    public final ylb d;
    public final Context e;
    public r59 f;
    public ArrayList n;
    public boolean s;
    public l55 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public v0a(ylb ylbVar, Context context, boolean z) {
        this.e = context;
        this.x = z;
        this.d = ylbVar;
        eg9 eg9Var = new eg9(this, (byte) 4);
        cf7 Y = cf7.Y(z8c.t0);
        Y.a.c(new x30(Y, eg9Var, (byte) 12));
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 3 && i != 6 && i != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull M0 = oc7.r1(z8c.t0).M0(chat.id);
        if (M0 != null && (i = M0.participants_count) > 0) {
            return i;
        }
        HashMap hashMap = this.r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList = this.n;
        if (arrayList != null && i >= 0) {
            return ((u0a) arrayList.get(i)).a;
        }
        return -1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        ArrayList arrayList = this.n;
        if (arrayList != null && i >= 0) {
            u0a u0aVar = (u0a) arrayList.get(i);
            int i4 = u69Var.f;
            View view = u69Var.a;
            int i5 = 8;
            boolean z3 = true;
            if (i4 == 3) {
                m1a m1aVar = (m1a) view;
                u0aVar.getClass();
                TLRPC.User user = u0aVar.c;
                if (user != null) {
                    m1aVar.setUser(user);
                    String str = u0aVar.g;
                    if (str != null) {
                        m1aVar.setSubtitle(str);
                        anb.W(m1aVar.e, cmb.q5, this.d);
                    }
                } else {
                    TLRPC.InputPeer inputPeer = u0aVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            m1aVar.setUser(z8c.h(z8c.t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            m1aVar.setUser(oc7.r1(z8c.t0).W1(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer.chat_id));
                            m1aVar.h(F(L0), L0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat L02 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer.channel_id));
                            m1aVar.h(F(L02), L02);
                        }
                    }
                }
                m1aVar.c(u0aVar.j, false);
                m1aVar.i(false, 1.0f);
                int i6 = i + 1;
                if (i6 < this.n.size() && ((u0a) this.n.get(i6)).a != i4) {
                    z = false;
                } else {
                    z = true;
                }
                m1aVar.setDivider(z);
                if (i6 < this.n.size() && ((u0a) this.n.get(i6)).a == 7) {
                    m1aVar.setDivider(false);
                }
                m1aVar.setOptions(u0aVar.m);
                p9c p9cVar = u0aVar.n;
                p9c p9cVar2 = u0aVar.o;
                ImageView imageView = m1aVar.G;
                ImageView imageView2 = m1aVar.E;
                if (p9cVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m1aVar.y = z2;
                if (z2 && m1aVar.H) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                imageView2.setVisibility(i3);
                imageView2.setOnClickListener(p9cVar);
                if (p9cVar2 == null) {
                    z3 = false;
                }
                m1aVar.F = z3;
                if (z3 && m1aVar.H) {
                    i5 = 0;
                }
                imageView.setVisibility(i5);
                imageView.setOnClickListener(p9cVar2);
                m1aVar.g(this.E, false);
            } else if (i4 == 6) {
                d1a d1aVar = (d1a) view;
                if (i >= this.n.size() - 1 || (i2 = i + 1) >= this.n.size() - 1 || ((u0a) this.n.get(i2)).a == 7) {
                    z3 = false;
                }
                d1aVar.w = u0aVar.e;
                d1aVar.f();
                d1aVar.setDivider(z3);
                d1aVar.c(u0aVar.j, false);
            } else if (i4 == -1) {
                int i7 = u0aVar.k;
                if (i7 < 0) {
                    i7 = (int) (gm.q.y * 0.3f);
                }
                view.setLayoutParams(new g69(-1, i7));
            } else if (i4 == 7) {
                ((f1a) view).setLetter(u0aVar.f);
            } else if (i4 == 5) {
                try {
                    ((a1b) view).b.getImageReceiver().w0(false);
                } catch (Exception unused) {
                }
            } else if (i4 == 8) {
                l55 l55Var = (l55) view;
                if (TextUtils.equals(l55Var.getText(), u0aVar.f)) {
                    String str2 = u0aVar.g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    l55Var.a(str2, u0aVar.l);
                } else {
                    l55Var.setText(gw3.p(u0aVar.f, l55Var.getTextView(), null));
                    if (!TextUtils.isEmpty(u0aVar.g)) {
                        String str3 = u0aVar.g;
                        fyb fybVar = u0aVar.l;
                        rj rjVar = l55Var.b;
                        rjVar.c(str3, false, true);
                        rjVar.setOnClickListener(fybVar);
                        rjVar.setVisibility(0);
                    }
                }
                this.w = l55Var;
            } else if (i4 == 9) {
                xib xibVar = (xib) view;
                xibVar.g(cmb.u6, cmb.t6);
                xibVar.o(u0aVar.i, u0aVar.f, false);
            } else if (i4 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != u0aVar.p) {
                    gm.B2(u0aVar.p);
                    frameLayout.addView(u0aVar.p, qoe.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View l55Var;
        m1a m1aVar;
        Context context = this.e;
        if (i == -1) {
            View view = new View(context);
            view.setTag(-33024);
            m1aVar = view;
        } else if (i == 3) {
            m1aVar = new m1a(this.e, this.x, this.y, this.d, this.s);
        } else {
            ylb ylbVar = this.d;
            if (i == 5) {
                a1b a1bVar = new a1b(context, null, 1, ylbVar);
                a1bVar.d.setText(jb6.M0(2131747901, null));
                a1bVar.e.setText(jb6.M0(2131745541, null));
                a1bVar.a.setTranslationY(gm.L(24.0f));
                m1aVar = a1bVar;
            } else {
                boolean z = this.h;
                if (i == 7) {
                    l55Var = new f1a(context, ylbVar);
                    l55Var.setTag(-33024);
                    if (z) {
                        l55Var.setBackground(null);
                    }
                } else if (i == 6) {
                    l55Var = new d1a(context, ylbVar);
                    l55Var.setTag(-33024);
                    if (z) {
                        l55Var.setBackground(null);
                    }
                } else if (i == 8) {
                    l55Var = new l55(context, ylbVar);
                    l55Var.setTag(-33024);
                    if (z) {
                        l55Var.setBackground(null);
                    }
                } else if (i == 9) {
                    xib xibVar = new xib(context, ylbVar);
                    xibVar.n = (byte) 16;
                    xibVar.x = 19;
                    m1aVar = xibVar;
                } else if (i == 10) {
                    m1aVar = new FrameLayout(context);
                } else {
                    m1aVar = new View(context);
                }
                m1aVar = l55Var;
            }
        }
        return new u69(m1aVar);
    }

    @Override
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof m1a) {
            ((m1a) view).g(this.E, false);
        }
    }
}
