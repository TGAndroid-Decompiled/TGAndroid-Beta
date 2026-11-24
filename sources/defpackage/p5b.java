package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p5b extends ka {
    public final Context d;
    public final wjb e;
    public final n5b f;
    public o39 h;
    public final t5b n;

    public p5b(t5b t5bVar, Context context, wjb wjbVar, n5b n5bVar, p28 p28Var) {
        this.n = t5bVar;
        this.d = context;
        this.e = wjbVar;
        this.f = n5bVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
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
            return ((j5b) arrayList.get(i)).a;
        }
        return -1;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        j5b j5bVar;
        boolean z;
        int i2;
        int i3;
        int i4;
        t5b t5bVar = this.n;
        y5b y5bVar = t5bVar.a0;
        ArrayList arrayList = t5bVar.M;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            j5b j5bVar2 = (j5b) arrayList.get(i);
            int i5 = s49Var.f;
            View view = s49Var.a;
            boolean z2 = true;
            int i6 = i + 1;
            if (i6 < arrayList.size()) {
                j5bVar = (j5b) arrayList.get(i6);
            } else {
                j5bVar = null;
            }
            if (j5bVar != null && ((i4 = j5bVar.a) == i5 || (i4 == 9 && j5bVar.q == 1))) {
                z = true;
            } else {
                z = false;
            }
            if (i5 == 3) {
                x5b x5bVar = (x5b) view;
                boolean z3 = j5bVar2.n;
                x5bVar.d(z3, !z3);
                byte b = j5bVar2.i;
                float f = 1.0f;
                if (b > 0) {
                    x5bVar.e(b, j5bVar2.j, j5bVar2.g);
                    x5bVar.b(false, 1.0f);
                } else {
                    TLRPC.User user = j5bVar2.g;
                    if (user != null) {
                        x5bVar.setUser(user);
                        if (j5bVar2.l && !j5bVar2.k) {
                            f = 0.5f;
                        }
                        x5bVar.b(false, f);
                    } else {
                        TLRPC.Chat chat = j5bVar2.h;
                        if (chat != null) {
                            int i7 = y5b.X1;
                            x5bVar.a(y5bVar.J0(chat), chat);
                        }
                    }
                }
                if (!j5bVar2.k && !j5bVar2.l) {
                    z2 = false;
                }
                x5bVar.c(z2, false);
                x5bVar.setDivider(z);
                x5bVar.setRedCheckbox(j5bVar2.m);
                x5bVar.w = y5bVar.z1;
            } else if (i5 != 2) {
                if (i5 == 0) {
                    view.setLayoutParams(new e49(-1, gl.L(56.0f)));
                } else if (i5 == -1) {
                    if (j5bVar2.o > 0) {
                        o39 o39Var = this.h;
                        if (o39Var != null && o39Var.getMeasuredHeight() > 0) {
                            i3 = this.h.getMeasuredHeight() + t5bVar.U;
                        } else {
                            i3 = gl.q.y;
                        }
                        i2 = Math.max(i3 - j5bVar2.o, gl.L(120.0f));
                        view.setTag(33);
                    } else {
                        i2 = j5bVar2.p;
                        if (i2 >= 0) {
                            view.setTag(null);
                        } else {
                            i2 = (int) (gl.q.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new e49(-1, i2));
                } else if (i5 == 1) {
                    view.setLayoutParams(new e49(-1, Math.min(gl.L(150.0f), this.f.L)));
                } else if (i5 == 4) {
                    i5b i5bVar = (i5b) view;
                    CharSequence charSequence = j5bVar2.e;
                    CharSequence charSequence2 = j5bVar2.f;
                    i5bVar.a.setText(charSequence);
                    i5bVar.b.setText(charSequence2);
                } else if (i5 == 11) {
                    i5b i5bVar2 = (i5b) view;
                    i5bVar2.a.setText(j5bVar2.e);
                    i5bVar2.b.setText((CharSequence) null);
                } else if (i5 == 5) {
                    try {
                        ((zya) view).b.getImageReceiver().w0(false);
                    } catch (Exception unused) {
                    }
                } else if (i5 == 6) {
                    mhb mhbVar = (mhb) view;
                    if (j5bVar2.e == null) {
                        mhbVar.setFixedSize(12);
                        mhbVar.setText(null);
                        return;
                    }
                    mhbVar.setFixedSize(0);
                    mhbVar.setText(j5bVar2.e);
                } else if (i5 == 7) {
                    byte b2 = j5bVar2.c;
                    if (b2 == 0) {
                        ((wgb) view).l(j5bVar2.e, y5bVar.w1, z);
                    } else if (b2 == 1) {
                        ((wgb) view).l(j5bVar2.e, y5bVar.x1, z);
                    } else if (b2 == 2) {
                        ((wgb) view).l(j5bVar2.e, y5bVar.v1, z);
                    }
                } else if (i5 == 9) {
                    BitmapDrawable bitmapDrawable = j5bVar2.d;
                    if (bitmapDrawable != null) {
                        ((wgb) view).v(j5bVar2.e, bitmapDrawable, z);
                    } else {
                        ((wgb) view).q(j5bVar2.e, j5bVar2.f, false, z);
                    }
                } else if (i5 == 8) {
                    ((ld5) view).setText(j5bVar2.e);
                } else if (i5 == 10) {
                    int i8 = y5b.X1;
                    int f2 = (int) na7.q1(y5bVar.a).k4.H1.f();
                    int[] a = ija.a(new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, f2);
                    int j = Utilities.j(y5bVar.B1, f2, 0);
                    v0b v0bVar = new v0b((byte) 1);
                    hja hjaVar = new hja();
                    hjaVar.c = a;
                    hjaVar.d = (byte) 20;
                    hjaVar.e = v0bVar;
                    ((ija) view).d(j, hjaVar, new ae9(this, (byte) 17));
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View wgbVar;
        zya zyaVar;
        Context context = this.d;
        if (i == -1) {
            zyaVar = new View(context);
        } else if (i == 0) {
            View view = new View(context);
            view.setTag(35);
            zyaVar = view;
        } else if (i == 1) {
            View view2 = new View(context);
            view2.setTag(34);
            zyaVar = view2;
        } else {
            wjb wjbVar = this.e;
            if (i == 3) {
                zyaVar = new x5b(context, wjbVar);
            } else if (i == 4) {
                zyaVar = new i5b(wjbVar, context, true);
            } else if (i == 11) {
                zyaVar = new i5b(wjbVar, context, false);
            } else if (i == 8) {
                View ld5Var = new ld5(context, wjbVar);
                zkb.h(bkb.g5, wjbVar, ld5Var);
                zyaVar = ld5Var;
            } else if (i == 5) {
                zya zyaVar2 = new zya(context, null, 1, wjbVar);
                zyaVar2.d.setText(k96.M0(2131747975, null));
                zyaVar2.e.setText(k96.M0(2131745615, null));
                zyaVar2.a.setTranslationY(gl.L(24.0f));
                zyaVar = zyaVar2;
            } else if (i == 6) {
                View mhbVar = new mhb(context, wjbVar);
                mhbVar.setBackgroundColor(-15921907);
                zyaVar = mhbVar;
            } else {
                if (i == 7) {
                    wgbVar = new wgb(23, this.e, this.d, true, true);
                } else if (i == 9) {
                    wgbVar = new wgb(23, this.e, this.d, true, false);
                } else if (i == 10) {
                    zyaVar = new ija(context, wjbVar);
                } else {
                    zyaVar = new d62(context, (byte) 26);
                }
                zyaVar = wgbVar;
            }
        }
        return new s49(zyaVar);
    }
}
