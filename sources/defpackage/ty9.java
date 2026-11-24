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
public final class ty9 extends ka {
    public final wjb d;
    public final Context e;
    public o39 f;
    public ArrayList n;
    public boolean s;
    public l35 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public ty9(wjb wjbVar, Context context, boolean z) {
        this.e = context;
        this.x = z;
        this.d = wjbVar;
        ae9 ae9Var = new ae9(this, (byte) 4);
        ad7 Y = ad7.Y(y6c.t0);
        Y.a.c(new z20(Y, ae9Var, (byte) 11));
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 3 && i != 6 && i != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull L0 = na7.q1(y6c.t0).L0(chat.id);
        if (L0 != null && (i = L0.participants_count) > 0) {
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
            return ((sy9) arrayList.get(i)).a;
        }
        return -1;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        ArrayList arrayList = this.n;
        if (arrayList != null && i >= 0) {
            sy9 sy9Var = (sy9) arrayList.get(i);
            int i4 = s49Var.f;
            View view = s49Var.a;
            int i5 = 8;
            boolean z3 = true;
            if (i4 == 3) {
                kz9 kz9Var = (kz9) view;
                sy9Var.getClass();
                TLRPC.User user = sy9Var.c;
                if (user != null) {
                    kz9Var.setUser(user);
                    String str = sy9Var.g;
                    if (str != null) {
                        kz9Var.setSubtitle(str);
                        zkb.W(kz9Var.e, bkb.q5, this.d);
                    }
                } else {
                    TLRPC.InputPeer inputPeer = sy9Var.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            kz9Var.setUser(y6c.h(y6c.t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            kz9Var.setUser(na7.q1(y6c.t0).V1(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(inputPeer.chat_id));
                            kz9Var.h(F(K0), K0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat K02 = na7.q1(y6c.t0).K0(Long.valueOf(inputPeer.channel_id));
                            kz9Var.h(F(K02), K02);
                        }
                    }
                }
                kz9Var.c(sy9Var.j, false);
                kz9Var.i(false, 1.0f);
                int i6 = i + 1;
                if (i6 < this.n.size() && ((sy9) this.n.get(i6)).a != i4) {
                    z = false;
                } else {
                    z = true;
                }
                kz9Var.setDivider(z);
                if (i6 < this.n.size() && ((sy9) this.n.get(i6)).a == 7) {
                    kz9Var.setDivider(false);
                }
                kz9Var.setOptions(sy9Var.m);
                o7c o7cVar = sy9Var.n;
                o7c o7cVar2 = sy9Var.o;
                ImageView imageView = kz9Var.G;
                ImageView imageView2 = kz9Var.E;
                if (o7cVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                kz9Var.y = z2;
                if (z2 && kz9Var.H) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                imageView2.setVisibility(i3);
                imageView2.setOnClickListener(o7cVar);
                if (o7cVar2 == null) {
                    z3 = false;
                }
                kz9Var.F = z3;
                if (z3 && kz9Var.H) {
                    i5 = 0;
                }
                imageView.setVisibility(i5);
                imageView.setOnClickListener(o7cVar2);
                kz9Var.g(this.E, false);
            } else if (i4 == 6) {
                bz9 bz9Var = (bz9) view;
                if (i >= this.n.size() - 1 || (i2 = i + 1) >= this.n.size() - 1 || ((sy9) this.n.get(i2)).a == 7) {
                    z3 = false;
                }
                bz9Var.w = sy9Var.e;
                bz9Var.f();
                bz9Var.setDivider(z3);
                bz9Var.c(sy9Var.j, false);
            } else if (i4 == -1) {
                int i7 = sy9Var.k;
                if (i7 < 0) {
                    i7 = (int) (gl.q.y * 0.3f);
                }
                view.setLayoutParams(new e49(-1, i7));
            } else if (i4 == 7) {
                ((dz9) view).setLetter(sy9Var.f);
            } else if (i4 == 5) {
                try {
                    ((zya) view).b.getImageReceiver().w0(false);
                } catch (Exception unused) {
                }
            } else if (i4 == 8) {
                l35 l35Var = (l35) view;
                if (TextUtils.equals(l35Var.getText(), sy9Var.f)) {
                    String str2 = sy9Var.g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    l35Var.a(str2, sy9Var.l);
                } else {
                    l35Var.setText(vu3.p(sy9Var.f, l35Var.getTextView(), null));
                    if (!TextUtils.isEmpty(sy9Var.g)) {
                        String str3 = sy9Var.g;
                        vzb vzbVar = sy9Var.l;
                        ri riVar = l35Var.b;
                        riVar.c(str3, false, true);
                        riVar.setOnClickListener(vzbVar);
                        riVar.setVisibility(0);
                    }
                }
                this.w = l35Var;
            } else if (i4 == 9) {
                wgb wgbVar = (wgb) view;
                wgbVar.g(bkb.u6, bkb.t6);
                wgbVar.o(sy9Var.i, sy9Var.f, false);
            } else if (i4 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != sy9Var.p) {
                    gl.B2(sy9Var.p);
                    frameLayout.addView(sy9Var.p, nme.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View l35Var;
        kz9 kz9Var;
        Context context = this.e;
        if (i == -1) {
            View view = new View(context);
            view.setTag(-33024);
            kz9Var = view;
        } else if (i == 3) {
            kz9Var = new kz9(this.e, this.x, this.y, this.d, this.s);
        } else {
            wjb wjbVar = this.d;
            if (i == 5) {
                zya zyaVar = new zya(context, null, 1, wjbVar);
                zyaVar.d.setText(k96.M0(2131747975, null));
                zyaVar.e.setText(k96.M0(2131745615, null));
                zyaVar.a.setTranslationY(gl.L(24.0f));
                kz9Var = zyaVar;
            } else {
                boolean z = this.h;
                if (i == 7) {
                    l35Var = new dz9(context, wjbVar);
                    l35Var.setTag(-33024);
                    if (z) {
                        l35Var.setBackground(null);
                    }
                } else if (i == 6) {
                    l35Var = new bz9(context, wjbVar);
                    l35Var.setTag(-33024);
                    if (z) {
                        l35Var.setBackground(null);
                    }
                } else if (i == 8) {
                    l35Var = new l35(context, wjbVar);
                    l35Var.setTag(-33024);
                    if (z) {
                        l35Var.setBackground(null);
                    }
                } else if (i == 9) {
                    wgb wgbVar = new wgb(context, wjbVar);
                    wgbVar.n = (byte) 16;
                    wgbVar.x = 19;
                    kz9Var = wgbVar;
                } else if (i == 10) {
                    kz9Var = new FrameLayout(context);
                } else {
                    kz9Var = new View(context);
                }
                kz9Var = l35Var;
            }
        }
        return new s49(kz9Var);
    }

    @Override
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof kz9) {
            ((kz9) view).g(this.E, false);
        }
    }
}
