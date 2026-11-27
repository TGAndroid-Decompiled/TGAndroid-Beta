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
public final class n2a extends la {
    public final vnb d;
    public final Context e;
    public d79 f;
    public ArrayList n;
    public boolean s;
    public p55 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public n2a(vnb vnbVar, Context context, boolean z) {
        this.e = context;
        this.x = z;
        this.d = vnbVar;
        sh9 sh9Var = new sh9(this, (byte) 4);
        jf7 Y = jf7.Y(yac.t0);
        Y.a.c(new a30(Y, sh9Var, (byte) 8));
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 3 && i != 6 && i != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull N0 = uc7.s1(yac.t0).N0(chat.id);
        if (N0 != null && (i = N0.participants_count) > 0) {
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
            return ((m2a) arrayList.get(i)).a;
        }
        return -1;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        ArrayList arrayList = this.n;
        if (arrayList != null && i >= 0) {
            m2a m2aVar = (m2a) arrayList.get(i);
            int i4 = f89Var.f;
            View view = f89Var.a;
            int i5 = 8;
            boolean z3 = true;
            if (i4 == 3) {
                e3a e3aVar = (e3a) view;
                m2aVar.getClass();
                TLRPC.User user = m2aVar.c;
                if (user != null) {
                    e3aVar.setUser(user);
                    String str = m2aVar.g;
                    if (str != null) {
                        e3aVar.setSubtitle(str);
                        yob.W(e3aVar.e, aob.r5, this.d);
                    }
                } else {
                    TLRPC.InputPeer inputPeer = m2aVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            e3aVar.setUser(yac.h(yac.t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            e3aVar.setUser(uc7.s1(yac.t0).X1(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(inputPeer.chat_id));
                            e3aVar.h(F(M0), M0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat M02 = uc7.s1(yac.t0).M0(Long.valueOf(inputPeer.channel_id));
                            e3aVar.h(F(M02), M02);
                        }
                    }
                }
                e3aVar.c(m2aVar.j, false);
                e3aVar.i(false, 1.0f);
                int i6 = i + 1;
                if (i6 < this.n.size() && ((m2a) this.n.get(i6)).a != i4) {
                    z = false;
                } else {
                    z = true;
                }
                e3aVar.setDivider(z);
                if (i6 < this.n.size() && ((m2a) this.n.get(i6)).a == 7) {
                    e3aVar.setDivider(false);
                }
                e3aVar.setOptions(m2aVar.m);
                obc obcVar = m2aVar.n;
                obc obcVar2 = m2aVar.o;
                ImageView imageView = e3aVar.G;
                ImageView imageView2 = e3aVar.E;
                if (obcVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                e3aVar.y = z2;
                if (z2 && e3aVar.H) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                imageView2.setVisibility(i3);
                imageView2.setOnClickListener(obcVar);
                if (obcVar2 == null) {
                    z3 = false;
                }
                e3aVar.F = z3;
                if (z3 && e3aVar.H) {
                    i5 = 0;
                }
                imageView.setVisibility(i5);
                imageView.setOnClickListener(obcVar2);
                e3aVar.g(this.E, false);
            } else if (i4 == 6) {
                v2a v2aVar = (v2a) view;
                if (i >= this.n.size() - 1 || (i2 = i + 1) >= this.n.size() - 1 || ((m2a) this.n.get(i2)).a == 7) {
                    z3 = false;
                }
                v2aVar.w = m2aVar.e;
                v2aVar.f();
                v2aVar.setDivider(z3);
                v2aVar.c(m2aVar.j, false);
            } else if (i4 == -1) {
                int i7 = m2aVar.k;
                if (i7 < 0) {
                    i7 = (int) (hl.q.y * 0.3f);
                }
                view.setLayoutParams(new r79(-1, i7));
            } else if (i4 == 7) {
                ((x2a) view).setLetter(m2aVar.f);
            } else if (i4 == 5) {
                try {
                    ((z2b) view).b.getImageReceiver().w0(false);
                } catch (Exception unused) {
                }
            } else if (i4 == 8) {
                p55 p55Var = (p55) view;
                if (TextUtils.equals(p55Var.getText(), m2aVar.f)) {
                    String str2 = m2aVar.g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    p55Var.a(str2, m2aVar.l);
                } else {
                    p55Var.setText(pv3.p(m2aVar.f, p55Var.getTextView(), null));
                    if (!TextUtils.isEmpty(m2aVar.g)) {
                        String str3 = m2aVar.g;
                        jjb jjbVar = m2aVar.l;
                        si siVar = p55Var.b;
                        siVar.c(str3, false, true);
                        siVar.setOnClickListener(jjbVar);
                        siVar.setVisibility(0);
                    }
                }
                this.w = p55Var;
            } else if (i4 == 9) {
                skb skbVar = (skb) view;
                skbVar.g(aob.v6, aob.u6);
                skbVar.o(m2aVar.i, m2aVar.f, false);
            } else if (i4 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != m2aVar.p) {
                    hl.B2(m2aVar.p);
                    frameLayout.addView(m2aVar.p, tre.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View p55Var;
        e3a e3aVar;
        Context context = this.e;
        if (i == -1) {
            View view = new View(context);
            view.setTag(-33024);
            e3aVar = view;
        } else if (i == 3) {
            e3aVar = new e3a(this.e, this.x, this.y, this.d, this.s);
        } else {
            vnb vnbVar = this.d;
            if (i == 5) {
                z2b z2bVar = new z2b(context, null, 1, vnbVar);
                z2bVar.d.setText(ob6.M0(2131747898, null));
                z2bVar.e.setText(ob6.M0(2131745535, null));
                z2bVar.a.setTranslationY(hl.L(24.0f));
                e3aVar = z2bVar;
            } else {
                boolean z = this.h;
                if (i == 7) {
                    p55Var = new x2a(context, vnbVar);
                    p55Var.setTag(-33024);
                    if (z) {
                        p55Var.setBackground(null);
                    }
                } else if (i == 6) {
                    p55Var = new v2a(context, vnbVar);
                    p55Var.setTag(-33024);
                    if (z) {
                        p55Var.setBackground(null);
                    }
                } else if (i == 8) {
                    p55Var = new p55(context, vnbVar);
                    p55Var.setTag(-33024);
                    if (z) {
                        p55Var.setBackground(null);
                    }
                } else if (i == 9) {
                    skb skbVar = new skb(context, vnbVar);
                    skbVar.n = (byte) 16;
                    skbVar.x = 19;
                    e3aVar = skbVar;
                } else if (i == 10) {
                    e3aVar = new FrameLayout(context);
                } else {
                    e3aVar = new View(context);
                }
                e3aVar = p55Var;
            }
        }
        return new f89(e3aVar);
    }

    @Override
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof e3a) {
            ((e3a) view).g(this.E, false);
        }
    }
}
