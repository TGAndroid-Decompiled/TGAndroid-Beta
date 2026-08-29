package nh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.qw0;
public final class u8 extends zf.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 f18724e;
    public final r8 f18725f;
    public jl0 h;
    public final y8 f18726n;

    public u8(y8 y8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, r8 r8Var, lh.t3 t3Var) {
        this.f18726n = y8Var;
        this.d = context;
        this.f18724e = c6Var;
        this.f18725f = r8Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if ((i10 != 3 || !this.f18726n.S.B) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f18726n.H;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        y8 y8Var = this.f18726n;
        ArrayList arrayList = y8Var.H;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((m8) y8Var.H.get(i10)).f50845a;
        }
        return -1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        m8 m8Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        y8 y8Var = this.f18726n;
        e9 e9Var = y8Var.S;
        ArrayList arrayList = y8Var.H;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            m8 m8Var2 = (m8) arrayList.get(i10);
            int i15 = n1Var.f6436f;
            View view = n1Var.f6432a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                m8Var = (m8) arrayList.get(i16);
            } else {
                m8Var = null;
            }
            if (m8Var != null && ((i14 = m8Var.f50845a) == i15 || (i14 == 9 && m8Var.f18149q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                d9 d9Var = (d9) view;
                boolean z12 = m8Var2.f18146n;
                d9Var.d(z12, !z12);
                int i17 = m8Var2.f18141i;
                float f9 = 1.0f;
                if (i17 > 0) {
                    d9Var.e(i17, m8Var2.f18140g, m8Var2.f18142j);
                    d9Var.b(1.0f, false);
                } else {
                    TLRPC.User user = m8Var2.f18140g;
                    if (user != null) {
                        d9Var.setUser(user);
                        if (m8Var2.f18144l && !m8Var2.f18143k) {
                            f9 = 0.5f;
                        }
                        d9Var.b(f9, false);
                    } else {
                        TLRPC.Chat chat = m8Var2.h;
                        if (chat != null) {
                            d9Var.a(e9.d1(e9Var, chat), chat);
                        }
                    }
                }
                if (!m8Var2.f18143k && !m8Var2.f18144l) {
                    z11 = false;
                }
                d9Var.c(z11, false);
                d9Var.setDivider(z10);
                d9Var.setRedCheckbox(m8Var2.f18145m);
                d9Var.v = e9Var.B;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (m8Var2.f18147o > 0) {
                        jl0 jl0Var = this.h;
                        if (jl0Var != null && jl0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + y8Var.P;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - m8Var2.f18147o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = m8Var2.f18148p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new f2.x0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new f2.x0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f18725f.F)));
                } else if (i15 == 4) {
                    k8 k8Var = (k8) view;
                    CharSequence charSequence = m8Var2.f18138e;
                    CharSequence charSequence2 = m8Var2.f18139f;
                    k8Var.f18010a.setText(charSequence);
                    k8Var.f18011b.setText(charSequence2);
                } else if (i15 == 11) {
                    k8 k8Var2 = (k8) view;
                    k8Var2.f18010a.setText(m8Var2.f18138e);
                    k8Var2.f18011b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((qw0) view).f32120b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view;
                    if (m8Var2.f18138e == null) {
                        y8Var2.setFixedSize(12);
                        y8Var2.setText(null);
                        return;
                    }
                    y8Var2.setFixedSize(0);
                    y8Var2.setText(m8Var2.f18138e);
                } else if (i15 == 7) {
                    int i18 = m8Var2.f18137c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.m8) view).j(m8Var2.f18138e, e9Var.f17611x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.m8) view).j(m8Var2.f18138e, e9Var.f17612y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.m8) view).j(m8Var2.f18138e, e9Var.f17610w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = m8Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.m8) view).t(m8Var2.f18138e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.m8) view).o(m8Var2.f18138e, m8Var2.f18139f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.k4) view).setText(m8Var2.f18138e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.v7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(e9Var.D, i19, 0);
                    m4.a aVar = new m4.a(6);
                    org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7();
                    u7Var.f25741c = a2;
                    u7Var.d = 20;
                    u7Var.f25742e = aVar;
                    ((org.telegram.ui.Cells.v7) view).d(clamp, u7Var, new b0(this, 7));
                }
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View fnVar;
        org.telegram.ui.Cells.m8 m8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            fnVar = new View(context);
        } else if (i10 == 0) {
            fnVar = new View(context);
            fnVar.setTag(35);
        } else if (i10 == 1) {
            fnVar = new View(context);
            fnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.c6 c6Var = this.f18724e;
            if (i10 == 3) {
                fnVar = new d9(context, c6Var);
            } else {
                if (i10 == 4) {
                    view = new k8(context, c6Var, true);
                } else if (i10 == 11) {
                    fnVar = new k8(context, c6Var, false);
                } else if (i10 == 8) {
                    fnVar = new org.telegram.ui.Cells.k4(context, c6Var);
                    fnVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
                } else if (i10 == 5) {
                    qw0 qw0Var = new qw0(context, null, 1, c6Var);
                    qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    qw0Var.f32122e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    qw0Var.f32119a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = qw0Var;
                } else if (i10 == 6) {
                    fnVar = new org.telegram.ui.Cells.y8(context, c6Var);
                    fnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.f18724e, true, true);
                    } else if (i10 == 9) {
                        m8Var = new org.telegram.ui.Cells.m8(23, this.d, this.f18724e, true, false);
                    } else if (i10 == 10) {
                        fnVar = new org.telegram.ui.Cells.v7(context, c6Var);
                    } else {
                        fnVar = new fn(context, 5);
                    }
                    fnVar = m8Var;
                }
                fnVar = view;
            }
        }
        return new f2.n1(fnVar);
    }
}
