package di;

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
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.xw0;
public final class x9 extends pg.b {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f8437e;
    public final t9 f8438f;
    public ll0 h;
    public final ba f8439n;

    public x9(ba baVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, t9 t9Var, bi.b5 b5Var) {
        this.f8439n = baVar;
        this.d = context;
        this.f8437e = f6Var;
        this.f8438f = t9Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45770f;
        if ((i10 != 3 || !this.f8439n.W.F) && i10 != 7 && i10 != 9 && i10 != 10) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.f8439n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ba baVar = this.f8439n;
        ArrayList arrayList = baVar.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return ((m9) baVar.L.get(i10)).f44098a;
        }
        return -1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        m9 m9Var;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        ba baVar = this.f8439n;
        ia iaVar = baVar.W;
        ArrayList arrayList = baVar.L;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            m9 m9Var2 = (m9) arrayList.get(i10);
            int i15 = c1Var.f45770f;
            View view = c1Var.f45766a;
            boolean z11 = true;
            int i16 = i10 + 1;
            if (i16 < arrayList.size()) {
                m9Var = (m9) arrayList.get(i16);
            } else {
                m9Var = null;
            }
            if (m9Var != null && ((i14 = m9Var.f44098a) == i15 || (i14 == 9 && m9Var.f7687q == 1))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 3) {
                ha haVar = (ha) view;
                boolean z12 = m9Var2.f7684n;
                haVar.d(z12, !z12);
                int i17 = m9Var2.f7679i;
                float f7 = 1.0f;
                if (i17 > 0) {
                    haVar.e(i17, m9Var2.f7678g, m9Var2.f7680j);
                    haVar.b(1.0f, false);
                } else {
                    TLRPC.User user = m9Var2.f7678g;
                    if (user != null) {
                        haVar.setUser(user);
                        if (m9Var2.f7682l && !m9Var2.f7681k) {
                            f7 = 0.5f;
                        }
                        haVar.b(f7, false);
                    } else {
                        TLRPC.Chat chat = m9Var2.h;
                        if (chat != null) {
                            haVar.a(ia.d1(iaVar, chat), chat);
                        }
                    }
                }
                if (!m9Var2.f7681k && !m9Var2.f7682l) {
                    z11 = false;
                }
                haVar.c(z11, false);
                haVar.setDivider(z10);
                haVar.setRedCheckbox(m9Var2.f7683m);
                haVar.v = iaVar.F;
            } else if (i15 != 2) {
                if (i15 == 0) {
                    view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                } else if (i15 == -1) {
                    if (m9Var2.f7685o > 0) {
                        ll0 ll0Var = this.h;
                        if (ll0Var != null && ll0Var.getMeasuredHeight() > 0) {
                            i13 = this.h.getMeasuredHeight() + baVar.T;
                        } else {
                            i13 = AndroidUtilities.displaySize.y;
                        }
                        i12 = Math.max(i13 - m9Var2.f7685o, AndroidUtilities.dp(120.0f));
                        view.setTag(33);
                    } else {
                        i12 = m9Var2.f7686p;
                        if (i12 >= 0) {
                            view.setTag(null);
                        } else {
                            i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                            view.setTag(33);
                        }
                    }
                    view.setLayoutParams(new s4.p0(-1, i12));
                } else if (i15 == 1) {
                    view.setLayoutParams(new s4.p0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f8438f.J)));
                } else if (i15 == 4) {
                    k9 k9Var = (k9) view;
                    CharSequence charSequence = m9Var2.f7676e;
                    CharSequence charSequence2 = m9Var2.f7677f;
                    k9Var.f7506a.setText(charSequence);
                    k9Var.f7507b.setText(charSequence2);
                } else if (i15 == 11) {
                    k9 k9Var2 = (k9) view;
                    k9Var2.f7506a.setText(m9Var2.f7676e);
                    k9Var2.f7507b.setText((CharSequence) null);
                } else if (i15 == 5) {
                    try {
                        ((xw0) view).f32780b.getImageReceiver().startAnimation();
                    } catch (Exception unused) {
                    }
                } else if (i15 == 6) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    if (m9Var2.f7676e == null) {
                        e9Var.setFixedSize(12);
                        e9Var.setText(null);
                        return;
                    }
                    e9Var.setFixedSize(0);
                    e9Var.setText(m9Var2.f7676e);
                } else if (i15 == 7) {
                    int i18 = m9Var2.f7675c;
                    if (i18 == 0) {
                        ((org.telegram.ui.Cells.r8) view).j(m9Var2.f7676e, iaVar.f7428x, z10);
                    } else if (i18 == 1) {
                        ((org.telegram.ui.Cells.r8) view).j(m9Var2.f7676e, iaVar.f7429y, z10);
                    } else if (i18 == 2) {
                        ((org.telegram.ui.Cells.r8) view).j(m9Var2.f7676e, iaVar.f7427w, z10);
                    }
                } else if (i15 == 9) {
                    Drawable drawable = m9Var2.d;
                    if (drawable != null) {
                        ((org.telegram.ui.Cells.r8) view).t(m9Var2.f7676e, drawable, z10);
                    } else {
                        ((org.telegram.ui.Cells.r8) view).o(m9Var2.f7676e, m9Var2.f7677f, false, z10);
                    }
                } else if (i15 == 8) {
                    ((org.telegram.ui.Cells.l4) view).setText(m9Var2.f7676e);
                } else if (i15 == 10) {
                    i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
                    int[] a2 = org.telegram.ui.Cells.z7.a(i19, new int[]{0, 1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int clamp = Utilities.clamp(iaVar.H, i19, 0);
                    w9 w9Var = new w9(0);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23599c = a2;
                    y7Var.d = 20;
                    y7Var.f23600e = w9Var;
                    ((org.telegram.ui.Cells.z7) view).d(clamp, y7Var, new bi.o1(this, 13));
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View jnVar;
        org.telegram.ui.Cells.r8 r8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            jnVar = new View(context);
        } else if (i10 == 0) {
            jnVar = new View(context);
            jnVar.setTag(35);
        } else if (i10 == 1) {
            jnVar = new View(context);
            jnVar.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.f8437e;
            if (i10 == 3) {
                jnVar = new ha(context, f6Var);
            } else {
                if (i10 == 4) {
                    view = new k9(context, f6Var, true);
                } else if (i10 == 11) {
                    jnVar = new k9(context, f6Var, false);
                } else if (i10 == 8) {
                    jnVar = new org.telegram.ui.Cells.l4(context, f6Var);
                    jnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, f6Var));
                } else if (i10 == 5) {
                    xw0 xw0Var = new xw0(context, null, 1, f6Var);
                    xw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    xw0Var.f32782e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    xw0Var.f32779a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = xw0Var;
                } else if (i10 == 6) {
                    jnVar = new org.telegram.ui.Cells.e9(context, f6Var);
                    jnVar.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.f8437e, true, true);
                    } else if (i10 == 9) {
                        r8Var = new org.telegram.ui.Cells.r8(23, this.d, this.f8437e, true, false);
                    } else if (i10 == 10) {
                        jnVar = new org.telegram.ui.Cells.z7(context, f6Var);
                    } else {
                        jnVar = new jn(context, 2);
                    }
                    jnVar = r8Var;
                }
                jnVar = view;
            }
        }
        return new s4.c1(jnVar);
    }
}
