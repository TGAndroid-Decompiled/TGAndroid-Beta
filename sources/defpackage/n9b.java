package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9b extends la {
    public final Context d;
    public final vnb e;
    public final l9b f;
    public d79 h;
    public final r9b n;

    public n9b(r9b r9bVar, Context context, vnb vnbVar, l9b l9bVar, b68 b68Var) {
        this.n = r9bVar;
        this.d = context;
        this.e = vnbVar;
        this.f = l9bVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if ((i != 3 || !this.n.a0.z1) && i != 7 && i != 9 && i != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList = this.n.M;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            return ((h9b) arrayList.get(i)).a;
        }
        return -1;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        h9b h9bVar;
        boolean z;
        int i2;
        int i3;
        int i4;
        r9b r9bVar = this.n;
        w9b w9bVar = r9bVar.a0;
        ArrayList arrayList = r9bVar.M;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            h9b h9bVar2 = (h9b) arrayList.get(i);
            int i5 = f89Var.f;
            View view = f89Var.a;
            boolean z2 = true;
            int i6 = i + 1;
            if (i6 < arrayList.size()) {
                h9bVar = (h9b) arrayList.get(i6);
            } else {
                h9bVar = null;
            }
            if (h9bVar != null && ((i4 = h9bVar.a) == i5 || (i4 == 9 && h9bVar.q == 1))) {
                z = true;
            } else {
                z = false;
            }
            if (i5 == 3) {
                v9b v9bVar = (v9b) view;
                boolean z3 = h9bVar2.n;
                v9bVar.d(z3, !z3);
                byte b = h9bVar2.i;
                float f = 1.0f;
                if (b > 0) {
                    v9bVar.e(b, h9bVar2.j, h9bVar2.g);
                    v9bVar.b(false, 1.0f);
                } else {
                    TLRPC.User user = h9bVar2.g;
                    if (user != null) {
                        v9bVar.setUser(user);
                        if (h9bVar2.l && !h9bVar2.k) {
                            f = 0.5f;
                        }
                        v9bVar.b(false, f);
                    } else {
                        TLRPC.Chat chat = h9bVar2.h;
                        if (chat != null) {
                            int i7 = w9b.X1;
                            v9bVar.a(w9bVar.K0(chat), chat);
                        }
                    }
                }
                if (!h9bVar2.k && !h9bVar2.l) {
                    z2 = false;
                }
                v9bVar.c(z2, false);
                v9bVar.setDivider(z);
                v9bVar.setRedCheckbox(h9bVar2.m);
                v9bVar.w = w9bVar.z1;
            } else if (i5 != 2) {
                if (i5 == 0) {
                    view.setLayoutParams(new r79(-1, hl.L(56.0f)));
                } else if (i5 == -1) {
                    if (h9bVar2.o > 0) {
                        d79 d79Var = this.h;
                        if (d79Var != null && d79Var.getMeasuredHeight() > 0) {
                            i3 = this.h.getMeasuredHeight() + r9bVar.U;
                        } else {
                            i3 = hl.q.y;
                        }
                        i2 = Math.max(i3 - h9bVar2.o, hl.L(120.0f));
                        view.setTag(33);
                    } else {
                        i2 = h9bVar2.p;
                        if (i2 >= 0) {
                            view.setTag(null);
                        } else {
                            i2 = (int) (hl.q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new r79(-1, i2));
                } else if (i5 == 1) {
                    view.setLayoutParams(new r79(-1, Math.min(hl.L(150.0f), this.f.L)));
                } else if (i5 == 4) {
                    g9b g9bVar = (g9b) view;
                    CharSequence charSequence = h9bVar2.e;
                    CharSequence charSequence2 = h9bVar2.f;
                    g9bVar.a.setText(charSequence);
                    g9bVar.b.setText(charSequence2);
                } else if (i5 == 11) {
                    g9b g9bVar2 = (g9b) view;
                    g9bVar2.a.setText(h9bVar2.e);
                    g9bVar2.b.setText((CharSequence) null);
                } else if (i5 == 5) {
                    try {
                        ((z2b) view).b.getImageReceiver().w0(false);
                    } catch (Exception unused) {
                    }
                } else if (i5 == 6) {
                    ilb ilbVar = (ilb) view;
                    if (h9bVar2.e == null) {
                        ilbVar.setFixedSize(12);
                        ilbVar.setText(null);
                        return;
                    }
                    ilbVar.setFixedSize(0);
                    ilbVar.setText(h9bVar2.e);
                } else if (i5 == 7) {
                    byte b2 = h9bVar2.c;
                    if (b2 == 0) {
                        ((skb) view).l(h9bVar2.e, w9bVar.w1, z);
                    } else if (b2 == 1) {
                        ((skb) view).l(h9bVar2.e, w9bVar.x1, z);
                    } else if (b2 == 2) {
                        ((skb) view).l(h9bVar2.e, w9bVar.v1, z);
                    }
                } else if (i5 == 9) {
                    BitmapDrawable bitmapDrawable = h9bVar2.d;
                    if (bitmapDrawable != null) {
                        ((skb) view).v(h9bVar2.e, bitmapDrawable, z);
                    } else {
                        ((skb) view).q(h9bVar2.e, h9bVar2.f, false, z);
                    }
                } else if (i5 == 8) {
                    ((mf5) view).setText(h9bVar2.e);
                } else if (i5 == 10) {
                    int i8 = w9b.X1;
                    int f2 = (int) uc7.s1(w9bVar.a).k4.P1.f();
                    int[] a = bna.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, f2);
                    int j = Utilities.j(w9bVar.B1, f2, 0);
                    bya byaVar = new bya((byte) 3);
                    ana anaVar = new ana();
                    anaVar.c = a;
                    anaVar.d = (byte) 20;
                    anaVar.e = byaVar;
                    ((bna) view).d(j, anaVar, new sh9(this, (byte) 17));
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View skbVar;
        z2b z2bVar;
        Context context = this.d;
        if (i == -1) {
            z2bVar = new View(context);
        } else if (i == 0) {
            View view = new View(context);
            view.setTag(35);
            z2bVar = view;
        } else if (i == 1) {
            View view2 = new View(context);
            view2.setTag(34);
            z2bVar = view2;
        } else {
            vnb vnbVar = this.e;
            if (i == 3) {
                z2bVar = new v9b(context, vnbVar);
            } else if (i == 4) {
                z2bVar = new g9b(vnbVar, context, true);
            } else if (i == 11) {
                z2bVar = new g9b(vnbVar, context, false);
            } else if (i == 8) {
                View mf5Var = new mf5(context, vnbVar);
                yob.h(aob.h5, vnbVar, mf5Var);
                z2bVar = mf5Var;
            } else if (i == 5) {
                z2b z2bVar2 = new z2b(context, null, 1, vnbVar);
                z2bVar2.d.setText(ob6.M0(2131747898, null));
                z2bVar2.e.setText(ob6.M0(2131745535, null));
                z2bVar2.a.setTranslationY(hl.L(24.0f));
                z2bVar = z2bVar2;
            } else if (i == 6) {
                View ilbVar = new ilb(context, vnbVar);
                ilbVar.setBackgroundColor(-15921907);
                z2bVar = ilbVar;
            } else {
                if (i == 7) {
                    skbVar = new skb(23, this.e, this.d, true, true);
                } else if (i == 9) {
                    skbVar = new skb(23, this.e, this.d, true, false);
                } else if (i == 10) {
                    z2bVar = new bna(context, vnbVar);
                } else {
                    z2bVar = new t62(context, (byte) 26);
                }
                z2bVar = skbVar;
            }
        }
        return new f89(z2bVar);
    }
}
